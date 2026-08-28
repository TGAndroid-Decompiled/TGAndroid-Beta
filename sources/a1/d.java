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
import bg.o0;
import bg.y0;
import com.google.android.gms.tasks.OnFailureListener;
import fh.k1;
import g7.e6;
import gh.v7;
import hg.r0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import mh.c3;
import mh.x2;
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
import org.telegram.messenger.ll;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.ActionBar.z4;
import org.telegram.ui.Components.bc0;
import org.telegram.ui.Components.c8;
import org.telegram.ui.Components.ec0;
import org.telegram.ui.Components.gc0;
import org.telegram.ui.Components.jn;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.rh;
import org.telegram.ui.Components.ty0;
import org.telegram.ui.Components.wy0;
import org.telegram.ui.Components.x4;
import org.telegram.ui.Components.y4;
import org.telegram.ui.Components.zb0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.b61;
import org.telegram.ui.dy;
import org.telegram.ui.fg0;
import org.telegram.ui.ft;
import org.telegram.ui.l4;
import org.telegram.ui.l61;
import org.telegram.ui.nj0;
import org.telegram.ui.o50;
import org.telegram.ui.qc1;
import org.telegram.ui.qn;
import org.telegram.ui.t30;
import org.telegram.ui.td1;
import org.telegram.ui.u30;
import org.telegram.ui.we1;
import org.telegram.ui.wx;
import v0.i;
public final class d implements OnFailureListener, BillingController.ProductDetailsResponseListenerLegacy, wx, b2, x4, zb0, MediaDataController.KeywordResultCallback, MessagesStorage.LongCallback, Utilities.Callback2Return {
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
    public void B(int i9, int i10, boolean z10) {
        TLRPC.BotInlineResult botInlineResult;
        switch (this.f36a) {
            case 6:
                qn.x0((qn) this.f39e, (TLRPC.TL_document) this.f37b, (String) this.f38c, this.d, z10, i9);
                return;
            case 10:
                jn jnVar = (jn) this.f39e;
                jnVar.f29774f0.e((TLRPC.TL_messageMediaPoll) this.f37b, jnVar.K, jnVar.f29779h1, (ArrayList) this.f38c, z10, i9, ((Long) this.d).longValue());
                jnVar.f27493b.dismiss(true);
                return;
            case 11:
                ft ftVar = (ft) this.f39e;
                TLRPC.Document document = (TLRPC.Document) this.f37b;
                TLRPC.BotInlineResult botInlineResult2 = (TLRPC.BotInlineResult) this.f38c;
                if (document != null) {
                    botInlineResult = document;
                } else {
                    botInlineResult = botInlineResult2;
                }
                ftVar.s(i9, i10, this.d, botInlineResult, z10);
                return;
            default:
                ((ft) this.f39e).l((TLRPC.Document) this.f37b, (String) this.f38c, this.d, z10, i9, i10);
                return;
        }
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
    public boolean I(dy dyVar) {
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
    public void f(c2 c2Var, int i9) {
        String str;
        int i10 = this.f36a;
        Object obj = this.d;
        Object obj2 = this.f38c;
        Object obj3 = this.f37b;
        Object obj4 = this.f39e;
        switch (i10) {
            case 5:
                ((l4) obj4).R((String) obj3, (String) obj2, (ve.d) obj);
                return;
            case 7:
                qn.T0((qn) obj4, (TLRPC.User) obj3, (AtomicBoolean) obj2, (TLRPC.TL_attachMenuBot) obj);
                return;
            case 14:
                String str2 = (String) obj;
                Pattern pattern = LaunchActivity.f35493x1;
                nj0 nj0Var = new nj0((LaunchActivity) obj4, (o2) obj3);
                nj0Var.v((String) obj2, false);
                if (str2 != null) {
                    String[] split = str2.split(" ", 2);
                    String str3 = split[0];
                    if (split.length > 1) {
                        str = split[1];
                    } else {
                        str = null;
                    }
                    ec0 ec0Var = nj0Var.d;
                    if (ec0Var != null) {
                        ec0Var.getEditText().setText(str3);
                    } else {
                        nj0Var.G = str3;
                    }
                    ec0 ec0Var2 = nj0Var.f40749e;
                    if (ec0Var2 != null) {
                        ec0Var2.getEditText().setText(str);
                    } else {
                        nj0Var.H = str;
                    }
                }
                nj0Var.show();
                return;
            case 15:
                fg0.V((fg0) obj4, (String) obj3, (String) obj2, (String) obj);
                return;
            case 16:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) obj4;
                notificationsCustomSettingsActivity.getClass();
                SharedPreferences.Editor edit = ((SharedPreferences) obj3).edit();
                edit.putBoolean((String) obj2, ((boolean[]) obj)[0]);
                edit.apply();
                notificationsCustomSettingsActivity.k0(true);
                notificationsCustomSettingsActivity.getNotificationsController().updateServerNotificationsSettings(notificationsCustomSettingsActivity.f35550s);
                return;
            default:
                we1 we1Var = (we1) obj4;
                HashSet hashSet = (HashSet) obj3;
                HashSet hashSet2 = new HashSet();
                we1Var.f43780w0 = hashSet2;
                hashSet2.addAll(hashSet);
                we1Var.U0(true, false);
                oc.a0(we1Var).U(LocaleController.getPluralString("TopicsDeleted", hashSet.size()), false, new td1(we1Var, 4), new qc1(we1Var, (ArrayList) obj2, (Runnable) obj, 4)).j();
                we1Var.B0();
                c2Var.dismiss();
                return;
        }
    }

    @Override
    public void m(bc0 bc0Var, int i9) {
        o50 o50Var = (o50) this.f39e;
        bc0 bc0Var2 = (bc0) this.f37b;
        t30 t30Var = (t30) this.f38c;
        u30 u30Var = (u30) this.d;
        try {
            o50Var.container.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        y4.g(o50Var.P, o50Var.O, 0L, 604800L, 2, bc0Var2, t30Var, u30Var);
    }

    @Override
    public void onFailure(Exception e10) {
        switch (this.f36a) {
            case 0:
                CredentialProviderPlayServicesImpl.runFallbackClearCredFlow$lambda$27((CredentialProviderPlayServicesImpl) this.f39e, (CancellationSignal) this.f37b, (Executor) this.f38c, (i) this.d, e10);
                return;
            default:
                kotlin.jvm.internal.i.e(e10, "e");
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
    public void onProductDetailsResponse(n2.g gVar, List list) {
        switch (this.f36a) {
            case 2:
                AndroidUtilities.runOnUIThread(new o0(list, (Utilities.Callback2) this.f39e, (TLRPC.TL_inputStorePaymentStarsTopup) this.f37b, (TL_stars.TL_starsTopupOption) this.f38c, (Activity) this.d, 12));
                return;
            default:
                AndroidUtilities.runOnUIThread(new k1((v7) this.f39e, list, (y0) this.f37b, (TLRPC.TL_inputStorePaymentStarsGiveaway) this.f38c, gVar, (Activity) this.d, 3));
                return;
        }
    }

    @Override
    public void run(long j10) {
        l61.O((l61) this.f39e, (TLRPC.User) this.f37b, (TLRPC.InputCheckPasswordSRP) this.f38c, (TwoStepVerificationActivity) this.d, j10);
    }

    @Override
    public boolean v(dy dyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i9, int i10, we1 we1Var) {
        switch (this.f36a) {
            case 4:
                TLRPC.User user = (TLRPC.User) this.f37b;
                String str = (String) this.f38c;
                gc0 gc0Var = (gc0) this.d;
                c3 c3Var = ((x2) this.f39e).d;
                long j10 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
                Bundle i11 = aa.d.i("scrollToTopOnResume", true);
                if (DialogObject.isEncryptedDialog(j10)) {
                    i11.putInt("enc_id", DialogObject.getEncryptedChatId(j10));
                } else if (DialogObject.isUserDialog(j10)) {
                    i11.putLong("user_id", j10);
                } else {
                    i11.putLong("chat_id", -j10);
                }
                i11.putString("start_text", "@" + UserObject.getPublicUsername(user) + " " + str);
                Activity activity = c3Var.f17758g0;
                if (activity instanceof LaunchActivity) {
                    o2 lastFragment = ((LaunchActivity) activity).O().getLastFragment();
                    if (MessagesController.getInstance(c3Var.C).checkCanOpenChat(i11, lastFragment)) {
                        gc0Var.dismiss();
                        c3Var.Y = true;
                        AndroidUtilities.cancelRunOnUIThread(c3Var.f17767p0);
                        c3Var.f17778x.h();
                        NotificationCenter.getInstance(c3Var.C).removeObserver(c3Var, NotificationCenter.webViewResultSent);
                        NotificationCenter.getGlobalInstance().removeObserver(c3Var, NotificationCenter.didSetNewTheme);
                        if (!c3Var.I0) {
                            super/*android.app.Dialog*/.dismiss();
                            c3Var.I0 = true;
                        }
                        z4 z4Var = new z4(new qn(i11));
                        z4Var.f24009b = true;
                        lastFragment.presentFragment(z4Var);
                    }
                }
                return true;
            case 8:
                c8.t((c8) this.f39e, (ArrayList) this.f37b, (TLRPC.TL_document) this.f38c, (MessageObject) this.d, dyVar, arrayList, charSequence, z11, i9);
                return true;
            default:
                TLRPC.User user2 = (TLRPC.User) this.f37b;
                String str2 = (String) this.f38c;
                gc0 gc0Var2 = (gc0) this.d;
                ki kiVar = ((rh) this.f39e).f32175e;
                long j11 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
                Bundle i12 = aa.d.i("scrollToTopOnResume", true);
                if (DialogObject.isEncryptedDialog(j11)) {
                    i12.putInt("enc_id", DialogObject.getEncryptedChatId(j11));
                } else if (DialogObject.isUserDialog(j11)) {
                    i12.putLong("user_id", j11);
                } else {
                    i12.putLong("chat_id", -j11);
                }
                i12.putString("start_text", "@" + UserObject.getPublicUsername(user2) + " " + str2);
                o2 o2Var = kiVar.f30099b0;
                if (MessagesController.getInstance(kiVar.F1).checkCanOpenChat(i12, o2Var)) {
                    gc0Var2.dismiss();
                    kiVar.dismiss(true);
                    z4 z4Var2 = new z4(new qn(i12));
                    z4Var2.f24009b = true;
                    o2Var.presentFragment(z4Var2);
                }
                return true;
        }
    }

    public d(Object obj, Object obj2, Object obj3, Object obj4, int i9) {
        this.f36a = i9;
        this.f39e = obj;
        this.f37b = obj2;
        this.f38c = obj3;
        this.d = obj4;
    }

    @Override
    public Object run(Object obj, Object obj2) {
        Context context = (Context) this.f39e;
        int[] iArr = (int[]) this.f37b;
        b6 b6Var = (b6) this.f38c;
        wy0 wy0Var = (wy0) this.d;
        Integer num = (Integer) obj;
        Float f10 = (Float) obj2;
        LinearLayout f11 = ll.f(context, 1);
        LinearLayout linearLayout = new LinearLayout(context);
        f11.addView(linearLayout, e6.t(-2, -2, 1, 0, 0, 0, 0));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(iArr[num.intValue() - 1]);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        linearLayout.addView(imageView, e6.n(24, 24));
        if (num.intValue() == 7) {
            for (int i9 = 0; i9 < 2; i9++) {
                ImageView imageView2 = new ImageView(context);
                imageView2.setImageResource(iArr[num.intValue() - 1]);
                imageView2.setScaleType(ImageView.ScaleType.CENTER);
                linearLayout.addView(imageView2, e6.n(24, 24));
            }
        }
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.getTypeface("fonts/num.otf"));
        textView.setTextColor(f6.v0(f6.f23108j5, b6Var));
        StringBuilder sb2 = new StringBuilder("x");
        int i10 = (f10.floatValue() > 0.0f ? 1 : (f10.floatValue() == 0.0f ? 0 : -1));
        Object obj3 = f10;
        if (i10 <= 0) {
            obj3 = "0";
        }
        sb2.append(obj3);
        textView.setText(sb2.toString());
        textView.setTextSize(1, 13.0f);
        textView.setGravity(17);
        f11.addView(textView, e6.k(0.0f, 3.0f, 0.0f, 0.0f, -1, -2));
        return new ty0(wy0Var, f11, false);
    }

    @Override
    public void run(ArrayList arrayList, String str) {
        switch (this.f36a) {
            case 17:
                ArrayList arrayList2 = (ArrayList) this.f37b;
                ArrayList arrayList3 = (ArrayList) this.f38c;
                Runnable runnable = (Runnable) this.d;
                TLRPC.messages_AvailableEffects availableEffects = MessagesController.getInstance(((b61) this.f39e).R).getAvailableEffects();
                HashSet hashSet = new HashSet();
                if (availableEffects != null) {
                    for (int i9 = 0; i9 < arrayList.size(); i9++) {
                        try {
                            if (!((MediaDataController.KeywordResult) arrayList.get(i9)).emoji.startsWith("animated_")) {
                                String fixEmoji = Emoji.fixEmoji(((MediaDataController.KeywordResult) arrayList.get(i9)).emoji);
                                for (int i10 = 0; i10 < availableEffects.effects.size(); i10++) {
                                    TLRPC.TL_availableEffect tL_availableEffect = availableEffects.effects.get(i10);
                                    if (!hashSet.contains(Long.valueOf(tL_availableEffect.f22411id)) && (tL_availableEffect.emoticon.contains(fixEmoji) || fixEmoji.contains(tL_availableEffect.emoticon))) {
                                        (tL_availableEffect.effect_animation_id == 0 ? arrayList2 : arrayList3).add(r0.e(tL_availableEffect));
                                        hashSet.add(Long.valueOf(tL_availableEffect.f22411id));
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
                for (int i11 = 0; i11 < size; i11++) {
                    String str2 = ((MediaDataController.KeywordResult) arrayList.get(i11)).emoji;
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
