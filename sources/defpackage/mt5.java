package defpackage;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.HashSet;
public final class mt5 extends FrameLayout implements snb {
    public final de0 a;
    public final ema b;
    public final ema c;
    public final rb0 d;
    public final og2 e;
    public iv2 f;
    public CharSequence h;
    public int n;

    public mt5(Context context, boolean z) {
        super(context);
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        float f;
        this.d = new rb0((vnb) null);
        de0 de0Var = new de0(context);
        this.a = de0Var;
        de0Var.setRoundRadius(hl.L(23.0f));
        if (ob6.a0) {
            i = 5;
        } else {
            i = 3;
        }
        addView(de0Var, tre.d(46, 46.0f, i | 48, 13.0f, 6.0f, 13.0f, 6.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        boolean z2 = ob6.a0;
        if (z2) {
            i2 = 0;
        } else {
            i2 = 72;
        }
        addView(linearLayout, tre.d(-1, -1.0f, 119, i2, 0.0f, z2 ? 72 : 0, 0.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        linearLayout.addView(frameLayout, tre.l(1.0f, 0, 58));
        ema emaVar = new ema(context);
        this.b = emaVar;
        yob.W(emaVar, aob.G6, null);
        emaVar.setTypeface(hl.o());
        emaVar.setTextSize(15);
        if (ob6.a0) {
            i3 = 5;
        } else {
            i3 = 3;
        }
        emaVar.setGravity(i3 | 48);
        if (ob6.a0) {
            i4 = 5;
        } else {
            i4 = 3;
        }
        frameLayout.addView(emaVar, tre.d(-1, 20.0f, i4 | 48, 0.0f, 9.0f, 0.0f, 0.0f));
        ema emaVar2 = new ema(context);
        this.c = emaVar2;
        emaVar2.setTextSize(13);
        if (ob6.a0) {
            i5 = 5;
        } else {
            i5 = 3;
        }
        emaVar2.setGravity(i5 | 48);
        if (ob6.a0) {
            i6 = 5;
        } else {
            i6 = 3;
        }
        frameLayout.addView(emaVar2, tre.d(-1, 20.0f, i6 | 48, 0.0f, 33.0f, 0.0f, 0.0f));
        if (z) {
            og2 og2Var = new og2(21, null, context);
            this.e = og2Var;
            og2Var.b(-1, aob.d6, aob.k7);
            og2Var.setDrawUnchecked(false);
            og2Var.setDrawBackgroundAsArc(3);
            boolean z3 = ob6.a0;
            int i7 = (z3 ? 5 : 3) | 48;
            if (z3) {
                f = 0.0f;
            } else {
                f = 40.0f;
            }
            addView(og2Var, tre.d(24, 24.0f, i7, f, 32.0f, z3 ? 39.0f : 0.0f, 0.0f));
            return;
        }
        this.e = null;
        uv8 uv8Var = new uv8(context);
        uv8Var.setText(ob6.M0(2131748928, null));
        uv8Var.setTextSize(1, 14.0f);
        yob.X(uv8Var, aob.Ji, null);
        uv8Var.setProgressColor(aob.w0(null, aob.Ei, false));
        int i8 = aob.Yl;
        hf0 e = rnb.e(aob.w0(null, i8, false), 16.0f);
        uob M = yob.M(i8);
        uob e2 = yob.e(i8);
        uv8Var.setBackground(e);
        yob.j(uv8Var, e, M, e2, null);
        uv8Var.setPadding(hl.L(14.0f), 0, hl.L(14.0f), 0);
        linearLayout.addView(uv8Var, tre.q(-2, 28, 0.0f, 16, 18, 0, 18, 0));
        uv8Var.setOnClickListener(new sa5(this, (byte) 11));
    }

    public final void a(iv2 iv2Var, CharSequence charSequence) {
        this.f = iv2Var;
        this.h = charSequence;
        if (iv2Var == null) {
            return;
        }
        String str = iv2Var.i;
        String str2 = iv2Var.j;
        rb0 rb0Var = this.d;
        rb0Var.j(iv2Var.a, str, str2, null);
        CharSequence charSequence2 = this.h;
        ema emaVar = this.b;
        if (charSequence2 != null) {
            emaVar.l(charSequence2, true);
        } else {
            iv2 iv2Var2 = this.f;
            emaVar.l(lv2.m(0, iv2Var2.i, iv2Var2.j), false);
        }
        int i = aob.y6;
        Integer valueOf = Integer.valueOf(i);
        ema emaVar2 = this.c;
        emaVar2.setTag(valueOf);
        yob.W(emaVar2, i, null);
        iv2 iv2Var3 = this.f;
        int i2 = iv2Var3.l;
        if (i2 > 0) {
            emaVar2.l(ob6.G(i2, "TelegramContacts", new Object[0]), false);
        } else {
            emaVar2.l((CharSequence) iv2Var3.e.get(0), false);
        }
        this.a.setImageDrawable(rb0Var);
    }

    public iv2 getContact() {
        return this.f;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void updateColors() {
        try {
            int w0 = (((((((((((((aob.w0(null, aob.J7, false) * 31) + aob.w0(null, aob.O7, false)) * 31) + aob.w0(null, aob.P7, false)) * 31) + aob.w0(null, aob.Q7, false)) * 31) + aob.w0(null, aob.R7, false)) * 31) + aob.w0(null, aob.S7, false)) * 31) + aob.w0(null, aob.T7, false)) * 31) + aob.w0(null, aob.U7, false);
            if (w0 != this.n) {
                this.n = w0;
                de0 de0Var = this.a;
                if (de0Var != null) {
                    de0Var.invalidate();
                }
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
