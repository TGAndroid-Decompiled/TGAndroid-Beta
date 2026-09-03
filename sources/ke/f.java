package ke;

import k7.u;
public final class f extends pe.a {
    public final ne.h f10338a;
    public String f10339b;
    public final StringBuilder f10340c;

    public f(char c3, int i10, int i11) {
        ?? pVar = new ne.p();
        this.f10338a = pVar;
        this.f10340c = new StringBuilder();
        pVar.f14928g = c3;
        pVar.h = i10;
        pVar.f14929i = i11;
    }

    @Override
    public final void a(CharSequence charSequence) {
        if (this.f10339b == null) {
            this.f10339b = charSequence.toString();
            return;
        }
        StringBuilder sb = this.f10340c;
        sb.append(charSequence);
        sb.append('\n');
    }

    @Override
    public final void d() {
        String a2 = me.a.a(this.f10339b.trim());
        ne.h hVar = this.f10338a;
        hVar.f14930j = a2;
        hVar.f14931k = this.f10340c.toString();
    }

    @Override
    public final ne.a e() {
        return this.f10338a;
    }

    @Override
    public final j4.h h(e eVar) {
        int i10 = eVar.e;
        int i11 = eVar.f10327b;
        CharSequence charSequence = eVar.f10326a;
        int i12 = eVar.f10330g;
        ne.h hVar = this.f10338a;
        if (i12 < 4) {
            char c3 = hVar.f14928g;
            int i13 = hVar.h;
            int b10 = u.b(c3, charSequence, i10, charSequence.length()) - i10;
            if (b10 >= i13 && u.c(i10 + b10, charSequence.length(), charSequence) == charSequence.length()) {
                return new j4.h(-1, -1, true);
            }
        }
        int length = charSequence.length();
        for (int i14 = hVar.f14929i; i14 > 0 && i11 < length && charSequence.charAt(i11) == ' '; i14--) {
            i11++;
        }
        return j4.h.a(i11);
    }
}
