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
public final class d20 implements Runnable {
    public final int f15288a;
    public final boolean f15289b;
    public final Object f15290c;

    public d20(int i10, Object obj, boolean z10) {
        this.f15288a = i10;
        this.f15290c = obj;
        this.f15289b = z10;
    }

    @Override
    public final void run() {
        switch (this.f15288a) {
            case 0:
                e20 e20Var = (e20) this.f15290c;
                boolean z10 = this.f15289b;
                if (e20Var.f15510b) {
                    synchronized (e20Var.f15508a) {
                        try {
                            try {
                                SharedPreferences.Editor edit = e20Var.k().edit();
                                if (e20Var.currentAccount == 0) {
                                    edit.putInt("selectedAccount", e20.f15506s0);
                                }
                                edit.putBoolean("registeredForPush", e20Var.d);
                                edit.putInt("lastSendMessageId", e20Var.e);
                                edit.putInt("contactsSavedCount", e20Var.h);
                                edit.putInt("lastBroadcastId", e20Var.f15516f);
                                edit.putInt("lastContactsSyncTime", e20Var.f15529r);
                                edit.putInt("lastHintsSyncTime", e20Var.f15531s);
                                edit.putBoolean("draftsLoaded", e20Var.f15532w);
                                edit.putBoolean("unreadDialogsLoaded", e20Var.f15533x);
                                edit.putInt("ratingLoadTime", e20Var.D);
                                edit.putInt("botRatingLoadTime", e20Var.E);
                                edit.putInt("botGuestRatingLoadTime", e20Var.F);
                                edit.putInt("webappRatingLoadTime", e20Var.G);
                                edit.putBoolean("contactsReimported", e20Var.H);
                                edit.putInt("loginTime", e20Var.Y);
                                edit.putBoolean("syncContacts", e20Var.U);
                                edit.putBoolean("showCallsTab", e20Var.W);
                                edit.putBoolean("suggestContacts", e20Var.V);
                                edit.putBoolean("hasSecureData", e20Var.X);
                                edit.putBoolean("notificationsSettingsLoaded4", e20Var.S);
                                edit.putBoolean("notificationsSignUpSettingsLoaded", e20Var.T);
                                edit.putLong("autoDownloadConfigLoadTime", e20Var.f15509a0);
                                edit.putBoolean("hasValidDialogLoadIds", e20Var.I);
                                edit.putInt("sharingMyLocationUntil", e20Var.Q);
                                edit.putInt("lastMyLocationShareTime", e20Var.R);
                                edit.putBoolean("filtersLoaded", e20Var.P);
                                edit.putString("premiumGiftsStickerPack", e20Var.f15511b0);
                                edit.putLong("lastUpdatedPremiumGiftsStickerPack", e20Var.f15517f0);
                                edit.putString("genericAnimationsStickerPack", e20Var.f15514d0);
                                edit.putLong("lastUpdatedGenericAnimations", e20Var.f15519h0);
                                edit.putInt("6migrateOffsetId", e20Var.J);
                                if (e20Var.J != -1) {
                                    edit.putInt("6migrateOffsetDate", e20Var.K);
                                    edit.putLong("6migrateOffsetUserId", e20Var.L);
                                    edit.putLong("6migrateOffsetChatId", e20Var.M);
                                    edit.putLong("6migrateOffsetChannelId", e20Var.N);
                                    edit.putLong("6migrateOffsetAccess", e20Var.O);
                                }
                                TLRPC.TL_help_termsOfService tL_help_termsOfService = e20Var.Z;
                                if (tL_help_termsOfService != null) {
                                    try {
                                        SerializedData serializedData = new SerializedData(tL_help_termsOfService.getObjectSize());
                                        e20Var.Z.serializeToStream(serializedData);
                                        edit.putString("terms", Base64.encodeToString(serializedData.toByteArray(), 0));
                                        serializedData.cleanup();
                                    } catch (Exception unused) {
                                    }
                                } else {
                                    edit.remove("terms");
                                }
                                uz.y();
                                if (e20Var.f15534y != null) {
                                    SerializedData serializedData2 = new SerializedData();
                                    e20Var.f15534y.serializeToStream(serializedData2);
                                    edit.putString("tmpPassword", Base64.encodeToString(serializedData2.toByteArray(), 0));
                                    serializedData2.cleanup();
                                } else {
                                    edit.remove("tmpPassword");
                                }
                                if (e20Var.f15512c != null) {
                                    if (z10) {
                                        SerializedData serializedData3 = new SerializedData();
                                        e20Var.f15512c.serializeToStream(serializedData3);
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
                        } catch (Exception e) {
                            f8.g(e, true);
                        }
                    }
                    return;
                }
                return;
            case 1:
                b8 b8Var = (b8) this.f15290c;
                boolean z11 = this.f15289b;
                for (Map.Entry entry : b8Var.h.entrySet()) {
                    d9 d9Var = (d9) entry.getValue();
                    if (d9Var.f15319m == 1) {
                        Utilities.d.c(new d20(2, d9Var, z11));
                        i0.g3(new z8(d9Var, 2));
                    }
                }
                for (Map.Entry entry2 : b8Var.f14943n.entrySet()) {
                    d9 d9Var2 = (d9) entry2.getValue();
                    if (d9Var2.f15319m == 1) {
                        Utilities.d.c(new d20(2, d9Var2, z11));
                        i0.g3(new z8(d9Var2, 2));
                    }
                }
                return;
            case 2:
                d9 d9Var3 = (d9) this.f15290c;
                boolean z12 = this.f15289b;
                SparseIntArray sparseIntArray = d9Var3.f15322p;
                if (d9Var3.f15315i != z12) {
                    d9Var3.f15315i = z12;
                    if (v2.f18578a) {
                        f8.b("network changed to slow = " + d9Var3.f15315i);
                    }
                    int i10 = 0;
                    while (true) {
                        int i11 = 1;
                        if (i10 < sparseIntArray.size()) {
                            ConnectionsManager.getInstance(d9Var3.f15310a).cancelRequest(sparseIntArray.valueAt(i10), true);
                            i10++;
                        } else {
                            sparseIntArray.clear();
                            d9Var3.b();
                            d9Var3.f15311b = false;
                            d9Var3.f15312c = false;
                            d9Var3.f15317k = 0;
                            d9Var3.f15324r = 0;
                            d9Var3.v = 0L;
                            d9Var3.f15328w = 0L;
                            d9Var3.f15329x = 0;
                            d9Var3.f15330y = null;
                            d9Var3.f15331z = null;
                            d9Var3.A = null;
                            d9Var3.K = 0;
                            Arrays.fill(d9Var3.f15314g, 0);
                            d9Var3.N = 0;
                            d9Var3.P = false;
                            d9Var3.Q.clear();
                            d9Var3.d++;
                            if (!d9Var3.f15315i) {
                                i11 = 8;
                            }
                            for (int i12 = 0; i12 < i11; i12++) {
                                d9Var3.d();
                            }
                            return;
                        }
                    }
                } else {
                    return;
                }
            case 3:
                od odVar = (od) this.f15290c;
                boolean z13 = this.f15289b;
                if (!z13) {
                    odVar.K = Boolean.FALSE;
                }
                if (!odVar.f17420b.isEmpty()) {
                    if (z13) {
                        try {
                            ((li.k) w0.j()).getLastLocation(new id(odVar, 0));
                            ((li.k) w0.j()).requestLocationUpdates(odVar.N, odVar.f17424r);
                            return;
                        } catch (Throwable th3) {
                            f8.g(th3, true);
                            return;
                        }
                    }
                    odVar.p();
                    return;
                }
                return;
            case 4:
                wp wpVar = (wp) this.f15290c;
                boolean z14 = this.f15289b;
                wpVar.Q0 = null;
                wpVar.R0.clear();
                wpVar.getNotificationCenter().k(184, new Object[0]);
                if (z14) {
                    wpVar.getNotificationCenter().k(3, new Object[0]);
                    return;
                }
                return;
            default:
                ru ruVar = (ru) this.f15290c;
                wv wvVar = ruVar.f17967a;
                boolean z15 = !this.f15289b;
                TLObject tLObject = ruVar.G;
                if (tLObject instanceof TL_iv.PageListItem) {
                    ((TL_iv.PageListItem) tLObject).checked = z15;
                } else if (tLObject instanceof TL_iv.PageListOrderedItem) {
                    ((TL_iv.PageListOrderedItem) tLObject).checked = z15;
                }
                View view = wvVar.Q;
                if (view != null) {
                    ruVar.f17972r.f23907a = view;
                }
                ruVar.f17972r.f(-1, z15, true);
                View view2 = wvVar.Q;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
        }
    }
}
