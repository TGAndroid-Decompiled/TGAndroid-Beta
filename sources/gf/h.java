package gf;

import c8.y0;
public final class h extends mf.a {
    public final kf.h f13247a;
    public String f13248b;
    public final StringBuilder f13249c;

    public h(char c10, int i7, int i10) {
        ?? pVar = new kf.p();
        this.f13247a = pVar;
        this.f13249c = new StringBuilder();
        pVar.f17828g = c10;
        pVar.h = i7;
        pVar.f17829i = i10;
    }

    @Override
    public final void a(CharSequence charSequence) {
        if (this.f13248b == null) {
            this.f13248b = charSequence.toString();
            return;
        }
        StringBuilder sb2 = this.f13249c;
        sb2.append(charSequence);
        sb2.append('\n');
    }

    @Override
    public final void d() {
        String a10 = jf.a.a(this.f13248b.trim());
        kf.h hVar = this.f13247a;
        hVar.f17830j = a10;
        hVar.f17831k = this.f13249c.toString();
    }

    @Override
    public final kf.a e() {
        return this.f13247a;
    }

    @Override
    public final a h(g gVar) {
        int i7 = gVar.f13237e;
        int i10 = gVar.f13235b;
        CharSequence charSequence = gVar.f13234a;
        int i11 = gVar.f13239g;
        kf.h hVar = this.f13247a;
        if (i11 < 4) {
            char c10 = hVar.f17828g;
            int i12 = hVar.h;
            int b10 = y0.b(c10, i7, charSequence.length(), charSequence) - i7;
            if (b10 >= i12 && y0.c(i7 + b10, charSequence.length(), charSequence) == charSequence.length()) {
                return new a(-1, -1, true);
            }
        }
        int length = charSequence.length();
        for (int i13 = hVar.f17829i; i13 > 0 && i10 < length && charSequence.charAt(i10) == ' '; i13--) {
            i10++;
        }
        return a.a(i10);
    }
}
