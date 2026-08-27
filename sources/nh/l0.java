package nh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.widget.FrameLayout;
import android.widget.ImageView;
import h7.z5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.t5;

public final class l0 extends FrameLayout {

    public final eh.s f18793a;

    public final ImageView f18794b;

    public final TL_keyboard.KeyboardButton f18795c;
    public boolean d;

    public boolean f18796e;

    public boolean f18797f;
    public boolean h;

    public final n0 f18798n;

    public l0(n0 n0Var, Context context, TL_keyboard.KeyboardButton keyboardButton) {
        super(context);
        this.f18798n = n0Var;
        this.f18795c = keyboardButton;
        eh.s sVar = new eh.s(context);
        this.f18793a = sVar;
        sVar.f5567f = false;
        sVar.setTextSize(1, 14.0f);
        sVar.setTypeface(AndroidUtilities.bold());
        NotificationCenter.listenEmojiLoading(sVar);
        addView(sVar, z5.e(-2, -2, 17));
        NotificationCenter.listenEmojiLoading(sVar);
        setTag(keyboardButton);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        TL_keyboard.KeyboardButtonStyle keyboardButtonStyle = keyboardButton.style;
        if (keyboardButtonStyle != null && keyboardButtonStyle.icon != 0) {
            spannableStringBuilder.append((CharSequence) "* ");
            spannableStringBuilder.setSpan(new t5(keyboardButton.style.icon, sVar.getPaint().getFontMetricsInt()), 0, 1, 33);
        }
        spannableStringBuilder.append(Emoji.replaceEmoji(keyboardButton.text, sVar.getPaint().getFontMetricsInt(), false));
        ImageView imageView = new ImageView(getContext());
        this.f18794b = imageView;
        imageView.setColorFilter(g6.v0(g6.Xe, n0Var.f18822a));
        if (hf.c.b(keyboardButton)) {
            imageView.setImageResource(R.drawable.bot_webview);
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(8);
        }
        addView(imageView, z5.d(12, 12.0f, 53, 0.0f, 8.0f, 8.0f, 0.0f));
        sVar.setText(spannableStringBuilder);
    }

    public final void a() {
        int i10;
        int i11;
        int iL1;
        int iH;
        int iDp = AndroidUtilities.dp(21.0f);
        int iDp2 = AndroidUtilities.dp(11.0f);
        int i12 = g6.Ye;
        c6 c6Var = this.f18798n.f18822a;
        int iV0 = g6.v0(i12, c6Var);
        int iV1 = g6.v0(g6.Ze, c6Var);
        int iV2 = g6.v0(g6.Xe, c6Var);
        TL_keyboard.KeyboardButtonStyle keyboardButtonStyle = this.f18795c.style;
        if (keyboardButtonStyle == null) {
            i10 = iV0;
            i11 = iV1;
        } else {
            if (keyboardButtonStyle.bg_primary) {
                iL1 = g6.l1(0.8f, g6.v0(g6.dl, c6Var));
                iH = i0.b.h(g6.v0(g6.f23144i6, c6Var), iL1);
            } else if (keyboardButtonStyle.bg_danger) {
                iL1 = g6.l1(0.8f, g6.v0(g6.el, c6Var));
                iH = i0.b.h(g6.v0(g6.f23144i6, c6Var), iL1);
            } else if (keyboardButtonStyle.bg_success) {
                iL1 = g6.l1(0.8f, g6.v0(g6.fl, c6Var));
                iH = i0.b.h(g6.v0(g6.f23144i6, c6Var), iL1);
            } else {
                i10 = iV0;
                i11 = iV1;
            }
            i10 = iL1;
            i11 = iH;
            iV2 = -1;
        }
        this.f18794b.setColorFilter(iV2);
        this.f18793a.setTextColor(iV2);
        boolean z10 = this.d;
        int i13 = (z10 && this.f18796e) ? iDp : iDp2;
        boolean z11 = this.f18797f;
        setBackground(g6.i0(i13, (z11 && this.f18796e) ? iDp : iDp2, (z11 && this.h) ? iDp : iDp2, (z10 && this.h) ? iDp : iDp2, i10, i11, i11));
    }
}
