package defpackage;

import java.util.ArrayList;
public final class rm5 implements Runnable {
    public final byte a = 0;
    public final String b;
    public final int c;
    public final boolean d;

    public rm5(int i, String str, boolean z) {
        this.c = i;
        this.b = str;
        this.d = z;
    }

    @Override
    public final void run() {
        byte b = this.a;
        boolean z = this.d;
        int i = this.c;
        String str = this.b;
        switch (b) {
            case 0:
                jn7.f(i).k(140, str, Boolean.valueOf(z));
                return;
            default:
                h0d h0dVar = (h0d) k0d.a.get(str);
                if (h0dVar != null && h0dVar.v != null) {
                    if (k0d.g.contains(h0dVar)) {
                        h0dVar.M = i;
                        h0dVar.v.m(i);
                        return;
                    }
                    h0dVar.M = i;
                    h0dVar.N = z;
                    ArrayList arrayList = k0d.f;
                    arrayList.remove(h0dVar);
                    arrayList.add(h0dVar);
                    k0d.o();
                    return;
                }
                return;
        }
    }

    public rm5(String str, int i, boolean z) {
        this.b = str;
        this.c = i;
        this.d = z;
    }
}
