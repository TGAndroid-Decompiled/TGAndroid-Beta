package h4;

import android.text.SpannableStringBuilder;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
public final class c {
    public final String f14191a;
    public final String f14192b;
    public final boolean f14193c;
    public final long d;
    public final long f14194e;
    public final f f14195f;
    public final String[] f14196g;
    public final String h;
    public final String f14197i;
    public final c f14198j;
    public final HashMap f14199k;
    public final HashMap f14200l;
    public ArrayList f14201m;

    public c(String str, String str2, long j10, long j11, f fVar, String[] strArr, String str3, String str4, c cVar) {
        boolean z10;
        this.f14191a = str;
        this.f14192b = str2;
        this.f14197i = str4;
        this.f14195f = fVar;
        this.f14196g = strArr;
        if (str2 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f14193c = z10;
        this.d = j10;
        this.f14194e = j11;
        str3.getClass();
        this.h = str3;
        this.f14198j = cVar;
        this.f14199k = new HashMap();
        this.f14200l = new HashMap();
    }

    public static c a(String str) {
        return new c(null, str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " "), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    public static SpannableStringBuilder e(String str, TreeMap treeMap) {
        if (!treeMap.containsKey(str)) {
            f2.a aVar = new f2.a();
            aVar.f11339a = new SpannableStringBuilder();
            aVar.f11340b = null;
            treeMap.put(str, aVar);
        }
        CharSequence charSequence = ((f2.a) treeMap.get(str)).f11339a;
        charSequence.getClass();
        return (SpannableStringBuilder) charSequence;
    }

    public final c b(int i3) {
        ArrayList arrayList = this.f14201m;
        if (arrayList != null) {
            return (c) arrayList.get(i3);
        }
        throw new IndexOutOfBoundsException();
    }

    public final int c() {
        ArrayList arrayList = this.f14201m;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public final void d(TreeSet treeSet, boolean z10) {
        boolean z11;
        String str = this.f14191a;
        boolean equals = "p".equals(str);
        boolean equals2 = "div".equals(str);
        if (z10 || equals || (equals2 && this.f14197i != null)) {
            long j10 = this.d;
            if (j10 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j10));
            }
            long j11 = this.f14194e;
            if (j11 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j11));
            }
        }
        if (this.f14201m != null) {
            for (int i3 = 0; i3 < this.f14201m.size(); i3++) {
                c cVar = (c) this.f14201m.get(i3);
                if (!z10 && !equals) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                cVar.d(treeSet, z11);
            }
        }
    }

    public final boolean f(long j10) {
        long j11 = this.d;
        int i3 = (j11 > (-9223372036854775807L) ? 1 : (j11 == (-9223372036854775807L) ? 0 : -1));
        long j12 = this.f14194e;
        if (i3 != 0 || j12 != -9223372036854775807L) {
            if (j11 > j10 || j12 != -9223372036854775807L) {
                if (j11 != -9223372036854775807L || j10 >= j12) {
                    if (j11 <= j10 && j10 < j12) {
                        return true;
                    }
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    public final void g(long j10, String str, ArrayList arrayList) {
        String str2;
        String str3 = this.h;
        if (!"".equals(str3)) {
            str = str3;
        }
        if (f(j10) && "div".equals(this.f14191a) && (str2 = this.f14197i) != null) {
            arrayList.add(new Pair(str, str2));
            return;
        }
        for (int i3 = 0; i3 < c(); i3++) {
            b(i3).g(j10, str, arrayList);
        }
    }

    public final void h(long r21, java.util.Map r23, java.util.HashMap r24, java.lang.String r25, java.util.TreeMap r26) {
        throw new UnsupportedOperationException("Method not decompiled: h4.c.h(long, java.util.Map, java.util.HashMap, java.lang.String, java.util.TreeMap):void");
    }

    public final void i(long j10, boolean z10, String str, TreeMap treeMap) {
        String str2;
        boolean z11;
        TreeMap treeMap2;
        long j11;
        HashMap hashMap = this.f14199k;
        hashMap.clear();
        HashMap hashMap2 = this.f14200l;
        hashMap2.clear();
        String str3 = this.f14191a;
        if (!"metadata".equals(str3)) {
            String str4 = this.h;
            if ("".equals(str4)) {
                str2 = str;
            } else {
                str2 = str4;
            }
            if (this.f14193c && z10) {
                SpannableStringBuilder e10 = e(str2, treeMap);
                String str5 = this.f14192b;
                str5.getClass();
                e10.append((CharSequence) str5);
            } else if ("br".equals(str3) && z10) {
                e(str2, treeMap).append('\n');
            } else if (f(j10)) {
                for (Map.Entry entry : treeMap.entrySet()) {
                    CharSequence charSequence = ((f2.a) entry.getValue()).f11339a;
                    charSequence.getClass();
                    hashMap.put((String) entry.getKey(), Integer.valueOf(charSequence.length()));
                }
                boolean equals = "p".equals(str3);
                for (int i3 = 0; i3 < c(); i3++) {
                    c b10 = b(i3);
                    if (!z10 && !equals) {
                        z11 = false;
                        j11 = j10;
                        treeMap2 = treeMap;
                    } else {
                        z11 = true;
                        treeMap2 = treeMap;
                        j11 = j10;
                    }
                    b10.i(j11, z11, str2, treeMap2);
                }
                if (equals) {
                    SpannableStringBuilder e11 = e(str2, treeMap);
                    int length = e11.length() - 1;
                    while (length >= 0 && e11.charAt(length) == ' ') {
                        length--;
                    }
                    if (length >= 0 && e11.charAt(length) != '\n') {
                        e11.append('\n');
                    }
                }
                for (Map.Entry entry2 : treeMap.entrySet()) {
                    CharSequence charSequence2 = ((f2.a) entry2.getValue()).f11339a;
                    charSequence2.getClass();
                    hashMap2.put((String) entry2.getKey(), Integer.valueOf(charSequence2.length()));
                }
            }
        }
    }
}
