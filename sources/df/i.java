package df;

import java.io.Serializable;
import java.util.ArrayList;
public final class i extends jf.a {
    public final int f8878a;
    public final gf.a f8879b;
    public final Serializable f8880c;

    public i() {
        this.f8878a = 1;
        this.f8879b = new gf.p();
        this.f8880c = new ArrayList();
    }

    @Override
    public void a(CharSequence charSequence) {
        switch (this.f8878a) {
            case 1:
                ((ArrayList) this.f8880c).add(charSequence);
                return;
            default:
                return;
        }
    }

    @Override
    public void d() {
        int i3;
        boolean z10;
        switch (this.f8878a) {
            case 1:
                ArrayList arrayList = (ArrayList) this.f8880c;
                int size = arrayList.size() - 1;
                while (true) {
                    if (size >= 0) {
                        CharSequence charSequence = (CharSequence) arrayList.get(size);
                        int length = charSequence.length();
                        int i10 = 0;
                        while (true) {
                            if (i10 < length) {
                                char charAt = charSequence.charAt(i10);
                                if (charAt != ' ') {
                                    switch (charAt) {
                                    }
                                }
                                i10++;
                            } else {
                                i10 = -1;
                            }
                        }
                        if (i10 == -1) {
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
                for (i3 = 0; i3 < size + 1; i3++) {
                    sb2.append((CharSequence) arrayList.get(i3));
                    sb2.append('\n');
                }
                ((gf.l) this.f8879b).f12262g = sb2.toString();
                return;
            default:
                return;
        }
    }

    @Override
    public final gf.a e() {
        switch (this.f8878a) {
            case 0:
                return (gf.i) this.f8879b;
            default:
                return (gf.l) this.f8879b;
        }
    }

    @Override
    public void g(hf.a aVar) {
        switch (this.f8878a) {
            case 0:
                aVar.a((String) this.f8880c, (gf.i) this.f8879b);
                return;
            default:
                return;
        }
    }

    @Override
    public final a h(g gVar) {
        switch (this.f8878a) {
            case 0:
                return null;
            default:
                if (gVar.f8867g >= 4) {
                    return new a(-1, gVar.f8864c + 4, false);
                }
                if (gVar.h) {
                    return a.a(gVar.f8865e);
                }
                return null;
        }
    }

    public i(int i3, String str) {
        this.f8878a = 0;
        ?? pVar = new gf.p();
        this.f8879b = pVar;
        pVar.f12258g = i3;
        this.f8880c = str;
    }
}
