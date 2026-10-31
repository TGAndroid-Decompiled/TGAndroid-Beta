package a1;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import com.google.android.gms.tasks.OnFailureListener;
import ih.s;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import kotlin.jvm.internal.i;
import org.telegram.messenger.cd;
import org.telegram.messenger.cs;
import org.telegram.messenger.d20;
import org.telegram.messenger.gs;
import org.telegram.messenger.h20;
import org.telegram.messenger.i0;
import org.telegram.messenger.j20;
import org.telegram.messenger.jj;
import org.telegram.messenger.k20;
import org.telegram.messenger.k6;
import org.telegram.messenger.m5;
import org.telegram.messenger.o5;
import org.telegram.messenger.oz;
import org.telegram.messenger.qi;
import org.telegram.messenger.qz;
import org.telegram.messenger.ri;
import org.telegram.messenger.t1;
import org.telegram.messenger.vp;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.ActionBar.w4;
import org.telegram.ui.ActionBar.x1;
import org.telegram.ui.Components.ac0;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.dc0;
import org.telegram.ui.Components.fc0;
import org.telegram.ui.Components.gh;
import org.telegram.ui.Components.jn;
import org.telegram.ui.Components.q4;
import org.telegram.ui.Components.s4;
import org.telegram.ui.Components.ty0;
import org.telegram.ui.Components.w7;
import org.telegram.ui.Components.wy0;
import org.telegram.ui.Components.yb0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.ay;
import org.telegram.ui.b50;
import org.telegram.ui.gi0;
import org.telegram.ui.h4;
import org.telegram.ui.hf0;
import org.telegram.ui.i31;
import org.telegram.ui.jt;
import org.telegram.ui.k41;
import org.telegram.ui.l30;
import org.telegram.ui.m30;
import org.telegram.ui.na1;
import org.telegram.ui.pb1;
import org.telegram.ui.s31;
import org.telegram.ui.un;
import org.telegram.ui.ux;
import org.telegram.ui.v8;
import rh.e6;
import rh.r4;
import sg.o0;
import w7.b6;
import x2.l;
import xh.h2;
import xh.m2;
public final class d implements OnFailureListener, u1, q4, ux, yb0, ri, cs, k20, t1, l {
    public final int f36a;
    public final Object f37b;
    public final Object f38c;
    public final Object d;
    public final Object e;

    public d(CancellationSignal cancellationSignal, e1.d dVar, Executor executor, v0.h hVar) {
        this.f36a = 1;
        this.f37b = cancellationSignal;
        this.e = dVar;
        this.f38c = executor;
        this.d = hVar;
    }

    @Override
    public boolean G() {
        switch (this.f36a) {
            case 5:
                return false;
            case 6:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void K(int i10, int i11, boolean z10) {
        TLRPC.BotInlineResult botInlineResult;
        switch (this.f36a) {
            case 3:
                un.K0((un) this.e, (TLRPC.TL_document) this.f37b, (String) this.f38c, this.d, z10, i10);
                return;
            case 7:
                jn jnVar = (jn) this.e;
                jnVar.f27428j0.e((TLRPC.TL_messageMediaPoll) this.f37b, jnVar.O, jnVar.f27433m1, (ArrayList) this.f38c, z10, i10, ((Long) this.d).longValue());
                jnVar.f30947b.a(true);
                return;
            case 8:
                jt jtVar = (jt) this.e;
                TLRPC.Document document = (TLRPC.Document) this.f37b;
                TLRPC.BotInlineResult botInlineResult2 = (TLRPC.BotInlineResult) this.f38c;
                if (document != null) {
                    botInlineResult = document;
                } else {
                    botInlineResult = botInlineResult2;
                }
                jtVar.r(i10, i11, this.d, botInlineResult, z10);
                return;
            default:
                ((jt) this.e).l((TLRPC.Document) this.f37b, (String) this.f38c, this.d, z10, i10, i11);
                return;
        }
    }

    @Override
    public boolean N(ay ayVar) {
        switch (this.f36a) {
            case 5:
                return false;
            case 6:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void a(c5.g gVar, List list) {
        switch (this.f36a) {
            case 19:
                i0.g3(new r4((Object) list, (Object) ((j20) this.e), (Object) ((TLRPC.TL_inputStorePaymentStarsTopup) this.f37b), (Object) ((TL_stars.TL_starsTopupOption) this.f38c), (Object) ((Activity) this.d), 4));
                return;
            default:
                i0.g3(new v8((e6) this.e, list, (s) this.f37b, (TLRPC.TL_inputStorePaymentStarsGiveaway) this.f38c, gVar, (Activity) this.d, 20));
                return;
        }
    }

    @Override
    public e9.x1 b(int r17, b2.p1 r18, int[] r19) {
        throw new UnsupportedOperationException("Method not decompiled: a1.d.b(int, b2.p1, int[]):e9.x1");
    }

    @Override
    public void c(String str, ArrayList arrayList) {
        ArrayList arrayList2;
        ArrayList arrayList3;
        switch (this.f36a) {
            case 14:
                ArrayList arrayList4 = (ArrayList) this.f37b;
                ArrayList arrayList5 = (ArrayList) this.f38c;
                Runnable runnable = (Runnable) this.d;
                TLRPC.messages_AvailableEffects E0 = vp.r1(((i31) this.e).V).E0();
                HashSet hashSet = new HashSet();
                if (E0 != null) {
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        try {
                            if (!((qi) arrayList.get(i10)).f17590a.startsWith("animated_")) {
                                String c10 = k6.c(((qi) arrayList.get(i10)).f17590a);
                                for (int i11 = 0; i11 < E0.effects.size(); i11++) {
                                    TLRPC.TL_availableEffect tL_availableEffect = E0.effects.get(i11);
                                    if (!hashSet.contains(Long.valueOf(tL_availableEffect.f19824id)) && (tL_availableEffect.emoticon.contains(c10) || c10.contains(tL_availableEffect.emoticon))) {
                                        if (tL_availableEffect.effect_animation_id == 0) {
                                            arrayList2 = arrayList4;
                                        } else {
                                            arrayList2 = arrayList5;
                                        }
                                        arrayList2.add(o0.e(tL_availableEffect));
                                        hashSet.add(Long.valueOf(tL_availableEffect.f19824id));
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
                HashMap hashMap = (HashMap) this.e;
                HashMap hashMap2 = (HashMap) this.f37b;
                ArrayList arrayList6 = (ArrayList) this.f38c;
                Runnable runnable2 = (Runnable) this.d;
                int size = arrayList.size();
                for (int i12 = 0; i12 < size; i12++) {
                    String str2 = ((qi) arrayList.get(i12)).f17590a;
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
    public Object d(Number number, Object obj) {
        Context context = (Context) this.e;
        int[] iArr = (int[]) this.f37b;
        p6 p6Var = (p6) this.f38c;
        wy0 wy0Var = (wy0) this.d;
        Integer num = (Integer) number;
        Float f7 = (Float) obj;
        LinearLayout f10 = m5.f(context, 1);
        LinearLayout linearLayout = new LinearLayout(context);
        f10.addView(linearLayout, b6.t(-2, -2, 1, 0, 0, 0, 0));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(iArr[num.intValue() - 1]);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        linearLayout.addView(imageView, b6.o(24, 24));
        if (num.intValue() == 7) {
            for (int i10 = 0; i10 < 2; i10++) {
                ImageView imageView2 = new ImageView(context);
                imageView2.setImageResource(iArr[num.intValue() - 1]);
                imageView2.setScaleType(ImageView.ScaleType.CENTER);
                linearLayout.addView(imageView2, b6.o(24, 24));
            }
        }
        TextView textView = new TextView(context);
        textView.setTypeface(i0.o1("fonts/num.otf"));
        a7.V(textView, t6.f21037j5, p6Var);
        StringBuilder sb2 = new StringBuilder("x");
        int i11 = (f7.floatValue() > 0.0f ? 1 : (f7.floatValue() == 0.0f ? 0 : -1));
        Object obj2 = f7;
        if (i11 <= 0) {
            obj2 = "0";
        }
        sb2.append(obj2);
        textView.setText(sb2.toString());
        textView.setTextSize(1, 13.0f);
        textView.setGravity(17);
        f10.addView(textView, b6.k(0.0f, 3.0f, 0.0f, 0.0f, -1, -2));
        return new ty0(wy0Var, f10, false);
    }

    @Override
    public void h(x1 x1Var, int i10) {
        String str;
        int i11 = this.f36a;
        Object obj = this.d;
        Object obj2 = this.f38c;
        Object obj3 = this.f37b;
        Object obj4 = this.e;
        switch (i11) {
            case 2:
                ((h4) obj4).P((String) obj3, (String) obj2, (gf.e) obj);
                return;
            case 4:
                un.e1((un) obj4, (TLRPC.User) obj3, (AtomicBoolean) obj2, (TLRPC.TL_attachMenuBot) obj);
                return;
            case 11:
                String str2 = (String) obj;
                Pattern pattern = LaunchActivity.D1;
                gi0 gi0Var = new gi0((LaunchActivity) obj4, (k2) obj3);
                gi0Var.N0((String) obj2, false);
                if (str2 != null) {
                    String[] split = str2.split(" ", 2);
                    String str3 = split[0];
                    if (split.length > 1) {
                        str = split[1];
                    } else {
                        str = null;
                    }
                    dc0 dc0Var = gi0Var.f37560j1;
                    if (dc0Var != null) {
                        dc0Var.getEditText().setText(str3);
                    } else {
                        gi0Var.A1 = str3;
                    }
                    dc0 dc0Var2 = gi0Var.f37561k1;
                    if (dc0Var2 != null) {
                        dc0Var2.getEditText().setText(str);
                    } else {
                        gi0Var.B1 = str;
                    }
                }
                gi0Var.show();
                return;
            case 12:
                hf0.Y((hf0) obj4, (String) obj3, (String) obj2, (String) obj);
                return;
            case 13:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) obj4;
                notificationsCustomSettingsActivity.getClass();
                SharedPreferences.Editor edit = ((SharedPreferences) obj3).edit();
                edit.putBoolean((String) obj2, ((boolean[]) obj)[0]);
                edit.apply();
                notificationsCustomSettingsActivity.p0(true);
                notificationsCustomSettingsActivity.getNotificationsController().b0(notificationsCustomSettingsActivity.f33403s);
                return;
            default:
                pb1 pb1Var = (pb1) obj4;
                HashSet hashSet = (HashSet) obj3;
                HashSet hashSet2 = new HashSet();
                pb1Var.A0 = hashSet2;
                hashSet2.addAll(hashSet);
                pb1Var.Y0(true, false);
                cc.a0(pb1Var).U(cd.J0(hashSet.size(), "TopicsDeleted"), false, new na1(pb1Var, 4), new k41(pb1Var, (ArrayList) obj2, (Runnable) obj, 7)).j();
                pb1Var.F0();
                x1Var.dismiss();
                return;
        }
    }

    @Override
    public void onFailure(Exception e) {
        switch (this.f36a) {
            case 0:
                CredentialProviderPlayServicesImpl.runFallbackClearCredFlow$lambda$27((CredentialProviderPlayServicesImpl) this.e, (CancellationSignal) this.f37b, (Executor) this.f38c, (v0.h) this.d, e);
                return;
            default:
                i.e(e, "e");
                b1.b bVar = new b1.b((e1.d) this.e, e, (Executor) this.f38c, (v0.h) this.d);
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!h.a((CancellationSignal) this.f37b)) {
                    bVar.invoke();
                    return;
                }
                return;
        }
    }

    @Override
    public void run(long j10) {
        s31 s31Var = (s31) this.e;
        TLRPC.User user = (TLRPC.User) this.f37b;
        TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP = (TLRPC.InputCheckPasswordSRP) this.f38c;
        TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.d;
        if (j10 != 0) {
            s31Var.P1 = vp.r1(s31Var.f21583a).L0(Long.valueOf(j10));
            s31Var.e1(user, inputCheckPasswordSRP, twoStepVerificationActivity);
            return;
        }
        s31Var.getClass();
    }

    @Override
    public void t(ac0 ac0Var, int i10) {
        b50 b50Var = (b50) this.e;
        ac0 ac0Var2 = (ac0) this.f37b;
        l30 l30Var = (l30) this.f38c;
        m30 m30Var = (m30) this.d;
        try {
            b50Var.f21589c.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        s4.g(b50Var.K1, b50Var.J1, 0L, 604800L, 2, ac0Var2, l30Var, m30Var);
    }

    @Override
    public boolean y(ay ayVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, pb1 pb1Var) {
        String H;
        long j10;
        TLRPC.TL_document tL_document;
        int i12 = this.f36a;
        Object obj = this.d;
        Object obj2 = this.f38c;
        Object obj3 = this.f37b;
        Object obj4 = this.e;
        switch (i12) {
            case 5:
                w7 w7Var = (w7) obj4;
                ArrayList arrayList2 = (ArrayList) obj3;
                TLRPC.TL_document tL_document2 = (TLRPC.TL_document) obj2;
                jj jjVar = (jj) obj;
                if (arrayList.size() <= 1 && ((gs) arrayList.get(0)).f15760a != d20.i(w7Var.f21583a).e() && charSequence == null && arrayList2 != null) {
                    gs gsVar = (gs) arrayList.get(0);
                    long j11 = gsVar.f15760a;
                    Bundle g10 = g.g("scrollToTopOnResume", true);
                    if (o5.C(j11)) {
                        g10.putInt("enc_id", (int) (j11 & 4294967295L));
                    } else if (o5.E(j11)) {
                        g10.putLong("user_id", j11);
                    } else {
                        g10.putLong("chat_id", -j11);
                    }
                    un unVar = new un(g10);
                    if (gsVar.f15761b != 0) {
                        gg.e.a(unVar, gsVar);
                    }
                    if (w7Var.f32079w2.u0(unVar, true, false)) {
                        unVar.Tb(arrayList2);
                        if (gsVar.f15761b != 0) {
                            ayVar.removeSelfFromStack();
                        }
                    } else {
                        ayVar.finishFragment();
                    }
                } else {
                    int i13 = 0;
                    while (i13 < arrayList.size()) {
                        long j12 = ((gs) arrayList.get(i13)).f15760a;
                        if (charSequence != null) {
                            j10 = j12;
                            qz.C(w7Var.f21583a).r0(oz.b(charSequence.toString(), j10, null, null, null, true, null, null, null, true, 0, 0, null, false));
                        } else {
                            j10 = j12;
                        }
                        if (arrayList2 != null) {
                            qz.C(w7Var.f21583a).q0(arrayList2, j10, false, false, true, 0, 0, null, -1, 0L, 0L, null);
                            tL_document = tL_document2;
                        } else {
                            tL_document = tL_document2;
                            qz.C(w7Var.f21583a).r0(oz.e(tL_document, null, jjVar.f16337k.attachPath, j10, null, null, null, null, null, z11, i10, 0, 0, w7Var.f32059m2, false));
                        }
                        i13++;
                        tL_document2 = tL_document;
                    }
                    ayVar.finishFragment();
                    k2 Q = LaunchActivity.Q();
                    if (Q != null) {
                        cc a02 = cc.a0(Q);
                        if (arrayList.size() == 1 && ((gs) arrayList.get(0)).f15760a == d20.i(w7Var.f21583a).e()) {
                            H = cd.L0(2131750507, null);
                        } else if (arrayList.size() == 1 && ((gs) arrayList.get(0)).f15760a > 0) {
                            H = cd.a0(null, null, 2131750506, o5.t(((gs) arrayList.get(0)).f15760a));
                        } else if (arrayList.size() == 1 && ((gs) arrayList.get(0)).f15760a < 0) {
                            H = cd.a0(null, null, 2131750511, o5.t(((gs) arrayList.get(0)).f15760a));
                        } else {
                            H = cd.H(',', "FwdMessageToManyChats", arrayList.size());
                        }
                        a02.Q(2131624027, 36, H).j();
                    }
                }
                return true;
            case 6:
                TLRPC.User user = (TLRPC.User) obj3;
                String str = (String) obj2;
                fc0 fc0Var = (fc0) obj;
                bi biVar = ((gh) obj4).e;
                long j13 = ((gs) arrayList.get(0)).f15760a;
                Bundle g11 = g.g("scrollToTopOnResume", true);
                if (o5.C(j13)) {
                    g11.putInt("enc_id", (int) (j13 & 4294967295L));
                } else if (o5.E(j13)) {
                    g11.putLong("user_id", j13);
                } else {
                    g11.putLong("chat_id", -j13);
                }
                g11.putString("start_text", "@" + h20.n(user) + " " + str);
                k2 k2Var = biVar.W1;
                if (vp.r1(biVar.D3).E(g11, k2Var, null, null)) {
                    fc0Var.dismiss();
                    biVar.a(true);
                    w4 w4Var = new w4(new un(g11));
                    w4Var.f21446b = true;
                    k2Var.presentFragment(w4Var);
                }
                return true;
            default:
                TLRPC.User user2 = (TLRPC.User) obj3;
                String str2 = (String) obj2;
                fc0 fc0Var2 = (fc0) obj;
                m2 m2Var = ((h2) obj4).d;
                long j14 = ((gs) arrayList.get(0)).f15760a;
                Bundle g12 = g.g("scrollToTopOnResume", true);
                if (o5.C(j14)) {
                    g12.putInt("enc_id", (int) (j14 & 4294967295L));
                } else if (o5.E(j14)) {
                    g12.putLong("user_id", j14);
                } else {
                    g12.putLong("chat_id", -j14);
                }
                g12.putString("start_text", "@" + h20.n(user2) + " " + str2);
                Activity activity = m2Var.f53889l0;
                if (activity instanceof LaunchActivity) {
                    k2 lastFragment = ((LaunchActivity) activity).M().getLastFragment();
                    if (vp.r1(m2Var.H).E(g12, lastFragment, null, null)) {
                        fc0Var2.dismiss();
                        m2Var.f53880d0 = true;
                        i0.r(m2Var.f53900u0);
                        m2Var.D.h();
                        zs.f(m2Var.H).n(m2Var, 114);
                        zs.e().n(m2Var, 264);
                        zs.f(m2Var.H).n(m2Var, 234);
                        if (!m2Var.Q0) {
                            m2.j(m2Var);
                            m2Var.Q0 = true;
                        }
                        w4 w4Var2 = new w4(new un(g12));
                        w4Var2.f21446b = true;
                        lastFragment.presentFragment(w4Var2);
                    }
                }
                return true;
        }
    }

    public d(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f36a = i10;
        this.e = obj;
        this.f37b = obj2;
        this.f38c = obj3;
        this.d = obj4;
    }
}
