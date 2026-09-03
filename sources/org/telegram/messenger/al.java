package org.telegram.messenger;

import org.telegram.messenger.Utilities;
public final class al implements Utilities.Callback2 {
    public final int f16779a;
    public final TranslateController f16780b;
    public final Utilities.Callback4 f16781c;
    public final boolean d;
    public final int e;
    public final String f16782f;
    public final long f16783g;

    public al(TranslateController translateController, Utilities.Callback4 callback4, boolean z4, int i10, String str, long j10, int i11) {
        this.f16779a = i11;
        this.f16780b = translateController;
        this.f16781c = callback4;
        this.d = z4;
        this.e = i10;
        this.f16782f = str;
        this.f16783g = j10;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f16779a) {
            case 0:
                this.f16780b.lambda$pushToTranslate$21(this.f16781c, this.d, this.e, this.f16782f, this.f16783g, (String) obj, (Boolean) obj2);
                return;
            default:
                this.f16780b.lambda$pushToTranslate$20(this.f16781c, this.d, this.e, this.f16782f, this.f16783g, (String) obj, (Boolean) obj2);
                return;
        }
    }
}
