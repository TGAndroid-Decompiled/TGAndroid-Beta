package defpackage;

import android.app.Activity;
import android.graphics.Paint;
import android.widget.LinearLayout;
import org.telegram.ui.ActionBar.d;
public final class wf3 extends mz0 {
    public final vf3 S1;
    public final s71 T1;
    public final hi2 U1;
    public n71 V1;
    public final f35[] W1;
    public final oh2[] X1;
    public final LinearLayout Y1;
    public final k71 Z1;
    public final long a2;
    public final c81 b2;

    public wf3(y71 y71Var, s71 s71Var, c81 c81Var, hi2 hi2Var) {
        super((d) y71Var, false, !c81Var.h(), (ylb) null);
        String M0;
        int i;
        long j;
        String str;
        ?? r6 = 1;
        String str2 = null;
        int i2 = 8;
        this.W1 = new f35[8];
        this.X1 = new oh2[8];
        this.U1 = hi2Var;
        this.T1 = s71Var;
        this.b2 = c81Var;
        this.a2 = s71Var.a;
        this.r0 = false;
        W0();
        this.r0 = true;
        this.u1 = 0.2f;
        Activity parentActivity = y71Var.getParentActivity();
        J();
        this.w0 = false;
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        this.Y1 = linearLayout;
        linearLayout.setOrientation(1);
        vf3 vf3Var = new vf3(getContext(), s71Var.a, hi2Var);
        this.S1 = vf3Var;
        linearLayout.addView(vf3Var, qoe.t(-2, -2, 1, 0, 16, 0, 16));
        int i3 = 0;
        oh2 oh2Var = null;
        while (i3 < i2) {
            if (i3 == 0) {
                M0 = jb6.M0(2131748520, str2);
                i = cmb.bk;
            } else if (i3 == r6) {
                M0 = jb6.M0(2131748516, str2);
                i = cmb.Xj;
            } else if (i3 == 2) {
                M0 = jb6.M0(2131748525, str2);
                i = cmb.Yj;
            } else if (i3 == 3) {
                M0 = jb6.M0(2131748522, str2);
                i = cmb.Zj;
            } else if (i3 == 4) {
                M0 = jb6.M0(2131748532, str2);
                i = cmb.ck;
            } else if (i3 == 5) {
                M0 = jb6.M0(2131748518, str2);
                i = cmb.dk;
            } else if (i3 == 7) {
                M0 = jb6.M0(2131748517, str2);
                i = cmb.ek;
            } else {
                M0 = jb6.M0(2131748523, str2);
                i = cmb.fk;
            }
            String str3 = M0;
            int i4 = i;
            t71 t71Var = (t71) s71Var.d.get(i3);
            Activity activity = parentActivity;
            if (t71Var != null) {
                j = t71Var.a;
            } else {
                j = 0;
            }
            int i5 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
            f35[] f35VarArr = this.W1;
            if (i5 > 0) {
                ?? obj = new Object();
                Paint paint = new Paint((int) r6);
                obj.e = paint;
                obj.b = r6;
                obj.c = false;
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(gm.L(5.0f));
                paint.setStrokeCap(Paint.Cap.ROUND);
                paint.setStrokeJoin(Paint.Join.ROUND);
                f35VarArr[i3] = obj;
                f35 f35Var = this.W1[i3];
                f35Var.d = j;
                f35Var.a = i4;
                parentActivity = activity;
                oh2 oh2Var2 = new oh2(parentActivity, 4, 21, false, null);
                oh2Var2.setTag(Integer.valueOf(i3));
                oh2Var2.setBackgroundDrawable(cmb.L0(false));
                this.Y1.addView(oh2Var2, qoe.o(-1, 50));
                oh2Var2.e(str3, gm.i0(j, false, false), true, true, false);
                if (oh2Var2.getTextView() != null) {
                    anb.X(oh2Var2.getTextView(), cmb.i5, null);
                } else {
                    oh2Var2.setTextColor(cmb.w0(null, cmb.i5, false));
                }
                int i6 = cmb.j7;
                jh2 jh2Var = oh2Var2.r;
                if (jh2Var != null) {
                    jh2Var.b(i4, i4, i6);
                }
                oh2Var2.setOnClickListener(new tf3(this, c81Var, (byte) 0));
                this.X1[i3] = oh2Var2;
                oh2Var = oh2Var2;
                str = null;
            } else {
                str = str2;
                parentActivity = activity;
                f35VarArr[i3] = str;
                this.X1[i3] = str;
            }
            i3++;
            str2 = str;
            i2 = 8;
            r6 = 1;
        }
        if (oh2Var != null) {
            oh2Var.setNeedDivider(false);
        }
        vf3 vf3Var2 = this.S1;
        f35[] f35VarArr2 = this.W1;
        vf3Var2.b = f35VarArr2;
        vf3Var2.G = c81Var;
        vf3Var2.invalidate();
        vf3Var2.c = new float[f35VarArr2.length];
        vf3Var2.d = new float[f35VarArr2.length];
        vf3Var2.e = new float[f35VarArr2.length];
        vf3Var2.c(false);
        if (vf3Var2.E > 1) {
            vf3Var2.f = 0.0f;
        } else {
            vf3Var2.f = 1.0f;
        }
        k71 k71Var = new k71(this, getContext(), y71Var);
        this.Z1 = k71Var;
        int L = gm.L(80.0f);
        if (k71Var.x == null) {
            k71Var.w = L;
            int i7 = 0;
            while (true) {
                wgc wgcVar = k71Var.n;
                if (i7 >= wgcVar.getViewPages().length) {
                    break;
                }
                r59 a = k71Var.a(wgcVar.getViewPages()[i7]);
                if (a != null) {
                    a.setPadding(a.getPaddingLeft(), 0, a.getPaddingRight(), L);
                }
                i7++;
            }
        }
        this.Z1.setCacheModel(c81Var);
        this.Z1.setDelegate(new lx6(this, c81Var, false, (byte) 22));
        gz0 gz0Var = this.t1;
        if (gz0Var != null) {
            gz0Var.setChildLayout(this.Z1);
        } else {
            Y0();
            this.Y1.addView(this.V1, qoe.r(-1, 72, 80));
        }
        if (this.V1 != null) {
            this.V1.a(this.S1.a(), true);
        }
    }

    @Override
    public final q59 G0(r59 r59Var) {
        return new ny0(this, (byte) 1);
    }

    @Override
    public final CharSequence J0() {
        return this.r1.getMessagesController().b1(this.a2);
    }

    @Override
    public final void P0(ela elaVar) {
        this.n1.j(new ip2(this, (byte) 5));
        if (this.t1 != null) {
            Y0();
            elaVar.addView(this.V1, qoe.e(-1, 72, 80));
        }
    }

    public final void Y0() {
        n71 n71Var = new n71(getContext());
        this.V1 = n71Var;
        n71Var.a.setOnClickListener(new sf3(this, (byte) 0));
        vf3 vf3Var = this.S1;
        if (vf3Var != null) {
            this.V1.a(vf3Var.a(), true);
        }
    }
}
