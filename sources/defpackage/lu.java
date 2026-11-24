package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import com.google.android.gms.tasks.OnFailureListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.Wallet.c;
import org.telegram.ui.o;
public final class lu implements ee, hk3, gk, OnFailureListener, ce3, jp7, es6, xe7, kac, bj0 {
    public final byte a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public lu(LaunchActivity launchActivity, d dVar, String str, String str2) {
        this.a = (byte) 13;
        this.b = launchActivity;
        this.e = dVar;
        this.c = str;
        this.d = str2;
    }

    @Override
    public final boolean E() {
        byte b = this.a;
        return false;
    }

    @Override
    public final void b(fj0 fj0Var, List list) {
        byte b = this.a;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (b) {
            case 22:
                gm.c3(new hz7(list, (jac) obj4, (TLRPC.TL_inputStorePaymentStarsTopup) obj3, (TL_stars.TL_starsTopupOption) obj2, (Activity) obj, (byte) 28));
                return;
            default:
                gm.c3(new fqa((jva) obj4, list, (lf2) obj3, (TLRPC.TL_inputStorePaymentStarsGiveaway) obj2, fj0Var, (Activity) obj, (byte) 2));
                return;
        }
    }

    @Override
    public final void f(String str, ArrayList arrayList) {
        int intValue;
        ArrayList arrayList2;
        byte b = this.a;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (b) {
            case 15:
                hs6 hs6Var = (hs6) obj4;
                fs6 fs6Var = (fs6) obj3;
                gs6 gs6Var = (gs6) obj2;
                qac qacVar = (qac) obj;
                HashMap hashMap = hs6Var.S1;
                if (hashMap.containsKey(fs6Var)) {
                    StringBuilder sb = new StringBuilder();
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj5 = arrayList.get(i);
                        i++;
                        ds6 ds6Var = (ds6) obj5;
                        if (!TextUtils.isEmpty(ds6Var.a) && !ds6Var.a.startsWith("animated_")) {
                            sb.append(ds6Var.a);
                        }
                    }
                    TLRPC.TL_messages_searchStickers tL_messages_searchStickers = new TLRPC.TL_messages_searchStickers();
                    boolean z = fs6Var.a;
                    String str2 = fs6Var.b;
                    tL_messages_searchStickers.emojis = z;
                    if (!TextUtils.isEmpty(str2)) {
                        tL_messages_searchStickers.lang_code.add(str2);
                    }
                    tL_messages_searchStickers.emoticon = sb.toString();
                    tL_messages_searchStickers.q = fs6Var.c;
                    tL_messages_searchStickers.limit = 100;
                    if (gs6Var == null) {
                        intValue = 0;
                    } else {
                        intValue = gs6Var.b.intValue();
                    }
                    tL_messages_searchStickers.offset = intValue;
                    hashMap.put(fs6Var, Integer.valueOf(hs6Var.getConnectionsManager().sendRequestTyped(tL_messages_searchStickers, new kc((byte) 0), new nv0(hs6Var, fs6Var, gs6Var, qacVar, (byte) 11))));
                    return;
                }
                return;
            case 16:
            default:
                HashMap hashMap2 = (HashMap) obj4;
                HashMap hashMap3 = (HashMap) obj3;
                ArrayList arrayList3 = (ArrayList) obj2;
                Runnable runnable = (Runnable) obj;
                int size2 = arrayList.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    String str3 = ((ds6) arrayList.get(i2)).a;
                    ArrayList arrayList4 = (ArrayList) hashMap2.get(str3);
                    if (arrayList4 != null && !arrayList4.isEmpty() && !hashMap3.containsKey(arrayList4)) {
                        hashMap3.put(arrayList4, str3);
                        arrayList3.add(arrayList4);
                    }
                }
                runnable.run();
                return;
            case 17:
                ArrayList arrayList5 = (ArrayList) obj3;
                ArrayList arrayList6 = (ArrayList) obj2;
                Runnable runnable2 = (Runnable) obj;
                TLRPC.messages_AvailableEffects D0 = oc7.r1(((vz9) obj4).W).D0();
                HashSet hashSet = new HashSet();
                if (D0 != null) {
                    for (int i3 = 0; i3 < arrayList.size(); i3++) {
                        try {
                            if (!((ds6) arrayList.get(i3)).a.startsWith("animated_")) {
                                String c = gw3.c(((ds6) arrayList.get(i3)).a);
                                for (int i4 = 0; i4 < D0.effects.size(); i4++) {
                                    TLRPC.TL_availableEffect tL_availableEffect = D0.effects.get(i4);
                                    if (!hashSet.contains(Long.valueOf(tL_availableEffect.id)) && (tL_availableEffect.emoticon.contains(c) || c.contains(tL_availableEffect.emoticon))) {
                                        if (tL_availableEffect.effect_animation_id == 0) {
                                            arrayList2 = arrayList5;
                                        } else {
                                            arrayList2 = arrayList6;
                                        }
                                        arrayList2.add(k39.e(tL_availableEffect));
                                        hashSet.add(Long.valueOf(tL_availableEffect.id));
                                    }
                                }
                            }
                        } catch (Exception unused) {
                        }
                    }
                }
                runnable2.run();
                return;
        }
    }

    @Override
    public final void g(lp7 lp7Var, int i) {
        g95 g95Var = (g95) this.b;
        lp7 lp7Var2 = (lp7) this.c;
        r75 r75Var = (r75) this.d;
        s75 s75Var = (s75) this.e;
        try {
            g95Var.c.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        ik.g(g95Var.M1, g95Var.L1, 0L, 604800L, 2, lp7Var2, r75Var, s75Var);
    }

    @Override
    public final Object j(Integer num, Object obj) {
        Context context = (Context) this.b;
        int[] iArr = (int[]) this.c;
        ylb ylbVar = (ylb) this.d;
        mhb mhbVar = (mhb) this.e;
        Float f = (Float) obj;
        LinearLayout i = hg9.i(context, 1);
        LinearLayout linearLayout = new LinearLayout(context);
        i.addView(linearLayout, qoe.t(-2, -2, 1, 0, 0, 0, 0));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(iArr[num.intValue() - 1]);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        linearLayout.addView(imageView, qoe.o(24, 24));
        if (num.intValue() == 7) {
            for (int i2 = 0; i2 < 2; i2++) {
                ImageView imageView2 = new ImageView(context);
                imageView2.setImageResource(iArr[num.intValue() - 1]);
                imageView2.setScaleType(ImageView.ScaleType.CENTER);
                linearLayout.addView(imageView2, qoe.o(24, 24));
            }
        }
        TextView textView = new TextView(context);
        textView.setTypeface(gm.n1("fonts/num.otf"));
        anb.X(textView, cmb.i5, ylbVar);
        StringBuilder sb = new StringBuilder("x");
        int i3 = (f.floatValue() > 0.0f ? 1 : (f.floatValue() == 0.0f ? 0 : -1));
        Object obj2 = f;
        if (i3 <= 0) {
            obj2 = "0";
        }
        sb.append(obj2);
        textView.setText(sb.toString());
        textView.setTextSize(1, 13.0f);
        textView.setGravity(17);
        i.addView(textView, qoe.k(0.0f, 3.0f, 0.0f, 0.0f, -1, -2));
        return new jhb(mhbVar, i, false);
    }

    @Override
    public final defpackage.y79 n(int r17, defpackage.uzb r18, int[] r19) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lu.n(int, uzb, int[]):y79");
    }

    @Override
    public final void onFailure(final Exception exc) {
        byte b = this.a;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (b) {
            case 9:
                final k23 k23Var = (k23) obj3;
                final Executor executor = (Executor) obj2;
                final a33 a33Var = (a33) obj;
                exc.getClass();
                pr4 pr4Var = new pr4(k23Var, exc, executor, a33Var) {
                    public final Exception a;
                    public final Executor b;
                    public final a33 c;

                    {
                        this.a = exc;
                        this.b = executor;
                        this.c = a33Var;
                    }

                    @Override
                    public final Object invoke() {
                        Object n13Var;
                        Exception exc2 = this.a;
                        if (exc2 instanceof ap) {
                            int statusCode = ((ap) exc2).getStatusCode();
                            if (statusCode == 16) {
                                n13Var = new m13(exc2.getMessage());
                            } else if (statusCode == 17) {
                                n13Var = new n13("API is not supported: " + exc2.getMessage(), (byte) 3);
                            } else if (statusCode == 8) {
                                n13Var = new r13(exc2.getMessage());
                            } else if (j33.b.contains(Integer.valueOf(statusCode))) {
                                n13Var = new q13(exc2.getMessage());
                            } else {
                                n13Var = new n13("Conditional create failed, failure: " + exc2.getMessage(), (byte) 2);
                            }
                        } else if (exc2 instanceof e8c) {
                            n13Var = new n13("API is unsupported", (byte) 3);
                        } else {
                            n13Var = new n13("Conditional create failed, failure: " + exc2, (byte) 2);
                        }
                        this.b.execute(new mv2(this.c, n13Var, (byte) 15));
                        return g7c.a;
                    }
                };
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!w33.a((CancellationSignal) obj4)) {
                    pr4Var.invoke();
                    return;
                }
                return;
            default:
                CredentialProviderPlayServicesImpl.runFallbackClearCredFlow$lambda$27((CredentialProviderPlayServicesImpl) obj4, (CancellationSignal) obj3, (Executor) obj2, (a33) obj, exc);
                return;
        }
    }

    @Override
    public final boolean q(nk3 nk3Var, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i, int i2, sxb sxbVar) {
        long j;
        String H;
        long j2;
        TLRPC.TL_document tL_document;
        byte b = this.a;
        Object obj = this.e;
        Object obj2 = this.c;
        Object obj3 = this.d;
        Object obj4 = this.b;
        switch (b) {
            case 1:
                i30 i30Var = (i30) obj4;
                ArrayList arrayList2 = (ArrayList) obj2;
                TLRPC.TL_document tL_document2 = (TLRPC.TL_document) obj3;
                k47 k47Var = (k47) obj;
                if (arrayList.size() <= 1) {
                    j = 0;
                    if (((bf7) arrayList.get(0)).a != z8c.h(i30Var.a).e() && charSequence == null && arrayList2 != null) {
                        bf7 bf7Var = (bf7) arrayList.get(0);
                        long j3 = bf7Var.a;
                        Bundle l = ts2.l("scrollToTopOnResume", true);
                        if (pg3.B(j3)) {
                            l.putInt("enc_id", (int) (j3 & 4294967295L));
                        } else if (pg3.D(j3)) {
                            l.putLong("user_id", j3);
                        } else {
                            l.putLong("chat_id", -j3);
                        }
                        yv1 yv1Var = new yv1(l);
                        if (bf7Var.b != 0) {
                            no4.a(yv1Var, bf7Var);
                        }
                        if (i30Var.z2.u0(yv1Var, true, false)) {
                            yv1Var.cc(arrayList2);
                            if (bf7Var.b != 0) {
                                nk3Var.removeSelfFromStack();
                            }
                        } else {
                            nk3Var.finishFragment();
                        }
                        return true;
                    }
                } else {
                    j = 0;
                }
                int i3 = 0;
                while (i3 < arrayList.size()) {
                    long j4 = ((bf7) arrayList.get(i3)).a;
                    if (charSequence != null) {
                        j2 = j4;
                        a6a.B(i30Var.a).q0(y5a.b(charSequence.toString(), j2, null, null, null, true, null, null, null, true, 0, 0, null, false));
                    } else {
                        j2 = j4;
                    }
                    int i4 = i30Var.a;
                    if (arrayList2 != null) {
                        a6a.B(i4).p0(arrayList2, j2, false, false, true, 0, 0, null, -1, 0L, 0L, null);
                        tL_document = tL_document2;
                    } else {
                        tL_document = tL_document2;
                        a6a.B(i4).q0(y5a.e(tL_document, null, k47Var.k.attachPath, j2, null, null, null, null, null, z2, i, 0, 0, i30Var.p2, false));
                    }
                    i3++;
                    tL_document2 = tL_document;
                }
                nk3Var.finishFragment();
                d Q = LaunchActivity.Q();
                if (Q != null) {
                    c41 b0 = c41.b0(Q);
                    if (arrayList.size() == 1 && ((bf7) arrayList.get(0)).a == z8c.h(i30Var.a).e()) {
                        H = jb6.M0(2131750431, null);
                    } else if (arrayList.size() == 1 && ((bf7) arrayList.get(0)).a > j) {
                        H = jb6.a0(null, null, 2131750430, pg3.s(((bf7) arrayList.get(0)).a));
                    } else if (arrayList.size() == 1 && ((bf7) arrayList.get(0)).a < j) {
                        H = jb6.a0(null, null, 2131750435, pg3.s(((bf7) arrayList.get(0)).a));
                    } else {
                        H = jb6.H(',', "FwdMessageToManyChats", arrayList.size());
                    }
                    b0.Q(2131624029, 36, H).j();
                }
                return true;
            case 2:
                TLRPC.User user = (TLRPC.User) obj3;
                String str = (String) obj2;
                ht7 ht7Var = (ht7) obj;
                wx0 wx0Var = ((rx0) obj4).d;
                long j5 = ((bf7) arrayList.get(0)).a;
                Bundle l2 = ts2.l("scrollToTopOnResume", true);
                if (pg3.B(j5)) {
                    l2.putInt("enc_id", (int) (j5 & 4294967295L));
                } else if (pg3.D(j5)) {
                    l2.putLong("user_id", j5);
                } else {
                    l2.putLong("chat_id", -j5);
                }
                l2.putString("start_text", "@" + m9c.p(user) + " " + str);
                Activity activity = wx0Var.m0;
                if (activity instanceof LaunchActivity) {
                    d lastFragment = ((LaunchActivity) activity).N().getLastFragment();
                    if (oc7.r1(wx0Var.I).A(l2, lastFragment, null, null)) {
                        ht7Var.dismiss();
                        wx0Var.e0 = true;
                        gm.r(wx0Var.v0);
                        wx0Var.E.f();
                        nm7.f(wx0Var.I).n(wx0Var, 115);
                        nm7.e().n(wx0Var, 269);
                        nm7.f(wx0Var.I).n(wx0Var, 238);
                        if (!wx0Var.R0) {
                            wx0.f(wx0Var);
                            wx0Var.R0 = true;
                        }
                        qk5 qk5Var = new qk5(new yv1(l2));
                        qk5Var.b = true;
                        lastFragment.presentFragment(qk5Var);
                    }
                }
                return true;
            default:
                TLRPC.User user2 = (TLRPC.User) obj3;
                String str2 = (String) obj2;
                ht7 ht7Var2 = (ht7) obj;
                i22 i22Var = ((n12) obj4).e;
                long j6 = ((bf7) arrayList.get(0)).a;
                Bundle l3 = ts2.l("scrollToTopOnResume", true);
                if (pg3.B(j6)) {
                    l3.putInt("enc_id", (int) (j6 & 4294967295L));
                } else if (pg3.D(j6)) {
                    l3.putLong("user_id", j6);
                } else {
                    l3.putLong("chat_id", -j6);
                }
                l3.putString("start_text", "@" + m9c.p(user2) + " " + str2);
                d dVar = i22Var.Z1;
                if (oc7.r1(i22Var.G3).A(l3, dVar, null, null)) {
                    ht7Var2.dismiss();
                    i22Var.a(true);
                    qk5 qk5Var2 = new qk5(new yv1(l3));
                    qk5Var2.b = true;
                    dVar.presentFragment(qk5Var2);
                }
                return true;
        }
    }

    @Override
    public final void r(he heVar, int i) {
        byte b = this.a;
        String str = null;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (b) {
            case 0:
                ((o) obj4).P((String) obj3, (String) obj2, (vu) obj);
                return;
            case 4:
                ((yv1) obj4).l9((TLRPC.User) obj3, (AtomicBoolean) obj2, (TLRPC.TL_attachMenuBot) obj);
                return;
            case 13:
                String str2 = (String) obj2;
                String str3 = LaunchActivity.C1;
                ml7 ml7Var = new ml7((d) obj, (LaunchActivity) obj4);
                ml7Var.H0((String) obj3, false);
                if (str2 != null) {
                    String[] split = str2.split(" ", 2);
                    String str4 = split[0];
                    if (split.length > 1) {
                        str = split[1];
                    }
                    ft7 ft7Var = ml7Var.m1;
                    if (ft7Var != null) {
                        ft7Var.getEditText().setText(str4);
                    } else {
                        ml7Var.D1 = str4;
                    }
                    ft7 ft7Var2 = ml7Var.n1;
                    if (ft7Var2 != null) {
                        ft7Var2.getEditText().setText(str);
                    } else {
                        ml7Var.E1 = str;
                    }
                }
                ml7Var.show();
                return;
            case 14:
                ((mh6) obj4).w1((String) obj3, (String) obj2, (String) obj);
                return;
            case 16:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) obj4;
                notificationsCustomSettingsActivity.getClass();
                SharedPreferences.Editor edit = ((SharedPreferences) obj2).edit();
                edit.putBoolean((String) obj3, ((boolean[]) obj)[0]);
                edit.apply();
                notificationsCustomSettingsActivity.q0(true);
                notificationsCustomSettingsActivity.getNotificationsController().b0(notificationsCustomSettingsActivity.s);
                return;
            case 24:
                sxb sxbVar = (sxb) obj4;
                HashSet hashSet = (HashSet) obj3;
                HashSet hashSet2 = new HashSet();
                sxbVar.B0 = hashSet2;
                hashSet2.addAll(hashSet);
                sxbVar.Z0(true, false);
                c41.b0(sxbVar).U(jb6.J0(hashSet.size(), "TopicsDeleted"), false, new lo4(sxbVar, (byte) 5), new j2b(sxbVar, (ArrayList) obj2, (Runnable) obj, (byte) 21)).j();
                sxbVar.D0();
                heVar.dismiss();
                return;
            default:
                vqc vqcVar = (vqc) obj4;
                oh2 oh2Var = (oh2) obj3;
                c cVar = (c) obj2;
                Long l = (Long) obj;
                if (oh2Var.isEnabled()) {
                    boolean b2 = oh2Var.b();
                    oh2Var.setEnabled(false);
                    k11 g = heVar.g(i, true, true);
                    g.d();
                    if (!b2) {
                        cVar.E(false, true, false, new rqc(vqcVar, g, cVar, (byte) 0));
                        return;
                    } else if (cVar.z() < l.longValue()) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, vqcVar.getResourceProvider(), vqcVar.getParentActivity());
                        String M0 = jb6.M0(2131742748, null);
                        he heVar2 = alertDialog$Builder.a;
                        heVar2.S = M0;
                        heVar2.U = jb6.V(null, null, 2131742629, c.r(l.longValue(), false), cVar.q(l.longValue(), true));
                        alertDialog$Builder.g(jb6.M0(2131742746, null), new dq9((byte) 14));
                        alertDialog$Builder.j(jb6.M0(2131742653, null), new lcc(vqcVar, (byte) 8));
                        alertDialog$Builder.o();
                        return;
                    } else {
                        rqc rqcVar = new rqc(vqcVar, g, cVar, (byte) 1);
                        c.O("prepare disable backup");
                        cVar.E(true, false, false, new lf2(cVar, rqcVar, (byte) 20));
                        return;
                    }
                }
                return;
        }
    }

    @Override
    public final void run(long j) {
        byte b = this.a;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (b) {
            case 19:
                k0a k0aVar = (k0a) obj4;
                TLRPC.User user = (TLRPC.User) obj3;
                TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP = (TLRPC.TL_inputCheckPasswordSRP) obj2;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj;
                if (j != 0) {
                    k0aVar.S1 = oc7.r1(k0aVar.a).L0(Long.valueOf(j));
                    k0aVar.Y0(user, tL_inputCheckPasswordSRP, twoStepVerificationActivity);
                    return;
                }
                return;
            default:
                a6a a6aVar = (a6a) obj4;
                Uri uri = (Uri) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                e16 e16Var = (e16) obj;
                if (j != 0) {
                    a6aVar.P(-j, uri, arrayList, e16Var);
                    return;
                } else {
                    e16Var.run(0L);
                    return;
                }
        }
    }

    @Override
    public final boolean s(nk3 nk3Var) {
        byte b = this.a;
        return false;
    }

    @Override
    public final void y(int i, int i2, boolean z) {
        TLRPC.BotInlineResult botInlineResult;
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.d;
        Object obj3 = this.b;
        switch (b) {
            case 3:
                ((yv1) obj3).H8((TLRPC.TL_document) obj2, (String) obj, this.e, z, i);
                return;
            case 4:
            case 5:
            default:
                ((fx2) obj3).k((TLRPC.Document) obj2, (String) obj, this.e, z, i, i2);
                return;
            case 6:
                v72 v72Var = (v72) obj3;
                v72Var.k0.a((TLRPC.TL_messageMediaPoll) obj, v72Var.P, v72Var.n1, (ArrayList) obj2, z, i, ((Long) this.e).longValue());
                v72Var.b.a(true);
                return;
            case 7:
                fx2 fx2Var = (fx2) obj3;
                TLRPC.Document document = (TLRPC.Document) obj;
                TLRPC.BotInlineResult botInlineResult2 = (TLRPC.BotInlineResult) obj2;
                if (document != null) {
                    botInlineResult = document;
                } else {
                    botInlineResult = botInlineResult2;
                }
                fx2Var.u(botInlineResult, this.e, z, i, i2);
                return;
        }
    }

    public lu(Object obj, Object obj2, Object obj3, String str, byte b) {
        this.a = b;
        this.b = obj;
        this.d = obj2;
        this.c = str;
        this.e = obj3;
    }

    public lu(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }
}
