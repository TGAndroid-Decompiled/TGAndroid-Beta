package ge;

import g7.j8;

public final class f extends le.a {

    public final je.h f6875a;

    public String f6876b;

    public final StringBuilder f6877c;

    public f(char c10, int i10, int i11) {
        je.h hVar = new je.h();
        this.f6875a = hVar;
        this.f6877c = new StringBuilder();
        hVar.f12912g = c10;
        hVar.h = i10;
        hVar.f12913i = i11;
    }

    @Override
    public final void a(CharSequence charSequence) {
        if (this.f6876b == null) {
            this.f6876b = charSequence.toString();
            return;
        }
        StringBuilder sb2 = this.f6877c;
        sb2.append(charSequence);
        sb2.append('\n');
    }

    @Override
    public final void d() {
        String strA = ie.a.a(this.f6876b.trim());
        je.h hVar = this.f6875a;
        hVar.f12914j = strA;
        hVar.f12915k = this.f6877c.toString();
    }

    @Override
    public final je.a e() {
        return this.f6875a;
    }

    @Override
    public final e4.h h(e eVar) {
        int i10 = eVar.f6865e;
        int i11 = eVar.f6863b;
        CharSequence charSequence = eVar.f6862a;
        int i12 = eVar.f6867g;
        je.h hVar = this.f6875a;
        if (i12 < 4) {
            char c10 = hVar.f12912g;
            int i13 = hVar.h;
            int iB = j8.b(c10, charSequence, i10, charSequence.length()) - i10;
            if (iB >= i13 && j8.c(i10 + iB, charSequence.length(), charSequence) == charSequence.length()) {
                return new e4.h(-1, -1, true);
            }
        }
        int length = charSequence.length();
        for (int i14 = hVar.f12913i; i14 > 0 && i11 < length && charSequence.charAt(i11) == ' '; i14--) {
            i11++;
        }
        return e4.h.a(i11);
    }
}
