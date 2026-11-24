package defpackage;

import android.app.Activity;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public abstract class xj3 extends l5c {
    public final int Q;
    public final int R;
    public final ArrayList S;
    public final ArrayList T;
    public final ArrayList U;
    public final ArrayList V;
    public boolean W;
    public boolean X;
    public final ArrayList Y;
    public boolean Z;
    public boolean a0;
    public boolean b0;
    public int c0;
    public int d0;
    public String e0;
    public final li3 f0;

    public xj3(o39 o39Var, Activity activity, int i, int i2) {
        super(o39Var, activity, i, 0, false, null, null);
        this.S = new ArrayList();
        this.T = new ArrayList();
        this.U = new ArrayList();
        this.V = new ArrayList();
        this.Y = new ArrayList();
        ot9 ot9Var = (ot9) this;
        this.f0 = new li3(ot9Var, (byte) 4);
        this.w = new w72(ot9Var, (byte) 20);
        this.Q = i;
        this.R = i2;
        O(false);
    }

    public final void W(boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xj3.W(boolean):void");
    }

    public final void X() {
        ArrayList arrayList = new ArrayList();
        int i = this.Q;
        ArrayList arrayList2 = na7.q1(i).y;
        int size = arrayList2.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList2.get(i2);
            i2++;
            TLRPC.Chat K0 = na7.q1(i).K0(Long.valueOf(-((TLRPC.Dialog) obj).id));
            if (K0 != null && hc2.V(K0) && hc2.t0(K0) && !hc2.r0(K0)) {
                arrayList.add(K0);
                if (arrayList.size() >= 100) {
                    break;
                }
            }
        }
        ArrayList arrayList3 = this.Y;
        arrayList3.clear();
        arrayList3.addAll(arrayList);
    }
}
