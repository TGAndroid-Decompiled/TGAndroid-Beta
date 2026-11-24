package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
public final class n8 extends FrameLayout {
    public final u41 a;
    public final View b;
    public final wjb c;
    public final Paint d;
    public boolean e;

    public n8(Context context, wjb wjbVar) {
        super(context);
        this.d = new Paint(1);
        this.c = wjbVar;
        View view = new View(context);
        this.b = view;
        addView(view, nme.o(-1, -1));
        u41 u41Var = new u41(wjbVar, context, true);
        this.a = u41Var;
        addView(u41Var, nme.d(-1, 48.0f, 17, 14.0f, 0.0f, 14.0f, 0.0f));
    }

    public final void a(int i, boolean z) {
        this.e = true;
        u41 u41Var = this.a;
        u41Var.k();
        u41Var.setShowZero(true);
        u41Var.setEnabled(true);
        u41Var.c(i, z);
        u41Var.i(k96.M0(2131753190, null), z, true);
        zkb.h(bkb.g5, this.c, this.b);
    }

    public final void b(boolean z) {
        this.a.setLoading(z);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.e) {
            int v0 = bkb.v0(bkb.Z6, this.c);
            Paint paint = this.d;
            paint.setColor(v0);
            paint.setAlpha(255);
            canvas.drawRect(0.0f, 0.0f, getWidth(), 1.0f, paint);
        }
    }

    public void setCloseStyle(boolean z) {
        this.e = false;
        u41 u41Var = this.a;
        u41Var.setShowZero(false);
        u41Var.setEnabled(true);
        u41Var.i(k96.a0("Close", null, 2131752029, new Object[0]), false, true);
        this.e = z;
    }

    public void setOkStyle(boolean z) {
        String a0;
        this.e = false;
        u41 u41Var = this.a;
        u41Var.setShowZero(false);
        u41Var.setEnabled(true);
        if (z) {
            a0 = k96.a0("BoostingUseLink", null, 2131753171, new Object[0]);
        } else {
            a0 = k96.a0("OK", null, 2131747638, new Object[0]);
        }
        u41Var.i(a0, false, true);
    }

    @Override
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.a.setOnClickListener(onClickListener);
    }
}
