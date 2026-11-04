package org.telegram.messenger;

import android.util.Pair;
import java.util.HashMap;
public final class ts {
    public final long f25587a;
    public String f25588b;
    public final HashMap f25589c;
    public boolean d;
    public long f25590e;

    public ts(String str, long j10, int i3, long j11, long j12) {
        HashMap hashMap = new HashMap();
        this.f25589c = hashMap;
        this.f25587a = j10;
        this.f25588b = str;
        hashMap.put(Integer.valueOf(i3), new Pair(Long.valueOf(j11), Long.valueOf(j12)));
        this.f25590e = j11;
    }

    public final long a() {
        long j10 = -1;
        for (Pair pair : this.f25589c.values()) {
            if (j10 == -1 || j10 > ((Long) pair.first).longValue()) {
                j10 = ((Long) pair.first).longValue();
            }
        }
        return j10;
    }
}
