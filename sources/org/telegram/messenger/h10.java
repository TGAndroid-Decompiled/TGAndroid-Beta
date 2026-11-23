package org.telegram.messenger;

import android.content.SharedPreferences;
import android.util.Base64;
import android.util.SparseIntArray;
import android.view.View;
import java.util.Arrays;
import java.util.Map;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class h10 implements Runnable {
    public final int f24454a;
    public final boolean f24455b;
    public final Object f24456c;

    public h10(int i7, Object obj, boolean z10) {
        this.f24454a = i7;
        this.f24456c = obj;
        this.f24455b = z10;
    }

    @Override
    public final void run() {
        switch (this.f24454a) {
            case 0:
                i10 i10Var = (i10) this.f24456c;
                boolean z10 = this.f24455b;
                if (i10Var.f24641b) {
                    synchronized (i10Var.f24639a) {
                        try {
                            try {
                                SharedPreferences.Editor edit = i10Var.k().edit();
                                if (i10Var.currentAccount == 0) {
                                    edit.putInt("selectedAccount", i10.f24637t0);
                                }
                                edit.putBoolean("registeredForPush", i10Var.d);
                                edit.putInt("lastSendMessageId", i10Var.f24646e);
                                edit.putInt("contactsSavedCount", i10Var.h);
                                edit.putInt("lastBroadcastId", i10Var.f24648f);
                                edit.putInt("lastContactsSyncTime", i10Var.f24661r);
                                edit.putInt("lastHintsSyncTime", i10Var.f24663s);
                                edit.putBoolean("draftsLoaded", i10Var.f24665w);
                                edit.putBoolean("unreadDialogsLoaded", i10Var.f24666x);
                                edit.putInt("ratingLoadTime", i10Var.E);
                                edit.putInt("botRatingLoadTime", i10Var.F);
                                edit.putInt("botGuestRatingLoadTime", i10Var.G);
                                edit.putInt("webappRatingLoadTime", i10Var.H);
                                edit.putBoolean("contactsReimported", i10Var.I);
                                edit.putInt("loginTime", i10Var.Z);
                                edit.putBoolean("syncContacts", i10Var.V);
                                edit.putBoolean("showCallsTab", i10Var.X);
                                edit.putBoolean("suggestContacts", i10Var.W);
                                edit.putBoolean("hasSecureData", i10Var.Y);
                                edit.putBoolean("notificationsSettingsLoaded4", i10Var.T);
                                edit.putBoolean("notificationsSignUpSettingsLoaded", i10Var.U);
                                edit.putLong("autoDownloadConfigLoadTime", i10Var.f24642b0);
                                edit.putBoolean("hasValidDialogLoadIds", i10Var.J);
                                edit.putInt("sharingMyLocationUntil", i10Var.R);
                                edit.putInt("lastMyLocationShareTime", i10Var.S);
                                edit.putBoolean("filtersLoaded", i10Var.Q);
                                edit.putString("premiumGiftsStickerPack", i10Var.f24644c0);
                                edit.putLong("lastUpdatedPremiumGiftsStickerPack", i10Var.f24650g0);
                                edit.putString("genericAnimationsStickerPack", i10Var.f24647e0);
                                edit.putLong("lastUpdatedGenericAnimations", i10Var.f24652i0);
                                edit.putInt("6migrateOffsetId", i10Var.K);
                                if (i10Var.K != -1) {
                                    edit.putInt("6migrateOffsetDate", i10Var.L);
                                    edit.putLong("6migrateOffsetUserId", i10Var.M);
                                    edit.putLong("6migrateOffsetChatId", i10Var.N);
                                    edit.putLong("6migrateOffsetChannelId", i10Var.O);
                                    edit.putLong("6migrateOffsetAccess", i10Var.P);
                                }
                                TLRPC.TL_help_termsOfService tL_help_termsOfService = i10Var.f24640a0;
                                if (tL_help_termsOfService != null) {
                                    try {
                                        SerializedData serializedData = new SerializedData(tL_help_termsOfService.getObjectSize());
                                        i10Var.f24640a0.serializeToStream(serializedData);
                                        edit.putString("terms", Base64.encodeToString(serializedData.toByteArray(), 0));
                                        serializedData.cleanup();
                                    } catch (Exception unused) {
                                    }
                                } else {
                                    edit.remove("terms");
                                }
                                bz.y();
                                if (i10Var.f24667y != null) {
                                    SerializedData serializedData2 = new SerializedData();
                                    i10Var.f24667y.serializeToStream(serializedData2);
                                    edit.putString("tmpPassword", Base64.encodeToString(serializedData2.toByteArray(), 0));
                                    serializedData2.cleanup();
                                } else {
                                    edit.remove("tmpPassword");
                                }
                                if (i10Var.f24643c != null) {
                                    if (z10) {
                                        SerializedData serializedData3 = new SerializedData();
                                        i10Var.f24643c.serializeToStream(serializedData3);
                                        edit.putString("user", Base64.encodeToString(serializedData3.toByteArray(), 0));
                                        serializedData3.cleanup();
                                    }
                                } else {
                                    edit.remove("user");
                                }
                                edit.apply();
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        } catch (Exception e10) {
                            a8.g(e10, true);
                        }
                    }
                    return;
                }
                return;
            case 1:
                w7 w7Var = (w7) this.f24456c;
                boolean z11 = this.f24455b;
                for (Map.Entry entry : w7Var.h.entrySet()) {
                    x8 x8Var = (x8) entry.getValue();
                    if (x8Var.f27933m == 1) {
                        Utilities.d.c(new h10(2, x8Var, z11));
                        g0.g3(new t8(x8Var, 2));
                    }
                }
                for (Map.Entry entry2 : w7Var.f27747n.entrySet()) {
                    x8 x8Var2 = (x8) entry2.getValue();
                    if (x8Var2.f27933m == 1) {
                        Utilities.d.c(new h10(2, x8Var2, z11));
                        g0.g3(new t8(x8Var2, 2));
                    }
                }
                return;
            case 2:
                x8 x8Var3 = (x8) this.f24456c;
                boolean z12 = this.f24455b;
                SparseIntArray sparseIntArray = x8Var3.f27936p;
                if (x8Var3.f27929i != z12) {
                    x8Var3.f27929i = z12;
                    if (s2.f26829a) {
                        a8.b("network changed to slow = " + x8Var3.f27929i);
                    }
                    int i7 = 0;
                    while (true) {
                        int i10 = 1;
                        if (i7 < sparseIntArray.size()) {
                            ConnectionsManager.getInstance(x8Var3.f27923a).cancelRequest(sparseIntArray.valueAt(i7), true);
                            i7++;
                        } else {
                            sparseIntArray.clear();
                            x8Var3.b();
                            x8Var3.f27924b = false;
                            x8Var3.f27925c = false;
                            x8Var3.f27931k = 0;
                            x8Var3.f27938r = 0;
                            x8Var3.v = 0L;
                            x8Var3.f27942w = 0L;
                            x8Var3.f27943x = 0;
                            x8Var3.f27944y = null;
                            x8Var3.f27945z = null;
                            x8Var3.A = null;
                            x8Var3.K = 0;
                            Arrays.fill(x8Var3.f27928g, 0);
                            x8Var3.N = 0;
                            x8Var3.P = false;
                            x8Var3.Q.clear();
                            x8Var3.d++;
                            if (!x8Var3.f27929i) {
                                i10 = 8;
                            }
                            for (int i11 = 0; i11 < i10; i11++) {
                                x8Var3.d();
                            }
                            return;
                        }
                    }
                } else {
                    return;
                }
            case 3:
                qd qdVar = (qd) this.f24456c;
                boolean z13 = this.f24455b;
                if (!z13) {
                    qdVar.L = Boolean.FALSE;
                }
                if (!qdVar.f26492b.isEmpty()) {
                    if (z13) {
                        try {
                            ((h6.m) t0.j()).getLastLocation(new kd(qdVar, 0));
                            ((h6.m) t0.j()).requestLocationUpdates(qdVar.O, qdVar.f26497r);
                            return;
                        } catch (Throwable th3) {
                            a8.g(th3, true);
                            return;
                        }
                    }
                    qdVar.p();
                    return;
                }
                return;
            case 4:
                mp mpVar = (mp) this.f24456c;
                boolean z14 = this.f24455b;
                mpVar.R0 = null;
                mpVar.S0.clear();
                mpVar.getNotificationCenter().k(184, new Object[0]);
                if (z14) {
                    mpVar.getNotificationCenter().k(3, new Object[0]);
                    return;
                }
                return;
            default:
                zt ztVar = (zt) this.f24456c;
                ev evVar = ztVar.f28441a;
                boolean z15 = !this.f24455b;
                TLObject tLObject = ztVar.H;
                if (tLObject instanceof TL_iv.PageListItem) {
                    ((TL_iv.PageListItem) tLObject).checked = z15;
                } else if (tLObject instanceof TL_iv.PageListOrderedItem) {
                    ((TL_iv.PageListOrderedItem) tLObject).checked = z15;
                }
                View view = evVar.Q;
                if (view != null) {
                    ztVar.f28447r.f32924a = view;
                }
                ztVar.f28447r.f(-1, z15, true);
                View view2 = evVar.Q;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
        }
    }
}
