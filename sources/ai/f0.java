package ai;

import a8.me;
import android.content.Context;
import android.content.Intent;
import android.graphics.RectF;
import android.os.CancellationSignal;
import android.os.Trace;
import android.text.TextUtils;
import android.view.View;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import bi.h2;
import bi.h7;
import bi.i2;
import bi.r3;
import bi.y2;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import di.h4;
import di.o4;
import di.q4;
import di.s8;
import di.y9;
import fi.g9;
import fi.l9;
import fi.n9;
import fi.p8;
import fi.p9;
import fi.r8;
import fi.u8;
import fi.x8;
import fi.z8;
import hi.d4;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;
import li.b3;
import li.h6;
import li.i4;
import li.p5;
import li.s3;
import li.s5;
import li.v3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.ActionBar.k3;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Cells.v8;
import org.telegram.ui.Components.bm0;
import org.telegram.ui.Components.cm0;
import org.telegram.ui.Components.hu;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.wc;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.f51;
import org.telegram.ui.mc0;
import org.telegram.ui.sf1;
public final class f0 implements CameraView.CameraViewDelegate, f51, sf1, b2, OnFailureListener, jh.i, OnCompleteListener, Continuation, r8, s9.d, bm0, cm0, e2.p, e2.o, Utilities.Callback3Return, mc0, li.n0, hu, i4, m4.o0 {
    public final int f1484a;
    public final Object f1485b;
    public final Object f1486c;

    public f0(int i10, Object obj, Object obj2) {
        this.f1484a = i10;
        this.f1485b = obj;
        this.f1486c = obj2;
    }

    @Override
    public l80 a(li.g1 g1Var) {
        li.q qVar = (li.q) ((rf.b) this.f1485b).f47371c;
        l80 l80Var = new l80(qVar, (u6) this.f1486c, g1Var, false, false, true);
        qVar.H = l80Var;
        return l80Var;
    }

    @Override
    public void b(l9 l9Var, boolean z10, boolean z11, boolean z12, boolean z13, TLRPC.InputPeer inputPeer, int i10, e2.q0 q0Var, s8 s8Var) {
        boolean z14;
        switch (this.f1484a) {
            case 10:
                q4 q4Var = (q4) this.f1485b;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.f1486c;
                TL_stories.TL_stories_editStory tL_stories_editStory = new TL_stories.TL_stories_editStory();
                tL_stories_editStory.peer = MessagesController.getInstance(q4Var.f9020r2).getInputPeer(storyItem.dialogId);
                tL_stories_editStory.f22271id = storyItem.f22267id;
                tL_stories_editStory.flags |= 4;
                tL_stories_editStory.privacy_rules = l9Var.f11181b;
                ConnectionsManager.getInstance(q4Var.f9020r2).sendRequest(tL_stories_editStory, new i2(q4Var, q0Var, storyItem, l9Var, 5));
                return;
            default:
                h4 h4Var = (h4) this.f1485b;
                n9 n9Var = (n9) this.f1486c;
                q4 q4Var2 = h4Var.f8625l;
                o4 o4Var = q4Var2.D1;
                TL_stories.StoryItem storyItem2 = o4Var.f8870a;
                if (storyItem2 != null && storyItem2.pinned) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (z14 != z12) {
                    MessagesController.getInstance(q4Var2.f9020r2).getStoriesController().r0(q4Var2.f9015q1, q4Var2.f8993k1, z12, null);
                }
                TL_stories.StoryItem storyItem3 = o4Var.f8870a;
                if (storyItem3 != null) {
                    TLRPC.MessageMedia messageMedia = storyItem3.media;
                    if (messageMedia instanceof TLRPC.TL_messageMediaVideoStream) {
                        TLRPC.InputGroupCall inputGroupCall = ((TLRPC.TL_messageMediaVideoStream) messageMedia).call;
                        TL_phone.toggleGroupCallSettings togglegroupcallsettings = new TL_phone.toggleGroupCallSettings();
                        togglegroupcallsettings.call = inputGroupCall;
                        togglegroupcallsettings.messages_enabled = Boolean.valueOf(z10);
                        togglegroupcallsettings.send_paid_messages_stars = Long.valueOf(i10);
                        ConnectionsManager.getInstance(q4Var2.f9020r2).sendRequest(togglegroupcallsettings, new bi.j(9, h4Var, n9Var));
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public boolean c(int i10, View view) {
        return d4.A0((d4) this.f1485b, (Context) this.f1486c, view, i10);
    }

    @Override
    public boolean c1(View view) {
        return false;
    }

    @Override
    public void d(org.telegram.tgnet.TLRPC.MessageMedia r1, int r2, boolean r3, int r4, long r5) {
        throw new UnsupportedOperationException("Method not decompiled: ai.f0.d(org.telegram.tgnet.TLRPC$MessageMedia, int, boolean, int, long):void");
    }

    @Override
    public Object d1(me meVar) {
        String str = (String) this.f1485b;
        s9.a aVar = (s9.a) this.f1486c;
        try {
            Trace.beginSection(str);
            return aVar.f48021f.d1(meVar);
        } finally {
            Trace.endSection();
        }
    }

    @Override
    public void e(float f7, float f10, int i10, View view) {
        u6 u6Var;
        int i11;
        int i12;
        long clientUserId;
        u6 u6Var2;
        u6 u6Var3;
        int i13;
        u6 u6Var4;
        int i14;
        boolean z10;
        u6 u6Var5;
        int i15;
        u6 u6Var6;
        int i16;
        u6 u6Var7;
        int i17;
        int i18;
        u6 u6Var8;
        int i19;
        TLRPC.ChatParticipants chatParticipants;
        ArrayList<TLRPC.ChatParticipant> arrayList;
        int i20;
        u6 u6Var9;
        g9 g9Var = (g9) this.f1485b;
        Context context = (Context) this.f1486c;
        ArrayList arrayList2 = g9Var.L;
        a0.h hVar = g9Var.f10920b;
        z8 z8Var = g9Var.f10927x;
        ArrayList arrayList3 = g9Var.f10921c;
        HashMap hashMap = g9Var.d;
        n9 n9Var = g9Var.W;
        if (i10 >= 0 && i10 < arrayList2.size()) {
            u8 u8Var = (u8) arrayList2.get(i10);
            int i21 = u8Var.f47075a;
            int i22 = 0;
            if (i21 == 3) {
                if (u8Var.f11759n && n9Var.F) {
                    i20 = ((k3) n9Var).currentAccount;
                    boolean z11 = n9Var.K;
                    TLRPC.InputPeer inputPeer = n9Var.f11312c;
                    x8 x8Var = new x8(g9Var, 0);
                    u6Var9 = ((k3) n9Var).resourcesProvider;
                    new p8(context, i20, z11, inputPeer, x8Var, u6Var9).show();
                    return;
                }
                int i23 = u8Var.f11754i;
                if (i23 == 1) {
                    if (n9Var.N == 1 || n9.K0(n9Var).isEmpty()) {
                        n9Var.M = 1;
                        n9Var.f11310b.E(1);
                    }
                    n9Var.N = 1;
                    g9Var.f(true);
                } else if (i23 == 3) {
                    if (n9Var.N == 3 || (n9Var.f11315n.isEmpty() && n9Var.f11316r.isEmpty())) {
                        n9Var.M = 3;
                        n9Var.f11310b.E(1);
                    }
                    n9Var.N = 3;
                    g9Var.f(true);
                } else if (i23 == 2) {
                    if (n9Var.N == 2) {
                        n9Var.M = 2;
                        n9Var.f11310b.E(1);
                    }
                    n9Var.N = 2;
                    g9Var.f(true);
                } else if (i23 == 4) {
                    if (n9Var.N == 4) {
                        n9Var.M = 4;
                        n9Var.f11310b.E(1);
                    }
                    n9Var.N = 4;
                    g9Var.f(true);
                } else {
                    if (i23 > 0) {
                        arrayList3.clear();
                        hashMap.clear();
                        n9Var.N = u8Var.f11754i;
                        z8Var.d.a();
                    } else {
                        TLRPC.Chat chat = u8Var.h;
                        if (chat != null) {
                            long j10 = chat.f22028id;
                            if (n9.e1(n9Var, chat) > 200) {
                                try {
                                    g9Var.performHapticFeedback(3, 1);
                                } catch (Throwable unused) {
                                }
                                Context context2 = g9Var.getContext();
                                u6Var7 = ((k3) n9Var).resourcesProvider;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context2, 0, u6Var7);
                                alertDialog$Builder.f22369a.R = LocaleController.getString(R.string.GroupTooLarge);
                                alertDialog$Builder.f22369a.T = LocaleController.getString(R.string.GroupTooLargeMessage);
                                org.telegram.messenger.t.p(R.string.OK, alertDialog$Builder, null);
                            } else if (!hashMap.containsKey(Long.valueOf(j10))) {
                                i17 = ((k3) n9Var).currentAccount;
                                TLRPC.Chat chat2 = MessagesController.getInstance(i17).getChat(Long.valueOf(j10));
                                i18 = ((k3) n9Var).currentAccount;
                                TLRPC.ChatFull chatFull = MessagesController.getInstance(i18).getChatFull(j10);
                                if (chatFull != null && (chatParticipants = chatFull.participants) != null && (arrayList = chatParticipants.participants) != null && !arrayList.isEmpty() && chatFull.participants.participants.size() >= chatFull.participants_count - 1) {
                                    g9Var.d(j10, chatFull.participants);
                                } else {
                                    e2 e2Var = g9Var.G;
                                    if (e2Var != null) {
                                        e2Var.dismiss();
                                        g9Var.G = null;
                                    }
                                    g9Var.H = j10;
                                    Context context3 = g9Var.getContext();
                                    u6Var8 = ((k3) n9Var).resourcesProvider;
                                    e2 e2Var2 = new e2(context3, 3, u6Var8);
                                    g9Var.G = e2Var2;
                                    e2Var2.r(50L);
                                    i19 = ((k3) n9Var).currentAccount;
                                    MessagesStorage messagesStorage = MessagesStorage.getInstance(i19);
                                    messagesStorage.getStorageQueue().postRunnable(new y2(g9Var, chat2, messagesStorage, j10, 12));
                                }
                                if (!TextUtils.isEmpty(g9Var.I)) {
                                    z8Var.setText("");
                                    g9Var.I = null;
                                    g9Var.g(false);
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
                                g9Var.i(true);
                            }
                        } else {
                            TLRPC.User user = u8Var.f11753g;
                            if (user != null) {
                                if (g9Var.f10919a == 0) {
                                    n9Var.N = 0;
                                }
                                long j11 = user.f22177id;
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
                                    if (!TextUtils.isEmpty(g9Var.I)) {
                                        z8Var.setText("");
                                        g9Var.I = null;
                                        g9Var.g(false);
                                    }
                                    hVar.k(Boolean.TRUE, j11);
                                }
                                arrayList3.clear();
                                arrayList3.addAll(hashSet);
                                g9Var.i(true);
                            }
                        }
                    }
                    g9Var.f(true);
                    g9Var.e(true);
                    z8Var.L = true;
                }
            } else if (i21 == 7) {
                if (view instanceof v8) {
                    v8 v8Var = (v8) view;
                    v8Var.setChecked(!v8Var.d());
                    u8Var.f11756k = v8Var.d();
                    int i24 = u8Var.f11751c;
                    if (i24 == 0) {
                        boolean d = v8Var.d();
                        n9Var.f11319x = d;
                        if (n9Var.N == 4) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (d) {
                            h3 h3Var = n9Var.container;
                            u6Var6 = ((k3) n9Var).resourcesProvider;
                            wc wcVar = new wc(h3Var, u6Var6);
                            int i25 = R.raw.ic_save_to_gallery;
                            if (z10) {
                                i16 = R.string.StoryEnabledScreenshotsShare;
                            } else {
                                i16 = R.string.StoryEnabledScreenshots;
                            }
                            qc G = wcVar.G(i25, 4, LocaleController.getString(i16));
                            G.f31861j = 5000;
                            G.k(true);
                            return;
                        }
                        h3 h3Var2 = n9Var.container;
                        u6Var5 = ((k3) n9Var).resourcesProvider;
                        wc wcVar2 = new wc(h3Var2, u6Var5);
                        int i26 = R.raw.passcode_lock_close;
                        if (z10) {
                            i15 = R.string.StoryDisabledScreenshotsShare;
                        } else {
                            i15 = R.string.StoryDisabledScreenshots;
                        }
                        qc G2 = wcVar2.G(i26, 4, LocaleController.getString(i15));
                        G2.f31861j = 5000;
                        G2.k(true);
                    } else if (i24 == 1) {
                        boolean d10 = v8Var.d();
                        n9Var.f11320y = d10;
                        boolean z12 = n9Var.f11312c instanceof TLRPC.TL_inputPeerChannel;
                        if (d10) {
                            h3 h3Var3 = n9Var.container;
                            u6Var4 = ((k3) n9Var).resourcesProvider;
                            wc wcVar3 = new wc(h3Var3, u6Var4);
                            int i27 = R.raw.msg_story_keep;
                            if (z12) {
                                i14 = R.string.StoryChannelEnableKeep;
                            } else {
                                i14 = R.string.StoryEnableKeep;
                            }
                            qc G3 = wcVar3.G(i27, 4, LocaleController.getString(i14));
                            G3.f31861j = 5000;
                            G3.k(true);
                        } else {
                            h3 h3Var4 = n9Var.container;
                            u6Var3 = ((k3) n9Var).resourcesProvider;
                            wc wcVar4 = new wc(h3Var4, u6Var3);
                            int i28 = R.raw.fire_on;
                            if (z12) {
                                i13 = R.string.StoryChannelDisableKeep;
                            } else {
                                i13 = R.string.StoryDisableKeep;
                            }
                            qc G4 = wcVar4.G(i28, 4, LocaleController.getString(i13));
                            G4.f31861j = 5000;
                            G4.k(true);
                        }
                        g9Var.g(true);
                    } else if (i24 == 2) {
                        n9Var.f11318w = v8Var.d();
                        g9Var.g(true);
                    }
                }
            } else if (i21 == 9) {
                int i29 = u8Var.f11762q;
                if (i29 == 0) {
                    p9 p9Var = n9Var.f11313c0;
                    if (p9Var != null) {
                        p9Var.run();
                    }
                } else if (i29 == 1) {
                    TLRPC.InputPeer inputPeer2 = n9Var.f11312c;
                    if (inputPeer2 == null) {
                        i12 = ((k3) n9Var).currentAccount;
                        clientUserId = UserConfig.getInstance(i12).getClientUserId();
                    } else {
                        clientUserId = DialogObject.getPeerDialogId(inputPeer2);
                    }
                    u6Var2 = ((k3) n9Var).resourcesProvider;
                    l80 F = l80.F(g9Var, u6Var2, view);
                    F.c(R.drawable.msg_addfolder, LocaleController.getString(R.string.StoriesAlbumNewAlbum), new r3(g9Var, clientUserId, 7), false);
                    F.k();
                    l80.f(F, n9Var.j1().B(clientUserId, true), n9Var.v, false, null, new n1(12, g9Var, F));
                    F.Z();
                } else if (i29 == 5) {
                    Context context4 = g9Var.getContext();
                    u6Var = ((k3) n9Var).resourcesProvider;
                    e2 e2Var3 = new e2(context4, 3, u6Var);
                    e2Var3.r(500L);
                    TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = new TL_phone.getGroupCallStreamRtmpUrl();
                    getgroupcallstreamrtmpurl.live_story = true;
                    TLRPC.InputPeer inputPeer3 = n9Var.f11312c;
                    if (inputPeer3 == null) {
                        inputPeer3 = new TLRPC.TL_inputPeerSelf();
                    }
                    getgroupcallstreamrtmpurl.peer = inputPeer3;
                    i11 = ((k3) n9Var).currentAccount;
                    ConnectionsManager.getInstance(i11).sendRequest(getgroupcallstreamrtmpurl, new h2(g9Var, e2Var3, getgroupcallstreamrtmpurl));
                } else if (i29 == 6) {
                    n9Var.G = false;
                    g9Var.g(true);
                }
            }
        }
    }

    @Override
    public void f(Object obj, b2.v vVar) {
        ((j2.b) obj).e((b2.g1) this.f1486c, new n4.s(vVar, ((j2.e) this.f1485b).e));
    }

    @Override
    public void g() {
        switch (this.f1484a) {
            case 25:
                ((li.j0) this.f1485b).i();
                ((li.i0) this.f1486c).a0();
                return;
            default:
                p5 p5Var = (p5) this.f1485b;
                s5 s5Var = (s5) this.f1486c;
                TL_iv.pageTableCell pagetablecell = s5Var.f17475b;
                if (pagetablecell != null) {
                    h6.d(pagetablecell, s5Var.f17474a.getText());
                }
                b3 b3Var = p5Var.E;
                if (b3Var != null && p5Var.f17652a != null) {
                    v3.U1(b3Var.f17153a);
                    return;
                }
                return;
        }
    }

    @Override
    public void h(e2 e2Var, int i10) {
        switch (this.f1484a) {
            case 4:
                h7.J0((h7) this.f1485b, (vg.n1) this.f1486c, e2Var, i10);
                return;
            case 12:
                h4 h4Var = (h4) this.f1485b;
                di.h1 h1Var = ((y9) this.f1486c).A0;
                if (h1Var != null) {
                    if (!h1Var.f8610w) {
                        TL_phone.discardGroupCall discardgroupcall = new TL_phone.discardGroupCall();
                        discardgroupcall.call = h1Var.f8606f;
                        ConnectionsManager.getInstance(h1Var.e).sendRequest(discardgroupcall, new di.z0(h1Var, 4));
                        h1Var.e();
                        return;
                    }
                    return;
                }
                q4.d0(h4Var.f8625l);
                return;
            case 15:
                d4.x0((d4) this.f1485b, (TL_payments.connectedBotStarRef) this.f1486c);
                return;
            case 17:
                ig.j1 j1Var = (ig.j1) this.f1485b;
                j1Var.getClass();
                ((boolean[]) this.f1486c)[0] = true;
                j1Var.Q();
                return;
            default:
                jg.z.d(r4.currentAccount).a((jg.w) this.f1485b, ((TL_account.TL_businessChatLink) this.f1486c).link);
                return;
        }
    }

    @Override
    public void i(m4.w wVar) {
        switch (this.f1484a) {
            case 28:
                ((m4.e) this.f1486c).f(((m4.p0) this.f1485b).f18180g.f18056t);
                return;
            default:
                m4.p0 p0Var = (m4.p0) this.f1485b;
                p0Var.getClass();
                String str = ((n4.h) this.f1486c).f18662a;
                if (TextUtils.isEmpty(str)) {
                    e2.a.l("MediaSessionLegacyStub", "onRemoveQueueItem(): Media ID shouldn't be null");
                    return;
                }
                m4.n1 n1Var = p0Var.f18180g.f18056t;
                if (!n1Var.o0(17)) {
                    e2.a.l("MediaSessionLegacyStub", "Can't remove item by ID without COMMAND_GET_TIMELINE being available");
                    return;
                }
                b2.p1 y02 = n1Var.y0();
                b2.o1 o1Var = new b2.o1();
                for (int i10 = 0; i10 < y02.o(); i10++) {
                    if (TextUtils.equals(y02.m(i10, o1Var, 0L).f3327c.f3344a, str)) {
                        n1Var.Q(i10);
                        return;
                    }
                }
                return;
        }
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f1484a) {
            case 19:
                ((j2.b) obj).d((j2.a) this.f1485b, (u2.c0) this.f1486c);
                return;
            default:
                ((j2.b) obj).onRenderedFirstFrame((j2.a) this.f1485b);
                return;
        }
    }

    @Override
    public void j(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((bi.y) this.f1485b).q0(false, 0L, tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.f1486c);
    }

    @Override
    public void k(RectF rectF, View view) {
        ((eh.d) this.f1485b).i(rectF.left, rectF.top);
        View view2 = (View) ((WeakReference) this.f1486c).get();
        if (view2 != null) {
            view2.invalidate();
        }
    }

    @Override
    public void onCameraInit() {
        o0 o0Var = (o0) this.f1485b;
        ((CameraView) this.f1486c).animate().alpha(1.0f).setDuration(180L).start();
        if (!o0Var.V && !o0Var.f1592h0 && !o0Var.f1596l0) {
            o0Var.f1592h0 = true;
            o0Var.f1591g0.postDelayed(o0Var.f1614y0, 150L);
        }
    }

    @Override
    public void onComplete(Task task) {
        ((com.google.firebase.messaging.g) this.f1485b).a((Intent) this.f1486c);
    }

    @Override
    public void onFailure(Exception e) {
        String str;
        w0.i gVar;
        String str2;
        w0.d cVar;
        switch (this.f1484a) {
            case 5:
                c1.e eVar = (c1.e) this.f1485b;
                CancellationSignal cancellationSignal = (CancellationSignal) this.f1486c;
                kotlin.jvm.internal.i.e(e, "e");
                if ((e instanceof com.google.android.gms.common.api.f) && b1.d.f3110b.contains(Integer.valueOf(((com.google.android.gms.common.api.f) e).getStatusCode()))) {
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
                d1.e eVar2 = (d1.e) this.f1485b;
                CancellationSignal cancellationSignal2 = (CancellationSignal) this.f1486c;
                kotlin.jvm.internal.i.e(e, "e");
                if ((e instanceof com.google.android.gms.common.api.f) && b1.d.f3110b.contains(Integer.valueOf(((com.google.android.gms.common.api.f) e).getStatusCode()))) {
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
                    Executor executor = eVar2.f7833g;
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
    public void run(long j10) {
        TL_keyboard.TL_inlineButtonTypeUserProfile tL_inlineButtonTypeUserProfile = new TL_keyboard.TL_inlineButtonTypeUserProfile();
        tL_inlineButtonTypeUserProfile.user_id = j10;
        ((s3) this.f1485b).a((String) this.f1486c, tL_inlineButtonTypeUserProfile);
    }

    @Override
    public Object then(Task task) {
        com.google.firebase.messaging.i iVar = (com.google.firebase.messaging.i) this.f1485b;
        String str = (String) this.f1486c;
        synchronized (iVar) {
            ((a0.f) iVar.f7744b).remove(str);
        }
        return task;
    }

    public f0(j2.a aVar, Object obj, long j10) {
        this.f1484a = 20;
        this.f1485b = aVar;
        this.f1486c = obj;
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3) {
        jg.n nVar = (jg.n) this.f1485b;
        TLRPC.Document document = (TLRPC.Document) obj2;
        Boolean bool = (Boolean) obj3;
        nVar.f15783w = false;
        AndroidUtilities.cancelRunOnUIThread(nVar.e);
        jg.j jVar = nVar.f15780n;
        nVar.f15784x = document;
        jVar.setSticker(document);
        ((v8) ((View) this.f1486c)).setValueSticker(document);
        nVar.f0(true);
        return Boolean.TRUE;
    }

    @Override
    public void l0(View view, float f7, float f10) {
    }
}
