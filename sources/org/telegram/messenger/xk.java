package org.telegram.messenger;

import org.telegram.messenger.Utilities;
public final class xk implements Utilities.Callback2 {
    public final int f19839a;
    public final TranslateController f19840b;
    public final Utilities.Callback4 f19841c;
    public final boolean d;
    public final int f19842e;
    public final String f19843f;
    public final long f19844g;

    public xk(TranslateController translateController, Utilities.Callback4 callback4, boolean z10, int i10, String str, long j3, int i11) {
        this.f19839a = i11;
        this.f19840b = translateController;
        this.f19841c = callback4;
        this.d = z10;
        this.f19842e = i10;
        this.f19843f = str;
        this.f19844g = j3;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f19839a) {
            case 0:
                this.f19840b.lambda$pushToTranslate$21(this.f19841c, this.d, this.f19842e, this.f19843f, this.f19844g, (String) obj, (Boolean) obj2);
                return;
            default:
                this.f19840b.lambda$pushToTranslate$20(this.f19841c, this.d, this.f19842e, this.f19843f, this.f19844g, (String) obj, (Boolean) obj2);
                return;
        }
    }
}
