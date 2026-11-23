package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;
public final class so {
    public static int f26885q = 10;
    public int f26886a;
    public String f26887b;
    public int d;
    public volatile int f26889e;
    public int f26890f;
    public int f26891g;
    public int f26896m;
    public boolean f26897n;
    public final int f26898o;
    public boolean f26899p;
    public ArrayList f26888c = new ArrayList();
    public ArrayList h = new ArrayList();
    public ArrayList f26892i = new ArrayList();
    public final LongSparseIntArray f26893j = new LongSparseIntArray();
    public final ArrayList f26894k = new ArrayList();
    public final ArrayList f26895l = new ArrayList();

    public so() {
        int i7 = f26885q;
        f26885q = i7 + 1;
        this.f26898o = i7;
    }

    public final boolean a(c cVar, long j3) {
        TLRPC.Dialog dialog = (TLRPC.Dialog) np.u1(cVar.f23202a).R.f(j3);
        if (dialog == null) {
            return false;
        }
        return b(cVar, j3, dialog, false);
    }

    public final boolean b(org.telegram.messenger.c r10, long r11, org.telegram.tgnet.TLRPC.Dialog r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.so.b(org.telegram.messenger.c, long, org.telegram.tgnet.TLRPC$Dialog, boolean):boolean");
    }

    public final boolean c() {
        int i7 = this.f26891g;
        int i10 = np.I8;
        if ((i7 & 512) > 0) {
            return true;
        }
        return false;
    }

    public final boolean d() {
        if (this.f26886a == 0) {
            return true;
        }
        return false;
    }

    public final boolean e() {
        if (c()) {
            int i7 = this.f26891g;
            int i10 = np.I8;
            if ((i7 & 1024) > 0) {
                return true;
            }
            return false;
        }
        return false;
    }
}
