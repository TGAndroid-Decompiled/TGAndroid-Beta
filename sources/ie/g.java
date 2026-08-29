package ie;

import java.io.Serializable;
import java.util.ArrayList;
public final class g extends ne.a {
    public final int f8915a;
    public final le.a f8916b;
    public final Serializable f8917c;

    public g() {
        this.f8915a = 1;
        this.f8916b = new le.p();
        this.f8917c = new ArrayList();
    }

    @Override
    public void a(CharSequence charSequence) {
        switch (this.f8915a) {
            case 1:
                ((ArrayList) this.f8917c).add(charSequence);
                return;
            default:
                return;
        }
    }

    @Override
    public void d() {
        int i10;
        boolean z10;
        switch (this.f8915a) {
            case 1:
                ArrayList arrayList = (ArrayList) this.f8917c;
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
                ((le.l) this.f8916b).f15201g = sb2.toString();
                return;
            default:
                return;
        }
    }

    @Override
    public final le.a e() {
        switch (this.f8915a) {
            case 0:
                return (le.i) this.f8916b;
            default:
                return (le.l) this.f8916b;
        }
    }

    @Override
    public void g(me.a aVar) {
        switch (this.f8915a) {
            case 0:
                aVar.a((String) this.f8917c, (le.i) this.f8916b);
                return;
            default:
                return;
        }
    }

    @Override
    public final g4.h h(e eVar) {
        switch (this.f8915a) {
            case 0:
                return null;
            default:
                if (eVar.f8904g >= 4) {
                    return new g4.h(-1, eVar.f8901c + 4, false);
                }
                if (eVar.h) {
                    return g4.h.a(eVar.f8902e);
                }
                return null;
        }
    }

    public g(int i10, String str) {
        this.f8915a = 0;
        ?? pVar = new le.p();
        this.f8916b = pVar;
        pVar.f15197g = i10;
        this.f8917c = str;
    }
}
