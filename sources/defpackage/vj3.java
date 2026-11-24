package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.util.ArrayList;
public class vj3 extends l5c {
    public final int Q;
    public final int R;
    public final boolean S;
    public final uj3 T;
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
    public final qj3 i0;
    public boolean j0;
    public final hj3 k0;

    public vj3(o39 o39Var, Context context, int i, int i2, boolean z, wjb wjbVar) {
        super(o39Var, context, i, 0, true, null, wjbVar);
        this.U = new ArrayList();
        this.V = new ArrayList();
        this.W = new ArrayList();
        this.i0 = new qj3(this, (byte) 0);
        this.j0 = true;
        this.k0 = new hj3(this, (byte) 1);
        this.w = new w72(this, (byte) 19);
        this.Q = i;
        this.R = i2;
        this.S = z;
        this.T = new uj3(i, new qj3(this, (byte) 1));
        this.Z = gl.E2(gl.O2(k96.M0(2131754174, null), -1, 0, new fe0(this, wjbVar, context), null), true);
        O(false);
        hq6.d0(i).O0(true);
    }

    public final void W() {
        boolean isEmpty = TextUtils.isEmpty(this.h0);
        o39 o39Var = this.d;
        if (!isEmpty) {
            if (this.e0 && !this.c0 && o39Var != null) {
                int i = 0;
                while (true) {
                    if (i >= o39Var.getChildCount()) {
                        break;
                    } else if (o39Var.getChildAt(i) instanceof pi4) {
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
                if (o39Var != null) {
                    for (int i2 = 0; i2 < o39Var.getChildCount(); i2++) {
                        if (!(o39Var.getChildAt(i2) instanceof pi4)) {
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vj3.X(boolean):void");
    }
}
