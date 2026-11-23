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
public final class j10 implements Runnable {
    public final int f24818a;
    public final boolean f24819b;
    public final Object f24820c;

    public j10(int i7, Object obj, boolean z10) {
        this.f24818a = i7;
        this.f24820c = obj;
        this.f24819b = z10;
    }

    @Override
    public final void run() {
        switch (this.f24818a) {
            case 0:
                k10 k10Var = (k10) this.f24820c;
                boolean z10 = this.f24819b;
                if (k10Var.f24972b) {
                    synchronized (k10Var.f24970a) {
                        try {
                            try {
                                SharedPreferences.Editor edit = k10Var.k().edit();
                                if (k10Var.currentAccount == 0) {
                                    edit.putInt("selectedAccount", k10.f24968t0);
                                }
                                edit.putBoolean("registeredForPush", k10Var.d);
                                edit.putInt("lastSendMessageId", k10Var.f24977e);
                                edit.putInt("contactsSavedCount", k10Var.h);
                                edit.putInt("lastBroadcastId", k10Var.f24979f);
                                edit.putInt("lastContactsSyncTime", k10Var.f24992r);
                                edit.putInt("lastHintsSyncTime", k10Var.f24994s);
                                edit.putBoolean("draftsLoaded", k10Var.f24996w);
                                edit.putBoolean("unreadDialogsLoaded", k10Var.f24997x);
                                edit.putInt("ratingLoadTime", k10Var.E);
                                edit.putInt("botRatingLoadTime", k10Var.F);
                                edit.putInt("botGuestRatingLoadTime", k10Var.G);
                                edit.putInt("webappRatingLoadTime", k10Var.H);
                                edit.putBoolean("contactsReimported", k10Var.I);
                                edit.putInt("loginTime", k10Var.Z);
                                edit.putBoolean("syncContacts", k10Var.V);
                                edit.putBoolean("showCallsTab", k10Var.X);
                                edit.putBoolean("suggestContacts", k10Var.W);
                                edit.putBoolean("hasSecureData", k10Var.Y);
                                edit.putBoolean("notificationsSettingsLoaded4", k10Var.T);
                                edit.putBoolean("notificationsSignUpSettingsLoaded", k10Var.U);
                                edit.putLong("autoDownloadConfigLoadTime", k10Var.f24973b0);
                                edit.putBoolean("hasValidDialogLoadIds", k10Var.J);
                                edit.putInt("sharingMyLocationUntil", k10Var.R);
                                edit.putInt("lastMyLocationShareTime", k10Var.S);
                                edit.putBoolean("filtersLoaded", k10Var.Q);
                                edit.putString("premiumGiftsStickerPack", k10Var.f24975c0);
                                edit.putLong("lastUpdatedPremiumGiftsStickerPack", k10Var.f24981g0);
                                edit.putString("genericAnimationsStickerPack", k10Var.f24978e0);
                                edit.putLong("lastUpdatedGenericAnimations", k10Var.f24983i0);
                                edit.putInt("6migrateOffsetId", k10Var.K);
                                if (k10Var.K != -1) {
                                    edit.putInt("6migrateOffsetDate", k10Var.L);
                                    edit.putLong("6migrateOffsetUserId", k10Var.M);
                                    edit.putLong("6migrateOffsetChatId", k10Var.N);
                                    edit.putLong("6migrateOffsetChannelId", k10Var.O);
                                    edit.putLong("6migrateOffsetAccess", k10Var.P);
                                }
                                TLRPC.TL_help_termsOfService tL_help_termsOfService = k10Var.f24971a0;
                                if (tL_help_termsOfService != null) {
                                    try {
                                        SerializedData serializedData = new SerializedData(tL_help_termsOfService.getObjectSize());
                                        k10Var.f24971a0.serializeToStream(serializedData);
                                        edit.putString("terms", Base64.encodeToString(serializedData.toByteArray(), 0));
                                        serializedData.cleanup();
                                    } catch (Exception unused) {
                                    }
                                } else {
                                    edit.remove("terms");
                                }
                                cz.y();
                                if (k10Var.f24998y != null) {
                                    SerializedData serializedData2 = new SerializedData();
                                    k10Var.f24998y.serializeToStream(serializedData2);
                                    edit.putString("tmpPassword", Base64.encodeToString(serializedData2.toByteArray(), 0));
                                    serializedData2.cleanup();
                                } else {
                                    edit.remove("tmpPassword");
                                }
                                if (k10Var.f24974c != null) {
                                    if (z10) {
                                        SerializedData serializedData3 = new SerializedData();
                                        k10Var.f24974c.serializeToStream(serializedData3);
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
                w7 w7Var = (w7) this.f24820c;
                boolean z11 = this.f24819b;
                for (Map.Entry entry : w7Var.h.entrySet()) {
                    y8 y8Var = (y8) entry.getValue();
                    if (y8Var.f28029m == 1) {
                        Utilities.d.c(new j10(2, y8Var, z11));
                        g0.g3(new u8(y8Var, 2));
                    }
                }
                for (Map.Entry entry2 : w7Var.f27698n.entrySet()) {
                    y8 y8Var2 = (y8) entry2.getValue();
                    if (y8Var2.f28029m == 1) {
                        Utilities.d.c(new j10(2, y8Var2, z11));
                        g0.g3(new u8(y8Var2, 2));
                    }
                }
                return;
            case 2:
                y8 y8Var3 = (y8) this.f24820c;
                boolean z12 = this.f24819b;
                SparseIntArray sparseIntArray = y8Var3.f28032p;
                if (y8Var3.f28025i != z12) {
                    y8Var3.f28025i = z12;
                    if (s2.f26730a) {
                        a8.b("network changed to slow = " + y8Var3.f28025i);
                    }
                    int i7 = 0;
                    while (true) {
                        int i10 = 1;
                        if (i7 < sparseIntArray.size()) {
                            ConnectionsManager.getInstance(y8Var3.f28019a).cancelRequest(sparseIntArray.valueAt(i7), true);
                            i7++;
                        } else {
                            sparseIntArray.clear();
                            y8Var3.b();
                            y8Var3.f28020b = false;
                            y8Var3.f28021c = false;
                            y8Var3.f28027k = 0;
                            y8Var3.f28034r = 0;
                            y8Var3.v = 0L;
                            y8Var3.f28038w = 0L;
                            y8Var3.f28039x = 0;
                            y8Var3.f28040y = null;
                            y8Var3.f28041z = null;
                            y8Var3.A = null;
                            y8Var3.K = 0;
                            Arrays.fill(y8Var3.f28024g, 0);
                            y8Var3.N = 0;
                            y8Var3.P = false;
                            y8Var3.Q.clear();
                            y8Var3.d++;
                            if (!y8Var3.f28025i) {
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
                rd rdVar = (rd) this.f24820c;
                boolean z13 = this.f24819b;
                if (!z13) {
                    rdVar.L = Boolean.FALSE;
                }
                if (!rdVar.f26591b.isEmpty()) {
                    if (z13) {
                        try {
                            ((h6.m) t0.j()).getLastLocation(new ld(rdVar, 0));
                            ((h6.m) t0.j()).requestLocationUpdates(rdVar.O, rdVar.f26596r);
                            return;
                        } catch (Throwable th3) {
                            a8.g(th3, true);
                            return;
                        }
                    }
                    rdVar.p();
                    return;
                }
                return;
            case 4:
                np npVar = (np) this.f24820c;
                boolean z14 = this.f24819b;
                npVar.R0 = null;
                npVar.S0.clear();
                npVar.getNotificationCenter().k(184, new Object[0]);
                if (z14) {
                    npVar.getNotificationCenter().k(3, new Object[0]);
                    return;
                }
                return;
            default:
                au auVar = (au) this.f24820c;
                fv fvVar = auVar.f22968a;
                boolean z15 = !this.f24819b;
                TLObject tLObject = auVar.H;
                if (tLObject instanceof TL_iv.PageListItem) {
                    ((TL_iv.PageListItem) tLObject).checked = z15;
                } else if (tLObject instanceof TL_iv.PageListOrderedItem) {
                    ((TL_iv.PageListOrderedItem) tLObject).checked = z15;
                }
                View view = fvVar.Q;
                if (view != null) {
                    auVar.f22974r.f32860a = view;
                }
                auVar.f22974r.f(-1, z15, true);
                View view2 = fvVar.Q;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
        }
    }
}
