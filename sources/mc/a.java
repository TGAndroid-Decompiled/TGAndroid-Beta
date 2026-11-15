package mc;

import hd.d;
import java.util.Arrays;
import kotlin.jvm.internal.j;
import qe.b;
public final class a {
    public final int f20600a;
    public char[] f20601b;
    public int f20602c;

    public void a(int i7, int i10) {
        int i11 = i10 + i7;
        char[] cArr = this.f20601b;
        if (cArr.length <= i11) {
            int i12 = i7 * 2;
            if (i11 < i12) {
                i11 = i12;
            }
            char[] copyOf = Arrays.copyOf(cArr, i11);
            j.d(copyOf, "copyOf(...)");
            this.f20601b = copyOf;
        }
    }

    public void b() {
        b bVar = b.f55536c;
        char[] array = this.f20601b;
        bVar.getClass();
        j.e(array, "array");
        synchronized (bVar) {
            int i7 = bVar.f2157a;
            if (array.length + i7 < qe.a.f55535a) {
                bVar.f2157a = i7 + array.length;
                ((d) bVar.f2158b).addLast(array);
            }
        }
    }

    public void c(String text) {
        j.e(text, "text");
        int length = text.length();
        if (length == 0) {
            return;
        }
        a(this.f20602c, length);
        text.getChars(0, text.length(), this.f20601b, this.f20602c);
        this.f20602c += length;
    }

    public final String toString() {
        switch (this.f20600a) {
            case 0:
                return new String(this.f20601b, 0, this.f20602c);
            default:
                return new String(this.f20601b, 0, this.f20602c);
        }
    }
}
