package g9;

import a8.ja;
import a8.xa;
import java.util.Iterator;
import java.util.NoSuchElementException;
public final class s implements Iterator {
    public String f12943b;
    public final CharSequence f12944c;
    public final i d;
    public int f12946f;
    public final d6.i h;
    public int f12942a = 2;
    public int f12945e = 0;

    public s(d6.i iVar, xa xaVar, CharSequence charSequence) {
        this.h = iVar;
        this.d = (i) xaVar.f714c;
        this.f12946f = xaVar.f713b;
        this.f12944c = charSequence;
    }

    @Override
    public final boolean hasNext() {
        boolean z10;
        String str;
        i iVar;
        if (this.f12942a != 4) {
            z10 = true;
        } else {
            z10 = false;
        }
        ja.p(z10);
        int c10 = p1.g.c(this.f12942a);
        if (c10 == 0) {
            return true;
        }
        if (c10 != 2) {
            this.f12942a = 4;
            int i7 = this.f12945e;
            while (true) {
                int i10 = this.f12945e;
                if (i10 != -1) {
                    e eVar = (e) this.h.f7595b;
                    CharSequence charSequence = this.f12944c;
                    int length = charSequence.length();
                    ja.m(i10, length);
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
                        this.f12945e = -1;
                    } else {
                        this.f12945e = i10 + 1;
                    }
                    int i11 = this.f12945e;
                    if (i11 == i7) {
                        int i12 = i11 + 1;
                        this.f12945e = i12;
                        if (i12 > charSequence.length()) {
                            this.f12945e = -1;
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
                        int i13 = this.f12946f;
                        if (i13 == 1) {
                            i10 = charSequence.length();
                            this.f12945e = -1;
                            while (i10 > i7 && iVar.c(charSequence.charAt(i10 - 1))) {
                                i10--;
                            }
                        } else {
                            this.f12946f = i13 - 1;
                        }
                        str = charSequence.subSequence(i7, i10).toString();
                    }
                } else {
                    this.f12942a = 3;
                    str = null;
                    break;
                }
            }
            this.f12943b = str;
            if (this.f12942a != 3) {
                this.f12942a = 1;
                return true;
            }
        }
        return false;
    }

    @Override
    public final Object next() {
        if (hasNext()) {
            this.f12942a = 2;
            String str = this.f12943b;
            this.f12943b = null;
            return str;
        }
        throw new NoSuchElementException();
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
