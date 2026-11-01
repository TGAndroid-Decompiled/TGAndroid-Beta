package org.telegram.messenger;

import android.content.SharedPreferences;
import java.util.ArrayList;
public final class vf implements Runnable {
    public final int f18615a = 0;
    public final vi f18616b;
    public final boolean f18617c;
    public final ArrayList d;
    public final int e;

    public vf(vi viVar, boolean z10, int i10, ArrayList arrayList) {
        this.f18616b = viVar;
        this.f18617c = z10;
        this.e = i10;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        int i10 = this.f18615a;
        int i11 = this.e;
        ArrayList arrayList = this.d;
        boolean z10 = this.f18617c;
        vi viVar = this.f18616b;
        switch (i10) {
            case 0:
                SharedPreferences.Editor edit = wp.r1(viVar.currentAccount).f19138g7.edit();
                if (z10) {
                    viVar.f18655j0 = false;
                    viVar.f18657k0 = true;
                    edit.putLong("lastGifLoadTime", System.currentTimeMillis()).apply();
                } else {
                    viVar.f18649g0[i11] = false;
                    viVar.f18651h0[i11] = true;
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
                        viVar.f18653i0 = arrayList;
                    } else {
                        viVar.f18647f0[i11] = arrayList;
                    }
                    if (i11 == 3) {
                        viVar.n1();
                    }
                    viVar.getNotificationCenter().k(86, Boolean.valueOf(z10), Integer.valueOf(i11));
                    return;
                }
                return;
            default:
                if (z10) {
                    viVar.f18653i0 = arrayList;
                    viVar.f18655j0 = false;
                    viVar.f18657k0 = true;
                } else {
                    viVar.f18647f0[i11] = arrayList;
                    viVar.f18649g0[i11] = false;
                    viVar.f18651h0[i11] = true;
                }
                if (i11 == 3) {
                    viVar.n1();
                }
                viVar.getNotificationCenter().k(86, Boolean.valueOf(z10), Integer.valueOf(i11));
                viVar.V0(i11, z10, false, false);
                return;
        }
    }

    public vf(vi viVar, boolean z10, ArrayList arrayList, int i10) {
        this.f18616b = viVar;
        this.f18617c = z10;
        this.d = arrayList;
        this.e = i10;
    }
}
