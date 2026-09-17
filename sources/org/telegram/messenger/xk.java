package org.telegram.messenger;

import org.telegram.messenger.Utilities;
public final class xk implements Utilities.Callback2 {
    public final int f19703a;
    public final TranslateController f19704b;
    public final Utilities.Callback4 f19705c;
    public final boolean d;
    public final int f19706e;
    public final String f19707f;
    public final long f19708g;

    public xk(TranslateController translateController, Utilities.Callback4 callback4, boolean z10, int i10, String str, long j3, int i11) {
        this.f19703a = i11;
        this.f19704b = translateController;
        this.f19705c = callback4;
        this.d = z10;
        this.f19706e = i10;
        this.f19707f = str;
        this.f19708g = j3;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f19703a) {
            case 0:
                this.f19704b.lambda$pushToTranslate$21(this.f19705c, this.d, this.f19706e, this.f19707f, this.f19708g, (String) obj, (Boolean) obj2);
                return;
            default:
                this.f19704b.lambda$pushToTranslate$20(this.f19705c, this.d, this.f19706e, this.f19707f, this.f19708g, (String) obj, (Boolean) obj2);
                return;
        }
    }
}
