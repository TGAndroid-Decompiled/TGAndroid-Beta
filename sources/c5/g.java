package c5;

import android.text.SpannableStringBuilder;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
public final class g {
    public final String f2119a;
    public final String f2120b;
    public final boolean f2121c;
    public final long d;
    public final long e;
    public final i f2122f;
    public final String[] f2123g;
    public final String h;
    public final String f2124i;
    public final g f2125j;
    public final HashMap f2126k;
    public final HashMap f2127l;
    public ArrayList f2128m;

    public g(String str, String str2, long j10, long j11, i iVar, String[] strArr, String str3, String str4, g gVar) {
        boolean z4;
        this.f2119a = str;
        this.f2120b = str2;
        this.f2124i = str4;
        this.f2122f = iVar;
        this.f2123g = strArr;
        if (str2 != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f2121c = z4;
        this.d = j10;
        this.e = j11;
        str3.getClass();
        this.h = str3;
        this.f2125j = gVar;
        this.f2126k = new HashMap();
        this.f2127l = new HashMap();
    }

    public static g a(String str) {
        return new g(null, str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " "), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    public static SpannableStringBuilder e(String str, TreeMap treeMap) {
        if (!treeMap.containsKey(str)) {
            v4.a aVar = new v4.a();
            aVar.f45648a = new SpannableStringBuilder();
            treeMap.put(str, aVar);
        }
        CharSequence charSequence = ((v4.a) treeMap.get(str)).f45648a;
        charSequence.getClass();
        return (SpannableStringBuilder) charSequence;
    }

    public final g b(int i10) {
        ArrayList arrayList = this.f2128m;
        if (arrayList != null) {
            return (g) arrayList.get(i10);
        }
        throw new IndexOutOfBoundsException();
    }

    public final int c() {
        ArrayList arrayList = this.f2128m;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public final void d(TreeSet treeSet, boolean z4) {
        boolean z10;
        String str = this.f2119a;
        boolean equals = "p".equals(str);
        boolean equals2 = "div".equals(str);
        if (z4 || equals || (equals2 && this.f2124i != null)) {
            long j10 = this.d;
            if (j10 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j10));
            }
            long j11 = this.e;
            if (j11 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j11));
            }
        }
        if (this.f2128m != null) {
            for (int i10 = 0; i10 < this.f2128m.size(); i10++) {
                g gVar = (g) this.f2128m.get(i10);
                if (!z4 && !equals) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                gVar.d(treeSet, z10);
            }
        }
    }

    public final boolean f(long j10) {
        long j11 = this.e;
        long j12 = this.d;
        if (j12 != -9223372036854775807L || j11 != -9223372036854775807L) {
            if (j12 > j10 || j11 != -9223372036854775807L) {
                if (j12 != -9223372036854775807L || j10 >= j11) {
                    if (j12 <= j10 && j10 < j11) {
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
        if (f(j10) && "div".equals(this.f2119a) && (str2 = this.f2124i) != null) {
            arrayList.add(new Pair(str, str2));
            return;
        }
        for (int i10 = 0; i10 < c(); i10++) {
            b(i10).g(j10, str, arrayList);
        }
    }

    public final void h(long r18, java.util.Map r20, java.util.HashMap r21, java.lang.String r22, java.util.TreeMap r23) {
        throw new UnsupportedOperationException("Method not decompiled: c5.g.h(long, java.util.Map, java.util.HashMap, java.lang.String, java.util.TreeMap):void");
    }

    public final void i(long j10, boolean z4, String str, TreeMap treeMap) {
        String str2;
        boolean z10;
        HashMap hashMap = this.f2126k;
        hashMap.clear();
        HashMap hashMap2 = this.f2127l;
        hashMap2.clear();
        String str3 = this.f2119a;
        if (!"metadata".equals(str3)) {
            String str4 = this.h;
            if ("".equals(str4)) {
                str2 = str;
            } else {
                str2 = str4;
            }
            if (this.f2121c && z4) {
                SpannableStringBuilder e = e(str2, treeMap);
                String str5 = this.f2120b;
                str5.getClass();
                e.append((CharSequence) str5);
            } else if ("br".equals(str3) && z4) {
                e(str2, treeMap).append('\n');
            } else if (f(j10)) {
                for (Map.Entry entry : treeMap.entrySet()) {
                    CharSequence charSequence = ((v4.a) entry.getValue()).f45648a;
                    charSequence.getClass();
                    hashMap.put((String) entry.getKey(), Integer.valueOf(charSequence.length()));
                }
                boolean equals = "p".equals(str3);
                for (int i10 = 0; i10 < c(); i10++) {
                    g b10 = b(i10);
                    if (!z4 && !equals) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    b10.i(j10, z10, str2, treeMap);
                }
                if (equals) {
                    SpannableStringBuilder e6 = e(str2, treeMap);
                    int length = e6.length() - 1;
                    while (length >= 0 && e6.charAt(length) == ' ') {
                        length--;
                    }
                    if (length >= 0 && e6.charAt(length) != '\n') {
                        e6.append('\n');
                    }
                }
                for (Map.Entry entry2 : treeMap.entrySet()) {
                    CharSequence charSequence2 = ((v4.a) entry2.getValue()).f45648a;
                    charSequence2.getClass();
                    hashMap2.put((String) entry2.getKey(), Integer.valueOf(charSequence2.length()));
                }
            }
        }
    }
}
