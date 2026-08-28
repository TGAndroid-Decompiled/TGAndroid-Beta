package mh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.widget.FrameLayout;
import android.widget.ImageView;
import g7.e6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.t5;
public final class m0 extends FrameLayout {
    public final dh.u f17977a;
    public final ImageView f17978b;
    public final TL_keyboard.KeyboardButton f17979c;
    public boolean d;
    public boolean f17980e;
    public boolean f17981f;
    public boolean h;
    public final o0 f17982n;

    public m0(o0 o0Var, Context context, TL_keyboard.KeyboardButton keyboardButton) {
        super(context);
        this.f17982n = o0Var;
        this.f17979c = keyboardButton;
        dh.u uVar = new dh.u(context);
        this.f17977a = uVar;
        uVar.f4671f = false;
        uVar.setTextSize(1, 14.0f);
        uVar.setTypeface(AndroidUtilities.bold());
        NotificationCenter.listenEmojiLoading(uVar);
        addView(uVar, e6.e(-2, -2, 17));
        NotificationCenter.listenEmojiLoading(uVar);
        setTag(keyboardButton);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        TL_keyboard.KeyboardButtonStyle keyboardButtonStyle = keyboardButton.style;
        if (keyboardButtonStyle != null && keyboardButtonStyle.icon != 0) {
            spannableStringBuilder.append((CharSequence) "* ");
            spannableStringBuilder.setSpan(new t5(keyboardButton.style.icon, uVar.getPaint().getFontMetricsInt()), 0, 1, 33);
        }
        spannableStringBuilder.append(Emoji.replaceEmoji(keyboardButton.text, uVar.getPaint().getFontMetricsInt(), false));
        ImageView imageView = new ImageView(getContext());
        this.f17978b = imageView;
        imageView.setColorFilter(f6.v0(f6.Xe, o0Var.f18002a));
        if (gf.c.b(keyboardButton)) {
            imageView.setImageResource(R.drawable.bot_webview);
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(8);
        }
        addView(imageView, e6.d(12, 12.0f, 53, 0.0f, 8.0f, 8.0f, 0.0f));
        uVar.setText(spannableStringBuilder);
    }

    public final void a() {
        int i9;
        int i10;
        boolean z10;
        int i11;
        boolean z11;
        int i12;
        int i13;
        int i14;
        int l1;
        int h;
        int dp = AndroidUtilities.dp(21.0f);
        int dp2 = AndroidUtilities.dp(11.0f);
        int i15 = f6.Ye;
        b6 b6Var = this.f17982n.f18002a;
        int v02 = f6.v0(i15, b6Var);
        int v03 = f6.v0(f6.Ze, b6Var);
        int v04 = f6.v0(f6.Xe, b6Var);
        TL_keyboard.KeyboardButtonStyle keyboardButtonStyle = this.f17979c.style;
        if (keyboardButtonStyle != null) {
            if (keyboardButtonStyle.bg_primary) {
                l1 = f6.l1(0.8f, f6.v0(f6.dl, b6Var));
                h = i0.a.h(f6.v0(f6.f23092i6, b6Var), l1);
            } else if (keyboardButtonStyle.bg_danger) {
                l1 = f6.l1(0.8f, f6.v0(f6.el, b6Var));
                h = i0.a.h(f6.v0(f6.f23092i6, b6Var), l1);
            } else if (keyboardButtonStyle.bg_success) {
                l1 = f6.l1(0.8f, f6.v0(f6.fl, b6Var));
                h = i0.a.h(f6.v0(f6.f23092i6, b6Var), l1);
            }
            i9 = l1;
            i10 = h;
            v04 = -1;
            this.f17978b.setColorFilter(v04);
            this.f17977a.setTextColor(v04);
            z10 = this.d;
            if (!z10 && this.f17980e) {
                i11 = dp;
            } else {
                i11 = dp2;
            }
            z11 = this.f17981f;
            if (!z11 && this.f17980e) {
                i12 = dp;
            } else {
                i12 = dp2;
            }
            if (!z11 && this.h) {
                i13 = dp;
            } else {
                i13 = dp2;
            }
            if (!z10 && this.h) {
                i14 = dp;
            } else {
                i14 = dp2;
            }
            setBackground(f6.i0(i11, i12, i13, i14, i9, i10, i10));
        }
        i9 = v02;
        i10 = v03;
        this.f17978b.setColorFilter(v04);
        this.f17977a.setTextColor(v04);
        z10 = this.d;
        if (!z10) {
        }
        i11 = dp2;
        z11 = this.f17981f;
        if (!z11) {
        }
        i12 = dp2;
        if (!z11) {
        }
        i13 = dp2;
        if (!z10) {
        }
        i14 = dp2;
        setBackground(f6.i0(i11, i12, i13, i14, i9, i10, i10));
    }
}
