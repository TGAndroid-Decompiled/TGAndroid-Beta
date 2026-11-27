package defpackage;

import android.util.Log;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Iterator;
public final class t31 implements AutoCloseable {
    public final String[] a;
    public final ArrayDeque b;

    public t31(Object obj, String str, ArrayDeque arrayDeque) {
        this.b = arrayDeque;
        if (obj != null) {
            arrayDeque.addFirst(new s31(obj, str));
            if (Log.isLoggable("CarApp.Bun", 2)) {
                int min = Math.min(arrayDeque.size(), 11);
                String[] strArr = this.a;
                if (strArr == null) {
                    strArr = new String[12];
                    this.a = strArr;
                }
                String str2 = strArr[min];
                if (str2 == null) {
                    char[] cArr = new char[min];
                    Arrays.fill(cArr, ' ');
                    String str3 = new String(cArr);
                    if (min == 11) {
                        str2 = str3.concat("...");
                    } else {
                        str2 = str3;
                    }
                    this.a[min] = str2;
                }
                Log.v("CarApp.Bun", str2.concat(v31.i(obj.getClass()) + " " + str));
            }
        }
    }

    public final String a() {
        StringBuilder sb = new StringBuilder();
        ArrayDeque arrayDeque = this.b;
        int min = Math.min(arrayDeque.size(), 8);
        Iterator descendingIterator = arrayDeque.descendingIterator();
        while (descendingIterator.hasNext()) {
            int i = min - 1;
            if (min <= 0) {
                break;
            }
            sb.append(((s31) descendingIterator.next()).a());
            min = i;
        }
        if (descendingIterator.hasNext()) {
            sb.append("[...]");
        }
        return sb.toString();
    }

    @Override
    public final void close() {
        this.b.removeFirst();
    }
}
