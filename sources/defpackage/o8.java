package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
public final class o8 extends FrameLayout {
    public final c51 a;
    public final View b;
    public final vnb c;
    public final Paint d;
    public boolean e;

    public o8(Context context, vnb vnbVar) {
        super(context);
        this.d = new Paint(1);
        this.c = vnbVar;
        View view = new View(context);
        this.b = view;
        addView(view, tre.o(-1, -1));
        c51 c51Var = new c51(vnbVar, context, true);
        this.a = c51Var;
        addView(c51Var, tre.d(-1, 48.0f, 17, 14.0f, 0.0f, 14.0f, 0.0f));
    }

    public final void a(int i, boolean z) {
        this.e = true;
        c51 c51Var = this.a;
        c51Var.k();
        c51Var.setShowZero(true);
        c51Var.setEnabled(true);
        c51Var.c(i, z);
        c51Var.i(ob6.M0(2131753186, null), z, true);
        yob.h(aob.h5, this.c, this.b);
    }

    public final void b(boolean z) {
        this.a.setLoading(z);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.e) {
            int v0 = aob.v0(aob.a7, this.c);
            Paint paint = this.d;
            paint.setColor(v0);
            paint.setAlpha(255);
            canvas.drawRect(0.0f, 0.0f, getWidth(), 1.0f, paint);
        }
    }

    public void setCloseStyle(boolean z) {
        this.e = false;
        c51 c51Var = this.a;
        c51Var.setShowZero(false);
        c51Var.setEnabled(true);
        c51Var.i(ob6.a0("Close", null, 2131752006, new Object[0]), false, true);
        this.e = z;
    }

    public void setOkStyle(boolean z) {
        String a0;
        this.e = false;
        c51 c51Var = this.a;
        c51Var.setShowZero(false);
        c51Var.setEnabled(true);
        if (z) {
            a0 = ob6.a0("BoostingUseLink", null, 2131753167, new Object[0]);
        } else {
            a0 = ob6.a0("OK", null, 2131747558, new Object[0]);
        }
        c51Var.i(a0, false, true);
    }

    @Override
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.a.setOnClickListener(onClickListener);
    }
}
