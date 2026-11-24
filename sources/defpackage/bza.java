package defpackage;

import org.telegram.messenger.MediaController;
public final class bza implements Runnable {
    public final byte a;
    public final mza b;

    public bza(mza mzaVar, byte b) {
        this.a = b;
        this.b = mzaVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        mza mzaVar = this.b;
        switch (b) {
            case 0:
                kza kzaVar = mzaVar.a0;
                if (kzaVar != null) {
                    if (kzaVar.r != null) {
                        MediaController.w().d(mzaVar.a0.r);
                        ba4.G(mzaVar.a).b(mzaVar.a0.b, false);
                        mzaVar.a0.getClass();
                    }
                    mzaVar.a0.a();
                    mzaVar.a0 = null;
                }
                mzaVar.e0.a();
                mzaVar.e0 = null;
                return;
            default:
                ijb ijbVar = mzaVar.T;
                if (ijbVar != null) {
                    mzaVar.T = null;
                    mzaVar.removeView(ijbVar);
                    return;
                }
                return;
        }
    }
}
