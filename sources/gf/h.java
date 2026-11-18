package gf;

import c8.a1;
public final class h extends mf.a {
    public final kf.h f13562a;
    public String f13563b;
    public final StringBuilder f13564c;

    public h(char c10, int i7, int i10) {
        ?? pVar = new kf.p();
        this.f13562a = pVar;
        this.f13564c = new StringBuilder();
        pVar.f18223g = c10;
        pVar.h = i7;
        pVar.f18224i = i10;
    }

    @Override
    public final void a(CharSequence charSequence) {
        if (this.f13563b == null) {
            this.f13563b = charSequence.toString();
            return;
        }
        StringBuilder sb2 = this.f13564c;
        sb2.append(charSequence);
        sb2.append('\n');
    }

    @Override
    public final void d() {
        String a10 = jf.a.a(this.f13563b.trim());
        kf.h hVar = this.f13562a;
        hVar.f18225j = a10;
        hVar.f18226k = this.f13564c.toString();
    }

    @Override
    public final kf.a e() {
        return this.f13562a;
    }

    @Override
    public final a h(g gVar) {
        int i7 = gVar.f13552e;
        int i10 = gVar.f13550b;
        CharSequence charSequence = gVar.f13549a;
        int i11 = gVar.f13554g;
        kf.h hVar = this.f13562a;
        if (i11 < 4) {
            char c10 = hVar.f18223g;
            int i12 = hVar.h;
            int b10 = a1.b(c10, i7, charSequence.length(), charSequence) - i7;
            if (b10 >= i12 && a1.c(i7 + b10, charSequence.length(), charSequence) == charSequence.length()) {
                return new a(-1, -1, true);
            }
        }
        int length = charSequence.length();
        for (int i13 = hVar.f18224i; i13 > 0 && i10 < length && charSequence.charAt(i10) == ' '; i13--) {
            i10++;
        }
        return a.a(i10);
    }
}
