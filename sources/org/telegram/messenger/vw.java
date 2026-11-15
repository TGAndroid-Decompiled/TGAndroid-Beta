package org.telegram.messenger;

import java.util.HashMap;
import java.util.List;
public final class vw implements Runnable {
    public final int f27252a;
    public final ez f27253b;
    public final String f27254c;
    public final List d;

    public vw(ez ezVar, String str, List list, int i7) {
        this.f27252a = i7;
        this.f27253b = ezVar;
        this.f27254c = str;
        this.d = list;
    }

    @Override
    public final void run() {
        switch (this.f27252a) {
            case 0:
                HashMap hashMap = this.f27253b.f23392r;
                String str = this.f27254c;
                hashMap.remove(str);
                this.d.remove(str);
                return;
            default:
                HashMap hashMap2 = this.f27253b.f23392r;
                String str2 = this.f27254c;
                hashMap2.remove(str2);
                this.d.remove(str2);
                return;
        }
    }
}
