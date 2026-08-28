package fg;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import g7.e6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.dp;
public final class c extends dg.d {
    public final dp f6278r;
    public TLRPC.TL_help_country f6279s;
    public final TextPaint v;
    public final af.e f6280w;

    public c(Context context, b6 b6Var) {
        super(context, b6Var);
        int i9;
        TextPaint textPaint = new TextPaint();
        this.v = textPaint;
        this.f6280w = new af.e(this, 27);
        textPaint.setTextSize(AndroidUtilities.dp(20.0f));
        this.f4502f.setVisibility(8);
        this.f4500c.setVisibility(8);
        dp dpVar = new dp(context, 21, b6Var);
        this.f6278r = dpVar;
        dpVar.b(f6.B5, f6.f23110j7, f6.C5);
        dpVar.setDrawUnchecked(true);
        dpVar.setDrawBackgroundAsArc(10);
        addView(dpVar);
        dpVar.a(false, false);
        if (LocaleController.isRTL) {
            i9 = 5;
        } else {
            i9 = 3;
        }
        dpVar.setLayoutParams(e6.d(24, 24.0f, i9 | 16, 13.0f, 0.0f, 14.0f, 0.0f));
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
        dp dpVar = this.f6278r;
        if (dpVar.getVisibility() == 0) {
            dpVar.a(z10, z11);
        }
    }

    @Override
    public final void d() {
        int i9;
        float f10;
        float f11;
        int i10;
        float f12;
        float f13;
        float f14;
        float f15;
        boolean z10 = LocaleController.isRTL;
        int i11 = 3;
        if (z10) {
            i9 = 5;
        } else {
            i9 = 3;
        }
        int i12 = i9 | 16;
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
        this.d.setLayoutParams(e6.d(-1, -2.0f, i12, f10, 0.0f, f11, 0.0f));
        boolean z11 = LocaleController.isRTL;
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
        this.f4501e.setLayoutParams(e6.d(-1, -2.0f, i13, f12, 0.0f, f13, 0.0f));
        boolean z12 = LocaleController.isRTL;
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
        this.f4502f.setLayoutParams(e6.d(22, 22.0f, i14, f14, 0.0f, f15, 0.0f));
    }

    public final void f() {
        TLRPC.TL_help_country tL_help_country = this.f6279s;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        CharSequence replaceWithRestrictedEmoji = Emoji.replaceWithRestrictedEmoji(LocaleController.getLanguageFlag(tL_help_country.iso2), this.v.getFontMetricsInt(), 0, this.f6280w);
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
        return this.f6279s;
    }

    @Override
    public int getFullHeight() {
        return 44;
    }
}
