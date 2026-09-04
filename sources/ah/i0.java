package ah;

import android.content.Context;
import android.content.Intent;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Trace;
import android.text.TextUtils;
import android.view.View;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import bi.c3;
import bi.c5;
import bi.f5;
import bi.m5;
import bi.o5;
import bi.oa;
import bi.pb;
import bi.t1;
import bi.x7;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import di.b7;
import di.ba;
import di.ga;
import di.h9;
import di.ia;
import di.j9;
import di.ka;
import di.m2;
import di.m9;
import di.p9;
import di.t9;
import fi.e4;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;
import ji.b3;
import ji.i4;
import ji.k6;
import ji.s3;
import ji.s5;
import ji.v3;
import ji.v5;
import m4.p1;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.de;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Cells.q9;
import org.telegram.ui.Cells.r8;
import org.telegram.ui.Components.AnimatedArrowDrawable;
import org.telegram.ui.Components.al0;
import org.telegram.ui.Components.bl0;
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.xt;
import org.telegram.ui.Components.yc;
import org.telegram.ui.c4;
import org.telegram.ui.dd0;
import org.telegram.ui.g4;
import org.telegram.ui.j61;
import org.telegram.ui.m3;
import org.telegram.ui.p3;
import org.telegram.ui.w3;
import v7.l8;
public final class i0 implements j61, ih.i, j9, a2, OnFailureListener, q9.d, OnCompleteListener, Continuation, al0, bl0, Utilities.Callback3Return, dd0, e2.n, e2.m, ji.o0, xt, i4, m4.j0, m4.e1, org.telegram.ui.Cells.v {
    public final int f586a;
    public final Object f587b;
    public final Object f588c;

    public i0(int i10, Object obj, Object obj2) {
        this.f586a = i10;
        this.f587b = obj;
        this.f588c = obj2;
    }

    @Override
    public Object D(cf.c cVar) {
        String str = (String) this.f587b;
        q9.a aVar = (q9.a) this.f588c;
        try {
            Trace.beginSection(str);
            return aVar.f44213f.D(cVar);
        } finally {
            Trace.endSection();
        }
    }

    @Override
    public boolean a(int i10, View view) {
        return e4.B0((e4) this.f587b, (Context) this.f588c, view, i10);
    }

    @Override
    public void b(org.telegram.tgnet.TLRPC.MessageMedia r1, int r2, boolean r3, int r4, long r5) {
        throw new UnsupportedOperationException("Method not decompiled: ah.i0.b(org.telegram.tgnet.TLRPC$MessageMedia, int, boolean, int, long):void");
    }

    @Override
    public void c(Object obj, b2.q qVar) {
        ((j2.b) obj).b((b2.b1) this.f588c, new pf.b(qVar, ((j2.f) this.f587b).f13179e));
    }

    @Override
    public void d(float f7, float f10, int i10, View view) {
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
        switch (this.f586a) {
            case 10:
                ba baVar = (ba) this.f587b;
                Context context = (Context) this.f588c;
                ArrayList arrayList2 = baVar.L;
                a0.i iVar = baVar.f6957b;
                t9 t9Var = baVar.f6965x;
                ArrayList arrayList3 = baVar.f6958c;
                HashMap hashMap = baVar.d;
                ia iaVar = baVar.W;
                if (i15 >= 0 && i15 < arrayList2.size()) {
                    m9 m9Var = (m9) arrayList2.get(i15);
                    int i16 = m9Var.f44071a;
                    int i17 = 0;
                    if (i16 == 3) {
                        if (m9Var.f7656n && iaVar.F) {
                            new h9(context, ia.H(iaVar), iaVar.K, iaVar.f7392c, new p9(baVar, 0), ia.I(iaVar)).show();
                            return;
                        }
                        int i18 = m9Var.f7651i;
                        if (i18 == 1) {
                            if (iaVar.N == 1 || ia.J0(iaVar).isEmpty()) {
                                iaVar.M = 1;
                                iaVar.f7390b.D(1);
                            }
                            iaVar.N = 1;
                            baVar.f(true);
                            return;
                        } else if (i18 == 3) {
                            if (iaVar.N == 3 || (iaVar.f7396n.isEmpty() && iaVar.f7397r.isEmpty())) {
                                iaVar.M = 3;
                                iaVar.f7390b.D(1);
                            }
                            iaVar.N = 3;
                            baVar.f(true);
                            return;
                        } else if (i18 == 2) {
                            if (iaVar.N == 2) {
                                iaVar.M = 2;
                                iaVar.f7390b.D(1);
                            }
                            iaVar.N = 2;
                            baVar.f(true);
                            return;
                        } else if (i18 == 4) {
                            if (iaVar.N == 4) {
                                iaVar.M = 4;
                                iaVar.f7390b.D(1);
                            }
                            iaVar.N = 4;
                            baVar.f(true);
                            return;
                        } else {
                            if (i18 > 0) {
                                arrayList3.clear();
                                hashMap.clear();
                                iaVar.N = m9Var.f7651i;
                                t9Var.f7241c.a();
                            } else {
                                TLRPC.Chat chat = m9Var.h;
                                if (chat != null) {
                                    long j3 = chat.f19869id;
                                    if (ia.d1(iaVar, chat) > 200) {
                                        try {
                                            baVar.performHapticFeedback(3, 1);
                                        } catch (Throwable unused) {
                                        }
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(baVar.getContext(), 0, ia.J(iaVar));
                                        alertDialog$Builder.f20198a.R = LocaleController.getString(R.string.GroupTooLarge);
                                        alertDialog$Builder.f20198a.T = LocaleController.getString(R.string.GroupTooLargeMessage);
                                        i2.g.B(R.string.OK, alertDialog$Builder, null);
                                    } else if (hashMap.containsKey(Long.valueOf(j3))) {
                                        ArrayList arrayList4 = (ArrayList) hashMap.get(Long.valueOf(j3));
                                        if (arrayList4 != null) {
                                            int size = arrayList4.size();
                                            while (i17 < size) {
                                                Object obj = arrayList4.get(i17);
                                                i17++;
                                                iVar.k(Boolean.FALSE, ((Long) obj).longValue());
                                            }
                                        }
                                        hashMap.remove(Long.valueOf(j3));
                                        baVar.i(true);
                                    } else {
                                        TLRPC.Chat chat2 = MessagesController.getInstance(ia.K(iaVar)).getChat(Long.valueOf(j3));
                                        TLRPC.ChatFull chatFull = MessagesController.getInstance(ia.L(iaVar)).getChatFull(j3);
                                        if (chatFull != null && (chatParticipants = chatFull.participants) != null && (arrayList = chatParticipants.participants) != null && !arrayList.isEmpty() && chatFull.participants.participants.size() >= chatFull.participants_count - 1) {
                                            baVar.d(j3, chatFull.participants);
                                        } else {
                                            b2 b2Var = baVar.G;
                                            if (b2Var != null) {
                                                b2Var.dismiss();
                                                baVar.G = null;
                                            }
                                            baVar.H = j3;
                                            b2 b2Var2 = new b2(baVar.getContext(), 3, ia.M(iaVar));
                                            baVar.G = b2Var2;
                                            b2Var2.q(50L);
                                            MessagesStorage messagesStorage = MessagesStorage.getInstance(ia.N(iaVar));
                                            messagesStorage.getStorageQueue().postRunnable(new x7(baVar, chat2, messagesStorage, j3, 4));
                                        }
                                        if (!TextUtils.isEmpty(baVar.I)) {
                                            t9Var.setText("");
                                            baVar.I = null;
                                            baVar.g(false);
                                        }
                                    }
                                } else {
                                    TLRPC.User user = m9Var.f7650g;
                                    if (user != null) {
                                        if (baVar.f6956a == 0) {
                                            iaVar.N = 0;
                                        }
                                        long j10 = user.f20016id;
                                        HashSet hashSet = new HashSet(arrayList3);
                                        if (arrayList3.contains(Long.valueOf(j10))) {
                                            Iterator it = hashMap.entrySet().iterator();
                                            while (it.hasNext()) {
                                                Map.Entry entry = (Map.Entry) it.next();
                                                if (((ArrayList) entry.getValue()).contains(Long.valueOf(j10))) {
                                                    it.remove();
                                                    hashSet.addAll((Collection) entry.getValue());
                                                }
                                            }
                                            hashSet.remove(Long.valueOf(j10));
                                            iVar.k(Boolean.FALSE, j10);
                                        } else {
                                            Iterator it2 = hashMap.entrySet().iterator();
                                            while (it2.hasNext()) {
                                                Map.Entry entry2 = (Map.Entry) it2.next();
                                                if (((ArrayList) entry2.getValue()).contains(Long.valueOf(j10))) {
                                                    it2.remove();
                                                    hashSet.addAll((Collection) entry2.getValue());
                                                }
                                            }
                                            hashSet.add(Long.valueOf(j10));
                                            if (!TextUtils.isEmpty(baVar.I)) {
                                                t9Var.setText("");
                                                baVar.I = null;
                                                baVar.g(false);
                                            }
                                            iVar.k(Boolean.TRUE, j10);
                                        }
                                        arrayList3.clear();
                                        arrayList3.addAll(hashSet);
                                        baVar.i(true);
                                    }
                                }
                            }
                            baVar.f(true);
                            baVar.e(true);
                            t9Var.K = true;
                            return;
                        }
                    } else if (i16 == 7) {
                        if (view instanceof r8) {
                            r8 r8Var = (r8) view;
                            r8Var.setChecked(!r8Var.b());
                            m9Var.f7653k = r8Var.b();
                            int i19 = m9Var.f7647c;
                            if (i19 == 0) {
                                boolean b10 = r8Var.b();
                                iaVar.f7400x = b10;
                                if (iaVar.N == 4) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (b10) {
                                    yc ycVar = new yc(iaVar.container, ia.O(iaVar));
                                    int i20 = R.raw.ic_save_to_gallery;
                                    if (z10) {
                                        i14 = R.string.StoryEnabledScreenshotsShare;
                                    } else {
                                        i14 = R.string.StoryEnabledScreenshots;
                                    }
                                    qc G = ycVar.G(i20, 4, LocaleController.getString(i14));
                                    G.f29679j = 5000;
                                    G.k(true);
                                    return;
                                }
                                yc ycVar2 = new yc(iaVar.container, ia.P(iaVar));
                                int i21 = R.raw.passcode_lock_close;
                                if (z10) {
                                    i13 = R.string.StoryDisabledScreenshotsShare;
                                } else {
                                    i13 = R.string.StoryDisabledScreenshots;
                                }
                                qc G2 = ycVar2.G(i21, 4, LocaleController.getString(i13));
                                G2.f29679j = 5000;
                                G2.k(true);
                                return;
                            } else if (i19 == 1) {
                                boolean b11 = r8Var.b();
                                iaVar.f7401y = b11;
                                boolean z11 = iaVar.f7392c instanceof TLRPC.TL_inputPeerChannel;
                                if (b11) {
                                    yc ycVar3 = new yc(iaVar.container, ia.R(iaVar));
                                    int i22 = R.raw.msg_story_keep;
                                    if (z11) {
                                        i12 = R.string.StoryChannelEnableKeep;
                                    } else {
                                        i12 = R.string.StoryEnableKeep;
                                    }
                                    qc G3 = ycVar3.G(i22, 4, LocaleController.getString(i12));
                                    G3.f29679j = 5000;
                                    G3.k(true);
                                } else {
                                    yc ycVar4 = new yc(iaVar.container, ia.S(iaVar));
                                    int i23 = R.raw.fire_on;
                                    if (z11) {
                                        i11 = R.string.StoryChannelDisableKeep;
                                    } else {
                                        i11 = R.string.StoryDisableKeep;
                                    }
                                    qc G4 = ycVar4.G(i23, 4, LocaleController.getString(i11));
                                    G4.f29679j = 5000;
                                    G4.k(true);
                                }
                                baVar.g(true);
                                return;
                            } else if (i19 == 2) {
                                iaVar.f7399w = r8Var.b();
                                baVar.g(true);
                                return;
                            } else {
                                return;
                            }
                        }
                        return;
                    } else if (i16 == 9) {
                        int i24 = m9Var.f7659q;
                        if (i24 == 0) {
                            ka kaVar = iaVar.f7393c0;
                            if (kaVar != null) {
                                kaVar.run();
                                return;
                            }
                            return;
                        } else if (i24 == 1) {
                            TLRPC.InputPeer inputPeer = iaVar.f7392c;
                            if (inputPeer != null) {
                                clientUserId = DialogObject.getPeerDialogId(inputPeer);
                            } else {
                                clientUserId = UserConfig.getInstance(ia.b1(iaVar)).getClientUserId();
                            }
                            n70 F = n70.F(baVar, ia.T(iaVar), view);
                            F.c(R.drawable.msg_addfolder, LocaleController.getString(R.string.StoriesAlbumNewAlbum), new bi.g(baVar, clientUserId, 5), false);
                            F.k();
                            n70.f(F, iaVar.i1().B(clientUserId, true), iaVar.v, false, null, new m2(4, baVar, F));
                            F.Z();
                            return;
                        } else if (i24 == 5) {
                            b2 b2Var3 = new b2(baVar.getContext(), 3, ia.U(iaVar));
                            b2Var3.q(500L);
                            TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = new TL_phone.getGroupCallStreamRtmpUrl();
                            getgroupcallstreamrtmpurl.live_story = true;
                            TLRPC.InputPeer inputPeer2 = iaVar.f7392c;
                            if (inputPeer2 == null) {
                                inputPeer2 = new TLRPC.TL_inputPeerSelf();
                            }
                            getgroupcallstreamrtmpurl.peer = inputPeer2;
                            ConnectionsManager.getInstance(ia.V(iaVar)).sendRequest(getgroupcallstreamrtmpurl, new c5(baVar, b2Var3, getgroupcallstreamrtmpurl, 1));
                            return;
                        } else if (i24 == 6) {
                            iaVar.G = false;
                            baVar.g(true);
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
                org.telegram.ui.i4 i4Var = (org.telegram.ui.i4) this.f587b;
                m3 m3Var = (m3) this.f588c;
                if (i4Var.K == null || i15 - 1 >= 0) {
                    q9 q9Var = i4Var.O0;
                    if (q9Var != null) {
                        if (q9Var.y()) {
                            i4Var.O0.f(false);
                            return;
                        }
                        i4Var.O0.f(false);
                    }
                    g4 adapter = m3Var.getAdapter();
                    if ((view instanceof p3) && adapter.E != null) {
                        p3 p3Var = (p3) view;
                        if (i4Var.G0 == 0) {
                            if ((!p3Var.f39395c || f7 >= view.getMeasuredWidth() / 2) && !p3Var.d) {
                                TLObject userOrChat = MessagesController.getInstance(i4Var.X).getUserOrChat("previews");
                                if (userOrChat instanceof TLRPC.TL_user) {
                                    i4Var.P(adapter.E.f20022id, (TLRPC.User) userOrChat);
                                    return;
                                }
                                int i25 = UserConfig.selectedAccount;
                                long j11 = adapter.E.f20022id;
                                i4Var.b0(true);
                                TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                                tL_contacts_resolveUsername.username = "previews";
                                i4Var.G0 = ConnectionsManager.getInstance(i25).sendRequest(tL_contacts_resolveUsername, new de(i4Var, i25, j11));
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (i15 >= 0 && i15 < adapter.d.size()) {
                        TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) adapter.d.get(i15);
                        TL_iv.PageBlock z12 = org.telegram.ui.i4.z(pageBlock);
                        if (z12 instanceof w3) {
                            z12 = ((w3) z12).f41753b;
                        }
                        if (z12 instanceof TL_iv.pageBlockChannel) {
                            MessagesController.getInstance(i4Var.X).openByUserName(ChatObject.getPublicUsername(((TL_iv.pageBlockChannel) z12).channel), i4Var.M, 2);
                            i4Var.o(false, true);
                            return;
                        } else if (z12 instanceof c4) {
                            c4 c4Var = (c4) z12;
                            i4Var.Q(c4Var.f34990a.articles.get(c4Var.f34991b).url, null, null);
                            return;
                        } else if (z12 instanceof TL_iv.pageBlockDetails) {
                            View y3 = org.telegram.ui.i4.y(view);
                            if (y3 instanceof org.telegram.ui.m1) {
                                i4Var.d = null;
                                i4Var.f41437f = null;
                                if (adapter.f36550e.indexOf(pageBlock) >= 0) {
                                    TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) z12;
                                    pageblockdetails.open = !pageblockdetails.open;
                                    int h = adapter.h();
                                    adapter.M();
                                    int abs = Math.abs(adapter.h() - h);
                                    org.telegram.ui.m1 m1Var = (org.telegram.ui.m1) y3;
                                    AnimatedArrowDrawable animatedArrowDrawable = m1Var.f38539f;
                                    if (pageblockdetails.open) {
                                        f11 = 0.0f;
                                    } else {
                                        f11 = 1.0f;
                                    }
                                    animatedArrowDrawable.a(f11);
                                    m1Var.invalidate();
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
    public boolean d1(View view) {
        switch (this.f586a) {
            case 10:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void e(ga gaVar, boolean z10, boolean z11, boolean z12, boolean z13, TLRPC.InputPeer inputPeer, int i10, b7 b7Var, oa oaVar) {
        boolean z14;
        switch (this.f586a) {
            case 2:
                o5 o5Var = (o5) this.f587b;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.f588c;
                TL_stories.TL_stories_editStory tL_stories_editStory = new TL_stories.TL_stories_editStory();
                tL_stories_editStory.peer = MessagesController.getInstance(o5Var.C2).getInputPeer(storyItem.dialogId);
                tL_stories_editStory.f20111id = storyItem.f20107id;
                tL_stories_editStory.flags |= 4;
                tL_stories_editStory.privacy_rules = gaVar.f7299b;
                ConnectionsManager.getInstance(o5Var.C2).sendRequest(tL_stories_editStory, new c3(o5Var, b7Var, storyItem, gaVar, 0));
                return;
            default:
                f5 f5Var = (f5) this.f587b;
                ia iaVar = (ia) this.f588c;
                o5 o5Var2 = f5Var.f2972l;
                m5 m5Var = o5Var2.O1;
                TL_stories.StoryItem storyItem2 = m5Var.f3310a;
                if (storyItem2 != null && storyItem2.pinned) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (z14 != z12) {
                    MessagesController.getInstance(o5Var2.C2).getStoriesController().o0(o5Var2.B1, o5Var2.f3466v1, z12, null);
                }
                TL_stories.StoryItem storyItem3 = m5Var.f3310a;
                if (storyItem3 != null) {
                    TLRPC.MessageMedia messageMedia = storyItem3.media;
                    if (messageMedia instanceof TLRPC.TL_messageMediaVideoStream) {
                        TLRPC.InputGroupCall inputGroupCall = ((TLRPC.TL_messageMediaVideoStream) messageMedia).call;
                        TL_phone.toggleGroupCallSettings togglegroupcallsettings = new TL_phone.toggleGroupCallSettings();
                        togglegroupcallsettings.call = inputGroupCall;
                        togglegroupcallsettings.messages_enabled = Boolean.valueOf(z10);
                        togglegroupcallsettings.send_paid_messages_stars = Long.valueOf(i10);
                        ConnectionsManager.getInstance(o5Var2.C2).sendRequest(togglegroupcallsettings, new bi.m1(1, f5Var, iaVar));
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public void f(m4.r rVar) {
        switch (this.f586a) {
            case 24:
                Bundle bundle = (Bundle) this.f588c;
                m4.a0 a0Var = ((m4.k0) this.f587b).f15970g;
                if (bundle == null) {
                    Bundle bundle2 = Bundle.EMPTY;
                }
                a0Var.n(rVar);
                return;
            default:
                m4.k0 k0Var = (m4.k0) this.f587b;
                k0Var.getClass();
                String str = ((n4.l) this.f588c).f16459a;
                if (TextUtils.isEmpty(str)) {
                    e2.a.n("MediaSessionLegacyStub", "onRemoveQueueItem(): Media ID shouldn't be null");
                    return;
                }
                m4.j1 j1Var = k0Var.f15970g.f15843t;
                if (!j1Var.m0(17)) {
                    e2.a.n("MediaSessionLegacyStub", "Can't remove item by ID without COMMAND_GET_TIMELINE being available");
                    return;
                }
                b2.k1 w02 = j1Var.w0();
                b2.j1 j1Var2 = new b2.j1();
                for (int i10 = 0; i10 < w02.o(); i10++) {
                    if (TextUtils.equals(w02.m(i10, j1Var2, 0L).f2108c.f2126a, str)) {
                        j1Var.R(i10);
                        return;
                    }
                }
                return;
        }
    }

    @Override
    public void g(b2 b2Var, int i10) {
        switch (this.f586a) {
            case 4:
                f5 f5Var = (f5) this.f587b;
                t1 t1Var = ((pb) this.f588c).A0;
                if (t1Var != null) {
                    if (!t1Var.f3723w) {
                        TL_phone.discardGroupCall discardgroupcall = new TL_phone.discardGroupCall();
                        discardgroupcall.call = t1Var.f3719f;
                        ConnectionsManager.getInstance(t1Var.f3718e).sendRequest(discardgroupcall, new bi.i1(t1Var, 4));
                        t1Var.e();
                        return;
                    }
                    return;
                }
                o5.f0(f5Var.f2972l);
                return;
            case 11:
                e4.y0((e4) this.f587b, (TL_payments.connectedBotStarRef) this.f588c);
                return;
            case 13:
                hg.k1 k1Var = (hg.k1) this.f587b;
                k1Var.getClass();
                ((boolean[]) this.f588c)[0] = true;
                k1Var.Q();
                return;
            default:
                ig.y.d(r4.currentAccount).a((ig.v) this.f587b, ((TL_account.TL_businessChatLink) this.f588c).link);
                return;
        }
    }

    @Override
    public Object h(m4.a0 a0Var, m4.r rVar, int i10) {
        switch (this.f586a) {
            case 26:
                m4.e1 e1Var = (m4.e1) this.f587b;
                m4.t0 t0Var = (m4.t0) this.f588c;
                if (a0Var.j()) {
                    return l8.b(new p1(-100));
                }
                return e2.d0.d0((i9.w) e1Var.h(a0Var, rVar, i10), new androidx.car.app.utils.a(a0Var, rVar, t0Var, 14));
            default:
                m4.e1 e1Var2 = (m4.e1) this.f587b;
                m4.d1 d1Var = (m4.d1) this.f588c;
                if (a0Var.j()) {
                    return l8.b(new p1(-100));
                }
                return e2.d0.d0((i9.w) e1Var2.h(a0Var, rVar, i10), new androidx.car.app.utils.a(a0Var, rVar, d1Var, 15));
        }
    }

    @Override
    public n70 i(ji.h1 h1Var) {
        ji.r rVar = (ji.r) ((n4.y) this.f587b).f16497c;
        n70 n70Var = new n70(rVar, (f6) this.f588c, h1Var, false, false, true);
        rVar.H = n70Var;
        return n70Var;
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f586a) {
            case 18:
                ((j2.b) obj).e((j2.a) this.f587b, (u2.b0) this.f588c);
                return;
            default:
                ((j2.b) obj).onRenderedFirstFrame((j2.a) this.f587b);
                return;
        }
    }

    @Override
    public void j() {
        switch (this.f586a) {
            case 21:
                ((ji.k0) this.f587b).i();
                ((ji.j0) this.f588c).c0();
                return;
            default:
                s5 s5Var = (s5) this.f587b;
                v5 v5Var = (v5) this.f588c;
                TL_iv.pageTableCell pagetablecell = v5Var.f14278b;
                if (pagetablecell != null) {
                    k6.d(pagetablecell, v5Var.f14277a.getText());
                }
                b3 b3Var = s5Var.E;
                if (b3Var != null && s5Var.f13749a != null) {
                    v3.N1(b3Var.f13790a);
                    return;
                }
                return;
        }
    }

    @Override
    public void k(RectF rectF, View view) {
        ((dh.d) this.f587b).s(rectF.left, rectF.top);
        ((View) this.f588c).invalidate();
    }

    @Override
    public void onComplete(Task task) {
        ((com.google.firebase.messaging.g) this.f587b).a((Intent) this.f588c);
    }

    @Override
    public void onFailure(Exception e7) {
        String str;
        w0.i gVar;
        String str2;
        w0.d cVar;
        switch (this.f586a) {
            case 5:
                c1.e eVar = (c1.e) this.f587b;
                CancellationSignal cancellationSignal = (CancellationSignal) this.f588c;
                kotlin.jvm.internal.i.e(e7, "e");
                if ((e7 instanceof com.google.android.gms.common.api.f) && b1.d.f1923b.contains(Integer.valueOf(((com.google.android.gms.common.api.f) e7).getStatusCode()))) {
                    str = "GET_INTERRUPTED";
                } else {
                    str = "GET_NO_CREDENTIALS";
                }
                String str3 = "During begin sign in, failure response from one tap: " + e7.getMessage();
                int hashCode = str.hashCode();
                if (hashCode != -1567968963) {
                    if (hashCode != -154594663) {
                        if (hashCode == 1996705159 && str.equals("GET_NO_CREDENTIALS")) {
                            gVar = new w0.k(str3);
                        }
                        gVar = new w0.h(str3, 2);
                    } else {
                        if (str.equals("GET_INTERRUPTED")) {
                            gVar = new w0.j(str3);
                        }
                        gVar = new w0.h(str3, 2);
                    }
                } else {
                    if (str.equals("GET_CANCELED_TAG")) {
                        gVar = new w0.g(str3);
                    }
                    gVar = new w0.h(str3, 2);
                }
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!a1.g.a(cancellationSignal)) {
                    eVar.f().execute(new c1.a(eVar, gVar, 0));
                    return;
                }
                return;
            default:
                d1.e eVar2 = (d1.e) this.f587b;
                CancellationSignal cancellationSignal2 = (CancellationSignal) this.f588c;
                kotlin.jvm.internal.i.e(e7, "e");
                if ((e7 instanceof com.google.android.gms.common.api.f) && b1.d.f1923b.contains(Integer.valueOf(((com.google.android.gms.common.api.f) e7).getStatusCode()))) {
                    str2 = "CREATE_INTERRUPTED";
                } else {
                    str2 = "CREATE_UNKNOWN";
                }
                String str4 = "During create public key credential, fido registration failure: " + e7.getMessage();
                if (str2.equals("CREATE_CANCELED")) {
                    cVar = new w0.b(str4);
                } else if (str2.equals("CREATE_INTERRUPTED")) {
                    cVar = new w0.e(str4);
                } else {
                    cVar = new w0.c(str4, 2);
                }
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!a1.g.a(cancellationSignal2)) {
                    Executor executor = eVar2.f6467g;
                    if (executor != null) {
                        executor.execute(new d1.a(eVar2, cVar, 1));
                        return;
                    } else {
                        kotlin.jvm.internal.i.h("executor");
                        throw null;
                    }
                }
                return;
        }
    }

    @Override
    public void q0(View view, float f7, float f10) {
        int i10 = this.f586a;
    }

    @Override
    public void run(long j3) {
        TL_keyboard.TL_inlineButtonTypeUserProfile tL_inlineButtonTypeUserProfile = new TL_keyboard.TL_inlineButtonTypeUserProfile();
        tL_inlineButtonTypeUserProfile.user_id = j3;
        ((s3) this.f587b).a((String) this.f588c, tL_inlineButtonTypeUserProfile);
    }

    @Override
    public Object then(Task task) {
        com.google.firebase.messaging.j jVar = (com.google.firebase.messaging.j) this.f587b;
        String str = (String) this.f588c;
        synchronized (jVar) {
            ((a0.f) jVar.f6366b).remove(str);
        }
        return task;
    }

    public i0(j2.a aVar, Object obj, long j3) {
        this.f586a = 19;
        this.f587b = aVar;
        this.f588c = obj;
    }

    public i0(m4.k0 k0Var, m4.l1 l1Var, Bundle bundle) {
        this.f586a = 24;
        this.f587b = k0Var;
        this.f588c = bundle;
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3) {
        ig.m mVar = (ig.m) this.f587b;
        TLRPC.Document document = (TLRPC.Document) obj2;
        Boolean bool = (Boolean) obj3;
        mVar.f12147w = false;
        AndroidUtilities.cancelRunOnUIThread(mVar.d);
        ig.i iVar = mVar.f12144n;
        mVar.f12148x = document;
        iVar.setSticker(document);
        ((r8) ((View) this.f588c)).setValueSticker(document);
        mVar.e0(true);
        return Boolean.TRUE;
    }

    private final void l(View view, float f7, float f10) {
    }

    private final void m(View view, float f7, float f10) {
    }
}
