package mc;

import hd.d;
import java.util.Arrays;
import kotlin.jvm.internal.j;
import qe.b;
public final class a {
    public final int f20000a;
    public char[] f20001b;
    public int f20002c;

    public void a(int i7, int i10) {
        int i11 = i10 + i7;
        char[] cArr = this.f20001b;
        if (cArr.length <= i11) {
            int i12 = i7 * 2;
            if (i11 < i12) {
                i11 = i12;
            }
            char[] copyOf = Arrays.copyOf(cArr, i11);
            j.d(copyOf, "copyOf(...)");
            this.f20001b = copyOf;
        }
    }

    public void b() {
        b bVar = b.f53996c;
        char[] array = this.f20001b;
        bVar.getClass();
        j.e(array, "array");
        synchronized (bVar) {
            int i7 = bVar.f2209a;
            if (array.length + i7 < qe.a.f53995a) {
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
        a(this.f20002c, length);
        text.getChars(0, text.length(), this.f20001b, this.f20002c);
        this.f20002c += length;
    }

    public final String toString() {
        switch (this.f20000a) {
            case 0:
                return new String(this.f20001b, 0, this.f20002c);
            default:
                return new String(this.f20001b, 0, this.f20002c);
        }
    }
}
