package mc;

import hd.d;
import java.util.Arrays;
import kotlin.jvm.internal.j;
import qe.b;
public final class a {
    public final int f20008a;
    public char[] f20009b;
    public int f20010c;

    public void a(int i7, int i10) {
        int i11 = i10 + i7;
        char[] cArr = this.f20009b;
        if (cArr.length <= i11) {
            int i12 = i7 * 2;
            if (i11 < i12) {
                i11 = i12;
            }
            char[] copyOf = Arrays.copyOf(cArr, i11);
            j.d(copyOf, "copyOf(...)");
            this.f20009b = copyOf;
        }
    }

    public void b() {
        b bVar = b.f54101c;
        char[] array = this.f20009b;
        bVar.getClass();
        j.e(array, "array");
        synchronized (bVar) {
            int i7 = bVar.f2209a;
            if (array.length + i7 < qe.a.f54100a) {
                bVar.f2209a = i7 + array.length;
                ((d) bVar.f2210b).addLast(array);
            }
        }
    }

    public void c(String text) {
        j.e(text, "text");
        int length = text.length();
        if (length == 0) {
            return;
        }
        a(this.f20010c, length);
        text.getChars(0, text.length(), this.f20009b, this.f20010c);
        this.f20010c += length;
    }

    public final String toString() {
        switch (this.f20008a) {
            case 0:
                return new String(this.f20009b, 0, this.f20010c);
            default:
                return new String(this.f20009b, 0, this.f20010c);
        }
    }
}
