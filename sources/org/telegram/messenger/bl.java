package org.telegram.messenger;

import org.telegram.messenger.Utilities;
public final class bl implements Utilities.Callback2 {
    public final int f16904a;
    public final TranslateController f16905b;
    public final Utilities.Callback4 f16906c;
    public final boolean d;
    public final int e;
    public final String f16907f;
    public final long f16908g;

    public bl(TranslateController translateController, Utilities.Callback4 callback4, boolean z10, int i10, String str, long j10, int i11) {
        this.f16904a = i11;
        this.f16905b = translateController;
        this.f16906c = callback4;
        this.d = z10;
        this.e = i10;
        this.f16907f = str;
        this.f16908g = j10;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f16904a) {
            case 0:
                this.f16905b.lambda$pushToTranslate$21(this.f16906c, this.d, this.e, this.f16907f, this.f16908g, (String) obj, (Boolean) obj2);
                return;
            default:
                this.f16905b.lambda$pushToTranslate$20(this.f16906c, this.d, this.e, this.f16907f, this.f16908g, (String) obj, (Boolean) obj2);
                return;
        }
    }
}
