package ke;

import k7.u;
public final class f extends pe.a {
    public final ne.h f10359a;
    public String f10360b;
    public final StringBuilder f10361c;

    public f(char c3, int i10, int i11) {
        ?? pVar = new ne.p();
        this.f10359a = pVar;
        this.f10361c = new StringBuilder();
        pVar.f14943g = c3;
        pVar.h = i10;
        pVar.f14944i = i11;
    }

    @Override
    public final void a(CharSequence charSequence) {
        if (this.f10360b == null) {
            this.f10360b = charSequence.toString();
            return;
        }
        StringBuilder sb = this.f10361c;
        sb.append(charSequence);
        sb.append('\n');
    }

    @Override
    public final void d() {
        String a2 = me.a.a(this.f10360b.trim());
        ne.h hVar = this.f10359a;
        hVar.f14945j = a2;
        hVar.f14946k = this.f10361c.toString();
    }

    @Override
    public final ne.a e() {
        return this.f10359a;
    }

    @Override
    public final j4.h h(e eVar) {
        int i10 = eVar.e;
        int i11 = eVar.f10348b;
        CharSequence charSequence = eVar.f10347a;
        int i12 = eVar.f10351g;
        ne.h hVar = this.f10359a;
        if (i12 < 4) {
            char c3 = hVar.f14943g;
            int i13 = hVar.h;
            int b10 = u.b(c3, charSequence, i10, charSequence.length()) - i10;
            if (b10 >= i13 && u.c(i10 + b10, charSequence.length(), charSequence) == charSequence.length()) {
                return new j4.h(-1, -1, true);
            }
        }
        int length = charSequence.length();
        for (int i14 = hVar.f14944i; i14 > 0 && i11 < length && charSequence.charAt(i11) == ' '; i14--) {
            i11++;
        }
        return j4.h.a(i11);
    }
}
