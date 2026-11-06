package i4;

import android.text.SpannableStringBuilder;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
public final class c {
    public final String f15235a;
    public final String f15236b;
    public final boolean f15237c;
    public final long d;
    public final long f15238e;
    public final f f15239f;
    public final String[] f15240g;
    public final String h;
    public final String f15241i;
    public final c f15242j;
    public final HashMap f15243k;
    public final HashMap f15244l;
    public ArrayList f15245m;

    public c(String str, String str2, long j3, long j10, f fVar, String[] strArr, String str3, String str4, c cVar) {
        boolean z9;
        this.f15235a = str;
        this.f15236b = str2;
        this.f15241i = str4;
        this.f15239f = fVar;
        this.f15240g = strArr;
        if (str2 != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f15237c = z9;
        this.d = j3;
        this.f15238e = j10;
        str3.getClass();
        this.h = str3;
        this.f15242j = cVar;
        this.f15243k = new HashMap();
        this.f15244l = new HashMap();
    }

    public static c a(String str) {
        return new c(null, str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " "), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    public static SpannableStringBuilder e(String str, TreeMap treeMap) {
        if (!treeMap.containsKey(str)) {
            g2.a aVar = new g2.a();
            aVar.f13414a = new SpannableStringBuilder();
            aVar.f13415b = null;
            treeMap.put(str, aVar);
        }
        CharSequence charSequence = ((g2.a) treeMap.get(str)).f13414a;
        charSequence.getClass();
        return (SpannableStringBuilder) charSequence;
    }

    public final c b(int i7) {
        ArrayList arrayList = this.f15245m;
        if (arrayList != null) {
            return (c) arrayList.get(i7);
        }
        throw new IndexOutOfBoundsException();
    }

    public final int c() {
        ArrayList arrayList = this.f15245m;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public final void d(TreeSet treeSet, boolean z9) {
        boolean z10;
        String str = this.f15235a;
        boolean equals = "p".equals(str);
        boolean equals2 = "div".equals(str);
        if (z9 || equals || (equals2 && this.f15241i != null)) {
            long j3 = this.d;
            if (j3 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j3));
            }
            long j10 = this.f15238e;
            if (j10 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j10));
            }
        }
        if (this.f15245m != null) {
            for (int i7 = 0; i7 < this.f15245m.size(); i7++) {
                c cVar = (c) this.f15245m.get(i7);
                if (!z9 && !equals) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                cVar.d(treeSet, z10);
            }
        }
    }

    public final boolean f(long j3) {
        long j10 = this.d;
        int i7 = (j10 > (-9223372036854775807L) ? 1 : (j10 == (-9223372036854775807L) ? 0 : -1));
        long j11 = this.f15238e;
        if (i7 != 0 || j11 != -9223372036854775807L) {
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
        if (f(j3) && "div".equals(this.f15235a) && (str2 = this.f15241i) != null) {
            arrayList.add(new Pair(str, str2));
            return;
        }
        for (int i7 = 0; i7 < c(); i7++) {
            b(i7).g(j3, str, arrayList);
        }
    }

    public final void h(long r21, java.util.Map r23, java.util.HashMap r24, java.lang.String r25, java.util.TreeMap r26) {
        throw new UnsupportedOperationException("Method not decompiled: i4.c.h(long, java.util.Map, java.util.HashMap, java.lang.String, java.util.TreeMap):void");
    }

    public final void i(long j3, boolean z9, String str, TreeMap treeMap) {
        String str2;
        boolean z10;
        TreeMap treeMap2;
        long j10;
        HashMap hashMap = this.f15243k;
        hashMap.clear();
        HashMap hashMap2 = this.f15244l;
        hashMap2.clear();
        String str3 = this.f15235a;
        if (!"metadata".equals(str3)) {
            String str4 = this.h;
            if ("".equals(str4)) {
                str2 = str;
            } else {
                str2 = str4;
            }
            if (this.f15237c && z9) {
                SpannableStringBuilder e10 = e(str2, treeMap);
                String str5 = this.f15236b;
                str5.getClass();
                e10.append((CharSequence) str5);
            } else if ("br".equals(str3) && z9) {
                e(str2, treeMap).append('\n');
            } else if (f(j3)) {
                for (Map.Entry entry : treeMap.entrySet()) {
                    CharSequence charSequence = ((g2.a) entry.getValue()).f13414a;
                    charSequence.getClass();
                    hashMap.put((String) entry.getKey(), Integer.valueOf(charSequence.length()));
                }
                boolean equals = "p".equals(str3);
                for (int i7 = 0; i7 < c(); i7++) {
                    c b10 = b(i7);
                    if (!z9 && !equals) {
                        z10 = false;
                        j10 = j3;
                        treeMap2 = treeMap;
                    } else {
                        z10 = true;
                        treeMap2 = treeMap;
                        j10 = j3;
                    }
                    b10.i(j10, z10, str2, treeMap2);
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
                    CharSequence charSequence2 = ((g2.a) entry2.getValue()).f13414a;
                    charSequence2.getClass();
                    hashMap2.put((String) entry2.getKey(), Integer.valueOf(charSequence2.length()));
                }
            }
        }
    }
}
