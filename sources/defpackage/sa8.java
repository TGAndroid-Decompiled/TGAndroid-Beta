package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.widget.FrameLayout;
import java.io.File;
import java.util.ArrayList;
import org.telegram.ui.PhotoViewer;
public final class sa8 extends ry5 {
    public boolean i2;
    public final PhotoViewer j2;

    public sa8(PhotoViewer photoViewer, Context context, Activity activity, int i, Bitmap bitmap, Bitmap bitmap2, int i2, ArrayList arrayList, ao6 ao6Var, n88 n88Var, ylb ylbVar) {
        super(context, activity, i, bitmap, bitmap2, i2, arrayList, ao6Var, n88Var, ylbVar);
        this.j2 = photoViewer;
    }

    @Override
    public final FrameLayout getCaptionsBulletinContainer() {
        return this.j2.f0;
    }

    @Override
    public final long getCaptionsTrimEnd() {
        PhotoViewer photoViewer = this.j2;
        x98 x98Var = photoViewer.X7;
        if (x98Var == null) {
            return 0L;
        }
        return x98Var.getRightProgress() * ((float) photoViewer.z0());
    }

    @Override
    public final long getCaptionsTrimStart() {
        PhotoViewer photoViewer = this.j2;
        x98 x98Var = photoViewer.X7;
        if (x98Var == null) {
            return 0L;
        }
        return x98Var.getLeftProgress() * ((float) photoViewer.z0());
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
        ndc ndcVar = this.j2.G2;
        if (ndcVar != null) {
            return ndcVar.S();
        }
        return 0L;
    }

    @Override
    public final int getPKeyboardHeight() {
        mx5 mx5Var = this.j2.L1;
        if (mx5Var != null) {
            return mx5Var.l;
        }
        return 0;
    }

    @Override
    public final void q0(boolean z) {
        PhotoViewer photoViewer = this.j2;
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
