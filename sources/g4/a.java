package g4;

import a8.ia;
import a8.p0;
import c4.m;
import h2.m0;
import h2.x;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public final class a implements m {
    public static final Pattern h = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");
    public final boolean f13491a;
    public final e4.b f13492b;
    public LinkedHashMap d;
    public float f13494e = -3.4028235E38f;
    public float f13495f = -3.4028235E38f;
    public final x f13493c = new x();

    public a(List list) {
        if (list != null && !list.isEmpty()) {
            this.f13491a = true;
            String r10 = m0.r((byte[]) list.get(0));
            ia.f(r10.startsWith("Format:"));
            e4.b b10 = e4.b.b(r10);
            b10.getClass();
            this.f13492b = b10;
            b(new x((byte[]) list.get(1)), StandardCharsets.UTF_8);
            return;
        }
        this.f13491a = false;
        this.f13492b = null;
    }

    public static int a(long j3, ArrayList arrayList, ArrayList arrayList2) {
        int i7;
        ArrayList arrayList3;
        int size = arrayList.size() - 1;
        while (true) {
            if (size >= 0) {
                if (((Long) arrayList.get(size)).longValue() == j3) {
                    return size;
                }
                if (((Long) arrayList.get(size)).longValue() < j3) {
                    i7 = size + 1;
                    break;
                }
                size--;
            } else {
                i7 = 0;
                break;
            }
        }
        arrayList.add(i7, Long.valueOf(j3));
        if (i7 == 0) {
            arrayList3 = new ArrayList();
        } else {
            arrayList3 = new ArrayList((Collection) arrayList2.get(i7 - 1));
        }
        arrayList2.add(i7, arrayList3);
        return i7;
    }

    public static long d(String str) {
        Matcher matcher = h.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        String group = matcher.group(1);
        String str2 = m0.f14112a;
        return (Long.parseLong(matcher.group(4)) * 10000) + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(2)) * 60000000) + (Long.parseLong(group) * 3600000000L);
    }

    @Override
    public final int P() {
        return 1;
    }

    public final void b(h2.x r39, java.nio.charset.Charset r40) {
        throw new UnsupportedOperationException("Method not decompiled: g4.a.b(h2.x, java.nio.charset.Charset):void");
    }

    @Override
    public final c4.d c(int i7, int i10, byte[] bArr) {
        return p0.a(this, bArr, i10);
    }

    @Override
    public final void z(byte[] r44, int r45, int r46, c4.l r47, h2.j r48) {
        throw new UnsupportedOperationException("Method not decompiled: g4.a.z(byte[], int, int, c4.l, h2.j):void");
    }

    @Override
    public final void reset() {
    }
}
