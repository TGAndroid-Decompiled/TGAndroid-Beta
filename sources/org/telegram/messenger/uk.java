package org.telegram.messenger;

import org.telegram.messenger.Utilities;
public final class uk implements Utilities.Callback2 {
    public final int f19696a;
    public final TranslateController f19697b;
    public final Utilities.Callback4 f19698c;
    public final boolean d;
    public final int e;
    public final String f19699f;
    public final long f19700g;

    public uk(TranslateController translateController, Utilities.Callback4 callback4, boolean z10, int i10, String str, long j10, int i11) {
        this.f19696a = i11;
        this.f19697b = translateController;
        this.f19698c = callback4;
        this.d = z10;
        this.e = i10;
        this.f19699f = str;
        this.f19700g = j10;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f19696a) {
            case 0:
                this.f19697b.lambda$pushToTranslate$21(this.f19698c, this.d, this.e, this.f19699f, this.f19700g, (String) obj, (Boolean) obj2);
                return;
            default:
                this.f19697b.lambda$pushToTranslate$20(this.f19698c, this.d, this.e, this.f19699f, this.f19700g, (String) obj, (Boolean) obj2);
                return;
        }
    }
}
