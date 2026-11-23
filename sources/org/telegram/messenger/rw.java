package org.telegram.messenger;

import java.util.HashMap;
import java.util.List;
public final class rw implements Runnable {
    public final int f26644a;
    public final az f26645b;
    public final String f26646c;
    public final List d;

    public rw(az azVar, String str, List list, int i7) {
        this.f26644a = i7;
        this.f26645b = azVar;
        this.f26646c = str;
        this.d = list;
    }

    @Override
    public final void run() {
        switch (this.f26644a) {
            case 0:
                HashMap hashMap = this.f26645b.f22974r;
                String str = this.f26646c;
                hashMap.remove(str);
                this.d.remove(str);
                return;
            default:
                HashMap hashMap2 = this.f26645b.f22974r;
                String str2 = this.f26646c;
                hashMap2.remove(str2);
                this.d.remove(str2);
                return;
        }
    }
}
