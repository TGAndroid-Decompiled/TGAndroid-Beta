package a1;

import a3.p;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import bi.p1;
import c8.ja;
import ch.p0;
import com.google.android.gms.tasks.OnFailureListener;
import di.u8;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import ki.s2;
import ki.x2;
import kotlin.jvm.internal.j;
import org.telegram.messenger.cz;
import org.telegram.messenger.ez;
import org.telegram.messenger.g0;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.j6;
import org.telegram.messenger.k5;
import org.telegram.messenger.m10;
import org.telegram.messenger.m5;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.oi;
import org.telegram.messenger.pi;
import org.telegram.messenger.q1;
import org.telegram.messenger.q10;
import org.telegram.messenger.qr;
import org.telegram.messenger.s10;
import org.telegram.messenger.t10;
import org.telegram.messenger.ur;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.m4;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.gb0;
import org.telegram.ui.Components.ib0;
import org.telegram.ui.Components.jn;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.lb0;
import org.telegram.ui.Components.nb0;
import org.telegram.ui.Components.qh;
import org.telegram.ui.Components.r4;
import org.telegram.ui.Components.sx0;
import org.telegram.ui.Components.t4;
import org.telegram.ui.Components.vx0;
import org.telegram.ui.Components.y7;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.Wallet.t1;
import org.telegram.ui.an;
import org.telegram.ui.bh0;
import org.telegram.ui.c40;
import org.telegram.ui.ce0;
import org.telegram.ui.g4;
import org.telegram.ui.ls;
import org.telegram.ui.m20;
import org.telegram.ui.n11;
import org.telegram.ui.n20;
import org.telegram.ui.q21;
import org.telegram.ui.sw;
import org.telegram.ui.u81;
import org.telegram.ui.u91;
import org.telegram.ui.x11;
import org.telegram.ui.yw;
public final class d implements OnFailureListener, p, q1, sw, org.telegram.ui.ActionBar.q1, r4, gb0, pi, qr, t10 {
    public final int f39a;
    public final Object f40b;
    public final Object f41c;
    public final Object d;
    public final Object f42e;

    public d(CancellationSignal cancellationSignal, e1.d dVar, Executor executor, v0.g gVar) {
        this.f39a = 4;
        this.f41c = cancellationSignal;
        this.f40b = dVar;
        this.d = executor;
        this.f42e = gVar;
    }

    @Override
    public boolean H() {
        switch (this.f39a) {
            case 5:
                return false;
            case 9:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void L(int i7, int i10, boolean z10) {
        TLRPC.BotInlineResult botInlineResult;
        switch (this.f39a) {
            case 7:
                an.J0((an) this.f40b, (TLRPC.TL_document) this.f41c, (String) this.d, this.f42e, z10, i7);
                return;
            case 11:
                jn jnVar = (jn) this.f40b;
                jnVar.f36082k0.c((TLRPC.TL_messageMediaPoll) this.f41c, jnVar.P, jnVar.n1, (ArrayList) this.d, z10, i7, ((Long) this.f42e).longValue());
                jnVar.f33609b.a(true);
                return;
            case 12:
                ls lsVar = (ls) this.f40b;
                TLRPC.Document document = (TLRPC.Document) this.f41c;
                TLRPC.BotInlineResult botInlineResult2 = (TLRPC.BotInlineResult) this.d;
                if (document != null) {
                    botInlineResult = document;
                } else {
                    botInlineResult = botInlineResult2;
                }
                lsVar.r(i7, i10, this.f42e, botInlineResult, z10);
                return;
            default:
                ((ls) this.f40b).l((TLRPC.Document) this.f41c, (String) this.d, this.f42e, z10, i7, i10);
                return;
        }
    }

    @Override
    public boolean P(yw ywVar) {
        switch (this.f39a) {
            case 5:
                return false;
            case 9:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void a(f5.f fVar, List list) {
        switch (this.f39a) {
            case 2:
                g0.h3(new ai.b(list, (s10) this.f40b, (TLRPC.TL_inputStorePaymentStarsTopup) this.f41c, (TL_stars.TL_starsTopupOption) this.d, (Activity) this.f42e, 7));
                return;
            default:
                g0.h3(new p1((u8) this.f40b, list, (t1) this.f41c, (TLRPC.TL_inputStorePaymentStarsGiveaway) this.d, fVar, (Activity) this.f42e, 3));
                return;
        }
    }

    @Override
    public void c(String str, ArrayList arrayList) {
        ArrayList arrayList2;
        ArrayList arrayList3;
        switch (this.f39a) {
            case 18:
                ArrayList arrayList4 = (ArrayList) this.f41c;
                ArrayList arrayList5 = (ArrayList) this.d;
                Runnable runnable = (Runnable) this.f42e;
                TLRPC.messages_AvailableEffects E0 = np.s1(((n11) this.f40b).W).E0();
                HashSet hashSet = new HashSet();
                if (E0 != null) {
                    for (int i7 = 0; i7 < arrayList.size(); i7++) {
                        try {
                            if (!((oi) arrayList.get(i7)).f25765a.startsWith("animated_")) {
                                String c10 = j6.c(((oi) arrayList.get(i7)).f25765a);
                                for (int i10 = 0; i10 < E0.effects.size(); i10++) {
                                    TLRPC.TL_availableEffect tL_availableEffect = E0.effects.get(i10);
                                    if (!hashSet.contains(Long.valueOf(tL_availableEffect.f28082id)) && (tL_availableEffect.emoticon.contains(c10) || c10.contains(tL_availableEffect.emoticon))) {
                                        if (tL_availableEffect.effect_animation_id == 0) {
                                            arrayList2 = arrayList4;
                                        } else {
                                            arrayList2 = arrayList5;
                                        }
                                        arrayList2.add(p0.e(tL_availableEffect));
                                        hashSet.add(Long.valueOf(tL_availableEffect.f28082id));
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
                HashMap hashMap = (HashMap) this.f40b;
                HashMap hashMap2 = (HashMap) this.f41c;
                ArrayList arrayList6 = (ArrayList) this.d;
                Runnable runnable2 = (Runnable) this.f42e;
                int size = arrayList.size();
                for (int i11 = 0; i11 < size; i11++) {
                    String str2 = ((oi) arrayList.get(i11)).f25765a;
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
        Context context = (Context) this.f40b;
        int[] iArr = (int[]) this.f41c;
        e6 e6Var = (e6) this.d;
        vx0 vx0Var = (vx0) this.f42e;
        Integer num = (Integer) number;
        Float f10 = (Float) obj;
        LinearLayout f11 = k5.f(context, 1);
        LinearLayout linearLayout = new LinearLayout(context);
        f11.addView(linearLayout, ja.t(-2, -2, 1, 0, 0, 0, 0));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(iArr[num.intValue() - 1]);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        linearLayout.addView(imageView, ja.o(24, 24));
        if (num.intValue() == 7) {
            for (int i7 = 0; i7 < 2; i7++) {
                ImageView imageView2 = new ImageView(context);
                imageView2.setImageResource(iArr[num.intValue() - 1]);
                imageView2.setScaleType(ImageView.ScaleType.CENTER);
                linearLayout.addView(imageView2, ja.o(24, 24));
            }
        }
        TextView textView = new TextView(context);
        textView.setTypeface(g0.o1("fonts/num.otf"));
        q6.U(textView, org.telegram.ui.ActionBar.j6.f28957j5, e6Var);
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
        f11.addView(textView, ja.k(0.0f, 3.0f, 0.0f, 0.0f, -1, -2));
        return new sx0(vx0Var, f11, false);
    }

    @Override
    public h9.s1 f(int r17, e2.m1 r18, int[] r19) {
        throw new UnsupportedOperationException("Method not decompiled: a1.d.f(int, e2.m1, int[]):h9.s1");
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        String str;
        int i10 = this.f39a;
        Object obj = this.f42e;
        Object obj2 = this.d;
        Object obj3 = this.f41c;
        Object obj4 = this.f40b;
        switch (i10) {
            case 6:
                ((g4) obj4).P((String) obj3, (String) obj2, (vf.b) obj);
                return;
            case 8:
                an.D0((an) obj4, (TLRPC.User) obj3, (AtomicBoolean) obj2, (TLRPC.TL_attachMenuBot) obj);
                return;
            case 15:
                String str2 = (String) obj;
                String str3 = LaunchActivity.C1;
                bh0 bh0Var = new bh0((LaunchActivity) obj4, (e2) obj3);
                bh0Var.N0((String) obj2, false);
                if (str2 != null) {
                    String[] split = str2.split(" ", 2);
                    String str4 = split[0];
                    if (split.length > 1) {
                        str = split[1];
                    } else {
                        str = null;
                    }
                    lb0 lb0Var = bh0Var.n1;
                    if (lb0Var != null) {
                        lb0Var.getEditText().setText(str4);
                    } else {
                        bh0Var.E1 = str4;
                    }
                    lb0 lb0Var2 = bh0Var.f45745o1;
                    if (lb0Var2 != null) {
                        lb0Var2.getEditText().setText(str);
                    } else {
                        bh0Var.F1 = str;
                    }
                }
                bh0Var.show();
                return;
            case 16:
                ce0.Z((ce0) obj4, (String) obj3, (String) obj2, (String) obj);
                return;
            case 17:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) obj4;
                notificationsCustomSettingsActivity.getClass();
                SharedPreferences.Editor edit = ((SharedPreferences) obj3).edit();
                edit.putBoolean((String) obj2, ((boolean[]) obj)[0]);
                edit.apply();
                notificationsCustomSettingsActivity.q0(true);
                notificationsCustomSettingsActivity.getNotificationsController().b0(notificationsCustomSettingsActivity.f42678s);
                return;
            default:
                u91 u91Var = (u91) obj4;
                HashSet hashSet = (HashSet) obj3;
                HashSet hashSet2 = new HashSet();
                u91Var.B0 = hashSet2;
                hashSet2.addAll(hashSet);
                u91Var.Z0(true, false);
                cc.a0(u91Var).U(hd.K0(hashSet.size(), "TopicsDeleted"), false, new u81(u91Var, 4), new q21(u91Var, (ArrayList) obj2, (Runnable) obj, 7)).j();
                u91Var.G0();
                t1Var.dismiss();
                return;
        }
    }

    @Override
    public void m(ib0 ib0Var, int i7) {
        c40 c40Var = (c40) this.f40b;
        ib0 ib0Var2 = (ib0) this.f41c;
        m20 m20Var = (m20) this.d;
        n20 n20Var = (n20) this.f42e;
        try {
            c40Var.f29685c.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        t4.g(c40Var.O1, c40Var.N1, 0L, 604800L, 2, ib0Var2, m20Var, n20Var);
    }

    @Override
    public void onFailure(Exception e10) {
        switch (this.f39a) {
            case 0:
                CredentialProviderPlayServicesImpl.$r8$lambda$ZiuN7M7j6nhSxISGIiu1ycEfVYw((CredentialProviderPlayServicesImpl) this.f40b, (CancellationSignal) this.f41c, (Executor) this.d, (v0.g) this.f42e, e10);
                return;
            default:
                j.e(e10, "e");
                b1.b bVar = new b1.b((e1.d) this.f40b, e10, (Executor) this.d, (v0.g) this.f42e);
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!g.a((CancellationSignal) this.f41c)) {
                    bVar.invoke();
                    return;
                }
                return;
        }
    }

    @Override
    public void run(long j3) {
        x11 x11Var = (x11) this.f40b;
        TLRPC.User user = (TLRPC.User) this.f41c;
        TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP = (TLRPC.InputCheckPasswordSRP) this.d;
        TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f42e;
        if (j3 != 0) {
            x11Var.T1 = np.s1(x11Var.f29679a).M0(Long.valueOf(j3));
            x11Var.e1(user, inputCheckPasswordSRP, twoStepVerificationActivity);
            return;
        }
        x11Var.getClass();
    }

    @Override
    public boolean y(yw ywVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i7, int i10, u91 u91Var) {
        String H;
        long j3;
        TLRPC.TL_document tL_document;
        int i11 = this.f39a;
        Object obj = this.f42e;
        Object obj2 = this.d;
        Object obj3 = this.f41c;
        Object obj4 = this.f40b;
        switch (i11) {
            case 5:
                TLRPC.User user = (TLRPC.User) obj3;
                String str = (String) obj2;
                nb0 nb0Var = (nb0) obj;
                x2 x2Var = ((s2) obj4).d;
                long j10 = ((ur) arrayList.get(0)).f26861a;
                Bundle k10 = a8.p0.k("scrollToTopOnResume", true);
                if (m5.C(j10)) {
                    k10.putInt("enc_id", (int) (j10 & 4294967295L));
                } else if (m5.E(j10)) {
                    k10.putLong("user_id", j10);
                } else {
                    k10.putLong("chat_id", -j10);
                }
                k10.putString("start_text", "@" + q10.n(user) + " " + str);
                Activity activity = x2Var.m0;
                if (activity instanceof LaunchActivity) {
                    e2 lastFragment = ((LaunchActivity) activity).M().getLastFragment();
                    if (np.s1(x2Var.I).E(k10, lastFragment, null, null)) {
                        nb0Var.dismiss();
                        x2Var.f18660e0 = true;
                        g0.r(x2Var.f18680v0);
                        x2Var.E.h();
                        ns.f(x2Var.I).n(x2Var, 114);
                        ns.e().n(x2Var, 264);
                        ns.f(x2Var.I).n(x2Var, 234);
                        if (!x2Var.R0) {
                            x2.j(x2Var);
                            x2Var.R0 = true;
                        }
                        m4 m4Var = new m4(new an(k10));
                        m4Var.f29384b = true;
                        lastFragment.presentFragment(m4Var);
                    }
                }
                return true;
            case 9:
                y7 y7Var = (y7) obj4;
                ArrayList arrayList2 = (ArrayList) obj3;
                TLRPC.TL_document tL_document2 = (TLRPC.TL_document) obj2;
                gj gjVar = (gj) obj;
                if (arrayList.size() <= 1 && ((ur) arrayList.get(0)).f26861a != m10.i(y7Var.f29679a).e() && charSequence == null && arrayList2 != null) {
                    ur urVar = (ur) arrayList.get(0);
                    long j11 = urVar.f26861a;
                    Bundle k11 = a8.p0.k("scrollToTopOnResume", true);
                    if (m5.C(j11)) {
                        k11.putInt("enc_id", (int) (j11 & 4294967295L));
                    } else if (m5.E(j11)) {
                        k11.putLong("user_id", j11);
                    } else {
                        k11.putLong("chat_id", -j11);
                    }
                    an anVar = new an(k11);
                    if (urVar.f26862b != 0) {
                        qg.c.a(anVar, urVar);
                    }
                    if (y7Var.A2.u0(anVar, true, false)) {
                        anVar.hc(arrayList2);
                        if (urVar.f26862b != 0) {
                            ywVar.removeSelfFromStack();
                        }
                    } else {
                        ywVar.finishFragment();
                    }
                } else {
                    int i12 = 0;
                    while (i12 < arrayList.size()) {
                        long j12 = ((ur) arrayList.get(i12)).f26861a;
                        if (charSequence != null) {
                            j3 = j12;
                            ez.C(y7Var.f29679a).r0(cz.b(charSequence.toString(), j3, null, null, null, true, null, null, null, true, 0, 0, null, false));
                        } else {
                            j3 = j12;
                        }
                        if (arrayList2 != null) {
                            ez.C(y7Var.f29679a).q0(arrayList2, j3, false, false, true, 0, 0, null, -1, 0L, 0L, null);
                            tL_document = tL_document2;
                        } else {
                            tL_document = tL_document2;
                            ez.C(y7Var.f29679a).r0(cz.e(tL_document, null, gjVar.f23819k.attachPath, j3, null, null, null, null, null, z11, i7, 0, 0, y7Var.f41905q2, false));
                        }
                        i12++;
                        tL_document2 = tL_document;
                    }
                    ywVar.finishFragment();
                    e2 Q = LaunchActivity.Q();
                    if (Q != null) {
                        cc a02 = cc.a0(Q);
                        if (arrayList.size() == 1 && ((ur) arrayList.get(0)).f26861a == m10.i(y7Var.f29679a).e()) {
                            H = hd.M0(2131750498, null);
                        } else if (arrayList.size() == 1 && ((ur) arrayList.get(0)).f26861a > 0) {
                            H = hd.a0(null, null, 2131750497, m5.t(((ur) arrayList.get(0)).f26861a));
                        } else if (arrayList.size() == 1 && ((ur) arrayList.get(0)).f26861a < 0) {
                            H = hd.a0(null, null, 2131750502, m5.t(((ur) arrayList.get(0)).f26861a));
                        } else {
                            H = hd.H(',', "FwdMessageToManyChats", arrayList.size());
                        }
                        a02.Q(2131624029, 36, H).j();
                    }
                }
                return true;
            default:
                TLRPC.User user2 = (TLRPC.User) obj3;
                String str2 = (String) obj2;
                nb0 nb0Var2 = (nb0) obj;
                ki kiVar = ((qh) obj4).f38653e;
                long j13 = ((ur) arrayList.get(0)).f26861a;
                Bundle k12 = a8.p0.k("scrollToTopOnResume", true);
                if (m5.C(j13)) {
                    k12.putInt("enc_id", (int) (j13 & 4294967295L));
                } else if (m5.E(j13)) {
                    k12.putLong("user_id", j13);
                } else {
                    k12.putLong("chat_id", -j13);
                }
                k12.putString("start_text", "@" + q10.n(user2) + " " + str2);
                e2 e2Var = kiVar.f36424a2;
                if (np.s1(kiVar.H3).E(k12, e2Var, null, null)) {
                    nb0Var2.dismiss();
                    kiVar.a(true);
                    m4 m4Var2 = new m4(new an(k12));
                    m4Var2.f29384b = true;
                    e2Var.presentFragment(m4Var2);
                }
                return true;
        }
    }

    public d(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.f39a = i7;
        this.f40b = obj;
        this.f41c = obj2;
        this.d = obj3;
        this.f42e = obj4;
    }
}
