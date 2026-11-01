package org.telegram.messenger;

import java.util.HashMap;
import java.util.List;
public final class lx implements Runnable {
    public final int f17007a;
    public final rz f17008b;
    public final String f17009c;
    public final List d;

    public lx(rz rzVar, String str, List list, int i10) {
        this.f17007a = i10;
        this.f17008b = rzVar;
        this.f17009c = str;
        this.d = list;
    }

    @Override
    public final void run() {
        switch (this.f17007a) {
            case 0:
                HashMap hashMap = this.f17008b.f18009r;
                String str = this.f17009c;
                hashMap.remove(str);
                this.d.remove(str);
                return;
            default:
                HashMap hashMap2 = this.f17008b.f18009r;
                String str2 = this.f17009c;
                hashMap2.remove(str2);
                this.d.remove(str2);
                return;
        }
    }
}
