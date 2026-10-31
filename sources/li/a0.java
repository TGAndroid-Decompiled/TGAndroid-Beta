package li;

import android.opengl.GLES20;
public class a0 extends c0 {
    public final int e;

    public a0() {
        super("attribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n    gl_Position = aPosition;\n    vTextureCoord = aTextureCoord.xy;\n}\n", g0.F);
        this.e = GLES20.glGetUniformLocation(this.f12032a, "texOffset");
    }

    public a0(String str, int i10) {
        super("uniform mat4 uTextureMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvarying vec2 vScreenTextureCoord;\nvoid main() {\n    gl_Position = aPosition;\n    vTextureCoord = (uTextureMatrix * vec4(aTextureCoord.xy, 0.0, 1.0)).xy;\n    vScreenTextureCoord = aPosition.xy * 0.5 + 0.5;\n}\n", str);
        switch (i10) {
            case 1:
                super("attribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n    gl_Position = aPosition;\n    vTextureCoord = aTextureCoord.xy;\n}\n", str);
                this.e = GLES20.glGetUniformLocation(this.f12032a, "texOffset");
                return;
            default:
                this.e = GLES20.glGetUniformLocation(this.f12032a, "uTextureMatrix");
                return;
        }
    }
}
