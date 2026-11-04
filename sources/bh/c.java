package bh;

import ai.s;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import b8.mf;
import org.telegram.messenger.bd;
import org.telegram.messenger.g0;
import org.telegram.messenger.i6;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.wo;
public final class c extends zg.c {
    public final wo f3303s;
    public TLRPC.TL_help_country f3304w;
    public final TextPaint f3305x;
    public final s f3306y;

    public c(Context context, e6 e6Var) {
        super(context, e6Var);
        int i3;
        TextPaint textPaint = new TextPaint();
        this.f3305x = textPaint;
        this.f3306y = new s(this, 16);
        textPaint.setTextSize(g0.L(20.0f));
        this.f60476f.setVisibility(8);
        this.f60474c.setVisibility(8);
        wo woVar = new wo(21, context, e6Var);
        this.f3303s = woVar;
        woVar.b(k6.B5, k6.f27990j7, k6.C5);
        woVar.setDrawUnchecked(true);
        woVar.setDrawBackgroundAsArc(10);
        addView(woVar);
        woVar.a(false, false);
        if (bd.f21784a0) {
            i3 = 5;
        } else {
            i3 = 3;
        }
        woVar.setLayoutParams(mf.d(24, 24.0f, i3 | 16, 13.0f, 0.0f, 14.0f, 0.0f));
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
        wo woVar = this.f3303s;
        if (woVar.getVisibility() == 0) {
            woVar.a(z10, z11);
        }
    }

    @Override
    public final void d() {
        int i3;
        float f10;
        float f11;
        int i10;
        float f12;
        float f13;
        float f14;
        float f15;
        boolean z10 = bd.f21784a0;
        int i11 = 3;
        if (z10) {
            i3 = 5;
        } else {
            i3 = 3;
        }
        int i12 = i3 | 16;
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
        this.d.setLayoutParams(mf.d(-1, -2.0f, i12, f10, 0.0f, f11, 0.0f));
        boolean z11 = bd.f21784a0;
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
        this.f60475e.setLayoutParams(mf.d(-1, -2.0f, i13, f12, 0.0f, f13, 0.0f));
        boolean z12 = bd.f21784a0;
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
        this.f60476f.setLayoutParams(mf.d(22, 22.0f, i14, f14, 0.0f, f15, 0.0f));
    }

    public final void f() {
        TLRPC.TL_help_country tL_help_country = this.f3304w;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        CharSequence o10 = i6.o(bd.F0(tL_help_country.iso2), this.f3305x.getFontMetricsInt(), 0, this.f3306y);
        if (o10 != null) {
            spannableStringBuilder.append(o10).append((CharSequence) " ");
            spannableStringBuilder.setSpan(new b(16), o10.length(), o10.length() + 1, 0);
        } else {
            spannableStringBuilder.append((CharSequence) " ");
            spannableStringBuilder.setSpan(new b(34), 0, 1, 0);
        }
        String i02 = bd.i0(2131750529, tL_help_country.iso2);
        if (TextUtils.isEmpty(i02)) {
            i02 = tL_help_country.default_name;
        }
        spannableStringBuilder.append((CharSequence) i02);
        this.d.k(spannableStringBuilder);
    }

    public TLRPC.TL_help_country getCountry() {
        return this.f3304w;
    }

    @Override
    public int getFullHeight() {
        return 44;
    }
}
