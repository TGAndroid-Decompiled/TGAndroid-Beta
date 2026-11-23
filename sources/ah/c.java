package ah;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import c8.ma;
import org.telegram.messenger.g0;
import org.telegram.messenger.hd;
import org.telegram.messenger.j6;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.op;
public final class c extends yg.c {
    public final op f1058s;
    public TLRPC.TL_help_country f1059w;
    public final TextPaint f1060x;
    public final a3.f f1061y;

    public c(Context context, h6 h6Var) {
        super(context, h6Var);
        int i7;
        TextPaint textPaint = new TextPaint();
        this.f1060x = textPaint;
        this.f1061y = new a3.f(this, 3);
        textPaint.setTextSize(g0.L(20.0f));
        this.f61260f.setVisibility(8);
        this.f61258c.setVisibility(8);
        op opVar = new op(21, context, h6Var);
        this.f1058s = opVar;
        opVar.b(m6.B5, m6.f29491j7, m6.C5);
        opVar.setDrawUnchecked(true);
        opVar.setDrawBackgroundAsArc(10);
        addView(opVar);
        opVar.a(false, false);
        if (hd.f24444a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        opVar.setLayoutParams(ma.d(24, 24.0f, i7 | 16, 13.0f, 0.0f, 14.0f, 0.0f));
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
    public final void c(boolean z10, boolean z11) {
        op opVar = this.f1058s;
        if (opVar.getVisibility() == 0) {
            opVar.a(z10, z11);
        }
    }

    @Override
    public final void d() {
        int i7;
        float f10;
        float f11;
        int i10;
        float f12;
        float f13;
        float f14;
        float f15;
        boolean z10 = hd.f24444a0;
        int i11 = 3;
        if (z10) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        int i12 = i7 | 16;
        if (z10) {
            f10 = 20.0f;
        } else {
            f10 = 52.0f;
        }
        if (z10) {
            f11 = 52.0f;
        } else {
            f11 = 20.0f;
        }
        this.d.setLayoutParams(ma.d(-1, -2.0f, i12, f10, 0.0f, f11, 0.0f));
        boolean z11 = hd.f24444a0;
        if (z11) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        int i13 = i10 | 16;
        if (z11) {
            f12 = 20.0f;
        } else {
            f12 = 52.0f;
        }
        if (z11) {
            f13 = 52.0f;
        } else {
            f13 = 20.0f;
        }
        this.f61259e.setLayoutParams(ma.d(-1, -2.0f, i13, f12, 0.0f, f13, 0.0f));
        boolean z12 = hd.f24444a0;
        if (z12) {
            i11 = 5;
        }
        int i14 = i11 | 16;
        if (z12) {
            f14 = 15.0f;
        } else {
            f14 = 20.0f;
        }
        if (z12) {
            f15 = 20.0f;
        } else {
            f15 = 15.0f;
        }
        this.f61260f.setLayoutParams(ma.d(22, 22.0f, i14, f14, 0.0f, f15, 0.0f));
    }

    public final void f() {
        TLRPC.TL_help_country tL_help_country = this.f1059w;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        CharSequence o4 = j6.o(hd.F0(tL_help_country.iso2), this.f1060x.getFontMetricsInt(), 0, this.f1061y);
        if (o4 != null) {
            spannableStringBuilder.append(o4).append((CharSequence) " ");
            spannableStringBuilder.setSpan(new b(16), o4.length(), o4.length() + 1, 0);
        } else {
            spannableStringBuilder.append((CharSequence) " ");
            spannableStringBuilder.setSpan(new b(34), 0, 1, 0);
        }
        String i02 = hd.i0(2131750504, tL_help_country.iso2);
        if (TextUtils.isEmpty(i02)) {
            i02 = tL_help_country.default_name;
        }
        spannableStringBuilder.append((CharSequence) i02);
        this.d.k(spannableStringBuilder);
    }

    public TLRPC.TL_help_country getCountry() {
        return this.f1059w;
    }

    @Override
    public int getFullHeight() {
        return 44;
    }
}
