package mc;

import hd.d;
import java.util.Arrays;
import kotlin.jvm.internal.j;
import qe.b;
public final class a {
    public final int f21054a;
    public char[] f21055b;
    public int f21056c;

    public void a(int i7, int i10) {
        int i11 = i10 + i7;
        char[] cArr = this.f21055b;
        if (cArr.length <= i11) {
            int i12 = i7 * 2;
            if (i11 < i12) {
                i11 = i12;
            }
            char[] copyOf = Arrays.copyOf(cArr, i11);
            j.d(copyOf, "copyOf(...)");
            this.f21055b = copyOf;
        }
    }

    public void b() {
        b bVar = b.f56233c;
        char[] array = this.f21055b;
        bVar.getClass();
        j.e(array, "array");
        synchronized (bVar) {
            int i7 = bVar.f2123a;
            if (array.length + i7 < qe.a.f56232a) {
                bVar.f2123a = i7 + array.length;
                ((d) bVar.f2124b).addLast(array);
            }
        }
    }

    public void c(String text) {
        j.e(text, "text");
        int length = text.length();
        if (length == 0) {
            return;
        }
        a(this.f21056c, length);
        text.getChars(0, text.length(), this.f21055b, this.f21056c);
        this.f21056c += length;
    }

    public final String toString() {
        switch (this.f21054a) {
            case 0:
                return new String(this.f21055b, 0, this.f21056c);
            default:
                return new String(this.f21055b, 0, this.f21056c);
        }
    }
}
