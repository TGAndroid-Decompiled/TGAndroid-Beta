package defpackage;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.zip.Inflater;
public final class tic implements uab {
    public static final x33 e;
    public final xu7 a = new xu7();
    public final xu7 b = new xu7();
    public final sic c;
    public Inflater d;

    static {
        km5 km5Var = mm5.b;
        e = new x33(-9223372036854775807L, -9223372036854775807L, w59.e);
    }

    public tic(List list) {
        String[] split;
        int i;
        sic sicVar = new sic();
        this.c = sicVar;
        String trim = new String((byte[]) list.get(0), StandardCharsets.UTF_8).trim();
        String str = g8c.a;
        for (String str2 : trim.split("\\r?\\n", -1)) {
            if (str2.startsWith("palette: ")) {
                String[] split2 = str2.substring(9).split(",", -1);
                sicVar.f = new int[split2.length];
                for (int i2 = 0; i2 < split2.length; i2++) {
                    int[] iArr = sicVar.f;
                    try {
                        i = Integer.parseInt(split2[i2].trim(), 16);
                    } catch (RuntimeException e2) {
                        lad.g("VobsubParser", "Parsing color failed", e2);
                        i = 0;
                    }
                    iArr[i2] = i;
                }
            } else if (str2.startsWith("size: ")) {
                String[] split3 = str2.substring(6).trim().split("x", -1);
                if (split3.length != 2) {
                    lad.f("VobsubParser", "Ignoring malformed IDX size line: '" + str2 + "'");
                } else {
                    try {
                        sicVar.g = Integer.parseInt(split3[0]);
                        sicVar.h = Integer.parseInt(split3[1]);
                        sicVar.d = true;
                    } catch (RuntimeException e3) {
                        lad.g("VobsubParser", "Parsing IDX failed", e3);
                    }
                }
            }
        }
    }

    @Override
    public final kab f(int i, int i2, byte[] bArr) {
        return de9.c(this, bArr, i2);
    }

    @Override
    public final void l(byte[] r26, int r27, int r28, defpackage.tab r29, defpackage.us2 r30) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tic.l(byte[], int, int, tab, us2):void");
    }

    @Override
    public final int o() {
        return 2;
    }

    @Override
    public final void reset() {
    }
}
