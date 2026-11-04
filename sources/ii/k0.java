package ii;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.SpannableStringBuilder;
import android.widget.FrameLayout;
import android.widget.ImageView;
import b8.mf;
import org.telegram.messenger.hs;
import org.telegram.messenger.i6;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.p5;
public final class k0 extends FrameLayout {
    public final yh.l f15039a;
    public final ImageView f15040b;
    public final TL_keyboard.KeyboardButton f15041c;
    public boolean d;
    public boolean f15042e;
    public boolean f15043f;
    public boolean h;
    public final m0 f15044n;

    public k0(m0 m0Var, Context context, TL_keyboard.KeyboardButton keyboardButton) {
        super(context);
        this.f15044n = m0Var;
        this.f15041c = keyboardButton;
        yh.l lVar = new yh.l(context);
        this.f15039a = lVar;
        lVar.f59560r = false;
        lVar.setTextSize(1, 14.0f);
        lVar.setTypeface(org.telegram.messenger.g0.o());
        hs.i(lVar);
        addView(lVar, mf.e(-2, -2, 17));
        hs.i(lVar);
        setTag(keyboardButton);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        TL_keyboard.KeyboardButtonStyle keyboardButtonStyle = keyboardButton.style;
        if (keyboardButtonStyle != null && keyboardButtonStyle.icon != 0) {
            spannableStringBuilder.append((CharSequence) "* ");
            spannableStringBuilder.setSpan(new p5(keyboardButton.style.icon, lVar.getPaint().getFontMetricsInt()), 0, 1, 33);
        }
        spannableStringBuilder.append(i6.m(keyboardButton.text, lVar.getPaint().getFontMetricsInt(), false, null, 0));
        ImageView imageView = new ImageView(getContext());
        this.f15040b = imageView;
        r6.t(imageView, k6.Mf, m0Var.f15062a, PorterDuff.Mode.SRC_ATOP);
        if (dg.c.b(keyboardButton)) {
            imageView.setImageResource(2131230899);
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(8);
        }
        addView(imageView, mf.d(12, 12.0f, 53, 0.0f, 8.0f, 8.0f, 0.0f));
        lVar.setText(spannableStringBuilder);
    }

    public final void a() {
        int i3;
        int i10;
        boolean z10;
        int i11;
        boolean z11;
        int i12;
        int i13;
        int i14;
        int r12;
        int k10;
        int L = org.telegram.messenger.g0.L(21.0f);
        int L2 = org.telegram.messenger.g0.L(11.0f);
        int i15 = k6.Nf;
        e6 e6Var = this.f15044n.f15062a;
        int w02 = k6.w0(i15, e6Var);
        int w03 = k6.w0(k6.Of, e6Var);
        int w04 = k6.w0(k6.Mf, e6Var);
        TL_keyboard.KeyboardButtonStyle keyboardButtonStyle = this.f15041c.style;
        if (keyboardButtonStyle != null) {
            if (keyboardButtonStyle.bg_primary) {
                r12 = k6.r1(0.8f, k6.w0(k6.Rl, e6Var));
                k10 = i0.a.k(k6.w0(k6.f27972i6, e6Var), r12);
            } else if (keyboardButtonStyle.bg_danger) {
                r12 = k6.r1(0.8f, k6.w0(k6.Sl, e6Var));
                k10 = i0.a.k(k6.w0(k6.f27972i6, e6Var), r12);
            } else if (keyboardButtonStyle.bg_success) {
                r12 = k6.r1(0.8f, k6.w0(k6.Tl, e6Var));
                k10 = i0.a.k(k6.w0(k6.f27972i6, e6Var), r12);
            }
            i3 = r12;
            i10 = k10;
            w04 = -1;
            this.f15040b.setColorFilter(w04);
            this.f15039a.setTextColor(w04);
            z10 = this.d;
            if (!z10 && this.f15042e) {
                i11 = L;
            } else {
                i11 = L2;
            }
            z11 = this.f15043f;
            if (!z11 && this.f15042e) {
                i12 = L;
            } else {
                i12 = L2;
            }
            if (!z11 && this.h) {
                i13 = L;
            } else {
                i13 = L2;
            }
            if (!z10 && this.h) {
                i14 = L;
            } else {
                i14 = L2;
            }
            setBackground(k6.k0(i11, i12, i13, i14, i3, i10, i10));
        }
        i3 = w02;
        i10 = w03;
        this.f15040b.setColorFilter(w04);
        this.f15039a.setTextColor(w04);
        z10 = this.d;
        if (!z10) {
        }
        i11 = L2;
        z11 = this.f15043f;
        if (!z11) {
        }
        i12 = L2;
        if (!z11) {
        }
        i13 = L2;
        if (!z10) {
        }
        i14 = L2;
        setBackground(k6.k0(i11, i12, i13, i14, i3, i10, i10));
    }
}
