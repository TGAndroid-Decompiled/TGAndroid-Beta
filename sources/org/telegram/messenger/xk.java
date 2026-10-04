package org.telegram.messenger;

import org.telegram.messenger.Utilities;
public final class xk implements Utilities.Callback2 {
    public final int f19838a;
    public final TranslateController f19839b;
    public final Utilities.Callback4 f19840c;
    public final boolean d;
    public final int f19841e;
    public final String f19842f;
    public final long f19843g;

    public xk(TranslateController translateController, Utilities.Callback4 callback4, boolean z10, int i10, String str, long j3, int i11) {
        this.f19838a = i11;
        this.f19839b = translateController;
        this.f19840c = callback4;
        this.d = z10;
        this.f19841e = i10;
        this.f19842f = str;
        this.f19843g = j3;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f19838a) {
            case 0:
                this.f19839b.lambda$pushToTranslate$21(this.f19840c, this.d, this.f19841e, this.f19842f, this.f19843g, (String) obj, (Boolean) obj2);
                return;
            default:
                this.f19839b.lambda$pushToTranslate$20(this.f19840c, this.d, this.f19841e, this.f19842f, this.f19843g, (String) obj, (Boolean) obj2);
                return;
        }
    }
}
