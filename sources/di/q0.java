package di;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.y5;
import w7.a6;
public final class q0 extends FrameLayout {
    public final uh.o f6853a;
    public final ImageView f6854b;
    public final TL_keyboard.KeyboardButton f6855c;
    public boolean d;
    public boolean e;
    public boolean f6856f;
    public boolean h;
    public final s0 f6857n;

    public q0(s0 s0Var, Context context, TL_keyboard.KeyboardButton keyboardButton) {
        super(context);
        this.f6857n = s0Var;
        this.f6855c = keyboardButton;
        uh.o oVar = new uh.o(context);
        this.f6853a = oVar;
        oVar.f42822f = false;
        oVar.setTextSize(1, 14.0f);
        oVar.setTypeface(AndroidUtilities.bold());
        NotificationCenter.listenEmojiLoading(oVar);
        addView(oVar, a6.e(-2, -2, 17));
        NotificationCenter.listenEmojiLoading(oVar);
        setTag(keyboardButton);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        TL_keyboard.KeyboardButtonStyle keyboardButtonStyle = keyboardButton.style;
        if (keyboardButtonStyle != null && keyboardButtonStyle.icon != 0) {
            spannableStringBuilder.append((CharSequence) "* ");
            spannableStringBuilder.setSpan(new y5(keyboardButton.style.icon, oVar.getPaint().getFontMetricsInt()), 0, 1, 33);
        }
        spannableStringBuilder.append(Emoji.replaceEmoji(keyboardButton.text, oVar.getPaint().getFontMetricsInt(), false));
        ImageView imageView = new ImageView(getContext());
        this.f6854b = imageView;
        imageView.setColorFilter(j6.v0(j6.Xe, s0Var.f6883a));
        if (yf.c.b(keyboardButton)) {
            imageView.setImageResource(R.drawable.bot_webview);
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(8);
        }
        addView(imageView, a6.d(12, 12.0f, 53, 0.0f, 8.0f, 8.0f, 0.0f));
        oVar.setText(spannableStringBuilder);
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
        int l1;
        int h;
        int dp = AndroidUtilities.dp(21.0f);
        int dp2 = AndroidUtilities.dp(11.0f);
        int i16 = j6.Ye;
        f6 f6Var = this.f6857n.f6883a;
        int v02 = j6.v0(i16, f6Var);
        int v03 = j6.v0(j6.Ze, f6Var);
        int v04 = j6.v0(j6.Xe, f6Var);
        TL_keyboard.KeyboardButtonStyle keyboardButtonStyle = this.f6855c.style;
        if (keyboardButtonStyle != null) {
            if (keyboardButtonStyle.bg_primary) {
                l1 = j6.l1(0.8f, j6.v0(j6.dl, f6Var));
                h = i0.a.h(j6.v0(j6.f18017i6, f6Var), l1);
            } else if (keyboardButtonStyle.bg_danger) {
                l1 = j6.l1(0.8f, j6.v0(j6.el, f6Var));
                h = i0.a.h(j6.v0(j6.f18017i6, f6Var), l1);
            } else if (keyboardButtonStyle.bg_success) {
                l1 = j6.l1(0.8f, j6.v0(j6.fl, f6Var));
                h = i0.a.h(j6.v0(j6.f18017i6, f6Var), l1);
            }
            i10 = l1;
            i11 = h;
            v04 = -1;
            this.f6854b.setColorFilter(v04);
            this.f6853a.setTextColor(v04);
            z10 = this.d;
            if (!z10 && this.e) {
                i12 = dp;
            } else {
                i12 = dp2;
            }
            z11 = this.f6856f;
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
            setBackground(j6.i0(i12, i13, i14, i15, i10, i11, i11));
        }
        i10 = v02;
        i11 = v03;
        this.f6854b.setColorFilter(v04);
        this.f6853a.setTextColor(v04);
        z10 = this.d;
        if (!z10) {
        }
        i12 = dp2;
        z11 = this.f6856f;
        if (!z11) {
        }
        i13 = dp2;
        if (!z11) {
        }
        i14 = dp2;
        if (!z10) {
        }
        i15 = dp2;
        setBackground(j6.i0(i12, i13, i14, i15, i10, i11, i11));
    }
}
