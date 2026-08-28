package org.telegram.messenger;

import org.telegram.messenger.Utilities;
public final class ok implements Utilities.Callback2 {
    public final int f21179a;
    public final TranslateController f21180b;
    public final Utilities.Callback4 f21181c;
    public final boolean d;
    public final int f21182e;
    public final String f21183f;
    public final long f21184g;

    public ok(TranslateController translateController, Utilities.Callback4 callback4, boolean z10, int i9, String str, long j10, int i10) {
        this.f21179a = i10;
        this.f21180b = translateController;
        this.f21181c = callback4;
        this.d = z10;
        this.f21182e = i9;
        this.f21183f = str;
        this.f21184g = j10;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f21179a) {
            case 0:
                this.f21180b.lambda$pushToTranslate$21(this.f21181c, this.d, this.f21182e, this.f21183f, this.f21184g, (String) obj, (Boolean) obj2);
                return;
            default:
                this.f21180b.lambda$pushToTranslate$20(this.f21181c, this.d, this.f21182e, this.f21183f, this.f21184g, (String) obj, (Boolean) obj2);
                return;
        }
    }
}
