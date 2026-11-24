package defpackage;

import android.app.Activity;
import android.graphics.Paint;
import android.widget.LinearLayout;
import org.telegram.ui.ActionBar.d;
public final class je3 extends fy0 {
    public final ie3 S1;
    public final l61 T1;
    public final lv6 U1;
    public g61 V1;
    public final f15[] W1;
    public final ag2[] X1;
    public final LinearLayout Y1;
    public final d61 Z1;
    public final long a2;
    public final v61 b2;

    public je3(r61 r61Var, l61 l61Var, v61 v61Var, lv6 lv6Var) {
        super((d) r61Var, false, !v61Var.h(), (wjb) null);
        String M0;
        int i;
        long j;
        String str;
        ?? r6 = 1;
        String str2 = null;
        int i2 = 8;
        this.W1 = new f15[8];
        this.X1 = new ag2[8];
        this.U1 = lv6Var;
        this.T1 = l61Var;
        this.b2 = v61Var;
        this.a2 = l61Var.a;
        this.r0 = false;
        W0();
        this.r0 = true;
        this.u1 = 0.2f;
        Activity parentActivity = r61Var.getParentActivity();
        K();
        this.w0 = false;
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        this.Y1 = linearLayout;
        linearLayout.setOrientation(1);
        ie3 ie3Var = new ie3(getContext(), l61Var.a, lv6Var);
        this.S1 = ie3Var;
        linearLayout.addView(ie3Var, nme.t(-2, -2, 1, 0, 16, 0, 16));
        int i3 = 0;
        ag2 ag2Var = null;
        while (i3 < i2) {
            if (i3 == 0) {
                M0 = k96.M0(2131748571, str2);
                i = bkb.bk;
            } else if (i3 == r6) {
                M0 = k96.M0(2131748567, str2);
                i = bkb.Xj;
            } else if (i3 == 2) {
                M0 = k96.M0(2131748576, str2);
                i = bkb.Yj;
            } else if (i3 == 3) {
                M0 = k96.M0(2131748573, str2);
                i = bkb.Zj;
            } else if (i3 == 4) {
                M0 = k96.M0(2131748583, str2);
                i = bkb.ck;
            } else if (i3 == 5) {
                M0 = k96.M0(2131748569, str2);
                i = bkb.dk;
            } else if (i3 == 7) {
                M0 = k96.M0(2131748568, str2);
                i = bkb.ek;
            } else {
                M0 = k96.M0(2131748574, str2);
                i = bkb.fk;
            }
            String str3 = M0;
            int i4 = i;
            m61 m61Var = (m61) l61Var.d.get(i3);
            Activity activity = parentActivity;
            if (m61Var != null) {
                j = m61Var.a;
            } else {
                j = 0;
            }
            int i5 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
            f15[] f15VarArr = this.W1;
            if (i5 > 0) {
                ?? obj = new Object();
                Paint paint = new Paint((int) r6);
                obj.e = paint;
                obj.b = r6;
                obj.c = false;
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(gl.L(5.0f));
                paint.setStrokeCap(Paint.Cap.ROUND);
                paint.setStrokeJoin(Paint.Join.ROUND);
                f15VarArr[i3] = obj;
                f15 f15Var = this.W1[i3];
                f15Var.d = j;
                f15Var.a = i4;
                parentActivity = activity;
                ag2 ag2Var2 = new ag2(parentActivity, 4, 21, false, null);
                ag2Var2.setTag(Integer.valueOf(i3));
                ag2Var2.setBackgroundDrawable(bkb.L0(false));
                this.Y1.addView(ag2Var2, nme.o(-1, 50));
                ag2Var2.e(str3, gl.i0(j, false, false), true, true, false);
                if (ag2Var2.getTextView() != null) {
                    zkb.X(ag2Var2.getTextView(), bkb.i5, null);
                } else {
                    ag2Var2.setTextColor(bkb.w0(null, bkb.i5, false));
                }
                int i6 = bkb.j7;
                wf2 wf2Var = ag2Var2.r;
                if (wf2Var != null) {
                    wf2Var.b(i4, i4, i6);
                }
                ag2Var2.setOnClickListener(new kb1(this, v61Var, (byte) 29));
                this.X1[i3] = ag2Var2;
                ag2Var = ag2Var2;
                str = null;
            } else {
                str = str2;
                parentActivity = activity;
                f15VarArr[i3] = str;
                this.X1[i3] = str;
            }
            i3++;
            str2 = str;
            i2 = 8;
            r6 = 1;
        }
        if (ag2Var != null) {
            ag2Var.setNeedDivider(false);
        }
        ie3 ie3Var2 = this.S1;
        f15[] f15VarArr2 = this.W1;
        ie3Var2.b = f15VarArr2;
        ie3Var2.G = v61Var;
        ie3Var2.invalidate();
        ie3Var2.c = new float[f15VarArr2.length];
        ie3Var2.d = new float[f15VarArr2.length];
        ie3Var2.e = new float[f15VarArr2.length];
        ie3Var2.c(false);
        if (ie3Var2.E > 1) {
            ie3Var2.f = 0.0f;
        } else {
            ie3Var2.f = 1.0f;
        }
        d61 d61Var = new d61(this, getContext(), r61Var);
        this.Z1 = d61Var;
        int L = gl.L(80.0f);
        if (d61Var.x == null) {
            d61Var.w = L;
            int i7 = 0;
            while (true) {
                wec wecVar = d61Var.n;
                if (i7 >= wecVar.getViewPages().length) {
                    break;
                }
                o39 a = d61Var.a(wecVar.getViewPages()[i7]);
                if (a != null) {
                    a.setPadding(a.getPaddingLeft(), 0, a.getPaddingRight(), L);
                }
                i7++;
            }
        }
        this.Z1.setCacheModel(v61Var);
        this.Z1.setDelegate(new tg2(this, v61Var, false, (byte) 23));
        zx0 zx0Var = this.t1;
        if (zx0Var != null) {
            zx0Var.setChildLayout(this.Z1);
        } else {
            Y0();
            this.Y1.addView(this.V1, nme.r(-1, 72, 80));
        }
        if (this.V1 != null) {
            this.V1.a(this.S1.a(), true);
        }
    }

    @Override
    public final n39 G0(o39 o39Var) {
        return new gx0(this, (byte) 1);
    }

    @Override
    public final CharSequence J0() {
        return this.r1.getMessagesController().a1(this.a2);
    }

    @Override
    public final void P0(cja cjaVar) {
        this.n1.j(new ao2(this, (byte) 4));
        if (this.t1 != null) {
            Y0();
            cjaVar.addView(this.V1, nme.e(-1, 72, 80));
        }
    }

    public final void Y0() {
        g61 g61Var = new g61(getContext());
        this.V1 = g61Var;
        g61Var.a.setOnClickListener(new x91(this, (byte) 27));
        ie3 ie3Var = this.S1;
        if (ie3Var != null) {
            this.V1.a(ie3Var.a(), true);
        }
    }
}
