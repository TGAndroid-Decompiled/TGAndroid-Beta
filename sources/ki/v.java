package ki;

import android.opengl.GLES20;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class v extends x {
    public final int e;

    public v() {
        super(AndroidUtilities.readRes(R.raw.round_blur_vert), a0.A);
        this.e = GLES20.glGetUniformLocation(this.f13875a, "texOffset");
    }
}
