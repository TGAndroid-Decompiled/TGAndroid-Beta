package org.telegram.messenger;

import android.content.SharedPreferences;
import java.util.ArrayList;
public final class vf implements Runnable {
    public final int f26973a = 0;
    public final si f26974b;
    public final boolean f26975c;
    public final ArrayList d;
    public final int f26976e;

    public vf(si siVar, boolean z10, int i7, ArrayList arrayList) {
        this.f26974b = siVar;
        this.f26975c = z10;
        this.f26976e = i7;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        int i7 = this.f26973a;
        int i10 = this.f26976e;
        ArrayList arrayList = this.d;
        boolean z10 = this.f26975c;
        si siVar = this.f26974b;
        switch (i7) {
            case 0:
                SharedPreferences.Editor edit = np.s1(siVar.currentAccount).f25289g7.edit();
                if (z10) {
                    siVar.f26483k0 = false;
                    siVar.f26485l0 = true;
                    edit.putLong("lastGifLoadTime", System.currentTimeMillis()).apply();
                } else {
                    siVar.f26477h0[i10] = false;
                    siVar.f26479i0[i10] = true;
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
                        siVar.f26481j0 = arrayList;
                    } else {
                        siVar.f26475g0[i10] = arrayList;
                    }
                    if (i10 == 3) {
                        siVar.n1();
                    }
                    siVar.getNotificationCenter().k(86, Boolean.valueOf(z10), Integer.valueOf(i10));
                    return;
                }
                return;
            default:
                if (z10) {
                    siVar.f26481j0 = arrayList;
                    siVar.f26483k0 = false;
                    siVar.f26485l0 = true;
                } else {
                    siVar.f26475g0[i10] = arrayList;
                    siVar.f26477h0[i10] = false;
                    siVar.f26479i0[i10] = true;
                }
                if (i10 == 3) {
                    siVar.n1();
                }
                siVar.getNotificationCenter().k(86, Boolean.valueOf(z10), Integer.valueOf(i10));
                siVar.V0(i10, z10, false, false);
                return;
        }
    }

    public vf(si siVar, boolean z10, ArrayList arrayList, int i7) {
        this.f26974b = siVar;
        this.f26975c = z10;
        this.d = arrayList;
        this.f26976e = i7;
    }
}
