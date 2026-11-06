package g9;

import a8.ia;
import a8.wa;
import java.util.Iterator;
import java.util.NoSuchElementException;
public final class t implements Iterator {
    public String f13596b;
    public final CharSequence f13597c;
    public final i d;
    public int f13599f;
    public final d6.i h;
    public int f13595a = 2;
    public int f13598e = 0;

    public t(d6.i iVar, wa waVar, CharSequence charSequence) {
        this.h = iVar;
        this.d = (i) waVar.f701c;
        this.f13599f = waVar.f700b;
        this.f13597c = charSequence;
    }

    @Override
    public final boolean hasNext() {
        boolean z9;
        String str;
        i iVar;
        if (this.f13595a != 4) {
            z9 = true;
        } else {
            z9 = false;
        }
        ia.p(z9);
        int c10 = p1.g.c(this.f13595a);
        if (c10 == 0) {
            return true;
        }
        if (c10 != 2) {
            this.f13595a = 4;
            int i7 = this.f13598e;
            while (true) {
                int i10 = this.f13598e;
                if (i10 != -1) {
                    e eVar = (e) this.h.f8209b;
                    CharSequence charSequence = this.f13597c;
                    int length = charSequence.length();
                    ia.m(i10, length);
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
                        this.f13598e = -1;
                    } else {
                        this.f13598e = i10 + 1;
                    }
                    int i11 = this.f13598e;
                    if (i11 == i7) {
                        int i12 = i11 + 1;
                        this.f13598e = i12;
                        if (i12 > charSequence.length()) {
                            this.f13598e = -1;
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
                        int i13 = this.f13599f;
                        if (i13 == 1) {
                            i10 = charSequence.length();
                            this.f13598e = -1;
                            while (i10 > i7 && iVar.c(charSequence.charAt(i10 - 1))) {
                                i10--;
                            }
                        } else {
                            this.f13599f = i13 - 1;
                        }
                        str = charSequence.subSequence(i7, i10).toString();
                    }
                } else {
                    this.f13595a = 3;
                    str = null;
                    break;
                }
            }
            this.f13596b = str;
            if (this.f13595a != 3) {
                this.f13595a = 1;
                return true;
            }
        }
        return false;
    }

    @Override
    public final Object next() {
        if (hasNext()) {
            this.f13595a = 2;
            String str = this.f13596b;
            this.f13596b = null;
            return str;
        }
        throw new NoSuchElementException();
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
