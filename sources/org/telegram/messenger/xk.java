package org.telegram.messenger;

import org.telegram.messenger.Utilities;
public final class xk implements Utilities.Callback2 {
    public final int f17894a;
    public final TranslateController f17895b;
    public final Utilities.Callback4 f17896c;
    public final boolean d;
    public final int e;
    public final String f17897f;
    public final long f17898g;

    public xk(TranslateController translateController, Utilities.Callback4 callback4, boolean z10, int i10, String str, long j3, int i11) {
        this.f17894a = i11;
        this.f17895b = translateController;
        this.f17896c = callback4;
        this.d = z10;
        this.e = i10;
        this.f17897f = str;
        this.f17898g = j3;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f17894a) {
            case 0:
                this.f17895b.lambda$pushToTranslate$21(this.f17896c, this.d, this.e, this.f17897f, this.f17898g, (String) obj, (Boolean) obj2);
                return;
            default:
                this.f17895b.lambda$pushToTranslate$20(this.f17896c, this.d, this.e, this.f17897f, this.f17898g, (String) obj, (Boolean) obj2);
                return;
        }
    }
}
