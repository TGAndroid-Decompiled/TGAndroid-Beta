package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.ui.ActionBar.d;
public final class s08 extends FrameLayout implements tjb {
    public final TextView a;
    public tgb b;
    public final tl c;
    public final t08 d;

    public s08(t08 t08Var, Context context) {
        super(context);
        int i;
        int i2;
        this.d = t08Var;
        int i3 = bkb.c6;
        a18 a18Var = t08Var.q0;
        zkb.h(i3, a18Var.getResourceProvider(), this);
        TextView textView = new TextView(context);
        this.a = textView;
        textView.setTextSize(1, 16.0f);
        zkb.X(textView, bkb.F6, a18Var.getResourceProvider());
        boolean z = t08Var.n0;
        boolean z2 = a18Var.a;
        if (z) {
            if (z2) {
                i2 = 2131752300;
            } else {
                i2 = 2131743491;
            }
            textView.setText(k96.M0(i2, null));
        } else {
            if (z2) {
                i = 2131752309;
            } else {
                i = 2131743494;
            }
            textView.setText(k96.M0(i, null));
        }
        addView(textView, nme.d(-1, -2.0f, 23, 20.0f, 0.0f, 20.0f, 0.0f));
        this.c = new tl(gl.L(24.0f), 13, this, false);
    }

    public final int a() {
        int i;
        ea7 ea7Var;
        da7 d;
        int i2;
        wjb wjbVar;
        wjb wjbVar2;
        wjb wjbVar3;
        wjb wjbVar4;
        t08 t08Var = this.d;
        a18 a18Var = t08Var.q0;
        int i3 = t08Var.h;
        if (i3 < 0) {
            int i4 = bkb.r8;
            if (gl.B(a18Var.getThemedColor(i4)) > 0.8f) {
                int i5 = bkb.m6;
                wjbVar4 = ((d) a18Var).resourceProvider;
                return bkb.v0(i5, wjbVar4);
            } else if (gl.B(a18Var.getThemedColor(i4)) < 0.2f) {
                int i6 = bkb.z8;
                wjbVar3 = ((d) a18Var).resourceProvider;
                return bkb.p1(0.5f, bkb.v0(i6, wjbVar3));
            } else {
                int i7 = bkb.c6;
                wjbVar = ((d) a18Var).resourceProvider;
                int v0 = bkb.v0(i7, wjbVar);
                wjbVar2 = ((d) a18Var).resourceProvider;
                return bkb.v(v0, bkb.p1(0.7f, a18.y0(bkb.v0(i4, wjbVar2))));
            }
        } else if (i3 < 7) {
            return a18Var.getThemedColor(bkb.q8[i3]);
        } else {
            if (t08Var.n0) {
                i2 = ((d) a18Var).currentAccount;
                ea7Var = na7.q1(i2).E3;
            } else {
                i = ((d) a18Var).currentAccount;
                ea7Var = na7.q1(i).F3;
            }
            if (ea7Var != null && (d = ea7Var.d(t08Var.h)) != null) {
                return d.f();
            }
            return a18Var.getThemedColor(bkb.q8[0]);
        }
    }

    public final void b(boolean z) {
        int i;
        t08 t08Var = this.d;
        long j = t08Var.n;
        int i2 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        tl tlVar = this.c;
        if (i2 != 0) {
            tlVar.j(j, z);
            this.b = null;
            return;
        }
        tlVar.g(null, z);
        if (this.b == null) {
            if (t08Var.q0.a) {
                i = 2131752299;
            } else {
                i = 2131743490;
            }
            this.b = new tgb(k96.M0(i, null), 16.0f, null);
        }
    }

    public final void c() {
        int width;
        int width2;
        boolean z = k96.a0;
        tl tlVar = this.c;
        if (z) {
            width = gl.L(21.0f);
        } else {
            width = (getWidth() - tlVar.s) - gl.L(21.0f);
        }
        int height = getHeight();
        int i = tlVar.s;
        int i2 = tlVar.s;
        int i3 = (height - i) / 2;
        if (k96.a0) {
            width2 = gl.L(21.0f) + i2;
        } else {
            width2 = getWidth() - gl.L(21.0f);
        }
        tlVar.setBounds(width, i3, width2, (getHeight() + i2) / 2);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        c();
        Integer valueOf = Integer.valueOf(a());
        tl tlVar = this.c;
        tlVar.k(valueOf);
        tgb tgbVar = this.b;
        if (tgbVar != null) {
            tgbVar.c((getMeasuredWidth() - this.b.j()) - gl.L(19.0f), getMeasuredHeight() / 2.0f, 1.0f, this.d.q0.getThemedColor(bkb.p6), canvas);
        } else {
            tlVar.draw(canvas);
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
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(gl.L(50.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        a18 a18Var = this.d.q0;
        setBackgroundColor(a18Var.getThemedColor(bkb.c6));
        this.a.setTextColor(a18Var.getThemedColor(bkb.F6));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
