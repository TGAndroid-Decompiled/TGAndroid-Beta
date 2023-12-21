#version 300 es

precision highp float;

in vec2 uvcenter;
in vec2 uvsize;
in float circle;
in float alpha;

out vec4 fragColor;

uniform sampler2D tex;

void main() {
  if (alpha <= 0.0) {
    discard;
  }
  vec2 c = 2.0 * gl_PointCoord - 1.0;
  if (dot(c, c) > mix(1.6, 1., circle)) {
    discard;
  }
  fragColor = texture(tex, uvcenter + gl_PointCoord * uvsize).rgba * alpha;
}