package org.telegram.messenger;

import java.util.HashMap;
import java.util.List;
public final class vw implements Runnable {
    public final int f27251a;
    public final ez f27252b;
    public final String f27253c;
    public final List d;

    public vw(ez ezVar, String str, List list, int i7) {
        this.f27251a = i7;
        this.f27252b = ezVar;
        this.f27253c = str;
        this.d = list;
    }

    @Override
    public final void run() {
        switch (this.f27251a) {
            case 0:
                HashMap hashMap = this.f27252b.f23395r;
                String str = this.f27253c;
                hashMap.remove(str);
                this.d.remove(str);
                return;
            default:
                HashMap hashMap2 = this.f27252b.f23395r;
                String str2 = this.f27253c;
                hashMap2.remove(str2);
                this.d.remove(str2);
                return;
        }
    }
}
