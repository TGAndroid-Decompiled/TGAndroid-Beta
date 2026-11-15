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
public final class l10 implements Runnable {
    public final int f24794a;
    public final boolean f24795b;
    public final Object f24796c;

    public l10(int i7, Object obj, boolean z10) {
        this.f24794a = i7;
        this.f24796c = obj;
        this.f24795b = z10;
    }

    @Override
    public final void run() {
        switch (this.f24794a) {
            case 0:
                m10 m10Var = (m10) this.f24796c;
                boolean z10 = this.f24795b;
                if (m10Var.f24938b) {
                    synchronized (m10Var.f24936a) {
                        try {
                            try {
                                SharedPreferences.Editor edit = m10Var.k().edit();
                                if (m10Var.currentAccount == 0) {
                                    edit.putInt("selectedAccount", m10.f24934t0);
                                }
                                edit.putBoolean("registeredForPush", m10Var.d);
                                edit.putInt("lastSendMessageId", m10Var.f24943e);
                                edit.putInt("contactsSavedCount", m10Var.h);
                                edit.putInt("lastBroadcastId", m10Var.f24945f);
                                edit.putInt("lastContactsSyncTime", m10Var.f24958r);
                                edit.putInt("lastHintsSyncTime", m10Var.f24960s);
                                edit.putBoolean("draftsLoaded", m10Var.f24962w);
                                edit.putBoolean("unreadDialogsLoaded", m10Var.f24963x);
                                edit.putInt("ratingLoadTime", m10Var.E);
                                edit.putInt("botRatingLoadTime", m10Var.F);
                                edit.putInt("botGuestRatingLoadTime", m10Var.G);
                                edit.putInt("webappRatingLoadTime", m10Var.H);
                                edit.putBoolean("contactsReimported", m10Var.I);
                                edit.putInt("loginTime", m10Var.Z);
                                edit.putBoolean("syncContacts", m10Var.V);
                                edit.putBoolean("showCallsTab", m10Var.X);
                                edit.putBoolean("suggestContacts", m10Var.W);
                                edit.putBoolean("hasSecureData", m10Var.Y);
                                edit.putBoolean("notificationsSettingsLoaded4", m10Var.T);
                                edit.putBoolean("notificationsSignUpSettingsLoaded", m10Var.U);
                                edit.putLong("autoDownloadConfigLoadTime", m10Var.f24939b0);
                                edit.putBoolean("hasValidDialogLoadIds", m10Var.J);
                                edit.putInt("sharingMyLocationUntil", m10Var.R);
                                edit.putInt("lastMyLocationShareTime", m10Var.S);
                                edit.putBoolean("filtersLoaded", m10Var.Q);
                                edit.putString("premiumGiftsStickerPack", m10Var.f24941c0);
                                edit.putLong("lastUpdatedPremiumGiftsStickerPack", m10Var.f24947g0);
                                edit.putString("genericAnimationsStickerPack", m10Var.f24944e0);
                                edit.putLong("lastUpdatedGenericAnimations", m10Var.f24949i0);
                                edit.putInt("6migrateOffsetId", m10Var.K);
                                if (m10Var.K != -1) {
                                    edit.putInt("6migrateOffsetDate", m10Var.L);
                                    edit.putLong("6migrateOffsetUserId", m10Var.M);
                                    edit.putLong("6migrateOffsetChatId", m10Var.N);
                                    edit.putLong("6migrateOffsetChannelId", m10Var.O);
                                    edit.putLong("6migrateOffsetAccess", m10Var.P);
                                }
                                TLRPC.TL_help_termsOfService tL_help_termsOfService = m10Var.f24937a0;
                                if (tL_help_termsOfService != null) {
                                    try {
                                        SerializedData serializedData = new SerializedData(tL_help_termsOfService.getObjectSize());
                                        m10Var.f24937a0.serializeToStream(serializedData);
                                        edit.putString("terms", Base64.encodeToString(serializedData.toByteArray(), 0));
                                        serializedData.cleanup();
                                    } catch (Exception unused) {
                                    }
                                } else {
                                    edit.remove("terms");
                                }
                                gz.y();
                                if (m10Var.f24964y != null) {
                                    SerializedData serializedData2 = new SerializedData();
                                    m10Var.f24964y.serializeToStream(serializedData2);
                                    edit.putString("tmpPassword", Base64.encodeToString(serializedData2.toByteArray(), 0));
                                    serializedData2.cleanup();
                                } else {
                                    edit.remove("tmpPassword");
                                }
                                if (m10Var.f24940c != null) {
                                    if (z10) {
                                        SerializedData serializedData3 = new SerializedData();
                                        m10Var.f24940c.serializeToStream(serializedData3);
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
                w7 w7Var = (w7) this.f24796c;
                boolean z11 = this.f24795b;
                for (Map.Entry entry : w7Var.h.entrySet()) {
                    y8 y8Var = (y8) entry.getValue();
                    if (y8Var.f27678m == 1) {
                        Utilities.d.c(new l10(2, y8Var, z11));
                        g0.h3(new u8(y8Var, 2));
                    }
                }
                for (Map.Entry entry2 : w7Var.f27312n.entrySet()) {
                    y8 y8Var2 = (y8) entry2.getValue();
                    if (y8Var2.f27678m == 1) {
                        Utilities.d.c(new l10(2, y8Var2, z11));
                        g0.h3(new u8(y8Var2, 2));
                    }
                }
                return;
            case 2:
                y8 y8Var3 = (y8) this.f24796c;
                boolean z12 = this.f24795b;
                SparseIntArray sparseIntArray = y8Var3.f27681p;
                if (y8Var3.f27674i != z12) {
                    y8Var3.f27674i = z12;
                    if (r2.f26198a) {
                        a8.b("network changed to slow = " + y8Var3.f27674i);
                    }
                    int i7 = 0;
                    while (true) {
                        int i10 = 1;
                        if (i7 < sparseIntArray.size()) {
                            ConnectionsManager.getInstance(y8Var3.f27668a).cancelRequest(sparseIntArray.valueAt(i7), true);
                            i7++;
                        } else {
                            sparseIntArray.clear();
                            y8Var3.b();
                            y8Var3.f27669b = false;
                            y8Var3.f27670c = false;
                            y8Var3.f27676k = 0;
                            y8Var3.f27683r = 0;
                            y8Var3.v = 0L;
                            y8Var3.f27687w = 0L;
                            y8Var3.f27688x = 0;
                            y8Var3.f27689y = null;
                            y8Var3.f27690z = null;
                            y8Var3.A = null;
                            y8Var3.K = 0;
                            Arrays.fill(y8Var3.f27673g, 0);
                            y8Var3.N = 0;
                            y8Var3.P = false;
                            y8Var3.Q.clear();
                            y8Var3.d++;
                            if (!y8Var3.f27674i) {
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
                rd rdVar = (rd) this.f24796c;
                boolean z13 = this.f24795b;
                if (!z13) {
                    rdVar.L = Boolean.FALSE;
                }
                if (!rdVar.f26270b.isEmpty()) {
                    if (z13) {
                        try {
                            ((h6.m) t0.j()).getLastLocation(new ld(rdVar, 0));
                            ((h6.m) t0.j()).requestLocationUpdates(rdVar.O, rdVar.f26275r);
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
                np npVar = (np) this.f24796c;
                boolean z14 = this.f24795b;
                npVar.R0 = null;
                npVar.S0.clear();
                npVar.getNotificationCenter().k(184, new Object[0]);
                if (z14) {
                    npVar.getNotificationCenter().k(3, new Object[0]);
                    return;
                }
                return;
            default:
                cu cuVar = (cu) this.f24796c;
                iv ivVar = cuVar.f22933a;
                boolean z15 = !this.f24795b;
                TLObject tLObject = cuVar.H;
                if (tLObject instanceof TL_iv.PageListItem) {
                    ((TL_iv.PageListItem) tLObject).checked = z15;
                } else if (tLObject instanceof TL_iv.PageListOrderedItem) {
                    ((TL_iv.PageListOrderedItem) tLObject).checked = z15;
                }
                View view = ivVar.Q;
                if (view != null) {
                    cuVar.f22939r.f32427a = view;
                }
                cuVar.f22939r.f(-1, z15, true);
                View view2 = ivVar.Q;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
        }
    }
}
