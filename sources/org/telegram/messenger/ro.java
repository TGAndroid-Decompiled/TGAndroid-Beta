package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;
public final class ro {
    public static int f26772q = 10;
    public int f26773a;
    public String f26774b;
    public int d;
    public volatile int f26776e;
    public int f26777f;
    public int f26778g;
    public int f26783m;
    public boolean f26784n;
    public final int f26785o;
    public boolean f26786p;
    public ArrayList f26775c = new ArrayList();
    public ArrayList h = new ArrayList();
    public ArrayList f26779i = new ArrayList();
    public final LongSparseIntArray f26780j = new LongSparseIntArray();
    public final ArrayList f26781k = new ArrayList();
    public final ArrayList f26782l = new ArrayList();

    public ro() {
        int i7 = f26772q;
        f26772q = i7 + 1;
        this.f26785o = i7;
    }

    public final boolean a(c cVar, long j3) {
        TLRPC.Dialog dialog = (TLRPC.Dialog) mp.u1(cVar.f23343a).R.f(j3);
        if (dialog == null) {
            return false;
        }
        return b(cVar, j3, dialog, false);
    }

    public final boolean b(org.telegram.messenger.c r10, long r11, org.telegram.tgnet.TLRPC.Dialog r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ro.b(org.telegram.messenger.c, long, org.telegram.tgnet.TLRPC$Dialog, boolean):boolean");
    }

    public final boolean c() {
        int i7 = this.f26778g;
        int i10 = mp.I8;
        if ((i7 & 512) > 0) {
            return true;
        }
        return false;
    }

    public final boolean d() {
        if (this.f26773a == 0) {
            return true;
        }
        return false;
    }

    public final boolean e() {
        if (c()) {
            int i7 = this.f26778g;
            int i10 = mp.I8;
            if ((i7 & 1024) > 0) {
                return true;
            }
            return false;
        }
        return false;
    }
}
