package defpackage;

import android.media.MediaFormat;
import org.telegram.ui.PhotoViewer;
public final class cc8 implements sec {
    public final PhotoViewer a;

    public cc8(PhotoViewer photoViewer) {
        this.a = photoViewer;
    }

    @Override
    public final void b(long j, long j2, ko4 ko4Var, MediaFormat mediaFormat) {
        kfc kfcVar;
        PhotoViewer photoViewer = this.a;
        if (!photoViewer.I4 || (kfcVar = photoViewer.G2) == null) {
            return;
        }
        hl.c3(new h68(this, kfcVar, (byte) 8));
    }
}
