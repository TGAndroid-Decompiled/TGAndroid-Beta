package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
public final class r8 implements Runnable {
    public final int f18274a;
    public final Object f18275b;
    public final long f18276c;
    public final boolean d;
    public final Object e;

    public r8(Object obj, long j10, boolean z10, Object obj2, int i10) {
        this.f18274a = i10;
        this.f18275b = obj;
        this.f18276c = j10;
        this.d = z10;
        this.e = obj2;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.r8.run():void");
    }

    public r8(Object obj, boolean z10, long j10, Object obj2, int i10) {
        this.f18274a = i10;
        this.f18275b = obj;
        this.d = z10;
        this.f18276c = j10;
        this.e = obj2;
    }

    public r8(BaseController baseController, Object obj, boolean z10, long j10, int i10) {
        this.f18274a = i10;
        this.f18275b = baseController;
        this.e = obj;
        this.d = z10;
        this.f18276c = j10;
    }

    public r8(MediaDataController mediaDataController, ArrayList arrayList, long j10, boolean z10) {
        this.f18274a = 1;
        this.f18275b = mediaDataController;
        this.e = arrayList;
        this.f18276c = j10;
        this.d = z10;
    }

    public r8(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, long j10, Cloneable cloneable, boolean z10, int i10) {
        this.f18274a = i10;
        this.f18275b = notificationCenterDelegate;
        this.f18276c = j10;
        this.e = cloneable;
        this.d = z10;
    }
}
