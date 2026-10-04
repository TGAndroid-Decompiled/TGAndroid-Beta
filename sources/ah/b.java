package ah;

import ai.c6;
import ai.d2;
import ai.e6;
import ai.g3;
import ai.jc;
import ai.p3;
import ai.q5;
import ai.q8;
import ai.s5;
import ai.v1;
import ai.v5;
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
import b2.j1;
import b2.k1;
import b2.l1;
import b2.m1;
import b2.p1;
import b2.q;
import b2.q1;
import ci.ca;
import ci.e9;
import ci.ea;
import ci.g9;
import ci.ga;
import ci.j9;
import ci.m9;
import ci.q9;
import ci.x8;
import ci.x9;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import e2.d0;
import e9.k0;
import e9.o1;
import ei.f4;
import hg.v;
import i9.w;
import ii.d3;
import ii.i1;
import ii.j4;
import ii.j6;
import ii.l0;
import ii.p0;
import ii.r;
import ii.t5;
import ii.u3;
import ii.x3;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;
import m4.a0;
import m4.a1;
import m4.e1;
import m4.g1;
import m4.j0;
import m4.o0;
import m4.y0;
import m4.z0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.f0;
import org.telegram.tgnet.ConnectionsManager;
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
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Cells.r8;
import org.telegram.ui.Components.b80;
import org.telegram.ui.Components.cu;
import org.telegram.ui.Components.nl0;
import org.telegram.ui.Components.ol0;
import org.telegram.ui.Components.rc;
import org.telegram.ui.Components.yc;
import org.telegram.ui.bd0;
import u2.b0;
import v7.l8;
public final class b implements hh.i, g9, a2, OnFailureListener, q9.d, nl0, OnCompleteListener, Continuation, ol0, Utilities.Callback3Return, bd0, p0, cu, j4, e2.n, e2.m, j0, e2.h, z0 {
    public final int f452a;
    public final Object f453b;
    public final Object f454c;

    public b(int i10, Object obj, Object obj2) {
        this.f452a = i10;
        this.f453b = obj;
        this.f454c = obj2;
    }

    @Override
    public Object E(cf.c cVar) {
        String str = (String) this.f453b;
        q9.a aVar = (q9.a) this.f454c;
        try {
            Trace.beginSection(str);
            return aVar.f44841f.E(cVar);
        } finally {
            Trace.endSection();
        }
    }

    @Override
    public b80 a(i1 i1Var) {
        r rVar = (r) ((of.b) this.f453b).f17159c;
        b80 b80Var = new b80(rVar, (d6) this.f454c, i1Var, false, false, true);
        rVar.H = b80Var;
        return b80Var;
    }

    @Override
    public void accept(Object obj) {
        switch (this.f452a) {
            case 26:
                a1 a1Var = (a1) this.f453b;
                q1 q1Var = (q1) this.f454c;
                e1 e1Var = (e1) obj;
                a1Var.getClass();
                k0 k0Var = q1Var.D;
                if (!k0Var.isEmpty()) {
                    p1 c10 = q1Var.a().c();
                    o1 it = k0Var.values().iterator();
                    while (it.hasNext()) {
                        m1 m1Var = (m1) it.next();
                        l1 l1Var = (l1) a1Var.d.f8831n.get(m1Var.f3365a.f3337b);
                        if (l1Var != null && m1Var.f3365a.f3336a == l1Var.f3336a) {
                            c10.a(new m1(l1Var, m1Var.f3366b));
                        } else {
                            c10.a(m1Var);
                        }
                    }
                    q1Var = c10.b();
                }
                e1Var.q(q1Var);
                return;
            default:
                m4.r rVar = (m4.r) this.f454c;
                e1 e1Var2 = (e1) obj;
                a0 a0Var = (a0) ((a1) this.f453b).f16059a.get();
                if (a0Var != null && !a0Var.j()) {
                    a0Var.g(rVar, false);
                    return;
                }
                return;
        }
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
        x9 x9Var = (x9) this.f453b;
        Context context = (Context) this.f454c;
        ArrayList arrayList2 = x9Var.L;
        a0.i iVar = x9Var.f6303b;
        q9 q9Var = x9Var.f6311x;
        ArrayList arrayList3 = x9Var.f6304c;
        HashMap hashMap = x9Var.d;
        ea eaVar = x9Var.W;
        if (i10 >= 0 && i10 < arrayList2.size()) {
            j9 j9Var = (j9) arrayList2.get(i10);
            int i15 = j9Var.f17183a;
            int i16 = 0;
            if (i15 == 3) {
                if (j9Var.f5262n && eaVar.F) {
                    new e9(context, ea.F(eaVar), eaVar.K, eaVar.f5049c, new m9(x9Var, 0), ea.G(eaVar)).show();
                    return;
                }
                int i17 = j9Var.f5257i;
                if (i17 == 1) {
                    if (eaVar.N == 1 || ea.J0(eaVar).isEmpty()) {
                        eaVar.M = 1;
                        eaVar.f5047b.E(1);
                    }
                    eaVar.N = 1;
                    x9Var.f(true);
                } else if (i17 == 3) {
                    if (eaVar.N == 3 || (eaVar.f5053n.isEmpty() && eaVar.f5054r.isEmpty())) {
                        eaVar.M = 3;
                        eaVar.f5047b.E(1);
                    }
                    eaVar.N = 3;
                    x9Var.f(true);
                } else if (i17 == 2) {
                    if (eaVar.N == 2) {
                        eaVar.M = 2;
                        eaVar.f5047b.E(1);
                    }
                    eaVar.N = 2;
                    x9Var.f(true);
                } else if (i17 == 4) {
                    if (eaVar.N == 4) {
                        eaVar.M = 4;
                        eaVar.f5047b.E(1);
                    }
                    eaVar.N = 4;
                    x9Var.f(true);
                } else {
                    if (i17 > 0) {
                        arrayList3.clear();
                        hashMap.clear();
                        eaVar.N = j9Var.f5257i;
                        q9Var.f4779c.a();
                    } else {
                        TLRPC.Chat chat = j9Var.h;
                        if (chat != null) {
                            long j3 = chat.f20038id;
                            if (ea.d1(eaVar, chat) > 200) {
                                try {
                                    x9Var.performHapticFeedback(3, 1);
                                } catch (Throwable unused) {
                                }
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(x9Var.getContext(), 0, ea.H(eaVar));
                                alertDialog$Builder.f20368a.R = LocaleController.getString(R.string.GroupTooLarge);
                                alertDialog$Builder.f20368a.T = LocaleController.getString(R.string.GroupTooLargeMessage);
                                f0.o(R.string.OK, alertDialog$Builder, null);
                            } else if (hashMap.containsKey(Long.valueOf(j3))) {
                                ArrayList arrayList4 = (ArrayList) hashMap.get(Long.valueOf(j3));
                                if (arrayList4 != null) {
                                    int size = arrayList4.size();
                                    while (i16 < size) {
                                        Object obj = arrayList4.get(i16);
                                        i16++;
                                        iVar.k(Boolean.FALSE, ((Long) obj).longValue());
                                    }
                                }
                                hashMap.remove(Long.valueOf(j3));
                                x9Var.i(true);
                            } else {
                                TLRPC.Chat chat2 = MessagesController.getInstance(ea.I(eaVar)).getChat(Long.valueOf(j3));
                                TLRPC.ChatFull chatFull = MessagesController.getInstance(ea.J(eaVar)).getChatFull(j3);
                                if (chatFull != null && (chatParticipants = chatFull.participants) != null && (arrayList = chatParticipants.participants) != null && !arrayList.isEmpty() && chatFull.participants.participants.size() >= chatFull.participants_count - 1) {
                                    x9Var.d(j3, chatFull.participants);
                                } else {
                                    b2 b2Var = x9Var.G;
                                    if (b2Var != null) {
                                        b2Var.dismiss();
                                        x9Var.G = null;
                                    }
                                    x9Var.H = j3;
                                    b2 b2Var2 = new b2(x9Var.getContext(), 3, ea.K(eaVar));
                                    x9Var.G = b2Var2;
                                    b2Var2.q(50L);
                                    MessagesStorage messagesStorage = MessagesStorage.getInstance(ea.L(eaVar));
                                    messagesStorage.getStorageQueue().postRunnable(new q8(x9Var, chat2, messagesStorage, j3, 4));
                                }
                                if (!TextUtils.isEmpty(x9Var.I)) {
                                    q9Var.setText("");
                                    x9Var.I = null;
                                    x9Var.g(false);
                                }
                            }
                        } else {
                            TLRPC.User user = j9Var.f5256g;
                            if (user != null) {
                                if (x9Var.f6302a == 0) {
                                    eaVar.N = 0;
                                }
                                long j10 = user.f20185id;
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
                                    if (!TextUtils.isEmpty(x9Var.I)) {
                                        q9Var.setText("");
                                        x9Var.I = null;
                                        x9Var.g(false);
                                    }
                                    iVar.k(Boolean.TRUE, j10);
                                }
                                arrayList3.clear();
                                arrayList3.addAll(hashSet);
                                x9Var.i(true);
                            }
                        }
                    }
                    x9Var.f(true);
                    x9Var.e(true);
                    q9Var.K = true;
                }
            } else if (i15 == 7) {
                if (view instanceof r8) {
                    r8 r8Var = (r8) view;
                    r8Var.setChecked(!r8Var.b());
                    j9Var.f5259k = r8Var.b();
                    int i18 = j9Var.f5253c;
                    if (i18 == 0) {
                        boolean b10 = r8Var.b();
                        eaVar.f5057x = b10;
                        if (eaVar.N == 4) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (b10) {
                            yc ycVar = new yc(eaVar.container, ea.M(eaVar));
                            int i19 = R.raw.ic_save_to_gallery;
                            if (z10) {
                                i14 = R.string.StoryEnabledScreenshotsShare;
                            } else {
                                i14 = R.string.StoryEnabledScreenshots;
                            }
                            rc G = ycVar.G(i19, 4, LocaleController.getString(i14));
                            G.f30339j = 5000;
                            G.k(true);
                            return;
                        }
                        yc ycVar2 = new yc(eaVar.container, ea.N(eaVar));
                        int i20 = R.raw.passcode_lock_close;
                        if (z10) {
                            i13 = R.string.StoryDisabledScreenshotsShare;
                        } else {
                            i13 = R.string.StoryDisabledScreenshots;
                        }
                        rc G2 = ycVar2.G(i20, 4, LocaleController.getString(i13));
                        G2.f30339j = 5000;
                        G2.k(true);
                    } else if (i18 == 1) {
                        boolean b11 = r8Var.b();
                        eaVar.f5058y = b11;
                        boolean z11 = eaVar.f5049c instanceof TLRPC.TL_inputPeerChannel;
                        if (b11) {
                            yc ycVar3 = new yc(eaVar.container, ea.P(eaVar));
                            int i21 = R.raw.msg_story_keep;
                            if (z11) {
                                i12 = R.string.StoryChannelEnableKeep;
                            } else {
                                i12 = R.string.StoryEnableKeep;
                            }
                            rc G3 = ycVar3.G(i21, 4, LocaleController.getString(i12));
                            G3.f30339j = 5000;
                            G3.k(true);
                        } else {
                            yc ycVar4 = new yc(eaVar.container, ea.Q(eaVar));
                            int i22 = R.raw.fire_on;
                            if (z11) {
                                i11 = R.string.StoryChannelDisableKeep;
                            } else {
                                i11 = R.string.StoryDisableKeep;
                            }
                            rc G4 = ycVar4.G(i22, 4, LocaleController.getString(i11));
                            G4.f30339j = 5000;
                            G4.k(true);
                        }
                        x9Var.g(true);
                    } else if (i18 == 2) {
                        eaVar.f5056w = r8Var.b();
                        x9Var.g(true);
                    }
                }
            } else if (i15 == 9) {
                int i23 = j9Var.f5265q;
                if (i23 == 0) {
                    ga gaVar = eaVar.f5050c0;
                    if (gaVar != null) {
                        gaVar.run();
                    }
                } else if (i23 == 1) {
                    TLRPC.InputPeer inputPeer = eaVar.f5049c;
                    if (inputPeer != null) {
                        clientUserId = DialogObject.getPeerDialogId(inputPeer);
                    } else {
                        clientUserId = UserConfig.getInstance(ea.b1(eaVar)).getClientUserId();
                    }
                    b80 F = b80.F(x9Var, ea.R(eaVar), view);
                    F.c(R.drawable.msg_addfolder, LocaleController.getString(R.string.StoriesAlbumNewAlbum), new ai.j(x9Var, clientUserId, 5), false);
                    F.k();
                    b80.f(F, eaVar.i1().B(clientUserId, true), eaVar.v, false, null, new g3(5, x9Var, F));
                    F.Z();
                } else if (i23 == 5) {
                    b2 b2Var3 = new b2(x9Var.getContext(), 3, ea.S(eaVar));
                    b2Var3.q(500L);
                    TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = new TL_phone.getGroupCallStreamRtmpUrl();
                    getgroupcallstreamrtmpurl.live_story = true;
                    TLRPC.InputPeer inputPeer2 = eaVar.f5049c;
                    if (inputPeer2 == null) {
                        inputPeer2 = new TLRPC.TL_inputPeerSelf();
                    }
                    getgroupcallstreamrtmpurl.peer = inputPeer2;
                    ConnectionsManager.getInstance(ea.T(eaVar)).sendRequest(getgroupcallstreamrtmpurl, new s5(x9Var, b2Var3, getgroupcallstreamrtmpurl, 1));
                } else if (i23 == 6) {
                    eaVar.G = false;
                    x9Var.g(true);
                }
            }
        }
    }

    @Override
    public boolean d(int i10, View view) {
        return f4.G0((f4) this.f453b, (Context) this.f454c, view, i10);
    }

    @Override
    public void e(Object obj, q qVar) {
        ((j2.b) obj).d((b1) this.f454c, new of.b(qVar, ((j2.f) this.f453b).f13655e));
    }

    @Override
    public void f(m4.r rVar) {
        switch (this.f452a) {
            case 24:
                Bundle bundle = (Bundle) this.f454c;
                a0 a0Var = ((m4.k0) this.f453b).f16209g;
                if (bundle == null) {
                    Bundle bundle2 = Bundle.EMPTY;
                }
                a0Var.n(rVar);
                return;
            default:
                m4.k0 k0Var = (m4.k0) this.f453b;
                k0Var.getClass();
                String str = ((n4.l) this.f454c).f16603a;
                if (TextUtils.isEmpty(str)) {
                    e2.a.n("MediaSessionLegacyStub", "onRemoveQueueItem(): Media ID shouldn't be null");
                    return;
                }
                e1 e1Var = k0Var.f16209g.f16053t;
                if (!e1Var.m0(17)) {
                    e2.a.n("MediaSessionLegacyStub", "Can't remove item by ID without COMMAND_GET_TIMELINE being available");
                    return;
                }
                k1 w02 = e1Var.w0();
                j1 j1Var = new j1();
                for (int i10 = 0; i10 < w02.o(); i10++) {
                    if (TextUtils.equals(w02.m(i10, j1Var, 0L).f3302c.f3320a, str)) {
                        e1Var.R(i10);
                        return;
                    }
                }
                return;
        }
    }

    @Override
    public boolean f1(View view) {
        return false;
    }

    @Override
    public void g(b2 b2Var, int i10) {
        switch (this.f452a) {
            case 3:
                v5 v5Var = (v5) this.f453b;
                d2 d2Var = ((jc) this.f454c).A0;
                if (d2Var != null) {
                    if (!d2Var.f761w) {
                        TL_phone.discardGroupCall discardgroupcall = new TL_phone.discardGroupCall();
                        discardgroupcall.call = d2Var.f757f;
                        ConnectionsManager.getInstance(d2Var.f756e).sendRequest(discardgroupcall, new ai.q1(d2Var, 4));
                        d2Var.e();
                        return;
                    }
                    return;
                }
                e6.f0(v5Var.f1756l);
                return;
            case 10:
                f4.D0((f4) this.f453b, (TL_payments.connectedBotStarRef) this.f454c);
                return;
            case 12:
                gg.k1 k1Var = (gg.k1) this.f453b;
                k1Var.getClass();
                ((boolean[]) this.f454c)[0] = true;
                k1Var.Q();
                return;
            default:
                v.Y((v) this.f453b, (TL_account.TL_businessChatLink) this.f454c);
                return;
        }
    }

    @Override
    public Object h(a0 a0Var, m4.r rVar, int i10) {
        switch (this.f452a) {
            case 28:
                z0 z0Var = (z0) this.f453b;
                o0 o0Var = (o0) this.f454c;
                if (a0Var.j()) {
                    return l8.b(new m4.k1(-100));
                }
                return d0.d0((w) z0Var.h(a0Var, rVar, i10), new q5(a0Var, rVar, o0Var, 14));
            default:
                z0 z0Var2 = (z0) this.f453b;
                y0 y0Var = (y0) this.f454c;
                if (a0Var.j()) {
                    return l8.b(new m4.k1(-100));
                }
                return d0.d0((w) z0Var2.h(a0Var, rVar, i10), new q5(a0Var, rVar, y0Var, 15));
        }
    }

    @Override
    public void i(ca caVar, boolean z10, boolean z11, boolean z12, boolean z13, TLRPC.InputPeer inputPeer, int i10, x8 x8Var, androidx.fragment.app.a0 a0Var) {
        boolean z14;
        switch (this.f452a) {
            case 1:
                e6 e6Var = (e6) this.f453b;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.f454c;
                TL_stories.TL_stories_editStory tL_stories_editStory = new TL_stories.TL_stories_editStory();
                tL_stories_editStory.peer = MessagesController.getInstance(e6Var.C2).getInputPeer(storyItem.dialogId);
                tL_stories_editStory.f20279id = storyItem.f20275id;
                tL_stories_editStory.flags |= 4;
                tL_stories_editStory.privacy_rules = caVar.f4837b;
                ConnectionsManager.getInstance(e6Var.C2).sendRequest(tL_stories_editStory, new p3(e6Var, x8Var, storyItem, caVar, 0));
                return;
            default:
                v5 v5Var = (v5) this.f453b;
                ea eaVar = (ea) this.f454c;
                e6 e6Var2 = v5Var.f1756l;
                c6 c6Var = e6Var2.O1;
                TL_stories.StoryItem storyItem2 = c6Var.f696a;
                if (storyItem2 != null && storyItem2.pinned) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (z14 != z12) {
                    MessagesController.getInstance(e6Var2.C2).getStoriesController().o0(e6Var2.B1, e6Var2.f901v1, z12, null);
                }
                TL_stories.StoryItem storyItem3 = c6Var.f696a;
                if (storyItem3 != null) {
                    TLRPC.MessageMedia messageMedia = storyItem3.media;
                    if (messageMedia instanceof TLRPC.TL_messageMediaVideoStream) {
                        TLRPC.InputGroupCall inputGroupCall = ((TLRPC.TL_messageMediaVideoStream) messageMedia).call;
                        TL_phone.toggleGroupCallSettings togglegroupcallsettings = new TL_phone.toggleGroupCallSettings();
                        togglegroupcallsettings.call = inputGroupCall;
                        togglegroupcallsettings.messages_enabled = Boolean.valueOf(z10);
                        togglegroupcallsettings.send_paid_messages_stars = Long.valueOf(i10);
                        ConnectionsManager.getInstance(e6Var2.C2).sendRequest(togglegroupcallsettings, new v1(1, v5Var, eaVar));
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f452a) {
            case 21:
                ((j2.b) obj).e((j2.a) this.f453b, (b0) this.f454c);
                return;
            default:
                ((j2.b) obj).onRenderedFirstFrame((j2.a) this.f453b);
                return;
        }
    }

    @Override
    public void j() {
        switch (this.f452a) {
            case 17:
                ((l0) this.f453b).i();
                ((ii.k0) this.f454c).v0();
                return;
            default:
                ii.q5 q5Var = (ii.q5) this.f453b;
                t5 t5Var = (t5) this.f454c;
                TL_iv.pageTableCell pagetablecell = t5Var.f12661b;
                if (pagetablecell != null) {
                    j6.d(pagetablecell, t5Var.f12660a.getText());
                }
                d3 d3Var = q5Var.E;
                if (d3Var != null && q5Var.f12203a != null) {
                    x3.Q1(d3Var.f12298a);
                    return;
                }
                return;
        }
    }

    @Override
    public void k(RectF rectF, View view) {
        ((ch.d) this.f453b).i(rectF.left, rectF.top);
        ((View) this.f454c).invalidate();
    }

    @Override
    public void onComplete(Task task) {
        ((com.google.firebase.messaging.g) this.f453b).a((Intent) this.f454c);
    }

    @Override
    public void onFailure(Exception e7) {
        String str;
        w0.i gVar;
        String str2;
        w0.d cVar;
        switch (this.f452a) {
            case 4:
                c1.e eVar = (c1.e) this.f453b;
                CancellationSignal cancellationSignal = (CancellationSignal) this.f454c;
                kotlin.jvm.internal.i.e(e7, "e");
                if ((e7 instanceof com.google.android.gms.common.api.f) && b1.d.f3117b.contains(Integer.valueOf(((com.google.android.gms.common.api.f) e7).getStatusCode()))) {
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
                d1.e eVar2 = (d1.e) this.f453b;
                CancellationSignal cancellationSignal2 = (CancellationSignal) this.f454c;
                kotlin.jvm.internal.i.e(e7, "e");
                if ((e7 instanceof com.google.android.gms.common.api.f) && b1.d.f3117b.contains(Integer.valueOf(((com.google.android.gms.common.api.f) e7).getStatusCode()))) {
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
                    Executor executor = eVar2.f7996g;
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
    public void run(long j3) {
        TL_keyboard.TL_inlineButtonTypeUserProfile tL_inlineButtonTypeUserProfile = new TL_keyboard.TL_inlineButtonTypeUserProfile();
        tL_inlineButtonTypeUserProfile.user_id = j3;
        ((u3) this.f453b).a((String) this.f454c, tL_inlineButtonTypeUserProfile);
    }

    @Override
    public Object then(Task task) {
        com.google.firebase.messaging.j jVar = (com.google.firebase.messaging.j) this.f453b;
        String str = (String) this.f454c;
        synchronized (jVar) {
            ((a0.f) jVar.f7896b).remove(str);
        }
        return task;
    }

    public b(j2.a aVar, Object obj, long j3) {
        this.f452a = 22;
        this.f453b = aVar;
        this.f454c = obj;
    }

    public b(m4.k0 k0Var, g1 g1Var, Bundle bundle) {
        this.f452a = 24;
        this.f453b = k0Var;
        this.f454c = bundle;
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3) {
        hg.m mVar = (hg.m) this.f453b;
        TLRPC.Document document = (TLRPC.Document) obj2;
        Boolean bool = (Boolean) obj3;
        mVar.f11268x = false;
        AndroidUtilities.cancelRunOnUIThread(mVar.f11262e);
        hg.i iVar = mVar.f11265r;
        mVar.f11269y = document;
        iVar.setSticker(document);
        ((r8) ((View) this.f454c)).setValueSticker(document);
        mVar.e0(true);
        return Boolean.TRUE;
    }

    @Override
    public void s0(View view, float f7, float f10) {
    }
}
