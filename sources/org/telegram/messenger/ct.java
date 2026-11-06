package org.telegram.messenger;

import android.util.Pair;
import java.util.HashMap;
public final class ct {
    public final long f21902a;
    public String f21903b;
    public final HashMap f21904c;
    public boolean d;
    public long f21905e;

    public ct(String str, long j3, int i7, long j10, long j11) {
        HashMap hashMap = new HashMap();
        this.f21904c = hashMap;
        this.f21902a = j3;
        this.f21903b = str;
        hashMap.put(Integer.valueOf(i7), new Pair(Long.valueOf(j10), Long.valueOf(j11)));
        this.f21905e = j10;
    }

    public final long a() {
        long j3 = -1;
        for (Pair pair : this.f21904c.values()) {
            if (j3 == -1 || j3 > ((Long) pair.first).longValue()) {
                j3 = ((Long) pair.first).longValue();
            }
        }
        return j3;
    }
}
