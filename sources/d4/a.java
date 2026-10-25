package d4;

import a8.yb;
import e2.n0;
import e2.x;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.ui.Components.b10;
import z3.m;
public final class a implements m {
    public static final Pattern h = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");
    public final boolean f7906a;
    public final b4.b f7907b;
    public LinkedHashMap d;
    public float e = -3.4028235E38f;
    public float f7909f = -3.4028235E38f;
    public final x f7908c = new x();

    public a(List list) {
        if (list != null && !list.isEmpty()) {
            this.f7906a = true;
            String r6 = n0.r((byte[]) list.get(0));
            yb.g(r6.startsWith("Format:"));
            b4.b a2 = b4.b.a(r6);
            a2.getClass();
            this.f7907b = a2;
            b(new x((byte[]) list.get(1)), StandardCharsets.UTF_8);
            return;
        }
        this.f7906a = false;
        this.f7907b = null;
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
        String str2 = n0.f9692a;
        return (Long.parseLong(matcher.group(4)) * 10000) + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(2)) * 60000000) + (Long.parseLong(group) * 3600000000L);
    }

    @Override
    public final void G(byte[] r44, int r45, int r46, z3.l r47, e2.j r48) {
        throw new UnsupportedOperationException("Method not decompiled: d4.a.G(byte[], int, int, z3.l, e2.j):void");
    }

    public final void b(e2.x r39, java.nio.charset.Charset r40) {
        throw new UnsupportedOperationException("Method not decompiled: d4.a.b(e2.x, java.nio.charset.Charset):void");
    }

    @Override
    public final z3.d j(int i10, int i11, byte[] bArr) {
        return b10.a(this, bArr, i11);
    }

    @Override
    public final int y() {
        return 1;
    }

    @Override
    public final void reset() {
    }
}
