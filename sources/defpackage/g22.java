package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class g22 extends n39 {
    public final Context c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public f22 f;
    public int h;
    public final k22 n;

    public g22(k22 k22Var, Context context) {
        this.n = k22Var;
        this.c = context;
    }

    @Override
    public final boolean D(s49 s49Var) {
        if (s49Var.f == 0) {
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
        this.n.S();
    }

    @Override
    public final void t(s49 s49Var, int i) {
        boolean z;
        TLRPC.User user;
        if (s49Var.f == 0) {
            j22 j22Var = (j22) s49Var.a;
            if (i != b() - 2) {
                z = true;
            } else {
                z = false;
            }
            Object E = E(i);
            if (E instanceof nu2) {
                nu2 nu2Var = (nu2) E;
                user = nu2Var.m;
                if (user == null) {
                    j22Var.setCurrentId(nu2Var.a);
                    j22Var.a(null, (CharSequence) this.e.get(i - 1), new c22(nu2Var, (byte) 1), z);
                    user = null;
                }
            } else {
                user = (TLRPC.User) E;
            }
            if (user != null) {
                j22Var.a(user, (CharSequence) this.e.get(i - 1), new d22(user, (byte) 1), z);
            }
            boolean containsKey = this.n.x.containsKey(a22.a(E));
            wf2 wf2Var = j22Var.d;
            if (wf2Var.getVisibility() != 0) {
                wf2Var.setVisibility(0);
            }
            wf2Var.a(containsKey, false);
        }
    }

    @Override
    public final s49 x(ViewGroup viewGroup, int i) {
        View j22Var;
        Context context = this.c;
        if (i != 0) {
            if (i != 1) {
                j22Var = new View(context);
                j22Var.setTag(-33024);
            } else {
                j22Var = new View(context);
                j22Var.setLayoutParams(new e49(-1, gl.L(56.0f)));
                j22Var.setTag(-33024);
            }
        } else {
            j22Var = new j22(context, this.n.a);
        }
        return new s49(j22Var);
    }
}
