package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;
public final class ro {
    public static int f26699q = 10;
    public int f26700a;
    public String f26701b;
    public int d;
    public volatile int f26703e;
    public int f26704f;
    public int f26705g;
    public int f26710m;
    public boolean f26711n;
    public final int f26712o;
    public boolean f26713p;
    public ArrayList f26702c = new ArrayList();
    public ArrayList h = new ArrayList();
    public ArrayList f26706i = new ArrayList();
    public final LongSparseIntArray f26707j = new LongSparseIntArray();
    public final ArrayList f26708k = new ArrayList();
    public final ArrayList f26709l = new ArrayList();

    public ro() {
        int i7 = f26699q;
        f26699q = i7 + 1;
        this.f26712o = i7;
    }

    public final boolean a(c cVar, long j3) {
        TLRPC.Dialog dialog = (TLRPC.Dialog) mp.u1(cVar.f23246a).R.f(j3);
        if (dialog == null) {
            return false;
        }
        return b(cVar, j3, dialog, false);
    }

    public final boolean b(org.telegram.messenger.c r10, long r11, org.telegram.tgnet.TLRPC.Dialog r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ro.b(org.telegram.messenger.c, long, org.telegram.tgnet.TLRPC$Dialog, boolean):boolean");
    }

    public final boolean c() {
        int i7 = this.f26705g;
        int i10 = mp.I8;
        if ((i7 & 512) > 0) {
            return true;
        }
        return false;
    }

    public final boolean d() {
        if (this.f26700a == 0) {
            return true;
        }
        return false;
    }

    public final boolean e() {
        if (c()) {
            int i7 = this.f26705g;
            int i10 = mp.I8;
            if ((i7 & 1024) > 0) {
                return true;
            }
            return false;
        }
        return false;
    }
}
