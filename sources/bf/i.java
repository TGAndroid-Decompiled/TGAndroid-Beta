package bf;

import java.io.Serializable;
import java.util.ArrayList;
public final class i extends gf.a {
    public final int f3936a;
    public final ef.a f3937b;
    public final Serializable f3938c;

    public i() {
        this.f3936a = 1;
        this.f3937b = new ef.p();
        this.f3938c = new ArrayList();
    }

    @Override
    public void a(CharSequence charSequence) {
        switch (this.f3936a) {
            case 1:
                ((ArrayList) this.f3938c).add(charSequence);
                return;
            default:
                return;
        }
    }

    @Override
    public void d() {
        int i10;
        boolean z10;
        switch (this.f3936a) {
            case 1:
                ArrayList arrayList = (ArrayList) this.f3938c;
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
                ((ef.l) this.f3937b).f9932g = sb2.toString();
                return;
            default:
                return;
        }
    }

    @Override
    public final ef.a e() {
        switch (this.f3936a) {
            case 0:
                return (ef.i) this.f3937b;
            default:
                return (ef.l) this.f3937b;
        }
    }

    @Override
    public void g(ff.a aVar) {
        switch (this.f3936a) {
            case 0:
                aVar.a((String) this.f3938c, (ef.i) this.f3937b);
                return;
            default:
                return;
        }
    }

    @Override
    public final a h(g gVar) {
        switch (this.f3936a) {
            case 0:
                return null;
            default:
                if (gVar.f3925g >= 4) {
                    return new a(-1, gVar.f3923c + 4, false);
                }
                if (gVar.h) {
                    return a.a(gVar.e);
                }
                return null;
        }
    }

    public i(int i10, String str) {
        this.f3936a = 0;
        ?? pVar = new ef.p();
        this.f3937b = pVar;
        pVar.f9928g = i10;
        this.f3938c = str;
    }
}
