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
import eh.w;
import hg.j0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import k7.c6;
import kotlin.jvm.internal.j;
import lh.e1;
import mh.t7;
import ng.q0;
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
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.d5;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.bd0;
import org.telegram.ui.Components.c8;
import org.telegram.ui.Components.dd0;
import org.telegram.ui.Components.mi;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.qz0;
import org.telegram.ui.Components.rh;
import org.telegram.ui.Components.sn;
import org.telegram.ui.Components.tz0;
import org.telegram.ui.Components.wc0;
import org.telegram.ui.Components.y4;
import org.telegram.ui.Components.yc0;
import org.telegram.ui.Components.z4;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.c71;
import org.telegram.ui.d60;
import org.telegram.ui.gd1;
import org.telegram.ui.j40;
import org.telegram.ui.jy;
import org.telegram.ui.k40;
import org.telegram.ui.ke1;
import org.telegram.ui.l4;
import org.telegram.ui.mf1;
import org.telegram.ui.og0;
import org.telegram.ui.ot;
import org.telegram.ui.py;
import org.telegram.ui.r61;
import org.telegram.ui.uj0;
import org.telegram.ui.xn;
import p2.h;
import sh.k2;
import v0.i;
public final class d implements OnFailureListener, BillingController.ProductDetailsResponseListenerLegacy, c2, y4, jy, wc0, MediaDataController.KeywordResultCallback, MessagesStorage.LongCallback, Utilities.Callback2Return {
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
    public void I(int i10, int i11, boolean z4) {
        TLRPC.BotInlineResult botInlineResult;
        switch (this.f36a) {
            case 5:
                xn.y0((xn) this.f39e, (TLRPC.TL_document) this.f37b, (String) this.f38c, this.d, z4, i10);
                return;
            case 9:
                sn snVar = (sn) this.f39e;
                snVar.f31106g0.b((TLRPC.TL_messageMediaPoll) this.f37b, snVar.L, snVar.f31111i1, (ArrayList) this.f38c, z4, i10, ((Long) this.d).longValue());
                snVar.f26546b.dismiss(true);
                return;
            case 10:
                ot otVar = (ot) this.f39e;
                TLRPC.Document document = (TLRPC.Document) this.f37b;
                TLRPC.BotInlineResult botInlineResult2 = (TLRPC.BotInlineResult) this.f38c;
                if (document != null) {
                    botInlineResult = document;
                } else {
                    botInlineResult = botInlineResult2;
                }
                otVar.r(i10, i11, this.d, botInlineResult, z4);
                return;
            default:
                ((ot) this.f39e).l((TLRPC.Document) this.f37b, (String) this.f38c, this.d, z4, i10, i11);
                return;
        }
    }

    @Override
    public boolean J(py pyVar) {
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
    public void j(d2 d2Var, int i10) {
        String str;
        int i11 = this.f36a;
        Object obj = this.d;
        Object obj2 = this.f38c;
        Object obj3 = this.f37b;
        Object obj4 = this.f39e;
        switch (i11) {
            case 4:
                ((l4) obj4).R((String) obj3, (String) obj2, (af.f) obj);
                return;
            case 6:
                xn.T0((xn) obj4, (TLRPC.User) obj3, (AtomicBoolean) obj2, (TLRPC.TL_attachMenuBot) obj);
                return;
            case 13:
                String str2 = (String) obj;
                Pattern pattern = LaunchActivity.f34134y1;
                uj0 uj0Var = new uj0((LaunchActivity) obj4, (p2) obj3);
                uj0Var.v((String) obj2, false);
                if (str2 != null) {
                    String[] split = str2.split(" ", 2);
                    String str3 = split[0];
                    if (split.length > 1) {
                        str = split[1];
                    } else {
                        str = null;
                    }
                    bd0 bd0Var = uj0Var.d;
                    if (bd0Var != null) {
                        bd0Var.getEditText().setText(str3);
                    } else {
                        uj0Var.H = str3;
                    }
                    bd0 bd0Var2 = uj0Var.f41955e;
                    if (bd0Var2 != null) {
                        bd0Var2.getEditText().setText(str);
                    } else {
                        uj0Var.I = str;
                    }
                }
                uj0Var.show();
                return;
            case 14:
                og0.W((og0) obj4, (String) obj3, (String) obj2, (String) obj);
                return;
            case 15:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) obj4;
                notificationsCustomSettingsActivity.getClass();
                SharedPreferences.Editor edit = ((SharedPreferences) obj3).edit();
                edit.putBoolean((String) obj2, ((boolean[]) obj)[0]);
                edit.apply();
                notificationsCustomSettingsActivity.l0(true);
                notificationsCustomSettingsActivity.getNotificationsController().updateServerNotificationsSettings(notificationsCustomSettingsActivity.f34191s);
                return;
            default:
                mf1 mf1Var = (mf1) obj4;
                HashSet hashSet = (HashSet) obj3;
                HashSet hashSet2 = new HashSet();
                mf1Var.f39144x0 = hashSet2;
                hashSet2.addAll(hashSet);
                mf1Var.U0(true, false);
                qc.a0(mf1Var).U(LocaleController.getPluralString("TopicsDeleted", hashSet.size()), false, new ke1(mf1Var, 4), new gd1(mf1Var, (ArrayList) obj2, (Runnable) obj, 4)).j();
                mf1Var.C0();
                d2Var.dismiss();
                return;
        }
    }

    @Override
    public void onFailure(Exception e6) {
        switch (this.f36a) {
            case 0:
                CredentialProviderPlayServicesImpl.runFallbackClearCredFlow$lambda$27((CredentialProviderPlayServicesImpl) this.f39e, (CancellationSignal) this.f37b, (Executor) this.f38c, (i) this.d, e6);
                return;
            default:
                j.e(e6, "e");
                b1.b bVar = new b1.b((e1.d) this.f39e, e6, (Executor) this.f38c, (i) this.d);
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!g.a((CancellationSignal) this.f37b)) {
                    bVar.invoke();
                    return;
                }
                return;
        }
    }

    @Override
    public void onProductDetailsResponse(h hVar, List list) {
        switch (this.f36a) {
            case 2:
                AndroidUtilities.runOnUIThread(new j0(list, (Utilities.Callback2) this.f39e, (TLRPC.TL_inputStorePaymentStarsTopup) this.f37b, (TL_stars.TL_starsTopupOption) this.f38c, (Activity) this.d, 12));
                return;
            default:
                AndroidUtilities.runOnUIThread(new e1((t7) this.f39e, list, (w) this.f37b, (TLRPC.TL_inputStorePaymentStarsGiveaway) this.f38c, hVar, (Activity) this.d, 3));
                return;
        }
    }

    @Override
    public void q(yc0 yc0Var, int i10) {
        d60 d60Var = (d60) this.f39e;
        yc0 yc0Var2 = (yc0) this.f37b;
        j40 j40Var = (j40) this.f38c;
        k40 k40Var = (k40) this.d;
        try {
            d60Var.container.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        z4.g(d60Var.Q, d60Var.P, 0L, 604800L, 2, yc0Var2, j40Var, k40Var);
    }

    @Override
    public void run(long j10) {
        c71.P((c71) this.f39e, (TLRPC.User) this.f37b, (TLRPC.InputCheckPasswordSRP) this.f38c, (TwoStepVerificationActivity) this.d, j10);
    }

    @Override
    public boolean v(py pyVar, ArrayList arrayList, CharSequence charSequence, boolean z4, boolean z10, int i10, int i11, mf1 mf1Var) {
        switch (this.f36a) {
            case 7:
                c8.t((c8) this.f39e, (ArrayList) this.f37b, (TLRPC.TL_document) this.f38c, (MessageObject) this.d, pyVar, arrayList, charSequence, z10, i10);
                return true;
            case 8:
                TLRPC.User user = (TLRPC.User) this.f37b;
                String str = (String) this.f38c;
                dd0 dd0Var = (dd0) this.d;
                mi miVar = ((rh) this.f39e).f30699e;
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
                p2 p2Var = miVar.f29040c0;
                if (MessagesController.getInstance(miVar.G1).checkCanOpenChat(i12, p2Var)) {
                    dd0Var.dismiss();
                    miVar.dismiss(true);
                    d5 d5Var = new d5(new xn(i12));
                    d5Var.f21277b = true;
                    p2Var.presentFragment(d5Var);
                }
                return true;
            default:
                TLRPC.User user2 = (TLRPC.User) this.f37b;
                String str2 = (String) this.f38c;
                dd0 dd0Var2 = (dd0) this.d;
                sh.p2 p2Var2 = ((k2) this.f39e).d;
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
                Activity activity = p2Var2.f47593h0;
                if (activity instanceof LaunchActivity) {
                    p2 lastFragment = ((LaunchActivity) activity).O().getLastFragment();
                    if (MessagesController.getInstance(p2Var2.D).checkCanOpenChat(i13, lastFragment)) {
                        dd0Var2.dismiss();
                        p2Var2.Z = true;
                        AndroidUtilities.cancelRunOnUIThread(p2Var2.f47602q0);
                        p2Var2.f47612x.h();
                        NotificationCenter.getInstance(p2Var2.D).removeObserver(p2Var2, NotificationCenter.webViewResultSent);
                        NotificationCenter.getGlobalInstance().removeObserver(p2Var2, NotificationCenter.didSetNewTheme);
                        if (!p2Var2.J0) {
                            super/*android.app.Dialog*/.dismiss();
                            p2Var2.J0 = true;
                        }
                        d5 d5Var2 = new d5(new xn(i13));
                        d5Var2.f21277b = true;
                        lastFragment.presentFragment(d5Var2);
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
        g6 g6Var = (g6) this.f38c;
        tz0 tz0Var = (tz0) this.d;
        Integer num = (Integer) obj;
        Float f10 = (Float) obj2;
        LinearLayout f11 = y3.f(context, 1);
        LinearLayout linearLayout = new LinearLayout(context);
        f11.addView(linearLayout, c6.t(-2, -2, 1, 0, 0, 0, 0));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(iArr[num.intValue() - 1]);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        linearLayout.addView(imageView, c6.n(24, 24));
        if (num.intValue() == 7) {
            for (int i10 = 0; i10 < 2; i10++) {
                ImageView imageView2 = new ImageView(context);
                imageView2.setImageResource(iArr[num.intValue() - 1]);
                imageView2.setScaleType(ImageView.ScaleType.CENTER);
                linearLayout.addView(imageView2, c6.n(24, 24));
            }
        }
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.getTypeface("fonts/num.otf"));
        textView.setTextColor(k6.v0(k6.f21766j5, g6Var));
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
        f11.addView(textView, c6.k(0.0f, 3.0f, 0.0f, 0.0f, -1, -2));
        return new qz0(tz0Var, f11, false);
    }

    @Override
    public void run(ArrayList arrayList, String str) {
        switch (this.f36a) {
            case 16:
                ArrayList arrayList2 = (ArrayList) this.f37b;
                ArrayList arrayList3 = (ArrayList) this.f38c;
                Runnable runnable = (Runnable) this.d;
                TLRPC.messages_AvailableEffects availableEffects = MessagesController.getInstance(((r61) this.f39e).S).getAvailableEffects();
                HashSet hashSet = new HashSet();
                if (availableEffects != null) {
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        try {
                            if (!((MediaDataController.KeywordResult) arrayList.get(i10)).emoji.startsWith("animated_")) {
                                String fixEmoji = Emoji.fixEmoji(((MediaDataController.KeywordResult) arrayList.get(i10)).emoji);
                                for (int i11 = 0; i11 < availableEffects.effects.size(); i11++) {
                                    TLRPC.TL_availableEffect tL_availableEffect = availableEffects.effects.get(i11);
                                    if (!hashSet.contains(Long.valueOf(tL_availableEffect.f20874id)) && (tL_availableEffect.emoticon.contains(fixEmoji) || fixEmoji.contains(tL_availableEffect.emoticon))) {
                                        (tL_availableEffect.effect_animation_id == 0 ? arrayList2 : arrayList3).add(q0.e(tL_availableEffect));
                                        hashSet.add(Long.valueOf(tL_availableEffect.f20874id));
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
