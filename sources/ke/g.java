package ke;

import java.io.Serializable;
import java.util.ArrayList;
public final class g extends pe.a {
    public final int f11135a;
    public final ne.a f11136b;
    public final Serializable f11137c;

    public g() {
        this.f11135a = 1;
        this.f11136b = new ne.p();
        this.f11137c = new ArrayList();
    }

    @Override
    public void a(CharSequence charSequence) {
        switch (this.f11135a) {
            case 1:
                ((ArrayList) this.f11137c).add(charSequence);
                return;
            default:
                return;
        }
    }

    @Override
    public void d() {
        int i10;
        boolean z4;
        switch (this.f11135a) {
            case 1:
                ArrayList arrayList = (ArrayList) this.f11137c;
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
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (z4) {
                            size--;
                        }
                    }
                }
                StringBuilder sb = new StringBuilder();
                for (i10 = 0; i10 < size + 1; i10++) {
                    sb.append((CharSequence) arrayList.get(i10));
                    sb.append('\n');
                }
                ((ne.l) this.f11136b).f15970g = sb.toString();
                return;
            default:
                return;
        }
    }

    @Override
    public final ne.a e() {
        switch (this.f11135a) {
            case 0:
                return (ne.i) this.f11136b;
            default:
                return (ne.l) this.f11136b;
        }
    }

    @Override
    public void g(oe.a aVar) {
        switch (this.f11135a) {
            case 0:
                aVar.a((String) this.f11137c, (ne.i) this.f11136b);
                return;
            default:
                return;
        }
    }

    @Override
    public final j4.h h(e eVar) {
        switch (this.f11135a) {
            case 0:
                return null;
            default:
                if (eVar.f11124g >= 4) {
                    return new j4.h(-1, eVar.f11121c + 4, false);
                }
                if (eVar.h) {
                    return j4.h.a(eVar.f11122e);
                }
                return null;
        }
    }

    public g(int i10, String str) {
        this.f11135a = 0;
        ?? pVar = new ne.p();
        this.f11136b = pVar;
        pVar.f15966g = i10;
        this.f11137c = str;
    }
}
