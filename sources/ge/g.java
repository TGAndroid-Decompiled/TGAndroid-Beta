package ge;

import java.io.Serializable;
import java.util.ArrayList;

public final class g extends le.a {

    public final int f6878a;

    public final je.a f6879b;

    public final Serializable f6880c;

    public g() {
        this.f6878a = 1;
        this.f6879b = new je.l();
        this.f6880c = new ArrayList();
    }

    @Override
    public void a(CharSequence charSequence) {
        switch (this.f6878a) {
            case 1:
                ((ArrayList) this.f6880c).add(charSequence);
                break;
        }
    }

    @Override
    public void d() {
        int i10;
        switch (this.f6878a) {
            case 1:
                ArrayList arrayList = (ArrayList) this.f6880c;
                int size = arrayList.size() - 1;
                while (true) {
                    if (size >= 0) {
                        CharSequence charSequence = (CharSequence) arrayList.get(size);
                        int length = charSequence.length();
                        int i11 = 0;
                        while (true) {
                            if (i11 < length) {
                                char cCharAt = charSequence.charAt(i11);
                                if (cCharAt != ' ') {
                                    switch (cCharAt) {
                                        case '\t':
                                        case '\n':
                                        case 11:
                                        case '\f':
                                        case '\r':
                                            break;
                                    }
                                }
                                i11++;
                            } else {
                                i11 = -1;
                            }
                        }
                        if (i11 == -1) {
                            size--;
                        }
                    }
                }
                StringBuilder sb2 = new StringBuilder();
                for (i10 = 0; i10 < size + 1; i10++) {
                    sb2.append((CharSequence) arrayList.get(i10));
                    sb2.append('\n');
                }
                ((je.l) this.f6879b).f12920g = sb2.toString();
                break;
        }
    }

    @Override
    public final je.a e() {
        switch (this.f6878a) {
            case 0:
                return (je.i) this.f6879b;
            default:
                return (je.l) this.f6879b;
        }
    }

    @Override
    public void g(ke.a aVar) {
        switch (this.f6878a) {
            case 0:
                aVar.a((String) this.f6880c, (je.i) this.f6879b);
                break;
        }
    }

    @Override
    public final e4.h h(e eVar) {
        switch (this.f6878a) {
            case 0:
                return null;
            default:
                if (eVar.f6867g >= 4) {
                    return new e4.h(-1, eVar.f6864c + 4, false);
                }
                if (eVar.h) {
                    return e4.h.a(eVar.f6865e);
                }
                return null;
        }
    }

    public g(int i10, String str) {
        this.f6878a = 0;
        je.i iVar = new je.i();
        this.f6879b = iVar;
        iVar.f12916g = i10;
        this.f6880c = str;
    }
}
