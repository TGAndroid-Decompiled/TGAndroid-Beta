package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
public final class qha extends c79 {
    public final Context c;
    public final ArrayList d = new ArrayList();
    public int e;
    public final eja f;

    public qha(eja ejaVar, Context context) {
        this.f = ejaVar;
        this.c = context;
        E(false);
    }

    @Override
    public final boolean D(f89 f89Var) {
        return true;
    }

    public final void E(boolean z) {
        eja ejaVar = this.f;
        long j = ejaVar.m1;
        e eVar = ejaVar.y1;
        if (eVar != null) {
            if (wf3.y(j)) {
                TLRPC.Chat M0 = uc7.s1(eVar.getCurrentAccount()).M0(Long.valueOf(-j));
                if (M0 == null || !xc2.V(M0)) {
                    return;
                }
            } else if (uc7.s1(eVar.getCurrentAccount()).X1(Long.valueOf(j)) == null) {
                return;
            }
            wb7 L0 = uc7.s1(eVar.getCurrentAccount()).L0(j);
            ArrayList arrayList = this.d;
            arrayList.clear();
            int i = 0;
            if (L0 != null) {
                ArrayList arrayList2 = L0.b;
                for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                    TLObject tLObject = (TLObject) arrayList2.get(i2);
                    if ((tLObject instanceof TLRPC.Chat) && xc2.r0((TLRPC.Chat) tLObject)) {
                        arrayList.add(tLObject);
                    } else {
                        arrayList.add(tLObject);
                    }
                }
            }
            if (!arrayList.isEmpty() && !yac.h(eVar.getCurrentAccount()).p()) {
                i = L0.c;
            }
            this.e = i;
            if (z) {
                f();
            }
        }
    }

    @Override
    public final int b() {
        return this.d.size();
    }

    @Override
    public final int d(int i) {
        if (this.e > 0 && i == this.d.size() - 1) {
            return 18;
        }
        return 17;
    }

    @Override
    public final void t(f89 f89Var, int i) {
        bv8 bv8Var;
        int i2 = f89Var.f;
        View view = f89Var.a;
        if (i2 == 17) {
            if (view instanceof bv8) {
                bv8Var = (bv8) view;
            } else {
                return;
            }
        } else if (i2 == 18) {
            if (view instanceof cia) {
                bv8Var = ((cia) view).b;
            } else {
                return;
            }
        } else {
            bv8Var = null;
        }
        bv8 bv8Var2 = bv8Var;
        if (bv8Var2 != null) {
            ArrayList arrayList = this.d;
            bv8Var2.C(arrayList.get(i), null, null, null, false, false);
            boolean z = true;
            if (i == arrayList.size() - 1) {
                z = false;
            }
            bv8Var2.N = z;
        }
    }

    @Override
    public final f89 x(ViewGroup viewGroup, int i) {
        View bv8Var;
        int currentAccount;
        boolean z;
        eja ejaVar = this.f;
        if (i == 18) {
            e eVar = ejaVar.y1;
            if (eVar == null) {
                currentAccount = yac.t0;
            } else {
                currentAccount = eVar.getCurrentAccount();
            }
            int i2 = currentAccount;
            if (ejaVar.m1 > 0) {
                z = true;
            } else {
                z = false;
            }
            boolean z2 = z;
            bv8Var = new cia(i2, this.c, z2, ejaVar.I1, new ux9(this, (byte) 23));
        } else {
            bv8Var = new bv8(this.c, ejaVar.I1);
        }
        bv8Var.setLayoutParams(new r79(-1, -2));
        return new f89(bv8Var);
    }
}
