package org.telegram.messenger;

import java.util.HashMap;
import java.util.List;
public final class rw implements Runnable {
    public final int f25238a;
    public final yy f25239b;
    public final String f25240c;
    public final List d;

    public rw(yy yyVar, String str, List list, int i3) {
        this.f25238a = i3;
        this.f25239b = yyVar;
        this.f25240c = str;
        this.d = list;
    }

    @Override
    public final void run() {
        switch (this.f25238a) {
            case 0:
                HashMap hashMap = this.f25239b.f26684r;
                String str = this.f25240c;
                hashMap.remove(str);
                this.d.remove(str);
                return;
            default:
                HashMap hashMap2 = this.f25239b.f26684r;
                String str2 = this.f25240c;
                hashMap2.remove(str2);
                this.d.remove(str2);
                return;
        }
    }
}
