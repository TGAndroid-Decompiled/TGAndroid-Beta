package a1;

import ah.j1;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import bi.f0;
import bi.h8;
import c5.h;
import com.google.android.gms.tasks.OnFailureListener;
import fi.f3;
import fi.k3;
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
import org.telegram.messenger.vl;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.b5;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.ad0;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.d5;
import org.telegram.ui.Components.e5;
import org.telegram.ui.Components.k8;
import org.telegram.ui.Components.lz0;
import org.telegram.ui.Components.oz0;
import org.telegram.ui.Components.tc0;
import org.telegram.ui.Components.tn;
import org.telegram.ui.Components.vc0;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.yc;
import org.telegram.ui.Components.yc0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.cf1;
import org.telegram.ui.co;
import org.telegram.ui.eg1;
import org.telegram.ui.ek0;
import org.telegram.ui.i4;
import org.telegram.ui.j60;
import org.telegram.ui.j71;
import org.telegram.ui.n40;
import org.telegram.ui.o40;
import org.telegram.ui.oy;
import org.telegram.ui.qt;
import org.telegram.ui.t71;
import org.telegram.ui.uy;
import org.telegram.ui.wg0;
import org.telegram.ui.yd1;
import v0.i;
import w7.x5;
import x2.m;
import zh.s5;
import zh.u;
public final class d implements OnFailureListener, oy, a2, d5, tc0, MediaDataController.KeywordResultCallback, MessagesStorage.LongCallback, Utilities.Callback2Return, m, BillingController.ProductDetailsResponseListenerLegacy {
    public final int f39a;
    public final Object f40b;
    public final Object f41c;
    public final Object d;
    public final Object f42e;

    public d(CancellationSignal cancellationSignal, e1.d dVar, Executor executor, i iVar) {
        this.f39a = 1;
        this.f40b = cancellationSignal;
        this.f42e = dVar;
        this.f41c = executor;
        this.d = iVar;
    }

    @Override
    public boolean B() {
        switch (this.f39a) {
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
        switch (this.f39a) {
            case 4:
                co.y0((co) this.f42e, (TLRPC.TL_document) this.f40b, (String) this.f41c, this.d, z10, i10);
                return;
            case 8:
                tn tnVar = (tn) this.f42e;
                tnVar.f30642j0.d((TLRPC.TL_messageMediaPoll) this.f40b, tnVar.O, tnVar.l1, (ArrayList) this.f41c, z10, i10, ((Long) this.d).longValue());
                tnVar.f28753b.dismiss(true);
                return;
            case 9:
                qt qtVar = (qt) this.f42e;
                TLRPC.Document document = (TLRPC.Document) this.f40b;
                TLRPC.BotInlineResult botInlineResult2 = (TLRPC.BotInlineResult) this.f41c;
                if (document != null) {
                    botInlineResult = document;
                } else {
                    botInlineResult = botInlineResult2;
                }
                qtVar.r(i10, i11, this.d, botInlineResult, z10);
                return;
            default:
                ((qt) this.f42e).l((TLRPC.Document) this.f40b, (String) this.f41c, this.d, z10, i10, i11);
                return;
        }
    }

    @Override
    public boolean K(uy uyVar) {
        switch (this.f39a) {
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
    public void g(b2 b2Var, int i10) {
        String str;
        int i11 = this.f39a;
        Object obj = this.d;
        Object obj2 = this.f41c;
        Object obj3 = this.f40b;
        Object obj4 = this.f42e;
        switch (i11) {
            case 3:
                ((i4) obj4).R((String) obj3, (String) obj2, (of.e) obj);
                return;
            case 5:
                co.T0((co) obj4, (TLRPC.User) obj3, (AtomicBoolean) obj2, (TLRPC.TL_attachMenuBot) obj);
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
                    yc0 yc0Var = ek0Var.d;
                    if (yc0Var != null) {
                        yc0Var.getEditText().setText(str3);
                    } else {
                        ek0Var.K = str3;
                    }
                    yc0 yc0Var2 = ek0Var.f36109e;
                    if (yc0Var2 != null) {
                        yc0Var2.getEditText().setText(str);
                    } else {
                        ek0Var.L = str;
                    }
                }
                ek0Var.show();
                return;
            case 13:
                wg0.W((wg0) obj4, (String) obj3, (String) obj2, (String) obj);
                return;
            case 14:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) obj4;
                notificationsCustomSettingsActivity.getClass();
                SharedPreferences.Editor edit = ((SharedPreferences) obj3).edit();
                edit.putBoolean((String) obj2, ((boolean[]) obj)[0]);
                edit.apply();
                notificationsCustomSettingsActivity.l0(true);
                notificationsCustomSettingsActivity.getNotificationsController().updateServerNotificationsSettings(notificationsCustomSettingsActivity.f33480s);
                return;
            default:
                eg1 eg1Var = (eg1) obj4;
                HashSet hashSet = (HashSet) obj3;
                HashSet hashSet2 = new HashSet();
                eg1Var.A0 = hashSet2;
                hashSet2.addAll(hashSet);
                eg1Var.U0(true, false);
                yc.a0(eg1Var).U(LocaleController.getPluralString("TopicsDeleted", hashSet.size()), false, new cf1(eg1Var, 4), new yd1(eg1Var, (ArrayList) obj2, (Runnable) obj, 4)).j();
                eg1Var.C0();
                b2Var.dismiss();
                return;
        }
    }

    @Override
    public void onFailure(Exception e7) {
        switch (this.f39a) {
            case 0:
                CredentialProviderPlayServicesImpl.runFallbackClearCredFlow$lambda$27((CredentialProviderPlayServicesImpl) this.f42e, (CancellationSignal) this.f40b, (Executor) this.f41c, (i) this.d, e7);
                return;
            default:
                kotlin.jvm.internal.i.e(e7, "e");
                b1.b bVar = new b1.b((e1.d) this.f42e, e7, (Executor) this.f41c, (i) this.d);
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!g.a((CancellationSignal) this.f40b)) {
                    bVar.invoke();
                    return;
                }
                return;
        }
    }

    @Override
    public void onProductDetailsResponse(h hVar, List list) {
        switch (this.f39a) {
            case 21:
                AndroidUtilities.runOnUIThread(new u(list, (Utilities.Callback2) this.f42e, (TLRPC.TL_inputStorePaymentStarsTopup) this.f40b, (TL_stars.TL_starsTopupOption) this.f41c, (Activity) this.d, 7));
                return;
            default:
                AndroidUtilities.runOnUIThread(new h8((s5) this.f42e, list, (f0) this.f40b, (TLRPC.TL_inputStorePaymentStarsGiveaway) this.f41c, hVar, (Activity) this.d, 18));
                return;
        }
    }

    @Override
    public void run(long j3) {
        t71.P((t71) this.f42e, (TLRPC.User) this.f40b, (TLRPC.InputCheckPasswordSRP) this.f41c, (TwoStepVerificationActivity) this.d, j3);
    }

    @Override
    public void s(vc0 vc0Var, int i10) {
        j60 j60Var = (j60) this.f42e;
        vc0 vc0Var2 = (vc0) this.f40b;
        n40 n40Var = (n40) this.f41c;
        o40 o40Var = (o40) this.d;
        try {
            j60Var.container.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        e5.g(j60Var.T, j60Var.S, 0L, 604800L, 2, vc0Var2, n40Var, o40Var);
    }

    @Override
    public boolean u(uy uyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, eg1 eg1Var) {
        switch (this.f39a) {
            case 2:
                TLRPC.User user = (TLRPC.User) this.f40b;
                String str = (String) this.f41c;
                ad0 ad0Var = (ad0) this.d;
                k3 k3Var = ((f3) this.f42e).d;
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
                Activity activity = k3Var.f9773k0;
                if (activity instanceof LaunchActivity) {
                    n2 lastFragment = ((LaunchActivity) activity).O().getLastFragment();
                    if (MessagesController.getInstance(k3Var.G).checkCanOpenChat(i12, lastFragment)) {
                        ad0Var.dismiss();
                        k3Var.f9763c0 = true;
                        AndroidUtilities.cancelRunOnUIThread(k3Var.f9784t0);
                        k3Var.f9789x.i();
                        NotificationCenter.getInstance(k3Var.G).removeObserver(k3Var, NotificationCenter.webViewResultSent);
                        NotificationCenter.getGlobalInstance().removeObserver(k3Var, NotificationCenter.didSetNewTheme);
                        if (!k3Var.M0) {
                            super/*android.app.Dialog*/.dismiss();
                            k3Var.M0 = true;
                        }
                        b5 b5Var = new b5(new co(i12));
                        b5Var.f20269b = true;
                        lastFragment.presentFragment(b5Var);
                    }
                }
                return true;
            case 6:
                k8.t((k8) this.f42e, (ArrayList) this.f40b, (TLRPC.TL_document) this.f41c, (MessageObject) this.d, uyVar, arrayList, charSequence, z11, i10);
                return true;
            default:
                TLRPC.User user2 = (TLRPC.User) this.f40b;
                String str2 = (String) this.f41c;
                ad0 ad0Var2 = (ad0) this.d;
                vi viVar = ((bi) this.f42e).f24714e;
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
                n2 n2Var = viVar.f31279f0;
                if (MessagesController.getInstance(viVar.J1).checkCanOpenChat(i13, n2Var)) {
                    ad0Var2.dismiss();
                    viVar.dismiss(true);
                    b5 b5Var2 = new b5(new co(i13));
                    b5Var2.f20269b = true;
                    n2Var.presentFragment(b5Var2);
                }
                return true;
        }
    }

    public d(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f39a = i10;
        this.f42e = obj;
        this.f40b = obj2;
        this.f41c = obj3;
        this.d = obj4;
    }

    @Override
    public Object run(Object obj, Object obj2) {
        Context context = (Context) this.f42e;
        int[] iArr = (int[]) this.f40b;
        f6 f6Var = (f6) this.f41c;
        oz0 oz0Var = (oz0) this.d;
        Integer num = (Integer) obj;
        Float f7 = (Float) obj2;
        LinearLayout f10 = vl.f(context, 1);
        LinearLayout linearLayout = new LinearLayout(context);
        f10.addView(linearLayout, x5.t(-2, -2, 1, 0, 0, 0, 0));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(iArr[num.intValue() - 1]);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        linearLayout.addView(imageView, x5.n(24, 24));
        if (num.intValue() == 7) {
            for (int i10 = 0; i10 < 2; i10++) {
                ImageView imageView2 = new ImageView(context);
                imageView2.setImageResource(iArr[num.intValue() - 1]);
                imageView2.setScaleType(ImageView.ScaleType.CENTER);
                linearLayout.addView(imageView2, x5.n(24, 24));
            }
        }
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.getTypeface("fonts/num.otf"));
        textView.setTextColor(j6.v0(j6.f20770j5, f6Var));
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
        f10.addView(textView, x5.k(0.0f, 3.0f, 0.0f, 0.0f, -1, -2));
        return new lz0(oz0Var, f10, false);
    }

    @Override
    public void run(ArrayList arrayList, String str) {
        switch (this.f39a) {
            case 15:
                ArrayList arrayList2 = (ArrayList) this.f40b;
                ArrayList arrayList3 = (ArrayList) this.f41c;
                Runnable runnable = (Runnable) this.d;
                TLRPC.messages_AvailableEffects availableEffects = MessagesController.getInstance(((j71) this.f42e).V).getAvailableEffects();
                HashSet hashSet = new HashSet();
                if (availableEffects != null) {
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        try {
                            if (!((MediaDataController.KeywordResult) arrayList.get(i10)).emoji.startsWith("animated_")) {
                                String fixEmoji = Emoji.fixEmoji(((MediaDataController.KeywordResult) arrayList.get(i10)).emoji);
                                for (int i11 = 0; i11 < availableEffects.effects.size(); i11++) {
                                    TLRPC.TL_availableEffect tL_availableEffect = availableEffects.effects.get(i11);
                                    if (!hashSet.contains(Long.valueOf(tL_availableEffect.f19900id)) && (tL_availableEffect.emoticon.contains(fixEmoji) || fixEmoji.contains(tL_availableEffect.emoticon))) {
                                        (tL_availableEffect.effect_animation_id == 0 ? arrayList2 : arrayList3).add(j1.e(tL_availableEffect));
                                        hashSet.add(Long.valueOf(tL_availableEffect.f19900id));
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
                HashMap hashMap = (HashMap) this.f42e;
                HashMap hashMap2 = (HashMap) this.f40b;
                ArrayList arrayList4 = (ArrayList) this.f41c;
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
