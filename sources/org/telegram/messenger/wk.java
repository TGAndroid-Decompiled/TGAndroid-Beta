package org.telegram.messenger;

import org.telegram.messenger.Utilities;
public final class wk implements Utilities.Callback2 {
    public final int f20090a;
    public final TranslateController f20091b;
    public final Utilities.Callback4 f20092c;
    public final boolean d;
    public final int e;
    public final String f20093f;
    public final long f20094g;

    public wk(TranslateController translateController, Utilities.Callback4 callback4, boolean z10, int i10, String str, long j10, int i11) {
        this.f20090a = i11;
        this.f20091b = translateController;
        this.f20092c = callback4;
        this.d = z10;
        this.e = i10;
        this.f20093f = str;
        this.f20094g = j10;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f20090a) {
            case 0:
                this.f20091b.lambda$pushToTranslate$21(this.f20092c, this.d, this.e, this.f20093f, this.f20094g, (String) obj, (Boolean) obj2);
                return;
            default:
                this.f20091b.lambda$pushToTranslate$20(this.f20092c, this.d, this.e, this.f20093f, this.f20094g, (String) obj, (Boolean) obj2);
                return;
        }
    }
}
