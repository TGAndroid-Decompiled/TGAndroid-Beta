package fe;

import f7.e8;
public final class f extends ke.a {
    public final ie.h f6075a;
    public String f6076b;
    public final StringBuilder f6077c;

    public f(char c10, int i9, int i10) {
        ?? pVar = new ie.p();
        this.f6075a = pVar;
        this.f6077c = new StringBuilder();
        pVar.f11110g = c10;
        pVar.h = i9;
        pVar.f11111i = i10;
    }

    @Override
    public final void a(CharSequence charSequence) {
        if (this.f6076b == null) {
            this.f6076b = charSequence.toString();
            return;
        }
        StringBuilder sb2 = this.f6077c;
        sb2.append(charSequence);
        sb2.append('\n');
    }

    @Override
    public final void d() {
        String a2 = he.a.a(this.f6076b.trim());
        ie.h hVar = this.f6075a;
        hVar.f11112j = a2;
        hVar.f11113k = this.f6077c.toString();
    }

    @Override
    public final ie.a e() {
        return this.f6075a;
    }

    @Override
    public final e4.h h(e eVar) {
        int i9 = eVar.f6065e;
        int i10 = eVar.f6063b;
        CharSequence charSequence = eVar.f6062a;
        int i11 = eVar.f6067g;
        ie.h hVar = this.f6075a;
        if (i11 < 4) {
            char c10 = hVar.f11110g;
            int i12 = hVar.h;
            int b10 = e8.b(c10, charSequence, i9, charSequence.length()) - i9;
            if (b10 >= i12 && e8.c(i9 + b10, charSequence.length(), charSequence) == charSequence.length()) {
                return new e4.h(-1, -1, true);
            }
        }
        int length = charSequence.length();
        for (int i13 = hVar.f11111i; i13 > 0 && i10 < length && charSequence.charAt(i10) == ' '; i13--) {
            i10++;
        }
        return e4.h.a(i10);
    }
}
