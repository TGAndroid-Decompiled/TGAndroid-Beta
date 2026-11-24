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
public final class oh6 implements Runnable {
    public final byte a;
    public final Object b;
    public final Object c;

    public oh6(tv6 tv6Var, su6 su6Var, Runnable runnable) {
        this.a = (byte) 14;
        this.b = tv6Var;
        this.c = runnable;
    }

    @Override
    public final void run() {
        vj6 vj6Var;
        long U;
        long S;
        float f;
        float N;
        float f2;
        int i;
        TLRPC.StickerSet stickerSet;
        NativeByteBuffer byteBufferValue;
        jr6 jr6Var;
        nz nzVar;
        v33 v33Var;
        int i2;
        boolean z;
        eyb eybVar;
        o6a o6aVar;
        boolean z2;
        float f3 = 1.0f;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = null;
        int i3 = 2;
        int i4 = 0;
        switch (this.a) {
            case 0:
                yh6 yh6Var = ((ph6) this.b).a;
                qh6 k0 = yh6Var.k0();
                yh6Var.j0.add(0, (TLRPC.TL_chatInviteExported) ((TLObject) this.c));
                TLRPC.ChatFull chatFull = yh6Var.d;
                if (chatFull != null) {
                    chatFull.invitesCount++;
                    yh6Var.getMessagesStorage().t1(yh6Var.d.invitesCount, yh6Var.n);
                }
                yh6Var.m0(k0);
                return;
            case 1:
                zj6 zj6Var = (zj6) this.b;
                if (!((boolean[]) this.c)[0] && (vj6Var = zj6Var.R) != null) {
                    vj6Var.run();
                }
                zj6Var.R = null;
                return;
            case 2:
                String[] strArr = MediaController.W1;
                ((MediaController) this.b).Q((k27) this.c, true);
                return;
            case 3:
                MediaController mediaController = (MediaController) this.b;
                File file = (File) this.c;
                String[] strArr2 = MediaController.W1;
                try {
                    int i5 = mediaController.l0 + 1;
                    mediaController.l0 = i5;
                    lbc lbcVar = mediaController.k0;
                    if (lbcVar != null) {
                        lbcVar.l0();
                    }
                    lbc lbcVar2 = new lbc(false, false);
                    mediaController.k0 = lbcVar2;
                    lbcVar2.K = new dd(mediaController, i5, (byte) 10);
                    lbcVar2.i0(Uri.fromFile(file), "other");
                    mediaController.k0.w0(3);
                    mediaController.k0.g0();
                    return;
                } catch (Exception e) {
                    fa4.g(e, true);
                    lbc lbcVar3 = mediaController.k0;
                    if (lbcVar3 != null) {
                        lbcVar3.l0();
                        mediaController.k0 = null;
                        return;
                    }
                    return;
                }
            case 4:
                String[] strArr3 = MediaController.W1;
                ba4.G(((j5) this.b).a).X((TLRPC.TL_document) this.c, null, 1, 1);
                return;
            case 5:
                ((MediaController) ((ez3) this.b).b).y1.add((ByteBuffer) this.c);
                return;
            case 6:
                ox2 ox2Var = (ox2) this.b;
                k27 k27Var = (k27) this.c;
                MediaController mediaController2 = (MediaController) ox2Var.c;
                lbc lbcVar4 = mediaController2.j0;
                if ((lbcVar4 != null || mediaController2.F0 != null) && !mediaController2.h0) {
                    try {
                        lbc lbcVar5 = mediaController2.F0;
                        if (lbcVar5 != null) {
                            U = lbcVar5.U();
                            S = ((MediaController) ox2Var.c).F0.S();
                            if (S >= 0 && U > 0) {
                                float f4 = (float) U;
                                N = ((float) ((MediaController) ox2Var.c).F0.N()) / f4;
                                f2 = ((float) S) / f4;
                                if (f2 >= 1.0f) {
                                    return;
                                }
                            } else {
                                return;
                            }
                        } else {
                            U = lbcVar4.U();
                            S = ((MediaController) ox2Var.c).j0.S();
                            if (U >= 0) {
                                f = ((float) S) / ((float) U);
                            } else {
                                f = 0.0f;
                            }
                            N = ((float) ((MediaController) ox2Var.c).j0.N()) / ((float) U);
                            if (U != -9223372036854775807L && S >= 0 && ((MediaController) ox2Var.c).u0 == 0.0f) {
                                f2 = f;
                            } else {
                                return;
                            }
                        }
                        MediaController mediaController3 = (MediaController) ox2Var.c;
                        k27Var.j0 = (int) (U / 1000);
                        k27Var.b0 = f2;
                        k27Var.i0 = (int) (S / 1000);
                        k27Var.e0 = S;
                        k27Var.f0 = U;
                        k27Var.g0 = N;
                        if (f2 >= 0.0f && mediaController3.o0 != null) {
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            MediaController mediaController4 = (MediaController) ox2Var.c;
                            if (elapsedRealtime - mediaController4.p0 >= 1000) {
                                String str = mediaController4.o0;
                                mediaController4.p0 = SystemClock.elapsedRealtime();
                                Utilities.e.c(new ul6(str, f2, (byte) 0));
                            }
                        }
                        kk7.f(k27Var.K1).k(148, Integer.valueOf(k27Var.e1()), Float.valueOf(f2));
                        return;
                    } catch (Exception e2) {
                        fa4.g(e2, true);
                        return;
                    }
                }
                return;
            case 7:
                em6 em6Var = (em6) this.b;
                k27 k27Var2 = (k27) this.c;
                TLRPC.Document F0 = k27Var2.F0();
                TLRPC.Document document = k27Var2.f3;
                if (document != null) {
                    F0 = document;
                }
                if (F0 != null) {
                    em6Var.d.put(ba4.r(null, F0), k27Var2);
                    ba4 G = ba4.G(em6Var.a.a);
                    if (!k27.Q5(k27Var2.k)) {
                        i3 = 0;
                    }
                    G.X(F0, k27Var2, 3, i3);
                    return;
                }
                return;
            case 8:
                hq6 hq6Var = (hq6) this.b;
                TLRPC.TL_contacts_topPeers tL_contacts_topPeers = (TLRPC.TL_contacts_topPeers) this.c;
                try {
                    hq6Var.getMessagesStorage().b.executeFast("DELETE FROM chat_hints WHERE 1").stepThis().dispose();
                    hq6Var.getMessagesStorage().b.beginTransaction();
                    hq6Var.getMessagesStorage().j1(tL_contacts_topPeers.users, tL_contacts_topPeers.chats, false, false);
                    SQLitePreparedStatement executeFast = hq6Var.getMessagesStorage().b.executeFast("REPLACE INTO chat_hints VALUES(?, ?, ?, ?)");
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
                            executeFast.bindLong(1, k27.B1(tL_topPeer.peer));
                            executeFast.bindInteger(2, i);
                            executeFast.bindDouble(3, tL_topPeer.rating);
                            executeFast.bindInteger(4, 0);
                            executeFast.step();
                        }
                    }
                    executeFast.dispose();
                    hq6Var.getMessagesStorage().b.commitTransaction();
                    gl.c3(new un6(hq6Var, (byte) 7));
                    return;
                } catch (Exception e3) {
                    fa4.g(e3, true);
                    return;
                }
            case 9:
                boolean[] zArr = (boolean[]) this.b;
                zo6 zo6Var = (zo6) this.c;
                if (!zArr[0]) {
                    zo6Var.run();
                    zArr[0] = true;
                    return;
                }
                return;
            case 10:
                hq6 hq6Var2 = (hq6) this.b;
                TLRPC.StickerSet stickerSet2 = (TLRPC.StickerSet) this.c;
                try {
                    SQLiteCursor queryFinalized = hq6Var2.getMessagesStorage().b.queryFinalized("SELECT document FROM web_recent_v3 WHERE id = 's_" + stickerSet2.id + "'", new Object[0]);
                    if (queryFinalized.next() && !queryFinalized.isNull(0) && (byteBufferValue = queryFinalized.byteBufferValue(0)) != null) {
                        tL_messages_stickerSet = TLRPC.messages_StickerSet.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                        byteBufferValue.reuse();
                    }
                    queryFinalized.dispose();
                    if (tL_messages_stickerSet == null || (stickerSet = tL_messages_stickerSet.set) == null || stickerSet.hash != stickerSet2.hash) {
                        hq6Var2.N0(stickerSet2, false);
                    }
                    if (tL_messages_stickerSet != null && tL_messages_stickerSet.set != null) {
                        gl.c3(new sn6(hq6Var2, tL_messages_stickerSet, (byte) 1));
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    fa4.g(th, true);
                    return;
                }
            case 11:
                Runnable runnable = (Runnable) this.c;
                if (((AtomicInteger) this.b).decrementAndGet() == 0 && runnable != null) {
                    gl.c3(runnable);
                    return;
                }
                return;
            case 12:
                ArrayList arrayList = ((hq6) ((tq4) this.b).c).B0;
                arrayList.clear();
                arrayList.addAll((ArrayList) this.c);
                return;
            case 13:
                ArrayList arrayList2 = ((hq6) ((jq) this.b).d).B0;
                arrayList2.clear();
                arrayList2.addAll((ArrayList) this.c);
                kk7.e().k(300, new Object[0]);
                return;
            case 14:
                ((tv6) this.b).getClass();
                ((Runnable) this.c).run();
                return;
            case 15:
                tv6 tv6Var = (tv6) this.b;
                ad8 ad8Var = (ad8) this.c;
                lw6 lw6Var = tv6Var.h;
                tv6Var.t = ad8Var;
                fm6 fm6Var = new fm6(tv6Var, ad8Var);
                ad8Var.y(fm6Var);
                tv6Var.u = fm6Var;
                try {
                    lw6Var.l.t(0, ad8Var);
                } catch (RemoteException e4) {
                    lad.d("MediaSessionImpl", "Exception in using media1 API", e4);
                }
                ((bv6) lw6Var.p.b).a.setActive(true);
                j54 U2 = ad8Var.U();
                l6a R0 = ad8Var.R0();
                nc8 Q0 = ad8Var.Q0();
                nc8 Q02 = ad8Var.Q0();
                zb8 g = ad8Var.g();
                int x0 = ad8Var.x0();
                boolean F02 = ad8Var.F0();
                icc B = ad8Var.B();
                aob T0 = ad8Var.T0();
                if (ad8Var.m0(18)) {
                    jr6Var = ad8Var.g0();
                } else {
                    jr6Var = jr6.M;
                }
                jr6 jr6Var2 = jr6Var;
                if (ad8Var.m0(22)) {
                    f3 = ad8Var.D();
                }
                float f5 = f3;
                if (ad8Var.m0(21)) {
                    nzVar = ad8Var.F();
                } else {
                    nzVar = nz.i;
                }
                nz nzVar2 = nzVar;
                if (ad8Var.m0(28)) {
                    v33Var = ad8Var.h0();
                } else {
                    v33Var = v33.d;
                }
                v33 v33Var2 = v33Var;
                de3 H = ad8Var.H();
                if (ad8Var.m0(23)) {
                    i2 = ad8Var.i();
                } else {
                    i2 = 0;
                }
                if (ad8Var.m0(23) && ad8Var.z0()) {
                    z = true;
                } else {
                    z = false;
                }
                boolean s = ad8Var.s();
                int v0 = ad8Var.v0();
                int h = ad8Var.h();
                boolean j = ad8Var.j();
                boolean d = ad8Var.d();
                jr6 U0 = ad8Var.U0();
                long O0 = ad8Var.O0();
                long X = ad8Var.X();
                long x = ad8Var.x();
                if (ad8Var.m0(30)) {
                    eybVar = ad8Var.f0();
                } else {
                    eybVar = eyb.b;
                }
                tv6Var.s = new wc8(U2, 0, R0, Q0, Q02, 0, g, x0, F02, B, T0, 0, jr6Var2, f5, 1.0f, nzVar2, 0, v33Var2, H, i2, z, s, 1, v0, h, j, d, U0, O0, X, x, eybVar, ad8Var.G0());
                tv6Var.f(ad8Var.q());
                return;
            case 16:
                am5 am5Var = (am5) this.b;
                ResultReceiver resultReceiver = (ResultReceiver) this.c;
                try {
                    o6aVar = (o6a) am5Var.a;
                    gre.l(o6aVar, "SessionResult must not be null");
                } catch (InterruptedException e5) {
                    e = e5;
                    lad.g("MediaSessionLegacyStub", "Custom command failed", e);
                    o6aVar = new o6a(-1);
                } catch (CancellationException e6) {
                    lad.g("MediaSessionLegacyStub", "Custom command cancelled", e6);
                    o6aVar = new o6a(1);
                } catch (ExecutionException e7) {
                    e = e7;
                    lad.g("MediaSessionLegacyStub", "Custom command failed", e);
                    o6aVar = new o6a(-1);
                }
                resultReceiver.send(o6aVar.a, o6aVar.b);
                return;
            case 17:
                ((us2) this.b).accept((vx6) this.c);
                return;
            case 18:
                l7 l7Var = (l7) this.c;
                ((vy1) this.b).v0(true);
                l7Var.requestFocus();
                gl.c3(new ar5(l7Var, (byte) 3));
                return;
            case 19:
                xy6 xy6Var = (xy6) this.b;
                ly6 ly6Var = (ly6) this.c;
                int i8 = xy6Var.k;
                d dVar = xy6Var.g;
                TLRPC.TL_chatInviteImporter importer = ly6Var.getImporter();
                xy6Var.r = importer;
                LongSparseArray longSparseArray = xy6Var.d;
                TLRPC.User user = (TLRPC.User) longSparseArray.get(importer.user_id);
                if (user != null) {
                    dVar.getMessagesController().a4(user, false, false);
                    Point point = gl.q;
                    if (point.x > point.y) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (user.photo != null && !z2) {
                        if (xy6Var.s == null) {
                            wy6 wy6Var = new wy6(xy6Var, dVar.getParentActivity(), (o39) ly6Var.getParent(), dVar.getResourceProvider(), xy6Var.a);
                            xy6Var.s = wy6Var;
                            TLRPC.TL_chatInviteImporter tL_chatInviteImporter = xy6Var.r;
                            be0 avatarImageView = ly6Var.getAvatarImageView();
                            TextView textView = wy6Var.e;
                            sp8 sp8Var = wy6Var.h;
                            wy6Var.r = tL_chatInviteImporter;
                            wy6Var.w = avatarImageView;
                            TLRPC.User V1 = na7.q1(i8).V1(Long.valueOf(tL_chatInviteImporter.user_id));
                            gl5 m = gl5.m(i8, 0, V1);
                            gl5 m2 = gl5.m(i8, 1, V1);
                            if (na7.q1(i8).W1(tL_chatInviteImporter.user_id) == null) {
                                na7.q1(i8).i3(0, V1, false);
                            }
                            sp8Var.setParentAvatarImage(avatarImageView);
                            sp8Var.M(tL_chatInviteImporter.user_id, true);
                            sp8Var.H(null, m, m2, true);
                            wy6Var.d.setText(l7c.r((TLRPC.User) longSparseArray.get(tL_chatInviteImporter.user_id)));
                            textView.setText(tL_chatInviteImporter.about);
                            if (TextUtils.isEmpty(tL_chatInviteImporter.about)) {
                                i4 = 8;
                            }
                            textView.setVisibility(i4);
                            wy6Var.E.requestLayout();
                            xy6Var.s.setOnDismissListener(new n1(xy6Var, (byte) 26));
                            xy6Var.s.show();
                            return;
                        }
                        return;
                    }
                    xy6Var.b = true;
                    dVar.dismissCurrentDialog();
                    Bundle bundle = new Bundle();
                    ProfileActivity profileActivity = new ProfileActivity(bundle, null);
                    bundle.putLong("user_id", user.id);
                    bundle.putBoolean("removeFragmentOnChatOpen", false);
                    dVar.presentFragment(profileActivity);
                    return;
                }
                return;
            case 20:
                k27 k27Var3 = (k27) this.b;
                k27Var3.n = (TLRPC.Document) this.c;
                kk7.f(k27Var3.K1).k(116, k27Var3);
                return;
            case 21:
                s47 s47Var = (s47) this.b;
                TL_stats.TL_statsGraphError tL_statsGraphError = (TL_stats.TL_statsGraphError) this.c;
                if (s47Var.getParentActivity() != null) {
                    Toast.makeText(s47Var.getParentActivity(), tL_statsGraphError.error, 1).show();
                    return;
                }
                return;
            case 22:
                na7 na7Var = (na7) this.b;
                TL_update.TL_updateMessageID tL_updateMessageID = (TL_update.TL_updateMessageID) this.c;
                long[] X1 = na7Var.getMessagesStorage().X1(tL_updateMessageID.random_id, 0L, null, tL_updateMessageID.id, 0, -1, 0);
                if (X1 != null) {
                    gl.c3(new lo6(na7Var, X1, tL_updateMessageID, (byte) 16));
                    return;
                }
                return;
            case 23:
                na7 na7Var2 = (na7) this.b;
                TLRPC.updates_Difference updates_difference = (TLRPC.updates_Difference) this.c;
                na7Var2.i1.clear();
                na7Var2.p1.clear();
                na7Var2.b4(updates_difference.users, false);
                na7Var2.V3(updates_difference.chats, false);
                return;
            case 24:
                TL_update.TL_updateServiceNotification tL_updateServiceNotification = (TL_update.TL_updateServiceNotification) this.c;
                ((na7) this.b).getNotificationCenter().k(75, 2, tL_updateServiceNotification.message, tL_updateServiceNotification.type);
                return;
            case 25:
                TL_update.TL_updateGroupCallMessage tL_updateGroupCallMessage = (TL_update.TL_updateGroupCallMessage) this.c;
                ((na7) this.b).getNotificationCenter().k(177, Long.valueOf(tL_updateGroupCallMessage.call.id), tL_updateGroupCallMessage, Boolean.FALSE);
                return;
            case 26:
                TL_update.TL_updateDeleteGroupCallMessages tL_updateDeleteGroupCallMessages = (TL_update.TL_updateDeleteGroupCallMessages) this.c;
                ((na7) this.b).getNotificationCenter().k(177, Long.valueOf(tL_updateDeleteGroupCallMessages.call.id), tL_updateDeleteGroupCallMessages, Boolean.FALSE);
                return;
            case 27:
                TL_update.TL_updateUserTyping tL_updateUserTyping = (TL_update.TL_updateUserTyping) this.c;
                ((na7) this.b).getNotificationCenter().k(299, Long.valueOf(tL_updateUserTyping.user_id), tL_updateUserTyping.action);
                return;
            case 28:
                TL_update.TL_updateChatUserTyping tL_updateChatUserTyping = (TL_update.TL_updateChatUserTyping) this.c;
                ((na7) this.b).getNotificationCenter().k(299, Long.valueOf(-tL_updateChatUserTyping.chat_id), tL_updateChatUserTyping.action);
                return;
            default:
                na7 na7Var3 = (na7) this.b;
                na7Var3.getClass();
                na7Var3.H0(((TL_update.TL_updateChannel) this.c).channel_id, 1, 0L, null);
                return;
        }
    }

    public oh6(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}
