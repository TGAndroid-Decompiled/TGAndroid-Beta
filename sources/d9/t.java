package d9;

import java.util.Iterator;
import java.util.NoSuchElementException;
import v7.u6;
public final class t implements Iterator {
    public String f7897b;
    public final CharSequence f7898c;
    public final i d;
    public int f7899f;
    public final a6.i h;
    public int f7896a = 2;
    public int e = 0;

    public t(a6.i iVar, a5.a aVar, CharSequence charSequence) {
        this.h = iVar;
        this.d = (i) aVar.f282c;
        this.f7899f = aVar.f281b;
        this.f7898c = charSequence;
    }

    @Override
    public final boolean hasNext() {
        boolean z10;
        String str;
        i iVar;
        if (this.f7896a != 4) {
            z10 = true;
        } else {
            z10 = false;
        }
        u6.p(z10);
        int c10 = m1.j.c(this.f7896a);
        if (c10 == 0) {
            return true;
        }
        if (c10 != 2) {
            this.f7896a = 4;
            int i10 = this.e;
            while (true) {
                int i11 = this.e;
                if (i11 != -1) {
                    e eVar = (e) this.h.f307b;
                    CharSequence charSequence = this.f7898c;
                    int length = charSequence.length();
                    u6.m(i11, length);
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
                        int i14 = this.f7899f;
                        if (i14 == 1) {
                            i11 = charSequence.length();
                            this.e = -1;
                            while (i11 > i10 && iVar.c(charSequence.charAt(i11 - 1))) {
                                i11--;
                            }
                        } else {
                            this.f7899f = i14 - 1;
                        }
                        str = charSequence.subSequence(i10, i11).toString();
                    }
                } else {
                    this.f7896a = 3;
                    str = null;
                    break;
                }
            }
            this.f7897b = str;
            if (this.f7896a != 3) {
                this.f7896a = 1;
                return true;
            }
        }
        return false;
    }

    @Override
    public final Object next() {
        if (hasNext()) {
            this.f7896a = 2;
            String str = this.f7897b;
            this.f7897b = null;
            return str;
        }
        throw new NoSuchElementException();
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
