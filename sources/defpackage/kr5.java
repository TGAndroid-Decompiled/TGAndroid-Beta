package defpackage;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.HashSet;
public final class kr5 extends FrameLayout implements tjb {
    public final be0 a;
    public final jia b;
    public final jia c;
    public final pb0 d;
    public final wf2 e;
    public nu2 f;
    public CharSequence h;
    public int n;

    public kr5(Context context, boolean z) {
        super(context);
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        float f;
        this.d = new pb0((wjb) null);
        be0 be0Var = new be0(context);
        this.a = be0Var;
        be0Var.setRoundRadius(gl.L(23.0f));
        if (k96.a0) {
            i = 5;
        } else {
            i = 3;
        }
        addView(be0Var, nme.d(46, 46.0f, i | 48, 13.0f, 6.0f, 13.0f, 6.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        boolean z2 = k96.a0;
        if (z2) {
            i2 = 0;
        } else {
            i2 = 72;
        }
        addView(linearLayout, nme.d(-1, -1.0f, 119, i2, 0.0f, z2 ? 72 : 0, 0.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        linearLayout.addView(frameLayout, nme.l(1.0f, 0, 58));
        jia jiaVar = new jia(context);
        this.b = jiaVar;
        zkb.W(jiaVar, bkb.F6, null);
        jiaVar.setTypeface(gl.o());
        jiaVar.setTextSize(15);
        if (k96.a0) {
            i3 = 5;
        } else {
            i3 = 3;
        }
        jiaVar.setGravity(i3 | 48);
        if (k96.a0) {
            i4 = 5;
        } else {
            i4 = 3;
        }
        frameLayout.addView(jiaVar, nme.d(-1, 20.0f, i4 | 48, 0.0f, 9.0f, 0.0f, 0.0f));
        jia jiaVar2 = new jia(context);
        this.c = jiaVar2;
        jiaVar2.setTextSize(13);
        if (k96.a0) {
            i5 = 5;
        } else {
            i5 = 3;
        }
        jiaVar2.setGravity(i5 | 48);
        if (k96.a0) {
            i6 = 5;
        } else {
            i6 = 3;
        }
        frameLayout.addView(jiaVar2, nme.d(-1, 20.0f, i6 | 48, 0.0f, 33.0f, 0.0f, 0.0f));
        if (z) {
            wf2 wf2Var = new wf2(21, null, context);
            this.e = wf2Var;
            wf2Var.b(-1, bkb.c6, bkb.j7);
            wf2Var.setDrawUnchecked(false);
            wf2Var.setDrawBackgroundAsArc(3);
            boolean z3 = k96.a0;
            int i7 = (z3 ? 5 : 3) | 48;
            if (z3) {
                f = 0.0f;
            } else {
                f = 40.0f;
            }
            addView(wf2Var, nme.d(24, 24.0f, i7, f, 32.0f, z3 ? 39.0f : 0.0f, 0.0f));
            return;
        }
        this.e = null;
        ls8 ls8Var = new ls8(context);
        ls8Var.setText(k96.M0(2131748982, null));
        ls8Var.setTextSize(1, 14.0f);
        zkb.X(ls8Var, bkb.Ii, null);
        ls8Var.setProgressColor(bkb.w0(null, bkb.Di, false));
        int i8 = bkb.Xl;
        ff0 e = sjb.e(bkb.w0(null, i8, false), 16.0f);
        vkb M = zkb.M(i8);
        vkb e2 = zkb.e(i8);
        ls8Var.setBackground(e);
        zkb.j(ls8Var, e, M, e2, null);
        ls8Var.setPadding(gl.L(14.0f), 0, gl.L(14.0f), 0);
        linearLayout.addView(ls8Var, nme.q(-2, 28, 0.0f, 16, 18, 0, 18, 0));
        ls8Var.setOnClickListener(new b95(this, (byte) 10));
    }

    public final void a(nu2 nu2Var, CharSequence charSequence) {
        this.f = nu2Var;
        this.h = charSequence;
        if (nu2Var == null) {
            return;
        }
        String str = nu2Var.i;
        String str2 = nu2Var.j;
        pb0 pb0Var = this.d;
        pb0Var.j(nu2Var.a, str, str2, null);
        CharSequence charSequence2 = this.h;
        jia jiaVar = this.b;
        if (charSequence2 != null) {
            jiaVar.l(charSequence2, true);
        } else {
            nu2 nu2Var2 = this.f;
            jiaVar.l(qu2.m(0, nu2Var2.i, nu2Var2.j), false);
        }
        int i = bkb.x6;
        Integer valueOf = Integer.valueOf(i);
        jia jiaVar2 = this.c;
        jiaVar2.setTag(valueOf);
        zkb.W(jiaVar2, i, null);
        nu2 nu2Var3 = this.f;
        int i2 = nu2Var3.l;
        if (i2 > 0) {
            jiaVar2.l(k96.G(i2, "TelegramContacts", new Object[0]), false);
        } else {
            jiaVar2.l((CharSequence) nu2Var3.e.get(0), false);
        }
        this.a.setImageDrawable(pb0Var);
    }

    public nu2 getContact() {
        return this.f;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void updateColors() {
        try {
            int w0 = (((((((((((((bkb.w0(null, bkb.I7, false) * 31) + bkb.w0(null, bkb.N7, false)) * 31) + bkb.w0(null, bkb.O7, false)) * 31) + bkb.w0(null, bkb.P7, false)) * 31) + bkb.w0(null, bkb.Q7, false)) * 31) + bkb.w0(null, bkb.R7, false)) * 31) + bkb.w0(null, bkb.S7, false)) * 31) + bkb.w0(null, bkb.T7, false);
            if (w0 != this.n) {
                this.n = w0;
                be0 be0Var = this.a;
                if (be0Var != null) {
                    be0Var.invalidate();
                }
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
