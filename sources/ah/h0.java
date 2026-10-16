package ah;

import android.content.Context;
import android.content.Intent;
import android.graphics.RectF;
import android.os.CancellationSignal;
import android.os.Trace;
import android.text.SpannableString;
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
import di.x8;
import di.x9;
import di.y6;
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
import org.telegram.ui.ActionBar.c3;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.ActionBar.z1;
import org.telegram.ui.Cells.r8;
import org.telegram.ui.Components.bm0;
import org.telegram.ui.Components.cm0;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.lu;
import org.telegram.ui.Components.sc;
import org.telegram.ui.Components.zc;
import org.telegram.ui.gd0;
import org.telegram.ui.r61;
public final class h0 implements r61, ih.h, g9, z1, OnFailureListener, OnCompleteListener, Continuation, r9.d, bm0, cm0, Utilities.Callback3Return, gd0, e2.p, e2.o, ji.o0, lu, k4, li.n, m4.o0, e2.j {
    public final int f771a;
    public final Object f772b;
    public final Object f773c;

    public h0(int i10, Object obj, Object obj2) {
        this.f771a = i10;
        this.f772b = obj;
        this.f773c = obj2;
    }

    @Override
    public boolean a(int i10, View view) {
        return f4.C0((f4) this.f772b, (Context) this.f773c, view, i10);
    }

    @Override
    public void accept(Object obj) {
        switch (this.f771a) {
            case 27:
                m4.i1 i1Var = (m4.i1) this.f772b;
                u1 u1Var = (u1) this.f773c;
                m4.m1 m1Var = (m4.m1) obj;
                i1Var.getClass();
                e9.q0 q0Var = u1Var.H;
                if (!q0Var.isEmpty()) {
                    t1 c10 = u1Var.a().c();
                    m2 it = q0Var.values().iterator();
                    while (it.hasNext()) {
                        r1 r1Var = (r1) it.next();
                        q1 q1Var = (q1) i1Var.d.f8647n.get(r1Var.f2322a.f2296b);
                        if (q1Var != null && r1Var.f2322a.f2295a == q1Var.f2295a) {
                            c10.a(new r1(q1Var, r1Var.f2323b));
                        } else {
                            c10.a(r1Var);
                        }
                    }
                    u1Var = c10.b();
                }
                m1Var.p(u1Var);
                return;
            case 28:
                m4.v vVar = (m4.v) this.f773c;
                m4.m1 m1Var2 = (m4.m1) obj;
                m4.e0 e0Var = (m4.e0) ((m4.i1) this.f772b).f15204a.get();
                if (e0Var != null && !e0Var.j()) {
                    e0Var.g(vVar, false);
                    return;
                }
                return;
            default:
                m4.i1 i1Var2 = (m4.i1) this.f772b;
                Surface surface = (Surface) this.f773c;
                m4.m1 m1Var3 = (m4.m1) obj;
                ((m4.e0) i1Var2.f15204a.get()).getClass();
                if (surface == null) {
                    m1Var3.T(null);
                    i1Var2.f15208i = null;
                    return;
                }
                m4.h1 h1Var = new m4.h1(surface);
                i1Var2.f15208i = h1Var;
                m1Var3.T(h1Var);
                return;
        }
    }

    @Override
    public void b(org.telegram.tgnet.TLRPC.MessageMedia r1, int r2, boolean r3, int r4, long r5) {
        throw new UnsupportedOperationException("Method not decompiled: ah.h0.b(org.telegram.tgnet.TLRPC$MessageMedia, int, boolean, int, long):void");
    }

    @Override
    public void c(Object obj, b2.v vVar) {
        ((j2.b) obj).d((b2.g1) this.f773c, new qf.b(vVar, ((j2.f) this.f772b).e));
    }

    @Override
    public boolean c1(View view) {
        return false;
    }

    @Override
    public void d(float f7, float f10, int i10, View view) {
        c6 c6Var;
        int i11;
        int i12;
        long clientUserId;
        c6 c6Var2;
        c6 c6Var3;
        int i13;
        c6 c6Var4;
        int i14;
        boolean z10;
        c6 c6Var5;
        int i15;
        c6 c6Var6;
        int i16;
        c6 c6Var7;
        int i17;
        int i18;
        c6 c6Var8;
        int i19;
        TLRPC.ChatParticipants chatParticipants;
        ArrayList<TLRPC.ChatParticipant> arrayList;
        int i20;
        c6 c6Var9;
        x9 x9Var = (x9) this.f772b;
        Context context = (Context) this.f773c;
        ArrayList arrayList2 = x9Var.L;
        a0.h hVar = x9Var.f8097b;
        q9 q9Var = x9Var.f8104x;
        ArrayList arrayList3 = x9Var.f8098c;
        HashMap hashMap = x9Var.d;
        ea eaVar = x9Var.W;
        if (i10 >= 0 && i10 < arrayList2.size()) {
            j9 j9Var = (j9) arrayList2.get(i10);
            int i21 = j9Var.f42904a;
            int i22 = 0;
            if (i21 == 3) {
                if (j9Var.f7134n && eaVar.F) {
                    i20 = ((e3) eaVar).currentAccount;
                    boolean z11 = eaVar.K;
                    TLRPC.InputPeer inputPeer = eaVar.f6919c;
                    m9 m9Var = new m9(x9Var, 0);
                    c6Var9 = ((e3) eaVar).resourcesProvider;
                    new e9(context, i20, z11, inputPeer, m9Var, c6Var9).show();
                    return;
                }
                int i23 = j9Var.f7129i;
                if (i23 == 1) {
                    if (eaVar.N == 1 || ea.K0(eaVar).isEmpty()) {
                        eaVar.M = 1;
                        eaVar.f6917b.D(1);
                    }
                    eaVar.N = 1;
                    x9Var.f(true);
                } else if (i23 == 3) {
                    if (eaVar.N == 3 || (eaVar.f6922n.isEmpty() && eaVar.f6923r.isEmpty())) {
                        eaVar.M = 3;
                        eaVar.f6917b.D(1);
                    }
                    eaVar.N = 3;
                    x9Var.f(true);
                } else if (i23 == 2) {
                    if (eaVar.N == 2) {
                        eaVar.M = 2;
                        eaVar.f6917b.D(1);
                    }
                    eaVar.N = 2;
                    x9Var.f(true);
                } else if (i23 == 4) {
                    if (eaVar.N == 4) {
                        eaVar.M = 4;
                        eaVar.f6917b.D(1);
                    }
                    eaVar.N = 4;
                    x9Var.f(true);
                } else {
                    if (i23 > 0) {
                        arrayList3.clear();
                        hashMap.clear();
                        eaVar.N = j9Var.f7129i;
                        q9Var.f6670c.a();
                    } else {
                        TLRPC.Chat chat = j9Var.h;
                        if (chat != null) {
                            long j10 = chat.f18916id;
                            if (ea.e1(eaVar, chat) > 200) {
                                try {
                                    x9Var.performHapticFeedback(3, 1);
                                } catch (Throwable unused) {
                                }
                                Context context2 = x9Var.getContext();
                                c6Var7 = ((e3) eaVar).resourcesProvider;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context2, 0, c6Var7);
                                alertDialog$Builder.f19248a.R = LocaleController.getString(R.string.GroupTooLarge);
                                alertDialog$Builder.f19248a.T = LocaleController.getString(R.string.GroupTooLargeMessage);
                                org.telegram.messenger.g0.p(R.string.OK, alertDialog$Builder, null);
                            } else if (!hashMap.containsKey(Long.valueOf(j10))) {
                                i17 = ((e3) eaVar).currentAccount;
                                TLRPC.Chat chat2 = MessagesController.getInstance(i17).getChat(Long.valueOf(j10));
                                i18 = ((e3) eaVar).currentAccount;
                                TLRPC.ChatFull chatFull = MessagesController.getInstance(i18).getChatFull(j10);
                                if (chatFull != null && (chatParticipants = chatFull.participants) != null && (arrayList = chatParticipants.participants) != null && !arrayList.isEmpty() && chatFull.participants.participants.size() >= chatFull.participants_count - 1) {
                                    x9Var.d(j10, chatFull.participants);
                                } else {
                                    a2 a2Var = x9Var.G;
                                    if (a2Var != null) {
                                        a2Var.dismiss();
                                        x9Var.G = null;
                                    }
                                    x9Var.H = j10;
                                    Context context3 = x9Var.getContext();
                                    c6Var8 = ((e3) eaVar).resourcesProvider;
                                    a2 a2Var2 = new a2(context3, 3, c6Var8);
                                    x9Var.G = a2Var2;
                                    a2Var2.q(50L);
                                    i19 = ((e3) eaVar).currentAccount;
                                    MessagesStorage messagesStorage = MessagesStorage.getInstance(i19);
                                    messagesStorage.getStorageQueue().postRunnable(new b8(x9Var, chat2, messagesStorage, j10, 4));
                                }
                                if (!TextUtils.isEmpty(x9Var.I)) {
                                    q9Var.setText("");
                                    x9Var.I = null;
                                    x9Var.g(false);
                                }
                            } else {
                                ArrayList arrayList4 = (ArrayList) hashMap.get(Long.valueOf(j10));
                                if (arrayList4 != null) {
                                    int size = arrayList4.size();
                                    while (i22 < size) {
                                        Object obj = arrayList4.get(i22);
                                        i22++;
                                        hVar.k(Boolean.FALSE, ((Long) obj).longValue());
                                    }
                                }
                                hashMap.remove(Long.valueOf(j10));
                                x9Var.i(true);
                            }
                        } else {
                            TLRPC.User user = j9Var.f7128g;
                            if (user != null) {
                                if (x9Var.f8096a == 0) {
                                    eaVar.N = 0;
                                }
                                long j11 = user.f19063id;
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
            } else if (i21 == 7) {
                if (view instanceof r8) {
                    r8 r8Var = (r8) view;
                    r8Var.setChecked(!r8Var.b());
                    j9Var.f7131k = r8Var.b();
                    int i24 = j9Var.f7126c;
                    if (i24 == 0) {
                        boolean b10 = r8Var.b();
                        eaVar.f6926x = b10;
                        if (eaVar.N == 4) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (b10) {
                            c3 c3Var = eaVar.container;
                            c6Var6 = ((e3) eaVar).resourcesProvider;
                            zc zcVar = new zc(c3Var, c6Var6);
                            int i25 = R.raw.ic_save_to_gallery;
                            if (z10) {
                                i16 = R.string.StoryEnabledScreenshotsShare;
                            } else {
                                i16 = R.string.StoryEnabledScreenshots;
                            }
                            sc G = zcVar.G(i25, 4, LocaleController.getString(i16));
                            G.f28805j = 5000;
                            G.k(true);
                            return;
                        }
                        c3 c3Var2 = eaVar.container;
                        c6Var5 = ((e3) eaVar).resourcesProvider;
                        zc zcVar2 = new zc(c3Var2, c6Var5);
                        int i26 = R.raw.passcode_lock_close;
                        if (z10) {
                            i15 = R.string.StoryDisabledScreenshotsShare;
                        } else {
                            i15 = R.string.StoryDisabledScreenshots;
                        }
                        sc G2 = zcVar2.G(i26, 4, LocaleController.getString(i15));
                        G2.f28805j = 5000;
                        G2.k(true);
                    } else if (i24 == 1) {
                        boolean b11 = r8Var.b();
                        eaVar.f6927y = b11;
                        boolean z12 = eaVar.f6919c instanceof TLRPC.TL_inputPeerChannel;
                        if (b11) {
                            c3 c3Var3 = eaVar.container;
                            c6Var4 = ((e3) eaVar).resourcesProvider;
                            zc zcVar3 = new zc(c3Var3, c6Var4);
                            int i27 = R.raw.msg_story_keep;
                            if (z12) {
                                i14 = R.string.StoryChannelEnableKeep;
                            } else {
                                i14 = R.string.StoryEnableKeep;
                            }
                            sc G3 = zcVar3.G(i27, 4, LocaleController.getString(i14));
                            G3.f28805j = 5000;
                            G3.k(true);
                        } else {
                            c3 c3Var4 = eaVar.container;
                            c6Var3 = ((e3) eaVar).resourcesProvider;
                            zc zcVar4 = new zc(c3Var4, c6Var3);
                            int i28 = R.raw.fire_on;
                            if (z12) {
                                i13 = R.string.StoryChannelDisableKeep;
                            } else {
                                i13 = R.string.StoryDisableKeep;
                            }
                            sc G4 = zcVar4.G(i28, 4, LocaleController.getString(i13));
                            G4.f28805j = 5000;
                            G4.k(true);
                        }
                        x9Var.g(true);
                    } else if (i24 == 2) {
                        eaVar.f6925w = r8Var.b();
                        x9Var.g(true);
                    }
                }
            } else if (i21 == 9) {
                int i29 = j9Var.f7137q;
                if (i29 == 0) {
                    ga gaVar = eaVar.f6920c0;
                    if (gaVar != null) {
                        gaVar.run();
                    }
                } else if (i29 == 1) {
                    TLRPC.InputPeer inputPeer2 = eaVar.f6919c;
                    if (inputPeer2 == null) {
                        i12 = ((e3) eaVar).currentAccount;
                        clientUserId = UserConfig.getInstance(i12).getClientUserId();
                    } else {
                        clientUserId = DialogObject.getPeerDialogId(inputPeer2);
                    }
                    c6Var2 = ((e3) eaVar).resourcesProvider;
                    l80 F = l80.F(x9Var, c6Var2, view);
                    F.c(R.drawable.msg_addfolder, LocaleController.getString(R.string.StoriesAlbumNewAlbum), new bi.g(x9Var, clientUserId, 5), false);
                    F.k();
                    l80.f(F, eaVar.j1().B(clientUserId, true), eaVar.v, false, null, new v2(5, x9Var, F));
                    F.Z();
                } else if (i29 == 5) {
                    Context context4 = x9Var.getContext();
                    c6Var = ((e3) eaVar).resourcesProvider;
                    a2 a2Var3 = new a2(context4, 3, c6Var);
                    a2Var3.q(500L);
                    TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = new TL_phone.getGroupCallStreamRtmpUrl();
                    getgroupcallstreamrtmpurl.live_story = true;
                    TLRPC.InputPeer inputPeer3 = eaVar.f6919c;
                    if (inputPeer3 == null) {
                        inputPeer3 = new TLRPC.TL_inputPeerSelf();
                    }
                    getgroupcallstreamrtmpurl.peer = inputPeer3;
                    i11 = ((e3) eaVar).currentAccount;
                    ConnectionsManager.getInstance(i11).sendRequest(getgroupcallstreamrtmpurl, new e5(x9Var, a2Var3, getgroupcallstreamrtmpurl, 1));
                } else if (i29 == 6) {
                    eaVar.G = false;
                    x9Var.g(true);
                }
            }
        }
    }

    @Override
    public void e(m4.v vVar) {
        switch (this.f771a) {
            case 25:
                ((m4.d) this.f773c).f(((m4.p0) this.f772b).f15303g.f15170t);
                return;
            default:
                m4.p0 p0Var = (m4.p0) this.f772b;
                p0Var.getClass();
                String str = ((n4.h) this.f773c).f15712a;
                if (TextUtils.isEmpty(str)) {
                    e2.a.l("MediaSessionLegacyStub", "onRemoveQueueItem(): Media ID shouldn't be null");
                    return;
                }
                m4.m1 m1Var = p0Var.f15303g.f15170t;
                if (!m1Var.o0(17)) {
                    e2.a.l("MediaSessionLegacyStub", "Can't remove item by ID without COMMAND_GET_TIMELINE being available");
                    return;
                }
                p1 y02 = m1Var.y0();
                o1 o1Var = new o1();
                for (int i10 = 0; i10 < y02.o(); i10++) {
                    if (TextUtils.equals(y02.m(i10, o1Var, 0L).f2264c.f2281a, str)) {
                        m1Var.Q(i10);
                        return;
                    }
                }
                return;
        }
    }

    @Override
    public void f(RectF rectF, View view) {
        ((dh.d) this.f772b).t(rectF.left, rectF.top);
        View view2 = (View) ((WeakReference) this.f773c).get();
        if (view2 != null) {
            view2.invalidate();
        }
    }

    @Override
    public void g(a2 a2Var, int i10) {
        switch (this.f771a) {
            case 4:
                h5 h5Var = (h5) this.f772b;
                bi.t1 t1Var = ((sb) this.f773c).A0;
                if (t1Var != null) {
                    if (!t1Var.f3731w) {
                        TL_phone.discardGroupCall discardgroupcall = new TL_phone.discardGroupCall();
                        discardgroupcall.call = t1Var.f3727f;
                        ConnectionsManager.getInstance(t1Var.e).sendRequest(discardgroupcall, new bi.i1(t1Var, 4));
                        t1Var.e();
                        return;
                    }
                    return;
                }
                q5.f0(h5Var.f3126l);
                return;
            case 11:
                f4.z0((f4) this.f772b, (TL_payments.connectedBotStarRef) this.f773c);
                return;
            case 13:
                hg.j1 j1Var = (hg.j1) this.f772b;
                j1Var.getClass();
                ((boolean[]) this.f773c)[0] = true;
                j1Var.Q();
                return;
            default:
                ig.y.d(r4.currentAccount).a((ig.v) this.f772b, ((TL_account.TL_businessChatLink) this.f773c).link);
                return;
        }
    }

    @Override
    public l80 h(ji.h1 h1Var) {
        ji.r rVar = (ji.r) ((qf.b) this.f772b).f43098c;
        l80 l80Var = new l80(rVar, (c6) this.f773c, h1Var, false, false, true);
        rVar.H = l80Var;
        return l80Var;
    }

    @Override
    public void i(n4.s sVar) {
        AndroidUtilities.runOnUIThread(new hg.t((SpannableString) this.f772b, sVar, (gi.m0) this.f773c, 24));
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f771a) {
            case 18:
                ((j2.b) obj).e((j2.a) this.f772b, (u2.c0) this.f773c);
                return;
            default:
                ((j2.b) obj).onRenderedFirstFrame((j2.a) this.f772b);
                return;
        }
    }

    @Override
    public void j(ca caVar, boolean z10, boolean z11, boolean z12, boolean z13, TLRPC.InputPeer inputPeer, int i10, y6 y6Var, x8 x8Var) {
        boolean z14;
        switch (this.f771a) {
            case 2:
                q5 q5Var = (q5) this.f772b;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.f773c;
                TL_stories.TL_stories_editStory tL_stories_editStory = new TL_stories.TL_stories_editStory();
                tL_stories_editStory.peer = MessagesController.getInstance(q5Var.C2).getInputPeer(storyItem.dialogId);
                tL_stories_editStory.f19155id = storyItem.f19151id;
                tL_stories_editStory.flags |= 4;
                tL_stories_editStory.privacy_rules = caVar.f6741b;
                ConnectionsManager.getInstance(q5Var.C2).sendRequest(tL_stories_editStory, new f3(q5Var, y6Var, storyItem, caVar, 0));
                return;
            default:
                h5 h5Var = (h5) this.f772b;
                ea eaVar = (ea) this.f773c;
                q5 q5Var2 = h5Var.f3126l;
                o5 o5Var = q5Var2.O1;
                TL_stories.StoryItem storyItem2 = o5Var.f3417a;
                if (storyItem2 != null && storyItem2.pinned) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (z14 != z12) {
                    MessagesController.getInstance(q5Var2.C2).getStoriesController().o0(q5Var2.B1, q5Var2.f3573v1, z12, null);
                }
                TL_stories.StoryItem storyItem3 = o5Var.f3417a;
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
    public Object n2(z5 z5Var) {
        String str = (String) this.f772b;
        r9.a aVar = (r9.a) this.f773c;
        try {
            Trace.beginSection(str);
            return aVar.f43791f.n2(z5Var);
        } finally {
            Trace.endSection();
        }
    }

    @Override
    public void onComplete(Task task) {
        ((com.google.firebase.messaging.g) this.f772b).a((Intent) this.f773c);
    }

    @Override
    public void onFailure(Exception e) {
        String str;
        w0.i gVar;
        String str2;
        w0.d cVar;
        switch (this.f771a) {
            case 5:
                c1.e eVar = (c1.e) this.f772b;
                CancellationSignal cancellationSignal = (CancellationSignal) this.f773c;
                kotlin.jvm.internal.i.e(e, "e");
                if ((e instanceof com.google.android.gms.common.api.f) && b1.d.f2047b.contains(Integer.valueOf(((com.google.android.gms.common.api.f) e).getStatusCode()))) {
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
                d1.e eVar2 = (d1.e) this.f772b;
                CancellationSignal cancellationSignal2 = (CancellationSignal) this.f773c;
                kotlin.jvm.internal.i.e(e, "e");
                if ((e instanceof com.google.android.gms.common.api.f) && b1.d.f2047b.contains(Integer.valueOf(((com.google.android.gms.common.api.f) e).getStatusCode()))) {
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
                    Executor executor = eVar2.f6276g;
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
        switch (this.f771a) {
            case 21:
                ((ji.k0) this.f772b).i();
                ((ji.j0) this.f773c).R0();
                return;
            default:
                u5 u5Var = (u5) this.f772b;
                x5 x5Var = (x5) this.f773c;
                TL_iv.pageTableCell pagetablecell = x5Var.f13662b;
                if (pagetablecell != null) {
                    m6.d(pagetablecell, x5Var.f13661a.getText());
                }
                d3 d3Var = u5Var.E;
                if (d3Var != null && u5Var.f13123a != null) {
                    x3.P1(d3Var.f13235a);
                    return;
                }
                return;
        }
    }

    @Override
    public void run(long j10) {
        TL_keyboard.TL_inlineButtonTypeUserProfile tL_inlineButtonTypeUserProfile = new TL_keyboard.TL_inlineButtonTypeUserProfile();
        tL_inlineButtonTypeUserProfile.user_id = j10;
        ((u3) this.f772b).a((String) this.f773c, tL_inlineButtonTypeUserProfile);
    }

    @Override
    public Object then(Task task) {
        com.google.firebase.messaging.j jVar = (com.google.firebase.messaging.j) this.f772b;
        String str = (String) this.f773c;
        synchronized (jVar) {
            ((a0.f) jVar.f6190b).remove(str);
        }
        return task;
    }

    public h0(j2.a aVar, Object obj, long j10) {
        this.f771a = 19;
        this.f772b = aVar;
        this.f773c = obj;
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3) {
        ig.m mVar = (ig.m) this.f772b;
        TLRPC.Document document = (TLRPC.Document) obj2;
        Boolean bool = (Boolean) obj3;
        mVar.f11578w = false;
        AndroidUtilities.cancelRunOnUIThread(mVar.d);
        ig.i iVar = mVar.f11575n;
        mVar.f11579x = document;
        iVar.setSticker(document);
        ((r8) ((View) this.f773c)).setValueSticker(document);
        mVar.e0(true);
        return Boolean.TRUE;
    }

    @Override
    public void p0(View view, float f7, float f10) {
    }
}
