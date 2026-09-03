package org.telegram.messenger;

import org.telegram.messenger.Utilities;
public final class al implements Utilities.Callback2 {
    public final int f18200a;
    public final TranslateController f18201b;
    public final Utilities.Callback4 f18202c;
    public final boolean d;
    public final int f18203e;
    public final String f18204f;
    public final long f18205g;

    public al(TranslateController translateController, Utilities.Callback4 callback4, boolean z4, int i10, String str, long j10, int i11) {
        this.f18200a = i11;
        this.f18201b = translateController;
        this.f18202c = callback4;
        this.d = z4;
        this.f18203e = i10;
        this.f18204f = str;
        this.f18205g = j10;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f18200a) {
            case 0:
                this.f18201b.lambda$pushToTranslate$21(this.f18202c, this.d, this.f18203e, this.f18204f, this.f18205g, (String) obj, (Boolean) obj2);
                return;
            default:
                this.f18201b.lambda$pushToTranslate$20(this.f18202c, this.d, this.f18203e, this.f18204f, this.f18205g, (String) obj, (Boolean) obj2);
                return;
        }
    }
}
