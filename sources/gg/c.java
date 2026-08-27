package gg;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import f2.r;
import h7.z5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.bp;

public final class c extends eg.d {

    public final bp f7078r;

    public TLRPC.TL_help_country f7079s;
    public final TextPaint v;

    public final r f7080w;

    public c(Context context, c6 c6Var) {
        super(context, c6Var);
        TextPaint textPaint = new TextPaint();
        this.v = textPaint;
        this.f7080w = new r(this, 4);
        textPaint.setTextSize(AndroidUtilities.dp(20.0f));
        this.f5396f.setVisibility(8);
        this.f5394c.setVisibility(8);
        bp bpVar = new bp(context, 21, c6Var);
        this.f7078r = bpVar;
        bpVar.b(g6.B5, g6.f23163j7, g6.C5);
        bpVar.setDrawUnchecked(true);
        bpVar.setDrawBackgroundAsArc(10);
        addView(bpVar);
        bpVar.a(false, false);
        bpVar.setLayoutParams(z5.d(24, 24.0f, (LocaleController.isRTL ? 5 : 3) | 16, 13.0f, 0.0f, 14.0f, 0.0f));
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
        bp bpVar = this.f7078r;
        if (bpVar.getVisibility() == 0) {
            bpVar.a(z10, z11);
        }
    }

    @Override
    public final void d() {
        boolean z10 = LocaleController.isRTL;
        this.d.setLayoutParams(z5.d(-1, -2.0f, (z10 ? 5 : 3) | 16, z10 ? 20.0f : 52.0f, 0.0f, z10 ? 52.0f : 20.0f, 0.0f));
        boolean z11 = LocaleController.isRTL;
        this.f5395e.setLayoutParams(z5.d(-1, -2.0f, (z11 ? 5 : 3) | 16, z11 ? 20.0f : 52.0f, 0.0f, z11 ? 52.0f : 20.0f, 0.0f));
        boolean z12 = LocaleController.isRTL;
        this.f5396f.setLayoutParams(z5.d(22, 22.0f, (z12 ? 5 : 3) | 16, z12 ? 15.0f : 20.0f, 0.0f, z12 ? 20.0f : 15.0f, 0.0f));
    }

    public final void f() {
        TLRPC.TL_help_country tL_help_country = this.f7079s;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        CharSequence charSequenceReplaceWithRestrictedEmoji = Emoji.replaceWithRestrictedEmoji(LocaleController.getLanguageFlag(tL_help_country.iso2), this.v.getFontMetricsInt(), 0, this.f7080w);
        if (charSequenceReplaceWithRestrictedEmoji != null) {
            spannableStringBuilder.append(charSequenceReplaceWithRestrictedEmoji).append((CharSequence) " ");
            spannableStringBuilder.setSpan(new b(16), charSequenceReplaceWithRestrictedEmoji.length(), charSequenceReplaceWithRestrictedEmoji.length() + 1, 0);
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
        return this.f7079s;
    }

    @Override
    public int getFullHeight() {
        return 44;
    }
}
