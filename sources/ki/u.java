package ki;

import android.opengl.GLES20;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class u extends r {
    public final int e;
    public final int f13797f;
    public final int f13798g;

    public u() {
        super(AndroidUtilities.readRes(R.raw.round_blur_vert), "precision mediump float;\nvarying vec2 vTextureCoord;\nuniform sampler2D sTexture;\nuniform sampler2D nTexture;\nuniform sampler2D obTexture;\nuniform sampler2D nbTexture;\nuniform sampler2D oldBackground;\nuniform sampler2D newBackground;\nuniform sampler2D maskTexture;\nuniform float oldBlur;\nuniform float newBlur;\nuniform float mixValue;\nvoid main() {\n    vec4 oldFrame = mix(texture2D(sTexture, vTextureCoord),\n            texture2D(obTexture, vTextureCoord), oldBlur);\n    vec4 newFrame = mix(texture2D(nTexture, vTextureCoord),\n            texture2D(nbTexture, vTextureCoord), newBlur);\n    vec3 camera = mix(oldFrame.rgb, newFrame.rgb, mixValue);\n    vec3 background = mix(texture2D(oldBackground, vTextureCoord).rgb,\n            texture2D(newBackground, vTextureCoord).rgb, mixValue) * 0.25;\n    float mask = texture2D(maskTexture, vTextureCoord).a;\n    gl_FragColor = vec4(mix(background, camera, mask), 1.0);\n}\n");
        int glGetUniformLocation = GLES20.glGetUniformLocation(this.f13792a, "nTexture");
        int glGetUniformLocation2 = GLES20.glGetUniformLocation(this.f13792a, "obTexture");
        int glGetUniformLocation3 = GLES20.glGetUniformLocation(this.f13792a, "nbTexture");
        int glGetUniformLocation4 = GLES20.glGetUniformLocation(this.f13792a, "oldBackground");
        int glGetUniformLocation5 = GLES20.glGetUniformLocation(this.f13792a, "newBackground");
        int glGetUniformLocation6 = GLES20.glGetUniformLocation(this.f13792a, "maskTexture");
        this.e = GLES20.glGetUniformLocation(this.f13792a, "oldBlur");
        this.f13797f = GLES20.glGetUniformLocation(this.f13792a, "newBlur");
        this.f13798g = GLES20.glGetUniformLocation(this.f13792a, "mixValue");
        GLES20.glUseProgram(this.f13792a);
        GLES20.glUniform1i(glGetUniformLocation, 1);
        GLES20.glUniform1i(glGetUniformLocation2, 2);
        GLES20.glUniform1i(glGetUniformLocation3, 3);
        GLES20.glUniform1i(glGetUniformLocation4, 4);
        GLES20.glUniform1i(glGetUniformLocation5, 5);
        GLES20.glUniform1i(glGetUniformLocation6, 6);
    }
}
