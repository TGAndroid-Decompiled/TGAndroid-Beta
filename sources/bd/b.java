package bd;

import af.h;
import df.p;
import v7.f5;
public final class b extends ff.a {
    public final a f4255a = new p();
    public final StringBuilder f4256b = new StringBuilder();
    public final int f4257c;

    public b(int i10) {
        this.f4257c = i10;
    }

    @Override
    public final void a(CharSequence charSequence) {
        StringBuilder sb2 = this.f4256b;
        sb2.append(charSequence);
        sb2.append('\n');
    }

    @Override
    public final void d() {
        this.f4255a.f4254g = this.f4256b.toString();
    }

    @Override
    public final df.a e() {
        return this.f4255a;
    }

    @Override
    public final af.a h(h hVar) {
        int i10;
        int i11 = hVar.e;
        CharSequence charSequence = hVar.f571a;
        int length = charSequence.length();
        if (hVar.f575g < 4) {
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
            int i13 = this.f4257c;
            if (i10 == i13 && f5.b(' ', charSequence, i11 + i13, length) == length) {
                return new af.a(-1, -1, true);
            }
        }
        return af.a.a(hVar.f572b);
    }
}
