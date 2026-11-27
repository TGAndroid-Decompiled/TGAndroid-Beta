package defpackage;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public final class ypa implements reb {
    public static final Pattern h = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");
    public final boolean a;
    public final hs3 b;
    public LinkedHashMap d;
    public float e = -3.4028235E38f;
    public float f = -3.4028235E38f;
    public final ey7 c = new ey7();

    public ypa(List list) {
        if (list != null && !list.isEmpty()) {
            this.a = true;
            String r = gcc.r((byte[]) list.get(0));
            yve.f(r.startsWith("Format:"));
            hs3 a = hs3.a(r);
            a.getClass();
            this.b = a;
            b(new ey7((byte[]) list.get(1)), StandardCharsets.UTF_8);
            return;
        }
        this.a = false;
        this.b = null;
    }

    public static int a(long j, ArrayList arrayList, ArrayList arrayList2) {
        int i;
        ArrayList arrayList3;
        int size = arrayList.size() - 1;
        while (true) {
            if (size >= 0) {
                if (((Long) arrayList.get(size)).longValue() == j) {
                    return size;
                }
                if (((Long) arrayList.get(size)).longValue() < j) {
                    i = size + 1;
                    break;
                }
                size--;
            } else {
                i = 0;
                break;
            }
        }
        arrayList.add(i, Long.valueOf(j));
        if (i == 0) {
            arrayList3 = new ArrayList();
        } else {
            arrayList3 = new ArrayList((Collection) arrayList2.get(i - 1));
        }
        arrayList2.add(i, arrayList3);
        return i;
    }

    public static long c(String str) {
        Matcher matcher = h.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        String group = matcher.group(1);
        String str2 = gcc.a;
        return (Long.parseLong(matcher.group(4)) * 10000) + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(2)) * 60000000) + (Long.parseLong(group) * 3600000000L);
    }

    public final void b(defpackage.ey7 r39, java.nio.charset.Charset r40) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ypa.b(ey7, java.nio.charset.Charset):void");
    }

    @Override
    public final heb j(int i, int i2, byte[] bArr) {
        return uh9.c(this, bArr, i2);
    }

    @Override
    public final void l(byte[] r44, int r45, int r46, defpackage.qeb r47, defpackage.ot2 r48) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ypa.l(byte[], int, int, qeb, ot2):void");
    }

    @Override
    public final int s() {
        return 1;
    }

    @Override
    public final void reset() {
    }
}
