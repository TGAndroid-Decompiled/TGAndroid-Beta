package defpackage;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import org.telegram.messenger.ImageReceiver;
public final class x0b extends ImageReceiver {
    public final ylb K1;
    public final y0b L1;

    public x0b(y0b y0bVar, ylb ylbVar) {
        super(null);
        this.L1 = y0bVar;
        this.K1 = ylbVar;
    }

    @Override
    public final boolean h0(Drawable drawable, String str, int i, boolean z, int i2) {
        y0b y0bVar = this.L1;
        ImageView imageView = y0bVar.K;
        if ((drawable instanceof BitmapDrawable) && y0bVar.L == 0) {
            int I0 = gm.I0(((BitmapDrawable) drawable).getBitmap());
            y0bVar.L = I0;
            if (I0 != -1 && I0 != 0) {
                imageView.setBackground(cmb.b0(gm.L(12.0f), y0bVar.L));
            } else {
                int i3 = cmb.p5;
                ylb ylbVar = this.K1;
                y0bVar.L = cmb.v0(i3, ylbVar);
                anb.B(imageView, cmb.b0(gm.L(12.0f), y0bVar.L), anb.M(i3), ylbVar);
            }
            invalidate();
        }
        return super.h0(drawable, str, i, z, i2);
    }
}
