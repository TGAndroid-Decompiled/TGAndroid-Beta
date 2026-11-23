package mc;

import hd.d;
import java.util.Arrays;
import kotlin.jvm.internal.j;
import qe.b;
public final class a {
    public final int f20992a;
    public char[] f20993b;
    public int f20994c;

    public void a(int i7, int i10) {
        int i11 = i10 + i7;
        char[] cArr = this.f20993b;
        if (cArr.length <= i11) {
            int i12 = i7 * 2;
            if (i11 < i12) {
                i11 = i12;
            }
            char[] copyOf = Arrays.copyOf(cArr, i11);
            j.d(copyOf, "copyOf(...)");
            this.f20993b = copyOf;
        }
    }

    public void b() {
        b bVar = b.f56155c;
        char[] array = this.f20993b;
        bVar.getClass();
        j.e(array, "array");
        synchronized (bVar) {
            int i7 = bVar.f2171a;
            if (array.length + i7 < qe.a.f56154a) {
                bVar.f2171a = i7 + array.length;
                ((d) bVar.f2172b).addLast(array);
            }
        }
    }

    public void c(String text) {
        j.e(text, "text");
        int length = text.length();
        if (length == 0) {
            return;
        }
        a(this.f20994c, length);
        text.getChars(0, text.length(), this.f20993b, this.f20994c);
        this.f20994c += length;
    }

    public final String toString() {
        switch (this.f20992a) {
            case 0:
                return new String(this.f20993b, 0, this.f20994c);
            default:
                return new String(this.f20993b, 0, this.f20994c);
        }
    }
}
