package ab;

import a8.r7;
import ai.y1;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.graphics.RectF;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Trace;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import bi.c4;
import bi.d8;
import bi.h8;
import bi.i8;
import bi.k2;
import bi.m6;
import bi.o1;
import bi.r6;
import bi.t5;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseCommonRegistrar;
import di.j2;
import di.m4;
import di.y8;
import fi.c1;
import fi.f9;
import fi.r3;
import fi.x0;
import fi.x3;
import fi.z3;
import hi.b8;
import hi.k8;
import hi.p8;
import hi.r8;
import hi.t7;
import hi.v7;
import hi.y7;
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
import ki.h3;
import oi.f1;
import org.telegram.messenger.a8;
import org.telegram.messenger.camera.CameraView;
import org.telegram.messenger.f3;
import org.telegram.messenger.hd;
import org.telegram.messenger.k10;
import org.telegram.messenger.n5;
import org.telegram.messenger.np;
import org.telegram.messenger.u10;
import org.telegram.messenger.ur;
import org.telegram.messenger.w10;
import org.telegram.messenger.y10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.ActionBar.q1;
import org.telegram.ui.ActionBar.t1;
import org.telegram.ui.Cells.n8;
import org.telegram.ui.Components.a70;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.gq0;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.o41;
import org.telegram.ui.Components.rj0;
import org.telegram.ui.Components.sj0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.na0;
import org.telegram.ui.oa1;
import org.telegram.ui.t01;
import org.telegram.ui.ul0;
public final class g implements OnCompleteListener, Continuation, q1, m4, w10, rj0, OnFailureListener, u9.d, t01, CameraView.CameraViewDelegate, jh.i, oa1, v7, u10, na0, sj0, h2.p, h2.o, oi.l0 {
    public final int f925a;
    public final Object f926b;
    public final Object f927c;

    public g(int i7, Object obj, Object obj2) {
        this.f925a = i7;
        this.f926b = obj;
        this.f927c = obj2;
    }

    @Override
    public void a(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, boolean z10) {
        m6 m6Var = (m6) this.f926b;
        gq0 gq0Var = m6Var.f3897a;
        m6Var.f3900e.f9552l.remove((TL_stars.SavedStarGift) this.f927c);
        m6Var.f(true);
        int i7 = m6Var.f3898b;
        if (j3 == k10.i(i7).e()) {
            lc b02 = lc.b0(gq0Var.f4091a);
            TLRPC.Document document = tL_starGiftUnique.getDocument();
            String N0 = hd.N0(2131752875, null);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(tL_starGiftUnique.title);
            sb2.append(" #");
            gc O = b02.O(document, N0, hd.a0(null, null, 2131752876, i5.c.l(tL_starGiftUnique.num, ',', sb2)));
            O.f35535r = false;
            O.j();
        } else {
            gc O2 = lc.b0(gq0Var.f4091a).O(tL_starGiftUnique.getDocument(), hd.N0(2131752873, null), hd.a0(null, null, 2131752874, n5.s(i7, j3)));
            O2.f35535r = false;
            O2.j();
        }
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (launchActivity != null) {
            launchActivity.f43153w0.c(true);
        }
    }

    @Override
    public void b(org.telegram.tgnet.TLRPC.MessageMedia r1, int r2, boolean r3, int r4, long r5) {
        throw new UnsupportedOperationException("Method not decompiled: ab.g.b(org.telegram.tgnet.TLRPC$MessageMedia, int, boolean, int, long):void");
    }

    @Override
    public boolean b1(View view) {
        switch (this.f925a) {
            case 6:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean c(int i7, View view) {
        return h3.E0((h3) this.f926b, (Context) this.f927c, view, i7);
    }

    @Override
    public void d(View view, RectF rectF) {
        ((fh.g) this.f926b).i(rectF.left, rectF.top);
        View view2 = (View) ((WeakReference) this.f927c).get();
        if (view2 != null) {
            view2.invalidate();
        }
    }

    @Override
    public Object e(r7 r7Var) {
        String valueOf;
        switch (this.f925a) {
            case 8:
                String str = (String) this.f926b;
                Context context = (Context) r7Var.a(Context.class);
                switch (((n2.a0) this.f927c).f21088a) {
                    case 9:
                        ApplicationInfo applicationInfo = context.getApplicationInfo();
                        if (applicationInfo != null) {
                            valueOf = String.valueOf(applicationInfo.targetSdkVersion);
                            break;
                        }
                        valueOf = "";
                        break;
                    case 10:
                        valueOf = FirebaseCommonRegistrar.a(context);
                        break;
                    case 11:
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
                String str2 = (String) this.f926b;
                u9.a aVar = (u9.a) this.f927c;
                try {
                    Trace.beginSection(str2);
                    return aVar.f58577f.e(r7Var);
                } finally {
                    Trace.endSection();
                }
        }
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
        int i14 = this.f925a;
        Object obj = this.f927c;
        Object obj2 = this.f926b;
        int i15 = 0;
        switch (i14) {
            case 6:
                i8 i8Var = (i8) obj2;
                h8 h8Var = (h8) obj;
                o41 G = i8Var.f3737e2.G(i7 - 1);
                if (G != null) {
                    Object obj3 = G.H;
                    if (obj3 instanceof TL_stars.StarGift) {
                        TL_stars.StarGift starGift = (TL_stars.StarGift) obj3;
                        boolean z10 = G.f38097s;
                        if (!TextUtils.isEmpty(starGift.gift_address) && i8Var.d2 && !((org.telegram.messenger.h0) np.u1(i8Var.f30173a).A7.f26252x.f14030b).f24341c) {
                            alertDialog$Builder = new AlertDialog$Builder(0, i8Var.getContext(), i8Var.J0);
                            r42 = 0;
                            String N0 = hd.N0(2131749775, null);
                            t1 t1Var = alertDialog$Builder.f28777a;
                            t1Var.S = N0;
                            t1Var.U = hd.N0(2131749776, null);
                        } else if (z10 && (starGift instanceof TL_stars.TL_starGiftUnique)) {
                            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) G.H;
                            t1 t1Var2 = new t1(3, i8Var.getContext(), null);
                            t1Var2.r(400L);
                            long e11 = k10.i(i8Var.f30173a).e();
                            if (tL_starGiftUnique.resale_ton_only) {
                                bVar = cg.b.f5306b;
                            } else {
                                bVar = cg.b.f5305a;
                            }
                            y8.x(i8Var.f30173a, bVar).H(tL_starGiftUnique, e11, null, true, new d8(i8Var, t1Var2, bVar, tL_starGiftUnique, e11));
                            return;
                        } else {
                            if (!z10) {
                                ArrayList arrayList2 = h8Var.f3713b.f9552l;
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
                                if (savedStarGift != null && savedStarGift.can_craft_at > 0 && savedStarGift.can_craft_at > ConnectionsManager.getInstance(i8Var.f30173a).getCurrentTime()) {
                                    alertDialog$Builder = new AlertDialog$Builder(i8Var.getContext());
                                    r42 = 0;
                                    String N02 = hd.N0(2131749738, null);
                                    t1 t1Var3 = alertDialog$Builder.f28777a;
                                    t1Var3.S = N02;
                                    t1Var3.U = org.telegram.messenger.g0.W2(hd.a0(null, null, 2131749739, hd.x(savedStarGift.can_craft_at, true)));
                                }
                            }
                            i8Var.f3735b2.a(starGift);
                            i8Var.dismiss();
                            return;
                        }
                        f3.m(r42, 2131747637, alertDialog$Builder, r42);
                        return;
                    }
                    return;
                }
                return;
            default:
                k8 k8Var = (k8) obj2;
                Context context = (Context) obj;
                ArrayList arrayList3 = k8Var.M;
                a0.h hVar = k8Var.f14931b;
                hi.d8 d8Var = k8Var.f14940y;
                ArrayList arrayList4 = k8Var.f14932c;
                HashMap hashMap = k8Var.d;
                p8 p8Var = k8Var.f14930a0;
                m2 m2Var = p8Var.f30179c;
                if (i7 >= 0 && i7 < arrayList3.size()) {
                    y7 y7Var = (y7) arrayList3.get(i7);
                    int i17 = y7Var.f56634a;
                    if (i17 == 3) {
                        if (y7Var.f15809n && p8Var.A1) {
                            new t7(context, p8Var.f30173a, p8Var.F1, p8Var.n1, new b8(k8Var, 0), p8Var.J0).show();
                            return;
                        }
                        int i18 = y7Var.f15804i;
                        if (i18 == 1) {
                            if (p8Var.I1 == 1 || p8.K0(p8Var).isEmpty()) {
                                p8Var.H1 = 1;
                                p8Var.f15269m1.A(1);
                            }
                            p8Var.I1 = 1;
                            k8Var.g(true);
                            return;
                        } else if (i18 == 3) {
                            if (p8Var.I1 == 3 || (p8Var.f15274s1.isEmpty() && p8Var.f15275t1.isEmpty())) {
                                p8Var.H1 = 3;
                                p8Var.f15269m1.A(1);
                            }
                            p8Var.I1 = 3;
                            k8Var.g(true);
                            return;
                        } else if (i18 == 2) {
                            if (p8Var.I1 == 2) {
                                p8Var.H1 = 2;
                                p8Var.f15269m1.A(1);
                            }
                            p8Var.I1 = 2;
                            k8Var.g(true);
                            return;
                        } else if (i18 == 4) {
                            if (p8Var.I1 == 4) {
                                p8Var.H1 = 4;
                                p8Var.f15269m1.A(1);
                            }
                            p8Var.I1 = 4;
                            k8Var.g(true);
                            return;
                        } else {
                            if (i18 > 0) {
                                arrayList4.clear();
                                hashMap.clear();
                                p8Var.I1 = y7Var.f15804i;
                                d8Var.d.a();
                            } else {
                                TLRPC.Chat chat = y7Var.h;
                                if (chat != null) {
                                    long j3 = chat.f28434id;
                                    if (p8.L0(p8Var, chat) > 200) {
                                        try {
                                            k8Var.performHapticFeedback(3, 1);
                                        } catch (Throwable unused) {
                                        }
                                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, k8Var.getContext(), p8Var.J0);
                                        String N03 = hd.N0(2131749201, null);
                                        t1 t1Var4 = alertDialog$Builder2.f28777a;
                                        t1Var4.S = N03;
                                        t1Var4.U = hd.N0(2131749200, null);
                                        f3.m(null, 2131747637, alertDialog$Builder2, null);
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
                                        k8Var.j(true);
                                    } else {
                                        TLRPC.Chat O0 = np.u1(p8Var.f30173a).O0(Long.valueOf(j3));
                                        TLRPC.ChatFull P0 = np.u1(p8Var.f30173a).P0(j3);
                                        if (P0 != null && (chatParticipants = P0.participants) != null && (arrayList = chatParticipants.participants) != null && !arrayList.isEmpty() && P0.participants.participants.size() >= P0.participants_count - 1) {
                                            k8Var.e(j3, P0.participants);
                                        } else {
                                            t1 t1Var5 = k8Var.H;
                                            if (t1Var5 != null) {
                                                t1Var5.dismiss();
                                                k8Var.H = null;
                                            }
                                            k8Var.I = j3;
                                            t1 t1Var6 = new t1(3, k8Var.getContext(), p8Var.J0);
                                            k8Var.H = t1Var6;
                                            t1Var6.r(50L);
                                            ur a02 = ur.a0(p8Var.f30173a);
                                            a02.f27250a.c(new j2(k8Var, O0, a02, j3, 11));
                                        }
                                        if (!TextUtils.isEmpty(k8Var.J)) {
                                            d8Var.setText("");
                                            k8Var.J = null;
                                            k8Var.h(false);
                                        }
                                    }
                                } else {
                                    TLRPC.User user = y7Var.f15803g;
                                    if (user != null) {
                                        if (k8Var.f14929a == 0) {
                                            p8Var.I1 = 0;
                                        }
                                        long j10 = user.f28583id;
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
                                            if (!TextUtils.isEmpty(k8Var.J)) {
                                                d8Var.setText("");
                                                k8Var.J = null;
                                                k8Var.h(false);
                                            }
                                            hVar.k(Boolean.TRUE, j10);
                                        }
                                        arrayList4.clear();
                                        arrayList4.addAll(hashSet);
                                        k8Var.j(true);
                                    }
                                }
                            }
                            k8Var.g(true);
                            k8Var.f(true);
                            d8Var.M = true;
                            return;
                        }
                    } else if (i17 == 7) {
                        if (view instanceof n8) {
                            n8 n8Var = (n8) view;
                            n8Var.setChecked(!n8Var.d());
                            y7Var.f15806k = n8Var.d();
                            int i19 = y7Var.f15800c;
                            if (i19 == 0) {
                                boolean d = n8Var.d();
                                p8Var.f15279x1 = d;
                                if (p8Var.I1 == 4) {
                                    i15 = 1;
                                }
                                if (d) {
                                    lc lcVar = new lc(m2Var, p8Var.J0);
                                    if (i15 != 0) {
                                        i13 = 2131744426;
                                    } else {
                                        i13 = 2131744427;
                                    }
                                    gc G2 = lcVar.G(2131624056, 4, hd.N0(i13, null));
                                    G2.f35527j = 5000;
                                    G2.k(true);
                                    return;
                                }
                                lc lcVar2 = new lc(m2Var, p8Var.J0);
                                if (i15 != 0) {
                                    i12 = 2131744440;
                                } else {
                                    i12 = 2131744441;
                                }
                                gc G3 = lcVar2.G(2131624113, 4, hd.N0(i12, null));
                                G3.f35527j = 5000;
                                G3.k(true);
                                return;
                            } else if (i19 == 1) {
                                boolean d2 = n8Var.d();
                                p8Var.f15280y1 = d2;
                                boolean z11 = p8Var.n1 instanceof TLRPC.TL_inputPeerChannel;
                                if (d2) {
                                    lc lcVar3 = new lc(m2Var, p8Var.J0);
                                    if (z11) {
                                        i11 = 2131744464;
                                    } else {
                                        i11 = 2131744428;
                                    }
                                    gc G4 = lcVar3.G(2131624103, 4, hd.N0(i11, null));
                                    G4.f35527j = 5000;
                                    G4.k(true);
                                } else {
                                    lc lcVar4 = new lc(m2Var, p8Var.J0);
                                    if (z11) {
                                        i10 = 2131744465;
                                    } else {
                                        i10 = 2131744442;
                                    }
                                    gc G5 = lcVar4.G(2131624021, 4, hd.N0(i10, null));
                                    G5.f35527j = 5000;
                                    G5.k(true);
                                }
                                k8Var.h(true);
                                return;
                            } else if (i19 == 2) {
                                p8Var.f15278w1 = n8Var.d();
                                k8Var.h(true);
                                return;
                            } else {
                                return;
                            }
                        }
                        return;
                    } else if (i17 == 9) {
                        int i20 = y7Var.f15812q;
                        if (i20 == 0) {
                            r8 r8Var = p8Var.X1;
                            if (r8Var != null) {
                                r8Var.run();
                                return;
                            }
                            return;
                        } else if (i20 == 1) {
                            TLRPC.InputPeer inputPeer = p8Var.n1;
                            if (inputPeer != null) {
                                e10 = n5.n(inputPeer);
                            } else {
                                e10 = k10.i(p8Var.f30173a).e();
                            }
                            a70 G6 = a70.G(k8Var, p8Var.J0, view);
                            G6.c(2131232048, hd.N0(2131744542, null), new c4(k8Var, e10, 8), false);
                            G6.k();
                            a70.f(G6, np.u1(p8Var.f30173a).R1().B(e10, true), p8Var.f15277v1, false, null, new y1(19, k8Var, G6));
                            G6.a0();
                            return;
                        } else if (i20 == 5) {
                            Context context2 = k8Var.getContext();
                            int i21 = p8.Y1;
                            t1 t1Var7 = new t1(3, context2, p8Var.J0);
                            t1Var7.r(500L);
                            TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = new TL_phone.getGroupCallStreamRtmpUrl();
                            getgroupcallstreamrtmpurl.live_story = true;
                            TLRPC.InputPeer inputPeer2 = p8Var.n1;
                            if (inputPeer2 == null) {
                                inputPeer2 = new TLRPC.TL_inputPeerSelf();
                            }
                            getgroupcallstreamrtmpurl.peer = inputPeer2;
                            ConnectionsManager.getInstance(p8Var.f30173a).sendRequest(getgroupcallstreamrtmpurl, new bi.q1(k8Var, t1Var7, getgroupcallstreamrtmpurl, 9));
                            return;
                        } else if (i20 == 6) {
                            p8Var.B1 = false;
                            k8Var.h(true);
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
    public void g(hi.n8 n8Var, boolean z10, boolean z11, boolean z12, boolean z13, TLRPC.InputPeer inputPeer, int i7, hi.c cVar, hi.l lVar) {
        boolean z14;
        switch (this.f925a) {
            case 15:
                z3 z3Var = (z3) this.f926b;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.f927c;
                TL_stories.TL_stories_editStory tL_stories_editStory = new TL_stories.TL_stories_editStory();
                tL_stories_editStory.peer = np.u1(z3Var.f12891m2).l1(storyItem.dialogId);
                tL_stories_editStory.f28677id = storyItem.f28673id;
                tL_stories_editStory.flags |= 4;
                tL_stories_editStory.privacy_rules = n8Var.f15129b;
                ConnectionsManager.getInstance(z3Var.f12891m2).sendRequest(tL_stories_editStory, new k2(z3Var, cVar, storyItem, n8Var, 6));
                return;
            default:
                r3 r3Var = (r3) this.f926b;
                p8 p8Var = (p8) this.f927c;
                z3 z3Var2 = r3Var.f12532x;
                x3 x3Var = z3Var2.f12937y1;
                TL_stories.StoryItem storyItem2 = x3Var.f12765a;
                if (storyItem2 != null && storyItem2.pinned) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (z14 != z12) {
                    np.u1(z3Var2.f12891m2).R1().r0(z3Var2.l1, z3Var2.f12865f1, z12, null);
                }
                TL_stories.StoryItem storyItem3 = x3Var.f12765a;
                if (storyItem3 != null) {
                    TLRPC.MessageMedia messageMedia = storyItem3.media;
                    if (messageMedia instanceof TLRPC.TL_messageMediaVideoStream) {
                        TLRPC.InputGroupCall inputGroupCall = ((TLRPC.TL_messageMediaVideoStream) messageMedia).call;
                        TL_phone.toggleGroupCallSettings togglegroupcallsettings = new TL_phone.toggleGroupCallSettings();
                        togglegroupcallsettings.call = inputGroupCall;
                        togglegroupcallsettings.messages_enabled = Boolean.valueOf(z10);
                        togglegroupcallsettings.send_paid_messages_stars = Long.valueOf(i7);
                        ConnectionsManager.getInstance(z3Var2.f12891m2).sendRequest(togglegroupcallsettings, new o1(11, r3Var, p8Var));
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public void h(t1 t1Var, int i7) {
        switch (this.f925a) {
            case 2:
                bi.y yVar = (bi.y) this.f926b;
                bi.u uVar = (bi.u) this.f927c;
                try {
                    int parseInt = Integer.parseInt(uVar.getText().toString().trim());
                    yVar.h1(parseInt);
                    yVar.Y1.setValue(parseInt);
                    t1Var.dismiss();
                    return;
                } catch (Throwable th2) {
                    org.telegram.messenger.g0.D3(uVar);
                    a8.g(th2, true);
                    return;
                }
            case 3:
                t5 t5Var = (t5) this.f926b;
                y10 y10Var = (y10) this.f927c;
                String obj = t5Var.getText().toString();
                if (obj.length() > 0 && obj.length() <= 12) {
                    y10Var.a(obj);
                    t1Var.dismiss();
                    return;
                }
                org.telegram.messenger.g0.D3(t5Var);
                return;
            case 17:
                r3 r3Var = (r3) this.f926b;
                c1 c1Var = ((f9) this.f927c).B0;
                if (c1Var != null) {
                    if (!c1Var.f11845x) {
                        TL_phone.discardGroupCall discardgroupcall = new TL_phone.discardGroupCall();
                        discardgroupcall.call = c1Var.f11840f;
                        ConnectionsManager.getInstance(c1Var.f11839e).sendRequest(discardgroupcall, new x0(c1Var, 4));
                        c1Var.e();
                        return;
                    }
                    return;
                }
                z3.d0(r3Var.f12532x);
                return;
            case 19:
                h1 h1Var = (h1) this.f926b;
                h1Var.getClass();
                ((boolean[]) this.f927c)[0] = true;
                h1Var.Q();
                return;
            case 22:
                kg.v.e0((kg.v) this.f926b, (TL_account.TL_businessChatLink) this.f927c);
                return;
            default:
                h3.B0((h3) this.f926b, (TL_payments.connectedBotStarRef) this.f927c);
                return;
        }
    }

    @Override
    public void i(Object obj, e2.s sVar) {
        ((m2.b) obj).A((e2.c1) this.f927c, new ji.l(sVar, ((m2.d) this.f926b).f20519e));
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f925a) {
            case 27:
                ((m2.b) obj).r((m2.a) this.f926b, (x2.c0) this.f927c);
                return;
            default:
                ((m2.b) obj).onRenderedFirstFrame((m2.a) this.f926b);
                return;
        }
    }

    @Override
    public a70 j(f1 f1Var) {
        oi.o oVar = (oi.o) ((k8.a) this.f926b).f18215c;
        a70 a70Var = new a70(oVar, (h6) this.f927c, f1Var, false, false, true);
        oVar.I = a70Var;
        return a70Var;
    }

    @Override
    public void k(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((di.t) this.f926b).v0(false, 0L, tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.f927c);
    }

    @Override
    public void l(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        boolean z10;
        boolean z11;
        r6 r6Var = (r6) this.f926b;
        hi.e eVar = (hi.e) this.f927c;
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        long j3 = ((TL_stars.SavedStarGift) ((o41) obj).H).gift.f28663id;
        if (r6Var.f4055m1 == j3) {
            r6Var.f4055m1 = 0L;
        } else {
            r6Var.f4055m1 = j3;
        }
        if (r6Var.f4055m1 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        eVar.setEnabled(z10);
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            for (int i7 = 0; i7 < viewGroup.getChildCount(); i7++) {
                View childAt = viewGroup.getChildAt(i7);
                if (childAt instanceof ul0) {
                    ul0 ul0Var = (ul0) childAt;
                    if (r6Var.f4055m1 == ul0Var.getGiftId()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    ul0Var.b(z11, true);
                }
            }
        }
    }

    @Override
    public void m(Object obj, TLRPC.Document document, Boolean bool) {
        kg.n nVar = (kg.n) this.f926b;
        nVar.f18424x = false;
        org.telegram.messenger.g0.r(nVar.f18418e);
        kg.i iVar = nVar.f18420n;
        nVar.f18425y = document;
        iVar.setSticker(document);
        ((n8) ((View) this.f927c)).setValueSticker(document);
        nVar.j0(true);
    }

    @Override
    public void onCameraInit() {
        ci.b0 b0Var = (ci.b0) this.f926b;
        ((CameraView) this.f927c).animate().alpha(1.0f).setDuration(180L).start();
        if (!b0Var.W && !b0Var.f5592i0 && !b0Var.m0) {
            b0Var.f5592i0 = true;
            b0Var.f5591h0.postDelayed(b0Var.f5614z0, 150L);
        }
    }

    @Override
    public void onComplete(Task task) {
        ((h) this.f926b).a((Intent) this.f927c);
    }

    @Override
    public void onFailure(Exception e10) {
        String str;
        w0.i gVar;
        String str2;
        w0.d cVar;
        switch (this.f925a) {
            case 7:
                c1.f fVar = (c1.f) this.f926b;
                CancellationSignal cancellationSignal = (CancellationSignal) this.f927c;
                kotlin.jvm.internal.j.e(e10, "e");
                if ((e10 instanceof com.google.android.gms.common.api.f) && b1.d.f2866b.contains(Integer.valueOf(((com.google.android.gms.common.api.f) e10).getStatusCode()))) {
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
                    fVar.g().execute(new c1.b(fVar, gVar, 0));
                    return;
                }
                return;
            default:
                d1.e eVar = (d1.e) this.f926b;
                CancellationSignal cancellationSignal2 = (CancellationSignal) this.f927c;
                kotlin.jvm.internal.j.e(e10, "e");
                if ((e10 instanceof com.google.android.gms.common.api.f) && b1.d.f2866b.contains(Integer.valueOf(((com.google.android.gms.common.api.f) e10).getStatusCode()))) {
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
                    Executor executor = eVar.f7644g;
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
    public void s0(View view, float f10, float f11) {
        int i7 = this.f925a;
    }

    @Override
    public Object then(Task task) {
        k kVar = (k) this.f926b;
        String str = (String) this.f927c;
        synchronized (kVar) {
            ((a0.f) kVar.f959b).remove(str);
        }
        return task;
    }

    public g(m2.a aVar, Object obj, long j3) {
        this.f925a = 28;
        this.f926b = aVar;
        this.f927c = obj;
    }

    private final void n(View view, float f10, float f11) {
    }

    private final void o(View view, float f10, float f11) {
    }
}
