package kg;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Bundle;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import bg.h3;
import eg.z1;
import ih.b1;
import ih.c1;
import j7.l1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import lh.b4;
import lh.d1;
import lh.d4;
import lh.i9;
import lh.w0;
import lh.w3;
import nh.b6;
import nh.c9;
import nh.e9;
import nh.g9;
import nh.h8;
import nh.j8;
import nh.m6;
import nh.m8;
import nh.p8;
import nh.r8;
import nh.y8;
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
import org.telegram.messenger.fe;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Cells.k9;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Components.AnimatedArrowDrawable;
import org.telegram.ui.Components.al0;
import org.telegram.ui.Components.b5;
import org.telegram.ui.Components.j70;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.oj0;
import org.telegram.ui.Components.tc;
import org.telegram.ui.Components.yb0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.a4;
import org.telegram.ui.a6;
import org.telegram.ui.d5;
import org.telegram.ui.d51;
import org.telegram.ui.dq;
import org.telegram.ui.ej;
import org.telegram.ui.fb;
import org.telegram.ui.fn;
import org.telegram.ui.fy;
import org.telegram.ui.g4;
import org.telegram.ui.gp;
import org.telegram.ui.hd;
import org.telegram.ui.k4;
import org.telegram.ui.kb;
import org.telegram.ui.ko;
import org.telegram.ui.kp;
import org.telegram.ui.lo;
import org.telegram.ui.m4;
import org.telegram.ui.ob;
import org.telegram.ui.p1;
import org.telegram.ui.pf1;
import org.telegram.ui.q3;
import org.telegram.ui.q4;
import org.telegram.ui.rn;
import org.telegram.ui.t3;
import org.telegram.ui.tn;
import org.telegram.ui.v4;
import org.telegram.ui.yh;
import org.telegram.ui.yo;
import org.telegram.ui.yx;
import org.telegram.ui.z5;
import org.telegram.ui.ze1;
public final class w implements d51, sg.g, j8, b2, a9.e, al0, org.telegram.ui.Cells.v, yx, v4, b5, MessagesController.ErrorDelegate, LanguageDetector.ExceptionCallback, oj0, MessagesStorage.BooleanCallback, ResultCallback, MessagesStorage.LongCallback, pf1 {
    public final int f13881a;
    public final Object f13882b;
    public final Object f13883c;

    public w(int i10, Object obj, Object obj2) {
        this.f13881a = i10;
        this.f13882b = obj;
        this.f13883c = obj2;
    }

    @Override
    public boolean C() {
        return false;
    }

    @Override
    public void I(int i10, int i11, boolean z10) {
        switch (this.f13881a) {
            case 14:
                tn tnVar = (tn) this.f13882b;
                tnVar.l8(null, null);
                SendMessagesHelper.prepareSendingPhoto(tnVar.getAccountInstance(), null, (Uri) this.f13883c, tnVar.P5, tnVar.f42856j5, tnVar.T3, tnVar.f42831h5, null, null, null, null, 0, tnVar.f42880l5, z10, i10, tnVar.N3, tnVar.C8());
                return;
            case 15:
            default:
                fn fnVar = (fn) this.f13882b;
                MessageObject messageObject = (MessageObject) this.f13883c;
                if (z10) {
                    fnVar.f38212a.getMessagesController().approveSuggestedMessage(DialogObject.getPeerDialogId(messageObject.messageOwner.peer_id), messageObject.messageOwner.f22413id, i10);
                    return;
                } else {
                    fnVar.getClass();
                    return;
                }
            case 16:
                tn tnVar2 = (tn) this.f13882b;
                tnVar2.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of((String) this.f13883c, tnVar2.P5, tnVar2.f42856j5, tnVar2.T3, null, false, null, null, null, z10, i10, 0, null, false));
                tnVar2.U.setFieldText("");
                tnVar2.e9(false);
                return;
        }
    }

    @Override
    public Object I0(a5.j jVar) {
        String str = (String) this.f13882b;
        a9.b bVar = (a9.b) this.f13883c;
        try {
            Trace.beginSection(str);
            return bVar.f236f.I0(jVar);
        } finally {
            Trace.endSection();
        }
    }

    @Override
    public boolean J(fy fyVar) {
        return false;
    }

    @Override
    public void a(long j10, TLRPC.MessagePeerReaction messagePeerReaction) {
        MessageObject messageObject = (MessageObject) this.f13883c;
        tn tnVar = ((yh) this.f13882b).f44892p;
        Bundle bundle = new Bundle();
        if (j10 > 0) {
            bundle.putLong("user_id", j10);
        } else {
            bundle.putLong("chat_id", -j10);
        }
        bundle.putInt("report_reaction_message_id", messageObject.getId());
        bundle.putLong("report_reaction_from_dialog_id", tnVar.P5);
        tnVar.presentFragment(new ProfileActivity(bundle, null));
        tnVar.A7(true);
    }

    @Override
    public void b(float f9, float f10, int i10, View view) {
        long clientUserId;
        int i11;
        int i12;
        boolean z10;
        int i13;
        int i14;
        TLRPC.ChatParticipants chatParticipants;
        ArrayList<TLRPC.ChatParticipant> arrayList;
        float f11;
        int i15 = i10;
        switch (this.f13881a) {
            case 6:
                y8 y8Var = (y8) this.f13882b;
                Context context = (Context) this.f13883c;
                ArrayList arrayList2 = y8Var.H;
                a0.h hVar = y8Var.f18902b;
                r8 r8Var = y8Var.f18910x;
                ArrayList arrayList3 = y8Var.f18903c;
                HashMap hashMap = y8Var.d;
                e9 e9Var = y8Var.S;
                if (i15 >= 0 && i15 < arrayList2.size()) {
                    m8 m8Var = (m8) arrayList2.get(i15);
                    int i16 = m8Var.f50845a;
                    int i17 = 0;
                    if (i16 == 3) {
                        if (m8Var.f18146n && e9Var.B) {
                            new h8(context, e9.G(e9Var), e9Var.G, e9Var.f17604c, new p8(y8Var, 0), e9.H(e9Var)).show();
                            return;
                        }
                        int i18 = m8Var.f18141i;
                        if (i18 == 1) {
                            if (e9Var.J == 1 || e9.J0(e9Var).isEmpty()) {
                                e9Var.I = 1;
                                e9Var.f17603b.D(1);
                            }
                            e9Var.J = 1;
                            y8Var.f(true);
                            return;
                        } else if (i18 == 3) {
                            if (e9Var.J == 3 || (e9Var.f17607n.isEmpty() && e9Var.f17608r.isEmpty())) {
                                e9Var.I = 3;
                                e9Var.f17603b.D(1);
                            }
                            e9Var.J = 3;
                            y8Var.f(true);
                            return;
                        } else if (i18 == 2) {
                            if (e9Var.J == 2) {
                                e9Var.I = 2;
                                e9Var.f17603b.D(1);
                            }
                            e9Var.J = 2;
                            y8Var.f(true);
                            return;
                        } else if (i18 == 4) {
                            if (e9Var.J == 4) {
                                e9Var.I = 4;
                                e9Var.f17603b.D(1);
                            }
                            e9Var.J = 4;
                            y8Var.f(true);
                            return;
                        } else {
                            if (i18 > 0) {
                                arrayList3.clear();
                                hashMap.clear();
                                e9Var.J = m8Var.f18141i;
                                r8Var.f17432c.a();
                            } else {
                                TLRPC.Chat chat = m8Var.h;
                                if (chat != null) {
                                    long j10 = chat.f22392id;
                                    if (e9.d1(e9Var, chat) > 200) {
                                        try {
                                            y8Var.performHapticFeedback(3, 1);
                                        } catch (Throwable unused) {
                                        }
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(y8Var.getContext(), 0, e9.I(e9Var));
                                        alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.GroupTooLarge);
                                        alertDialog$Builder.f22714a.P = LocaleController.getString(R.string.GroupTooLargeMessage);
                                        l1.C(R.string.OK, alertDialog$Builder, null);
                                    } else if (hashMap.containsKey(Long.valueOf(j10))) {
                                        ArrayList arrayList4 = (ArrayList) hashMap.get(Long.valueOf(j10));
                                        if (arrayList4 != null) {
                                            int size = arrayList4.size();
                                            while (i17 < size) {
                                                Object obj = arrayList4.get(i17);
                                                i17++;
                                                hVar.k(Boolean.FALSE, ((Long) obj).longValue());
                                            }
                                        }
                                        hashMap.remove(Long.valueOf(j10));
                                        y8Var.i(true);
                                    } else {
                                        TLRPC.Chat chat2 = MessagesController.getInstance(e9.J(e9Var)).getChat(Long.valueOf(j10));
                                        TLRPC.ChatFull chatFull = MessagesController.getInstance(e9.K(e9Var)).getChatFull(j10);
                                        if (chatFull != null && (chatParticipants = chatFull.participants) != null && (arrayList = chatParticipants.participants) != null && !arrayList.isEmpty() && chatFull.participants.participants.size() >= chatFull.participants_count - 1) {
                                            y8Var.d(j10, chatFull.participants);
                                        } else {
                                            c2 c2Var = y8Var.C;
                                            if (c2Var != null) {
                                                c2Var.dismiss();
                                                y8Var.C = null;
                                            }
                                            y8Var.D = j10;
                                            c2 c2Var2 = new c2(y8Var.getContext(), 3, e9.L(e9Var));
                                            y8Var.C = c2Var2;
                                            c2Var2.q(50L);
                                            MessagesStorage messagesStorage = MessagesStorage.getInstance(e9.M(e9Var));
                                            messagesStorage.getStorageQueue().postRunnable(new jh.c2(y8Var, chat2, messagesStorage, j10, 12));
                                        }
                                        if (!TextUtils.isEmpty(y8Var.E)) {
                                            r8Var.setText("");
                                            y8Var.E = null;
                                            y8Var.g(false);
                                        }
                                    }
                                } else {
                                    TLRPC.User user = m8Var.f18140g;
                                    if (user != null) {
                                        if (y8Var.f18901a == 0) {
                                            e9Var.J = 0;
                                        }
                                        long j11 = user.f22539id;
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
                                            if (!TextUtils.isEmpty(y8Var.E)) {
                                                r8Var.setText("");
                                                y8Var.E = null;
                                                y8Var.g(false);
                                            }
                                            hVar.k(Boolean.TRUE, j11);
                                        }
                                        arrayList3.clear();
                                        arrayList3.addAll(hashSet);
                                        y8Var.i(true);
                                    }
                                }
                            }
                            y8Var.f(true);
                            y8Var.e(true);
                            r8Var.G = true;
                            return;
                        }
                    } else if (i16 == 7) {
                        if (view instanceof org.telegram.ui.Cells.m8) {
                            org.telegram.ui.Cells.m8 m8Var2 = (org.telegram.ui.Cells.m8) view;
                            m8Var2.setChecked(!m8Var2.b());
                            m8Var.f18143k = m8Var2.b();
                            int i19 = m8Var.f18137c;
                            if (i19 == 0) {
                                boolean b10 = m8Var2.b();
                                e9Var.f17611x = b10;
                                if (e9Var.J == 4) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (b10) {
                                    tc tcVar = new tc(e9Var.container, e9.O(e9Var));
                                    int i20 = R.raw.ic_save_to_gallery;
                                    if (z10) {
                                        i14 = R.string.StoryEnabledScreenshotsShare;
                                    } else {
                                        i14 = R.string.StoryEnabledScreenshots;
                                    }
                                    mc G = tcVar.G(i20, 4, LocaleController.getString(i14));
                                    G.f30652j = 5000;
                                    G.k(true);
                                    return;
                                }
                                tc tcVar2 = new tc(e9Var.container, e9.P(e9Var));
                                int i21 = R.raw.passcode_lock_close;
                                if (z10) {
                                    i13 = R.string.StoryDisabledScreenshotsShare;
                                } else {
                                    i13 = R.string.StoryDisabledScreenshots;
                                }
                                mc G2 = tcVar2.G(i21, 4, LocaleController.getString(i13));
                                G2.f30652j = 5000;
                                G2.k(true);
                                return;
                            } else if (i19 == 1) {
                                boolean b11 = m8Var2.b();
                                e9Var.f17612y = b11;
                                boolean z11 = e9Var.f17604c instanceof TLRPC.TL_inputPeerChannel;
                                if (b11) {
                                    tc tcVar3 = new tc(e9Var.container, e9.R(e9Var));
                                    int i22 = R.raw.msg_story_keep;
                                    if (z11) {
                                        i12 = R.string.StoryChannelEnableKeep;
                                    } else {
                                        i12 = R.string.StoryEnableKeep;
                                    }
                                    mc G3 = tcVar3.G(i22, 4, LocaleController.getString(i12));
                                    G3.f30652j = 5000;
                                    G3.k(true);
                                } else {
                                    tc tcVar4 = new tc(e9Var.container, e9.S(e9Var));
                                    int i23 = R.raw.fire_on;
                                    if (z11) {
                                        i11 = R.string.StoryChannelDisableKeep;
                                    } else {
                                        i11 = R.string.StoryDisableKeep;
                                    }
                                    mc G4 = tcVar4.G(i23, 4, LocaleController.getString(i11));
                                    G4.f30652j = 5000;
                                    G4.k(true);
                                }
                                y8Var.g(true);
                                return;
                            } else if (i19 == 2) {
                                e9Var.f17610w = m8Var2.b();
                                y8Var.g(true);
                                return;
                            } else {
                                return;
                            }
                        }
                        return;
                    } else if (i16 == 9) {
                        int i24 = m8Var.f18149q;
                        if (i24 == 0) {
                            g9 g9Var = e9Var.Y;
                            if (g9Var != null) {
                                g9Var.run();
                                return;
                            }
                            return;
                        } else if (i24 == 1) {
                            TLRPC.InputPeer inputPeer = e9Var.f17604c;
                            if (inputPeer != null) {
                                clientUserId = DialogObject.getPeerDialogId(inputPeer);
                            } else {
                                clientUserId = UserConfig.getInstance(e9.b1(e9Var)).getClientUserId();
                            }
                            j70 F = j70.F(y8Var, e9.T(e9Var), view);
                            F.c(R.drawable.msg_addfolder, LocaleController.getString(R.string.StoriesAlbumNewAlbum), new z1(y8Var, clientUserId, 9), false);
                            F.k();
                            j70.f(F, e9Var.i1().B(clientUserId, true), e9Var.v, false, null, new b1(13, y8Var, F));
                            F.Z();
                            return;
                        } else if (i24 == 5) {
                            c2 c2Var3 = new c2(y8Var.getContext(), 3, e9.U(e9Var));
                            c2Var3.q(500L);
                            TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = new TL_phone.getGroupCallStreamRtmpUrl();
                            getgroupcallstreamrtmpurl.live_story = true;
                            TLRPC.InputPeer inputPeer2 = e9Var.f17604c;
                            if (inputPeer2 == null) {
                                inputPeer2 = new TLRPC.TL_inputPeerSelf();
                            }
                            getgroupcallstreamrtmpurl.peer = inputPeer2;
                            ConnectionsManager.getInstance(e9.V(e9Var)).sendRequest(getgroupcallstreamrtmpurl, new eg.z(y8Var, c2Var3, getgroupcallstreamrtmpurl, 12));
                            return;
                        } else if (i24 == 6) {
                            e9Var.C = false;
                            y8Var.g(true);
                            return;
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                return;
            default:
                m4 m4Var = (m4) this.f13882b;
                q3 q3Var = (q3) this.f13883c;
                if (m4Var.G == null || i15 - 1 >= 0) {
                    k9 k9Var = m4Var.K0;
                    if (k9Var != null) {
                        if (k9Var.y()) {
                            m4Var.K0.f(false);
                            return;
                        }
                        m4Var.K0.f(false);
                    }
                    k4 adapter = q3Var.getAdapter();
                    if ((view instanceof t3) && adapter.A != null) {
                        t3 t3Var = (t3) view;
                        if (m4Var.C0 == 0) {
                            if ((!t3Var.f42533c || f9 >= view.getMeasuredWidth() / 2) && !t3Var.d) {
                                TLObject userOrChat = MessagesController.getInstance(m4Var.T).getUserOrChat("previews");
                                if (userOrChat instanceof TLRPC.TL_user) {
                                    m4Var.P(adapter.A.f22545id, (TLRPC.User) userOrChat);
                                    return;
                                }
                                int i25 = UserConfig.selectedAccount;
                                long j12 = adapter.A.f22545id;
                                m4Var.b0(true);
                                TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                                tL_contacts_resolveUsername.username = "previews";
                                m4Var.C0 = ConnectionsManager.getInstance(i25).sendRequest(tL_contacts_resolveUsername, new fe(m4Var, i25, j12));
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (i15 >= 0 && i15 < adapter.d.size()) {
                        TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) adapter.d.get(i15);
                        TL_iv.PageBlock z12 = m4.z(pageBlock);
                        if (z12 instanceof a4) {
                            z12 = ((a4) z12).f36419b;
                        }
                        if (z12 instanceof TL_iv.pageBlockChannel) {
                            MessagesController.getInstance(m4Var.T).openByUserName(ChatObject.getPublicUsername(((TL_iv.pageBlockChannel) z12).channel), m4Var.I, 2);
                            m4Var.o(false, true);
                            return;
                        } else if (z12 instanceof g4) {
                            g4 g4Var = (g4) z12;
                            m4Var.Q(g4Var.f38449a.articles.get(g4Var.f38450b).url, null, null);
                            return;
                        } else if (z12 instanceof TL_iv.pageBlockDetails) {
                            View y8 = m4.y(view);
                            if (y8 instanceof p1) {
                                m4Var.d = null;
                                m4Var.f37383f = null;
                                if (adapter.f39741e.indexOf(pageBlock) >= 0) {
                                    TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) z12;
                                    pageblockdetails.open = !pageblockdetails.open;
                                    int h = adapter.h();
                                    adapter.M();
                                    int abs = Math.abs(adapter.h() - h);
                                    p1 p1Var = (p1) y8;
                                    AnimatedArrowDrawable animatedArrowDrawable = p1Var.f41277f;
                                    if (pageblockdetails.open) {
                                        f11 = 0.0f;
                                    } else {
                                        f11 = 1.0f;
                                    }
                                    animatedArrowDrawable.a(f11);
                                    p1Var.invalidate();
                                    if (abs != 0) {
                                        if (pageblockdetails.open) {
                                            adapter.s(i15 + 1, abs);
                                            return;
                                        } else {
                                            adapter.t(i15 + 1, abs);
                                            return;
                                        }
                                    }
                                    return;
                                }
                                return;
                            }
                            return;
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                return;
        }
    }

    @Override
    public boolean b1(View view) {
        switch (this.f13881a) {
            case 6:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void c(d5 d5Var) {
        fb fbVar = (fb) this.f13882b;
        TLRPC.User user = (TLRPC.User) this.f13883c;
        int ordinal = d5Var.ordinal();
        if (ordinal != 0) {
            if (ordinal == 3) {
                kb kbVar = fbVar.f38089a;
                if (user != null) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", user.f22539id);
                    o2 o2Var = kbVar.f39829n;
                    if (o2Var.getMessagesController().checkCanOpenChat(bundle, o2Var)) {
                        o2Var.presentFragment(new tn(bundle));
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        fbVar.a(user);
    }

    @Override
    public void d(RectF rectF, View view) {
        ((ng.d) this.f13882b).s(rectF.left, rectF.top);
        ((View) this.f13883c).invalidate();
    }

    @Override
    public void e(c9 c9Var, boolean z10, boolean z11, boolean z12, boolean z13, TLRPC.InputPeer inputPeer, int i10, b6 b6Var, m6 m6Var) {
        boolean z14;
        switch (this.f13881a) {
            case 2:
                d4 d4Var = (d4) this.f13882b;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.f13883c;
                TL_stories.TL_stories_editStory tL_stories_editStory = new TL_stories.TL_stories_editStory();
                tL_stories_editStory.peer = MessagesController.getInstance(d4Var.f15545y2).getInputPeer(storyItem.dialogId);
                tL_stories_editStory.f22633id = storyItem.f22629id;
                tL_stories_editStory.flags |= 4;
                tL_stories_editStory.privacy_rules = c9Var.f17482b;
                ConnectionsManager.getInstance(d4Var.f15545y2).sendRequest(tL_stories_editStory, new c1(d4Var, b6Var, storyItem, c9Var, 6));
                return;
            default:
                w3 w3Var = (w3) this.f13882b;
                e9 e9Var = (e9) this.f13883c;
                d4 d4Var2 = w3Var.f16362l;
                b4 b4Var = d4Var2.K1;
                TL_stories.StoryItem storyItem2 = b4Var.f15374a;
                if (storyItem2 != null && storyItem2.pinned) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (z14 != z12) {
                    MessagesController.getInstance(d4Var2.f15545y2).getStoriesController().o0(d4Var2.f15540x1, d4Var2.f15516r1, z12, null);
                }
                TL_stories.StoryItem storyItem3 = b4Var.f15374a;
                if (storyItem3 != null) {
                    TLRPC.MessageMedia messageMedia = storyItem3.media;
                    if (messageMedia instanceof TLRPC.TL_messageMediaVideoStream) {
                        TLRPC.InputGroupCall inputGroupCall = ((TLRPC.TL_messageMediaVideoStream) messageMedia).call;
                        TL_phone.toggleGroupCallSettings togglegroupcallsettings = new TL_phone.toggleGroupCallSettings();
                        togglegroupcallsettings.call = inputGroupCall;
                        togglegroupcallsettings.messages_enabled = Boolean.valueOf(z10);
                        togglegroupcallsettings.send_paid_messages_stars = Long.valueOf(i10);
                        ConnectionsManager.getInstance(d4Var2.f15545y2).sendRequest(togglegroupcallsettings, new h3(12, w3Var, e9Var));
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public void g(c2 c2Var, int i10) {
        int i11;
        switch (this.f13881a) {
            case 4:
                w3 w3Var = (w3) this.f13882b;
                d1 d1Var = ((i9) this.f13883c).f15790w0;
                if (d1Var != null) {
                    if (!d1Var.f15461w) {
                        TL_phone.discardGroupCall discardgroupcall = new TL_phone.discardGroupCall();
                        discardgroupcall.call = d1Var.f15457f;
                        ConnectionsManager.getInstance(d1Var.f15456e).sendRequest(discardgroupcall, new w0(d1Var, 4));
                        d1Var.e();
                        return;
                    }
                    return;
                }
                d4.f0(w3Var.f16362l);
                return;
            case 9:
                q4 q4Var = (q4) this.f13882b;
                q4Var.getClass();
                c2Var.dismiss();
                q4Var.W((View) this.f13883c, true);
                return;
            case 11:
                ye.d.o(((ob) this.f13882b).getParentActivity(), (String) this.f13883c, true);
                return;
            case 13:
                hd.V((hd) this.f13882b, (TLRPC.Chat) this.f13883c);
                return;
            case 23:
                yo yoVar = (yo) this.f13882b;
                TLRPC.TL_channels_updateUsername tL_channels_updateUsername = new TLRPC.TL_channels_updateUsername();
                tL_channels_updateUsername.channel = MessagesController.getInputChannel((TLRPC.Chat) this.f13883c);
                tL_channels_updateUsername.username = "";
                yoVar.getConnectionsManager().sendRequest(tL_channels_updateUsername, new lo(yoVar, 0), 64);
                return;
            case 27:
                org.telegram.ui.Components.g0.P((org.telegram.ui.Components.g0) this.f13882b, (TL_aicompose.TL_aiComposeTone) this.f13883c, c2Var);
                return;
            case 28:
                ((AtomicBoolean) this.f13882b).set(true);
                ((q0.a) this.f13883c).accept(Boolean.FALSE);
                return;
            default:
                MessagesStorage.IntCallback intCallback = (MessagesStorage.IntCallback) this.f13883c;
                int i12 = ((int[]) this.f13882b)[0];
                if (i12 == 0) {
                    i11 = 900;
                } else if (i12 == 1) {
                    i11 = 3600;
                } else if (i12 == 2) {
                    i11 = 28800;
                } else {
                    i11 = Integer.MAX_VALUE;
                }
                intCallback.run(i11);
                return;
        }
    }

    @Override
    public void i(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((dq) this.f13882b).p0(tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.f13883c);
    }

    @Override
    public void o0(View view, float f9, float f10) {
        int i10 = this.f13881a;
    }

    @Override
    public void onComplete(Object obj) {
        rn rnVar = (rn) this.f13882b;
        yb0 yb0Var = (yb0) this.f13883c;
        Pair pair = (Pair) obj;
        rnVar.getClass();
        if (pair != null) {
            long longValue = ((Long) pair.first).longValue();
            Bitmap bitmap = (Bitmap) pair.second;
            org.telegram.ui.ActionBar.b4 b4Var = rnVar.f42156f;
            if (b4Var != null && longValue == b4Var.i(rnVar.C ? 1 : 0) && bitmap != null) {
                yb0Var.f35038x = bitmap;
                yb0Var.i();
            }
        }
    }

    @Override
    public void onError(Throwable th2) {
        org.telegram.tgnet.k.a(this, th2);
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        tn.g0((tn) this.f13882b, (Context) this.f13883c, tL_error);
        return false;
    }

    @Override
    public boolean v(fy fyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, ze1 ze1Var) {
        a6 a6Var = (a6) this.f13882b;
        ArrayList arrayList2 = a6Var.f36438c;
        ((fy) this.f13883c).finishFragment();
        CacheByChatsController.KeepMediaException keepMediaException = null;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            boolean z12 = true;
            if (i13 >= arrayList.size()) {
                break;
            }
            int i14 = 0;
            while (true) {
                if (i14 < a6Var.d.size()) {
                    if (((CacheByChatsController.KeepMediaException) a6Var.d.get(i14)).dialogId == ((MessagesStorage.TopicKey) arrayList.get(i13)).dialogId) {
                        keepMediaException = (CacheByChatsController.KeepMediaException) a6Var.d.get(i14);
                        break;
                    }
                    i14++;
                } else {
                    z12 = false;
                    break;
                }
            }
            if (!z12) {
                int i15 = CacheByChatsController.KEEP_MEDIA_FOREVER;
                if (a6Var.getMessagesController().getCacheByChatsController().getKeepMedia(a6Var.f36439e) == CacheByChatsController.KEEP_MEDIA_FOREVER) {
                    i15 = CacheByChatsController.KEEP_MEDIA_ONE_DAY;
                }
                ArrayList arrayList3 = a6Var.d;
                CacheByChatsController.KeepMediaException keepMediaException2 = new CacheByChatsController.KeepMediaException(((MessagesStorage.TopicKey) arrayList.get(i13)).dialogId, i15);
                arrayList3.add(keepMediaException2);
                keepMediaException = keepMediaException2;
            }
            i13++;
        }
        a6Var.getMessagesController().getCacheByChatsController().saveKeepMediaExceptions(a6Var.f36439e, a6Var.d);
        a6Var.U();
        if (keepMediaException != null) {
            int i16 = 0;
            while (true) {
                if (i16 < arrayList2.size()) {
                    if (((z5) arrayList2.get(i16)).f45073c != null && ((z5) arrayList2.get(i16)).f45073c.dialogId == keepMediaException.dialogId) {
                        i12 = i16;
                        break;
                    }
                    i16++;
                } else {
                    break;
                }
            }
            a6Var.f36437b.u0(i12);
            AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.c(11, a6Var, keepMediaException), 150L);
        }
        return true;
    }

    public w(fb fbVar, s1 s1Var, TLRPC.User user) {
        this.f13881a = 12;
        this.f13882b = fbVar;
        this.f13883c = user;
    }

    @Override
    public void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.k.b(this, tL_error);
    }

    @Override
    public void run(long j10) {
        switch (this.f13881a) {
            case 22:
                ko koVar = (ko) this.f13882b;
                koVar.getClass();
                ((c2) this.f13883c).dismiss();
                koVar.J0 = false;
                if (j10 == 0) {
                    return;
                }
                koVar.f39963s0 = j10;
                TLRPC.Chat chat = koVar.getMessagesController().getChat(Long.valueOf(j10));
                koVar.f39964t0 = chat;
                TLRPC.ChatFull chatFull = koVar.f39965u0;
                if (chatFull != null) {
                    chatFull.hidden_prehistory = true;
                }
                boolean z10 = chat.forum_tabs != koVar.D0;
                koVar.getMessagesController().toggleChannelForum(koVar.f39963s0, koVar.B0, koVar.D0);
                TLRPC.Chat chat2 = koVar.f39964t0;
                chat2.forum = koVar.B0;
                chat2.forum_tabs = koVar.D0;
                if (z10) {
                    koVar.q0();
                    return;
                }
                return;
            case 23:
            default:
                gp gpVar = (gp) this.f13882b;
                Runnable runnable = (Runnable) this.f13883c;
                if (j10 != 0) {
                    kp kpVar = gpVar.f38646x.d;
                    if (kpVar.f39984s) {
                        kpVar.v.set(0, kpVar.getMessagesController().getChat(Long.valueOf(j10)));
                    } else {
                        kpVar.A = j10;
                        kpVar.f39981f = kpVar.getMessagesController().getChat(Long.valueOf(j10));
                    }
                    runnable.run();
                    return;
                }
                gpVar.getClass();
                return;
            case 24:
                kp kpVar2 = (kp) this.f13882b;
                o2 o2Var = (o2) this.f13883c;
                if (j10 != 0) {
                    kpVar2.getMessagesController().toggleChannelInvitesHistory(j10, false);
                    kpVar2.Y(kpVar2.getMessagesController().getChat(Long.valueOf(j10)), o2Var);
                    return;
                }
                kpVar2.getClass();
                return;
        }
    }

    @Override
    public void run(boolean z10) {
        long j10 = ((TLRPC.User) this.f13883c).f22539id;
        tn tnVar = ((ej) this.f13882b).f37848b;
        long j11 = tnVar.Z3;
        if (j10 != j11) {
            return;
        }
        tnVar.qa(j11, false);
    }

    @Override
    public void run(Exception exc) {
        AtomicReference atomicReference = (AtomicReference) this.f13883c;
        FileLog.e("mlkit: failed to detect language in message");
        ((AtomicBoolean) this.f13882b).set(false);
        if (atomicReference.get() != null) {
            ((Runnable) atomicReference.get()).run();
            atomicReference.set(null);
        }
    }

    private final void f(View view, float f9, float f10) {
    }

    private final void h(View view, float f9, float f10) {
    }
}
