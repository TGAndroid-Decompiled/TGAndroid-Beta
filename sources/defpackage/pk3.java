package defpackage;

import android.app.Activity;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public abstract class pk3 extends l9c {
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
    public final zg3 f0;

    public pk3(d79 d79Var, Activity activity, int i, int i2) {
        super(d79Var, activity, i, 0, false, null, null);
        this.S = new ArrayList();
        this.T = new ArrayList();
        this.U = new ArrayList();
        this.V = new ArrayList();
        this.Y = new ArrayList();
        ix9 ix9Var = (ix9) this;
        this.f0 = new zg3(ix9Var, (byte) 10);
        this.w = new n82(ix9Var, (byte) 20);
        this.Q = i;
        this.R = i2;
        O(false);
    }

    public final void W(boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pk3.W(boolean):void");
    }

    public final void X() {
        ArrayList arrayList = new ArrayList();
        int i = this.Q;
        ArrayList arrayList2 = uc7.s1(i).y;
        int size = arrayList2.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList2.get(i2);
            i2++;
            TLRPC.Chat M0 = uc7.s1(i).M0(Long.valueOf(-((TLRPC.Dialog) obj).id));
            if (M0 != null && xc2.V(M0) && xc2.t0(M0) && !xc2.r0(M0)) {
                arrayList.add(M0);
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
