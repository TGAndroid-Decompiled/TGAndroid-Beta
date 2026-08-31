package org.telegram.messenger;

import org.telegram.messenger.Utilities;
public final class al implements Utilities.Callback2 {
    public final int f18198a;
    public final TranslateController f18199b;
    public final Utilities.Callback4 f18200c;
    public final boolean d;
    public final int f18201e;
    public final String f18202f;
    public final long f18203g;

    public al(TranslateController translateController, Utilities.Callback4 callback4, boolean z4, int i10, String str, long j10, int i11) {
        this.f18198a = i11;
        this.f18199b = translateController;
        this.f18200c = callback4;
        this.d = z4;
        this.f18201e = i10;
        this.f18202f = str;
        this.f18203g = j10;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f18198a) {
            case 0:
                this.f18199b.lambda$pushToTranslate$21(this.f18200c, this.d, this.f18201e, this.f18202f, this.f18203g, (String) obj, (Boolean) obj2);
                return;
            default:
                this.f18199b.lambda$pushToTranslate$20(this.f18200c, this.d, this.f18201e, this.f18202f, this.f18203g, (String) obj, (Boolean) obj2);
                return;
        }
    }
}
