package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
public final class v2a extends if0 {
    public final og2 s;
    public TLRPC.TL_help_country w;
    public final TextPaint x;
    public final ux9 y;

    public v2a(Context context, vnb vnbVar) {
        super(context, vnbVar);
        int i;
        TextPaint textPaint = new TextPaint();
        this.x = textPaint;
        this.y = new ux9(this, (byte) 9);
        textPaint.setTextSize(hl.L(20.0f));
        this.f.setVisibility(8);
        this.c.setVisibility(8);
        og2 og2Var = new og2(21, vnbVar, context);
        this.s = og2Var;
        og2Var.b(aob.B5, aob.j7, aob.C5);
        og2Var.setDrawUnchecked(true);
        og2Var.setDrawBackgroundAsArc(10);
        addView(og2Var);
        og2Var.a(false, false);
        if (ob6.a0) {
            i = 5;
        } else {
            i = 3;
        }
        og2Var.setLayoutParams(tre.d(24, 24.0f, i | 16, 13.0f, 0.0f, 14.0f, 0.0f));
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
        og2 og2Var = this.s;
        if (og2Var.getVisibility() == 0) {
            og2Var.a(z, z2);
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
        boolean z = ob6.a0;
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
        this.d.setLayoutParams(tre.d(-1, -2.0f, i4, f, 0.0f, f2, 0.0f));
        boolean z2 = ob6.a0;
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
        this.e.setLayoutParams(tre.d(-1, -2.0f, i5, f3, 0.0f, f4, 0.0f));
        boolean z3 = ob6.a0;
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
        this.f.setLayoutParams(tre.d(22, 22.0f, i6, f5, 0.0f, f6, 0.0f));
    }

    public final void f() {
        TLRPC.TL_help_country tL_help_country = this.w;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        CharSequence o = pv3.o(ob6.E0(tL_help_country.iso2), this.x.getFontMetricsInt(), 0, this.y);
        if (o != null) {
            spannableStringBuilder.append(o).append((CharSequence) " ");
            spannableStringBuilder.setSpan(new u2a(16), o.length(), o.length() + 1, 0);
        } else {
            spannableStringBuilder.append((CharSequence) " ");
            spannableStringBuilder.setSpan(new u2a(34), 0, 1, 0);
        }
        String i0 = ob6.i0(2131750481, tL_help_country.iso2);
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
