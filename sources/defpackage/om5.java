package defpackage;

import java.util.ArrayList;
public final class om5 implements Runnable {
    public final byte a = 0;
    public final String b;
    public final int c;
    public final boolean d;

    public om5(int i, String str, boolean z) {
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
                nm7.f(i).k(140, str, Boolean.valueOf(z));
                return;
            default:
                txc txcVar = (txc) wxc.a.get(str);
                if (txcVar != null && txcVar.v != null) {
                    if (wxc.g.contains(txcVar)) {
                        txcVar.M = i;
                        txcVar.v.m(i);
                        return;
                    }
                    txcVar.M = i;
                    txcVar.N = z;
                    ArrayList arrayList = wxc.f;
                    arrayList.remove(txcVar);
                    arrayList.add(txcVar);
                    wxc.o();
                    return;
                }
                return;
        }
    }

    public om5(String str, int i, boolean z) {
        this.b = str;
        this.c = i;
        this.d = z;
    }
}
