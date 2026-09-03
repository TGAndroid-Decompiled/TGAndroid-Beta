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
import org.telegram.ui.Components.ad0;
import org.telegram.ui.Components.c8;
import org.telegram.ui.Components.cd0;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.pn;
import org.telegram.ui.Components.pz0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.rh;
import org.telegram.ui.Components.sz0;
import org.telegram.ui.Components.vc0;
import org.telegram.ui.Components.xc0;
import org.telegram.ui.Components.y4;
import org.telegram.ui.Components.z4;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.e60;
import org.telegram.ui.i71;
import org.telegram.ui.k40;
import org.telegram.ui.ky;
import org.telegram.ui.l40;
import org.telegram.ui.ld1;
import org.telegram.ui.n4;
import org.telegram.ui.pe1;
import org.telegram.ui.pg0;
import org.telegram.ui.pt;
import org.telegram.ui.qy;
import org.telegram.ui.sf1;
import org.telegram.ui.uj0;
import org.telegram.ui.x61;
import org.telegram.ui.zn;
import p2.h;
import rh.k2;
import v0.i;
public final class d implements OnFailureListener, BillingController.ProductDetailsResponseListenerLegacy, c2, y4, ky, vc0, MediaDataController.KeywordResultCallback, MessagesStorage.LongCallback, Utilities.Callback2Return {
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
    public boolean I(qy qyVar) {
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
                zn.y0((zn) this.e, (TLRPC.TL_document) this.f34b, (String) this.f35c, this.d, z4, i10);
                return;
            case 9:
                pn pnVar = (pn) this.e;
                pnVar.f27944g0.c((TLRPC.TL_messageMediaPoll) this.f34b, pnVar.L, pnVar.f27949i1, (ArrayList) this.f35c, z4, i10, ((Long) this.d).longValue());
                pnVar.f24282b.dismiss(true);
                return;
            case 10:
                pt ptVar = (pt) this.e;
                TLRPC.Document document = (TLRPC.Document) this.f34b;
                TLRPC.BotInlineResult botInlineResult2 = (TLRPC.BotInlineResult) this.f35c;
                if (document != null) {
                    botInlineResult = document;
                } else {
                    botInlineResult = botInlineResult2;
                }
                ptVar.s(i10, i11, this.d, botInlineResult, z4);
                return;
            default:
                ((pt) this.e).m((TLRPC.Document) this.f34b, (String) this.f35c, this.d, z4, i10, i11);
                return;
        }
    }

    @Override
    public void l(d2 d2Var, int i10) {
        String str;
        int i11 = this.f33a;
        Object obj = this.d;
        Object obj2 = this.f35c;
        Object obj3 = this.f34b;
        Object obj4 = this.e;
        switch (i11) {
            case 4:
                ((n4) obj4).R((String) obj3, (String) obj2, (ze.c) obj);
                return;
            case 6:
                zn.T0((zn) obj4, (TLRPC.User) obj3, (AtomicBoolean) obj2, (TLRPC.TL_attachMenuBot) obj);
                return;
            case 13:
                String str2 = (String) obj;
                Pattern pattern = LaunchActivity.f31586y1;
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
                    ad0 ad0Var = uj0Var.d;
                    if (ad0Var != null) {
                        ad0Var.getEditText().setText(str3);
                    } else {
                        uj0Var.H = str3;
                    }
                    ad0 ad0Var2 = uj0Var.e;
                    if (ad0Var2 != null) {
                        ad0Var2.getEditText().setText(str);
                    } else {
                        uj0Var.I = str;
                    }
                }
                uj0Var.show();
                return;
            case 14:
                pg0.W((pg0) obj4, (String) obj3, (String) obj2, (String) obj);
                return;
            case 15:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) obj4;
                notificationsCustomSettingsActivity.getClass();
                SharedPreferences.Editor edit = ((SharedPreferences) obj3).edit();
                edit.putBoolean((String) obj2, ((boolean[]) obj)[0]);
                edit.apply();
                notificationsCustomSettingsActivity.l0(true);
                notificationsCustomSettingsActivity.getNotificationsController().updateServerNotificationsSettings(notificationsCustomSettingsActivity.f31642s);
                return;
            default:
                sf1 sf1Var = (sf1) obj4;
                HashSet hashSet = (HashSet) obj3;
                HashSet hashSet2 = new HashSet();
                sf1Var.f38216x0 = hashSet2;
                hashSet2.addAll(hashSet);
                sf1Var.U0(true, false);
                qc.a0(sf1Var).U(LocaleController.getPluralString("TopicsDeleted", hashSet.size()), false, new pe1(sf1Var, 4), new ld1(sf1Var, (ArrayList) obj2, (Runnable) obj, 4)).j();
                sf1Var.C0();
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
    public void q(xc0 xc0Var, int i10) {
        e60 e60Var = (e60) this.e;
        xc0 xc0Var2 = (xc0) this.f34b;
        k40 k40Var = (k40) this.f35c;
        l40 l40Var = (l40) this.d;
        try {
            e60Var.container.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        z4.g(e60Var.Q, e60Var.P, 0L, 604800L, 2, xc0Var2, k40Var, l40Var);
    }

    @Override
    public void run(long j10) {
        i71.P((i71) this.e, (TLRPC.User) this.f34b, (TLRPC.InputCheckPasswordSRP) this.f35c, (TwoStepVerificationActivity) this.d, j10);
    }

    @Override
    public boolean w(qy qyVar, ArrayList arrayList, CharSequence charSequence, boolean z4, boolean z10, int i10, int i11, sf1 sf1Var) {
        switch (this.f33a) {
            case 7:
                c8.t((c8) this.e, (ArrayList) this.f34b, (TLRPC.TL_document) this.f35c, (MessageObject) this.d, qyVar, arrayList, charSequence, z10, i10);
                return true;
            case 8:
                TLRPC.User user = (TLRPC.User) this.f34b;
                String str = (String) this.f35c;
                cd0 cd0Var = (cd0) this.d;
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
                p2 p2Var = liVar.f26685c0;
                if (MessagesController.getInstance(liVar.G1).checkCanOpenChat(i12, p2Var)) {
                    cd0Var.dismiss();
                    liVar.dismiss(true);
                    c5 c5Var = new c5(new zn(i12));
                    c5Var.f19525b = true;
                    p2Var.presentFragment(c5Var);
                }
                return true;
            default:
                TLRPC.User user2 = (TLRPC.User) this.f34b;
                String str2 = (String) this.f35c;
                cd0 cd0Var2 = (cd0) this.d;
                rh.p2 p2Var2 = ((k2) this.e).d;
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
                Activity activity = p2Var2.f43741h0;
                if (activity instanceof LaunchActivity) {
                    p2 lastFragment = ((LaunchActivity) activity).O().getLastFragment();
                    if (MessagesController.getInstance(p2Var2.D).checkCanOpenChat(i13, lastFragment)) {
                        cd0Var2.dismiss();
                        p2Var2.Z = true;
                        AndroidUtilities.cancelRunOnUIThread(p2Var2.f43750q0);
                        p2Var2.f43760x.i();
                        NotificationCenter.getInstance(p2Var2.D).removeObserver(p2Var2, NotificationCenter.webViewResultSent);
                        NotificationCenter.getGlobalInstance().removeObserver(p2Var2, NotificationCenter.didSetNewTheme);
                        if (!p2Var2.J0) {
                            super/*android.app.Dialog*/.dismiss();
                            p2Var2.J0 = true;
                        }
                        c5 c5Var2 = new c5(new zn(i13));
                        c5Var2.f19525b = true;
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
        textView.setTextColor(j6.v0(j6.f19987j5, f6Var));
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
                TLRPC.messages_AvailableEffects availableEffects = MessagesController.getInstance(((x61) this.e).S).getAvailableEffects();
                HashSet hashSet = new HashSet();
                if (availableEffects != null) {
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        try {
                            if (!((MediaDataController.KeywordResult) arrayList.get(i10)).emoji.startsWith("animated_")) {
                                String fixEmoji = Emoji.fixEmoji(((MediaDataController.KeywordResult) arrayList.get(i10)).emoji);
                                for (int i11 = 0; i11 < availableEffects.effects.size(); i11++) {
                                    TLRPC.TL_availableEffect tL_availableEffect = availableEffects.effects.get(i11);
                                    if (!hashSet.contains(Long.valueOf(tL_availableEffect.f19190id)) && (tL_availableEffect.emoticon.contains(fixEmoji) || fixEmoji.contains(tL_availableEffect.emoticon))) {
                                        (tL_availableEffect.effect_animation_id == 0 ? arrayList2 : arrayList3).add(q0.e(tL_availableEffect));
                                        hashSet.add(Long.valueOf(tL_availableEffect.f19190id));
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
