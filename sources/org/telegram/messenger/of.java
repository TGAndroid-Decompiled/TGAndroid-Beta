package org.telegram.messenger;

import android.content.SharedPreferences;
import java.util.ArrayList;
public final class of implements Runnable {
    public final int f24531a = 0;
    public final li f24532b;
    public final boolean f24533c;
    public final ArrayList d;
    public final int f24534e;

    public of(li liVar, boolean z10, int i3, ArrayList arrayList) {
        this.f24532b = liVar;
        this.f24533c = z10;
        this.f24534e = i3;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        int i3 = this.f24531a;
        int i10 = this.f24534e;
        ArrayList arrayList = this.d;
        boolean z10 = this.f24533c;
        li liVar = this.f24532b;
        switch (i3) {
            case 0:
                SharedPreferences.Editor edit = hp.s1(liVar.currentAccount).f23009f7.edit();
                if (z10) {
                    liVar.f24033k0 = false;
                    liVar.f24034l0 = true;
                    edit.putLong("lastGifLoadTime", System.currentTimeMillis()).apply();
                } else {
                    liVar.f24027h0[i10] = false;
                    liVar.f24029i0[i10] = true;
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
                        liVar.f24031j0 = arrayList;
                    } else {
                        liVar.f24025g0[i10] = arrayList;
                    }
                    if (i10 == 3) {
                        liVar.n1();
                    }
                    liVar.getNotificationCenter().k(86, Boolean.valueOf(z10), Integer.valueOf(i10));
                    return;
                }
                return;
            default:
                if (z10) {
                    liVar.f24031j0 = arrayList;
                    liVar.f24033k0 = false;
                    liVar.f24034l0 = true;
                } else {
                    liVar.f24025g0[i10] = arrayList;
                    liVar.f24027h0[i10] = false;
                    liVar.f24029i0[i10] = true;
                }
                if (i10 == 3) {
                    liVar.n1();
                }
                liVar.getNotificationCenter().k(86, Boolean.valueOf(z10), Integer.valueOf(i10));
                liVar.V0(i10, z10, false, false);
                return;
        }
    }

    public of(li liVar, boolean z10, ArrayList arrayList, int i3) {
        this.f24532b = liVar;
        this.f24533c = z10;
        this.d = arrayList;
        this.f24534e = i3;
    }
}
