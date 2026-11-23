package org.telegram.messenger;

import android.content.SharedPreferences;
import java.util.ArrayList;
public final class wf implements Runnable {
    public final int f27728a = 0;
    public final si f27729b;
    public final boolean f27730c;
    public final ArrayList d;
    public final int f27731e;

    public wf(si siVar, boolean z10, int i7, ArrayList arrayList) {
        this.f27729b = siVar;
        this.f27730c = z10;
        this.f27731e = i7;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        int i7 = this.f27728a;
        int i10 = this.f27731e;
        ArrayList arrayList = this.d;
        boolean z10 = this.f27730c;
        si siVar = this.f27729b;
        switch (i7) {
            case 0:
                SharedPreferences.Editor edit = np.u1(siVar.currentAccount).i7.edit();
                if (z10) {
                    siVar.f26835k0 = false;
                    siVar.f26837l0 = true;
                    edit.putLong("lastGifLoadTime", System.currentTimeMillis()).apply();
                } else {
                    siVar.f26829h0[i10] = false;
                    siVar.f26831i0[i10] = true;
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
                    if (z10) {
                        siVar.f26833j0 = arrayList;
                    } else {
                        siVar.f26827g0[i10] = arrayList;
                    }
                    if (i10 == 3) {
                        siVar.q1();
                    }
                    siVar.getNotificationCenter().k(86, Boolean.valueOf(z10), Integer.valueOf(i10));
                    return;
                }
                return;
            default:
                if (z10) {
                    siVar.f26833j0 = arrayList;
                    siVar.f26835k0 = false;
                    siVar.f26837l0 = true;
                } else {
                    siVar.f26827g0[i10] = arrayList;
                    siVar.f26829h0[i10] = false;
                    siVar.f26831i0[i10] = true;
                }
                if (i10 == 3) {
                    siVar.q1();
                }
                siVar.getNotificationCenter().k(86, Boolean.valueOf(z10), Integer.valueOf(i10));
                siVar.Y0(i10, z10, false, false);
                return;
        }
    }

    public wf(si siVar, boolean z10, ArrayList arrayList, int i7) {
        this.f27729b = siVar;
        this.f27730c = z10;
        this.d = arrayList;
        this.f27731e = i7;
    }
}
