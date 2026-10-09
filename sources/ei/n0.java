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
import org.telegram.ui.Components.b6;
import w7.x5;
public final class n0 extends FrameLayout {
    public final vh.n f9232a;
    public final ImageView f9233b;
    public final TL_keyboard.KeyboardButton f9234c;
    public boolean d;
    public boolean f9235e;
    public boolean f9236f;
    public boolean h;
    public final p0 f9237n;

    public n0(p0 p0Var, Context context, TL_keyboard.KeyboardButton keyboardButton) {
        super(context);
        this.f9237n = p0Var;
        this.f9234c = keyboardButton;
        vh.n nVar = new vh.n(context);
        this.f9232a = nVar;
        nVar.f49734r = false;
        nVar.setTextSize(1, 14.0f);
        nVar.setTypeface(AndroidUtilities.bold());
        NotificationCenter.listenEmojiLoading(nVar);
        addView(nVar, x5.e(-2, -2, 17));
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
        this.f9233b = imageView;
        imageView.setColorFilter(i6.w0(i6.Xe, p0Var.f9271a));
        if (zf.c.b(keyboardButton)) {
            imageView.setImageResource(R.drawable.bot_webview);
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(8);
        }
        addView(imageView, x5.a(12.0f, 0.0f, 8.0f, 8.0f, 0.0f, 12, 53));
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
        int i16 = i6.Ye;
        e6 e6Var = this.f9237n.f9271a;
        int w02 = i6.w0(i16, e6Var);
        int w03 = i6.w0(i6.Ze, e6Var);
        int w04 = i6.w0(i6.Xe, e6Var);
        TL_keyboard.KeyboardButtonStyle keyboardButtonStyle = this.f9234c.style;
        if (keyboardButtonStyle != null) {
            if (keyboardButtonStyle.bg_primary) {
                m12 = i6.m1(0.8f, i6.w0(i6.dl, e6Var));
                h = i0.a.h(i6.w0(i6.f20888i6, e6Var), m12);
            } else if (keyboardButtonStyle.bg_danger) {
                m12 = i6.m1(0.8f, i6.w0(i6.el, e6Var));
                h = i0.a.h(i6.w0(i6.f20888i6, e6Var), m12);
            } else if (keyboardButtonStyle.bg_success) {
                m12 = i6.m1(0.8f, i6.w0(i6.fl, e6Var));
                h = i0.a.h(i6.w0(i6.f20888i6, e6Var), m12);
            }
            i10 = m12;
            i11 = h;
            w04 = -1;
            this.f9233b.setColorFilter(w04);
            this.f9232a.setTextColor(w04);
            z10 = this.d;
            if (!z10 && this.f9235e) {
                i12 = dp;
            } else {
                i12 = dp2;
            }
            z11 = this.f9236f;
            if (!z11 && this.f9235e) {
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
            setBackground(i6.j0(i12, i13, i14, i15, i10, i11, i11));
        }
        i10 = w02;
        i11 = w03;
        this.f9233b.setColorFilter(w04);
        this.f9232a.setTextColor(w04);
        z10 = this.d;
        if (!z10) {
        }
        i12 = dp2;
        z11 = this.f9236f;
        if (!z11) {
        }
        i13 = dp2;
        if (!z11) {
        }
        i14 = dp2;
        if (!z10) {
        }
        i15 = dp2;
        setBackground(i6.j0(i12, i13, i14, i15, i10, i11, i11));
    }
}
