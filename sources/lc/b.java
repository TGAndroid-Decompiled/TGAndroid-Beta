package lc;

import j4.h;
import k7.v;
import ke.e;
import ne.p;
public final class b extends pe.a {
    public final a f12274a = new p();
    public final StringBuilder f12275b = new StringBuilder();
    public final int f12276c;

    public b(int i10) {
        this.f12276c = i10;
    }

    @Override
    public final void a(CharSequence charSequence) {
        StringBuilder sb = this.f12275b;
        sb.append(charSequence);
        sb.append('\n');
    }

    @Override
    public final void d() {
        this.f12274a.f12273g = this.f12275b.toString();
    }

    @Override
    public final ne.a e() {
        return this.f12274a;
    }

    @Override
    public final h h(e eVar) {
        int i10;
        int i11 = eVar.f11122e;
        CharSequence charSequence = eVar.f11119a;
        int length = charSequence.length();
        if (eVar.f11124g < 4) {
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
            int i13 = this.f12276c;
            if (i10 == i13 && v.b(' ', charSequence, i11 + i13, length) == length) {
                return new h(-1, -1, true);
            }
        }
        return h.a(eVar.f11120b);
    }
}
