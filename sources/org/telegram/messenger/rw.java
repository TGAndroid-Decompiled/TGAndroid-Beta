package org.telegram.messenger;

import java.util.HashMap;
import java.util.List;
public final class rw implements Runnable {
    public final int f26680a;
    public final az f26681b;
    public final String f26682c;
    public final List d;

    public rw(az azVar, String str, List list, int i7) {
        this.f26680a = i7;
        this.f26681b = azVar;
        this.f26682c = str;
        this.d = list;
    }

    @Override
    public final void run() {
        switch (this.f26680a) {
            case 0:
                HashMap hashMap = this.f26681b.f23010r;
                String str = this.f26682c;
                hashMap.remove(str);
                this.d.remove(str);
                return;
            default:
                HashMap hashMap2 = this.f26681b.f23010r;
                String str2 = this.f26682c;
                hashMap2.remove(str2);
                this.d.remove(str2);
                return;
        }
    }
}
