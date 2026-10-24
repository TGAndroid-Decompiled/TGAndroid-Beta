package gi;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.SpannableStringBuilder;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.y5;
import w7.z5;
public final class l0 extends FrameLayout {
    public final wh.n f11333a;
    public final ImageView f11334b;
    public final TL_keyboard.KeyboardButton f11335c;
    public boolean d;
    public boolean e;
    public boolean f11336f;
    public boolean h;
    public final n0 f11337n;

    public l0(n0 n0Var, Context context, TL_keyboard.KeyboardButton keyboardButton) {
        super(context);
        this.f11337n = n0Var;
        this.f11335c = keyboardButton;
        wh.n nVar = new wh.n(context);
        this.f11333a = nVar;
        nVar.f49550r = false;
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
            spannableStringBuilder.setSpan(new y5(keyboardButton.style.icon, nVar.getPaint().getFontMetricsInt()), 0, 1, 33);
        }
        spannableStringBuilder.append(Emoji.replaceEmoji(keyboardButton.text, nVar.getPaint().getFontMetricsInt(), false));
        ImageView imageView = new ImageView(getContext());
        this.f11334b = imageView;
        r6.t(imageView, k6.Xe, n0Var.f11371a, PorterDuff.Mode.SRC_ATOP);
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
        int o12;
        int k10;
        int dp = AndroidUtilities.dp(21.0f);
        int dp2 = AndroidUtilities.dp(11.0f);
        int i16 = k6.Ye;
        g6 g6Var = this.f11337n.f11371a;
        int w02 = k6.w0(i16, g6Var);
        int w03 = k6.w0(k6.Ze, g6Var);
        int w04 = k6.w0(k6.Xe, g6Var);
        TL_keyboard.KeyboardButtonStyle keyboardButtonStyle = this.f11335c.style;
        if (keyboardButtonStyle != null) {
            if (keyboardButtonStyle.bg_primary) {
                o12 = k6.o1(0.8f, k6.w0(k6.dl, g6Var));
                k10 = i0.a.k(k6.w0(k6.f21273i6, g6Var), o12);
            } else if (keyboardButtonStyle.bg_danger) {
                o12 = k6.o1(0.8f, k6.w0(k6.el, g6Var));
                k10 = i0.a.k(k6.w0(k6.f21273i6, g6Var), o12);
            } else if (keyboardButtonStyle.bg_success) {
                o12 = k6.o1(0.8f, k6.w0(k6.fl, g6Var));
                k10 = i0.a.k(k6.w0(k6.f21273i6, g6Var), o12);
            }
            i10 = o12;
            i11 = k10;
            w04 = -1;
            this.f11334b.setColorFilter(w04);
            this.f11333a.setTextColor(w04);
            z10 = this.d;
            if (!z10 && this.e) {
                i12 = dp;
            } else {
                i12 = dp2;
            }
            z11 = this.f11336f;
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
            setBackground(k6.j0(i12, i13, i14, i15, i10, i11, i11));
        }
        i10 = w02;
        i11 = w03;
        this.f11334b.setColorFilter(w04);
        this.f11333a.setTextColor(w04);
        z10 = this.d;
        if (!z10) {
        }
        i12 = dp2;
        z11 = this.f11336f;
        if (!z11) {
        }
        i13 = dp2;
        if (!z11) {
        }
        i14 = dp2;
        if (!z10) {
        }
        i15 = dp2;
        setBackground(k6.j0(i12, i13, i14, i15, i10, i11, i11));
    }
}
