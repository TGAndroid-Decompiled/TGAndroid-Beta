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
import bi.h2;
import c8.ma;
import ch.p0;
import com.google.android.gms.tasks.OnFailureListener;
import di.x8;
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
import org.telegram.messenger.j10;
import org.telegram.messenger.j6;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.n5;
import org.telegram.messenger.ni;
import org.telegram.messenger.o10;
import org.telegram.messenger.oi;
import org.telegram.messenger.or;
import org.telegram.messenger.q1;
import org.telegram.messenger.q10;
import org.telegram.messenger.r10;
import org.telegram.messenger.sr;
import org.telegram.messenger.xy;
import org.telegram.messenger.zy;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.q4;
import org.telegram.ui.ActionBar.r1;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.b5;
import org.telegram.ui.Components.cy0;
import org.telegram.ui.Components.g8;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.qb0;
import org.telegram.ui.Components.rn;
import org.telegram.ui.Components.sb0;
import org.telegram.ui.Components.si;
import org.telegram.ui.Components.vb0;
import org.telegram.ui.Components.yb0;
import org.telegram.ui.Components.yh;
import org.telegram.ui.Components.z4;
import org.telegram.ui.Components.zx0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.Wallet.e0;
import org.telegram.ui.b21;
import org.telegram.ui.bn;
import org.telegram.ui.cx;
import org.telegram.ui.ee0;
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
public final class d implements OnFailureListener, p, q1, ww, r1, z4, qb0, oi, or, r10 {
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
                rn rnVar = (rn) this.f40b;
                rnVar.f39227k0.d((TLRPC.TL_messageMediaPoll) this.f41c, rnVar.P, rnVar.n1, (ArrayList) this.d, z10, i7, ((Long) this.f42e).longValue());
                rnVar.f36766b.a(true);
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
                g0.g3(new ai.b(list, (q10) this.f40b, (TLRPC.TL_inputStorePaymentStarsTopup) this.f41c, (TL_stars.TL_starsTopupOption) this.d, (Activity) this.f42e, 8));
                return;
            default:
                g0.g3(new h2((x8) this.f40b, list, (e0) this.f41c, (TLRPC.TL_inputStorePaymentStarsGiveaway) this.d, fVar, (Activity) this.f42e, 3));
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
                TLRPC.messages_AvailableEffects G0 = mp.u1(((r11) this.f40b).W).G0();
                HashSet hashSet = new HashSet();
                if (G0 != null) {
                    for (int i7 = 0; i7 < arrayList.size(); i7++) {
                        try {
                            if (!((ni) arrayList.get(i7)).f25927a.startsWith("animated_")) {
                                String c10 = j6.c(((ni) arrayList.get(i7)).f25927a);
                                for (int i10 = 0; i10 < G0.effects.size(); i10++) {
                                    TLRPC.TL_availableEffect tL_availableEffect = G0.effects.get(i10);
                                    if (!hashSet.contains(Long.valueOf(tL_availableEffect.f28434id)) && (tL_availableEffect.emoticon.contains(c10) || c10.contains(tL_availableEffect.emoticon))) {
                                        if (tL_availableEffect.effect_animation_id == 0) {
                                            arrayList2 = arrayList4;
                                        } else {
                                            arrayList2 = arrayList5;
                                        }
                                        arrayList2.add(p0.e(tL_availableEffect));
                                        hashSet.add(Long.valueOf(tL_availableEffect.f28434id));
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
                    String str2 = ((ni) arrayList.get(i11)).f25927a;
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
        i6 i6Var = (i6) this.d;
        cy0 cy0Var = (cy0) this.f42e;
        Integer num = (Integer) number;
        Float f10 = (Float) obj;
        LinearLayout g10 = f3.g(context, 1);
        LinearLayout linearLayout = new LinearLayout(context);
        g10.addView(linearLayout, ma.t(-2, -2, 1, 0, 0, 0, 0));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(iArr[num.intValue() - 1]);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        linearLayout.addView(imageView, ma.o(24, 24));
        if (num.intValue() == 7) {
            for (int i7 = 0; i7 < 2; i7++) {
                ImageView imageView2 = new ImageView(context);
                imageView2.setImageResource(iArr[num.intValue() - 1]);
                imageView2.setScaleType(ImageView.ScaleType.CENTER);
                linearLayout.addView(imageView2, ma.o(24, 24));
            }
        }
        TextView textView = new TextView(context);
        textView.setTypeface(g0.o1("fonts/num.otf"));
        u6.U(textView, n6.f29502j5, i6Var);
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
        g10.addView(textView, ma.k(0.0f, 3.0f, 0.0f, 0.0f, -1, -2));
        return new zx0(cy0Var, g10, false);
    }

    @Override
    public void h(u1 u1Var, int i7) {
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
                fh0 fh0Var = new fh0((LaunchActivity) obj4, (org.telegram.ui.ActionBar.h2) obj3);
                fh0Var.O0((String) obj2, false);
                if (str2 != null) {
                    String[] split = str2.split(" ", 2);
                    String str4 = split[0];
                    if (split.length > 1) {
                        str = split[1];
                    } else {
                        str = null;
                    }
                    vb0 vb0Var = fh0Var.n1;
                    if (vb0Var != null) {
                        vb0Var.getEditText().setText(str4);
                    } else {
                        fh0Var.E1 = str4;
                    }
                    vb0 vb0Var2 = fh0Var.f47659o1;
                    if (vb0Var2 != null) {
                        vb0Var2.getEditText().setText(str);
                    } else {
                        fh0Var.F1 = str;
                    }
                }
                fh0Var.show();
                return;
            case 16:
                ee0.Z((ee0) obj4, (String) obj3, (String) obj2, (String) obj);
                return;
            case 17:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) obj4;
                notificationsCustomSettingsActivity.getClass();
                SharedPreferences.Editor edit = ((SharedPreferences) obj3).edit();
                edit.putBoolean((String) obj2, ((boolean[]) obj)[0]);
                edit.apply();
                notificationsCustomSettingsActivity.q0(true);
                notificationsCustomSettingsActivity.getNotificationsController().b0(notificationsCustomSettingsActivity.f43123s);
                return;
            default:
                y91 y91Var = (y91) obj4;
                HashSet hashSet = (HashSet) obj3;
                HashSet hashSet2 = new HashSet();
                y91Var.B0 = hashSet2;
                hashSet2.addAll(hashSet);
                y91Var.Z0(true, false);
                lc.b0(y91Var).U(gd.K0(hashSet.size(), "TopicsDeleted"), false, new y81(y91Var, 4), new u21(y91Var, (ArrayList) obj2, (Runnable) obj, 7)).j();
                y91Var.G0();
                u1Var.dismiss();
                return;
        }
    }

    @Override
    public void n(sb0 sb0Var, int i7) {
        f40 f40Var = (f40) this.f40b;
        sb0 sb0Var2 = (sb0) this.f41c;
        p20 p20Var = (p20) this.d;
        q20 q20Var = (q20) this.f42e;
        try {
            f40Var.f30193c.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        b5.g(f40Var.O1, f40Var.N1, 0L, 604800L, 2, sb0Var2, p20Var, q20Var);
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
            b21Var.T1 = mp.u1(b21Var.f30187a).O0(Long.valueOf(j3));
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
                yb0 yb0Var = (yb0) obj;
                t2 t2Var = ((o2) obj4).d;
                long j10 = ((sr) arrayList.get(0)).f26845a;
                Bundle k10 = a8.p0.k("scrollToTopOnResume", true);
                if (n5.C(j10)) {
                    k10.putInt("enc_id", (int) (j10 & 4294967295L));
                } else if (n5.E(j10)) {
                    k10.putLong("user_id", j10);
                } else {
                    k10.putLong("chat_id", -j10);
                }
                k10.putString("start_text", "@" + o10.o(user) + " " + str);
                Activity activity = t2Var.m0;
                if (activity instanceof LaunchActivity) {
                    org.telegram.ui.ActionBar.h2 lastFragment = ((LaunchActivity) activity).M().getLastFragment();
                    if (mp.u1(t2Var.I).E(k10, lastFragment, null, null)) {
                        yb0Var.dismiss();
                        t2Var.f18926e0 = true;
                        g0.r(t2Var.f18946v0);
                        t2Var.E.h();
                        ks.f(t2Var.I).n(t2Var, 114);
                        ks.e().n(t2Var, 267);
                        ks.f(t2Var.I).n(t2Var, 237);
                        if (!t2Var.R0) {
                            t2.j(t2Var);
                            t2Var.R0 = true;
                        }
                        q4 q4Var = new q4(new bn(k10));
                        q4Var.f29902b = true;
                        lastFragment.presentFragment(q4Var);
                    }
                }
                return true;
            case 9:
                g8 g8Var = (g8) obj4;
                ArrayList arrayList2 = (ArrayList) obj3;
                TLRPC.TL_document tL_document2 = (TLRPC.TL_document) obj2;
                fj fjVar = (fj) obj;
                if (arrayList.size() <= 1 && ((sr) arrayList.get(0)).f26845a != j10.i(g8Var.f30187a).e() && charSequence == null && arrayList2 != null) {
                    sr srVar = (sr) arrayList.get(0);
                    long j11 = srVar.f26845a;
                    Bundle k11 = a8.p0.k("scrollToTopOnResume", true);
                    if (n5.C(j11)) {
                        k11.putInt("enc_id", (int) (j11 & 4294967295L));
                    } else if (n5.E(j11)) {
                        k11.putLong("user_id", j11);
                    } else {
                        k11.putLong("chat_id", -j11);
                    }
                    bn bnVar = new bn(k11);
                    if (srVar.f26846b != 0) {
                        qg.c.a(bnVar, srVar);
                    }
                    if (g8Var.A2.u0(bnVar, true, false)) {
                        bnVar.hc(arrayList2);
                        if (srVar.f26846b != 0) {
                            cxVar.removeSelfFromStack();
                        }
                    } else {
                        cxVar.finishFragment();
                    }
                } else {
                    int i12 = 0;
                    while (i12 < arrayList.size()) {
                        long j12 = ((sr) arrayList.get(i12)).f26845a;
                        if (charSequence != null) {
                            j3 = j12;
                            zy.C(g8Var.f30187a).r0(xy.b(charSequence.toString(), j3, null, null, null, true, null, null, null, true, 0, 0, null, false));
                        } else {
                            j3 = j12;
                        }
                        if (arrayList2 != null) {
                            zy.C(g8Var.f30187a).q0(arrayList2, j3, false, false, true, 0, 0, null, -1, 0L, 0L, null);
                            tL_document = tL_document2;
                        } else {
                            tL_document = tL_document2;
                            zy.C(g8Var.f30187a).r0(xy.e(tL_document, null, fjVar.f23965k.attachPath, j3, null, null, null, null, null, z11, i7, 0, 0, g8Var.f35405q2, false));
                        }
                        i12++;
                        tL_document2 = tL_document;
                    }
                    cxVar.finishFragment();
                    org.telegram.ui.ActionBar.h2 Q = LaunchActivity.Q();
                    if (Q != null) {
                        lc b02 = lc.b0(Q);
                        if (arrayList.size() == 1 && ((sr) arrayList.get(0)).f26845a == j10.i(g8Var.f30187a).e()) {
                            H = gd.M0(2131750482, null);
                        } else if (arrayList.size() == 1 && ((sr) arrayList.get(0)).f26845a > 0) {
                            H = gd.a0(null, null, 2131750481, n5.t(((sr) arrayList.get(0)).f26845a));
                        } else if (arrayList.size() == 1 && ((sr) arrayList.get(0)).f26845a < 0) {
                            H = gd.a0(null, null, 2131750486, n5.t(((sr) arrayList.get(0)).f26845a));
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
                yb0 yb0Var2 = (yb0) obj;
                si siVar = ((yh) obj4).f42500e;
                long j13 = ((sr) arrayList.get(0)).f26845a;
                Bundle k12 = a8.p0.k("scrollToTopOnResume", true);
                if (n5.C(j13)) {
                    k12.putInt("enc_id", (int) (j13 & 4294967295L));
                } else if (n5.E(j13)) {
                    k12.putLong("user_id", j13);
                } else {
                    k12.putLong("chat_id", -j13);
                }
                k12.putString("start_text", "@" + o10.o(user2) + " " + str2);
                org.telegram.ui.ActionBar.h2 h2Var = siVar.f39659a2;
                if (mp.u1(siVar.H3).E(k12, h2Var, null, null)) {
                    yb0Var2.dismiss();
                    siVar.a(true);
                    q4 q4Var2 = new q4(new bn(k12));
                    q4Var2.f29902b = true;
                    h2Var.presentFragment(q4Var2);
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
