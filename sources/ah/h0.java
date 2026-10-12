package ah;

import android.content.Context;
import android.content.Intent;
import android.graphics.RectF;
import android.os.CancellationSignal;
import android.os.Trace;
import android.text.TextUtils;
import android.view.Surface;
import android.view.View;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import b2.o1;
import b2.p1;
import b2.q1;
import b2.r1;
import b2.t1;
import b2.u1;
import bi.b8;
import bi.e5;
import bi.f3;
import bi.h5;
import bi.o5;
import bi.q5;
import bi.sb;
import bi.v2;
import com.google.android.gms.internal.cast.z5;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import di.ca;
import di.e9;
import di.ea;
import di.g9;
import di.ga;
import di.j9;
import di.m9;
import di.q9;
import di.x6;
import di.x8;
import di.x9;
import e9.m2;
import fi.f4;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;
import ji.d3;
import ji.k4;
import ji.m6;
import ji.u3;
import ji.u5;
import ji.x3;
import ji.x5;
import m4.n1;
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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.z1;
import org.telegram.ui.Cells.r8;
import org.telegram.ui.Components.bm0;
import org.telegram.ui.Components.cm0;
import org.telegram.ui.Components.lu;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.sc;
import org.telegram.ui.Components.zc;
import org.telegram.ui.id0;
import org.telegram.ui.r61;
public final class h0 implements r61, ih.h, g9, z1, OnFailureListener, OnCompleteListener, Continuation, r9.d, bm0, cm0, Utilities.Callback3Return, id0, e2.p, e2.o, ji.o0, lu, k4, m4.p0, e2.j {
    public final int f767a;
    public final Object f768b;
    public final Object f769c;

    public h0(int i10, Object obj, Object obj2) {
        this.f767a = i10;
        this.f768b = obj;
        this.f769c = obj2;
    }

    @Override
    public boolean a(int i10, View view) {
        return f4.C0((f4) this.f768b, (Context) this.f769c, view, i10);
    }

    @Override
    public void accept(Object obj) {
        switch (this.f767a) {
            case 27:
                m4.j1 j1Var = (m4.j1) this.f768b;
                u1 u1Var = (u1) this.f769c;
                n1 n1Var = (n1) obj;
                j1Var.getClass();
                e9.q0 q0Var = u1Var.H;
                if (!q0Var.isEmpty()) {
                    t1 c10 = u1Var.a().c();
                    m2 it = q0Var.values().iterator();
                    while (it.hasNext()) {
                        r1 r1Var = (r1) it.next();
                        q1 q1Var = (q1) j1Var.d.f8644n.get(r1Var.f2318a.f2292b);
                        if (q1Var != null && r1Var.f2318a.f2291a == q1Var.f2291a) {
                            c10.a(new r1(q1Var, r1Var.f2319b));
                        } else {
                            c10.a(r1Var);
                        }
                    }
                    u1Var = c10.b();
                }
                n1Var.p(u1Var);
                return;
            case 28:
                m4.w wVar = (m4.w) this.f769c;
                n1 n1Var2 = (n1) obj;
                m4.f0 f0Var = (m4.f0) ((m4.j1) this.f768b).f15474a.get();
                if (f0Var != null && !f0Var.j()) {
                    f0Var.g(wVar, false);
                    return;
                }
                return;
            default:
                m4.j1 j1Var2 = (m4.j1) this.f768b;
                Surface surface = (Surface) this.f769c;
                n1 n1Var3 = (n1) obj;
                ((m4.f0) j1Var2.f15474a.get()).getClass();
                if (surface == null) {
                    n1Var3.T(null);
                    j1Var2.f15478i = null;
                    return;
                }
                m4.i1 i1Var = new m4.i1(surface);
                j1Var2.f15478i = i1Var;
                n1Var3.T(i1Var);
                return;
        }
    }

    @Override
    public void b(org.telegram.tgnet.TLRPC.MessageMedia r1, int r2, boolean r3, int r4, long r5) {
        throw new UnsupportedOperationException("Method not decompiled: ah.h0.b(org.telegram.tgnet.TLRPC$MessageMedia, int, boolean, int, long):void");
    }

    @Override
    public void c(Object obj, b2.v vVar) {
        ((j2.b) obj).d((b2.g1) this.f769c, new qf.b(vVar, ((j2.f) this.f768b).e));
    }

    @Override
    public boolean c1(View view) {
        return false;
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
        x9 x9Var = (x9) this.f768b;
        Context context = (Context) this.f769c;
        ArrayList arrayList2 = x9Var.L;
        a0.h hVar = x9Var.f8095b;
        q9 q9Var = x9Var.f8102x;
        ArrayList arrayList3 = x9Var.f8096c;
        HashMap hashMap = x9Var.d;
        ea eaVar = x9Var.W;
        if (i10 >= 0 && i10 < arrayList2.size()) {
            j9 j9Var = (j9) arrayList2.get(i10);
            int i15 = j9Var.f43203a;
            int i16 = 0;
            if (i15 == 3) {
                if (j9Var.f7131n && eaVar.F) {
                    new e9(context, ea.I(eaVar), eaVar.K, eaVar.f6916c, new m9(x9Var, 0), ea.J(eaVar)).show();
                    return;
                }
                int i17 = j9Var.f7126i;
                if (i17 == 1) {
                    if (eaVar.N == 1 || ea.K0(eaVar).isEmpty()) {
                        eaVar.M = 1;
                        eaVar.f6914b.D(1);
                    }
                    eaVar.N = 1;
                    x9Var.f(true);
                } else if (i17 == 3) {
                    if (eaVar.N == 3 || (eaVar.f6919n.isEmpty() && eaVar.f6920r.isEmpty())) {
                        eaVar.M = 3;
                        eaVar.f6914b.D(1);
                    }
                    eaVar.N = 3;
                    x9Var.f(true);
                } else if (i17 == 2) {
                    if (eaVar.N == 2) {
                        eaVar.M = 2;
                        eaVar.f6914b.D(1);
                    }
                    eaVar.N = 2;
                    x9Var.f(true);
                } else if (i17 == 4) {
                    if (eaVar.N == 4) {
                        eaVar.M = 4;
                        eaVar.f6914b.D(1);
                    }
                    eaVar.N = 4;
                    x9Var.f(true);
                } else {
                    if (i17 > 0) {
                        arrayList3.clear();
                        hashMap.clear();
                        eaVar.N = j9Var.f7126i;
                        q9Var.f6667c.a();
                    } else {
                        TLRPC.Chat chat = j9Var.h;
                        if (chat != null) {
                            long j10 = chat.f19216id;
                            if (ea.e1(eaVar, chat) > 200) {
                                try {
                                    x9Var.performHapticFeedback(3, 1);
                                } catch (Throwable unused) {
                                }
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(x9Var.getContext(), 0, ea.K(eaVar));
                                alertDialog$Builder.f19548a.R = LocaleController.getString(R.string.GroupTooLarge);
                                alertDialog$Builder.f19548a.T = LocaleController.getString(R.string.GroupTooLargeMessage);
                                org.telegram.messenger.q.A(R.string.OK, alertDialog$Builder, null);
                            } else if (hashMap.containsKey(Long.valueOf(j10))) {
                                ArrayList arrayList4 = (ArrayList) hashMap.get(Long.valueOf(j10));
                                if (arrayList4 != null) {
                                    int size = arrayList4.size();
                                    while (i16 < size) {
                                        Object obj = arrayList4.get(i16);
                                        i16++;
                                        hVar.k(Boolean.FALSE, ((Long) obj).longValue());
                                    }
                                }
                                hashMap.remove(Long.valueOf(j10));
                                x9Var.i(true);
                            } else {
                                TLRPC.Chat chat2 = MessagesController.getInstance(ea.L(eaVar)).getChat(Long.valueOf(j10));
                                TLRPC.ChatFull chatFull = MessagesController.getInstance(ea.M(eaVar)).getChatFull(j10);
                                if (chatFull != null && (chatParticipants = chatFull.participants) != null && (arrayList = chatParticipants.participants) != null && !arrayList.isEmpty() && chatFull.participants.participants.size() >= chatFull.participants_count - 1) {
                                    x9Var.d(j10, chatFull.participants);
                                } else {
                                    a2 a2Var = x9Var.G;
                                    if (a2Var != null) {
                                        a2Var.dismiss();
                                        x9Var.G = null;
                                    }
                                    x9Var.H = j10;
                                    a2 a2Var2 = new a2(x9Var.getContext(), 3, ea.N(eaVar));
                                    x9Var.G = a2Var2;
                                    a2Var2.q(50L);
                                    MessagesStorage messagesStorage = MessagesStorage.getInstance(ea.O(eaVar));
                                    messagesStorage.getStorageQueue().postRunnable(new b8(x9Var, chat2, messagesStorage, j10, 4));
                                }
                                if (!TextUtils.isEmpty(x9Var.I)) {
                                    q9Var.setText("");
                                    x9Var.I = null;
                                    x9Var.g(false);
                                }
                            }
                        } else {
                            TLRPC.User user = j9Var.f7125g;
                            if (user != null) {
                                if (x9Var.f8094a == 0) {
                                    eaVar.N = 0;
                                }
                                long j11 = user.f19363id;
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
                                    if (!TextUtils.isEmpty(x9Var.I)) {
                                        q9Var.setText("");
                                        x9Var.I = null;
                                        x9Var.g(false);
                                    }
                                    hVar.k(Boolean.TRUE, j11);
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
                    j9Var.f7128k = r8Var.b();
                    int i18 = j9Var.f7123c;
                    if (i18 == 0) {
                        boolean b10 = r8Var.b();
                        eaVar.f6923x = b10;
                        if (eaVar.N == 4) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (b10) {
                            zc zcVar = new zc(eaVar.container, ea.P(eaVar));
                            int i19 = R.raw.ic_save_to_gallery;
                            if (z10) {
                                i14 = R.string.StoryEnabledScreenshotsShare;
                            } else {
                                i14 = R.string.StoryEnabledScreenshots;
                            }
                            sc G = zcVar.G(i19, 4, LocaleController.getString(i14));
                            G.f29102j = 5000;
                            G.k(true);
                            return;
                        }
                        zc zcVar2 = new zc(eaVar.container, ea.Q(eaVar));
                        int i20 = R.raw.passcode_lock_close;
                        if (z10) {
                            i13 = R.string.StoryDisabledScreenshotsShare;
                        } else {
                            i13 = R.string.StoryDisabledScreenshots;
                        }
                        sc G2 = zcVar2.G(i20, 4, LocaleController.getString(i13));
                        G2.f29102j = 5000;
                        G2.k(true);
                    } else if (i18 == 1) {
                        boolean b11 = r8Var.b();
                        eaVar.f6924y = b11;
                        boolean z11 = eaVar.f6916c instanceof TLRPC.TL_inputPeerChannel;
                        if (b11) {
                            zc zcVar3 = new zc(eaVar.container, ea.S(eaVar));
                            int i21 = R.raw.msg_story_keep;
                            if (z11) {
                                i12 = R.string.StoryChannelEnableKeep;
                            } else {
                                i12 = R.string.StoryEnableKeep;
                            }
                            sc G3 = zcVar3.G(i21, 4, LocaleController.getString(i12));
                            G3.f29102j = 5000;
                            G3.k(true);
                        } else {
                            zc zcVar4 = new zc(eaVar.container, ea.T(eaVar));
                            int i22 = R.raw.fire_on;
                            if (z11) {
                                i11 = R.string.StoryChannelDisableKeep;
                            } else {
                                i11 = R.string.StoryDisableKeep;
                            }
                            sc G4 = zcVar4.G(i22, 4, LocaleController.getString(i11));
                            G4.f29102j = 5000;
                            G4.k(true);
                        }
                        x9Var.g(true);
                    } else if (i18 == 2) {
                        eaVar.f6922w = r8Var.b();
                        x9Var.g(true);
                    }
                }
            } else if (i15 == 9) {
                int i23 = j9Var.f7134q;
                if (i23 == 0) {
                    ga gaVar = eaVar.f6917c0;
                    if (gaVar != null) {
                        gaVar.run();
                    }
                } else if (i23 == 1) {
                    TLRPC.InputPeer inputPeer = eaVar.f6916c;
                    if (inputPeer != null) {
                        clientUserId = DialogObject.getPeerDialogId(inputPeer);
                    } else {
                        clientUserId = UserConfig.getInstance(ea.c1(eaVar)).getClientUserId();
                    }
                    m80 F = m80.F(x9Var, ea.U(eaVar), view);
                    F.c(R.drawable.msg_addfolder, LocaleController.getString(R.string.StoriesAlbumNewAlbum), new bi.g(x9Var, clientUserId, 5), false);
                    F.k();
                    m80.f(F, eaVar.j1().B(clientUserId, true), eaVar.v, false, null, new v2(5, x9Var, F));
                    F.Z();
                } else if (i23 == 5) {
                    a2 a2Var3 = new a2(x9Var.getContext(), 3, ea.V(eaVar));
                    a2Var3.q(500L);
                    TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = new TL_phone.getGroupCallStreamRtmpUrl();
                    getgroupcallstreamrtmpurl.live_story = true;
                    TLRPC.InputPeer inputPeer2 = eaVar.f6916c;
                    if (inputPeer2 == null) {
                        inputPeer2 = new TLRPC.TL_inputPeerSelf();
                    }
                    getgroupcallstreamrtmpurl.peer = inputPeer2;
                    ConnectionsManager.getInstance(ea.W(eaVar)).sendRequest(getgroupcallstreamrtmpurl, new e5(x9Var, a2Var3, getgroupcallstreamrtmpurl, 1));
                } else if (i23 == 6) {
                    eaVar.G = false;
                    x9Var.g(true);
                }
            }
        }
    }

    @Override
    public void e(ca caVar, boolean z10, boolean z11, boolean z12, boolean z13, TLRPC.InputPeer inputPeer, int i10, x6 x6Var, x8 x8Var) {
        boolean z14;
        switch (this.f767a) {
            case 2:
                q5 q5Var = (q5) this.f768b;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.f769c;
                TL_stories.TL_stories_editStory tL_stories_editStory = new TL_stories.TL_stories_editStory();
                tL_stories_editStory.peer = MessagesController.getInstance(q5Var.C2).getInputPeer(storyItem.dialogId);
                tL_stories_editStory.f19455id = storyItem.f19451id;
                tL_stories_editStory.flags |= 4;
                tL_stories_editStory.privacy_rules = caVar.f6738b;
                ConnectionsManager.getInstance(q5Var.C2).sendRequest(tL_stories_editStory, new f3(q5Var, x6Var, storyItem, caVar, 0));
                return;
            default:
                h5 h5Var = (h5) this.f768b;
                ea eaVar = (ea) this.f769c;
                q5 q5Var2 = h5Var.f3122l;
                o5 o5Var = q5Var2.O1;
                TL_stories.StoryItem storyItem2 = o5Var.f3413a;
                if (storyItem2 != null && storyItem2.pinned) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (z14 != z12) {
                    MessagesController.getInstance(q5Var2.C2).getStoriesController().o0(q5Var2.B1, q5Var2.f3569v1, z12, null);
                }
                TL_stories.StoryItem storyItem3 = o5Var.f3413a;
                if (storyItem3 != null) {
                    TLRPC.MessageMedia messageMedia = storyItem3.media;
                    if (messageMedia instanceof TLRPC.TL_messageMediaVideoStream) {
                        TLRPC.InputGroupCall inputGroupCall = ((TLRPC.TL_messageMediaVideoStream) messageMedia).call;
                        TL_phone.toggleGroupCallSettings togglegroupcallsettings = new TL_phone.toggleGroupCallSettings();
                        togglegroupcallsettings.call = inputGroupCall;
                        togglegroupcallsettings.messages_enabled = Boolean.valueOf(z10);
                        togglegroupcallsettings.send_paid_messages_stars = Long.valueOf(i10);
                        ConnectionsManager.getInstance(q5Var2.C2).sendRequest(togglegroupcallsettings, new bi.m1(1, h5Var, eaVar));
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public void f(m4.w wVar) {
        switch (this.f767a) {
            case 25:
                ((m4.e) this.f769c).f(((m4.q0) this.f768b).f15573g.f15440t);
                return;
            default:
                m4.q0 q0Var = (m4.q0) this.f768b;
                q0Var.getClass();
                String str = ((n4.h) this.f769c).f15998a;
                if (TextUtils.isEmpty(str)) {
                    e2.a.l("MediaSessionLegacyStub", "onRemoveQueueItem(): Media ID shouldn't be null");
                    return;
                }
                n1 n1Var = q0Var.f15573g.f15440t;
                if (!n1Var.o0(17)) {
                    e2.a.l("MediaSessionLegacyStub", "Can't remove item by ID without COMMAND_GET_TIMELINE being available");
                    return;
                }
                p1 y02 = n1Var.y0();
                o1 o1Var = new o1();
                for (int i10 = 0; i10 < y02.o(); i10++) {
                    if (TextUtils.equals(y02.m(i10, o1Var, 0L).f2260c.f2277a, str)) {
                        n1Var.Q(i10);
                        return;
                    }
                }
                return;
        }
    }

    @Override
    public void g(a2 a2Var, int i10) {
        switch (this.f767a) {
            case 4:
                h5 h5Var = (h5) this.f768b;
                bi.t1 t1Var = ((sb) this.f769c).A0;
                if (t1Var != null) {
                    if (!t1Var.f3727w) {
                        TL_phone.discardGroupCall discardgroupcall = new TL_phone.discardGroupCall();
                        discardgroupcall.call = t1Var.f3723f;
                        ConnectionsManager.getInstance(t1Var.e).sendRequest(discardgroupcall, new bi.i1(t1Var, 4));
                        t1Var.e();
                        return;
                    }
                    return;
                }
                q5.f0(h5Var.f3122l);
                return;
            case 11:
                f4.z0((f4) this.f768b, (TL_payments.connectedBotStarRef) this.f769c);
                return;
            case 13:
                hg.j1 j1Var = (hg.j1) this.f768b;
                j1Var.getClass();
                ((boolean[]) this.f769c)[0] = true;
                j1Var.Q();
                return;
            default:
                ig.v.Z((ig.v) this.f768b, (TL_account.TL_businessChatLink) this.f769c);
                return;
        }
    }

    @Override
    public void h(RectF rectF, View view) {
        ((dh.d) this.f768b).t(rectF.left, rectF.top);
        View view2 = (View) ((WeakReference) this.f769c).get();
        if (view2 != null) {
            view2.invalidate();
        }
    }

    @Override
    public m80 i(ji.h1 h1Var) {
        ji.r rVar = (ji.r) ((qf.b) this.f768b).f43356c;
        m80 m80Var = new m80(rVar, (c6) this.f769c, h1Var, false, false, true);
        rVar.H = m80Var;
        return m80Var;
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f767a) {
            case 18:
                ((j2.b) obj).e((j2.a) this.f768b, (u2.c0) this.f769c);
                return;
            default:
                ((j2.b) obj).onRenderedFirstFrame((j2.a) this.f768b);
                return;
        }
    }

    @Override
    public Object j2(z5 z5Var) {
        String str = (String) this.f768b;
        r9.a aVar = (r9.a) this.f769c;
        try {
            Trace.beginSection(str);
            return aVar.f44032f.j2(z5Var);
        } finally {
            Trace.endSection();
        }
    }

    @Override
    public void onComplete(Task task) {
        ((com.google.firebase.messaging.g) this.f768b).a((Intent) this.f769c);
    }

    @Override
    public void onFailure(Exception e) {
        String str;
        w0.i gVar;
        String str2;
        w0.d cVar;
        switch (this.f767a) {
            case 5:
                c1.e eVar = (c1.e) this.f768b;
                CancellationSignal cancellationSignal = (CancellationSignal) this.f769c;
                kotlin.jvm.internal.i.e(e, "e");
                if ((e instanceof com.google.android.gms.common.api.f) && b1.d.f2043b.contains(Integer.valueOf(((com.google.android.gms.common.api.f) e).getStatusCode()))) {
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
                if (!a1.h.a(cancellationSignal)) {
                    eVar.f().execute(new c1.a(eVar, gVar, 0));
                    return;
                }
                return;
            default:
                d1.e eVar2 = (d1.e) this.f768b;
                CancellationSignal cancellationSignal2 = (CancellationSignal) this.f769c;
                kotlin.jvm.internal.i.e(e, "e");
                if ((e instanceof com.google.android.gms.common.api.f) && b1.d.f2043b.contains(Integer.valueOf(((com.google.android.gms.common.api.f) e).getStatusCode()))) {
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
                if (!a1.h.a(cancellationSignal2)) {
                    Executor executor = eVar2.f6273g;
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
    public void p() {
        switch (this.f767a) {
            case 21:
                ((ji.k0) this.f768b).i();
                ((ji.j0) this.f769c).o0();
                return;
            default:
                u5 u5Var = (u5) this.f768b;
                x5 x5Var = (x5) this.f769c;
                TL_iv.pageTableCell pagetablecell = x5Var.f13659b;
                if (pagetablecell != null) {
                    m6.d(pagetablecell, x5Var.f13658a.getText());
                }
                d3 d3Var = u5Var.E;
                if (d3Var != null && u5Var.f13119a != null) {
                    x3.P1(d3Var.f13231a);
                    return;
                }
                return;
        }
    }

    @Override
    public void run(long j10) {
        TL_keyboard.TL_inlineButtonTypeUserProfile tL_inlineButtonTypeUserProfile = new TL_keyboard.TL_inlineButtonTypeUserProfile();
        tL_inlineButtonTypeUserProfile.user_id = j10;
        ((u3) this.f768b).a((String) this.f769c, tL_inlineButtonTypeUserProfile);
    }

    @Override
    public Object then(Task task) {
        com.google.firebase.messaging.j jVar = (com.google.firebase.messaging.j) this.f768b;
        String str = (String) this.f769c;
        synchronized (jVar) {
            ((a0.f) jVar.f6187b).remove(str);
        }
        return task;
    }

    public h0(j2.a aVar, Object obj, long j10) {
        this.f767a = 19;
        this.f768b = aVar;
        this.f769c = obj;
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3) {
        ig.m mVar = (ig.m) this.f768b;
        TLRPC.Document document = (TLRPC.Document) obj2;
        Boolean bool = (Boolean) obj3;
        mVar.f11574w = false;
        AndroidUtilities.cancelRunOnUIThread(mVar.d);
        ig.i iVar = mVar.f11571n;
        mVar.f11575x = document;
        iVar.setSticker(document);
        ((r8) ((View) this.f769c)).setValueSticker(document);
        mVar.e0(true);
        return Boolean.TRUE;
    }

    @Override
    public void p0(View view, float f7, float f10) {
    }
}
