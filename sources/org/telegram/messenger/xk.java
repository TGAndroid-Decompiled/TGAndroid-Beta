package org.telegram.messenger;

import org.telegram.messenger.Utilities;
public final class xk implements Utilities.Callback2 {
    public final int f18175a;
    public final TranslateController f18176b;
    public final Utilities.Callback4 f18177c;
    public final boolean d;
    public final int e;
    public final String f18178f;
    public final long f18179g;

    public xk(TranslateController translateController, Utilities.Callback4 callback4, boolean z10, int i10, String str, long j3, int i11) {
        this.f18175a = i11;
        this.f18176b = translateController;
        this.f18177c = callback4;
        this.d = z10;
        this.e = i10;
        this.f18178f = str;
        this.f18179g = j3;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f18175a) {
            case 0:
                this.f18176b.lambda$pushToTranslate$21(this.f18177c, this.d, this.e, this.f18178f, this.f18179g, (String) obj, (Boolean) obj2);
                return;
            default:
                this.f18176b.lambda$pushToTranslate$20(this.f18177c, this.d, this.e, this.f18178f, this.f18179g, (String) obj, (Boolean) obj2);
                return;
        }
    }
}
