package ai;

import android.content.Context;
import android.graphics.RectF;
import android.os.CancellationSignal;
import android.os.Trace;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import b8.ke;
import ci.e9;
import com.google.android.gms.tasks.OnFailureListener;
import ei.r9;
import gi.a8;
import gi.d8;
import gi.f8;
import gi.o8;
import gi.r8;
import gi.t8;
import gi.v7;
import gi.v8;
import gi.x7;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;
import org.telegram.messenger.bd;
import org.telegram.messenger.camera.CameraView;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.q10;
import org.telegram.messenger.qr;
import org.telegram.messenger.s10;
import org.telegram.messenger.u10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Cells.l8;
import org.telegram.ui.Components.ac;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.gj0;
import org.telegram.ui.Components.hj0;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.vp0;
import org.telegram.ui.Components.vs;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.ca1;
import org.telegram.ui.h01;
import org.telegram.ui.ia0;
import org.telegram.ui.ll0;
import org.telegram.ui.rw;
public final class n implements org.telegram.ui.ActionBar.p1, ci.s4, s10, gj0, t9.d, CameraView.CameraViewDelegate, OnFailureListener, ca1, h01, kh.i, x7, hj0, g2.q, g2.p, q10, ia0, mi.n0, vs {
    public final int f828a;
    public final Object f829b;
    public final Object f830c;

    public n(int i3, Object obj, Object obj2) {
        this.f828a = i3;
        this.f829b = obj;
        this.f830c = obj2;
    }

    @Override
    public void a(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, boolean z10) {
        o4 o4Var = (o4) this.f829b;
        vp0 vp0Var = o4Var.f856a;
        o4Var.f859e.f6203l.remove((TL_stars.SavedStarGift) this.f830c);
        o4Var.f(true);
        int i3 = o4Var.f857b;
        if (j10 == h10.i(i3).e()) {
            fc a02 = fc.a0(vp0Var.f1010a);
            TLRPC.Document document = tL_starGiftUnique.getDocument();
            String M0 = bd.M0(2131752887, null);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(tL_starGiftUnique.title);
            sb2.append(" #");
            ac O = a02.O(document, M0, bd.a0(null, null, 2131752888, k2.p1.l(tL_starGiftUnique.num, ',', sb2)));
            O.f31800r = false;
            O.j();
        } else {
            ac O2 = fc.a0(vp0Var.f1010a).O(tL_starGiftUnique.getDocument(), bd.M0(2131752885, null), bd.a0(null, null, 2131752886, org.telegram.messenger.m5.s(i3, j10)));
            O2.f31800r = false;
            O2.j();
        }
        LaunchActivity launchActivity = LaunchActivity.K1;
        if (launchActivity != null) {
            launchActivity.f41328y0.c(true);
        }
    }

    @Override
    public void b(float f10, float f11, int i3, View view) {
        TL_stars.SavedStarGift savedStarGift;
        AlertDialog$Builder alertDialog$Builder;
        ?? r42;
        dg.b bVar;
        long e10;
        int i10;
        int i11;
        int i12;
        int i13;
        TLRPC.ChatParticipants chatParticipants;
        ArrayList<TLRPC.ChatParticipant> arrayList;
        int i14 = this.f828a;
        Object obj = this.f830c;
        Object obj2 = this.f829b;
        int i15 = 0;
        switch (i14) {
            case 4:
                h6 h6Var = (h6) obj2;
                g6 g6Var = (g6) obj;
                r31 G = h6Var.f684b2.G(i3 - 1);
                if (G != null) {
                    Object obj3 = G.G;
                    if (obj3 instanceof TL_stars.StarGift) {
                        TL_stars.StarGift starGift = (TL_stars.StarGift) obj3;
                        boolean z10 = G.f37633r;
                        if (!TextUtils.isEmpty(starGift.gift_address) && h6Var.f683a2) {
                            alertDialog$Builder = new AlertDialog$Builder(0, h6Var.getContext(), h6Var.J0);
                            r42 = 0;
                            String M0 = bd.M0(2131749800, null);
                            org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                            s1Var.S = M0;
                            s1Var.U = bd.M0(2131749801, null);
                        } else if (z10 && (starGift instanceof TL_stars.TL_starGiftUnique)) {
                            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) G.G;
                            org.telegram.ui.ActionBar.s1 s1Var2 = new org.telegram.ui.ActionBar.s1(3, h6Var.getContext(), null);
                            s1Var2.r(400L);
                            long e11 = h10.i(h6Var.f28583a).e();
                            if (tL_starGiftUnique.resale_ton_only) {
                                bVar = dg.b.f8926b;
                            } else {
                                bVar = dg.b.f8925a;
                            }
                            e9.x(h6Var.f28583a, bVar).H(tL_starGiftUnique, e11, null, true, new c6(h6Var, s1Var2, bVar, tL_starGiftUnique, e11));
                            return;
                        } else {
                            if (!z10) {
                                ArrayList arrayList2 = g6Var.f665b.f6203l;
                                int size = arrayList2.size();
                                int i16 = 0;
                                while (true) {
                                    if (i16 < size) {
                                        Object obj4 = arrayList2.get(i16);
                                        i16++;
                                        TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj4;
                                        if (savedStarGift2.gift == starGift) {
                                            savedStarGift = savedStarGift2;
                                        }
                                    } else {
                                        savedStarGift = null;
                                    }
                                }
                                if (savedStarGift != null && savedStarGift.can_craft_at > 0 && savedStarGift.can_craft_at > ConnectionsManager.getInstance(h6Var.f28583a).getCurrentTime()) {
                                    alertDialog$Builder = new AlertDialog$Builder(h6Var.getContext());
                                    r42 = 0;
                                    String M02 = bd.M0(2131749763, null);
                                    org.telegram.ui.ActionBar.s1 s1Var3 = alertDialog$Builder.f27343a;
                                    s1Var3.S = M02;
                                    s1Var3.U = org.telegram.messenger.g0.X2(bd.a0(null, null, 2131749764, bd.x(savedStarGift.can_craft_at, true)));
                                }
                            }
                            h6Var.Y1.a(starGift);
                            h6Var.dismiss();
                            return;
                        }
                        k2.p1.B(r42, 2131747839, alertDialog$Builder, r42);
                        return;
                    }
                    return;
                }
                return;
            default:
                o8 o8Var = (o8) obj2;
                Context context = (Context) obj;
                ArrayList arrayList3 = o8Var.M;
                a0.h hVar = o8Var.f13341b;
                f8 f8Var = o8Var.f13350y;
                ArrayList arrayList4 = o8Var.f13342c;
                HashMap hashMap = o8Var.d;
                t8 t8Var = o8Var.f13340a0;
                org.telegram.ui.ActionBar.j2 j2Var = t8Var.f28589c;
                if (i3 >= 0 && i3 < arrayList3.size()) {
                    a8 a8Var = (a8) arrayList3.get(i3);
                    int i17 = a8Var.f54715a;
                    if (i17 == 3) {
                        if (a8Var.f12405n && t8Var.f13633x1) {
                            new v7(context, t8Var.f28583a, t8Var.C1, t8Var.k1, new d8(o8Var, 0), t8Var.J0).show();
                            return;
                        }
                        int i18 = a8Var.f12400i;
                        if (i18 == 1) {
                            if (t8Var.F1 == 1 || t8.J0(t8Var).isEmpty()) {
                                t8Var.E1 = 1;
                                t8Var.f13621j1.D(1);
                            }
                            t8Var.F1 = 1;
                            o8Var.g(true);
                            return;
                        } else if (i18 == 3) {
                            if (t8Var.F1 == 3 || (t8Var.f13625p1.isEmpty() && t8Var.f13626q1.isEmpty())) {
                                t8Var.E1 = 3;
                                t8Var.f13621j1.D(1);
                            }
                            t8Var.F1 = 3;
                            o8Var.g(true);
                            return;
                        } else if (i18 == 2) {
                            if (t8Var.F1 == 2) {
                                t8Var.E1 = 2;
                                t8Var.f13621j1.D(1);
                            }
                            t8Var.F1 = 2;
                            o8Var.g(true);
                            return;
                        } else if (i18 == 4) {
                            if (t8Var.F1 == 4) {
                                t8Var.E1 = 4;
                                t8Var.f13621j1.D(1);
                            }
                            t8Var.F1 = 4;
                            o8Var.g(true);
                            return;
                        } else {
                            if (i18 > 0) {
                                arrayList4.clear();
                                hashMap.clear();
                                t8Var.F1 = a8Var.f12400i;
                                f8Var.d.a();
                            } else {
                                TLRPC.Chat chat = a8Var.h;
                                if (chat != null) {
                                    long j10 = chat.f27001id;
                                    if (t8.K0(t8Var, chat) > 200) {
                                        try {
                                            o8Var.performHapticFeedback(3, 1);
                                        } catch (Throwable unused) {
                                        }
                                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, o8Var.getContext(), t8Var.J0);
                                        String M03 = bd.M0(2131749402, null);
                                        org.telegram.ui.ActionBar.s1 s1Var4 = alertDialog$Builder2.f27343a;
                                        s1Var4.S = M03;
                                        s1Var4.U = bd.M0(2131749401, null);
                                        k2.p1.B(null, 2131747839, alertDialog$Builder2, null);
                                    } else if (hashMap.containsKey(Long.valueOf(j10))) {
                                        ArrayList arrayList5 = (ArrayList) hashMap.get(Long.valueOf(j10));
                                        if (arrayList5 != null) {
                                            int size2 = arrayList5.size();
                                            while (i15 < size2) {
                                                Object obj5 = arrayList5.get(i15);
                                                i15++;
                                                hVar.k(Boolean.FALSE, ((Long) obj5).longValue());
                                            }
                                        }
                                        hashMap.remove(Long.valueOf(j10));
                                        o8Var.j(true);
                                    } else {
                                        TLRPC.Chat M04 = hp.s1(t8Var.f28583a).M0(Long.valueOf(j10));
                                        TLRPC.ChatFull N0 = hp.s1(t8Var.f28583a).N0(j10);
                                        if (N0 != null && (chatParticipants = N0.participants) != null && (arrayList = chatParticipants.participants) != null && !arrayList.isEmpty() && N0.participants.participants.size() >= N0.participants_count - 1) {
                                            o8Var.e(j10, N0.participants);
                                        } else {
                                            org.telegram.ui.ActionBar.s1 s1Var5 = o8Var.H;
                                            if (s1Var5 != null) {
                                                s1Var5.dismiss();
                                                o8Var.H = null;
                                            }
                                            o8Var.I = j10;
                                            org.telegram.ui.ActionBar.s1 s1Var6 = new org.telegram.ui.ActionBar.s1(3, o8Var.getContext(), t8Var.J0);
                                            o8Var.H = s1Var6;
                                            s1Var6.r(50L);
                                            qr a02 = qr.a0(t8Var.f28583a);
                                            a02.f24934a.c(new ci.l2(o8Var, M04, a02, j10, 12));
                                        }
                                        if (!TextUtils.isEmpty(o8Var.J)) {
                                            f8Var.setText("");
                                            o8Var.J = null;
                                            o8Var.h(false);
                                        }
                                    }
                                } else {
                                    TLRPC.User user = a8Var.f12399g;
                                    if (user != null) {
                                        if (o8Var.f13339a == 0) {
                                            t8Var.F1 = 0;
                                        }
                                        long j11 = user.f27150id;
                                        HashSet hashSet = new HashSet(arrayList4);
                                        if (arrayList4.contains(Long.valueOf(j11))) {
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
                                            if (!TextUtils.isEmpty(o8Var.J)) {
                                                f8Var.setText("");
                                                o8Var.J = null;
                                                o8Var.h(false);
                                            }
                                            hVar.k(Boolean.TRUE, j11);
                                        }
                                        arrayList4.clear();
                                        arrayList4.addAll(hashSet);
                                        o8Var.j(true);
                                    }
                                }
                            }
                            o8Var.g(true);
                            o8Var.f(true);
                            f8Var.M = true;
                            return;
                        }
                    } else if (i17 == 7) {
                        if (view instanceof l8) {
                            l8 l8Var = (l8) view;
                            l8Var.setChecked(!l8Var.d());
                            a8Var.f12402k = l8Var.d();
                            int i19 = a8Var.f12396c;
                            if (i19 == 0) {
                                boolean d = l8Var.d();
                                t8Var.f13630u1 = d;
                                if (t8Var.F1 == 4) {
                                    i15 = 1;
                                }
                                if (d) {
                                    fc fcVar = new fc(j2Var, t8Var.J0);
                                    if (i15 != 0) {
                                        i13 = 2131744679;
                                    } else {
                                        i13 = 2131744680;
                                    }
                                    ac G2 = fcVar.G(2131624055, 4, bd.M0(i13, null));
                                    G2.f31792j = 5000;
                                    G2.k(true);
                                    return;
                                }
                                fc fcVar2 = new fc(j2Var, t8Var.J0);
                                if (i15 != 0) {
                                    i12 = 2131744693;
                                } else {
                                    i12 = 2131744694;
                                }
                                ac G3 = fcVar2.G(2131624112, 4, bd.M0(i12, null));
                                G3.f31792j = 5000;
                                G3.k(true);
                                return;
                            } else if (i19 == 1) {
                                boolean d10 = l8Var.d();
                                t8Var.f13631v1 = d10;
                                boolean z11 = t8Var.k1 instanceof TLRPC.TL_inputPeerChannel;
                                if (d10) {
                                    fc fcVar3 = new fc(j2Var, t8Var.J0);
                                    if (z11) {
                                        i11 = 2131744717;
                                    } else {
                                        i11 = 2131744681;
                                    }
                                    ac G4 = fcVar3.G(2131624102, 4, bd.M0(i11, null));
                                    G4.f31792j = 5000;
                                    G4.k(true);
                                } else {
                                    fc fcVar4 = new fc(j2Var, t8Var.J0);
                                    if (z11) {
                                        i10 = 2131744718;
                                    } else {
                                        i10 = 2131744695;
                                    }
                                    ac G5 = fcVar4.G(2131624020, 4, bd.M0(i10, null));
                                    G5.f31792j = 5000;
                                    G5.k(true);
                                }
                                o8Var.h(true);
                                return;
                            } else if (i19 == 2) {
                                t8Var.f13629t1 = l8Var.d();
                                o8Var.h(true);
                                return;
                            } else {
                                return;
                            }
                        }
                        return;
                    } else if (i17 == 9) {
                        int i20 = a8Var.f12408q;
                        if (i20 == 0) {
                            v8 v8Var = t8Var.U1;
                            if (v8Var != null) {
                                v8Var.run();
                                return;
                            }
                            return;
                        } else if (i20 == 1) {
                            TLRPC.InputPeer inputPeer = t8Var.k1;
                            if (inputPeer != null) {
                                e10 = org.telegram.messenger.m5.n(inputPeer);
                            } else {
                                e10 = h10.i(t8Var.f28583a).e();
                            }
                            f60 F = f60.F(o8Var, t8Var.J0, view);
                            F.c(2131232046, bd.M0(2131744795, null), new ci.e3(o8Var, e10, 7), false);
                            F.k();
                            f60.f(F, hp.s1(t8Var.f28583a).P1().B(e10, true), t8Var.f13628s1, false, null, new o1(16, o8Var, F));
                            F.Z();
                            return;
                        } else if (i20 == 5) {
                            Context context2 = o8Var.getContext();
                            int i21 = t8.V1;
                            org.telegram.ui.ActionBar.s1 s1Var7 = new org.telegram.ui.ActionBar.s1(3, context2, t8Var.J0);
                            s1Var7.r(500L);
                            TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = new TL_phone.getGroupCallStreamRtmpUrl();
                            getgroupcallstreamrtmpurl.live_story = true;
                            TLRPC.InputPeer inputPeer2 = t8Var.k1;
                            if (inputPeer2 == null) {
                                inputPeer2 = new TLRPC.TL_inputPeerSelf();
                            }
                            getgroupcallstreamrtmpurl.peer = inputPeer2;
                            ConnectionsManager.getInstance(t8Var.f28583a).sendRequest(getgroupcallstreamrtmpurl, new r6(o8Var, s1Var7, getgroupcallstreamrtmpurl, 7));
                            return;
                        } else if (i20 == 6) {
                            t8Var.f13634y1 = false;
                            o8Var.h(true);
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
    public boolean b1(View view) {
        switch (this.f828a) {
            case 4:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void c(r8 r8Var, boolean z10, boolean z11, boolean z12, boolean z13, TLRPC.InputPeer inputPeer, int i3, g2.c cVar, gi.f6 f6Var) {
        boolean z14;
        switch (this.f828a) {
            case 14:
                ei.j4 j4Var = (ei.j4) this.f829b;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.f830c;
                TL_stories.TL_stories_editStory tL_stories_editStory = new TL_stories.TL_stories_editStory();
                tL_stories_editStory.peer = hp.s1(j4Var.f10480m2).j1(storyItem.dialogId);
                tL_stories_editStory.f27244id = storyItem.f27240id;
                tL_stories_editStory.flags |= 4;
                tL_stories_editStory.privacy_rules = r8Var.f13527b;
                ConnectionsManager.getInstance(j4Var.f10480m2).sendRequest(tL_stories_editStory, new q1(j4Var, cVar, storyItem, r8Var, 6));
                return;
            default:
                ei.b4 b4Var = (ei.b4) this.f829b;
                t8 t8Var = (t8) this.f830c;
                ei.j4 j4Var2 = b4Var.f10126x;
                ei.h4 h4Var = j4Var2.f10527y1;
                TL_stories.StoryItem storyItem2 = h4Var.f10358a;
                if (storyItem2 != null && storyItem2.pinned) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (z14 != z12) {
                    hp.s1(j4Var2.f10480m2).P1().r0(j4Var2.f10477l1, j4Var2.f10455f1, z12, null);
                }
                TL_stories.StoryItem storyItem3 = h4Var.f10358a;
                if (storyItem3 != null) {
                    TLRPC.MessageMedia messageMedia = storyItem3.media;
                    if (messageMedia instanceof TLRPC.TL_messageMediaVideoStream) {
                        TLRPC.InputGroupCall inputGroupCall = ((TLRPC.TL_messageMediaVideoStream) messageMedia).call;
                        TL_phone.toggleGroupCallSettings togglegroupcallsettings = new TL_phone.toggleGroupCallSettings();
                        togglegroupcallsettings.call = inputGroupCall;
                        togglegroupcallsettings.messages_enabled = Boolean.valueOf(z10);
                        togglegroupcallsettings.send_paid_messages_stars = Long.valueOf(i3);
                        ConnectionsManager.getInstance(j4Var2.f10480m2).sendRequest(togglegroupcallsettings, new f3(11, b4Var, t8Var));
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public void d(org.telegram.tgnet.TLRPC.MessageMedia r1, int r2, boolean r3, int r4, long r5) {
        throw new UnsupportedOperationException("Method not decompiled: ai.n.d(org.telegram.tgnet.TLRPC$MessageMedia, int, boolean, int, long):void");
    }

    @Override
    public void e(Object obj, d2.t tVar) {
        d2.e1 e1Var = (d2.e1) this.f830c;
        l2.b bVar = (l2.b) obj;
        SparseArray sparseArray = ((l2.f) this.f829b).f17697e;
        ?? obj2 = new Object();
        obj2.f55094a = tVar;
        SparseBooleanArray sparseBooleanArray = tVar.f8412a;
        SparseArray sparseArray2 = new SparseArray(sparseBooleanArray.size());
        for (int i3 = 0; i3 < sparseBooleanArray.size(); i3++) {
            int a10 = tVar.a(i3);
            l2.a aVar = (l2.a) sparseArray.get(a10);
            aVar.getClass();
            sparseArray2.append(a10, aVar);
        }
        obj2.f55095b = sparseArray2;
        bVar.b(e1Var, obj2);
    }

    @Override
    public boolean f(int i3, View view) {
        return ii.q3.E0((ii.q3) this.f829b, (Context) this.f830c, view, i3);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        switch (this.f828a) {
            case 0:
                e0 e0Var = (e0) this.f829b;
                z zVar = (z) this.f830c;
                try {
                    int parseInt = Integer.parseInt(zVar.getText().toString().trim());
                    e0Var.g1(parseInt);
                    e0Var.V1.setValue(parseInt);
                    s1Var.dismiss();
                    return;
                } catch (Throwable th2) {
                    org.telegram.messenger.g0.F3(zVar);
                    org.telegram.messenger.a8.g(th2, true);
                    return;
                }
            case 1:
                u3 u3Var = (u3) this.f829b;
                u10 u10Var = (u10) this.f830c;
                String obj = u3Var.getText().toString();
                if (obj.length() > 0 && obj.length() <= 12) {
                    u10Var.a(obj);
                    s1Var.dismiss();
                    return;
                }
                org.telegram.messenger.g0.F3(u3Var);
                return;
            case 10:
                ci.l6 l6Var = (ci.l6) this.f829b;
                sf.b h = s1Var.h(i3, true, true);
                h.d();
                int i10 = l6Var.f28583a;
                ci.p3 p3Var = new ci.p3(l6Var, h, (xg.e1) this.f830c, 1);
                org.telegram.ui.Wallet.k0 x10 = org.telegram.ui.Wallet.k0.x(i10);
                x10.m0(new rw(i10, p3Var, x10));
                return;
            case 16:
                ei.b4 b4Var = (ei.b4) this.f829b;
                ei.g1 g1Var = ((r9) this.f830c).B0;
                if (g1Var != null) {
                    if (!g1Var.f10305x) {
                        TL_phone.discardGroupCall discardgroupcall = new TL_phone.discardGroupCall();
                        discardgroupcall.call = g1Var.f10300f;
                        ConnectionsManager.getInstance(g1Var.f10299e).sendRequest(discardgroupcall, new ei.y0(g1Var, 4));
                        g1Var.e();
                        return;
                    }
                    return;
                }
                ei.j4.d0(b4Var.f10126x);
                return;
            case 19:
                ii.q3.B0((ii.q3) this.f829b, (TL_payments.connectedBotStarRef) this.f830c);
                return;
            case 21:
                kg.e1 e1Var = (kg.e1) this.f829b;
                e1Var.getClass();
                ((boolean[]) this.f830c)[0] = true;
                e1Var.Q();
                return;
            default:
                lg.v.e0((lg.v) this.f829b, (TL_account.TL_businessChatLink) this.f830c);
                return;
        }
    }

    @Override
    public f60 h(mi.h1 h1Var) {
        mi.p pVar = (mi.p) ((m2.t) this.f829b).f19007c;
        f60 f60Var = new f60(pVar, (org.telegram.ui.ActionBar.e6) this.f830c, h1Var, false, false, true);
        pVar.I = f60Var;
        return f60Var;
    }

    @Override
    public void i(Object obj, TLRPC.Document document, Boolean bool) {
        lg.m mVar = (lg.m) this.f829b;
        mVar.f18363x = false;
        org.telegram.messenger.g0.r(mVar.f18357e);
        lg.i iVar = mVar.f18359n;
        mVar.f18364y = document;
        iVar.setSticker(document);
        ((l8) ((View) this.f830c)).setValueSticker(document);
        mVar.j0(true);
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f828a) {
            case 23:
                ((l2.b) obj).D((l2.a) this.f829b, (w2.c0) this.f830c);
                return;
            default:
                ((l2.b) obj).onRenderedFirstFrame((l2.a) this.f829b);
                return;
        }
    }

    @Override
    public void j(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        boolean z10;
        boolean z11;
        t4 t4Var = (t4) this.f829b;
        gi.d dVar = (gi.d) this.f830c;
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        long j10 = ((TL_stars.SavedStarGift) ((r31) obj).G).gift.f27230id;
        if (t4Var.f987j1 == j10) {
            t4Var.f987j1 = 0L;
        } else {
            t4Var.f987j1 = j10;
        }
        if (t4Var.f987j1 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        dVar.setEnabled(z10);
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                View childAt = viewGroup.getChildAt(i3);
                if (childAt instanceof ll0) {
                    ll0 ll0Var = (ll0) childAt;
                    if (t4Var.f987j1 == ll0Var.getGiftId()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    ll0Var.b(z11, true);
                }
            }
        }
    }

    @Override
    public void k(RectF rectF, View view) {
        ((gh.g) this.f829b).i(rectF.left, rectF.top);
        View view2 = (View) ((WeakReference) this.f830c).get();
        if (view2 != null) {
            view2.invalidate();
        }
    }

    @Override
    public void l(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((ci.v) this.f829b).u0(false, 0L, tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.f830c);
    }

    @Override
    public void m() {
        ((mi.k0) this.f829b).i();
        ((mi.j0) this.f830c).c2();
    }

    @Override
    public void onCameraInit() {
        bi.a0 a0Var = (bi.a0) this.f829b;
        ((CameraView) this.f830c).animate().alpha(1.0f).setDuration(180L).start();
        if (!a0Var.W && !a0Var.f3370i0 && !a0Var.m0) {
            a0Var.f3370i0 = true;
            a0Var.f3369h0.postDelayed(a0Var.f3392z0, 150L);
        }
    }

    @Override
    public void onFailure(Exception e10) {
        String str;
        w0.i gVar;
        String str2;
        w0.d cVar;
        switch (this.f828a) {
            case 8:
                c1.e eVar = (c1.e) this.f829b;
                CancellationSignal cancellationSignal = (CancellationSignal) this.f830c;
                kotlin.jvm.internal.j.e(e10, "e");
                if ((e10 instanceof com.google.android.gms.common.api.f) && b1.d.f2330b.contains(Integer.valueOf(((com.google.android.gms.common.api.f) e10).getStatusCode()))) {
                    str = "GET_INTERRUPTED";
                } else {
                    str = "GET_NO_CREDENTIALS";
                }
                String str3 = "During begin sign in, failure response from one tap: " + e10.getMessage();
                int hashCode = str.hashCode();
                if (hashCode != -1567968963) {
                    if (hashCode != -154594663) {
                        if (hashCode == 1996705159 && str.equals("GET_NO_CREDENTIALS")) {
                            gVar = new w0.k(str3);
                        }
                        gVar = new w0.h(2, str3);
                    } else {
                        if (str.equals("GET_INTERRUPTED")) {
                            gVar = new w0.j(str3);
                        }
                        gVar = new w0.h(2, str3);
                    }
                } else {
                    if (str.equals("GET_CANCELED_TAG")) {
                        gVar = new w0.g(str3);
                    }
                    gVar = new w0.h(2, str3);
                }
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!a1.h.a(cancellationSignal)) {
                    eVar.f().execute(new c1.a(eVar, gVar, 0));
                    return;
                }
                return;
            default:
                d1.e eVar2 = (d1.e) this.f829b;
                CancellationSignal cancellationSignal2 = (CancellationSignal) this.f830c;
                kotlin.jvm.internal.j.e(e10, "e");
                if ((e10 instanceof com.google.android.gms.common.api.f) && b1.d.f2330b.contains(Integer.valueOf(((com.google.android.gms.common.api.f) e10).getStatusCode()))) {
                    str2 = "CREATE_INTERRUPTED";
                } else {
                    str2 = "CREATE_UNKNOWN";
                }
                String str4 = "During create public key credential, fido registration failure: " + e10.getMessage();
                if (str2.equals("CREATE_CANCELED")) {
                    cVar = new w0.b(str4);
                } else if (str2.equals("CREATE_INTERRUPTED")) {
                    cVar = new w0.e(str4);
                } else {
                    cVar = new w0.c(2, str4);
                }
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!a1.h.a(cancellationSignal2)) {
                    Executor executor = eVar2.f7997g;
                    if (executor != null) {
                        executor.execute(new d1.a(eVar2, cVar, 1));
                        return;
                    } else {
                        kotlin.jvm.internal.j.h("executor");
                        throw null;
                    }
                }
                return;
        }
    }

    @Override
    public Object q1(ke keVar) {
        switch (this.f828a) {
            case 5:
                return new bb.a((String) this.f829b, ((bb.d) this.f830c).a((Context) keVar.a(Context.class)));
            default:
                String str = (String) this.f829b;
                t9.a aVar = (t9.a) this.f830c;
                try {
                    Trace.beginSection(str);
                    return aVar.f55045f.q1(keVar);
                } finally {
                    Trace.endSection();
                }
        }
    }

    @Override
    public void r0(View view, float f10, float f11) {
        int i3 = this.f828a;
    }

    public n(l2.a aVar, Object obj, long j10) {
        this.f828a = 24;
        this.f829b = aVar;
        this.f830c = obj;
    }

    private final void n(View view, float f10, float f11) {
    }

    private final void o(View view, float f10, float f11) {
    }
}
