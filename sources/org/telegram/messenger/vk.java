package org.telegram.messenger;

import org.telegram.messenger.Utilities;
public final class vk implements Utilities.Callback2 {
    public final int f19817a;
    public final TranslateController f19818b;
    public final Utilities.Callback4 f19819c;
    public final boolean d;
    public final int e;
    public final String f19820f;
    public final long f19821g;

    public vk(TranslateController translateController, Utilities.Callback4 callback4, boolean z10, int i10, String str, long j10, int i11) {
        this.f19817a = i11;
        this.f19818b = translateController;
        this.f19819c = callback4;
        this.d = z10;
        this.e = i10;
        this.f19820f = str;
        this.f19821g = j10;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f19817a) {
            case 0:
                this.f19818b.lambda$pushToTranslate$21(this.f19819c, this.d, this.e, this.f19820f, this.f19821g, (String) obj, (Boolean) obj2);
                return;
            default:
                this.f19818b.lambda$pushToTranslate$20(this.f19819c, this.d, this.e, this.f19820f, this.f19821g, (String) obj, (Boolean) obj2);
                return;
        }
    }
}
