package d4;

import e2.d0;
import e2.v;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import z3.e;
import z3.n;
public final class a implements n {
    public static final Pattern h = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");
    public final boolean f7482a;
    public final b4.b f7483b;
    public LinkedHashMap d;
    public float e = -3.4028235E38f;
    public float f7485f = -3.4028235E38f;
    public final v f7484c = new v();

    public a(List list) {
        if (list != null && !list.isEmpty()) {
            this.f7482a = true;
            String p5 = d0.p((byte[]) list.get(0));
            e2.d.b(p5.startsWith("Format:"));
            b4.b a2 = b4.b.a(p5);
            a2.getClass();
            this.f7483b = a2;
            b(new v((byte[]) list.get(1)), StandardCharsets.UTF_8);
            return;
        }
        this.f7482a = false;
        this.f7483b = null;
    }

    public static int a(long j3, ArrayList arrayList, ArrayList arrayList2) {
        int i10;
        ArrayList arrayList3;
        int size = arrayList.size() - 1;
        while (true) {
            if (size >= 0) {
                if (((Long) arrayList.get(size)).longValue() == j3) {
                    return size;
                }
                if (((Long) arrayList.get(size)).longValue() < j3) {
                    i10 = size + 1;
                    break;
                }
                size--;
            } else {
                i10 = 0;
                break;
            }
        }
        arrayList.add(i10, Long.valueOf(j3));
        if (i10 == 0) {
            arrayList3 = new ArrayList();
        } else {
            arrayList3 = new ArrayList((Collection) arrayList2.get(i10 - 1));
        }
        arrayList2.add(i10, arrayList3);
        return i10;
    }

    public static long c(String str) {
        Matcher matcher = h.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        String group = matcher.group(1);
        String str2 = d0.f7885a;
        return (Long.parseLong(matcher.group(4)) * 10000) + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(2)) * 60000000) + (Long.parseLong(group) * 3600000000L);
    }

    @Override
    public final int A() {
        return 1;
    }

    @Override
    public final void B(byte[] r44, int r45, int r46, z3.m r47, e2.h r48) {
        throw new UnsupportedOperationException("Method not decompiled: d4.a.B(byte[], int, int, z3.m, e2.h):void");
    }

    public final void b(e2.v r39, java.nio.charset.Charset r40) {
        throw new UnsupportedOperationException("Method not decompiled: d4.a.b(e2.v, java.nio.charset.Charset):void");
    }

    @Override
    public final e r(int i10, int i11, byte[] bArr) {
        return w.c.a(this, bArr, i11);
    }

    @Override
    public final void reset() {
    }
}
