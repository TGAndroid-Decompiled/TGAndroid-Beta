package k4;

import a8.p0;
import c4.d;
import c4.m;
import h2.m0;
import h2.x;
import h9.g0;
import h9.i0;
import h9.t1;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.zip.Inflater;
public final class b implements m {
    public static final c4.a f17217e;
    public final x f17218a = new x();
    public final x f17219b = new x();
    public final a f17220c;
    public Inflater d;

    static {
        g0 g0Var = i0.f14331b;
        f17217e = new c4.a(-9223372036854775807L, -9223372036854775807L, t1.f14399e);
    }

    public b(List list) {
        String[] split;
        int i7;
        a aVar = new a();
        this.f17220c = aVar;
        String trim = new String((byte[]) list.get(0), StandardCharsets.UTF_8).trim();
        String str = m0.f14114a;
        for (String str2 : trim.split("\\r?\\n", -1)) {
            if (str2.startsWith("palette: ")) {
                String[] split2 = str2.substring(9).split(",", -1);
                aVar.f17212f = new int[split2.length];
                for (int i10 = 0; i10 < split2.length; i10++) {
                    int[] iArr = aVar.f17212f;
                    try {
                        i7 = Integer.parseInt(split2[i10].trim(), 16);
                    } catch (RuntimeException e10) {
                        h2.a.m("VobsubParser", "Parsing color failed", e10);
                        i7 = 0;
                    }
                    iArr[i10] = i7;
                }
            } else if (str2.startsWith("size: ")) {
                String[] split3 = str2.substring(6).trim().split("x", -1);
                if (split3.length != 2) {
                    h2.a.l("VobsubParser", "Ignoring malformed IDX size line: '" + str2 + "'");
                } else {
                    try {
                        aVar.f17213g = Integer.parseInt(split3[0]);
                        aVar.h = Integer.parseInt(split3[1]);
                        aVar.d = true;
                    } catch (RuntimeException e11) {
                        h2.a.m("VobsubParser", "Parsing IDX failed", e11);
                    }
                }
            }
        }
    }

    @Override
    public final int P() {
        return 2;
    }

    @Override
    public final d c(int i7, int i10, byte[] bArr) {
        return p0.a(this, bArr, i10);
    }

    @Override
    public final void z(byte[] r27, int r28, int r29, c4.l r30, h2.j r31) {
        throw new UnsupportedOperationException("Method not decompiled: k4.b.z(byte[], int, int, c4.l, h2.j):void");
    }

    @Override
    public final void reset() {
    }
}
