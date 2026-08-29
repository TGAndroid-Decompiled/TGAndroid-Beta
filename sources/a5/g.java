package a5;

import android.text.SpannableStringBuilder;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
public final class g {
    public final String f175a;
    public final String f176b;
    public final boolean f177c;
    public final long d;
    public final long f178e;
    public final i f179f;
    public final String[] f180g;
    public final String h;
    public final String f181i;
    public final g f182j;
    public final HashMap f183k;
    public final HashMap f184l;
    public ArrayList f185m;

    public g(String str, String str2, long j10, long j11, i iVar, String[] strArr, String str3, String str4, g gVar) {
        boolean z10;
        this.f175a = str;
        this.f176b = str2;
        this.f181i = str4;
        this.f179f = iVar;
        this.f180g = strArr;
        if (str2 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f177c = z10;
        this.d = j10;
        this.f178e = j11;
        str3.getClass();
        this.h = str3;
        this.f182j = gVar;
        this.f183k = new HashMap();
        this.f184l = new HashMap();
    }

    public static g a(String str) {
        return new g(null, str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " "), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    public static SpannableStringBuilder e(String str, TreeMap treeMap) {
        if (!treeMap.containsKey(str)) {
            t4.a aVar = new t4.a();
            aVar.f48113a = new SpannableStringBuilder();
            treeMap.put(str, aVar);
        }
        CharSequence charSequence = ((t4.a) treeMap.get(str)).f48113a;
        charSequence.getClass();
        return (SpannableStringBuilder) charSequence;
    }

    public final g b(int i10) {
        ArrayList arrayList = this.f185m;
        if (arrayList != null) {
            return (g) arrayList.get(i10);
        }
        throw new IndexOutOfBoundsException();
    }

    public final int c() {
        ArrayList arrayList = this.f185m;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public final void d(TreeSet treeSet, boolean z10) {
        boolean z11;
        String str = this.f175a;
        boolean equals = "p".equals(str);
        boolean equals2 = "div".equals(str);
        if (z10 || equals || (equals2 && this.f181i != null)) {
            long j10 = this.d;
            if (j10 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j10));
            }
            long j11 = this.f178e;
            if (j11 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j11));
            }
        }
        if (this.f185m != null) {
            for (int i10 = 0; i10 < this.f185m.size(); i10++) {
                g gVar = (g) this.f185m.get(i10);
                if (!z10 && !equals) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                gVar.d(treeSet, z11);
            }
        }
    }

    public final boolean f(long j10) {
        long j11 = this.f178e;
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
        if (f(j10) && "div".equals(this.f175a) && (str2 = this.f181i) != null) {
            arrayList.add(new Pair(str, str2));
            return;
        }
        for (int i10 = 0; i10 < c(); i10++) {
            b(i10).g(j10, str, arrayList);
        }
    }

    public final void h(long r18, java.util.Map r20, java.util.HashMap r21, java.lang.String r22, java.util.TreeMap r23) {
        throw new UnsupportedOperationException("Method not decompiled: a5.g.h(long, java.util.Map, java.util.HashMap, java.lang.String, java.util.TreeMap):void");
    }

    public final void i(long j10, boolean z10, String str, TreeMap treeMap) {
        String str2;
        boolean z11;
        HashMap hashMap = this.f183k;
        hashMap.clear();
        HashMap hashMap2 = this.f184l;
        hashMap2.clear();
        String str3 = this.f175a;
        if (!"metadata".equals(str3)) {
            String str4 = this.h;
            if ("".equals(str4)) {
                str2 = str;
            } else {
                str2 = str4;
            }
            if (this.f177c && z10) {
                SpannableStringBuilder e10 = e(str2, treeMap);
                String str5 = this.f176b;
                str5.getClass();
                e10.append((CharSequence) str5);
            } else if ("br".equals(str3) && z10) {
                e(str2, treeMap).append('\n');
            } else if (f(j10)) {
                for (Map.Entry entry : treeMap.entrySet()) {
                    CharSequence charSequence = ((t4.a) entry.getValue()).f48113a;
                    charSequence.getClass();
                    hashMap.put((String) entry.getKey(), Integer.valueOf(charSequence.length()));
                }
                boolean equals = "p".equals(str3);
                for (int i10 = 0; i10 < c(); i10++) {
                    g b10 = b(i10);
                    if (!z10 && !equals) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    b10.i(j10, z11, str2, treeMap);
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
                    CharSequence charSequence2 = ((t4.a) entry2.getValue()).f48113a;
                    charSequence2.getClass();
                    hashMap2.put((String) entry2.getKey(), Integer.valueOf(charSequence2.length()));
                }
            }
        }
    }
}
