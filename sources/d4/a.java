package d4;

import e2.l0;
import e2.x;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import sc.e;
import v7.t6;
import z3.m;
public final class a implements m {
    public static final Pattern h = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");
    public final boolean f5716a;
    public final b4.b f5717b;
    public LinkedHashMap d;
    public float e = -3.4028235E38f;
    public float f5719f = -3.4028235E38f;
    public final x f5718c = new x();

    public a(List list) {
        if (list != null && !list.isEmpty()) {
            this.f5716a = true;
            String r10 = l0.r((byte[]) list.get(0));
            t6.f(r10.startsWith("Format:"));
            b4.b b10 = b4.b.b(r10);
            b10.getClass();
            this.f5717b = b10;
            b(new x((byte[]) list.get(1)), StandardCharsets.UTF_8);
            return;
        }
        this.f5716a = false;
        this.f5717b = null;
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
        String str2 = l0.f6165a;
        return (Long.parseLong(matcher.group(4)) * 10000) + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(2)) * 60000000) + (Long.parseLong(group) * 3600000000L);
    }

    public final void b(e2.x r39, java.nio.charset.Charset r40) {
        throw new UnsupportedOperationException("Method not decompiled: d4.a.b(e2.x, java.nio.charset.Charset):void");
    }

    @Override
    public final z3.d l(int i10, int i11, byte[] bArr) {
        return e.a(this, bArr, i11);
    }

    @Override
    public final int o() {
        return 1;
    }

    @Override
    public final void z(byte[] r44, int r45, int r46, z3.l r47, e2.j r48) {
        throw new UnsupportedOperationException("Method not decompiled: d4.a.z(byte[], int, int, z3.l, e2.j):void");
    }

    @Override
    public final void reset() {
    }
}
