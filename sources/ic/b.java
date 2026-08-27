package ic;

import e4.h;
import g7.j8;
import ge.e;

public final class b extends le.a {

    public final a f11112a = new a();

    public final StringBuilder f11113b = new StringBuilder();

    public final int f11114c;

    public b(int i10) {
        this.f11114c = i10;
    }

    @Override
    public final void a(CharSequence charSequence) {
        StringBuilder sb2 = this.f11113b;
        sb2.append(charSequence);
        sb2.append('\n');
    }

    @Override
    public final void d() {
        this.f11112a.f11111g = this.f11113b.toString();
    }

    @Override
    public final je.a e() {
        return this.f11112a;
    }

    @Override
    public final h h(e eVar) {
        int i10;
        int i11 = eVar.f6865e;
        CharSequence charSequence = eVar.f6862a;
        int length = charSequence.length();
        if (eVar.f6867g < 4) {
            int i12 = i11;
            while (true) {
                if (i12 >= length) {
                    i10 = length - i11;
                    break;
                }
                if ('$' != charSequence.charAt(i12)) {
                    i10 = i12 - i11;
                    break;
                }
                i12++;
            }
            int i13 = this.f11114c;
            if (i10 == i13 && j8.b(' ', charSequence, i11 + i13, length) == length) {
                return new h(-1, -1, true);
            }
        }
        return h.a(eVar.f6863b);
    }
}
