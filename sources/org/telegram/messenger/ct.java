package org.telegram.messenger;

import android.util.Pair;
import java.util.HashMap;
public final class ct {
    public final long f21896a;
    public String f21897b;
    public final HashMap f21898c;
    public boolean d;
    public long f21899e;

    public ct(String str, long j3, int i7, long j10, long j11) {
        HashMap hashMap = new HashMap();
        this.f21898c = hashMap;
        this.f21896a = j3;
        this.f21897b = str;
        hashMap.put(Integer.valueOf(i7), new Pair(Long.valueOf(j10), Long.valueOf(j11)));
        this.f21899e = j10;
    }

    public final long a() {
        long j3 = -1;
        for (Pair pair : this.f21898c.values()) {
            if (j3 == -1 || j3 > ((Long) pair.first).longValue()) {
                j3 = ((Long) pair.first).longValue();
            }
        }
        return j3;
    }
}
