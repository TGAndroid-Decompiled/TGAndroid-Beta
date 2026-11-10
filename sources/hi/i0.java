package hi;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.SpannableStringBuilder;
import android.widget.FrameLayout;
import android.widget.ImageView;
import c8.ha;
import org.telegram.messenger.i6;
import org.telegram.messenger.qs;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.q5;
public final class i0 extends FrameLayout {
    public final xh.l f14712a;
    public final ImageView f14713b;
    public final TL_keyboard.KeyboardButton f14714c;
    public boolean d;
    public boolean f14715e;
    public boolean f14716f;
    public boolean h;
    public final k0 f14717n;

    public i0(k0 k0Var, Context context, TL_keyboard.KeyboardButton keyboardButton) {
        super(context);
        this.f14717n = k0Var;
        this.f14714c = keyboardButton;
        xh.l lVar = new xh.l(context);
        this.f14712a = lVar;
        lVar.f58850r = false;
        lVar.setTextSize(1, 14.0f);
        lVar.setTypeface(org.telegram.messenger.g0.o());
        qs.i(lVar);
        addView(lVar, ha.e(-2, -2, 17));
        qs.i(lVar);
        setTag(keyboardButton);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        TL_keyboard.KeyboardButtonStyle keyboardButtonStyle = keyboardButton.style;
        if (keyboardButtonStyle != null && keyboardButtonStyle.icon != 0) {
            spannableStringBuilder.append((CharSequence) "* ");
            spannableStringBuilder.setSpan(new q5(keyboardButton.style.icon, lVar.getPaint().getFontMetricsInt()), 0, 1, 33);
        }
        spannableStringBuilder.append(i6.m(keyboardButton.text, lVar.getPaint().getFontMetricsInt(), false, null, 0));
        ImageView imageView = new ImageView(getContext());
        this.f14713b = imageView;
        t6.s(imageView, m6.Mf, k0Var.f14753a, PorterDuff.Mode.SRC_ATOP);
        if (cg.c.b(keyboardButton)) {
            imageView.setImageResource(2131230899);
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(8);
        }
        addView(imageView, ha.d(12, 12.0f, 53, 0.0f, 8.0f, 8.0f, 0.0f));
        lVar.setText(spannableStringBuilder);
    }

    public final void a() {
        int i7;
        int i10;
        boolean z9;
        int i11;
        boolean z10;
        int i12;
        int i13;
        int i14;
        int r12;
        int k10;
        int L = org.telegram.messenger.g0.L(21.0f);
        int L2 = org.telegram.messenger.g0.L(11.0f);
        int i15 = m6.Nf;
        h6 h6Var = this.f14717n.f14753a;
        int w02 = m6.w0(i15, h6Var);
        int w03 = m6.w0(m6.Of, h6Var);
        int w04 = m6.w0(m6.Mf, h6Var);
        TL_keyboard.KeyboardButtonStyle keyboardButtonStyle = this.f14714c.style;
        if (keyboardButtonStyle != null) {
            if (keyboardButtonStyle.bg_primary) {
                r12 = m6.r1(0.8f, m6.w0(m6.Rl, h6Var));
                k10 = i0.a.k(m6.w0(m6.f27982i6, h6Var), r12);
            } else if (keyboardButtonStyle.bg_danger) {
                r12 = m6.r1(0.8f, m6.w0(m6.Sl, h6Var));
                k10 = i0.a.k(m6.w0(m6.f27982i6, h6Var), r12);
            } else if (keyboardButtonStyle.bg_success) {
                r12 = m6.r1(0.8f, m6.w0(m6.Tl, h6Var));
                k10 = i0.a.k(m6.w0(m6.f27982i6, h6Var), r12);
            }
            i7 = r12;
            i10 = k10;
            w04 = -1;
            this.f14713b.setColorFilter(w04);
            this.f14712a.setTextColor(w04);
            z9 = this.d;
            if (!z9 && this.f14715e) {
                i11 = L;
            } else {
                i11 = L2;
            }
            z10 = this.f14716f;
            if (!z10 && this.f14715e) {
                i12 = L;
            } else {
                i12 = L2;
            }
            if (!z10 && this.h) {
                i13 = L;
            } else {
                i13 = L2;
            }
            if (!z9 && this.h) {
                i14 = L;
            } else {
                i14 = L2;
            }
            setBackground(m6.k0(i11, i12, i13, i14, i7, i10, i10));
        }
        i7 = w02;
        i10 = w03;
        this.f14713b.setColorFilter(w04);
        this.f14712a.setTextColor(w04);
        z9 = this.d;
        if (!z9) {
        }
        i11 = L2;
        z10 = this.f14716f;
        if (!z10) {
        }
        i12 = L2;
        if (!z10) {
        }
        i13 = L2;
        if (!z9) {
        }
        i14 = L2;
        setBackground(m6.k0(i11, i12, i13, i14, i7, i10, i10));
    }
}
