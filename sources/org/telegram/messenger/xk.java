package org.telegram.messenger;

import org.telegram.messenger.Utilities;
public final class xk implements Utilities.Callback2 {
    public final int f18140a;
    public final TranslateController f18141b;
    public final Utilities.Callback4 f18142c;
    public final boolean d;
    public final int e;
    public final String f18143f;
    public final long f18144g;

    public xk(TranslateController translateController, Utilities.Callback4 callback4, boolean z10, int i10, String str, long j3, int i11) {
        this.f18140a = i11;
        this.f18141b = translateController;
        this.f18142c = callback4;
        this.d = z10;
        this.e = i10;
        this.f18143f = str;
        this.f18144g = j3;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f18140a) {
            case 0:
                this.f18141b.lambda$pushToTranslate$21(this.f18142c, this.d, this.e, this.f18143f, this.f18144g, (String) obj, (Boolean) obj2);
                return;
            default:
                this.f18141b.lambda$pushToTranslate$20(this.f18142c, this.d, this.e, this.f18143f, this.f18144g, (String) obj, (Boolean) obj2);
                return;
        }
    }
}
