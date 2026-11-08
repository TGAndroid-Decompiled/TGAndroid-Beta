package gf;

import java.io.Serializable;
import java.util.ArrayList;
public final class j extends mf.a {
    public final int f13908a;
    public final kf.a f13909b;
    public final Serializable f13910c;

    public j() {
        this.f13908a = 1;
        this.f13909b = new kf.p();
        this.f13910c = new ArrayList();
    }

    @Override
    public void a(CharSequence charSequence) {
        switch (this.f13908a) {
            case 1:
                ((ArrayList) this.f13910c).add(charSequence);
                return;
            default:
                return;
        }
    }

    @Override
    public void d() {
        int i7;
        boolean z9;
        switch (this.f13908a) {
            case 1:
                ArrayList arrayList = (ArrayList) this.f13910c;
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
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        if (z9) {
                            size--;
                        }
                    }
                }
                StringBuilder sb2 = new StringBuilder();
                for (i7 = 0; i7 < size + 1; i7++) {
                    sb2.append((CharSequence) arrayList.get(i7));
                    sb2.append('\n');
                }
                ((kf.l) this.f13909b).f17277g = sb2.toString();
                return;
            default:
                return;
        }
    }

    @Override
    public final kf.a e() {
        switch (this.f13908a) {
            case 0:
                return (kf.i) this.f13909b;
            default:
                return (kf.l) this.f13909b;
        }
    }

    @Override
    public void g(lf.a aVar) {
        switch (this.f13908a) {
            case 0:
                aVar.a((String) this.f13910c, (kf.i) this.f13909b);
                return;
            default:
                return;
        }
    }

    @Override
    public final a h(h hVar) {
        switch (this.f13908a) {
            case 0:
                return null;
            default:
                if (hVar.f13897g >= 4) {
                    return new a(-1, hVar.f13894c + 4, false);
                }
                if (hVar.h) {
                    return a.a(hVar.f13895e);
                }
                return null;
        }
    }

    public j(int i7, String str) {
        this.f13908a = 0;
        ?? pVar = new kf.p();
        this.f13909b = pVar;
        pVar.f17273g = i7;
        this.f13910c = str;
    }
}
