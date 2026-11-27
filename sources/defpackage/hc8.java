package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.widget.FrameLayout;
import java.io.File;
import java.util.ArrayList;
import org.telegram.ui.PhotoViewer;
public final class hc8 extends wy5 {
    public boolean c2;
    public final PhotoViewer d2;

    public hc8(PhotoViewer photoViewer, Context context, Activity activity, int i, Bitmap bitmap, Bitmap bitmap2, int i2, ArrayList arrayList, fo6 fo6Var, y98 y98Var, vnb vnbVar) {
        super(context, activity, i, bitmap, bitmap2, i2, arrayList, fo6Var, y98Var, vnbVar);
        this.d2 = photoViewer;
    }

    @Override
    public final FrameLayout getCaptionsBulletinContainer() {
        return this.d2.f0;
    }

    @Override
    public final long getCaptionsTrimEnd() {
        PhotoViewer photoViewer = this.d2;
        mb8 mb8Var = photoViewer.X7;
        if (mb8Var == null) {
            return 0L;
        }
        return mb8Var.getRightProgress() * ((float) photoViewer.z0());
    }

    @Override
    public final long getCaptionsTrimStart() {
        PhotoViewer photoViewer = this.d2;
        mb8 mb8Var = photoViewer.X7;
        if (mb8Var == null) {
            return 0L;
        }
        return mb8Var.getLeftProgress() * ((float) photoViewer.z0());
    }

    @Override
    public final File getCaptionsVideoFile() {
        int i;
        PhotoViewer photoViewer = this.d2;
        if (photoViewer.s1 && photoViewer.d5 != null && (i = photoViewer.d2) != 1 && i != 11) {
            return new File(photoViewer.d5);
        }
        return null;
    }

    @Override
    public final long getCaptionsVideoPosition() {
        kfc kfcVar = this.d2.G2;
        if (kfcVar != null) {
            return kfcVar.S();
        }
        return 0L;
    }

    @Override
    public final int getPKeyboardHeight() {
        rx5 rx5Var = this.d2.L1;
        if (rx5Var != null) {
            return rx5Var.l;
        }
        return 0;
    }

    @Override
    public final void q0(boolean z) {
        PhotoViewer photoViewer = this.d2;
        if (photoViewer.G2 != null) {
            photoViewer.H2 = false;
            photoViewer.m();
            if (z) {
                photoViewer.G2.f0();
            } else if (!photoViewer.T0()) {
                photoViewer.G2.g0();
            }
        }
    }
}
