precision highp float;

varying vec2 varTexcoord;
varying float varIntensity;

uniform sampler2D texture;

void main (void) {
  gl_FragColor = vec4(1, 1, 1, varIntensity * texture2D(texture, varTexcoord.st, 0.0).r);
}