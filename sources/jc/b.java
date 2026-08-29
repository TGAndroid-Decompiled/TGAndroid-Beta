package jc;

import g4.h;
import i7.k;
import ie.e;
import le.p;
public final class b extends ne.a {
    public final a f11438a = new p();
    public final StringBuilder f11439b = new StringBuilder();
    public final int f11440c;

    public b(int i10) {
        this.f11440c = i10;
    }

    @Override
    public final void a(CharSequence charSequence) {
        StringBuilder sb2 = this.f11439b;
        sb2.append(charSequence);
        sb2.append('\n');
    }

    @Override
    public final void d() {
        this.f11438a.f11437g = this.f11439b.toString();
    }

    @Override
    public final le.a e() {
        return this.f11438a;
    }

    @Override
    public final h h(e eVar) {
        int i10;
        int i11 = eVar.f8902e;
        CharSequence charSequence = eVar.f8899a;
        int length = charSequence.length();
        if (eVar.f8904g < 4) {
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
            int i13 = this.f11440c;
            if (i10 == i13 && k.b(' ', charSequence, i11 + i13, length) == length) {
                return new h(-1, -1, true);
            }
        }
        return h.a(eVar.f8900b);
    }
}
