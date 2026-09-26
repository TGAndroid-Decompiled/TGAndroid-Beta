package ei;

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
import org.telegram.ui.Components.z5;
import w7.y5;
public final class n0 extends FrameLayout {
    public final vh.n f8482a;
    public final ImageView f8483b;
    public final TL_keyboard.KeyboardButton f8484c;
    public boolean d;
    public boolean e;
    public boolean f8485f;
    public boolean h;
    public final p0 f8486n;

    public n0(p0 p0Var, Context context, TL_keyboard.KeyboardButton keyboardButton) {
        super(context);
        this.f8486n = p0Var;
        this.f8484c = keyboardButton;
        vh.n nVar = new vh.n(context);
        this.f8482a = nVar;
        nVar.f44734f = false;
        nVar.setTextSize(1, 14.0f);
        nVar.setTypeface(AndroidUtilities.bold());
        NotificationCenter.listenEmojiLoading(nVar);
        addView(nVar, y5.e(-2, -2, 17));
        NotificationCenter.listenEmojiLoading(nVar);
        setTag(keyboardButton);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        TL_keyboard.KeyboardButtonStyle keyboardButtonStyle = keyboardButton.style;
        if (keyboardButtonStyle != null && keyboardButtonStyle.icon != 0) {
            spannableStringBuilder.append((CharSequence) "* ");
            spannableStringBuilder.setSpan(new z5(keyboardButton.style.icon, nVar.getPaint().getFontMetricsInt()), 0, 1, 33);
        }
        spannableStringBuilder.append(Emoji.replaceEmoji(keyboardButton.text, nVar.getPaint().getFontMetricsInt(), false));
        ImageView imageView = new ImageView(getContext());
        this.f8483b = imageView;
        imageView.setColorFilter(h6.v0(h6.Xe, p0Var.f8509a));
        if (zf.c.b(keyboardButton)) {
            imageView.setImageResource(R.drawable.bot_webview);
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(8);
        }
        addView(imageView, y5.d(12, 12.0f, 53, 0.0f, 8.0f, 8.0f, 0.0f));
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
        int l1;
        int h;
        int dp = AndroidUtilities.dp(21.0f);
        int dp2 = AndroidUtilities.dp(11.0f);
        int i16 = h6.Ye;
        d6 d6Var = this.f8486n.f8509a;
        int v02 = h6.v0(i16, d6Var);
        int v03 = h6.v0(h6.Ze, d6Var);
        int v04 = h6.v0(h6.Xe, d6Var);
        TL_keyboard.KeyboardButtonStyle keyboardButtonStyle = this.f8484c.style;
        if (keyboardButtonStyle != null) {
            if (keyboardButtonStyle.bg_primary) {
                l1 = h6.l1(0.8f, h6.v0(h6.dl, d6Var));
                h = i0.a.h(h6.v0(h6.f19148i6, d6Var), l1);
            } else if (keyboardButtonStyle.bg_danger) {
                l1 = h6.l1(0.8f, h6.v0(h6.el, d6Var));
                h = i0.a.h(h6.v0(h6.f19148i6, d6Var), l1);
            } else if (keyboardButtonStyle.bg_success) {
                l1 = h6.l1(0.8f, h6.v0(h6.fl, d6Var));
                h = i0.a.h(h6.v0(h6.f19148i6, d6Var), l1);
            }
            i10 = l1;
            i11 = h;
            v04 = -1;
            this.f8483b.setColorFilter(v04);
            this.f8482a.setTextColor(v04);
            z10 = this.d;
            if (!z10 && this.e) {
                i12 = dp;
            } else {
                i12 = dp2;
            }
            z11 = this.f8485f;
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
            setBackground(h6.i0(i12, i13, i14, i15, i10, i11, i11));
        }
        i10 = v02;
        i11 = v03;
        this.f8483b.setColorFilter(v04);
        this.f8482a.setTextColor(v04);
        z10 = this.d;
        if (!z10) {
        }
        i12 = dp2;
        z11 = this.f8485f;
        if (!z11) {
        }
        i13 = dp2;
        if (!z11) {
        }
        i14 = dp2;
        if (!z10) {
        }
        i15 = dp2;
        setBackground(h6.i0(i12, i13, i14, i15, i10, i11, i11));
    }
}
