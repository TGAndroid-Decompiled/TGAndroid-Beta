package mc;

import hd.d;
import java.util.Arrays;
import kotlin.jvm.internal.j;
import qe.b;
public final class a {
    public final int f20003a;
    public char[] f20004b;
    public int f20005c;

    public void a(int i7, int i10) {
        int i11 = i10 + i7;
        char[] cArr = this.f20004b;
        if (cArr.length <= i11) {
            int i12 = i7 * 2;
            if (i11 < i12) {
                i11 = i12;
            }
            char[] copyOf = Arrays.copyOf(cArr, i11);
            j.d(copyOf, "copyOf(...)");
            this.f20004b = copyOf;
        }
    }

    public void b() {
        b bVar = b.f54102c;
        char[] array = this.f20004b;
        bVar.getClass();
        j.e(array, "array");
        synchronized (bVar) {
            int i7 = bVar.f2209a;
            if (array.length + i7 < qe.a.f54101a) {
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
        a(this.f20005c, length);
        text.getChars(0, text.length(), this.f20004b, this.f20005c);
        this.f20005c += length;
    }

    public final String toString() {
        switch (this.f20003a) {
            case 0:
                return new String(this.f20004b, 0, this.f20005c);
            default:
                return new String(this.f20004b, 0, this.f20005c);
        }
    }
}
