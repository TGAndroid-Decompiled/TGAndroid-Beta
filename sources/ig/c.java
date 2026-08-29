package ig;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import cg.m2;
import i7.f6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.hp;
public final class c extends gg.d {
    public final hp f8968r;
    public TLRPC.TL_help_country f8969s;
    public final TextPaint v;
    public final m2 f8970w;

    public c(Context context, c6 c6Var) {
        super(context, c6Var);
        int i10;
        TextPaint textPaint = new TextPaint();
        this.v = textPaint;
        this.f8970w = new m2(this, 17);
        textPaint.setTextSize(AndroidUtilities.dp(20.0f));
        this.f7292f.setVisibility(8);
        this.f7290c.setVisibility(8);
        hp hpVar = new hp(context, 21, c6Var);
        this.f8968r = hpVar;
        hpVar.b(g6.B5, g6.f23171j7, g6.C5);
        hpVar.setDrawUnchecked(true);
        hpVar.setDrawBackgroundAsArc(10);
        addView(hpVar);
        hpVar.a(false, false);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        hpVar.setLayoutParams(f6.d(24, 24.0f, i10 | 16, 13.0f, 0.0f, 14.0f, 0.0f));
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
        hp hpVar = this.f8968r;
        if (hpVar.getVisibility() == 0) {
            hpVar.a(z10, z11);
        }
    }

    @Override
    public final void d() {
        int i10;
        float f9;
        float f10;
        int i11;
        float f11;
        float f12;
        float f13;
        float f14;
        boolean z10 = LocaleController.isRTL;
        int i12 = 3;
        if (z10) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        int i13 = i10 | 16;
        if (z10) {
            f9 = 20.0f;
        } else {
            f9 = 52.0f;
        }
        if (z10) {
            f10 = 52.0f;
        } else {
            f10 = 20.0f;
        }
        this.d.setLayoutParams(f6.d(-1, -2.0f, i13, f9, 0.0f, f10, 0.0f));
        boolean z11 = LocaleController.isRTL;
        if (z11) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        int i14 = i11 | 16;
        if (z11) {
            f11 = 20.0f;
        } else {
            f11 = 52.0f;
        }
        if (z11) {
            f12 = 52.0f;
        } else {
            f12 = 20.0f;
        }
        this.f7291e.setLayoutParams(f6.d(-1, -2.0f, i14, f11, 0.0f, f12, 0.0f));
        boolean z12 = LocaleController.isRTL;
        if (z12) {
            i12 = 5;
        }
        int i15 = i12 | 16;
        if (z12) {
            f13 = 15.0f;
        } else {
            f13 = 20.0f;
        }
        if (z12) {
            f14 = 20.0f;
        } else {
            f14 = 15.0f;
        }
        this.f7292f.setLayoutParams(f6.d(22, 22.0f, i15, f13, 0.0f, f14, 0.0f));
    }

    public final void f() {
        TLRPC.TL_help_country tL_help_country = this.f8969s;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        CharSequence replaceWithRestrictedEmoji = Emoji.replaceWithRestrictedEmoji(LocaleController.getLanguageFlag(tL_help_country.iso2), this.v.getFontMetricsInt(), 0, this.f8970w);
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
        return this.f8969s;
    }

    @Override
    public int getFullHeight() {
        return 44;
    }
}
