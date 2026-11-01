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
import org.telegram.messenger.at;
import org.telegram.messenger.dd;
import org.telegram.messenger.ds;
import org.telegram.messenger.e20;
import org.telegram.messenger.hs;
import org.telegram.messenger.i0;
import org.telegram.messenger.i20;
import org.telegram.messenger.k20;
import org.telegram.messenger.k6;
import org.telegram.messenger.kj;
import org.telegram.messenger.l20;
import org.telegram.messenger.m5;
import org.telegram.messenger.o5;
import org.telegram.messenger.pz;
import org.telegram.messenger.ri;
import org.telegram.messenger.rz;
import org.telegram.messenger.si;
import org.telegram.messenger.t1;
import org.telegram.messenger.wp;
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
import org.telegram.ui.Components.uy0;
import org.telegram.ui.Components.w7;
import org.telegram.ui.Components.xy0;
import org.telegram.ui.Components.yb0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.a50;
import org.telegram.ui.ei0;
import org.telegram.ui.g31;
import org.telegram.ui.gf0;
import org.telegram.ui.h4;
import org.telegram.ui.ht;
import org.telegram.ui.i41;
import org.telegram.ui.k30;
import org.telegram.ui.l30;
import org.telegram.ui.la1;
import org.telegram.ui.nb1;
import org.telegram.ui.q31;
import org.telegram.ui.tx;
import org.telegram.ui.un;
import org.telegram.ui.v8;
import org.telegram.ui.zx;
import rh.e6;
import rh.r4;
import sg.o0;
import w7.b6;
import x2.l;
import xh.h2;
import xh.m2;
public final class d implements OnFailureListener, u1, q4, tx, yb0, si, ds, l20, t1, l {
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
    public boolean H() {
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
                un.G0((un) this.e, (TLRPC.TL_document) this.f37b, (String) this.f38c, this.d, z10, i10);
                return;
            case 7:
                jn jnVar = (jn) this.e;
                jnVar.f27494j0.e((TLRPC.TL_messageMediaPoll) this.f37b, jnVar.O, jnVar.f27499m1, (ArrayList) this.f38c, z10, i10, ((Long) this.d).longValue());
                jnVar.f30964b.a(true);
                return;
            case 8:
                ht htVar = (ht) this.e;
                TLRPC.Document document = (TLRPC.Document) this.f37b;
                TLRPC.BotInlineResult botInlineResult2 = (TLRPC.BotInlineResult) this.f38c;
                if (document != null) {
                    botInlineResult = document;
                } else {
                    botInlineResult = botInlineResult2;
                }
                htVar.r(i10, i11, this.d, botInlineResult, z10);
                return;
            default:
                ((ht) this.e).l((TLRPC.Document) this.f37b, (String) this.f38c, this.d, z10, i10, i11);
                return;
        }
    }

    @Override
    public boolean O(zx zxVar) {
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
                i0.g3(new r4((Object) list, (Object) ((k20) this.e), (Object) ((TLRPC.TL_inputStorePaymentStarsTopup) this.f37b), (Object) ((TL_stars.TL_starsTopupOption) this.f38c), (Object) ((Activity) this.d), 4));
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
                TLRPC.messages_AvailableEffects E0 = wp.r1(((g31) this.e).V).E0();
                HashSet hashSet = new HashSet();
                if (E0 != null) {
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        try {
                            if (!((ri) arrayList.get(i10)).f17936a.startsWith("animated_")) {
                                String c10 = k6.c(((ri) arrayList.get(i10)).f17936a);
                                for (int i11 = 0; i11 < E0.effects.size(); i11++) {
                                    TLRPC.TL_availableEffect tL_availableEffect = E0.effects.get(i11);
                                    if (!hashSet.contains(Long.valueOf(tL_availableEffect.f19825id)) && (tL_availableEffect.emoticon.contains(c10) || c10.contains(tL_availableEffect.emoticon))) {
                                        if (tL_availableEffect.effect_animation_id == 0) {
                                            arrayList2 = arrayList4;
                                        } else {
                                            arrayList2 = arrayList5;
                                        }
                                        arrayList2.add(o0.e(tL_availableEffect));
                                        hashSet.add(Long.valueOf(tL_availableEffect.f19825id));
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
                    String str2 = ((ri) arrayList.get(i12)).f17936a;
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
        xy0 xy0Var = (xy0) this.d;
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
        a7.V(textView, t6.f21038j5, p6Var);
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
        return new uy0(xy0Var, f10, false);
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
                un.e0((un) obj4, (TLRPC.User) obj3, (AtomicBoolean) obj2, (TLRPC.TL_attachMenuBot) obj);
                return;
            case 11:
                String str2 = (String) obj;
                Pattern pattern = LaunchActivity.D1;
                ei0 ei0Var = new ei0((LaunchActivity) obj4, (k2) obj3);
                ei0Var.N0((String) obj2, false);
                if (str2 != null) {
                    String[] split = str2.split(" ", 2);
                    String str3 = split[0];
                    if (split.length > 1) {
                        str = split[1];
                    } else {
                        str = null;
                    }
                    dc0 dc0Var = ei0Var.f36837j1;
                    if (dc0Var != null) {
                        dc0Var.getEditText().setText(str3);
                    } else {
                        ei0Var.A1 = str3;
                    }
                    dc0 dc0Var2 = ei0Var.f36838k1;
                    if (dc0Var2 != null) {
                        dc0Var2.getEditText().setText(str);
                    } else {
                        ei0Var.B1 = str;
                    }
                }
                ei0Var.show();
                return;
            case 12:
                gf0.Z((gf0) obj4, (String) obj3, (String) obj2, (String) obj);
                return;
            case 13:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) obj4;
                notificationsCustomSettingsActivity.getClass();
                SharedPreferences.Editor edit = ((SharedPreferences) obj3).edit();
                edit.putBoolean((String) obj2, ((boolean[]) obj)[0]);
                edit.apply();
                notificationsCustomSettingsActivity.q0(true);
                notificationsCustomSettingsActivity.getNotificationsController().b0(notificationsCustomSettingsActivity.f33410s);
                return;
            default:
                nb1 nb1Var = (nb1) obj4;
                HashSet hashSet = (HashSet) obj3;
                HashSet hashSet2 = new HashSet();
                nb1Var.A0 = hashSet2;
                hashSet2.addAll(hashSet);
                nb1Var.Z0(true, false);
                cc.a0(nb1Var).U(dd.J0(hashSet.size(), "TopicsDeleted"), false, new la1(nb1Var, 4), new i41(nb1Var, (ArrayList) obj2, (Runnable) obj, 7)).j();
                nb1Var.G0();
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
        q31 q31Var = (q31) this.e;
        TLRPC.User user = (TLRPC.User) this.f37b;
        TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP = (TLRPC.InputCheckPasswordSRP) this.f38c;
        TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.d;
        if (j10 != 0) {
            q31Var.P1 = wp.r1(q31Var.f21584a).L0(Long.valueOf(j10));
            q31Var.e1(user, inputCheckPasswordSRP, twoStepVerificationActivity);
            return;
        }
        q31Var.getClass();
    }

    @Override
    public void t(ac0 ac0Var, int i10) {
        a50 a50Var = (a50) this.e;
        ac0 ac0Var2 = (ac0) this.f37b;
        k30 k30Var = (k30) this.f38c;
        l30 l30Var = (l30) this.d;
        try {
            a50Var.f21590c.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        s4.g(a50Var.K1, a50Var.J1, 0L, 604800L, 2, ac0Var2, k30Var, l30Var);
    }

    @Override
    public boolean z(zx zxVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, nb1 nb1Var) {
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
                kj kjVar = (kj) obj;
                if (arrayList.size() <= 1 && ((hs) arrayList.get(0)).f16109a != e20.i(w7Var.f21584a).e() && charSequence == null && arrayList2 != null) {
                    hs hsVar = (hs) arrayList.get(0);
                    long j11 = hsVar.f16109a;
                    Bundle g10 = g.g("scrollToTopOnResume", true);
                    if (o5.C(j11)) {
                        g10.putInt("enc_id", (int) (j11 & 4294967295L));
                    } else if (o5.E(j11)) {
                        g10.putLong("user_id", j11);
                    } else {
                        g10.putLong("chat_id", -j11);
                    }
                    un unVar = new un(g10);
                    if (hsVar.f16110b != 0) {
                        gg.e.a(unVar, hsVar);
                    }
                    if (w7Var.f32127w2.u0(unVar, true, false)) {
                        unVar.Yb(arrayList2);
                        if (hsVar.f16110b != 0) {
                            zxVar.removeSelfFromStack();
                        }
                    } else {
                        zxVar.finishFragment();
                    }
                } else {
                    int i13 = 0;
                    while (i13 < arrayList.size()) {
                        long j12 = ((hs) arrayList.get(i13)).f16109a;
                        if (charSequence != null) {
                            j10 = j12;
                            rz.C(w7Var.f21584a).r0(pz.b(charSequence.toString(), j10, null, null, null, true, null, null, null, true, 0, 0, null, false));
                        } else {
                            j10 = j12;
                        }
                        if (arrayList2 != null) {
                            rz.C(w7Var.f21584a).q0(arrayList2, j10, false, false, true, 0, 0, null, -1, 0L, 0L, null);
                            tL_document = tL_document2;
                        } else {
                            tL_document = tL_document2;
                            rz.C(w7Var.f21584a).r0(pz.e(tL_document, null, kjVar.f16690k.attachPath, j10, null, null, null, null, null, z11, i10, 0, 0, w7Var.f32107m2, false));
                        }
                        i13++;
                        tL_document2 = tL_document;
                    }
                    zxVar.finishFragment();
                    k2 Q = LaunchActivity.Q();
                    if (Q != null) {
                        cc a02 = cc.a0(Q);
                        if (arrayList.size() == 1 && ((hs) arrayList.get(0)).f16109a == e20.i(w7Var.f21584a).e()) {
                            H = dd.L0(2131750507, null);
                        } else if (arrayList.size() == 1 && ((hs) arrayList.get(0)).f16109a > 0) {
                            H = dd.a0(null, null, 2131750506, o5.t(((hs) arrayList.get(0)).f16109a));
                        } else if (arrayList.size() == 1 && ((hs) arrayList.get(0)).f16109a < 0) {
                            H = dd.a0(null, null, 2131750511, o5.t(((hs) arrayList.get(0)).f16109a));
                        } else {
                            H = dd.H(',', "FwdMessageToManyChats", arrayList.size());
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
                long j13 = ((hs) arrayList.get(0)).f16109a;
                Bundle g11 = g.g("scrollToTopOnResume", true);
                if (o5.C(j13)) {
                    g11.putInt("enc_id", (int) (j13 & 4294967295L));
                } else if (o5.E(j13)) {
                    g11.putLong("user_id", j13);
                } else {
                    g11.putLong("chat_id", -j13);
                }
                g11.putString("start_text", "@" + i20.n(user) + " " + str);
                k2 k2Var = biVar.W1;
                if (wp.r1(biVar.D3).E(g11, k2Var, null, null)) {
                    fc0Var.dismiss();
                    biVar.a(true);
                    w4 w4Var = new w4(new un(g11));
                    w4Var.f21447b = true;
                    k2Var.presentFragment(w4Var);
                }
                return true;
            default:
                TLRPC.User user2 = (TLRPC.User) obj3;
                String str2 = (String) obj2;
                fc0 fc0Var2 = (fc0) obj;
                m2 m2Var = ((h2) obj4).d;
                long j14 = ((hs) arrayList.get(0)).f16109a;
                Bundle g12 = g.g("scrollToTopOnResume", true);
                if (o5.C(j14)) {
                    g12.putInt("enc_id", (int) (j14 & 4294967295L));
                } else if (o5.E(j14)) {
                    g12.putLong("user_id", j14);
                } else {
                    g12.putLong("chat_id", -j14);
                }
                g12.putString("start_text", "@" + i20.n(user2) + " " + str2);
                Activity activity = m2Var.f53906l0;
                if (activity instanceof LaunchActivity) {
                    k2 lastFragment = ((LaunchActivity) activity).M().getLastFragment();
                    if (wp.r1(m2Var.H).E(g12, lastFragment, null, null)) {
                        fc0Var2.dismiss();
                        m2Var.f53897d0 = true;
                        i0.r(m2Var.f53917u0);
                        m2Var.D.h();
                        at.f(m2Var.H).n(m2Var, 114);
                        at.e().n(m2Var, 264);
                        at.f(m2Var.H).n(m2Var, 234);
                        if (!m2Var.Q0) {
                            m2.j(m2Var);
                            m2Var.Q0 = true;
                        }
                        w4 w4Var2 = new w4(new un(g12));
                        w4Var2.f21447b = true;
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
