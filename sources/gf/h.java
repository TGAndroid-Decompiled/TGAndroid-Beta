package gf;

import c8.a1;
public final class h extends mf.a {
    public final kf.h f13559a;
    public String f13560b;
    public final StringBuilder f13561c;

    public h(char c10, int i7, int i10) {
        ?? pVar = new kf.p();
        this.f13559a = pVar;
        this.f13561c = new StringBuilder();
        pVar.f18220g = c10;
        pVar.h = i7;
        pVar.f18221i = i10;
    }

    @Override
    public final void a(CharSequence charSequence) {
        if (this.f13560b == null) {
            this.f13560b = charSequence.toString();
            return;
        }
        StringBuilder sb2 = this.f13561c;
        sb2.append(charSequence);
        sb2.append('\n');
    }

    @Override
    public final void d() {
        String a10 = jf.a.a(this.f13560b.trim());
        kf.h hVar = this.f13559a;
        hVar.f18222j = a10;
        hVar.f18223k = this.f13561c.toString();
    }

    @Override
    public final kf.a e() {
        return this.f13559a;
    }

    @Override
    public final a h(g gVar) {
        int i7 = gVar.f13549e;
        int i10 = gVar.f13547b;
        CharSequence charSequence = gVar.f13546a;
        int i11 = gVar.f13551g;
        kf.h hVar = this.f13559a;
        if (i11 < 4) {
            char c10 = hVar.f18220g;
            int i12 = hVar.h;
            int b10 = a1.b(c10, i7, charSequence.length(), charSequence) - i7;
            if (b10 >= i12 && a1.c(i7 + b10, charSequence.length(), charSequence) == charSequence.length()) {
                return new a(-1, -1, true);
            }
        }
        int length = charSequence.length();
        for (int i13 = hVar.f18221i; i13 > 0 && i10 < length && charSequence.charAt(i10) == ' '; i13--) {
            i10++;
        }
        return a.a(i10);
    }
}
