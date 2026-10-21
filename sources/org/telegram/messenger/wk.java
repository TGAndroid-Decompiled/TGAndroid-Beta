package org.telegram.messenger;

import org.telegram.messenger.Utilities;
public final class wk implements Utilities.Callback2 {
    public final int f20023a;
    public final TranslateController f20024b;
    public final Utilities.Callback4 f20025c;
    public final boolean d;
    public final int e;
    public final String f20026f;
    public final long f20027g;

    public wk(TranslateController translateController, Utilities.Callback4 callback4, boolean z10, int i10, String str, long j10, int i11) {
        this.f20023a = i11;
        this.f20024b = translateController;
        this.f20025c = callback4;
        this.d = z10;
        this.e = i10;
        this.f20026f = str;
        this.f20027g = j10;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f20023a) {
            case 0:
                this.f20024b.lambda$pushToTranslate$21(this.f20025c, this.d, this.e, this.f20026f, this.f20027g, (String) obj, (Boolean) obj2);
                return;
            default:
                this.f20024b.lambda$pushToTranslate$20(this.f20025c, this.d, this.e, this.f20026f, this.f20027g, (String) obj, (Boolean) obj2);
                return;
        }
    }
}
