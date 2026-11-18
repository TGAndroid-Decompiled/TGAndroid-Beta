package org.telegram.messenger;

import android.content.SharedPreferences;
import java.util.ArrayList;
public final class vf implements Runnable {
    public final int f27361a = 0;
    public final ri f27362b;
    public final boolean f27363c;
    public final ArrayList d;
    public final int f27364e;

    public vf(ri riVar, boolean z10, int i7, ArrayList arrayList) {
        this.f27362b = riVar;
        this.f27363c = z10;
        this.f27364e = i7;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        int i7 = this.f27361a;
        int i10 = this.f27364e;
        ArrayList arrayList = this.d;
        boolean z10 = this.f27363c;
        ri riVar = this.f27362b;
        switch (i7) {
            case 0:
                SharedPreferences.Editor edit = mp.u1(riVar.currentAccount).i7.edit();
                if (z10) {
                    riVar.f26623k0 = false;
                    riVar.f26625l0 = true;
                    edit.putLong("lastGifLoadTime", System.currentTimeMillis()).apply();
                } else {
                    riVar.f26617h0[i10] = false;
                    riVar.f26619i0[i10] = true;
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
                        riVar.f26621j0 = arrayList;
                    } else {
                        riVar.f26615g0[i10] = arrayList;
                    }
                    if (i10 == 3) {
                        riVar.q1();
                    }
                    riVar.getNotificationCenter().k(86, Boolean.valueOf(z10), Integer.valueOf(i10));
                    return;
                }
                return;
            default:
                if (z10) {
                    riVar.f26621j0 = arrayList;
                    riVar.f26623k0 = false;
                    riVar.f26625l0 = true;
                } else {
                    riVar.f26615g0[i10] = arrayList;
                    riVar.f26617h0[i10] = false;
                    riVar.f26619i0[i10] = true;
                }
                if (i10 == 3) {
                    riVar.q1();
                }
                riVar.getNotificationCenter().k(86, Boolean.valueOf(z10), Integer.valueOf(i10));
                riVar.Y0(i10, z10, false, false);
                return;
        }
    }

    public vf(ri riVar, boolean z10, ArrayList arrayList, int i7) {
        this.f27362b = riVar;
        this.f27363c = z10;
        this.d = arrayList;
        this.f27364e = i7;
    }
}
