package jc;

import ed.e;
import java.util.Arrays;
import kotlin.jvm.internal.j;
import ne.b;
public final class a {
    public final int f16235a;
    public char[] f16236b;
    public int f16237c;

    public void a(int i3, int i10) {
        int i11 = i10 + i3;
        char[] cArr = this.f16236b;
        if (cArr.length <= i11) {
            int i12 = i3 * 2;
            if (i11 < i12) {
                i11 = i12;
            }
            char[] copyOf = Arrays.copyOf(cArr, i11);
            j.d(copyOf, "copyOf(...)");
            this.f16236b = copyOf;
        }
    }

    public void b() {
        b bVar = b.f20345c;
        char[] array = this.f16236b;
        bVar.getClass();
        j.e(array, "array");
        synchronized (bVar) {
            int i3 = bVar.f1632a;
            if (array.length + i3 < ne.a.f20344a) {
                bVar.f1632a = i3 + array.length;
                ((e) bVar.f1633b).addLast(array);
            }
        }
    }

    public void c(String text) {
        j.e(text, "text");
        int length = text.length();
        if (length == 0) {
            return;
        }
        a(this.f16237c, length);
        text.getChars(0, text.length(), this.f16236b, this.f16237c);
        this.f16237c += length;
    }

    public final String toString() {
        switch (this.f16235a) {
            case 0:
                return new String(this.f16236b, 0, this.f16237c);
            default:
                return new String(this.f16236b, 0, this.f16237c);
        }
    }
}
