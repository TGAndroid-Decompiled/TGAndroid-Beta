package defpackage;

import android.graphics.Point;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.widget.TextView;
import android.widget.Toast;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.ProfileActivity;
public final class lj6 implements Runnable {
    public final byte a;
    public final Object b;
    public final Object c;

    public lj6(tx6 tx6Var, sw6 sw6Var, Runnable runnable) {
        this.a = (byte) 15;
        this.b = tx6Var;
        this.c = runnable;
    }

    @Override
    public final void run() {
        yl6 yl6Var;
        long U;
        long S;
        float f;
        float N;
        float f2;
        int i;
        TLRPC.StickerSet stickerSet;
        NativeByteBuffer byteBufferValue;
        jt6 jt6Var;
        o00 o00Var;
        g53 g53Var;
        int i2;
        boolean z;
        g0c g0cVar;
        q8a q8aVar;
        boolean z2;
        float f3 = 1.0f;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = null;
        int i3 = 2;
        int i4 = 0;
        switch (this.a) {
            case 0:
                ak6 ak6Var = (ak6) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                ak6Var.d0 = false;
                if (tL_error == null) {
                    sj6 l0 = ak6Var.l0();
                    ak6Var.k0.clear();
                    ak6Var.n0(l0);
                    return;
                }
                return;
            case 1:
                ak6 ak6Var2 = ((rj6) this.b).a;
                sj6 l02 = ak6Var2.l0();
                ak6Var2.j0.add(0, (TLRPC.TL_chatInviteExported) ((TLObject) this.c));
                TLRPC.ChatFull chatFull = ak6Var2.d;
                if (chatFull != null) {
                    chatFull.invitesCount++;
                    ak6Var2.getMessagesStorage().t1(ak6Var2.d.invitesCount, ak6Var2.n);
                }
                ak6Var2.n0(l02);
                return;
            case 2:
                cm6 cm6Var = (cm6) this.b;
                if (!((boolean[]) this.c)[0] && (yl6Var = cm6Var.R) != null) {
                    yl6Var.run();
                }
                cm6Var.R = null;
                return;
            case 3:
                String[] strArr = MediaController.W1;
                ((MediaController) this.b).Q((k47) this.c, true);
                return;
            case 4:
                MediaController mediaController = (MediaController) this.b;
                File file = (File) this.c;
                String[] strArr2 = MediaController.W1;
                try {
                    int i5 = mediaController.l0 + 1;
                    mediaController.l0 = i5;
                    ndc ndcVar = mediaController.k0;
                    if (ndcVar != null) {
                        ndcVar.l0();
                    }
                    ndc ndcVar2 = new ndc(false, false);
                    mediaController.k0 = ndcVar2;
                    ndcVar2.K = new de(mediaController, i5, (byte) 10);
                    ndcVar2.i0(Uri.fromFile(file), "other");
                    mediaController.k0.w0(3);
                    mediaController.k0.g0();
                    return;
                } catch (Exception e) {
                    fc4.g(e, true);
                    ndc ndcVar3 = mediaController.k0;
                    if (ndcVar3 != null) {
                        ndcVar3.l0();
                        mediaController.k0 = null;
                        return;
                    }
                    return;
                }
            case 5:
                String[] strArr3 = MediaController.W1;
                bc4.G(((j5) this.b).a).X((TLRPC.TL_document) this.c, null, 1, 1);
                return;
            case 6:
                ((MediaController) ((o04) this.b).b).y1.add((ByteBuffer) this.c);
                return;
            case 7:
                yy2 yy2Var = (yy2) this.b;
                k47 k47Var = (k47) this.c;
                MediaController mediaController2 = (MediaController) yy2Var.c;
                ndc ndcVar4 = mediaController2.j0;
                if ((ndcVar4 != null || mediaController2.F0 != null) && !mediaController2.h0) {
                    try {
                        ndc ndcVar5 = mediaController2.F0;
                        if (ndcVar5 != null) {
                            U = ndcVar5.U();
                            S = ((MediaController) yy2Var.c).F0.S();
                            if (S >= 0 && U > 0) {
                                float f4 = (float) U;
                                N = ((float) ((MediaController) yy2Var.c).F0.N()) / f4;
                                f2 = ((float) S) / f4;
                                if (f2 >= 1.0f) {
                                    return;
                                }
                            } else {
                                return;
                            }
                        } else {
                            U = ndcVar4.U();
                            S = ((MediaController) yy2Var.c).j0.S();
                            if (U >= 0) {
                                f = ((float) S) / ((float) U);
                            } else {
                                f = 0.0f;
                            }
                            N = ((float) ((MediaController) yy2Var.c).j0.N()) / ((float) U);
                            if (U != -9223372036854775807L && S >= 0 && ((MediaController) yy2Var.c).u0 == 0.0f) {
                                f2 = f;
                            } else {
                                return;
                            }
                        }
                        MediaController mediaController3 = (MediaController) yy2Var.c;
                        k47Var.j0 = (int) (U / 1000);
                        k47Var.b0 = f2;
                        k47Var.i0 = (int) (S / 1000);
                        k47Var.e0 = S;
                        k47Var.f0 = U;
                        k47Var.g0 = N;
                        if (f2 >= 0.0f && mediaController3.o0 != null) {
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            MediaController mediaController4 = (MediaController) yy2Var.c;
                            if (elapsedRealtime - mediaController4.p0 >= 1000) {
                                String str = mediaController4.o0;
                                mediaController4.p0 = SystemClock.elapsedRealtime();
                                Utilities.e.c(new wn6(str, f2, (byte) 0));
                            }
                        }
                        nm7.f(k47Var.K1).k(149, Integer.valueOf(k47Var.e1()), Float.valueOf(f2));
                        return;
                    } catch (Exception e2) {
                        fc4.g(e2, true);
                        return;
                    }
                }
                return;
            case 8:
                fo6 fo6Var = (fo6) this.b;
                k47 k47Var2 = (k47) this.c;
                TLRPC.Document F0 = k47Var2.F0();
                TLRPC.Document document = k47Var2.f3;
                if (document != null) {
                    F0 = document;
                }
                if (F0 != null) {
                    fo6Var.d.put(bc4.r(null, F0), k47Var2);
                    bc4 G = bc4.G(fo6Var.a.a);
                    if (!k47.Q5(k47Var2.k)) {
                        i3 = 0;
                    }
                    G.X(F0, k47Var2, 3, i3);
                    return;
                }
                return;
            case 9:
                hs6 hs6Var = (hs6) this.b;
                TLRPC.TL_contacts_topPeers tL_contacts_topPeers = (TLRPC.TL_contacts_topPeers) this.c;
                try {
                    hs6Var.getMessagesStorage().b.executeFast("DELETE FROM chat_hints WHERE 1").stepThis().dispose();
                    hs6Var.getMessagesStorage().b.beginTransaction();
                    hs6Var.getMessagesStorage().j1(tL_contacts_topPeers.users, tL_contacts_topPeers.chats, false, false);
                    SQLitePreparedStatement executeFast = hs6Var.getMessagesStorage().b.executeFast("REPLACE INTO chat_hints VALUES(?, ?, ?, ?)");
                    for (int i6 = 0; i6 < tL_contacts_topPeers.categories.size(); i6++) {
                        TLRPC.TL_topPeerCategoryPeers tL_topPeerCategoryPeers = tL_contacts_topPeers.categories.get(i6);
                        TLRPC.TopPeerCategory topPeerCategory = tL_topPeerCategoryPeers.category;
                        if (topPeerCategory instanceof TLRPC.TL_topPeerCategoryBotsInline) {
                            i = 1;
                        } else if (topPeerCategory instanceof TLRPC.TL_topPeerCategoryBotsApp) {
                            i = 2;
                        } else if (topPeerCategory instanceof TLRPC.TL_topPeerCategoryBotsGuestChat) {
                            i = 3;
                        } else {
                            i = 0;
                        }
                        for (int i7 = 0; i7 < tL_topPeerCategoryPeers.peers.size(); i7++) {
                            TLRPC.TL_topPeer tL_topPeer = tL_topPeerCategoryPeers.peers.get(i7);
                            executeFast.requery();
                            executeFast.bindLong(1, k47.B1(tL_topPeer.peer));
                            executeFast.bindInteger(2, i);
                            executeFast.bindDouble(3, tL_topPeer.rating);
                            executeFast.bindInteger(4, 0);
                            executeFast.step();
                        }
                    }
                    executeFast.dispose();
                    hs6Var.getMessagesStorage().b.commitTransaction();
                    gm.c3(new vp6(hs6Var, (byte) 7));
                    return;
                } catch (Exception e3) {
                    fc4.g(e3, true);
                    return;
                }
            case 10:
                boolean[] zArr = (boolean[]) this.b;
                zq6 zq6Var = (zq6) this.c;
                if (!zArr[0]) {
                    zq6Var.run();
                    zArr[0] = true;
                    return;
                }
                return;
            case 11:
                hs6 hs6Var2 = (hs6) this.b;
                TLRPC.StickerSet stickerSet2 = (TLRPC.StickerSet) this.c;
                try {
                    SQLiteCursor queryFinalized = hs6Var2.getMessagesStorage().b.queryFinalized("SELECT document FROM web_recent_v3 WHERE id = 's_" + stickerSet2.id + "'", new Object[0]);
                    if (queryFinalized.next() && !queryFinalized.isNull(0) && (byteBufferValue = queryFinalized.byteBufferValue(0)) != null) {
                        tL_messages_stickerSet = TLRPC.messages_StickerSet.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                        byteBufferValue.reuse();
                    }
                    queryFinalized.dispose();
                    if (tL_messages_stickerSet == null || (stickerSet = tL_messages_stickerSet.set) == null || stickerSet.hash != stickerSet2.hash) {
                        hs6Var2.N0(stickerSet2, false);
                    }
                    if (tL_messages_stickerSet != null && tL_messages_stickerSet.set != null) {
                        gm.c3(new tp6(hs6Var2, tL_messages_stickerSet, (byte) 1));
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    fc4.g(th, true);
                    return;
                }
            case 12:
                Runnable runnable = (Runnable) this.c;
                if (((AtomicInteger) this.b).decrementAndGet() == 0 && runnable != null) {
                    gm.c3(runnable);
                    return;
                }
                return;
            case 13:
                ArrayList arrayList = ((hs6) ((us4) this.b).c).B0;
                arrayList.clear();
                arrayList.addAll((ArrayList) this.c);
                return;
            case 14:
                ArrayList arrayList2 = ((hs6) ((jr) this.b).d).B0;
                arrayList2.clear();
                arrayList2.addAll((ArrayList) this.c);
                nm7.e().k(302, new Object[0]);
                return;
            case 15:
                ((tx6) this.b).getClass();
                ((Runnable) this.c).run();
                return;
            case 16:
                tx6 tx6Var = (tx6) this.b;
                cf8 cf8Var = (cf8) this.c;
                ly6 ly6Var = tx6Var.h;
                tx6Var.t = cf8Var;
                go6 go6Var = new go6(tx6Var, cf8Var);
                cf8Var.y(go6Var);
                tx6Var.u = go6Var;
                try {
                    ly6Var.l.t(0, cf8Var);
                } catch (RemoteException e4) {
                    ncd.d("MediaSessionImpl", "Exception in using media1 API", e4);
                }
                ((bx6) ly6Var.p.b).a.setActive(true);
                u64 U2 = cf8Var.U();
                n8a R0 = cf8Var.R0();
                qe8 Q0 = cf8Var.Q0();
                qe8 Q02 = cf8Var.Q0();
                ce8 g = cf8Var.g();
                int x0 = cf8Var.x0();
                boolean F02 = cf8Var.F0();
                jec B = cf8Var.B();
                bqb T0 = cf8Var.T0();
                if (cf8Var.m0(18)) {
                    jt6Var = cf8Var.g0();
                } else {
                    jt6Var = jt6.M;
                }
                jt6 jt6Var2 = jt6Var;
                if (cf8Var.m0(22)) {
                    f3 = cf8Var.D();
                }
                float f5 = f3;
                if (cf8Var.m0(21)) {
                    o00Var = cf8Var.F();
                } else {
                    o00Var = o00.i;
                }
                o00 o00Var2 = o00Var;
                if (cf8Var.m0(28)) {
                    g53Var = cf8Var.h0();
                } else {
                    g53Var = g53.d;
                }
                g53 g53Var2 = g53Var;
                of3 H = cf8Var.H();
                if (cf8Var.m0(23)) {
                    i2 = cf8Var.l();
                } else {
                    i2 = 0;
                }
                if (cf8Var.m0(23) && cf8Var.z0()) {
                    z = true;
                } else {
                    z = false;
                }
                boolean s = cf8Var.s();
                int v0 = cf8Var.v0();
                int h = cf8Var.h();
                boolean i8 = cf8Var.i();
                boolean f6 = cf8Var.f();
                jt6 U0 = cf8Var.U0();
                long O0 = cf8Var.O0();
                long X = cf8Var.X();
                long x = cf8Var.x();
                if (cf8Var.m0(30)) {
                    g0cVar = cf8Var.f0();
                } else {
                    g0cVar = g0c.b;
                }
                tx6Var.s = new ye8(U2, 0, R0, Q0, Q02, 0, g, x0, F02, B, T0, 0, jt6Var2, f5, 1.0f, o00Var2, 0, g53Var2, H, i2, z, s, 1, v0, h, i8, f6, U0, O0, X, x, g0cVar, cf8Var.G0());
                tx6Var.f(cf8Var.q());
                return;
            case 17:
                ao5 ao5Var = (ao5) this.b;
                ResultReceiver resultReceiver = (ResultReceiver) this.c;
                try {
                    q8aVar = (q8a) ao5Var.a;
                    jte.l(q8aVar, "SessionResult must not be null");
                } catch (InterruptedException e5) {
                    e = e5;
                    ncd.g("MediaSessionLegacyStub", "Custom command failed", e);
                    q8aVar = new q8a(-1);
                } catch (CancellationException e6) {
                    ncd.g("MediaSessionLegacyStub", "Custom command cancelled", e6);
                    q8aVar = new q8a(1);
                } catch (ExecutionException e7) {
                    e = e7;
                    ncd.g("MediaSessionLegacyStub", "Custom command failed", e);
                    q8aVar = new q8a(-1);
                }
                resultReceiver.send(q8aVar.a, q8aVar.b);
                return;
            case 18:
                ((fu2) this.b).accept((vz6) this.c);
                return;
            case 19:
                l7 l7Var = (l7) this.c;
                ((i02) this.b).v0(true);
                l7Var.requestFocus();
                gm.c3(new ys5(l7Var, (byte) 3));
                return;
            case 20:
                x07 x07Var = (x07) this.b;
                l07 l07Var = (l07) this.c;
                int i9 = x07Var.k;
                d dVar = x07Var.g;
                TLRPC.TL_chatInviteImporter importer = l07Var.getImporter();
                x07Var.r = importer;
                LongSparseArray longSparseArray = x07Var.d;
                TLRPC.User user = (TLRPC.User) longSparseArray.get(importer.user_id);
                if (user != null) {
                    dVar.getMessagesController().c4(user, false, false);
                    Point point = gm.q;
                    if (point.x > point.y) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (user.photo != null && !z2) {
                        if (x07Var.s == null) {
                            w07 w07Var = new w07(x07Var, dVar.getParentActivity(), (r59) l07Var.getParent(), dVar.getResourceProvider(), x07Var.a);
                            x07Var.s = w07Var;
                            TLRPC.TL_chatInviteImporter tL_chatInviteImporter = x07Var.r;
                            bf0 avatarImageView = l07Var.getAvatarImageView();
                            TextView textView = w07Var.e;
                            tr8 tr8Var = w07Var.h;
                            w07Var.r = tL_chatInviteImporter;
                            w07Var.w = avatarImageView;
                            TLRPC.User W1 = oc7.r1(i9).W1(Long.valueOf(tL_chatInviteImporter.user_id));
                            gn5 m = gn5.m(i9, 0, W1);
                            gn5 m2 = gn5.m(i9, 1, W1);
                            if (oc7.r1(i9).X1(tL_chatInviteImporter.user_id) == null) {
                                oc7.r1(i9).k3(0, W1, false);
                            }
                            tr8Var.setParentAvatarImage(avatarImageView);
                            tr8Var.M(tL_chatInviteImporter.user_id, true);
                            tr8Var.H(null, m, m2, true);
                            w07Var.d.setText(m9c.r((TLRPC.User) longSparseArray.get(tL_chatInviteImporter.user_id)));
                            textView.setText(tL_chatInviteImporter.about);
                            if (TextUtils.isEmpty(tL_chatInviteImporter.about)) {
                                i4 = 8;
                            }
                            textView.setVisibility(i4);
                            w07Var.E.requestLayout();
                            x07Var.s.setOnDismissListener(new n1(x07Var, (byte) 26));
                            x07Var.s.show();
                            return;
                        }
                        return;
                    }
                    x07Var.b = true;
                    dVar.dismissCurrentDialog();
                    Bundle bundle = new Bundle();
                    ProfileActivity profileActivity = new ProfileActivity(bundle, null);
                    bundle.putLong("user_id", user.id);
                    bundle.putBoolean("removeFragmentOnChatOpen", false);
                    dVar.presentFragment(profileActivity);
                    return;
                }
                return;
            case 21:
                k47 k47Var3 = (k47) this.b;
                k47Var3.n = (TLRPC.Document) this.c;
                nm7.f(k47Var3.K1).k(117, k47Var3);
                return;
            case 22:
                t67 t67Var = (t67) this.b;
                TL_stats.TL_statsGraphError tL_statsGraphError = (TL_stats.TL_statsGraphError) this.c;
                if (t67Var.getParentActivity() != null) {
                    Toast.makeText(t67Var.getParentActivity(), tL_statsGraphError.error, 1).show();
                    return;
                }
                return;
            case 23:
                oc7 oc7Var = (oc7) this.b;
                TLRPC.updates_Difference updates_difference = (TLRPC.updates_Difference) this.c;
                oc7Var.i1.clear();
                oc7Var.p1.clear();
                oc7Var.d4(updates_difference.users, false);
                oc7Var.X3(updates_difference.chats, false);
                return;
            case 24:
                oc7 oc7Var2 = (oc7) this.b;
                TL_update.TL_updateMessageID tL_updateMessageID = (TL_update.TL_updateMessageID) this.c;
                long[] X1 = oc7Var2.getMessagesStorage().X1(tL_updateMessageID.random_id, 0L, null, tL_updateMessageID.id, 0, -1, 0);
                if (X1 != null) {
                    gm.c3(new fp6(oc7Var2, X1, tL_updateMessageID, (byte) 17));
                    return;
                }
                return;
            case 25:
                TL_update.TL_updateServiceNotification tL_updateServiceNotification = (TL_update.TL_updateServiceNotification) this.c;
                ((oc7) this.b).getNotificationCenter().k(76, 2, tL_updateServiceNotification.message, tL_updateServiceNotification.type);
                return;
            case 26:
                TL_update.TL_updateGroupCallMessage tL_updateGroupCallMessage = (TL_update.TL_updateGroupCallMessage) this.c;
                ((oc7) this.b).getNotificationCenter().k(178, Long.valueOf(tL_updateGroupCallMessage.call.id), tL_updateGroupCallMessage, Boolean.FALSE);
                return;
            case 27:
                TL_update.TL_updateDeleteGroupCallMessages tL_updateDeleteGroupCallMessages = (TL_update.TL_updateDeleteGroupCallMessages) this.c;
                ((oc7) this.b).getNotificationCenter().k(178, Long.valueOf(tL_updateDeleteGroupCallMessages.call.id), tL_updateDeleteGroupCallMessages, Boolean.FALSE);
                return;
            case 28:
                TL_update.TL_updateUserTyping tL_updateUserTyping = (TL_update.TL_updateUserTyping) this.c;
                ((oc7) this.b).getNotificationCenter().k(301, Long.valueOf(tL_updateUserTyping.user_id), tL_updateUserTyping.action);
                return;
            default:
                TL_update.TL_updateChatUserTyping tL_updateChatUserTyping = (TL_update.TL_updateChatUserTyping) this.c;
                ((oc7) this.b).getNotificationCenter().k(301, Long.valueOf(-tL_updateChatUserTyping.chat_id), tL_updateChatUserTyping.action);
                return;
        }
    }

    public lj6(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}
