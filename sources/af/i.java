package af;

import v7.f5;
public final class i extends ff.a {
    public final df.h f579a;
    public String f580b;
    public final StringBuilder f581c;

    public i(char c10, int i10, int i11) {
        ?? pVar = new df.p();
        this.f579a = pVar;
        this.f581c = new StringBuilder();
        pVar.f6516g = c10;
        pVar.h = i10;
        pVar.f6517i = i11;
    }

    @Override
    public final void a(CharSequence charSequence) {
        if (this.f580b == null) {
            this.f580b = charSequence.toString();
            return;
        }
        StringBuilder sb2 = this.f581c;
        sb2.append(charSequence);
        sb2.append('\n');
    }

    @Override
    public final void d() {
        String a2 = cf.a.a(this.f580b.trim());
        df.h hVar = this.f579a;
        hVar.f6518j = a2;
        hVar.f6519k = this.f581c.toString();
    }

    @Override
    public final df.a e() {
        return this.f579a;
    }

    @Override
    public final a h(h hVar) {
        int i10 = hVar.e;
        int i11 = hVar.f568b;
        CharSequence charSequence = hVar.f567a;
        int i12 = hVar.f571g;
        df.h hVar2 = this.f579a;
        if (i12 < 4) {
            char c10 = hVar2.f6516g;
            int i13 = hVar2.h;
            int b10 = f5.b(c10, charSequence, i10, charSequence.length()) - i10;
            if (b10 >= i13 && f5.c(i10 + b10, charSequence.length(), charSequence) == charSequence.length()) {
                return new a(-1, -1, true);
            }
        }
        int length = charSequence.length();
        for (int i14 = hVar2.f6517i; i14 > 0 && i11 < length && charSequence.charAt(i11) == ' '; i14--) {
            i11++;
        }
        return a.a(i11);
    }
}
