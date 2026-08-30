package ke;

import java.io.Serializable;
import java.util.ArrayList;
public final class g extends pe.a {
    public final int f10362a;
    public final ne.a f10363b;
    public final Serializable f10364c;

    public g() {
        this.f10362a = 1;
        this.f10363b = new ne.p();
        this.f10364c = new ArrayList();
    }

    @Override
    public void a(CharSequence charSequence) {
        switch (this.f10362a) {
            case 1:
                ((ArrayList) this.f10364c).add(charSequence);
                return;
            default:
                return;
        }
    }

    @Override
    public void d() {
        int i10;
        boolean z4;
        switch (this.f10362a) {
            case 1:
                ArrayList arrayList = (ArrayList) this.f10364c;
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
                ((ne.l) this.f10363b).f14951g = sb.toString();
                return;
            default:
                return;
        }
    }

    @Override
    public final ne.a e() {
        switch (this.f10362a) {
            case 0:
                return (ne.i) this.f10363b;
            default:
                return (ne.l) this.f10363b;
        }
    }

    @Override
    public void g(oe.a aVar) {
        switch (this.f10362a) {
            case 0:
                aVar.a((String) this.f10364c, (ne.i) this.f10363b);
                return;
            default:
                return;
        }
    }

    @Override
    public final j4.h h(e eVar) {
        switch (this.f10362a) {
            case 0:
                return null;
            default:
                if (eVar.f10351g >= 4) {
                    return new j4.h(-1, eVar.f10349c + 4, false);
                }
                if (eVar.h) {
                    return j4.h.a(eVar.e);
                }
                return null;
        }
    }

    public g(int i10, String str) {
        this.f10362a = 0;
        ?? pVar = new ne.p();
        this.f10363b = pVar;
        pVar.f14947g = i10;
        this.f10364c = str;
    }
}
