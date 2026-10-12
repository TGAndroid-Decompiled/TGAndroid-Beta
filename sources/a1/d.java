package a1;

import ah.i1;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import bi.k8;
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
import org.telegram.messenger.yh;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.ActionBar.z1;
import org.telegram.ui.ActionBar.z4;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.io;
import org.telegram.ui.Components.k01;
import org.telegram.ui.Components.m8;
import org.telegram.ui.Components.n01;
import org.telegram.ui.Components.sd0;
import org.telegram.ui.Components.ud0;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.xd0;
import org.telegram.ui.Components.zc;
import org.telegram.ui.Components.zd0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.Wallet.p6;
import org.telegram.ui.b81;
import org.telegram.ui.bh0;
import org.telegram.ui.ee1;
import org.telegram.ui.fo;
import org.telegram.ui.ik0;
import org.telegram.ui.jf1;
import org.telegram.ui.k4;
import org.telegram.ui.lg1;
import org.telegram.ui.n60;
import org.telegram.ui.r40;
import org.telegram.ui.r71;
import org.telegram.ui.s40;
import org.telegram.ui.sy;
import org.telegram.ui.vt;
import org.telegram.ui.yy;
import rh.s;
import v0.i;
import w7.a6;
import x2.k;
import zh.n5;
public final class d implements OnFailureListener, sy, z1, f5, sd0, MediaDataController.KeywordResultCallback, MessagesStorage.LongCallback, Utilities.Callback2Return, k, BillingController.ProductDetailsResponseListenerLegacy {
    public final int f36a;
    public final Object f37b;
    public final Object f38c;
    public final Object d;
    public final Object e;

    public d(CancellationSignal cancellationSignal, e1.d dVar, Executor executor, i iVar) {
        this.f36a = 1;
        this.f37b = cancellationSignal;
        this.e = dVar;
        this.f38c = executor;
        this.d = iVar;
    }

    @Override
    public boolean D() {
        switch (this.f36a) {
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
        switch (this.f36a) {
            case 4:
                fo.Z((fo) this.e, (TLRPC.TL_document) this.f37b, (String) this.f38c, this.d, z10, i10);
                return;
            case 8:
                io ioVar = (io) this.e;
                ioVar.f26019j0.d((TLRPC.TL_messageMediaPoll) this.f37b, ioVar.O, ioVar.l1, (ArrayList) this.f38c, z10, i10, ((Long) this.d).longValue());
                ioVar.f27671b.dismiss(true);
                return;
            case 9:
                vt vtVar = (vt) this.e;
                TLRPC.Document document = (TLRPC.Document) this.f37b;
                TLRPC.BotInlineResult botInlineResult2 = (TLRPC.BotInlineResult) this.f38c;
                if (document != null) {
                    botInlineResult = document;
                } else {
                    botInlineResult = botInlineResult2;
                }
                vtVar.s(i10, i11, this.d, botInlineResult, z10);
                return;
            default:
                ((vt) this.e).m((TLRPC.Document) this.f37b, (String) this.f38c, this.d, z10, i10, i11);
                return;
        }
    }

    @Override
    public boolean L(yy yyVar) {
        switch (this.f36a) {
            case 2:
                return false;
            case 6:
                return false;
            default:
                return false;
        }
    }

    @Override
    public e9.x1 a(int r17, b2.q1 r18, int[] r19) {
        throw new UnsupportedOperationException("Method not decompiled: a1.d.a(int, b2.q1, int[]):e9.x1");
    }

    @Override
    public void g(a2 a2Var, int i10) {
        String str;
        int i11 = this.f36a;
        Object obj = this.d;
        Object obj2 = this.f38c;
        Object obj3 = this.f37b;
        Object obj4 = this.e;
        switch (i11) {
            case 3:
                ((k4) obj4).R((String) obj3, (String) obj2, (pf.c) obj);
                return;
            case 5:
                fo.E0((fo) obj4, (TLRPC.User) obj3, (AtomicBoolean) obj2, (TLRPC.TL_attachMenuBot) obj);
                return;
            case 12:
                String str2 = (String) obj;
                Pattern pattern = LaunchActivity.B1;
                ik0 ik0Var = new ik0((LaunchActivity) obj4, (m2) obj3);
                ik0Var.x((String) obj2, false);
                if (str2 != null) {
                    String[] split = str2.split(" ", 2);
                    String str3 = split[0];
                    if (split.length > 1) {
                        str = split[1];
                    } else {
                        str = null;
                    }
                    xd0 xd0Var = ik0Var.d;
                    if (xd0Var != null) {
                        xd0Var.getEditText().setText(str3);
                    } else {
                        ik0Var.K = str3;
                    }
                    xd0 xd0Var2 = ik0Var.e;
                    if (xd0Var2 != null) {
                        xd0Var2.getEditText().setText(str);
                    } else {
                        ik0Var.L = str;
                    }
                }
                ik0Var.show();
                return;
            case 13:
                bh0.W((bh0) obj4, (String) obj3, (String) obj2, (String) obj);
                return;
            case 14:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) obj4;
                notificationsCustomSettingsActivity.getClass();
                SharedPreferences.Editor edit = ((SharedPreferences) obj3).edit();
                edit.putBoolean((String) obj2, ((boolean[]) obj)[0]);
                edit.apply();
                notificationsCustomSettingsActivity.l0(true);
                notificationsCustomSettingsActivity.getNotificationsController().updateServerNotificationsSettings(notificationsCustomSettingsActivity.f32159s);
                return;
            default:
                lg1 lg1Var = (lg1) obj4;
                HashSet hashSet = (HashSet) obj3;
                HashSet hashSet2 = new HashSet();
                lg1Var.A0 = hashSet2;
                hashSet2.addAll(hashSet);
                lg1Var.U0(true, false);
                zc.a0(lg1Var).U(LocaleController.getPluralString("TopicsDeleted", hashSet.size()), false, new jf1(lg1Var, 4), new ee1(lg1Var, (ArrayList) obj2, (Runnable) obj, 4)).j();
                lg1Var.C0();
                a2Var.dismiss();
                return;
        }
    }

    @Override
    public void onFailure(Exception e) {
        switch (this.f36a) {
            case 0:
                CredentialProviderPlayServicesImpl.runFallbackClearCredFlow$lambda$27((CredentialProviderPlayServicesImpl) this.e, (CancellationSignal) this.f37b, (Executor) this.f38c, (i) this.d, e);
                return;
            default:
                kotlin.jvm.internal.i.e(e, "e");
                b1.b bVar = new b1.b((e1.d) this.e, e, (Executor) this.f38c, (i) this.d);
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!h.a((CancellationSignal) this.f37b)) {
                    bVar.invoke();
                    return;
                }
                return;
        }
    }

    @Override
    public void onProductDetailsResponse(c5.i iVar, List list) {
        switch (this.f36a) {
            case 21:
                AndroidUtilities.runOnUIThread(new p6(list, (Utilities.Callback2) this.e, (TLRPC.TL_inputStorePaymentStarsTopup) this.f37b, (TL_stars.TL_starsTopupOption) this.f38c, (Activity) this.d, 13));
                return;
            default:
                AndroidUtilities.runOnUIThread(new k8((n5) this.e, list, (s) this.f37b, (TLRPC.TL_inputStorePaymentStarsGiveaway) this.f38c, iVar, (Activity) this.d, 23));
                return;
        }
    }

    @Override
    public void r(ud0 ud0Var, int i10) {
        n60 n60Var = (n60) this.e;
        ud0 ud0Var2 = (ud0) this.f37b;
        r40 r40Var = (r40) this.f38c;
        s40 s40Var = (s40) this.d;
        try {
            n60Var.container.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        g5.f(n60Var.T, n60Var.S, 0L, 604800L, 2, ud0Var2, r40Var, s40Var);
    }

    @Override
    public void run(long j10) {
        b81.Q((b81) this.e, (TLRPC.User) this.f37b, (TLRPC.InputCheckPasswordSRP) this.f38c, (TwoStepVerificationActivity) this.d, j10);
    }

    @Override
    public boolean w(yy yyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, lg1 lg1Var) {
        switch (this.f36a) {
            case 2:
                TLRPC.User user = (TLRPC.User) this.f37b;
                String str = (String) this.f38c;
                zd0 zd0Var = (zd0) this.d;
                k3 k3Var = ((f3) this.e).d;
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
                Activity activity = k3Var.f9365k0;
                if (activity instanceof LaunchActivity) {
                    m2 lastFragment = ((LaunchActivity) activity).O().getLastFragment();
                    if (MessagesController.getInstance(k3Var.G).checkCanOpenChat(h, lastFragment)) {
                        zd0Var.dismiss();
                        k3Var.f9356c0 = true;
                        AndroidUtilities.cancelRunOnUIThread(k3Var.f9376t0);
                        k3Var.f9381x.h();
                        NotificationCenter.getInstance(k3Var.G).removeObserver(k3Var, NotificationCenter.webViewResultSent);
                        NotificationCenter.getGlobalInstance().removeObserver(k3Var, NotificationCenter.didSetNewTheme);
                        if (!k3Var.M0) {
                            super/*android.app.Dialog*/.dismiss();
                            k3Var.M0 = true;
                        }
                        z4 z4Var = new z4(new fo(h));
                        z4Var.f20843b = true;
                        lastFragment.presentFragment(z4Var);
                    }
                }
                return true;
            case 6:
                m8.v((m8) this.e, (ArrayList) this.f37b, (TLRPC.TL_document) this.f38c, (MessageObject) this.d, yyVar, arrayList, charSequence, z11, i10);
                return true;
            default:
                TLRPC.User user2 = (TLRPC.User) this.f37b;
                String str2 = (String) this.f38c;
                zd0 zd0Var2 = (zd0) this.d;
                vi viVar = ((bi) this.e).e;
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
                m2 m2Var = viVar.f30001f0;
                if (MessagesController.getInstance(viVar.M1).checkCanOpenChat(h10, m2Var)) {
                    zd0Var2.dismiss();
                    viVar.dismiss(true);
                    z4 z4Var2 = new z4(new fo(h10));
                    z4Var2.f20843b = true;
                    m2Var.presentFragment(z4Var2);
                }
                return true;
        }
    }

    public d(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f36a = i10;
        this.e = obj;
        this.f37b = obj2;
        this.f38c = obj3;
        this.d = obj4;
    }

    @Override
    public Object run(Object obj, Object obj2) {
        Context context = (Context) this.e;
        int[] iArr = (int[]) this.f37b;
        c6 c6Var = (c6) this.f38c;
        n01 n01Var = (n01) this.d;
        Integer num = (Integer) obj;
        Float f7 = (Float) obj2;
        LinearLayout e = yh.e(context, 1);
        LinearLayout linearLayout = new LinearLayout(context);
        e.addView(linearLayout, a6.t(-2, -2, 1, 0, 0, 0, 0));
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
        textView.setTextColor(g6.w0(g6.f20007j5, c6Var));
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
        e.addView(textView, a6.k(0.0f, 3.0f, 0.0f, 0.0f, -1, -2));
        return new k01(n01Var, e, false);
    }

    @Override
    public void run(ArrayList arrayList, String str) {
        switch (this.f36a) {
            case 15:
                ArrayList arrayList2 = (ArrayList) this.f37b;
                ArrayList arrayList3 = (ArrayList) this.f38c;
                Runnable runnable = (Runnable) this.d;
                TLRPC.messages_AvailableEffects availableEffects = MessagesController.getInstance(((r71) this.e).V).getAvailableEffects();
                HashSet hashSet = new HashSet();
                if (availableEffects != null) {
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        try {
                            if (!((MediaDataController.KeywordResult) arrayList.get(i10)).emoji.startsWith("animated_")) {
                                String fixEmoji = Emoji.fixEmoji(((MediaDataController.KeywordResult) arrayList.get(i10)).emoji);
                                for (int i11 = 0; i11 < availableEffects.effects.size(); i11++) {
                                    TLRPC.TL_availableEffect tL_availableEffect = availableEffects.effects.get(i11);
                                    if (!hashSet.contains(Long.valueOf(tL_availableEffect.f19247id)) && (tL_availableEffect.emoticon.contains(fixEmoji) || fixEmoji.contains(tL_availableEffect.emoticon))) {
                                        (tL_availableEffect.effect_animation_id == 0 ? arrayList2 : arrayList3).add(i1.e(tL_availableEffect));
                                        hashSet.add(Long.valueOf(tL_availableEffect.f19247id));
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
                HashMap hashMap2 = (HashMap) this.f37b;
                ArrayList arrayList4 = (ArrayList) this.f38c;
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
