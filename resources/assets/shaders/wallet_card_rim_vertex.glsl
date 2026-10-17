#version 300 es
in vec3 aPosition; in vec3 aNormal;
uniform mat4 uMVPMatrix; uniform mat4 uModelViewMatrix;
out vec3 rimNormal; out vec3 rimView; out vec2 rimPosition;
void main(){rimPosition=vec2(aPosition.z,aPosition.y);vec4 p=uModelViewMatrix*vec4(aPosition,1.0);rimView=-p.xyz;rimNormal=mat3(uModelViewMatrix)*aNormal;gl_Position=uMVPMatrix*vec4(aPosition,1.0);}
