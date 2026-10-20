package org.telegram.messenger;

import org.telegram.messenger.Utilities;
public final class wk implements Utilities.Callback2 {
    public final int f20025a;
    public final TranslateController f20026b;
    public final Utilities.Callback4 f20027c;
    public final boolean d;
    public final int e;
    public final String f20028f;
    public final long f20029g;

    public wk(TranslateController translateController, Utilities.Callback4 callback4, boolean z10, int i10, String str, long j10, int i11) {
        this.f20025a = i11;
        this.f20026b = translateController;
        this.f20027c = callback4;
        this.d = z10;
        this.e = i10;
        this.f20028f = str;
        this.f20029g = j10;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f20025a) {
            case 0:
                this.f20026b.lambda$pushToTranslate$21(this.f20027c, this.d, this.e, this.f20028f, this.f20029g, (String) obj, (Boolean) obj2);
                return;
            default:
                this.f20026b.lambda$pushToTranslate$20(this.f20027c, this.d, this.e, this.f20028f, this.f20029g, (String) obj, (Boolean) obj2);
                return;
        }
    }
}
