package n8;

import g7.d0;
import java.util.Iterator;
import java.util.NoSuchElementException;
import m1.j;
import n5.e0;
public final class h implements Iterator {
    public String f18518b;
    public final CharSequence f18519c;
    public final a d;
    public int f18521f;
    public final e0 h;
    public int f18517a = 2;
    public int f18520e = 0;

    public h(e0 e0Var, a6.a aVar, CharSequence charSequence) {
        this.h = e0Var;
        this.d = (a) aVar.f101b;
        this.f18521f = aVar.f102c;
        this.f18519c = charSequence;
    }

    @Override
    public final boolean hasNext() {
        String str;
        a aVar;
        int i9 = this.f18517a;
        if (i9 != 4) {
            int b10 = j.b(i9);
            if (b10 == 0) {
                return true;
            }
            if (b10 != 2) {
                this.f18517a = 4;
                int i10 = this.f18520e;
                while (true) {
                    int i11 = this.f18520e;
                    if (i11 != -1) {
                        b bVar = (b) this.h.f18488b;
                        CharSequence charSequence = this.f18519c;
                        int length = charSequence.length();
                        d0.c(i11, length);
                        while (true) {
                            if (i11 < length) {
                                if (bVar.a(charSequence.charAt(i11))) {
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
                            this.f18520e = -1;
                        } else {
                            this.f18520e = i11 + 1;
                        }
                        int i12 = this.f18520e;
                        if (i12 == i10) {
                            int i13 = i12 + 1;
                            this.f18520e = i13;
                            if (i13 > charSequence.length()) {
                                this.f18520e = -1;
                            }
                        } else {
                            while (true) {
                                aVar = this.d;
                                if (i10 >= i11 || !aVar.a(charSequence.charAt(i10))) {
                                    break;
                                }
                                i10++;
                            }
                            while (i11 > i10 && aVar.a(charSequence.charAt(i11 - 1))) {
                                i11--;
                            }
                            int i14 = this.f18521f;
                            if (i14 == 1) {
                                i11 = charSequence.length();
                                this.f18520e = -1;
                                while (i11 > i10 && aVar.a(charSequence.charAt(i11 - 1))) {
                                    i11--;
                                }
                            } else {
                                this.f18521f = i14 - 1;
                            }
                            str = charSequence.subSequence(i10, i11).toString();
                        }
                    } else {
                        this.f18517a = 3;
                        str = null;
                        break;
                    }
                }
                this.f18518b = str;
                if (this.f18517a != 3) {
                    this.f18517a = 1;
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
            this.f18517a = 2;
            String str = this.f18518b;
            this.f18518b = null;
            return str;
        }
        throw new NoSuchElementException();
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
