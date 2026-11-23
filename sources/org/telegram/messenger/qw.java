package org.telegram.messenger;

import java.util.HashMap;
import java.util.List;
public final class qw implements Runnable {
    public final int f26581a;
    public final zy f26582b;
    public final String f26583c;
    public final List d;

    public qw(zy zyVar, String str, List list, int i7) {
        this.f26581a = i7;
        this.f26582b = zyVar;
        this.f26583c = str;
        this.d = list;
    }

    @Override
    public final void run() {
        switch (this.f26581a) {
            case 0:
                HashMap hashMap = this.f26582b.f28483r;
                String str = this.f26583c;
                hashMap.remove(str);
                this.d.remove(str);
                return;
            default:
                HashMap hashMap2 = this.f26582b.f28483r;
                String str2 = this.f26583c;
                hashMap2.remove(str2);
                this.d.remove(str2);
                return;
        }
    }
}
