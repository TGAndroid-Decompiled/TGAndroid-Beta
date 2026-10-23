package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
public final class s8 implements Runnable {
    public final int f19565a;
    public final Object f19566b;
    public final long f19567c;
    public final boolean d;
    public final Object e;

    public s8(Object obj, long j10, boolean z10, Object obj2, int i10) {
        this.f19565a = i10;
        this.f19566b = obj;
        this.f19567c = j10;
        this.d = z10;
        this.e = obj2;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.s8.run():void");
    }

    public s8(Object obj, boolean z10, long j10, Object obj2, int i10) {
        this.f19565a = i10;
        this.f19566b = obj;
        this.d = z10;
        this.f19567c = j10;
        this.e = obj2;
    }

    public s8(BaseController baseController, Object obj, boolean z10, long j10, int i10) {
        this.f19565a = i10;
        this.f19566b = baseController;
        this.e = obj;
        this.d = z10;
        this.f19567c = j10;
    }

    public s8(MediaDataController mediaDataController, ArrayList arrayList, long j10, boolean z10) {
        this.f19565a = 1;
        this.f19566b = mediaDataController;
        this.e = arrayList;
        this.f19567c = j10;
        this.d = z10;
    }

    public s8(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, long j10, Cloneable cloneable, boolean z10, int i10) {
        this.f19565a = i10;
        this.f19566b = notificationCenterDelegate;
        this.f19567c = j10;
        this.e = cloneable;
        this.d = z10;
    }
}
