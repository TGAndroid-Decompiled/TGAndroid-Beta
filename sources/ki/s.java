package ki;

import android.opengl.GLES20;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class s extends r {
    public final int e;

    public s() {
        super(AndroidUtilities.readRes(R.raw.round_blur_vert), "precision mediump float;\nvarying vec2 vTextureCoord;\nuniform sampler2D sTexture;\nuniform vec2 texOffset;\nvoid main() {\n    vec3 color = texture2D(sTexture, vTextureCoord).rgb * 0.227027;\n    color += (texture2D(sTexture, vTextureCoord + texOffset * 1.384615).rgb\n            + texture2D(sTexture, vTextureCoord - texOffset * 1.384615).rgb) * 0.316216;\n    color += (texture2D(sTexture, vTextureCoord + texOffset * 3.230769).rgb\n            + texture2D(sTexture, vTextureCoord - texOffset * 3.230769).rgb) * 0.070270;\n    gl_FragColor = vec4(color, 1.0);\n}\n");
        this.e = GLES20.glGetUniformLocation(this.f13792a, "texOffset");
    }
}
