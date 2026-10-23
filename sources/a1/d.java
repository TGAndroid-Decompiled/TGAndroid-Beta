package a1;

import ah.i1;
import ai.g3;
import ai.ga;
import ai.t0;
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
import gi.d3;
import gi.y2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.nk;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.b5;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.ai;
import org.telegram.ui.Components.e5;
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.fo;
import org.telegram.ui.Components.i01;
import org.telegram.ui.Components.k8;
import org.telegram.ui.Components.l01;
import org.telegram.ui.Components.md0;
import org.telegram.ui.Components.od0;
import org.telegram.ui.Components.rd0;
import org.telegram.ui.Components.td0;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.xc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.Wallet.s1;
import org.telegram.ui.ct;
import org.telegram.ui.cy;
import org.telegram.ui.dg0;
import org.telegram.ui.f71;
import org.telegram.ui.h61;
import org.telegram.ui.l4;
import org.telegram.ui.mj0;
import org.telegram.ui.pd1;
import org.telegram.ui.q50;
import org.telegram.ui.qn;
import org.telegram.ui.re1;
import org.telegram.ui.u30;
import org.telegram.ui.v30;
import org.telegram.ui.vx;
import org.telegram.ui.x51;
import v0.i;
import w7.z5;
import x2.k;
public final class d implements OnFailureListener, BillingController.ProductDetailsResponseListenerLegacy, vx, a2, e5, md0, MediaDataController.KeywordResultCallback, MessagesStorage.LongCallback, Utilities.Callback2Return, k {
    public final int f36a;
    public final Object f37b;
    public final Object f38c;
    public final Object d;
    public final Object e;

    public d(CancellationSignal cancellationSignal, e1.e eVar, Executor executor, i iVar) {
        this.f36a = 3;
        this.f38c = cancellationSignal;
        this.f37b = eVar;
        this.d = executor;
        this.e = iVar;
    }

    @Override
    public void C(int i10, int i11, boolean z10) {
        TLRPC.BotInlineResult botInlineResult;
        switch (this.f36a) {
            case 6:
                qn.Z((qn) this.f37b, (TLRPC.TL_document) this.f38c, (String) this.d, this.e, z10, i10);
                return;
            case 10:
                fo foVar = (fo) this.f37b;
                foVar.f26305j0.d((TLRPC.TL_messageMediaPoll) this.f38c, foVar.O, foVar.l1, (ArrayList) this.d, z10, i10, ((Long) this.e).longValue());
                foVar.f28177b.dismiss(true);
                return;
            case 11:
                ct ctVar = (ct) this.f37b;
                TLRPC.Document document = (TLRPC.Document) this.f38c;
                TLRPC.BotInlineResult botInlineResult2 = (TLRPC.BotInlineResult) this.d;
                if (document != null) {
                    botInlineResult = document;
                } else {
                    botInlineResult = botInlineResult2;
                }
                ctVar.r(i10, i11, this.e, botInlineResult, z10);
                return;
            default:
                ((ct) this.f37b).l((TLRPC.Document) this.f38c, (String) this.d, this.e, z10, i10, i11);
                return;
        }
    }

    @Override
    public boolean D() {
        switch (this.f36a) {
            case 4:
                return false;
            case 8:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean J(cy cyVar) {
        switch (this.f36a) {
            case 4:
                return false;
            case 8:
                return false;
            default:
                return false;
        }
    }

    @Override
    public e9.x1 b(int r17, b2.p1 r18, int[] r19) {
        throw new UnsupportedOperationException("Method not decompiled: a1.d.b(int, b2.p1, int[]):e9.x1");
    }

    @Override
    public void g(b2 b2Var, int i10) {
        String str;
        int i11 = this.f36a;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.f38c;
        Object obj4 = this.f37b;
        switch (i11) {
            case 5:
                ((l4) obj4).R((String) obj3, (String) obj2, (pf.c) obj);
                return;
            case 7:
                qn.E0((qn) obj4, (TLRPC.User) obj3, (AtomicBoolean) obj2, (TLRPC.TL_attachMenuBot) obj);
                return;
            case 14:
                String str2 = (String) obj;
                Pattern pattern = LaunchActivity.C1;
                mj0 mj0Var = new mj0((LaunchActivity) obj4, (n2) obj3);
                mj0Var.x((String) obj2, false);
                if (str2 != null) {
                    String[] split = str2.split(" ", 2);
                    String str3 = split[0];
                    if (split.length > 1) {
                        str = split[1];
                    } else {
                        str = null;
                    }
                    rd0 rd0Var = mj0Var.d;
                    if (rd0Var != null) {
                        rd0Var.getEditText().setText(str3);
                    } else {
                        mj0Var.K = str3;
                    }
                    rd0 rd0Var2 = mj0Var.e;
                    if (rd0Var2 != null) {
                        rd0Var2.getEditText().setText(str);
                    } else {
                        mj0Var.L = str;
                    }
                }
                mj0Var.show();
                return;
            case 15:
                dg0.W((dg0) obj4, (String) obj3, (String) obj2, (String) obj);
                return;
            case 16:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) obj4;
                notificationsCustomSettingsActivity.getClass();
                SharedPreferences.Editor edit = ((SharedPreferences) obj3).edit();
                edit.putBoolean((String) obj2, ((boolean[]) obj)[0]);
                edit.apply();
                notificationsCustomSettingsActivity.l0(true);
                notificationsCustomSettingsActivity.getNotificationsController().updateServerNotificationsSettings(notificationsCustomSettingsActivity.f33216s);
                return;
            default:
                re1 re1Var = (re1) obj4;
                HashSet hashSet = (HashSet) obj3;
                HashSet hashSet2 = new HashSet();
                re1Var.A0 = hashSet2;
                hashSet2.addAll(hashSet);
                re1Var.U0(true, false);
                xc.a0(re1Var).U(LocaleController.getPluralString("TopicsDeleted", hashSet.size()), false, new pd1(re1Var, 4), new f71(re1Var, (ArrayList) obj2, (Runnable) obj, 5)).j();
                re1Var.C0();
                b2Var.dismiss();
                return;
        }
    }

    @Override
    public void onFailure(Exception e) {
        switch (this.f36a) {
            case 0:
                CredentialProviderPlayServicesImpl.runFallbackClearCredFlow$lambda$27((CredentialProviderPlayServicesImpl) this.f37b, (CancellationSignal) this.f38c, (Executor) this.d, (i) this.e, e);
                return;
            default:
                kotlin.jvm.internal.i.e(e, "e");
                b1.b bVar = new b1.b((e1.e) this.f37b, e, (Executor) this.d, (i) this.e);
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!h.a((CancellationSignal) this.f38c)) {
                    bVar.invoke();
                    return;
                }
                return;
        }
    }

    @Override
    public void onProductDetailsResponse(c5.i iVar, List list) {
        switch (this.f36a) {
            case 1:
                AndroidUtilities.runOnUIThread(new t0(list, (Utilities.Callback2) this.f37b, (TLRPC.TL_inputStorePaymentStarsTopup) this.f38c, (TL_stars.TL_starsTopupOption) this.d, (Activity) this.e, 7));
                return;
            default:
                AndroidUtilities.runOnUIThread(new g3((ga) this.f37b, list, (s1) this.f38c, (TLRPC.TL_inputStorePaymentStarsGiveaway) this.d, iVar, (Activity) this.e, 2));
                return;
        }
    }

    @Override
    public void q(od0 od0Var, int i10) {
        q50 q50Var = (q50) this.f37b;
        od0 od0Var2 = (od0) this.f38c;
        u30 u30Var = (u30) this.d;
        v30 v30Var = (v30) this.e;
        try {
            q50Var.container.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        f5.f(q50Var.T, q50Var.S, 0L, 604800L, 2, od0Var2, u30Var, v30Var);
    }

    @Override
    public void run(long j10) {
        h61.Q((h61) this.f37b, (TLRPC.User) this.f38c, (TLRPC.InputCheckPasswordSRP) this.d, (TwoStepVerificationActivity) this.e, j10);
    }

    @Override
    public boolean w(cy cyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, re1 re1Var) {
        switch (this.f36a) {
            case 4:
                TLRPC.User user = (TLRPC.User) this.f38c;
                String str = (String) this.d;
                td0 td0Var = (td0) this.e;
                d3 d3Var = ((y2) this.f37b).d;
                long j10 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
                Bundle h = g.h("scrollToTopOnResume", true);
                if (DialogObject.isEncryptedDialog(j10)) {
                    h.putInt("enc_id", DialogObject.getEncryptedChatId(j10));
                } else if (DialogObject.isUserDialog(j10)) {
                    h.putLong("user_id", j10);
                } else {
                    h.putLong("chat_id", -j10);
                }
                h.putString("start_text", "@" + UserObject.getPublicUsername(user) + " " + str);
                Activity activity = d3Var.f11148k0;
                if (activity instanceof LaunchActivity) {
                    n2 lastFragment = ((LaunchActivity) activity).O().getLastFragment();
                    if (MessagesController.getInstance(d3Var.G).checkCanOpenChat(h, lastFragment)) {
                        td0Var.dismiss();
                        d3Var.f11139c0 = true;
                        AndroidUtilities.cancelRunOnUIThread(d3Var.f11159t0);
                        d3Var.f11164x.h();
                        NotificationCenter.getInstance(d3Var.G).removeObserver(d3Var, NotificationCenter.webViewResultSent);
                        NotificationCenter.getGlobalInstance().removeObserver(d3Var, NotificationCenter.didSetNewTheme);
                        if (!d3Var.M0) {
                            super/*android.app.Dialog*/.dismiss();
                            d3Var.M0 = true;
                        }
                        b5 b5Var = new b5(new qn(h));
                        b5Var.f20709b = true;
                        lastFragment.presentFragment(b5Var);
                    }
                }
                return true;
            case 8:
                k8.v((k8) this.f37b, (ArrayList) this.f38c, (TLRPC.TL_document) this.d, (MessageObject) this.e, cyVar, arrayList, charSequence, z11, i10);
                return true;
            default:
                TLRPC.User user2 = (TLRPC.User) this.f38c;
                String str2 = (String) this.d;
                td0 td0Var2 = (td0) this.e;
                ti tiVar = ((ai) this.f37b).e;
                long j11 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
                Bundle h10 = g.h("scrollToTopOnResume", true);
                if (DialogObject.isEncryptedDialog(j11)) {
                    h10.putInt("enc_id", DialogObject.getEncryptedChatId(j11));
                } else if (DialogObject.isUserDialog(j11)) {
                    h10.putLong("user_id", j11);
                } else {
                    h10.putLong("chat_id", -j11);
                }
                h10.putString("start_text", "@" + UserObject.getPublicUsername(user2) + " " + str2);
                n2 n2Var = tiVar.f30550f0;
                if (MessagesController.getInstance(tiVar.M1).checkCanOpenChat(h10, n2Var)) {
                    td0Var2.dismiss();
                    tiVar.dismiss(true);
                    b5 b5Var2 = new b5(new qn(h10));
                    b5Var2.f20709b = true;
                    n2Var.presentFragment(b5Var2);
                }
                return true;
        }
    }

    public d(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f36a = i10;
        this.f37b = obj;
        this.f38c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override
    public Object run(Object obj, Object obj2) {
        Context context = (Context) this.f37b;
        int[] iArr = (int[]) this.f38c;
        d6 d6Var = (d6) this.d;
        l01 l01Var = (l01) this.e;
        Integer num = (Integer) obj;
        Float f7 = (Float) obj2;
        LinearLayout e = nk.e(context, 1);
        LinearLayout linearLayout = new LinearLayout(context);
        e.addView(linearLayout, z5.t(-2, -2, 1, 0, 0, 0, 0));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(iArr[num.intValue() - 1]);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        linearLayout.addView(imageView, z5.n(24, 24));
        if (num.intValue() == 7) {
            for (int i10 = 0; i10 < 2; i10++) {
                ImageView imageView2 = new ImageView(context);
                imageView2.setImageResource(iArr[num.intValue() - 1]);
                imageView2.setScaleType(ImageView.ScaleType.CENTER);
                linearLayout.addView(imageView2, z5.n(24, 24));
            }
        }
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.getTypeface("fonts/num.otf"));
        textView.setTextColor(h6.w0(h6.f21100j5, d6Var));
        StringBuilder sb2 = new StringBuilder("x");
        int i11 = (f7.floatValue() > 0.0f ? 1 : (f7.floatValue() == 0.0f ? 0 : -1));
        Object obj3 = f7;
        if (i11 <= 0) {
            obj3 = "0";
        }
        sb2.append(obj3);
        textView.setText(sb2.toString());
        textView.setTextSize(1, 13.0f);
        textView.setGravity(17);
        e.addView(textView, z5.k(0.0f, 3.0f, 0.0f, 0.0f, -1, -2));
        return new i01(l01Var, e, false);
    }

    @Override
    public void run(ArrayList arrayList, String str) {
        switch (this.f36a) {
            case 17:
                ArrayList arrayList2 = (ArrayList) this.f38c;
                ArrayList arrayList3 = (ArrayList) this.d;
                Runnable runnable = (Runnable) this.e;
                TLRPC.messages_AvailableEffects availableEffects = MessagesController.getInstance(((x51) this.f37b).V).getAvailableEffects();
                HashSet hashSet = new HashSet();
                if (availableEffects != null) {
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        try {
                            if (!((MediaDataController.KeywordResult) arrayList.get(i10)).emoji.startsWith("animated_")) {
                                String fixEmoji = Emoji.fixEmoji(((MediaDataController.KeywordResult) arrayList.get(i10)).emoji);
                                for (int i11 = 0; i11 < availableEffects.effects.size(); i11++) {
                                    TLRPC.TL_availableEffect tL_availableEffect = availableEffects.effects.get(i11);
                                    if (!hashSet.contains(Long.valueOf(tL_availableEffect.f20311id)) && (tL_availableEffect.emoticon.contains(fixEmoji) || fixEmoji.contains(tL_availableEffect.emoticon))) {
                                        (tL_availableEffect.effect_animation_id == 0 ? arrayList2 : arrayList3).add(i1.e(tL_availableEffect));
                                        hashSet.add(Long.valueOf(tL_availableEffect.f20311id));
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
                HashMap hashMap = (HashMap) this.f37b;
                HashMap hashMap2 = (HashMap) this.f38c;
                ArrayList arrayList4 = (ArrayList) this.d;
                Runnable runnable2 = (Runnable) this.e;
                int size = arrayList.size();
                for (int i12 = 0; i12 < size; i12++) {
                    String str2 = ((MediaDataController.KeywordResult) arrayList.get(i12)).emoji;
                    ArrayList arrayList5 = hashMap != null ? (ArrayList) hashMap.get(str2) : null;
                    if (arrayList5 != null && !arrayList5.isEmpty() && !hashMap2.containsKey(arrayList5)) {
                        hashMap2.put(arrayList5, str2);
                        arrayList4.add(arrayList5);
                    }
                }
                runnable2.run();
                return;
        }
    }
}
