package d4;

import e2.m0;
import e2.x;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import v7.u6;
import z3.e;
import z3.n;
public final class a implements n {
    public static final Pattern h = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");
    public final boolean f6346a;
    public final b4.b f6347b;
    public LinkedHashMap d;
    public float e = -3.4028235E38f;
    public float f6349f = -3.4028235E38f;
    public final x f6348c = new x();

    public a(List list) {
        if (list != null && !list.isEmpty()) {
            this.f6346a = true;
            String r10 = m0.r((byte[]) list.get(0));
            u6.g(r10.startsWith("Format:"));
            b4.b a2 = b4.b.a(r10);
            a2.getClass();
            this.f6347b = a2;
            b(new x((byte[]) list.get(1)), StandardCharsets.UTF_8);
            return;
        }
        this.f6346a = false;
        this.f6347b = null;
    }

    public static int a(long j10, ArrayList arrayList, ArrayList arrayList2) {
        int i10;
        ArrayList arrayList3;
        int size = arrayList.size() - 1;
        while (true) {
            if (size >= 0) {
                if (((Long) arrayList.get(size)).longValue() == j10) {
                    return size;
                }
                if (((Long) arrayList.get(size)).longValue() < j10) {
                    i10 = size + 1;
                    break;
                }
                size--;
            } else {
                i10 = 0;
                break;
            }
        }
        arrayList.add(i10, Long.valueOf(j10));
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
        String str2 = m0.f8372a;
        return (Long.parseLong(matcher.group(4)) * 10000) + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(2)) * 60000000) + (Long.parseLong(group) * 3600000000L);
    }

    public final void b(e2.x r39, java.nio.charset.Charset r40) {
        throw new UnsupportedOperationException("Method not decompiled: d4.a.b(e2.x, java.nio.charset.Charset):void");
    }

    @Override
    public final int h0() {
        return 1;
    }

    @Override
    public final void u0(byte[] r44, int r45, int r46, z3.m r47, e2.j r48) {
        throw new UnsupportedOperationException("Method not decompiled: d4.a.u0(byte[], int, int, z3.m, e2.j):void");
    }

    @Override
    public final e w(int i10, int i11, byte[] bArr) {
        return t8.b.a(this, bArr, i11);
    }

    @Override
    public final void reset() {
    }
}
