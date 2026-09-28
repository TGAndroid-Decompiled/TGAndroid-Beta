package org.telegram.messenger;

import org.telegram.messenger.Utilities;
public final class xk implements Utilities.Callback2 {
    public final int f18159a;
    public final TranslateController f18160b;
    public final Utilities.Callback4 f18161c;
    public final boolean d;
    public final int e;
    public final String f18162f;
    public final long f18163g;

    public xk(TranslateController translateController, Utilities.Callback4 callback4, boolean z10, int i10, String str, long j3, int i11) {
        this.f18159a = i11;
        this.f18160b = translateController;
        this.f18161c = callback4;
        this.d = z10;
        this.e = i10;
        this.f18162f = str;
        this.f18163g = j3;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f18159a) {
            case 0:
                this.f18160b.lambda$pushToTranslate$21(this.f18161c, this.d, this.e, this.f18162f, this.f18163g, (String) obj, (Boolean) obj2);
                return;
            default:
                this.f18160b.lambda$pushToTranslate$20(this.f18161c, this.d, this.e, this.f18162f, this.f18163g, (String) obj, (Boolean) obj2);
                return;
        }
    }
}
