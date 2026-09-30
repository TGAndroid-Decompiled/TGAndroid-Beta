package org.telegram.messenger;

import org.telegram.messenger.Utilities;
public final class xk implements Utilities.Callback2 {
    public final int f18160a;
    public final TranslateController f18161b;
    public final Utilities.Callback4 f18162c;
    public final boolean d;
    public final int e;
    public final String f18163f;
    public final long f18164g;

    public xk(TranslateController translateController, Utilities.Callback4 callback4, boolean z10, int i10, String str, long j3, int i11) {
        this.f18160a = i11;
        this.f18161b = translateController;
        this.f18162c = callback4;
        this.d = z10;
        this.e = i10;
        this.f18163f = str;
        this.f18164g = j3;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f18160a) {
            case 0:
                this.f18161b.lambda$pushToTranslate$21(this.f18162c, this.d, this.e, this.f18163f, this.f18164g, (String) obj, (Boolean) obj2);
                return;
            default:
                this.f18161b.lambda$pushToTranslate$20(this.f18162c, this.d, this.e, this.f18163f, this.f18164g, (String) obj, (Boolean) obj2);
                return;
        }
    }
}
