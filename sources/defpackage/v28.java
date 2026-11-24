package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.ui.ActionBar.d;
public final class v28 extends FrameLayout implements vlb {
    public final TextView a;
    public uib b;
    public final tm c;
    public final w28 d;

    public v28(w28 w28Var, Context context) {
        super(context);
        int i;
        int i2;
        this.d = w28Var;
        int i3 = cmb.c6;
        d38 d38Var = w28Var.q0;
        anb.h(i3, d38Var.getResourceProvider(), this);
        TextView textView = new TextView(context);
        this.a = textView;
        textView.setTextSize(1, 16.0f);
        anb.X(textView, cmb.F6, d38Var.getResourceProvider());
        boolean z = w28Var.n0;
        boolean z2 = d38Var.a;
        if (z) {
            if (z2) {
                i2 = 2131752250;
            } else {
                i2 = 2131743417;
            }
            textView.setText(jb6.M0(i2, null));
        } else {
            if (z2) {
                i = 2131752263;
            } else {
                i = 2131743420;
            }
            textView.setText(jb6.M0(i, null));
        }
        addView(textView, qoe.d(-1, -2.0f, 23, 20.0f, 0.0f, 20.0f, 0.0f));
        this.c = new tm(gm.L(24.0f), 13, this, false);
    }

    public final int a() {
        int i;
        fc7 fc7Var;
        ec7 d;
        int i2;
        ylb ylbVar;
        ylb ylbVar2;
        ylb ylbVar3;
        ylb ylbVar4;
        w28 w28Var = this.d;
        d38 d38Var = w28Var.q0;
        int i3 = w28Var.h;
        if (i3 < 0) {
            int i4 = cmb.r8;
            if (gm.B(d38Var.getThemedColor(i4)) > 0.8f) {
                int i5 = cmb.m6;
                ylbVar4 = ((d) d38Var).resourceProvider;
                return cmb.v0(i5, ylbVar4);
            } else if (gm.B(d38Var.getThemedColor(i4)) < 0.2f) {
                int i6 = cmb.z8;
                ylbVar3 = ((d) d38Var).resourceProvider;
                return cmb.p1(0.5f, cmb.v0(i6, ylbVar3));
            } else {
                int i7 = cmb.c6;
                ylbVar = ((d) d38Var).resourceProvider;
                int v0 = cmb.v0(i7, ylbVar);
                ylbVar2 = ((d) d38Var).resourceProvider;
                return cmb.v(v0, cmb.p1(0.7f, d38.z0(cmb.v0(i4, ylbVar2))));
            }
        } else if (i3 < 7) {
            return d38Var.getThemedColor(cmb.q8[i3]);
        } else {
            if (w28Var.n0) {
                i2 = ((d) d38Var).currentAccount;
                fc7Var = oc7.r1(i2).E3;
            } else {
                i = ((d) d38Var).currentAccount;
                fc7Var = oc7.r1(i).F3;
            }
            if (fc7Var != null && (d = fc7Var.d(w28Var.h)) != null) {
                return d.f();
            }
            return d38Var.getThemedColor(cmb.q8[0]);
        }
    }

    public final void b(boolean z) {
        int i;
        w28 w28Var = this.d;
        long j = w28Var.n;
        int i2 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        tm tmVar = this.c;
        if (i2 != 0) {
            tmVar.j(j, z);
            this.b = null;
            return;
        }
        tmVar.g(null, z);
        if (this.b == null) {
            if (w28Var.q0.a) {
                i = 2131752249;
            } else {
                i = 2131743416;
            }
            this.b = new uib(jb6.M0(i, null), 16.0f, null);
        }
    }

    public final void c() {
        int width;
        int width2;
        boolean z = jb6.a0;
        tm tmVar = this.c;
        if (z) {
            width = gm.L(21.0f);
        } else {
            width = (getWidth() - tmVar.s) - gm.L(21.0f);
        }
        int height = getHeight();
        int i = tmVar.s;
        int i2 = tmVar.s;
        int i3 = (height - i) / 2;
        if (jb6.a0) {
            width2 = gm.L(21.0f) + i2;
        } else {
            width2 = getWidth() - gm.L(21.0f);
        }
        tmVar.setBounds(width, i3, width2, (getHeight() + i2) / 2);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        c();
        Integer valueOf = Integer.valueOf(a());
        tm tmVar = this.c;
        tmVar.k(valueOf);
        uib uibVar = this.b;
        if (uibVar != null) {
            uibVar.c((getMeasuredWidth() - this.b.j()) - gm.L(19.0f), getMeasuredHeight() / 2.0f, 1.0f, this.d.q0.getThemedColor(cmb.p6), canvas);
        } else {
            tmVar.draw(canvas);
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
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(gm.L(50.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        d38 d38Var = this.d.q0;
        setBackgroundColor(d38Var.getThemedColor(cmb.c6));
        this.a.setTextColor(d38Var.getThemedColor(cmb.F6));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
