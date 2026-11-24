package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import android.util.LongSparseArray;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.messenger.camera.CameraController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
public final class y8c implements Runnable {
    public final byte a;
    public final boolean b;
    public final Object c;

    public y8c(byte b, Object obj, boolean z) {
        this.a = b;
        this.c = obj;
        this.b = z;
    }

    @Override
    public final void run() {
        int i;
        bmb D0;
        long j;
        TLRPC.TL_chatInviteImporter tL_chatInviteImporter;
        boolean z;
        TLRPC.User user = null;
        r3 = null;
        r3 = null;
        o07 o07Var = null;
        TLRPC.WallPaper wallPaper = null;
        int i2 = 8;
        boolean z2 = true;
        int i3 = 0;
        switch (this.a) {
            case 0:
                z8c z8cVar = (z8c) this.c;
                boolean z3 = this.b;
                if (z8cVar.b) {
                    synchronized (z8cVar.a) {
                        try {
                            SharedPreferences.Editor edit = z8cVar.j().edit();
                            if (z8cVar.currentAccount == 0) {
                                edit.putInt("selectedAccount", z8c.t0);
                            }
                            edit.putBoolean("registeredForPush", z8cVar.d);
                            edit.putInt("lastSendMessageId", z8cVar.e);
                            edit.putInt("contactsSavedCount", z8cVar.h);
                            edit.putInt("lastBroadcastId", z8cVar.f);
                            edit.putInt("lastContactsSyncTime", z8cVar.r);
                            edit.putInt("lastHintsSyncTime", z8cVar.s);
                            edit.putBoolean("draftsLoaded", z8cVar.w);
                            edit.putBoolean("unreadDialogsLoaded", z8cVar.x);
                            edit.putInt("ratingLoadTime", z8cVar.E);
                            edit.putInt("botRatingLoadTime", z8cVar.F);
                            edit.putInt("botGuestRatingLoadTime", z8cVar.G);
                            edit.putInt("webappRatingLoadTime", z8cVar.H);
                            edit.putBoolean("contactsReimported", z8cVar.I);
                            edit.putInt("loginTime", z8cVar.Z);
                            edit.putBoolean("syncContacts", z8cVar.V);
                            edit.putBoolean("showCallsTab", z8cVar.X);
                            edit.putBoolean("suggestContacts", z8cVar.W);
                            edit.putBoolean("hasSecureData", z8cVar.Y);
                            edit.putBoolean("notificationsSettingsLoaded4", z8cVar.T);
                            edit.putBoolean("notificationsSignUpSettingsLoaded", z8cVar.U);
                            edit.putLong("autoDownloadConfigLoadTime", z8cVar.b0);
                            edit.putBoolean("hasValidDialogLoadIds", z8cVar.J);
                            edit.putInt("sharingMyLocationUntil", z8cVar.R);
                            edit.putInt("lastMyLocationShareTime", z8cVar.S);
                            edit.putBoolean("filtersLoaded", z8cVar.Q);
                            edit.putString("premiumGiftsStickerPack", z8cVar.c0);
                            edit.putLong("lastUpdatedPremiumGiftsStickerPack", z8cVar.g0);
                            edit.putString("genericAnimationsStickerPack", z8cVar.e0);
                            edit.putLong("lastUpdatedGenericAnimations", z8cVar.i0);
                            edit.putInt("6migrateOffsetId", z8cVar.K);
                            if (z8cVar.K != -1) {
                                edit.putInt("6migrateOffsetDate", z8cVar.L);
                                edit.putLong("6migrateOffsetUserId", z8cVar.M);
                                edit.putLong("6migrateOffsetChatId", z8cVar.N);
                                edit.putLong("6migrateOffsetChannelId", z8cVar.O);
                                edit.putLong("6migrateOffsetAccess", z8cVar.P);
                            }
                            TLRPC.TL_help_termsOfService tL_help_termsOfService = z8cVar.a0;
                            if (tL_help_termsOfService != null) {
                                try {
                                    SerializedData serializedData = new SerializedData(tL_help_termsOfService.getObjectSize());
                                    z8cVar.a0.serializeToStream(serializedData);
                                    edit.putString("terms", Base64.encodeToString(serializedData.toByteArray(), 0));
                                    serializedData.cleanup();
                                } catch (Exception unused) {
                                }
                            } else {
                                edit.remove("terms");
                            }
                            gda.x();
                            if (z8cVar.y != null) {
                                SerializedData serializedData2 = new SerializedData();
                                z8cVar.y.serializeToStream(serializedData2);
                                edit.putString("tmpPassword", Base64.encodeToString(serializedData2.toByteArray(), 0));
                                serializedData2.cleanup();
                            } else {
                                edit.remove("tmpPassword");
                            }
                            if (z8cVar.c != null) {
                                if (z3) {
                                    SerializedData serializedData3 = new SerializedData();
                                    z8cVar.c.serializeToStream(serializedData3);
                                    edit.putString("user", Base64.encodeToString(serializedData3.toByteArray(), 0));
                                    serializedData3.cleanup();
                                }
                            } else {
                                edit.remove("user");
                            }
                            edit.apply();
                        } catch (Exception e) {
                            fc4.g(e, true);
                        }
                    }
                    return;
                }
                return;
            case 1:
                a1 a1Var = (a1) this.c;
                boolean z4 = this.b;
                a1Var.L2 = null;
                a1Var.J2 = z4;
                if (z4) {
                    a1Var.K2 = SystemClock.uptimeMillis();
                }
                a1Var.B2.setLoading(z4);
                return;
            case 2:
                r7 r7Var = (r7) this.c;
                boolean z5 = this.b;
                r7Var.M = null;
                if (r7Var.getParent() != null) {
                    r7Var.getParent().requestDisallowInterceptTouchEvent(true);
                }
                if (z5) {
                    r7Var.performHapticFeedback(0);
                }
                r7Var.U(null, null);
                r7Var.r0 = true;
                return;
            case 3:
                boolean z6 = this.b;
                String str = hac.a;
                h74 h74Var = ((c74) ((o40) ((lx6) this.c).c)).a;
                if (h74Var.d0 != z6) {
                    h74Var.d0 = z6;
                    h74Var.m.e(23, new z64((byte) 1, z6));
                    return;
                }
                return;
            case 4:
                gs0 gs0Var = (gs0) this.c;
                boolean z7 = this.b;
                kea keaVar = gs0Var.a0;
                if (z7) {
                    new js0(keaVar.a, jb6.M0(2131746426, null), new mf2(keaVar, (byte) 8)).show();
                    return;
                } else {
                    keaVar.b(gs0Var.a.E);
                    return;
                }
            case 5:
                wx0 wx0Var = (wx0) this.c;
                boolean z8 = this.b;
                ux0 ux0Var = wx0Var.F;
                ox0 ox0Var = wx0Var.E;
                if (ox0Var.getWebView() != null) {
                    ox0Var.getWebView().animate().cancel();
                    ox0Var.getWebView().animate().alpha(0.0f).start();
                }
                ux0Var.setLoadProgress(0.0f);
                ux0Var.setAlpha(1.0f);
                ux0Var.setVisibility(0);
                if (!z8) {
                    user = oc7.r1(wx0Var.I).W1(Long.valueOf(wx0Var.J));
                }
                ox0Var.setBotUser(user);
                if (!z8) {
                    ox0Var.p(wx0Var.I, wx0Var.J);
                }
                nm7.f(ox0Var.N).d(new bv0(ox0Var, (byte) 1));
                return;
            case 6:
                boolean z9 = this.b;
                w01 w01Var = ((f11) this.c).d;
                boolean z10 = !z9;
                w01Var.getClass();
                if (!z10) {
                    z2 = false;
                }
                w01Var.y = z2;
                return;
            case 7:
                ((CameraController) this.c).lambda$recordVideo$11(this.b);
                return;
            case 8:
                Context context = (Context) this.c;
                if (this.b) {
                    i = 2131752994;
                } else {
                    i = 2131748149;
                }
                l11.u(context, jb6.M0(i, null));
                return;
            case 9:
                boolean z11 = this.b;
                fdb fdbVar = ((ju1) this.c).b.s1;
                if (fdbVar != null && z11) {
                    fdbVar.setVisibility(8);
                    return;
                }
                return;
            case 10:
                j92 j92Var = (j92) this.c;
                if (this.b) {
                    ((n92) j92Var.x.c).w.setVisibility(4);
                    return;
                }
                return;
            case 11:
                ba2 ba2Var = (ba2) this.c;
                ba2Var.x0.autotranslation = this.b;
                ba2Var.getMessagesController().V3(ba2Var.x0, false);
                return;
            case 12:
                if2 if2Var = (if2) this.c;
                boolean z12 = this.b;
                gf2 gf2Var = if2Var.q1;
                if (gf2Var != null && gf2Var.d != null && !if2Var.J) {
                    if2Var.O0(z12, true);
                    if (if2Var.F1 != null) {
                        if2Var.I1 = true;
                        if (!if2Var.J0()) {
                            wallPaper = if2Var.r1.g;
                        }
                        TLRPC.WallPaper wallPaper2 = wallPaper;
                        tz3 tz3Var = if2Var.F1.a;
                        boolean z13 = tz3Var.a;
                        wv1 wv1Var = if2Var.r1;
                        if (z13) {
                            wv1Var.q(null, wallPaper2, false, Boolean.valueOf(z12), false);
                        } else {
                            wv1Var.q(tz3Var, wallPaper2, false, Boolean.valueOf(z12), false);
                        }
                    }
                    if (gm.O1() && (D0 = if2.D0(z12)) != null && D0 != cmb.I) {
                        if (z12 == if2Var.t1) {
                            z2 = false;
                        }
                        if2Var.c2 = z2;
                        if2Var.S0(D0);
                    }
                    if (gf2Var.d != null) {
                        while (i3 < gf2Var.d.size()) {
                            ((hf2) gf2Var.d.get(i3)).c = z12 ? 1 : 0;
                            i3++;
                        }
                        gf2Var.f();
                        return;
                    }
                    return;
                }
                return;
            case 13:
                ((xp2) this.c).f(this.b, false);
                return;
            case 14:
                ((ConnectionsManager) this.c).lambda$setIsUpdating$22(this.b);
                return;
            case 15:
                nk3 nk3Var = (nk3) this.c;
                boolean z14 = this.b;
                Activity parentActivity = nk3Var.getParentActivity();
                if (z14) {
                    j = nk3Var.getUserConfig().e();
                } else {
                    j = -1;
                }
                ik.J(parentActivity, j, new pj3(nk3Var), nk3Var.getResourceProvider());
                return;
            case 16:
                mz3 mz3Var = (mz3) this.c;
                if (!this.b) {
                    mz3Var.E.setVisibility(8);
                    return;
                }
                return;
            case 17:
                bc4 bc4Var = (bc4) this.c;
                boolean z15 = this.b;
                for (Map.Entry entry : bc4Var.h.entrySet()) {
                    qd4 qd4Var = (qd4) entry.getValue();
                    if (qd4Var.m == 1) {
                        Utilities.d.c(new y8c((byte) 18, qd4Var, z15));
                        gm.c3(new md4(qd4Var, (byte) 2));
                    }
                }
                for (Map.Entry entry2 : bc4Var.n.entrySet()) {
                    qd4 qd4Var2 = (qd4) entry2.getValue();
                    if (qd4Var2.m == 1) {
                        Utilities.d.c(new y8c((byte) 18, qd4Var2, z15));
                        gm.c3(new md4(qd4Var2, (byte) 2));
                    }
                }
                return;
            case 18:
                qd4 qd4Var3 = (qd4) this.c;
                boolean z16 = this.b;
                SparseIntArray sparseIntArray = qd4Var3.p;
                if (qd4Var3.i != z16) {
                    qd4Var3.i = z16;
                    if (e21.a) {
                        fc4.b("network changed to slow = " + qd4Var3.i);
                    }
                    for (int i4 = 0; i4 < sparseIntArray.size(); i4++) {
                        ConnectionsManager.getInstance(qd4Var3.a).cancelRequest(sparseIntArray.valueAt(i4), true);
                    }
                    sparseIntArray.clear();
                    qd4Var3.b();
                    qd4Var3.b = false;
                    qd4Var3.c = false;
                    qd4Var3.k = 0;
                    qd4Var3.r = 0;
                    qd4Var3.v = 0L;
                    qd4Var3.w = 0L;
                    qd4Var3.x = 0;
                    qd4Var3.y = null;
                    qd4Var3.z = null;
                    qd4Var3.A = null;
                    qd4Var3.K = 0;
                    Arrays.fill(qd4Var3.g, 0);
                    qd4Var3.N = 0;
                    qd4Var3.P = false;
                    qd4Var3.Q.clear();
                    qd4Var3.d++;
                    if (qd4Var3.i) {
                        i2 = 1;
                    }
                    while (i3 < i2) {
                        qd4Var3.d();
                        i3++;
                    }
                    return;
                }
                return;
            case 19:
                me4 me4Var = (me4) this.c;
                me4Var.c0(me4Var.P, this.b);
                return;
            case 20:
                ln4 ln4Var = (ln4) this.c;
                ln4Var.Z0(ln4Var.t2, this.b);
                return;
            case 21:
                pt4 pt4Var = (pt4) this.c;
                if (!this.b) {
                    pt4Var.J.setVisibility(8);
                    return;
                }
                return;
            case 22:
                re5 re5Var = (re5) this.c;
                if (!this.b) {
                    re5Var.r.setVisibility(8);
                    return;
                }
                return;
            case 23:
                boolean z17 = this.b;
                yj3 yj3Var = ((t96) this.c).b;
                if (z17) {
                    i2 = 0;
                }
                yj3Var.setVisibility(i2);
                return;
            case 24:
                pc6 pc6Var = (pc6) this.c;
                if (!this.b) {
                    pc6Var.b.setVisibility(8);
                    return;
                }
                return;
            case 25:
                dd6 dd6Var = (dd6) this.c;
                boolean z18 = this.b;
                if (!z18) {
                    dd6Var.L = Boolean.FALSE;
                }
                if (!dd6Var.b.isEmpty()) {
                    if (z18) {
                        try {
                            ((in3) a.i()).getLastLocation(new xc6(dd6Var, (byte) 0));
                            ((in3) a.i()).requestLocationUpdates(dd6Var.O, dd6Var.r);
                            return;
                        } catch (Throwable th) {
                            fc4.g(th, true);
                            return;
                        }
                    }
                    dd6Var.p();
                    return;
                }
                return;
            case 26:
                mh6 mh6Var = (mh6) this.c;
                if (!this.b) {
                    mh6Var.X.setVisibility(8);
                    return;
                }
                return;
            case 27:
                x07 x07Var = (x07) this.c;
                boolean z19 = this.b;
                ArrayList arrayList = x07Var.c;
                boolean isEmpty = TextUtils.isEmpty(x07Var.t);
                String str2 = x07Var.t;
                x07Var.w = true;
                x07Var.A = false;
                if (isEmpty && !arrayList.isEmpty()) {
                    tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) b10.f(1, arrayList);
                } else {
                    tL_chatInviteImporter = null;
                }
                if (tL_chatInviteImporter == null) {
                    z = true;
                } else {
                    z = false;
                }
                if (isEmpty && z && z19) {
                    o07Var = new o07(x07Var, (byte) 1);
                }
                o07 o07Var2 = o07Var;
                if (isEmpty) {
                    gm.d3(o07Var2, 300L);
                }
                n07 n07Var = x07Var.i;
                long j2 = x07Var.j;
                LongSparseArray longSparseArray = x07Var.d;
                p07 p07Var = new p07(x07Var, isEmpty, o07Var2, str2, z);
                n07Var.getClass();
                boolean isEmpty2 = TextUtils.isEmpty(str2);
                TLRPC.TL_messages_getChatInviteImporters tL_messages_getChatInviteImporters = new TLRPC.TL_messages_getChatInviteImporters();
                tL_messages_getChatInviteImporters.peer = oc7.r1(n07Var.currentAccount).i1(-j2);
                tL_messages_getChatInviteImporters.requested = true;
                tL_messages_getChatInviteImporters.limit = 30;
                if (!isEmpty2) {
                    tL_messages_getChatInviteImporters.q = str2;
                    tL_messages_getChatInviteImporters.flags |= 4;
                }
                if (tL_chatInviteImporter == null) {
                    tL_messages_getChatInviteImporters.offset_user = new TLRPC.TL_inputUserEmpty();
                } else {
                    tL_messages_getChatInviteImporters.offset_user = n07Var.getMessagesController().p1((TLRPC.User) longSparseArray.get(tL_chatInviteImporter.user_id));
                    tL_messages_getChatInviteImporters.offset_date = tL_chatInviteImporter.date;
                }
                x07Var.v = n07Var.getConnectionsManager().sendRequest(tL_messages_getChatInviteImporters, new rt0(n07Var, tL_chatInviteImporter, isEmpty2, j2, p07Var, (byte) 2));
                return;
            case 28:
                oc7 oc7Var = (oc7) this.c;
                boolean z20 = this.b;
                oc7Var.H0 = null;
                oc7Var.I0.clear();
                oc7Var.getNotificationCenter().k(185, new Object[0]);
                if (z20) {
                    oc7Var.getNotificationCenter().k(3, new Object[0]);
                    return;
                }
                return;
            default:
                xv7 xv7Var = (xv7) this.c;
                if (!this.b) {
                    xv7Var.N0.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
