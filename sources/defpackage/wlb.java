package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.widget.FrameLayout;
import android.widget.ImageView;
public final class wlb extends FrameLayout {
    public final ImageView a;
    public final ema b;
    public final vnb c;
    public boolean d;

    public wlb(Context context, vnb vnbVar) {
        super(context);
        this.c = vnbVar;
        ema emaVar = new ema(context);
        this.b = emaVar;
        yob.W(emaVar, aob.j5, vnbVar);
        emaVar.setTextSize(16);
        emaVar.setGravity(19);
        addView(emaVar, tre.d(-1, 48.0f, 16, 22.0f, 0.0f, 56.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        yob.s(imageView, aob.C6, vnbVar, PorterDuff.Mode.SRC_IN);
        addView(imageView, tre.d(24, 24.0f, 8388629, 0.0f, 0.0f, 16.0f, 0.0f));
        int i = aob.h5;
        int i2 = rnb.a;
        int w0 = aob.w0(null, i, false);
        setBackground(rnb.d(w0, rnb.b(w0), new float[0]));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Paint paint;
        super.dispatchDraw(canvas);
        if (this.d) {
            vnb vnbVar = this.c;
            if (vnbVar != null) {
                paint = vnbVar.d("paintDivider");
            } else {
                paint = null;
            }
            if (paint == null) {
                paint = aob.j0;
            }
            canvas.drawLine(hl.L(22.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, paint);
        }
    }

    public void setDivider(boolean z) {
        this.d = z;
    }
}
