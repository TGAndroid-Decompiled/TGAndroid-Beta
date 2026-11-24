package defpackage;

import android.media.MediaFormat;
import org.telegram.ui.PhotoViewer;
public final class na8 implements vcc {
    public final PhotoViewer a;

    public na8(PhotoViewer photoViewer) {
        this.a = photoViewer;
    }

    @Override
    public final void c(long j, long j2, go4 go4Var, MediaFormat mediaFormat) {
        ndc ndcVar;
        PhotoViewer photoViewer = this.a;
        if (!photoViewer.I4 || (ndcVar = photoViewer.G2) == null) {
            return;
        }
        gm.c3(new a18(this, ndcVar, (byte) 11));
    }
}
