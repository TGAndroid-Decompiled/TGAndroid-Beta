package org.telegram.messenger;

import org.telegram.messenger.MediaController;
public final class a7 implements Runnable {
    public final int f19599a;
    public final int f19600b;
    public final int f19601c;
    public final Object d;

    public a7(int i10, int i11, String str) {
        this.f19599a = 3;
        this.f19600b = i10;
        this.f19601c = i11;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f19599a) {
            case 0:
                MediaController.AnonymousClass8.a((MediaController.AnonymousClass8) this.d, this.f19600b, this.f19601c);
                return;
            case 1:
                MediaDataController.J((MediaDataController) this.d, this.f19600b, this.f19601c);
                return;
            case 2:
                NotificationsController.m((NotificationsController) this.d, this.f19600b, this.f19601c);
                return;
            default:
                PushListenerController.d(this.f19600b, this.f19601c, (String) this.d);
                return;
        }
    }

    public a7(Object obj, int i10, int i11, int i12) {
        this.f19599a = i12;
        this.d = obj;
        this.f19600b = i10;
        this.f19601c = i11;
    }
}
