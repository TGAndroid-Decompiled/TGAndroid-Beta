package a1;

import ai.a9;
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
import org.telegram.messenger.ai;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.ActionBar.z1;
import org.telegram.ui.ActionBar.z4;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.be0;
import org.telegram.ui.Components.ei;
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.l8;
import org.telegram.ui.Components.lo;
import org.telegram.ui.Components.p01;
import org.telegram.ui.Components.s01;
import org.telegram.ui.Components.sd0;
import org.telegram.ui.Components.ud0;
import org.telegram.ui.Components.yd0;
import org.telegram.ui.Components.yi;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.Wallet.s6;
import org.telegram.ui.cf1;
import org.telegram.ui.ck0;
import org.telegram.ui.eg1;
import org.telegram.ui.g60;
import org.telegram.ui.h4;
import org.telegram.ui.j71;
import org.telegram.ui.l40;
import org.telegram.ui.m40;
import org.telegram.ui.my;
import org.telegram.ui.ot;
import org.telegram.ui.sy;
import org.telegram.ui.t71;
import org.telegram.ui.vg0;
import org.telegram.ui.yd1;
import org.telegram.ui.zn;
import qh.r;
import v0.i;
import w7.x5;
import x2.m;
import yh.n5;
import zg.n0;
public final class d implements OnFailureListener, my, z1, f5, sd0, MediaDataController.KeywordResultCallback, MessagesStorage.LongCallback, Utilities.Callback2Return, m, BillingController.ProductDetailsResponseListenerLegacy {
    public final int f42a;
    public final Object f43b;
    public final Object f44c;
    public final Object d;
    public final Object f45e;

    public d(CancellationSignal cancellationSignal, e1.d dVar, Executor executor, i iVar) {
        this.f42a = 1;
        this.f43b = cancellationSignal;
        this.f45e = dVar;
        this.f44c = executor;
        this.d = iVar;
    }

    @Override
    public boolean C() {
        switch (this.f42a) {
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
        switch (this.f42a) {
            case 4:
                zn.Z((zn) this.f45e, (TLRPC.TL_document) this.f43b, (String) this.f44c, this.d, z10, i10);
                return;
            case 8:
                lo loVar = (lo) this.f45e;
                loVar.f28528j0.e((TLRPC.TL_messageMediaPoll) this.f43b, loVar.O, loVar.l1, (ArrayList) this.f44c, z10, i10, ((Long) this.d).longValue());
                loVar.f30245b.dismiss(true);
                return;
            case 9:
                ot otVar = (ot) this.f45e;
                TLRPC.Document document = (TLRPC.Document) this.f43b;
                TLRPC.BotInlineResult botInlineResult2 = (TLRPC.BotInlineResult) this.f44c;
                if (document != null) {
                    botInlineResult = document;
                } else {
                    botInlineResult = botInlineResult2;
                }
                otVar.t(i10, i11, this.d, botInlineResult, z10);
                return;
            default:
                ((ot) this.f45e).n((TLRPC.Document) this.f43b, (String) this.f44c, this.d, z10, i10, i11);
                return;
        }
    }

    @Override
    public boolean K(sy syVar) {
        switch (this.f42a) {
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
    public void f(a2 a2Var, int i10) {
        String str;
        int i11 = this.f42a;
        Object obj = this.d;
        Object obj2 = this.f44c;
        Object obj3 = this.f43b;
        Object obj4 = this.f45e;
        switch (i11) {
            case 3:
                ((h4) obj4).R((String) obj3, (String) obj2, (of.e) obj);
                return;
            case 5:
                zn.E0((zn) obj4, (TLRPC.User) obj3, (AtomicBoolean) obj2, (TLRPC.TL_attachMenuBot) obj);
                return;
            case 12:
                String str2 = (String) obj;
                Pattern pattern = LaunchActivity.B1;
                ck0 ck0Var = new ck0((LaunchActivity) obj4, (m2) obj3);
                ck0Var.x((String) obj2, false);
                if (str2 != null) {
                    String[] split = str2.split(" ", 2);
                    String str3 = split[0];
                    if (split.length > 1) {
                        str = split[1];
                    } else {
                        str = null;
                    }
                    yd0 yd0Var = ck0Var.d;
                    if (yd0Var != null) {
                        yd0Var.getEditText().setText(str3);
                    } else {
                        ck0Var.K = str3;
                    }
                    yd0 yd0Var2 = ck0Var.f36804e;
                    if (yd0Var2 != null) {
                        yd0Var2.getEditText().setText(str);
                    } else {
                        ck0Var.L = str;
                    }
                }
                ck0Var.show();
                return;
            case 13:
                vg0.W((vg0) obj4, (String) obj3, (String) obj2, (String) obj);
                return;
            case 14:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) obj4;
                notificationsCustomSettingsActivity.getClass();
                SharedPreferences.Editor edit = ((SharedPreferences) obj3).edit();
                edit.putBoolean((String) obj2, ((boolean[]) obj)[0]);
                edit.apply();
                notificationsCustomSettingsActivity.l0(true);
                notificationsCustomSettingsActivity.getNotificationsController().updateServerNotificationsSettings(notificationsCustomSettingsActivity.f33896s);
                return;
            default:
                eg1 eg1Var = (eg1) obj4;
                HashSet hashSet = (HashSet) obj3;
                HashSet hashSet2 = new HashSet();
                eg1Var.A0 = hashSet2;
                hashSet2.addAll(hashSet);
                eg1Var.U0(true, false);
                ad.a0(eg1Var).U(LocaleController.getPluralString("TopicsDeleted", hashSet.size()), false, new cf1(eg1Var, 4), new yd1(eg1Var, (ArrayList) obj2, (Runnable) obj, 4)).j();
                eg1Var.C0();
                a2Var.dismiss();
                return;
        }
    }

    @Override
    public void onFailure(Exception e7) {
        switch (this.f42a) {
            case 0:
                CredentialProviderPlayServicesImpl.runFallbackClearCredFlow$lambda$27((CredentialProviderPlayServicesImpl) this.f45e, (CancellationSignal) this.f43b, (Executor) this.f44c, (i) this.d, e7);
                return;
            default:
                kotlin.jvm.internal.i.e(e7, "e");
                b1.b bVar = new b1.b((e1.d) this.f45e, e7, (Executor) this.f44c, (i) this.d);
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!h.a((CancellationSignal) this.f43b)) {
                    bVar.invoke();
                    return;
                }
                return;
        }
    }

    @Override
    public void onProductDetailsResponse(c5.h hVar, List list) {
        switch (this.f42a) {
            case 21:
                AndroidUtilities.runOnUIThread(new s6(list, (Utilities.Callback2) this.f45e, (TLRPC.TL_inputStorePaymentStarsTopup) this.f43b, (TL_stars.TL_starsTopupOption) this.f44c, (Activity) this.d, 13));
                return;
            default:
                AndroidUtilities.runOnUIThread(new a9((n5) this.f45e, list, (r) this.f43b, (TLRPC.TL_inputStorePaymentStarsGiveaway) this.f44c, hVar, (Activity) this.d, 23));
                return;
        }
    }

    @Override
    public void q(ud0 ud0Var, int i10) {
        g60 g60Var = (g60) this.f45e;
        ud0 ud0Var2 = (ud0) this.f43b;
        l40 l40Var = (l40) this.f44c;
        m40 m40Var = (m40) this.d;
        try {
            g60Var.container.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        g5.f(g60Var.T, g60Var.S, 0L, 604800L, 2, ud0Var2, l40Var, m40Var);
    }

    @Override
    public void run(long j3) {
        t71.Q((t71) this.f45e, (TLRPC.User) this.f43b, (TLRPC.InputCheckPasswordSRP) this.f44c, (TwoStepVerificationActivity) this.d, j3);
    }

    @Override
    public boolean w(sy syVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, eg1 eg1Var) {
        switch (this.f42a) {
            case 2:
                TLRPC.User user = (TLRPC.User) this.f43b;
                String str = (String) this.f44c;
                be0 be0Var = (be0) this.d;
                k3 k3Var = ((f3) this.f45e).d;
                long j3 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
                Bundle i12 = g.i("scrollToTopOnResume", true);
                if (DialogObject.isEncryptedDialog(j3)) {
                    i12.putInt("enc_id", DialogObject.getEncryptedChatId(j3));
                } else if (DialogObject.isUserDialog(j3)) {
                    i12.putLong("user_id", j3);
                } else {
                    i12.putLong("chat_id", -j3);
                }
                i12.putString("start_text", "@" + UserObject.getPublicUsername(user) + " " + str);
                Activity activity = k3Var.f9166k0;
                if (activity instanceof LaunchActivity) {
                    m2 lastFragment = ((LaunchActivity) activity).O().getLastFragment();
                    if (MessagesController.getInstance(k3Var.G).checkCanOpenChat(i12, lastFragment)) {
                        be0Var.dismiss();
                        k3Var.f9156c0 = true;
                        AndroidUtilities.cancelRunOnUIThread(k3Var.f9177t0);
                        k3Var.f9182x.h();
                        NotificationCenter.getInstance(k3Var.G).removeObserver(k3Var, NotificationCenter.webViewResultSent);
                        NotificationCenter.getGlobalInstance().removeObserver(k3Var, NotificationCenter.didSetNewTheme);
                        if (!k3Var.M0) {
                            super/*android.app.Dialog*/.dismiss();
                            k3Var.M0 = true;
                        }
                        z4 z4Var = new z4(new zn(i12));
                        z4Var.f21752b = true;
                        lastFragment.presentFragment(z4Var);
                    }
                }
                return true;
            case 6:
                l8.v((l8) this.f45e, (ArrayList) this.f43b, (TLRPC.TL_document) this.f44c, (MessageObject) this.d, syVar, arrayList, charSequence, z11, i10);
                return true;
            default:
                TLRPC.User user2 = (TLRPC.User) this.f43b;
                String str2 = (String) this.f44c;
                be0 be0Var2 = (be0) this.d;
                yi yiVar = ((ei) this.f45e).f26099e;
                long j10 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
                Bundle i13 = g.i("scrollToTopOnResume", true);
                if (DialogObject.isEncryptedDialog(j10)) {
                    i13.putInt("enc_id", DialogObject.getEncryptedChatId(j10));
                } else if (DialogObject.isUserDialog(j10)) {
                    i13.putLong("user_id", j10);
                } else {
                    i13.putLong("chat_id", -j10);
                }
                i13.putString("start_text", "@" + UserObject.getPublicUsername(user2) + " " + str2);
                m2 m2Var = yiVar.f33289f0;
                if (MessagesController.getInstance(yiVar.M1).checkCanOpenChat(i13, m2Var)) {
                    be0Var2.dismiss();
                    yiVar.dismiss(true);
                    z4 z4Var2 = new z4(new zn(i13));
                    z4Var2.f21752b = true;
                    m2Var.presentFragment(z4Var2);
                }
                return true;
        }
    }

    public d(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f42a = i10;
        this.f45e = obj;
        this.f43b = obj2;
        this.f44c = obj3;
        this.d = obj4;
    }

    @Override
    public Object run(Object obj, Object obj2) {
        Context context = (Context) this.f45e;
        int[] iArr = (int[]) this.f43b;
        d6 d6Var = (d6) this.f44c;
        s01 s01Var = (s01) this.d;
        Integer num = (Integer) obj;
        Float f7 = (Float) obj2;
        LinearLayout e7 = ai.e(context, 1);
        LinearLayout linearLayout = new LinearLayout(context);
        e7.addView(linearLayout, x5.t(-2, -2, 1, 0, 0, 0, 0));
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
        textView.setTextColor(h6.w0(h6.f20930j5, d6Var));
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
        e7.addView(textView, x5.k(0.0f, 3.0f, 0.0f, 0.0f, -1, -2));
        return new p01(s01Var, e7, false);
    }

    @Override
    public void run(ArrayList arrayList, String str) {
        switch (this.f42a) {
            case 15:
                ArrayList arrayList2 = (ArrayList) this.f43b;
                ArrayList arrayList3 = (ArrayList) this.f44c;
                Runnable runnable = (Runnable) this.d;
                TLRPC.messages_AvailableEffects availableEffects = MessagesController.getInstance(((j71) this.f45e).V).getAvailableEffects();
                HashSet hashSet = new HashSet();
                if (availableEffects != null) {
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        try {
                            if (!((MediaDataController.KeywordResult) arrayList.get(i10)).emoji.startsWith("animated_")) {
                                String fixEmoji = Emoji.fixEmoji(((MediaDataController.KeywordResult) arrayList.get(i10)).emoji);
                                for (int i11 = 0; i11 < availableEffects.effects.size(); i11++) {
                                    TLRPC.TL_availableEffect tL_availableEffect = availableEffects.effects.get(i11);
                                    if (!hashSet.contains(Long.valueOf(tL_availableEffect.f20099id)) && (tL_availableEffect.emoticon.contains(fixEmoji) || fixEmoji.contains(tL_availableEffect.emoticon))) {
                                        (tL_availableEffect.effect_animation_id == 0 ? arrayList2 : arrayList3).add(n0.e(tL_availableEffect));
                                        hashSet.add(Long.valueOf(tL_availableEffect.f20099id));
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
                HashMap hashMap = (HashMap) this.f45e;
                HashMap hashMap2 = (HashMap) this.f43b;
                ArrayList arrayList4 = (ArrayList) this.f44c;
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
