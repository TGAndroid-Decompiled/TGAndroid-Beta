package defpackage;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.zip.Inflater;
public final class tkc implements vcb {
    public static final i53 e;
    public final yw7 a = new yw7();
    public final yw7 b = new yw7();
    public final skc c;
    public Inflater d;

    static {
        ko5 ko5Var = mo5.b;
        e = new i53(-9223372036854775807L, -9223372036854775807L, y79.e);
    }

    public tkc(List list) {
        String[] split;
        int i;
        skc skcVar = new skc();
        this.c = skcVar;
        String trim = new String((byte[]) list.get(0), StandardCharsets.UTF_8).trim();
        String str = hac.a;
        for (String str2 : trim.split("\\r?\\n", -1)) {
            if (str2.startsWith("palette: ")) {
                String[] split2 = str2.substring(9).split(",", -1);
                skcVar.f = new int[split2.length];
                for (int i2 = 0; i2 < split2.length; i2++) {
                    int[] iArr = skcVar.f;
                    try {
                        i = Integer.parseInt(split2[i2].trim(), 16);
                    } catch (RuntimeException e2) {
                        ncd.g("VobsubParser", "Parsing color failed", e2);
                        i = 0;
                    }
                    iArr[i2] = i;
                }
            } else if (str2.startsWith("size: ")) {
                String[] split3 = str2.substring(6).trim().split("x", -1);
                if (split3.length != 2) {
                    ncd.f("VobsubParser", "Ignoring malformed IDX size line: '" + str2 + "'");
                } else {
                    try {
                        skcVar.g = Integer.parseInt(split3[0]);
                        skcVar.h = Integer.parseInt(split3[1]);
                        skcVar.d = true;
                    } catch (RuntimeException e3) {
                        ncd.g("VobsubParser", "Parsing IDX failed", e3);
                    }
                }
            }
        }
    }

    @Override
    public final lcb g(int i, int i2, byte[] bArr) {
        return hg9.c(this, bArr, i2);
    }

    @Override
    public final void p(byte[] r26, int r27, int r28, defpackage.ucb r29, defpackage.fu2 r30) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tkc.p(byte[], int, int, ucb, fu2):void");
    }

    @Override
    public final int r() {
        return 2;
    }

    @Override
    public final void reset() {
    }
}
