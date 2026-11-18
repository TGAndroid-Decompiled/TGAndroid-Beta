package org.telegram.messenger;

import android.util.Pair;
import java.util.HashMap;
public final class ws {
    public final long f27758a;
    public String f27759b;
    public final HashMap f27760c;
    public boolean d;
    public long f27761e;

    public ws(String str, long j3, int i7, long j10, long j11) {
        HashMap hashMap = new HashMap();
        this.f27760c = hashMap;
        this.f27758a = j3;
        this.f27759b = str;
        hashMap.put(Integer.valueOf(i7), new Pair(Long.valueOf(j10), Long.valueOf(j11)));
        this.f27761e = j10;
    }

    public final long a() {
        long j3 = -1;
        for (Pair pair : this.f27760c.values()) {
            if (j3 == -1 || j3 > ((Long) pair.first).longValue()) {
                j3 = ((Long) pair.first).longValue();
            }
        }
        return j3;
    }
}
