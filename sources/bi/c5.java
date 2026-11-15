package bi;

import android.content.Context;
import android.text.SpannableString;
import android.widget.LinearLayout;
import c8.ja;
import di.mb;
import di.v8;
import org.telegram.messenger.is;
import org.telegram.messenger.ns;
import org.telegram.messenger.z10;
import org.telegram.ui.Components.e80;
import org.telegram.ui.Components.eq;
public final class c5 extends LinearLayout implements is {
    public final int f3420a;
    public final org.telegram.ui.Components.h6 f3421b;
    public final org.telegram.ui.Components.h6 f3422c;
    public final eq[] d;
    public final eq[] f3423e;
    public SpannableString f3424f;
    public z10 h;
    public long f3425n;

    public c5(int i7, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.d = new eq[1];
        this.f3423e = new eq[1];
        this.f3425n = -1L;
        this.f3420a = i7;
        setOrientation(1);
        setGravity(21);
        int L = org.telegram.messenger.g0.L(6.0f);
        setPadding(org.telegram.messenger.g0.L(13.0f) + L, L, org.telegram.messenger.g0.L(14.0f) + L, L);
        org.telegram.ui.Components.h6 a10 = a(context, e6Var);
        this.f3421b = a10;
        addView(a10, ja.r(-2, 18, 5));
        org.telegram.ui.Components.h6 a11 = a(context, e6Var);
        this.f3422c = a11;
        addView(a11, ja.r(-2, 18, 5));
        b(false);
    }

    public static org.telegram.ui.Components.h6 a(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        org.telegram.ui.Components.h6 h6Var = new org.telegram.ui.Components.h6(context, false, true, false);
        h6Var.f35178n = true;
        h6Var.setTypeface(org.telegram.messenger.g0.o());
        h6Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
        h6Var.setGravity(5);
        org.telegram.ui.ActionBar.q6.Y(h6Var, org.telegram.ui.ActionBar.j6.G6, e6Var);
        return h6Var;
    }

    public final void b(boolean z10) {
        int i7 = this.f3420a;
        v8 y10 = v8.y(i7, false);
        v8 y11 = v8.y(i7, true);
        long j3 = y10.p().amount;
        cg.a s5 = y11.s();
        boolean z11 = y10.f9601e;
        org.telegram.ui.Components.h6 h6Var = this.f3421b;
        org.telegram.ui.Components.h6 h6Var2 = this.f3422c;
        if (z11 && y11.f9601e) {
            h6Var.c(mb.a1(false, i5.c.l(j3, ' ', new StringBuilder("⭐️")), 0.7f, this.d), z10, true);
            if (s5.k()) {
                h6Var2.setVisibility(8);
            } else {
                h6Var2.setVisibility(0);
                eq[] eqVarArr = this.f3423e;
                h6Var2.c(mb.a1(true, "⭐️" + s5.d(), 0.7f, eqVarArr), z10, true);
                eq eqVar = eqVarArr[0];
                if (eqVar != null) {
                    eqVar.a(org.telegram.ui.ActionBar.j6.Zl);
                }
            }
            this.f3425n = j3;
            return;
        }
        if (this.f3424f == null) {
            SpannableString spannableString = new SpannableString("x");
            this.f3424f = spannableString;
            spannableString.setSpan(new e80(org.telegram.messenger.g0.L(48.0f), h6Var), 0, 1, 33);
        }
        h6Var.c(this.f3424f, false, true);
        h6Var2.setVisibility(8);
        this.f3425n = -1L;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ns.f25610y3) {
            b(true);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b(false);
        ns.f(this.f3420a).b(this, ns.f25610y3);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ns.f(this.f3420a).n(this, ns.f25610y3);
    }

    @Override
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        z10 z10Var = this.h;
        if (z10Var != null && i7 != i11) {
            z10Var.a(Integer.valueOf(i7));
        }
    }

    public void setOnWidthChanged(z10 z10Var) {
        this.h = z10Var;
    }
}
