package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.SpannableStringBuilder;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.tgnet.tl.TL_keyboard;
public final class mq0 extends FrameLayout {
    public final tpa a;
    public final ImageView b;
    public final TL_keyboard.KeyboardButton c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean h;
    public final oq0 n;

    public mq0(oq0 oq0Var, Context context, TL_keyboard.KeyboardButton keyboardButton) {
        super(context);
        this.n = oq0Var;
        this.c = keyboardButton;
        tpa tpaVar = new tpa(context);
        this.a = tpaVar;
        tpaVar.r = false;
        tpaVar.setTextSize(1, 14.0f);
        tpaVar.setTypeface(hl.o());
        jn7.i(tpaVar);
        addView(tpaVar, tre.e(-2, -2, 17));
        jn7.i(tpaVar);
        setTag(keyboardButton);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        TL_keyboard.KeyboardButtonStyle keyboardButtonStyle = keyboardButton.style;
        if (keyboardButtonStyle != null && keyboardButtonStyle.icon != 0) {
            spannableStringBuilder.append((CharSequence) "* ");
            spannableStringBuilder.setSpan(new hm(keyboardButton.style.icon, tpaVar.getPaint().getFontMetricsInt()), 0, 1, 33);
        }
        spannableStringBuilder.append(pv3.m(keyboardButton.text, tpaVar.getPaint().getFontMetricsInt(), false, null, 0));
        ImageView imageView = new ImageView(getContext());
        this.b = imageView;
        yob.s(imageView, aob.Pf, oq0Var.a, PorterDuff.Mode.SRC_ATOP);
        if (ehb.b(keyboardButton)) {
            imageView.setImageResource(2131230899);
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(8);
        }
        addView(imageView, tre.d(12, 12.0f, 53, 0.0f, 8.0f, 8.0f, 0.0f));
        tpaVar.setText(spannableStringBuilder);
    }

    public final void a() {
        int i;
        int i2;
        boolean z;
        int i3;
        boolean z2;
        int i4;
        int i5;
        int i6;
        int p1;
        int k;
        int L = hl.L(21.0f);
        int L2 = hl.L(11.0f);
        int i7 = aob.Qf;
        vnb vnbVar = this.n.a;
        int v0 = aob.v0(i7, vnbVar);
        int v02 = aob.v0(aob.Rf, vnbVar);
        int v03 = aob.v0(aob.Pf, vnbVar);
        TL_keyboard.KeyboardButtonStyle keyboardButtonStyle = this.c.style;
        if (keyboardButtonStyle != null) {
            if (keyboardButtonStyle.bg_primary) {
                p1 = aob.p1(0.8f, aob.v0(aob.Ul, vnbVar));
                k = vm2.k(aob.v0(aob.i6, vnbVar), p1);
            } else if (keyboardButtonStyle.bg_danger) {
                p1 = aob.p1(0.8f, aob.v0(aob.Vl, vnbVar));
                k = vm2.k(aob.v0(aob.i6, vnbVar), p1);
            } else if (keyboardButtonStyle.bg_success) {
                p1 = aob.p1(0.8f, aob.v0(aob.Wl, vnbVar));
                k = vm2.k(aob.v0(aob.i6, vnbVar), p1);
            }
            i = p1;
            i2 = k;
            v03 = -1;
            this.b.setColorFilter(v03);
            this.a.setTextColor(v03);
            z = this.d;
            if (!z && this.e) {
                i3 = L;
            } else {
                i3 = L2;
            }
            z2 = this.f;
            if (!z2 && this.e) {
                i4 = L;
            } else {
                i4 = L2;
            }
            if (!z2 && this.h) {
                i5 = L;
            } else {
                i5 = L2;
            }
            if (!z && this.h) {
                i6 = L;
            } else {
                i6 = L2;
            }
            setBackground(aob.i0(i3, i4, i5, i6, i, i2, i2));
        }
        i = v0;
        i2 = v02;
        this.b.setColorFilter(v03);
        this.a.setTextColor(v03);
        z = this.d;
        if (!z) {
        }
        i3 = L2;
        z2 = this.f;
        if (!z2) {
        }
        i4 = L2;
        if (!z2) {
        }
        i5 = L2;
        if (!z) {
        }
        i6 = L2;
        setBackground(aob.i0(i3, i4, i5, i6, i, i2, i2));
    }
}
