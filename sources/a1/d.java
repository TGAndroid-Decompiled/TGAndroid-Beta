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
import com.google.android.gms.tasks.OnFailureListener;
import dh.v;
import gg.j0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import k7.b6;
import kh.e1;
import kotlin.jvm.internal.j;
import lh.t7;
import mg.q0;
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
import org.telegram.messenger.y3;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.c5;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.bd0;
import org.telegram.ui.Components.c8;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.pz0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.qn;
import org.telegram.ui.Components.rh;
import org.telegram.ui.Components.sz0;
import org.telegram.ui.Components.uc0;
import org.telegram.ui.Components.wc0;
import org.telegram.ui.Components.y4;
import org.telegram.ui.Components.z4;
import org.telegram.ui.Components.zc0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.b71;
import org.telegram.ui.c60;
import org.telegram.ui.ed1;
import org.telegram.ui.he1;
import org.telegram.ui.i40;
import org.telegram.ui.iy;
import org.telegram.ui.j40;
import org.telegram.ui.kf1;
import org.telegram.ui.l4;
import org.telegram.ui.ng0;
import org.telegram.ui.nt;
import org.telegram.ui.oy;
import org.telegram.ui.q61;
import org.telegram.ui.sj0;
import org.telegram.ui.xn;
import p2.h;
import rh.l2;
import rh.q2;
import v0.i;
public final class d implements OnFailureListener, BillingController.ProductDetailsResponseListenerLegacy, c2, y4, iy, uc0, MediaDataController.KeywordResultCallback, MessagesStorage.LongCallback, Utilities.Callback2Return {
    public final int f33a;
    public final Object f34b;
    public final Object f35c;
    public final Object d;
    public final Object e;

    public d(CancellationSignal cancellationSignal, e1.d dVar, Executor executor, i iVar) {
        this.f33a = 1;
        this.f34b = cancellationSignal;
        this.e = dVar;
        this.f35c = executor;
        this.d = iVar;
    }

    @Override
    public boolean C() {
        switch (this.f33a) {
            case 7:
                return false;
            case 8:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void J(int i10, int i11, boolean z4) {
        TLRPC.BotInlineResult botInlineResult;
        switch (this.f33a) {
            case 5:
                xn.y0((xn) this.e, (TLRPC.TL_document) this.f34b, (String) this.f35c, this.d, z4, i10);
                return;
            case 9:
                qn qnVar = (qn) this.e;
                qnVar.f28172g0.b((TLRPC.TL_messageMediaPoll) this.f34b, qnVar.L, qnVar.f28177i1, (ArrayList) this.f35c, z4, i10, ((Long) this.d).longValue());
                qnVar.f24278b.dismiss(true);
                return;
            case 10:
                nt ntVar = (nt) this.e;
                TLRPC.Document document = (TLRPC.Document) this.f34b;
                TLRPC.BotInlineResult botInlineResult2 = (TLRPC.BotInlineResult) this.f35c;
                if (document != null) {
                    botInlineResult = document;
                } else {
                    botInlineResult = botInlineResult2;
                }
                ntVar.s(i10, i11, this.d, botInlineResult, z4);
                return;
            default:
                ((nt) this.e).m((TLRPC.Document) this.f34b, (String) this.f35c, this.d, z4, i10, i11);
                return;
        }
    }

    @Override
    public boolean K(oy oyVar) {
        switch (this.f33a) {
            case 7:
                return false;
            case 8:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void i(d2 d2Var, int i10) {
        String str;
        int i11 = this.f33a;
        Object obj = this.d;
        Object obj2 = this.f35c;
        Object obj3 = this.f34b;
        Object obj4 = this.e;
        switch (i11) {
            case 4:
                ((l4) obj4).R((String) obj3, (String) obj2, (af.f) obj);
                return;
            case 6:
                xn.T0((xn) obj4, (TLRPC.User) obj3, (AtomicBoolean) obj2, (TLRPC.TL_attachMenuBot) obj);
                return;
            case 13:
                String str2 = (String) obj;
                Pattern pattern = LaunchActivity.f31612y1;
                sj0 sj0Var = new sj0((LaunchActivity) obj4, (p2) obj3);
                sj0Var.v((String) obj2, false);
                if (str2 != null) {
                    String[] split = str2.split(" ", 2);
                    String str3 = split[0];
                    if (split.length > 1) {
                        str = split[1];
                    } else {
                        str = null;
                    }
                    zc0 zc0Var = sj0Var.d;
                    if (zc0Var != null) {
                        zc0Var.getEditText().setText(str3);
                    } else {
                        sj0Var.H = str3;
                    }
                    zc0 zc0Var2 = sj0Var.e;
                    if (zc0Var2 != null) {
                        zc0Var2.getEditText().setText(str);
                    } else {
                        sj0Var.I = str;
                    }
                }
                sj0Var.show();
                return;
            case 14:
                ng0.W((ng0) obj4, (String) obj3, (String) obj2, (String) obj);
                return;
            case 15:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) obj4;
                notificationsCustomSettingsActivity.getClass();
                SharedPreferences.Editor edit = ((SharedPreferences) obj3).edit();
                edit.putBoolean((String) obj2, ((boolean[]) obj)[0]);
                edit.apply();
                notificationsCustomSettingsActivity.l0(true);
                notificationsCustomSettingsActivity.getNotificationsController().updateServerNotificationsSettings(notificationsCustomSettingsActivity.f31668s);
                return;
            default:
                kf1 kf1Var = (kf1) obj4;
                HashSet hashSet = (HashSet) obj3;
                HashSet hashSet2 = new HashSet();
                kf1Var.f35709x0 = hashSet2;
                hashSet2.addAll(hashSet);
                kf1Var.U0(true, false);
                qc.a0(kf1Var).U(LocaleController.getPluralString("TopicsDeleted", hashSet.size()), false, new he1(kf1Var, 4), new ed1(kf1Var, (ArrayList) obj2, (Runnable) obj, 4)).j();
                kf1Var.C0();
                d2Var.dismiss();
                return;
        }
    }

    @Override
    public void onFailure(Exception e) {
        switch (this.f33a) {
            case 0:
                CredentialProviderPlayServicesImpl.runFallbackClearCredFlow$lambda$27((CredentialProviderPlayServicesImpl) this.e, (CancellationSignal) this.f34b, (Executor) this.f35c, (i) this.d, e);
                return;
            default:
                j.e(e, "e");
                b1.b bVar = new b1.b((e1.d) this.e, e, (Executor) this.f35c, (i) this.d);
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!g.a((CancellationSignal) this.f34b)) {
                    bVar.invoke();
                    return;
                }
                return;
        }
    }

    @Override
    public void onProductDetailsResponse(h hVar, List list) {
        switch (this.f33a) {
            case 2:
                AndroidUtilities.runOnUIThread(new j0(list, (Utilities.Callback2) this.e, (TLRPC.TL_inputStorePaymentStarsTopup) this.f34b, (TL_stars.TL_starsTopupOption) this.f35c, (Activity) this.d, 12));
                return;
            default:
                AndroidUtilities.runOnUIThread(new e1((t7) this.e, list, (v) this.f34b, (TLRPC.TL_inputStorePaymentStarsGiveaway) this.f35c, hVar, (Activity) this.d, 3));
                return;
        }
    }

    @Override
    public void q(wc0 wc0Var, int i10) {
        c60 c60Var = (c60) this.e;
        wc0 wc0Var2 = (wc0) this.f34b;
        i40 i40Var = (i40) this.f35c;
        j40 j40Var = (j40) this.d;
        try {
            c60Var.container.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        z4.g(c60Var.Q, c60Var.P, 0L, 604800L, 2, wc0Var2, i40Var, j40Var);
    }

    @Override
    public void run(long j10) {
        b71.P((b71) this.e, (TLRPC.User) this.f34b, (TLRPC.InputCheckPasswordSRP) this.f35c, (TwoStepVerificationActivity) this.d, j10);
    }

    @Override
    public boolean w(oy oyVar, ArrayList arrayList, CharSequence charSequence, boolean z4, boolean z10, int i10, int i11, kf1 kf1Var) {
        switch (this.f33a) {
            case 7:
                c8.t((c8) this.e, (ArrayList) this.f34b, (TLRPC.TL_document) this.f35c, (MessageObject) this.d, oyVar, arrayList, charSequence, z10, i10);
                return true;
            case 8:
                TLRPC.User user = (TLRPC.User) this.f34b;
                String str = (String) this.f35c;
                bd0 bd0Var = (bd0) this.d;
                li liVar = ((rh) this.e).e;
                long j10 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
                Bundle i12 = android.support.v4.media.a.i("scrollToTopOnResume", true);
                if (DialogObject.isEncryptedDialog(j10)) {
                    i12.putInt("enc_id", DialogObject.getEncryptedChatId(j10));
                } else if (DialogObject.isUserDialog(j10)) {
                    i12.putLong("user_id", j10);
                } else {
                    i12.putLong("chat_id", -j10);
                }
                i12.putString("start_text", "@" + UserObject.getPublicUsername(user) + " " + str);
                p2 p2Var = liVar.f26689c0;
                if (MessagesController.getInstance(liVar.G1).checkCanOpenChat(i12, p2Var)) {
                    bd0Var.dismiss();
                    liVar.dismiss(true);
                    c5 c5Var = new c5(new xn(i12));
                    c5Var.f19550b = true;
                    p2Var.presentFragment(c5Var);
                }
                return true;
            default:
                TLRPC.User user2 = (TLRPC.User) this.f34b;
                String str2 = (String) this.f35c;
                bd0 bd0Var2 = (bd0) this.d;
                q2 q2Var = ((l2) this.e).d;
                long j11 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
                Bundle i13 = android.support.v4.media.a.i("scrollToTopOnResume", true);
                if (DialogObject.isEncryptedDialog(j11)) {
                    i13.putInt("enc_id", DialogObject.getEncryptedChatId(j11));
                } else if (DialogObject.isUserDialog(j11)) {
                    i13.putLong("user_id", j11);
                } else {
                    i13.putLong("chat_id", -j11);
                }
                i13.putString("start_text", "@" + UserObject.getPublicUsername(user2) + " " + str2);
                Activity activity = q2Var.f43689h0;
                if (activity instanceof LaunchActivity) {
                    p2 lastFragment = ((LaunchActivity) activity).O().getLastFragment();
                    if (MessagesController.getInstance(q2Var.D).checkCanOpenChat(i13, lastFragment)) {
                        bd0Var2.dismiss();
                        q2Var.Z = true;
                        AndroidUtilities.cancelRunOnUIThread(q2Var.f43698q0);
                        q2Var.f43708x.h();
                        NotificationCenter.getInstance(q2Var.D).removeObserver(q2Var, NotificationCenter.webViewResultSent);
                        NotificationCenter.getGlobalInstance().removeObserver(q2Var, NotificationCenter.didSetNewTheme);
                        if (!q2Var.J0) {
                            super/*android.app.Dialog*/.dismiss();
                            q2Var.J0 = true;
                        }
                        c5 c5Var2 = new c5(new xn(i13));
                        c5Var2.f19550b = true;
                        lastFragment.presentFragment(c5Var2);
                    }
                }
                return true;
        }
    }

    public d(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f33a = i10;
        this.e = obj;
        this.f34b = obj2;
        this.f35c = obj3;
        this.d = obj4;
    }

    @Override
    public Object run(Object obj, Object obj2) {
        Context context = (Context) this.e;
        int[] iArr = (int[]) this.f34b;
        f6 f6Var = (f6) this.f35c;
        sz0 sz0Var = (sz0) this.d;
        Integer num = (Integer) obj;
        Float f10 = (Float) obj2;
        LinearLayout f11 = y3.f(context, 1);
        LinearLayout linearLayout = new LinearLayout(context);
        f11.addView(linearLayout, b6.t(-2, -2, 1, 0, 0, 0, 0));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(iArr[num.intValue() - 1]);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        linearLayout.addView(imageView, b6.n(24, 24));
        if (num.intValue() == 7) {
            for (int i10 = 0; i10 < 2; i10++) {
                ImageView imageView2 = new ImageView(context);
                imageView2.setImageResource(iArr[num.intValue() - 1]);
                imageView2.setScaleType(ImageView.ScaleType.CENTER);
                linearLayout.addView(imageView2, b6.n(24, 24));
            }
        }
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.getTypeface("fonts/num.otf"));
        textView.setTextColor(j6.v0(j6.f20012j5, f6Var));
        StringBuilder sb = new StringBuilder("x");
        int i11 = (f10.floatValue() > 0.0f ? 1 : (f10.floatValue() == 0.0f ? 0 : -1));
        Object obj3 = f10;
        if (i11 <= 0) {
            obj3 = "0";
        }
        sb.append(obj3);
        textView.setText(sb.toString());
        textView.setTextSize(1, 13.0f);
        textView.setGravity(17);
        f11.addView(textView, b6.k(0.0f, 3.0f, 0.0f, 0.0f, -1, -2));
        return new pz0(sz0Var, f11, false);
    }

    @Override
    public void run(ArrayList arrayList, String str) {
        switch (this.f33a) {
            case 16:
                ArrayList arrayList2 = (ArrayList) this.f34b;
                ArrayList arrayList3 = (ArrayList) this.f35c;
                Runnable runnable = (Runnable) this.d;
                TLRPC.messages_AvailableEffects availableEffects = MessagesController.getInstance(((q61) this.e).S).getAvailableEffects();
                HashSet hashSet = new HashSet();
                if (availableEffects != null) {
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        try {
                            if (!((MediaDataController.KeywordResult) arrayList.get(i10)).emoji.startsWith("animated_")) {
                                String fixEmoji = Emoji.fixEmoji(((MediaDataController.KeywordResult) arrayList.get(i10)).emoji);
                                for (int i11 = 0; i11 < availableEffects.effects.size(); i11++) {
                                    TLRPC.TL_availableEffect tL_availableEffect = availableEffects.effects.get(i11);
                                    if (!hashSet.contains(Long.valueOf(tL_availableEffect.f19215id)) && (tL_availableEffect.emoticon.contains(fixEmoji) || fixEmoji.contains(tL_availableEffect.emoticon))) {
                                        (tL_availableEffect.effect_animation_id == 0 ? arrayList2 : arrayList3).add(q0.e(tL_availableEffect));
                                        hashSet.add(Long.valueOf(tL_availableEffect.f19215id));
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
                HashMap hashMap2 = (HashMap) this.f34b;
                ArrayList arrayList4 = (ArrayList) this.f35c;
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
