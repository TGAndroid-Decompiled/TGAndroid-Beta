package defpackage;

import java.io.Serializable;
public abstract class nze {
    public static mfb a(mfb mfbVar) {
        if (!(mfbVar instanceof ofb)) {
            if (mfbVar instanceof nfb) {
                return mfbVar;
            }
            if (mfbVar instanceof Serializable) {
                return new nfb(mfbVar);
            }
            return new ofb(mfbVar);
        }
        return mfbVar;
    }
}
