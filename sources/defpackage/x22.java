package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class x22 extends c79 {
    public final Context c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public w22 f;
    public int h;
    public final b32 n;

    public x22(b32 b32Var, Context context) {
        this.n = b32Var;
        this.c = context;
    }

    @Override
    public final boolean D(f89 f89Var) {
        if (f89Var.f == 0) {
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
    public final void t(f89 f89Var, int i) {
        boolean z;
        TLRPC.User user;
        if (f89Var.f == 0) {
            a32 a32Var = (a32) f89Var.a;
            if (i != b() - 2) {
                z = true;
            } else {
                z = false;
            }
            Object E = E(i);
            if (E instanceof iv2) {
                iv2 iv2Var = (iv2) E;
                user = iv2Var.m;
                if (user == null) {
                    a32Var.setCurrentId(iv2Var.a);
                    a32Var.a(null, (CharSequence) this.e.get(i - 1), new t22(iv2Var, (byte) 1), z);
                    user = null;
                }
            } else {
                user = (TLRPC.User) E;
            }
            if (user != null) {
                a32Var.a(user, (CharSequence) this.e.get(i - 1), new u22(user, (byte) 1), z);
            }
            boolean containsKey = this.n.x.containsKey(r22.a(E));
            og2 og2Var = a32Var.d;
            if (og2Var.getVisibility() != 0) {
                og2Var.setVisibility(0);
            }
            og2Var.a(containsKey, false);
        }
    }

    @Override
    public final f89 x(ViewGroup viewGroup, int i) {
        View a32Var;
        Context context = this.c;
        if (i != 0) {
            if (i != 1) {
                a32Var = new View(context);
                a32Var.setTag(-33024);
            } else {
                a32Var = new View(context);
                a32Var.setLayoutParams(new r79(-1, hl.L(56.0f)));
                a32Var.setTag(-33024);
            }
        } else {
            a32Var = new a32(context, this.n.a);
        }
        return new f89(a32Var);
    }
}
