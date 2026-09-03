package lg;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import k7.c6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.np;
public final class c extends jg.d {
    public final np f12535r;
    public TLRPC.TL_help_country f12536s;
    public final TextPaint v;
    public final eh.m f12537w;

    public c(Context context, g6 g6Var) {
        super(context, g6Var);
        int i10;
        TextPaint textPaint = new TextPaint();
        this.v = textPaint;
        this.f12537w = new eh.m(this, 24);
        textPaint.setTextSize(AndroidUtilities.dp(20.0f));
        this.f10022f.setVisibility(8);
        this.f10020c.setVisibility(8);
        np npVar = new np(context, 21, g6Var);
        this.f12535r = npVar;
        npVar.b(k6.B5, k6.f21770j7, k6.C5);
        npVar.setDrawUnchecked(true);
        npVar.setDrawBackgroundAsArc(10);
        addView(npVar);
        npVar.a(false, false);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        npVar.setLayoutParams(c6.d(24, 24.0f, i10 | 16, 13.0f, 0.0f, 14.0f, 0.0f));
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
        np npVar = this.f12535r;
        if (npVar.getVisibility() == 0) {
            npVar.a(z4, z10);
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
        this.d.setLayoutParams(c6.d(-1, -2.0f, i13, f10, 0.0f, f11, 0.0f));
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
        this.f10021e.setLayoutParams(c6.d(-1, -2.0f, i14, f12, 0.0f, f13, 0.0f));
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
        this.f10022f.setLayoutParams(c6.d(22, 22.0f, i15, f14, 0.0f, f15, 0.0f));
    }

    public final void f() {
        TLRPC.TL_help_country tL_help_country = this.f12536s;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        CharSequence replaceWithRestrictedEmoji = Emoji.replaceWithRestrictedEmoji(LocaleController.getLanguageFlag(tL_help_country.iso2), this.v.getFontMetricsInt(), 0, this.f12537w);
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
        return this.f12536s;
    }

    @Override
    public int getFullHeight() {
        return 44;
    }
}
