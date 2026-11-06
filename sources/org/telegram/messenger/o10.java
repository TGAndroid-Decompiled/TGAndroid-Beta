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
public final class o10 implements Runnable {
    public final int f24267a;
    public final boolean f24268b;
    public final Object f24269c;

    public o10(int i7, Object obj, boolean z9) {
        this.f24267a = i7;
        this.f24269c = obj;
        this.f24268b = z9;
    }

    @Override
    public final void run() {
        switch (this.f24267a) {
            case 0:
                p10 p10Var = (p10) this.f24269c;
                boolean z9 = this.f24268b;
                if (p10Var.f24471b) {
                    synchronized (p10Var.f24469a) {
                        try {
                            try {
                                SharedPreferences.Editor edit = p10Var.k().edit();
                                if (p10Var.currentAccount == 0) {
                                    edit.putInt("selectedAccount", p10.f24467s0);
                                }
                                edit.putBoolean("registeredForPush", p10Var.d);
                                edit.putInt("lastSendMessageId", p10Var.f24476e);
                                edit.putInt("contactsSavedCount", p10Var.h);
                                edit.putInt("lastBroadcastId", p10Var.f24478f);
                                edit.putInt("lastContactsSyncTime", p10Var.f24491r);
                                edit.putInt("lastHintsSyncTime", p10Var.f24493s);
                                edit.putBoolean("draftsLoaded", p10Var.f24494w);
                                edit.putBoolean("unreadDialogsLoaded", p10Var.f24495x);
                                edit.putInt("ratingLoadTime", p10Var.D);
                                edit.putInt("botRatingLoadTime", p10Var.E);
                                edit.putInt("botGuestRatingLoadTime", p10Var.F);
                                edit.putInt("webappRatingLoadTime", p10Var.G);
                                edit.putBoolean("contactsReimported", p10Var.H);
                                edit.putInt("loginTime", p10Var.Y);
                                edit.putBoolean("syncContacts", p10Var.U);
                                edit.putBoolean("showCallsTab", p10Var.W);
                                edit.putBoolean("suggestContacts", p10Var.V);
                                edit.putBoolean("hasSecureData", p10Var.X);
                                edit.putBoolean("notificationsSettingsLoaded4", p10Var.S);
                                edit.putBoolean("notificationsSignUpSettingsLoaded", p10Var.T);
                                edit.putLong("autoDownloadConfigLoadTime", p10Var.f24470a0);
                                edit.putBoolean("hasValidDialogLoadIds", p10Var.I);
                                edit.putInt("sharingMyLocationUntil", p10Var.Q);
                                edit.putInt("lastMyLocationShareTime", p10Var.R);
                                edit.putBoolean("filtersLoaded", p10Var.P);
                                edit.putString("premiumGiftsStickerPack", p10Var.f24472b0);
                                edit.putLong("lastUpdatedPremiumGiftsStickerPack", p10Var.f24479f0);
                                edit.putString("genericAnimationsStickerPack", p10Var.f24475d0);
                                edit.putLong("lastUpdatedGenericAnimations", p10Var.f24481h0);
                                edit.putInt("6migrateOffsetId", p10Var.J);
                                if (p10Var.J != -1) {
                                    edit.putInt("6migrateOffsetDate", p10Var.K);
                                    edit.putLong("6migrateOffsetUserId", p10Var.L);
                                    edit.putLong("6migrateOffsetChatId", p10Var.M);
                                    edit.putLong("6migrateOffsetChannelId", p10Var.N);
                                    edit.putLong("6migrateOffsetAccess", p10Var.O);
                                }
                                TLRPC.TL_help_termsOfService tL_help_termsOfService = p10Var.Z;
                                if (tL_help_termsOfService != null) {
                                    try {
                                        SerializedData serializedData = new SerializedData(tL_help_termsOfService.getObjectSize());
                                        p10Var.Z.serializeToStream(serializedData);
                                        edit.putString("terms", Base64.encodeToString(serializedData.toByteArray(), 0));
                                        serializedData.cleanup();
                                    } catch (Exception unused) {
                                    }
                                } else {
                                    edit.remove("terms");
                                }
                                iz.y();
                                if (p10Var.f24496y != null) {
                                    SerializedData serializedData2 = new SerializedData();
                                    p10Var.f24496y.serializeToStream(serializedData2);
                                    edit.putString("tmpPassword", Base64.encodeToString(serializedData2.toByteArray(), 0));
                                    serializedData2.cleanup();
                                } else {
                                    edit.remove("tmpPassword");
                                }
                                if (p10Var.f24473c != null) {
                                    if (z9) {
                                        SerializedData serializedData3 = new SerializedData();
                                        p10Var.f24473c.serializeToStream(serializedData3);
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
                w7 w7Var = (w7) this.f24269c;
                boolean z10 = this.f24268b;
                for (Map.Entry entry : w7Var.h.entrySet()) {
                    y8 y8Var = (y8) entry.getValue();
                    if (y8Var.f26600m == 1) {
                        Utilities.d.c(new o10(2, y8Var, z10));
                        g0.h3(new u8(y8Var, 2));
                    }
                }
                for (Map.Entry entry2 : w7Var.f26265n.entrySet()) {
                    y8 y8Var2 = (y8) entry2.getValue();
                    if (y8Var2.f26600m == 1) {
                        Utilities.d.c(new o10(2, y8Var2, z10));
                        g0.h3(new u8(y8Var2, 2));
                    }
                }
                return;
            case 2:
                y8 y8Var3 = (y8) this.f24269c;
                boolean z11 = this.f24268b;
                SparseIntArray sparseIntArray = y8Var3.f26603p;
                if (y8Var3.f26596i != z11) {
                    y8Var3.f26596i = z11;
                    if (r2.f25199a) {
                        a8.b("network changed to slow = " + y8Var3.f26596i);
                    }
                    int i7 = 0;
                    while (true) {
                        int i10 = 1;
                        if (i7 < sparseIntArray.size()) {
                            ConnectionsManager.getInstance(y8Var3.f26590a).cancelRequest(sparseIntArray.valueAt(i7), true);
                            i7++;
                        } else {
                            sparseIntArray.clear();
                            y8Var3.b();
                            y8Var3.f26591b = false;
                            y8Var3.f26592c = false;
                            y8Var3.f26598k = 0;
                            y8Var3.f26605r = 0;
                            y8Var3.v = 0L;
                            y8Var3.f26609w = 0L;
                            y8Var3.f26610x = 0;
                            y8Var3.f26611y = null;
                            y8Var3.f26612z = null;
                            y8Var3.A = null;
                            y8Var3.K = 0;
                            Arrays.fill(y8Var3.f26595g, 0);
                            y8Var3.N = 0;
                            y8Var3.P = false;
                            y8Var3.Q.clear();
                            y8Var3.d++;
                            if (!y8Var3.f26596i) {
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
                sd sdVar = (sd) this.f24269c;
                boolean z12 = this.f24268b;
                if (!z12) {
                    sdVar.K = Boolean.FALSE;
                }
                if (!sdVar.f25450b.isEmpty()) {
                    if (z12) {
                        try {
                            ((h6.m) t0.j()).getLastLocation(new ld(sdVar, 0));
                            ((h6.m) t0.j()).requestLocationUpdates(sdVar.N, sdVar.f25455r);
                            return;
                        } catch (Throwable th3) {
                            a8.g(th3, true);
                            return;
                        }
                    }
                    sdVar.p();
                    return;
                }
                return;
            case 4:
                qp qpVar = (qp) this.f24269c;
                boolean z13 = this.f24268b;
                qpVar.Q0 = null;
                qpVar.R0.clear();
                qpVar.getNotificationCenter().k(184, new Object[0]);
                if (z13) {
                    qpVar.getNotificationCenter().k(3, new Object[0]);
                    return;
                }
                return;
            default:
                fu fuVar = (fu) this.f24269c;
                kv kvVar = fuVar.f22450a;
                boolean z14 = !this.f24268b;
                TLObject tLObject = fuVar.G;
                if (tLObject instanceof TL_iv.PageListItem) {
                    ((TL_iv.PageListItem) tLObject).checked = z14;
                } else if (tLObject instanceof TL_iv.PageListOrderedItem) {
                    ((TL_iv.PageListOrderedItem) tLObject).checked = z14;
                }
                View view = kvVar.Q;
                if (view != null) {
                    fuVar.f22456r.f31245a = view;
                }
                fuVar.f22456r.f(-1, z14, true);
                View view2 = kvVar.Q;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
        }
    }
}
