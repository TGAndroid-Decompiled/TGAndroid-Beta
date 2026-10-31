package d9;

import java.util.Iterator;
import java.util.NoSuchElementException;
import v7.t6;
public final class s implements Iterator {
    public String f5810b;
    public final CharSequence f5811c;
    public final i d;
    public int f5812f;
    public final k6.h h;
    public int f5809a = 2;
    public int e = 0;

    public s(k6.h hVar, a5.a aVar, CharSequence charSequence) {
        this.h = hVar;
        this.d = (i) aVar.f282c;
        this.f5812f = aVar.f281b;
        this.f5811c = charSequence;
    }

    @Override
    public final boolean hasNext() {
        boolean z10;
        String str;
        i iVar;
        if (this.f5809a != 4) {
            z10 = true;
        } else {
            z10 = false;
        }
        t6.p(z10);
        int c10 = m1.j.c(this.f5809a);
        if (c10 == 0) {
            return true;
        }
        if (c10 != 2) {
            this.f5809a = 4;
            int i10 = this.e;
            while (true) {
                int i11 = this.e;
                if (i11 != -1) {
                    e eVar = (e) this.h.f10943b;
                    CharSequence charSequence = this.f5811c;
                    int length = charSequence.length();
                    t6.m(i11, length);
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
                        int i14 = this.f5812f;
                        if (i14 == 1) {
                            i11 = charSequence.length();
                            this.e = -1;
                            while (i11 > i10 && iVar.c(charSequence.charAt(i11 - 1))) {
                                i11--;
                            }
                        } else {
                            this.f5812f = i14 - 1;
                        }
                        str = charSequence.subSequence(i10, i11).toString();
                    }
                } else {
                    this.f5809a = 3;
                    str = null;
                    break;
                }
            }
            this.f5810b = str;
            if (this.f5809a != 3) {
                this.f5809a = 1;
                return true;
            }
        }
        return false;
    }

    @Override
    public final Object next() {
        if (hasNext()) {
            this.f5809a = 2;
            String str = this.f5810b;
            this.f5810b = null;
            return str;
        }
        throw new NoSuchElementException();
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
