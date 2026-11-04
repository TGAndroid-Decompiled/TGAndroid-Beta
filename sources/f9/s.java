package f9;

import b8.kg;
import b8.zb;
import java.util.Iterator;
import java.util.NoSuchElementException;
public final class s implements Iterator {
    public String f11517b;
    public final CharSequence f11518c;
    public final i d;
    public int f11520f;
    public final bb.c h;
    public int f11516a = 2;
    public int f11519e = 0;

    public s(bb.c cVar, kg kgVar, CharSequence charSequence) {
        this.h = cVar;
        this.d = (i) kgVar.f2723c;
        this.f11520f = kgVar.f2722b;
        this.f11518c = charSequence;
    }

    @Override
    public final boolean hasNext() {
        boolean z10;
        String str;
        i iVar;
        if (this.f11516a != 4) {
            z10 = true;
        } else {
            z10 = false;
        }
        zb.p(z10);
        int c2 = o1.g.c(this.f11516a);
        if (c2 == 0) {
            return true;
        }
        if (c2 != 2) {
            this.f11516a = 4;
            int i3 = this.f11519e;
            while (true) {
                int i10 = this.f11519e;
                if (i10 != -1) {
                    e eVar = (e) this.h.f3211b;
                    CharSequence charSequence = this.f11518c;
                    int length = charSequence.length();
                    zb.m(i10, length);
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
                        this.f11519e = -1;
                    } else {
                        this.f11519e = i10 + 1;
                    }
                    int i11 = this.f11519e;
                    if (i11 == i3) {
                        int i12 = i11 + 1;
                        this.f11519e = i12;
                        if (i12 > charSequence.length()) {
                            this.f11519e = -1;
                        }
                    } else {
                        while (true) {
                            iVar = this.d;
                            if (i3 >= i10 || !iVar.c(charSequence.charAt(i3))) {
                                break;
                            }
                            i3++;
                        }
                        while (i10 > i3 && iVar.c(charSequence.charAt(i10 - 1))) {
                            i10--;
                        }
                        int i13 = this.f11520f;
                        if (i13 == 1) {
                            i10 = charSequence.length();
                            this.f11519e = -1;
                            while (i10 > i3 && iVar.c(charSequence.charAt(i10 - 1))) {
                                i10--;
                            }
                        } else {
                            this.f11520f = i13 - 1;
                        }
                        str = charSequence.subSequence(i3, i10).toString();
                    }
                } else {
                    this.f11516a = 3;
                    str = null;
                    break;
                }
            }
            this.f11517b = str;
            if (this.f11516a != 3) {
                this.f11516a = 1;
                return true;
            }
        }
        return false;
    }

    @Override
    public final Object next() {
        if (hasNext()) {
            this.f11516a = 2;
            String str = this.f11517b;
            this.f11517b = null;
            return str;
        }
        throw new NoSuchElementException();
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
