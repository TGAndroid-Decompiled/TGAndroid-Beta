package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
public final class o8 implements Runnable {
    public final int f18713a;
    public final Object f18714b;
    public final long f18715c;
    public final boolean d;
    public final Object f18716e;

    public o8(Object obj, long j3, boolean z10, Object obj2, int i10) {
        this.f18713a = i10;
        this.f18714b = obj;
        this.f18715c = j3;
        this.d = z10;
        this.f18716e = obj2;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.o8.run():void");
    }

    public o8(Object obj, boolean z10, long j3, Object obj2, int i10) {
        this.f18713a = i10;
        this.f18714b = obj;
        this.d = z10;
        this.f18715c = j3;
        this.f18716e = obj2;
    }

    public o8(BaseController baseController, Object obj, boolean z10, long j3, int i10) {
        this.f18713a = i10;
        this.f18714b = baseController;
        this.f18716e = obj;
        this.d = z10;
        this.f18715c = j3;
    }

    public o8(MediaDataController mediaDataController, ArrayList arrayList, long j3, boolean z10) {
        this.f18713a = 1;
        this.f18714b = mediaDataController;
        this.f18716e = arrayList;
        this.f18715c = j3;
        this.d = z10;
    }

    public o8(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, long j3, Cloneable cloneable, boolean z10, int i10) {
        this.f18713a = i10;
        this.f18714b = notificationCenterDelegate;
        this.f18715c = j3;
        this.f18716e = cloneable;
        this.d = z10;
    }
}
