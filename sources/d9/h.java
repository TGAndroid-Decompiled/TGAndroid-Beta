package d9;

import java.util.Iterator;
import java.util.NoSuchElementException;
import v7.t6;
public final class h implements Iterator {
    public String f7563b;
    public final CharSequence f7564c;
    public final a d;
    public int f7565f;
    public final a6.i h;
    public int f7562a = 2;
    public int e = 0;

    public h(a6.i iVar, a5.a aVar, CharSequence charSequence) {
        this.h = iVar;
        this.d = (a) aVar.f276c;
        this.f7565f = aVar.f275b;
        this.f7564c = charSequence;
    }

    @Override
    public final boolean hasNext() {
        String str;
        a aVar;
        int i10 = this.f7562a;
        if (i10 != 4) {
            int c10 = m1.j.c(i10);
            if (c10 == 0) {
                return true;
            }
            if (c10 != 2) {
                this.f7562a = 4;
                int i11 = this.e;
                while (true) {
                    int i12 = this.e;
                    if (i12 != -1) {
                        b bVar = (b) this.h.f301b;
                        CharSequence charSequence = this.f7564c;
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
                            this.e = -1;
                        } else {
                            this.e = i12 + 1;
                        }
                        int i13 = this.e;
                        if (i13 == i11) {
                            int i14 = i13 + 1;
                            this.e = i14;
                            if (i14 > charSequence.length()) {
                                this.e = -1;
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
                            int i15 = this.f7565f;
                            if (i15 == 1) {
                                i12 = charSequence.length();
                                this.e = -1;
                                while (i12 > i11 && aVar.a(charSequence.charAt(i12 - 1))) {
                                    i12--;
                                }
                            } else {
                                this.f7565f = i15 - 1;
                            }
                            str = charSequence.subSequence(i11, i12).toString();
                        }
                    } else {
                        this.f7562a = 3;
                        str = null;
                        break;
                    }
                }
                this.f7563b = str;
                if (this.f7562a != 3) {
                    this.f7562a = 1;
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
            this.f7562a = 2;
            String str = this.f7563b;
            this.f7563b = null;
            return str;
        }
        throw new NoSuchElementException();
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
