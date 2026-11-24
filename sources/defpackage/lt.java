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
public final class lt implements ed, wi3, gj, OnFailureListener, pc3, fn7, eq6, vc7, j8c, bi0 {
    public final byte a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public lt(LaunchActivity launchActivity, d dVar, String str, String str2) {
        this.a = (byte) 13;
        this.b = launchActivity;
        this.e = dVar;
        this.c = str;
        this.d = str2;
    }

    @Override
    public final boolean F() {
        byte b = this.a;
        return false;
    }

    @Override
    public final void b(fi0 fi0Var, List list) {
        byte b = this.a;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (b) {
            case 22:
                gl.d3(new ex7(list, (i8c) obj4, (TLRPC.TL_inputStorePaymentStarsTopup) obj3, (TL_stars.TL_starsTopupOption) obj2, (Activity) obj, (byte) 28));
                return;
            default:
                gl.d3(new foa((gta) obj4, list, (ae2) obj3, (TLRPC.TL_inputStorePaymentStarsGiveaway) obj2, fi0Var, (Activity) obj, (byte) 2));
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
                hq6 hq6Var = (hq6) obj4;
                fq6 fq6Var = (fq6) obj3;
                gq6 gq6Var = (gq6) obj2;
                p8c p8cVar = (p8c) obj;
                HashMap hashMap = hq6Var.S1;
                if (hashMap.containsKey(fq6Var)) {
                    StringBuilder sb = new StringBuilder();
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj5 = arrayList.get(i);
                        i++;
                        dq6 dq6Var = (dq6) obj5;
                        if (!TextUtils.isEmpty(dq6Var.a) && !dq6Var.a.startsWith("animated_")) {
                            sb.append(dq6Var.a);
                        }
                    }
                    TLRPC.TL_messages_searchStickers tL_messages_searchStickers = new TLRPC.TL_messages_searchStickers();
                    boolean z = fq6Var.a;
                    String str2 = fq6Var.b;
                    tL_messages_searchStickers.emojis = z;
                    if (!TextUtils.isEmpty(str2)) {
                        tL_messages_searchStickers.lang_code.add(str2);
                    }
                    tL_messages_searchStickers.emoticon = sb.toString();
                    tL_messages_searchStickers.q = fq6Var.c;
                    tL_messages_searchStickers.limit = 100;
                    if (gq6Var == null) {
                        intValue = 0;
                    } else {
                        intValue = gq6Var.b.intValue();
                    }
                    tL_messages_searchStickers.offset = intValue;
                    hashMap.put(fq6Var, Integer.valueOf(hq6Var.getConnectionsManager().sendRequestTyped(tL_messages_searchStickers, new hc((byte) 0), new eu0(hq6Var, fq6Var, gq6Var, p8cVar, (byte) 11))));
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
                    String str3 = ((dq6) arrayList.get(i2)).a;
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
                TLRPC.messages_AvailableEffects C0 = na7.q1(((tx9) obj4).W).C0();
                HashSet hashSet = new HashSet();
                if (C0 != null) {
                    for (int i3 = 0; i3 < arrayList.size(); i3++) {
                        try {
                            if (!((dq6) arrayList.get(i3)).a.startsWith("animated_")) {
                                String c = vu3.c(((dq6) arrayList.get(i3)).a);
                                for (int i4 = 0; i4 < C0.effects.size(); i4++) {
                                    TLRPC.TL_availableEffect tL_availableEffect = C0.effects.get(i4);
                                    if (!hashSet.contains(Long.valueOf(tL_availableEffect.id)) && (tL_availableEffect.emoticon.contains(c) || c.contains(tL_availableEffect.emoticon))) {
                                        if (tL_availableEffect.effect_animation_id == 0) {
                                            arrayList2 = arrayList5;
                                        } else {
                                            arrayList2 = arrayList6;
                                        }
                                        arrayList2.add(h19.e(tL_availableEffect));
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
    public final Object g(Integer num, Object obj) {
        Context context = (Context) this.b;
        int[] iArr = (int[]) this.c;
        wjb wjbVar = (wjb) this.d;
        mfb mfbVar = (mfb) this.e;
        Float f = (Float) obj;
        LinearLayout j = de9.j(context, 1);
        LinearLayout linearLayout = new LinearLayout(context);
        j.addView(linearLayout, nme.t(-2, -2, 1, 0, 0, 0, 0));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(iArr[num.intValue() - 1]);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        linearLayout.addView(imageView, nme.o(24, 24));
        if (num.intValue() == 7) {
            for (int i = 0; i < 2; i++) {
                ImageView imageView2 = new ImageView(context);
                imageView2.setImageResource(iArr[num.intValue() - 1]);
                imageView2.setScaleType(ImageView.ScaleType.CENTER);
                linearLayout.addView(imageView2, nme.o(24, 24));
            }
        }
        TextView textView = new TextView(context);
        textView.setTypeface(gl.n1("fonts/num.otf"));
        zkb.X(textView, bkb.i5, wjbVar);
        StringBuilder sb = new StringBuilder("x");
        int i2 = (f.floatValue() > 0.0f ? 1 : (f.floatValue() == 0.0f ? 0 : -1));
        Object obj2 = f;
        if (i2 <= 0) {
            obj2 = "0";
        }
        sb.append(obj2);
        textView.setText(sb.toString());
        textView.setTextSize(1, 13.0f);
        textView.setGravity(17);
        j.addView(textView, nme.k(0.0f, 3.0f, 0.0f, 0.0f, -1, -2));
        return new jfb(mfbVar, j, false);
    }

    @Override
    public final void i(hn7 hn7Var, int i) {
        h75 h75Var = (h75) this.b;
        hn7 hn7Var2 = (hn7) this.c;
        t55 t55Var = (t55) this.d;
        u55 u55Var = (u55) this.e;
        try {
            h75Var.c.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        ij.g(h75Var.M1, h75Var.L1, 0L, 604800L, 2, hn7Var2, t55Var, u55Var);
    }

    @Override
    public final defpackage.w59 j(int r17, defpackage.sxb r18, int[] r19) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lt.j(int, sxb, int[]):w59");
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
                final y03 y03Var = (y03) obj3;
                final Executor executor = (Executor) obj2;
                final o13 o13Var = (o13) obj;
                exc.getClass();
                op4 op4Var = new op4(y03Var, exc, executor, o13Var) {
                    public final Exception a;
                    public final Executor b;
                    public final o13 c;

                    {
                        this.a = exc;
                        this.b = executor;
                        this.c = o13Var;
                    }

                    @Override
                    public final Object invoke() {
                        Object c03Var;
                        Exception exc2 = this.a;
                        if (exc2 instanceof zn) {
                            int statusCode = ((zn) exc2).getStatusCode();
                            if (statusCode == 16) {
                                c03Var = new b03(exc2.getMessage());
                            } else if (statusCode == 17) {
                                c03Var = new c03("API is not supported: " + exc2.getMessage(), (byte) 3);
                            } else if (statusCode == 8) {
                                c03Var = new g03(exc2.getMessage());
                            } else if (y13.b.contains(Integer.valueOf(statusCode))) {
                                c03Var = new f03(exc2.getMessage());
                            } else {
                                c03Var = new c03("Conditional create failed, failure: " + exc2.getMessage(), (byte) 2);
                            }
                        } else if (exc2 instanceof e6c) {
                            c03Var = new c03("API is unsupported", (byte) 3);
                        } else {
                            c03Var = new c03("Conditional create failed, failure: " + exc2, (byte) 2);
                        }
                        this.b.execute(new gu2(this.c, c03Var, (byte) 14));
                        return g5c.a;
                    }
                };
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!l23.a((CancellationSignal) obj4)) {
                    op4Var.invoke();
                    return;
                }
                return;
            default:
                CredentialProviderPlayServicesImpl.runFallbackClearCredFlow$lambda$27((CredentialProviderPlayServicesImpl) obj4, (CancellationSignal) obj3, (Executor) obj2, (o13) obj, exc);
                return;
        }
    }

    @Override
    public final boolean r(cj3 cj3Var, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i, int i2, qvb qvbVar) {
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
                i20 i20Var = (i20) obj4;
                ArrayList arrayList2 = (ArrayList) obj2;
                TLRPC.TL_document tL_document2 = (TLRPC.TL_document) obj3;
                k27 k27Var = (k27) obj;
                if (arrayList.size() <= 1) {
                    j = 0;
                    if (((zc7) arrayList.get(0)).a != y6c.h(i20Var.a).e() && charSequence == null && arrayList2 != null) {
                        zc7 zc7Var = (zc7) arrayList.get(0);
                        long j3 = zc7Var.a;
                        Bundle l = ir2.l("scrollToTopOnResume", true);
                        if (cf3.B(j3)) {
                            l.putInt("enc_id", (int) (j3 & 4294967295L));
                        } else if (cf3.D(j3)) {
                            l.putLong("user_id", j3);
                        } else {
                            l.putLong("chat_id", -j3);
                        }
                        mu1 mu1Var = new mu1(l);
                        if (zc7Var.b != 0) {
                            mm4.a(mu1Var, zc7Var);
                        }
                        if (i20Var.z2.u0(mu1Var, true, false)) {
                            mu1Var.Ob(arrayList2);
                            if (zc7Var.b != 0) {
                                cj3Var.removeSelfFromStack();
                            }
                        } else {
                            cj3Var.finishFragment();
                        }
                        return true;
                    }
                } else {
                    j = 0;
                }
                int i3 = 0;
                while (i3 < arrayList.size()) {
                    long j4 = ((zc7) arrayList.get(i3)).a;
                    if (charSequence != null) {
                        j2 = j4;
                        z3a.B(i20Var.a).q0(x3a.b(charSequence.toString(), j2, null, null, null, true, null, null, null, true, 0, 0, null, false));
                    } else {
                        j2 = j4;
                    }
                    int i4 = i20Var.a;
                    if (arrayList2 != null) {
                        z3a.B(i4).p0(arrayList2, j2, false, false, true, 0, 0, null, -1, 0L, 0L, null);
                        tL_document = tL_document2;
                    } else {
                        tL_document = tL_document2;
                        z3a.B(i4).q0(x3a.e(tL_document, null, k27Var.k.attachPath, j2, null, null, null, null, null, z2, i, 0, 0, i20Var.p2, false));
                    }
                    i3++;
                    tL_document2 = tL_document;
                }
                cj3Var.finishFragment();
                d Q = LaunchActivity.Q();
                if (Q != null) {
                    u21 b0 = u21.b0(Q);
                    if (arrayList.size() == 1 && ((zc7) arrayList.get(0)).a == y6c.h(i20Var.a).e()) {
                        H = k96.M0(2131750482, null);
                    } else if (arrayList.size() == 1 && ((zc7) arrayList.get(0)).a > j) {
                        H = k96.a0(null, null, 2131750481, cf3.s(((zc7) arrayList.get(0)).a));
                    } else if (arrayList.size() == 1 && ((zc7) arrayList.get(0)).a < j) {
                        H = k96.a0(null, null, 2131750486, cf3.s(((zc7) arrayList.get(0)).a));
                    } else {
                        H = k96.H(',', "FwdMessageToManyChats", arrayList.size());
                    }
                    b0.Q(2131624029, 36, H).j();
                }
                return true;
            case 2:
                TLRPC.User user = (TLRPC.User) obj3;
                String str = (String) obj2;
                gr7 gr7Var = (gr7) obj;
                ow0 ow0Var = ((jw0) obj4).d;
                long j5 = ((zc7) arrayList.get(0)).a;
                Bundle l2 = ir2.l("scrollToTopOnResume", true);
                if (cf3.B(j5)) {
                    l2.putInt("enc_id", (int) (j5 & 4294967295L));
                } else if (cf3.D(j5)) {
                    l2.putLong("user_id", j5);
                } else {
                    l2.putLong("chat_id", -j5);
                }
                l2.putString("start_text", "@" + l7c.o(user) + " " + str);
                Activity activity = ow0Var.m0;
                if (activity instanceof LaunchActivity) {
                    d lastFragment = ((LaunchActivity) activity).N().getLastFragment();
                    if (na7.q1(ow0Var.I).A(l2, lastFragment, null, null)) {
                        gr7Var.dismiss();
                        ow0Var.e0 = true;
                        gl.r(ow0Var.v0);
                        ow0Var.E.f();
                        kk7.f(ow0Var.I).n(ow0Var, 114);
                        kk7.e().n(ow0Var, 267);
                        kk7.f(ow0Var.I).n(ow0Var, 237);
                        if (!ow0Var.R0) {
                            ow0.f(ow0Var);
                            ow0Var.R0 = true;
                        }
                        ri5 ri5Var = new ri5(new mu1(l2));
                        ri5Var.b = true;
                        lastFragment.presentFragment(ri5Var);
                    }
                }
                return true;
            default:
                TLRPC.User user2 = (TLRPC.User) obj3;
                String str2 = (String) obj2;
                gr7 gr7Var2 = (gr7) obj;
                x02 x02Var = ((c02) obj4).e;
                long j6 = ((zc7) arrayList.get(0)).a;
                Bundle l3 = ir2.l("scrollToTopOnResume", true);
                if (cf3.B(j6)) {
                    l3.putInt("enc_id", (int) (j6 & 4294967295L));
                } else if (cf3.D(j6)) {
                    l3.putLong("user_id", j6);
                } else {
                    l3.putLong("chat_id", -j6);
                }
                l3.putString("start_text", "@" + l7c.o(user2) + " " + str2);
                d dVar = x02Var.Z1;
                if (na7.q1(x02Var.G3).A(l3, dVar, null, null)) {
                    gr7Var2.dismiss();
                    x02Var.a(true);
                    ri5 ri5Var2 = new ri5(new mu1(l3));
                    ri5Var2.b = true;
                    dVar.presentFragment(ri5Var2);
                }
                return true;
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
                iy9 iy9Var = (iy9) obj4;
                TLRPC.User user = (TLRPC.User) obj3;
                TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP = (TLRPC.TL_inputCheckPasswordSRP) obj2;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj;
                if (j != 0) {
                    iy9Var.S1 = na7.q1(iy9Var.a).K0(Long.valueOf(j));
                    iy9Var.Y0(user, tL_inputCheckPasswordSRP, twoStepVerificationActivity);
                    return;
                }
                return;
            default:
                z3a z3aVar = (z3a) obj4;
                Uri uri = (Uri) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                ez5 ez5Var = (ez5) obj;
                if (j != 0) {
                    z3aVar.P(-j, uri, arrayList, ez5Var);
                    return;
                } else {
                    ez5Var.run(0L);
                    return;
                }
        }
    }

    @Override
    public final void s(int i, int i2, boolean z) {
        TLRPC.BotInlineResult botInlineResult;
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.d;
        Object obj3 = this.b;
        switch (b) {
            case 3:
                ((mu1) obj3).v8((TLRPC.TL_document) obj2, (String) obj, this.e, z, i);
                return;
            case 4:
            case 5:
            default:
                ((vv2) obj3).k((TLRPC.Document) obj2, (String) obj, this.e, z, i, i2);
                return;
            case 6:
                k62 k62Var = (k62) obj3;
                k62Var.k0.a((TLRPC.TL_messageMediaPoll) obj, k62Var.P, k62Var.n1, (ArrayList) obj2, z, i, ((Long) this.e).longValue());
                k62Var.b.a(true);
                return;
            case 7:
                vv2 vv2Var = (vv2) obj3;
                TLRPC.Document document = (TLRPC.Document) obj;
                TLRPC.BotInlineResult botInlineResult2 = (TLRPC.BotInlineResult) obj2;
                if (document != null) {
                    botInlineResult = document;
                } else {
                    botInlineResult = botInlineResult2;
                }
                vv2Var.u(botInlineResult, this.e, z, i, i2);
                return;
        }
    }

    @Override
    public final boolean t(cj3 cj3Var) {
        byte b = this.a;
        return false;
    }

    @Override
    public final void u(hd hdVar, int i) {
        byte b = this.a;
        String str = null;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (b) {
            case 0:
                ((o) obj4).P((String) obj3, (String) obj2, (vt) obj);
                return;
            case 4:
                ((mu1) obj4).Z8((TLRPC.User) obj3, (AtomicBoolean) obj2, (TLRPC.TL_attachMenuBot) obj);
                return;
            case 13:
                String str2 = (String) obj2;
                String str3 = LaunchActivity.C1;
                jj7 jj7Var = new jj7((d) obj, (LaunchActivity) obj4);
                jj7Var.H0((String) obj3, false);
                if (str2 != null) {
                    String[] split = str2.split(" ", 2);
                    String str4 = split[0];
                    if (split.length > 1) {
                        str = split[1];
                    }
                    dr7 dr7Var = jj7Var.m1;
                    if (dr7Var != null) {
                        dr7Var.getEditText().setText(str4);
                    } else {
                        jj7Var.D1 = str4;
                    }
                    dr7 dr7Var2 = jj7Var.n1;
                    if (dr7Var2 != null) {
                        dr7Var2.getEditText().setText(str);
                    } else {
                        jj7Var.E1 = str;
                    }
                }
                jj7Var.show();
                return;
            case 14:
                ((mf6) obj4).v1((String) obj3, (String) obj2, (String) obj);
                return;
            case 16:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) obj4;
                notificationsCustomSettingsActivity.getClass();
                SharedPreferences.Editor edit = ((SharedPreferences) obj2).edit();
                edit.putBoolean((String) obj3, ((boolean[]) obj)[0]);
                edit.apply();
                notificationsCustomSettingsActivity.p0(true);
                notificationsCustomSettingsActivity.getNotificationsController().b0(notificationsCustomSettingsActivity.s);
                return;
            case 24:
                qvb qvbVar = (qvb) obj4;
                HashSet hashSet = (HashSet) obj3;
                HashSet hashSet2 = new HashSet();
                qvbVar.B0 = hashSet2;
                hashSet2.addAll(hashSet);
                qvbVar.Y0(true, false);
                u21.b0(qvbVar).U(k96.J0(hashSet.size(), "TopicsDeleted"), false, new km4(qvbVar, (byte) 5), new r1b(qvbVar, (ArrayList) obj2, (Runnable) obj, (byte) 18)).j();
                qvbVar.C0();
                hdVar.dismiss();
                return;
            default:
                toc tocVar = (toc) obj4;
                ag2 ag2Var = (ag2) obj3;
                c cVar = (c) obj2;
                Long l = (Long) obj;
                if (ag2Var.isEnabled()) {
                    boolean b2 = ag2Var.b();
                    ag2Var.setEnabled(false);
                    c01 g = hdVar.g(i, true, true);
                    g.d();
                    if (!b2) {
                        cVar.E(false, true, false, new poc(tocVar, g, cVar, (byte) 0));
                        return;
                    } else if (cVar.z() < l.longValue()) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, tocVar.getResourceProvider(), tocVar.getParentActivity());
                        String M0 = k96.M0(2131742822, null);
                        hd hdVar2 = alertDialog$Builder.a;
                        hdVar2.S = M0;
                        hdVar2.U = k96.V(null, null, 2131742703, c.r(l.longValue(), false), cVar.q(l.longValue(), true));
                        alertDialog$Builder.g(k96.M0(2131742820, null), new ho9((byte) 13));
                        alertDialog$Builder.j(k96.M0(2131742727, null), new dkc(tocVar, (byte) 4));
                        alertDialog$Builder.o();
                        return;
                    } else {
                        poc pocVar = new poc(tocVar, g, cVar, (byte) 1);
                        c.O("prepare disable backup");
                        cVar.E(true, false, false, new ae2(cVar, pocVar, (byte) 18));
                        return;
                    }
                }
                return;
        }
    }

    public lt(Object obj, Object obj2, Object obj3, String str, byte b) {
        this.a = b;
        this.b = obj;
        this.d = obj2;
        this.c = str;
        this.e = obj3;
    }

    public lt(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }
}
