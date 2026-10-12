package bi;

import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.es;
public final class r4 implements Runnable {
    public final int f3607a;
    public final sb f3608b;

    public r4(sb sbVar, int i10) {
        this.f3607a = i10;
        this.f3608b = sbVar;
    }

    @Override
    public final void run() {
        switch (this.f3607a) {
            case 0:
                this.f3608b.P();
                return;
            case 1:
                sb sbVar = this.f3608b;
                sbVar.f3667c0 = true;
                sbVar.n(true);
                return;
            case 2:
                sb sbVar2 = this.f3608b;
                if (sbVar2.F != null) {
                    hb hbVar = sbVar2.v;
                    if (hbVar != null) {
                        b0.f2849c = true;
                        hbVar.setLayerType(2, null);
                    }
                    sbVar2.F.addListener(new bb(sbVar2, 0));
                    sbVar2.F.setDuration(320L);
                    sbVar2.F.setInterpolator(es.h);
                    sbVar2.F.start();
                    return;
                }
                return;
            case 3:
                sb sbVar3 = this.f3608b;
                sbVar3.f3707v0 = null;
                sbVar3.P();
                return;
            case 4:
                this.f3608b.L(true);
                return;
            case 5:
                sb sbVar4 = this.f3608b;
                sbVar4.Q();
                pb pbVar = sbVar4.f3701s0;
                ImageReceiver imageReceiver = pbVar.f3481b;
                if (imageReceiver != null) {
                    imageReceiver.setVisible(false, true);
                }
                ImageReceiver imageReceiver2 = pbVar.f3482c;
                if (imageReceiver2 != null) {
                    imageReceiver2.setVisible(false, true);
                    return;
                }
                return;
            default:
                this.f3608b.m();
                return;
        }
    }
}
