package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
public final class t8 implements Runnable {
    public final int f19640a;
    public final Object f19641b;
    public final long f19642c;
    public final boolean d;
    public final Object e;

    public t8(Object obj, long j10, boolean z10, Object obj2, int i10) {
        this.f19640a = i10;
        this.f19641b = obj;
        this.f19642c = j10;
        this.d = z10;
        this.e = obj2;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.t8.run():void");
    }

    public t8(Object obj, boolean z10, long j10, Object obj2, int i10) {
        this.f19640a = i10;
        this.f19641b = obj;
        this.d = z10;
        this.f19642c = j10;
        this.e = obj2;
    }

    public t8(BaseController baseController, Object obj, boolean z10, long j10, int i10) {
        this.f19640a = i10;
        this.f19641b = baseController;
        this.e = obj;
        this.d = z10;
        this.f19642c = j10;
    }

    public t8(MediaDataController mediaDataController, ArrayList arrayList, long j10, boolean z10) {
        this.f19640a = 1;
        this.f19641b = mediaDataController;
        this.e = arrayList;
        this.f19642c = j10;
        this.d = z10;
    }

    public t8(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, long j10, Cloneable cloneable, boolean z10, int i10) {
        this.f19640a = i10;
        this.f19641b = notificationCenterDelegate;
        this.f19642c = j10;
        this.e = cloneable;
        this.d = z10;
    }
}
