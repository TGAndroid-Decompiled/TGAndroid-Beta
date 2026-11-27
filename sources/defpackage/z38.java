package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.ui.ActionBar.e;
public final class z38 extends FrameLayout implements snb {
    public final TextView a;
    public pkb b;
    public final ul c;
    public final a48 d;

    public z38(a48 a48Var, Context context) {
        super(context);
        int i;
        int i2;
        this.d = a48Var;
        int i3 = aob.d6;
        h48 h48Var = a48Var.q0;
        yob.h(i3, h48Var.getResourceProvider(), this);
        TextView textView = new TextView(context);
        this.a = textView;
        textView.setTextSize(1, 16.0f);
        yob.X(textView, aob.G6, h48Var.getResourceProvider());
        boolean z = a48Var.n0;
        boolean z2 = h48Var.a;
        if (z) {
            if (z2) {
                i2 = 2131752278;
            } else {
                i2 = 2131743385;
            }
            textView.setText(ob6.M0(i2, null));
        } else {
            if (z2) {
                i = 2131752291;
            } else {
                i = 2131743388;
            }
            textView.setText(ob6.M0(i, null));
        }
        addView(textView, tre.d(-1, -2.0f, 23, 20.0f, 0.0f, 20.0f, 0.0f));
        this.c = new ul(hl.L(24.0f), 13, this, false);
    }

    public final int a() {
        int i;
        lc7 lc7Var;
        kc7 d;
        int i2;
        vnb vnbVar;
        vnb vnbVar2;
        vnb vnbVar3;
        vnb vnbVar4;
        a48 a48Var = this.d;
        h48 h48Var = a48Var.q0;
        int i3 = a48Var.h;
        if (i3 < 0) {
            int i4 = aob.s8;
            if (hl.B(h48Var.getThemedColor(i4)) > 0.8f) {
                int i5 = aob.n6;
                vnbVar4 = ((e) h48Var).resourceProvider;
                return aob.v0(i5, vnbVar4);
            } else if (hl.B(h48Var.getThemedColor(i4)) < 0.2f) {
                int i6 = aob.A8;
                vnbVar3 = ((e) h48Var).resourceProvider;
                return aob.p1(0.5f, aob.v0(i6, vnbVar3));
            } else {
                int i7 = aob.d6;
                vnbVar = ((e) h48Var).resourceProvider;
                int v0 = aob.v0(i7, vnbVar);
                vnbVar2 = ((e) h48Var).resourceProvider;
                return aob.v(v0, aob.p1(0.7f, h48.z0(aob.v0(i4, vnbVar2))));
            }
        } else if (i3 < 7) {
            return h48Var.getThemedColor(aob.r8[i3]);
        } else {
            if (a48Var.n0) {
                i2 = ((e) h48Var).currentAccount;
                lc7Var = uc7.s1(i2).F3;
            } else {
                i = ((e) h48Var).currentAccount;
                lc7Var = uc7.s1(i).G3;
            }
            if (lc7Var != null && (d = lc7Var.d(a48Var.h)) != null) {
                return d.f();
            }
            return h48Var.getThemedColor(aob.r8[0]);
        }
    }

    public final void b(boolean z) {
        int i;
        a48 a48Var = this.d;
        long j = a48Var.n;
        int i2 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        ul ulVar = this.c;
        if (i2 != 0) {
            ulVar.j(j, z);
            this.b = null;
            return;
        }
        ulVar.g(null, z);
        if (this.b == null) {
            if (a48Var.q0.a) {
                i = 2131752277;
            } else {
                i = 2131743384;
            }
            this.b = new pkb(ob6.M0(i, null), 16.0f, null);
        }
    }

    public final void c() {
        int width;
        int width2;
        boolean z = ob6.a0;
        ul ulVar = this.c;
        if (z) {
            width = hl.L(21.0f);
        } else {
            width = (getWidth() - ulVar.s) - hl.L(21.0f);
        }
        int height = getHeight();
        int i = ulVar.s;
        int i2 = ulVar.s;
        int i3 = (height - i) / 2;
        if (ob6.a0) {
            width2 = hl.L(21.0f) + i2;
        } else {
            width2 = getWidth() - hl.L(21.0f);
        }
        ulVar.setBounds(width, i3, width2, (getHeight() + i2) / 2);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        c();
        Integer valueOf = Integer.valueOf(a());
        ul ulVar = this.c;
        ulVar.k(valueOf);
        pkb pkbVar = this.b;
        if (pkbVar != null) {
            pkbVar.c((getMeasuredWidth() - this.b.j()) - hl.L(19.0f), getMeasuredHeight() / 2.0f, 1.0f, this.d.q0.getThemedColor(aob.q6), canvas);
        } else {
            ulVar.draw(canvas);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.c.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.c.b();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(hl.L(50.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        h48 h48Var = this.d.q0;
        setBackgroundColor(h48Var.getThemedColor(aob.d6));
        this.a.setTextColor(h48Var.getThemedColor(aob.G6));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
