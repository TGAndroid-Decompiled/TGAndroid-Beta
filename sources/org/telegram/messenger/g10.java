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
public final class g10 implements Runnable {
    public final int f22623a;
    public final boolean f22624b;
    public final Object f22625c;

    public g10(int i3, Object obj, boolean z10) {
        this.f22623a = i3;
        this.f22625c = obj;
        this.f22624b = z10;
    }

    @Override
    public final void run() {
        switch (this.f22623a) {
            case 0:
                h10 h10Var = (h10) this.f22625c;
                boolean z10 = this.f22624b;
                if (h10Var.f22833b) {
                    synchronized (h10Var.f22831a) {
                        try {
                            try {
                                SharedPreferences.Editor edit = h10Var.k().edit();
                                if (h10Var.currentAccount == 0) {
                                    edit.putInt("selectedAccount", h10.f22829t0);
                                }
                                edit.putBoolean("registeredForPush", h10Var.d);
                                edit.putInt("lastSendMessageId", h10Var.f22838e);
                                edit.putInt("contactsSavedCount", h10Var.h);
                                edit.putInt("lastBroadcastId", h10Var.f22840f);
                                edit.putInt("lastContactsSyncTime", h10Var.f22853r);
                                edit.putInt("lastHintsSyncTime", h10Var.f22855s);
                                edit.putBoolean("draftsLoaded", h10Var.f22857w);
                                edit.putBoolean("unreadDialogsLoaded", h10Var.f22858x);
                                edit.putInt("ratingLoadTime", h10Var.E);
                                edit.putInt("botRatingLoadTime", h10Var.F);
                                edit.putInt("botGuestRatingLoadTime", h10Var.G);
                                edit.putInt("webappRatingLoadTime", h10Var.H);
                                edit.putBoolean("contactsReimported", h10Var.I);
                                edit.putInt("loginTime", h10Var.Z);
                                edit.putBoolean("syncContacts", h10Var.V);
                                edit.putBoolean("showCallsTab", h10Var.X);
                                edit.putBoolean("suggestContacts", h10Var.W);
                                edit.putBoolean("hasSecureData", h10Var.Y);
                                edit.putBoolean("notificationsSettingsLoaded4", h10Var.T);
                                edit.putBoolean("notificationsSignUpSettingsLoaded", h10Var.U);
                                edit.putLong("autoDownloadConfigLoadTime", h10Var.f22834b0);
                                edit.putBoolean("hasValidDialogLoadIds", h10Var.J);
                                edit.putInt("sharingMyLocationUntil", h10Var.R);
                                edit.putInt("lastMyLocationShareTime", h10Var.S);
                                edit.putBoolean("filtersLoaded", h10Var.Q);
                                edit.putString("premiumGiftsStickerPack", h10Var.f22836c0);
                                edit.putLong("lastUpdatedPremiumGiftsStickerPack", h10Var.f22842g0);
                                edit.putString("genericAnimationsStickerPack", h10Var.f22839e0);
                                edit.putLong("lastUpdatedGenericAnimations", h10Var.f22844i0);
                                edit.putInt("6migrateOffsetId", h10Var.K);
                                if (h10Var.K != -1) {
                                    edit.putInt("6migrateOffsetDate", h10Var.L);
                                    edit.putLong("6migrateOffsetUserId", h10Var.M);
                                    edit.putLong("6migrateOffsetChatId", h10Var.N);
                                    edit.putLong("6migrateOffsetChannelId", h10Var.O);
                                    edit.putLong("6migrateOffsetAccess", h10Var.P);
                                }
                                TLRPC.TL_help_termsOfService tL_help_termsOfService = h10Var.f22832a0;
                                if (tL_help_termsOfService != null) {
                                    try {
                                        SerializedData serializedData = new SerializedData(tL_help_termsOfService.getObjectSize());
                                        h10Var.f22832a0.serializeToStream(serializedData);
                                        edit.putString("terms", Base64.encodeToString(serializedData.toByteArray(), 0));
                                        serializedData.cleanup();
                                    } catch (Exception unused) {
                                    }
                                } else {
                                    edit.remove("terms");
                                }
                                az.y();
                                if (h10Var.f22859y != null) {
                                    SerializedData serializedData2 = new SerializedData();
                                    h10Var.f22859y.serializeToStream(serializedData2);
                                    edit.putString("tmpPassword", Base64.encodeToString(serializedData2.toByteArray(), 0));
                                    serializedData2.cleanup();
                                } else {
                                    edit.remove("tmpPassword");
                                }
                                if (h10Var.f22835c != null) {
                                    if (z10) {
                                        SerializedData serializedData3 = new SerializedData();
                                        h10Var.f22835c.serializeToStream(serializedData3);
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
                w7 w7Var = (w7) this.f22625c;
                boolean z11 = this.f22624b;
                for (Map.Entry entry : w7Var.h.entrySet()) {
                    y8 y8Var = (y8) entry.getValue();
                    if (y8Var.f26544m == 1) {
                        Utilities.d.c(new g10(2, y8Var, z11));
                        g0.h3(new u8(y8Var, 2));
                    }
                }
                for (Map.Entry entry2 : w7Var.f26171n.entrySet()) {
                    y8 y8Var2 = (y8) entry2.getValue();
                    if (y8Var2.f26544m == 1) {
                        Utilities.d.c(new g10(2, y8Var2, z11));
                        g0.h3(new u8(y8Var2, 2));
                    }
                }
                return;
            case 2:
                y8 y8Var3 = (y8) this.f22625c;
                boolean z12 = this.f22624b;
                SparseIntArray sparseIntArray = y8Var3.f26547p;
                if (y8Var3.f26540i != z12) {
                    y8Var3.f26540i = z12;
                    if (r2.f25040a) {
                        a8.b("network changed to slow = " + y8Var3.f26540i);
                    }
                    int i3 = 0;
                    while (true) {
                        int i10 = 1;
                        if (i3 < sparseIntArray.size()) {
                            ConnectionsManager.getInstance(y8Var3.f26534a).cancelRequest(sparseIntArray.valueAt(i3), true);
                            i3++;
                        } else {
                            sparseIntArray.clear();
                            y8Var3.b();
                            y8Var3.f26535b = false;
                            y8Var3.f26536c = false;
                            y8Var3.f26542k = 0;
                            y8Var3.f26549r = 0;
                            y8Var3.v = 0L;
                            y8Var3.f26553w = 0L;
                            y8Var3.f26554x = 0;
                            y8Var3.f26555y = null;
                            y8Var3.f26556z = null;
                            y8Var3.A = null;
                            y8Var3.K = 0;
                            Arrays.fill(y8Var3.f26539g, 0);
                            y8Var3.N = 0;
                            y8Var3.P = false;
                            y8Var3.Q.clear();
                            y8Var3.d++;
                            if (!y8Var3.f26540i) {
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
                ld ldVar = (ld) this.f22625c;
                boolean z13 = this.f22624b;
                if (!z13) {
                    ldVar.L = Boolean.FALSE;
                }
                if (!ldVar.f23975b.isEmpty()) {
                    if (z13) {
                        try {
                            ((k4.j) t0.j()).getLastLocation(new fd(ldVar, 0));
                            ((k4.j) t0.j()).requestLocationUpdates(ldVar.O, ldVar.f23980r);
                            return;
                        } catch (Throwable th3) {
                            a8.g(th3, true);
                            return;
                        }
                    }
                    ldVar.p();
                    return;
                }
                return;
            case 4:
                hp hpVar = (hp) this.f22625c;
                boolean z14 = this.f22624b;
                hpVar.R0 = null;
                hpVar.S0.clear();
                hpVar.getNotificationCenter().k(184, new Object[0]);
                if (z14) {
                    hpVar.getNotificationCenter().k(3, new Object[0]);
                    return;
                }
                return;
            default:
                xt xtVar = (xt) this.f22625c;
                cv cvVar = xtVar.f26434a;
                boolean z15 = !this.f22624b;
                TLObject tLObject = xtVar.H;
                if (tLObject instanceof TL_iv.PageListItem) {
                    ((TL_iv.PageListItem) tLObject).checked = z15;
                } else if (tLObject instanceof TL_iv.PageListOrderedItem) {
                    ((TL_iv.PageListOrderedItem) tLObject).checked = z15;
                }
                View view = cvVar.Q;
                if (view != null) {
                    xtVar.f26440r.f31320a = view;
                }
                xtVar.f26440r.f(-1, z15, true);
                View view2 = cvVar.Q;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
        }
    }
}
