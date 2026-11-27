package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.util.ArrayList;
public class nk3 extends l9c {
    public final int Q;
    public final int R;
    public final boolean S;
    public final mk3 T;
    public final ArrayList U;
    public final ArrayList V;
    public final ArrayList W;
    public boolean X;
    public boolean Y;
    public final SpannableStringBuilder Z;
    public int a0;
    public int b0;
    public boolean c0;
    public boolean d0;
    public boolean e0;
    public int f0;
    public int g0;
    public String h0;
    public final ik3 i0;
    public boolean j0;
    public final zj3 k0;

    public nk3(d79 d79Var, Context context, int i, int i2, boolean z, vnb vnbVar) {
        super(d79Var, context, i, 0, true, null, vnbVar);
        this.U = new ArrayList();
        this.V = new ArrayList();
        this.W = new ArrayList();
        this.i0 = new ik3(this, (byte) 0);
        this.j0 = true;
        this.k0 = new zj3(this, (byte) 1);
        this.w = new n82(this, (byte) 19);
        this.Q = i;
        this.R = i2;
        this.S = z;
        this.T = new mk3(i, new ik3(this, (byte) 1));
        this.Z = hl.D2(hl.N2(ob6.M0(2131754170, null), -1, 0, new he0(this, vnbVar, context), null), true);
        O(false);
        ls6.d0(i).O0(true);
    }

    public final void W() {
        boolean isEmpty = TextUtils.isEmpty(this.h0);
        d79 d79Var = this.d;
        if (!isEmpty) {
            if (this.e0 && !this.c0 && d79Var != null) {
                int i = 0;
                while (true) {
                    if (i >= d79Var.getChildCount()) {
                        break;
                    } else if (d79Var.getChildAt(i) instanceof tk4) {
                        if (this.e0 && !this.c0 && !TextUtils.isEmpty(this.h0)) {
                            X(true);
                        }
                    } else {
                        i++;
                    }
                }
            }
        } else {
            if (!this.j0) {
                if (d79Var != null) {
                    for (int i2 = 0; i2 < d79Var.getChildCount(); i2++) {
                        if (!(d79Var.getChildAt(i2) instanceof tk4)) {
                        }
                    }
                }
            }
            this.T.a();
            break;
        }
        this.j0 = false;
    }

    public final void X(boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nk3.X(boolean):void");
    }
}
