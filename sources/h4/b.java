package h4;

import e2.n0;
import e2.x;
import f9.g0;
import f9.i0;
import f9.s1;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.zip.Inflater;
import org.telegram.ui.Components.b10;
import z3.d;
import z3.m;
public final class b implements m {
    public static final z3.a e;
    public final x f12606a = new x();
    public final x f12607b = new x();
    public final a f12608c;
    public Inflater d;

    static {
        g0 g0Var = i0.f10286b;
        e = new z3.a(-9223372036854775807L, -9223372036854775807L, s1.e);
    }

    public b(List list) {
        String[] split;
        int i10;
        a aVar = new a();
        this.f12608c = aVar;
        String trim = new String((byte[]) list.get(0), StandardCharsets.UTF_8).trim();
        String str = n0.f9691a;
        for (String str2 : trim.split("\\r?\\n", -1)) {
            if (str2.startsWith("palette: ")) {
                String[] split2 = str2.substring(9).split(",", -1);
                aVar.f12601f = new int[split2.length];
                for (int i11 = 0; i11 < split2.length; i11++) {
                    int[] iArr = aVar.f12601f;
                    try {
                        i10 = Integer.parseInt(split2[i11].trim(), 16);
                    } catch (RuntimeException e10) {
                        e2.a.m("VobsubParser", "Parsing color failed", e10);
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
                        aVar.f12602g = Integer.parseInt(split3[0]);
                        aVar.h = Integer.parseInt(split3[1]);
                        aVar.d = true;
                    } catch (RuntimeException e11) {
                        e2.a.m("VobsubParser", "Parsing IDX failed", e11);
                    }
                }
            }
        }
    }

    @Override
    public final void G(byte[] r27, int r28, int r29, z3.l r30, e2.j r31) {
        throw new UnsupportedOperationException("Method not decompiled: h4.b.G(byte[], int, int, z3.l, e2.j):void");
    }

    @Override
    public final d j(int i10, int i11, byte[] bArr) {
        return b10.a(this, bArr, i11);
    }

    @Override
    public final int y() {
        return 2;
    }

    @Override
    public final void reset() {
    }
}
