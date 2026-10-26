package hi;

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
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.c6;
import org.telegram.ui.Components.gb1;
public final class s0 extends FrameLayout {
    public final xh.n f13256a;
    public final ImageView f13257b;
    public final TL_keyboard.KeyboardButton f13258c;
    public boolean d;
    public boolean e;
    public boolean f13259f;
    public boolean h;
    public final u0 f13260n;

    public s0(u0 u0Var, Context context, TL_keyboard.KeyboardButton keyboardButton) {
        super(context);
        this.f13260n = u0Var;
        this.f13258c = keyboardButton;
        xh.n nVar = new xh.n(context);
        this.f13256a = nVar;
        nVar.f51913r = false;
        nVar.setTextSize(1, 14.0f);
        nVar.setTypeface(AndroidUtilities.bold());
        NotificationCenter.listenEmojiLoading(nVar);
        addView(nVar, gb1.i(-2, -2, 17));
        NotificationCenter.listenEmojiLoading(nVar);
        setTag(keyboardButton);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        TL_keyboard.KeyboardButtonStyle keyboardButtonStyle = keyboardButton.style;
        if (keyboardButtonStyle != null && keyboardButtonStyle.icon != 0) {
            spannableStringBuilder.append((CharSequence) "* ");
            spannableStringBuilder.setSpan(new c6(keyboardButton.style.icon, nVar.getPaint().getFontMetricsInt()), 0, 1, 33);
        }
        spannableStringBuilder.append(Emoji.replaceEmoji(keyboardButton.text, nVar.getPaint().getFontMetricsInt(), false));
        ImageView imageView = new ImageView(getContext());
        this.f13257b = imageView;
        f7.t(imageView, y6.Xe, u0Var.f13302a, PorterDuff.Mode.SRC_ATOP);
        if (bg.c.b(keyboardButton)) {
            imageView.setImageResource(R.drawable.bot_webview);
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(8);
        }
        addView(imageView, gb1.h(12, 12.0f, 53, 0.0f, 8.0f, 8.0f, 0.0f));
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
        int i16 = y6.Ye;
        u6 u6Var = this.f13260n.f13302a;
        int w02 = y6.w0(i16, u6Var);
        int w03 = y6.w0(y6.Ze, u6Var);
        int w04 = y6.w0(y6.Xe, u6Var);
        TL_keyboard.KeyboardButtonStyle keyboardButtonStyle = this.f13258c.style;
        if (keyboardButtonStyle != null) {
            if (keyboardButtonStyle.bg_primary) {
                o12 = y6.o1(0.8f, y6.w0(y6.dl, u6Var));
                k10 = i0.a.k(y6.w0(y6.f23448i6, u6Var), o12);
            } else if (keyboardButtonStyle.bg_danger) {
                o12 = y6.o1(0.8f, y6.w0(y6.el, u6Var));
                k10 = i0.a.k(y6.w0(y6.f23448i6, u6Var), o12);
            } else if (keyboardButtonStyle.bg_success) {
                o12 = y6.o1(0.8f, y6.w0(y6.fl, u6Var));
                k10 = i0.a.k(y6.w0(y6.f23448i6, u6Var), o12);
            }
            i10 = o12;
            i11 = k10;
            w04 = -1;
            this.f13257b.setColorFilter(w04);
            this.f13256a.setTextColor(w04);
            z10 = this.d;
            if (!z10 && this.e) {
                i12 = dp;
            } else {
                i12 = dp2;
            }
            z11 = this.f13259f;
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
            setBackground(y6.j0(i12, i13, i14, i15, i10, i11, i11));
        }
        i10 = w02;
        i11 = w03;
        this.f13257b.setColorFilter(w04);
        this.f13256a.setTextColor(w04);
        z10 = this.d;
        if (!z10) {
        }
        i12 = dp2;
        z11 = this.f13259f;
        if (!z11) {
        }
        i13 = dp2;
        if (!z11) {
        }
        i14 = dp2;
        if (!z10) {
        }
        i15 = dp2;
        setBackground(y6.j0(i12, i13, i14, i15, i10, i11, i11));
    }
}
