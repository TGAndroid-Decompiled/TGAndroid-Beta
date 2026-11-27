package defpackage;

import android.app.Activity;
import android.graphics.Paint;
import android.widget.LinearLayout;
import org.telegram.ui.ActionBar.e;
public final class df3 extends ny0 {
    public final cf3 S1;
    public final t61 T1;
    public final qx6 U1;
    public o61 V1;
    public final j35[] W1;
    public final sg2[] X1;
    public final LinearLayout Y1;
    public final l61 Z1;
    public final long a2;
    public final d71 b2;

    public df3(z61 z61Var, t61 t61Var, d71 d71Var, qx6 qx6Var) {
        super((e) z61Var, false, !d71Var.h(), (vnb) null);
        String M0;
        int i;
        long j;
        String str;
        ?? r6 = 1;
        String str2 = null;
        int i2 = 8;
        this.W1 = new j35[8];
        this.X1 = new sg2[8];
        this.U1 = qx6Var;
        this.T1 = t61Var;
        this.b2 = d71Var;
        this.a2 = t61Var.a;
        this.r0 = false;
        X0();
        this.r0 = true;
        this.u1 = 0.2f;
        Activity parentActivity = z61Var.getParentActivity();
        J();
        this.w0 = false;
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        this.Y1 = linearLayout;
        linearLayout.setOrientation(1);
        cf3 cf3Var = new cf3(getContext(), t61Var.a, qx6Var);
        this.S1 = cf3Var;
        linearLayout.addView(cf3Var, tre.t(-2, -2, 1, 0, 16, 0, 16));
        int i3 = 0;
        sg2 sg2Var = null;
        while (i3 < i2) {
            if (i3 == 0) {
                M0 = ob6.M0(2131748517, str2);
                i = aob.ck;
            } else if (i3 == r6) {
                M0 = ob6.M0(2131748513, str2);
                i = aob.Yj;
            } else if (i3 == 2) {
                M0 = ob6.M0(2131748522, str2);
                i = aob.Zj;
            } else if (i3 == 3) {
                M0 = ob6.M0(2131748519, str2);
                i = aob.ak;
            } else if (i3 == 4) {
                M0 = ob6.M0(2131748529, str2);
                i = aob.dk;
            } else if (i3 == 5) {
                M0 = ob6.M0(2131748515, str2);
                i = aob.ek;
            } else if (i3 == 7) {
                M0 = ob6.M0(2131748514, str2);
                i = aob.fk;
            } else {
                M0 = ob6.M0(2131748520, str2);
                i = aob.gk;
            }
            String str3 = M0;
            int i4 = i;
            u61 u61Var = (u61) t61Var.d.get(i3);
            Activity activity = parentActivity;
            if (u61Var != null) {
                j = u61Var.a;
            } else {
                j = 0;
            }
            int i5 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
            j35[] j35VarArr = this.W1;
            if (i5 > 0) {
                ?? obj = new Object();
                Paint paint = new Paint((int) r6);
                obj.e = paint;
                obj.b = r6;
                obj.c = false;
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(hl.L(5.0f));
                paint.setStrokeCap(Paint.Cap.ROUND);
                paint.setStrokeJoin(Paint.Join.ROUND);
                j35VarArr[i3] = obj;
                j35 j35Var = this.W1[i3];
                j35Var.d = j;
                j35Var.a = i4;
                parentActivity = activity;
                sg2 sg2Var2 = new sg2(parentActivity, 4, 21, false, null);
                sg2Var2.setTag(Integer.valueOf(i3));
                sg2Var2.setBackgroundDrawable(aob.L0(false));
                this.Y1.addView(sg2Var2, tre.o(-1, 50));
                sg2Var2.e(str3, hl.i0(j, false, false), true, true, false);
                if (sg2Var2.getTextView() != null) {
                    yob.X(sg2Var2.getTextView(), aob.j5, null);
                } else {
                    sg2Var2.setTextColor(aob.w0(null, aob.j5, false));
                }
                int i6 = aob.k7;
                og2 og2Var = sg2Var2.r;
                if (og2Var != null) {
                    og2Var.b(i4, i4, i6);
                }
                sg2Var2.setOnClickListener(new je3(this, d71Var, (byte) 1));
                this.X1[i3] = sg2Var2;
                sg2Var = sg2Var2;
                str = null;
            } else {
                str = str2;
                parentActivity = activity;
                j35VarArr[i3] = str;
                this.X1[i3] = str;
            }
            i3++;
            str2 = str;
            i2 = 8;
            r6 = 1;
        }
        if (sg2Var != null) {
            sg2Var.setNeedDivider(false);
        }
        cf3 cf3Var2 = this.S1;
        j35[] j35VarArr2 = this.W1;
        cf3Var2.b = j35VarArr2;
        cf3Var2.G = d71Var;
        cf3Var2.invalidate();
        cf3Var2.c = new float[j35VarArr2.length];
        cf3Var2.d = new float[j35VarArr2.length];
        cf3Var2.e = new float[j35VarArr2.length];
        cf3Var2.c(false);
        if (cf3Var2.E > 1) {
            cf3Var2.f = 0.0f;
        } else {
            cf3Var2.f = 1.0f;
        }
        l61 l61Var = new l61(this, getContext(), z61Var);
        this.Z1 = l61Var;
        int L = hl.L(80.0f);
        if (l61Var.x == null) {
            l61Var.w = L;
            int i7 = 0;
            while (true) {
                vic vicVar = l61Var.n;
                if (i7 >= vicVar.getViewPages().length) {
                    break;
                }
                d79 a = l61Var.a(vicVar.getViewPages()[i7]);
                if (a != null) {
                    a.setPadding(a.getPaddingLeft(), 0, a.getPaddingRight(), L);
                }
                i7++;
            }
        }
        this.Z1.setCacheModel(d71Var);
        this.Z1.setDelegate(new lh2(this, d71Var, false, (byte) 23));
        hy0 hy0Var = this.t1;
        if (hy0Var != null) {
            hy0Var.setChildLayout(this.Z1);
        } else {
            Z0();
            this.Y1.addView(this.V1, tre.r(-1, 72, 80));
        }
        if (this.V1 != null) {
            this.V1.a(this.S1.a(), true);
        }
    }

    @Override
    public final c79 H0(d79 d79Var) {
        return new ox0(this, (byte) 1);
    }

    @Override
    public final CharSequence K0() {
        return this.r1.getMessagesController().c1(this.a2);
    }

    @Override
    public final void Q0(wma wmaVar) {
        this.n1.j(new to2(this, (byte) 4));
        if (this.t1 != null) {
            Z0();
            wmaVar.addView(this.V1, tre.e(-1, 72, 80));
        }
    }

    public final void Z0() {
        o61 o61Var = new o61(getContext());
        this.V1 = o61Var;
        o61Var.a.setOnClickListener(new r81(this, (byte) 29));
        cf3 cf3Var = this.S1;
        if (cf3Var != null) {
            this.V1.a(cf3Var.a(), true);
        }
    }
}
