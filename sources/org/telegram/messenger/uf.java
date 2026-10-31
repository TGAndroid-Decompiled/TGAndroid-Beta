package org.telegram.messenger;

import android.content.SharedPreferences;
import java.util.ArrayList;
public final class uf implements Runnable {
    public final int f18286a = 0;
    public final ui f18287b;
    public final boolean f18288c;
    public final ArrayList d;
    public final int e;

    public uf(ui uiVar, boolean z10, int i10, ArrayList arrayList) {
        this.f18287b = uiVar;
        this.f18288c = z10;
        this.e = i10;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        int i10 = this.f18286a;
        int i11 = this.e;
        ArrayList arrayList = this.d;
        boolean z10 = this.f18288c;
        ui uiVar = this.f18287b;
        switch (i10) {
            case 0:
                SharedPreferences.Editor edit = vp.r1(uiVar.currentAccount).f18795g7.edit();
                if (z10) {
                    uiVar.f18326j0 = false;
                    uiVar.f18328k0 = true;
                    edit.putLong("lastGifLoadTime", System.currentTimeMillis()).apply();
                } else {
                    uiVar.f18320g0[i11] = false;
                    uiVar.f18322h0[i11] = true;
                    if (i11 == 0) {
                        edit.putLong("lastStickersLoadTime", System.currentTimeMillis()).apply();
                    } else if (i11 == 1) {
                        edit.putLong("lastStickersLoadTimeMask", System.currentTimeMillis()).apply();
                    } else if (i11 == 3) {
                        edit.putLong("lastStickersLoadTimeGreet", System.currentTimeMillis()).apply();
                    } else if (i11 == 5) {
                        edit.putLong("lastStickersLoadTimeEmojiPacks", System.currentTimeMillis()).apply();
                    } else if (i11 == 7) {
                        edit.putLong("lastStickersLoadTimePremiumStickers", System.currentTimeMillis()).apply();
                    } else {
                        edit.putLong("lastStickersLoadTimeFavs", System.currentTimeMillis()).apply();
                    }
                }
                if (arrayList != null) {
                    if (z10) {
                        uiVar.f18324i0 = arrayList;
                    } else {
                        uiVar.f18318f0[i11] = arrayList;
                    }
                    if (i11 == 3) {
                        uiVar.n1();
                    }
                    uiVar.getNotificationCenter().k(86, Boolean.valueOf(z10), Integer.valueOf(i11));
                    return;
                }
                return;
            default:
                if (z10) {
                    uiVar.f18324i0 = arrayList;
                    uiVar.f18326j0 = false;
                    uiVar.f18328k0 = true;
                } else {
                    uiVar.f18318f0[i11] = arrayList;
                    uiVar.f18320g0[i11] = false;
                    uiVar.f18322h0[i11] = true;
                }
                if (i11 == 3) {
                    uiVar.n1();
                }
                uiVar.getNotificationCenter().k(86, Boolean.valueOf(z10), Integer.valueOf(i11));
                uiVar.V0(i11, z10, false, false);
                return;
        }
    }

    public uf(ui uiVar, boolean z10, ArrayList arrayList, int i10) {
        this.f18287b = uiVar;
        this.f18288c = z10;
        this.d = arrayList;
        this.e = i10;
    }
}
