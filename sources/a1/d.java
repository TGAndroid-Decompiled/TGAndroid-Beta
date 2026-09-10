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
import bi.k6;
import bi.te;
import c5.h;
import com.google.android.gms.tasks.OnFailureListener;
import di.i3;
import di.n3;
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
import org.telegram.messenger.em;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.b01;
import org.telegram.ui.Components.bd0;
import org.telegram.ui.Components.c5;
import org.telegram.ui.Components.d5;
import org.telegram.ui.Components.dd0;
import org.telegram.ui.Components.ei;
import org.telegram.ui.Components.gd0;
import org.telegram.ui.Components.id0;
import org.telegram.ui.Components.j8;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.yi;
import org.telegram.ui.Components.yz0;
import org.telegram.ui.Components.zn;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.ce1;
import org.telegram.ui.ek0;
import org.telegram.ui.eo;
import org.telegram.ui.gf1;
import org.telegram.ui.ig1;
import org.telegram.ui.j4;
import org.telegram.ui.j60;
import org.telegram.ui.l71;
import org.telegram.ui.o40;
import org.telegram.ui.p40;
import org.telegram.ui.qy;
import org.telegram.ui.rt;
import org.telegram.ui.v71;
import org.telegram.ui.wy;
import org.telegram.ui.xg0;
import v0.i;
import w7.a6;
import x2.m;
import xh.v5;
import xh.x4;
import yg.p0;
public final class d implements OnFailureListener, qy, c2, c5, bd0, MediaDataController.KeywordResultCallback, MessagesStorage.LongCallback, Utilities.Callback2Return, m, BillingController.ProductDetailsResponseListenerLegacy {
    public final int f36a;
    public final Object f37b;
    public final Object f38c;
    public final Object d;
    public final Object e;

    public d(CancellationSignal cancellationSignal, e1.d dVar, Executor executor, i iVar) {
        this.f36a = 2;
        this.f38c = cancellationSignal;
        this.f37b = dVar;
        this.d = executor;
        this.e = iVar;
    }

    @Override
    public boolean A() {
        switch (this.f36a) {
            case 1:
                return false;
            case 6:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void I(int i10, int i11, boolean z10) {
        TLRPC.BotInlineResult botInlineResult;
        switch (this.f36a) {
            case 4:
                eo.y0((eo) this.f37b, (TLRPC.TL_document) this.f38c, (String) this.d, this.e, z10, i10);
                return;
            case 8:
                zn znVar = (zn) this.f37b;
                znVar.f29750j0.c((TLRPC.TL_messageMediaPoll) this.f38c, znVar.O, znVar.l1, (ArrayList) this.d, z10, i10, ((Long) this.e).longValue());
                znVar.f26422b.dismiss(true);
                return;
            case 9:
                rt rtVar = (rt) this.f37b;
                TLRPC.Document document = (TLRPC.Document) this.f38c;
                TLRPC.BotInlineResult botInlineResult2 = (TLRPC.BotInlineResult) this.d;
                if (document != null) {
                    botInlineResult = document;
                } else {
                    botInlineResult = botInlineResult2;
                }
                rtVar.r(i10, i11, this.e, botInlineResult, z10);
                return;
            default:
                ((rt) this.f37b).l((TLRPC.Document) this.f38c, (String) this.d, this.e, z10, i10, i11);
                return;
        }
    }

    @Override
    public boolean J(wy wyVar) {
        switch (this.f36a) {
            case 1:
                return false;
            case 6:
                return false;
            default:
                return false;
        }
    }

    @Override
    public e9.a1 e(int r17, b2.l1 r18, int[] r19) {
        throw new UnsupportedOperationException("Method not decompiled: a1.d.e(int, b2.l1, int[]):e9.a1");
    }

    @Override
    public void f(d2 d2Var, int i10) {
        String str;
        int i11 = this.f36a;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.f38c;
        Object obj4 = this.f37b;
        switch (i11) {
            case 3:
                ((j4) obj4).R((String) obj3, (String) obj2, (nf.e) obj);
                return;
            case 5:
                eo.T0((eo) obj4, (TLRPC.User) obj3, (AtomicBoolean) obj2, (TLRPC.TL_attachMenuBot) obj);
                return;
            case 12:
                String str2 = (String) obj;
                Pattern pattern = LaunchActivity.B1;
                ek0 ek0Var = new ek0((LaunchActivity) obj4, (p2) obj3);
                ek0Var.v((String) obj2, false);
                if (str2 != null) {
                    String[] split = str2.split(" ", 2);
                    String str3 = split[0];
                    if (split.length > 1) {
                        str = split[1];
                    } else {
                        str = null;
                    }
                    gd0 gd0Var = ek0Var.d;
                    if (gd0Var != null) {
                        gd0Var.getEditText().setText(str3);
                    } else {
                        ek0Var.K = str3;
                    }
                    gd0 gd0Var2 = ek0Var.e;
                    if (gd0Var2 != null) {
                        gd0Var2.getEditText().setText(str);
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
                notificationsCustomSettingsActivity.getNotificationsController().updateServerNotificationsSettings(notificationsCustomSettingsActivity.f29983s);
                return;
            default:
                ig1 ig1Var = (ig1) obj4;
                HashSet hashSet = (HashSet) obj3;
                HashSet hashSet2 = new HashSet();
                ig1Var.A0 = hashSet2;
                hashSet2.addAll(hashSet);
                ig1Var.U0(true, false);
                wc.a0(ig1Var).U(LocaleController.getPluralString("TopicsDeleted", hashSet.size()), false, new gf1(ig1Var, 4), new ce1(ig1Var, (ArrayList) obj2, (Runnable) obj, 4)).j();
                ig1Var.C0();
                d2Var.dismiss();
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
                b1.b bVar = new b1.b((e1.d) this.f37b, e, (Executor) this.d, (i) this.e);
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!g.a((CancellationSignal) this.f38c)) {
                    bVar.invoke();
                    return;
                }
                return;
        }
    }

    @Override
    public void onProductDetailsResponse(h hVar, List list) {
        switch (this.f36a) {
            case 21:
                AndroidUtilities.runOnUIThread(new x4(list, (Utilities.Callback2) this.f37b, (TLRPC.TL_inputStorePaymentStarsTopup) this.f38c, (TL_stars.TL_starsTopupOption) this.d, (Activity) this.e, 3));
                return;
            default:
                AndroidUtilities.runOnUIThread(new te((v5) this.f37b, list, (k6) this.f38c, (TLRPC.TL_inputStorePaymentStarsGiveaway) this.d, hVar, (Activity) this.e, 17));
                return;
        }
    }

    @Override
    public void q(dd0 dd0Var, int i10) {
        j60 j60Var = (j60) this.f37b;
        dd0 dd0Var2 = (dd0) this.f38c;
        o40 o40Var = (o40) this.d;
        p40 p40Var = (p40) this.e;
        try {
            j60Var.container.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        d5.g(j60Var.T, j60Var.S, 0L, 604800L, 2, dd0Var2, o40Var, p40Var);
    }

    @Override
    public void run(long j3) {
        v71.P((v71) this.f37b, (TLRPC.User) this.f38c, (TLRPC.InputCheckPasswordSRP) this.d, (TwoStepVerificationActivity) this.e, j3);
    }

    @Override
    public boolean v(wy wyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, ig1 ig1Var) {
        switch (this.f36a) {
            case 1:
                TLRPC.User user = (TLRPC.User) this.f38c;
                String str = (String) this.d;
                id0 id0Var = (id0) this.e;
                n3 n3Var = ((i3) this.f37b).d;
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
                Activity activity = n3Var.f6796k0;
                if (activity instanceof LaunchActivity) {
                    p2 lastFragment = ((LaunchActivity) activity).O().getLastFragment();
                    if (MessagesController.getInstance(n3Var.G).checkCanOpenChat(i12, lastFragment)) {
                        id0Var.dismiss();
                        n3Var.f6787c0 = true;
                        AndroidUtilities.cancelRunOnUIThread(n3Var.f6807t0);
                        n3Var.f6812x.i();
                        NotificationCenter.getInstance(n3Var.G).removeObserver(n3Var, NotificationCenter.webViewResultSent);
                        NotificationCenter.getGlobalInstance().removeObserver(n3Var, NotificationCenter.didSetNewTheme);
                        if (!n3Var.M0) {
                            super/*android.app.Dialog*/.dismiss();
                            n3Var.M0 = true;
                        }
                        org.telegram.ui.ActionBar.d5 d5Var = new org.telegram.ui.ActionBar.d5(new eo(i12));
                        d5Var.f17652b = true;
                        lastFragment.presentFragment(d5Var);
                    }
                }
                return true;
            case 6:
                j8.t((j8) this.f37b, (ArrayList) this.f38c, (TLRPC.TL_document) this.d, (MessageObject) this.e, wyVar, arrayList, charSequence, z11, i10);
                return true;
            default:
                TLRPC.User user2 = (TLRPC.User) this.f38c;
                String str2 = (String) this.d;
                id0 id0Var2 = (id0) this.e;
                yi yiVar = ((ei) this.f37b).e;
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
                p2 p2Var = yiVar.f29366f0;
                if (MessagesController.getInstance(yiVar.J1).checkCanOpenChat(i13, p2Var)) {
                    id0Var2.dismiss();
                    yiVar.dismiss(true);
                    org.telegram.ui.ActionBar.d5 d5Var2 = new org.telegram.ui.ActionBar.d5(new eo(i13));
                    d5Var2.f17652b = true;
                    p2Var.presentFragment(d5Var2);
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
        f6 f6Var = (f6) this.d;
        b01 b01Var = (b01) this.e;
        Integer num = (Integer) obj;
        Float f7 = (Float) obj2;
        LinearLayout f10 = em.f(context, 1);
        LinearLayout linearLayout = new LinearLayout(context);
        f10.addView(linearLayout, a6.t(-2, -2, 1, 0, 0, 0, 0));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(iArr[num.intValue() - 1]);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        linearLayout.addView(imageView, a6.n(24, 24));
        if (num.intValue() == 7) {
            for (int i10 = 0; i10 < 2; i10++) {
                ImageView imageView2 = new ImageView(context);
                imageView2.setImageResource(iArr[num.intValue() - 1]);
                imageView2.setScaleType(ImageView.ScaleType.CENTER);
                linearLayout.addView(imageView2, a6.n(24, 24));
            }
        }
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.getTypeface("fonts/num.otf"));
        textView.setTextColor(j6.v0(j6.f18034j5, f6Var));
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
        f10.addView(textView, a6.k(0.0f, 3.0f, 0.0f, 0.0f, -1, -2));
        return new yz0(b01Var, f10, false);
    }

    @Override
    public void run(ArrayList arrayList, String str) {
        switch (this.f36a) {
            case 15:
                ArrayList arrayList2 = (ArrayList) this.f38c;
                ArrayList arrayList3 = (ArrayList) this.d;
                Runnable runnable = (Runnable) this.e;
                TLRPC.messages_AvailableEffects availableEffects = MessagesController.getInstance(((l71) this.f37b).V).getAvailableEffects();
                HashSet hashSet = new HashSet();
                if (availableEffects != null) {
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        try {
                            if (!((MediaDataController.KeywordResult) arrayList.get(i10)).emoji.startsWith("animated_")) {
                                String fixEmoji = Emoji.fixEmoji(((MediaDataController.KeywordResult) arrayList.get(i10)).emoji);
                                for (int i11 = 0; i11 < availableEffects.effects.size(); i11++) {
                                    TLRPC.TL_availableEffect tL_availableEffect = availableEffects.effects.get(i11);
                                    if (!hashSet.contains(Long.valueOf(tL_availableEffect.f17226id)) && (tL_availableEffect.emoticon.contains(fixEmoji) || fixEmoji.contains(tL_availableEffect.emoticon))) {
                                        (tL_availableEffect.effect_animation_id == 0 ? arrayList2 : arrayList3).add(p0.e(tL_availableEffect));
                                        hashSet.add(Long.valueOf(tL_availableEffect.f17226id));
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
