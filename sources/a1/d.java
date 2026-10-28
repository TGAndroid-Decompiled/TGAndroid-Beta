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
import org.telegram.messenger.wh;
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
import org.telegram.ui.Components.go;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.ld0;
import org.telegram.ui.Components.m8;
import org.telegram.ui.Components.nd0;
import org.telegram.ui.Components.qd0;
import org.telegram.ui.Components.td0;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.u01;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.x01;
import org.telegram.ui.Components.zh;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.Wallet.r1;
import org.telegram.ui.ae1;
import org.telegram.ui.b40;
import org.telegram.ui.c40;
import org.telegram.ui.cf1;
import org.telegram.ui.ey;
import org.telegram.ui.f61;
import org.telegram.ui.ft;
import org.telegram.ui.ig0;
import org.telegram.ui.j4;
import org.telegram.ui.p61;
import org.telegram.ui.qj0;
import org.telegram.ui.t31;
import org.telegram.ui.wn;
import org.telegram.ui.x50;
import org.telegram.ui.xx;
import v0.i;
import x2.l;
public final class d implements OnFailureListener, BillingController.ProductDetailsResponseListenerLegacy, xx, b2, e5, ld0, MediaDataController.KeywordResultCallback, MessagesStorage.LongCallback, Utilities.Callback2Return, l {
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
                wn.C0((wn) this.f37b, (TLRPC.TL_document) this.f38c, (String) this.d, this.e, z10, i10);
                return;
            case 10:
                go goVar = (go) this.f37b;
                goVar.f28679j0.e((TLRPC.TL_messageMediaPoll) this.f38c, goVar.O, goVar.f28684m1, (ArrayList) this.d, z10, i10, ((Long) this.e).longValue());
                goVar.f30254b.dismiss(true);
                return;
            case 11:
                ft ftVar = (ft) this.f37b;
                TLRPC.Document document = (TLRPC.Document) this.f38c;
                TLRPC.BotInlineResult botInlineResult2 = (TLRPC.BotInlineResult) this.d;
                if (document != null) {
                    botInlineResult = document;
                } else {
                    botInlineResult = botInlineResult2;
                }
                ftVar.s(i10, i11, this.e, botInlineResult, z10);
                return;
            default:
                ((ft) this.f37b).m((TLRPC.Document) this.f38c, (String) this.d, this.e, z10, i10, i11);
                return;
        }
    }

    @Override
    public boolean K(ey eyVar) {
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
                wn.U0((wn) obj4, (TLRPC.User) obj3, (AtomicBoolean) obj2, (TLRPC.TL_attachMenuBot) obj);
                return;
            case 14:
                String str2 = (String) obj;
                Pattern pattern = LaunchActivity.D1;
                qj0 qj0Var = new qj0((LaunchActivity) obj4, (r2) obj3);
                qj0Var.w((String) obj2, false);
                if (str2 != null) {
                    String[] split = str2.split(" ", 2);
                    String str3 = split[0];
                    if (split.length > 1) {
                        str = split[1];
                    } else {
                        str = null;
                    }
                    qd0 qd0Var = qj0Var.f42728c;
                    if (qd0Var != null) {
                        qd0Var.getEditText().setText(str3);
                    } else {
                        qj0Var.J = str3;
                    }
                    qd0 qd0Var2 = qj0Var.d;
                    if (qd0Var2 != null) {
                        qd0Var2.getEditText().setText(str);
                    } else {
                        qj0Var.K = str;
                    }
                }
                qj0Var.show();
                return;
            case 15:
                ig0.V((ig0) obj4, (String) obj3, (String) obj2, (String) obj);
                return;
            case 16:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) obj4;
                notificationsCustomSettingsActivity.getClass();
                SharedPreferences.Editor edit = ((SharedPreferences) obj3).edit();
                edit.putBoolean((String) obj2, ((boolean[]) obj)[0]);
                edit.apply();
                notificationsCustomSettingsActivity.m0(true);
                notificationsCustomSettingsActivity.getNotificationsController().updateServerNotificationsSettings(notificationsCustomSettingsActivity.f35603s);
                return;
            default:
                cf1 cf1Var = (cf1) obj4;
                HashSet hashSet = (HashSet) obj3;
                HashSet hashSet2 = new HashSet();
                cf1Var.A0 = hashSet2;
                hashSet2.addAll(hashSet);
                cf1Var.V0(true, false);
                wc.b0(cf1Var).V(LocaleController.getPluralString("TopicsDeleted", hashSet.size()), false, new ae1(cf1Var, 4), new t31(cf1Var, (ArrayList) obj2, (Runnable) obj)).j();
                cf1Var.C0();
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
    public void q(nd0 nd0Var, int i10) {
        x50 x50Var = (x50) this.f37b;
        nd0 nd0Var2 = (nd0) this.f38c;
        b40 b40Var = (b40) this.d;
        c40 c40Var = (c40) this.e;
        try {
            x50Var.container.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        g5.g(x50Var.T, x50Var.S, 0L, 604800L, 2, nd0Var2, b40Var, c40Var);
    }

    @Override
    public void run(long j10) {
        p61.P((p61) this.f37b, (TLRPC.User) this.f38c, (TLRPC.InputCheckPasswordSRP) this.d, (TwoStepVerificationActivity) this.e, j10);
    }

    @Override
    public boolean v(ey eyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, cf1 cf1Var) {
        switch (this.f36a) {
            case 4:
                TLRPC.User user = (TLRPC.User) this.f38c;
                String str = (String) this.d;
                td0 td0Var = (td0) this.e;
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
                Activity activity = m3Var.f13115l0;
                if (activity instanceof LaunchActivity) {
                    r2 lastFragment = ((LaunchActivity) activity).O().getLastFragment();
                    if (MessagesController.getInstance(m3Var.H).checkCanOpenChat(i12, lastFragment)) {
                        td0Var.dismiss();
                        m3Var.f13106d0 = true;
                        AndroidUtilities.cancelRunOnUIThread(m3Var.f13126u0);
                        m3Var.f13132y.h();
                        NotificationCenter.getInstance(m3Var.H).removeObserver(m3Var, NotificationCenter.webViewResultSent);
                        NotificationCenter.getGlobalInstance().removeObserver(m3Var, NotificationCenter.didSetNewTheme);
                        NotificationCenter.getInstance(m3Var.H).removeObserver(m3Var, NotificationCenter.botDownloadsUpdate);
                        if (!m3Var.Q0) {
                            super/*android.app.Dialog*/.dismiss();
                            m3Var.Q0 = true;
                        }
                        org.telegram.ui.ActionBar.g5 g5Var = new org.telegram.ui.ActionBar.g5(new wn(i12));
                        g5Var.f22664b = true;
                        lastFragment.presentFragment(g5Var);
                    }
                }
                return true;
            case 8:
                m8.r((m8) this.f37b, (ArrayList) this.f38c, (TLRPC.TL_document) this.d, (MessageObject) this.e, eyVar, arrayList, charSequence, z11, i10);
                return true;
            default:
                TLRPC.User user2 = (TLRPC.User) this.f38c;
                String str2 = (String) this.d;
                td0 td0Var2 = (td0) this.e;
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
                r2 r2Var = tiVar.f32990f0;
                if (MessagesController.getInstance(tiVar.M1).checkCanOpenChat(i13, r2Var)) {
                    td0Var2.dismiss();
                    tiVar.dismiss(true);
                    org.telegram.ui.ActionBar.g5 g5Var2 = new org.telegram.ui.ActionBar.g5(new wn(i13));
                    g5Var2.f22664b = true;
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
        x01 x01Var = (x01) this.e;
        Integer num = (Integer) obj;
        Float f7 = (Float) obj2;
        LinearLayout d = wh.d(context, 1);
        LinearLayout linearLayout = new LinearLayout(context);
        d.addView(linearLayout, kb1.x(-2, -2, 1, 0, 0, 0, 0));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(iArr[num.intValue() - 1]);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        linearLayout.addView(imageView, kb1.r(24, 24));
        if (num.intValue() == 7) {
            for (int i10 = 0; i10 < 2; i10++) {
                ImageView imageView2 = new ImageView(context);
                imageView2.setImageResource(iArr[num.intValue() - 1]);
                imageView2.setScaleType(ImageView.ScaleType.CENTER);
                linearLayout.addView(imageView2, kb1.r(24, 24));
            }
        }
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.getTypeface("fonts/num.otf"));
        f7.V(textView, y6.f23465j5, u6Var);
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
        d.addView(textView, kb1.o(0.0f, 3.0f, 0.0f, 0.0f, -1, -2));
        return new u01(x01Var, d, false);
    }

    @Override
    public void run(ArrayList arrayList, String str) {
        switch (this.f36a) {
            case 17:
                ArrayList arrayList2 = (ArrayList) this.f38c;
                ArrayList arrayList3 = (ArrayList) this.d;
                Runnable runnable = (Runnable) this.e;
                TLRPC.messages_AvailableEffects availableEffects = MessagesController.getInstance(((f61) this.f37b).V).getAvailableEffects();
                HashSet hashSet = new HashSet();
                if (availableEffects != null) {
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        try {
                            if (!((MediaDataController.KeywordResult) arrayList.get(i10)).emoji.startsWith("animated_")) {
                                String fixEmoji = Emoji.fixEmoji(((MediaDataController.KeywordResult) arrayList.get(i10)).emoji);
                                for (int i11 = 0; i11 < availableEffects.effects.size(); i11++) {
                                    TLRPC.TL_availableEffect tL_availableEffect = availableEffects.effects.get(i11);
                                    if (!hashSet.contains(Long.valueOf(tL_availableEffect.f22059id)) && (tL_availableEffect.emoticon.contains(fixEmoji) || fixEmoji.contains(tL_availableEffect.emoticon))) {
                                        (tL_availableEffect.effect_animation_id == 0 ? arrayList2 : arrayList3).add(x0.e(tL_availableEffect));
                                        hashSet.add(Long.valueOf(tL_availableEffect.f22059id));
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
