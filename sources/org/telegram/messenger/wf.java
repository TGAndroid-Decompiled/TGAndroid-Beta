package org.telegram.messenger;

import android.content.SharedPreferences;
import java.util.ArrayList;
public final class wf implements Runnable {
    public final int f26306a = 0;
    public final ui f26307b;
    public final boolean f26308c;
    public final ArrayList d;
    public final int f26309e;

    public wf(ui uiVar, boolean z9, int i7, ArrayList arrayList) {
        this.f26307b = uiVar;
        this.f26308c = z9;
        this.f26309e = i7;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        int i7 = this.f26306a;
        int i10 = this.f26309e;
        ArrayList arrayList = this.d;
        boolean z9 = this.f26308c;
        ui uiVar = this.f26307b;
        switch (i7) {
            case 0:
                SharedPreferences.Editor edit = qp.s1(uiVar.currentAccount).f24788f7.edit();
                if (z9) {
                    uiVar.f25826j0 = false;
                    uiVar.f25828k0 = true;
                    edit.putLong("lastGifLoadTime", System.currentTimeMillis()).apply();
                } else {
                    uiVar.f25820g0[i10] = false;
                    uiVar.f25822h0[i10] = true;
                    if (i10 == 0) {
                        edit.putLong("lastStickersLoadTime", System.currentTimeMillis()).apply();
                    } else if (i10 == 1) {
                        edit.putLong("lastStickersLoadTimeMask", System.currentTimeMillis()).apply();
                    } else if (i10 == 3) {
                        edit.putLong("lastStickersLoadTimeGreet", System.currentTimeMillis()).apply();
                    } else if (i10 == 5) {
                        edit.putLong("lastStickersLoadTimeEmojiPacks", System.currentTimeMillis()).apply();
                    } else if (i10 == 7) {
                        edit.putLong("lastStickersLoadTimePremiumStickers", System.currentTimeMillis()).apply();
                    } else {
                        edit.putLong("lastStickersLoadTimeFavs", System.currentTimeMillis()).apply();
                    }
                }
                if (arrayList != null) {
                    if (z9) {
                        uiVar.f25824i0 = arrayList;
                    } else {
                        uiVar.f25818f0[i10] = arrayList;
                    }
                    if (i10 == 3) {
                        uiVar.n1();
                    }
                    uiVar.getNotificationCenter().k(86, Boolean.valueOf(z9), Integer.valueOf(i10));
                    return;
                }
                return;
            default:
                if (z9) {
                    uiVar.f25824i0 = arrayList;
                    uiVar.f25826j0 = false;
                    uiVar.f25828k0 = true;
                } else {
                    uiVar.f25818f0[i10] = arrayList;
                    uiVar.f25820g0[i10] = false;
                    uiVar.f25822h0[i10] = true;
                }
                if (i10 == 3) {
                    uiVar.n1();
                }
                uiVar.getNotificationCenter().k(86, Boolean.valueOf(z9), Integer.valueOf(i10));
                uiVar.V0(i10, z9, false, false);
                return;
        }
    }

    public wf(ui uiVar, boolean z9, ArrayList arrayList, int i7) {
        this.f26307b = uiVar;
        this.f26308c = z9;
        this.d = arrayList;
        this.f26309e = i7;
    }
}
