package org.telegram.messenger;

import org.telegram.messenger.Utilities;
public final class xk implements Utilities.Callback2 {
    public final int f18155a;
    public final TranslateController f18156b;
    public final Utilities.Callback4 f18157c;
    public final boolean d;
    public final int e;
    public final String f18158f;
    public final long f18159g;

    public xk(TranslateController translateController, Utilities.Callback4 callback4, boolean z10, int i10, String str, long j3, int i11) {
        this.f18155a = i11;
        this.f18156b = translateController;
        this.f18157c = callback4;
        this.d = z10;
        this.e = i10;
        this.f18158f = str;
        this.f18159g = j3;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f18155a) {
            case 0:
                this.f18156b.lambda$pushToTranslate$21(this.f18157c, this.d, this.e, this.f18158f, this.f18159g, (String) obj, (Boolean) obj2);
                return;
            default:
                this.f18156b.lambda$pushToTranslate$20(this.f18157c, this.d, this.e, this.f18158f, this.f18159g, (String) obj, (Boolean) obj2);
                return;
        }
    }
}
