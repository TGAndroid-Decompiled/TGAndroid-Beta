package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.util.ArrayList;
public class gl3 extends l7c {
    public final int Q;
    public final int R;
    public final boolean S;
    public final fl3 T;
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
    public final bl3 i0;
    public boolean j0;
    public final sk3 k0;

    public gl3(r59 r59Var, Context context, int i, int i2, boolean z, ylb ylbVar) {
        super(r59Var, context, i, 0, true, null, ylbVar);
        this.U = new ArrayList();
        this.V = new ArrayList();
        this.W = new ArrayList();
        this.i0 = new bl3(this, (byte) 0);
        this.j0 = true;
        this.k0 = new sk3(this, (byte) 1);
        this.w = new h92(this, (byte) 19);
        this.Q = i;
        this.R = i2;
        this.S = z;
        this.T = new fl3(i, new bl3(this, (byte) 1));
        this.Z = gm.D2(gm.N2(jb6.M0(2131754142, null), -1, 0, new ff0(this, ylbVar, context), null), true);
        O(false);
        hs6.d0(i).O0(true);
    }

    public final void W() {
        boolean isEmpty = TextUtils.isEmpty(this.h0);
        r59 r59Var = this.d;
        if (!isEmpty) {
            if (this.e0 && !this.c0 && r59Var != null) {
                int i = 0;
                while (true) {
                    if (i >= r59Var.getChildCount()) {
                        break;
                    } else if (r59Var.getChildAt(i) instanceof tk4) {
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
                if (r59Var != null) {
                    for (int i2 = 0; i2 < r59Var.getChildCount(); i2++) {
                        if (!(r59Var.getChildAt(i2) instanceof tk4)) {
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gl3.X(boolean):void");
    }
}
