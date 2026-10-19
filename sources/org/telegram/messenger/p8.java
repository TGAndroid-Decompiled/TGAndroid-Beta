package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
public final class p8 implements Runnable {
    public final int f19237a;
    public final Object f19238b;
    public final long f19239c;
    public final boolean d;
    public final Object e;

    public p8(Object obj, long j10, boolean z10, Object obj2, int i10) {
        this.f19237a = i10;
        this.f19238b = obj;
        this.f19239c = j10;
        this.d = z10;
        this.e = obj2;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.p8.run():void");
    }

    public p8(Object obj, boolean z10, long j10, Object obj2, int i10) {
        this.f19237a = i10;
        this.f19238b = obj;
        this.d = z10;
        this.f19239c = j10;
        this.e = obj2;
    }

    public p8(BaseController baseController, Object obj, boolean z10, long j10, int i10) {
        this.f19237a = i10;
        this.f19238b = baseController;
        this.e = obj;
        this.d = z10;
        this.f19239c = j10;
    }

    public p8(MediaDataController mediaDataController, ArrayList arrayList, long j10, boolean z10) {
        this.f19237a = 1;
        this.f19238b = mediaDataController;
        this.e = arrayList;
        this.f19239c = j10;
        this.d = z10;
    }

    public p8(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, long j10, Cloneable cloneable, boolean z10, int i10) {
        this.f19237a = i10;
        this.f19238b = notificationCenterDelegate;
        this.f19239c = j10;
        this.e = cloneable;
        this.d = z10;
    }
}
