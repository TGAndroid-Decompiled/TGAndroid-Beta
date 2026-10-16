package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
public final class r8 implements Runnable {
    public final int f17976a;
    public final Object f17977b;
    public final long f17978c;
    public final boolean d;
    public final Object e;

    public r8(Object obj, long j10, boolean z10, Object obj2, int i10) {
        this.f17976a = i10;
        this.f17977b = obj;
        this.f17978c = j10;
        this.d = z10;
        this.e = obj2;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.r8.run():void");
    }

    public r8(Object obj, boolean z10, long j10, Object obj2, int i10) {
        this.f17976a = i10;
        this.f17977b = obj;
        this.d = z10;
        this.f17978c = j10;
        this.e = obj2;
    }

    public r8(BaseController baseController, Object obj, boolean z10, long j10, int i10) {
        this.f17976a = i10;
        this.f17977b = baseController;
        this.e = obj;
        this.d = z10;
        this.f17978c = j10;
    }

    public r8(MediaDataController mediaDataController, ArrayList arrayList, long j10, boolean z10) {
        this.f17976a = 1;
        this.f17977b = mediaDataController;
        this.e = arrayList;
        this.f17978c = j10;
        this.d = z10;
    }

    public r8(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, long j10, Cloneable cloneable, boolean z10, int i10) {
        this.f17976a = i10;
        this.f17977b = notificationCenterDelegate;
        this.f17978c = j10;
        this.e = cloneable;
        this.d = z10;
    }
}
