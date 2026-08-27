package org.telegram.messenger;

public final class tk implements Utilities.Callback2 {

    public final int f21661a;

    public final TranslateController f21662b;

    public final Utilities.Callback4 f21663c;
    public final boolean d;

    public final int f21664e;

    public final String f21665f;

    public final long f21666g;

    public tk(TranslateController translateController, Utilities.Callback4 callback4, boolean z10, int i10, String str, long j10, int i11) {
        this.f21661a = i11;
        this.f21662b = translateController;
        this.f21663c = callback4;
        this.d = z10;
        this.f21664e = i10;
        this.f21665f = str;
        this.f21666g = j10;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f21661a) {
            case 0:
                this.f21662b.lambda$pushToTranslate$21(this.f21663c, this.d, this.f21664e, this.f21665f, this.f21666g, (String) obj, (Boolean) obj2);
                break;
            default:
                this.f21662b.lambda$pushToTranslate$20(this.f21663c, this.d, this.f21664e, this.f21665f, this.f21666g, (String) obj, (Boolean) obj2);
                break;
        }
    }
}
