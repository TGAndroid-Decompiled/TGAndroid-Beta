package a1;

import ai.t6;
import ai.w1;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import b8.mf;
import ci.e9;
import com.google.android.gms.tasks.OnFailureListener;
import dh.n0;
import ii.a3;
import ii.v2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.j;
import org.telegram.messenger.bd;
import org.telegram.messenger.g0;
import org.telegram.messenger.h10;
import org.telegram.messenger.hi;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.i6;
import org.telegram.messenger.ii;
import org.telegram.messenger.k5;
import org.telegram.messenger.l10;
import org.telegram.messenger.lr;
import org.telegram.messenger.m5;
import org.telegram.messenger.n10;
import org.telegram.messenger.o10;
import org.telegram.messenger.pr;
import org.telegram.messenger.q1;
import org.telegram.messenger.wy;
import org.telegram.messenger.yy;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.o4;
import org.telegram.ui.ActionBar.p1;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.ActionBar.s1;
import org.telegram.ui.Components.ab0;
import org.telegram.ui.Components.an;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.cb0;
import org.telegram.ui.Components.fb0;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.gh;
import org.telegram.ui.Components.hb0;
import org.telegram.ui.Components.ox0;
import org.telegram.ui.Components.r4;
import org.telegram.ui.Components.rx0;
import org.telegram.ui.Components.t4;
import org.telegram.ui.Components.z7;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.g11;
import org.telegram.ui.gs;
import org.telegram.ui.h20;
import org.telegram.ui.i20;
import org.telegram.ui.i4;
import org.telegram.ui.m91;
import org.telegram.ui.n81;
import org.telegram.ui.nw;
import org.telegram.ui.q11;
import org.telegram.ui.uw;
import org.telegram.ui.vg0;
import org.telegram.ui.wm;
import org.telegram.ui.wy0;
import org.telegram.ui.x30;
import org.telegram.ui.xd0;
import z2.k;
public final class d implements OnFailureListener, q1, nw, p1, r4, ab0, ii, lr, o10, k {
    public final int f40a;
    public final Object f41b;
    public final Object f42c;
    public final Object d;
    public final Object f43e;

    public d(CancellationSignal cancellationSignal, e1.d dVar, Executor executor, v0.h hVar) {
        this.f40a = 3;
        this.f42c = cancellationSignal;
        this.f41b = dVar;
        this.d = executor;
        this.f43e = hVar;
    }

    @Override
    public boolean G() {
        switch (this.f40a) {
            case 4:
                return false;
            case 8:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void L(int i3, int i10, boolean z10) {
        TLRPC.BotInlineResult botInlineResult;
        switch (this.f40a) {
            case 6:
                wm.G0((wm) this.f41b, (TLRPC.TL_document) this.f42c, (String) this.d, this.f43e, z10, i3);
                return;
            case 10:
                an anVar = (an) this.f41b;
                anVar.f31924k0.c((TLRPC.TL_messageMediaPoll) this.f42c, anVar.P, anVar.f31929n1, (ArrayList) this.d, z10, i3, ((Long) this.f43e).longValue());
                anVar.f38416b.a(true);
                return;
            case 11:
                gs gsVar = (gs) this.f41b;
                TLRPC.Document document = (TLRPC.Document) this.f42c;
                TLRPC.BotInlineResult botInlineResult2 = (TLRPC.BotInlineResult) this.d;
                if (document != null) {
                    botInlineResult = document;
                } else {
                    botInlineResult = botInlineResult2;
                }
                gsVar.s(i3, i10, this.f43e, botInlineResult, z10);
                return;
            default:
                ((gs) this.f41b).l((TLRPC.Document) this.f42c, (String) this.d, this.f43e, z10, i3, i10);
                return;
        }
    }

    @Override
    public boolean N(uw uwVar) {
        switch (this.f40a) {
            case 4:
                return false;
            case 8:
                return false;
            default:
                return false;
        }
    }

    @Override
    public g9.s1 c(int r17, d2.o1 r18, int[] r19) {
        throw new UnsupportedOperationException("Method not decompiled: a1.d.c(int, d2.o1, int[]):g9.s1");
    }

    @Override
    public Object d(Number number, Object obj) {
        Context context = (Context) this.f41b;
        int[] iArr = (int[]) this.f42c;
        e6 e6Var = (e6) this.d;
        rx0 rx0Var = (rx0) this.f43e;
        Integer num = (Integer) number;
        Float f10 = (Float) obj;
        LinearLayout f11 = k5.f(context, 1);
        LinearLayout linearLayout = new LinearLayout(context);
        f11.addView(linearLayout, mf.t(-2, -2, 1, 0, 0, 0, 0));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(iArr[num.intValue() - 1]);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        linearLayout.addView(imageView, mf.o(24, 24));
        if (num.intValue() == 7) {
            for (int i3 = 0; i3 < 2; i3++) {
                ImageView imageView2 = new ImageView(context);
                imageView2.setImageResource(iArr[num.intValue() - 1]);
                imageView2.setScaleType(ImageView.ScaleType.CENTER);
                linearLayout.addView(imageView2, mf.o(24, 24));
            }
        }
        TextView textView = new TextView(context);
        textView.setTypeface(g0.o1("fonts/num.otf"));
        r6.V(textView, k6.f27988j5, e6Var);
        StringBuilder sb2 = new StringBuilder("x");
        int i10 = (f10.floatValue() > 0.0f ? 1 : (f10.floatValue() == 0.0f ? 0 : -1));
        Object obj2 = f10;
        if (i10 <= 0) {
            obj2 = "0";
        }
        sb2.append(obj2);
        textView.setText(sb2.toString());
        textView.setTextSize(1, 13.0f);
        textView.setGravity(17);
        f11.addView(textView, mf.k(0.0f, 3.0f, 0.0f, 0.0f, -1, -2));
        return new ox0(rx0Var, f11, false);
    }

    @Override
    public void g(s1 s1Var, int i3) {
        String str;
        int i10 = this.f40a;
        Object obj = this.f43e;
        Object obj2 = this.d;
        Object obj3 = this.f42c;
        Object obj4 = this.f41b;
        switch (i10) {
            case 5:
                ((i4) obj4).P((String) obj3, (String) obj2, (sf.b) obj);
                return;
            case 7:
                wm.z0((wm) obj4, (TLRPC.User) obj3, (AtomicBoolean) obj2, (TLRPC.TL_attachMenuBot) obj);
                return;
            case 14:
                String str2 = (String) obj;
                String str3 = LaunchActivity.E1;
                vg0 vg0Var = new vg0((LaunchActivity) obj4, (d2) obj3);
                vg0Var.N0((String) obj2, false);
                if (str2 != null) {
                    String[] split = str2.split(" ", 2);
                    String str4 = split[0];
                    if (split.length > 1) {
                        str = split[1];
                    } else {
                        str = null;
                    }
                    fb0 fb0Var = vg0Var.k1;
                    if (fb0Var != null) {
                        fb0Var.getEditText().setText(str4);
                    } else {
                        vg0Var.B1 = str4;
                    }
                    fb0 fb0Var2 = vg0Var.f50513l1;
                    if (fb0Var2 != null) {
                        fb0Var2.getEditText().setText(str);
                    } else {
                        vg0Var.C1 = str;
                    }
                }
                vg0Var.show();
                return;
            case 15:
                xd0.Z((xd0) obj4, (String) obj3, (String) obj2, (String) obj);
                return;
            case 16:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) obj4;
                notificationsCustomSettingsActivity.getClass();
                SharedPreferences.Editor edit = ((SharedPreferences) obj3).edit();
                edit.putBoolean((String) obj2, ((boolean[]) obj)[0]);
                edit.apply();
                notificationsCustomSettingsActivity.q0(true);
                notificationsCustomSettingsActivity.getNotificationsController().b0(notificationsCustomSettingsActivity.f41339s);
                return;
            default:
                m91 m91Var = (m91) obj4;
                HashSet hashSet = (HashSet) obj3;
                HashSet hashSet2 = new HashSet();
                m91Var.B0 = hashSet2;
                hashSet2.addAll(hashSet);
                m91Var.Z0(true, false);
                fc.a0(m91Var).U(bd.K0(hashSet.size(), "TopicsDeleted"), false, new n81(m91Var, 4), new wy0(m91Var, (ArrayList) obj2, (Runnable) obj)).j();
                m91Var.G0();
                s1Var.dismiss();
                return;
        }
    }

    @Override
    public void h(String str, ArrayList arrayList) {
        ArrayList arrayList2;
        ArrayList arrayList3;
        switch (this.f40a) {
            case 17:
                ArrayList arrayList4 = (ArrayList) this.f42c;
                ArrayList arrayList5 = (ArrayList) this.d;
                Runnable runnable = (Runnable) this.f43e;
                TLRPC.messages_AvailableEffects E0 = hp.s1(((g11) this.f41b).W).E0();
                HashSet hashSet = new HashSet();
                if (E0 != null) {
                    for (int i3 = 0; i3 < arrayList.size(); i3++) {
                        try {
                            if (!((hi) arrayList.get(i3)).f22931a.startsWith("animated_")) {
                                String c2 = i6.c(((hi) arrayList.get(i3)).f22931a);
                                for (int i10 = 0; i10 < E0.effects.size(); i10++) {
                                    TLRPC.TL_availableEffect tL_availableEffect = E0.effects.get(i10);
                                    if (!hashSet.contains(Long.valueOf(tL_availableEffect.f27032id)) && (tL_availableEffect.emoticon.contains(c2) || c2.contains(tL_availableEffect.emoticon))) {
                                        if (tL_availableEffect.effect_animation_id == 0) {
                                            arrayList2 = arrayList4;
                                        } else {
                                            arrayList2 = arrayList5;
                                        }
                                        arrayList2.add(n0.e(tL_availableEffect));
                                        hashSet.add(Long.valueOf(tL_availableEffect.f27032id));
                                    }
                                }
                            }
                        } catch (Exception unused) {
                        }
                    }
                }
                runnable.run();
                return;
            default:
                HashMap hashMap = (HashMap) this.f41b;
                HashMap hashMap2 = (HashMap) this.f42c;
                ArrayList arrayList6 = (ArrayList) this.d;
                Runnable runnable2 = (Runnable) this.f43e;
                int size = arrayList.size();
                for (int i11 = 0; i11 < size; i11++) {
                    String str2 = ((hi) arrayList.get(i11)).f22931a;
                    if (hashMap != null) {
                        arrayList3 = (ArrayList) hashMap.get(str2);
                    } else {
                        arrayList3 = null;
                    }
                    if (arrayList3 != null && !arrayList3.isEmpty() && !hashMap2.containsKey(arrayList3)) {
                        hashMap2.put(arrayList3, str2);
                        arrayList6.add(arrayList3);
                    }
                }
                runnable2.run();
                return;
        }
    }

    @Override
    public void k(e5.f fVar, List list) {
        switch (this.f40a) {
            case 1:
                g0.h3(new t6((Object) list, (Object) ((n10) this.f41b), (Object) ((TLRPC.TL_inputStorePaymentStarsTopup) this.f42c), (Object) ((TL_stars.TL_starsTopupOption) this.d), (Object) ((Activity) this.f43e), 6));
                return;
            default:
                g0.h3(new w1((e9) this.f41b, list, (org.telegram.ui.Wallet.s1) this.f42c, (TLRPC.TL_inputStorePaymentStarsGiveaway) this.d, fVar, (Activity) this.f43e, 3));
                return;
        }
    }

    @Override
    public void l(cb0 cb0Var, int i3) {
        x30 x30Var = (x30) this.f41b;
        cb0 cb0Var2 = (cb0) this.f42c;
        h20 h20Var = (h20) this.d;
        i20 i20Var = (i20) this.f43e;
        try {
            x30Var.f28589c.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        t4.g(x30Var.L1, x30Var.K1, 0L, 604800L, 2, cb0Var2, h20Var, i20Var);
    }

    @Override
    public void onFailure(Exception e10) {
        switch (this.f40a) {
            case 0:
                CredentialProviderPlayServicesImpl.runFallbackClearCredFlow$lambda$27((CredentialProviderPlayServicesImpl) this.f41b, (CancellationSignal) this.f42c, (Executor) this.d, (v0.h) this.f43e, e10);
                return;
            default:
                j.e(e10, "e");
                b1.b bVar = new b1.b((e1.d) this.f41b, e10, (Executor) this.d, (v0.h) this.f43e);
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!h.a((CancellationSignal) this.f42c)) {
                    bVar.invoke();
                    return;
                }
                return;
        }
    }

    @Override
    public void run(long j10) {
        q11 q11Var = (q11) this.f41b;
        TLRPC.User user = (TLRPC.User) this.f42c;
        TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP = (TLRPC.InputCheckPasswordSRP) this.d;
        TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f43e;
        if (j10 != 0) {
            q11Var.Q1 = hp.s1(q11Var.f28583a).M0(Long.valueOf(j10));
            q11Var.e1(user, inputCheckPasswordSRP, twoStepVerificationActivity);
            return;
        }
        q11Var.getClass();
    }

    @Override
    public boolean y(uw uwVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i3, int i10, m91 m91Var) {
        String H;
        long j10;
        TLRPC.TL_document tL_document;
        int i11 = this.f40a;
        Object obj = this.f43e;
        Object obj2 = this.d;
        Object obj3 = this.f42c;
        Object obj4 = this.f41b;
        switch (i11) {
            case 4:
                TLRPC.User user = (TLRPC.User) obj3;
                String str = (String) obj2;
                hb0 hb0Var = (hb0) obj;
                a3 a3Var = ((v2) obj4).d;
                long j11 = ((pr) arrayList.get(0)).f24797a;
                Bundle k10 = g.k("scrollToTopOnResume", true);
                if (m5.C(j11)) {
                    k10.putInt("enc_id", (int) (j11 & 4294967295L));
                } else if (m5.E(j11)) {
                    k10.putLong("user_id", j11);
                } else {
                    k10.putLong("chat_id", -j11);
                }
                k10.putString("start_text", "@" + l10.n(user) + " " + str);
                Activity activity = a3Var.m0;
                if (activity instanceof LaunchActivity) {
                    d2 lastFragment = ((LaunchActivity) activity).M().getLastFragment();
                    if (hp.s1(a3Var.I).E(k10, lastFragment, null, null)) {
                        hb0Var.dismiss();
                        a3Var.f14801e0 = true;
                        g0.r(a3Var.f14821v0);
                        a3Var.E.h();
                        hs.f(a3Var.I).n(a3Var, 114);
                        hs.e().n(a3Var, 264);
                        hs.f(a3Var.I).n(a3Var, 234);
                        if (!a3Var.R0) {
                            super/*android.app.Dialog*/.dismiss();
                            a3Var.R0 = true;
                        }
                        o4 o4Var = new o4(new wm(k10));
                        o4Var.f28396b = true;
                        lastFragment.presentFragment(o4Var);
                    }
                }
                return true;
            case 8:
                z7 z7Var = (z7) obj4;
                ArrayList arrayList2 = (ArrayList) obj3;
                TLRPC.TL_document tL_document2 = (TLRPC.TL_document) obj2;
                zi ziVar = (zi) obj;
                if (arrayList.size() <= 1 && ((pr) arrayList.get(0)).f24797a != h10.i(z7Var.f28583a).e() && charSequence == null && arrayList2 != null) {
                    pr prVar = (pr) arrayList.get(0);
                    long j12 = prVar.f24797a;
                    Bundle k11 = g.k("scrollToTopOnResume", true);
                    if (m5.C(j12)) {
                        k11.putInt("enc_id", (int) (j12 & 4294967295L));
                    } else if (m5.E(j12)) {
                        k11.putLong("user_id", j12);
                    } else {
                        k11.putLong("chat_id", -j12);
                    }
                    wm wmVar = new wm(k11);
                    if (prVar.f24798b != 0) {
                        rg.c.a(wmVar, prVar);
                    }
                    if (z7Var.f40975x2.u0(wmVar, true, false)) {
                        wmVar.dc(arrayList2);
                        if (prVar.f24798b != 0) {
                            uwVar.removeSelfFromStack();
                        }
                    } else {
                        uwVar.finishFragment();
                    }
                } else {
                    int i12 = 0;
                    while (i12 < arrayList.size()) {
                        long j13 = ((pr) arrayList.get(i12)).f24797a;
                        if (charSequence != null) {
                            j10 = j13;
                            yy.C(z7Var.f28583a).r0(wy.b(charSequence.toString(), j10, null, null, null, true, null, null, null, true, 0, 0, null, false));
                        } else {
                            j10 = j13;
                        }
                        if (arrayList2 != null) {
                            yy.C(z7Var.f28583a).q0(arrayList2, j10, false, false, true, 0, 0, null, -1, 0L, 0L, null);
                            tL_document = tL_document2;
                        } else {
                            tL_document = tL_document2;
                            yy.C(z7Var.f28583a).r0(wy.e(tL_document, null, ziVar.f26868k.attachPath, j10, null, null, null, null, null, z11, i3, 0, 0, z7Var.f40955n2, false));
                        }
                        i12++;
                        tL_document2 = tL_document;
                    }
                    uwVar.finishFragment();
                    d2 Q = LaunchActivity.Q();
                    if (Q != null) {
                        fc a02 = fc.a0(Q);
                        if (arrayList.size() == 1 && ((pr) arrayList.get(0)).f24797a == h10.i(z7Var.f28583a).e()) {
                            H = bd.M0(2131750506, null);
                        } else if (arrayList.size() == 1 && ((pr) arrayList.get(0)).f24797a > 0) {
                            H = bd.a0(null, null, 2131750505, m5.t(((pr) arrayList.get(0)).f24797a));
                        } else if (arrayList.size() == 1 && ((pr) arrayList.get(0)).f24797a < 0) {
                            H = bd.a0(null, null, 2131750510, m5.t(((pr) arrayList.get(0)).f24797a));
                        } else {
                            H = bd.H(',', "FwdMessageToManyChats", arrayList.size());
                        }
                        a02.Q(2131624028, 36, H).j();
                    }
                }
                return true;
            default:
                TLRPC.User user2 = (TLRPC.User) obj3;
                String str2 = (String) obj2;
                hb0 hb0Var2 = (hb0) obj;
                bi biVar = ((gh) obj4).f34095e;
                long j14 = ((pr) arrayList.get(0)).f24797a;
                Bundle k12 = g.k("scrollToTopOnResume", true);
                if (m5.C(j14)) {
                    k12.putInt("enc_id", (int) (j14 & 4294967295L));
                } else if (m5.E(j14)) {
                    k12.putLong("user_id", j14);
                } else {
                    k12.putLong("chat_id", -j14);
                }
                k12.putString("start_text", "@" + l10.n(user2) + " " + str2);
                d2 d2Var = biVar.X1;
                if (hp.s1(biVar.E3).E(k12, d2Var, null, null)) {
                    hb0Var2.dismiss();
                    biVar.a(true);
                    o4 o4Var2 = new o4(new wm(k12));
                    o4Var2.f28396b = true;
                    d2Var.presentFragment(o4Var2);
                }
                return true;
        }
    }

    public d(Object obj, Object obj2, Object obj3, Object obj4, int i3) {
        this.f40a = i3;
        this.f41b = obj;
        this.f42c = obj2;
        this.d = obj3;
        this.f43e = obj4;
    }
}
