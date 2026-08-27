package org.telegram.messenger;

public final class r6 implements Runnable {

    public final int f21410a;

    public final int f21411b;

    public final int f21412c;
    public final Object d;

    public r6(int i10, int i11, String str) {
        this.f21410a = 3;
        this.f21411b = i10;
        this.f21412c = i11;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f21410a) {
            case 0:
                ((MediaController.AnonymousClass8) this.d).lambda$onStateChanged$0(this.f21411b, this.f21412c);
                break;
            case 1:
                ((MediaDataController) this.d).lambda$processLoadedStickers$106(this.f21411b, this.f21412c);
                break;
            case 2:
                ((NotificationsController) this.d).lambda$deleteNotificationChannelGlobal$43(this.f21411b, this.f21412c);
                break;
            default:
                PushListenerController.lambda$sendRegistrationToServer$0(this.f21411b, this.f21412c, (String) this.d);
                break;
        }
    }

    public r6(Object obj, int i10, int i11, int i12) {
        this.f21410a = i12;
        this.d = obj;
        this.f21411b = i10;
        this.f21412c = i11;
    }
}
