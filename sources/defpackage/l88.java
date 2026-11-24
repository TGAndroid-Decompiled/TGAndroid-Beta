package defpackage;

import android.media.MediaFormat;
import org.telegram.ui.PhotoViewer;
public final class l88 implements sac {
    public final PhotoViewer a;

    public l88(PhotoViewer photoViewer) {
        this.a = photoViewer;
    }

    @Override
    public final void c(long j, long j2, fm4 fm4Var, MediaFormat mediaFormat) {
        lbc lbcVar;
        PhotoViewer photoViewer = this.a;
        if (!photoViewer.J4 || (lbcVar = photoViewer.G2) == null) {
            return;
        }
        gl.d3(new h18(this, lbcVar, (byte) 10));
    }
}
