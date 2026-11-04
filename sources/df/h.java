package df;

import b8.ec;
public final class h extends jf.a {
    public final gf.h f8875a;
    public String f8876b;
    public final StringBuilder f8877c;

    public h(char c2, int i3, int i10) {
        ?? pVar = new gf.p();
        this.f8875a = pVar;
        this.f8877c = new StringBuilder();
        pVar.f12254g = c2;
        pVar.h = i3;
        pVar.f12255i = i10;
    }

    @Override
    public final void a(CharSequence charSequence) {
        if (this.f8876b == null) {
            this.f8876b = charSequence.toString();
            return;
        }
        StringBuilder sb2 = this.f8877c;
        sb2.append(charSequence);
        sb2.append('\n');
    }

    @Override
    public final void d() {
        String a10 = ff.a.a(this.f8876b.trim());
        gf.h hVar = this.f8875a;
        hVar.f12256j = a10;
        hVar.f12257k = this.f8877c.toString();
    }

    @Override
    public final gf.a e() {
        return this.f8875a;
    }

    @Override
    public final a h(g gVar) {
        int i3 = gVar.f8865e;
        int i10 = gVar.f8863b;
        CharSequence charSequence = gVar.f8862a;
        int i11 = gVar.f8867g;
        gf.h hVar = this.f8875a;
        if (i11 < 4) {
            char c2 = hVar.f12254g;
            int i12 = hVar.h;
            int b10 = ec.b(c2, i3, charSequence.length(), charSequence) - i3;
            if (b10 >= i12 && ec.c(i3 + b10, charSequence.length(), charSequence) == charSequence.length()) {
                return new a(-1, -1, true);
            }
        }
        int length = charSequence.length();
        for (int i13 = hVar.f12255i; i13 > 0 && i10 < length && charSequence.charAt(i10) == ' '; i13--) {
            i10++;
        }
        return a.a(i10);
    }
}
