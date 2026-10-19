package af;

import v7.f5;
public final class i extends ff.a {
    public final df.h f583a;
    public String f584b;
    public final StringBuilder f585c;

    public i(char c10, int i10, int i11) {
        ?? pVar = new df.p();
        this.f583a = pVar;
        this.f585c = new StringBuilder();
        pVar.f7972g = c10;
        pVar.h = i10;
        pVar.f7973i = i11;
    }

    @Override
    public final void a(CharSequence charSequence) {
        if (this.f584b == null) {
            this.f584b = charSequence.toString();
            return;
        }
        StringBuilder sb2 = this.f585c;
        sb2.append(charSequence);
        sb2.append('\n');
    }

    @Override
    public final void d() {
        String a2 = cf.a.a(this.f584b.trim());
        df.h hVar = this.f583a;
        hVar.f7974j = a2;
        hVar.f7975k = this.f585c.toString();
    }

    @Override
    public final df.a e() {
        return this.f583a;
    }

    @Override
    public final a h(h hVar) {
        int i10 = hVar.e;
        int i11 = hVar.f572b;
        CharSequence charSequence = hVar.f571a;
        int i12 = hVar.f575g;
        df.h hVar2 = this.f583a;
        if (i12 < 4) {
            char c10 = hVar2.f7972g;
            int i13 = hVar2.h;
            int b10 = f5.b(c10, charSequence, i10, charSequence.length()) - i10;
            if (b10 >= i13 && f5.c(i10 + b10, charSequence.length(), charSequence) == charSequence.length()) {
                return new a(-1, -1, true);
            }
        }
        int length = charSequence.length();
        for (int i14 = hVar2.f7973i; i14 > 0 && i11 < length && charSequence.charAt(i11) == ' '; i14--) {
            i11++;
        }
        return a.a(i11);
    }
}
