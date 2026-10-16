package bi;

import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.es;
public final class r4 implements Runnable {
    public final int f3611a;
    public final sb f3612b;

    public r4(sb sbVar, int i10) {
        this.f3611a = i10;
        this.f3612b = sbVar;
    }

    @Override
    public final void run() {
        switch (this.f3611a) {
            case 0:
                this.f3612b.P();
                return;
            case 1:
                sb sbVar = this.f3612b;
                sbVar.f3671c0 = true;
                sbVar.n(true);
                return;
            case 2:
                sb sbVar2 = this.f3612b;
                if (sbVar2.F != null) {
                    hb hbVar = sbVar2.v;
                    if (hbVar != null) {
                        b0.f2853c = true;
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
                sb sbVar3 = this.f3612b;
                sbVar3.f3711v0 = null;
                sbVar3.P();
                return;
            case 4:
                this.f3612b.L(true);
                return;
            case 5:
                sb sbVar4 = this.f3612b;
                sbVar4.Q();
                pb pbVar = sbVar4.f3705s0;
                ImageReceiver imageReceiver = pbVar.f3485b;
                if (imageReceiver != null) {
                    imageReceiver.setVisible(false, true);
                }
                ImageReceiver imageReceiver2 = pbVar.f3486c;
                if (imageReceiver2 != null) {
                    imageReceiver2.setVisible(false, true);
                    return;
                }
                return;
            default:
                this.f3612b.m();
                return;
        }
    }
}
