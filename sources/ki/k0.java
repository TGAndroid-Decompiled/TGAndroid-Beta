package ki;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.SpannableStringBuilder;
import android.widget.FrameLayout;
import android.widget.ImageView;
import c8.ja;
import org.telegram.messenger.j6;
import org.telegram.messenger.ns;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.Components.p5;
public final class k0 extends FrameLayout {
    public final xh.l f18383a;
    public final ImageView f18384b;
    public final TL_keyboard.KeyboardButton f18385c;
    public boolean d;
    public boolean f18386e;
    public boolean f18387f;
    public boolean h;
    public final m0 f18388n;

    public k0(m0 m0Var, Context context, TL_keyboard.KeyboardButton keyboardButton) {
        super(context);
        this.f18388n = m0Var;
        this.f18385c = keyboardButton;
        xh.l lVar = new xh.l(context);
        this.f18383a = lVar;
        lVar.f60034r = false;
        lVar.setTextSize(1, 14.0f);
        lVar.setTypeface(org.telegram.messenger.g0.o());
        ns.i(lVar);
        addView(lVar, ja.e(-2, -2, 17));
        ns.i(lVar);
        setTag(keyboardButton);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        TL_keyboard.KeyboardButtonStyle keyboardButtonStyle = keyboardButton.style;
        if (keyboardButtonStyle != null && keyboardButtonStyle.icon != 0) {
            spannableStringBuilder.append((CharSequence) "* ");
            spannableStringBuilder.setSpan(new p5(keyboardButton.style.icon, lVar.getPaint().getFontMetricsInt()), 0, 1, 33);
        }
        spannableStringBuilder.append(j6.m(keyboardButton.text, lVar.getPaint().getFontMetricsInt(), false, null, 0));
        ImageView imageView = new ImageView(getContext());
        this.f18384b = imageView;
        q6.s(imageView, org.telegram.ui.ActionBar.j6.Pf, m0Var.f18436a, PorterDuff.Mode.SRC_ATOP);
        if (cg.c.b(keyboardButton)) {
            imageView.setImageResource(2131230899);
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(8);
        }
        addView(imageView, ja.d(12, 12.0f, 53, 0.0f, 8.0f, 8.0f, 0.0f));
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
        int i15 = org.telegram.ui.ActionBar.j6.Qf;
        e6 e6Var = this.f18388n.f18436a;
        int w02 = org.telegram.ui.ActionBar.j6.w0(i15, e6Var);
        int w03 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Rf, e6Var);
        int w04 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Pf, e6Var);
        TL_keyboard.KeyboardButtonStyle keyboardButtonStyle = this.f18385c.style;
        if (keyboardButtonStyle != null) {
            if (keyboardButtonStyle.bg_primary) {
                r12 = org.telegram.ui.ActionBar.j6.r1(0.8f, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Ul, e6Var));
                k10 = i0.a.k(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28941i6, e6Var), r12);
            } else if (keyboardButtonStyle.bg_danger) {
                r12 = org.telegram.ui.ActionBar.j6.r1(0.8f, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Vl, e6Var));
                k10 = i0.a.k(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28941i6, e6Var), r12);
            } else if (keyboardButtonStyle.bg_success) {
                r12 = org.telegram.ui.ActionBar.j6.r1(0.8f, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Wl, e6Var));
                k10 = i0.a.k(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28941i6, e6Var), r12);
            }
            i7 = r12;
            i10 = k10;
            w04 = -1;
            this.f18384b.setColorFilter(w04);
            this.f18383a.setTextColor(w04);
            z10 = this.d;
            if (!z10 && this.f18386e) {
                i11 = L;
            } else {
                i11 = L2;
            }
            z11 = this.f18387f;
            if (!z11 && this.f18386e) {
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
            setBackground(org.telegram.ui.ActionBar.j6.k0(i11, i12, i13, i14, i7, i10, i10));
        }
        i7 = w02;
        i10 = w03;
        this.f18384b.setColorFilter(w04);
        this.f18383a.setTextColor(w04);
        z10 = this.d;
        if (!z10) {
        }
        i11 = L2;
        z11 = this.f18387f;
        if (!z11) {
        }
        i12 = L2;
        if (!z11) {
        }
        i13 = L2;
        if (!z10) {
        }
        i14 = L2;
        setBackground(org.telegram.ui.ActionBar.j6.k0(i11, i12, i13, i14, i7, i10, i10));
    }
}
