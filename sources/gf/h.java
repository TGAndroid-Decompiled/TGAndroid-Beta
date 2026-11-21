package gf;

import c8.a1;
public final class h extends mf.a {
    public final kf.h f13588a;
    public String f13589b;
    public final StringBuilder f13590c;

    public h(char c10, int i7, int i10) {
        ?? pVar = new kf.p();
        this.f13588a = pVar;
        this.f13590c = new StringBuilder();
        pVar.f18251g = c10;
        pVar.h = i7;
        pVar.f18252i = i10;
    }

    @Override
    public final void a(CharSequence charSequence) {
        if (this.f13589b == null) {
            this.f13589b = charSequence.toString();
            return;
        }
        StringBuilder sb2 = this.f13590c;
        sb2.append(charSequence);
        sb2.append('\n');
    }

    @Override
    public final void d() {
        String a10 = jf.a.a(this.f13589b.trim());
        kf.h hVar = this.f13588a;
        hVar.f18253j = a10;
        hVar.f18254k = this.f13590c.toString();
    }

    @Override
    public final kf.a e() {
        return this.f13588a;
    }

    @Override
    public final a h(g gVar) {
        int i7 = gVar.f13578e;
        int i10 = gVar.f13576b;
        CharSequence charSequence = gVar.f13575a;
        int i11 = gVar.f13580g;
        kf.h hVar = this.f13588a;
        if (i11 < 4) {
            char c10 = hVar.f18251g;
            int i12 = hVar.h;
            int b10 = a1.b(c10, i7, charSequence.length(), charSequence) - i7;
            if (b10 >= i12 && a1.c(i7 + b10, charSequence.length(), charSequence) == charSequence.length()) {
                return new a(-1, -1, true);
            }
        }
        int length = charSequence.length();
        for (int i13 = hVar.f18252i; i13 > 0 && i10 < length && charSequence.charAt(i10) == ' '; i13--) {
            i10++;
        }
        return a.a(i10);
    }
}
