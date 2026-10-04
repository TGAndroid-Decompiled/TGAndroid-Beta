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
import org.telegram.ui.ActionBar.i6;
import w7.z5;
public final class o0 extends FrameLayout {
    public final vh.n f9230a;
    public final ImageView f9231b;
    public final TL_keyboard.KeyboardButton f9232c;
    public boolean d;
    public boolean f9233e;
    public boolean f9234f;
    public boolean h;
    public final q0 f9235n;

    public o0(q0 q0Var, Context context, TL_keyboard.KeyboardButton keyboardButton) {
        super(context);
        this.f9235n = q0Var;
        this.f9232c = keyboardButton;
        vh.n nVar = new vh.n(context);
        this.f9230a = nVar;
        nVar.f48444f = false;
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
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.z5(keyboardButton.style.icon, nVar.getPaint().getFontMetricsInt()), 0, 1, 33);
        }
        spannableStringBuilder.append(Emoji.replaceEmoji(keyboardButton.text, nVar.getPaint().getFontMetricsInt(), false));
        ImageView imageView = new ImageView(getContext());
        this.f9231b = imageView;
        imageView.setColorFilter(i6.v0(i6.Xe, q0Var.f9260a));
        if (zf.c.b(keyboardButton)) {
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
        int l1;
        int h;
        int dp = AndroidUtilities.dp(21.0f);
        int dp2 = AndroidUtilities.dp(11.0f);
        int i16 = i6.Ye;
        d6 d6Var = this.f9235n.f9260a;
        int v02 = i6.v0(i16, d6Var);
        int v03 = i6.v0(i6.Ze, d6Var);
        int v04 = i6.v0(i6.Xe, d6Var);
        TL_keyboard.KeyboardButtonStyle keyboardButtonStyle = this.f9232c.style;
        if (keyboardButtonStyle != null) {
            if (keyboardButtonStyle.bg_primary) {
                l1 = i6.l1(0.8f, i6.v0(i6.dl, d6Var));
                h = i0.a.h(i6.v0(i6.f20913i6, d6Var), l1);
            } else if (keyboardButtonStyle.bg_danger) {
                l1 = i6.l1(0.8f, i6.v0(i6.el, d6Var));
                h = i0.a.h(i6.v0(i6.f20913i6, d6Var), l1);
            } else if (keyboardButtonStyle.bg_success) {
                l1 = i6.l1(0.8f, i6.v0(i6.fl, d6Var));
                h = i0.a.h(i6.v0(i6.f20913i6, d6Var), l1);
            }
            i10 = l1;
            i11 = h;
            v04 = -1;
            this.f9231b.setColorFilter(v04);
            this.f9230a.setTextColor(v04);
            z10 = this.d;
            if (!z10 && this.f9233e) {
                i12 = dp;
            } else {
                i12 = dp2;
            }
            z11 = this.f9234f;
            if (!z11 && this.f9233e) {
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
        this.f9231b.setColorFilter(v04);
        this.f9230a.setTextColor(v04);
        z10 = this.d;
        if (!z10) {
        }
        i12 = dp2;
        z11 = this.f9234f;
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
