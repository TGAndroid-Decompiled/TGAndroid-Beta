package org.telegram.messenger;

import android.util.Pair;
import java.util.HashMap;
public final class ws {
    public final long f27756a;
    public String f27757b;
    public final HashMap f27758c;
    public boolean d;
    public long f27759e;

    public ws(String str, long j3, int i7, long j10, long j11) {
        HashMap hashMap = new HashMap();
        this.f27758c = hashMap;
        this.f27756a = j3;
        this.f27757b = str;
        hashMap.put(Integer.valueOf(i7), new Pair(Long.valueOf(j10), Long.valueOf(j11)));
        this.f27759e = j10;
    }

    public final long a() {
        long j3 = -1;
        for (Pair pair : this.f27758c.values()) {
            if (j3 == -1 || j3 > ((Long) pair.first).longValue()) {
                j3 = ((Long) pair.first).longValue();
            }
        }
        return j3;
    }
}
