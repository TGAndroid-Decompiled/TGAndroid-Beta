package org.telegram.messenger;

import org.telegram.messenger.Utilities;
public final class vk implements Utilities.Callback2 {
    public final int f19820a;
    public final TranslateController f19821b;
    public final Utilities.Callback4 f19822c;
    public final boolean d;
    public final int e;
    public final String f19823f;
    public final long f19824g;

    public vk(TranslateController translateController, Utilities.Callback4 callback4, boolean z10, int i10, String str, long j10, int i11) {
        this.f19820a = i11;
        this.f19821b = translateController;
        this.f19822c = callback4;
        this.d = z10;
        this.e = i10;
        this.f19823f = str;
        this.f19824g = j10;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f19820a) {
            case 0:
                this.f19821b.lambda$pushToTranslate$21(this.f19822c, this.d, this.e, this.f19823f, this.f19824g, (String) obj, (Boolean) obj2);
                return;
            default:
                this.f19821b.lambda$pushToTranslate$20(this.f19822c, this.d, this.e, this.f19823f, this.f19824g, (String) obj, (Boolean) obj2);
                return;
        }
    }
}
