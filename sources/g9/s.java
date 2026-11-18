package g9;

import a8.la;
import a8.xa;
import java.util.Iterator;
import java.util.NoSuchElementException;
public final class s implements Iterator {
    public String f13260b;
    public final CharSequence f13261c;
    public final i d;
    public int f13263f;
    public final ob.c h;
    public int f13259a = 2;
    public int f13262e = 0;

    public s(ob.c cVar, xa xaVar, CharSequence charSequence) {
        this.h = cVar;
        this.d = (i) xaVar.f714c;
        this.f13263f = xaVar.f713b;
        this.f13261c = charSequence;
    }

    @Override
    public final boolean hasNext() {
        boolean z10;
        String str;
        i iVar;
        if (this.f13259a != 4) {
            z10 = true;
        } else {
            z10 = false;
        }
        la.p(z10);
        int c10 = p1.g.c(this.f13259a);
        if (c10 == 0) {
            return true;
        }
        if (c10 != 2) {
            this.f13259a = 4;
            int i7 = this.f13262e;
            while (true) {
                int i10 = this.f13262e;
                if (i10 != -1) {
                    e eVar = (e) this.h.f21783b;
                    CharSequence charSequence = this.f13261c;
                    int length = charSequence.length();
                    la.m(i10, length);
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
                        this.f13262e = -1;
                    } else {
                        this.f13262e = i10 + 1;
                    }
                    int i11 = this.f13262e;
                    if (i11 == i7) {
                        int i12 = i11 + 1;
                        this.f13262e = i12;
                        if (i12 > charSequence.length()) {
                            this.f13262e = -1;
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
                        int i13 = this.f13263f;
                        if (i13 == 1) {
                            i10 = charSequence.length();
                            this.f13262e = -1;
                            while (i10 > i7 && iVar.c(charSequence.charAt(i10 - 1))) {
                                i10--;
                            }
                        } else {
                            this.f13263f = i13 - 1;
                        }
                        str = charSequence.subSequence(i7, i10).toString();
                    }
                } else {
                    this.f13259a = 3;
                    str = null;
                    break;
                }
            }
            this.f13260b = str;
            if (this.f13259a != 3) {
                this.f13259a = 1;
                return true;
            }
        }
        return false;
    }

    @Override
    public final Object next() {
        if (hasNext()) {
            this.f13259a = 2;
            String str = this.f13260b;
            this.f13260b = null;
            return str;
        }
        throw new NoSuchElementException();
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
