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
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.z5;
import w7.y5;
public final class n0 extends FrameLayout {
    public final vh.n f8484a;
    public final ImageView f8485b;
    public final TL_keyboard.KeyboardButton f8486c;
    public boolean d;
    public boolean e;
    public boolean f8487f;
    public boolean h;
    public final p0 f8488n;

    public n0(p0 p0Var, Context context, TL_keyboard.KeyboardButton keyboardButton) {
        super(context);
        this.f8488n = p0Var;
        this.f8486c = keyboardButton;
        vh.n nVar = new vh.n(context);
        this.f8484a = nVar;
        nVar.f44780f = false;
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
        this.f8485b = imageView;
        imageView.setColorFilter(i6.v0(i6.Xe, p0Var.f8512a));
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
        int i16 = i6.Ye;
        e6 e6Var = this.f8488n.f8512a;
        int v02 = i6.v0(i16, e6Var);
        int v03 = i6.v0(i6.Ze, e6Var);
        int v04 = i6.v0(i6.Xe, e6Var);
        TL_keyboard.KeyboardButtonStyle keyboardButtonStyle = this.f8486c.style;
        if (keyboardButtonStyle != null) {
            if (keyboardButtonStyle.bg_primary) {
                l1 = i6.l1(0.8f, i6.v0(i6.dl, e6Var));
                h = i0.a.h(i6.v0(i6.f19147i6, e6Var), l1);
            } else if (keyboardButtonStyle.bg_danger) {
                l1 = i6.l1(0.8f, i6.v0(i6.el, e6Var));
                h = i0.a.h(i6.v0(i6.f19147i6, e6Var), l1);
            } else if (keyboardButtonStyle.bg_success) {
                l1 = i6.l1(0.8f, i6.v0(i6.fl, e6Var));
                h = i0.a.h(i6.v0(i6.f19147i6, e6Var), l1);
            }
            i10 = l1;
            i11 = h;
            v04 = -1;
            this.f8485b.setColorFilter(v04);
            this.f8484a.setTextColor(v04);
            z10 = this.d;
            if (!z10 && this.e) {
                i12 = dp;
            } else {
                i12 = dp2;
            }
            z11 = this.f8487f;
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
            setBackground(i6.i0(i12, i13, i14, i15, i10, i11, i11));
        }
        i10 = v02;
        i11 = v03;
        this.f8485b.setColorFilter(v04);
        this.f8484a.setTextColor(v04);
        z10 = this.d;
        if (!z10) {
        }
        i12 = dp2;
        z11 = this.f8487f;
        if (!z11) {
        }
        i13 = dp2;
        if (!z11) {
        }
        i14 = dp2;
        if (!z10) {
        }
        i15 = dp2;
        setBackground(i6.i0(i12, i13, i14, i15, i10, i11, i11));
    }
}
