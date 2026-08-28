package ih;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.CacheByChatsController;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.yd;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.dj0;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.jb0;
import org.telegram.ui.Components.nk0;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.ok0;
import org.telegram.ui.Components.x60;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.bj;
import org.telegram.ui.bq;
import org.telegram.ui.cn;
import org.telegram.ui.dp;
import org.telegram.ui.dy;
import org.telegram.ui.gb;
import org.telegram.ui.ho;
import org.telegram.ui.hp;
import org.telegram.ui.id;
import org.telegram.ui.io;
import org.telegram.ui.lb;
import org.telegram.ui.nf1;
import org.telegram.ui.on;
import org.telegram.ui.pb;
import org.telegram.ui.qn;
import org.telegram.ui.vh;
import org.telegram.ui.vo;
import org.telegram.ui.we1;
import org.telegram.ui.wx;
public final class v3 implements kh.w8, org.telegram.ui.ActionBar.b2, y8.d, nk0, ok0, org.telegram.ui.Cells.v, wx, org.telegram.ui.u4, org.telegram.ui.Components.x4, MessagesController.ErrorDelegate, LanguageDetector.ExceptionCallback, dj0, MessagesStorage.BooleanCallback, ResultCallback, MessagesStorage.LongCallback, nf1 {
    public final int f12229a;
    public final Object f12230b;
    public final Object f12231c;

    public v3(int i9, Object obj, Object obj2) {
        this.f12229a = i9;
        this.f12230b = obj;
        this.f12231c = obj2;
    }

    @Override
    public void B(int i9, int i10, boolean z10) {
        switch (this.f12229a) {
            case 14:
                qn qnVar = (qn) this.f12230b;
                qnVar.l8(null, null);
                SendMessagesHelper.prepareSendingPhoto(qnVar.getAccountInstance(), null, (Uri) this.f12231c, qnVar.P5, qnVar.f41959j5, qnVar.T3, qnVar.f41934h5, null, null, null, null, 0, qnVar.f41982l5, z10, i9, qnVar.N3, qnVar.C8());
                return;
            case 15:
            default:
                cn cnVar = (cn) this.f12230b;
                MessageObject messageObject = (MessageObject) this.f12231c;
                if (z10) {
                    cnVar.f37236a.getMessagesController().approveSuggestedMessage(DialogObject.getPeerDialogId(messageObject.messageOwner.peer_id), messageObject.messageOwner.f22401id, i9);
                    return;
                } else {
                    cnVar.getClass();
                    return;
                }
            case 16:
                qn qnVar2 = (qn) this.f12230b;
                qnVar2.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of((String) this.f12231c, qnVar2.P5, qnVar2.f41959j5, qnVar2.T3, null, false, null, null, null, z10, i9, 0, null, false));
                qnVar2.U.setFieldText("");
                qnVar2.e9(false);
                return;
        }
    }

    @Override
    public boolean C() {
        return false;
    }

    @Override
    public Object H1(b3.b bVar) {
        String str = (String) this.f12230b;
        y8.a aVar = (y8.a) this.f12231c;
        try {
            Trace.beginSection(str);
            return aVar.f49625f.H1(bVar);
        } finally {
            Trace.endSection();
        }
    }

    @Override
    public boolean I(dy dyVar) {
        return false;
    }

    @Override
    public boolean a(int i9, View view) {
        return mh.u3.A0((mh.u3) this.f12230b, (Context) this.f12231c, view, i9);
    }

    @Override
    public void b(org.telegram.ui.c5 c5Var) {
        gb gbVar = (gb) this.f12230b;
        TLRPC.User user = (TLRPC.User) this.f12231c;
        int ordinal = c5Var.ordinal();
        if (ordinal != 0) {
            if (ordinal == 3) {
                lb lbVar = gbVar.f38496a;
                if (user != null) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", user.f22527id);
                    org.telegram.ui.ActionBar.o2 o2Var = lbVar.f40103n;
                    if (o2Var.getMessagesController().checkCanOpenChat(bundle, o2Var)) {
                        o2Var.presentFragment(new qn(bundle));
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        gbVar.a(user);
    }

    @Override
    public void c(float f10, float f11, int i9, View view) {
        long clientUserId;
        TLRPC.ChatParticipants chatParticipants;
        ArrayList<TLRPC.ChatParticipant> arrayList;
        int i10 = i9;
        switch (this.f12229a) {
            case 3:
                kh.n9 n9Var = (kh.n9) this.f12230b;
                Context context = (Context) this.f12231c;
                ArrayList arrayList2 = n9Var.H;
                a0.h hVar = n9Var.f15768b;
                kh.f9 f9Var = n9Var.f15776x;
                ArrayList arrayList3 = n9Var.f15769c;
                HashMap hashMap = n9Var.d;
                kh.t9 t9Var = n9Var.S;
                if (i10 < 0 || i10 >= arrayList2.size()) {
                    return;
                }
                kh.a9 a9Var = (kh.a9) arrayList2.get(i10);
                int i11 = a9Var.f48814a;
                int i12 = 0;
                if (i11 != 3) {
                    if (i11 != 7) {
                        if (i11 == 9) {
                            int i13 = a9Var.f14966q;
                            if (i13 == 0) {
                                kh.v9 v9Var = t9Var.Y;
                                if (v9Var != null) {
                                    v9Var.run();
                                    return;
                                }
                                return;
                            } else if (i13 == 1) {
                                TLRPC.InputPeer inputPeer = t9Var.f16098c;
                                if (inputPeer != null) {
                                    clientUserId = DialogObject.getPeerDialogId(inputPeer);
                                } else {
                                    clientUserId = UserConfig.getInstance(kh.t9.b1(t9Var)).getClientUserId();
                                }
                                x60 F = x60.F(n9Var, kh.t9.S(t9Var), view);
                                F.c(R.drawable.msg_addfolder, LocaleController.getString(R.string.StoriesAlbumNewAlbum), new bg.i2(n9Var, clientUserId, 9), false);
                                F.k();
                                x60.f(F, t9Var.i1().B(clientUserId, true), t9Var.v, false, null, new fh.f1(13, n9Var, F));
                                F.Z();
                                return;
                            } else if (i13 != 5) {
                                if (i13 == 6) {
                                    t9Var.C = false;
                                    n9Var.g(true);
                                    return;
                                }
                                return;
                            } else {
                                org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(n9Var.getContext(), 3, kh.t9.T(t9Var));
                                c2Var.q(500L);
                                TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = new TL_phone.getGroupCallStreamRtmpUrl();
                                getgroupcallstreamrtmpurl.live_story = true;
                                TLRPC.InputPeer inputPeer2 = t9Var.f16098c;
                                if (inputPeer2 == null) {
                                    inputPeer2 = new TLRPC.TL_inputPeerSelf();
                                }
                                getgroupcallstreamrtmpurl.peer = inputPeer2;
                                ConnectionsManager.getInstance(kh.t9.U(t9Var)).sendRequest(getgroupcallstreamrtmpurl, new bg.b0(n9Var, c2Var, getgroupcallstreamrtmpurl, 12));
                                return;
                            }
                        }
                        return;
                    } else if (view instanceof org.telegram.ui.Cells.p8) {
                        org.telegram.ui.Cells.p8 p8Var = (org.telegram.ui.Cells.p8) view;
                        p8Var.setChecked(!p8Var.b());
                        a9Var.f14960k = p8Var.b();
                        int i14 = a9Var.f14954c;
                        if (i14 == 0) {
                            boolean b10 = p8Var.b();
                            t9Var.f16105x = b10;
                            boolean z10 = t9Var.J == 4;
                            if (b10) {
                                gc G = new oc(t9Var.container, kh.t9.N(t9Var)).G(R.raw.ic_save_to_gallery, 4, LocaleController.getString(z10 ? R.string.StoryEnabledScreenshotsShare : R.string.StoryEnabledScreenshots));
                                G.f28737j = 5000;
                                G.k(true);
                                return;
                            }
                            gc G2 = new oc(t9Var.container, kh.t9.O(t9Var)).G(R.raw.passcode_lock_close, 4, LocaleController.getString(z10 ? R.string.StoryDisabledScreenshotsShare : R.string.StoryDisabledScreenshots));
                            G2.f28737j = 5000;
                            G2.k(true);
                            return;
                        } else if (i14 != 1) {
                            if (i14 == 2) {
                                t9Var.f16104w = p8Var.b();
                                n9Var.g(true);
                                return;
                            }
                            return;
                        } else {
                            boolean b11 = p8Var.b();
                            t9Var.f16106y = b11;
                            boolean z11 = t9Var.f16098c instanceof TLRPC.TL_inputPeerChannel;
                            if (b11) {
                                gc G3 = new oc(t9Var.container, kh.t9.Q(t9Var)).G(R.raw.msg_story_keep, 4, LocaleController.getString(z11 ? R.string.StoryChannelEnableKeep : R.string.StoryEnableKeep));
                                G3.f28737j = 5000;
                                G3.k(true);
                            } else {
                                gc G4 = new oc(t9Var.container, kh.t9.R(t9Var)).G(R.raw.fire_on, 4, LocaleController.getString(z11 ? R.string.StoryChannelDisableKeep : R.string.StoryDisableKeep));
                                G4.f28737j = 5000;
                                G4.k(true);
                            }
                            n9Var.g(true);
                            return;
                        }
                    } else {
                        return;
                    }
                } else if (a9Var.f14963n && t9Var.B) {
                    new kh.u8(context, kh.t9.G(t9Var), t9Var.G, t9Var.f16098c, new kh.d9(n9Var, 0), kh.t9.H(t9Var)).show();
                    return;
                } else {
                    int i15 = a9Var.f14958i;
                    if (i15 == 1) {
                        if (t9Var.J == 1 || kh.t9.I0(t9Var).isEmpty()) {
                            t9Var.I = 1;
                            t9Var.f16097b.D(1);
                        }
                        t9Var.J = 1;
                        n9Var.f(true);
                        return;
                    } else if (i15 == 3) {
                        if (t9Var.J == 3 || (t9Var.f16101n.isEmpty() && t9Var.f16102r.isEmpty())) {
                            t9Var.I = 3;
                            t9Var.f16097b.D(1);
                        }
                        t9Var.J = 3;
                        n9Var.f(true);
                        return;
                    } else if (i15 == 2) {
                        if (t9Var.J == 2) {
                            t9Var.I = 2;
                            t9Var.f16097b.D(1);
                        }
                        t9Var.J = 2;
                        n9Var.f(true);
                        return;
                    } else if (i15 == 4) {
                        if (t9Var.J == 4) {
                            t9Var.I = 4;
                            t9Var.f16097b.D(1);
                        }
                        t9Var.J = 4;
                        n9Var.f(true);
                        return;
                    } else {
                        if (i15 > 0) {
                            arrayList3.clear();
                            hashMap.clear();
                            t9Var.J = a9Var.f14958i;
                            f9Var.f15891c.a();
                        } else {
                            TLRPC.Chat chat = a9Var.h;
                            if (chat != null) {
                                long j10 = chat.f22380id;
                                if (kh.t9.d1(t9Var, chat) > 200) {
                                    try {
                                        n9Var.performHapticFeedback(3, 1);
                                    } catch (Throwable unused) {
                                    }
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(n9Var.getContext(), 0, kh.t9.I(t9Var));
                                    alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.GroupTooLarge);
                                    alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.GroupTooLargeMessage);
                                    org.telegram.messenger.l0.o(R.string.OK, alertDialog$Builder, null);
                                } else if (hashMap.containsKey(Long.valueOf(j10))) {
                                    ArrayList arrayList4 = (ArrayList) hashMap.get(Long.valueOf(j10));
                                    if (arrayList4 != null) {
                                        int size = arrayList4.size();
                                        while (i12 < size) {
                                            Object obj = arrayList4.get(i12);
                                            i12++;
                                            hVar.k(Boolean.FALSE, ((Long) obj).longValue());
                                        }
                                    }
                                    hashMap.remove(Long.valueOf(j10));
                                    n9Var.i(true);
                                } else {
                                    TLRPC.Chat chat2 = MessagesController.getInstance(kh.t9.J(t9Var)).getChat(Long.valueOf(j10));
                                    TLRPC.ChatFull chatFull = MessagesController.getInstance(kh.t9.K(t9Var)).getChatFull(j10);
                                    if (chatFull != null && (chatParticipants = chatFull.participants) != null && (arrayList = chatParticipants.participants) != null && !arrayList.isEmpty() && chatFull.participants.participants.size() >= chatFull.participants_count - 1) {
                                        n9Var.d(j10, chatFull.participants);
                                    } else {
                                        org.telegram.ui.ActionBar.c2 c2Var2 = n9Var.C;
                                        if (c2Var2 != null) {
                                            c2Var2.dismiss();
                                            n9Var.C = null;
                                        }
                                        n9Var.D = j10;
                                        org.telegram.ui.ActionBar.c2 c2Var3 = new org.telegram.ui.ActionBar.c2(n9Var.getContext(), 3, kh.t9.L(t9Var));
                                        n9Var.C = c2Var3;
                                        c2Var3.q(50L);
                                        MessagesStorage messagesStorage = MessagesStorage.getInstance(kh.t9.M(t9Var));
                                        messagesStorage.getStorageQueue().postRunnable(new gh.e2(n9Var, chat2, messagesStorage, j10, 12));
                                    }
                                    if (!TextUtils.isEmpty(n9Var.E)) {
                                        f9Var.setText("");
                                        n9Var.E = null;
                                        n9Var.g(false);
                                    }
                                }
                            } else {
                                TLRPC.User user = a9Var.f14957g;
                                if (user != null) {
                                    if (n9Var.f15767a == 0) {
                                        t9Var.J = 0;
                                    }
                                    long j11 = user.f22527id;
                                    HashSet hashSet = new HashSet(arrayList3);
                                    if (arrayList3.contains(Long.valueOf(j11))) {
                                        Iterator it = hashMap.entrySet().iterator();
                                        while (it.hasNext()) {
                                            Map.Entry entry = (Map.Entry) it.next();
                                            if (((ArrayList) entry.getValue()).contains(Long.valueOf(j11))) {
                                                it.remove();
                                                hashSet.addAll((Collection) entry.getValue());
                                            }
                                        }
                                        hashSet.remove(Long.valueOf(j11));
                                        hVar.k(Boolean.FALSE, j11);
                                    } else {
                                        Iterator it2 = hashMap.entrySet().iterator();
                                        while (it2.hasNext()) {
                                            Map.Entry entry2 = (Map.Entry) it2.next();
                                            if (((ArrayList) entry2.getValue()).contains(Long.valueOf(j11))) {
                                                it2.remove();
                                                hashSet.addAll((Collection) entry2.getValue());
                                            }
                                        }
                                        hashSet.add(Long.valueOf(j11));
                                        if (!TextUtils.isEmpty(n9Var.E)) {
                                            f9Var.setText("");
                                            n9Var.E = null;
                                            n9Var.g(false);
                                        }
                                        hVar.k(Boolean.TRUE, j11);
                                    }
                                    arrayList3.clear();
                                    arrayList3.addAll(hashSet);
                                    n9Var.i(true);
                                }
                            }
                        }
                        n9Var.f(true);
                        n9Var.e(true);
                        f9Var.G = true;
                        return;
                    }
                }
            default:
                org.telegram.ui.l4 l4Var = (org.telegram.ui.l4) this.f12230b;
                org.telegram.ui.p3 p3Var = (org.telegram.ui.p3) this.f12231c;
                if (l4Var.G == null || i10 - 1 >= 0) {
                    org.telegram.ui.Cells.n9 n9Var2 = l4Var.K0;
                    if (n9Var2 != null) {
                        if (n9Var2.y()) {
                            l4Var.K0.f(false);
                            return;
                        }
                        l4Var.K0.f(false);
                    }
                    org.telegram.ui.j4 adapter = p3Var.getAdapter();
                    if ((view instanceof org.telegram.ui.s3) && adapter.A != null) {
                        org.telegram.ui.s3 s3Var = (org.telegram.ui.s3) view;
                        if (l4Var.C0 == 0) {
                            if ((!s3Var.f42546c || f10 >= view.getMeasuredWidth() / 2) && !s3Var.d) {
                                TLObject userOrChat = MessagesController.getInstance(l4Var.T).getUserOrChat("previews");
                                if (userOrChat instanceof TLRPC.TL_user) {
                                    l4Var.P(adapter.A.f22533id, (TLRPC.User) userOrChat);
                                    return;
                                }
                                int i16 = UserConfig.selectedAccount;
                                long j12 = adapter.A.f22533id;
                                l4Var.b0(true);
                                TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                                tL_contacts_resolveUsername.username = "previews";
                                l4Var.C0 = ConnectionsManager.getInstance(i16).sendRequest(tL_contacts_resolveUsername, new yd(l4Var, i16, j12));
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (i10 < 0 || i10 >= adapter.d.size()) {
                        return;
                    } else {
                        TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) adapter.d.get(i10);
                        TL_iv.PageBlock z12 = org.telegram.ui.l4.z(pageBlock);
                        if (z12 instanceof org.telegram.ui.z3) {
                            z12 = ((org.telegram.ui.z3) z12).f45015b;
                        }
                        if (z12 instanceof TL_iv.pageBlockChannel) {
                            MessagesController.getInstance(l4Var.T).openByUserName(ChatObject.getPublicUsername(((TL_iv.pageBlockChannel) z12).channel), l4Var.I, 2);
                            l4Var.o(false, true);
                            return;
                        } else if (z12 instanceof org.telegram.ui.f4) {
                            org.telegram.ui.f4 f4Var = (org.telegram.ui.f4) z12;
                            l4Var.Q(f4Var.f38130a.articles.get(f4Var.f38131b).url, null, null);
                            return;
                        } else if (z12 instanceof TL_iv.pageBlockDetails) {
                            View y10 = org.telegram.ui.l4.y(view);
                            if (y10 instanceof org.telegram.ui.o1) {
                                l4Var.d = null;
                                l4Var.f36377f = null;
                                if (adapter.f39360e.indexOf(pageBlock) < 0) {
                                    return;
                                }
                                TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) z12;
                                pageblockdetails.open = !pageblockdetails.open;
                                int h = adapter.h();
                                adapter.M();
                                int abs = Math.abs(adapter.h() - h);
                                org.telegram.ui.o1 o1Var = (org.telegram.ui.o1) y10;
                                o1Var.f40866f.a(pageblockdetails.open ? 0.0f : 1.0f);
                                o1Var.invalidate();
                                if (abs != 0) {
                                    if (pageblockdetails.open) {
                                        adapter.s(i10 + 1, abs);
                                        return;
                                    } else {
                                        adapter.t(i10 + 1, abs);
                                        return;
                                    }
                                }
                                return;
                            }
                            return;
                        } else {
                            return;
                        }
                    }
                }
                return;
        }
    }

    @Override
    public void d(kh.r9 r9Var, boolean z10, boolean z11, boolean z12, boolean z13, TLRPC.InputPeer inputPeer, int i9, kh.o8 o8Var, kh.f1 f1Var) {
        boolean z14;
        b4 b4Var = (b4) this.f12230b;
        kh.t9 t9Var = (kh.t9) this.f12231c;
        i4 i4Var = b4Var.f11268l;
        g4 g4Var = i4Var.K1;
        TL_stories.StoryItem storyItem = g4Var.f11466a;
        if (storyItem != null && storyItem.pinned) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (z14 != z12) {
            MessagesController.getInstance(i4Var.f11609y2).getStoriesController().o0(i4Var.f11604x1, i4Var.f11580r1, z12, null);
        }
        TL_stories.StoryItem storyItem2 = g4Var.f11466a;
        if (storyItem2 != null) {
            TLRPC.MessageMedia messageMedia = storyItem2.media;
            if (messageMedia instanceof TLRPC.TL_messageMediaVideoStream) {
                TLRPC.InputGroupCall inputGroupCall = ((TLRPC.TL_messageMediaVideoStream) messageMedia).call;
                TL_phone.toggleGroupCallSettings togglegroupcallsettings = new TL_phone.toggleGroupCallSettings();
                togglegroupcallsettings.call = inputGroupCall;
                togglegroupcallsettings.messages_enabled = Boolean.valueOf(z10);
                togglegroupcallsettings.send_paid_messages_stars = Long.valueOf(i9);
                ConnectionsManager.getInstance(i4Var.f11609y2).sendRequest(togglegroupcallsettings, new bg.j0(11, b4Var, t9Var));
            }
        }
    }

    @Override
    public void e(long j10, TLRPC.MessagePeerReaction messagePeerReaction) {
        MessageObject messageObject = (MessageObject) this.f12231c;
        qn qnVar = ((vh) this.f12230b).f43493p;
        Bundle bundle = new Bundle();
        if (j10 > 0) {
            bundle.putLong("user_id", j10);
        } else {
            bundle.putLong("chat_id", -j10);
        }
        bundle.putInt("report_reaction_message_id", messageObject.getId());
        bundle.putLong("report_reaction_from_dialog_id", qnVar.P5);
        qnVar.presentFragment(new ProfileActivity(bundle, null));
        qnVar.A7(true);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        int i10;
        switch (this.f12229a) {
            case 1:
                b4 b4Var = (b4) this.f12230b;
                f1 f1Var = ((m9) this.f12231c).f11831w0;
                if (f1Var != null) {
                    if (!f1Var.f11406w) {
                        TL_phone.discardGroupCall discardgroupcall = new TL_phone.discardGroupCall();
                        discardgroupcall.call = f1Var.f11402f;
                        ConnectionsManager.getInstance(f1Var.f11401e).sendRequest(discardgroupcall, new y0(f1Var, 4));
                        f1Var.e();
                        return;
                    }
                    return;
                }
                i4.f0(b4Var.f11268l);
                return;
            case 4:
                mh.u3.x0((mh.u3) this.f12230b, (TL_payments.connectedBotStarRef) this.f12231c);
                return;
            case 6:
                of.f1 f1Var2 = (of.f1) this.f12230b;
                f1Var2.getClass();
                ((boolean[]) this.f12231c)[0] = true;
                f1Var2.Q();
                return;
            case 9:
                org.telegram.ui.p4 p4Var = (org.telegram.ui.p4) this.f12230b;
                p4Var.getClass();
                c2Var.dismiss();
                p4Var.V((View) this.f12231c, true);
                return;
            case 11:
                ve.e.o(((pb) this.f12230b).getParentActivity(), (String) this.f12231c, true);
                return;
            case 13:
                id.U((id) this.f12230b, (TLRPC.Chat) this.f12231c);
                return;
            case 23:
                vo voVar = (vo) this.f12230b;
                TLRPC.TL_channels_updateUsername tL_channels_updateUsername = new TLRPC.TL_channels_updateUsername();
                tL_channels_updateUsername.channel = MessagesController.getInputChannel((TLRPC.Chat) this.f12231c);
                tL_channels_updateUsername.username = "";
                voVar.getConnectionsManager().sendRequest(tL_channels_updateUsername, new io(voVar, 0), 64);
                return;
            case 27:
                org.telegram.ui.Components.e0.O((org.telegram.ui.Components.e0) this.f12230b, (TL_aicompose.TL_aiComposeTone) this.f12231c, c2Var);
                return;
            case 28:
                ((AtomicBoolean) this.f12230b).set(true);
                ((q0.a) this.f12231c).accept(Boolean.FALSE);
                return;
            default:
                MessagesStorage.IntCallback intCallback = (MessagesStorage.IntCallback) this.f12231c;
                int i11 = ((int[]) this.f12230b)[0];
                if (i11 == 0) {
                    i10 = 900;
                } else if (i11 == 1) {
                    i10 = 3600;
                } else if (i11 == 2) {
                    i10 = 28800;
                } else {
                    i10 = Integer.MAX_VALUE;
                }
                intCallback.run(i10);
                return;
        }
    }

    @Override
    public boolean f1(View view) {
        switch (this.f12229a) {
            case 3:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void g0(View view, float f10, float f11) {
        int i9 = this.f12229a;
    }

    @Override
    public void h(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((bq) this.f12230b).o0(tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.f12231c);
    }

    @Override
    public void onComplete(Object obj) {
        on onVar = (on) this.f12230b;
        jb0 jb0Var = (jb0) this.f12231c;
        Pair pair = (Pair) obj;
        onVar.getClass();
        if (pair != null) {
            long longValue = ((Long) pair.first).longValue();
            Bitmap bitmap = (Bitmap) pair.second;
            org.telegram.ui.ActionBar.b4 b4Var = onVar.f41205f;
            if (b4Var != null && longValue == b4Var.i(onVar.C ? 1 : 0) && bitmap != null) {
                jb0Var.f29710x = bitmap;
                jb0Var.i();
            }
        }
    }

    @Override
    public void onError(Throwable th) {
        org.telegram.tgnet.k.a(this, th);
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        qn.f0((qn) this.f12230b, (Context) this.f12231c, tL_error);
        return false;
    }

    @Override
    public boolean v(dy dyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i9, int i10, we1 we1Var) {
        org.telegram.ui.z5 z5Var = (org.telegram.ui.z5) this.f12230b;
        ArrayList arrayList2 = z5Var.f45035c;
        ((dy) this.f12231c).finishFragment();
        CacheByChatsController.KeepMediaException keepMediaException = null;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            boolean z12 = true;
            if (i12 >= arrayList.size()) {
                break;
            }
            int i13 = 0;
            while (true) {
                if (i13 < z5Var.d.size()) {
                    if (((CacheByChatsController.KeepMediaException) z5Var.d.get(i13)).dialogId == ((MessagesStorage.TopicKey) arrayList.get(i12)).dialogId) {
                        keepMediaException = (CacheByChatsController.KeepMediaException) z5Var.d.get(i13);
                        break;
                    }
                    i13++;
                } else {
                    z12 = false;
                    break;
                }
            }
            if (!z12) {
                int i14 = CacheByChatsController.KEEP_MEDIA_FOREVER;
                if (z5Var.getMessagesController().getCacheByChatsController().getKeepMedia(z5Var.f45036e) == CacheByChatsController.KEEP_MEDIA_FOREVER) {
                    i14 = CacheByChatsController.KEEP_MEDIA_ONE_DAY;
                }
                ArrayList arrayList3 = z5Var.d;
                CacheByChatsController.KeepMediaException keepMediaException2 = new CacheByChatsController.KeepMediaException(((MessagesStorage.TopicKey) arrayList.get(i12)).dialogId, i14);
                arrayList3.add(keepMediaException2);
                keepMediaException = keepMediaException2;
            }
            i12++;
        }
        z5Var.getMessagesController().getCacheByChatsController().saveKeepMediaExceptions(z5Var.f45036e, z5Var.d);
        z5Var.T();
        if (keepMediaException != null) {
            int i15 = 0;
            while (true) {
                if (i15 < arrayList2.size()) {
                    if (((org.telegram.ui.y5) arrayList2.get(i15)).f44726c != null && ((org.telegram.ui.y5) arrayList2.get(i15)).f44726c.dialogId == keepMediaException.dialogId) {
                        i11 = i15;
                        break;
                    }
                    i15++;
                } else {
                    break;
                }
            }
            z5Var.f45034b.u0(i11);
            AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.l0(14, z5Var, keepMediaException), 150L);
        }
        return true;
    }

    public v3(gb gbVar, org.telegram.ui.Cells.t1 t1Var, TLRPC.User user) {
        this.f12229a = 12;
        this.f12230b = gbVar;
        this.f12231c = user;
    }

    @Override
    public void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.k.b(this, tL_error);
    }

    @Override
    public void run(long j10) {
        switch (this.f12229a) {
            case 22:
                ho hoVar = (ho) this.f12230b;
                hoVar.getClass();
                ((org.telegram.ui.ActionBar.c2) this.f12231c).dismiss();
                hoVar.J0 = false;
                if (j10 == 0) {
                    return;
                }
                hoVar.f38860s0 = j10;
                TLRPC.Chat chat = hoVar.getMessagesController().getChat(Long.valueOf(j10));
                hoVar.f38861t0 = chat;
                TLRPC.ChatFull chatFull = hoVar.f38862u0;
                if (chatFull != null) {
                    chatFull.hidden_prehistory = true;
                }
                boolean z10 = chat.forum_tabs != hoVar.D0;
                hoVar.getMessagesController().toggleChannelForum(hoVar.f38860s0, hoVar.B0, hoVar.D0);
                TLRPC.Chat chat2 = hoVar.f38861t0;
                chat2.forum = hoVar.B0;
                chat2.forum_tabs = hoVar.D0;
                if (z10) {
                    hoVar.p0();
                    return;
                }
                return;
            case 23:
            default:
                dp dpVar = (dp) this.f12230b;
                Runnable runnable = (Runnable) this.f12231c;
                if (j10 != 0) {
                    hp hpVar = dpVar.f37576x.d;
                    if (hpVar.f38888s) {
                        hpVar.v.set(0, hpVar.getMessagesController().getChat(Long.valueOf(j10)));
                    } else {
                        hpVar.A = j10;
                        hpVar.f38885f = hpVar.getMessagesController().getChat(Long.valueOf(j10));
                    }
                    runnable.run();
                    return;
                }
                dpVar.getClass();
                return;
            case 24:
                hp hpVar2 = (hp) this.f12230b;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.f12231c;
                if (j10 != 0) {
                    hpVar2.getMessagesController().toggleChannelInvitesHistory(j10, false);
                    hpVar2.X(hpVar2.getMessagesController().getChat(Long.valueOf(j10)), o2Var);
                    return;
                }
                hpVar2.getClass();
                return;
        }
    }

    @Override
    public void run(boolean z10) {
        long j10 = ((TLRPC.User) this.f12231c).f22527id;
        qn qnVar = ((bj) this.f12230b).f36877b;
        long j11 = qnVar.Z3;
        if (j10 != j11) {
            return;
        }
        qnVar.qa(j11, false);
    }

    @Override
    public void run(Exception exc) {
        AtomicReference atomicReference = (AtomicReference) this.f12231c;
        FileLog.e("mlkit: failed to detect language in message");
        ((AtomicBoolean) this.f12230b).set(false);
        if (atomicReference.get() != null) {
            ((Runnable) atomicReference.get()).run();
            atomicReference.set(null);
        }
    }

    private final void g(View view, float f10, float f11) {
    }

    private final void i(View view, float f10, float f11) {
    }
}
