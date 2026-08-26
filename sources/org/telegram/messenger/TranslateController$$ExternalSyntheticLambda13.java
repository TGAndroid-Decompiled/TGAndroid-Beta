package org.telegram.messenger;

public final class TranslateController$$ExternalSyntheticLambda13 implements Utilities.Callback2 {
    public final int $r8$classId;
    public final TranslateController f$0;
    public final Utilities.Callback4 f$1;
    public final boolean f$2;
    public final int f$3;
    public final String f$4;
    public final long f$5;

    public TranslateController$$ExternalSyntheticLambda13(TranslateController translateController, Utilities.Callback4 callback4, boolean z, int i, String str, long j, int i2) {
        this.$r8$classId = i2;
        this.f$0 = translateController;
        this.f$1 = callback4;
        this.f$2 = z;
        this.f$3 = i;
        this.f$4 = str;
        this.f$5 = j;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                TranslateController translateController = this.f$0;
                String str = this.f$4;
                long j = this.f$5;
                translateController.lambda$pushToTranslate$21(this.f$1, this.f$2, this.f$3, str, j, (String) obj, (Boolean) obj2);
                break;
            default:
                TranslateController translateController2 = this.f$0;
                String str2 = this.f$4;
                long j2 = this.f$5;
                translateController2.lambda$pushToTranslate$20(this.f$1, this.f$2, this.f$3, str2, j2, (String) obj, (Boolean) obj2);
                break;
        }
    }
}
