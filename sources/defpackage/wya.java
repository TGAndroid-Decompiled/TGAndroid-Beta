package defpackage;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import org.telegram.messenger.ImageReceiver;
public final class wya extends ImageReceiver {
    public final wjb K1;
    public final xya L1;

    public wya(xya xyaVar, wjb wjbVar) {
        super(null);
        this.L1 = xyaVar;
        this.K1 = wjbVar;
    }

    @Override
    public final boolean h0(Drawable drawable, String str, int i, boolean z, int i2) {
        xya xyaVar = this.L1;
        ImageView imageView = xyaVar.K;
        if ((drawable instanceof BitmapDrawable) && xyaVar.L == 0) {
            int I0 = gl.I0(((BitmapDrawable) drawable).getBitmap());
            xyaVar.L = I0;
            if (I0 != -1 && I0 != 0) {
                imageView.setBackground(bkb.b0(gl.L(12.0f), xyaVar.L));
            } else {
                int i3 = bkb.p5;
                wjb wjbVar = this.K1;
                xyaVar.L = bkb.v0(i3, wjbVar);
                zkb.B(imageView, bkb.b0(gl.L(12.0f), xyaVar.L), zkb.M(i3), wjbVar);
            }
            invalidate();
        }
        return super.h0(drawable, str, i, z, i2);
    }
}
