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
    public final int f24800a;
    public final boolean f24801b;
    public final Object f24802c;

    public l10(int i7, Object obj, boolean z10) {
        this.f24800a = i7;
        this.f24802c = obj;
        this.f24801b = z10;
    }

    @Override
    public final void run() {
        switch (this.f24800a) {
            case 0:
                m10 m10Var = (m10) this.f24802c;
                boolean z10 = this.f24801b;
                if (m10Var.f24944b) {
                    synchronized (m10Var.f24942a) {
                        try {
                            try {
                                SharedPreferences.Editor edit = m10Var.k().edit();
                                if (m10Var.currentAccount == 0) {
                                    edit.putInt("selectedAccount", m10.f24940t0);
                                }
                                edit.putBoolean("registeredForPush", m10Var.d);
                                edit.putInt("lastSendMessageId", m10Var.f24949e);
                                edit.putInt("contactsSavedCount", m10Var.h);
                                edit.putInt("lastBroadcastId", m10Var.f24951f);
                                edit.putInt("lastContactsSyncTime", m10Var.f24964r);
                                edit.putInt("lastHintsSyncTime", m10Var.f24966s);
                                edit.putBoolean("draftsLoaded", m10Var.f24968w);
                                edit.putBoolean("unreadDialogsLoaded", m10Var.f24969x);
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
                                edit.putLong("autoDownloadConfigLoadTime", m10Var.f24945b0);
                                edit.putBoolean("hasValidDialogLoadIds", m10Var.J);
                                edit.putInt("sharingMyLocationUntil", m10Var.R);
                                edit.putInt("lastMyLocationShareTime", m10Var.S);
                                edit.putBoolean("filtersLoaded", m10Var.Q);
                                edit.putString("premiumGiftsStickerPack", m10Var.f24947c0);
                                edit.putLong("lastUpdatedPremiumGiftsStickerPack", m10Var.f24953g0);
                                edit.putString("genericAnimationsStickerPack", m10Var.f24950e0);
                                edit.putLong("lastUpdatedGenericAnimations", m10Var.f24955i0);
                                edit.putInt("6migrateOffsetId", m10Var.K);
                                if (m10Var.K != -1) {
                                    edit.putInt("6migrateOffsetDate", m10Var.L);
                                    edit.putLong("6migrateOffsetUserId", m10Var.M);
                                    edit.putLong("6migrateOffsetChatId", m10Var.N);
                                    edit.putLong("6migrateOffsetChannelId", m10Var.O);
                                    edit.putLong("6migrateOffsetAccess", m10Var.P);
                                }
                                TLRPC.TL_help_termsOfService tL_help_termsOfService = m10Var.f24943a0;
                                if (tL_help_termsOfService != null) {
                                    try {
                                        SerializedData serializedData = new SerializedData(tL_help_termsOfService.getObjectSize());
                                        m10Var.f24943a0.serializeToStream(serializedData);
                                        edit.putString("terms", Base64.encodeToString(serializedData.toByteArray(), 0));
                                        serializedData.cleanup();
                                    } catch (Exception unused) {
                                    }
                                } else {
                                    edit.remove("terms");
                                }
                                gz.y();
                                if (m10Var.f24970y != null) {
                                    SerializedData serializedData2 = new SerializedData();
                                    m10Var.f24970y.serializeToStream(serializedData2);
                                    edit.putString("tmpPassword", Base64.encodeToString(serializedData2.toByteArray(), 0));
                                    serializedData2.cleanup();
                                } else {
                                    edit.remove("tmpPassword");
                                }
                                if (m10Var.f24946c != null) {
                                    if (z10) {
                                        SerializedData serializedData3 = new SerializedData();
                                        m10Var.f24946c.serializeToStream(serializedData3);
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
                w7 w7Var = (w7) this.f24802c;
                boolean z11 = this.f24801b;
                for (Map.Entry entry : w7Var.h.entrySet()) {
                    y8 y8Var = (y8) entry.getValue();
                    if (y8Var.f27680m == 1) {
                        Utilities.d.c(new l10(2, y8Var, z11));
                        g0.h3(new u8(y8Var, 2));
                    }
                }
                for (Map.Entry entry2 : w7Var.f27311n.entrySet()) {
                    y8 y8Var2 = (y8) entry2.getValue();
                    if (y8Var2.f27680m == 1) {
                        Utilities.d.c(new l10(2, y8Var2, z11));
                        g0.h3(new u8(y8Var2, 2));
                    }
                }
                return;
            case 2:
                y8 y8Var3 = (y8) this.f24802c;
                boolean z12 = this.f24801b;
                SparseIntArray sparseIntArray = y8Var3.f27683p;
                if (y8Var3.f27676i != z12) {
                    y8Var3.f27676i = z12;
                    if (r2.f26206a) {
                        a8.b("network changed to slow = " + y8Var3.f27676i);
                    }
                    int i7 = 0;
                    while (true) {
                        int i10 = 1;
                        if (i7 < sparseIntArray.size()) {
                            ConnectionsManager.getInstance(y8Var3.f27670a).cancelRequest(sparseIntArray.valueAt(i7), true);
                            i7++;
                        } else {
                            sparseIntArray.clear();
                            y8Var3.b();
                            y8Var3.f27671b = false;
                            y8Var3.f27672c = false;
                            y8Var3.f27678k = 0;
                            y8Var3.f27685r = 0;
                            y8Var3.v = 0L;
                            y8Var3.f27689w = 0L;
                            y8Var3.f27690x = 0;
                            y8Var3.f27691y = null;
                            y8Var3.f27692z = null;
                            y8Var3.A = null;
                            y8Var3.K = 0;
                            Arrays.fill(y8Var3.f27675g, 0);
                            y8Var3.N = 0;
                            y8Var3.P = false;
                            y8Var3.Q.clear();
                            y8Var3.d++;
                            if (!y8Var3.f27676i) {
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
                rd rdVar = (rd) this.f24802c;
                boolean z13 = this.f24801b;
                if (!z13) {
                    rdVar.L = Boolean.FALSE;
                }
                if (!rdVar.f26278b.isEmpty()) {
                    if (z13) {
                        try {
                            ((h6.m) t0.j()).getLastLocation(new ld(rdVar, 0));
                            ((h6.m) t0.j()).requestLocationUpdates(rdVar.O, rdVar.f26283r);
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
                np npVar = (np) this.f24802c;
                boolean z14 = this.f24801b;
                npVar.R0 = null;
                npVar.S0.clear();
                npVar.getNotificationCenter().k(184, new Object[0]);
                if (z14) {
                    npVar.getNotificationCenter().k(3, new Object[0]);
                    return;
                }
                return;
            default:
                cu cuVar = (cu) this.f24802c;
                iv ivVar = cuVar.f22941a;
                boolean z15 = !this.f24801b;
                TLObject tLObject = cuVar.H;
                if (tLObject instanceof TL_iv.PageListItem) {
                    ((TL_iv.PageListItem) tLObject).checked = z15;
                } else if (tLObject instanceof TL_iv.PageListOrderedItem) {
                    ((TL_iv.PageListOrderedItem) tLObject).checked = z15;
                }
                View view = ivVar.Q;
                if (view != null) {
                    cuVar.f22947r.f32427a = view;
                }
                cuVar.f22947r.f(-1, z15, true);
                View view2 = ivVar.Q;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
        }
    }
}
