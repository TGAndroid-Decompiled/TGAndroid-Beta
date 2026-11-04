package f4;

import a1.g;
import b4.m;
import b8.zb;
import g2.n0;
import g2.y;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public final class a implements m {
    public static final Pattern h = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");
    public final boolean f11415a;
    public final d4.b f11416b;
    public LinkedHashMap d;
    public float f11418e = -3.4028235E38f;
    public float f11419f = -3.4028235E38f;
    public final y f11417c = new y();

    public a(List list) {
        if (list != null && !list.isEmpty()) {
            this.f11415a = true;
            String r5 = n0.r((byte[]) list.get(0));
            zb.f(r5.startsWith("Format:"));
            d4.b b10 = d4.b.b(r5);
            b10.getClass();
            this.f11416b = b10;
            b(new y((byte[]) list.get(1)), StandardCharsets.UTF_8);
            return;
        }
        this.f11415a = false;
        this.f11416b = null;
    }

    public static int a(long j10, ArrayList arrayList, ArrayList arrayList2) {
        int i3;
        ArrayList arrayList3;
        int size = arrayList.size() - 1;
        while (true) {
            if (size >= 0) {
                if (((Long) arrayList.get(size)).longValue() == j10) {
                    return size;
                }
                if (((Long) arrayList.get(size)).longValue() < j10) {
                    i3 = size + 1;
                    break;
                }
                size--;
            } else {
                i3 = 0;
                break;
            }
        }
        arrayList.add(i3, Long.valueOf(j10));
        if (i3 == 0) {
            arrayList3 = new ArrayList();
        } else {
            arrayList3 = new ArrayList((Collection) arrayList2.get(i3 - 1));
        }
        arrayList2.add(i3, arrayList3);
        return i3;
    }

    public static long c(String str) {
        Matcher matcher = h.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        String group = matcher.group(1);
        String str2 = n0.f11873a;
        return (Long.parseLong(matcher.group(4)) * 10000) + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(2)) * 60000000) + (Long.parseLong(group) * 3600000000L);
    }

    @Override
    public final b4.d B(int i3, int i10, byte[] bArr) {
        return g.a(this, bArr, i10);
    }

    @Override
    public final void F(byte[] r44, int r45, int r46, b4.l r47, g2.k r48) {
        throw new UnsupportedOperationException("Method not decompiled: f4.a.F(byte[], int, int, b4.l, g2.k):void");
    }

    @Override
    public final int Y() {
        return 1;
    }

    public final void b(g2.y r39, java.nio.charset.Charset r40) {
        throw new UnsupportedOperationException("Method not decompiled: f4.a.b(g2.y, java.nio.charset.Charset):void");
    }

    @Override
    public final void reset() {
    }
}
