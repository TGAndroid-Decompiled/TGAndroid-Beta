package h4;

import e2.x;
import e9.l0;
import e9.n0;
import e9.x1;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.zip.Inflater;
import sc.e;
import z3.d;
import z3.m;
public final class b implements m {
    public static final z3.a e;
    public final x f7624a = new x();
    public final x f7625b = new x();
    public final a f7626c;
    public Inflater d;

    static {
        l0 l0Var = n0.f6390b;
        e = new z3.a(-9223372036854775807L, -9223372036854775807L, x1.e);
    }

    public b(List list) {
        String[] split;
        int i10;
        a aVar = new a();
        this.f7626c = aVar;
        String trim = new String((byte[]) list.get(0), StandardCharsets.UTF_8).trim();
        String str = e2.l0.f6165a;
        for (String str2 : trim.split("\\r?\\n", -1)) {
            if (str2.startsWith("palette: ")) {
                String[] split2 = str2.substring(9).split(",", -1);
                aVar.f7619f = new int[split2.length];
                for (int i11 = 0; i11 < split2.length; i11++) {
                    int[] iArr = aVar.f7619f;
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
                        aVar.f7620g = Integer.parseInt(split3[0]);
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
    public final d l(int i10, int i11, byte[] bArr) {
        return e.a(this, bArr, i11);
    }

    @Override
    public final int o() {
        return 2;
    }

    @Override
    public final void z(byte[] r27, int r28, int r29, z3.l r30, e2.j r31) {
        throw new UnsupportedOperationException("Method not decompiled: h4.b.z(byte[], int, int, z3.l, e2.j):void");
    }

    @Override
    public final void reset() {
    }
}
