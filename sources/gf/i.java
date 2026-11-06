package gf;

import c8.x0;
public final class i extends mf.a {
    public final kf.h f13905a;
    public String f13906b;
    public final StringBuilder f13907c;

    public i(char c10, int i7, int i10) {
        ?? pVar = new kf.p();
        this.f13905a = pVar;
        this.f13907c = new StringBuilder();
        pVar.f17266g = c10;
        pVar.h = i7;
        pVar.f17267i = i10;
    }

    @Override
    public final void a(CharSequence charSequence) {
        if (this.f13906b == null) {
            this.f13906b = charSequence.toString();
            return;
        }
        StringBuilder sb2 = this.f13907c;
        sb2.append(charSequence);
        sb2.append('\n');
    }

    @Override
    public final void d() {
        String a10 = jf.a.a(this.f13906b.trim());
        kf.h hVar = this.f13905a;
        hVar.f17268j = a10;
        hVar.f17269k = this.f13907c.toString();
    }

    @Override
    public final kf.a e() {
        return this.f13905a;
    }

    @Override
    public final a h(h hVar) {
        int i7 = hVar.f13895e;
        int i10 = hVar.f13893b;
        CharSequence charSequence = hVar.f13892a;
        int i11 = hVar.f13897g;
        kf.h hVar2 = this.f13905a;
        if (i11 < 4) {
            char c10 = hVar2.f17266g;
            int i12 = hVar2.h;
            int b10 = x0.b(c10, i7, charSequence.length(), charSequence) - i7;
            if (b10 >= i12 && x0.c(i7 + b10, charSequence.length(), charSequence) == charSequence.length()) {
                return new a(-1, -1, true);
            }
        }
        int length = charSequence.length();
        for (int i13 = hVar2.f17267i; i13 > 0 && i10 < length && charSequence.charAt(i10) == ' '; i13--) {
            i10++;
        }
        return a.a(i10);
    }
}
