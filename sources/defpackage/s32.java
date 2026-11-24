package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class s32 extends q59 {
    public final Context c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public r32 f;
    public int h;
    public final w32 n;

    public s32(w32 w32Var, Context context) {
        this.n = w32Var;
        this.c = context;
    }

    @Override
    public final boolean D(u69 u69Var) {
        if (u69Var.f == 0) {
            return true;
        }
        return false;
    }

    public final Object E(int i) {
        int i2 = i - 1;
        if (i2 >= 0 && i2 < this.d.size()) {
            return this.d.get(i2);
        }
        return null;
    }

    @Override
    public final int b() {
        return this.d.size() + 2;
    }

    @Override
    public final int d(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == b() - 1) {
            return 2;
        }
        return 0;
    }

    @Override
    public final void f() {
        super.f();
        this.n.R();
    }

    @Override
    public final void t(u69 u69Var, int i) {
        boolean z;
        TLRPC.User user;
        if (u69Var.f == 0) {
            v32 v32Var = (v32) u69Var.a;
            if (i != b() - 2) {
                z = true;
            } else {
                z = false;
            }
            Object E = E(i);
            if (E instanceof yv2) {
                yv2 yv2Var = (yv2) E;
                user = yv2Var.m;
                if (user == null) {
                    v32Var.setCurrentId(yv2Var.a);
                    v32Var.a(null, (CharSequence) this.e.get(i - 1), new o32(yv2Var, (byte) 1), z);
                    user = null;
                }
            } else {
                user = (TLRPC.User) E;
            }
            if (user != null) {
                v32Var.a(user, (CharSequence) this.e.get(i - 1), new p32(user, (byte) 1), z);
            }
            boolean containsKey = this.n.x.containsKey(m32.a(E));
            jh2 jh2Var = v32Var.d;
            if (jh2Var.getVisibility() != 0) {
                jh2Var.setVisibility(0);
            }
            jh2Var.a(containsKey, false);
        }
    }

    @Override
    public final u69 x(ViewGroup viewGroup, int i) {
        View v32Var;
        Context context = this.c;
        if (i != 0) {
            if (i != 1) {
                v32Var = new View(context);
                v32Var.setTag(-33024);
            } else {
                v32Var = new View(context);
                v32Var.setLayoutParams(new g69(-1, gm.L(56.0f)));
                v32Var.setTag(-33024);
            }
        } else {
            v32Var = new v32(context, this.n.a);
        }
        return new u69(v32Var);
    }
}
