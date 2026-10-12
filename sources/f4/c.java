package f4;

import android.text.SpannableStringBuilder;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
public final class c {
    public final String f9630a;
    public final String f9631b;
    public final boolean f9632c;
    public final long d;
    public final long f9633e;
    public final g f9634f;
    public final String[] f9635g;
    public final String h;
    public final String f9636i;
    public final c f9637j;
    public final HashMap f9638k;
    public final HashMap f9639l;
    public ArrayList f9640m;

    public c(String str, String str2, long j3, long j10, g gVar, String[] strArr, String str3, String str4, c cVar) {
        boolean z10;
        this.f9630a = str;
        this.f9631b = str2;
        this.f9636i = str4;
        this.f9634f = gVar;
        this.f9635g = strArr;
        if (str2 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f9632c = z10;
        this.d = j3;
        this.f9633e = j10;
        str3.getClass();
        this.h = str3;
        this.f9637j = cVar;
        this.f9638k = new HashMap();
        this.f9639l = new HashMap();
    }

    public static c a(String str) {
        return new c(null, str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " "), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    public static SpannableStringBuilder e(String str, TreeMap treeMap) {
        if (!treeMap.containsKey(str)) {
            d2.a aVar = new d2.a();
            aVar.f8046a = new SpannableStringBuilder();
            aVar.f8047b = null;
            treeMap.put(str, aVar);
        }
        CharSequence charSequence = ((d2.a) treeMap.get(str)).f8046a;
        charSequence.getClass();
        return (SpannableStringBuilder) charSequence;
    }

    public final c b(int i10) {
        ArrayList arrayList = this.f9640m;
        if (arrayList != null) {
            return (c) arrayList.get(i10);
        }
        throw new IndexOutOfBoundsException();
    }

    public final int c() {
        ArrayList arrayList = this.f9640m;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public final void d(TreeSet treeSet, boolean z10) {
        boolean z11;
        String str = this.f9630a;
        boolean equals = "p".equals(str);
        boolean equals2 = "div".equals(str);
        if (z10 || equals || (equals2 && this.f9636i != null)) {
            long j3 = this.d;
            if (j3 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j3));
            }
            long j10 = this.f9633e;
            if (j10 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j10));
            }
        }
        if (this.f9640m != null) {
            for (int i10 = 0; i10 < this.f9640m.size(); i10++) {
                c cVar = (c) this.f9640m.get(i10);
                if (!z10 && !equals) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                cVar.d(treeSet, z11);
            }
        }
    }

    public final boolean f(long j3) {
        long j10 = this.d;
        int i10 = (j10 > (-9223372036854775807L) ? 1 : (j10 == (-9223372036854775807L) ? 0 : -1));
        long j11 = this.f9633e;
        if (i10 != 0 || j11 != -9223372036854775807L) {
            if (j10 > j3 || j11 != -9223372036854775807L) {
                if (j10 != -9223372036854775807L || j3 >= j11) {
                    if (j10 <= j3 && j3 < j11) {
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

    public final void g(long j3, String str, ArrayList arrayList) {
        String str2;
        String str3 = this.h;
        if (!"".equals(str3)) {
            str = str3;
        }
        if (f(j3) && "div".equals(this.f9630a) && (str2 = this.f9636i) != null) {
            arrayList.add(new Pair(str, str2));
            return;
        }
        for (int i10 = 0; i10 < c(); i10++) {
            b(i10).g(j3, str, arrayList);
        }
    }

    public final void h(long r21, java.util.Map r23, java.util.HashMap r24, java.lang.String r25, java.util.TreeMap r26) {
        throw new UnsupportedOperationException("Method not decompiled: f4.c.h(long, java.util.Map, java.util.HashMap, java.lang.String, java.util.TreeMap):void");
    }

    public final void i(long j3, boolean z10, String str, TreeMap treeMap) {
        String str2;
        boolean z11;
        TreeMap treeMap2;
        long j10;
        HashMap hashMap = this.f9638k;
        hashMap.clear();
        HashMap hashMap2 = this.f9639l;
        hashMap2.clear();
        String str3 = this.f9630a;
        if (!"metadata".equals(str3)) {
            String str4 = this.h;
            if ("".equals(str4)) {
                str2 = str;
            } else {
                str2 = str4;
            }
            if (this.f9632c && z10) {
                SpannableStringBuilder e7 = e(str2, treeMap);
                String str5 = this.f9631b;
                str5.getClass();
                e7.append((CharSequence) str5);
            } else if ("br".equals(str3) && z10) {
                e(str2, treeMap).append('\n');
            } else if (f(j3)) {
                for (Map.Entry entry : treeMap.entrySet()) {
                    CharSequence charSequence = ((d2.a) entry.getValue()).f8046a;
                    charSequence.getClass();
                    hashMap.put((String) entry.getKey(), Integer.valueOf(charSequence.length()));
                }
                boolean equals = "p".equals(str3);
                for (int i10 = 0; i10 < c(); i10++) {
                    c b10 = b(i10);
                    if (!z10 && !equals) {
                        z11 = false;
                        j10 = j3;
                        treeMap2 = treeMap;
                    } else {
                        z11 = true;
                        treeMap2 = treeMap;
                        j10 = j3;
                    }
                    b10.i(j10, z11, str2, treeMap2);
                }
                if (equals) {
                    SpannableStringBuilder e10 = e(str2, treeMap);
                    int length = e10.length() - 1;
                    while (length >= 0 && e10.charAt(length) == ' ') {
                        length--;
                    }
                    if (length >= 0 && e10.charAt(length) != '\n') {
                        e10.append('\n');
                    }
                }
                for (Map.Entry entry2 : treeMap.entrySet()) {
                    CharSequence charSequence2 = ((d2.a) entry2.getValue()).f8046a;
                    charSequence2.getClass();
                    hashMap2.put((String) entry2.getKey(), Integer.valueOf(charSequence2.length()));
                }
            }
        }
    }
}
