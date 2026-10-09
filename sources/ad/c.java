package ad;

import cf.p;
import q3.h;
import v7.i0;
public final class c extends ef.a {
    public final a f417a = new p();
    public final StringBuilder f418b = new StringBuilder();
    public final int f419c;

    public c(int i10) {
        this.f419c = i10;
    }

    @Override
    public final void a(CharSequence charSequence) {
        StringBuilder sb2 = this.f418b;
        sb2.append(charSequence);
        sb2.append('\n');
    }

    @Override
    public final void d() {
        this.f417a.f415g = this.f418b.toString();
    }

    @Override
    public final cf.a e() {
        return this.f417a;
    }

    @Override
    public final h h(ze.d dVar) {
        int i10;
        int i11 = dVar.f54383e;
        CharSequence charSequence = dVar.f54380a;
        int length = charSequence.length();
        if (dVar.f54385g < 4) {
            int i12 = i11;
            while (true) {
                if (i12 < length) {
                    if ('$' != charSequence.charAt(i12)) {
                        i10 = i12 - i11;
                        break;
                    }
                    i12++;
                } else {
                    i10 = length - i11;
                    break;
                }
            }
            int i13 = this.f419c;
            if (i10 == i13 && i0.b(' ', charSequence, i11 + i13, length) == length) {
                return new h(-1, -1, true);
            }
        }
        return h.a(dVar.f54381b);
    }
}
