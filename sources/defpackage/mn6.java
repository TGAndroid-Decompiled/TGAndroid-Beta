package defpackage;

import android.graphics.Point;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.widget.TextView;
import android.widget.Toast;
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
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.ProfileActivity;
public final class mn6 implements Runnable {
    public final byte a;
    public final Object b;
    public final Object c;

    public mn6(yx6 yx6Var, xw6 xw6Var, Runnable runnable) {
        this.a = (byte) 11;
        this.b = yx6Var;
        this.c = runnable;
    }

    @Override
    public final void run() {
        long U;
        long S;
        float f;
        float f2;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        TLRPC.StickerSet stickerSet;
        NativeByteBuffer byteBufferValue;
        int i;
        nt6 nt6Var;
        oz ozVar;
        n43 n43Var;
        int i2;
        boolean z;
        f2c f2cVar;
        gaa gaaVar;
        boolean z2;
        float f3 = 1.0f;
        int i3 = 2;
        int i4 = 0;
        switch (this.a) {
            case 0:
                String[] strArr = MediaController.W1;
                xb4.G(((k5) this.b).a).X((TLRPC.TL_document) this.c, null, 1, 1);
                return;
            case 1:
                String[] strArr2 = MediaController.W1;
                ((MediaController) this.b).U((r47) this.c, true);
                return;
            case 2:
                ((MediaController) ((zz3) this.b).b).y1.add((ByteBuffer) this.c);
                return;
            case 3:
                iy2 iy2Var = (iy2) this.b;
                r47 r47Var = (r47) this.c;
                MediaController mediaController = (MediaController) iy2Var.c;
                kfc kfcVar = mediaController.j0;
                if ((kfcVar != null || mediaController.F0 != null) && !mediaController.h0) {
                    try {
                        kfc kfcVar2 = mediaController.F0;
                        if (kfcVar2 != null) {
                            U = kfcVar2.U();
                            S = ((MediaController) iy2Var.c).F0.S();
                            if (S >= 0 && U > 0) {
                                float f4 = (float) U;
                                f2 = ((float) ((MediaController) iy2Var.c).F0.N()) / f4;
                                f = ((float) S) / f4;
                                if (f >= 1.0f) {
                                    return;
                                }
                            } else {
                                return;
                            }
                        } else {
                            U = kfcVar.U();
                            S = ((MediaController) iy2Var.c).j0.S();
                            if (U >= 0) {
                                f = ((float) S) / ((float) U);
                            } else {
                                f = 0.0f;
                            }
                            float N = ((float) ((MediaController) iy2Var.c).j0.N()) / ((float) U);
                            if (U != -9223372036854775807L && S >= 0 && ((MediaController) iy2Var.c).u0 == 0.0f) {
                                f2 = N;
                            } else {
                                return;
                            }
                        }
                        MediaController mediaController2 = (MediaController) iy2Var.c;
                        r47Var.j0 = (int) (U / 1000);
                        r47Var.b0 = f;
                        r47Var.i0 = (int) (S / 1000);
                        r47Var.e0 = S;
                        r47Var.f0 = U;
                        r47Var.g0 = f2;
                        if (f >= 0.0f && mediaController2.o0 != null) {
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            MediaController mediaController3 = (MediaController) iy2Var.c;
                            if (elapsedRealtime - mediaController3.p0 >= 1000) {
                                String str = mediaController3.o0;
                                mediaController3.p0 = SystemClock.elapsedRealtime();
                                Utilities.e.c(new bo6(str, f, (byte) 0));
                            }
                        }
                        jn7.f(r47Var.K1).k(149, Integer.valueOf(r47Var.e1()), Float.valueOf(f));
                        return;
                    } catch (Exception e) {
                        cc4.g(e, true);
                        return;
                    }
                }
                return;
            case 4:
                jo6 jo6Var = (jo6) this.b;
                r47 r47Var2 = (r47) this.c;
                TLRPC.Document F0 = r47Var2.F0();
                TLRPC.Document document = r47Var2.f3;
                if (document != null) {
                    F0 = document;
                }
                if (F0 != null) {
                    jo6Var.d.put(xb4.r(null, F0), r47Var2);
                    xb4 G = xb4.G(jo6Var.a.a);
                    if (!r47.Q5(r47Var2.k)) {
                        i3 = 0;
                    }
                    G.X(F0, r47Var2, 3, i3);
                    return;
                }
                return;
            case 5:
                Runnable runnable = (Runnable) this.c;
                if (((AtomicInteger) this.b).decrementAndGet() == 0 && runnable != null) {
                    hl.c3(runnable);
                    return;
                }
                return;
            case 6:
                boolean[] zArr = (boolean[]) this.b;
                fr6 fr6Var = (fr6) this.c;
                if (!zArr[0]) {
                    fr6Var.run();
                    zArr[0] = true;
                    return;
                }
                return;
            case 7:
                ls6 ls6Var = (ls6) this.b;
                TLRPC.StickerSet stickerSet2 = (TLRPC.StickerSet) this.c;
                try {
                    SQLiteCursor queryFinalized = ls6Var.getMessagesStorage().b.queryFinalized("SELECT document FROM web_recent_v3 WHERE id = 's_" + stickerSet2.id + "'", new Object[0]);
                    if (queryFinalized.next() && !queryFinalized.isNull(0) && (byteBufferValue = queryFinalized.byteBufferValue(0)) != null) {
                        tL_messages_stickerSet = TLRPC.messages_StickerSet.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                        byteBufferValue.reuse();
                    } else {
                        tL_messages_stickerSet = null;
                    }
                    queryFinalized.dispose();
                    if (tL_messages_stickerSet == null || (stickerSet = tL_messages_stickerSet.set) == null || stickerSet.hash != stickerSet2.hash) {
                        ls6Var.N0(stickerSet2, false);
                    }
                    if (tL_messages_stickerSet != null && tL_messages_stickerSet.set != null) {
                        hl.c3(new mp6(ls6Var, tL_messages_stickerSet, (byte) 0));
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    cc4.g(th, true);
                    return;
                }
            case 8:
                ls6 ls6Var2 = (ls6) this.b;
                TLRPC.TL_contacts_topPeers tL_contacts_topPeers = (TLRPC.TL_contacts_topPeers) this.c;
                try {
                    ls6Var2.getMessagesStorage().b.executeFast("DELETE FROM chat_hints WHERE 1").stepThis().dispose();
                    ls6Var2.getMessagesStorage().b.beginTransaction();
                    ls6Var2.getMessagesStorage().n1(tL_contacts_topPeers.users, tL_contacts_topPeers.chats, false, false);
                    SQLitePreparedStatement executeFast = ls6Var2.getMessagesStorage().b.executeFast("REPLACE INTO chat_hints VALUES(?, ?, ?, ?)");
                    for (int i5 = 0; i5 < tL_contacts_topPeers.categories.size(); i5++) {
                        TLRPC.TL_topPeerCategoryPeers tL_topPeerCategoryPeers = tL_contacts_topPeers.categories.get(i5);
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
                        for (int i6 = 0; i6 < tL_topPeerCategoryPeers.peers.size(); i6++) {
                            TLRPC.TL_topPeer tL_topPeer = tL_topPeerCategoryPeers.peers.get(i6);
                            executeFast.requery();
                            executeFast.bindLong(1, r47.B1(tL_topPeer.peer));
                            executeFast.bindInteger(2, i);
                            executeFast.bindDouble(3, tL_topPeer.rating);
                            executeFast.bindInteger(4, 0);
                            executeFast.step();
                        }
                    }
                    executeFast.dispose();
                    ls6Var2.getMessagesStorage().b.commitTransaction();
                    hl.c3(new ip6(ls6Var2, (byte) 6));
                    return;
                } catch (Exception e2) {
                    cc4.g(e2, true);
                    return;
                }
            case 9:
                ArrayList arrayList = ((ls6) ((xs4) this.b).c).B0;
                arrayList.clear();
                arrayList.addAll((ArrayList) this.c);
                return;
            case 10:
                ArrayList arrayList2 = ((ls6) ((kq) this.b).d).B0;
                arrayList2.clear();
                arrayList2.addAll((ArrayList) this.c);
                jn7.e().k(301, new Object[0]);
                return;
            case 11:
                ((yx6) this.b).getClass();
                ((Runnable) this.c).run();
                return;
            case 12:
                yx6 yx6Var = (yx6) this.b;
                og8 og8Var = (og8) this.c;
                qy6 qy6Var = yx6Var.h;
                yx6Var.t = og8Var;
                ko6 ko6Var = new ko6(yx6Var, og8Var);
                og8Var.y(ko6Var);
                yx6Var.u = ko6Var;
                try {
                    qy6Var.l.t(0, og8Var);
                } catch (RemoteException e3) {
                    efd.d("MediaSessionImpl", "Exception in using media1 API", e3);
                }
                ((gx6) qy6Var.p.b).a.setActive(true);
                e64 U2 = og8Var.U();
                daa R0 = og8Var.R0();
                cg8 Q0 = og8Var.Q0();
                cg8 Q02 = og8Var.Q0();
                of8 f5 = og8Var.f();
                int x0 = og8Var.x0();
                boolean F02 = og8Var.F0();
                ggc B = og8Var.B();
                asb T0 = og8Var.T0();
                if (og8Var.m0(18)) {
                    nt6Var = og8Var.g0();
                } else {
                    nt6Var = nt6.M;
                }
                nt6 nt6Var2 = nt6Var;
                if (og8Var.m0(22)) {
                    f3 = og8Var.D();
                }
                float f6 = f3;
                if (og8Var.m0(21)) {
                    ozVar = og8Var.F();
                } else {
                    ozVar = oz.i;
                }
                oz ozVar2 = ozVar;
                if (og8Var.m0(28)) {
                    n43Var = og8Var.h0();
                } else {
                    n43Var = n43.d;
                }
                n43 n43Var2 = n43Var;
                xe3 H = og8Var.H();
                if (og8Var.m0(23)) {
                    i2 = og8Var.l();
                } else {
                    i2 = 0;
                }
                if (og8Var.m0(23) && og8Var.z0()) {
                    z = true;
                } else {
                    z = false;
                }
                boolean s = og8Var.s();
                int v0 = og8Var.v0();
                int h = og8Var.h();
                boolean i7 = og8Var.i();
                boolean e4 = og8Var.e();
                nt6 U0 = og8Var.U0();
                long O0 = og8Var.O0();
                long X = og8Var.X();
                long x = og8Var.x();
                if (og8Var.m0(30)) {
                    f2cVar = og8Var.f0();
                } else {
                    f2cVar = f2c.b;
                }
                yx6Var.s = new kg8(U2, 0, R0, Q0, Q02, 0, f5, x0, F02, B, T0, 0, nt6Var2, f6, 1.0f, ozVar2, 0, n43Var2, H, i2, z, s, 1, v0, h, i7, e4, U0, O0, X, x, f2cVar, og8Var.G0());
                yx6Var.f(og8Var.q());
                return;
            case 13:
                do5 do5Var = (do5) this.b;
                ResultReceiver resultReceiver = (ResultReceiver) this.c;
                try {
                    gaaVar = (gaa) do5Var.a;
                    yve.l(gaaVar, "SessionResult must not be null");
                } catch (InterruptedException e5) {
                    e = e5;
                    efd.g("MediaSessionLegacyStub", "Custom command failed", e);
                    gaaVar = new gaa(-1);
                } catch (CancellationException e6) {
                    efd.g("MediaSessionLegacyStub", "Custom command cancelled", e6);
                    gaaVar = new gaa(1);
                } catch (ExecutionException e7) {
                    e = e7;
                    efd.g("MediaSessionLegacyStub", "Custom command failed", e);
                    gaaVar = new gaa(-1);
                }
                resultReceiver.send(gaaVar.a, gaaVar.b);
                return;
            case 14:
                ((ot2) this.b).accept((zz6) this.c);
                return;
            case 15:
                m7 m7Var = (m7) this.c;
                ((nz1) this.b).w0(true);
                m7Var.requestFocus();
                hl.c3(new ct5(m7Var, (byte) 3));
                return;
            case 16:
                e17 e17Var = (e17) this.b;
                s07 s07Var = (s07) this.c;
                int i8 = e17Var.k;
                e eVar = e17Var.g;
                TLRPC.TL_chatInviteImporter importer = s07Var.getImporter();
                e17Var.r = importer;
                LongSparseArray longSparseArray = e17Var.d;
                TLRPC.User user = (TLRPC.User) longSparseArray.get(importer.user_id);
                if (user != null) {
                    eVar.getMessagesController().i4(user, false, false);
                    Point point = hl.q;
                    if (point.x > point.y) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (user.photo != null && !z2) {
                        if (e17Var.s == null) {
                            d17 d17Var = new d17(e17Var, eVar.getParentActivity(), (d79) s07Var.getParent(), eVar.getResourceProvider(), e17Var.a);
                            e17Var.s = d17Var;
                            TLRPC.TL_chatInviteImporter tL_chatInviteImporter = e17Var.r;
                            de0 avatarImageView = s07Var.getAvatarImageView();
                            TextView textView = d17Var.e;
                            et8 et8Var = d17Var.h;
                            d17Var.r = tL_chatInviteImporter;
                            d17Var.w = avatarImageView;
                            TLRPC.User X1 = uc7.s1(i8).X1(Long.valueOf(tL_chatInviteImporter.user_id));
                            jn5 m = jn5.m(i8, 0, X1);
                            jn5 m2 = jn5.m(i8, 1, X1);
                            if (uc7.s1(i8).Y1(tL_chatInviteImporter.user_id) == null) {
                                uc7.s1(i8).o3(0, X1, false);
                            }
                            et8Var.setParentAvatarImage(avatarImageView);
                            et8Var.M(tL_chatInviteImporter.user_id, true);
                            et8Var.H(null, m, m2, true);
                            d17Var.d.setText(lbc.r((TLRPC.User) longSparseArray.get(tL_chatInviteImporter.user_id)));
                            textView.setText(tL_chatInviteImporter.about);
                            if (TextUtils.isEmpty(tL_chatInviteImporter.about)) {
                                i4 = 8;
                            }
                            textView.setVisibility(i4);
                            d17Var.E.requestLayout();
                            e17Var.s.setOnDismissListener(new o1(e17Var, (byte) 26));
                            e17Var.s.show();
                            return;
                        }
                        return;
                    }
                    e17Var.b = true;
                    eVar.dismissCurrentDialog();
                    Bundle bundle = new Bundle();
                    ProfileActivity profileActivity = new ProfileActivity(bundle, null);
                    bundle.putLong("user_id", user.id);
                    bundle.putBoolean("removeFragmentOnChatOpen", false);
                    eVar.presentFragment(profileActivity);
                    return;
                }
                return;
            case 17:
                r47 r47Var3 = (r47) this.b;
                r47Var3.n = (TLRPC.Document) this.c;
                jn7.f(r47Var3.K1).k(117, r47Var3);
                return;
            case 18:
                z67 z67Var = (z67) this.b;
                TL_stats.TL_statsGraphError tL_statsGraphError = (TL_stats.TL_statsGraphError) this.c;
                if (z67Var.getParentActivity() != null) {
                    Toast.makeText(z67Var.getParentActivity(), tL_statsGraphError.error, 1).show();
                    return;
                }
                return;
            case 19:
                uc7 uc7Var = (uc7) this.b;
                TL_update.TL_updateMessageID tL_updateMessageID = (TL_update.TL_updateMessageID) this.c;
                long[] c2 = uc7Var.getMessagesStorage().c2(tL_updateMessageID.random_id, 0L, null, tL_updateMessageID.id, 0, -1, 0);
                if (c2 != null) {
                    hl.c3(new yg6(uc7Var, c2, tL_updateMessageID, (byte) 18));
                    return;
                }
                return;
            case 20:
                uc7 uc7Var2 = (uc7) this.b;
                TLRPC.updates_Difference updates_difference = (TLRPC.updates_Difference) this.c;
                uc7Var2.i1.clear();
                uc7Var2.p1.clear();
                uc7Var2.j4(updates_difference.users, false);
                uc7Var2.c4(updates_difference.chats, false);
                return;
            case 21:
                TL_update.TL_updateServiceNotification tL_updateServiceNotification = (TL_update.TL_updateServiceNotification) this.c;
                ((uc7) this.b).getNotificationCenter().k(76, 2, tL_updateServiceNotification.message, tL_updateServiceNotification.type);
                return;
            case 22:
                TL_update.TL_updateGroupCallMessage tL_updateGroupCallMessage = (TL_update.TL_updateGroupCallMessage) this.c;
                ((uc7) this.b).getNotificationCenter().k(178, Long.valueOf(tL_updateGroupCallMessage.call.id), tL_updateGroupCallMessage, Boolean.FALSE);
                return;
            case 23:
                TL_update.TL_updateDeleteGroupCallMessages tL_updateDeleteGroupCallMessages = (TL_update.TL_updateDeleteGroupCallMessages) this.c;
                ((uc7) this.b).getNotificationCenter().k(178, Long.valueOf(tL_updateDeleteGroupCallMessages.call.id), tL_updateDeleteGroupCallMessages, Boolean.FALSE);
                return;
            case 24:
                TL_update.TL_updateUserTyping tL_updateUserTyping = (TL_update.TL_updateUserTyping) this.c;
                ((uc7) this.b).getNotificationCenter().k(300, Long.valueOf(tL_updateUserTyping.user_id), tL_updateUserTyping.action);
                return;
            case 25:
                TL_update.TL_updateChatUserTyping tL_updateChatUserTyping = (TL_update.TL_updateChatUserTyping) this.c;
                ((uc7) this.b).getNotificationCenter().k(300, Long.valueOf(-tL_updateChatUserTyping.chat_id), tL_updateChatUserTyping.action);
                return;
            case 26:
                uc7 uc7Var3 = (uc7) this.b;
                TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant = (TLRPC.TL_channels_channelParticipant) this.c;
                uc7Var3.j4(tL_channels_channelParticipant.users, false);
                uc7Var3.c4(tL_channels_channelParticipant.chats, false);
                return;
            case 27:
                ((uc7) this.b).getNotificationCenter().k(76, 4, ((TLRPC.TL_help_termsOfServiceUpdate) this.c).terms_of_service);
                return;
            case 28:
                uc7 uc7Var4 = (uc7) this.b;
                rj4 rj4Var = (rj4) this.c;
                if (rj4Var != null) {
                    rj4Var.run();
                }
                uc7Var4.getNotificationCenter().k(2, 2);
                uc7Var4.getNotificationCenter().k(40, new Object[0]);
                return;
            default:
                ((uc7) this.b).W2((TLRPC.TL_help_appConfig) this.c);
                return;
        }
    }

    public mn6(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}
