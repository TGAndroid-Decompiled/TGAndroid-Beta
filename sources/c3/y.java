package c3;

import e2.m0;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Pattern;
import v7.u6;
public final class y implements z3.m {
    public final e2.x f4684a;

    public y(int i10) {
        switch (i10) {
            case 1:
                this.f4684a = new e2.x();
                return;
            default:
                this.f4684a = new e2.x(10);
                return;
        }
    }

    @Override
    public z3.d a(int i10, int i11, byte[] bArr) {
        return r4.c.a(this, bArr, i11);
    }

    public b2.t0 b(c3.p r12, q3.g r13, int r14) {
        throw new UnsupportedOperationException("Method not decompiled: c3.y.b(c3.p, q3.g, int):b2.t0");
    }

    @Override
    public int c() {
        return 2;
    }

    @Override
    public void f(byte[] bArr, int i10, int i11, z3.l lVar, e2.j jVar) {
        boolean z10;
        d2.b a2;
        boolean z11;
        e2.x xVar = this.f4684a;
        xVar.L(i10 + i11, bArr);
        xVar.N(i10);
        ArrayList arrayList = new ArrayList();
        while (xVar.a() > 0) {
            if (xVar.a() >= 8) {
                z10 = true;
            } else {
                z10 = false;
            }
            u6.f("Incomplete Mp4Webvtt Top Level box header found.", z10);
            int m10 = xVar.m();
            if (xVar.m() == 1987343459) {
                int i12 = m10 - 8;
                CharSequence charSequence = null;
                d2.a aVar = null;
                while (i12 > 0) {
                    if (i12 >= 8) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    u6.f("Incomplete vtt cue box header found.", z11);
                    int m11 = xVar.m();
                    int m12 = xVar.m();
                    int i13 = m11 - 8;
                    byte[] bArr2 = xVar.f8291a;
                    int i14 = xVar.f8292b;
                    String str = m0.f8252a;
                    String str2 = new String(bArr2, i14, i13, StandardCharsets.UTF_8);
                    xVar.O(i13);
                    i12 = (i12 - 8) - i13;
                    if (m12 == 1937011815) {
                        i4.g gVar = new i4.g();
                        i4.h.e(str2, gVar);
                        aVar = gVar.a();
                    } else if (m12 == 1885436268) {
                        charSequence = i4.h.f(null, str2.trim(), Collections.EMPTY_LIST);
                    }
                }
                if (charSequence == null) {
                    charSequence = "";
                }
                if (aVar != null) {
                    aVar.f7732a = charSequence;
                    aVar.f7733b = null;
                    a2 = aVar.a();
                } else {
                    Pattern pattern = i4.h.f12699a;
                    i4.g gVar2 = new i4.g();
                    gVar2.f12693c = charSequence;
                    a2 = gVar2.a().a();
                }
                arrayList.add(a2);
            } else {
                xVar.O(m10 - 8);
            }
        }
        jVar.accept(new z3.a(-9223372036854775807L, -9223372036854775807L, arrayList));
    }

    @Override
    public void reset() {
    }
}
