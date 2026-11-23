package g9;

import a8.ma;
import a8.xa;
import java.util.Iterator;
import java.util.NoSuchElementException;
public final class s implements Iterator {
    public String f13252b;
    public final CharSequence f13253c;
    public final i d;
    public int f13255f;
    public final ob.c h;
    public int f13251a = 2;
    public int f13254e = 0;

    public s(ob.c cVar, xa xaVar, CharSequence charSequence) {
        this.h = cVar;
        this.d = (i) xaVar.f714c;
        this.f13255f = xaVar.f713b;
        this.f13253c = charSequence;
    }

    @Override
    public final boolean hasNext() {
        boolean z10;
        String str;
        i iVar;
        if (this.f13251a != 4) {
            z10 = true;
        } else {
            z10 = false;
        }
        ma.p(z10);
        int c10 = p1.g.c(this.f13251a);
        if (c10 == 0) {
            return true;
        }
        if (c10 != 2) {
            this.f13251a = 4;
            int i7 = this.f13254e;
            while (true) {
                int i10 = this.f13254e;
                if (i10 != -1) {
                    e eVar = (e) this.h.f21774b;
                    CharSequence charSequence = this.f13253c;
                    int length = charSequence.length();
                    ma.m(i10, length);
                    while (true) {
                        if (i10 < length) {
                            if (eVar.c(charSequence.charAt(i10))) {
                                break;
                            }
                            i10++;
                        } else {
                            i10 = -1;
                            break;
                        }
                    }
                    if (i10 == -1) {
                        i10 = charSequence.length();
                        this.f13254e = -1;
                    } else {
                        this.f13254e = i10 + 1;
                    }
                    int i11 = this.f13254e;
                    if (i11 == i7) {
                        int i12 = i11 + 1;
                        this.f13254e = i12;
                        if (i12 > charSequence.length()) {
                            this.f13254e = -1;
                        }
                    } else {
                        while (true) {
                            iVar = this.d;
                            if (i7 >= i10 || !iVar.c(charSequence.charAt(i7))) {
                                break;
                            }
                            i7++;
                        }
                        while (i10 > i7 && iVar.c(charSequence.charAt(i10 - 1))) {
                            i10--;
                        }
                        int i13 = this.f13255f;
                        if (i13 == 1) {
                            i10 = charSequence.length();
                            this.f13254e = -1;
                            while (i10 > i7 && iVar.c(charSequence.charAt(i10 - 1))) {
                                i10--;
                            }
                        } else {
                            this.f13255f = i13 - 1;
                        }
                        str = charSequence.subSequence(i7, i10).toString();
                    }
                } else {
                    this.f13251a = 3;
                    str = null;
                    break;
                }
            }
            this.f13252b = str;
            if (this.f13251a != 3) {
                this.f13251a = 1;
                return true;
            }
        }
        return false;
    }

    @Override
    public final Object next() {
        if (hasNext()) {
            this.f13251a = 2;
            String str = this.f13252b;
            this.f13252b = null;
            return str;
        }
        throw new NoSuchElementException();
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
