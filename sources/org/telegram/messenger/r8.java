package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
public final class r8 implements Runnable {
    public final int f18751a;
    public final Object f18752b;
    public final long f18753c;
    public final boolean d;
    public final Object f18754e;

    public r8(Object obj, long j3, boolean z10, Object obj2, int i10) {
        this.f18751a = i10;
        this.f18752b = obj;
        this.f18753c = j3;
        this.d = z10;
        this.f18754e = obj2;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.r8.run():void");
    }

    public r8(Object obj, boolean z10, long j3, Object obj2, int i10) {
        this.f18751a = i10;
        this.f18752b = obj;
        this.d = z10;
        this.f18753c = j3;
        this.f18754e = obj2;
    }

    public r8(BaseController baseController, Object obj, boolean z10, long j3, int i10) {
        this.f18751a = i10;
        this.f18752b = baseController;
        this.f18754e = obj;
        this.d = z10;
        this.f18753c = j3;
    }

    public r8(MediaDataController mediaDataController, ArrayList arrayList, long j3, boolean z10) {
        this.f18751a = 1;
        this.f18752b = mediaDataController;
        this.f18754e = arrayList;
        this.f18753c = j3;
        this.d = z10;
    }

    public r8(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, long j3, Cloneable cloneable, boolean z10, int i10) {
        this.f18751a = i10;
        this.f18752b = notificationCenterDelegate;
        this.f18753c = j3;
        this.f18754e = cloneable;
        this.d = z10;
    }
}
