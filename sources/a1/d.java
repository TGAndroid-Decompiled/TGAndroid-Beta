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
import ki.s2;
import kotlin.jvm.internal.j;
import org.telegram.messenger.az;
import org.telegram.messenger.f3;
import org.telegram.messenger.g0;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.j6;
import org.telegram.messenger.k10;
import org.telegram.messenger.n5;
import org.telegram.messenger.np;
import org.telegram.messenger.oi;
import org.telegram.messenger.p10;
import org.telegram.messenger.pi;
import org.telegram.messenger.pr;
import org.telegram.messenger.q1;
import org.telegram.messenger.r10;
import org.telegram.messenger.s10;
import org.telegram.messenger.tr;
import org.telegram.messenger.yy;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.p4;
import org.telegram.ui.ActionBar.t1;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.a5;
import org.telegram.ui.Components.ai;
import org.telegram.ui.Components.by0;
import org.telegram.ui.Components.c5;
import org.telegram.ui.Components.ey0;
import org.telegram.ui.Components.f8;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.rb0;
import org.telegram.ui.Components.tb0;
import org.telegram.ui.Components.tn;
import org.telegram.ui.Components.ui;
import org.telegram.ui.Components.wb0;
import org.telegram.ui.Components.zb0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.Wallet.e0;
import org.telegram.ui.b21;
import org.telegram.ui.bn;
import org.telegram.ui.cx;
import org.telegram.ui.de0;
import org.telegram.ui.f40;
import org.telegram.ui.fh0;
import org.telegram.ui.g4;
import org.telegram.ui.ls;
import org.telegram.ui.p20;
import org.telegram.ui.q20;
import org.telegram.ui.r11;
import org.telegram.ui.u21;
import org.telegram.ui.ww;
import org.telegram.ui.y81;
import org.telegram.ui.y91;
public final class d implements OnFailureListener, p, q1, ww, org.telegram.ui.ActionBar.q1, a5, rb0, pi, pr, s10 {
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
    public boolean G() {
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
    public void O(int i7, int i10, boolean z10) {
        TLRPC.BotInlineResult botInlineResult;
        switch (this.f39a) {
            case 7:
                bn.J0((bn) this.f40b, (TLRPC.TL_document) this.f41c, (String) this.d, this.f42e, z10, i7);
                return;
            case 11:
                tn tnVar = (tn) this.f40b;
                tnVar.f39947k0.d((TLRPC.TL_messageMediaPoll) this.f41c, tnVar.P, tnVar.n1, (ArrayList) this.d, z10, i7, ((Long) this.f42e).longValue());
                tnVar.f37477b.a(true);
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
    public boolean P(cx cxVar) {
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
                g0.g3(new s1((Object) list, (Object) ((r10) this.f40b), (Object) ((TLRPC.TL_inputStorePaymentStarsTopup) this.f41c), (Object) ((TL_stars.TL_starsTopupOption) this.d), (Object) ((Activity) this.f42e), 7));
                return;
            default:
                g0.g3(new n2((y8) this.f40b, list, (e0) this.f41c, (TLRPC.TL_inputStorePaymentStarsGiveaway) this.d, fVar, (Activity) this.f42e, 3));
                return;
        }
    }

    @Override
    public void e(String str, ArrayList arrayList) {
        ArrayList arrayList2;
        ArrayList arrayList3;
        switch (this.f39a) {
            case 18:
                ArrayList arrayList4 = (ArrayList) this.f41c;
                ArrayList arrayList5 = (ArrayList) this.d;
                Runnable runnable = (Runnable) this.f42e;
                TLRPC.messages_AvailableEffects G0 = np.u1(((r11) this.f40b).W).G0();
                HashSet hashSet = new HashSet();
                if (G0 != null) {
                    for (int i7 = 0; i7 < arrayList.size(); i7++) {
                        try {
                            if (!((oi) arrayList.get(i7)).f26090a.startsWith("animated_")) {
                                String c10 = j6.c(((oi) arrayList.get(i7)).f26090a);
                                for (int i10 = 0; i10 < G0.effects.size(); i10++) {
                                    TLRPC.TL_availableEffect tL_availableEffect = G0.effects.get(i10);
                                    if (!hashSet.contains(Long.valueOf(tL_availableEffect.f28429id)) && (tL_availableEffect.emoticon.contains(c10) || c10.contains(tL_availableEffect.emoticon))) {
                                        if (tL_availableEffect.effect_animation_id == 0) {
                                            arrayList2 = arrayList4;
                                        } else {
                                            arrayList2 = arrayList5;
                                        }
                                        arrayList2.add(p0.e(tL_availableEffect));
                                        hashSet.add(Long.valueOf(tL_availableEffect.f28429id));
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
                    String str2 = ((oi) arrayList.get(i11)).f26090a;
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
    public h9.t1 f(int r17, e2.m1 r18, int[] r19) {
        throw new UnsupportedOperationException("Method not decompiled: a1.d.f(int, e2.m1, int[]):h9.t1");
    }

    @Override
    public Object g(Number number, Object obj) {
        Context context = (Context) this.f40b;
        int[] iArr = (int[]) this.f41c;
        h6 h6Var = (h6) this.d;
        ey0 ey0Var = (ey0) this.f42e;
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
        t6.U(textView, m6.f29455j5, h6Var);
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
        return new by0(ey0Var, g10, false);
    }

    @Override
    public void h(t1 t1Var, int i7) {
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
                fh0 fh0Var = new fh0((LaunchActivity) obj4, (g2) obj3);
                fh0Var.O0((String) obj2, false);
                if (str2 != null) {
                    String[] split = str2.split(" ", 2);
                    String str4 = split[0];
                    if (split.length > 1) {
                        str = split[1];
                    } else {
                        str = null;
                    }
                    wb0 wb0Var = fh0Var.n1;
                    if (wb0Var != null) {
                        wb0Var.getEditText().setText(str4);
                    } else {
                        fh0Var.E1 = str4;
                    }
                    wb0 wb0Var2 = fh0Var.f47698o1;
                    if (wb0Var2 != null) {
                        wb0Var2.getEditText().setText(str);
                    } else {
                        fh0Var.F1 = str;
                    }
                }
                fh0Var.show();
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
                notificationsCustomSettingsActivity.getNotificationsController().b0(notificationsCustomSettingsActivity.f43133s);
                return;
            default:
                y91 y91Var = (y91) obj4;
                HashSet hashSet = (HashSet) obj3;
                HashSet hashSet2 = new HashSet();
                y91Var.B0 = hashSet2;
                hashSet2.addAll(hashSet);
                y91Var.Z0(true, false);
                lc.b0(y91Var).U(hd.K0(hashSet.size(), "TopicsDeleted"), false, new y81(y91Var, 4), new u21(y91Var, (ArrayList) obj2, (Runnable) obj, 7)).j();
                y91Var.G0();
                t1Var.dismiss();
                return;
        }
    }

    @Override
    public void n(tb0 tb0Var, int i7) {
        f40 f40Var = (f40) this.f40b;
        tb0 tb0Var2 = (tb0) this.f41c;
        p20 p20Var = (p20) this.d;
        q20 q20Var = (q20) this.f42e;
        try {
            f40Var.f30145c.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        c5.g(f40Var.O1, f40Var.N1, 0L, 604800L, 2, tb0Var2, p20Var, q20Var);
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
        b21 b21Var = (b21) this.f40b;
        TLRPC.User user = (TLRPC.User) this.f41c;
        TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP = (TLRPC.InputCheckPasswordSRP) this.d;
        TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f42e;
        if (j3 != 0) {
            b21Var.T1 = np.u1(b21Var.f30139a).O0(Long.valueOf(j3));
            b21Var.f1(user, inputCheckPasswordSRP, twoStepVerificationActivity);
            return;
        }
        b21Var.getClass();
    }

    @Override
    public boolean y(cx cxVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i7, int i10, y91 y91Var) {
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
                zb0 zb0Var = (zb0) obj;
                s2 s2Var = ((ki.n2) obj4).d;
                long j10 = ((tr) arrayList.get(0)).f27037a;
                Bundle k10 = a8.p0.k("scrollToTopOnResume", true);
                if (n5.C(j10)) {
                    k10.putInt("enc_id", (int) (j10 & 4294967295L));
                } else if (n5.E(j10)) {
                    k10.putLong("user_id", j10);
                } else {
                    k10.putLong("chat_id", -j10);
                }
                k10.putString("start_text", "@" + p10.o(user) + " " + str);
                Activity activity = s2Var.m0;
                if (activity instanceof LaunchActivity) {
                    g2 lastFragment = ((LaunchActivity) activity).M().getLastFragment();
                    if (np.u1(s2Var.I).E(k10, lastFragment, null, null)) {
                        zb0Var.dismiss();
                        s2Var.f18905e0 = true;
                        g0.r(s2Var.f18925v0);
                        s2Var.E.h();
                        org.telegram.messenger.ls.f(s2Var.I).n(s2Var, 114);
                        org.telegram.messenger.ls.e().n(s2Var, 267);
                        org.telegram.messenger.ls.f(s2Var.I).n(s2Var, 237);
                        if (!s2Var.R0) {
                            s2.j(s2Var);
                            s2Var.R0 = true;
                        }
                        p4 p4Var = new p4(new bn(k10));
                        p4Var.f29854b = true;
                        lastFragment.presentFragment(p4Var);
                    }
                }
                return true;
            case 9:
                f8 f8Var = (f8) obj4;
                ArrayList arrayList2 = (ArrayList) obj3;
                TLRPC.TL_document tL_document2 = (TLRPC.TL_document) obj2;
                gj gjVar = (gj) obj;
                if (arrayList.size() <= 1 && ((tr) arrayList.get(0)).f27037a != k10.i(f8Var.f30139a).e() && charSequence == null && arrayList2 != null) {
                    tr trVar = (tr) arrayList.get(0);
                    long j11 = trVar.f27037a;
                    Bundle k11 = a8.p0.k("scrollToTopOnResume", true);
                    if (n5.C(j11)) {
                        k11.putInt("enc_id", (int) (j11 & 4294967295L));
                    } else if (n5.E(j11)) {
                        k11.putLong("user_id", j11);
                    } else {
                        k11.putLong("chat_id", -j11);
                    }
                    bn bnVar = new bn(k11);
                    if (trVar.f27038b != 0) {
                        qg.c.a(bnVar, trVar);
                    }
                    if (f8Var.A2.u0(bnVar, true, false)) {
                        bnVar.hc(arrayList2);
                        if (trVar.f27038b != 0) {
                            cxVar.removeSelfFromStack();
                        }
                    } else {
                        cxVar.finishFragment();
                    }
                } else {
                    int i12 = 0;
                    while (i12 < arrayList.size()) {
                        long j12 = ((tr) arrayList.get(i12)).f27037a;
                        if (charSequence != null) {
                            j3 = j12;
                            az.C(f8Var.f30139a).r0(yy.b(charSequence.toString(), j3, null, null, null, true, null, null, null, true, 0, 0, null, false));
                        } else {
                            j3 = j12;
                        }
                        if (arrayList2 != null) {
                            az.C(f8Var.f30139a).q0(arrayList2, j3, false, false, true, 0, 0, null, -1, 0L, 0L, null);
                            tL_document = tL_document2;
                        } else {
                            tL_document = tL_document2;
                            az.C(f8Var.f30139a).r0(yy.e(tL_document, null, gjVar.f24177k.attachPath, j3, null, null, null, null, null, z11, i7, 0, 0, f8Var.f35105q2, false));
                        }
                        i12++;
                        tL_document2 = tL_document;
                    }
                    cxVar.finishFragment();
                    g2 Q = LaunchActivity.Q();
                    if (Q != null) {
                        lc b02 = lc.b0(Q);
                        if (arrayList.size() == 1 && ((tr) arrayList.get(0)).f27037a == k10.i(f8Var.f30139a).e()) {
                            H = hd.N0(2131750481, null);
                        } else if (arrayList.size() == 1 && ((tr) arrayList.get(0)).f27037a > 0) {
                            H = hd.a0(null, null, 2131750480, n5.t(((tr) arrayList.get(0)).f27037a));
                        } else if (arrayList.size() == 1 && ((tr) arrayList.get(0)).f27037a < 0) {
                            H = hd.a0(null, null, 2131750485, n5.t(((tr) arrayList.get(0)).f27037a));
                        } else {
                            H = hd.H(',', "FwdMessageToManyChats", arrayList.size());
                        }
                        b02.Q(2131624029, 36, H).j();
                    }
                }
                return true;
            default:
                TLRPC.User user2 = (TLRPC.User) obj3;
                String str2 = (String) obj2;
                zb0 zb0Var2 = (zb0) obj;
                ui uiVar = ((ai) obj4).f33493e;
                long j13 = ((tr) arrayList.get(0)).f27037a;
                Bundle k12 = a8.p0.k("scrollToTopOnResume", true);
                if (n5.C(j13)) {
                    k12.putInt("enc_id", (int) (j13 & 4294967295L));
                } else if (n5.E(j13)) {
                    k12.putLong("user_id", j13);
                } else {
                    k12.putLong("chat_id", -j13);
                }
                k12.putString("start_text", "@" + p10.o(user2) + " " + str2);
                g2 g2Var = uiVar.f40352a2;
                if (np.u1(uiVar.H3).E(k12, g2Var, null, null)) {
                    zb0Var2.dismiss();
                    uiVar.a(true);
                    p4 p4Var2 = new p4(new bn(k12));
                    p4Var2.f29854b = true;
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
