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
public final class x6c implements Runnable {
    public final byte a;
    public final boolean b;
    public final Object c;

    public x6c(byte b, Object obj, boolean z) {
        this.a = b;
        this.c = obj;
        this.b = z;
    }

    @Override
    public final void run() {
        int i;
        akb D0;
        long j;
        TLRPC.TL_chatInviteImporter tL_chatInviteImporter;
        boolean z;
        TLRPC.User user = null;
        r3 = null;
        r3 = null;
        oy6 oy6Var = null;
        TLRPC.WallPaper wallPaper = null;
        int i2 = 8;
        boolean z2 = true;
        int i3 = 0;
        switch (this.a) {
            case 0:
                y6c y6cVar = (y6c) this.c;
                boolean z3 = this.b;
                if (y6cVar.b) {
                    synchronized (y6cVar.a) {
                        try {
                            SharedPreferences.Editor edit = y6cVar.j().edit();
                            if (y6cVar.currentAccount == 0) {
                                edit.putInt("selectedAccount", y6c.t0);
                            }
                            edit.putBoolean("registeredForPush", y6cVar.d);
                            edit.putInt("lastSendMessageId", y6cVar.e);
                            edit.putInt("contactsSavedCount", y6cVar.h);
                            edit.putInt("lastBroadcastId", y6cVar.f);
                            edit.putInt("lastContactsSyncTime", y6cVar.r);
                            edit.putInt("lastHintsSyncTime", y6cVar.s);
                            edit.putBoolean("draftsLoaded", y6cVar.w);
                            edit.putBoolean("unreadDialogsLoaded", y6cVar.x);
                            edit.putInt("ratingLoadTime", y6cVar.E);
                            edit.putInt("botRatingLoadTime", y6cVar.F);
                            edit.putInt("botGuestRatingLoadTime", y6cVar.G);
                            edit.putInt("webappRatingLoadTime", y6cVar.H);
                            edit.putBoolean("contactsReimported", y6cVar.I);
                            edit.putInt("loginTime", y6cVar.Z);
                            edit.putBoolean("syncContacts", y6cVar.V);
                            edit.putBoolean("showCallsTab", y6cVar.X);
                            edit.putBoolean("suggestContacts", y6cVar.W);
                            edit.putBoolean("hasSecureData", y6cVar.Y);
                            edit.putBoolean("notificationsSettingsLoaded4", y6cVar.T);
                            edit.putBoolean("notificationsSignUpSettingsLoaded", y6cVar.U);
                            edit.putLong("autoDownloadConfigLoadTime", y6cVar.b0);
                            edit.putBoolean("hasValidDialogLoadIds", y6cVar.J);
                            edit.putInt("sharingMyLocationUntil", y6cVar.R);
                            edit.putInt("lastMyLocationShareTime", y6cVar.S);
                            edit.putBoolean("filtersLoaded", y6cVar.Q);
                            edit.putString("premiumGiftsStickerPack", y6cVar.c0);
                            edit.putLong("lastUpdatedPremiumGiftsStickerPack", y6cVar.g0);
                            edit.putString("genericAnimationsStickerPack", y6cVar.e0);
                            edit.putLong("lastUpdatedGenericAnimations", y6cVar.i0);
                            edit.putInt("6migrateOffsetId", y6cVar.K);
                            if (y6cVar.K != -1) {
                                edit.putInt("6migrateOffsetDate", y6cVar.L);
                                edit.putLong("6migrateOffsetUserId", y6cVar.M);
                                edit.putLong("6migrateOffsetChatId", y6cVar.N);
                                edit.putLong("6migrateOffsetChannelId", y6cVar.O);
                                edit.putLong("6migrateOffsetAccess", y6cVar.P);
                            }
                            TLRPC.TL_help_termsOfService tL_help_termsOfService = y6cVar.a0;
                            if (tL_help_termsOfService != null) {
                                try {
                                    SerializedData serializedData = new SerializedData(tL_help_termsOfService.getObjectSize());
                                    y6cVar.a0.serializeToStream(serializedData);
                                    edit.putString("terms", Base64.encodeToString(serializedData.toByteArray(), 0));
                                    serializedData.cleanup();
                                } catch (Exception unused) {
                                }
                            } else {
                                edit.remove("terms");
                            }
                            gba.x();
                            if (y6cVar.y != null) {
                                SerializedData serializedData2 = new SerializedData();
                                y6cVar.y.serializeToStream(serializedData2);
                                edit.putString("tmpPassword", Base64.encodeToString(serializedData2.toByteArray(), 0));
                                serializedData2.cleanup();
                            } else {
                                edit.remove("tmpPassword");
                            }
                            if (y6cVar.c != null) {
                                if (z3) {
                                    SerializedData serializedData3 = new SerializedData();
                                    y6cVar.c.serializeToStream(serializedData3);
                                    edit.putString("user", Base64.encodeToString(serializedData3.toByteArray(), 0));
                                    serializedData3.cleanup();
                                }
                            } else {
                                edit.remove("user");
                            }
                            edit.apply();
                        } catch (Exception e) {
                            fa4.g(e, true);
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
                String str = g8c.a;
                y54 y54Var = ((t54) ((o30) ((tg2) this.c).c)).a;
                if (y54Var.d0 != z6) {
                    y54Var.d0 = z6;
                    y54Var.m.e(23, new p54((byte) 1, z6));
                    return;
                }
                return;
            case 4:
                gr0 gr0Var = (gr0) this.c;
                boolean z7 = this.b;
                kca kcaVar = gr0Var.a0;
                if (z7) {
                    new jr0(kcaVar.a, k96.M0(2131746500, null), new be2(kcaVar, (byte) 8)).show();
                    return;
                } else {
                    kcaVar.b(gr0Var.a.E);
                    return;
                }
            case 5:
                ow0 ow0Var = (ow0) this.c;
                boolean z8 = this.b;
                mw0 mw0Var = ow0Var.F;
                gw0 gw0Var = ow0Var.E;
                if (gw0Var.getWebView() != null) {
                    gw0Var.getWebView().animate().cancel();
                    gw0Var.getWebView().animate().alpha(0.0f).start();
                }
                mw0Var.setLoadProgress(0.0f);
                mw0Var.setAlpha(1.0f);
                mw0Var.setVisibility(0);
                if (!z8) {
                    user = na7.q1(ow0Var.I).V1(Long.valueOf(ow0Var.J));
                }
                gw0Var.setBotUser(user);
                if (!z8) {
                    gw0Var.p(ow0Var.I, ow0Var.J);
                }
                kk7.f(gw0Var.N).d(new st0(gw0Var, (byte) 1));
                return;
            case 6:
                boolean z9 = this.b;
                pz0 pz0Var = ((yz0) this.c).d;
                boolean z10 = !z9;
                pz0Var.getClass();
                if (!z10) {
                    z2 = false;
                }
                pz0Var.y = z2;
                return;
            case 7:
                ((CameraController) this.c).lambda$recordVideo$11(this.b);
                return;
            case 8:
                Context context = (Context) this.c;
                if (this.b) {
                    i = 2131753026;
                } else {
                    i = 2131748200;
                }
                d01.t(context, k96.M0(i, null));
                return;
            case 9:
                boolean z11 = this.b;
                dbb dbbVar = ((xs1) this.c).b.s1;
                if (dbbVar != null && z11) {
                    dbbVar.setVisibility(8);
                    return;
                }
                return;
            case 10:
                y72 y72Var = (y72) this.c;
                if (this.b) {
                    ((c82) y72Var.x.c).w.setVisibility(4);
                    return;
                }
                return;
            case 11:
                p82 p82Var = (p82) this.c;
                p82Var.x0.autotranslation = this.b;
                p82Var.getMessagesController().T3(p82Var.x0, false);
                return;
            case 12:
                xd2 xd2Var = (xd2) this.c;
                boolean z12 = this.b;
                vd2 vd2Var = xd2Var.q1;
                if (vd2Var != null && vd2Var.d != null && !xd2Var.J) {
                    xd2Var.O0(z12, true);
                    if (xd2Var.F1 != null) {
                        xd2Var.I1 = true;
                        if (!xd2Var.J0()) {
                            wallPaper = xd2Var.r1.g;
                        }
                        TLRPC.WallPaper wallPaper2 = wallPaper;
                        jy3 jy3Var = xd2Var.F1.a;
                        boolean z13 = jy3Var.a;
                        ku1 ku1Var = xd2Var.r1;
                        if (z13) {
                            ku1Var.q(null, wallPaper2, false, Boolean.valueOf(z12), false);
                        } else {
                            ku1Var.q(jy3Var, wallPaper2, false, Boolean.valueOf(z12), false);
                        }
                    }
                    if (gl.O1() && (D0 = xd2.D0(z12)) != null && D0 != bkb.I) {
                        if (z12 == xd2Var.t1) {
                            z2 = false;
                        }
                        xd2Var.c2 = z2;
                        xd2Var.S0(D0);
                    }
                    if (vd2Var.d != null) {
                        while (i3 < vd2Var.d.size()) {
                            ((wd2) vd2Var.d.get(i3)).c = z12 ? 1 : 0;
                            i3++;
                        }
                        vd2Var.f();
                        return;
                    }
                    return;
                }
                return;
            case 13:
                ((mo2) this.c).f(this.b, false);
                return;
            case 14:
                ((ConnectionsManager) this.c).lambda$setIsUpdating$22(this.b);
                return;
            case 15:
                cj3 cj3Var = (cj3) this.c;
                boolean z14 = this.b;
                Activity parentActivity = cj3Var.getParentActivity();
                if (z14) {
                    j = cj3Var.getUserConfig().e();
                } else {
                    j = -1;
                }
                ij.J(parentActivity, j, new di3(cj3Var), cj3Var.getResourceProvider());
                return;
            case 16:
                cy3 cy3Var = (cy3) this.c;
                if (!this.b) {
                    cy3Var.E.setVisibility(8);
                    return;
                }
                return;
            case 17:
                ba4 ba4Var = (ba4) this.c;
                boolean z15 = this.b;
                for (Map.Entry entry : ba4Var.h.entrySet()) {
                    qb4 qb4Var = (qb4) entry.getValue();
                    if (qb4Var.m == 1) {
                        Utilities.d.c(new x6c((byte) 18, qb4Var, z15));
                        gl.c3(new mb4(qb4Var, (byte) 2));
                    }
                }
                for (Map.Entry entry2 : ba4Var.n.entrySet()) {
                    qb4 qb4Var2 = (qb4) entry2.getValue();
                    if (qb4Var2.m == 1) {
                        Utilities.d.c(new x6c((byte) 18, qb4Var2, z15));
                        gl.c3(new mb4(qb4Var2, (byte) 2));
                    }
                }
                return;
            case 18:
                qb4 qb4Var3 = (qb4) this.c;
                boolean z16 = this.b;
                SparseIntArray sparseIntArray = qb4Var3.p;
                if (qb4Var3.i != z16) {
                    qb4Var3.i = z16;
                    if (w01.a) {
                        fa4.b("network changed to slow = " + qb4Var3.i);
                    }
                    for (int i4 = 0; i4 < sparseIntArray.size(); i4++) {
                        ConnectionsManager.getInstance(qb4Var3.a).cancelRequest(sparseIntArray.valueAt(i4), true);
                    }
                    sparseIntArray.clear();
                    qb4Var3.b();
                    qb4Var3.b = false;
                    qb4Var3.c = false;
                    qb4Var3.k = 0;
                    qb4Var3.r = 0;
                    qb4Var3.v = 0L;
                    qb4Var3.w = 0L;
                    qb4Var3.x = 0;
                    qb4Var3.y = null;
                    qb4Var3.z = null;
                    qb4Var3.A = null;
                    qb4Var3.K = 0;
                    Arrays.fill(qb4Var3.g, 0);
                    qb4Var3.N = 0;
                    qb4Var3.P = false;
                    qb4Var3.Q.clear();
                    qb4Var3.d++;
                    if (qb4Var3.i) {
                        i2 = 1;
                    }
                    while (i3 < i2) {
                        qb4Var3.d();
                        i3++;
                    }
                    return;
                }
                return;
            case 19:
                mc4 mc4Var = (mc4) this.c;
                mc4Var.b0(mc4Var.P, this.b);
                return;
            case 20:
                ll4 ll4Var = (ll4) this.c;
                ll4Var.Z0(ll4Var.t2, this.b);
                return;
            case 21:
                or4 or4Var = (or4) this.c;
                if (!this.b) {
                    or4Var.J.setVisibility(8);
                    return;
                }
                return;
            case 22:
                tc5 tc5Var = (tc5) this.c;
                if (!this.b) {
                    tc5Var.r.setVisibility(8);
                    return;
                }
                return;
            case 23:
                boolean z17 = this.b;
                oi3 oi3Var = ((u76) this.c).b;
                if (z17) {
                    i2 = 0;
                }
                oi3Var.setVisibility(i2);
                return;
            case 24:
                qa6 qa6Var = (qa6) this.c;
                if (!this.b) {
                    qa6Var.b.setVisibility(8);
                    return;
                }
                return;
            case 25:
                eb6 eb6Var = (eb6) this.c;
                boolean z18 = this.b;
                if (!z18) {
                    eb6Var.L = Boolean.FALSE;
                }
                if (!eb6Var.b.isEmpty()) {
                    if (z18) {
                        try {
                            ((xl3) a.i()).getLastLocation(new ya6(eb6Var, (byte) 0));
                            ((xl3) a.i()).requestLocationUpdates(eb6Var.O, eb6Var.r);
                            return;
                        } catch (Throwable th) {
                            fa4.g(th, true);
                            return;
                        }
                    }
                    eb6Var.p();
                    return;
                }
                return;
            case 26:
                mf6 mf6Var = (mf6) this.c;
                if (!this.b) {
                    mf6Var.X.setVisibility(8);
                    return;
                }
                return;
            case 27:
                xy6 xy6Var = (xy6) this.c;
                boolean z19 = this.b;
                ArrayList arrayList = xy6Var.c;
                boolean isEmpty = TextUtils.isEmpty(xy6Var.t);
                String str2 = xy6Var.t;
                xy6Var.w = true;
                xy6Var.A = false;
                if (isEmpty && !arrayList.isEmpty()) {
                    tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) b00.f(1, arrayList);
                } else {
                    tL_chatInviteImporter = null;
                }
                if (tL_chatInviteImporter == null) {
                    z = true;
                } else {
                    z = false;
                }
                if (isEmpty && z && z19) {
                    oy6Var = new oy6(xy6Var, (byte) 1);
                }
                oy6 oy6Var2 = oy6Var;
                if (isEmpty) {
                    gl.d3(oy6Var2, 300L);
                }
                ny6 ny6Var = xy6Var.i;
                long j2 = xy6Var.j;
                LongSparseArray longSparseArray = xy6Var.d;
                py6 py6Var = new py6(xy6Var, isEmpty, oy6Var2, str2, z);
                ny6Var.getClass();
                boolean isEmpty2 = TextUtils.isEmpty(str2);
                TLRPC.TL_messages_getChatInviteImporters tL_messages_getChatInviteImporters = new TLRPC.TL_messages_getChatInviteImporters();
                tL_messages_getChatInviteImporters.peer = na7.q1(ny6Var.currentAccount).h1(-j2);
                tL_messages_getChatInviteImporters.requested = true;
                tL_messages_getChatInviteImporters.limit = 30;
                if (!isEmpty2) {
                    tL_messages_getChatInviteImporters.q = str2;
                    tL_messages_getChatInviteImporters.flags |= 4;
                }
                if (tL_chatInviteImporter == null) {
                    tL_messages_getChatInviteImporters.offset_user = new TLRPC.TL_inputUserEmpty();
                } else {
                    tL_messages_getChatInviteImporters.offset_user = ny6Var.getMessagesController().o1((TLRPC.User) longSparseArray.get(tL_chatInviteImporter.user_id));
                    tL_messages_getChatInviteImporters.offset_date = tL_chatInviteImporter.date;
                }
                xy6Var.v = ny6Var.getConnectionsManager().sendRequest(tL_messages_getChatInviteImporters, new js0(ny6Var, tL_chatInviteImporter, isEmpty2, j2, py6Var, (byte) 2));
                return;
            case 28:
                na7 na7Var = (na7) this.c;
                boolean z20 = this.b;
                na7Var.H0 = null;
                na7Var.I0.clear();
                na7Var.getNotificationCenter().k(184, new Object[0]);
                if (z20) {
                    na7Var.getNotificationCenter().k(3, new Object[0]);
                    return;
                }
                return;
            default:
                wt7 wt7Var = (wt7) this.c;
                if (!this.b) {
                    wt7Var.N0.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
