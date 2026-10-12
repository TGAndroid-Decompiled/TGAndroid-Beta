package af;

import java.io.Serializable;
import java.util.ArrayList;
public final class j extends ff.a {
    public final int f582a;
    public final df.a f583b;
    public final Serializable f584c;

    public j() {
        this.f582a = 1;
        this.f583b = new df.p();
        this.f584c = new ArrayList();
    }

    @Override
    public void a(CharSequence charSequence) {
        switch (this.f582a) {
            case 1:
                ((ArrayList) this.f584c).add(charSequence);
                return;
            default:
                return;
        }
    }

    @Override
    public void d() {
        int i10;
        boolean z10;
        switch (this.f582a) {
            case 1:
                ArrayList arrayList = (ArrayList) this.f584c;
                int size = arrayList.size() - 1;
                while (true) {
                    if (size >= 0) {
                        CharSequence charSequence = (CharSequence) arrayList.get(size);
                        int length = charSequence.length();
                        int i11 = 0;
                        while (true) {
                            if (i11 < length) {
                                char charAt = charSequence.charAt(i11);
                                if (charAt != ' ') {
                                    switch (charAt) {
                                    }
                                }
                                i11++;
                            } else {
                                i11 = -1;
                            }
                        }
                        if (i11 == -1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            size--;
                        }
                    }
                }
                StringBuilder sb2 = new StringBuilder();
                for (i10 = 0; i10 < size + 1; i10++) {
                    sb2.append((CharSequence) arrayList.get(i10));
                    sb2.append('\n');
                }
                ((df.l) this.f583b).f6524g = sb2.toString();
                return;
            default:
                return;
        }
    }

    @Override
    public final df.a e() {
        switch (this.f582a) {
            case 0:
                return (df.i) this.f583b;
            default:
                return (df.l) this.f583b;
        }
    }

    @Override
    public void g(ef.a aVar) {
        switch (this.f582a) {
            case 0:
                aVar.a((String) this.f584c, (df.i) this.f583b);
                return;
            default:
                return;
        }
    }

    @Override
    public final a h(h hVar) {
        switch (this.f582a) {
            case 0:
                return null;
            default:
                if (hVar.f571g >= 4) {
                    return new a(-1, hVar.f569c + 4, false);
                }
                if (hVar.h) {
                    return a.a(hVar.e);
                }
                return null;
        }
    }

    public j(int i10, String str) {
        this.f582a = 0;
        ?? pVar = new df.p();
        this.f583b = pVar;
        pVar.f6520g = i10;
        this.f584c = str;
    }
}
