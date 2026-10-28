package org.telegram.messenger;

import org.telegram.messenger.Utilities;
public final class al implements Utilities.Callback2 {
    public final int f19652a;
    public final TranslateController f19653b;
    public final Utilities.Callback4 f19654c;
    public final boolean d;
    public final int e;
    public final String f19655f;
    public final long f19656g;

    public al(TranslateController translateController, Utilities.Callback4 callback4, boolean z10, int i10, String str, long j10, int i11) {
        this.f19652a = i11;
        this.f19653b = translateController;
        this.f19654c = callback4;
        this.d = z10;
        this.e = i10;
        this.f19655f = str;
        this.f19656g = j10;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f19652a) {
            case 0:
                this.f19653b.lambda$pushToTranslate$21(this.f19654c, this.d, this.e, this.f19655f, this.f19656g, (String) obj, (Boolean) obj2);
                return;
            default:
                this.f19653b.lambda$pushToTranslate$20(this.f19654c, this.d, this.e, this.f19655f, this.f19656g, (String) obj, (Boolean) obj2);
                return;
        }
    }
}
