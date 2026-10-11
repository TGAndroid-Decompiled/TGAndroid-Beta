package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
public final class o8 implements Runnable {
    public final int f18752a;
    public final Object f18753b;
    public final long f18754c;
    public final boolean d;
    public final Object f18755e;

    public o8(Object obj, long j3, boolean z10, Object obj2, int i10) {
        this.f18752a = i10;
        this.f18753b = obj;
        this.f18754c = j3;
        this.d = z10;
        this.f18755e = obj2;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.o8.run():void");
    }

    public o8(Object obj, boolean z10, long j3, Object obj2, int i10) {
        this.f18752a = i10;
        this.f18753b = obj;
        this.d = z10;
        this.f18754c = j3;
        this.f18755e = obj2;
    }

    public o8(BaseController baseController, Object obj, boolean z10, long j3, int i10) {
        this.f18752a = i10;
        this.f18753b = baseController;
        this.f18755e = obj;
        this.d = z10;
        this.f18754c = j3;
    }

    public o8(MediaDataController mediaDataController, ArrayList arrayList, long j3, boolean z10) {
        this.f18752a = 1;
        this.f18753b = mediaDataController;
        this.f18755e = arrayList;
        this.f18754c = j3;
        this.d = z10;
    }

    public o8(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, long j3, Cloneable cloneable, boolean z10, int i10) {
        this.f18752a = i10;
        this.f18753b = notificationCenterDelegate;
        this.f18754c = j3;
        this.f18755e = cloneable;
        this.d = z10;
    }
}
