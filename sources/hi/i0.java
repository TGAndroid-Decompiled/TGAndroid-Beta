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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.r5;
public final class i0 extends FrameLayout {
    public final xh.l f14707a;
    public final ImageView f14708b;
    public final TL_keyboard.KeyboardButton f14709c;
    public boolean d;
    public boolean f14710e;
    public boolean f14711f;
    public boolean h;
    public final k0 f14712n;

    public i0(k0 k0Var, Context context, TL_keyboard.KeyboardButton keyboardButton) {
        super(context);
        this.f14712n = k0Var;
        this.f14709c = keyboardButton;
        xh.l lVar = new xh.l(context);
        this.f14707a = lVar;
        lVar.f58748r = false;
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
            spannableStringBuilder.setSpan(new r5(keyboardButton.style.icon, lVar.getPaint().getFontMetricsInt()), 0, 1, 33);
        }
        spannableStringBuilder.append(i6.m(keyboardButton.text, lVar.getPaint().getFontMetricsInt(), false, null, 0));
        ImageView imageView = new ImageView(getContext());
        this.f14708b = imageView;
        r6.t(imageView, k6.Mf, k0Var.f14748a, PorterDuff.Mode.SRC_ATOP);
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
        int i15 = k6.Nf;
        f6 f6Var = this.f14712n.f14748a;
        int w02 = k6.w0(i15, f6Var);
        int w03 = k6.w0(k6.Of, f6Var);
        int w04 = k6.w0(k6.Mf, f6Var);
        TL_keyboard.KeyboardButtonStyle keyboardButtonStyle = this.f14709c.style;
        if (keyboardButtonStyle != null) {
            if (keyboardButtonStyle.bg_primary) {
                r12 = k6.r1(0.8f, k6.w0(k6.Rl, f6Var));
                k10 = i0.a.k(k6.w0(k6.f27940i6, f6Var), r12);
            } else if (keyboardButtonStyle.bg_danger) {
                r12 = k6.r1(0.8f, k6.w0(k6.Sl, f6Var));
                k10 = i0.a.k(k6.w0(k6.f27940i6, f6Var), r12);
            } else if (keyboardButtonStyle.bg_success) {
                r12 = k6.r1(0.8f, k6.w0(k6.Tl, f6Var));
                k10 = i0.a.k(k6.w0(k6.f27940i6, f6Var), r12);
            }
            i7 = r12;
            i10 = k10;
            w04 = -1;
            this.f14708b.setColorFilter(w04);
            this.f14707a.setTextColor(w04);
            z9 = this.d;
            if (!z9 && this.f14710e) {
                i11 = L;
            } else {
                i11 = L2;
            }
            z10 = this.f14711f;
            if (!z10 && this.f14710e) {
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
            setBackground(k6.k0(i11, i12, i13, i14, i7, i10, i10));
        }
        i7 = w02;
        i10 = w03;
        this.f14708b.setColorFilter(w04);
        this.f14707a.setTextColor(w04);
        z9 = this.d;
        if (!z9) {
        }
        i11 = L2;
        z10 = this.f14711f;
        if (!z10) {
        }
        i12 = L2;
        if (!z10) {
        }
        i13 = L2;
        if (!z9) {
        }
        i14 = L2;
        setBackground(k6.k0(i11, i12, i13, i14, i7, i10, i10));
    }
}
