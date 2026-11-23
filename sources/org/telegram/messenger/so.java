package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;
public final class so {
    public static int f26849q = 10;
    public int f26850a;
    public String f26851b;
    public int d;
    public volatile int f26853e;
    public int f26854f;
    public int f26855g;
    public int f26860m;
    public boolean f26861n;
    public final int f26862o;
    public boolean f26863p;
    public ArrayList f26852c = new ArrayList();
    public ArrayList h = new ArrayList();
    public ArrayList f26856i = new ArrayList();
    public final LongSparseIntArray f26857j = new LongSparseIntArray();
    public final ArrayList f26858k = new ArrayList();
    public final ArrayList f26859l = new ArrayList();

    public so() {
        int i7 = f26849q;
        f26849q = i7 + 1;
        this.f26862o = i7;
    }

    public final boolean a(c cVar, long j3) {
        TLRPC.Dialog dialog = (TLRPC.Dialog) np.u1(cVar.f23166a).R.f(j3);
        if (dialog == null) {
            return false;
        }
        return b(cVar, j3, dialog, false);
    }

    public final boolean b(org.telegram.messenger.c r10, long r11, org.telegram.tgnet.TLRPC.Dialog r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.so.b(org.telegram.messenger.c, long, org.telegram.tgnet.TLRPC$Dialog, boolean):boolean");
    }

    public final boolean c() {
        int i7 = this.f26855g;
        int i10 = np.I8;
        if ((i7 & 512) > 0) {
            return true;
        }
        return false;
    }

    public final boolean d() {
        if (this.f26850a == 0) {
            return true;
        }
        return false;
    }

    public final boolean e() {
        if (c()) {
            int i7 = this.f26855g;
            int i10 = np.I8;
            if ((i7 & 1024) > 0) {
                return true;
            }
            return false;
        }
        return false;
    }
}
