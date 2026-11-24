package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.widget.FrameLayout;
import java.io.File;
import java.util.ArrayList;
import org.telegram.ui.PhotoViewer;
public final class q88 extends rw5 {
    public boolean i2;
    public final PhotoViewer j2;

    public q88(PhotoViewer photoViewer, Context context, Activity activity, int i, Bitmap bitmap, Bitmap bitmap2, int i2, ArrayList arrayList, zl6 zl6Var, l68 l68Var, wjb wjbVar) {
        super(context, activity, i, bitmap, bitmap2, i2, arrayList, zl6Var, l68Var, wjbVar);
        this.j2 = photoViewer;
    }

    @Override
    public final FrameLayout getCaptionsBulletinContainer() {
        return this.j2.f0;
    }

    @Override
    public final long getCaptionsTrimEnd() {
        PhotoViewer photoViewer = this.j2;
        u78 u78Var = photoViewer.X7;
        if (u78Var == null) {
            return 0L;
        }
        return u78Var.getRightProgress() * ((float) photoViewer.z0());
    }

    @Override
    public final long getCaptionsTrimStart() {
        PhotoViewer photoViewer = this.j2;
        u78 u78Var = photoViewer.X7;
        if (u78Var == null) {
            return 0L;
        }
        return u78Var.getLeftProgress() * ((float) photoViewer.z0());
    }

    @Override
    public final File getCaptionsVideoFile() {
        int i;
        PhotoViewer photoViewer = this.j2;
        if (photoViewer.s1 && photoViewer.d5 != null && (i = photoViewer.d2) != 1 && i != 11) {
            return new File(photoViewer.d5);
        }
        return null;
    }

    @Override
    public final long getCaptionsVideoPosition() {
        lbc lbcVar = this.j2.G2;
        if (lbcVar != null) {
            return lbcVar.S();
        }
        return 0L;
    }

    @Override
    public final int getPKeyboardHeight() {
        mv5 mv5Var = this.j2.L1;
        if (mv5Var != null) {
            return mv5Var.l;
        }
        return 0;
    }

    @Override
    public final void q0(boolean z) {
        PhotoViewer photoViewer = this.j2;
        if (photoViewer.G2 != null) {
            photoViewer.H2 = false;
            photoViewer.n();
            if (z) {
                photoViewer.G2.f0();
            } else if (!photoViewer.T0()) {
                photoViewer.G2.g0();
            }
        }
    }
}
