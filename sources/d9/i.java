package d9;

import java.util.Iterator;
import java.util.NoSuchElementException;
import v7.t6;
public final class i implements Iterator {
    public String f6636b;
    public final CharSequence f6637c;
    public final a d;
    public int f6639f;
    public final xa.c h;
    public int f6635a = 2;
    public int f6638e = 0;

    public i(xa.c cVar, a5.a aVar, CharSequence charSequence) {
        this.h = cVar;
        this.d = (a) aVar.f286c;
        this.f6639f = aVar.f285b;
        this.f6637c = charSequence;
    }

    @Override
    public final boolean hasNext() {
        String str;
        a aVar;
        int i10 = this.f6635a;
        if (i10 != 4) {
            int c10 = m1.j.c(i10);
            if (c10 == 0) {
                return true;
            }
            if (c10 != 2) {
                this.f6635a = 4;
                int i11 = this.f6638e;
                while (true) {
                    int i12 = this.f6638e;
                    if (i12 != -1) {
                        b bVar = (b) this.h.f49331b;
                        CharSequence charSequence = this.f6637c;
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
                            this.f6638e = -1;
                        } else {
                            this.f6638e = i12 + 1;
                        }
                        int i13 = this.f6638e;
                        if (i13 == i11) {
                            int i14 = i13 + 1;
                            this.f6638e = i14;
                            if (i14 > charSequence.length()) {
                                this.f6638e = -1;
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
                            int i15 = this.f6639f;
                            if (i15 == 1) {
                                i12 = charSequence.length();
                                this.f6638e = -1;
                                while (i12 > i11 && aVar.a(charSequence.charAt(i12 - 1))) {
                                    i12--;
                                }
                            } else {
                                this.f6639f = i15 - 1;
                            }
                            str = charSequence.subSequence(i11, i12).toString();
                        }
                    } else {
                        this.f6635a = 3;
                        str = null;
                        break;
                    }
                }
                this.f6636b = str;
                if (this.f6635a != 3) {
                    this.f6635a = 1;
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
            this.f6635a = 2;
            String str = this.f6636b;
            this.f6636b = null;
            return str;
        }
        throw new NoSuchElementException();
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
