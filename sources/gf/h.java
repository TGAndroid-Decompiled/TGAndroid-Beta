package gf;

import c8.b1;
public final class h extends mf.a {
    public final kf.h f13554a;
    public String f13555b;
    public final StringBuilder f13556c;

    public h(char c10, int i7, int i10) {
        ?? pVar = new kf.p();
        this.f13554a = pVar;
        this.f13556c = new StringBuilder();
        pVar.f18316g = c10;
        pVar.h = i7;
        pVar.f18317i = i10;
    }

    @Override
    public final void a(CharSequence charSequence) {
        if (this.f13555b == null) {
            this.f13555b = charSequence.toString();
            return;
        }
        StringBuilder sb2 = this.f13556c;
        sb2.append(charSequence);
        sb2.append('\n');
    }

    @Override
    public final void d() {
        String a10 = jf.a.a(this.f13555b.trim());
        kf.h hVar = this.f13554a;
        hVar.f18318j = a10;
        hVar.f18319k = this.f13556c.toString();
    }

    @Override
    public final kf.a e() {
        return this.f13554a;
    }

    @Override
    public final a h(g gVar) {
        int i7 = gVar.f13544e;
        int i10 = gVar.f13542b;
        CharSequence charSequence = gVar.f13541a;
        int i11 = gVar.f13546g;
        kf.h hVar = this.f13554a;
        if (i11 < 4) {
            char c10 = hVar.f18316g;
            int i12 = hVar.h;
            int b10 = b1.b(c10, i7, charSequence.length(), charSequence) - i7;
            if (b10 >= i12 && b1.c(i7 + b10, charSequence.length(), charSequence) == charSequence.length()) {
                return new a(-1, -1, true);
            }
        }
        int length = charSequence.length();
        for (int i13 = hVar.f18317i; i13 > 0 && i10 < length && charSequence.charAt(i10) == ' '; i13--) {
            i10++;
        }
        return a.a(i10);
    }
}
