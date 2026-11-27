package defpackage;

import org.telegram.messenger.voip.OrientationHelper;
public final class zmb extends OrientationHelper {
    public final bnb a;

    public zmb(bnb bnbVar) {
        this.a = bnbVar;
    }

    @Override
    public final void onOrientationUpdate(int i) {
        bnb bnbVar = this.a;
        if (!bnbVar.x) {
            bnbVar.f();
        }
    }
}
