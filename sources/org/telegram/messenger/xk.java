package org.telegram.messenger;

import org.telegram.messenger.Utilities;
public final class xk implements Utilities.Callback2 {
    public final int f19844a;
    public final TranslateController f19845b;
    public final Utilities.Callback4 f19846c;
    public final boolean d;
    public final int f19847e;
    public final String f19848f;
    public final long f19849g;

    public xk(TranslateController translateController, Utilities.Callback4 callback4, boolean z10, int i10, String str, long j3, int i11) {
        this.f19844a = i11;
        this.f19845b = translateController;
        this.f19846c = callback4;
        this.d = z10;
        this.f19847e = i10;
        this.f19848f = str;
        this.f19849g = j3;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f19844a) {
            case 0:
                this.f19845b.lambda$pushToTranslate$21(this.f19846c, this.d, this.f19847e, this.f19848f, this.f19849g, (String) obj, (Boolean) obj2);
                return;
            default:
                this.f19845b.lambda$pushToTranslate$20(this.f19846c, this.d, this.f19847e, this.f19848f, this.f19849g, (String) obj, (Boolean) obj2);
                return;
        }
    }
}
