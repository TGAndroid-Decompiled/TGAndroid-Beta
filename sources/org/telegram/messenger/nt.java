package org.telegram.messenger;

import android.util.Pair;
import java.util.HashMap;
public final class nt {
    public final long f17172a;
    public String f17173b;
    public final HashMap f17174c;
    public boolean d;
    public long e;

    public nt(String str, long j10, int i10, long j11, long j12) {
        HashMap hashMap = new HashMap();
        this.f17174c = hashMap;
        this.f17172a = j10;
        this.f17173b = str;
        hashMap.put(Integer.valueOf(i10), new Pair(Long.valueOf(j11), Long.valueOf(j12)));
        this.e = j11;
    }

    public final long a() {
        long j10 = -1;
        for (Pair pair : this.f17174c.values()) {
            if (j10 == -1 || j10 > ((Long) pair.first).longValue()) {
                j10 = ((Long) pair.first).longValue();
            }
        }
        return j10;
    }
}
