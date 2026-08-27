package a1;

import a9.p;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import cg.k0;
import cg.u0;
import com.google.android.gms.tasks.OnFailureListener;
import gh.i1;
import h7.z5;
import hh.u7;
import ig.q0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import kotlin.jvm.internal.j;
import nh.b3;
import nh.w2;
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
import org.telegram.messenger.y1;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.ActionBar.z4;
import org.telegram.ui.Components.b8;
import org.telegram.ui.Components.dc0;
import org.telegram.ui.Components.fc0;
import org.telegram.ui.Components.gi;
import org.telegram.ui.Components.ic0;
import org.telegram.ui.Components.in;
import org.telegram.ui.Components.kc0;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.nh;
import org.telegram.ui.Components.vy0;
import org.telegram.ui.Components.x4;
import org.telegram.ui.Components.y4;
import org.telegram.ui.Components.yy0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.a61;
import org.telegram.ui.gy;
import org.telegram.ui.ht;
import org.telegram.ui.ig0;
import org.telegram.ui.k61;
import org.telegram.ui.m4;
import org.telegram.ui.oj0;
import org.telegram.ui.pc1;
import org.telegram.ui.rn;
import org.telegram.ui.s50;
import org.telegram.ui.ud1;
import org.telegram.ui.w30;
import org.telegram.ui.we1;
import org.telegram.ui.x30;
import org.telegram.ui.zx;
import v0.i;

public final class d implements OnFailureListener, BillingController.ProductDetailsResponseListenerLegacy, zx, a2, x4, dc0, MediaDataController.KeywordResultCallback, MessagesStorage.LongCallback, Utilities.Callback2Return {

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
    public boolean D() {
        switch (this.f36a) {
            case 4:
                break;
            case 8:
                break;
        }
        return false;
    }

    @Override
    public void I(int i10, int i11, boolean z10) {
        switch (this.f36a) {
            case 6:
                rn.y0((rn) this.f39e, (TLRPC.TL_document) this.f37b, (String) this.f38c, this.d, z10, i10);
                break;
            case 10:
                in inVar = (in) this.f39e;
                inVar.f29420f0.e((TLRPC.TL_messageMediaPoll) this.f37b, inVar.K, inVar.f29425h1, (ArrayList) this.f38c, z10, i10, ((Long) this.d).longValue());
                inVar.f34900b.dismiss(true);
                break;
            case 11:
                ht htVar = (ht) this.f39e;
                TLRPC.Document document = (TLRPC.Document) this.f37b;
                htVar.r(i10, i11, this.d, document != null ? document : (TLRPC.BotInlineResult) this.f38c, z10);
                break;
            default:
                ((ht) this.f39e).l((TLRPC.Document) this.f37b, (String) this.f38c, this.d, z10, i10, i11);
                break;
        }
    }

    @Override
    public boolean K(gy gyVar) {
        switch (this.f36a) {
            case 4:
                break;
            case 8:
                break;
        }
        return false;
    }

    @Override
    public void f(b2 b2Var, int i10) {
        int i11 = this.f36a;
        Object obj = this.d;
        Object obj2 = this.f38c;
        Object obj3 = this.f37b;
        Object obj4 = this.f39e;
        switch (i11) {
            case 5:
                ((m4) obj4).R((String) obj3, (String) obj2, (we.d) obj);
                break;
            case 7:
                rn.T0((rn) obj4, (TLRPC.User) obj3, (AtomicBoolean) obj2, (TLRPC.TL_attachMenuBot) obj);
                break;
            case 14:
                String str = (String) obj;
                Pattern pattern = LaunchActivity.f35496x1;
                oj0 oj0Var = new oj0((LaunchActivity) obj4, (n2) obj3);
                oj0Var.w((String) obj2, false);
                if (str != null) {
                    String[] strArrSplit = str.split(" ", 2);
                    String str2 = strArrSplit[0];
                    String str3 = strArrSplit.length > 1 ? strArrSplit[1] : null;
                    ic0 ic0Var = oj0Var.d;
                    if (ic0Var != null) {
                        ic0Var.getEditText().setText(str2);
                    } else {
                        oj0Var.G = str2;
                    }
                    ic0 ic0Var2 = oj0Var.f41122e;
                    if (ic0Var2 != null) {
                        ic0Var2.getEditText().setText(str3);
                    } else {
                        oj0Var.H = str3;
                    }
                }
                oj0Var.show();
                break;
            case 15:
                ig0.W((ig0) obj4, (String) obj3, (String) obj2, (String) obj);
                break;
            case 16:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) obj4;
                notificationsCustomSettingsActivity.getClass();
                SharedPreferences.Editor editorEdit = ((SharedPreferences) obj3).edit();
                editorEdit.putBoolean((String) obj2, ((boolean[]) obj)[0]);
                editorEdit.apply();
                notificationsCustomSettingsActivity.l0(true);
                notificationsCustomSettingsActivity.getNotificationsController().updateServerNotificationsSettings(notificationsCustomSettingsActivity.f35553s);
                break;
            default:
                we1 we1Var = (we1) obj4;
                HashSet hashSet = (HashSet) obj3;
                HashSet hashSet2 = new HashSet();
                we1Var.f43758w0 = hashSet2;
                hashSet2.addAll(hashSet);
                we1Var.U0(true, false);
                int i12 = 4;
                mc.a0(we1Var).U(LocaleController.getPluralString("TopicsDeleted", hashSet.size()), false, new ud1(we1Var, i12), new pc1(we1Var, (ArrayList) obj2, (Runnable) obj, i12)).j();
                we1Var.C0();
                b2Var.dismiss();
                break;
        }
    }

    @Override
    public void m(fc0 fc0Var, int i10) {
        s50 s50Var = (s50) this.f39e;
        fc0 fc0Var2 = (fc0) this.f37b;
        w30 w30Var = (w30) this.f38c;
        x30 x30Var = (x30) this.d;
        try {
            s50Var.container.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        y4.g(s50Var.P, s50Var.O, 0L, 604800L, 2, fc0Var2, w30Var, x30Var);
    }

    @Override
    public void onFailure(Exception e9) {
        switch (this.f36a) {
            case 0:
                CredentialProviderPlayServicesImpl.runFallbackClearCredFlow$lambda$27((CredentialProviderPlayServicesImpl) this.f39e, (CancellationSignal) this.f37b, (Executor) this.f38c, (i) this.d, e9);
                break;
            default:
                CancellationSignal cancellationSignal = (CancellationSignal) this.f37b;
                e1.d dVar = (e1.d) this.f39e;
                Executor executor = (Executor) this.f38c;
                i iVar = (i) this.d;
                j.e(e9, "e");
                b1.b bVar = new b1.b(dVar, e9, executor, iVar);
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!g.a(cancellationSignal)) {
                    bVar.invoke();
                    break;
                }
                break;
        }
    }

    @Override
    public void onProductDetailsResponse(n2.g gVar, List list) {
        switch (this.f36a) {
            case 2:
                AndroidUtilities.runOnUIThread(new k0(list, (Utilities.Callback2) this.f39e, (TLRPC.TL_inputStorePaymentStarsTopup) this.f37b, (TL_stars.TL_starsTopupOption) this.f38c, (Activity) this.d, 12));
                break;
            default:
                AndroidUtilities.runOnUIThread(new i1((u7) this.f39e, list, (u0) this.f37b, (TLRPC.TL_inputStorePaymentStarsGiveaway) this.f38c, gVar, (Activity) this.d, 3));
                break;
        }
    }

    @Override
    public void run(long j10) {
        k61.P((k61) this.f39e, (TLRPC.User) this.f37b, (TLRPC.InputCheckPasswordSRP) this.f38c, (TwoStepVerificationActivity) this.d, j10);
    }

    @Override
    public boolean w(gy gyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, we1 we1Var) {
        switch (this.f36a) {
            case 4:
                w2 w2Var = (w2) this.f39e;
                TLRPC.User user = (TLRPC.User) this.f37b;
                String str = (String) this.f38c;
                kc0 kc0Var = (kc0) this.d;
                b3 b3Var = w2Var.d;
                long j10 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
                Bundle bundleH = p.h("scrollToTopOnResume", true);
                if (DialogObject.isEncryptedDialog(j10)) {
                    bundleH.putInt("enc_id", DialogObject.getEncryptedChatId(j10));
                } else if (DialogObject.isUserDialog(j10)) {
                    bundleH.putLong("user_id", j10);
                } else {
                    bundleH.putLong("chat_id", -j10);
                }
                bundleH.putString("start_text", "@" + UserObject.getPublicUsername(user) + " " + str);
                Activity activity = b3Var.f18579g0;
                if (activity instanceof LaunchActivity) {
                    n2 lastFragment = ((LaunchActivity) activity).O().getLastFragment();
                    if (MessagesController.getInstance(b3Var.C).checkCanOpenChat(bundleH, lastFragment)) {
                        kc0Var.dismiss();
                        b3Var.Y = true;
                        AndroidUtilities.cancelRunOnUIThread(b3Var.f18588p0);
                        b3Var.f18599x.h();
                        NotificationCenter.getInstance(b3Var.C).removeObserver(b3Var, NotificationCenter.webViewResultSent);
                        NotificationCenter.getGlobalInstance().removeObserver(b3Var, NotificationCenter.didSetNewTheme);
                        if (!b3Var.I0) {
                            super/*android.app.Dialog*/.dismiss();
                            b3Var.I0 = true;
                        }
                        z4 z4Var = new z4(new rn(bundleH));
                        z4Var.f24000b = true;
                        lastFragment.presentFragment(z4Var);
                    }
                }
                break;
            case 8:
                b8.u((b8) this.f39e, (ArrayList) this.f37b, (TLRPC.TL_document) this.f38c, (MessageObject) this.d, gyVar, arrayList, charSequence, z11, i10);
                break;
            default:
                nh nhVar = (nh) this.f39e;
                TLRPC.User user2 = (TLRPC.User) this.f37b;
                String str2 = (String) this.f38c;
                kc0 kc0Var2 = (kc0) this.d;
                gi giVar = nhVar.f30972e;
                long j11 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
                Bundle bundleH2 = p.h("scrollToTopOnResume", true);
                if (DialogObject.isEncryptedDialog(j11)) {
                    bundleH2.putInt("enc_id", DialogObject.getEncryptedChatId(j11));
                } else if (DialogObject.isUserDialog(j11)) {
                    bundleH2.putLong("user_id", j11);
                } else {
                    bundleH2.putLong("chat_id", -j11);
                }
                bundleH2.putString("start_text", "@" + UserObject.getPublicUsername(user2) + " " + str2);
                n2 n2Var = giVar.f28635b0;
                if (MessagesController.getInstance(giVar.F1).checkCanOpenChat(bundleH2, n2Var)) {
                    kc0Var2.dismiss();
                    giVar.dismiss(true);
                    z4 z4Var2 = new z4(new rn(bundleH2));
                    z4Var2.f24000b = true;
                    n2Var.presentFragment(z4Var2);
                }
                break;
        }
        return true;
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
        yy0 yy0Var = (yy0) this.d;
        Integer num = (Integer) obj;
        Float f10 = (Float) obj2;
        LinearLayout linearLayoutG = y1.g(context, 1);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayoutG.addView(linearLayout, z5.t(-2, -2, 1, 0, 0, 0, 0));
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
        textView.setTextColor(g6.v0(g6.f23161j5, c6Var));
        StringBuilder sb2 = new StringBuilder("x");
        float fFloatValue = f10.floatValue();
        Object obj3 = f10;
        if (fFloatValue <= 0.0f) {
            obj3 = "0";
        }
        sb2.append(obj3);
        textView.setText(sb2.toString());
        textView.setTextSize(1, 13.0f);
        textView.setGravity(17);
        linearLayoutG.addView(textView, z5.k(0.0f, 3.0f, 0.0f, 0.0f, -1, -2));
        return new vy0(yy0Var, linearLayoutG, false);
    }

    @Override
    public void run(ArrayList arrayList, String str) {
        switch (this.f36a) {
            case 17:
                a61 a61Var = (a61) this.f39e;
                ArrayList arrayList2 = (ArrayList) this.f37b;
                ArrayList arrayList3 = (ArrayList) this.f38c;
                Runnable runnable = (Runnable) this.d;
                TLRPC.messages_AvailableEffects availableEffects = MessagesController.getInstance(a61Var.R).getAvailableEffects();
                HashSet hashSet = new HashSet();
                if (availableEffects != null) {
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        try {
                            if (!((MediaDataController.KeywordResult) arrayList.get(i10)).emoji.startsWith("animated_")) {
                                String strFixEmoji = Emoji.fixEmoji(((MediaDataController.KeywordResult) arrayList.get(i10)).emoji);
                                for (int i11 = 0; i11 < availableEffects.effects.size(); i11++) {
                                    TLRPC.TL_availableEffect tL_availableEffect = availableEffects.effects.get(i11);
                                    if (!hashSet.contains(Long.valueOf(tL_availableEffect.f22411id)) && (tL_availableEffect.emoticon.contains(strFixEmoji) || strFixEmoji.contains(tL_availableEffect.emoticon))) {
                                        (tL_availableEffect.effect_animation_id == 0 ? arrayList2 : arrayList3).add(q0.e(tL_availableEffect));
                                        hashSet.add(Long.valueOf(tL_availableEffect.f22411id));
                                    }
                                }
                            }
                        } catch (Exception unused) {
                        }
                    }
                }
                runnable.run();
                break;
            default:
                HashMap map = (HashMap) this.f39e;
                HashMap map2 = (HashMap) this.f37b;
                ArrayList arrayList4 = (ArrayList) this.f38c;
                Runnable runnable2 = (Runnable) this.d;
                int size = arrayList.size();
                for (int i12 = 0; i12 < size; i12++) {
                    String str2 = ((MediaDataController.KeywordResult) arrayList.get(i12)).emoji;
                    ArrayList arrayList5 = map != null ? (ArrayList) map.get(str2) : null;
                    if (arrayList5 != null && !arrayList5.isEmpty() && !map2.containsKey(arrayList5)) {
                        map2.put(arrayList5, str2);
                        arrayList4.add(arrayList5);
                    }
                }
                runnable2.run();
                break;
        }
    }
}
