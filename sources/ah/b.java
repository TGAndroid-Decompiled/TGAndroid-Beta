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
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.fragment.app.a0;
import b2.k1;
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
import ci.u5;
import ci.y8;
import ci.y9;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import e2.d0;
import e9.k0;
import e9.o1;
import ei.e4;
import gg.j1;
import gg.t;
import hg.w;
import hg.z;
import ii.d3;
import ii.i1;
import ii.i6;
import ii.j4;
import ii.p0;
import ii.p5;
import ii.r;
import ii.s5;
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
import m4.b1;
import m4.c0;
import m4.c1;
import m4.g1;
import m4.l0;
import m4.m0;
import m4.r0;
import n4.y;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.v0;
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
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.s80;
import org.telegram.ui.Components.sc;
import org.telegram.ui.Components.su;
import org.telegram.ui.Components.zc;
import org.telegram.ui.dd0;
import u2.b0;
import v7.j8;
public final class b implements hh.h, h9, z1, OnFailureListener, q9.d, lm0, OnCompleteListener, Continuation, mm0, Utilities.Callback3Return, dd0, p0, su, j4, e2.n, e2.m, ki.n, l0, e2.h, b1 {
    public final int f540a;
    public final Object f541b;
    public final Object f542c;

    public b(int i10, Object obj, Object obj2) {
        this.f540a = i10;
        this.f541b = obj;
        this.f542c = obj2;
    }

    @Override
    public boolean Y0(View view) {
        return false;
    }

    @Override
    public s80 a(i1 i1Var) {
        r rVar = (r) ((pf.b) this.f541b).f45444c;
        s80 s80Var = new s80(rVar, (c6) this.f542c, i1Var, false, false, true);
        rVar.H = s80Var;
        return s80Var;
    }

    @Override
    public void accept(Object obj) {
        switch (this.f540a) {
            case 26:
                c1 c1Var = (c1) this.f541b;
                q1 q1Var = (q1) this.f542c;
                g1 g1Var = (g1) obj;
                c1Var.getClass();
                k0 k0Var = q1Var.D;
                if (!k0Var.isEmpty()) {
                    p1 c10 = q1Var.a().c();
                    o1 it = k0Var.values().iterator();
                    while (it.hasNext()) {
                        m1 m1Var = (m1) it.next();
                        l1 l1Var = (l1) c1Var.d.f8823n.get(m1Var.f3442a.f3414b);
                        if (l1Var != null && m1Var.f3442a.f3413a == l1Var.f3413a) {
                            c10.a(new m1(l1Var, m1Var.f3443b));
                        } else {
                            c10.a(m1Var);
                        }
                    }
                    q1Var = c10.b();
                }
                g1Var.q(q1Var);
                return;
            default:
                m4.r rVar = (m4.r) this.f542c;
                g1 g1Var2 = (g1) obj;
                c0 c0Var = (c0) ((c1) this.f541b).f15754a.get();
                if (c0Var != null && !c0Var.j()) {
                    c0Var.g(rVar, false);
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
        y9 y9Var = (y9) this.f541b;
        Context context = (Context) this.f542c;
        ArrayList arrayList2 = y9Var.L;
        a0.i iVar = y9Var.f6359b;
        r9 r9Var = y9Var.f6367x;
        ArrayList arrayList3 = y9Var.f6360c;
        HashMap hashMap = y9Var.d;
        fa faVar = y9Var.W;
        if (i10 >= 0 && i10 < arrayList2.size()) {
            k9 k9Var = (k9) arrayList2.get(i10);
            int i21 = k9Var.f16876a;
            int i22 = 0;
            if (i21 == 3) {
                if (k9Var.f5332n && faVar.F) {
                    i20 = ((e3) faVar).currentAccount;
                    boolean z11 = faVar.K;
                    TLRPC.InputPeer inputPeer = faVar.f5094c;
                    n9 n9Var = new n9(y9Var, 0);
                    c6Var9 = ((e3) faVar).resourcesProvider;
                    new f9(context, i20, z11, inputPeer, n9Var, c6Var9).show();
                    return;
                }
                int i23 = k9Var.f5327i;
                if (i23 == 1) {
                    if (faVar.N == 1 || fa.K0(faVar).isEmpty()) {
                        faVar.M = 1;
                        faVar.f5092b.D(1);
                    }
                    faVar.N = 1;
                    y9Var.f(true);
                } else if (i23 == 3) {
                    if (faVar.N == 3 || (faVar.f5098n.isEmpty() && faVar.f5099r.isEmpty())) {
                        faVar.M = 3;
                        faVar.f5092b.D(1);
                    }
                    faVar.N = 3;
                    y9Var.f(true);
                } else if (i23 == 2) {
                    if (faVar.N == 2) {
                        faVar.M = 2;
                        faVar.f5092b.D(1);
                    }
                    faVar.N = 2;
                    y9Var.f(true);
                } else if (i23 == 4) {
                    if (faVar.N == 4) {
                        faVar.M = 4;
                        faVar.f5092b.D(1);
                    }
                    faVar.N = 4;
                    y9Var.f(true);
                } else {
                    if (i23 > 0) {
                        arrayList3.clear();
                        hashMap.clear();
                        faVar.N = k9Var.f5327i;
                        r9Var.f4845c.a();
                    } else {
                        TLRPC.Chat chat = k9Var.h;
                        if (chat != null) {
                            long j3 = chat.f19802id;
                            if (fa.e1(faVar, chat) > 200) {
                                try {
                                    y9Var.performHapticFeedback(3, 1);
                                } catch (Throwable unused) {
                                }
                                Context context2 = y9Var.getContext();
                                c6Var7 = ((e3) faVar).resourcesProvider;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context2, 0, c6Var7);
                                alertDialog$Builder.f20141a.R = LocaleController.getString(R.string.GroupTooLarge);
                                alertDialog$Builder.f20141a.T = LocaleController.getString(R.string.GroupTooLargeMessage);
                                v0.p(R.string.OK, alertDialog$Builder, null);
                            } else if (!hashMap.containsKey(Long.valueOf(j3))) {
                                i17 = ((e3) faVar).currentAccount;
                                TLRPC.Chat chat2 = MessagesController.getInstance(i17).getChat(Long.valueOf(j3));
                                i18 = ((e3) faVar).currentAccount;
                                TLRPC.ChatFull chatFull = MessagesController.getInstance(i18).getChatFull(j3);
                                if (chatFull != null && (chatParticipants = chatFull.participants) != null && (arrayList = chatParticipants.participants) != null && !arrayList.isEmpty() && chatFull.participants.participants.size() >= chatFull.participants_count - 1) {
                                    y9Var.d(j3, chatFull.participants);
                                } else {
                                    a2 a2Var = y9Var.G;
                                    if (a2Var != null) {
                                        a2Var.dismiss();
                                        y9Var.G = null;
                                    }
                                    y9Var.H = j3;
                                    Context context3 = y9Var.getContext();
                                    c6Var8 = ((e3) faVar).resourcesProvider;
                                    a2 a2Var2 = new a2(context3, 3, c6Var8);
                                    y9Var.G = a2Var2;
                                    a2Var2.q(50L);
                                    i19 = ((e3) faVar).currentAccount;
                                    MessagesStorage messagesStorage = MessagesStorage.getInstance(i19);
                                    messagesStorage.getStorageQueue().postRunnable(new r8(y9Var, chat2, messagesStorage, j3, 4));
                                }
                                if (!TextUtils.isEmpty(y9Var.I)) {
                                    r9Var.setText("");
                                    y9Var.I = null;
                                    y9Var.g(false);
                                }
                            } else {
                                ArrayList arrayList4 = (ArrayList) hashMap.get(Long.valueOf(j3));
                                if (arrayList4 != null) {
                                    int size = arrayList4.size();
                                    while (i22 < size) {
                                        Object obj = arrayList4.get(i22);
                                        i22++;
                                        iVar.k(Boolean.FALSE, ((Long) obj).longValue());
                                    }
                                }
                                hashMap.remove(Long.valueOf(j3));
                                y9Var.i(true);
                            }
                        } else {
                            TLRPC.User user = k9Var.f5326g;
                            if (user != null) {
                                if (y9Var.f6358a == 0) {
                                    faVar.N = 0;
                                }
                                long j10 = user.f19949id;
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
            } else if (i21 == 7) {
                if (view instanceof org.telegram.ui.Cells.r8) {
                    org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
                    r8Var.setChecked(!r8Var.b());
                    k9Var.f5329k = r8Var.b();
                    int i24 = k9Var.f5323c;
                    if (i24 == 0) {
                        boolean b10 = r8Var.b();
                        faVar.f5102x = b10;
                        if (faVar.N == 4) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (b10) {
                            c3 c3Var = faVar.container;
                            c6Var6 = ((e3) faVar).resourcesProvider;
                            zc zcVar = new zc(c3Var, c6Var6);
                            int i25 = R.raw.ic_save_to_gallery;
                            if (z10) {
                                i16 = R.string.StoryEnabledScreenshotsShare;
                            } else {
                                i16 = R.string.StoryEnabledScreenshots;
                            }
                            sc G = zcVar.G(i25, 4, LocaleController.getString(i16));
                            G.f30540j = 5000;
                            G.k(true);
                            return;
                        }
                        c3 c3Var2 = faVar.container;
                        c6Var5 = ((e3) faVar).resourcesProvider;
                        zc zcVar2 = new zc(c3Var2, c6Var5);
                        int i26 = R.raw.passcode_lock_close;
                        if (z10) {
                            i15 = R.string.StoryDisabledScreenshotsShare;
                        } else {
                            i15 = R.string.StoryDisabledScreenshots;
                        }
                        sc G2 = zcVar2.G(i26, 4, LocaleController.getString(i15));
                        G2.f30540j = 5000;
                        G2.k(true);
                    } else if (i24 == 1) {
                        boolean b11 = r8Var.b();
                        faVar.f5103y = b11;
                        boolean z12 = faVar.f5094c instanceof TLRPC.TL_inputPeerChannel;
                        if (b11) {
                            c3 c3Var3 = faVar.container;
                            c6Var4 = ((e3) faVar).resourcesProvider;
                            zc zcVar3 = new zc(c3Var3, c6Var4);
                            int i27 = R.raw.msg_story_keep;
                            if (z12) {
                                i14 = R.string.StoryChannelEnableKeep;
                            } else {
                                i14 = R.string.StoryEnableKeep;
                            }
                            sc G3 = zcVar3.G(i27, 4, LocaleController.getString(i14));
                            G3.f30540j = 5000;
                            G3.k(true);
                        } else {
                            c3 c3Var4 = faVar.container;
                            c6Var3 = ((e3) faVar).resourcesProvider;
                            zc zcVar4 = new zc(c3Var4, c6Var3);
                            int i28 = R.raw.fire_on;
                            if (z12) {
                                i13 = R.string.StoryChannelDisableKeep;
                            } else {
                                i13 = R.string.StoryDisableKeep;
                            }
                            sc G4 = zcVar4.G(i28, 4, LocaleController.getString(i13));
                            G4.f30540j = 5000;
                            G4.k(true);
                        }
                        y9Var.g(true);
                    } else if (i24 == 2) {
                        faVar.f5101w = r8Var.b();
                        y9Var.g(true);
                    }
                }
            } else if (i21 == 9) {
                int i29 = k9Var.f5335q;
                if (i29 == 0) {
                    ha haVar = faVar.f5095c0;
                    if (haVar != null) {
                        haVar.run();
                    }
                } else if (i29 == 1) {
                    TLRPC.InputPeer inputPeer2 = faVar.f5094c;
                    if (inputPeer2 == null) {
                        i12 = ((e3) faVar).currentAccount;
                        clientUserId = UserConfig.getInstance(i12).getClientUserId();
                    } else {
                        clientUserId = DialogObject.getPeerDialogId(inputPeer2);
                    }
                    c6Var2 = ((e3) faVar).resourcesProvider;
                    s80 F = s80.F(y9Var, c6Var2, view);
                    F.c(R.drawable.msg_addfolder, LocaleController.getString(R.string.StoriesAlbumNewAlbum), new ai.j(y9Var, clientUserId, 5), false);
                    F.k();
                    s80.f(F, faVar.j1().B(clientUserId, true), faVar.v, false, null, new h3(5, y9Var, F));
                    F.Z();
                } else if (i29 == 5) {
                    Context context4 = y9Var.getContext();
                    c6Var = ((e3) faVar).resourcesProvider;
                    a2 a2Var3 = new a2(context4, 3, c6Var);
                    a2Var3.q(500L);
                    TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = new TL_phone.getGroupCallStreamRtmpUrl();
                    getgroupcallstreamrtmpurl.live_story = true;
                    TLRPC.InputPeer inputPeer3 = faVar.f5094c;
                    if (inputPeer3 == null) {
                        inputPeer3 = new TLRPC.TL_inputPeerSelf();
                    }
                    getgroupcallstreamrtmpurl.peer = inputPeer3;
                    i11 = ((e3) faVar).currentAccount;
                    ConnectionsManager.getInstance(i11).sendRequest(getgroupcallstreamrtmpurl, new t5(y9Var, a2Var3, getgroupcallstreamrtmpurl, 1));
                } else if (i29 == 6) {
                    faVar.G = false;
                    y9Var.g(true);
                }
            }
        }
    }

    @Override
    public boolean d(int i10, View view) {
        return e4.C0((e4) this.f541b, (Context) this.f542c, view, i10);
    }

    @Override
    public void e(Object obj, q qVar) {
        ((j2.b) obj).b((b2.b1) this.f542c, new pf.b(qVar, ((j2.f) this.f541b).f13690e));
    }

    @Override
    public void f(a2 a2Var, int i10) {
        switch (this.f540a) {
            case 3:
                w5 w5Var = (w5) this.f541b;
                d2 d2Var = ((kc) this.f542c).A0;
                if (d2Var != null) {
                    if (!d2Var.f812w) {
                        TL_phone.discardGroupCall discardgroupcall = new TL_phone.discardGroupCall();
                        discardgroupcall.call = d2Var.f808f;
                        ConnectionsManager.getInstance(d2Var.f807e).sendRequest(discardgroupcall, new ai.q1(d2Var, 4));
                        d2Var.e();
                        return;
                    }
                    return;
                }
                f6.f0(w5Var.f1858l);
                return;
            case 10:
                e4.z0((e4) this.f541b, (TL_payments.connectedBotStarRef) this.f542c);
                return;
            case 12:
                j1 j1Var = (j1) this.f541b;
                j1Var.getClass();
                ((boolean[]) this.f542c)[0] = true;
                j1Var.Q();
                return;
            default:
                z.d(r4.currentAccount).a((w) this.f541b, ((TL_account.TL_businessChatLink) this.f542c).link);
                return;
        }
    }

    @Override
    public void g(m4.r rVar) {
        switch (this.f540a) {
            case 24:
                Bundle bundle = (Bundle) this.f542c;
                c0 c0Var = ((m0) this.f541b).f15905g;
                if (bundle == null) {
                    Bundle bundle2 = Bundle.EMPTY;
                }
                c0Var.n(rVar);
                return;
            default:
                m0 m0Var = (m0) this.f541b;
                m0Var.getClass();
                String str = ((n4.m) this.f542c).f16326a;
                if (TextUtils.isEmpty(str)) {
                    e2.a.n("MediaSessionLegacyStub", "onRemoveQueueItem(): Media ID shouldn't be null");
                    return;
                }
                g1 g1Var = m0Var.f15905g.f15748t;
                if (!g1Var.n0(17)) {
                    e2.a.n("MediaSessionLegacyStub", "Can't remove item by ID without COMMAND_GET_TIMELINE being available");
                    return;
                }
                k1 w02 = g1Var.w0();
                b2.j1 j1Var = new b2.j1();
                for (int i10 = 0; i10 < w02.o(); i10++) {
                    if (TextUtils.equals(w02.m(i10, j1Var, 0L).f3379c.f3397a, str)) {
                        g1Var.R(i10);
                        return;
                    }
                }
                return;
        }
    }

    @Override
    public Object h(c0 c0Var, m4.r rVar, int i10) {
        switch (this.f540a) {
            case 28:
                b1 b1Var = (b1) this.f541b;
                r0 r0Var = (r0) this.f542c;
                if (c0Var.j()) {
                    return j8.b(new m4.m1(-100));
                }
                return d0.c0((i9.w) b1Var.h(c0Var, rVar, i10), new r5(c0Var, rVar, r0Var, 14));
            default:
                b1 b1Var2 = (b1) this.f541b;
                a1 a1Var = (a1) this.f542c;
                if (c0Var.j()) {
                    return j8.b(new m4.m1(-100));
                }
                return d0.c0((i9.w) b1Var2.h(c0Var, rVar, i10), new r5(c0Var, rVar, a1Var, 15));
        }
    }

    @Override
    public void i() {
        switch (this.f540a) {
            case 17:
                ((ii.l0) this.f541b).i();
                ((ii.k0) this.f542c).e0();
                return;
            default:
                p5 p5Var = (p5) this.f541b;
                s5 s5Var = (s5) this.f542c;
                TL_iv.pageTableCell pagetablecell = s5Var.f12693b;
                if (pagetablecell != null) {
                    i6.d(pagetablecell, s5Var.f12692a.getText());
                }
                d3 d3Var = p5Var.E;
                if (d3Var != null && p5Var.f12249a != null) {
                    x3.P1(d3Var.f12343a);
                    return;
                }
                return;
        }
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f540a) {
            case 21:
                ((j2.b) obj).e((j2.a) this.f541b, (b0) this.f542c);
                return;
            default:
                ((j2.b) obj).onRenderedFirstFrame((j2.a) this.f541b);
                return;
        }
    }

    @Override
    public void j(RectF rectF, View view) {
        ((ch.d) this.f541b).t(rectF.left, rectF.top);
        View view2 = (View) ((WeakReference) this.f542c).get();
        if (view2 != null) {
            view2.invalidate();
        }
    }

    @Override
    public void k(y yVar) {
        AndroidUtilities.runOnUIThread(new t((SpannableString) this.f541b, yVar, (fi.m0) this.f542c, 22));
    }

    @Override
    public void l(da daVar, boolean z10, boolean z11, boolean z12, boolean z13, TLRPC.InputPeer inputPeer, int i10, y8 y8Var, a0 a0Var) {
        boolean z14;
        switch (this.f540a) {
            case 1:
                f6 f6Var = (f6) this.f541b;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.f542c;
                TL_stories.TL_stories_editStory tL_stories_editStory = new TL_stories.TL_stories_editStory();
                tL_stories_editStory.peer = MessagesController.getInstance(f6Var.C2).getInputPeer(storyItem.dialogId);
                tL_stories_editStory.f20045id = storyItem.f20041id;
                tL_stories_editStory.flags |= 4;
                tL_stories_editStory.privacy_rules = daVar.f4971b;
                ConnectionsManager.getInstance(f6Var.C2).sendRequest(tL_stories_editStory, new q3(f6Var, y8Var, storyItem, daVar, 0));
                return;
            default:
                w5 w5Var = (w5) this.f541b;
                fa faVar = (fa) this.f542c;
                f6 f6Var2 = w5Var.f1858l;
                d6 d6Var = f6Var2.O1;
                TL_stories.StoryItem storyItem2 = d6Var.f820a;
                if (storyItem2 != null && storyItem2.pinned) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (z14 != z12) {
                    MessagesController.getInstance(f6Var2.C2).getStoriesController().o0(f6Var2.B1, f6Var2.f1010v1, z12, null);
                }
                TL_stories.StoryItem storyItem3 = d6Var.f820a;
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
        ((com.google.firebase.messaging.g) this.f541b).a((Intent) this.f542c);
    }

    @Override
    public void onFailure(Exception e7) {
        String str;
        w0.i gVar;
        String str2;
        w0.d cVar;
        switch (this.f540a) {
            case 4:
                c1.e eVar = (c1.e) this.f541b;
                CancellationSignal cancellationSignal = (CancellationSignal) this.f542c;
                kotlin.jvm.internal.i.e(e7, "e");
                if ((e7 instanceof com.google.android.gms.common.api.f) && b1.d.f3194b.contains(Integer.valueOf(((com.google.android.gms.common.api.f) e7).getStatusCode()))) {
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
                d1.e eVar2 = (d1.e) this.f541b;
                CancellationSignal cancellationSignal2 = (CancellationSignal) this.f542c;
                kotlin.jvm.internal.i.e(e7, "e");
                if ((e7 instanceof com.google.android.gms.common.api.f) && b1.d.f3194b.contains(Integer.valueOf(((com.google.android.gms.common.api.f) e7).getStatusCode()))) {
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
                    Executor executor = eVar2.f8043g;
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
        ((u3) this.f541b).a((String) this.f542c, tL_inlineButtonTypeUserProfile);
    }

    @Override
    public Object then(Task task) {
        com.google.firebase.messaging.j jVar = (com.google.firebase.messaging.j) this.f541b;
        String str = (String) this.f542c;
        synchronized (jVar) {
            ((a0.f) jVar.f7942b).remove(str);
        }
        return task;
    }

    @Override
    public Object x0(u5 u5Var) {
        String str = (String) this.f541b;
        q9.a aVar = (q9.a) this.f542c;
        try {
            Trace.beginSection(str);
            return aVar.f45948f.x0(u5Var);
        } finally {
            Trace.endSection();
        }
    }

    public b(j2.a aVar, Object obj, long j3) {
        this.f540a = 22;
        this.f541b = aVar;
        this.f542c = obj;
    }

    public b(m0 m0Var, m4.i1 i1Var, Bundle bundle) {
        this.f540a = 24;
        this.f541b = m0Var;
        this.f542c = bundle;
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3) {
        hg.n nVar = (hg.n) this.f541b;
        TLRPC.Document document = (TLRPC.Document) obj2;
        Boolean bool = (Boolean) obj3;
        nVar.f11322w = false;
        AndroidUtilities.cancelRunOnUIThread(nVar.d);
        hg.j jVar = nVar.f11319n;
        nVar.f11323x = document;
        jVar.setSticker(document);
        ((org.telegram.ui.Cells.r8) ((View) this.f542c)).setValueSticker(document);
        nVar.e0(true);
        return Boolean.TRUE;
    }

    @Override
    public void n0(View view, float f7, float f10) {
    }
}
