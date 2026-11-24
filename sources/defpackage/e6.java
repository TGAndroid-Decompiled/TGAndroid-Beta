package defpackage;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.widget.FrameLayout;
import java.util.Iterator;
public abstract class e6 extends FrameLayout implements j79 {
    public final wjb a;
    public final xf4 b;
    public final k79 c;

    public e6(Context context, wjb wjbVar, xf4 xf4Var) {
        super(context);
        this.c = new k79(this, s33.h, 350L);
        this.a = wjbVar;
        this.b = xf4Var;
    }

    public final void a(CharSequence charSequence, boolean z) {
        boolean z2;
        SpannableString spannableString;
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        k79 k79Var = this.c;
        if (isEmpty) {
            k79Var.a.m(null, true);
            return;
        }
        int indexOf = TextUtils.indexOf(charSequence, "...");
        xf4 xf4Var = this.b;
        if (indexOf >= 0) {
            SpannableString valueOf = SpannableString.valueOf(charSequence);
            xf4Var.M(valueOf, indexOf);
            z2 = true;
            spannableString = valueOf;
        } else {
            z2 = false;
            spannableString = charSequence;
        }
        d6 d6Var = new d6(this, getContext());
        int i = bkb.Wl;
        wjb wjbVar = this.a;
        zkb.X(d6Var, i, wjbVar);
        zkb.G(d6Var, i, wjbVar);
        d6Var.setTextSize(1, 14.0f);
        d6Var.setAlpha(0.0f);
        d6Var.setText(spannableString);
        if (z2) {
            xf4Var.d(d6Var);
        }
        addView(d6Var, nme.c(-2.0f, -2));
        k79Var.h(d6Var, true);
    }

    public final void b() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            u46 u46Var = (u46) it.next();
            int i = bkb.Wl;
            wjb wjbVar = this.a;
            ((d6) u46Var.a).setTextColor(bkb.v0(i, wjbVar));
            ((d6) u46Var.a).setLinkTextColor(bkb.v0(i, wjbVar));
        }
    }

    public void f(k79 k79Var) {
        float f;
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            u46 u46Var = (u46) it.next();
            float c = u46Var.c();
            Object obj = u46Var.a;
            float R1 = gl.R1(0.85f, 1.0f, c);
            d6 d6Var = (d6) obj;
            d6Var.setAlpha(c);
            d6Var.setScaleX(R1);
            d6Var.setScaleY(R1);
            if (!u46Var.h) {
                f = 9.0f;
            } else {
                f = -9.0f;
            }
            d6Var.setTranslationY(gl.U1(c, gl.L(f), 0));
        }
    }

    public float getTotalVisibility() {
        return this.c.a.d.c.a;
    }

    @Override
    public final void c() {
    }
}
