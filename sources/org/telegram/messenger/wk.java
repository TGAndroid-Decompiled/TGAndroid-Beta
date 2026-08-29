package org.telegram.messenger;

import org.telegram.messenger.Utilities;
public final class wk implements Utilities.Callback2 {
    public final int f22119a;
    public final TranslateController f22120b;
    public final Utilities.Callback4 f22121c;
    public final boolean d;
    public final int f22122e;
    public final String f22123f;
    public final long f22124g;

    public wk(TranslateController translateController, Utilities.Callback4 callback4, boolean z10, int i10, String str, long j10, int i11) {
        this.f22119a = i11;
        this.f22120b = translateController;
        this.f22121c = callback4;
        this.d = z10;
        this.f22122e = i10;
        this.f22123f = str;
        this.f22124g = j10;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f22119a) {
            case 0:
                this.f22120b.lambda$pushToTranslate$21(this.f22121c, this.d, this.f22122e, this.f22123f, this.f22124g, (String) obj, (Boolean) obj2);
                return;
            default:
                this.f22120b.lambda$pushToTranslate$20(this.f22121c, this.d, this.f22122e, this.f22123f, this.f22124g, (String) obj, (Boolean) obj2);
                return;
        }
    }
}
