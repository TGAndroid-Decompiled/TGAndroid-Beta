package a1;

import a3.p;
import a8.p0;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import bi.a3;
import bi.ea;
import bi.u0;
import c8.ha;
import ch.o0;
import com.google.android.gms.tasks.OnFailureListener;
import hi.v2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.j;
import org.telegram.messenger.ez;
import org.telegram.messenger.g0;
import org.telegram.messenger.gz;
import org.telegram.messenger.hd;
import org.telegram.messenger.i6;
import org.telegram.messenger.ij;
import org.telegram.messenger.k5;
import org.telegram.messenger.m5;
import org.telegram.messenger.p10;
import org.telegram.messenger.q1;
import org.telegram.messenger.qi;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.ri;
import org.telegram.messenger.t10;
import org.telegram.messenger.tr;
import org.telegram.messenger.v10;
import org.telegram.messenger.w10;
import org.telegram.messenger.xr;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.o4;
import org.telegram.ui.ActionBar.r1;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.Components.b8;
import org.telegram.ui.Components.bn;
import org.telegram.ui.Components.di;
import org.telegram.ui.Components.fb0;
import org.telegram.ui.Components.hb0;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.jh;
import org.telegram.ui.Components.kb0;
import org.telegram.ui.Components.mb0;
import org.telegram.ui.Components.px0;
import org.telegram.ui.Components.sx0;
import org.telegram.ui.Components.t4;
import org.telegram.ui.Components.v4;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.Wallet.v1;
import org.telegram.ui.a21;
import org.telegram.ui.ah0;
import org.telegram.ui.an;
import org.telegram.ui.c40;
import org.telegram.ui.ce0;
import org.telegram.ui.g4;
import org.telegram.ui.is;
import org.telegram.ui.m20;
import org.telegram.ui.n20;
import org.telegram.ui.q11;
import org.telegram.ui.qw;
import org.telegram.ui.t21;
import org.telegram.ui.v91;
import org.telegram.ui.w81;
import org.telegram.ui.ww;
public final class d implements OnFailureListener, p, q1, qw, r1, t4, fb0, ri, tr, w10 {
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
    public void L(int i7, int i10, boolean z9) {
        TLRPC.BotInlineResult botInlineResult;
        switch (this.f39a) {
            case 7:
                an.G0((an) this.f40b, (TLRPC.TL_document) this.f41c, (String) this.d, this.f42e, z9, i7);
                return;
            case 11:
                bn bnVar = (bn) this.f40b;
                bnVar.f32195j0.b((TLRPC.TL_messageMediaPoll) this.f41c, bnVar.O, bnVar.f32200m1, (ArrayList) this.d, z9, i7, ((Long) this.f42e).longValue());
                bnVar.f38951b.a(true);
                return;
            case 12:
                is isVar = (is) this.f40b;
                TLRPC.Document document = (TLRPC.Document) this.f41c;
                TLRPC.BotInlineResult botInlineResult2 = (TLRPC.BotInlineResult) this.d;
                if (document != null) {
                    botInlineResult = document;
                } else {
                    botInlineResult = botInlineResult2;
                }
                isVar.s(i7, i10, this.f42e, botInlineResult, z9);
                return;
            default:
                ((is) this.f40b).l((TLRPC.Document) this.f41c, (String) this.d, this.f42e, z9, i7, i10);
                return;
        }
    }

    @Override
    public boolean N(ww wwVar) {
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
                g0.h3(new u0(list, (v10) this.f40b, (TLRPC.TL_inputStorePaymentStarsTopup) this.f41c, (TL_stars.TL_starsTopupOption) this.d, (Activity) this.f42e, 5));
                return;
            default:
                g0.h3(new a3((ea) this.f40b, list, (v1) this.f41c, (TLRPC.TL_inputStorePaymentStarsGiveaway) this.d, fVar, (Activity) this.f42e, 2));
                return;
        }
    }

    @Override
    public Object d(Number number, Object obj) {
        Context context = (Context) this.f40b;
        int[] iArr = (int[]) this.f41c;
        f6 f6Var = (f6) this.d;
        sx0 sx0Var = (sx0) this.f42e;
        Integer num = (Integer) number;
        Float f10 = (Float) obj;
        LinearLayout f11 = k5.f(context, 1);
        LinearLayout linearLayout = new LinearLayout(context);
        f11.addView(linearLayout, ha.t(-2, -2, 1, 0, 0, 0, 0));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(iArr[num.intValue() - 1]);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        linearLayout.addView(imageView, ha.o(24, 24));
        if (num.intValue() == 7) {
            for (int i7 = 0; i7 < 2; i7++) {
                ImageView imageView2 = new ImageView(context);
                imageView2.setImageResource(iArr[num.intValue() - 1]);
                imageView2.setScaleType(ImageView.ScaleType.CENTER);
                linearLayout.addView(imageView2, ha.o(24, 24));
            }
        }
        TextView textView = new TextView(context);
        textView.setTypeface(g0.o1("fonts/num.otf"));
        r6.V(textView, k6.f27956j5, f6Var);
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
        f11.addView(textView, ha.k(0.0f, 3.0f, 0.0f, 0.0f, -1, -2));
        return new px0(sx0Var, f11, false);
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
                TLRPC.messages_AvailableEffects E0 = qp.s1(((q11) this.f40b).V).E0();
                HashSet hashSet = new HashSet();
                if (E0 != null) {
                    for (int i7 = 0; i7 < arrayList.size(); i7++) {
                        try {
                            if (!((qi) arrayList.get(i7)).f24690a.startsWith("animated_")) {
                                String c10 = i6.c(((qi) arrayList.get(i7)).f24690a);
                                for (int i10 = 0; i10 < E0.effects.size(); i10++) {
                                    TLRPC.TL_availableEffect tL_availableEffect = E0.effects.get(i10);
                                    if (!hashSet.contains(Long.valueOf(tL_availableEffect.f26983id)) && (tL_availableEffect.emoticon.contains(c10) || c10.contains(tL_availableEffect.emoticon))) {
                                        if (tL_availableEffect.effect_animation_id == 0) {
                                            arrayList2 = arrayList4;
                                        } else {
                                            arrayList2 = arrayList5;
                                        }
                                        arrayList2.add(o0.e(tL_availableEffect));
                                        hashSet.add(Long.valueOf(tL_availableEffect.f26983id));
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
                    String str2 = ((qi) arrayList.get(i11)).f24690a;
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
    public void g(u1 u1Var, int i7) {
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
                an.z0((an) obj4, (TLRPC.User) obj3, (AtomicBoolean) obj2, (TLRPC.TL_attachMenuBot) obj);
                return;
            case 15:
                String str2 = (String) obj;
                String str3 = LaunchActivity.B1;
                ah0 ah0Var = new ah0((LaunchActivity) obj4, (f2) obj3);
                ah0Var.N0((String) obj2, false);
                if (str2 != null) {
                    String[] split = str2.split(" ", 2);
                    String str4 = split[0];
                    if (split.length > 1) {
                        str = split[1];
                    } else {
                        str = null;
                    }
                    kb0 kb0Var = ah0Var.f43628j1;
                    if (kb0Var != null) {
                        kb0Var.getEditText().setText(str4);
                    } else {
                        ah0Var.A1 = str4;
                    }
                    kb0 kb0Var2 = ah0Var.f43629k1;
                    if (kb0Var2 != null) {
                        kb0Var2.getEditText().setText(str);
                    } else {
                        ah0Var.B1 = str;
                    }
                }
                ah0Var.show();
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
                notificationsCustomSettingsActivity.getNotificationsController().b0(notificationsCustomSettingsActivity.f41282s);
                return;
            default:
                v91 v91Var = (v91) obj4;
                HashSet hashSet = (HashSet) obj3;
                HashSet hashSet2 = new HashSet();
                v91Var.A0 = hashSet2;
                hashSet2.addAll(hashSet);
                v91Var.Z0(true, false);
                hc.a0(v91Var).U(hd.K0(hashSet.size(), "TopicsDeleted"), false, new w81(v91Var, 4), new t21(v91Var, (ArrayList) obj2, (Runnable) obj, 7)).j();
                v91Var.G0();
                u1Var.dismiss();
                return;
        }
    }

    @Override
    public h9.t1 h(int r17, e2.m1 r18, int[] r19) {
        throw new UnsupportedOperationException("Method not decompiled: a1.d.h(int, e2.m1, int[]):h9.t1");
    }

    @Override
    public void n(hb0 hb0Var, int i7) {
        c40 c40Var = (c40) this.f40b;
        hb0 hb0Var2 = (hb0) this.f41c;
        m20 m20Var = (m20) this.d;
        n20 n20Var = (n20) this.f42e;
        try {
            c40Var.f28618c.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        v4.g(c40Var.K1, c40Var.J1, 0L, 604800L, 2, hb0Var2, m20Var, n20Var);
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
            a21Var.P1 = qp.s1(a21Var.f28612a).M0(Long.valueOf(j3));
            a21Var.e1(user, inputCheckPasswordSRP, twoStepVerificationActivity);
            return;
        }
        a21Var.getClass();
    }

    @Override
    public boolean y(ww wwVar, ArrayList arrayList, CharSequence charSequence, boolean z9, boolean z10, int i7, int i10, v91 v91Var) {
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
                mb0 mb0Var = (mb0) obj;
                hi.a3 a3Var = ((v2) obj4).d;
                long j10 = ((xr) arrayList.get(0)).f26505a;
                Bundle k10 = p0.k("scrollToTopOnResume", true);
                if (m5.C(j10)) {
                    k10.putInt("enc_id", (int) (j10 & 4294967295L));
                } else if (m5.E(j10)) {
                    k10.putLong("user_id", j10);
                } else {
                    k10.putLong("chat_id", -j10);
                }
                k10.putString("start_text", "@" + t10.n(user) + " " + str);
                Activity activity = a3Var.f14526l0;
                if (activity instanceof LaunchActivity) {
                    f2 lastFragment = ((LaunchActivity) activity).M().getLastFragment();
                    if (qp.s1(a3Var.H).E(k10, lastFragment, null, null)) {
                        mb0Var.dismiss();
                        a3Var.f14516d0 = true;
                        g0.r(a3Var.f14537u0);
                        a3Var.D.h();
                        qs.f(a3Var.H).n(a3Var, 114);
                        qs.e().n(a3Var, 264);
                        qs.f(a3Var.H).n(a3Var, 234);
                        if (!a3Var.Q0) {
                            hi.a3.j(a3Var);
                            a3Var.Q0 = true;
                        }
                        o4 o4Var = new o4(new an(k10));
                        o4Var.f28339b = true;
                        lastFragment.presentFragment(o4Var);
                    }
                }
                return true;
            case 9:
                b8 b8Var = (b8) obj4;
                ArrayList arrayList2 = (ArrayList) obj3;
                TLRPC.TL_document tL_document2 = (TLRPC.TL_document) obj2;
                ij ijVar = (ij) obj;
                if (arrayList.size() <= 1 && ((xr) arrayList.get(0)).f26505a != p10.i(b8Var.f28612a).e() && charSequence == null && arrayList2 != null) {
                    xr xrVar = (xr) arrayList.get(0);
                    long j11 = xrVar.f26505a;
                    Bundle k11 = p0.k("scrollToTopOnResume", true);
                    if (m5.C(j11)) {
                        k11.putInt("enc_id", (int) (j11 & 4294967295L));
                    } else if (m5.E(j11)) {
                        k11.putLong("user_id", j11);
                    } else {
                        k11.putLong("chat_id", -j11);
                    }
                    an anVar = new an(k11);
                    if (xrVar.f26506b != 0) {
                        qg.d.a(anVar, xrVar);
                    }
                    if (b8Var.f32068w2.u0(anVar, true, false)) {
                        anVar.dc(arrayList2);
                        if (xrVar.f26506b != 0) {
                            wwVar.removeSelfFromStack();
                        }
                    } else {
                        wwVar.finishFragment();
                    }
                } else {
                    int i12 = 0;
                    while (i12 < arrayList.size()) {
                        long j12 = ((xr) arrayList.get(i12)).f26505a;
                        if (charSequence != null) {
                            j3 = j12;
                            gz.C(b8Var.f28612a).r0(ez.b(charSequence.toString(), j3, null, null, null, true, null, null, null, true, 0, 0, null, false));
                        } else {
                            j3 = j12;
                        }
                        if (arrayList2 != null) {
                            gz.C(b8Var.f28612a).q0(arrayList2, j3, false, false, true, 0, 0, null, -1, 0L, 0L, null);
                            tL_document = tL_document2;
                        } else {
                            tL_document = tL_document2;
                            gz.C(b8Var.f28612a).r0(ez.e(tL_document, null, ijVar.f23237k.attachPath, j3, null, null, null, null, null, z10, i7, 0, 0, b8Var.f32049m2, false));
                        }
                        i12++;
                        tL_document2 = tL_document;
                    }
                    wwVar.finishFragment();
                    f2 Q = LaunchActivity.Q();
                    if (Q != null) {
                        hc a02 = hc.a0(Q);
                        if (arrayList.size() == 1 && ((xr) arrayList.get(0)).f26505a == p10.i(b8Var.f28612a).e()) {
                            H = hd.M0(2131750497, null);
                        } else if (arrayList.size() == 1 && ((xr) arrayList.get(0)).f26505a > 0) {
                            H = hd.a0(null, null, 2131750496, m5.t(((xr) arrayList.get(0)).f26505a));
                        } else if (arrayList.size() == 1 && ((xr) arrayList.get(0)).f26505a < 0) {
                            H = hd.a0(null, null, 2131750501, m5.t(((xr) arrayList.get(0)).f26505a));
                        } else {
                            H = hd.H(',', "FwdMessageToManyChats", arrayList.size());
                        }
                        a02.Q(2131624028, 36, H).j();
                    }
                }
                return true;
            default:
                TLRPC.User user2 = (TLRPC.User) obj3;
                String str2 = (String) obj2;
                mb0 mb0Var2 = (mb0) obj;
                di diVar = ((jh) obj4).f34974e;
                long j13 = ((xr) arrayList.get(0)).f26505a;
                Bundle k12 = p0.k("scrollToTopOnResume", true);
                if (m5.C(j13)) {
                    k12.putInt("enc_id", (int) (j13 & 4294967295L));
                } else if (m5.E(j13)) {
                    k12.putLong("user_id", j13);
                } else {
                    k12.putLong("chat_id", -j13);
                }
                k12.putString("start_text", "@" + t10.n(user2) + " " + str2);
                f2 f2Var = diVar.W1;
                if (qp.s1(diVar.D3).E(k12, f2Var, null, null)) {
                    mb0Var2.dismiss();
                    diVar.a(true);
                    o4 o4Var2 = new o4(new an(k12));
                    o4Var2.f28339b = true;
                    f2Var.presentFragment(o4Var2);
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
