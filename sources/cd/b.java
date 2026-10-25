package cd;

import a8.tb;
import bf.g;
import ef.p;
public final class b extends gf.a {
    public final a f6196a = new p();
    public final StringBuilder f6197b = new StringBuilder();
    public final int f6198c;

    public b(int i10) {
        this.f6198c = i10;
    }

    @Override
    public final void a(CharSequence charSequence) {
        StringBuilder sb2 = this.f6197b;
        sb2.append(charSequence);
        sb2.append('\n');
    }

    @Override
    public final void d() {
        this.f6196a.f6195g = this.f6197b.toString();
    }

    @Override
    public final ef.a e() {
        return this.f6196a;
    }

    @Override
    public final bf.a h(g gVar) {
        int i10;
        int i11 = gVar.e;
        CharSequence charSequence = gVar.f3921a;
        int length = charSequence.length();
        if (gVar.f3925g < 4) {
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
            int i13 = this.f6198c;
            if (i10 == i13 && tb.b(' ', charSequence, i11 + i13, length) == length) {
                return new bf.a(-1, -1, true);
            }
        }
        return bf.a.a(gVar.f3922b);
    }
}
