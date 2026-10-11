package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
public final class o8 implements Runnable {
    public final int f18716a;
    public final Object f18717b;
    public final long f18718c;
    public final boolean d;
    public final Object f18719e;

    public o8(Object obj, long j3, boolean z10, Object obj2, int i10) {
        this.f18716a = i10;
        this.f18717b = obj;
        this.f18718c = j3;
        this.d = z10;
        this.f18719e = obj2;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.o8.run():void");
    }

    public o8(Object obj, boolean z10, long j3, Object obj2, int i10) {
        this.f18716a = i10;
        this.f18717b = obj;
        this.d = z10;
        this.f18718c = j3;
        this.f18719e = obj2;
    }

    public o8(BaseController baseController, Object obj, boolean z10, long j3, int i10) {
        this.f18716a = i10;
        this.f18717b = baseController;
        this.f18719e = obj;
        this.d = z10;
        this.f18718c = j3;
    }

    public o8(MediaDataController mediaDataController, ArrayList arrayList, long j3, boolean z10) {
        this.f18716a = 1;
        this.f18717b = mediaDataController;
        this.f18719e = arrayList;
        this.f18718c = j3;
        this.d = z10;
    }

    public o8(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, long j3, Cloneable cloneable, boolean z10, int i10) {
        this.f18716a = i10;
        this.f18717b = notificationCenterDelegate;
        this.f18718c = j3;
        this.f18719e = cloneable;
        this.d = z10;
    }
}
