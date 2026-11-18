package org.telegram.messenger;

import java.util.HashMap;
import java.util.List;
public final class qw implements Runnable {
    public final int f26469a;
    public final zy f26470b;
    public final String f26471c;
    public final List d;

    public qw(zy zyVar, String str, List list, int i7) {
        this.f26469a = i7;
        this.f26470b = zyVar;
        this.f26471c = str;
        this.d = list;
    }

    @Override
    public final void run() {
        switch (this.f26469a) {
            case 0:
                HashMap hashMap = this.f26470b.f28391r;
                String str = this.f26471c;
                hashMap.remove(str);
                this.d.remove(str);
                return;
            default:
                HashMap hashMap2 = this.f26470b.f28391r;
                String str2 = this.f26471c;
                hashMap2.remove(str2);
                this.d.remove(str2);
                return;
        }
    }
}
