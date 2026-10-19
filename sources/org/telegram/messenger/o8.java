package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
public final class o8 implements Runnable {
    public final int f19157a;
    public final Object f19158b;
    public final long f19159c;
    public final boolean d;
    public final Object e;

    public o8(Object obj, long j10, boolean z10, Object obj2, int i10) {
        this.f19157a = i10;
        this.f19158b = obj;
        this.f19159c = j10;
        this.d = z10;
        this.e = obj2;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.o8.run():void");
    }

    public o8(Object obj, boolean z10, long j10, Object obj2, int i10) {
        this.f19157a = i10;
        this.f19158b = obj;
        this.d = z10;
        this.f19159c = j10;
        this.e = obj2;
    }

    public o8(BaseController baseController, Object obj, boolean z10, long j10, int i10) {
        this.f19157a = i10;
        this.f19158b = baseController;
        this.e = obj;
        this.d = z10;
        this.f19159c = j10;
    }

    public o8(MediaDataController mediaDataController, ArrayList arrayList, long j10, boolean z10) {
        this.f19157a = 1;
        this.f19158b = mediaDataController;
        this.e = arrayList;
        this.f19159c = j10;
        this.d = z10;
    }

    public o8(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, long j10, Cloneable cloneable, boolean z10, int i10) {
        this.f19157a = i10;
        this.f19158b = notificationCenterDelegate;
        this.f19159c = j10;
        this.e = cloneable;
        this.d = z10;
    }
}
