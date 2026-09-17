package org.telegram.messenger;
public final class wg implements Runnable {
    public final int f19560a;
    public final NotificationCenter f19561b;

    public wg(NotificationCenter notificationCenter, int i10) {
        this.f19560a = i10;
        this.f19561b = notificationCenter;
    }

    @Override
    public final void run() {
        switch (this.f19560a) {
            case 0:
                NotificationCenter.g(this.f19561b);
                return;
            default:
                NotificationCenter.b(this.f19561b);
                return;
        }
    }
}
