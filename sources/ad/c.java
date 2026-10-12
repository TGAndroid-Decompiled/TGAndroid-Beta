package ad;

import cf.p;
import q3.h;
import v7.i0;
public final class c extends ef.a {
    public final a f419a = new p();
    public final StringBuilder f420b = new StringBuilder();
    public final int f421c;

    public c(int i10) {
        this.f421c = i10;
    }

    @Override
    public final void a(CharSequence charSequence) {
        StringBuilder sb2 = this.f420b;
        sb2.append(charSequence);
        sb2.append('\n');
    }

    @Override
    public final void d() {
        this.f419a.f417g = this.f420b.toString();
    }

    @Override
    public final cf.a e() {
        return this.f419a;
    }

    @Override
    public final h h(ze.d dVar) {
        int i10;
        int i11 = dVar.f54615e;
        CharSequence charSequence = dVar.f54612a;
        int length = charSequence.length();
        if (dVar.f54617g < 4) {
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
            int i13 = this.f421c;
            if (i10 == i13 && i0.b(' ', charSequence, i11 + i13, length) == length) {
                return new h(-1, -1, true);
            }
        }
        return h.a(dVar.f54613b);
    }
}
