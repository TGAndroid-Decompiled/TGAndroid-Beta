package defpackage;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.zip.Inflater;
public final class fnc implements reb {
    public static final p43 e;
    public final ey7 a = new ey7();
    public final ey7 b = new ey7();
    public final enc c;
    public Inflater d;

    static {
        no5 no5Var = po5.b;
        e = new p43(-9223372036854775807L, -9223372036854775807L, j99.e);
    }

    public fnc(List list) {
        String[] split;
        int i;
        enc encVar = new enc();
        this.c = encVar;
        String trim = new String((byte[]) list.get(0), StandardCharsets.UTF_8).trim();
        String str = gcc.a;
        for (String str2 : trim.split("\\r?\\n", -1)) {
            if (str2.startsWith("palette: ")) {
                String[] split2 = str2.substring(9).split(",", -1);
                encVar.f = new int[split2.length];
                for (int i2 = 0; i2 < split2.length; i2++) {
                    int[] iArr = encVar.f;
                    try {
                        i = Integer.parseInt(split2[i2].trim(), 16);
                    } catch (RuntimeException e2) {
                        efd.g("VobsubParser", "Parsing color failed", e2);
                        i = 0;
                    }
                    iArr[i2] = i;
                }
            } else if (str2.startsWith("size: ")) {
                String[] split3 = str2.substring(6).trim().split("x", -1);
                if (split3.length != 2) {
                    efd.f("VobsubParser", "Ignoring malformed IDX size line: '" + str2 + "'");
                } else {
                    try {
                        encVar.g = Integer.parseInt(split3[0]);
                        encVar.h = Integer.parseInt(split3[1]);
                        encVar.d = true;
                    } catch (RuntimeException e3) {
                        efd.g("VobsubParser", "Parsing IDX failed", e3);
                    }
                }
            }
        }
    }

    @Override
    public final heb j(int i, int i2, byte[] bArr) {
        return uh9.c(this, bArr, i2);
    }

    @Override
    public final void l(byte[] r26, int r27, int r28, defpackage.qeb r29, defpackage.ot2 r30) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fnc.l(byte[], int, int, qeb, ot2):void");
    }

    @Override
    public final int s() {
        return 2;
    }

    @Override
    public final void reset() {
    }
}
