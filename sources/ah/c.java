package ah;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import c8.ha;
import org.telegram.messenger.g0;
import org.telegram.messenger.hd;
import org.telegram.messenger.i6;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.wo;
public final class c extends yg.c {
    public final wo f1061s;
    public TLRPC.TL_help_country f1062w;
    public final TextPaint f1063x;
    public final a3.f f1064y;

    public c(Context context, f6 f6Var) {
        super(context, f6Var);
        int i7;
        TextPaint textPaint = new TextPaint();
        this.f1063x = textPaint;
        this.f1064y = new a3.f(this, 3);
        textPaint.setTextSize(g0.L(20.0f));
        this.f59337f.setVisibility(8);
        this.f59335c.setVisibility(8);
        wo woVar = new wo(21, context, f6Var);
        this.f1061s = woVar;
        woVar.b(k6.B5, k6.f27959j7, k6.C5);
        woVar.setDrawUnchecked(true);
        woVar.setDrawBackgroundAsArc(10);
        addView(woVar);
        woVar.a(false, false);
        if (hd.f22878a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        woVar.setLayoutParams(ha.d(24, 24.0f, i7 | 16, 13.0f, 0.0f, 14.0f, 0.0f));
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
    public final void c(boolean z9, boolean z10) {
        wo woVar = this.f1061s;
        if (woVar.getVisibility() == 0) {
            woVar.a(z9, z10);
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
        boolean z9 = hd.f22878a0;
        int i11 = 3;
        if (z9) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        int i12 = i7 | 16;
        if (z9) {
            f10 = 20.0f;
        } else {
            f10 = 52.0f;
        }
        if (z9) {
            f11 = 52.0f;
        } else {
            f11 = 20.0f;
        }
        this.d.setLayoutParams(ha.d(-1, -2.0f, i12, f10, 0.0f, f11, 0.0f));
        boolean z10 = hd.f22878a0;
        if (z10) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        int i13 = i10 | 16;
        if (z10) {
            f12 = 20.0f;
        } else {
            f12 = 52.0f;
        }
        if (z10) {
            f13 = 52.0f;
        } else {
            f13 = 20.0f;
        }
        this.f59336e.setLayoutParams(ha.d(-1, -2.0f, i13, f12, 0.0f, f13, 0.0f));
        boolean z11 = hd.f22878a0;
        if (z11) {
            i11 = 5;
        }
        int i14 = i11 | 16;
        if (z11) {
            f14 = 15.0f;
        } else {
            f14 = 20.0f;
        }
        if (z11) {
            f15 = 20.0f;
        } else {
            f15 = 15.0f;
        }
        this.f59337f.setLayoutParams(ha.d(22, 22.0f, i14, f14, 0.0f, f15, 0.0f));
    }

    public final void f() {
        TLRPC.TL_help_country tL_help_country = this.f1062w;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        CharSequence o4 = i6.o(hd.F0(tL_help_country.iso2), this.f1063x.getFontMetricsInt(), 0, this.f1064y);
        if (o4 != null) {
            spannableStringBuilder.append(o4).append((CharSequence) " ");
            spannableStringBuilder.setSpan(new b(16), o4.length(), o4.length() + 1, 0);
        } else {
            spannableStringBuilder.append((CharSequence) " ");
            spannableStringBuilder.setSpan(new b(34), 0, 1, 0);
        }
        String i02 = hd.i0(2131750520, tL_help_country.iso2);
        if (TextUtils.isEmpty(i02)) {
            i02 = tL_help_country.default_name;
        }
        spannableStringBuilder.append((CharSequence) i02);
        this.d.k(spannableStringBuilder);
    }

    public TLRPC.TL_help_country getCountry() {
        return this.f1062w;
    }

    @Override
    public int getFullHeight() {
        return 44;
    }
}
