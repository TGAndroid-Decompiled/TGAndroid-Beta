package ki;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.SpannableStringBuilder;
import android.widget.FrameLayout;
import android.widget.ImageView;
import c8.ma;
import org.telegram.messenger.j6;
import org.telegram.messenger.ks;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.x5;
public final class k0 extends FrameLayout {
    public final xh.l f18742a;
    public final ImageView f18743b;
    public final TL_keyboard.KeyboardButton f18744c;
    public boolean d;
    public boolean f18745e;
    public boolean f18746f;
    public boolean h;
    public final m0 f18747n;

    public k0(m0 m0Var, Context context, TL_keyboard.KeyboardButton keyboardButton) {
        super(context);
        this.f18747n = m0Var;
        this.f18744c = keyboardButton;
        xh.l lVar = new xh.l(context);
        this.f18742a = lVar;
        lVar.f60600r = false;
        lVar.setTextSize(1, 14.0f);
        lVar.setTypeface(org.telegram.messenger.g0.o());
        ks.i(lVar);
        addView(lVar, ma.e(-2, -2, 17));
        ks.i(lVar);
        setTag(keyboardButton);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        TL_keyboard.KeyboardButtonStyle keyboardButtonStyle = keyboardButton.style;
        if (keyboardButtonStyle != null && keyboardButtonStyle.icon != 0) {
            spannableStringBuilder.append((CharSequence) "* ");
            spannableStringBuilder.setSpan(new x5(keyboardButton.style.icon, lVar.getPaint().getFontMetricsInt()), 0, 1, 33);
        }
        spannableStringBuilder.append(j6.m(keyboardButton.text, lVar.getPaint().getFontMetricsInt(), false, null, 0));
        ImageView imageView = new ImageView(getContext());
        this.f18743b = imageView;
        u6.s(imageView, n6.Pf, m0Var.f18771a, PorterDuff.Mode.SRC_ATOP);
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
        int i15 = n6.Qf;
        i6 i6Var = this.f18747n.f18771a;
        int w02 = n6.w0(i15, i6Var);
        int w03 = n6.w0(n6.Rf, i6Var);
        int w04 = n6.w0(n6.Pf, i6Var);
        TL_keyboard.KeyboardButtonStyle keyboardButtonStyle = this.f18744c.style;
        if (keyboardButtonStyle != null) {
            if (keyboardButtonStyle.bg_primary) {
                r12 = n6.r1(0.8f, n6.w0(n6.Ul, i6Var));
                k10 = i0.a.k(n6.w0(n6.f29486i6, i6Var), r12);
            } else if (keyboardButtonStyle.bg_danger) {
                r12 = n6.r1(0.8f, n6.w0(n6.Vl, i6Var));
                k10 = i0.a.k(n6.w0(n6.f29486i6, i6Var), r12);
            } else if (keyboardButtonStyle.bg_success) {
                r12 = n6.r1(0.8f, n6.w0(n6.Wl, i6Var));
                k10 = i0.a.k(n6.w0(n6.f29486i6, i6Var), r12);
            }
            i7 = r12;
            i10 = k10;
            w04 = -1;
            this.f18743b.setColorFilter(w04);
            this.f18742a.setTextColor(w04);
            z10 = this.d;
            if (!z10 && this.f18745e) {
                i11 = L;
            } else {
                i11 = L2;
            }
            z11 = this.f18746f;
            if (!z11 && this.f18745e) {
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
            setBackground(n6.k0(i11, i12, i13, i14, i7, i10, i10));
        }
        i7 = w02;
        i10 = w03;
        this.f18743b.setColorFilter(w04);
        this.f18742a.setTextColor(w04);
        z10 = this.d;
        if (!z10) {
        }
        i11 = L2;
        z11 = this.f18746f;
        if (!z11) {
        }
        i12 = L2;
        if (!z11) {
        }
        i13 = L2;
        if (!z10) {
        }
        i14 = L2;
        setBackground(n6.k0(i11, i12, i13, i14, i7, i10, i10));
    }
}
