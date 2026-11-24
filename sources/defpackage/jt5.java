package defpackage;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.HashSet;
public final class jt5 extends FrameLayout implements vlb {
    public final bf0 a;
    public final lka b;
    public final lka c;
    public final pc0 d;
    public final jh2 e;
    public yv2 f;
    public CharSequence h;
    public int n;

    public jt5(Context context, boolean z) {
        super(context);
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        float f;
        this.d = new pc0((ylb) null);
        bf0 bf0Var = new bf0(context);
        this.a = bf0Var;
        bf0Var.setRoundRadius(gm.L(23.0f));
        if (jb6.a0) {
            i = 5;
        } else {
            i = 3;
        }
        addView(bf0Var, qoe.d(46, 46.0f, i | 48, 13.0f, 6.0f, 13.0f, 6.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        boolean z2 = jb6.a0;
        if (z2) {
            i2 = 0;
        } else {
            i2 = 72;
        }
        addView(linearLayout, qoe.d(-1, -1.0f, 119, i2, 0.0f, z2 ? 72 : 0, 0.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        linearLayout.addView(frameLayout, qoe.l(1.0f, 0, 58));
        lka lkaVar = new lka(context);
        this.b = lkaVar;
        anb.W(lkaVar, cmb.F6, null);
        lkaVar.setTypeface(gm.o());
        lkaVar.setTextSize(15);
        if (jb6.a0) {
            i3 = 5;
        } else {
            i3 = 3;
        }
        lkaVar.setGravity(i3 | 48);
        if (jb6.a0) {
            i4 = 5;
        } else {
            i4 = 3;
        }
        frameLayout.addView(lkaVar, qoe.d(-1, 20.0f, i4 | 48, 0.0f, 9.0f, 0.0f, 0.0f));
        lka lkaVar2 = new lka(context);
        this.c = lkaVar2;
        lkaVar2.setTextSize(13);
        if (jb6.a0) {
            i5 = 5;
        } else {
            i5 = 3;
        }
        lkaVar2.setGravity(i5 | 48);
        if (jb6.a0) {
            i6 = 5;
        } else {
            i6 = 3;
        }
        frameLayout.addView(lkaVar2, qoe.d(-1, 20.0f, i6 | 48, 0.0f, 33.0f, 0.0f, 0.0f));
        if (z) {
            jh2 jh2Var = new jh2(21, null, context);
            this.e = jh2Var;
            jh2Var.b(-1, cmb.c6, cmb.j7);
            jh2Var.setDrawUnchecked(false);
            jh2Var.setDrawBackgroundAsArc(3);
            boolean z3 = jb6.a0;
            int i7 = (z3 ? 5 : 3) | 48;
            if (z3) {
                f = 0.0f;
            } else {
                f = 40.0f;
            }
            addView(jh2Var, qoe.d(24, 24.0f, i7, f, 32.0f, z3 ? 39.0f : 0.0f, 0.0f));
            return;
        }
        this.e = null;
        mu8 mu8Var = new mu8(context);
        mu8Var.setText(jb6.M0(2131748931, null));
        mu8Var.setTextSize(1, 14.0f);
        anb.X(mu8Var, cmb.Ii, null);
        mu8Var.setProgressColor(cmb.w0(null, cmb.Di, false));
        int i8 = cmb.Xl;
        fg0 e = ulb.e(cmb.w0(null, i8, false), 16.0f);
        wmb M = anb.M(i8);
        wmb e2 = anb.e(i8);
        mu8Var.setBackground(e);
        anb.j(mu8Var, e, M, e2, null);
        mu8Var.setPadding(gm.L(14.0f), 0, gm.L(14.0f), 0);
        linearLayout.addView(mu8Var, qoe.q(-2, 28, 0.0f, 16, 18, 0, 18, 0));
        mu8Var.setOnClickListener(new ca5(this, (byte) 13));
    }

    public final void a(yv2 yv2Var, CharSequence charSequence) {
        this.f = yv2Var;
        this.h = charSequence;
        if (yv2Var == null) {
            return;
        }
        String str = yv2Var.i;
        String str2 = yv2Var.j;
        pc0 pc0Var = this.d;
        pc0Var.j(yv2Var.a, str, str2, null);
        CharSequence charSequence2 = this.h;
        lka lkaVar = this.b;
        if (charSequence2 != null) {
            lkaVar.l(charSequence2, true);
        } else {
            yv2 yv2Var2 = this.f;
            lkaVar.l(bw2.m(0, yv2Var2.i, yv2Var2.j), false);
        }
        int i = cmb.x6;
        Integer valueOf = Integer.valueOf(i);
        lka lkaVar2 = this.c;
        lkaVar2.setTag(valueOf);
        anb.W(lkaVar2, i, null);
        yv2 yv2Var3 = this.f;
        int i2 = yv2Var3.l;
        if (i2 > 0) {
            lkaVar2.l(jb6.G(i2, "TelegramContacts", new Object[0]), false);
        } else {
            lkaVar2.l((CharSequence) yv2Var3.e.get(0), false);
        }
        this.a.setImageDrawable(pc0Var);
    }

    public yv2 getContact() {
        return this.f;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void updateColors() {
        try {
            int w0 = (((((((((((((cmb.w0(null, cmb.I7, false) * 31) + cmb.w0(null, cmb.N7, false)) * 31) + cmb.w0(null, cmb.O7, false)) * 31) + cmb.w0(null, cmb.P7, false)) * 31) + cmb.w0(null, cmb.Q7, false)) * 31) + cmb.w0(null, cmb.R7, false)) * 31) + cmb.w0(null, cmb.S7, false)) * 31) + cmb.w0(null, cmb.T7, false);
            if (w0 != this.n) {
                this.n = w0;
                bf0 bf0Var = this.a;
                if (bf0Var != null) {
                    bf0Var.invalidate();
                }
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
