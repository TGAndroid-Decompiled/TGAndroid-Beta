package hc;

import e4.h;
import f7.e8;
import fe.e;
import ie.p;
public final class b extends ke.a {
    public final a f10403a = new p();
    public final StringBuilder f10404b = new StringBuilder();
    public final int f10405c;

    public b(int i9) {
        this.f10405c = i9;
    }

    @Override
    public final void a(CharSequence charSequence) {
        StringBuilder sb2 = this.f10404b;
        sb2.append(charSequence);
        sb2.append('\n');
    }

    @Override
    public final void d() {
        this.f10403a.f10402g = this.f10404b.toString();
    }

    @Override
    public final ie.a e() {
        return this.f10403a;
    }

    @Override
    public final h h(e eVar) {
        int i9;
        int i10 = eVar.f6065e;
        CharSequence charSequence = eVar.f6062a;
        int length = charSequence.length();
        if (eVar.f6067g < 4) {
            int i11 = i10;
            while (true) {
                if (i11 < length) {
                    if ('$' != charSequence.charAt(i11)) {
                        i9 = i11 - i10;
                        break;
                    }
                    i11++;
                } else {
                    i9 = length - i10;
                    break;
                }
            }
            int i12 = this.f10405c;
            if (i9 == i12 && e8.b(' ', charSequence, i10 + i12, length) == length) {
                return new h(-1, -1, true);
            }
        }
        return h.a(eVar.f6063b);
    }
}
