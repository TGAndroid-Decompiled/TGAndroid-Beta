package gf;

import c8.x0;
public final class i extends mf.a {
    public final kf.h f13907a;
    public String f13908b;
    public final StringBuilder f13909c;

    public i(char c10, int i7, int i10) {
        ?? pVar = new kf.p();
        this.f13907a = pVar;
        this.f13909c = new StringBuilder();
        pVar.f17269g = c10;
        pVar.h = i7;
        pVar.f17270i = i10;
    }

    @Override
    public final void a(CharSequence charSequence) {
        if (this.f13908b == null) {
            this.f13908b = charSequence.toString();
            return;
        }
        StringBuilder sb2 = this.f13909c;
        sb2.append(charSequence);
        sb2.append('\n');
    }

    @Override
    public final void d() {
        String a10 = jf.a.a(this.f13908b.trim());
        kf.h hVar = this.f13907a;
        hVar.f17271j = a10;
        hVar.f17272k = this.f13909c.toString();
    }

    @Override
    public final kf.a e() {
        return this.f13907a;
    }

    @Override
    public final a h(h hVar) {
        int i7 = hVar.f13897e;
        int i10 = hVar.f13895b;
        CharSequence charSequence = hVar.f13894a;
        int i11 = hVar.f13899g;
        kf.h hVar2 = this.f13907a;
        if (i11 < 4) {
            char c10 = hVar2.f17269g;
            int i12 = hVar2.h;
            int b10 = x0.b(c10, i7, charSequence.length(), charSequence) - i7;
            if (b10 >= i12 && x0.c(i7 + b10, charSequence.length(), charSequence) == charSequence.length()) {
                return new a(-1, -1, true);
            }
        }
        int length = charSequence.length();
        for (int i13 = hVar2.f17270i; i13 > 0 && i10 < length && charSequence.charAt(i10) == ' '; i13--) {
            i10++;
        }
        return a.a(i10);
    }
}
