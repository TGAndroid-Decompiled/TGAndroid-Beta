package org.telegram.messenger;
public final class ih implements Runnable {
    public final int f15468a;
    public final NotificationsController f15469b;
    public final int f15470c;

    public ih(NotificationsController notificationsController, int i10, int i11) {
        this.f15468a = i11;
        this.f15469b = notificationsController;
        this.f15470c = i10;
    }

    @Override
    public final void run() {
        switch (this.f15468a) {
            case 0:
                NotificationsController.R(this.f15469b, this.f15470c);
                return;
            case 1:
                NotificationsController.W(this.f15469b, this.f15470c);
                return;
            case 2:
                NotificationsController.b0(this.f15469b, this.f15470c);
                return;
            case 3:
                NotificationsController.Y(this.f15469b, this.f15470c);
                return;
            case 4:
                NotificationsController.i(this.f15469b, this.f15470c);
                return;
            case 5:
                NotificationsController.w(this.f15469b, this.f15470c);
                return;
            case 6:
                NotificationsController.q(this.f15469b, this.f15470c);
                return;
            default:
                NotificationsController.B(this.f15469b, this.f15470c);
                return;
        }
    }
}
