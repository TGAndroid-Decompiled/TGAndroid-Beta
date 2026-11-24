package defpackage;

import java.util.ArrayList;
public final class h96 {
    public boolean a;
    public long b;
    public int c;
    public int d;
    public ArrayList e;

    public final void a() {
        ArrayList arrayList = this.e;
        this.e = new ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            ((Runnable) arrayList.get(i)).run();
        }
    }
}
