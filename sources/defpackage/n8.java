package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
public final class n8 extends FrameLayout {
    public final b61 a;
    public final View b;
    public final ylb c;
    public final Paint d;
    public boolean e;

    public n8(Context context, ylb ylbVar) {
        super(context);
        this.d = new Paint(1);
        this.c = ylbVar;
        View view = new View(context);
        this.b = view;
        addView(view, qoe.o(-1, -1));
        b61 b61Var = new b61(ylbVar, context, true);
        this.a = b61Var;
        addView(b61Var, qoe.d(-1, 48.0f, 17, 14.0f, 0.0f, 14.0f, 0.0f));
    }

    public final void a(int i, boolean z) {
        this.e = true;
        b61 b61Var = this.a;
        b61Var.k();
        b61Var.setShowZero(true);
        b61Var.setEnabled(true);
        b61Var.c(i, z);
        b61Var.i(jb6.M0(2131753158, null), z, true);
        anb.h(cmb.g5, this.c, this.b);
    }

    public final void b(boolean z) {
        this.a.setLoading(z);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.e) {
            int v0 = cmb.v0(cmb.Z6, this.c);
            Paint paint = this.d;
            paint.setColor(v0);
            paint.setAlpha(255);
            canvas.drawRect(0.0f, 0.0f, getWidth(), 1.0f, paint);
        }
    }

    public void setCloseStyle(boolean z) {
        this.e = false;
        b61 b61Var = this.a;
        b61Var.setShowZero(false);
        b61Var.setEnabled(true);
        b61Var.i(jb6.a0("Close", null, 2131751978, new Object[0]), false, true);
        this.e = z;
    }

    public void setOkStyle(boolean z) {
        String a0;
        this.e = false;
        b61 b61Var = this.a;
        b61Var.setShowZero(false);
        b61Var.setEnabled(true);
        if (z) {
            a0 = jb6.a0("BoostingUseLink", null, 2131753139, new Object[0]);
        } else {
            a0 = jb6.a0("OK", null, 2131747564, new Object[0]);
        }
        b61Var.i(a0, false, true);
    }

    @Override
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.a.setOnClickListener(onClickListener);
    }
}
