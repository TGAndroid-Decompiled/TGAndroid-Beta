package e9;

import a8.ng;
import a8.yb;
import java.util.Iterator;
import java.util.NoSuchElementException;
public final class s implements Iterator {
    public String f9849b;
    public final CharSequence f9850c;
    public final i d;
    public int f9851f;
    public final za.c h;
    public int f9848a = 2;
    public int e = 0;

    public s(za.c cVar, ng ngVar, CharSequence charSequence) {
        this.h = cVar;
        this.d = (i) ngVar.f640c;
        this.f9851f = ngVar.f639b;
        this.f9850c = charSequence;
    }

    @Override
    public final boolean hasNext() {
        boolean z10;
        String str;
        i iVar;
        if (this.f9848a != 4) {
            z10 = true;
        } else {
            z10 = false;
        }
        yb.p(z10);
        int c10 = m1.j.c(this.f9848a);
        if (c10 == 0) {
            return true;
        }
        if (c10 != 2) {
            this.f9848a = 4;
            int i10 = this.e;
            while (true) {
                int i11 = this.e;
                if (i11 != -1) {
                    e eVar = (e) this.h.f52902b;
                    CharSequence charSequence = this.f9850c;
                    int length = charSequence.length();
                    yb.m(i11, length);
                    while (true) {
                        if (i11 < length) {
                            if (eVar.c(charSequence.charAt(i11))) {
                                break;
                            }
                            i11++;
                        } else {
                            i11 = -1;
                            break;
                        }
                    }
                    if (i11 == -1) {
                        i11 = charSequence.length();
                        this.e = -1;
                    } else {
                        this.e = i11 + 1;
                    }
                    int i12 = this.e;
                    if (i12 == i10) {
                        int i13 = i12 + 1;
                        this.e = i13;
                        if (i13 > charSequence.length()) {
                            this.e = -1;
                        }
                    } else {
                        while (true) {
                            iVar = this.d;
                            if (i10 >= i11 || !iVar.c(charSequence.charAt(i10))) {
                                break;
                            }
                            i10++;
                        }
                        while (i11 > i10 && iVar.c(charSequence.charAt(i11 - 1))) {
                            i11--;
                        }
                        int i14 = this.f9851f;
                        if (i14 == 1) {
                            i11 = charSequence.length();
                            this.e = -1;
                            while (i11 > i10 && iVar.c(charSequence.charAt(i11 - 1))) {
                                i11--;
                            }
                        } else {
                            this.f9851f = i14 - 1;
                        }
                        str = charSequence.subSequence(i10, i11).toString();
                    }
                } else {
                    this.f9848a = 3;
                    str = null;
                    break;
                }
            }
            this.f9849b = str;
            if (this.f9848a != 3) {
                this.f9848a = 1;
                return true;
            }
        }
        return false;
    }

    @Override
    public final Object next() {
        if (hasNext()) {
            this.f9848a = 2;
            String str = this.f9849b;
            this.f9849b = null;
            return str;
        }
        throw new NoSuchElementException();
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
