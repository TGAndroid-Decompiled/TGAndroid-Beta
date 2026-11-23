package ki;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.SpannableStringBuilder;
import android.widget.FrameLayout;
import android.widget.ImageView;
import c8.ma;
import org.telegram.messenger.j6;
import org.telegram.messenger.ls;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.y5;
public final class j0 extends FrameLayout {
    public final xh.l f18755a;
    public final ImageView f18756b;
    public final TL_keyboard.KeyboardButton f18757c;
    public boolean d;
    public boolean f18758e;
    public boolean f18759f;
    public boolean h;
    public final l0 f18760n;

    public j0(l0 l0Var, Context context, TL_keyboard.KeyboardButton keyboardButton) {
        super(context);
        this.f18760n = l0Var;
        this.f18757c = keyboardButton;
        xh.l lVar = new xh.l(context);
        this.f18755a = lVar;
        lVar.f60645r = false;
        lVar.setTextSize(1, 14.0f);
        lVar.setTypeface(org.telegram.messenger.g0.o());
        ls.i(lVar);
        addView(lVar, ma.e(-2, -2, 17));
        ls.i(lVar);
        setTag(keyboardButton);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        TL_keyboard.KeyboardButtonStyle keyboardButtonStyle = keyboardButton.style;
        if (keyboardButtonStyle != null && keyboardButtonStyle.icon != 0) {
            spannableStringBuilder.append((CharSequence) "* ");
            spannableStringBuilder.setSpan(new y5(keyboardButton.style.icon, lVar.getPaint().getFontMetricsInt()), 0, 1, 33);
        }
        spannableStringBuilder.append(j6.m(keyboardButton.text, lVar.getPaint().getFontMetricsInt(), false, null, 0));
        ImageView imageView = new ImageView(getContext());
        this.f18756b = imageView;
        t6.s(imageView, m6.Pf, l0Var.f18784a, PorterDuff.Mode.SRC_ATOP);
        if (cg.c.b(keyboardButton)) {
            imageView.setImageResource(2131230899);
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(8);
        }
        addView(imageView, ma.d(12, 12.0f, 53, 0.0f, 8.0f, 8.0f, 0.0f));
        lVar.setText(spannableStringBuilder);
    }

    public final void a() {
        int i7;
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
        int i15 = m6.Qf;
        h6 h6Var = this.f18760n.f18784a;
        int w02 = m6.w0(i15, h6Var);
        int w03 = m6.w0(m6.Rf, h6Var);
        int w04 = m6.w0(m6.Pf, h6Var);
        TL_keyboard.KeyboardButtonStyle keyboardButtonStyle = this.f18757c.style;
        if (keyboardButtonStyle != null) {
            if (keyboardButtonStyle.bg_primary) {
                r12 = m6.r1(0.8f, m6.w0(m6.Ul, h6Var));
                k10 = i0.a.k(m6.w0(m6.f29473i6, h6Var), r12);
            } else if (keyboardButtonStyle.bg_danger) {
                r12 = m6.r1(0.8f, m6.w0(m6.Vl, h6Var));
                k10 = i0.a.k(m6.w0(m6.f29473i6, h6Var), r12);
            } else if (keyboardButtonStyle.bg_success) {
                r12 = m6.r1(0.8f, m6.w0(m6.Wl, h6Var));
                k10 = i0.a.k(m6.w0(m6.f29473i6, h6Var), r12);
            }
            i7 = r12;
            i10 = k10;
            w04 = -1;
            this.f18756b.setColorFilter(w04);
            this.f18755a.setTextColor(w04);
            z10 = this.d;
            if (!z10 && this.f18758e) {
                i11 = L;
            } else {
                i11 = L2;
            }
            z11 = this.f18759f;
            if (!z11 && this.f18758e) {
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
            setBackground(m6.k0(i11, i12, i13, i14, i7, i10, i10));
        }
        i7 = w02;
        i10 = w03;
        this.f18756b.setColorFilter(w04);
        this.f18755a.setTextColor(w04);
        z10 = this.d;
        if (!z10) {
        }
        i11 = L2;
        z11 = this.f18759f;
        if (!z11) {
        }
        i12 = L2;
        if (!z11) {
        }
        i13 = L2;
        if (!z10) {
        }
        i14 = L2;
        setBackground(m6.k0(i11, i12, i13, i14, i7, i10, i10));
    }
}
