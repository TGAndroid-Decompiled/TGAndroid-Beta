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
import bi.n2;
import bi.s1;
import c8.na;
import ch.p0;
import com.google.android.gms.tasks.OnFailureListener;
import di.y8;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import ki.o2;
import ki.t2;
import kotlin.jvm.internal.j;
import org.telegram.messenger.f3;
import org.telegram.messenger.fj;
import org.telegram.messenger.g0;
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.messenger.j6;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.messenger.n5;
import org.telegram.messenger.ni;
import org.telegram.messenger.oi;
import org.telegram.messenger.or;
import org.telegram.messenger.p10;
import org.telegram.messenger.q1;
import org.telegram.messenger.q10;
import org.telegram.messenger.sr;
import org.telegram.messenger.xy;
import org.telegram.messenger.zy;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.p4;
import org.telegram.ui.ActionBar.t1;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.ay0;
import org.telegram.ui.Components.b5;
import org.telegram.ui.Components.dy0;
import org.telegram.ui.Components.e8;
import org.telegram.ui.Components.kc;
import org.telegram.ui.Components.ob0;
import org.telegram.ui.Components.qb0;
import org.telegram.ui.Components.qn;
import org.telegram.ui.Components.tb0;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.wb0;
import org.telegram.ui.Components.z4;
import org.telegram.ui.Components.zh;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.Wallet.f0;
import org.telegram.ui.a21;
import org.telegram.ui.bn;
import org.telegram.ui.bx;
import org.telegram.ui.de0;
import org.telegram.ui.dh0;
import org.telegram.ui.e40;
import org.telegram.ui.g4;
import org.telegram.ui.ls;
import org.telegram.ui.o20;
import org.telegram.ui.p20;
import org.telegram.ui.q11;
import org.telegram.ui.t21;
import org.telegram.ui.vw;
import org.telegram.ui.w81;
import org.telegram.ui.w91;
public final class d implements OnFailureListener, p, q1, vw, org.telegram.ui.ActionBar.q1, z4, ob0, oi, or, q10 {
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
    public boolean F() {
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
    public void I(int i7, int i10, boolean z10) {
        TLRPC.BotInlineResult botInlineResult;
        switch (this.f39a) {
            case 7:
                bn.J0((bn) this.f40b, (TLRPC.TL_document) this.f41c, (String) this.d, this.f42e, z10, i7);
                return;
            case 11:
                qn qnVar = (qn) this.f40b;
                qnVar.f38929k0.c((TLRPC.TL_messageMediaPoll) this.f41c, qnVar.P, qnVar.n1, (ArrayList) this.d, z10, i7, ((Long) this.f42e).longValue());
                qnVar.f37135b.a(true);
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
    public boolean O(bx bxVar) {
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
                g0.g3(new s1((Object) list, (Object) ((p10) this.f40b), (Object) ((TLRPC.TL_inputStorePaymentStarsTopup) this.f41c), (Object) ((TL_stars.TL_starsTopupOption) this.d), (Object) ((Activity) this.f42e), 7));
                return;
            default:
                g0.g3(new n2((y8) this.f40b, list, (f0) this.f41c, (TLRPC.TL_inputStorePaymentStarsGiveaway) this.d, fVar, (Activity) this.f42e, 3));
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
                TLRPC.messages_AvailableEffects G0 = mp.u1(((q11) this.f40b).W).G0();
                HashSet hashSet = new HashSet();
                if (G0 != null) {
                    for (int i7 = 0; i7 < arrayList.size(); i7++) {
                        try {
                            if (!((ni) arrayList.get(i7)).f26023a.startsWith("animated_")) {
                                String c10 = j6.c(((ni) arrayList.get(i7)).f26023a);
                                for (int i10 = 0; i10 < G0.effects.size(); i10++) {
                                    TLRPC.TL_availableEffect tL_availableEffect = G0.effects.get(i10);
                                    if (!hashSet.contains(Long.valueOf(tL_availableEffect.f28523id)) && (tL_availableEffect.emoticon.contains(c10) || c10.contains(tL_availableEffect.emoticon))) {
                                        if (tL_availableEffect.effect_animation_id == 0) {
                                            arrayList2 = arrayList4;
                                        } else {
                                            arrayList2 = arrayList5;
                                        }
                                        arrayList2.add(p0.e(tL_availableEffect));
                                        hashSet.add(Long.valueOf(tL_availableEffect.f28523id));
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
                    String str2 = ((ni) arrayList.get(i11)).f26023a;
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
        i6 i6Var = (i6) this.d;
        dy0 dy0Var = (dy0) this.f42e;
        Integer num = (Integer) number;
        Float f10 = (Float) obj;
        LinearLayout g10 = f3.g(context, 1);
        LinearLayout linearLayout = new LinearLayout(context);
        g10.addView(linearLayout, na.t(-2, -2, 1, 0, 0, 0, 0));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(iArr[num.intValue() - 1]);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        linearLayout.addView(imageView, na.o(24, 24));
        if (num.intValue() == 7) {
            for (int i7 = 0; i7 < 2; i7++) {
                ImageView imageView2 = new ImageView(context);
                imageView2.setImageResource(iArr[num.intValue() - 1]);
                imageView2.setScaleType(ImageView.ScaleType.CENTER);
                linearLayout.addView(imageView2, na.o(24, 24));
            }
        }
        TextView textView = new TextView(context);
        textView.setTypeface(g0.o1("fonts/num.otf"));
        u6.U(textView, n6.f29559j5, i6Var);
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
        g10.addView(textView, na.k(0.0f, 3.0f, 0.0f, 0.0f, -1, -2));
        return new ay0(dy0Var, g10, false);
    }

    @Override
    public h9.s1 f(int r17, e2.m1 r18, int[] r19) {
        throw new UnsupportedOperationException("Method not decompiled: a1.d.f(int, e2.m1, int[]):h9.s1");
    }

    @Override
    public void i(t1 t1Var, int i7) {
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
                bn.D0((bn) obj4, (TLRPC.User) obj3, (AtomicBoolean) obj2, (TLRPC.TL_attachMenuBot) obj);
                return;
            case 15:
                String str2 = (String) obj;
                String str3 = LaunchActivity.C1;
                dh0 dh0Var = new dh0((LaunchActivity) obj4, (g2) obj3);
                dh0Var.O0((String) obj2, false);
                if (str2 != null) {
                    String[] split = str2.split(" ", 2);
                    String str4 = split[0];
                    if (split.length > 1) {
                        str = split[1];
                    } else {
                        str = null;
                    }
                    tb0 tb0Var = dh0Var.n1;
                    if (tb0Var != null) {
                        tb0Var.getEditText().setText(str4);
                    } else {
                        dh0Var.E1 = str4;
                    }
                    tb0 tb0Var2 = dh0Var.f47130o1;
                    if (tb0Var2 != null) {
                        tb0Var2.getEditText().setText(str);
                    } else {
                        dh0Var.F1 = str;
                    }
                }
                dh0Var.show();
                return;
            case 16:
                de0.Z((de0) obj4, (String) obj3, (String) obj2, (String) obj);
                return;
            case 17:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) obj4;
                notificationsCustomSettingsActivity.getClass();
                SharedPreferences.Editor edit = ((SharedPreferences) obj3).edit();
                edit.putBoolean((String) obj2, ((boolean[]) obj)[0]);
                edit.apply();
                notificationsCustomSettingsActivity.q0(true);
                notificationsCustomSettingsActivity.getNotificationsController().b0(notificationsCustomSettingsActivity.f43243s);
                return;
            default:
                w91 w91Var = (w91) obj4;
                HashSet hashSet = (HashSet) obj3;
                HashSet hashSet2 = new HashSet();
                w91Var.B0 = hashSet2;
                hashSet2.addAll(hashSet);
                w91Var.Z0(true, false);
                kc.b0(w91Var).U(gd.K0(hashSet.size(), "TopicsDeleted"), false, new w81(w91Var, 4), new t21(w91Var, (ArrayList) obj2, (Runnable) obj, 7)).j();
                w91Var.G0();
                t1Var.dismiss();
                return;
        }
    }

    @Override
    public void o(qb0 qb0Var, int i7) {
        e40 e40Var = (e40) this.f40b;
        qb0 qb0Var2 = (qb0) this.f41c;
        o20 o20Var = (o20) this.d;
        p20 p20Var = (p20) this.f42e;
        try {
            e40Var.f30229c.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        b5.g(e40Var.O1, e40Var.N1, 0L, 604800L, 2, qb0Var2, o20Var, p20Var);
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
        a21 a21Var = (a21) this.f40b;
        TLRPC.User user = (TLRPC.User) this.f41c;
        TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP = (TLRPC.InputCheckPasswordSRP) this.d;
        TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f42e;
        if (j3 != 0) {
            a21Var.T1 = mp.u1(a21Var.f30223a).O0(Long.valueOf(j3));
            a21Var.f1(user, inputCheckPasswordSRP, twoStepVerificationActivity);
            return;
        }
        a21Var.getClass();
    }

    @Override
    public boolean z(bx bxVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i7, int i10, w91 w91Var) {
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
                wb0 wb0Var = (wb0) obj;
                t2 t2Var = ((o2) obj4).d;
                long j10 = ((sr) arrayList.get(0)).f26946a;
                Bundle k10 = a8.p0.k("scrollToTopOnResume", true);
                if (n5.C(j10)) {
                    k10.putInt("enc_id", (int) (j10 & 4294967295L));
                } else if (n5.E(j10)) {
                    k10.putLong("user_id", j10);
                } else {
                    k10.putLong("chat_id", -j10);
                }
                k10.putString("start_text", "@" + n10.o(user) + " " + str);
                Activity activity = t2Var.m0;
                if (activity instanceof LaunchActivity) {
                    g2 lastFragment = ((LaunchActivity) activity).M().getLastFragment();
                    if (mp.u1(t2Var.I).E(k10, lastFragment, null, null)) {
                        wb0Var.dismiss();
                        t2Var.f19024e0 = true;
                        g0.r(t2Var.f19044v0);
                        t2Var.E.h();
                        ks.f(t2Var.I).n(t2Var, 114);
                        ks.e().n(t2Var, 267);
                        ks.f(t2Var.I).n(t2Var, 237);
                        if (!t2Var.R0) {
                            t2.j(t2Var);
                            t2Var.R0 = true;
                        }
                        p4 p4Var = new p4(new bn(k10));
                        p4Var.f29942b = true;
                        lastFragment.presentFragment(p4Var);
                    }
                }
                return true;
            case 9:
                e8 e8Var = (e8) obj4;
                ArrayList arrayList2 = (ArrayList) obj3;
                TLRPC.TL_document tL_document2 = (TLRPC.TL_document) obj2;
                fj fjVar = (fj) obj;
                if (arrayList.size() <= 1 && ((sr) arrayList.get(0)).f26946a != i10.i(e8Var.f30223a).e() && charSequence == null && arrayList2 != null) {
                    sr srVar = (sr) arrayList.get(0);
                    long j11 = srVar.f26946a;
                    Bundle k11 = a8.p0.k("scrollToTopOnResume", true);
                    if (n5.C(j11)) {
                        k11.putInt("enc_id", (int) (j11 & 4294967295L));
                    } else if (n5.E(j11)) {
                        k11.putLong("user_id", j11);
                    } else {
                        k11.putLong("chat_id", -j11);
                    }
                    bn bnVar = new bn(k11);
                    if (srVar.f26947b != 0) {
                        qg.c.a(bnVar, srVar);
                    }
                    if (e8Var.A2.u0(bnVar, true, false)) {
                        bnVar.hc(arrayList2);
                        if (srVar.f26947b != 0) {
                            bxVar.removeSelfFromStack();
                        }
                    } else {
                        bxVar.finishFragment();
                    }
                } else {
                    int i12 = 0;
                    while (i12 < arrayList.size()) {
                        long j12 = ((sr) arrayList.get(i12)).f26946a;
                        if (charSequence != null) {
                            j3 = j12;
                            zy.C(e8Var.f30223a).r0(xy.b(charSequence.toString(), j3, null, null, null, true, null, null, null, true, 0, 0, null, false));
                        } else {
                            j3 = j12;
                        }
                        if (arrayList2 != null) {
                            zy.C(e8Var.f30223a).q0(arrayList2, j3, false, false, true, 0, 0, null, -1, 0L, 0L, null);
                            tL_document = tL_document2;
                        } else {
                            tL_document = tL_document2;
                            zy.C(e8Var.f30223a).r0(xy.e(tL_document, null, fjVar.f24073k.attachPath, j3, null, null, null, null, null, z11, i7, 0, 0, e8Var.f34611q2, false));
                        }
                        i12++;
                        tL_document2 = tL_document;
                    }
                    bxVar.finishFragment();
                    g2 Q = LaunchActivity.Q();
                    if (Q != null) {
                        kc b02 = kc.b0(Q);
                        if (arrayList.size() == 1 && ((sr) arrayList.get(0)).f26946a == i10.i(e8Var.f30223a).e()) {
                            H = gd.N0(2131750481, null);
                        } else if (arrayList.size() == 1 && ((sr) arrayList.get(0)).f26946a > 0) {
                            H = gd.a0(null, null, 2131750480, n5.t(((sr) arrayList.get(0)).f26946a));
                        } else if (arrayList.size() == 1 && ((sr) arrayList.get(0)).f26946a < 0) {
                            H = gd.a0(null, null, 2131750485, n5.t(((sr) arrayList.get(0)).f26946a));
                        } else {
                            H = gd.H(',', "FwdMessageToManyChats", arrayList.size());
                        }
                        b02.Q(2131624029, 36, H).j();
                    }
                }
                return true;
            default:
                TLRPC.User user2 = (TLRPC.User) obj3;
                String str2 = (String) obj2;
                wb0 wb0Var2 = (wb0) obj;
                ti tiVar = ((zh) obj4).f42862e;
                long j13 = ((sr) arrayList.get(0)).f26946a;
                Bundle k12 = a8.p0.k("scrollToTopOnResume", true);
                if (n5.C(j13)) {
                    k12.putInt("enc_id", (int) (j13 & 4294967295L));
                } else if (n5.E(j13)) {
                    k12.putLong("user_id", j13);
                } else {
                    k12.putLong("chat_id", -j13);
                }
                k12.putString("start_text", "@" + n10.o(user2) + " " + str2);
                g2 g2Var = tiVar.f39956a2;
                if (mp.u1(tiVar.H3).E(k12, g2Var, null, null)) {
                    wb0Var2.dismiss();
                    tiVar.a(true);
                    p4 p4Var2 = new p4(new bn(k12));
                    p4Var2.f29942b = true;
                    g2Var.presentFragment(p4Var2);
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
