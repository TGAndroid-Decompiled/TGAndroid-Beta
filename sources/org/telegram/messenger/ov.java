package org.telegram.messenger;

import java.util.ArrayList;
public final class ov implements Runnable {
    public final int f26153a;
    public final qv f26154b;

    public ov(qv qvVar, int i7) {
        this.f26153a = i7;
        this.f26154b = qvVar;
    }

    @Override
    public final void run() {
        switch (this.f26153a) {
            case 0:
                this.f26154b.g(false);
                return;
            case 1:
                this.f26154b.f26478o = false;
                return;
            case 2:
                qv qvVar = this.f26154b;
                qvVar.f26478o = false;
                qvVar.f26475l = false;
                return;
            case 3:
                this.f26154b.l();
                return;
            default:
                qv qvVar2 = this.f26154b;
                if (!qvVar2.f26478o) {
                    qvVar2.f26478o = true;
                    ArrayList arrayList = new ArrayList(qvVar2.f26473j);
                    ur a02 = ur.a0(qvVar2.f26466a);
                    a02.f27214a.c(new lg(qvVar2, a02, arrayList, 24));
                    return;
                }
                return;
        }
    }
}
