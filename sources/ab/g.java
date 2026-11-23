package ab;

import a8.r7;
import ai.r1;
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
import bi.e4;
import bi.g8;
import bi.k8;
import bi.l8;
import bi.o1;
import bi.p6;
import bi.u6;
import bi.w5;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseCommonRegistrar;
import di.i2;
import di.m4;
import di.y8;
import e2.c1;
import fi.f9;
import fi.r3;
import fi.x0;
import fi.x3;
import fi.z3;
import hi.c8;
import hi.e8;
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
import ki.h3;
import oi.e1;
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
import org.telegram.ui.s01;
import org.telegram.ui.ul0;
public final class g implements OnCompleteListener, Continuation, q1, m4, w10, rj0, OnFailureListener, u9.d, s01, CameraView.CameraViewDelegate, jh.i, oa1, w7, u10, na0, sj0, h2.p, h2.o, oi.k0 {
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
        p6 p6Var = (p6) this.f926b;
        gq0 gq0Var = p6Var.f3966a;
        p6Var.f3969e.f9515l.remove((TL_stars.SavedStarGift) this.f927c);
        p6Var.f(true);
        int i7 = p6Var.f3967b;
        if (j3 == k10.i(i7).e()) {
            lc b02 = lc.b0(gq0Var.f4148a);
            TLRPC.Document document = tL_starGiftUnique.getDocument();
            String N0 = hd.N0(2131752875, null);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(tL_starGiftUnique.title);
            sb2.append(" #");
            gc O = b02.O(document, N0, hd.a0(null, null, 2131752876, i5.c.l(tL_starGiftUnique.num, ',', sb2)));
            O.f35497r = false;
            O.j();
        } else {
            gc O2 = lc.b0(gq0Var.f4148a).O(tL_starGiftUnique.getDocument(), hd.N0(2131752873, null), hd.a0(null, null, 2131752874, n5.s(i7, j3)));
            O2.f35497r = false;
            O2.j();
        }
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (launchActivity != null) {
            launchActivity.f43118w0.c(true);
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
                switch (((n2.a0) this.f927c).f21054a) {
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
                    return aVar.f58542f.e(r7Var);
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
                l8 l8Var = (l8) obj2;
                k8 k8Var = (k8) obj;
                o41 G = l8Var.f3813e2.G(i7 - 1);
                if (G != null) {
                    Object obj3 = G.H;
                    if (obj3 instanceof TL_stars.StarGift) {
                        TL_stars.StarGift starGift = (TL_stars.StarGift) obj3;
                        boolean z10 = G.f38064s;
                        if (!TextUtils.isEmpty(starGift.gift_address) && l8Var.d2 && !((org.telegram.messenger.h0) np.u1(l8Var.f30139a).A7.f26216x.f13993b).f24305c) {
                            alertDialog$Builder = new AlertDialog$Builder(0, l8Var.getContext(), l8Var.J0);
                            r42 = 0;
                            String N0 = hd.N0(2131749775, null);
                            t1 t1Var = alertDialog$Builder.f28743a;
                            t1Var.S = N0;
                            t1Var.U = hd.N0(2131749776, null);
                        } else if (z10 && (starGift instanceof TL_stars.TL_starGiftUnique)) {
                            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) G.H;
                            t1 t1Var2 = new t1(3, l8Var.getContext(), null);
                            t1Var2.r(400L);
                            long e11 = k10.i(l8Var.f30139a).e();
                            if (tL_starGiftUnique.resale_ton_only) {
                                bVar = cg.b.f5269b;
                            } else {
                                bVar = cg.b.f5268a;
                            }
                            y8.x(l8Var.f30139a, bVar).H(tL_starGiftUnique, e11, null, true, new g8(l8Var, t1Var2, bVar, tL_starGiftUnique, e11));
                            return;
                        } else {
                            if (!z10) {
                                ArrayList arrayList2 = k8Var.f3765b.f9515l;
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
                                if (savedStarGift != null && savedStarGift.can_craft_at > 0 && savedStarGift.can_craft_at > ConnectionsManager.getInstance(l8Var.f30139a).getCurrentTime()) {
                                    alertDialog$Builder = new AlertDialog$Builder(l8Var.getContext());
                                    r42 = 0;
                                    String N02 = hd.N0(2131749738, null);
                                    t1 t1Var3 = alertDialog$Builder.f28743a;
                                    t1Var3.S = N02;
                                    t1Var3.U = org.telegram.messenger.g0.W2(hd.a0(null, null, 2131749739, hd.x(savedStarGift.can_craft_at, true)));
                                }
                            }
                            l8Var.f3811b2.a(starGift);
                            l8Var.dismiss();
                            return;
                        }
                        f3.m(r42, 2131747637, alertDialog$Builder, r42);
                        return;
                    }
                    return;
                }
                return;
            default:
                hi.l8 l8Var2 = (hi.l8) obj2;
                Context context = (Context) obj;
                ArrayList arrayList3 = l8Var2.M;
                a0.h hVar = l8Var2.f14943b;
                e8 e8Var = l8Var2.f14952y;
                ArrayList arrayList4 = l8Var2.f14944c;
                HashMap hashMap = l8Var2.d;
                q8 q8Var = l8Var2.f14942a0;
                m2 m2Var = q8Var.f30145c;
                if (i7 >= 0 && i7 < arrayList3.size()) {
                    z7 z7Var = (z7) arrayList3.get(i7);
                    int i17 = z7Var.f56599a;
                    if (i17 == 3) {
                        if (z7Var.f15822n && q8Var.A1) {
                            new u7(context, q8Var.f30139a, q8Var.F1, q8Var.n1, new c8(l8Var2, 0), q8Var.J0).show();
                            return;
                        }
                        int i18 = z7Var.f15817i;
                        if (i18 == 1) {
                            if (q8Var.I1 == 1 || q8.K0(q8Var).isEmpty()) {
                                q8Var.H1 = 1;
                                q8Var.f15242m1.A(1);
                            }
                            q8Var.I1 = 1;
                            l8Var2.g(true);
                            return;
                        } else if (i18 == 3) {
                            if (q8Var.I1 == 3 || (q8Var.f15247s1.isEmpty() && q8Var.f15248t1.isEmpty())) {
                                q8Var.H1 = 3;
                                q8Var.f15242m1.A(1);
                            }
                            q8Var.I1 = 3;
                            l8Var2.g(true);
                            return;
                        } else if (i18 == 2) {
                            if (q8Var.I1 == 2) {
                                q8Var.H1 = 2;
                                q8Var.f15242m1.A(1);
                            }
                            q8Var.I1 = 2;
                            l8Var2.g(true);
                            return;
                        } else if (i18 == 4) {
                            if (q8Var.I1 == 4) {
                                q8Var.H1 = 4;
                                q8Var.f15242m1.A(1);
                            }
                            q8Var.I1 = 4;
                            l8Var2.g(true);
                            return;
                        } else {
                            if (i18 > 0) {
                                arrayList4.clear();
                                hashMap.clear();
                                q8Var.I1 = z7Var.f15817i;
                                e8Var.d.a();
                            } else {
                                TLRPC.Chat chat = z7Var.h;
                                if (chat != null) {
                                    long j3 = chat.f28398id;
                                    if (q8.L0(q8Var, chat) > 200) {
                                        try {
                                            l8Var2.performHapticFeedback(3, 1);
                                        } catch (Throwable unused) {
                                        }
                                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, l8Var2.getContext(), q8Var.J0);
                                        String N03 = hd.N0(2131749201, null);
                                        t1 t1Var4 = alertDialog$Builder2.f28743a;
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
                                        l8Var2.j(true);
                                    } else {
                                        TLRPC.Chat O0 = np.u1(q8Var.f30139a).O0(Long.valueOf(j3));
                                        TLRPC.ChatFull P0 = np.u1(q8Var.f30139a).P0(j3);
                                        if (P0 != null && (chatParticipants = P0.participants) != null && (arrayList = chatParticipants.participants) != null && !arrayList.isEmpty() && P0.participants.participants.size() >= P0.participants_count - 1) {
                                            l8Var2.e(j3, P0.participants);
                                        } else {
                                            t1 t1Var5 = l8Var2.H;
                                            if (t1Var5 != null) {
                                                t1Var5.dismiss();
                                                l8Var2.H = null;
                                            }
                                            l8Var2.I = j3;
                                            t1 t1Var6 = new t1(3, l8Var2.getContext(), q8Var.J0);
                                            l8Var2.H = t1Var6;
                                            t1Var6.r(50L);
                                            ur a02 = ur.a0(q8Var.f30139a);
                                            a02.f27214a.c(new i2(l8Var2, O0, a02, j3, 11));
                                        }
                                        if (!TextUtils.isEmpty(l8Var2.J)) {
                                            e8Var.setText("");
                                            l8Var2.J = null;
                                            l8Var2.h(false);
                                        }
                                    }
                                } else {
                                    TLRPC.User user = z7Var.f15816g;
                                    if (user != null) {
                                        if (l8Var2.f14941a == 0) {
                                            q8Var.I1 = 0;
                                        }
                                        long j10 = user.f28547id;
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
                                            if (!TextUtils.isEmpty(l8Var2.J)) {
                                                e8Var.setText("");
                                                l8Var2.J = null;
                                                l8Var2.h(false);
                                            }
                                            hVar.k(Boolean.TRUE, j10);
                                        }
                                        arrayList4.clear();
                                        arrayList4.addAll(hashSet);
                                        l8Var2.j(true);
                                    }
                                }
                            }
                            l8Var2.g(true);
                            l8Var2.f(true);
                            e8Var.M = true;
                            return;
                        }
                    } else if (i17 == 7) {
                        if (view instanceof n8) {
                            n8 n8Var = (n8) view;
                            n8Var.setChecked(!n8Var.d());
                            z7Var.f15819k = n8Var.d();
                            int i19 = z7Var.f15813c;
                            if (i19 == 0) {
                                boolean d = n8Var.d();
                                q8Var.f15252x1 = d;
                                if (q8Var.I1 == 4) {
                                    i15 = 1;
                                }
                                if (d) {
                                    lc lcVar = new lc(m2Var, q8Var.J0);
                                    if (i15 != 0) {
                                        i13 = 2131744428;
                                    } else {
                                        i13 = 2131744429;
                                    }
                                    gc G2 = lcVar.G(2131624056, 4, hd.N0(i13, null));
                                    G2.f35489j = 5000;
                                    G2.k(true);
                                    return;
                                }
                                lc lcVar2 = new lc(m2Var, q8Var.J0);
                                if (i15 != 0) {
                                    i12 = 2131744442;
                                } else {
                                    i12 = 2131744443;
                                }
                                gc G3 = lcVar2.G(2131624113, 4, hd.N0(i12, null));
                                G3.f35489j = 5000;
                                G3.k(true);
                                return;
                            } else if (i19 == 1) {
                                boolean d2 = n8Var.d();
                                q8Var.f15253y1 = d2;
                                boolean z11 = q8Var.n1 instanceof TLRPC.TL_inputPeerChannel;
                                if (d2) {
                                    lc lcVar3 = new lc(m2Var, q8Var.J0);
                                    if (z11) {
                                        i11 = 2131744466;
                                    } else {
                                        i11 = 2131744430;
                                    }
                                    gc G4 = lcVar3.G(2131624103, 4, hd.N0(i11, null));
                                    G4.f35489j = 5000;
                                    G4.k(true);
                                } else {
                                    lc lcVar4 = new lc(m2Var, q8Var.J0);
                                    if (z11) {
                                        i10 = 2131744467;
                                    } else {
                                        i10 = 2131744444;
                                    }
                                    gc G5 = lcVar4.G(2131624021, 4, hd.N0(i10, null));
                                    G5.f35489j = 5000;
                                    G5.k(true);
                                }
                                l8Var2.h(true);
                                return;
                            } else if (i19 == 2) {
                                q8Var.f15251w1 = n8Var.d();
                                l8Var2.h(true);
                                return;
                            } else {
                                return;
                            }
                        }
                        return;
                    } else if (i17 == 9) {
                        int i20 = z7Var.f15825q;
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
                                e10 = n5.n(inputPeer);
                            } else {
                                e10 = k10.i(q8Var.f30139a).e();
                            }
                            a70 G6 = a70.G(l8Var2, q8Var.J0, view);
                            G6.c(2131232048, hd.N0(2131744544, null), new e4(l8Var2, e10, 8), false);
                            G6.k();
                            a70.f(G6, np.u1(q8Var.f30139a).R1().B(e10, true), q8Var.f15250v1, false, null, new r1(19, l8Var2, G6));
                            G6.a0();
                            return;
                        } else if (i20 == 5) {
                            Context context2 = l8Var2.getContext();
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
                            ConnectionsManager.getInstance(q8Var.f30139a).sendRequest(getgroupcallstreamrtmpurl, new bi.q1(l8Var2, t1Var7, getgroupcallstreamrtmpurl, 9));
                            return;
                        } else if (i20 == 6) {
                            q8Var.B1 = false;
                            l8Var2.h(true);
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
    public void g(Object obj, e2.s sVar) {
        ((m2.b) obj).A((c1) this.f927c, new ji.k(sVar, ((m2.d) this.f926b).f20485e));
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
                w5 w5Var = (w5) this.f926b;
                y10 y10Var = (y10) this.f927c;
                String obj = w5Var.getText().toString();
                if (obj.length() > 0 && obj.length() <= 12) {
                    y10Var.a(obj);
                    t1Var.dismiss();
                    return;
                }
                org.telegram.messenger.g0.D3(w5Var);
                return;
            case 17:
                r3 r3Var = (r3) this.f926b;
                fi.c1 c1Var = ((f9) this.f927c).B0;
                if (c1Var != null) {
                    if (!c1Var.f11794x) {
                        TL_phone.discardGroupCall discardgroupcall = new TL_phone.discardGroupCall();
                        discardgroupcall.call = c1Var.f11789f;
                        ConnectionsManager.getInstance(c1Var.f11788e).sendRequest(discardgroupcall, new x0(c1Var, 4));
                        c1Var.e();
                        return;
                    }
                    return;
                }
                z3.d0(r3Var.f12493x);
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
    public void i(Object obj, TLRPC.Document document, Boolean bool) {
        kg.n nVar = (kg.n) this.f926b;
        nVar.f18391x = false;
        org.telegram.messenger.g0.r(nVar.f18385e);
        kg.i iVar = nVar.f18387n;
        nVar.f18392y = document;
        iVar.setSticker(document);
        ((n8) ((View) this.f927c)).setValueSticker(document);
        nVar.j0(true);
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
    public void j(o8 o8Var, boolean z10, boolean z11, boolean z12, boolean z13, TLRPC.InputPeer inputPeer, int i7, hi.q1 q1Var, hi.b0 b0Var) {
        boolean z14;
        switch (this.f925a) {
            case 15:
                z3 z3Var = (z3) this.f926b;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.f927c;
                TL_stories.TL_stories_editStory tL_stories_editStory = new TL_stories.TL_stories_editStory();
                tL_stories_editStory.peer = np.u1(z3Var.f12842m2).l1(storyItem.dialogId);
                tL_stories_editStory.f28641id = storyItem.f28637id;
                tL_stories_editStory.flags |= 4;
                tL_stories_editStory.privacy_rules = o8Var.f15151b;
                ConnectionsManager.getInstance(z3Var.f12842m2).sendRequest(tL_stories_editStory, new bi.m2(z3Var, q1Var, storyItem, o8Var, 6));
                return;
            default:
                r3 r3Var = (r3) this.f926b;
                q8 q8Var = (q8) this.f927c;
                z3 z3Var2 = r3Var.f12493x;
                x3 x3Var = z3Var2.f12888y1;
                TL_stories.StoryItem storyItem2 = x3Var.f12715a;
                if (storyItem2 != null && storyItem2.pinned) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (z14 != z12) {
                    np.u1(z3Var2.f12842m2).R1().r0(z3Var2.l1, z3Var2.f12816f1, z12, null);
                }
                TL_stories.StoryItem storyItem3 = x3Var.f12715a;
                if (storyItem3 != null) {
                    TLRPC.MessageMedia messageMedia = storyItem3.media;
                    if (messageMedia instanceof TLRPC.TL_messageMediaVideoStream) {
                        TLRPC.InputGroupCall inputGroupCall = ((TLRPC.TL_messageMediaVideoStream) messageMedia).call;
                        TL_phone.toggleGroupCallSettings togglegroupcallsettings = new TL_phone.toggleGroupCallSettings();
                        togglegroupcallsettings.call = inputGroupCall;
                        togglegroupcallsettings.messages_enabled = Boolean.valueOf(z10);
                        togglegroupcallsettings.send_paid_messages_stars = Long.valueOf(i7);
                        ConnectionsManager.getInstance(z3Var2.f12842m2).sendRequest(togglegroupcallsettings, new o1(11, r3Var, q8Var));
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public void k(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((di.t) this.f926b).v0(false, 0L, tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.f927c);
    }

    @Override
    public void l(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        boolean z10;
        boolean z11;
        u6 u6Var = (u6) this.f926b;
        hi.d dVar = (hi.d) this.f927c;
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        long j3 = ((TL_stars.SavedStarGift) ((o41) obj).H).gift.f28627id;
        if (u6Var.f4126m1 == j3) {
            u6Var.f4126m1 = 0L;
        } else {
            u6Var.f4126m1 = j3;
        }
        if (u6Var.f4126m1 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        dVar.setEnabled(z10);
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            for (int i7 = 0; i7 < viewGroup.getChildCount(); i7++) {
                View childAt = viewGroup.getChildAt(i7);
                if (childAt instanceof ul0) {
                    ul0 ul0Var = (ul0) childAt;
                    if (u6Var.f4126m1 == ul0Var.getGiftId()) {
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
    public a70 m(e1 e1Var) {
        oi.o oVar = (oi.o) ((k8.a) this.f926b).f18178c;
        a70 a70Var = new a70(oVar, (h6) this.f927c, e1Var, false, false, true);
        oVar.I = a70Var;
        return a70Var;
    }

    @Override
    public void onCameraInit() {
        ci.b0 b0Var = (ci.b0) this.f926b;
        ((CameraView) this.f927c).animate().alpha(1.0f).setDuration(180L).start();
        if (!b0Var.W && !b0Var.f5555i0 && !b0Var.m0) {
            b0Var.f5555i0 = true;
            b0Var.f5554h0.postDelayed(b0Var.f5577z0, 150L);
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
                if ((e10 instanceof com.google.android.gms.common.api.f) && b1.d.f2817b.contains(Integer.valueOf(((com.google.android.gms.common.api.f) e10).getStatusCode()))) {
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
                d1.e eVar = (d1.e) this.f926b;
                CancellationSignal cancellationSignal2 = (CancellationSignal) this.f927c;
                kotlin.jvm.internal.j.e(e10, "e");
                if ((e10 instanceof com.google.android.gms.common.api.f) && b1.d.f2817b.contains(Integer.valueOf(((com.google.android.gms.common.api.f) e10).getStatusCode()))) {
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
                    Executor executor = eVar.f7607g;
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
