package org.telegram.messenger;

import org.telegram.messenger.Utilities;
public final class gl implements Utilities.Callback2 {
    public final int f15312a;
    public final TranslateController f15313b;
    public final Utilities.Callback4 f15314c;
    public final boolean d;
    public final int e;
    public final String f15315f;
    public final long f15316g;

    public gl(TranslateController translateController, Utilities.Callback4 callback4, boolean z10, int i10, String str, long j3, int i11) {
        this.f15312a = i11;
        this.f15313b = translateController;
        this.f15314c = callback4;
        this.d = z10;
        this.e = i10;
        this.f15315f = str;
        this.f15316g = j3;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f15312a) {
            case 0:
                this.f15313b.lambda$pushToTranslate$21(this.f15314c, this.d, this.e, this.f15315f, this.f15316g, (String) obj, (Boolean) obj2);
                return;
            default:
                this.f15313b.lambda$pushToTranslate$20(this.f15314c, this.d, this.e, this.f15315f, this.f15316g, (String) obj, (Boolean) obj2);
                return;
        }
    }
}
