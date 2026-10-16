package org.telegram.messenger;

import org.telegram.messenger.Utilities;
public final class cl implements Utilities.Callback2 {
    public final int f16723a;
    public final TranslateController f16724b;
    public final Utilities.Callback4 f16725c;
    public final boolean d;
    public final int e;
    public final String f16726f;
    public final long f16727g;

    public cl(TranslateController translateController, Utilities.Callback4 callback4, boolean z10, int i10, String str, long j10, int i11) {
        this.f16723a = i11;
        this.f16724b = translateController;
        this.f16725c = callback4;
        this.d = z10;
        this.e = i10;
        this.f16726f = str;
        this.f16727g = j10;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f16723a) {
            case 0:
                this.f16724b.lambda$pushToTranslate$21(this.f16725c, this.d, this.e, this.f16726f, this.f16727g, (String) obj, (Boolean) obj2);
                return;
            default:
                this.f16724b.lambda$pushToTranslate$20(this.f16725c, this.d, this.e, this.f16726f, this.f16727g, (String) obj, (Boolean) obj2);
                return;
        }
    }
}
