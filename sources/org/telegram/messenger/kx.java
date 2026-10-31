package org.telegram.messenger;

import java.util.HashMap;
import java.util.List;
public final class kx implements Runnable {
    public final int f16642a;
    public final qz f16643b;
    public final String f16644c;
    public final List d;

    public kx(qz qzVar, String str, List list, int i10) {
        this.f16642a = i10;
        this.f16643b = qzVar;
        this.f16644c = str;
        this.d = list;
    }

    @Override
    public final void run() {
        switch (this.f16642a) {
            case 0:
                HashMap hashMap = this.f16643b.f17663r;
                String str = this.f16644c;
                hashMap.remove(str);
                this.d.remove(str);
                return;
            default:
                HashMap hashMap2 = this.f16643b.f17663r;
                String str2 = this.f16644c;
                hashMap2.remove(str2);
                this.d.remove(str2);
                return;
        }
    }
}
