package org.telegram.messenger;

import java.util.ArrayList;
public final class ov implements Runnable {
    public final int f26189a;
    public final qv f26190b;

    public ov(qv qvVar, int i7) {
        this.f26189a = i7;
        this.f26190b = qvVar;
    }

    @Override
    public final void run() {
        switch (this.f26189a) {
            case 0:
                this.f26190b.g(false);
                return;
            case 1:
                this.f26190b.f26514o = false;
                return;
            case 2:
                qv qvVar = this.f26190b;
                qvVar.f26514o = false;
                qvVar.f26511l = false;
                return;
            case 3:
                this.f26190b.l();
                return;
            default:
                qv qvVar2 = this.f26190b;
                if (!qvVar2.f26514o) {
                    qvVar2.f26514o = true;
                    ArrayList arrayList = new ArrayList(qvVar2.f26509j);
                    ur a02 = ur.a0(qvVar2.f26502a);
                    a02.f27250a.c(new lg(qvVar2, a02, arrayList, 24));
                    return;
                }
                return;
        }
    }
}
