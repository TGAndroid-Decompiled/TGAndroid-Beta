package ah;

import ai.d2;
import ai.d6;
import ai.jc;
import ai.p3;
import ai.p8;
import ai.q1;
import ai.r5;
import ai.t5;
import ai.v1;
import ai.w5;
import android.content.Context;
import android.content.Intent;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Trace;
import android.text.TextUtils;
import android.view.View;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import b2.b1;
import b2.k1;
import b2.q;
import ci.b9;
import ci.ba;
import ci.ga;
import ci.i9;
import ci.ia;
import ci.k9;
import ci.ka;
import ci.m2;
import ci.n9;
import ci.q9;
import ci.u9;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import e2.d0;
import ei.e4;
import i9.w;
import ii.c3;
import ii.h6;
import ii.i1;
import ii.i4;
import ii.o5;
import ii.p0;
import ii.r;
import ii.t3;
import ii.w3;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;
import m4.a0;
import m4.d1;
import m4.e1;
import m4.j0;
import m4.j1;
import m4.k0;
import m4.p1;
import m4.q0;
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
import org.telegram.messenger.l0;
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
import org.telegram.ui.Cells.r9;
import org.telegram.ui.Cells.s8;
import org.telegram.ui.Cells.v;
import org.telegram.ui.Components.AnimatedArrowDrawable;
import org.telegram.ui.Components.kl0;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.v70;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.zt;
import org.telegram.ui.b4;
import org.telegram.ui.f4;
import org.telegram.ui.fd0;
import org.telegram.ui.h4;
import org.telegram.ui.l1;
import org.telegram.ui.l3;
import org.telegram.ui.o3;
import org.telegram.ui.v3;
import u2.b0;
import v7.m8;
public final class b implements hh.i, k9, a2, OnFailureListener, q9.d, kl0, OnCompleteListener, Continuation, ll0, Utilities.Callback3Return, fd0, p0, zt, i4, e2.n, e2.m, j0, e1, v {
    public final int f419a;
    public final Object f420b;
    public final Object f421c;

    public b(int i10, Object obj, Object obj2) {
        this.f419a = i10;
        this.f420b = obj;
        this.f421c = obj2;
    }

    @Override
    public Object G(cf.c cVar) {
        String str = (String) this.f420b;
        q9.a aVar = (q9.a) this.f421c;
        try {
            Trace.beginSection(str);
            return aVar.f41479f.G(cVar);
        } finally {
            Trace.endSection();
        }
    }

    @Override
    public v70 a(i1 i1Var) {
        r rVar = (r) ((of.b) this.f420b).f15683c;
        v70 v70Var = new v70(rVar, (f6) this.f421c, i1Var, false, false, true);
        rVar.H = v70Var;
        return v70Var;
    }

    @Override
    public void b(org.telegram.tgnet.TLRPC.MessageMedia r1, int r2, boolean r3, int r4, long r5) {
        throw new UnsupportedOperationException("Method not decompiled: ah.b.b(org.telegram.tgnet.TLRPC$MessageMedia, int, boolean, int, long):void");
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
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
        switch (this.f419a) {
            case 6:
                ba baVar = (ba) this.f420b;
                Context context = (Context) this.f421c;
                ArrayList arrayList2 = baVar.L;
                a0.i iVar = baVar.f4403b;
                u9 u9Var = baVar.f4410x;
                ArrayList arrayList3 = baVar.f4404c;
                HashMap hashMap = baVar.d;
                ia iaVar = baVar.W;
                if (i15 >= 0 && i15 < arrayList2.size()) {
                    n9 n9Var = (n9) arrayList2.get(i15);
                    int i16 = n9Var.f15704a;
                    int i17 = 0;
                    if (i16 == 3) {
                        if (n9Var.f5088n && iaVar.F) {
                            new i9(context, ia.H(iaVar), iaVar.K, iaVar.f4809c, new q9(baVar, 0), ia.I(iaVar)).show();
                            return;
                        }
                        int i18 = n9Var.f5083i;
                        if (i18 == 1) {
                            if (iaVar.N == 1 || ia.J0(iaVar).isEmpty()) {
                                iaVar.M = 1;
                                iaVar.f4807b.E(1);
                            }
                            iaVar.N = 1;
                            baVar.f(true);
                            return;
                        } else if (i18 == 3) {
                            if (iaVar.N == 3 || (iaVar.f4812n.isEmpty() && iaVar.f4813r.isEmpty())) {
                                iaVar.M = 3;
                                iaVar.f4807b.E(1);
                            }
                            iaVar.N = 3;
                            baVar.f(true);
                            return;
                        } else if (i18 == 2) {
                            if (iaVar.N == 2) {
                                iaVar.M = 2;
                                iaVar.f4807b.E(1);
                            }
                            iaVar.N = 2;
                            baVar.f(true);
                            return;
                        } else if (i18 == 4) {
                            if (iaVar.N == 4) {
                                iaVar.M = 4;
                                iaVar.f4807b.E(1);
                            }
                            iaVar.N = 4;
                            baVar.f(true);
                            return;
                        } else {
                            if (i18 > 0) {
                                arrayList3.clear();
                                hashMap.clear();
                                iaVar.N = n9Var.f5083i;
                                u9Var.f4672c.a();
                            } else {
                                TLRPC.Chat chat = n9Var.h;
                                if (chat != null) {
                                    long j3 = chat.f18328id;
                                    if (ia.d1(iaVar, chat) > 200) {
                                        try {
                                            baVar.performHapticFeedback(3, 1);
                                        } catch (Throwable unused) {
                                        }
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(baVar.getContext(), 0, ia.J(iaVar));
                                        alertDialog$Builder.f18654a.R = LocaleController.getString(R.string.GroupTooLarge);
                                        alertDialog$Builder.f18654a.T = LocaleController.getString(R.string.GroupTooLargeMessage);
                                        l0.n(R.string.OK, alertDialog$Builder, null);
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
                                            messagesStorage.getStorageQueue().postRunnable(new p8(baVar, chat2, messagesStorage, j3, 4));
                                        }
                                        if (!TextUtils.isEmpty(baVar.I)) {
                                            u9Var.setText("");
                                            baVar.I = null;
                                            baVar.g(false);
                                        }
                                    }
                                } else {
                                    TLRPC.User user = n9Var.f5082g;
                                    if (user != null) {
                                        if (baVar.f4402a == 0) {
                                            iaVar.N = 0;
                                        }
                                        long j10 = user.f18475id;
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
                                                u9Var.setText("");
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
                            u9Var.K = true;
                            return;
                        }
                    } else if (i16 == 7) {
                        if (view instanceof s8) {
                            s8 s8Var = (s8) view;
                            s8Var.setChecked(!s8Var.b());
                            n9Var.f5085k = s8Var.b();
                            int i19 = n9Var.f5080c;
                            if (i19 == 0) {
                                boolean b10 = s8Var.b();
                                iaVar.f4816x = b10;
                                if (iaVar.N == 4) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (b10) {
                                    xc xcVar = new xc(iaVar.container, ia.O(iaVar));
                                    int i20 = R.raw.ic_save_to_gallery;
                                    if (z10) {
                                        i14 = R.string.StoryEnabledScreenshotsShare;
                                    } else {
                                        i14 = R.string.StoryEnabledScreenshots;
                                    }
                                    pc G = xcVar.G(i20, 4, LocaleController.getString(i14));
                                    G.f27252j = 5000;
                                    G.k(true);
                                    return;
                                }
                                xc xcVar2 = new xc(iaVar.container, ia.P(iaVar));
                                int i21 = R.raw.passcode_lock_close;
                                if (z10) {
                                    i13 = R.string.StoryDisabledScreenshotsShare;
                                } else {
                                    i13 = R.string.StoryDisabledScreenshots;
                                }
                                pc G2 = xcVar2.G(i21, 4, LocaleController.getString(i13));
                                G2.f27252j = 5000;
                                G2.k(true);
                                return;
                            } else if (i19 == 1) {
                                boolean b11 = s8Var.b();
                                iaVar.f4817y = b11;
                                boolean z11 = iaVar.f4809c instanceof TLRPC.TL_inputPeerChannel;
                                if (b11) {
                                    xc xcVar3 = new xc(iaVar.container, ia.R(iaVar));
                                    int i22 = R.raw.msg_story_keep;
                                    if (z11) {
                                        i12 = R.string.StoryChannelEnableKeep;
                                    } else {
                                        i12 = R.string.StoryEnableKeep;
                                    }
                                    pc G3 = xcVar3.G(i22, 4, LocaleController.getString(i12));
                                    G3.f27252j = 5000;
                                    G3.k(true);
                                } else {
                                    xc xcVar4 = new xc(iaVar.container, ia.S(iaVar));
                                    int i23 = R.raw.fire_on;
                                    if (z11) {
                                        i11 = R.string.StoryChannelDisableKeep;
                                    } else {
                                        i11 = R.string.StoryDisableKeep;
                                    }
                                    pc G4 = xcVar4.G(i23, 4, LocaleController.getString(i11));
                                    G4.f27252j = 5000;
                                    G4.k(true);
                                }
                                baVar.g(true);
                                return;
                            } else if (i19 == 2) {
                                iaVar.f4815w = s8Var.b();
                                baVar.g(true);
                                return;
                            } else {
                                return;
                            }
                        }
                        return;
                    } else if (i16 == 9) {
                        int i24 = n9Var.f5091q;
                        if (i24 == 0) {
                            ka kaVar = iaVar.f4810c0;
                            if (kaVar != null) {
                                kaVar.run();
                                return;
                            }
                            return;
                        } else if (i24 == 1) {
                            TLRPC.InputPeer inputPeer = iaVar.f4809c;
                            if (inputPeer != null) {
                                clientUserId = DialogObject.getPeerDialogId(inputPeer);
                            } else {
                                clientUserId = UserConfig.getInstance(ia.b1(iaVar)).getClientUserId();
                            }
                            v70 F = v70.F(baVar, ia.T(iaVar), view);
                            F.c(R.drawable.msg_addfolder, LocaleController.getString(R.string.StoriesAlbumNewAlbum), new ai.j(baVar, clientUserId, 5), false);
                            F.k();
                            v70.f(F, iaVar.i1().B(clientUserId, true), iaVar.v, false, null, new m2(4, baVar, F));
                            F.Z();
                            return;
                        } else if (i24 == 5) {
                            b2 b2Var3 = new b2(baVar.getContext(), 3, ia.U(iaVar));
                            b2Var3.q(500L);
                            TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = new TL_phone.getGroupCallStreamRtmpUrl();
                            getgroupcallstreamrtmpurl.live_story = true;
                            TLRPC.InputPeer inputPeer2 = iaVar.f4809c;
                            if (inputPeer2 == null) {
                                inputPeer2 = new TLRPC.TL_inputPeerSelf();
                            }
                            getgroupcallstreamrtmpurl.peer = inputPeer2;
                            ConnectionsManager.getInstance(ia.V(iaVar)).sendRequest(getgroupcallstreamrtmpurl, new t5(baVar, b2Var3, getgroupcallstreamrtmpurl, 1));
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
                h4 h4Var = (h4) this.f420b;
                l3 l3Var = (l3) this.f421c;
                if (h4Var.K == null || i15 - 1 >= 0) {
                    r9 r9Var = h4Var.O0;
                    if (r9Var != null) {
                        if (r9Var.y()) {
                            h4Var.O0.f(false);
                            return;
                        }
                        h4Var.O0.f(false);
                    }
                    f4 adapter = l3Var.getAdapter();
                    if ((view instanceof o3) && adapter.E != null) {
                        o3 o3Var = (o3) view;
                        if (h4Var.G0 == 0) {
                            if ((!o3Var.f36183c || f7 >= view.getMeasuredWidth() / 2) && !o3Var.d) {
                                TLObject userOrChat = MessagesController.getInstance(h4Var.X).getUserOrChat("previews");
                                if (userOrChat instanceof TLRPC.TL_user) {
                                    h4Var.P(adapter.E.f18481id, (TLRPC.User) userOrChat);
                                    return;
                                }
                                int i25 = UserConfig.selectedAccount;
                                long j11 = adapter.E.f18481id;
                                h4Var.b0(true);
                                TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                                tL_contacts_resolveUsername.username = "previews";
                                h4Var.G0 = ConnectionsManager.getInstance(i25).sendRequest(tL_contacts_resolveUsername, new de(h4Var, i25, j11));
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (i15 >= 0 && i15 < adapter.d.size()) {
                        TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) adapter.d.get(i15);
                        TL_iv.PageBlock z12 = h4.z(pageBlock);
                        if (z12 instanceof v3) {
                            z12 = ((v3) z12).f38386b;
                        }
                        if (z12 instanceof TL_iv.pageBlockChannel) {
                            MessagesController.getInstance(h4Var.X).openByUserName(ChatObject.getPublicUsername(((TL_iv.pageBlockChannel) z12).channel), h4Var.M, 2);
                            h4Var.o(false, true);
                            return;
                        } else if (z12 instanceof b4) {
                            b4 b4Var = (b4) z12;
                            h4Var.Q(b4Var.f32249a.articles.get(b4Var.f32250b).url, null, null);
                            return;
                        } else if (z12 instanceof TL_iv.pageBlockDetails) {
                            View y3 = h4.y(view);
                            if (y3 instanceof l1) {
                                h4Var.d = null;
                                h4Var.f37982f = null;
                                if (adapter.e.indexOf(pageBlock) >= 0) {
                                    TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) z12;
                                    pageblockdetails.open = !pageblockdetails.open;
                                    int h = adapter.h();
                                    adapter.M();
                                    int abs = Math.abs(adapter.h() - h);
                                    l1 l1Var = (l1) y3;
                                    AnimatedArrowDrawable animatedArrowDrawable = l1Var.f35279f;
                                    if (pageblockdetails.open) {
                                        f11 = 0.0f;
                                    } else {
                                        f11 = 1.0f;
                                    }
                                    animatedArrowDrawable.a(f11);
                                    l1Var.invalidate();
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
    public boolean c1(View view) {
        switch (this.f419a) {
            case 6:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean d(int i10, View view) {
        return e4.B0((e4) this.f420b, (Context) this.f421c, view, i10);
    }

    @Override
    public void e(Object obj, q qVar) {
        ((j2.b) obj).d((b1) this.f421c, new of.b(qVar, ((j2.f) this.f420b).e));
    }

    @Override
    public void f(m4.r rVar) {
        switch (this.f419a) {
            case 24:
                Bundle bundle = (Bundle) this.f421c;
                a0 a0Var = ((k0) this.f420b).f14806g;
                if (bundle == null) {
                    Bundle bundle2 = Bundle.EMPTY;
                }
                a0Var.n(rVar);
                return;
            default:
                k0 k0Var = (k0) this.f420b;
                k0Var.getClass();
                String str = ((n4.l) this.f421c).f15184a;
                if (TextUtils.isEmpty(str)) {
                    e2.a.n("MediaSessionLegacyStub", "onRemoveQueueItem(): Media ID shouldn't be null");
                    return;
                }
                j1 j1Var = k0Var.f14806g.f14687t;
                if (!j1Var.m0(17)) {
                    e2.a.n("MediaSessionLegacyStub", "Can't remove item by ID without COMMAND_GET_TIMELINE being available");
                    return;
                }
                k1 w02 = j1Var.w0();
                b2.j1 j1Var2 = new b2.j1();
                for (int i10 = 0; i10 < w02.o(); i10++) {
                    if (TextUtils.equals(w02.m(i10, j1Var2, 0L).f3060c.f3077a, str)) {
                        j1Var.R(i10);
                        return;
                    }
                }
                return;
        }
    }

    @Override
    public void g(ga gaVar, boolean z10, boolean z11, boolean z12, boolean z13, TLRPC.InputPeer inputPeer, int i10, b9 b9Var, androidx.fragment.app.a0 a0Var) {
        boolean z14;
        switch (this.f419a) {
            case 1:
                ai.f6 f6Var = (ai.f6) this.f420b;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.f421c;
                TL_stories.TL_stories_editStory tL_stories_editStory = new TL_stories.TL_stories_editStory();
                tL_stories_editStory.peer = MessagesController.getInstance(f6Var.C2).getInputPeer(storyItem.dialogId);
                tL_stories_editStory.f18567id = storyItem.f18563id;
                tL_stories_editStory.flags |= 4;
                tL_stories_editStory.privacy_rules = gaVar.f4727b;
                ConnectionsManager.getInstance(f6Var.C2).sendRequest(tL_stories_editStory, new p3(f6Var, b9Var, storyItem, gaVar, 0));
                return;
            default:
                w5 w5Var = (w5) this.f420b;
                ia iaVar = (ia) this.f421c;
                ai.f6 f6Var2 = w5Var.f1658l;
                d6 d6Var = f6Var2.O1;
                TL_stories.StoryItem storyItem2 = d6Var.f706a;
                if (storyItem2 != null && storyItem2.pinned) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (z14 != z12) {
                    MessagesController.getInstance(f6Var2.C2).getStoriesController().o0(f6Var2.B1, f6Var2.f860v1, z12, null);
                }
                TL_stories.StoryItem storyItem3 = d6Var.f706a;
                if (storyItem3 != null) {
                    TLRPC.MessageMedia messageMedia = storyItem3.media;
                    if (messageMedia instanceof TLRPC.TL_messageMediaVideoStream) {
                        TLRPC.InputGroupCall inputGroupCall = ((TLRPC.TL_messageMediaVideoStream) messageMedia).call;
                        TL_phone.toggleGroupCallSettings togglegroupcallsettings = new TL_phone.toggleGroupCallSettings();
                        togglegroupcallsettings.call = inputGroupCall;
                        togglegroupcallsettings.messages_enabled = Boolean.valueOf(z10);
                        togglegroupcallsettings.send_paid_messages_stars = Long.valueOf(i10);
                        ConnectionsManager.getInstance(f6Var2.C2).sendRequest(togglegroupcallsettings, new v1(1, w5Var, iaVar));
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public Object h(a0 a0Var, m4.r rVar, int i10) {
        switch (this.f419a) {
            case 26:
                e1 e1Var = (e1) this.f420b;
                q0 q0Var = (q0) this.f421c;
                if (a0Var.j()) {
                    return m8.b(new p1(-100));
                }
                return d0.d0((w) e1Var.h(a0Var, rVar, i10), new r5(a0Var, rVar, q0Var, 14));
            default:
                e1 e1Var2 = (e1) this.f420b;
                d1 d1Var = (d1) this.f421c;
                if (a0Var.j()) {
                    return m8.b(new p1(-100));
                }
                return d0.d0((w) e1Var2.h(a0Var, rVar, i10), new r5(a0Var, rVar, d1Var, 15));
        }
    }

    @Override
    public void i(RectF rectF, View view) {
        ((ch.d) this.f420b).t(rectF.left, rectF.top);
        ((View) this.f421c).invalidate();
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f419a) {
            case 21:
                ((j2.b) obj).e((j2.a) this.f420b, (b0) this.f421c);
                return;
            default:
                ((j2.b) obj).onRenderedFirstFrame((j2.a) this.f420b);
                return;
        }
    }

    @Override
    public void j() {
        switch (this.f419a) {
            case 17:
                ((ii.l0) this.f420b).i();
                ((ii.k0) this.f421c).k0();
                return;
            default:
                o5 o5Var = (o5) this.f420b;
                ii.r5 r5Var = (ii.r5) this.f421c;
                TL_iv.pageTableCell pagetablecell = r5Var.f11608b;
                if (pagetablecell != null) {
                    h6.d(pagetablecell, r5Var.f11607a.getText());
                }
                c3 c3Var = o5Var.E;
                if (c3Var != null && o5Var.f11221a != null) {
                    w3.P1(c3Var.f11287a);
                    return;
                }
                return;
        }
    }

    @Override
    public void k(b2 b2Var, int i10) {
        switch (this.f419a) {
            case 3:
                w5 w5Var = (w5) this.f420b;
                d2 d2Var = ((jc) this.f421c).A0;
                if (d2Var != null) {
                    if (!d2Var.f695w) {
                        TL_phone.discardGroupCall discardgroupcall = new TL_phone.discardGroupCall();
                        discardgroupcall.call = d2Var.f691f;
                        ConnectionsManager.getInstance(d2Var.e).sendRequest(discardgroupcall, new q1(d2Var, 4));
                        d2Var.e();
                        return;
                    }
                    return;
                }
                ai.f6.f0(w5Var.f1658l);
                return;
            case 10:
                e4.y0((e4) this.f420b, (TL_payments.connectedBotStarRef) this.f421c);
                return;
            case 12:
                gg.k1 k1Var = (gg.k1) this.f420b;
                k1Var.getClass();
                ((boolean[]) this.f421c)[0] = true;
                k1Var.Q();
                return;
            default:
                hg.v.Z((hg.v) this.f420b, (TL_account.TL_businessChatLink) this.f421c);
                return;
        }
    }

    @Override
    public void onComplete(Task task) {
        ((com.google.firebase.messaging.g) this.f420b).a((Intent) this.f421c);
    }

    @Override
    public void onFailure(Exception e) {
        String str;
        w0.i gVar;
        String str2;
        w0.d cVar;
        switch (this.f419a) {
            case 4:
                c1.e eVar = (c1.e) this.f420b;
                CancellationSignal cancellationSignal = (CancellationSignal) this.f421c;
                kotlin.jvm.internal.i.e(e, "e");
                if ((e instanceof com.google.android.gms.common.api.f) && b1.d.f2894b.contains(Integer.valueOf(((com.google.android.gms.common.api.f) e).getStatusCode()))) {
                    str = "GET_INTERRUPTED";
                } else {
                    str = "GET_NO_CREDENTIALS";
                }
                String str3 = "During begin sign in, failure response from one tap: " + e.getMessage();
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
                d1.e eVar2 = (d1.e) this.f420b;
                CancellationSignal cancellationSignal2 = (CancellationSignal) this.f421c;
                kotlin.jvm.internal.i.e(e, "e");
                if ((e instanceof com.google.android.gms.common.api.f) && b1.d.f2894b.contains(Integer.valueOf(((com.google.android.gms.common.api.f) e).getStatusCode()))) {
                    str2 = "CREATE_INTERRUPTED";
                } else {
                    str2 = "CREATE_UNKNOWN";
                }
                String str4 = "During create public key credential, fido registration failure: " + e.getMessage();
                if (str2.equals("CREATE_CANCELED")) {
                    cVar = new w0.b(str4);
                } else if (str2.equals("CREATE_INTERRUPTED")) {
                    cVar = new w0.e(str4);
                } else {
                    cVar = new w0.c(str4, 2);
                }
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!a1.g.a(cancellationSignal2)) {
                    Executor executor = eVar2.f7411g;
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
        int i10 = this.f419a;
    }

    @Override
    public void run(long j3) {
        TL_keyboard.TL_inlineButtonTypeUserProfile tL_inlineButtonTypeUserProfile = new TL_keyboard.TL_inlineButtonTypeUserProfile();
        tL_inlineButtonTypeUserProfile.user_id = j3;
        ((t3) this.f420b).a((String) this.f421c, tL_inlineButtonTypeUserProfile);
    }

    @Override
    public Object then(Task task) {
        com.google.firebase.messaging.j jVar = (com.google.firebase.messaging.j) this.f420b;
        String str = (String) this.f421c;
        synchronized (jVar) {
            ((a0.f) jVar.f7323b).remove(str);
        }
        return task;
    }

    public b(j2.a aVar, Object obj, long j3) {
        this.f419a = 22;
        this.f420b = aVar;
        this.f421c = obj;
    }

    public b(k0 k0Var, m4.l1 l1Var, Bundle bundle) {
        this.f419a = 24;
        this.f420b = k0Var;
        this.f421c = bundle;
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3) {
        hg.m mVar = (hg.m) this.f420b;
        TLRPC.Document document = (TLRPC.Document) obj2;
        Boolean bool = (Boolean) obj3;
        mVar.f10360x = false;
        AndroidUtilities.cancelRunOnUIThread(mVar.e);
        hg.i iVar = mVar.f10357r;
        mVar.f10361y = document;
        iVar.setSticker(document);
        ((s8) ((View) this.f421c)).setValueSticker(document);
        mVar.e0(true);
        return Boolean.TRUE;
    }

    private final void l(View view, float f7, float f10) {
    }

    private final void m(View view, float f7, float f10) {
    }
}
