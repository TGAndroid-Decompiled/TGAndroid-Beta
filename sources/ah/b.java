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
import b2.j1;
import b2.l1;
import b2.m1;
import b2.p1;
import b2.q;
import b2.q1;
import ci.da;
import ci.f9;
import ci.fa;
import ci.h9;
import ci.ha;
import ci.k9;
import ci.n9;
import ci.r9;
import ci.y8;
import ci.y9;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import e2.d0;
import e9.o1;
import ei.e4;
import gg.k1;
import hg.x;
import i9.w;
import ii.d3;
import ii.i1;
import ii.i6;
import ii.j4;
import ii.p0;
import ii.p5;
import ii.r;
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
import m4.b1;
import m4.f1;
import m4.h1;
import m4.k0;
import m4.l0;
import m4.z0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
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
import org.telegram.ui.Cells.s8;
import org.telegram.ui.Cells.v;
import org.telegram.ui.Components.au;
import org.telegram.ui.Components.bl0;
import org.telegram.ui.Components.cl0;
import org.telegram.ui.Components.o70;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.xc;
import org.telegram.ui.yc0;
import u2.b0;
import v7.l8;
public final class b implements hh.i, h9, a2, OnFailureListener, q9.d, bl0, OnCompleteListener, Continuation, cl0, Utilities.Callback3Return, yc0, p0, au, j4, e2.n, e2.m, k0, e2.h, a1, v {
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
            return aVar.f41129f.G(cVar);
        } finally {
            Trace.endSection();
        }
    }

    @Override
    public o70 a(i1 i1Var) {
        r rVar = (r) ((of.b) this.f420b).f15487c;
        o70 o70Var = new o70(rVar, (d6) this.f421c, i1Var, false, false, true);
        rVar.H = o70Var;
        return o70Var;
    }

    @Override
    public void accept(Object obj) {
        switch (this.f419a) {
            case 25:
                b1 b1Var = (b1) this.f420b;
                q1 q1Var = (q1) this.f421c;
                f1 f1Var = (f1) obj;
                b1Var.getClass();
                e9.k0 k0Var = q1Var.D;
                if (!k0Var.isEmpty()) {
                    p1 c10 = q1Var.a().c();
                    o1 it = k0Var.values().iterator();
                    while (it.hasNext()) {
                        m1 m1Var = (m1) it.next();
                        l1 l1Var = (l1) b1Var.d.f8134n.get(m1Var.f3110a.f3084b);
                        if (l1Var != null && m1Var.f3110a.f3083a == l1Var.f3083a) {
                            c10.a(new m1(l1Var, m1Var.f3111b));
                        } else {
                            c10.a(m1Var);
                        }
                    }
                    q1Var = c10.b();
                }
                f1Var.q(q1Var);
                return;
            default:
                m4.r rVar = (m4.r) this.f421c;
                f1 f1Var2 = (f1) obj;
                a0 a0Var = (a0) ((b1) this.f420b).f14465a.get();
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
        y9 y9Var = (y9) this.f420b;
        Context context = (Context) this.f421c;
        ArrayList arrayList2 = y9Var.L;
        a0.i iVar = y9Var.f5881b;
        r9 r9Var = y9Var.f5888x;
        ArrayList arrayList3 = y9Var.f5882c;
        HashMap hashMap = y9Var.d;
        fa faVar = y9Var.W;
        if (i10 >= 0 && i10 < arrayList2.size()) {
            k9 k9Var = (k9) arrayList2.get(i10);
            int i15 = k9Var.f15508a;
            int i16 = 0;
            if (i15 == 3) {
                if (k9Var.f4912n && faVar.F) {
                    new f9(context, fa.H(faVar), faVar.K, faVar.f4699c, new n9(y9Var, 0), fa.I(faVar)).show();
                    return;
                }
                int i17 = k9Var.f4907i;
                if (i17 == 1) {
                    if (faVar.N == 1 || fa.J0(faVar).isEmpty()) {
                        faVar.M = 1;
                        faVar.f4697b.D(1);
                    }
                    faVar.N = 1;
                    y9Var.f(true);
                } else if (i17 == 3) {
                    if (faVar.N == 3 || (faVar.f4702n.isEmpty() && faVar.f4703r.isEmpty())) {
                        faVar.M = 3;
                        faVar.f4697b.D(1);
                    }
                    faVar.N = 3;
                    y9Var.f(true);
                } else if (i17 == 2) {
                    if (faVar.N == 2) {
                        faVar.M = 2;
                        faVar.f4697b.D(1);
                    }
                    faVar.N = 2;
                    y9Var.f(true);
                } else if (i17 == 4) {
                    if (faVar.N == 4) {
                        faVar.M = 4;
                        faVar.f4697b.D(1);
                    }
                    faVar.N = 4;
                    y9Var.f(true);
                } else {
                    if (i17 > 0) {
                        arrayList3.clear();
                        hashMap.clear();
                        faVar.N = k9Var.f4907i;
                        r9Var.f4449c.a();
                    } else {
                        TLRPC.Chat chat = k9Var.h;
                        if (chat != null) {
                            long j3 = chat.f18083id;
                            if (fa.d1(faVar, chat) > 200) {
                                try {
                                    y9Var.performHapticFeedback(3, 1);
                                } catch (Throwable unused) {
                                }
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(y9Var.getContext(), 0, fa.J(faVar));
                                alertDialog$Builder.f18409a.R = LocaleController.getString(R.string.GroupTooLarge);
                                alertDialog$Builder.f18409a.T = LocaleController.getString(R.string.GroupTooLargeMessage);
                                hg.c.A(R.string.OK, alertDialog$Builder, null);
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
                                y9Var.i(true);
                            } else {
                                TLRPC.Chat chat2 = MessagesController.getInstance(fa.K(faVar)).getChat(Long.valueOf(j3));
                                TLRPC.ChatFull chatFull = MessagesController.getInstance(fa.L(faVar)).getChatFull(j3);
                                if (chatFull != null && (chatParticipants = chatFull.participants) != null && (arrayList = chatParticipants.participants) != null && !arrayList.isEmpty() && chatFull.participants.participants.size() >= chatFull.participants_count - 1) {
                                    y9Var.d(j3, chatFull.participants);
                                } else {
                                    b2 b2Var = y9Var.G;
                                    if (b2Var != null) {
                                        b2Var.dismiss();
                                        y9Var.G = null;
                                    }
                                    y9Var.H = j3;
                                    b2 b2Var2 = new b2(y9Var.getContext(), 3, fa.M(faVar));
                                    y9Var.G = b2Var2;
                                    b2Var2.q(50L);
                                    MessagesStorage messagesStorage = MessagesStorage.getInstance(fa.N(faVar));
                                    messagesStorage.getStorageQueue().postRunnable(new q8(y9Var, chat2, messagesStorage, j3, 4));
                                }
                                if (!TextUtils.isEmpty(y9Var.I)) {
                                    r9Var.setText("");
                                    y9Var.I = null;
                                    y9Var.g(false);
                                }
                            }
                        } else {
                            TLRPC.User user = k9Var.f4906g;
                            if (user != null) {
                                if (y9Var.f5880a == 0) {
                                    faVar.N = 0;
                                }
                                long j10 = user.f18230id;
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
                                    if (!TextUtils.isEmpty(y9Var.I)) {
                                        r9Var.setText("");
                                        y9Var.I = null;
                                        y9Var.g(false);
                                    }
                                    iVar.k(Boolean.TRUE, j10);
                                }
                                arrayList3.clear();
                                arrayList3.addAll(hashSet);
                                y9Var.i(true);
                            }
                        }
                    }
                    y9Var.f(true);
                    y9Var.e(true);
                    r9Var.K = true;
                }
            } else if (i15 == 7) {
                if (view instanceof s8) {
                    s8 s8Var = (s8) view;
                    s8Var.setChecked(!s8Var.b());
                    k9Var.f4909k = s8Var.b();
                    int i18 = k9Var.f4904c;
                    if (i18 == 0) {
                        boolean b10 = s8Var.b();
                        faVar.f4706x = b10;
                        if (faVar.N == 4) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (b10) {
                            xc xcVar = new xc(faVar.container, fa.O(faVar));
                            int i19 = R.raw.ic_save_to_gallery;
                            if (z10) {
                                i14 = R.string.StoryEnabledScreenshotsShare;
                            } else {
                                i14 = R.string.StoryEnabledScreenshots;
                            }
                            qc G = xcVar.G(i19, 4, LocaleController.getString(i14));
                            G.f27306j = 5000;
                            G.k(true);
                            return;
                        }
                        xc xcVar2 = new xc(faVar.container, fa.P(faVar));
                        int i20 = R.raw.passcode_lock_close;
                        if (z10) {
                            i13 = R.string.StoryDisabledScreenshotsShare;
                        } else {
                            i13 = R.string.StoryDisabledScreenshots;
                        }
                        qc G2 = xcVar2.G(i20, 4, LocaleController.getString(i13));
                        G2.f27306j = 5000;
                        G2.k(true);
                    } else if (i18 == 1) {
                        boolean b11 = s8Var.b();
                        faVar.f4707y = b11;
                        boolean z11 = faVar.f4699c instanceof TLRPC.TL_inputPeerChannel;
                        if (b11) {
                            xc xcVar3 = new xc(faVar.container, fa.R(faVar));
                            int i21 = R.raw.msg_story_keep;
                            if (z11) {
                                i12 = R.string.StoryChannelEnableKeep;
                            } else {
                                i12 = R.string.StoryEnableKeep;
                            }
                            qc G3 = xcVar3.G(i21, 4, LocaleController.getString(i12));
                            G3.f27306j = 5000;
                            G3.k(true);
                        } else {
                            xc xcVar4 = new xc(faVar.container, fa.S(faVar));
                            int i22 = R.raw.fire_on;
                            if (z11) {
                                i11 = R.string.StoryChannelDisableKeep;
                            } else {
                                i11 = R.string.StoryDisableKeep;
                            }
                            qc G4 = xcVar4.G(i22, 4, LocaleController.getString(i11));
                            G4.f27306j = 5000;
                            G4.k(true);
                        }
                        y9Var.g(true);
                    } else if (i18 == 2) {
                        faVar.f4705w = s8Var.b();
                        y9Var.g(true);
                    }
                }
            } else if (i15 == 9) {
                int i23 = k9Var.f4915q;
                if (i23 == 0) {
                    ha haVar = faVar.f4700c0;
                    if (haVar != null) {
                        haVar.run();
                    }
                } else if (i23 == 1) {
                    TLRPC.InputPeer inputPeer = faVar.f4699c;
                    if (inputPeer != null) {
                        clientUserId = DialogObject.getPeerDialogId(inputPeer);
                    } else {
                        clientUserId = UserConfig.getInstance(fa.b1(faVar)).getClientUserId();
                    }
                    o70 F = o70.F(y9Var, fa.T(faVar), view);
                    F.c(R.drawable.msg_addfolder, LocaleController.getString(R.string.StoriesAlbumNewAlbum), new ai.j(y9Var, clientUserId, 5), false);
                    F.k();
                    o70.f(F, faVar.i1().B(clientUserId, true), faVar.v, false, null, new g3(5, y9Var, F));
                    F.Z();
                } else if (i23 == 5) {
                    b2 b2Var3 = new b2(y9Var.getContext(), 3, fa.U(faVar));
                    b2Var3.q(500L);
                    TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = new TL_phone.getGroupCallStreamRtmpUrl();
                    getgroupcallstreamrtmpurl.live_story = true;
                    TLRPC.InputPeer inputPeer2 = faVar.f4699c;
                    if (inputPeer2 == null) {
                        inputPeer2 = new TLRPC.TL_inputPeerSelf();
                    }
                    getgroupcallstreamrtmpurl.peer = inputPeer2;
                    ConnectionsManager.getInstance(fa.V(faVar)).sendRequest(getgroupcallstreamrtmpurl, new s5(y9Var, b2Var3, getgroupcallstreamrtmpurl, 1));
                } else if (i23 == 6) {
                    faVar.G = false;
                    y9Var.g(true);
                }
            }
        }
    }

    @Override
    public boolean d(int i10, View view) {
        return e4.B0((e4) this.f420b, (Context) this.f421c, view, i10);
    }

    @Override
    public boolean d1(View view) {
        return false;
    }

    @Override
    public void e(Object obj, q qVar) {
        ((j2.b) obj).d((b2.b1) this.f421c, new of.b(qVar, ((j2.f) this.f420b).e));
    }

    @Override
    public void f(b2 b2Var, int i10) {
        switch (this.f419a) {
            case 3:
                v5 v5Var = (v5) this.f420b;
                d2 d2Var = ((jc) this.f421c).A0;
                if (d2Var != null) {
                    if (!d2Var.f701w) {
                        TL_phone.discardGroupCall discardgroupcall = new TL_phone.discardGroupCall();
                        discardgroupcall.call = d2Var.f697f;
                        ConnectionsManager.getInstance(d2Var.e).sendRequest(discardgroupcall, new ai.q1(d2Var, 4));
                        d2Var.e();
                        return;
                    }
                    return;
                }
                e6.f0(v5Var.f1612l);
                return;
            case 10:
                e4.y0((e4) this.f420b, (TL_payments.connectedBotStarRef) this.f421c);
                return;
            case 12:
                k1 k1Var = (k1) this.f420b;
                k1Var.getClass();
                ((boolean[]) this.f421c)[0] = true;
                k1Var.Q();
                return;
            default:
                hg.a0.d(r4.currentAccount).a((x) this.f420b, ((TL_account.TL_businessChatLink) this.f421c).link);
                return;
        }
    }

    @Override
    public void g(m4.r rVar) {
        switch (this.f419a) {
            case 23:
                Bundle bundle = (Bundle) this.f421c;
                a0 a0Var = ((l0) this.f420b).f14607g;
                if (bundle == null) {
                    Bundle bundle2 = Bundle.EMPTY;
                }
                a0Var.n(rVar);
                return;
            default:
                l0 l0Var = (l0) this.f420b;
                l0Var.getClass();
                String str = ((n4.l) this.f421c).f14935a;
                if (TextUtils.isEmpty(str)) {
                    e2.a.n("MediaSessionLegacyStub", "onRemoveQueueItem(): Media ID shouldn't be null");
                    return;
                }
                f1 f1Var = l0Var.f14607g.f14454t;
                if (!f1Var.m0(17)) {
                    e2.a.n("MediaSessionLegacyStub", "Can't remove item by ID without COMMAND_GET_TIMELINE being available");
                    return;
                }
                b2.k1 w02 = f1Var.w0();
                j1 j1Var = new j1();
                for (int i10 = 0; i10 < w02.o(); i10++) {
                    if (TextUtils.equals(w02.m(i10, j1Var, 0L).f3052c.f3069a, str)) {
                        f1Var.R(i10);
                        return;
                    }
                }
                return;
        }
    }

    @Override
    public Object h(a0 a0Var, m4.r rVar, int i10) {
        switch (this.f419a) {
            case 27:
                a1 a1Var = (a1) this.f420b;
                m4.p0 p0Var = (m4.p0) this.f421c;
                if (a0Var.j()) {
                    return l8.b(new m4.l1(-100));
                }
                return d0.d0((w) a1Var.h(a0Var, rVar, i10), new q5(a0Var, rVar, p0Var, 14));
            default:
                a1 a1Var2 = (a1) this.f420b;
                z0 z0Var = (z0) this.f421c;
                if (a0Var.j()) {
                    return l8.b(new m4.l1(-100));
                }
                return d0.d0((w) a1Var2.h(a0Var, rVar, i10), new q5(a0Var, rVar, z0Var, 15));
        }
    }

    @Override
    public void i() {
        switch (this.f419a) {
            case 17:
                ((ii.l0) this.f420b).i();
                ((ii.k0) this.f421c).n0();
                return;
            default:
                p5 p5Var = (p5) this.f420b;
                ii.s5 s5Var = (ii.s5) this.f421c;
                TL_iv.pageTableCell pagetablecell = s5Var.f11617b;
                if (pagetablecell != null) {
                    i6.d(pagetablecell, s5Var.f11616a.getText());
                }
                d3 d3Var = p5Var.E;
                if (d3Var != null && p5Var.f11207a != null) {
                    x3.O1(d3Var.f11293a);
                    return;
                }
                return;
        }
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
    public void j(RectF rectF, View view) {
        ((ch.d) this.f420b).t(rectF.left, rectF.top);
        ((View) this.f421c).invalidate();
    }

    @Override
    public void k(da daVar, boolean z10, boolean z11, boolean z12, boolean z13, TLRPC.InputPeer inputPeer, int i10, y8 y8Var, androidx.fragment.app.a0 a0Var) {
        boolean z14;
        switch (this.f419a) {
            case 1:
                e6 e6Var = (e6) this.f420b;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.f421c;
                TL_stories.TL_stories_editStory tL_stories_editStory = new TL_stories.TL_stories_editStory();
                tL_stories_editStory.peer = MessagesController.getInstance(e6Var.C2).getInputPeer(storyItem.dialogId);
                tL_stories_editStory.f18322id = storyItem.f18318id;
                tL_stories_editStory.flags |= 4;
                tL_stories_editStory.privacy_rules = daVar.f4547b;
                ConnectionsManager.getInstance(e6Var.C2).sendRequest(tL_stories_editStory, new p3(e6Var, y8Var, storyItem, daVar, 0));
                return;
            default:
                v5 v5Var = (v5) this.f420b;
                fa faVar = (fa) this.f421c;
                e6 e6Var2 = v5Var.f1612l;
                c6 c6Var = e6Var2.O1;
                TL_stories.StoryItem storyItem2 = c6Var.f642a;
                if (storyItem2 != null && storyItem2.pinned) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (z14 != z12) {
                    MessagesController.getInstance(e6Var2.C2).getStoriesController().o0(e6Var2.B1, e6Var2.f833v1, z12, null);
                }
                TL_stories.StoryItem storyItem3 = c6Var.f642a;
                if (storyItem3 != null) {
                    TLRPC.MessageMedia messageMedia = storyItem3.media;
                    if (messageMedia instanceof TLRPC.TL_messageMediaVideoStream) {
                        TLRPC.InputGroupCall inputGroupCall = ((TLRPC.TL_messageMediaVideoStream) messageMedia).call;
                        TL_phone.toggleGroupCallSettings togglegroupcallsettings = new TL_phone.toggleGroupCallSettings();
                        togglegroupcallsettings.call = inputGroupCall;
                        togglegroupcallsettings.messages_enabled = Boolean.valueOf(z10);
                        togglegroupcallsettings.send_paid_messages_stars = Long.valueOf(i10);
                        ConnectionsManager.getInstance(e6Var2.C2).sendRequest(togglegroupcallsettings, new v1(1, v5Var, faVar));
                        return;
                    }
                    return;
                }
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
                if ((e instanceof com.google.android.gms.common.api.f) && b1.d.f2886b.contains(Integer.valueOf(((com.google.android.gms.common.api.f) e).getStatusCode()))) {
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
                if ((e instanceof com.google.android.gms.common.api.f) && b1.d.f2886b.contains(Integer.valueOf(((com.google.android.gms.common.api.f) e).getStatusCode()))) {
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
                    Executor executor = eVar2.f7394g;
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
        ((u3) this.f420b).a((String) this.f421c, tL_inlineButtonTypeUserProfile);
    }

    @Override
    public Object then(Task task) {
        com.google.firebase.messaging.j jVar = (com.google.firebase.messaging.j) this.f420b;
        String str = (String) this.f421c;
        synchronized (jVar) {
            ((a0.f) jVar.f7312b).remove(str);
        }
        return task;
    }

    public b(j2.a aVar, Object obj, long j3) {
        this.f419a = 22;
        this.f420b = aVar;
        this.f421c = obj;
    }

    public b(l0 l0Var, h1 h1Var, Bundle bundle) {
        this.f419a = 23;
        this.f420b = l0Var;
        this.f421c = bundle;
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3) {
        hg.n nVar = (hg.n) this.f420b;
        TLRPC.Document document = (TLRPC.Document) obj2;
        Boolean bool = (Boolean) obj3;
        nVar.f10349w = false;
        AndroidUtilities.cancelRunOnUIThread(nVar.d);
        hg.j jVar = nVar.f10346n;
        nVar.f10350x = document;
        jVar.setSticker(document);
        ((s8) ((View) this.f421c)).setValueSticker(document);
        nVar.e0(true);
        return Boolean.TRUE;
    }

    @Override
    public void r0(View view, float f7, float f10) {
    }
}
