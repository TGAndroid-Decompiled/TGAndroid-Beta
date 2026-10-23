package org.telegram.messenger;

import org.telegram.messenger.Utilities;
public final class xk implements Utilities.Callback2 {
    public final int f20109a;
    public final TranslateController f20110b;
    public final Utilities.Callback4 f20111c;
    public final boolean d;
    public final int e;
    public final String f20112f;
    public final long f20113g;

    public xk(TranslateController translateController, Utilities.Callback4 callback4, boolean z10, int i10, String str, long j10, int i11) {
        this.f20109a = i11;
        this.f20110b = translateController;
        this.f20111c = callback4;
        this.d = z10;
        this.e = i10;
        this.f20112f = str;
        this.f20113g = j10;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f20109a) {
            case 0:
                this.f20110b.lambda$pushToTranslate$21(this.f20111c, this.d, this.e, this.f20112f, this.f20113g, (String) obj, (Boolean) obj2);
                return;
            default:
                this.f20110b.lambda$pushToTranslate$20(this.f20111c, this.d, this.e, this.f20112f, this.f20113g, (String) obj, (Boolean) obj2);
                return;
        }
    }
}
