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
public final class i10 implements Runnable {
    public final int f24539a;
    public final boolean f24540b;
    public final Object f24541c;

    public i10(int i7, Object obj, boolean z10) {
        this.f24539a = i7;
        this.f24541c = obj;
        this.f24540b = z10;
    }

    @Override
    public final void run() {
        switch (this.f24539a) {
            case 0:
                j10 j10Var = (j10) this.f24541c;
                boolean z10 = this.f24540b;
                if (j10Var.f24774b) {
                    synchronized (j10Var.f24772a) {
                        try {
                            try {
                                SharedPreferences.Editor edit = j10Var.k().edit();
                                if (j10Var.currentAccount == 0) {
                                    edit.putInt("selectedAccount", j10.f24770t0);
                                }
                                edit.putBoolean("registeredForPush", j10Var.d);
                                edit.putInt("lastSendMessageId", j10Var.f24779e);
                                edit.putInt("contactsSavedCount", j10Var.h);
                                edit.putInt("lastBroadcastId", j10Var.f24781f);
                                edit.putInt("lastContactsSyncTime", j10Var.f24794r);
                                edit.putInt("lastHintsSyncTime", j10Var.f24796s);
                                edit.putBoolean("draftsLoaded", j10Var.f24798w);
                                edit.putBoolean("unreadDialogsLoaded", j10Var.f24799x);
                                edit.putInt("ratingLoadTime", j10Var.E);
                                edit.putInt("botRatingLoadTime", j10Var.F);
                                edit.putInt("botGuestRatingLoadTime", j10Var.G);
                                edit.putInt("webappRatingLoadTime", j10Var.H);
                                edit.putBoolean("contactsReimported", j10Var.I);
                                edit.putInt("loginTime", j10Var.Z);
                                edit.putBoolean("syncContacts", j10Var.V);
                                edit.putBoolean("showCallsTab", j10Var.X);
                                edit.putBoolean("suggestContacts", j10Var.W);
                                edit.putBoolean("hasSecureData", j10Var.Y);
                                edit.putBoolean("notificationsSettingsLoaded4", j10Var.T);
                                edit.putBoolean("notificationsSignUpSettingsLoaded", j10Var.U);
                                edit.putLong("autoDownloadConfigLoadTime", j10Var.f24775b0);
                                edit.putBoolean("hasValidDialogLoadIds", j10Var.J);
                                edit.putInt("sharingMyLocationUntil", j10Var.R);
                                edit.putInt("lastMyLocationShareTime", j10Var.S);
                                edit.putBoolean("filtersLoaded", j10Var.Q);
                                edit.putString("premiumGiftsStickerPack", j10Var.f24777c0);
                                edit.putLong("lastUpdatedPremiumGiftsStickerPack", j10Var.f24783g0);
                                edit.putString("genericAnimationsStickerPack", j10Var.f24780e0);
                                edit.putLong("lastUpdatedGenericAnimations", j10Var.f24785i0);
                                edit.putInt("6migrateOffsetId", j10Var.K);
                                if (j10Var.K != -1) {
                                    edit.putInt("6migrateOffsetDate", j10Var.L);
                                    edit.putLong("6migrateOffsetUserId", j10Var.M);
                                    edit.putLong("6migrateOffsetChatId", j10Var.N);
                                    edit.putLong("6migrateOffsetChannelId", j10Var.O);
                                    edit.putLong("6migrateOffsetAccess", j10Var.P);
                                }
                                TLRPC.TL_help_termsOfService tL_help_termsOfService = j10Var.f24773a0;
                                if (tL_help_termsOfService != null) {
                                    try {
                                        SerializedData serializedData = new SerializedData(tL_help_termsOfService.getObjectSize());
                                        j10Var.f24773a0.serializeToStream(serializedData);
                                        edit.putString("terms", Base64.encodeToString(serializedData.toByteArray(), 0));
                                        serializedData.cleanup();
                                    } catch (Exception unused) {
                                    }
                                } else {
                                    edit.remove("terms");
                                }
                                bz.y();
                                if (j10Var.f24800y != null) {
                                    SerializedData serializedData2 = new SerializedData();
                                    j10Var.f24800y.serializeToStream(serializedData2);
                                    edit.putString("tmpPassword", Base64.encodeToString(serializedData2.toByteArray(), 0));
                                    serializedData2.cleanup();
                                } else {
                                    edit.remove("tmpPassword");
                                }
                                if (j10Var.f24776c != null) {
                                    if (z10) {
                                        SerializedData serializedData3 = new SerializedData();
                                        j10Var.f24776c.serializeToStream(serializedData3);
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
                w7 w7Var = (w7) this.f24541c;
                boolean z11 = this.f24540b;
                for (Map.Entry entry : w7Var.h.entrySet()) {
                    y8 y8Var = (y8) entry.getValue();
                    if (y8Var.f28094m == 1) {
                        Utilities.d.c(new i10(2, y8Var, z11));
                        g0.g3(new u8(y8Var, 2));
                    }
                }
                for (Map.Entry entry2 : w7Var.f27652n.entrySet()) {
                    y8 y8Var2 = (y8) entry2.getValue();
                    if (y8Var2.f28094m == 1) {
                        Utilities.d.c(new i10(2, y8Var2, z11));
                        g0.g3(new u8(y8Var2, 2));
                    }
                }
                return;
            case 2:
                y8 y8Var3 = (y8) this.f24541c;
                boolean z12 = this.f24540b;
                SparseIntArray sparseIntArray = y8Var3.f28097p;
                if (y8Var3.f28090i != z12) {
                    y8Var3.f28090i = z12;
                    if (s2.f26721a) {
                        a8.b("network changed to slow = " + y8Var3.f28090i);
                    }
                    int i7 = 0;
                    while (true) {
                        int i10 = 1;
                        if (i7 < sparseIntArray.size()) {
                            ConnectionsManager.getInstance(y8Var3.f28084a).cancelRequest(sparseIntArray.valueAt(i7), true);
                            i7++;
                        } else {
                            sparseIntArray.clear();
                            y8Var3.b();
                            y8Var3.f28085b = false;
                            y8Var3.f28086c = false;
                            y8Var3.f28092k = 0;
                            y8Var3.f28099r = 0;
                            y8Var3.v = 0L;
                            y8Var3.f28103w = 0L;
                            y8Var3.f28104x = 0;
                            y8Var3.f28105y = null;
                            y8Var3.f28106z = null;
                            y8Var3.A = null;
                            y8Var3.K = 0;
                            Arrays.fill(y8Var3.f28089g, 0);
                            y8Var3.N = 0;
                            y8Var3.P = false;
                            y8Var3.Q.clear();
                            y8Var3.d++;
                            if (!y8Var3.f28090i) {
                                i10 = 8;
                            }
                            for (int i11 = 0; i11 < i10; i11++) {
                                y8Var3.d();
                            }
                            return;
                        }
                    }
                } else {
                    return;
                }
            case 3:
                qd qdVar = (qd) this.f24541c;
                boolean z13 = this.f24540b;
                if (!z13) {
                    qdVar.L = Boolean.FALSE;
                }
                if (!qdVar.f26380b.isEmpty()) {
                    if (z13) {
                        try {
                            ((h6.m) t0.j()).getLastLocation(new kd(qdVar, 0));
                            ((h6.m) t0.j()).requestLocationUpdates(qdVar.O, qdVar.f26385r);
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
                mp mpVar = (mp) this.f24541c;
                boolean z14 = this.f24540b;
                mpVar.R0 = null;
                mpVar.S0.clear();
                mpVar.getNotificationCenter().k(184, new Object[0]);
                if (z14) {
                    mpVar.getNotificationCenter().k(3, new Object[0]);
                    return;
                }
                return;
            default:
                zt ztVar = (zt) this.f24541c;
                ev evVar = ztVar.f28349a;
                boolean z15 = !this.f24540b;
                TLObject tLObject = ztVar.H;
                if (tLObject instanceof TL_iv.PageListItem) {
                    ((TL_iv.PageListItem) tLObject).checked = z15;
                } else if (tLObject instanceof TL_iv.PageListOrderedItem) {
                    ((TL_iv.PageListOrderedItem) tLObject).checked = z15;
                }
                View view = evVar.Q;
                if (view != null) {
                    ztVar.f28355r.f32824a = view;
                }
                ztVar.f28355r.f(-1, z15, true);
                View view2 = evVar.Q;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
        }
    }
}
