package a1;

import a4.w;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import bh.v;
import com.google.android.gms.tasks.OnFailureListener;
import eg.k0;
import i7.f6;
import ih.f1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import jh.s7;
import kg.q0;
import kotlin.jvm.internal.j;
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
import org.telegram.messenger.x3;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.ActionBar.z4;
import org.telegram.ui.Components.b5;
import org.telegram.ui.Components.c5;
import org.telegram.ui.Components.ez0;
import org.telegram.ui.Components.g8;
import org.telegram.ui.Components.hz0;
import org.telegram.ui.Components.ni;
import org.telegram.ui.Components.oc0;
import org.telegram.ui.Components.on;
import org.telegram.ui.Components.qc0;
import org.telegram.ui.Components.tc;
import org.telegram.ui.Components.tc0;
import org.telegram.ui.Components.uh;
import org.telegram.ui.Components.vc0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.d61;
import org.telegram.ui.fg0;
import org.telegram.ui.ft;
import org.telegram.ui.fy;
import org.telegram.ui.kj0;
import org.telegram.ui.m4;
import org.telegram.ui.n61;
import org.telegram.ui.r50;
import org.telegram.ui.sc1;
import org.telegram.ui.tn;
import org.telegram.ui.vd1;
import org.telegram.ui.w30;
import org.telegram.ui.x30;
import org.telegram.ui.yx;
import org.telegram.ui.ze1;
import ph.k2;
import ph.p2;
import v0.i;
public final class d implements OnFailureListener, BillingController.ProductDetailsResponseListenerLegacy, b2, b5, yx, oc0, MediaDataController.KeywordResultCallback, MessagesStorage.LongCallback, Utilities.Callback2Return {
    public final int f36a;
    public final Object f37b;
    public final Object f38c;
    public final Object d;
    public final Object f39e;

    public d(CancellationSignal cancellationSignal, e1.d dVar, Executor executor, i iVar) {
        this.f36a = 1;
        this.f37b = cancellationSignal;
        this.f39e = dVar;
        this.f38c = executor;
        this.d = iVar;
    }

    @Override
    public boolean C() {
        switch (this.f36a) {
            case 7:
                return false;
            case 8:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void I(int i10, int i11, boolean z10) {
        TLRPC.BotInlineResult botInlineResult;
        switch (this.f36a) {
            case 5:
                tn.y0((tn) this.f39e, (TLRPC.TL_document) this.f37b, (String) this.f38c, this.d, z10, i10);
                return;
            case 9:
                on onVar = (on) this.f39e;
                onVar.f31410f0.e((TLRPC.TL_messageMediaPoll) this.f37b, onVar.K, onVar.f31415h1, (ArrayList) this.f38c, z10, i10, ((Long) this.d).longValue());
                onVar.f28403b.dismiss(true);
                return;
            case 10:
                ft ftVar = (ft) this.f39e;
                TLRPC.Document document = (TLRPC.Document) this.f37b;
                TLRPC.BotInlineResult botInlineResult2 = (TLRPC.BotInlineResult) this.f38c;
                if (document != null) {
                    botInlineResult = document;
                } else {
                    botInlineResult = botInlineResult2;
                }
                ftVar.r(i10, i11, this.d, botInlineResult, z10);
                return;
            default:
                ((ft) this.f39e).l((TLRPC.Document) this.f37b, (String) this.f38c, this.d, z10, i10, i11);
                return;
        }
    }

    @Override
    public boolean J(fy fyVar) {
        switch (this.f36a) {
            case 7:
                return false;
            case 8:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void g(c2 c2Var, int i10) {
        String str;
        int i11 = this.f36a;
        Object obj = this.d;
        Object obj2 = this.f38c;
        Object obj3 = this.f37b;
        Object obj4 = this.f39e;
        switch (i11) {
            case 4:
                ((m4) obj4).R((String) obj3, (String) obj2, (ye.c) obj);
                return;
            case 6:
                tn.T0((tn) obj4, (TLRPC.User) obj3, (AtomicBoolean) obj2, (TLRPC.TL_attachMenuBot) obj);
                return;
            case 13:
                String str2 = (String) obj;
                Pattern pattern = LaunchActivity.f35560x1;
                kj0 kj0Var = new kj0((LaunchActivity) obj4, (o2) obj3);
                kj0Var.v((String) obj2, false);
                if (str2 != null) {
                    String[] split = str2.split(" ", 2);
                    String str3 = split[0];
                    if (split.length > 1) {
                        str = split[1];
                    } else {
                        str = null;
                    }
                    tc0 tc0Var = kj0Var.d;
                    if (tc0Var != null) {
                        tc0Var.getEditText().setText(str3);
                    } else {
                        kj0Var.G = str3;
                    }
                    tc0 tc0Var2 = kj0Var.f39908e;
                    if (tc0Var2 != null) {
                        tc0Var2.getEditText().setText(str);
                    } else {
                        kj0Var.H = str;
                    }
                }
                kj0Var.show();
                return;
            case 14:
                fg0.W((fg0) obj4, (String) obj3, (String) obj2, (String) obj);
                return;
            case 15:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) obj4;
                notificationsCustomSettingsActivity.getClass();
                SharedPreferences.Editor edit = ((SharedPreferences) obj3).edit();
                edit.putBoolean((String) obj2, ((boolean[]) obj)[0]);
                edit.apply();
                notificationsCustomSettingsActivity.l0(true);
                notificationsCustomSettingsActivity.getNotificationsController().updateServerNotificationsSettings(notificationsCustomSettingsActivity.f35617s);
                return;
            default:
                ze1 ze1Var = (ze1) obj4;
                HashSet hashSet = (HashSet) obj3;
                HashSet hashSet2 = new HashSet();
                ze1Var.f45194w0 = hashSet2;
                hashSet2.addAll(hashSet);
                ze1Var.U0(true, false);
                tc.a0(ze1Var).U(LocaleController.getPluralString("TopicsDeleted", hashSet.size()), false, new vd1(ze1Var, 4), new sc1(ze1Var, (ArrayList) obj2, (Runnable) obj, 4)).j();
                ze1Var.C0();
                c2Var.dismiss();
                return;
        }
    }

    @Override
    public void onFailure(Exception e10) {
        switch (this.f36a) {
            case 0:
                CredentialProviderPlayServicesImpl.runFallbackClearCredFlow$lambda$27((CredentialProviderPlayServicesImpl) this.f39e, (CancellationSignal) this.f37b, (Executor) this.f38c, (i) this.d, e10);
                return;
            default:
                j.e(e10, "e");
                b1.b bVar = new b1.b((e1.d) this.f39e, e10, (Executor) this.f38c, (i) this.d);
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!g.a((CancellationSignal) this.f37b)) {
                    bVar.invoke();
                    return;
                }
                return;
        }
    }

    @Override
    public void onProductDetailsResponse(p2.g gVar, List list) {
        switch (this.f36a) {
            case 2:
                AndroidUtilities.runOnUIThread(new k0(list, (Utilities.Callback2) this.f39e, (TLRPC.TL_inputStorePaymentStarsTopup) this.f37b, (TL_stars.TL_starsTopupOption) this.f38c, (Activity) this.d, 12));
                return;
            default:
                AndroidUtilities.runOnUIThread(new f1((s7) this.f39e, list, (v) this.f37b, (TLRPC.TL_inputStorePaymentStarsGiveaway) this.f38c, gVar, (Activity) this.d, 3));
                return;
        }
    }

    @Override
    public void q(qc0 qc0Var, int i10) {
        r50 r50Var = (r50) this.f39e;
        qc0 qc0Var2 = (qc0) this.f37b;
        w30 w30Var = (w30) this.f38c;
        x30 x30Var = (x30) this.d;
        try {
            r50Var.container.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        c5.g(r50Var.P, r50Var.O, 0L, 604800L, 2, qc0Var2, w30Var, x30Var);
    }

    @Override
    public void run(long j10) {
        n61.P((n61) this.f39e, (TLRPC.User) this.f37b, (TLRPC.InputCheckPasswordSRP) this.f38c, (TwoStepVerificationActivity) this.d, j10);
    }

    @Override
    public boolean v(fy fyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, ze1 ze1Var) {
        switch (this.f36a) {
            case 7:
                g8.t((g8) this.f39e, (ArrayList) this.f37b, (TLRPC.TL_document) this.f38c, (MessageObject) this.d, fyVar, arrayList, charSequence, z11, i10);
                return true;
            case 8:
                TLRPC.User user = (TLRPC.User) this.f37b;
                String str = (String) this.f38c;
                vc0 vc0Var = (vc0) this.d;
                ni niVar = ((uh) this.f39e).f33236e;
                long j10 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
                Bundle i12 = w.i("scrollToTopOnResume", true);
                if (DialogObject.isEncryptedDialog(j10)) {
                    i12.putInt("enc_id", DialogObject.getEncryptedChatId(j10));
                } else if (DialogObject.isUserDialog(j10)) {
                    i12.putLong("user_id", j10);
                } else {
                    i12.putLong("chat_id", -j10);
                }
                i12.putString("start_text", "@" + UserObject.getPublicUsername(user) + " " + str);
                o2 o2Var = niVar.f30990b0;
                if (MessagesController.getInstance(niVar.F1).checkCanOpenChat(i12, o2Var)) {
                    vc0Var.dismiss();
                    niVar.dismiss(true);
                    z4 z4Var = new z4(new tn(i12));
                    z4Var.f24013b = true;
                    o2Var.presentFragment(z4Var);
                }
                return true;
            default:
                TLRPC.User user2 = (TLRPC.User) this.f37b;
                String str2 = (String) this.f38c;
                vc0 vc0Var2 = (vc0) this.d;
                p2 p2Var = ((k2) this.f39e).d;
                long j11 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
                Bundle i13 = w.i("scrollToTopOnResume", true);
                if (DialogObject.isEncryptedDialog(j11)) {
                    i13.putInt("enc_id", DialogObject.getEncryptedChatId(j11));
                } else if (DialogObject.isUserDialog(j11)) {
                    i13.putLong("user_id", j11);
                } else {
                    i13.putLong("chat_id", -j11);
                }
                i13.putString("start_text", "@" + UserObject.getPublicUsername(user2) + " " + str2);
                Activity activity = p2Var.f45967g0;
                if (activity instanceof LaunchActivity) {
                    o2 lastFragment = ((LaunchActivity) activity).O().getLastFragment();
                    if (MessagesController.getInstance(p2Var.C).checkCanOpenChat(i13, lastFragment)) {
                        vc0Var2.dismiss();
                        p2Var.Y = true;
                        AndroidUtilities.cancelRunOnUIThread(p2Var.f45976p0);
                        p2Var.f45987x.h();
                        NotificationCenter.getInstance(p2Var.C).removeObserver(p2Var, NotificationCenter.webViewResultSent);
                        NotificationCenter.getGlobalInstance().removeObserver(p2Var, NotificationCenter.didSetNewTheme);
                        if (!p2Var.I0) {
                            super/*android.app.Dialog*/.dismiss();
                            p2Var.I0 = true;
                        }
                        z4 z4Var2 = new z4(new tn(i13));
                        z4Var2.f24013b = true;
                        lastFragment.presentFragment(z4Var2);
                    }
                }
                return true;
        }
    }

    public d(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f36a = i10;
        this.f39e = obj;
        this.f37b = obj2;
        this.f38c = obj3;
        this.d = obj4;
    }

    @Override
    public Object run(Object obj, Object obj2) {
        Context context = (Context) this.f39e;
        int[] iArr = (int[]) this.f37b;
        c6 c6Var = (c6) this.f38c;
        hz0 hz0Var = (hz0) this.d;
        Integer num = (Integer) obj;
        Float f9 = (Float) obj2;
        LinearLayout g10 = x3.g(context, 1);
        LinearLayout linearLayout = new LinearLayout(context);
        g10.addView(linearLayout, f6.t(-2, -2, 1, 0, 0, 0, 0));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(iArr[num.intValue() - 1]);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        linearLayout.addView(imageView, f6.n(24, 24));
        if (num.intValue() == 7) {
            for (int i10 = 0; i10 < 2; i10++) {
                ImageView imageView2 = new ImageView(context);
                imageView2.setImageResource(iArr[num.intValue() - 1]);
                imageView2.setScaleType(ImageView.ScaleType.CENTER);
                linearLayout.addView(imageView2, f6.n(24, 24));
            }
        }
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.getTypeface("fonts/num.otf"));
        textView.setTextColor(g6.v0(g6.f23169j5, c6Var));
        StringBuilder sb2 = new StringBuilder("x");
        int i11 = (f9.floatValue() > 0.0f ? 1 : (f9.floatValue() == 0.0f ? 0 : -1));
        Object obj3 = f9;
        if (i11 <= 0) {
            obj3 = "0";
        }
        sb2.append(obj3);
        textView.setText(sb2.toString());
        textView.setTextSize(1, 13.0f);
        textView.setGravity(17);
        g10.addView(textView, f6.k(0.0f, 3.0f, 0.0f, 0.0f, -1, -2));
        return new ez0(hz0Var, g10, false);
    }

    @Override
    public void run(ArrayList arrayList, String str) {
        switch (this.f36a) {
            case 16:
                ArrayList arrayList2 = (ArrayList) this.f37b;
                ArrayList arrayList3 = (ArrayList) this.f38c;
                Runnable runnable = (Runnable) this.d;
                TLRPC.messages_AvailableEffects availableEffects = MessagesController.getInstance(((d61) this.f39e).R).getAvailableEffects();
                HashSet hashSet = new HashSet();
                if (availableEffects != null) {
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        try {
                            if (!((MediaDataController.KeywordResult) arrayList.get(i10)).emoji.startsWith("animated_")) {
                                String fixEmoji = Emoji.fixEmoji(((MediaDataController.KeywordResult) arrayList.get(i10)).emoji);
                                for (int i11 = 0; i11 < availableEffects.effects.size(); i11++) {
                                    TLRPC.TL_availableEffect tL_availableEffect = availableEffects.effects.get(i11);
                                    if (!hashSet.contains(Long.valueOf(tL_availableEffect.f22423id)) && (tL_availableEffect.emoticon.contains(fixEmoji) || fixEmoji.contains(tL_availableEffect.emoticon))) {
                                        (tL_availableEffect.effect_animation_id == 0 ? arrayList2 : arrayList3).add(q0.e(tL_availableEffect));
                                        hashSet.add(Long.valueOf(tL_availableEffect.f22423id));
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
                HashMap hashMap = (HashMap) this.f39e;
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
