package org.telegram.messenger;

import org.telegram.messenger.Utilities;
public final class el implements Utilities.Callback2 {
    public final int f17550a;
    public final TranslateController f17551b;
    public final Utilities.Callback4 f17552c;
    public final boolean d;
    public final int f17553e;
    public final String f17554f;
    public final long f17555g;

    public el(TranslateController translateController, Utilities.Callback4 callback4, boolean z10, int i10, String str, long j3, int i11) {
        this.f17550a = i11;
        this.f17551b = translateController;
        this.f17552c = callback4;
        this.d = z10;
        this.f17553e = i10;
        this.f17554f = str;
        this.f17555g = j3;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f17550a) {
            case 0:
                this.f17551b.lambda$pushToTranslate$21(this.f17552c, this.d, this.f17553e, this.f17554f, this.f17555g, (String) obj, (Boolean) obj2);
                return;
            default:
                this.f17551b.lambda$pushToTranslate$20(this.f17552c, this.d, this.f17553e, this.f17554f, this.f17555g, (String) obj, (Boolean) obj2);
                return;
        }
    }
}
