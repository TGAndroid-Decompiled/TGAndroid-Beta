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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.z5;
import w7.x5;
public final class n0 extends FrameLayout {
    public final wh.p f9832a;
    public final ImageView f9833b;
    public final TL_keyboard.KeyboardButton f9834c;
    public boolean d;
    public boolean f9835e;
    public boolean f9836f;
    public boolean h;
    public final p0 f9837n;

    public n0(p0 p0Var, Context context, TL_keyboard.KeyboardButton keyboardButton) {
        super(context);
        this.f9837n = p0Var;
        this.f9834c = keyboardButton;
        wh.p pVar = new wh.p(context);
        this.f9832a = pVar;
        pVar.f48669f = false;
        pVar.setTextSize(1, 14.0f);
        pVar.setTypeface(AndroidUtilities.bold());
        NotificationCenter.listenEmojiLoading(pVar);
        addView(pVar, x5.e(-2, -2, 17));
        NotificationCenter.listenEmojiLoading(pVar);
        setTag(keyboardButton);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        TL_keyboard.KeyboardButtonStyle keyboardButtonStyle = keyboardButton.style;
        if (keyboardButtonStyle != null && keyboardButtonStyle.icon != 0) {
            spannableStringBuilder.append((CharSequence) "* ");
            spannableStringBuilder.setSpan(new z5(keyboardButton.style.icon, pVar.getPaint().getFontMetricsInt()), 0, 1, 33);
        }
        spannableStringBuilder.append(Emoji.replaceEmoji(keyboardButton.text, pVar.getPaint().getFontMetricsInt(), false));
        ImageView imageView = new ImageView(getContext());
        this.f9833b = imageView;
        imageView.setColorFilter(j6.v0(j6.Xe, p0Var.f9869a));
        if (zf.c.b(keyboardButton)) {
            imageView.setImageResource(R.drawable.bot_webview);
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(8);
        }
        addView(imageView, x5.d(12, 12.0f, 53, 0.0f, 8.0f, 8.0f, 0.0f));
        pVar.setText(spannableStringBuilder);
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
        f6 f6Var = this.f9837n.f9869a;
        int v02 = j6.v0(i16, f6Var);
        int v03 = j6.v0(j6.Ze, f6Var);
        int v04 = j6.v0(j6.Xe, f6Var);
        TL_keyboard.KeyboardButtonStyle keyboardButtonStyle = this.f9834c.style;
        if (keyboardButtonStyle != null) {
            if (keyboardButtonStyle.bg_primary) {
                l1 = j6.l1(0.8f, j6.v0(j6.dl, f6Var));
                h = i0.a.h(j6.v0(j6.f20753i6, f6Var), l1);
            } else if (keyboardButtonStyle.bg_danger) {
                l1 = j6.l1(0.8f, j6.v0(j6.el, f6Var));
                h = i0.a.h(j6.v0(j6.f20753i6, f6Var), l1);
            } else if (keyboardButtonStyle.bg_success) {
                l1 = j6.l1(0.8f, j6.v0(j6.fl, f6Var));
                h = i0.a.h(j6.v0(j6.f20753i6, f6Var), l1);
            }
            i10 = l1;
            i11 = h;
            v04 = -1;
            this.f9833b.setColorFilter(v04);
            this.f9832a.setTextColor(v04);
            z10 = this.d;
            if (!z10 && this.f9835e) {
                i12 = dp;
            } else {
                i12 = dp2;
            }
            z11 = this.f9836f;
            if (!z11 && this.f9835e) {
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
        this.f9833b.setColorFilter(v04);
        this.f9832a.setTextColor(v04);
        z10 = this.d;
        if (!z10) {
        }
        i12 = dp2;
        z11 = this.f9836f;
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
