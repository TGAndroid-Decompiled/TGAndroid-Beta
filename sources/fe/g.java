package fe;

import java.io.Serializable;
import java.util.ArrayList;
public final class g extends ke.a {
    public final int f6078a;
    public final ie.a f6079b;
    public final Serializable f6080c;

    public g() {
        this.f6078a = 1;
        this.f6079b = new ie.p();
        this.f6080c = new ArrayList();
    }

    @Override
    public void a(CharSequence charSequence) {
        switch (this.f6078a) {
            case 1:
                ((ArrayList) this.f6080c).add(charSequence);
                return;
            default:
                return;
        }
    }

    @Override
    public void d() {
        int i9;
        boolean z10;
        switch (this.f6078a) {
            case 1:
                ArrayList arrayList = (ArrayList) this.f6080c;
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
                for (i9 = 0; i9 < size + 1; i9++) {
                    sb2.append((CharSequence) arrayList.get(i9));
                    sb2.append('\n');
                }
                ((ie.l) this.f6079b).f11118g = sb2.toString();
                return;
            default:
                return;
        }
    }

    @Override
    public final ie.a e() {
        switch (this.f6078a) {
            case 0:
                return (ie.i) this.f6079b;
            default:
                return (ie.l) this.f6079b;
        }
    }

    @Override
    public void g(je.a aVar) {
        switch (this.f6078a) {
            case 0:
                aVar.a((String) this.f6080c, (ie.i) this.f6079b);
                return;
            default:
                return;
        }
    }

    @Override
    public final e4.h h(e eVar) {
        switch (this.f6078a) {
            case 0:
                return null;
            default:
                if (eVar.f6067g >= 4) {
                    return new e4.h(-1, eVar.f6064c + 4, false);
                }
                if (eVar.h) {
                    return e4.h.a(eVar.f6065e);
                }
                return null;
        }
    }

    public g(int i9, String str) {
        this.f6078a = 0;
        ?? pVar = new ie.p();
        this.f6079b = pVar;
        pVar.f11114g = i9;
        this.f6080c = str;
    }
}
