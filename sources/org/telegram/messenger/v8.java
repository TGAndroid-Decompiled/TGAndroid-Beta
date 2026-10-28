package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
public final class v8 implements Runnable {
    public final int f21502a;
    public final Object f21503b;
    public final long f21504c;
    public final boolean d;
    public final Object e;

    public v8(Object obj, long j10, boolean z10, Object obj2, int i10) {
        this.f21502a = i10;
        this.f21503b = obj;
        this.f21504c = j10;
        this.d = z10;
        this.e = obj2;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.v8.run():void");
    }

    public v8(Object obj, boolean z10, long j10, Object obj2, int i10) {
        this.f21502a = i10;
        this.f21503b = obj;
        this.d = z10;
        this.f21504c = j10;
        this.e = obj2;
    }

    public v8(BaseController baseController, Object obj, boolean z10, long j10, int i10) {
        this.f21502a = i10;
        this.f21503b = baseController;
        this.e = obj;
        this.d = z10;
        this.f21504c = j10;
    }

    public v8(MediaDataController mediaDataController, ArrayList arrayList, long j10, boolean z10) {
        this.f21502a = 1;
        this.f21503b = mediaDataController;
        this.e = arrayList;
        this.f21504c = j10;
        this.d = z10;
    }

    public v8(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, long j10, Cloneable cloneable, boolean z10, int i10) {
        this.f21502a = i10;
        this.f21503b = notificationCenterDelegate;
        this.f21504c = j10;
        this.e = cloneable;
        this.d = z10;
    }
}
