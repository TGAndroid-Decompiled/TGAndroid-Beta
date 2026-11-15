package ab;

import a8.r7;
import ai.v1;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.graphics.RectF;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.SystemClock;
import android.os.Trace;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import bi.c4;
import bi.j3;
import bi.j6;
import bi.l1;
import bi.u5;
import bi.v2;
import bi.y5;
import bi.z5;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseCommonRegistrar;
import di.c6;
import di.f2;
import di.g3;
import di.j4;
import di.u8;
import di.x2;
import e2.c1;
import fi.b4;
import fi.i9;
import fi.t3;
import fi.y0;
import fi.z3;
import hi.c8;
import hi.e1;
import hi.e8;
import hi.h4;
import hi.l8;
import hi.o8;
import hi.q8;
import hi.s8;
import hi.u7;
import hi.w7;
import hi.z7;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;
import jg.h1;
import ki.n3;
import org.telegram.messenger.a8;
import org.telegram.messenger.camera.CameraView;
import org.telegram.messenger.hd;
import org.telegram.messenger.m10;
import org.telegram.messenger.m5;
import org.telegram.messenger.np;
import org.telegram.messenger.v10;
import org.telegram.messenger.vr;
import org.telegram.messenger.x10;
import org.telegram.messenger.z10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.ActionBar.q1;
import org.telegram.ui.ActionBar.t1;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.hj0;
import org.telegram.ui.Components.ij0;
import org.telegram.ui.Components.m60;
import org.telegram.ui.Components.u11;
import org.telegram.ui.Components.wp0;
import org.telegram.ui.Components.xb;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.ka1;
import org.telegram.ui.ma0;
import org.telegram.ui.o01;
import org.telegram.ui.sl0;
public final class g implements OnCompleteListener, Continuation, ai.g, q1, j4, x10, hj0, OnFailureListener, u9.d, o01, CameraView.CameraViewDelegate, jh.i, ka1, w7, v10, ma0, ij0, h2.p, h2.o {
    public final int f926a;
    public final Object f927b;
    public final Object f928c;

    public g(int i7, Object obj, Object obj2) {
        this.f926a = i7;
        this.f927b = obj;
        this.f928c = obj2;
    }

    @Override
    public void a(o8 o8Var, boolean z10, boolean z11, boolean z12, boolean z13, TLRPC.InputPeer inputPeer, int i7, h4 h4Var, e1 e1Var) {
        boolean z14;
        switch (this.f926a) {
            case 17:
                b4 b4Var = (b4) this.f927b;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.f928c;
                TL_stories.TL_stories_editStory tL_stories_editStory = new TL_stories.TL_stories_editStory();
                tL_stories_editStory.peer = np.s1(b4Var.f11497m2).j1(storyItem.dialogId);
                tL_stories_editStory.f28294id = storyItem.f28290id;
                tL_stories_editStory.flags |= 4;
                tL_stories_editStory.privacy_rules = o8Var.f14824b;
                ConnectionsManager.getInstance(b4Var.f11497m2).sendRequest(tL_stories_editStory, new l1(b4Var, h4Var, storyItem, o8Var, 6));
                return;
            default:
                t3 t3Var = (t3) this.f927b;
                q8 q8Var = (q8) this.f928c;
                b4 b4Var2 = t3Var.f12360x;
                z3 z3Var = b4Var2.f11543y1;
                TL_stories.StoryItem storyItem2 = z3Var.f12579a;
                if (storyItem2 != null && storyItem2.pinned) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (z14 != z12) {
                    np.s1(b4Var2.f11497m2).P1().r0(b4Var2.l1, b4Var2.f11471f1, z12, null);
                }
                TL_stories.StoryItem storyItem3 = z3Var.f12579a;
                if (storyItem3 != null) {
                    TLRPC.MessageMedia messageMedia = storyItem3.media;
                    if (messageMedia instanceof TLRPC.TL_messageMediaVideoStream) {
                        TLRPC.InputGroupCall inputGroupCall = ((TLRPC.TL_messageMediaVideoStream) messageMedia).call;
                        TL_phone.toggleGroupCallSettings togglegroupcallsettings = new TL_phone.toggleGroupCallSettings();
                        togglegroupcallsettings.call = inputGroupCall;
                        togglegroupcallsettings.messages_enabled = Boolean.valueOf(z10);
                        togglegroupcallsettings.send_paid_messages_stars = Long.valueOf(i7);
                        ConnectionsManager.getInstance(b4Var2.f11497m2).sendRequest(togglegroupcallsettings, new v2(10, t3Var, q8Var));
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public boolean b(int i7, View view) {
        return n3.E0((n3) this.f927b, (Context) this.f928c, view, i7);
    }

    @Override
    public void c(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, boolean z10) {
        c4 c4Var = (c4) this.f927b;
        wp0 wp0Var = c4Var.f3412a;
        c4Var.f3415e.f9001l.remove((TL_stars.SavedStarGift) this.f928c);
        c4Var.f(true);
        int i7 = c4Var.f3413b;
        if (j3 == m10.i(i7).e()) {
            cc a02 = cc.a0(wp0Var.f3610a);
            TLRPC.Document document = tL_starGiftUnique.getDocument();
            String M0 = hd.M0(2131752887, null);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(tL_starGiftUnique.title);
            sb2.append(" #");
            xb O = a02.O(document, M0, hd.a0(null, null, 2131752888, i5.c.l(tL_starGiftUnique.num, ',', sb2)));
            O.f41643r = false;
            O.j();
        } else {
            xb O2 = cc.a0(wp0Var.f3610a).O(tL_starGiftUnique.getDocument(), hd.M0(2131752885, null), hd.a0(null, null, 2131752886, m5.s(i7, j3)));
            O2.f41643r = false;
            O2.j();
        }
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (launchActivity != null) {
            launchActivity.f42663w0.c(true);
        }
    }

    @Override
    public boolean c1(View view) {
        switch (this.f926a) {
            case 7:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void d(org.telegram.tgnet.TLRPC.MessageMedia r1, int r2, boolean r3, int r4, long r5) {
        throw new UnsupportedOperationException("Method not decompiled: ab.g.d(org.telegram.tgnet.TLRPC$MessageMedia, int, boolean, int, long):void");
    }

    @Override
    public void e(Object obj, e2.s sVar) {
        ((m2.b) obj).A((c1) this.f928c, new ji.j(sVar, ((m2.e) this.f927b).f20127e));
    }

    @Override
    public void f(float f10, float f11, int i7, View view) {
        TL_stars.SavedStarGift savedStarGift;
        AlertDialog$Builder alertDialog$Builder;
        ?? r42;
        cg.b bVar;
        long e10;
        int i10;
        int i11;
        int i12;
        int i13;
        TLRPC.ChatParticipants chatParticipants;
        ArrayList<TLRPC.ChatParticipant> arrayList;
        int i14 = this.f926a;
        Object obj = this.f928c;
        Object obj2 = this.f927b;
        int i15 = 0;
        switch (i14) {
            case 7:
                z5 z5Var = (z5) obj2;
                y5 y5Var = (y5) obj;
                b41 G = z5Var.f4036e2.G(i7 - 1);
                if (G != null) {
                    Object obj3 = G.G;
                    if (obj3 instanceof TL_stars.StarGift) {
                        TL_stars.StarGift starGift = (TL_stars.StarGift) obj3;
                        boolean z10 = G.f33190r;
                        if (!TextUtils.isEmpty(starGift.gift_address) && z5Var.d2) {
                            alertDialog$Builder = new AlertDialog$Builder(0, z5Var.getContext(), z5Var.J0);
                            r42 = 0;
                            String M0 = hd.M0(2131749792, null);
                            t1 t1Var = alertDialog$Builder.f28392a;
                            t1Var.S = M0;
                            t1Var.U = hd.M0(2131749793, null);
                        } else if (z10 && (starGift instanceof TL_stars.TL_starGiftUnique)) {
                            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) G.G;
                            t1 t1Var2 = new t1(3, z5Var.getContext(), null);
                            t1Var2.r(400L);
                            long e11 = m10.i(z5Var.f29679a).e();
                            if (tL_starGiftUnique.resale_ton_only) {
                                bVar = cg.b.f4991b;
                            } else {
                                bVar = cg.b.f4990a;
                            }
                            u8.x(z5Var.f29679a, bVar).H(tL_starGiftUnique, e11, null, true, new u5(z5Var, t1Var2, bVar, tL_starGiftUnique, e11));
                            return;
                        } else {
                            if (!z10) {
                                ArrayList arrayList2 = y5Var.f4018b.f9001l;
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
                                if (savedStarGift != null && savedStarGift.can_craft_at > 0 && savedStarGift.can_craft_at > ConnectionsManager.getInstance(z5Var.f29679a).getCurrentTime()) {
                                    alertDialog$Builder = new AlertDialog$Builder(z5Var.getContext());
                                    r42 = 0;
                                    String M02 = hd.M0(2131749755, null);
                                    t1 t1Var3 = alertDialog$Builder.f28392a;
                                    t1Var3.S = M02;
                                    t1Var3.U = org.telegram.messenger.g0.X2(hd.a0(null, null, 2131749756, hd.x(savedStarGift.can_craft_at, true)));
                                }
                            }
                            z5Var.f4034b2.a(starGift);
                            z5Var.dismiss();
                            return;
                        }
                        i5.c.C(r42, 2131747831, alertDialog$Builder, r42);
                        return;
                    }
                    return;
                }
                return;
            default:
                l8 l8Var = (l8) obj2;
                Context context = (Context) obj;
                ArrayList arrayList3 = l8Var.M;
                a0.h hVar = l8Var.f14601b;
                e8 e8Var = l8Var.f14610y;
                ArrayList arrayList4 = l8Var.f14602c;
                HashMap hashMap = l8Var.d;
                q8 q8Var = l8Var.f14600a0;
                k2 k2Var = q8Var.f29685c;
                if (i7 >= 0 && i7 < arrayList3.size()) {
                    z7 z7Var = (z7) arrayList3.get(i7);
                    int i17 = z7Var.f56015a;
                    if (i17 == 3) {
                        if (z7Var.f15517n && q8Var.A1) {
                            new u7(context, q8Var.f29679a, q8Var.F1, q8Var.n1, new c8(l8Var, 0), q8Var.J0).show();
                            return;
                        }
                        int i18 = z7Var.f15512i;
                        if (i18 == 1) {
                            if (q8Var.I1 == 1 || q8.J0(q8Var).isEmpty()) {
                                q8Var.H1 = 1;
                                q8Var.f14918m1.C(1);
                            }
                            q8Var.I1 = 1;
                            l8Var.g(true);
                            return;
                        } else if (i18 == 3) {
                            if (q8Var.I1 == 3 || (q8Var.f14923s1.isEmpty() && q8Var.f14924t1.isEmpty())) {
                                q8Var.H1 = 3;
                                q8Var.f14918m1.C(1);
                            }
                            q8Var.I1 = 3;
                            l8Var.g(true);
                            return;
                        } else if (i18 == 2) {
                            if (q8Var.I1 == 2) {
                                q8Var.H1 = 2;
                                q8Var.f14918m1.C(1);
                            }
                            q8Var.I1 = 2;
                            l8Var.g(true);
                            return;
                        } else if (i18 == 4) {
                            if (q8Var.I1 == 4) {
                                q8Var.H1 = 4;
                                q8Var.f14918m1.C(1);
                            }
                            q8Var.I1 = 4;
                            l8Var.g(true);
                            return;
                        } else {
                            if (i18 > 0) {
                                arrayList4.clear();
                                hashMap.clear();
                                q8Var.I1 = z7Var.f15512i;
                                e8Var.d.a();
                            } else {
                                TLRPC.Chat chat = z7Var.h;
                                if (chat != null) {
                                    long j3 = chat.f28051id;
                                    if (q8.K0(q8Var, chat) > 200) {
                                        try {
                                            l8Var.performHapticFeedback(3, 1);
                                        } catch (Throwable unused) {
                                        }
                                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, l8Var.getContext(), q8Var.J0);
                                        String M03 = hd.M0(2131749394, null);
                                        t1 t1Var4 = alertDialog$Builder2.f28392a;
                                        t1Var4.S = M03;
                                        t1Var4.U = hd.M0(2131749393, null);
                                        i5.c.C(null, 2131747831, alertDialog$Builder2, null);
                                    } else if (hashMap.containsKey(Long.valueOf(j3))) {
                                        ArrayList arrayList5 = (ArrayList) hashMap.get(Long.valueOf(j3));
                                        if (arrayList5 != null) {
                                            int size2 = arrayList5.size();
                                            while (i15 < size2) {
                                                Object obj5 = arrayList5.get(i15);
                                                i15++;
                                                hVar.k(Boolean.FALSE, ((Long) obj5).longValue());
                                            }
                                        }
                                        hashMap.remove(Long.valueOf(j3));
                                        l8Var.j(true);
                                    } else {
                                        TLRPC.Chat M04 = np.s1(q8Var.f29679a).M0(Long.valueOf(j3));
                                        TLRPC.ChatFull N0 = np.s1(q8Var.f29679a).N0(j3);
                                        if (N0 != null && (chatParticipants = N0.participants) != null && (arrayList = chatParticipants.participants) != null && !arrayList.isEmpty() && N0.participants.participants.size() >= N0.participants_count - 1) {
                                            l8Var.e(j3, N0.participants);
                                        } else {
                                            t1 t1Var5 = l8Var.H;
                                            if (t1Var5 != null) {
                                                t1Var5.dismiss();
                                                l8Var.H = null;
                                            }
                                            l8Var.I = j3;
                                            t1 t1Var6 = new t1(3, l8Var.getContext(), q8Var.J0);
                                            l8Var.H = t1Var6;
                                            t1Var6.r(50L);
                                            vr a02 = vr.a0(q8Var.f29679a);
                                            a02.f27219a.c(new f2(l8Var, M04, a02, j3, 12));
                                        }
                                        if (!TextUtils.isEmpty(l8Var.J)) {
                                            e8Var.setText("");
                                            l8Var.J = null;
                                            l8Var.h(false);
                                        }
                                    }
                                } else {
                                    TLRPC.User user = z7Var.f15511g;
                                    if (user != null) {
                                        if (l8Var.f14599a == 0) {
                                            q8Var.I1 = 0;
                                        }
                                        long j10 = user.f28200id;
                                        HashSet hashSet = new HashSet(arrayList4);
                                        if (arrayList4.contains(Long.valueOf(j10))) {
                                            Iterator it = hashMap.entrySet().iterator();
                                            while (it.hasNext()) {
                                                Map.Entry entry = (Map.Entry) it.next();
                                                if (((ArrayList) entry.getValue()).contains(Long.valueOf(j10))) {
                                                    it.remove();
                                                    hashSet.addAll((Collection) entry.getValue());
                                                }
                                            }
                                            hashSet.remove(Long.valueOf(j10));
                                            hVar.k(Boolean.FALSE, j10);
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
                                            if (!TextUtils.isEmpty(l8Var.J)) {
                                                e8Var.setText("");
                                                l8Var.J = null;
                                                l8Var.h(false);
                                            }
                                            hVar.k(Boolean.TRUE, j10);
                                        }
                                        arrayList4.clear();
                                        arrayList4.addAll(hashSet);
                                        l8Var.j(true);
                                    }
                                }
                            }
                            l8Var.g(true);
                            l8Var.f(true);
                            e8Var.M = true;
                            return;
                        }
                    } else if (i17 == 7) {
                        if (view instanceof org.telegram.ui.Cells.l8) {
                            org.telegram.ui.Cells.l8 l8Var2 = (org.telegram.ui.Cells.l8) view;
                            l8Var2.setChecked(!l8Var2.d());
                            z7Var.f15514k = l8Var2.d();
                            int i19 = z7Var.f15508c;
                            if (i19 == 0) {
                                boolean d = l8Var2.d();
                                q8Var.f14928x1 = d;
                                if (q8Var.I1 == 4) {
                                    i15 = 1;
                                }
                                if (d) {
                                    cc ccVar = new cc(k2Var, q8Var.J0);
                                    if (i15 != 0) {
                                        i13 = 2131744669;
                                    } else {
                                        i13 = 2131744670;
                                    }
                                    xb G2 = ccVar.G(2131624056, 4, hd.M0(i13, null));
                                    G2.f41635j = 5000;
                                    G2.k(true);
                                    return;
                                }
                                cc ccVar2 = new cc(k2Var, q8Var.J0);
                                if (i15 != 0) {
                                    i12 = 2131744683;
                                } else {
                                    i12 = 2131744684;
                                }
                                xb G3 = ccVar2.G(2131624113, 4, hd.M0(i12, null));
                                G3.f41635j = 5000;
                                G3.k(true);
                                return;
                            } else if (i19 == 1) {
                                boolean d2 = l8Var2.d();
                                q8Var.f14929y1 = d2;
                                boolean z11 = q8Var.n1 instanceof TLRPC.TL_inputPeerChannel;
                                if (d2) {
                                    cc ccVar3 = new cc(k2Var, q8Var.J0);
                                    if (z11) {
                                        i11 = 2131744707;
                                    } else {
                                        i11 = 2131744671;
                                    }
                                    xb G4 = ccVar3.G(2131624103, 4, hd.M0(i11, null));
                                    G4.f41635j = 5000;
                                    G4.k(true);
                                } else {
                                    cc ccVar4 = new cc(k2Var, q8Var.J0);
                                    if (z11) {
                                        i10 = 2131744708;
                                    } else {
                                        i10 = 2131744685;
                                    }
                                    xb G5 = ccVar4.G(2131624021, 4, hd.M0(i10, null));
                                    G5.f41635j = 5000;
                                    G5.k(true);
                                }
                                l8Var.h(true);
                                return;
                            } else if (i19 == 2) {
                                q8Var.f14927w1 = l8Var2.d();
                                l8Var.h(true);
                                return;
                            } else {
                                return;
                            }
                        }
                        return;
                    } else if (i17 == 9) {
                        int i20 = z7Var.f15520q;
                        if (i20 == 0) {
                            s8 s8Var = q8Var.X1;
                            if (s8Var != null) {
                                s8Var.run();
                                return;
                            }
                            return;
                        } else if (i20 == 1) {
                            TLRPC.InputPeer inputPeer = q8Var.n1;
                            if (inputPeer != null) {
                                e10 = m5.n(inputPeer);
                            } else {
                                e10 = m10.i(q8Var.f29679a).e();
                            }
                            m60 F = m60.F(l8Var, q8Var.J0, view);
                            F.c(2131232047, hd.M0(2131744785, null), new x2(l8Var, e10, 7), false);
                            F.k();
                            m60.f(F, np.s1(q8Var.f29679a).P1().B(e10, true), q8Var.f14926v1, false, null, new v1(17, l8Var, F));
                            F.Z();
                            return;
                        } else if (i20 == 5) {
                            Context context2 = l8Var.getContext();
                            int i21 = q8.Y1;
                            t1 t1Var7 = new t1(3, context2, q8Var.J0);
                            t1Var7.r(500L);
                            TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = new TL_phone.getGroupCallStreamRtmpUrl();
                            getgroupcallstreamrtmpurl.live_story = true;
                            TLRPC.InputPeer inputPeer2 = q8Var.n1;
                            if (inputPeer2 == null) {
                                inputPeer2 = new TLRPC.TL_inputPeerSelf();
                            }
                            getgroupcallstreamrtmpurl.peer = inputPeer2;
                            ConnectionsManager.getInstance(q8Var.f29679a).sendRequest(getgroupcallstreamrtmpurl, new j6(l8Var, t1Var7, getgroupcallstreamrtmpurl, 7));
                            return;
                        } else if (i20 == 6) {
                            q8Var.B1 = false;
                            l8Var.h(true);
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
    public void g(String str) {
        ai.n0 n0Var = (ai.n0) this.f927b;
        ai.h hVar = (ai.h) this.f928c;
        if (n0Var.f1386r != 4) {
            return;
        }
        org.telegram.messenger.g0.i3(new aa.r(n0Var, str, hVar, 2), Math.max(0L, (n0Var.V + 1200) - SystemClock.uptimeMillis()));
    }

    @Override
    public void h(t1 t1Var, int i7) {
        switch (this.f926a) {
            case 3:
                bi.y yVar = (bi.y) this.f927b;
                bi.u uVar = (bi.u) this.f928c;
                try {
                    int parseInt = Integer.parseInt(uVar.getText().toString().trim());
                    yVar.g1(parseInt);
                    yVar.Y1.setValue(parseInt);
                    t1Var.dismiss();
                    return;
                } catch (Throwable th2) {
                    org.telegram.messenger.g0.E3(uVar);
                    a8.g(th2, true);
                    return;
                }
            case 4:
                j3 j3Var = (j3) this.f927b;
                z10 z10Var = (z10) this.f928c;
                String obj = j3Var.getText().toString();
                if (obj.length() > 0 && obj.length() <= 12) {
                    z10Var.a(obj);
                    t1Var.dismiss();
                    return;
                }
                org.telegram.messenger.g0.E3(j3Var);
                return;
            case 16:
                c6 c6Var = (c6) this.f927b;
                vf.b h = t1Var.h(i7, true, true);
                h.d();
                int i10 = c6Var.f29679a;
                g3 g3Var = new g3(c6Var, h, (wg.c1) this.f928c, 1);
                org.telegram.ui.Wallet.l0 x10 = org.telegram.ui.Wallet.l0.x(i10);
                x10.m0(new u11(i10, g3Var, x10));
                return;
            case 19:
                t3 t3Var = (t3) this.f927b;
                fi.e1 e1Var = ((i9) this.f928c).B0;
                if (e1Var != null) {
                    if (!e1Var.f11662x) {
                        TL_phone.discardGroupCall discardgroupcall = new TL_phone.discardGroupCall();
                        discardgroupcall.call = e1Var.f11657f;
                        ConnectionsManager.getInstance(e1Var.f11656e).sendRequest(discardgroupcall, new y0(e1Var, 4));
                        e1Var.e();
                        return;
                    }
                    return;
                }
                b4.d0(t3Var.f12360x);
                return;
            case 21:
                h1 h1Var = (h1) this.f927b;
                h1Var.getClass();
                ((boolean[]) this.f928c)[0] = true;
                h1Var.Q();
                return;
            case 24:
                kg.v.e0((kg.v) this.f927b, (TL_account.TL_businessChatLink) this.f928c);
                return;
            default:
                n3.B0((n3) this.f927b, (TL_payments.connectedBotStarRef) this.f928c);
                return;
        }
    }

    @Override
    public Object i(r7 r7Var) {
        String valueOf;
        switch (this.f926a) {
            case 9:
                String str = (String) this.f927b;
                Context context = (Context) r7Var.a(Context.class);
                switch (((n2.a0) this.f928c).f20696a) {
                    case 8:
                        ApplicationInfo applicationInfo = context.getApplicationInfo();
                        if (applicationInfo != null) {
                            valueOf = String.valueOf(applicationInfo.targetSdkVersion);
                            break;
                        }
                        valueOf = "";
                        break;
                    case 9:
                        valueOf = FirebaseCommonRegistrar.a(context);
                        break;
                    case 10:
                        int i7 = Build.VERSION.SDK_INT;
                        if (context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
                            valueOf = "tv";
                            break;
                        } else if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
                            valueOf = "watch";
                            break;
                        } else if (context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                            valueOf = "auto";
                            break;
                        } else {
                            if (i7 >= 26 && context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                                valueOf = "embedded";
                                break;
                            }
                            valueOf = "";
                            break;
                        }
                    default:
                        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                        if (installerPackageName != null) {
                            valueOf = FirebaseCommonRegistrar.b(installerPackageName);
                            break;
                        }
                        valueOf = "";
                        break;
                }
                return new cb.a(str, valueOf);
            default:
                String str2 = (String) this.f927b;
                u9.a aVar = (u9.a) this.f928c;
                try {
                    Trace.beginSection(str2);
                    return aVar.f57966f.i(r7Var);
                } finally {
                    Trace.endSection();
                }
        }
    }

    @Override
    public void invoke(Object obj) {
        ((m2.b) obj).r((m2.a) this.f927b, (x2.b0) this.f928c);
    }

    @Override
    public void j(RectF rectF, View view) {
        ((fh.g) this.f927b).i(rectF.left, rectF.top);
        View view2 = (View) ((WeakReference) this.f928c).get();
        if (view2 != null) {
            view2.invalidate();
        }
    }

    @Override
    public void k(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((di.t) this.f927b).u0(false, 0L, tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.f928c);
    }

    @Override
    public void l(Object obj, TLRPC.Document document, Boolean bool) {
        kg.n nVar = (kg.n) this.f927b;
        nVar.f18003x = false;
        org.telegram.messenger.g0.r(nVar.f17997e);
        kg.i iVar = nVar.f17999n;
        nVar.f18004y = document;
        iVar.setSticker(document);
        ((org.telegram.ui.Cells.l8) ((View) this.f928c)).setValueSticker(document);
        nVar.j0(true);
    }

    @Override
    public void m(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        boolean z10;
        boolean z11;
        bi.h4 h4Var = (bi.h4) this.f927b;
        hi.d dVar = (hi.d) this.f928c;
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        long j3 = ((TL_stars.SavedStarGift) ((b41) obj).G).gift.f28280id;
        if (h4Var.f3568m1 == j3) {
            h4Var.f3568m1 = 0L;
        } else {
            h4Var.f3568m1 = j3;
        }
        if (h4Var.f3568m1 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        dVar.setEnabled(z10);
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            for (int i7 = 0; i7 < viewGroup.getChildCount(); i7++) {
                View childAt = viewGroup.getChildAt(i7);
                if (childAt instanceof sl0) {
                    sl0 sl0Var = (sl0) childAt;
                    if (h4Var.f3568m1 == sl0Var.getGiftId()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    sl0Var.b(z11, true);
                }
            }
        }
    }

    @Override
    public void onCameraInit() {
        ci.a0 a0Var = (ci.a0) this.f927b;
        ((CameraView) this.f928c).animate().alpha(1.0f).setDuration(180L).start();
        if (!a0Var.W && !a0Var.f5271i0 && !a0Var.m0) {
            a0Var.f5271i0 = true;
            a0Var.f5270h0.postDelayed(a0Var.f5293z0, 150L);
        }
    }

    @Override
    public void onComplete(Task task) {
        ((h) this.f927b).a((Intent) this.f928c);
    }

    @Override
    public void onFailure(Exception e10) {
        String str;
        w0.i gVar;
        String str2;
        w0.d cVar;
        switch (this.f926a) {
            case 8:
                c1.f fVar = (c1.f) this.f927b;
                CancellationSignal cancellationSignal = (CancellationSignal) this.f928c;
                kotlin.jvm.internal.j.e(e10, "e");
                if ((e10 instanceof com.google.android.gms.common.api.f) && b1.d.f2855b.contains(Integer.valueOf(((com.google.android.gms.common.api.f) e10).getStatusCode()))) {
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
                if (!a1.g.a(cancellationSignal)) {
                    fVar.g().execute(new c1.a(fVar, gVar, 0));
                    return;
                }
                return;
            default:
                d1.e eVar = (d1.e) this.f927b;
                CancellationSignal cancellationSignal2 = (CancellationSignal) this.f928c;
                kotlin.jvm.internal.j.e(e10, "e");
                if ((e10 instanceof com.google.android.gms.common.api.f) && b1.d.f2855b.contains(Integer.valueOf(((com.google.android.gms.common.api.f) e10).getStatusCode()))) {
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
                if (!a1.g.a(cancellationSignal2)) {
                    Executor executor = eVar.f7332g;
                    if (executor != null) {
                        executor.execute(new d1.a(eVar, cVar, 1));
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
    public void r0(View view, float f10, float f11) {
        int i7 = this.f926a;
    }

    @Override
    public Object then(Task task) {
        k kVar = (k) this.f927b;
        String str = (String) this.f928c;
        synchronized (kVar) {
            ((a0.f) kVar.f960b).remove(str);
        }
        return task;
    }

    private final void n(View view, float f10, float f11) {
    }

    private final void o(View view, float f10, float f11) {
    }
}
