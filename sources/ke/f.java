package ke;

import k7.v;
public final class f extends pe.a {
    public final ne.h f11132a;
    public String f11133b;
    public final StringBuilder f11134c;

    public f(char c3, int i10, int i11) {
        ?? pVar = new ne.p();
        this.f11132a = pVar;
        this.f11134c = new StringBuilder();
        pVar.f15964g = c3;
        pVar.h = i10;
        pVar.f15965i = i11;
    }

    @Override
    public final void a(CharSequence charSequence) {
        if (this.f11133b == null) {
            this.f11133b = charSequence.toString();
            return;
        }
        StringBuilder sb = this.f11134c;
        sb.append(charSequence);
        sb.append('\n');
    }

    @Override
    public final void d() {
        String a2 = me.a.a(this.f11133b.trim());
        ne.h hVar = this.f11132a;
        hVar.f15966j = a2;
        hVar.f15967k = this.f11134c.toString();
    }

    @Override
    public final ne.a e() {
        return this.f11132a;
    }

    @Override
    public final j4.h h(e eVar) {
        int i10 = eVar.f11122e;
        int i11 = eVar.f11120b;
        CharSequence charSequence = eVar.f11119a;
        int i12 = eVar.f11124g;
        ne.h hVar = this.f11132a;
        if (i12 < 4) {
            char c3 = hVar.f15964g;
            int i13 = hVar.h;
            int b10 = v.b(c3, charSequence, i10, charSequence.length()) - i10;
            if (b10 >= i13 && v.c(i10 + b10, charSequence.length(), charSequence) == charSequence.length()) {
                return new j4.h(-1, -1, true);
            }
        }
        int length = charSequence.length();
        for (int i14 = hVar.f15965i; i14 > 0 && i11 < length && charSequence.charAt(i11) == ' '; i14--) {
            i11++;
        }
        return j4.h.a(i11);
    }
}
