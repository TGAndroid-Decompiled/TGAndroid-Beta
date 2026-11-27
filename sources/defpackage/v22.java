package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class v22 extends y69 {
    public final int r = yac.t0;
    public final Context s;
    public final b32 w;

    public v22(b32 b32Var, Context context) {
        this.w = b32Var;
        this.s = context;
    }

    @Override
    public final int M(int i) {
        if (i == 0 || i == R() - 1) {
            return 1;
        }
        int i2 = i - 1;
        int i3 = this.r;
        HashMap hashMap = lv2.r(i3).c0;
        ArrayList arrayList = lv2.r(i3).d0;
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
        HashMap hashMap = lv2.r(i4).c0;
        ArrayList arrayList = lv2.r(i4).d0;
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
        return lv2.r(this.r).d0.size() + 2;
    }

    @Override
    public final boolean V(int i, int i2, f89 f89Var) {
        if (i != 0 && i != R() - 1) {
            int i3 = this.r;
            if (i2 < ((ArrayList) lv2.r(i3).c0.get(lv2.r(i3).d0.get(i - 1))).size()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void W(int i, int i2, f89 f89Var) {
        TLRPC.User user;
        if (f89Var.f == 0) {
            a32 a32Var = (a32) f89Var.a;
            Object O = O(i, i2);
            boolean z = true;
            if (i == R() - 2 && i2 == M(i) - 1) {
                z = false;
            }
            if (O instanceof iv2) {
                iv2 iv2Var = (iv2) O;
                user = iv2Var.m;
                if (user == null) {
                    a32Var.setCurrentId(iv2Var.a);
                    a32Var.a(null, lv2.m(0, iv2Var.i, iv2Var.j), new t22(iv2Var, (byte) 0), z);
                    user = null;
                }
            } else {
                user = (TLRPC.User) O;
            }
            if (user != null) {
                a32Var.a(user, null, new u22(user, (byte) 0), z);
            }
            boolean containsKey = this.w.x.containsKey(r22.a(O));
            og2 og2Var = a32Var.d;
            if (og2Var.getVisibility() != 0) {
                og2Var.setVisibility(0);
            }
            og2Var.a(containsKey, false);
        }
    }

    @Override
    public final void f() {
        X(false);
        this.w.R();
    }

    @Override
    public final f89 x(ViewGroup viewGroup, int i) {
        View a32Var;
        Context context = this.s;
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
            a32Var = new a32(context, this.w.a);
        }
        return new f89(a32Var);
    }
}
