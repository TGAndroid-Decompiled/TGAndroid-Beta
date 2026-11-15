package org.telegram.messenger;

import java.util.ArrayList;
public final class ih implements Runnable {
    public final int f24392a;
    public final pi f24393b;
    public final ArrayList f24394c;
    public final String d;

    public ih(pi piVar, ArrayList arrayList, String str, int i7) {
        this.f24392a = i7;
        this.f24393b = piVar;
        this.f24394c = arrayList;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f24392a) {
            case 0:
                g0.h3(new ih(this.f24393b, this.f24394c, this.d, 2));
                return;
            case 1:
                ArrayList arrayList = this.f24394c;
                this.f24393b.c(this.d, arrayList);
                return;
            default:
                ArrayList arrayList2 = this.f24394c;
                this.f24393b.c(this.d, arrayList2);
                return;
        }
    }
}
