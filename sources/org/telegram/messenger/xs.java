package org.telegram.messenger;

import android.util.Pair;
import java.util.HashMap;
public final class xs {
    public final long f27920a;
    public String f27921b;
    public final HashMap f27922c;
    public boolean d;
    public long f27923e;

    public xs(String str, long j3, int i7, long j10, long j11) {
        HashMap hashMap = new HashMap();
        this.f27922c = hashMap;
        this.f27920a = j3;
        this.f27921b = str;
        hashMap.put(Integer.valueOf(i7), new Pair(Long.valueOf(j10), Long.valueOf(j11)));
        this.f27923e = j10;
    }

    public final long a() {
        long j3 = -1;
        for (Pair pair : this.f27922c.values()) {
            if (j3 == -1 || j3 > ((Long) pair.first).longValue()) {
                j3 = ((Long) pair.first).longValue();
            }
        }
        return j3;
    }
}
