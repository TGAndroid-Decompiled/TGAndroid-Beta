package ah;

import ai.k7;
import ai.o2;
import ai.q2;
import ai.r3;
import ai.y2;
import android.content.Context;
import android.content.Intent;
import android.graphics.RectF;
import android.os.CancellationSignal;
import android.os.Trace;
import android.text.TextUtils;
import android.view.View;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import b2.n1;
import b2.o1;
import b2.p1;
import b2.q1;
import b2.s1;
import b2.t1;
import ci.aa;
import ci.h4;
import ci.o4;
import ci.q4;
import com.google.android.gms.internal.cast.z5;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import e9.m2;
import ei.b9;
import ei.d9;
import ei.k9;
import ei.p6;
import ei.p9;
import ei.r9;
import ei.t8;
import ei.t9;
import ei.v8;
import ei.y8;
import gi.u3;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;
import ki.c3;
import ki.g6;
import ki.i4;
import ki.o5;
import ki.r5;
import ki.t3;
import ki.w3;
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
import org.telegram.ui.ActionBar.d3;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.Cells.q8;
import org.telegram.ui.Components.gu;
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.xl0;
import org.telegram.ui.Components.yl0;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.jf1;
import org.telegram.ui.kc0;
import org.telegram.ui.z41;
public final class h0 implements z41, jf1, a2, ih.h, OnFailureListener, v8, OnCompleteListener, Continuation, r9.d, xl0, yl0, Utilities.Callback3Return, kc0, e2.p, e2.o, ki.o0, gu, i4, m4.o0, e2.j {
    public final int f773a;
    public final Object f774b;
    public final Object f775c;

    public h0(int i10, Object obj, Object obj2) {
        this.f773a = i10;
        this.f774b = obj;
        this.f775c = obj2;
    }

    @Override
    public void F() {
        switch (this.f773a) {
            case 23:
                ((ki.k0) this.f774b).i();
                ((ki.j0) this.f775c).W();
                return;
            default:
                o5 o5Var = (o5) this.f774b;
                r5 r5Var = (r5) this.f775c;
                TL_iv.pageTableCell pagetablecell = r5Var.f15493b;
                if (pagetablecell != null) {
                    g6.d(pagetablecell, r5Var.f15492a.getText());
                }
                c3 c3Var = o5Var.E;
                if (c3Var != null && o5Var.f15112a != null) {
                    w3.P1(c3Var.f15176a);
                    return;
                }
                return;
        }
    }

    @Override
    public boolean P0(View view) {
        return false;
    }

    @Override
    public boolean a(int i10, View view) {
        return u3.C0((u3) this.f774b, (Context) this.f775c, view, i10);
    }

    @Override
    public void accept(Object obj) {
        switch (this.f773a) {
            case 28:
                m4.i1 i1Var = (m4.i1) this.f774b;
                t1 t1Var = (t1) this.f775c;
                m4.m1 m1Var = (m4.m1) obj;
                i1Var.getClass();
                e9.q0 q0Var = t1Var.H;
                if (!q0Var.isEmpty()) {
                    s1 c10 = t1Var.a().c();
                    m2 it = q0Var.values().iterator();
                    while (it.hasNext()) {
                        q1 q1Var = (q1) it.next();
                        p1 p1Var = (p1) i1Var.d.f8529n.get(q1Var.f3931a.f3905b);
                        if (p1Var != null && q1Var.f3931a.f3904a == p1Var.f3904a) {
                            c10.a(new q1(p1Var, q1Var.f3932b));
                        } else {
                            c10.a(q1Var);
                        }
                    }
                    t1Var = c10.b();
                }
                m1Var.p(t1Var);
                return;
            default:
                m4.v vVar = (m4.v) this.f775c;
                m4.m1 m1Var2 = (m4.m1) obj;
                m4.f0 f0Var = (m4.f0) ((m4.i1) this.f774b).f16564a.get();
                if (f0Var != null && !f0Var.j()) {
                    f0Var.g(vVar, false);
                    return;
                }
                return;
        }
    }

    @Override
    public void b(org.telegram.tgnet.TLRPC.MessageMedia r1, int r2, boolean r3, int r4, long r5) {
        throw new UnsupportedOperationException("Method not decompiled: ah.h0.b(org.telegram.tgnet.TLRPC$MessageMedia, int, boolean, int, long):void");
    }

    @Override
    public void c(Object obj, b2.u uVar) {
        ((j2.b) obj).d((b2.f1) this.f775c, new qf.b(uVar, ((j2.f) this.f774b).e));
    }

    @Override
    public void d(float f7, float f10, int i10, View view) {
        d6 d6Var;
        int i11;
        int i12;
        long clientUserId;
        d6 d6Var2;
        d6 d6Var3;
        int i13;
        d6 d6Var4;
        int i14;
        boolean z10;
        d6 d6Var5;
        int i15;
        d6 d6Var6;
        int i16;
        d6 d6Var7;
        int i17;
        int i18;
        d6 d6Var8;
        int i19;
        TLRPC.ChatParticipants chatParticipants;
        ArrayList<TLRPC.ChatParticipant> arrayList;
        int i20;
        d6 d6Var9;
        k9 k9Var = (k9) this.f774b;
        Context context = (Context) this.f775c;
        ArrayList arrayList2 = k9Var.L;
        a0.h hVar = k9Var.f9329b;
        d9 d9Var = k9Var.f9336x;
        ArrayList arrayList3 = k9Var.f9330c;
        HashMap hashMap = k9Var.d;
        r9 r9Var = k9Var.W;
        if (i10 >= 0 && i10 < arrayList2.size()) {
            y8 y8Var = (y8) arrayList2.get(i10);
            int i21 = y8Var.f44334a;
            int i22 = 0;
            if (i21 == 3) {
                if (y8Var.f10146n && r9Var.F) {
                    i20 = ((f3) r9Var).currentAccount;
                    boolean z11 = r9Var.K;
                    TLRPC.InputPeer inputPeer = r9Var.f9749c;
                    b9 b9Var = new b9(k9Var, 0);
                    d6Var9 = ((f3) r9Var).resourcesProvider;
                    new t8(context, i20, z11, inputPeer, b9Var, d6Var9).show();
                    return;
                }
                int i23 = y8Var.f10141i;
                if (i23 == 1) {
                    if (r9Var.N == 1 || r9.K0(r9Var).isEmpty()) {
                        r9Var.M = 1;
                        r9Var.f9747b.D(1);
                    }
                    r9Var.N = 1;
                    k9Var.f(true);
                } else if (i23 == 3) {
                    if (r9Var.N == 3 || (r9Var.f9752n.isEmpty() && r9Var.f9753r.isEmpty())) {
                        r9Var.M = 3;
                        r9Var.f9747b.D(1);
                    }
                    r9Var.N = 3;
                    k9Var.f(true);
                } else if (i23 == 2) {
                    if (r9Var.N == 2) {
                        r9Var.M = 2;
                        r9Var.f9747b.D(1);
                    }
                    r9Var.N = 2;
                    k9Var.f(true);
                } else if (i23 == 4) {
                    if (r9Var.N == 4) {
                        r9Var.M = 4;
                        r9Var.f9747b.D(1);
                    }
                    r9Var.N = 4;
                    k9Var.f(true);
                } else {
                    if (i23 > 0) {
                        arrayList3.clear();
                        hashMap.clear();
                        r9Var.N = y8Var.f10141i;
                        d9Var.f9563c.a();
                    } else {
                        TLRPC.Chat chat = y8Var.h;
                        if (chat != null) {
                            long j10 = chat.f20279id;
                            if (r9.e1(r9Var, chat) > 200) {
                                try {
                                    k9Var.performHapticFeedback(3, 1);
                                } catch (Throwable unused) {
                                }
                                Context context2 = k9Var.getContext();
                                d6Var7 = ((f3) r9Var).resourcesProvider;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context2, 0, d6Var7);
                                alertDialog$Builder.f20608a.R = LocaleController.getString(R.string.GroupTooLarge);
                                alertDialog$Builder.f20608a.T = LocaleController.getString(R.string.GroupTooLargeMessage);
                                org.telegram.messenger.g0.p(R.string.OK, alertDialog$Builder, null);
                            } else if (!hashMap.containsKey(Long.valueOf(j10))) {
                                i17 = ((f3) r9Var).currentAccount;
                                TLRPC.Chat chat2 = MessagesController.getInstance(i17).getChat(Long.valueOf(j10));
                                i18 = ((f3) r9Var).currentAccount;
                                TLRPC.ChatFull chatFull = MessagesController.getInstance(i18).getChatFull(j10);
                                if (chatFull != null && (chatParticipants = chatFull.participants) != null && (arrayList = chatParticipants.participants) != null && !arrayList.isEmpty() && chatFull.participants.participants.size() >= chatFull.participants_count - 1) {
                                    k9Var.d(j10, chatFull.participants);
                                } else {
                                    b2 b2Var = k9Var.G;
                                    if (b2Var != null) {
                                        b2Var.dismiss();
                                        k9Var.G = null;
                                    }
                                    k9Var.H = j10;
                                    Context context3 = k9Var.getContext();
                                    d6Var8 = ((f3) r9Var).resourcesProvider;
                                    b2 b2Var2 = new b2(context3, 3, d6Var8);
                                    k9Var.G = b2Var2;
                                    b2Var2.q(50L);
                                    i19 = ((f3) r9Var).currentAccount;
                                    MessagesStorage messagesStorage = MessagesStorage.getInstance(i19);
                                    messagesStorage.getStorageQueue().postRunnable(new ai.b2(k9Var, chat2, messagesStorage, j10, 12));
                                }
                                if (!TextUtils.isEmpty(k9Var.I)) {
                                    d9Var.setText("");
                                    k9Var.I = null;
                                    k9Var.g(false);
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
                                k9Var.i(true);
                            }
                        } else {
                            TLRPC.User user = y8Var.f10140g;
                            if (user != null) {
                                if (k9Var.f9328a == 0) {
                                    r9Var.N = 0;
                                }
                                long j11 = user.f20426id;
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
                                    if (!TextUtils.isEmpty(k9Var.I)) {
                                        d9Var.setText("");
                                        k9Var.I = null;
                                        k9Var.g(false);
                                    }
                                    hVar.k(Boolean.TRUE, j11);
                                }
                                arrayList3.clear();
                                arrayList3.addAll(hashSet);
                                k9Var.i(true);
                            }
                        }
                    }
                    k9Var.f(true);
                    k9Var.e(true);
                    d9Var.K = true;
                }
            } else if (i21 == 7) {
                if (view instanceof q8) {
                    q8 q8Var = (q8) view;
                    q8Var.setChecked(!q8Var.b());
                    y8Var.f10143k = q8Var.b();
                    int i24 = y8Var.f10138c;
                    if (i24 == 0) {
                        boolean b10 = q8Var.b();
                        r9Var.f9756x = b10;
                        if (r9Var.N == 4) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (b10) {
                            d3 d3Var = r9Var.container;
                            d6Var6 = ((f3) r9Var).resourcesProvider;
                            xc xcVar = new xc(d3Var, d6Var6);
                            int i25 = R.raw.ic_save_to_gallery;
                            if (z10) {
                                i16 = R.string.StoryEnabledScreenshotsShare;
                            } else {
                                i16 = R.string.StoryEnabledScreenshots;
                            }
                            qc G = xcVar.G(i25, 4, LocaleController.getString(i16));
                            G.f29645j = 5000;
                            G.k(true);
                            return;
                        }
                        d3 d3Var2 = r9Var.container;
                        d6Var5 = ((f3) r9Var).resourcesProvider;
                        xc xcVar2 = new xc(d3Var2, d6Var5);
                        int i26 = R.raw.passcode_lock_close;
                        if (z10) {
                            i15 = R.string.StoryDisabledScreenshotsShare;
                        } else {
                            i15 = R.string.StoryDisabledScreenshots;
                        }
                        qc G2 = xcVar2.G(i26, 4, LocaleController.getString(i15));
                        G2.f29645j = 5000;
                        G2.k(true);
                    } else if (i24 == 1) {
                        boolean b11 = q8Var.b();
                        r9Var.f9757y = b11;
                        boolean z12 = r9Var.f9749c instanceof TLRPC.TL_inputPeerChannel;
                        if (b11) {
                            d3 d3Var3 = r9Var.container;
                            d6Var4 = ((f3) r9Var).resourcesProvider;
                            xc xcVar3 = new xc(d3Var3, d6Var4);
                            int i27 = R.raw.msg_story_keep;
                            if (z12) {
                                i14 = R.string.StoryChannelEnableKeep;
                            } else {
                                i14 = R.string.StoryEnableKeep;
                            }
                            qc G3 = xcVar3.G(i27, 4, LocaleController.getString(i14));
                            G3.f29645j = 5000;
                            G3.k(true);
                        } else {
                            d3 d3Var4 = r9Var.container;
                            d6Var3 = ((f3) r9Var).resourcesProvider;
                            xc xcVar4 = new xc(d3Var4, d6Var3);
                            int i28 = R.raw.fire_on;
                            if (z12) {
                                i13 = R.string.StoryChannelDisableKeep;
                            } else {
                                i13 = R.string.StoryDisableKeep;
                            }
                            qc G4 = xcVar4.G(i28, 4, LocaleController.getString(i13));
                            G4.f29645j = 5000;
                            G4.k(true);
                        }
                        k9Var.g(true);
                    } else if (i24 == 2) {
                        r9Var.f9755w = q8Var.b();
                        k9Var.g(true);
                    }
                }
            } else if (i21 == 9) {
                int i29 = y8Var.f10149q;
                if (i29 == 0) {
                    t9 t9Var = r9Var.f9750c0;
                    if (t9Var != null) {
                        t9Var.run();
                    }
                } else if (i29 == 1) {
                    TLRPC.InputPeer inputPeer2 = r9Var.f9749c;
                    if (inputPeer2 == null) {
                        i12 = ((f3) r9Var).currentAccount;
                        clientUserId = UserConfig.getInstance(i12).getClientUserId();
                    } else {
                        clientUserId = DialogObject.getPeerDialogId(inputPeer2);
                    }
                    d6Var2 = ((f3) r9Var).resourcesProvider;
                    i80 F = i80.F(k9Var, d6Var2, view);
                    F.c(R.drawable.msg_addfolder, LocaleController.getString(R.string.StoriesAlbumNewAlbum), new r3(k9Var, clientUserId, 7), false);
                    F.k();
                    i80.f(F, r9Var.j1().B(clientUserId, true), r9Var.v, false, null, new o2(11, k9Var, F));
                    F.Z();
                } else if (i29 == 5) {
                    Context context4 = k9Var.getContext();
                    d6Var = ((f3) r9Var).resourcesProvider;
                    b2 b2Var3 = new b2(context4, 3, d6Var);
                    b2Var3.q(500L);
                    TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = new TL_phone.getGroupCallStreamRtmpUrl();
                    getgroupcallstreamrtmpurl.live_story = true;
                    TLRPC.InputPeer inputPeer3 = r9Var.f9749c;
                    if (inputPeer3 == null) {
                        inputPeer3 = new TLRPC.TL_inputPeerSelf();
                    }
                    getgroupcallstreamrtmpurl.peer = inputPeer3;
                    i11 = ((f3) r9Var).currentAccount;
                    ConnectionsManager.getInstance(i11).sendRequest(getgroupcallstreamrtmpurl, new q2(k9Var, b2Var3, getgroupcallstreamrtmpurl));
                } else if (i29 == 6) {
                    r9Var.G = false;
                    k9Var.g(true);
                }
            }
        }
    }

    @Override
    public void e(p9 p9Var, boolean z10, boolean z11, boolean z12, boolean z13, TLRPC.InputPeer inputPeer, int i10, p6 p6Var, com.google.firebase.messaging.s sVar) {
        boolean z14;
        switch (this.f773a) {
            case 5:
                q4 q4Var = (q4) this.f774b;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.f775c;
                TL_stories.TL_stories_editStory tL_stories_editStory = new TL_stories.TL_stories_editStory();
                tL_stories_editStory.peer = MessagesController.getInstance(q4Var.C2).getInputPeer(storyItem.dialogId);
                tL_stories_editStory.f20517id = storyItem.f20513id;
                tL_stories_editStory.flags |= 4;
                tL_stories_editStory.privacy_rules = p9Var.f9603b;
                ConnectionsManager.getInstance(q4Var.C2).sendRequest(tL_stories_editStory, new y2(q4Var, p6Var, storyItem, p9Var, 5));
                return;
            default:
                h4 h4Var = (h4) this.f774b;
                r9 r9Var = (r9) this.f775c;
                q4 q4Var2 = h4Var.f5464l;
                o4 o4Var = q4Var2.O1;
                TL_stories.StoryItem storyItem2 = o4Var.f5691a;
                if (storyItem2 != null && storyItem2.pinned) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (z14 != z12) {
                    MessagesController.getInstance(q4Var2.C2).getStoriesController().o0(q4Var2.B1, q4Var2.f5830v1, z12, null);
                }
                TL_stories.StoryItem storyItem3 = o4Var.f5691a;
                if (storyItem3 != null) {
                    TLRPC.MessageMedia messageMedia = storyItem3.media;
                    if (messageMedia instanceof TLRPC.TL_messageMediaVideoStream) {
                        TLRPC.InputGroupCall inputGroupCall = ((TLRPC.TL_messageMediaVideoStream) messageMedia).call;
                        TL_phone.toggleGroupCallSettings togglegroupcallsettings = new TL_phone.toggleGroupCallSettings();
                        togglegroupcallsettings.call = inputGroupCall;
                        togglegroupcallsettings.messages_enabled = Boolean.valueOf(z10);
                        togglegroupcallsettings.send_paid_messages_stars = Long.valueOf(i10);
                        ConnectionsManager.getInstance(q4Var2.C2).sendRequest(togglegroupcallsettings, new ai.g(8, h4Var, r9Var));
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public void f(m4.v vVar) {
        switch (this.f773a) {
            case 26:
                ((m4.d) this.f775c).f(((m4.p0) this.f774b).f16662g.f16535t);
                return;
            default:
                m4.p0 p0Var = (m4.p0) this.f774b;
                p0Var.getClass();
                String str = ((n4.h) this.f775c).f17095a;
                if (TextUtils.isEmpty(str)) {
                    e2.a.l("MediaSessionLegacyStub", "onRemoveQueueItem(): Media ID shouldn't be null");
                    return;
                }
                m4.m1 m1Var = p0Var.f16662g.f16535t;
                if (!m1Var.o0(17)) {
                    e2.a.l("MediaSessionLegacyStub", "Can't remove item by ID without COMMAND_GET_TIMELINE being available");
                    return;
                }
                o1 y02 = m1Var.y0();
                n1 n1Var = new n1();
                for (int i10 = 0; i10 < y02.o(); i10++) {
                    if (TextUtils.equals(y02.m(i10, n1Var, 0L).f3873c.f3890a, str)) {
                        m1Var.Q(i10);
                        return;
                    }
                }
                return;
        }
    }

    @Override
    public void g(b2 b2Var, int i10) {
        switch (this.f773a) {
            case 2:
                k7.f1((k7) this.f774b, (ug.m1) this.f775c, b2Var, i10);
                return;
            case 7:
                h4 h4Var = (h4) this.f774b;
                ci.h1 h1Var = ((aa) this.f775c).A0;
                if (h1Var != null) {
                    if (!h1Var.f5450w) {
                        TL_phone.discardGroupCall discardgroupcall = new TL_phone.discardGroupCall();
                        discardgroupcall.call = h1Var.f5446f;
                        ConnectionsManager.getInstance(h1Var.e).sendRequest(discardgroupcall, new ci.z0(h1Var, 4));
                        h1Var.e();
                        return;
                    }
                    return;
                }
                q4.f0(h4Var.f5464l);
                return;
            case 13:
                u3.z0((u3) this.f774b, (TL_payments.connectedBotStarRef) this.f775c);
                return;
            case 15:
                hg.j1 j1Var = (hg.j1) this.f774b;
                j1Var.getClass();
                ((boolean[]) this.f775c)[0] = true;
                j1Var.Q();
                return;
            default:
                ig.y.d(r4.currentAccount).a((ig.v) this.f774b, ((TL_account.TL_businessChatLink) this.f775c).link);
                return;
        }
    }

    @Override
    public i80 h(ki.h1 h1Var) {
        ki.q qVar = (ki.q) ((n4.s) this.f774b).f17129c;
        i80 i80Var = new i80(qVar, (d6) this.f775c, h1Var, false, false, true);
        qVar.H = i80Var;
        return i80Var;
    }

    @Override
    public void i(RectF rectF, View view) {
        ((dh.d) this.f774b).t(rectF.left, rectF.top);
        View view2 = (View) ((WeakReference) this.f775c).get();
        if (view2 != null) {
            view2.invalidate();
        }
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f773a) {
            case 20:
                ((j2.b) obj).e((j2.a) this.f774b, (u2.b0) this.f775c);
                return;
            default:
                ((j2.b) obj).onRenderedFirstFrame((j2.a) this.f774b);
                return;
        }
    }

    @Override
    public Object j2(z5 z5Var) {
        String str = (String) this.f774b;
        r9.a aVar = (r9.a) this.f775c;
        try {
            Trace.beginSection(str);
            return aVar.f45167f.j2(z5Var);
        } finally {
            Trace.endSection();
        }
    }

    @Override
    public void k(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((ai.x) this.f774b).h0(false, 0L, tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.f775c);
    }

    @Override
    public void onComplete(Task task) {
        ((com.google.firebase.messaging.g) this.f774b).a((Intent) this.f775c);
    }

    @Override
    public void onFailure(Exception e) {
        String str;
        w0.i gVar;
        String str2;
        w0.d cVar;
        switch (this.f773a) {
            case 4:
                c1.e eVar = (c1.e) this.f774b;
                CancellationSignal cancellationSignal = (CancellationSignal) this.f775c;
                kotlin.jvm.internal.i.e(e, "e");
                if ((e instanceof com.google.android.gms.common.api.f) && b1.d.f3661b.contains(Integer.valueOf(((com.google.android.gms.common.api.f) e).getStatusCode()))) {
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
                d1.e eVar2 = (d1.e) this.f774b;
                CancellationSignal cancellationSignal2 = (CancellationSignal) this.f775c;
                kotlin.jvm.internal.i.e(e, "e");
                if ((e instanceof com.google.android.gms.common.api.f) && b1.d.f3661b.contains(Integer.valueOf(((com.google.android.gms.common.api.f) e).getStatusCode()))) {
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
                    Executor executor = eVar2.f7732g;
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
        ((t3) this.f774b).a((String) this.f775c, tL_inlineButtonTypeUserProfile);
    }

    @Override
    public Object then(Task task) {
        com.google.firebase.messaging.i iVar = (com.google.firebase.messaging.i) this.f774b;
        String str = (String) this.f775c;
        synchronized (iVar) {
            ((a0.f) iVar.f7644b).remove(str);
        }
        return task;
    }

    public h0(j2.a aVar, Object obj, long j10) {
        this.f773a = 21;
        this.f774b = aVar;
        this.f775c = obj;
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3) {
        ig.m mVar = (ig.m) this.f774b;
        TLRPC.Document document = (TLRPC.Document) obj2;
        Boolean bool = (Boolean) obj3;
        mVar.f12962w = false;
        AndroidUtilities.cancelRunOnUIThread(mVar.d);
        ig.i iVar = mVar.f12959n;
        mVar.f12963x = document;
        iVar.setSticker(document);
        ((q8) ((View) this.f775c)).setValueSticker(document);
        mVar.e0(true);
        return Boolean.TRUE;
    }

    @Override
    public void a0(View view, float f7, float f10) {
    }
}
