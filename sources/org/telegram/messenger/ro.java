package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;
public final class ro {
    public static int f26673q = 10;
    public int f26674a;
    public String f26675b;
    public int d;
    public volatile int f26677e;
    public int f26678f;
    public int f26679g;
    public int f26684m;
    public boolean f26685n;
    public final int f26686o;
    public boolean f26687p;
    public ArrayList f26676c = new ArrayList();
    public ArrayList h = new ArrayList();
    public ArrayList f26680i = new ArrayList();
    public final LongSparseIntArray f26681j = new LongSparseIntArray();
    public final ArrayList f26682k = new ArrayList();
    public final ArrayList f26683l = new ArrayList();

    public ro() {
        int i7 = f26673q;
        f26673q = i7 + 1;
        this.f26686o = i7;
    }

    public final boolean a(c cVar, long j3) {
        TLRPC.Dialog dialog = (TLRPC.Dialog) mp.u1(cVar.f23221a).R.f(j3);
        if (dialog == null) {
            return false;
        }
        return b(cVar, j3, dialog, false);
    }

    public final boolean b(org.telegram.messenger.c r10, long r11, org.telegram.tgnet.TLRPC.Dialog r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ro.b(org.telegram.messenger.c, long, org.telegram.tgnet.TLRPC$Dialog, boolean):boolean");
    }

    public final boolean c() {
        int i7 = this.f26679g;
        int i10 = mp.I8;
        if ((i7 & 512) > 0) {
            return true;
        }
        return false;
    }

    public final boolean d() {
        if (this.f26674a == 0) {
            return true;
        }
        return false;
    }

    public final boolean e() {
        if (c()) {
            int i7 = this.f26679g;
            int i10 = mp.I8;
            if ((i7 & 1024) > 0) {
                return true;
            }
            return false;
        }
        return false;
    }
}
