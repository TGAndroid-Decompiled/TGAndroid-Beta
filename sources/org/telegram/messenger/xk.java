package org.telegram.messenger;

import org.telegram.messenger.Utilities;
public final class xk implements Utilities.Callback2 {
    public final int f18158a;
    public final TranslateController f18159b;
    public final Utilities.Callback4 f18160c;
    public final boolean d;
    public final int e;
    public final String f18161f;
    public final long f18162g;

    public xk(TranslateController translateController, Utilities.Callback4 callback4, boolean z10, int i10, String str, long j3, int i11) {
        this.f18158a = i11;
        this.f18159b = translateController;
        this.f18160c = callback4;
        this.d = z10;
        this.e = i10;
        this.f18161f = str;
        this.f18162g = j3;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f18158a) {
            case 0:
                this.f18159b.lambda$pushToTranslate$21(this.f18160c, this.d, this.e, this.f18161f, this.f18162g, (String) obj, (Boolean) obj2);
                return;
            default:
                this.f18159b.lambda$pushToTranslate$20(this.f18160c, this.d, this.e, this.f18161f, this.f18162g, (String) obj, (Boolean) obj2);
                return;
        }
    }
}
