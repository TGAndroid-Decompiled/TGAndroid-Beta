package j4;

import a1.g;
import b4.d;
import b4.m;
import g2.n0;
import g2.y;
import g9.g0;
import g9.i0;
import g9.s1;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.zip.Inflater;
public final class b implements m {
    public static final b4.a f16199e;
    public final y f16200a = new y();
    public final y f16201b = new y();
    public final a f16202c;
    public Inflater d;

    static {
        g0 g0Var = i0.f12083b;
        f16199e = new b4.a(-9223372036854775807L, -9223372036854775807L, s1.f12146e);
    }

    public b(List list) {
        String[] split;
        int i3;
        a aVar = new a();
        this.f16202c = aVar;
        String trim = new String((byte[]) list.get(0), StandardCharsets.UTF_8).trim();
        String str = n0.f11873a;
        for (String str2 : trim.split("\\r?\\n", -1)) {
            if (str2.startsWith("palette: ")) {
                String[] split2 = str2.substring(9).split(",", -1);
                aVar.f16194f = new int[split2.length];
                for (int i10 = 0; i10 < split2.length; i10++) {
                    int[] iArr = aVar.f16194f;
                    try {
                        i3 = Integer.parseInt(split2[i10].trim(), 16);
                    } catch (RuntimeException e10) {
                        g2.a.m("VobsubParser", "Parsing color failed", e10);
                        i3 = 0;
                    }
                    iArr[i10] = i3;
                }
            } else if (str2.startsWith("size: ")) {
                String[] split3 = str2.substring(6).trim().split("x", -1);
                if (split3.length != 2) {
                    g2.a.l("VobsubParser", "Ignoring malformed IDX size line: '" + str2 + "'");
                } else {
                    try {
                        aVar.f16195g = Integer.parseInt(split3[0]);
                        aVar.h = Integer.parseInt(split3[1]);
                        aVar.d = true;
                    } catch (RuntimeException e11) {
                        g2.a.m("VobsubParser", "Parsing IDX failed", e11);
                    }
                }
            }
        }
    }

    @Override
    public final d B(int i3, int i10, byte[] bArr) {
        return g.a(this, bArr, i10);
    }

    @Override
    public final void F(byte[] r27, int r28, int r29, b4.l r30, g2.k r31) {
        throw new UnsupportedOperationException("Method not decompiled: j4.b.F(byte[], int, int, b4.l, g2.k):void");
    }

    @Override
    public final int Y() {
        return 2;
    }

    @Override
    public final void reset() {
    }
}
