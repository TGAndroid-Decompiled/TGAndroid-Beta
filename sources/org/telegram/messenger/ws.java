package org.telegram.messenger;

import android.util.Pair;
import java.util.HashMap;
public final class ws {
    public final long f27850a;
    public String f27851b;
    public final HashMap f27852c;
    public boolean d;
    public long f27853e;

    public ws(String str, long j3, int i7, long j10, long j11) {
        HashMap hashMap = new HashMap();
        this.f27852c = hashMap;
        this.f27850a = j3;
        this.f27851b = str;
        hashMap.put(Integer.valueOf(i7), new Pair(Long.valueOf(j10), Long.valueOf(j11)));
        this.f27853e = j10;
    }

    public final long a() {
        long j3 = -1;
        for (Pair pair : this.f27852c.values()) {
            if (j3 == -1 || j3 > ((Long) pair.first).longValue()) {
                j3 = ((Long) pair.first).longValue();
            }
        }
        return j3;
    }
}
