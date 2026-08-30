package kg;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import k7.b6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.lp;
public final class c extends ig.d {
    public final lp f10412r;
    public TLRPC.TL_help_country f10413s;
    public final TextPaint v;
    public final ef.e f10414w;

    public c(Context context, f6 f6Var) {
        super(context, f6Var);
        int i10;
        TextPaint textPaint = new TextPaint();
        this.v = textPaint;
        this.f10414w = new ef.e(this, 21);
        textPaint.setTextSize(AndroidUtilities.dp(20.0f));
        this.f7502f.setVisibility(8);
        this.f7501c.setVisibility(8);
        lp lpVar = new lp(context, 21, f6Var);
        this.f10412r = lpVar;
        lpVar.b(j6.B5, j6.f20014j7, j6.C5);
        lpVar.setDrawUnchecked(true);
        lpVar.setDrawBackgroundAsArc(10);
        addView(lpVar);
        lpVar.a(false, false);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        lpVar.setLayoutParams(b6.d(24, 24.0f, i10 | 16, 13.0f, 0.0f, 14.0f, 0.0f));
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
    public final void c(boolean z4, boolean z10) {
        lp lpVar = this.f10412r;
        if (lpVar.getVisibility() == 0) {
            lpVar.a(z4, z10);
        }
    }

    @Override
    public final void d() {
        int i10;
        float f10;
        float f11;
        int i11;
        float f12;
        float f13;
        float f14;
        float f15;
        boolean z4 = LocaleController.isRTL;
        int i12 = 3;
        if (z4) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        int i13 = i10 | 16;
        if (z4) {
            f10 = 20.0f;
        } else {
            f10 = 52.0f;
        }
        if (z4) {
            f11 = 52.0f;
        } else {
            f11 = 20.0f;
        }
        this.d.setLayoutParams(b6.d(-1, -2.0f, i13, f10, 0.0f, f11, 0.0f));
        boolean z10 = LocaleController.isRTL;
        if (z10) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        int i14 = i11 | 16;
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
        this.e.setLayoutParams(b6.d(-1, -2.0f, i14, f12, 0.0f, f13, 0.0f));
        boolean z11 = LocaleController.isRTL;
        if (z11) {
            i12 = 5;
        }
        int i15 = i12 | 16;
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
        this.f7502f.setLayoutParams(b6.d(22, 22.0f, i15, f14, 0.0f, f15, 0.0f));
    }

    public final void f() {
        TLRPC.TL_help_country tL_help_country = this.f10413s;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        CharSequence replaceWithRestrictedEmoji = Emoji.replaceWithRestrictedEmoji(LocaleController.getLanguageFlag(tL_help_country.iso2), this.v.getFontMetricsInt(), 0, this.f10414w);
        if (replaceWithRestrictedEmoji != null) {
            spannableStringBuilder.append(replaceWithRestrictedEmoji).append((CharSequence) " ");
            spannableStringBuilder.setSpan(new b(16), replaceWithRestrictedEmoji.length(), replaceWithRestrictedEmoji.length() + 1, 0);
        } else {
            spannableStringBuilder.append((CharSequence) " ");
            spannableStringBuilder.setSpan(new b(34), 0, 1, 0);
        }
        String countryName = LocaleController.getCountryName(tL_help_country.iso2);
        if (TextUtils.isEmpty(countryName)) {
            countryName = tL_help_country.default_name;
        }
        spannableStringBuilder.append((CharSequence) countryName);
        this.d.k(spannableStringBuilder);
    }

    public TLRPC.TL_help_country getCountry() {
        return this.f10413s;
    }

    @Override
    public int getFullHeight() {
        return 44;
    }
}
