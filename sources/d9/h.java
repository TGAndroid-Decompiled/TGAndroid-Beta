package d9;

import java.util.Iterator;
import java.util.NoSuchElementException;
import v7.t6;
public final class h implements Iterator {
    public String f6339b;
    public final CharSequence f6340c;
    public final a d;
    public int f6341f;
    public final pb.c h;
    public int f6338a = 2;
    public int e = 0;

    public h(pb.c cVar, a5.a aVar, CharSequence charSequence) {
        this.h = cVar;
        this.d = (a) aVar.f276c;
        this.f6341f = aVar.f275b;
        this.f6340c = charSequence;
    }

    @Override
    public final boolean hasNext() {
        String str;
        a aVar;
        int i10 = this.f6338a;
        if (i10 != 4) {
            int c10 = m1.j.c(i10);
            if (c10 == 0) {
                return true;
            }
            if (c10 != 2) {
                this.f6338a = 4;
                int i11 = this.e;
                while (true) {
                    int i12 = this.e;
                    if (i12 != -1) {
                        b bVar = (b) this.h.f39876b;
                        CharSequence charSequence = this.f6340c;
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
                            int i15 = this.f6341f;
                            if (i15 == 1) {
                                i12 = charSequence.length();
                                this.e = -1;
                                while (i12 > i11 && aVar.a(charSequence.charAt(i12 - 1))) {
                                    i12--;
                                }
                            } else {
                                this.f6341f = i15 - 1;
                            }
                            str = charSequence.subSequence(i11, i12).toString();
                        }
                    } else {
                        this.f6338a = 3;
                        str = null;
                        break;
                    }
                }
                this.f6339b = str;
                if (this.f6338a != 3) {
                    this.f6338a = 1;
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
            this.f6338a = 2;
            String str = this.f6339b;
            this.f6339b = null;
            return str;
        }
        throw new NoSuchElementException();
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
