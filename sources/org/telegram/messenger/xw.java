package org.telegram.messenger;

import java.util.HashMap;
import java.util.List;
public final class xw implements Runnable {
    public final int f26530a;
    public final gz f26531b;
    public final String f26532c;
    public final List d;

    public xw(gz gzVar, String str, List list, int i7) {
        this.f26530a = i7;
        this.f26531b = gzVar;
        this.f26532c = str;
        this.d = list;
    }

    @Override
    public final void run() {
        switch (this.f26530a) {
            case 0:
                HashMap hashMap = this.f26531b.f22770r;
                String str = this.f26532c;
                hashMap.remove(str);
                this.d.remove(str);
                return;
            default:
                HashMap hashMap2 = this.f26531b.f22770r;
                String str2 = this.f26532c;
                hashMap2.remove(str2);
                this.d.remove(str2);
                return;
        }
    }
}
