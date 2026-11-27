package defpackage;

import java.util.ArrayList;
import java.util.List;
public final class ex3 implements Runnable {
    public final ArrayList a;
    public final byte b;

    public ex3(List list, int i, Throwable th) {
        ewe.a(list, "initCallbacks cannot be null");
        this.a = new ArrayList(list);
        this.b = i;
    }

    @Override
    public final void run() {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        if (this.b != 1) {
            while (i < size) {
                ((dx3) arrayList.get(i)).getClass();
                i++;
            }
            return;
        }
        while (i < size) {
            ((dx3) arrayList.get(i)).a();
            i++;
        }
    }
}
