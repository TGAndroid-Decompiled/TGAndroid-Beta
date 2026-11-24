package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class e22 extends j39 {
    public final int r = y6c.t0;
    public final Context s;
    public final k22 w;

    public e22(k22 k22Var, Context context) {
        this.w = k22Var;
        this.s = context;
    }

    @Override
    public final int M(int i) {
        if (i == 0 || i == R() - 1) {
            return 1;
        }
        int i2 = i - 1;
        int i3 = this.r;
        HashMap hashMap = qu2.r(i3).c0;
        ArrayList arrayList = qu2.r(i3).d0;
        if (i2 < arrayList.size()) {
            return ((ArrayList) hashMap.get(arrayList.get(i2))).size();
        }
        return 0;
    }

    @Override
    public final Object O(int i, int i2) {
        if (i == 0) {
            return null;
        }
        int i3 = i - 1;
        int i4 = this.r;
        HashMap hashMap = qu2.r(i4).c0;
        ArrayList arrayList = qu2.r(i4).d0;
        if (i3 < arrayList.size()) {
            ArrayList arrayList2 = (ArrayList) hashMap.get(arrayList.get(i3));
            if (i2 < arrayList2.size()) {
                return arrayList2.get(i2);
            }
        }
        return null;
    }

    @Override
    public final int P(int i, int i2) {
        if (i == 0) {
            return 1;
        }
        if (i == R() - 1) {
            return 2;
        }
        return 0;
    }

    @Override
    public final int R() {
        return qu2.r(this.r).d0.size() + 2;
    }

    @Override
    public final boolean V(int i, int i2, s49 s49Var) {
        if (i != 0 && i != R() - 1) {
            int i3 = this.r;
            if (i2 < ((ArrayList) qu2.r(i3).c0.get(qu2.r(i3).d0.get(i - 1))).size()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void W(int i, int i2, s49 s49Var) {
        TLRPC.User user;
        if (s49Var.f == 0) {
            j22 j22Var = (j22) s49Var.a;
            Object O = O(i, i2);
            boolean z = true;
            if (i == R() - 2 && i2 == M(i) - 1) {
                z = false;
            }
            if (O instanceof nu2) {
                nu2 nu2Var = (nu2) O;
                user = nu2Var.m;
                if (user == null) {
                    j22Var.setCurrentId(nu2Var.a);
                    j22Var.a(null, qu2.m(0, nu2Var.i, nu2Var.j), new c22(nu2Var, (byte) 0), z);
                    user = null;
                }
            } else {
                user = (TLRPC.User) O;
            }
            if (user != null) {
                j22Var.a(user, null, new d22(user, (byte) 0), z);
            }
            boolean containsKey = this.w.x.containsKey(a22.a(O));
            wf2 wf2Var = j22Var.d;
            if (wf2Var.getVisibility() != 0) {
                wf2Var.setVisibility(0);
            }
            wf2Var.a(containsKey, false);
        }
    }

    @Override
    public final void f() {
        X(false);
        this.w.S();
    }

    @Override
    public final s49 x(ViewGroup viewGroup, int i) {
        View j22Var;
        Context context = this.s;
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
            j22Var = new j22(context, this.w.a);
        }
        return new s49(j22Var);
    }
}
