package org.telegram.messenger;

import android.util.Pair;
import java.util.HashMap;
public final class ct {
    public final long f21931a;
    public String f21932b;
    public final HashMap f21933c;
    public boolean d;
    public long f21934e;

    public ct(String str, long j3, int i7, long j10, long j11) {
        HashMap hashMap = new HashMap();
        this.f21933c = hashMap;
        this.f21931a = j3;
        this.f21932b = str;
        hashMap.put(Integer.valueOf(i7), new Pair(Long.valueOf(j10), Long.valueOf(j11)));
        this.f21934e = j10;
    }

    public final long a() {
        long j3 = -1;
        for (Pair pair : this.f21933c.values()) {
            if (j3 == -1 || j3 > ((Long) pair.first).longValue()) {
                j3 = ((Long) pair.first).longValue();
            }
        }
        return j3;
    }
}
