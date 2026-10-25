package bf;

import a8.tb;
public final class h extends gf.a {
    public final ef.h f3933a;
    public String f3934b;
    public final StringBuilder f3935c;

    public h(char c10, int i10, int i11) {
        ?? pVar = new ef.p();
        this.f3933a = pVar;
        this.f3935c = new StringBuilder();
        pVar.f9925g = c10;
        pVar.h = i10;
        pVar.f9926i = i11;
    }

    @Override
    public final void a(CharSequence charSequence) {
        if (this.f3934b == null) {
            this.f3934b = charSequence.toString();
            return;
        }
        StringBuilder sb2 = this.f3935c;
        sb2.append(charSequence);
        sb2.append('\n');
    }

    @Override
    public final void d() {
        String a2 = df.a.a(this.f3934b.trim());
        ef.h hVar = this.f3933a;
        hVar.f9927j = a2;
        hVar.f9928k = this.f3935c.toString();
    }

    @Override
    public final ef.a e() {
        return this.f3933a;
    }

    @Override
    public final a h(g gVar) {
        int i10 = gVar.e;
        int i11 = gVar.f3922b;
        CharSequence charSequence = gVar.f3921a;
        int i12 = gVar.f3925g;
        ef.h hVar = this.f3933a;
        if (i12 < 4) {
            char c10 = hVar.f9925g;
            int i13 = hVar.h;
            int b10 = tb.b(c10, charSequence, i10, charSequence.length()) - i10;
            if (b10 >= i13 && tb.c(i10 + b10, charSequence.length(), charSequence) == charSequence.length()) {
                return new a(-1, -1, true);
            }
        }
        int length = charSequence.length();
        for (int i14 = hVar.f9926i; i14 > 0 && i11 < length && charSequence.charAt(i11) == ' '; i14--) {
            i11++;
        }
        return a.a(i11);
    }
}
