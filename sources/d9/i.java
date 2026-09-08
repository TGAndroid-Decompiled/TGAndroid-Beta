package d9;

import java.util.Iterator;
import java.util.NoSuchElementException;
import v7.t6;
public final class i implements Iterator {
    public String f6663b;
    public final CharSequence f6664c;
    public final a d;
    public int f6666f;
    public final xa.c h;
    public int f6662a = 2;
    public int f6665e = 0;

    public i(xa.c cVar, a5.a aVar, CharSequence charSequence) {
        this.h = cVar;
        this.d = (a) aVar.f298c;
        this.f6666f = aVar.f297b;
        this.f6664c = charSequence;
    }

    @Override
    public final boolean hasNext() {
        String str;
        a aVar;
        int i10 = this.f6662a;
        if (i10 != 4) {
            int c10 = m1.j.c(i10);
            if (c10 == 0) {
                return true;
            }
            if (c10 != 2) {
                this.f6662a = 4;
                int i11 = this.f6665e;
                while (true) {
                    int i12 = this.f6665e;
                    if (i12 != -1) {
                        b bVar = (b) this.h.f49360b;
                        CharSequence charSequence = this.f6664c;
                        int length = charSequence.length();
                        t6.e(i12, length);
                        while (true) {
                            if (i12 < length) {
                                if (bVar.a(charSequence.charAt(i12))) {
                                    break;
                                }
                                i12++;
                            } else {
                                i12 = -1;
                                break;
                            }
                        }
                        if (i12 == -1) {
                            i12 = charSequence.length();
                            this.f6665e = -1;
                        } else {
                            this.f6665e = i12 + 1;
                        }
                        int i13 = this.f6665e;
                        if (i13 == i11) {
                            int i14 = i13 + 1;
                            this.f6665e = i14;
                            if (i14 > charSequence.length()) {
                                this.f6665e = -1;
                            }
                        } else {
                            while (true) {
                                aVar = this.d;
                                if (i11 >= i12 || !aVar.a(charSequence.charAt(i11))) {
                                    break;
                                }
                                i11++;
                            }
                            while (i12 > i11 && aVar.a(charSequence.charAt(i12 - 1))) {
                                i12--;
                            }
                            int i15 = this.f6666f;
                            if (i15 == 1) {
                                i12 = charSequence.length();
                                this.f6665e = -1;
                                while (i12 > i11 && aVar.a(charSequence.charAt(i12 - 1))) {
                                    i12--;
                                }
                            } else {
                                this.f6666f = i15 - 1;
                            }
                            str = charSequence.subSequence(i11, i12).toString();
                        }
                    } else {
                        this.f6662a = 3;
                        str = null;
                        break;
                    }
                }
                this.f6663b = str;
                if (this.f6662a != 3) {
                    this.f6662a = 1;
                    return true;
                }
                return false;
            }
            return false;
        }
        throw new IllegalStateException();
    }

    @Override
    public final Object next() {
        if (hasNext()) {
            this.f6662a = 2;
            String str = this.f6663b;
            this.f6663b = null;
            return str;
        }
        throw new NoSuchElementException();
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
