package org.telegram.messenger;

import java.util.HashMap;
import java.util.List;
public final class qw implements Runnable {
    public final int f26471a;
    public final zy f26472b;
    public final String f26473c;
    public final List d;

    public qw(zy zyVar, String str, List list, int i7) {
        this.f26471a = i7;
        this.f26472b = zyVar;
        this.f26473c = str;
        this.d = list;
    }

    @Override
    public final void run() {
        switch (this.f26471a) {
            case 0:
                HashMap hashMap = this.f26472b.f28393r;
                String str = this.f26473c;
                hashMap.remove(str);
                this.d.remove(str);
                return;
            default:
                HashMap hashMap2 = this.f26472b.f28393r;
                String str2 = this.f26473c;
                hashMap2.remove(str2);
                this.d.remove(str2);
                return;
        }
    }
}
