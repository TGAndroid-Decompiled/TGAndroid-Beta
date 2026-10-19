package gi;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.a6;
import w7.z5;
public final class l0 extends FrameLayout {
    public final wh.n f11311a;
    public final ImageView f11312b;
    public final TL_keyboard.KeyboardButton f11313c;
    public boolean d;
    public boolean e;
    public boolean f11314f;
    public boolean h;
    public final n0 f11315n;

    public l0(n0 n0Var, Context context, TL_keyboard.KeyboardButton keyboardButton) {
        super(context);
        this.f11315n = n0Var;
        this.f11313c = keyboardButton;
        wh.n nVar = new wh.n(context);
        this.f11311a = nVar;
        nVar.f49098r = false;
        nVar.setTextSize(1, 14.0f);
        nVar.setTypeface(AndroidUtilities.bold());
        NotificationCenter.listenEmojiLoading(nVar);
        addView(nVar, z5.e(-2, -2, 17));
        NotificationCenter.listenEmojiLoading(nVar);
        setTag(keyboardButton);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        TL_keyboard.KeyboardButtonStyle keyboardButtonStyle = keyboardButton.style;
        if (keyboardButtonStyle != null && keyboardButtonStyle.icon != 0) {
            spannableStringBuilder.append((CharSequence) "* ");
            spannableStringBuilder.setSpan(new a6(keyboardButton.style.icon, nVar.getPaint().getFontMetricsInt()), 0, 1, 33);
        }
        spannableStringBuilder.append(Emoji.replaceEmoji(keyboardButton.text, nVar.getPaint().getFontMetricsInt(), false));
        ImageView imageView = new ImageView(getContext());
        this.f11312b = imageView;
        imageView.setColorFilter(h6.w0(h6.Xe, n0Var.f11348a));
        if (ag.c.b(keyboardButton)) {
            imageView.setImageResource(R.drawable.bot_webview);
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(8);
        }
        addView(imageView, z5.d(12, 12.0f, 53, 0.0f, 8.0f, 8.0f, 0.0f));
        nVar.setText(spannableStringBuilder);
    }

    public final void a() {
        int i10;
        int i11;
        boolean z10;
        int i12;
        boolean z11;
        int i13;
        int i14;
        int i15;
        int m12;
        int k10;
        int dp = AndroidUtilities.dp(21.0f);
        int dp2 = AndroidUtilities.dp(11.0f);
        int i16 = h6.Ye;
        d6 d6Var = this.f11315n.f11348a;
        int w02 = h6.w0(i16, d6Var);
        int w03 = h6.w0(h6.Ze, d6Var);
        int w04 = h6.w0(h6.Xe, d6Var);
        TL_keyboard.KeyboardButtonStyle keyboardButtonStyle = this.f11313c.style;
        if (keyboardButtonStyle != null) {
            if (keyboardButtonStyle.bg_primary) {
                m12 = h6.m1(0.8f, h6.w0(h6.dl, d6Var));
                k10 = i0.a.k(h6.w0(h6.f21078i6, d6Var), m12);
            } else if (keyboardButtonStyle.bg_danger) {
                m12 = h6.m1(0.8f, h6.w0(h6.el, d6Var));
                k10 = i0.a.k(h6.w0(h6.f21078i6, d6Var), m12);
            } else if (keyboardButtonStyle.bg_success) {
                m12 = h6.m1(0.8f, h6.w0(h6.fl, d6Var));
                k10 = i0.a.k(h6.w0(h6.f21078i6, d6Var), m12);
            }
            i10 = m12;
            i11 = k10;
            w04 = -1;
            this.f11312b.setColorFilter(w04);
            this.f11311a.setTextColor(w04);
            z10 = this.d;
            if (!z10 && this.e) {
                i12 = dp;
            } else {
                i12 = dp2;
            }
            z11 = this.f11314f;
            if (!z11 && this.e) {
                i13 = dp;
            } else {
                i13 = dp2;
            }
            if (!z11 && this.h) {
                i14 = dp;
            } else {
                i14 = dp2;
            }
            if (!z10 && this.h) {
                i15 = dp;
            } else {
                i15 = dp2;
            }
            setBackground(h6.j0(i12, i13, i14, i15, i10, i11, i11));
        }
        i10 = w02;
        i11 = w03;
        this.f11312b.setColorFilter(w04);
        this.f11311a.setTextColor(w04);
        z10 = this.d;
        if (!z10) {
        }
        i12 = dp2;
        z11 = this.f11314f;
        if (!z11) {
        }
        i13 = dp2;
        if (!z11) {
        }
        i14 = dp2;
        if (!z10) {
        }
        i15 = dp2;
        setBackground(h6.j0(i12, i13, i14, i15, i10, i11, i11));
    }
}
