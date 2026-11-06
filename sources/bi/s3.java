package bi;

import org.telegram.ui.an;
public final class s3 implements Runnable {
    public final int f4666a;
    public final k7 f4667b;
    public final an f4668c;
    public final long d;

    public s3(k7 k7Var, an anVar, long j3, int i7) {
        this.f4666a = i7;
        this.f4667b = k7Var;
        this.f4668c = anVar;
        this.d = j3;
    }

    @Override
    public final void run() {
        int i7 = this.f4666a;
        long j3 = this.d;
        an anVar = this.f4668c;
        k7 k7Var = this.f4667b;
        switch (i7) {
            case 0:
                org.telegram.ui.Components.cc I = org.telegram.ui.Components.hc.a0(anVar).I(2131624028, org.telegram.messenger.hd.M0(2131749896, null), org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, 2131749897, k7Var.z1(), org.telegram.messenger.m5.t(j3))));
                I.f32524t = true;
                I.j();
                return;
            default:
                org.telegram.ui.Components.cc I2 = org.telegram.ui.Components.hc.a0(anVar).I(2131624028, org.telegram.messenger.hd.M0(2131749896, null), org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, 2131749897, k7Var.z1(), org.telegram.messenger.m5.t(j3))));
                I2.f32524t = true;
                I2.j();
                return;
        }
    }
}
