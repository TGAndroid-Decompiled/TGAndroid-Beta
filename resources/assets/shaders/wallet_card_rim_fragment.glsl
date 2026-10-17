#version 300 es
precision highp float;
in vec3 rimNormal; in vec3 rimView;
uniform vec3 uMainLightDirection; uniform vec3 uStickerPaletteFrom[4];
uniform vec2 uRimStyle; uniform vec2 uStickerToneScale;
uniform vec3 uStickerPaletteTo[4]; uniform vec4 uStickerReveal; in vec2 rimPosition;
uniform float uCardGradientRotation;
out vec4 fragmentColor;
// Gift material colors carry this gain (WalletGiftPalette.GIFT_GAIN); the bevel undoes it.
const float GIFT_GAIN = 0.73;
vec3 srgbEncode(vec3 c){c=clamp(c,0.0,1.0);return mix(c*12.92,1.055*pow(c,vec3(1.0/2.4))-.055,step(.0031308,c));}
void main(){
 vec3 n=normalize(rimNormal),v=normalize(rimView),h=normalize(v+normalize(uMainLightDirection));
 float shine=pow(max(dot(n,h),0.0),48.0),grazing=pow(1.0-max(dot(n,v),0.0),3.0);
 float blend=uStickerReveal.z;
 if(uStickerReveal.w<.5 && blend<1.0){
 vec2 uv=vec2(rimPosition.x*.5+.5,(.618561-rimPosition.y)/1.212122);
 float distanceFromGift=length((uv-uStickerReveal.xy)*vec2(1.0,.61035));
 blend=1.0-smoothstep(blend*1.2-.025,blend*1.2,distanceFromGift);
 }
 vec3 base=mix(uStickerPaletteFrom[0],uStickerPaletteTo[0],blend),accent=clamp(base/max(max(base.r,base.g),max(base.b,.0001)),0.0,1.0);
 // Keep the polish tied to the material, including dark backdrops.
 vec3 rimReflectance=mix(base,accent*.32,.50);
 vec3 color=base*.62+rimReflectance*(shine*.42*uRimStyle.y+grazing*.10);
 color*=uRimStyle.x*mix(uStickerToneScale.x,uStickerToneScale.y,blend);color=clamp((color*(2.51*color+.03))/(color*(2.43*color+.59)+.14),0.0,1.0);
 color=pow(color,vec3(1.0/2.2));
 // Gift sides (0.6 tone scale): the GramWalletCards3 bevel over its two surface colors,
 // lit in 3D so the rounded edge catches and loses the light as the card tilts. Its light
 // is above-left of the viewer (y up here), turned with the main light.
 float gift=mix(step(uStickerToneScale.x,.8),step(uStickerToneScale.y,.8),blend);
 if(gift>0.0){
  vec3 dark=srgbEncode(mix(uStickerPaletteFrom[1],uStickerPaletteTo[1],blend)/GIFT_GAIN);
  vec3 light=srgbEncode(mix(uStickerPaletteFrom[2],uStickerPaletteTo[2],blend)/GIFT_GAIN);
  float lightTurn=atan(uMainLightDirection.y,uMainLightDirection.x);
  vec3 l=normalize(vec3(-.40,.55,.73));l.xy=mat2(cos(lightTurn),sin(lightTurn),-sin(lightTurn),cos(lightTurn))*l.xy;
  vec3 hb=normalize(l+v);
  // Soften the profile toward the 2D bevel (0.75 outward lean) so the edge never goes flat.
  vec2 out2=length(n.xy)>.0001?normalize(n.xy):vec2(0.0);
  vec3 nb=normalize(mix(normalize(vec3(out2*.75,1.0)),n,.65));
  float diff=clamp(dot(nb,l),0.0,1.0)/max(l.z,.2);
  // The 2D surface color under the bevel, with the body's lobe axis.
  float angle=radians(-53.97-uCardGradientRotation),r=length(rimPosition);
  float c=abs(dot(rimPosition/max(r,.0001),vec2(cos(angle),sin(angle))));
  float t=clamp(mix(.5,c*c,smoothstep(0.0,.535714,r))*(.55+.45*(1.0-smoothstep(0.0,1.171303,r))),0.0,1.0);
  vec3 surface=mix(dark,light,t)*(.80+.20*t+.06*diff);
  float nh=max(dot(nb,hb),0.0),fresnel=pow(1.0-max(dot(nb,v),0.0),3.0);
  // Tight glint and a broad sheen; Fresnel lifts the grazing edge. The outer edge is 6% darker.
  vec3 rim=surface*(1.0+(diff-.85)*.60)+vec3(pow(nh,48.0)*.42+pow(nh,8.0)*.07)+light*fresnel*.12;
  color=mix(color,clamp(rim*.94,0.0,1.0),gift);
 }
 fragmentColor=vec4(color,1.0);
}
