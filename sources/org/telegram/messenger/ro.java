package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;
public final class ro {
    public static int f26671q = 10;
    public int f26672a;
    public String f26673b;
    public int d;
    public volatile int f26675e;
    public int f26676f;
    public int f26677g;
    public int f26682m;
    public boolean f26683n;
    public final int f26684o;
    public boolean f26685p;
    public ArrayList f26674c = new ArrayList();
    public ArrayList h = new ArrayList();
    public ArrayList f26678i = new ArrayList();
    public final LongSparseIntArray f26679j = new LongSparseIntArray();
    public final ArrayList f26680k = new ArrayList();
    public final ArrayList f26681l = new ArrayList();

    public ro() {
        int i7 = f26671q;
        f26671q = i7 + 1;
        this.f26684o = i7;
    }

    public final boolean a(c cVar, long j3) {
        TLRPC.Dialog dialog = (TLRPC.Dialog) mp.u1(cVar.f23218a).R.f(j3);
        if (dialog == null) {
            return false;
        }
        return b(cVar, j3, dialog, false);
    }

    public final boolean b(org.telegram.messenger.c r10, long r11, org.telegram.tgnet.TLRPC.Dialog r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ro.b(org.telegram.messenger.c, long, org.telegram.tgnet.TLRPC$Dialog, boolean):boolean");
    }

    public final boolean c() {
        int i7 = this.f26677g;
        int i10 = mp.I8;
        if ((i7 & 512) > 0) {
            return true;
        }
        return false;
    }

    public final boolean d() {
        if (this.f26672a == 0) {
            return true;
        }
        return false;
    }

    public final boolean e() {
        if (c()) {
            int i7 = this.f26677g;
            int i10 = mp.I8;
            if ((i7 & 1024) > 0) {
                return true;
            }
            return false;
        }
        return false;
    }
}
