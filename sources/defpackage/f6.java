package defpackage;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.widget.FrameLayout;
import java.util.Iterator;
public abstract class f6 extends FrameLayout implements wa9 {
    public final vnb a;
    public final vh4 b;
    public final xa9 c;

    public f6(Context context, vnb vnbVar, vh4 vh4Var) {
        super(context);
        this.c = new xa9(this, k43.h, 350L);
        this.a = vnbVar;
        this.b = vh4Var;
    }

    public final void a(CharSequence charSequence, boolean z) {
        boolean z2;
        SpannableString spannableString;
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        xa9 xa9Var = this.c;
        if (isEmpty) {
            xa9Var.a.m(null, true);
            return;
        }
        int indexOf = TextUtils.indexOf(charSequence, "...");
        vh4 vh4Var = this.b;
        if (indexOf >= 0) {
            SpannableString valueOf = SpannableString.valueOf(charSequence);
            vh4Var.M(valueOf, indexOf);
            z2 = true;
            spannableString = valueOf;
        } else {
            z2 = false;
            spannableString = charSequence;
        }
        e6 e6Var = new e6(this, getContext());
        int i = aob.Xl;
        vnb vnbVar = this.a;
        yob.X(e6Var, i, vnbVar);
        yob.G(e6Var, i, vnbVar);
        e6Var.setTextSize(1, 14.0f);
        e6Var.setAlpha(0.0f);
        e6Var.setText(spannableString);
        if (z2) {
            vh4Var.c(e6Var);
        }
        addView(e6Var, tre.c(-2.0f, -2));
        xa9Var.h(e6Var, true);
    }

    public final void b() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            y66 y66Var = (y66) it.next();
            int i = aob.Xl;
            vnb vnbVar = this.a;
            ((e6) y66Var.a).setTextColor(aob.v0(i, vnbVar));
            ((e6) y66Var.a).setLinkTextColor(aob.v0(i, vnbVar));
        }
    }

    public void f(xa9 xa9Var) {
        float f;
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            y66 y66Var = (y66) it.next();
            float c = y66Var.c();
            Object obj = y66Var.a;
            float R1 = hl.R1(0.85f, 1.0f, c);
            e6 e6Var = (e6) obj;
            e6Var.setAlpha(c);
            e6Var.setScaleX(R1);
            e6Var.setScaleY(R1);
            if (!y66Var.h) {
                f = 9.0f;
            } else {
                f = -9.0f;
            }
            e6Var.setTranslationY(hl.U1(c, hl.L(f), 0));
        }
    }

    public float getTotalVisibility() {
        return this.c.a.d.c.a;
    }

    @Override
    public final void c() {
    }
}
