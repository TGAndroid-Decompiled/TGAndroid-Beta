package defpackage;

import android.opengl.GLES20;
public class pm9 extends pd0 {
    public final int d;

    public pm9(String str, byte b) {
        super("uniform mat4 uTextureMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvarying vec2 vScreenTextureCoord;\nvoid main() {\n    gl_Position = aPosition;\n    vTextureCoord = (uTextureMatrix * vec4(aTextureCoord.xy, 0.0, 1.0)).xy;\n    vScreenTextureCoord = aPosition.xy * 0.5 + 0.5;\n}\n", str);
        switch (b) {
            case 1:
                super("attribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n    gl_Position = aPosition;\n    vTextureCoord = aTextureCoord.xy;\n}\n", str);
                this.d = GLES20.glGetUniformLocation(this.a, "texOffset");
                return;
            default:
                this.d = GLES20.glGetUniformLocation(this.a, "uTextureMatrix");
                return;
        }
    }

    public pm9() {
        super("attribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n    gl_Position = aPosition;\n    vTextureCoord = aTextureCoord.xy;\n}\n", um9.G);
        this.d = GLES20.glGetUniformLocation(this.a, "texOffset");
    }
}
