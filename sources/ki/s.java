package ki;

import android.opengl.GLES20;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class s extends u {
    public final int e;

    public s() {
        super(AndroidUtilities.readRes(R.raw.round_blur_vert), x.A);
        this.e = GLES20.glGetUniformLocation(this.f13837a, "texOffset");
    }
}
