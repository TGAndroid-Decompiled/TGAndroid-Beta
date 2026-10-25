package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
public final class u8 implements Runnable {
    public final int f21396a;
    public final Object f21397b;
    public final long f21398c;
    public final boolean d;
    public final Object e;

    public u8(Object obj, long j10, boolean z10, Object obj2, int i10) {
        this.f21396a = i10;
        this.f21397b = obj;
        this.f21398c = j10;
        this.d = z10;
        this.e = obj2;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.u8.run():void");
    }

    public u8(Object obj, boolean z10, long j10, Object obj2, int i10) {
        this.f21396a = i10;
        this.f21397b = obj;
        this.d = z10;
        this.f21398c = j10;
        this.e = obj2;
    }

    public u8(BaseController baseController, Object obj, boolean z10, long j10, int i10) {
        this.f21396a = i10;
        this.f21397b = baseController;
        this.e = obj;
        this.d = z10;
        this.f21398c = j10;
    }

    public u8(MediaDataController mediaDataController, ArrayList arrayList, long j10, boolean z10) {
        this.f21396a = 1;
        this.f21397b = mediaDataController;
        this.e = arrayList;
        this.f21398c = j10;
        this.d = z10;
    }

    public u8(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, long j10, Cloneable cloneable, boolean z10, int i10) {
        this.f21396a = i10;
        this.f21397b = notificationCenterDelegate;
        this.f21398c = j10;
        this.e = cloneable;
        this.d = z10;
    }
}
