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
import ei.g3;
import ei.l3;
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
import org.telegram.messenger.bi;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.a5;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.ci;
import org.telegram.ui.Components.d5;
import org.telegram.ui.Components.e5;
import org.telegram.ui.Components.ed0;
import org.telegram.ui.Components.gd0;
import org.telegram.ui.Components.h01;
import org.telegram.ui.Components.j8;
import org.telegram.ui.Components.k01;
import org.telegram.ui.Components.kd0;
import org.telegram.ui.Components.md0;
import org.telegram.ui.Components.xi;
import org.telegram.ui.Components.xn;
import org.telegram.ui.Components.yc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.ak0;
import org.telegram.ui.c71;
import org.telegram.ui.h60;
import org.telegram.ui.i4;
import org.telegram.ui.m71;
import org.telegram.ui.n40;
import org.telegram.ui.o40;
import org.telegram.ui.oy;
import org.telegram.ui.pt;
import org.telegram.ui.td1;
import org.telegram.ui.ug0;
import org.telegram.ui.uy;
import org.telegram.ui.we1;
import org.telegram.ui.yf1;
import org.telegram.ui.yn;
import v0.i;
import w7.z5;
import x2.m;
import yh.t5;
import yh.u;
import zg.o0;
public final class d implements OnFailureListener, oy, a2, d5, ed0, MediaDataController.KeywordResultCallback, MessagesStorage.LongCallback, Utilities.Callback2Return, m, BillingController.ProductDetailsResponseListenerLegacy {
    public final int f41a;
    public final Object f42b;
    public final Object f43c;
    public final Object d;
    public final Object f44e;

    public d(CancellationSignal cancellationSignal, e1.d dVar, Executor executor, i iVar) {
        this.f41a = 1;
        this.f42b = cancellationSignal;
        this.f44e = dVar;
        this.f43c = executor;
        this.d = iVar;
    }

    @Override
    public boolean A() {
        switch (this.f41a) {
            case 2:
                return false;
            case 6:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean H(uy uyVar) {
        switch (this.f41a) {
            case 2:
                return false;
            case 6:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void K(int i10, int i11, boolean z10) {
        TLRPC.BotInlineResult botInlineResult;
        switch (this.f41a) {
            case 4:
                yn.L0((yn) this.f44e, (TLRPC.TL_document) this.f42b, (String) this.f43c, this.d, z10, i10);
                return;
            case 8:
                xn xnVar = (xn) this.f44e;
                xnVar.f32931j0.e((TLRPC.TL_messageMediaPoll) this.f42b, xnVar.O, xnVar.l1, (ArrayList) this.f43c, z10, i10, ((Long) this.d).longValue());
                xnVar.f29648b.dismiss(true);
                return;
            case 9:
                pt ptVar = (pt) this.f44e;
                TLRPC.Document document = (TLRPC.Document) this.f42b;
                TLRPC.BotInlineResult botInlineResult2 = (TLRPC.BotInlineResult) this.f43c;
                if (document != null) {
                    botInlineResult = document;
                } else {
                    botInlineResult = botInlineResult2;
                }
                ptVar.t(i10, i11, this.d, botInlineResult, z10);
                return;
            default:
                ((pt) this.f44e).n((TLRPC.Document) this.f42b, (String) this.f43c, this.d, z10, i10, i11);
                return;
        }
    }

    @Override
    public e9.a1 b(int r17, b2.l1 r18, int[] r19) {
        throw new UnsupportedOperationException("Method not decompiled: a1.d.b(int, b2.l1, int[]):e9.a1");
    }

    @Override
    public void g(b2 b2Var, int i10) {
        String str;
        int i11 = this.f41a;
        Object obj = this.d;
        Object obj2 = this.f43c;
        Object obj3 = this.f42b;
        Object obj4 = this.f44e;
        switch (i11) {
            case 3:
                ((i4) obj4).R((String) obj3, (String) obj2, (nf.e) obj);
                return;
            case 5:
                yn.R0((yn) obj4, (TLRPC.User) obj3, (AtomicBoolean) obj2, (TLRPC.TL_attachMenuBot) obj);
                return;
            case 12:
                String str2 = (String) obj;
                Pattern pattern = LaunchActivity.B1;
                ak0 ak0Var = new ak0((LaunchActivity) obj4, (n2) obj3);
                ak0Var.v((String) obj2, false);
                if (str2 != null) {
                    String[] split = str2.split(" ", 2);
                    String str3 = split[0];
                    if (split.length > 1) {
                        str = split[1];
                    } else {
                        str = null;
                    }
                    kd0 kd0Var = ak0Var.d;
                    if (kd0Var != null) {
                        kd0Var.getEditText().setText(str3);
                    } else {
                        ak0Var.K = str3;
                    }
                    kd0 kd0Var2 = ak0Var.f34850e;
                    if (kd0Var2 != null) {
                        kd0Var2.getEditText().setText(str);
                    } else {
                        ak0Var.L = str;
                    }
                }
                ak0Var.show();
                return;
            case 13:
                ug0.U((ug0) obj4, (String) obj3, (String) obj2, (String) obj);
                return;
            case 14:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) obj4;
                notificationsCustomSettingsActivity.getClass();
                SharedPreferences.Editor edit = ((SharedPreferences) obj3).edit();
                edit.putBoolean((String) obj2, ((boolean[]) obj)[0]);
                edit.apply();
                notificationsCustomSettingsActivity.l0(true);
                notificationsCustomSettingsActivity.getNotificationsController().updateServerNotificationsSettings(notificationsCustomSettingsActivity.f33831s);
                return;
            default:
                yf1 yf1Var = (yf1) obj4;
                HashSet hashSet = (HashSet) obj3;
                HashSet hashSet2 = new HashSet();
                yf1Var.A0 = hashSet2;
                hashSet2.addAll(hashSet);
                yf1Var.U0(true, false);
                yc.a0(yf1Var).U(LocaleController.getPluralString("TopicsDeleted", hashSet.size()), false, new we1(yf1Var, 4), new td1(yf1Var, (ArrayList) obj2, (Runnable) obj, 4)).j();
                yf1Var.C0();
                b2Var.dismiss();
                return;
        }
    }

    @Override
    public void onFailure(Exception e7) {
        switch (this.f41a) {
            case 0:
                CredentialProviderPlayServicesImpl.runFallbackClearCredFlow$lambda$27((CredentialProviderPlayServicesImpl) this.f44e, (CancellationSignal) this.f42b, (Executor) this.f43c, (i) this.d, e7);
                return;
            default:
                kotlin.jvm.internal.i.e(e7, "e");
                b1.b bVar = new b1.b((e1.d) this.f44e, e7, (Executor) this.f43c, (i) this.d);
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!g.a((CancellationSignal) this.f42b)) {
                    bVar.invoke();
                    return;
                }
                return;
        }
    }

    @Override
    public void onProductDetailsResponse(h hVar, List list) {
        switch (this.f41a) {
            case 21:
                AndroidUtilities.runOnUIThread(new u(list, (Utilities.Callback2) this.f44e, (TLRPC.TL_inputStorePaymentStarsTopup) this.f42b, (TL_stars.TL_starsTopupOption) this.f43c, (Activity) this.d, 7));
                return;
            default:
                AndroidUtilities.runOnUIThread(new z8((t5) this.f44e, list, (m0) this.f42b, (TLRPC.TL_inputStorePaymentStarsGiveaway) this.f43c, hVar, (Activity) this.d, 18));
                return;
        }
    }

    @Override
    public void q(gd0 gd0Var, int i10) {
        h60 h60Var = (h60) this.f44e;
        gd0 gd0Var2 = (gd0) this.f42b;
        n40 n40Var = (n40) this.f43c;
        o40 o40Var = (o40) this.d;
        try {
            h60Var.container.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        e5.g(h60Var.T, h60Var.S, 0L, 604800L, 2, gd0Var2, n40Var, o40Var);
    }

    @Override
    public void run(long j3) {
        m71.N((m71) this.f44e, (TLRPC.User) this.f42b, (TLRPC.InputCheckPasswordSRP) this.f43c, (TwoStepVerificationActivity) this.d, j3);
    }

    @Override
    public boolean u(uy uyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, yf1 yf1Var) {
        switch (this.f41a) {
            case 2:
                TLRPC.User user = (TLRPC.User) this.f42b;
                String str = (String) this.f43c;
                md0 md0Var = (md0) this.d;
                l3 l3Var = ((g3) this.f44e).d;
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
                Activity activity = l3Var.f9165k0;
                if (activity instanceof LaunchActivity) {
                    n2 lastFragment = ((LaunchActivity) activity).O().getLastFragment();
                    if (MessagesController.getInstance(l3Var.G).checkCanOpenChat(i12, lastFragment)) {
                        md0Var.dismiss();
                        l3Var.f9155c0 = true;
                        AndroidUtilities.cancelRunOnUIThread(l3Var.f9176t0);
                        l3Var.f9181x.i();
                        NotificationCenter.getInstance(l3Var.G).removeObserver(l3Var, NotificationCenter.webViewResultSent);
                        NotificationCenter.getGlobalInstance().removeObserver(l3Var, NotificationCenter.didSetNewTheme);
                        if (!l3Var.M0) {
                            super/*android.app.Dialog*/.dismiss();
                            l3Var.M0 = true;
                        }
                        a5 a5Var = new a5(new yn(i12));
                        a5Var.f20384b = true;
                        lastFragment.presentFragment(a5Var);
                    }
                }
                return true;
            case 6:
                j8.t((j8) this.f44e, (ArrayList) this.f42b, (TLRPC.TL_document) this.f43c, (MessageObject) this.d, uyVar, arrayList, charSequence, z11, i10);
                return true;
            default:
                TLRPC.User user2 = (TLRPC.User) this.f42b;
                String str2 = (String) this.f43c;
                md0 md0Var2 = (md0) this.d;
                xi xiVar = ((ci) this.f44e).f25385e;
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
                n2 n2Var = xiVar.f32819f0;
                if (MessagesController.getInstance(xiVar.J1).checkCanOpenChat(i13, n2Var)) {
                    md0Var2.dismiss();
                    xiVar.dismiss(true);
                    a5 a5Var2 = new a5(new yn(i13));
                    a5Var2.f20384b = true;
                    n2Var.presentFragment(a5Var2);
                }
                return true;
        }
    }

    public d(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f41a = i10;
        this.f44e = obj;
        this.f42b = obj2;
        this.f43c = obj3;
        this.d = obj4;
    }

    @Override
    public Object run(Object obj, Object obj2) {
        Context context = (Context) this.f44e;
        int[] iArr = (int[]) this.f42b;
        d6 d6Var = (d6) this.f43c;
        k01 k01Var = (k01) this.d;
        Integer num = (Integer) obj;
        Float f7 = (Float) obj2;
        LinearLayout e7 = bi.e(context, 1);
        LinearLayout linearLayout = new LinearLayout(context);
        e7.addView(linearLayout, z5.t(-2, -2, 1, 0, 0, 0, 0));
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
        textView.setTextColor(i6.v0(i6.f20930j5, d6Var));
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
        e7.addView(textView, z5.k(0.0f, 3.0f, 0.0f, 0.0f, -1, -2));
        return new h01(k01Var, e7, false);
    }

    @Override
    public void run(ArrayList arrayList, String str) {
        switch (this.f41a) {
            case 15:
                ArrayList arrayList2 = (ArrayList) this.f42b;
                ArrayList arrayList3 = (ArrayList) this.f43c;
                Runnable runnable = (Runnable) this.d;
                TLRPC.messages_AvailableEffects availableEffects = MessagesController.getInstance(((c71) this.f44e).V).getAvailableEffects();
                HashSet hashSet = new HashSet();
                if (availableEffects != null) {
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        try {
                            if (!((MediaDataController.KeywordResult) arrayList.get(i10)).emoji.startsWith("animated_")) {
                                String fixEmoji = Emoji.fixEmoji(((MediaDataController.KeywordResult) arrayList.get(i10)).emoji);
                                for (int i11 = 0; i11 < availableEffects.effects.size(); i11++) {
                                    TLRPC.TL_availableEffect tL_availableEffect = availableEffects.effects.get(i11);
                                    if (!hashSet.contains(Long.valueOf(tL_availableEffect.f20073id)) && (tL_availableEffect.emoticon.contains(fixEmoji) || fixEmoji.contains(tL_availableEffect.emoticon))) {
                                        (tL_availableEffect.effect_animation_id == 0 ? arrayList2 : arrayList3).add(o0.e(tL_availableEffect));
                                        hashSet.add(Long.valueOf(tL_availableEffect.f20073id));
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
                HashMap hashMap = (HashMap) this.f44e;
                HashMap hashMap2 = (HashMap) this.f42b;
                ArrayList arrayList4 = (ArrayList) this.f43c;
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
