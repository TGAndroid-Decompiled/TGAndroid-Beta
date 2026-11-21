package org.telegram.messenger;

import java.util.HashMap;
import java.util.List;
public final class qw implements Runnable {
    public final int f26497a;
    public final zy f26498b;
    public final String f26499c;
    public final List d;

    public qw(zy zyVar, String str, List list, int i7) {
        this.f26497a = i7;
        this.f26498b = zyVar;
        this.f26499c = str;
        this.d = list;
    }

    @Override
    public final void run() {
        switch (this.f26497a) {
            case 0:
                HashMap hashMap = this.f26498b.f28419r;
                String str = this.f26499c;
                hashMap.remove(str);
                this.d.remove(str);
                return;
            default:
                HashMap hashMap2 = this.f26498b.f28419r;
                String str2 = this.f26499c;
                hashMap2.remove(str2);
                this.d.remove(str2);
                return;
        }
    }
}
