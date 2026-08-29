package ie;
public final class f extends ne.a {
    public final le.h f8912a;
    public String f8913b;
    public final StringBuilder f8914c;

    public f(char c3, int i10, int i11) {
        ?? pVar = new le.p();
        this.f8912a = pVar;
        this.f8914c = new StringBuilder();
        pVar.f15193g = c3;
        pVar.h = i10;
        pVar.f15194i = i11;
    }

    @Override
    public final void a(CharSequence charSequence) {
        if (this.f8913b == null) {
            this.f8913b = charSequence.toString();
            return;
        }
        StringBuilder sb2 = this.f8914c;
        sb2.append(charSequence);
        sb2.append('\n');
    }

    @Override
    public final void d() {
        String a2 = ke.a.a(this.f8913b.trim());
        le.h hVar = this.f8912a;
        hVar.f15195j = a2;
        hVar.f15196k = this.f8914c.toString();
    }

    @Override
    public final le.a e() {
        return this.f8912a;
    }

    @Override
    public final g4.h h(e eVar) {
        int i10 = eVar.f8902e;
        int i11 = eVar.f8900b;
        CharSequence charSequence = eVar.f8899a;
        int i12 = eVar.f8904g;
        le.h hVar = this.f8912a;
        if (i12 < 4) {
            char c3 = hVar.f15193g;
            int i13 = hVar.h;
            int b10 = i7.k.b(c3, charSequence, i10, charSequence.length()) - i10;
            if (b10 >= i13 && i7.k.c(i10 + b10, charSequence.length(), charSequence) == charSequence.length()) {
                return new g4.h(-1, -1, true);
            }
        }
        int length = charSequence.length();
        for (int i14 = hVar.f15194i; i14 > 0 && i11 < length && charSequence.charAt(i11) == ' '; i14--) {
            i11++;
        }
        return g4.h.a(i11);
    }
}
