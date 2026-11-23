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
    public final int f24782a;
    public final boolean f24783b;
    public final Object f24784c;

    public j10(int i7, Object obj, boolean z10) {
        this.f24782a = i7;
        this.f24784c = obj;
        this.f24783b = z10;
    }

    @Override
    public final void run() {
        switch (this.f24782a) {
            case 0:
                k10 k10Var = (k10) this.f24784c;
                boolean z10 = this.f24783b;
                if (k10Var.f24936b) {
                    synchronized (k10Var.f24934a) {
                        try {
                            try {
                                SharedPreferences.Editor edit = k10Var.k().edit();
                                if (k10Var.currentAccount == 0) {
                                    edit.putInt("selectedAccount", k10.f24932t0);
                                }
                                edit.putBoolean("registeredForPush", k10Var.d);
                                edit.putInt("lastSendMessageId", k10Var.f24941e);
                                edit.putInt("contactsSavedCount", k10Var.h);
                                edit.putInt("lastBroadcastId", k10Var.f24943f);
                                edit.putInt("lastContactsSyncTime", k10Var.f24956r);
                                edit.putInt("lastHintsSyncTime", k10Var.f24958s);
                                edit.putBoolean("draftsLoaded", k10Var.f24960w);
                                edit.putBoolean("unreadDialogsLoaded", k10Var.f24961x);
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
                                edit.putLong("autoDownloadConfigLoadTime", k10Var.f24937b0);
                                edit.putBoolean("hasValidDialogLoadIds", k10Var.J);
                                edit.putInt("sharingMyLocationUntil", k10Var.R);
                                edit.putInt("lastMyLocationShareTime", k10Var.S);
                                edit.putBoolean("filtersLoaded", k10Var.Q);
                                edit.putString("premiumGiftsStickerPack", k10Var.f24939c0);
                                edit.putLong("lastUpdatedPremiumGiftsStickerPack", k10Var.f24945g0);
                                edit.putString("genericAnimationsStickerPack", k10Var.f24942e0);
                                edit.putLong("lastUpdatedGenericAnimations", k10Var.f24947i0);
                                edit.putInt("6migrateOffsetId", k10Var.K);
                                if (k10Var.K != -1) {
                                    edit.putInt("6migrateOffsetDate", k10Var.L);
                                    edit.putLong("6migrateOffsetUserId", k10Var.M);
                                    edit.putLong("6migrateOffsetChatId", k10Var.N);
                                    edit.putLong("6migrateOffsetChannelId", k10Var.O);
                                    edit.putLong("6migrateOffsetAccess", k10Var.P);
                                }
                                TLRPC.TL_help_termsOfService tL_help_termsOfService = k10Var.f24935a0;
                                if (tL_help_termsOfService != null) {
                                    try {
                                        SerializedData serializedData = new SerializedData(tL_help_termsOfService.getObjectSize());
                                        k10Var.f24935a0.serializeToStream(serializedData);
                                        edit.putString("terms", Base64.encodeToString(serializedData.toByteArray(), 0));
                                        serializedData.cleanup();
                                    } catch (Exception unused) {
                                    }
                                } else {
                                    edit.remove("terms");
                                }
                                cz.y();
                                if (k10Var.f24962y != null) {
                                    SerializedData serializedData2 = new SerializedData();
                                    k10Var.f24962y.serializeToStream(serializedData2);
                                    edit.putString("tmpPassword", Base64.encodeToString(serializedData2.toByteArray(), 0));
                                    serializedData2.cleanup();
                                } else {
                                    edit.remove("tmpPassword");
                                }
                                if (k10Var.f24938c != null) {
                                    if (z10) {
                                        SerializedData serializedData3 = new SerializedData();
                                        k10Var.f24938c.serializeToStream(serializedData3);
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
                w7 w7Var = (w7) this.f24784c;
                boolean z11 = this.f24783b;
                for (Map.Entry entry : w7Var.h.entrySet()) {
                    y8 y8Var = (y8) entry.getValue();
                    if (y8Var.f27993m == 1) {
                        Utilities.d.c(new j10(2, y8Var, z11));
                        g0.g3(new u8(y8Var, 2));
                    }
                }
                for (Map.Entry entry2 : w7Var.f27662n.entrySet()) {
                    y8 y8Var2 = (y8) entry2.getValue();
                    if (y8Var2.f27993m == 1) {
                        Utilities.d.c(new j10(2, y8Var2, z11));
                        g0.g3(new u8(y8Var2, 2));
                    }
                }
                return;
            case 2:
                y8 y8Var3 = (y8) this.f24784c;
                boolean z12 = this.f24783b;
                SparseIntArray sparseIntArray = y8Var3.f27996p;
                if (y8Var3.f27989i != z12) {
                    y8Var3.f27989i = z12;
                    if (s2.f26694a) {
                        a8.b("network changed to slow = " + y8Var3.f27989i);
                    }
                    int i7 = 0;
                    while (true) {
                        int i10 = 1;
                        if (i7 < sparseIntArray.size()) {
                            ConnectionsManager.getInstance(y8Var3.f27983a).cancelRequest(sparseIntArray.valueAt(i7), true);
                            i7++;
                        } else {
                            sparseIntArray.clear();
                            y8Var3.b();
                            y8Var3.f27984b = false;
                            y8Var3.f27985c = false;
                            y8Var3.f27991k = 0;
                            y8Var3.f27998r = 0;
                            y8Var3.v = 0L;
                            y8Var3.f28002w = 0L;
                            y8Var3.f28003x = 0;
                            y8Var3.f28004y = null;
                            y8Var3.f28005z = null;
                            y8Var3.A = null;
                            y8Var3.K = 0;
                            Arrays.fill(y8Var3.f27988g, 0);
                            y8Var3.N = 0;
                            y8Var3.P = false;
                            y8Var3.Q.clear();
                            y8Var3.d++;
                            if (!y8Var3.f27989i) {
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
                rd rdVar = (rd) this.f24784c;
                boolean z13 = this.f24783b;
                if (!z13) {
                    rdVar.L = Boolean.FALSE;
                }
                if (!rdVar.f26555b.isEmpty()) {
                    if (z13) {
                        try {
                            ((h6.m) t0.j()).getLastLocation(new ld(rdVar, 0));
                            ((h6.m) t0.j()).requestLocationUpdates(rdVar.O, rdVar.f26560r);
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
                np npVar = (np) this.f24784c;
                boolean z14 = this.f24783b;
                npVar.R0 = null;
                npVar.S0.clear();
                npVar.getNotificationCenter().k(184, new Object[0]);
                if (z14) {
                    npVar.getNotificationCenter().k(3, new Object[0]);
                    return;
                }
                return;
            default:
                au auVar = (au) this.f24784c;
                fv fvVar = auVar.f22932a;
                boolean z15 = !this.f24783b;
                TLObject tLObject = auVar.H;
                if (tLObject instanceof TL_iv.PageListItem) {
                    ((TL_iv.PageListItem) tLObject).checked = z15;
                } else if (tLObject instanceof TL_iv.PageListOrderedItem) {
                    ((TL_iv.PageListOrderedItem) tLObject).checked = z15;
                }
                View view = fvVar.Q;
                if (view != null) {
                    auVar.f22938r.f32826a = view;
                }
                auVar.f22938r.f(-1, z15, true);
                View view2 = fvVar.Q;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
        }
    }
}
