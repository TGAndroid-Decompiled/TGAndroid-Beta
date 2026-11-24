package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
public final class d1a extends gg0 {
    public final jh2 s;
    public TLRPC.TL_help_country w;
    public final TextPaint x;
    public final c0a y;

    public d1a(Context context, ylb ylbVar) {
        super(context, ylbVar);
        int i;
        TextPaint textPaint = new TextPaint();
        this.x = textPaint;
        this.y = new c0a(this, (byte) 1);
        textPaint.setTextSize(gm.L(20.0f));
        this.f.setVisibility(8);
        this.c.setVisibility(8);
        jh2 jh2Var = new jh2(21, ylbVar, context);
        this.s = jh2Var;
        jh2Var.b(cmb.A5, cmb.i7, cmb.B5);
        jh2Var.setDrawUnchecked(true);
        jh2Var.setDrawBackgroundAsArc(10);
        addView(jh2Var);
        jh2Var.a(false, false);
        if (jb6.a0) {
            i = 5;
        } else {
            i = 3;
        }
        jh2Var.setLayoutParams(qoe.d(24, 24.0f, i | 16, 13.0f, 0.0f, 14.0f, 0.0f));
    }

    @Override
    public final int a() {
        return 22;
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final void c(boolean z, boolean z2) {
        jh2 jh2Var = this.s;
        if (jh2Var.getVisibility() == 0) {
            jh2Var.a(z, z2);
        }
    }

    @Override
    public final void d() {
        int i;
        float f;
        float f2;
        int i2;
        float f3;
        float f4;
        float f5;
        float f6;
        boolean z = jb6.a0;
        int i3 = 3;
        if (z) {
            i = 5;
        } else {
            i = 3;
        }
        int i4 = i | 16;
        if (z) {
            f = 20.0f;
        } else {
            f = 52.0f;
        }
        if (z) {
            f2 = 52.0f;
        } else {
            f2 = 20.0f;
        }
        this.d.setLayoutParams(qoe.d(-1, -2.0f, i4, f, 0.0f, f2, 0.0f));
        boolean z2 = jb6.a0;
        if (z2) {
            i2 = 5;
        } else {
            i2 = 3;
        }
        int i5 = i2 | 16;
        if (z2) {
            f3 = 20.0f;
        } else {
            f3 = 52.0f;
        }
        if (z2) {
            f4 = 52.0f;
        } else {
            f4 = 20.0f;
        }
        this.e.setLayoutParams(qoe.d(-1, -2.0f, i5, f3, 0.0f, f4, 0.0f));
        boolean z3 = jb6.a0;
        if (z3) {
            i3 = 5;
        }
        int i6 = i3 | 16;
        if (z3) {
            f5 = 15.0f;
        } else {
            f5 = 20.0f;
        }
        if (z3) {
            f6 = 20.0f;
        } else {
            f6 = 15.0f;
        }
        this.f.setLayoutParams(qoe.d(22, 22.0f, i6, f5, 0.0f, f6, 0.0f));
    }

    public final void f() {
        TLRPC.TL_help_country tL_help_country = this.w;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        CharSequence o = gw3.o(jb6.E0(tL_help_country.iso2), this.x.getFontMetricsInt(), 0, this.y);
        if (o != null) {
            spannableStringBuilder.append(o).append((CharSequence) " ");
            spannableStringBuilder.setSpan(new c1a(16), o.length(), o.length() + 1, 0);
        } else {
            spannableStringBuilder.append((CharSequence) " ");
            spannableStringBuilder.setSpan(new c1a(34), 0, 1, 0);
        }
        String i0 = jb6.i0(2131750453, tL_help_country.iso2);
        if (TextUtils.isEmpty(i0)) {
            i0 = tL_help_country.default_name;
        }
        spannableStringBuilder.append((CharSequence) i0);
        this.d.k(spannableStringBuilder);
    }

    public TLRPC.TL_help_country getCountry() {
        return this.w;
    }

    @Override
    public int getFullHeight() {
        return 44;
    }
}
