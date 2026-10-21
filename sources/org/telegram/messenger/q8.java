package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
public final class q8 implements Runnable {
    public final int f19329a;
    public final Object f19330b;
    public final long f19331c;
    public final boolean d;
    public final Object e;

    public q8(Object obj, long j10, boolean z10, Object obj2, int i10) {
        this.f19329a = i10;
        this.f19330b = obj;
        this.f19331c = j10;
        this.d = z10;
        this.e = obj2;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.q8.run():void");
    }

    public q8(Object obj, boolean z10, long j10, Object obj2, int i10) {
        this.f19329a = i10;
        this.f19330b = obj;
        this.d = z10;
        this.f19331c = j10;
        this.e = obj2;
    }

    public q8(BaseController baseController, Object obj, boolean z10, long j10, int i10) {
        this.f19329a = i10;
        this.f19330b = baseController;
        this.e = obj;
        this.d = z10;
        this.f19331c = j10;
    }

    public q8(MediaDataController mediaDataController, ArrayList arrayList, long j10, boolean z10) {
        this.f19329a = 1;
        this.f19330b = mediaDataController;
        this.e = arrayList;
        this.f19331c = j10;
        this.d = z10;
    }

    public q8(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, long j10, Cloneable cloneable, boolean z10, int i10) {
        this.f19329a = i10;
        this.f19330b = notificationCenterDelegate;
        this.f19331c = j10;
        this.e = cloneable;
        this.d = z10;
    }
}
