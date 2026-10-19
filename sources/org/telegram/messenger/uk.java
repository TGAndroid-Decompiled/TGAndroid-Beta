package org.telegram.messenger;

import org.telegram.messenger.Utilities;
public final class uk implements Utilities.Callback2 {
    public final int f19693a;
    public final TranslateController f19694b;
    public final Utilities.Callback4 f19695c;
    public final boolean d;
    public final int e;
    public final String f19696f;
    public final long f19697g;

    public uk(TranslateController translateController, Utilities.Callback4 callback4, boolean z10, int i10, String str, long j10, int i11) {
        this.f19693a = i11;
        this.f19694b = translateController;
        this.f19695c = callback4;
        this.d = z10;
        this.e = i10;
        this.f19696f = str;
        this.f19697g = j10;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f19693a) {
            case 0:
                this.f19694b.lambda$pushToTranslate$21(this.f19695c, this.d, this.e, this.f19696f, this.f19697g, (String) obj, (Boolean) obj2);
                return;
            default:
                this.f19694b.lambda$pushToTranslate$20(this.f19695c, this.d, this.e, this.f19696f, this.f19697g, (String) obj, (Boolean) obj2);
                return;
        }
    }
}
