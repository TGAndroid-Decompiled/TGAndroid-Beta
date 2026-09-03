package lc;

import j4.h;
import k7.u;
import ke.e;
import ne.p;
public final class b extends pe.a {
    public final a f11963a = new p();
    public final StringBuilder f11964b = new StringBuilder();
    public final int f11965c;

    public b(int i10) {
        this.f11965c = i10;
    }

    @Override
    public final void a(CharSequence charSequence) {
        StringBuilder sb = this.f11964b;
        sb.append(charSequence);
        sb.append('\n');
    }

    @Override
    public final void d() {
        this.f11963a.f11962g = this.f11964b.toString();
    }

    @Override
    public final ne.a e() {
        return this.f11963a;
    }

    @Override
    public final h h(e eVar) {
        int i10;
        int i11 = eVar.e;
        CharSequence charSequence = eVar.f10326a;
        int length = charSequence.length();
        if (eVar.f10330g < 4) {
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
            int i13 = this.f11965c;
            if (i10 == i13 && u.b(' ', charSequence, i11 + i13, length) == length) {
                return new h(-1, -1, true);
            }
        }
        return h.a(eVar.f10327b);
    }
}
