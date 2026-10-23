package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
public final class s8 implements Runnable {
    public final int f19497a;
    public final Object f19498b;
    public final long f19499c;
    public final boolean d;
    public final Object e;

    public s8(Object obj, long j10, boolean z10, Object obj2, int i10) {
        this.f19497a = i10;
        this.f19498b = obj;
        this.f19499c = j10;
        this.d = z10;
        this.e = obj2;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.s8.run():void");
    }

    public s8(Object obj, boolean z10, long j10, Object obj2, int i10) {
        this.f19497a = i10;
        this.f19498b = obj;
        this.d = z10;
        this.f19499c = j10;
        this.e = obj2;
    }

    public s8(BaseController baseController, Object obj, boolean z10, long j10, int i10) {
        this.f19497a = i10;
        this.f19498b = baseController;
        this.e = obj;
        this.d = z10;
        this.f19499c = j10;
    }

    public s8(MediaDataController mediaDataController, ArrayList arrayList, long j10, boolean z10) {
        this.f19497a = 1;
        this.f19498b = mediaDataController;
        this.e = arrayList;
        this.f19499c = j10;
        this.d = z10;
    }

    public s8(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, long j10, Cloneable cloneable, boolean z10, int i10) {
        this.f19497a = i10;
        this.f19498b = notificationCenterDelegate;
        this.f19499c = j10;
        this.e = cloneable;
        this.d = z10;
    }
}
