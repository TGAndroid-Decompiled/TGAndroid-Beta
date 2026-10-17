package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
public final class o8 implements Runnable {
    public final int f19158a;
    public final Object f19159b;
    public final long f19160c;
    public final boolean d;
    public final Object e;

    public o8(Object obj, long j10, boolean z10, Object obj2, int i10) {
        this.f19158a = i10;
        this.f19159b = obj;
        this.f19160c = j10;
        this.d = z10;
        this.e = obj2;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.o8.run():void");
    }

    public o8(Object obj, boolean z10, long j10, Object obj2, int i10) {
        this.f19158a = i10;
        this.f19159b = obj;
        this.d = z10;
        this.f19160c = j10;
        this.e = obj2;
    }

    public o8(BaseController baseController, Object obj, boolean z10, long j10, int i10) {
        this.f19158a = i10;
        this.f19159b = baseController;
        this.e = obj;
        this.d = z10;
        this.f19160c = j10;
    }

    public o8(MediaDataController mediaDataController, ArrayList arrayList, long j10, boolean z10) {
        this.f19158a = 1;
        this.f19159b = mediaDataController;
        this.e = arrayList;
        this.f19160c = j10;
        this.d = z10;
    }

    public o8(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, long j10, Cloneable cloneable, boolean z10, int i10) {
        this.f19158a = i10;
        this.f19159b = notificationCenterDelegate;
        this.f19160c = j10;
        this.e = cloneable;
        this.d = z10;
    }
}
