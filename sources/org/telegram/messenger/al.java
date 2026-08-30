package org.telegram.messenger;

import org.telegram.messenger.Utilities;
public final class al implements Utilities.Callback2 {
    public final int f16791a;
    public final TranslateController f16792b;
    public final Utilities.Callback4 f16793c;
    public final boolean d;
    public final int e;
    public final String f16794f;
    public final long f16795g;

    public al(TranslateController translateController, Utilities.Callback4 callback4, boolean z4, int i10, String str, long j10, int i11) {
        this.f16791a = i11;
        this.f16792b = translateController;
        this.f16793c = callback4;
        this.d = z4;
        this.e = i10;
        this.f16794f = str;
        this.f16795g = j10;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f16791a) {
            case 0:
                this.f16792b.lambda$pushToTranslate$21(this.f16793c, this.d, this.e, this.f16794f, this.f16795g, (String) obj, (Boolean) obj2);
                return;
            default:
                this.f16792b.lambda$pushToTranslate$20(this.f16793c, this.d, this.e, this.f16794f, this.f16795g, (String) obj, (Boolean) obj2);
                return;
        }
    }
}
