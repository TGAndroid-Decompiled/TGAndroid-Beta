package org.telegram.messenger;

import java.util.HashMap;
import java.util.List;
public final class xw implements Runnable {
    public final int f26534a;
    public final gz f26535b;
    public final String f26536c;
    public final List d;

    public xw(gz gzVar, String str, List list, int i7) {
        this.f26534a = i7;
        this.f26535b = gzVar;
        this.f26536c = str;
        this.d = list;
    }

    @Override
    public final void run() {
        switch (this.f26534a) {
            case 0:
                HashMap hashMap = this.f26535b.f22774r;
                String str = this.f26536c;
                hashMap.remove(str);
                this.d.remove(str);
                return;
            default:
                HashMap hashMap2 = this.f26535b.f22774r;
                String str2 = this.f26536c;
                hashMap2.remove(str2);
                this.d.remove(str2);
                return;
        }
    }
}
