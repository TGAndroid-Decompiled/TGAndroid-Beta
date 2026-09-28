package f4;

import android.text.SpannableStringBuilder;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
public final class c {
    public final String f8847a;
    public final String f8848b;
    public final boolean f8849c;
    public final long d;
    public final long e;
    public final g f8850f;
    public final String[] f8851g;
    public final String h;
    public final String f8852i;
    public final c f8853j;
    public final HashMap f8854k;
    public final HashMap f8855l;
    public ArrayList f8856m;

    public c(String str, String str2, long j3, long j10, g gVar, String[] strArr, String str3, String str4, c cVar) {
        boolean z10;
        this.f8847a = str;
        this.f8848b = str2;
        this.f8852i = str4;
        this.f8850f = gVar;
        this.f8851g = strArr;
        if (str2 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f8849c = z10;
        this.d = j3;
        this.e = j10;
        str3.getClass();
        this.h = str3;
        this.f8853j = cVar;
        this.f8854k = new HashMap();
        this.f8855l = new HashMap();
    }

    public static c a(String str) {
        return new c(null, str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " "), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    public static SpannableStringBuilder e(String str, TreeMap treeMap) {
        if (!treeMap.containsKey(str)) {
            d2.a aVar = new d2.a();
            aVar.f7396a = new SpannableStringBuilder();
            aVar.f7397b = null;
            treeMap.put(str, aVar);
        }
        CharSequence charSequence = ((d2.a) treeMap.get(str)).f7396a;
        charSequence.getClass();
        return (SpannableStringBuilder) charSequence;
    }

    public final c b(int i10) {
        ArrayList arrayList = this.f8856m;
        if (arrayList != null) {
            return (c) arrayList.get(i10);
        }
        throw new IndexOutOfBoundsException();
    }

    public final int c() {
        ArrayList arrayList = this.f8856m;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public final void d(TreeSet treeSet, boolean z10) {
        boolean z11;
        String str = this.f8847a;
        boolean equals = "p".equals(str);
        boolean equals2 = "div".equals(str);
        if (z10 || equals || (equals2 && this.f8852i != null)) {
            long j3 = this.d;
            if (j3 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j3));
            }
            long j10 = this.e;
            if (j10 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j10));
            }
        }
        if (this.f8856m != null) {
            for (int i10 = 0; i10 < this.f8856m.size(); i10++) {
                c cVar = (c) this.f8856m.get(i10);
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
        long j10 = this.e;
        long j11 = this.d;
        if (j11 != -9223372036854775807L || j10 != -9223372036854775807L) {
            if (j11 > j3 || j10 != -9223372036854775807L) {
                if (j11 != -9223372036854775807L || j3 >= j10) {
                    if (j11 <= j3 && j3 < j10) {
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
        if (f(j3) && "div".equals(this.f8847a) && (str2 = this.f8852i) != null) {
            arrayList.add(new Pair(str, str2));
            return;
        }
        for (int i10 = 0; i10 < c(); i10++) {
            b(i10).g(j3, str, arrayList);
        }
    }

    public final void h(long r20, java.util.Map r22, java.util.HashMap r23, java.lang.String r24, java.util.TreeMap r25) {
        throw new UnsupportedOperationException("Method not decompiled: f4.c.h(long, java.util.Map, java.util.HashMap, java.lang.String, java.util.TreeMap):void");
    }

    public final void i(long j3, boolean z10, String str, TreeMap treeMap) {
        String str2;
        boolean z11;
        HashMap hashMap = this.f8854k;
        hashMap.clear();
        HashMap hashMap2 = this.f8855l;
        hashMap2.clear();
        String str3 = this.f8847a;
        if (!"metadata".equals(str3)) {
            String str4 = this.h;
            if ("".equals(str4)) {
                str2 = str;
            } else {
                str2 = str4;
            }
            if (this.f8849c && z10) {
                SpannableStringBuilder e = e(str2, treeMap);
                String str5 = this.f8848b;
                str5.getClass();
                e.append((CharSequence) str5);
            } else if ("br".equals(str3) && z10) {
                e(str2, treeMap).append('\n');
            } else if (f(j3)) {
                for (Map.Entry entry : treeMap.entrySet()) {
                    CharSequence charSequence = ((d2.a) entry.getValue()).f7396a;
                    charSequence.getClass();
                    hashMap.put((String) entry.getKey(), Integer.valueOf(charSequence.length()));
                }
                boolean equals = "p".equals(str3);
                for (int i10 = 0; i10 < c(); i10++) {
                    c b10 = b(i10);
                    if (!z10 && !equals) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    b10.i(j3, z11, str2, treeMap);
                }
                if (equals) {
                    SpannableStringBuilder e7 = e(str2, treeMap);
                    int length = e7.length() - 1;
                    while (length >= 0 && e7.charAt(length) == ' ') {
                        length--;
                    }
                    if (length >= 0 && e7.charAt(length) != '\n') {
                        e7.append('\n');
                    }
                }
                for (Map.Entry entry2 : treeMap.entrySet()) {
                    CharSequence charSequence2 = ((d2.a) entry2.getValue()).f7396a;
                    charSequence2.getClass();
                    hashMap2.put((String) entry2.getKey(), Integer.valueOf(charSequence2.length()));
                }
            }
        }
    }
}
