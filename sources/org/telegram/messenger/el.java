package org.telegram.messenger;

import org.telegram.messenger.Utilities;
public final class el implements Utilities.Callback2 {
    public final int f17551a;
    public final TranslateController f17552b;
    public final Utilities.Callback4 f17553c;
    public final boolean d;
    public final int f17554e;
    public final String f17555f;
    public final long f17556g;

    public el(TranslateController translateController, Utilities.Callback4 callback4, boolean z10, int i10, String str, long j3, int i11) {
        this.f17551a = i11;
        this.f17552b = translateController;
        this.f17553c = callback4;
        this.d = z10;
        this.f17554e = i10;
        this.f17555f = str;
        this.f17556g = j3;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f17551a) {
            case 0:
                this.f17552b.lambda$pushToTranslate$21(this.f17553c, this.d, this.f17554e, this.f17555f, this.f17556g, (String) obj, (Boolean) obj2);
                return;
            default:
                this.f17552b.lambda$pushToTranslate$20(this.f17553c, this.d, this.f17554e, this.f17555f, this.f17556g, (String) obj, (Boolean) obj2);
                return;
        }
    }
}
