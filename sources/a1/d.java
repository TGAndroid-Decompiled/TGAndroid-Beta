package a1;

import ai.m0;
import ai.z8;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import c5.h;
import com.google.android.gms.tasks.OnFailureListener;
import ei.f3;
import ei.k3;
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
import org.telegram.messenger.wh;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.b5;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.b01;
import org.telegram.ui.Components.bd0;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.d5;
import org.telegram.ui.Components.dd0;
import org.telegram.ui.Components.e5;
import org.telegram.ui.Components.hd0;
import org.telegram.ui.Components.j8;
import org.telegram.ui.Components.jd0;
import org.telegram.ui.Components.un;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.yz0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.bf1;
import org.telegram.ui.dg1;
import org.telegram.ui.ek0;
import org.telegram.ui.g71;
import org.telegram.ui.h4;
import org.telegram.ui.i60;
import org.telegram.ui.n40;
import org.telegram.ui.o40;
import org.telegram.ui.oy;
import org.telegram.ui.q71;
import org.telegram.ui.qt;
import org.telegram.ui.uy;
import org.telegram.ui.xd1;
import org.telegram.ui.xg0;
import org.telegram.ui.zn;
import v0.i;
import w7.y5;
import x2.m;
import yh.t5;
import yh.u;
import zg.o0;
public final class d implements OnFailureListener, oy, a2, d5, bd0, MediaDataController.KeywordResultCallback, MessagesStorage.LongCallback, Utilities.Callback2Return, m, BillingController.ProductDetailsResponseListenerLegacy {
    public final int f38a;
    public final Object f39b;
    public final Object f40c;
    public final Object d;
    public final Object e;

    public d(CancellationSignal cancellationSignal, e1.d dVar, Executor executor, i iVar) {
        this.f38a = 1;
        this.f39b = cancellationSignal;
        this.e = dVar;
        this.f40c = executor;
        this.d = iVar;
    }

    @Override
    public boolean A() {
        switch (this.f38a) {
            case 2:
                return false;
            case 6:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        TLRPC.BotInlineResult botInlineResult;
        switch (this.f38a) {
            case 4:
                zn.z0((zn) this.e, (TLRPC.TL_document) this.f39b, (String) this.f40c, this.d, z10, i10);
                return;
            case 8:
                un unVar = (un) this.e;
                unVar.f28753j0.e((TLRPC.TL_messageMediaPoll) this.f39b, unVar.O, unVar.l1, (ArrayList) this.f40c, z10, i10, ((Long) this.d).longValue());
                unVar.f26688b.dismiss(true);
                return;
            case 9:
                qt qtVar = (qt) this.e;
                TLRPC.Document document = (TLRPC.Document) this.f39b;
                TLRPC.BotInlineResult botInlineResult2 = (TLRPC.BotInlineResult) this.f40c;
                if (document != null) {
                    botInlineResult = document;
                } else {
                    botInlineResult = botInlineResult2;
                }
                qtVar.s(i10, i11, this.d, botInlineResult, z10);
                return;
            default:
                ((qt) this.e).m((TLRPC.Document) this.f39b, (String) this.f40c, this.d, z10, i10, i11);
                return;
        }
    }

    @Override
    public boolean K(uy uyVar) {
        switch (this.f38a) {
            case 2:
                return false;
            case 6:
                return false;
            default:
                return false;
        }
    }

    @Override
    public e9.a1 b(int r17, b2.l1 r18, int[] r19) {
        throw new UnsupportedOperationException("Method not decompiled: a1.d.b(int, b2.l1, int[]):e9.a1");
    }

    @Override
    public void f(b2 b2Var, int i10) {
        String str;
        int i11 = this.f38a;
        Object obj = this.d;
        Object obj2 = this.f40c;
        Object obj3 = this.f39b;
        Object obj4 = this.e;
        switch (i11) {
            case 3:
                ((h4) obj4).R((String) obj3, (String) obj2, (nf.e) obj);
                return;
            case 5:
                zn.b0((zn) obj4, (TLRPC.User) obj3, (AtomicBoolean) obj2, (TLRPC.TL_attachMenuBot) obj);
                return;
            case 12:
                String str2 = (String) obj;
                Pattern pattern = LaunchActivity.B1;
                ek0 ek0Var = new ek0((LaunchActivity) obj4, (n2) obj3);
                ek0Var.v((String) obj2, false);
                if (str2 != null) {
                    String[] split = str2.split(" ", 2);
                    String str3 = split[0];
                    if (split.length > 1) {
                        str = split[1];
                    } else {
                        str = null;
                    }
                    hd0 hd0Var = ek0Var.d;
                    if (hd0Var != null) {
                        hd0Var.getEditText().setText(str3);
                    } else {
                        ek0Var.K = str3;
                    }
                    hd0 hd0Var2 = ek0Var.e;
                    if (hd0Var2 != null) {
                        hd0Var2.getEditText().setText(str);
                    } else {
                        ek0Var.L = str;
                    }
                }
                ek0Var.show();
                return;
            case 13:
                xg0.W((xg0) obj4, (String) obj3, (String) obj2, (String) obj);
                return;
            case 14:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) obj4;
                notificationsCustomSettingsActivity.getClass();
                SharedPreferences.Editor edit = ((SharedPreferences) obj3).edit();
                edit.putBoolean((String) obj2, ((boolean[]) obj)[0]);
                edit.apply();
                notificationsCustomSettingsActivity.l0(true);
                notificationsCustomSettingsActivity.getNotificationsController().updateServerNotificationsSettings(notificationsCustomSettingsActivity.f31114s);
                return;
            default:
                dg1 dg1Var = (dg1) obj4;
                HashSet hashSet = (HashSet) obj3;
                HashSet hashSet2 = new HashSet();
                dg1Var.A0 = hashSet2;
                hashSet2.addAll(hashSet);
                dg1Var.U0(true, false);
                xc.a0(dg1Var).U(LocaleController.getPluralString("TopicsDeleted", hashSet.size()), false, new bf1(dg1Var, 4), new xd1(dg1Var, (ArrayList) obj2, (Runnable) obj, 4)).j();
                dg1Var.C0();
                b2Var.dismiss();
                return;
        }
    }

    @Override
    public void onFailure(Exception e) {
        switch (this.f38a) {
            case 0:
                CredentialProviderPlayServicesImpl.runFallbackClearCredFlow$lambda$27((CredentialProviderPlayServicesImpl) this.e, (CancellationSignal) this.f39b, (Executor) this.f40c, (i) this.d, e);
                return;
            default:
                kotlin.jvm.internal.i.e(e, "e");
                b1.b bVar = new b1.b((e1.d) this.e, e, (Executor) this.f40c, (i) this.d);
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!g.a((CancellationSignal) this.f39b)) {
                    bVar.invoke();
                    return;
                }
                return;
        }
    }

    @Override
    public void onProductDetailsResponse(h hVar, List list) {
        switch (this.f38a) {
            case 21:
                AndroidUtilities.runOnUIThread(new u(list, (Utilities.Callback2) this.e, (TLRPC.TL_inputStorePaymentStarsTopup) this.f39b, (TL_stars.TL_starsTopupOption) this.f40c, (Activity) this.d, 7));
                return;
            default:
                AndroidUtilities.runOnUIThread(new z8((t5) this.e, list, (m0) this.f39b, (TLRPC.TL_inputStorePaymentStarsGiveaway) this.f40c, hVar, (Activity) this.d, 18));
                return;
        }
    }

    @Override
    public void q(dd0 dd0Var, int i10) {
        i60 i60Var = (i60) this.e;
        dd0 dd0Var2 = (dd0) this.f39b;
        n40 n40Var = (n40) this.f40c;
        o40 o40Var = (o40) this.d;
        try {
            i60Var.container.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        e5.g(i60Var.T, i60Var.S, 0L, 604800L, 2, dd0Var2, n40Var, o40Var);
    }

    @Override
    public void run(long j3) {
        q71.P((q71) this.e, (TLRPC.User) this.f39b, (TLRPC.InputCheckPasswordSRP) this.f40c, (TwoStepVerificationActivity) this.d, j3);
    }

    @Override
    public boolean u(uy uyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, dg1 dg1Var) {
        switch (this.f38a) {
            case 2:
                TLRPC.User user = (TLRPC.User) this.f39b;
                String str = (String) this.f40c;
                jd0 jd0Var = (jd0) this.d;
                k3 k3Var = ((f3) this.e).d;
                long j3 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
                Bundle i12 = a4.a.i("scrollToTopOnResume", true);
                if (DialogObject.isEncryptedDialog(j3)) {
                    i12.putInt("enc_id", DialogObject.getEncryptedChatId(j3));
                } else if (DialogObject.isUserDialog(j3)) {
                    i12.putLong("user_id", j3);
                } else {
                    i12.putLong("chat_id", -j3);
                }
                i12.putString("start_text", "@" + UserObject.getPublicUsername(user) + " " + str);
                Activity activity = k3Var.f8439k0;
                if (activity instanceof LaunchActivity) {
                    n2 lastFragment = ((LaunchActivity) activity).O().getLastFragment();
                    if (MessagesController.getInstance(k3Var.G).checkCanOpenChat(i12, lastFragment)) {
                        jd0Var.dismiss();
                        k3Var.f8430c0 = true;
                        AndroidUtilities.cancelRunOnUIThread(k3Var.f8450t0);
                        k3Var.f8455x.i();
                        NotificationCenter.getInstance(k3Var.G).removeObserver(k3Var, NotificationCenter.webViewResultSent);
                        NotificationCenter.getGlobalInstance().removeObserver(k3Var, NotificationCenter.didSetNewTheme);
                        if (!k3Var.M0) {
                            super/*android.app.Dialog*/.dismiss();
                            k3Var.M0 = true;
                        }
                        b5 b5Var = new b5(new zn(i12));
                        b5Var.f18689b = true;
                        lastFragment.presentFragment(b5Var);
                    }
                }
                return true;
            case 6:
                j8.t((j8) this.e, (ArrayList) this.f39b, (TLRPC.TL_document) this.f40c, (MessageObject) this.d, uyVar, arrayList, charSequence, z11, i10);
                return true;
            default:
                TLRPC.User user2 = (TLRPC.User) this.f39b;
                String str2 = (String) this.f40c;
                jd0 jd0Var2 = (jd0) this.d;
                vi viVar = ((bi) this.e).e;
                long j10 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
                Bundle i13 = a4.a.i("scrollToTopOnResume", true);
                if (DialogObject.isEncryptedDialog(j10)) {
                    i13.putInt("enc_id", DialogObject.getEncryptedChatId(j10));
                } else if (DialogObject.isUserDialog(j10)) {
                    i13.putLong("user_id", j10);
                } else {
                    i13.putLong("chat_id", -j10);
                }
                i13.putString("start_text", "@" + UserObject.getPublicUsername(user2) + " " + str2);
                n2 n2Var = viVar.f29021f0;
                if (MessagesController.getInstance(viVar.J1).checkCanOpenChat(i13, n2Var)) {
                    jd0Var2.dismiss();
                    viVar.dismiss(true);
                    b5 b5Var2 = new b5(new zn(i13));
                    b5Var2.f18689b = true;
                    n2Var.presentFragment(b5Var2);
                }
                return true;
        }
    }

    public d(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f38a = i10;
        this.e = obj;
        this.f39b = obj2;
        this.f40c = obj3;
        this.d = obj4;
    }

    @Override
    public Object run(Object obj, Object obj2) {
        Context context = (Context) this.e;
        int[] iArr = (int[]) this.f39b;
        e6 e6Var = (e6) this.f40c;
        b01 b01Var = (b01) this.d;
        Integer num = (Integer) obj;
        Float f7 = (Float) obj2;
        LinearLayout e = wh.e(context, 1);
        LinearLayout linearLayout = new LinearLayout(context);
        e.addView(linearLayout, y5.t(-2, -2, 1, 0, 0, 0, 0));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(iArr[num.intValue() - 1]);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        linearLayout.addView(imageView, y5.n(24, 24));
        if (num.intValue() == 7) {
            for (int i10 = 0; i10 < 2; i10++) {
                ImageView imageView2 = new ImageView(context);
                imageView2.setImageResource(iArr[num.intValue() - 1]);
                imageView2.setScaleType(ImageView.ScaleType.CENTER);
                linearLayout.addView(imageView2, y5.n(24, 24));
            }
        }
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.getTypeface("fonts/num.otf"));
        textView.setTextColor(j6.v0(j6.f19169j5, e6Var));
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
        e.addView(textView, y5.k(0.0f, 3.0f, 0.0f, 0.0f, -1, -2));
        return new yz0(b01Var, e, false);
    }

    @Override
    public void run(ArrayList arrayList, String str) {
        switch (this.f38a) {
            case 15:
                ArrayList arrayList2 = (ArrayList) this.f39b;
                ArrayList arrayList3 = (ArrayList) this.f40c;
                Runnable runnable = (Runnable) this.d;
                TLRPC.messages_AvailableEffects availableEffects = MessagesController.getInstance(((g71) this.e).V).getAvailableEffects();
                HashSet hashSet = new HashSet();
                if (availableEffects != null) {
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        try {
                            if (!((MediaDataController.KeywordResult) arrayList.get(i10)).emoji.startsWith("animated_")) {
                                String fixEmoji = Emoji.fixEmoji(((MediaDataController.KeywordResult) arrayList.get(i10)).emoji);
                                for (int i11 = 0; i11 < availableEffects.effects.size(); i11++) {
                                    TLRPC.TL_availableEffect tL_availableEffect = availableEffects.effects.get(i11);
                                    if (!hashSet.contains(Long.valueOf(tL_availableEffect.f18327id)) && (tL_availableEffect.emoticon.contains(fixEmoji) || fixEmoji.contains(tL_availableEffect.emoticon))) {
                                        (tL_availableEffect.effect_animation_id == 0 ? arrayList2 : arrayList3).add(o0.e(tL_availableEffect));
                                        hashSet.add(Long.valueOf(tL_availableEffect.f18327id));
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
                HashMap hashMap2 = (HashMap) this.f39b;
                ArrayList arrayList4 = (ArrayList) this.f40c;
                Runnable runnable2 = (Runnable) this.d;
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
