package h4;

import e2.m0;
import e2.x;
import e9.l0;
import e9.n0;
import e9.x1;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.zip.Inflater;
import z3.e;
import z3.n;
public final class b implements n {
    public static final z3.b e;
    public final x f10367a = new x();
    public final x f10368b = new x();
    public final a f10369c;
    public Inflater d;

    static {
        l0 l0Var = n0.f8595b;
        e = new z3.b(-9223372036854775807L, -9223372036854775807L, x1.e);
    }

    public b(List list) {
        String[] split;
        int i10;
        a aVar = new a();
        this.f10369c = aVar;
        String trim = new String((byte[]) list.get(0), StandardCharsets.UTF_8).trim();
        String str = m0.f8375a;
        for (String str2 : trim.split("\\r?\\n", -1)) {
            if (str2.startsWith("palette: ")) {
                String[] split2 = str2.substring(9).split(",", -1);
                aVar.f10362f = new int[split2.length];
                for (int i11 = 0; i11 < split2.length; i11++) {
                    int[] iArr = aVar.f10362f;
                    try {
                        i10 = Integer.parseInt(split2[i11].trim(), 16);
                    } catch (RuntimeException e7) {
                        e2.a.m("VobsubParser", "Parsing color failed", e7);
                        i10 = 0;
                    }
                    iArr[i11] = i10;
                }
            } else if (str2.startsWith("size: ")) {
                String[] split3 = str2.substring(6).trim().split("x", -1);
                if (split3.length != 2) {
                    e2.a.l("VobsubParser", "Ignoring malformed IDX size line: '" + str2 + "'");
                } else {
                    try {
                        aVar.f10363g = Integer.parseInt(split3[0]);
                        aVar.h = Integer.parseInt(split3[1]);
                        aVar.d = true;
                    } catch (RuntimeException e10) {
                        e2.a.m("VobsubParser", "Parsing IDX failed", e10);
                    }
                }
            }
        }
    }

    @Override
    public final int X() {
        return 2;
    }

    @Override
    public final void m0(byte[] r27, int r28, int r29, z3.m r30, e2.j r31) {
        throw new UnsupportedOperationException("Method not decompiled: h4.b.m0(byte[], int, int, z3.m, e2.j):void");
    }

    @Override
    public final e x(int i10, int i11, byte[] bArr) {
        return t8.b.a(this, bArr, i11);
    }

    @Override
    public final void reset() {
    }
}
