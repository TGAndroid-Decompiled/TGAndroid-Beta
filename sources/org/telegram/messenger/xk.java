package org.telegram.messenger;

import org.telegram.messenger.Utilities;
public final class xk implements Utilities.Callback2 {
    public final int f19676a;
    public final TranslateController f19677b;
    public final Utilities.Callback4 f19678c;
    public final boolean d;
    public final int f19679e;
    public final String f19680f;
    public final long f19681g;

    public xk(TranslateController translateController, Utilities.Callback4 callback4, boolean z10, int i10, String str, long j3, int i11) {
        this.f19676a = i11;
        this.f19677b = translateController;
        this.f19678c = callback4;
        this.d = z10;
        this.f19679e = i10;
        this.f19680f = str;
        this.f19681g = j3;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f19676a) {
            case 0:
                this.f19677b.lambda$pushToTranslate$21(this.f19678c, this.d, this.f19679e, this.f19680f, this.f19681g, (String) obj, (Boolean) obj2);
                return;
            default:
                this.f19677b.lambda$pushToTranslate$20(this.f19678c, this.d, this.f19679e, this.f19680f, this.f19681g, (String) obj, (Boolean) obj2);
                return;
        }
    }
}
