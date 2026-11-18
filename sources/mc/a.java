package mc;

import hd.d;
import java.util.Arrays;
import kotlin.jvm.internal.j;
import qe.b;
public final class a {
    public final int f20961a;
    public char[] f20962b;
    public int f20963c;

    public void a(int i7, int i10) {
        int i11 = i10 + i7;
        char[] cArr = this.f20962b;
        if (cArr.length <= i11) {
            int i12 = i7 * 2;
            if (i11 < i12) {
                i11 = i12;
            }
            char[] copyOf = Arrays.copyOf(cArr, i11);
            j.d(copyOf, "copyOf(...)");
            this.f20962b = copyOf;
        }
    }

    public void b() {
        b bVar = b.f56110c;
        char[] array = this.f20962b;
        bVar.getClass();
        j.e(array, "array");
        synchronized (bVar) {
            int i7 = bVar.f2152a;
            if (array.length + i7 < qe.a.f56109a) {
                bVar.f2152a = i7 + array.length;
                ((d) bVar.f2153b).addLast(array);
            }
        }
    }

    public void c(String text) {
        j.e(text, "text");
        int length = text.length();
        if (length == 0) {
            return;
        }
        a(this.f20963c, length);
        text.getChars(0, text.length(), this.f20962b, this.f20963c);
        this.f20963c += length;
    }

    public final String toString() {
        switch (this.f20961a) {
            case 0:
                return new String(this.f20962b, 0, this.f20963c);
            default:
                return new String(this.f20962b, 0, this.f20963c);
        }
    }
}
