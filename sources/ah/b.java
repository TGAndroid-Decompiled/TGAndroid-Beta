package ah;

import ai.d2;
import ai.d6;
import ai.f6;
import ai.h3;
import ai.kc;
import ai.q3;
import ai.r5;
import ai.r8;
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
import androidx.fragment.app.a0;
import b2.k1;
import b2.l1;
import b2.m1;
import b2.p1;
import b2.q1;
import ci.da;
import ci.f9;
import ci.fa;
import ci.h9;
import ci.ha;
import ci.k9;
import ci.n9;
import ci.r9;
import ci.u5;
import ci.y8;
import ci.y9;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import e2.d0;
import e9.o1;
import ei.e4;
import gg.j1;
import hg.w;
import ii.d3;
import ii.i1;
import ii.j6;
import ii.k4;
import ii.p0;
import ii.q5;
import ii.r;
import ii.u3;
import ii.x3;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;
import m4.a1;
import m4.b0;
import m4.b1;
import m4.f1;
import m4.h1;
import m4.k0;
import m4.l0;
import m4.q0;
import m4.z0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.q;
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
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.gm0;
import org.telegram.ui.Components.hm0;
import org.telegram.ui.Components.q80;
import org.telegram.ui.Components.qu;
import org.telegram.ui.Components.tc;
import org.telegram.ui.cd0;
import v7.j8;
public final class b implements hh.h, h9, a2, OnFailureListener, q9.d, gm0, OnCompleteListener, Continuation, hm0, Utilities.Callback3Return, cd0, p0, qu, k4, e2.n, e2.m, k0, e2.h, a1 {
    public final int f538a;
    public final Object f539b;
    public final Object f540c;

    public b(int i10, Object obj, Object obj2) {
        this.f538a = i10;
        this.f539b = obj;
        this.f540c = obj2;
    }

    @Override
    public boolean Y0(View view) {
        return false;
    }

    @Override
    public q80 a(i1 i1Var) {
        r rVar = (r) ((pf.b) this.f539b).f45603c;
        q80 q80Var = new q80(rVar, (e6) this.f540c, i1Var, false, false, true);
        rVar.H = q80Var;
        return q80Var;
    }

    @Override
    public void accept(Object obj) {
        switch (this.f538a) {
            case 26:
                b1 b1Var = (b1) this.f539b;
                q1 q1Var = (q1) this.f540c;
                f1 f1Var = (f1) obj;
                b1Var.getClass();
                e9.k0 k0Var = q1Var.D;
                if (!k0Var.isEmpty()) {
                    p1 c10 = q1Var.a().c();
                    o1 it = k0Var.values().iterator();
                    while (it.hasNext()) {
                        m1 m1Var = (m1) it.next();
                        l1 l1Var = (l1) b1Var.d.f8826n.get(m1Var.f3444a.f3416b);
                        if (l1Var != null && m1Var.f3444a.f3415a == l1Var.f3415a) {
                            c10.a(new m1(l1Var, m1Var.f3445b));
                        } else {
                            c10.a(m1Var);
                        }
                    }
                    q1Var = c10.b();
                }
                f1Var.q(q1Var);
                return;
            default:
                m4.r rVar = (m4.r) this.f540c;
                f1 f1Var2 = (f1) obj;
                b0 b0Var = (b0) ((b1) this.f539b).f16007a.get();
                if (b0Var != null && !b0Var.j()) {
                    b0Var.g(rVar, false);
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
        y9 y9Var = (y9) this.f539b;
        Context context = (Context) this.f540c;
        ArrayList arrayList2 = y9Var.L;
        a0.i iVar = y9Var.f6361b;
        r9 r9Var = y9Var.f6369x;
        ArrayList arrayList3 = y9Var.f6362c;
        HashMap hashMap = y9Var.d;
        fa faVar = y9Var.W;
        if (i10 >= 0 && i10 < arrayList2.size()) {
            k9 k9Var = (k9) arrayList2.get(i10);
            int i15 = k9Var.f17129a;
            int i16 = 0;
            if (i15 == 3) {
                if (k9Var.f5334n && faVar.F) {
                    new f9(context, fa.I(faVar), faVar.K, faVar.f5096c, new n9(y9Var, 0), fa.J(faVar)).show();
                    return;
                }
                int i17 = k9Var.f5329i;
                if (i17 == 1) {
                    if (faVar.N == 1 || fa.K0(faVar).isEmpty()) {
                        faVar.M = 1;
                        faVar.f5094b.D(1);
                    }
                    faVar.N = 1;
                    y9Var.f(true);
                } else if (i17 == 3) {
                    if (faVar.N == 3 || (faVar.f5100n.isEmpty() && faVar.f5101r.isEmpty())) {
                        faVar.M = 3;
                        faVar.f5094b.D(1);
                    }
                    faVar.N = 3;
                    y9Var.f(true);
                } else if (i17 == 2) {
                    if (faVar.N == 2) {
                        faVar.M = 2;
                        faVar.f5094b.D(1);
                    }
                    faVar.N = 2;
                    y9Var.f(true);
                } else if (i17 == 4) {
                    if (faVar.N == 4) {
                        faVar.M = 4;
                        faVar.f5094b.D(1);
                    }
                    faVar.N = 4;
                    y9Var.f(true);
                } else {
                    if (i17 > 0) {
                        arrayList3.clear();
                        hashMap.clear();
                        faVar.N = k9Var.f5329i;
                        r9Var.f4847c.a();
                    } else {
                        TLRPC.Chat chat = k9Var.h;
                        if (chat != null) {
                            long j3 = chat.f20042id;
                            if (fa.e1(faVar, chat) > 200) {
                                try {
                                    y9Var.performHapticFeedback(3, 1);
                                } catch (Throwable unused) {
                                }
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(y9Var.getContext(), 0, fa.K(faVar));
                                alertDialog$Builder.f20378a.R = LocaleController.getString(R.string.GroupTooLarge);
                                alertDialog$Builder.f20378a.T = LocaleController.getString(R.string.GroupTooLargeMessage);
                                q.p(R.string.OK, alertDialog$Builder, null);
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
                                TLRPC.Chat chat2 = MessagesController.getInstance(fa.L(faVar)).getChat(Long.valueOf(j3));
                                TLRPC.ChatFull chatFull = MessagesController.getInstance(fa.M(faVar)).getChatFull(j3);
                                if (chatFull != null && (chatParticipants = chatFull.participants) != null && (arrayList = chatParticipants.participants) != null && !arrayList.isEmpty() && chatFull.participants.participants.size() >= chatFull.participants_count - 1) {
                                    y9Var.d(j3, chatFull.participants);
                                } else {
                                    b2 b2Var = y9Var.G;
                                    if (b2Var != null) {
                                        b2Var.dismiss();
                                        y9Var.G = null;
                                    }
                                    y9Var.H = j3;
                                    b2 b2Var2 = new b2(y9Var.getContext(), 3, fa.N(faVar));
                                    y9Var.G = b2Var2;
                                    b2Var2.q(50L);
                                    MessagesStorage messagesStorage = MessagesStorage.getInstance(fa.O(faVar));
                                    messagesStorage.getStorageQueue().postRunnable(new r8(y9Var, chat2, messagesStorage, j3, 4));
                                }
                                if (!TextUtils.isEmpty(y9Var.I)) {
                                    r9Var.setText("");
                                    y9Var.I = null;
                                    y9Var.g(false);
                                }
                            }
                        } else {
                            TLRPC.User user = k9Var.f5328g;
                            if (user != null) {
                                if (y9Var.f6360a == 0) {
                                    faVar.N = 0;
                                }
                                long j10 = user.f20189id;
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
                if (view instanceof org.telegram.ui.Cells.r8) {
                    org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
                    r8Var.setChecked(!r8Var.b());
                    k9Var.f5331k = r8Var.b();
                    int i18 = k9Var.f5325c;
                    if (i18 == 0) {
                        boolean b10 = r8Var.b();
                        faVar.f5104x = b10;
                        if (faVar.N == 4) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (b10) {
                            ad adVar = new ad(faVar.container, fa.P(faVar));
                            int i19 = R.raw.ic_save_to_gallery;
                            if (z10) {
                                i14 = R.string.StoryEnabledScreenshotsShare;
                            } else {
                                i14 = R.string.StoryEnabledScreenshots;
                            }
                            tc G = adVar.G(i19, 4, LocaleController.getString(i14));
                            G.f31096j = 5000;
                            G.k(true);
                            return;
                        }
                        ad adVar2 = new ad(faVar.container, fa.Q(faVar));
                        int i20 = R.raw.passcode_lock_close;
                        if (z10) {
                            i13 = R.string.StoryDisabledScreenshotsShare;
                        } else {
                            i13 = R.string.StoryDisabledScreenshots;
                        }
                        tc G2 = adVar2.G(i20, 4, LocaleController.getString(i13));
                        G2.f31096j = 5000;
                        G2.k(true);
                    } else if (i18 == 1) {
                        boolean b11 = r8Var.b();
                        faVar.f5105y = b11;
                        boolean z11 = faVar.f5096c instanceof TLRPC.TL_inputPeerChannel;
                        if (b11) {
                            ad adVar3 = new ad(faVar.container, fa.S(faVar));
                            int i21 = R.raw.msg_story_keep;
                            if (z11) {
                                i12 = R.string.StoryChannelEnableKeep;
                            } else {
                                i12 = R.string.StoryEnableKeep;
                            }
                            tc G3 = adVar3.G(i21, 4, LocaleController.getString(i12));
                            G3.f31096j = 5000;
                            G3.k(true);
                        } else {
                            ad adVar4 = new ad(faVar.container, fa.T(faVar));
                            int i22 = R.raw.fire_on;
                            if (z11) {
                                i11 = R.string.StoryChannelDisableKeep;
                            } else {
                                i11 = R.string.StoryDisableKeep;
                            }
                            tc G4 = adVar4.G(i22, 4, LocaleController.getString(i11));
                            G4.f31096j = 5000;
                            G4.k(true);
                        }
                        y9Var.g(true);
                    } else if (i18 == 2) {
                        faVar.f5103w = r8Var.b();
                        y9Var.g(true);
                    }
                }
            } else if (i15 == 9) {
                int i23 = k9Var.f5337q;
                if (i23 == 0) {
                    ha haVar = faVar.f5097c0;
                    if (haVar != null) {
                        haVar.run();
                    }
                } else if (i23 == 1) {
                    TLRPC.InputPeer inputPeer = faVar.f5096c;
                    if (inputPeer != null) {
                        clientUserId = DialogObject.getPeerDialogId(inputPeer);
                    } else {
                        clientUserId = UserConfig.getInstance(fa.c1(faVar)).getClientUserId();
                    }
                    q80 F = q80.F(y9Var, fa.U(faVar), view);
                    F.c(R.drawable.msg_addfolder, LocaleController.getString(R.string.StoriesAlbumNewAlbum), new ai.j(y9Var, clientUserId, 5), false);
                    F.k();
                    q80.f(F, faVar.j1().B(clientUserId, true), faVar.v, false, null, new h3(5, y9Var, F));
                    F.Z();
                } else if (i23 == 5) {
                    b2 b2Var3 = new b2(y9Var.getContext(), 3, fa.V(faVar));
                    b2Var3.q(500L);
                    TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = new TL_phone.getGroupCallStreamRtmpUrl();
                    getgroupcallstreamrtmpurl.live_story = true;
                    TLRPC.InputPeer inputPeer2 = faVar.f5096c;
                    if (inputPeer2 == null) {
                        inputPeer2 = new TLRPC.TL_inputPeerSelf();
                    }
                    getgroupcallstreamrtmpurl.peer = inputPeer2;
                    ConnectionsManager.getInstance(fa.W(faVar)).sendRequest(getgroupcallstreamrtmpurl, new t5(y9Var, b2Var3, getgroupcallstreamrtmpurl, 1));
                } else if (i23 == 6) {
                    faVar.G = false;
                    y9Var.g(true);
                }
            }
        }
    }

    @Override
    public boolean d(int i10, View view) {
        return e4.C0((e4) this.f539b, (Context) this.f540c, view, i10);
    }

    @Override
    public void e(Object obj, b2.q qVar) {
        ((j2.b) obj).b((b2.b1) this.f540c, new pf.b(qVar, ((j2.f) this.f539b).f13693e));
    }

    @Override
    public void f(b2 b2Var, int i10) {
        switch (this.f538a) {
            case 3:
                w5 w5Var = (w5) this.f539b;
                d2 d2Var = ((kc) this.f540c).A0;
                if (d2Var != null) {
                    if (!d2Var.f814w) {
                        TL_phone.discardGroupCall discardgroupcall = new TL_phone.discardGroupCall();
                        discardgroupcall.call = d2Var.f810f;
                        ConnectionsManager.getInstance(d2Var.f809e).sendRequest(discardgroupcall, new ai.q1(d2Var, 4));
                        d2Var.e();
                        return;
                    }
                    return;
                }
                f6.f0(w5Var.f1860l);
                return;
            case 10:
                e4.z0((e4) this.f539b, (TL_payments.connectedBotStarRef) this.f540c);
                return;
            case 12:
                j1 j1Var = (j1) this.f539b;
                j1Var.getClass();
                ((boolean[]) this.f540c)[0] = true;
                j1Var.Q();
                return;
            default:
                w.Z((w) this.f539b, (TL_account.TL_businessChatLink) this.f540c);
                return;
        }
    }

    @Override
    public void g(m4.r rVar) {
        switch (this.f538a) {
            case 24:
                Bundle bundle = (Bundle) this.f540c;
                b0 b0Var = ((l0) this.f539b).f16160g;
                if (bundle == null) {
                    Bundle bundle2 = Bundle.EMPTY;
                }
                b0Var.n(rVar);
                return;
            default:
                l0 l0Var = (l0) this.f539b;
                l0Var.getClass();
                String str = ((n4.l) this.f540c).f16580a;
                if (TextUtils.isEmpty(str)) {
                    e2.a.n("MediaSessionLegacyStub", "onRemoveQueueItem(): Media ID shouldn't be null");
                    return;
                }
                f1 f1Var = l0Var.f16160g.f16001t;
                if (!f1Var.m0(17)) {
                    e2.a.n("MediaSessionLegacyStub", "Can't remove item by ID without COMMAND_GET_TIMELINE being available");
                    return;
                }
                k1 w02 = f1Var.w0();
                b2.j1 j1Var = new b2.j1();
                for (int i10 = 0; i10 < w02.o(); i10++) {
                    if (TextUtils.equals(w02.m(i10, j1Var, 0L).f3381c.f3399a, str)) {
                        f1Var.R(i10);
                        return;
                    }
                }
                return;
        }
    }

    @Override
    public Object h(b0 b0Var, m4.r rVar, int i10) {
        switch (this.f538a) {
            case 28:
                a1 a1Var = (a1) this.f539b;
                q0 q0Var = (q0) this.f540c;
                if (b0Var.j()) {
                    return j8.b(new m4.l1(-100));
                }
                return d0.c0((i9.w) a1Var.h(b0Var, rVar, i10), new r5(b0Var, rVar, q0Var, 14));
            default:
                a1 a1Var2 = (a1) this.f539b;
                z0 z0Var = (z0) this.f540c;
                if (b0Var.j()) {
                    return j8.b(new m4.l1(-100));
                }
                return d0.c0((i9.w) a1Var2.h(b0Var, rVar, i10), new r5(b0Var, rVar, z0Var, 15));
        }
    }

    @Override
    public void i() {
        switch (this.f538a) {
            case 17:
                ((ii.l0) this.f539b).i();
                ((ii.k0) this.f540c).Q();
                return;
            default:
                q5 q5Var = (q5) this.f539b;
                ii.t5 t5Var = (ii.t5) this.f540c;
                TL_iv.pageTableCell pagetablecell = t5Var.f12709b;
                if (pagetablecell != null) {
                    j6.d(pagetablecell, t5Var.f12708a.getText());
                }
                d3 d3Var = q5Var.E;
                if (d3Var != null && q5Var.f12251a != null) {
                    x3.P1(d3Var.f12347a);
                    return;
                }
                return;
        }
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f538a) {
            case 21:
                ((j2.b) obj).e((j2.a) this.f539b, (u2.b0) this.f540c);
                return;
            default:
                ((j2.b) obj).onRenderedFirstFrame((j2.a) this.f539b);
                return;
        }
    }

    @Override
    public void j(RectF rectF, View view) {
        ((ch.d) this.f539b).t(rectF.left, rectF.top);
        View view2 = (View) ((WeakReference) this.f540c).get();
        if (view2 != null) {
            view2.invalidate();
        }
    }

    @Override
    public void k(da daVar, boolean z10, boolean z11, boolean z12, boolean z13, TLRPC.InputPeer inputPeer, int i10, y8 y8Var, a0 a0Var) {
        boolean z14;
        switch (this.f538a) {
            case 1:
                f6 f6Var = (f6) this.f539b;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.f540c;
                TL_stories.TL_stories_editStory tL_stories_editStory = new TL_stories.TL_stories_editStory();
                tL_stories_editStory.peer = MessagesController.getInstance(f6Var.C2).getInputPeer(storyItem.dialogId);
                tL_stories_editStory.f20283id = storyItem.f20279id;
                tL_stories_editStory.flags |= 4;
                tL_stories_editStory.privacy_rules = daVar.f4973b;
                ConnectionsManager.getInstance(f6Var.C2).sendRequest(tL_stories_editStory, new q3(f6Var, y8Var, storyItem, daVar, 0));
                return;
            default:
                w5 w5Var = (w5) this.f539b;
                fa faVar = (fa) this.f540c;
                f6 f6Var2 = w5Var.f1860l;
                d6 d6Var = f6Var2.O1;
                TL_stories.StoryItem storyItem2 = d6Var.f822a;
                if (storyItem2 != null && storyItem2.pinned) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (z14 != z12) {
                    MessagesController.getInstance(f6Var2.C2).getStoriesController().o0(f6Var2.B1, f6Var2.f1012v1, z12, null);
                }
                TL_stories.StoryItem storyItem3 = d6Var.f822a;
                if (storyItem3 != null) {
                    TLRPC.MessageMedia messageMedia = storyItem3.media;
                    if (messageMedia instanceof TLRPC.TL_messageMediaVideoStream) {
                        TLRPC.InputGroupCall inputGroupCall = ((TLRPC.TL_messageMediaVideoStream) messageMedia).call;
                        TL_phone.toggleGroupCallSettings togglegroupcallsettings = new TL_phone.toggleGroupCallSettings();
                        togglegroupcallsettings.call = inputGroupCall;
                        togglegroupcallsettings.messages_enabled = Boolean.valueOf(z10);
                        togglegroupcallsettings.send_paid_messages_stars = Long.valueOf(i10);
                        ConnectionsManager.getInstance(f6Var2.C2).sendRequest(togglegroupcallsettings, new v1(1, w5Var, faVar));
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public void onComplete(Task task) {
        ((com.google.firebase.messaging.g) this.f539b).a((Intent) this.f540c);
    }

    @Override
    public void onFailure(Exception e7) {
        String str;
        w0.i gVar;
        String str2;
        w0.d cVar;
        switch (this.f538a) {
            case 4:
                c1.e eVar = (c1.e) this.f539b;
                CancellationSignal cancellationSignal = (CancellationSignal) this.f540c;
                kotlin.jvm.internal.i.e(e7, "e");
                if ((e7 instanceof com.google.android.gms.common.api.f) && b1.d.f3196b.contains(Integer.valueOf(((com.google.android.gms.common.api.f) e7).getStatusCode()))) {
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
                if (!a1.h.a(cancellationSignal)) {
                    eVar.f().execute(new c1.a(eVar, gVar, 0));
                    return;
                }
                return;
            default:
                d1.e eVar2 = (d1.e) this.f539b;
                CancellationSignal cancellationSignal2 = (CancellationSignal) this.f540c;
                kotlin.jvm.internal.i.e(e7, "e");
                if ((e7 instanceof com.google.android.gms.common.api.f) && b1.d.f3196b.contains(Integer.valueOf(((com.google.android.gms.common.api.f) e7).getStatusCode()))) {
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
                if (!a1.h.a(cancellationSignal2)) {
                    Executor executor = eVar2.f8046g;
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
        ((u3) this.f539b).a((String) this.f540c, tL_inlineButtonTypeUserProfile);
    }

    @Override
    public Object then(Task task) {
        com.google.firebase.messaging.j jVar = (com.google.firebase.messaging.j) this.f539b;
        String str = (String) this.f540c;
        synchronized (jVar) {
            ((a0.f) jVar.f7946b).remove(str);
        }
        return task;
    }

    @Override
    public Object y0(u5 u5Var) {
        String str = (String) this.f539b;
        q9.a aVar = (q9.a) this.f540c;
        try {
            Trace.beginSection(str);
            return aVar.f46055f.y0(u5Var);
        } finally {
            Trace.endSection();
        }
    }

    public b(j2.a aVar, Object obj, long j3) {
        this.f538a = 22;
        this.f539b = aVar;
        this.f540c = obj;
    }

    public b(l0 l0Var, h1 h1Var, Bundle bundle) {
        this.f538a = 24;
        this.f539b = l0Var;
        this.f540c = bundle;
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3) {
        hg.n nVar = (hg.n) this.f539b;
        TLRPC.Document document = (TLRPC.Document) obj2;
        Boolean bool = (Boolean) obj3;
        nVar.f11324w = false;
        AndroidUtilities.cancelRunOnUIThread(nVar.d);
        hg.j jVar = nVar.f11321n;
        nVar.f11325x = document;
        jVar.setSticker(document);
        ((org.telegram.ui.Cells.r8) ((View) this.f540c)).setValueSticker(document);
        nVar.e0(true);
        return Boolean.TRUE;
    }

    @Override
    public void n0(View view, float f7, float f10) {
    }
}
