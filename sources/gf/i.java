package gf;

import java.io.Serializable;
import java.util.ArrayList;
public final class i extends mf.a {
    public final int f13557a;
    public final kf.a f13558b;
    public final Serializable f13559c;

    public i() {
        this.f13557a = 1;
        this.f13558b = new kf.p();
        this.f13559c = new ArrayList();
    }

    @Override
    public void a(CharSequence charSequence) {
        switch (this.f13557a) {
            case 1:
                ((ArrayList) this.f13559c).add(charSequence);
                return;
            default:
                return;
        }
    }

    @Override
    public void d() {
        int i7;
        boolean z10;
        switch (this.f13557a) {
            case 1:
                ArrayList arrayList = (ArrayList) this.f13559c;
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
                for (i7 = 0; i7 < size + 1; i7++) {
                    sb2.append((CharSequence) arrayList.get(i7));
                    sb2.append('\n');
                }
                ((kf.l) this.f13558b).f18225g = sb2.toString();
                return;
            default:
                return;
        }
    }

    @Override
    public final kf.a e() {
        switch (this.f13557a) {
            case 0:
                return (kf.i) this.f13558b;
            default:
                return (kf.l) this.f13558b;
        }
    }

    @Override
    public void g(lf.a aVar) {
        switch (this.f13557a) {
            case 0:
                aVar.a((String) this.f13559c, (kf.i) this.f13558b);
                return;
            default:
                return;
        }
    }

    @Override
    public final a h(g gVar) {
        switch (this.f13557a) {
            case 0:
                return null;
            default:
                if (gVar.f13546g >= 4) {
                    return new a(-1, gVar.f13543c + 4, false);
                }
                if (gVar.h) {
                    return a.a(gVar.f13544e);
                }
                return null;
        }
    }

    public i(int i7, String str) {
        this.f13557a = 0;
        ?? pVar = new kf.p();
        this.f13558b = pVar;
        pVar.f18221g = i7;
        this.f13559c = str;
    }
}
