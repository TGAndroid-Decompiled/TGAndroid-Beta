package af;

import java.io.Serializable;
import java.util.ArrayList;
public final class j extends ff.a {
    public final int f586a;
    public final df.a f587b;
    public final Serializable f588c;

    public j() {
        this.f586a = 1;
        this.f587b = new df.p();
        this.f588c = new ArrayList();
    }

    @Override
    public void a(CharSequence charSequence) {
        switch (this.f586a) {
            case 1:
                ((ArrayList) this.f588c).add(charSequence);
                return;
            default:
                return;
        }
    }

    @Override
    public void d() {
        int i10;
        boolean z10;
        switch (this.f586a) {
            case 1:
                ArrayList arrayList = (ArrayList) this.f588c;
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
                ((df.l) this.f587b).f7982g = sb2.toString();
                return;
            default:
                return;
        }
    }

    @Override
    public final df.a e() {
        switch (this.f586a) {
            case 0:
                return (df.i) this.f587b;
            default:
                return (df.l) this.f587b;
        }
    }

    @Override
    public void g(ef.a aVar) {
        switch (this.f586a) {
            case 0:
                aVar.a((String) this.f588c, (df.i) this.f587b);
                return;
            default:
                return;
        }
    }

    @Override
    public final a h(h hVar) {
        switch (this.f586a) {
            case 0:
                return null;
            default:
                if (hVar.f575g >= 4) {
                    return new a(-1, hVar.f573c + 4, false);
                }
                if (hVar.h) {
                    return a.a(hVar.e);
                }
                return null;
        }
    }

    public j(int i10, String str) {
        this.f586a = 0;
        ?? pVar = new df.p();
        this.f587b = pVar;
        pVar.f7978g = i10;
        this.f588c = str;
    }
}
