package o8;

import h7.f0;
import java.util.Iterator;
import java.util.NoSuchElementException;
import m1.j;
import m5.o;

public final class h implements Iterator {

    public String f19368b;

    public final CharSequence f19369c;
    public final a d;

    public int f19371f;
    public final o h;

    public int f19367a = 2;

    public int f19370e = 0;

    public h(o oVar, b6.a aVar, CharSequence charSequence) {
        this.h = oVar;
        this.d = (a) aVar.f2033b;
        this.f19371f = aVar.f2034c;
        this.f19369c = charSequence;
    }

    @Override
    public final boolean hasNext() {
        String string;
        a aVar;
        int i10 = this.f19367a;
        if (i10 == 4) {
            throw new IllegalStateException();
        }
        int iB = j.b(i10);
        if (iB == 0) {
            return true;
        }
        if (iB == 2) {
            return false;
        }
        this.f19367a = 4;
        int i11 = this.f19370e;
        while (true) {
            int length = this.f19370e;
            if (length == -1) {
                this.f19367a = 3;
                string = null;
                break;
            }
            b bVar = (b) this.h.f17823b;
            CharSequence charSequence = this.f19369c;
            int length2 = charSequence.length();
            f0.c(length, length2);
            while (true) {
                if (length >= length2) {
                    length = -1;
                    break;
                }
                if (bVar.a(charSequence.charAt(length))) {
                    break;
                }
                length++;
            }
            if (length == -1) {
                length = charSequence.length();
                this.f19370e = -1;
            } else {
                this.f19370e = length + 1;
            }
            int i12 = this.f19370e;
            if (i12 != i11) {
                while (true) {
                    aVar = this.d;
                    if (i11 >= length || !aVar.a(charSequence.charAt(i11))) {
                        break;
                    }
                    i11++;
                }
                while (length > i11 && aVar.a(charSequence.charAt(length - 1))) {
                    length--;
                }
                int i13 = this.f19371f;
                if (i13 == 1) {
                    length = charSequence.length();
                    this.f19370e = -1;
                    while (length > i11 && aVar.a(charSequence.charAt(length - 1))) {
                        length--;
                    }
                } else {
                    this.f19371f = i13 - 1;
                }
                string = charSequence.subSequence(i11, length).toString();
                break;
            }
            int i14 = i12 + 1;
            this.f19370e = i14;
            if (i14 > charSequence.length()) {
                this.f19370e = -1;
            }
        }
        this.f19368b = string;
        if (this.f19367a == 3) {
            return false;
        }
        this.f19367a = 1;
        return true;
    }

    @Override
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f19367a = 2;
        String str = this.f19368b;
        this.f19368b = null;
        return str;
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
