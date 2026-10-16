package fi;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.b6;
import w7.z5;
public final class m0 extends FrameLayout {
    public final wh.n f9408a;
    public final ImageView f9409b;
    public final TL_keyboard.KeyboardButton f9410c;
    public boolean d;
    public boolean e;
    public boolean f9411f;
    public boolean h;
    public final o0 f9412n;

    public m0(o0 o0Var, Context context, TL_keyboard.KeyboardButton keyboardButton) {
        super(context);
        this.f9412n = o0Var;
        this.f9410c = keyboardButton;
        wh.n nVar = new wh.n(context);
        this.f9408a = nVar;
        nVar.f47712r = false;
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
            spannableStringBuilder.setSpan(new b6(keyboardButton.style.icon, nVar.getPaint().getFontMetricsInt()), 0, 1, 33);
        }
        spannableStringBuilder.append(Emoji.replaceEmoji(keyboardButton.text, nVar.getPaint().getFontMetricsInt(), false));
        ImageView imageView = new ImageView(getContext());
        this.f9409b = imageView;
        imageView.setColorFilter(g6.w0(g6.Xe, o0Var.f9439a));
        if (ag.c.b(keyboardButton)) {
            imageView.setImageResource(R.drawable.bot_webview);
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(8);
        }
        addView(imageView, z5.a(12.0f, 0.0f, 8.0f, 8.0f, 0.0f, 12, 53));
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
        int h;
        int dp = AndroidUtilities.dp(21.0f);
        int dp2 = AndroidUtilities.dp(11.0f);
        int i16 = g6.Ye;
        c6 c6Var = this.f9412n.f9439a;
        int w02 = g6.w0(i16, c6Var);
        int w03 = g6.w0(g6.Ze, c6Var);
        int w04 = g6.w0(g6.Xe, c6Var);
        TL_keyboard.KeyboardButtonStyle keyboardButtonStyle = this.f9410c.style;
        if (keyboardButtonStyle != null) {
            if (keyboardButtonStyle.bg_primary) {
                m12 = g6.m1(0.8f, g6.w0(g6.dl, c6Var));
                h = i0.a.h(g6.w0(g6.f19690i6, c6Var), m12);
            } else if (keyboardButtonStyle.bg_danger) {
                m12 = g6.m1(0.8f, g6.w0(g6.el, c6Var));
                h = i0.a.h(g6.w0(g6.f19690i6, c6Var), m12);
            } else if (keyboardButtonStyle.bg_success) {
                m12 = g6.m1(0.8f, g6.w0(g6.fl, c6Var));
                h = i0.a.h(g6.w0(g6.f19690i6, c6Var), m12);
            }
            i10 = m12;
            i11 = h;
            w04 = -1;
            this.f9409b.setColorFilter(w04);
            this.f9408a.setTextColor(w04);
            z10 = this.d;
            if (!z10 && this.e) {
                i12 = dp;
            } else {
                i12 = dp2;
            }
            z11 = this.f9411f;
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
            setBackground(g6.j0(i12, i13, i14, i15, i10, i11, i11));
        }
        i10 = w02;
        i11 = w03;
        this.f9409b.setColorFilter(w04);
        this.f9408a.setTextColor(w04);
        z10 = this.d;
        if (!z10) {
        }
        i12 = dp2;
        z11 = this.f9411f;
        if (!z11) {
        }
        i13 = dp2;
        if (!z11) {
        }
        i14 = dp2;
        if (!z10) {
        }
        i15 = dp2;
        setBackground(g6.j0(i12, i13, i14, i15, i10, i11, i11));
    }
}
