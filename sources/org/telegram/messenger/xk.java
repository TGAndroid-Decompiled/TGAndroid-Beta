package org.telegram.messenger;

import org.telegram.messenger.Utilities;
public final class xk implements Utilities.Callback2 {
    public final int f18149a;
    public final TranslateController f18150b;
    public final Utilities.Callback4 f18151c;
    public final boolean d;
    public final int e;
    public final String f18152f;
    public final long f18153g;

    public xk(TranslateController translateController, Utilities.Callback4 callback4, boolean z10, int i10, String str, long j3, int i11) {
        this.f18149a = i11;
        this.f18150b = translateController;
        this.f18151c = callback4;
        this.d = z10;
        this.e = i10;
        this.f18152f = str;
        this.f18153g = j3;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f18149a) {
            case 0:
                this.f18150b.lambda$pushToTranslate$21(this.f18151c, this.d, this.e, this.f18152f, this.f18153g, (String) obj, (Boolean) obj2);
                return;
            default:
                this.f18150b.lambda$pushToTranslate$20(this.f18151c, this.d, this.e, this.f18152f, this.f18153g, (String) obj, (Boolean) obj2);
                return;
        }
    }
}
