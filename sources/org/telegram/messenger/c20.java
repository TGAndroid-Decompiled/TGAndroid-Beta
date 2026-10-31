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
public final class c20 implements Runnable {
    public final int f14896a;
    public final boolean f14897b;
    public final Object f14898c;

    public c20(int i10, Object obj, boolean z10) {
        this.f14896a = i10;
        this.f14898c = obj;
        this.f14897b = z10;
    }

    @Override
    public final void run() {
        switch (this.f14896a) {
            case 0:
                d20 d20Var = (d20) this.f14898c;
                boolean z10 = this.f14897b;
                if (d20Var.f15151b) {
                    synchronized (d20Var.f15149a) {
                        try {
                            try {
                                SharedPreferences.Editor edit = d20Var.k().edit();
                                if (d20Var.currentAccount == 0) {
                                    edit.putInt("selectedAccount", d20.f15147s0);
                                }
                                edit.putBoolean("registeredForPush", d20Var.d);
                                edit.putInt("lastSendMessageId", d20Var.e);
                                edit.putInt("contactsSavedCount", d20Var.h);
                                edit.putInt("lastBroadcastId", d20Var.f15157f);
                                edit.putInt("lastContactsSyncTime", d20Var.f15170r);
                                edit.putInt("lastHintsSyncTime", d20Var.f15172s);
                                edit.putBoolean("draftsLoaded", d20Var.f15173w);
                                edit.putBoolean("unreadDialogsLoaded", d20Var.f15174x);
                                edit.putInt("ratingLoadTime", d20Var.D);
                                edit.putInt("botRatingLoadTime", d20Var.E);
                                edit.putInt("botGuestRatingLoadTime", d20Var.F);
                                edit.putInt("webappRatingLoadTime", d20Var.G);
                                edit.putBoolean("contactsReimported", d20Var.H);
                                edit.putInt("loginTime", d20Var.Y);
                                edit.putBoolean("syncContacts", d20Var.U);
                                edit.putBoolean("showCallsTab", d20Var.W);
                                edit.putBoolean("suggestContacts", d20Var.V);
                                edit.putBoolean("hasSecureData", d20Var.X);
                                edit.putBoolean("notificationsSettingsLoaded4", d20Var.S);
                                edit.putBoolean("notificationsSignUpSettingsLoaded", d20Var.T);
                                edit.putLong("autoDownloadConfigLoadTime", d20Var.f15150a0);
                                edit.putBoolean("hasValidDialogLoadIds", d20Var.I);
                                edit.putInt("sharingMyLocationUntil", d20Var.Q);
                                edit.putInt("lastMyLocationShareTime", d20Var.R);
                                edit.putBoolean("filtersLoaded", d20Var.P);
                                edit.putString("premiumGiftsStickerPack", d20Var.f15152b0);
                                edit.putLong("lastUpdatedPremiumGiftsStickerPack", d20Var.f15158f0);
                                edit.putString("genericAnimationsStickerPack", d20Var.f15155d0);
                                edit.putLong("lastUpdatedGenericAnimations", d20Var.f15160h0);
                                edit.putInt("6migrateOffsetId", d20Var.J);
                                if (d20Var.J != -1) {
                                    edit.putInt("6migrateOffsetDate", d20Var.K);
                                    edit.putLong("6migrateOffsetUserId", d20Var.L);
                                    edit.putLong("6migrateOffsetChatId", d20Var.M);
                                    edit.putLong("6migrateOffsetChannelId", d20Var.N);
                                    edit.putLong("6migrateOffsetAccess", d20Var.O);
                                }
                                TLRPC.TL_help_termsOfService tL_help_termsOfService = d20Var.Z;
                                if (tL_help_termsOfService != null) {
                                    try {
                                        SerializedData serializedData = new SerializedData(tL_help_termsOfService.getObjectSize());
                                        d20Var.Z.serializeToStream(serializedData);
                                        edit.putString("terms", Base64.encodeToString(serializedData.toByteArray(), 0));
                                        serializedData.cleanup();
                                    } catch (Exception unused) {
                                    }
                                } else {
                                    edit.remove("terms");
                                }
                                tz.y();
                                if (d20Var.f15175y != null) {
                                    SerializedData serializedData2 = new SerializedData();
                                    d20Var.f15175y.serializeToStream(serializedData2);
                                    edit.putString("tmpPassword", Base64.encodeToString(serializedData2.toByteArray(), 0));
                                    serializedData2.cleanup();
                                } else {
                                    edit.remove("tmpPassword");
                                }
                                if (d20Var.f15153c != null) {
                                    if (z10) {
                                        SerializedData serializedData3 = new SerializedData();
                                        d20Var.f15153c.serializeToStream(serializedData3);
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
                b8 b8Var = (b8) this.f14898c;
                boolean z11 = this.f14897b;
                for (Map.Entry entry : b8Var.h.entrySet()) {
                    d9 d9Var = (d9) entry.getValue();
                    if (d9Var.f15204m == 1) {
                        Utilities.d.c(new c20(2, d9Var, z11));
                        i0.g3(new z8(d9Var, 2));
                    }
                }
                for (Map.Entry entry2 : b8Var.f14743n.entrySet()) {
                    d9 d9Var2 = (d9) entry2.getValue();
                    if (d9Var2.f15204m == 1) {
                        Utilities.d.c(new c20(2, d9Var2, z11));
                        i0.g3(new z8(d9Var2, 2));
                    }
                }
                return;
            case 2:
                d9 d9Var3 = (d9) this.f14898c;
                boolean z12 = this.f14897b;
                SparseIntArray sparseIntArray = d9Var3.f15207p;
                if (d9Var3.f15200i != z12) {
                    d9Var3.f15200i = z12;
                    if (v2.f18448a) {
                        f8.b("network changed to slow = " + d9Var3.f15200i);
                    }
                    int i10 = 0;
                    while (true) {
                        int i11 = 1;
                        if (i10 < sparseIntArray.size()) {
                            ConnectionsManager.getInstance(d9Var3.f15195a).cancelRequest(sparseIntArray.valueAt(i10), true);
                            i10++;
                        } else {
                            sparseIntArray.clear();
                            d9Var3.b();
                            d9Var3.f15196b = false;
                            d9Var3.f15197c = false;
                            d9Var3.f15202k = 0;
                            d9Var3.f15209r = 0;
                            d9Var3.v = 0L;
                            d9Var3.f15213w = 0L;
                            d9Var3.f15214x = 0;
                            d9Var3.f15215y = null;
                            d9Var3.f15216z = null;
                            d9Var3.A = null;
                            d9Var3.K = 0;
                            Arrays.fill(d9Var3.f15199g, 0);
                            d9Var3.N = 0;
                            d9Var3.P = false;
                            d9Var3.Q.clear();
                            d9Var3.d++;
                            if (!d9Var3.f15200i) {
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
                nd ndVar = (nd) this.f14898c;
                boolean z13 = this.f14897b;
                if (!z13) {
                    ndVar.K = Boolean.FALSE;
                }
                if (!ndVar.f17083b.isEmpty()) {
                    if (z13) {
                        try {
                            ((li.k) w0.j()).getLastLocation(new hd(ndVar, 0));
                            ((li.k) w0.j()).requestLocationUpdates(ndVar.N, ndVar.f17087r);
                            return;
                        } catch (Throwable th3) {
                            f8.g(th3, true);
                            return;
                        }
                    }
                    ndVar.p();
                    return;
                }
                return;
            case 4:
                vp vpVar = (vp) this.f14898c;
                boolean z14 = this.f14897b;
                vpVar.Q0 = null;
                vpVar.R0.clear();
                vpVar.getNotificationCenter().k(184, new Object[0]);
                if (z14) {
                    vpVar.getNotificationCenter().k(3, new Object[0]);
                    return;
                }
                return;
            default:
                qu quVar = (qu) this.f14898c;
                vv vvVar = quVar.f17621a;
                boolean z15 = !this.f14897b;
                TLObject tLObject = quVar.G;
                if (tLObject instanceof TL_iv.PageListItem) {
                    ((TL_iv.PageListItem) tLObject).checked = z15;
                } else if (tLObject instanceof TL_iv.PageListOrderedItem) {
                    ((TL_iv.PageListOrderedItem) tLObject).checked = z15;
                }
                View view = vvVar.Q;
                if (view != null) {
                    quVar.f17626r.f23906a = view;
                }
                quVar.f17626r.f(-1, z15, true);
                View view2 = vvVar.Q;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
        }
    }
}
