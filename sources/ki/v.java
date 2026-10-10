package ki;

import android.opengl.GLES20;
public class v extends x {
    public final int f15164e;

    public v() {
        super("attribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n    gl_Position = aPosition;\n    vTextureCoord = aTextureCoord.xy;\n}\n", b0.F);
        this.f15164e = GLES20.glGetUniformLocation(this.f15165a, "texOffset");
    }

    public v(String str, int i10) {
        super("uniform mat4 uTextureMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvarying vec2 vScreenTextureCoord;\nvoid main() {\n    gl_Position = aPosition;\n    vTextureCoord = (uTextureMatrix * vec4(aTextureCoord.xy, 0.0, 1.0)).xy;\n    vScreenTextureCoord = aPosition.xy * 0.5 + 0.5;\n}\n", str);
        switch (i10) {
            case 1:
                super("attribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n    gl_Position = aPosition;\n    vTextureCoord = aTextureCoord.xy;\n}\n", str);
                this.f15164e = GLES20.glGetUniformLocation(this.f15165a, "texOffset");
                return;
            default:
                this.f15164e = GLES20.glGetUniformLocation(this.f15165a, "uTextureMatrix");
                return;
        }
    }
}
