package d9;

import java.util.Iterator;
import java.util.NoSuchElementException;
import v7.t6;
public final class i implements Iterator {
    public String f8214b;
    public final CharSequence f8215c;
    public final a d;
    public int f8217f;
    public final a4.l h;
    public int f8213a = 2;
    public int f8216e = 0;

    public i(a4.l lVar, a5.a aVar, CharSequence charSequence) {
        this.h = lVar;
        this.d = (a) aVar.f300c;
        this.f8217f = aVar.f299b;
        this.f8215c = charSequence;
    }

    @Override
    public final boolean hasNext() {
        String str;
        a aVar;
        int i10 = this.f8213a;
        if (i10 != 4) {
            int c10 = m1.j.c(i10);
            if (c10 == 0) {
                return true;
            }
            if (c10 != 2) {
                this.f8213a = 4;
                int i11 = this.f8216e;
                while (true) {
                    int i12 = this.f8216e;
                    if (i12 != -1) {
                        b bVar = (b) this.h.f297b;
                        CharSequence charSequence = this.f8215c;
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
                            this.f8216e = -1;
                        } else {
                            this.f8216e = i12 + 1;
                        }
                        int i13 = this.f8216e;
                        if (i13 == i11) {
                            int i14 = i13 + 1;
                            this.f8216e = i14;
                            if (i14 > charSequence.length()) {
                                this.f8216e = -1;
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
                            int i15 = this.f8217f;
                            if (i15 == 1) {
                                i12 = charSequence.length();
                                this.f8216e = -1;
                                while (i12 > i11 && aVar.a(charSequence.charAt(i12 - 1))) {
                                    i12--;
                                }
                            } else {
                                this.f8217f = i15 - 1;
                            }
                            str = charSequence.subSequence(i11, i12).toString();
                        }
                    } else {
                        this.f8213a = 3;
                        str = null;
                        break;
                    }
                }
                this.f8214b = str;
                if (this.f8213a != 3) {
                    this.f8213a = 1;
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
            this.f8213a = 2;
            String str = this.f8214b;
            this.f8214b = null;
            return str;
        }
        throw new NoSuchElementException();
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
