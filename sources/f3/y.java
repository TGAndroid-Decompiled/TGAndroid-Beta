package f3;

import a8.ia;
import a8.p0;
import h2.m0;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Pattern;
public final class y implements c4.m {
    public final h2.x f11101a;

    public y(int i7) {
        switch (i7) {
            case 1:
                this.f11101a = new h2.x();
                return;
            default:
                this.f11101a = new h2.x(10);
                return;
        }
    }

    @Override
    public int P() {
        return 2;
    }

    public e2.q0 a(f3.p r12, t3.g r13, int r14) {
        throw new UnsupportedOperationException("Method not decompiled: f3.y.a(f3.p, t3.g, int):e2.q0");
    }

    @Override
    public c4.d c(int i7, int i10, byte[] bArr) {
        return p0.a(this, bArr, i10);
    }

    @Override
    public void z(byte[] bArr, int i7, int i10, c4.l lVar, h2.j jVar) {
        boolean z9;
        g2.b a10;
        boolean z10;
        h2.x xVar = this.f11101a;
        xVar.L(i7 + i10, bArr);
        xVar.N(i7);
        ArrayList arrayList = new ArrayList();
        while (xVar.a() > 0) {
            if (xVar.a() >= 8) {
                z9 = true;
            } else {
                z9 = false;
            }
            ia.e("Incomplete Mp4Webvtt Top Level box header found.", z9);
            int m10 = xVar.m();
            if (xVar.m() == 1987343459) {
                int i11 = m10 - 8;
                CharSequence charSequence = null;
                g2.a aVar = null;
                while (i11 > 0) {
                    if (i11 >= 8) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    ia.e("Incomplete vtt cue box header found.", z10);
                    int m11 = xVar.m();
                    int m12 = xVar.m();
                    int i12 = m11 - 8;
                    byte[] bArr2 = xVar.f14162a;
                    int i13 = xVar.f14163b;
                    String str = m0.f14112a;
                    String str2 = new String(bArr2, i13, i12, StandardCharsets.UTF_8);
                    xVar.O(i12);
                    i11 = (i11 - 8) - i12;
                    if (m12 == 1937011815) {
                        l4.g gVar = new l4.g();
                        l4.h.e(str2, gVar);
                        aVar = gVar.a();
                    } else if (m12 == 1885436268) {
                        charSequence = l4.h.f(null, str2.trim(), Collections.EMPTY_LIST);
                    }
                }
                if (charSequence == null) {
                    charSequence = "";
                }
                if (aVar != null) {
                    aVar.f13414a = charSequence;
                    aVar.f13415b = null;
                    a10 = aVar.a();
                } else {
                    Pattern pattern = l4.h.f18163a;
                    l4.g gVar2 = new l4.g();
                    gVar2.f18156c = charSequence;
                    a10 = gVar2.a().a();
                }
                arrayList.add(a10);
            } else {
                xVar.O(m10 - 8);
            }
        }
        jVar.accept(new c4.a(-9223372036854775807L, -9223372036854775807L, arrayList));
    }

    @Override
    public void reset() {
    }
}
