package org.telegram.messenger;

import org.telegram.messenger.Utilities;
public final class xk implements Utilities.Callback2 {
    public final int f20167a;
    public final TranslateController f20168b;
    public final Utilities.Callback4 f20169c;
    public final boolean d;
    public final int e;
    public final String f20170f;
    public final long f20171g;

    public xk(TranslateController translateController, Utilities.Callback4 callback4, boolean z10, int i10, String str, long j10, int i11) {
        this.f20167a = i11;
        this.f20168b = translateController;
        this.f20169c = callback4;
        this.d = z10;
        this.e = i10;
        this.f20170f = str;
        this.f20171g = j10;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f20167a) {
            case 0:
                this.f20168b.lambda$pushToTranslate$21(this.f20169c, this.d, this.e, this.f20170f, this.f20171g, (String) obj, (Boolean) obj2);
                return;
            default:
                this.f20168b.lambda$pushToTranslate$20(this.f20169c, this.d, this.e, this.f20170f, this.f20171g, (String) obj, (Boolean) obj2);
                return;
        }
    }
}
