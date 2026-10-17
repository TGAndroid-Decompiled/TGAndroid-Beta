package org.telegram.messenger;

import org.telegram.messenger.Utilities;
public final class uk implements Utilities.Callback2 {
    public final int f19695a;
    public final TranslateController f19696b;
    public final Utilities.Callback4 f19697c;
    public final boolean d;
    public final int e;
    public final String f19698f;
    public final long f19699g;

    public uk(TranslateController translateController, Utilities.Callback4 callback4, boolean z10, int i10, String str, long j10, int i11) {
        this.f19695a = i11;
        this.f19696b = translateController;
        this.f19697c = callback4;
        this.d = z10;
        this.e = i10;
        this.f19698f = str;
        this.f19699g = j10;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f19695a) {
            case 0:
                this.f19696b.lambda$pushToTranslate$21(this.f19697c, this.d, this.e, this.f19698f, this.f19699g, (String) obj, (Boolean) obj2);
                return;
            default:
                this.f19696b.lambda$pushToTranslate$20(this.f19697c, this.d, this.e, this.f19698f, this.f19699g, (String) obj, (Boolean) obj2);
                return;
        }
    }
}
