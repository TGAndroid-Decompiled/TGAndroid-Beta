package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class c6 implements RequestDelegate {
    public final int f15807a;
    public final int f15808b;
    public final int f15809c;
    public final NotificationCenter.NotificationCenterDelegate d;

    public c6(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10, int i11, int i12) {
        this.f15807a = i12;
        this.d = notificationCenterDelegate;
        this.f15808b = i10;
        this.f15809c = i11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f15807a) {
            case 0:
                ((MediaController) this.d).lambda$loadMoreMusic$12(this.f15808b, this.f15809c, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.d).lambda$getDifference$359(this.f15808b, this.f15809c, tLObject, tL_error);
                return;
        }
    }
}
