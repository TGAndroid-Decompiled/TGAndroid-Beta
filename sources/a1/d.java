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
import bh.x0;
import bi.c3;
import bi.ca;
import bi.u0;
import com.google.android.gms.tasks.OnFailureListener;
import hi.h3;
import hi.m3;
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
import org.telegram.messenger.vh;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.e5;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.go;
import org.telegram.ui.Components.kd0;
import org.telegram.ui.Components.m8;
import org.telegram.ui.Components.md0;
import org.telegram.ui.Components.pd0;
import org.telegram.ui.Components.sd0;
import org.telegram.ui.Components.t01;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.w01;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.zh;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.Wallet.r1;
import org.telegram.ui.a40;
import org.telegram.ui.af1;
import org.telegram.ui.c61;
import org.telegram.ui.cy;
import org.telegram.ui.dt;
import org.telegram.ui.gg0;
import org.telegram.ui.h71;
import org.telegram.ui.j4;
import org.telegram.ui.m61;
import org.telegram.ui.oj0;
import org.telegram.ui.un;
import org.telegram.ui.ux;
import org.telegram.ui.v50;
import org.telegram.ui.yd1;
import org.telegram.ui.z30;
import v0.i;
import x2.l;
public final class d implements OnFailureListener, BillingController.ProductDetailsResponseListenerLegacy, ux, b2, e5, kd0, MediaDataController.KeywordResultCallback, MessagesStorage.LongCallback, Utilities.Callback2Return, l {
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
    public boolean C() {
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
    public void G(int i10, int i11, boolean z10) {
        TLRPC.BotInlineResult botInlineResult;
        switch (this.f36a) {
            case 6:
                un.D0((un) this.f37b, (TLRPC.TL_document) this.f38c, (String) this.d, this.e, z10, i10);
                return;
            case 10:
                go goVar = (go) this.f37b;
                goVar.f28630j0.e((TLRPC.TL_messageMediaPoll) this.f38c, goVar.O, goVar.f28635m1, (ArrayList) this.d, z10, i10, ((Long) this.e).longValue());
                goVar.f30213b.dismiss(true);
                return;
            case 11:
                dt dtVar = (dt) this.f37b;
                TLRPC.Document document = (TLRPC.Document) this.f38c;
                TLRPC.BotInlineResult botInlineResult2 = (TLRPC.BotInlineResult) this.d;
                if (document != null) {
                    botInlineResult = document;
                } else {
                    botInlineResult = botInlineResult2;
                }
                dtVar.s(i10, i11, this.e, botInlineResult, z10);
                return;
            default:
                ((dt) this.f37b).m((TLRPC.Document) this.f38c, (String) this.d, this.e, z10, i10, i11);
                return;
        }
    }

    @Override
    public boolean K(cy cyVar) {
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
    public f9.s1 a(int r17, b2.q1 r18, int[] r19) {
        throw new UnsupportedOperationException("Method not decompiled: a1.d.a(int, b2.q1, int[]):f9.s1");
    }

    @Override
    public void h(e2 e2Var, int i10) {
        String str;
        int i11 = this.f36a;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.f38c;
        Object obj4 = this.f37b;
        switch (i11) {
            case 5:
                ((j4) obj4).R((String) obj3, (String) obj2, (qf.c) obj);
                return;
            case 7:
                un.X((un) obj4, (TLRPC.User) obj3, (AtomicBoolean) obj2, (TLRPC.TL_attachMenuBot) obj);
                return;
            case 14:
                String str2 = (String) obj;
                Pattern pattern = LaunchActivity.D1;
                oj0 oj0Var = new oj0((LaunchActivity) obj4, (r2) obj3);
                oj0Var.w((String) obj2, false);
                if (str2 != null) {
                    String[] split = str2.split(" ", 2);
                    String str3 = split[0];
                    if (split.length > 1) {
                        str = split[1];
                    } else {
                        str = null;
                    }
                    pd0 pd0Var = oj0Var.f42224c;
                    if (pd0Var != null) {
                        pd0Var.getEditText().setText(str3);
                    } else {
                        oj0Var.J = str3;
                    }
                    pd0 pd0Var2 = oj0Var.d;
                    if (pd0Var2 != null) {
                        pd0Var2.getEditText().setText(str);
                    } else {
                        oj0Var.K = str;
                    }
                }
                oj0Var.show();
                return;
            case 15:
                gg0.X((gg0) obj4, (String) obj3, (String) obj2, (String) obj);
                return;
            case 16:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) obj4;
                notificationsCustomSettingsActivity.getClass();
                SharedPreferences.Editor edit = ((SharedPreferences) obj3).edit();
                edit.putBoolean((String) obj2, ((boolean[]) obj)[0]);
                edit.apply();
                notificationsCustomSettingsActivity.m0(true);
                notificationsCustomSettingsActivity.getNotificationsController().updateServerNotificationsSettings(notificationsCustomSettingsActivity.f35576s);
                return;
            default:
                af1 af1Var = (af1) obj4;
                HashSet hashSet = (HashSet) obj3;
                HashSet hashSet2 = new HashSet();
                af1Var.A0 = hashSet2;
                hashSet2.addAll(hashSet);
                af1Var.V0(true, false);
                wc.b0(af1Var).V(LocaleController.getPluralString("TopicsDeleted", hashSet.size()), false, new yd1(af1Var, 4), new h71(af1Var, (ArrayList) obj2, (Runnable) obj, 7)).j();
                af1Var.C0();
                e2Var.dismiss();
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
    public void onProductDetailsResponse(d5.i iVar, List list) {
        switch (this.f36a) {
            case 1:
                AndroidUtilities.runOnUIThread(new u0(list, (Utilities.Callback2) this.f37b, (TLRPC.TL_inputStorePaymentStarsTopup) this.f38c, (TL_stars.TL_starsTopupOption) this.d, (Activity) this.e, 7));
                return;
            default:
                AndroidUtilities.runOnUIThread(new c3((ca) this.f37b, list, (r1) this.f38c, (TLRPC.TL_inputStorePaymentStarsGiveaway) this.d, iVar, (Activity) this.e, 2));
                return;
        }
    }

    @Override
    public void q(md0 md0Var, int i10) {
        v50 v50Var = (v50) this.f37b;
        md0 md0Var2 = (md0) this.f38c;
        z30 z30Var = (z30) this.d;
        a40 a40Var = (a40) this.e;
        try {
            v50Var.container.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        g5.g(v50Var.T, v50Var.S, 0L, 604800L, 2, md0Var2, z30Var, a40Var);
    }

    @Override
    public void run(long j10) {
        m61.P((m61) this.f37b, (TLRPC.User) this.f38c, (TLRPC.InputCheckPasswordSRP) this.d, (TwoStepVerificationActivity) this.e, j10);
    }

    @Override
    public boolean v(cy cyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, af1 af1Var) {
        switch (this.f36a) {
            case 4:
                TLRPC.User user = (TLRPC.User) this.f38c;
                String str = (String) this.d;
                sd0 sd0Var = (sd0) this.e;
                m3 m3Var = ((h3) this.f37b).d;
                long j10 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
                Bundle i12 = g.i("scrollToTopOnResume", true);
                if (DialogObject.isEncryptedDialog(j10)) {
                    i12.putInt("enc_id", DialogObject.getEncryptedChatId(j10));
                } else if (DialogObject.isUserDialog(j10)) {
                    i12.putLong("user_id", j10);
                } else {
                    i12.putLong("chat_id", -j10);
                }
                i12.putString("start_text", "@" + UserObject.getPublicUsername(user) + " " + str);
                Activity activity = m3Var.f13116l0;
                if (activity instanceof LaunchActivity) {
                    r2 lastFragment = ((LaunchActivity) activity).O().getLastFragment();
                    if (MessagesController.getInstance(m3Var.H).checkCanOpenChat(i12, lastFragment)) {
                        sd0Var.dismiss();
                        m3Var.f13107d0 = true;
                        AndroidUtilities.cancelRunOnUIThread(m3Var.f13127u0);
                        m3Var.f13133y.h();
                        NotificationCenter.getInstance(m3Var.H).removeObserver(m3Var, NotificationCenter.webViewResultSent);
                        NotificationCenter.getGlobalInstance().removeObserver(m3Var, NotificationCenter.didSetNewTheme);
                        if (!m3Var.Q0) {
                            super/*android.app.Dialog*/.dismiss();
                            m3Var.Q0 = true;
                        }
                        org.telegram.ui.ActionBar.g5 g5Var = new org.telegram.ui.ActionBar.g5(new un(i12));
                        g5Var.f22661b = true;
                        lastFragment.presentFragment(g5Var);
                    }
                }
                return true;
            case 8:
                m8.r((m8) this.f37b, (ArrayList) this.f38c, (TLRPC.TL_document) this.d, (MessageObject) this.e, cyVar, arrayList, charSequence, z11, i10);
                return true;
            default:
                TLRPC.User user2 = (TLRPC.User) this.f38c;
                String str2 = (String) this.d;
                sd0 sd0Var2 = (sd0) this.e;
                ti tiVar = ((zh) this.f37b).e;
                long j11 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
                Bundle i13 = g.i("scrollToTopOnResume", true);
                if (DialogObject.isEncryptedDialog(j11)) {
                    i13.putInt("enc_id", DialogObject.getEncryptedChatId(j11));
                } else if (DialogObject.isUserDialog(j11)) {
                    i13.putLong("user_id", j11);
                } else {
                    i13.putLong("chat_id", -j11);
                }
                i13.putString("start_text", "@" + UserObject.getPublicUsername(user2) + " " + str2);
                r2 r2Var = tiVar.f33018f0;
                if (MessagesController.getInstance(tiVar.M1).checkCanOpenChat(i13, r2Var)) {
                    sd0Var2.dismiss();
                    tiVar.dismiss(true);
                    org.telegram.ui.ActionBar.g5 g5Var2 = new org.telegram.ui.ActionBar.g5(new un(i13));
                    g5Var2.f22661b = true;
                    r2Var.presentFragment(g5Var2);
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
        u6 u6Var = (u6) this.d;
        w01 w01Var = (w01) this.e;
        Integer num = (Integer) obj;
        Float f7 = (Float) obj2;
        LinearLayout d = vh.d(context, 1);
        LinearLayout linearLayout = new LinearLayout(context);
        d.addView(linearLayout, gb1.x(-2, -2, 1, 0, 0, 0, 0));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(iArr[num.intValue() - 1]);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        linearLayout.addView(imageView, gb1.r(24, 24));
        if (num.intValue() == 7) {
            for (int i10 = 0; i10 < 2; i10++) {
                ImageView imageView2 = new ImageView(context);
                imageView2.setImageResource(iArr[num.intValue() - 1]);
                imageView2.setScaleType(ImageView.ScaleType.CENTER);
                linearLayout.addView(imageView2, gb1.r(24, 24));
            }
        }
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.getTypeface("fonts/num.otf"));
        f7.V(textView, y6.f23462j5, u6Var);
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
        d.addView(textView, gb1.o(0.0f, 3.0f, 0.0f, 0.0f, -1, -2));
        return new t01(w01Var, d, false);
    }

    @Override
    public void run(ArrayList arrayList, String str) {
        switch (this.f36a) {
            case 17:
                ArrayList arrayList2 = (ArrayList) this.f38c;
                ArrayList arrayList3 = (ArrayList) this.d;
                Runnable runnable = (Runnable) this.e;
                TLRPC.messages_AvailableEffects availableEffects = MessagesController.getInstance(((c61) this.f37b).V).getAvailableEffects();
                HashSet hashSet = new HashSet();
                if (availableEffects != null) {
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        try {
                            if (!((MediaDataController.KeywordResult) arrayList.get(i10)).emoji.startsWith("animated_")) {
                                String fixEmoji = Emoji.fixEmoji(((MediaDataController.KeywordResult) arrayList.get(i10)).emoji);
                                for (int i11 = 0; i11 < availableEffects.effects.size(); i11++) {
                                    TLRPC.TL_availableEffect tL_availableEffect = availableEffects.effects.get(i11);
                                    if (!hashSet.contains(Long.valueOf(tL_availableEffect.f22058id)) && (tL_availableEffect.emoticon.contains(fixEmoji) || fixEmoji.contains(tL_availableEffect.emoticon))) {
                                        (tL_availableEffect.effect_animation_id == 0 ? arrayList2 : arrayList3).add(x0.e(tL_availableEffect));
                                        hashSet.add(Long.valueOf(tL_availableEffect.f22058id));
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
