package a3;

import ah.d1;
import ah.i1;
import ah.l1;
import ai.ga;
import ai.k7;
import ai.l3;
import ai.r2;
import ai.u0;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import androidx.car.app.IOnDoneCallback;
import ci.b7;
import ci.g4;
import ci.h7;
import ci.ia;
import ci.m7;
import ci.n3;
import ci.n4;
import ci.o3;
import ci.p3;
import ci.p4;
import ci.q9;
import ci.r6;
import ci.s6;
import ci.w6;
import ci.z6;
import ci.z9;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import m4.s1;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.j2;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.r5;
import org.telegram.ui.Components.xc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import ug.m1;
import v7.q8;
import w7.z5;
import yh.a2;
public final class l0 implements Runnable {
    public final int f142a;
    public final Object f143b;
    public final Object f144c;
    public final Object d;

    public l0(Object obj, Object obj2, Object obj3, int i10) {
        this.f142a = i10;
        this.f143b = obj;
        this.f144c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        xc X;
        qc J;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        String str;
        ?? r82;
        ah.e eVar;
        TLRPC.TL_availableReaction tL_availableReaction;
        TLRPC.TL_availableReaction tL_availableReaction2;
        r5 r5Var;
        TL_stories.StoryItem storyItem;
        TLRPC.MessageMedia messageMedia;
        TLRPC.Document document;
        TLRPC.Document document2;
        TL_stories.StoryItem storyItem2;
        TLRPC.MessageMedia messageMedia2;
        TLRPC.Photo photo;
        MessageObject messageObject;
        int id2;
        boolean z18 = true;
        int i10 = 0;
        switch (this.f142a) {
            case 0:
                b2.w wVar = (b2.w) this.f144c;
                String str2 = e2.m0.f8253a;
                i2.h0 h0Var = ((i2.b0) ((m0) ((n4.s) this.f143b).f17125c)).f12322a;
                h0Var.S = wVar;
                j2.f fVar = h0Var.f12410s;
                j2.a p5 = fVar.p();
                fVar.q(p5, 1017, new j2.e(p5, wVar, (i2.f) this.d, 0));
                return;
            case 1:
                ai.x xVar = (ai.x) this.f143b;
                TLObject tLObject = (TLObject) this.f144c;
                Context context = (Context) this.d;
                if (tLObject instanceof TLRPC.TL_payments_starsRevenueAdsAccountUrl) {
                    pf.d.r(context, ((TLRPC.TL_payments_starsRevenueAdsAccountUrl) tLObject).url);
                }
                AndroidUtilities.runOnUIThread(new ai.d(xVar, 5), 1000L);
                return;
            case 2:
                ai.x.a0((ai.x) this.f143b, (TLObject) this.f144c, (TLRPC.TL_error) this.d);
                return;
            case 3:
                k7 k7Var = (k7) this.f143b;
                Long l4 = (Long) this.f144c;
                k7Var.s2(l4.longValue(), new l3(k7Var, l4, (m1[]) this.d, 0));
                return;
            case 4:
                k7 k7Var2 = (k7) this.f143b;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.d;
                k7Var2.getClass();
                ((pf.c) this.f144c).c(false);
                tL_starGiftUnique.flags &= -17;
                tL_starGiftUnique.resale_ton_only = false;
                tL_starGiftUnique.resell_amount = null;
                k7Var2.f1667f0.setResellPrice(ag.a.i(0L, ag.c.f635a));
                a2 a2Var = k7Var2.f1678k1;
                if (a2Var != null) {
                    a2Var.run();
                }
                i2.d.s(R.string.Gift2ResaleDisable, new Object[]{k7Var2.Q1()}, k7Var2.getBulletinFactory(), R.raw.contact_check, 36);
                return;
            case 5:
                k7 k7Var3 = (k7) this.f143b;
                k7Var3.getClass();
                ((pf.c) this.f144c).c(false);
                k7Var3.getBulletinFactory().f0((TLRPC.TL_error) this.d, false);
                return;
            case 6:
                k7.H0((k7) this.f143b, (TLObject) this.f144c, (MessageObject) this.d);
                return;
            case 7:
                ((Runnable) this.f143b).run();
                ((pf.c) this.f144c).c(false);
                k7.x2((TwoStepVerificationActivity) this.d);
                return;
            case 8:
                Runnable runnable = (Runnable) this.f143b;
                TLRPC.Document document3 = (TLRPC.Document) this.f144c;
                CharSequence charSequence = (CharSequence) this.d;
                n2 U = LaunchActivity.U();
                if (U != null) {
                    X = xc.a0(U);
                } else {
                    X = xc.X();
                }
                if (runnable == null) {
                    if (document3 != null) {
                        J = X.q(document3, charSequence);
                    } else {
                        J = X.Q(R.raw.contact_check, 36, charSequence);
                    }
                } else if (document3 != null) {
                    J = X.r(document3, charSequence, LocaleController.getString(R.string.Gift2UniqueView), runnable);
                } else {
                    J = X.J(R.raw.contact_check, charSequence, LocaleController.getString(R.string.Gift2UniqueView), runnable);
                }
                J.f29648t = true;
                J.j();
                return;
            case 9:
                k7.T((k7) this.f143b, (b2) this.f144c, (MessageObject) this.d);
                return;
            case 10:
                k7.l1((k7) this.f143b, (TL_stars.TL_starGiftUnique) this.f144c, (String) this.d);
                return;
            case 11:
                TLObject tLObject2 = (TLObject) this.f143b;
                u0 u0Var = (u0) this.f144c;
                String str3 = (String) this.d;
                if (tLObject2 instanceof TL_stars.TL_payments_uniqueStarGift) {
                    TL_stars.StarGift starGift = ((TL_stars.TL_payments_uniqueStarGift) tLObject2).gift;
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) starGift;
                        Long valueOf = Long.valueOf(tL_starGiftUnique2.gift_id);
                        String str4 = tL_starGiftUnique2.title;
                        if (str4 != null) {
                            str3 = str4;
                        }
                        u0Var.run(valueOf, str3);
                        return;
                    }
                }
                u0Var.run(0L, str3);
                return;
            case 12:
                TLObject tLObject3 = (TLObject) this.f143b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f144c;
                Utilities.Callback callback = (Utilities.Callback) this.d;
                if (!(tLObject3 instanceof TLRPC.TL_payments_paymentFormStarGift)) {
                    String str5 = "NO_PAYMENT_FORM";
                    if (tL_error != null) {
                        str5 = tL_error.text;
                    }
                    ga.e(str5);
                    callback.run(null);
                    return;
                }
                callback.run((TLRPC.TL_payments_paymentFormStarGift) tLObject3);
                return;
            case 13:
                ga gaVar = (ga) this.f143b;
                TLObject tLObject4 = (TLObject) this.f144c;
                Runnable runnable2 = (Runnable) this.d;
                ArrayList arrayList = gaVar.v;
                boolean[] zArr = gaVar.f1366r;
                ArrayList[] arrayListArr = gaVar.f1365q;
                int i11 = gaVar.f1352a;
                boolean z19 = !gaVar.e;
                gaVar.f1354c = System.currentTimeMillis();
                if (tLObject4 instanceof TL_stars.StarsStatus) {
                    TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject4;
                    MessagesController.getInstance(i11).putUsers(starsStatus.users, false);
                    MessagesController.getInstance(i11).putChats(starsStatus.chats, false);
                    if (arrayListArr[0].isEmpty()) {
                        ArrayList<TL_stars.StarsTransaction> arrayList2 = starsStatus.history;
                        int size = arrayList2.size();
                        int i12 = 0;
                        while (i12 < size) {
                            TL_stars.StarsTransaction starsTransaction = arrayList2.get(i12);
                            i12++;
                            TL_stars.StarsTransaction starsTransaction2 = starsTransaction;
                            boolean z20 = z18;
                            arrayListArr[i10].add(starsTransaction2);
                            int i13 = i10;
                            ArrayList[] arrayListArr2 = arrayListArr;
                            if (starsTransaction2.amount.amount > 0) {
                                r82 = z20;
                            } else {
                                r82 = 2;
                            }
                            arrayListArr2[r82].add(starsTransaction2);
                            z18 = z20;
                            i10 = i13;
                            arrayListArr = arrayListArr2;
                        }
                        z10 = z18;
                        z13 = i10;
                        ArrayList[] arrayListArr3 = arrayListArr;
                        for (int i14 = z13; i14 < 3; i14++) {
                            if (arrayListArr3[i14].isEmpty() && !zArr[i14]) {
                                z16 = z13;
                            } else {
                                z16 = z10;
                            }
                            zArr[i14] = z16;
                            boolean[] zArr2 = gaVar.f1369u;
                            if ((starsStatus.flags & 1) == 0) {
                                z17 = z10;
                            } else {
                                z17 = z13;
                            }
                            zArr2[i14] = z17;
                            if (z17) {
                                gaVar.f1368t[i14] = z13;
                            }
                            String[] strArr = gaVar.f1367s;
                            if (zArr2[i14]) {
                                str = null;
                            } else {
                                str = starsStatus.next_offset;
                            }
                            strArr[i14] = str;
                        }
                        z14 = z10;
                    } else {
                        z10 = true;
                        z13 = false;
                        z14 = false;
                    }
                    if (arrayList.isEmpty()) {
                        arrayList.addAll(starsStatus.subscriptions);
                        gaVar.f1371x = z13;
                        gaVar.f1370w = starsStatus.subscriptions_next_offset;
                        if ((starsStatus.flags & 4) == 0) {
                            z15 = z10;
                        } else {
                            z15 = false;
                        }
                        gaVar.f1372y = z15;
                        z11 = z10;
                    } else {
                        z11 = false;
                    }
                    long j10 = gaVar.f1355f.amount;
                    TL_stars.StarsAmount starsAmount = starsStatus.balance;
                    if (j10 != starsAmount.amount) {
                        z19 = z10;
                    }
                    gaVar.f1355f = starsAmount;
                    gaVar.f1356g = 0L;
                    z12 = z14;
                } else {
                    z10 = true;
                    z11 = false;
                    z12 = false;
                }
                gaVar.d = false;
                gaVar.e = z10;
                if (z19) {
                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
                }
                if (z12) {
                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starTransactionsLoaded, new Object[0]);
                }
                if (z11) {
                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starSubscriptionsLoaded, new Object[0]);
                }
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
            case 14:
                ga gaVar2 = (ga) this.f143b;
                Runnable runnable3 = (Runnable) this.d;
                gaVar2.getClass();
                Iterator it = ((HashSet) this.f144c).iterator();
                while (it.hasNext()) {
                    Integer num = (Integer) it.next();
                    num.intValue();
                    gaVar2.Q.remove(num);
                    gaVar2.R.remove(num);
                }
                runnable3.run();
                return;
            case 15:
                ((boolean[]) this.f143b)[0] = false;
                AndroidUtilities.hideKeyboard((EditTextBoldCursor) this.f144c);
                ((f3[]) this.d)[0].dismiss();
                return;
            case 16:
                androidx.lifecycle.o oVar = (androidx.lifecycle.o) this.f143b;
                androidx.car.app.utils.a aVar = (androidx.car.app.utils.a) this.f144c;
                String str6 = (String) this.d;
                if (oVar != null) {
                    try {
                        if (((androidx.lifecycle.v) oVar).f3375c.compareTo(androidx.lifecycle.n.f3356c) < 0) {
                            z18 = false;
                        }
                        if (z18) {
                            aVar.a();
                            return;
                        }
                    } catch (w.f e) {
                        Log.e("CarApp.Dispatch", "Serialization failure in ".concat(str6), e);
                        return;
                    }
                }
                Log.w("CarApp.Dispatch", "Lifecycle is not at least created when dispatching " + aVar);
                return;
            case 17:
                IOnDoneCallback iOnDoneCallback = (IOnDoneCallback) this.f143b;
                String str7 = (String) this.f144c;
                try {
                    androidx.car.app.utils.g.d(str7.concat(" onSuccess"), new r2(iOnDoneCallback, ((androidx.car.app.utils.a) this.d).a(), str7, 1));
                    return;
                } catch (RuntimeException e7) {
                    androidx.car.app.utils.g.f(iOnDoneCallback, str7, e7);
                    throw new RuntimeException(e7);
                } catch (w.f e10) {
                    androidx.car.app.utils.g.f(iOnDoneCallback, str7, e10);
                    return;
                }
            case 18:
                k6.h hVar = (k6.h) this.f143b;
                v7.t tVar = (v7.t) this.f144c;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.d;
                try {
                    androidx.emoji2.text.r a2 = v7.s.a(hVar.f14978a);
                    if (a2 != null) {
                        androidx.emoji2.text.q qVar = (androidx.emoji2.text.q) ((androidx.emoji2.text.k) a2.f3100b);
                        synchronized (qVar.d) {
                            qVar.f3125f = threadPoolExecutor;
                        }
                        ((androidx.emoji2.text.k) a2.f3100b).a(new androidx.emoji2.text.m(tVar, threadPoolExecutor));
                        return;
                    }
                    throw new RuntimeException("EmojiCompat font provider not available on this device.");
                } catch (Throwable th2) {
                    tVar.a(th2);
                    threadPoolExecutor.shutdown();
                    return;
                }
            case 19:
                p3 p3Var = (p3) this.f143b;
                i1 i1Var = (i1) this.f144c;
                View view = (View) this.d;
                p4 p4Var = p3Var.f5644a;
                p4Var.f5709u3 = true;
                n4 n4Var = p4Var.O1;
                ImageReceiver imageReceiver = p4Var.f5682l3;
                boolean[] zArr3 = {false};
                m7 m7Var = p4Var.E0;
                m7Var.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setListener(new ci.r2(1, m7Var)).setDuration(150L).start();
                int dp = AndroidUtilities.dp(8.0f);
                m7 m7Var2 = new m7(p4Var.getContext(), p4Var.f5718x1);
                p4Var.E0 = m7Var2;
                m7Var2.setPadding(dp, dp, dp, dp);
                p4Var.D0.addView(p4Var.E0, z5.e(40, 40, 3));
                r5 r5Var2 = p4Var.f5691o3;
                if (r5Var2 != null) {
                    r5Var2.o(p4Var);
                    eVar = null;
                    p4Var.f5691o3 = null;
                } else {
                    eVar = null;
                }
                ah.e eVar2 = p4Var.f5685m3;
                if (eVar2 != null) {
                    eVar2.d(p4Var);
                    p4Var.f5685m3 = eVar;
                }
                p4Var.f5694p3 = false;
                if (i1Var.f786g != 0) {
                    p4Var.f5694p3 = true;
                    r5 r5Var3 = new r5(2, p4Var.C2, i1Var.f786g);
                    p4Var.f5691o3 = r5Var3;
                    r5Var3.a(p4Var);
                } else if (i1Var.f785f != null && (tL_availableReaction = MediaDataController.getInstance(p4Var.C2).getReactionsMap().get(i1Var.f785f)) != null) {
                    p4Var.f5688n3.setImage(null, null, ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60", null, null, null, 0L, null, null, 0);
                    imageReceiver.setImage(ImageLocation.getForDocument(tL_availableReaction.around_animation), d1.a(), null, null, null, 0);
                    if (imageReceiver.getLottieAnimation() != null) {
                        imageReceiver.getLottieAnimation().N(0, false, true);
                    }
                }
                p4Var.E0.setReaction(i1Var);
                if (p4Var.D1) {
                    TL_stories.StoryItem storyItem3 = n4Var.f5591a;
                    if (storyItem3.sent_reaction == null) {
                        if (storyItem3.views == null) {
                            storyItem3.views = new TL_stories.TL_storyViews();
                        }
                        TL_stories.StoryItem storyItem4 = n4Var.f5591a;
                        TL_stories.StoryViews storyViews = storyItem4.views;
                        storyViews.reactions_count++;
                        l1.b(null, storyItem4.sent_reaction, storyViews);
                        p4Var.k1(true);
                    }
                }
                if (i1Var.f786g != 0 && (r5Var = p4Var.E0.f5555f) != null) {
                    ah.e a10 = ah.e.a(r5Var, false, true);
                    p4Var.f5685m3 = a10;
                    a10.f(p4Var);
                }
                p4Var.S1.g0(p4Var.B1, n4Var.f5591a, i1Var);
                int[] iArr = new int[2];
                view.getLocationInWindow(iArr);
                int[] iArr2 = new int[2];
                p4Var.getLocationInWindow(iArr2);
                p4Var.f5716w3 = iArr[0] - iArr2[0];
                p4Var.f5720x3 = iArr[1] - iArr2[1];
                p4Var.y3 = view.getMeasuredHeight();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                p4Var.f5712v3 = 0.0f;
                p4Var.invalidate();
                m7 m7Var3 = p4Var.E0;
                m7Var3.setAllowDrawReaction(false);
                ImageReceiver imageReceiver2 = m7Var3.e;
                if (i1Var.f786g == 0 && (tL_availableReaction2 = MediaDataController.getInstance(UserConfig.selectedAccount).getReactionsMap().get(i1Var.f785f)) != null) {
                    imageReceiver2.setImage(ImageLocation.getForDocument(tL_availableReaction2.center_icon), "40_40_nolimit", null, "tgs", tL_availableReaction2, 1);
                    imageReceiver2.setAutoRepeat(0);
                }
                ofFloat.addUpdateListener(new n3(p3Var, ofFloat, zArr3, 0));
                ofFloat.addListener(new o3(p3Var, zArr3, m7Var3, 0));
                ofFloat.setDuration(220L);
                ofFloat.start();
                p4Var.b1(false);
                return;
            case 20:
                g4 g4Var = (g4) this.f143b;
                d6 d6Var = (d6) this.f144c;
                p4 p4Var2 = g4Var.f5357l;
                f5.R(p4Var2.getContext(), null, d6Var, new r2(g4Var, (TL_stories.StoryItem) this.d, d6Var, 3));
                g4 g4Var2 = p4Var2.f5704t1;
                if (g4Var2 != null) {
                    g4Var2.a();
                    return;
                }
                return;
            case 21:
                s6 s6Var = (s6) this.f143b;
                TL_stories.StoryItem storyItem5 = (TL_stories.StoryItem) this.f144c;
                Utilities.Callback callback2 = (Utilities.Callback) this.d;
                while (i10 < s6Var.f6184i.size()) {
                    MessageObject messageObject2 = (MessageObject) s6Var.f6184i.get(i10);
                    if (messageObject2 != null && (storyItem = messageObject2.storyItem) != null && (messageMedia = storyItem.media) != null && (document = storyItem5.media.document) != null && (document2 = messageMedia.document) != null && document2.f20278id == document.f20278id) {
                        callback2.run(document2);
                        return;
                    }
                    i10++;
                }
                callback2.run(null);
                return;
            case 22:
                h7 h7Var = (h7) this.f143b;
                TLObject tLObject5 = (TLObject) this.f144c;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.d;
                int i15 = h7Var.f5397a;
                h7Var.R = true;
                if (tLObject5 instanceof TLRPC.TL_boolTrue) {
                    h7Var.S = null;
                    NotificationCenter.getInstance(i15).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesLimitUpdate, new Object[0]);
                    return;
                } else if (tLObject5 instanceof TL_stories.canSendStoryCount) {
                    h7Var.S = new b7(1, ((TL_stories.canSendStoryCount) tLObject5).count_remains, -1L);
                    NotificationCenter.getInstance(i15).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesLimitUpdate, new Object[0]);
                    return;
                } else {
                    h7Var.n(tL_error2);
                    return;
                }
            case 23:
                r6 r6Var = (r6) this.f144c;
                j2 j2Var = (j2) this.d;
                ArrayList arrayList3 = ((s6) this.f143b).f6184i;
                while (i10 < arrayList3.size()) {
                    MessageObject messageObject3 = (MessageObject) arrayList3.get(i10);
                    if (messageObject3 != null && (storyItem2 = messageObject3.storyItem) != null && (messageMedia2 = storyItem2.media) != null) {
                        TLRPC.MessageMedia messageMedia3 = r6Var.media;
                        TLRPC.Document document4 = messageMedia3.document;
                        if (document4 != null) {
                            TLRPC.Document document5 = messageMedia2.document;
                            if (document5 == null) {
                                continue;
                            } else if (document5.f20278id == document4.f20278id) {
                                j2Var.run((r6) storyItem2);
                                return;
                            }
                        }
                        TLRPC.Photo photo2 = messageMedia3.photo;
                        if (photo2 != null && (photo = messageMedia2.photo) != null && photo.f20296id == photo2.f20296id) {
                            j2Var.run((r6) storyItem2);
                            return;
                        }
                    }
                    i10++;
                }
                j2Var.run(null);
                return;
            case 24:
                s6 s6Var2 = (s6) this.f143b;
                TLObject tLObject6 = (TLObject) this.f144c;
                Runnable runnable4 = (Runnable) this.d;
                w6 w6Var = s6Var2.f6192q;
                ArrayList arrayList4 = s6Var2.G;
                ArrayList arrayList5 = s6Var2.f6184i;
                ArrayList arrayList6 = s6Var2.H;
                s6Var2.F = 0;
                s6Var2.C = false;
                s6Var2.D = true;
                s6Var2.f6193r = true;
                ArrayList arrayList7 = new ArrayList();
                if (tLObject6 instanceof Vector) {
                    ArrayList arrayList8 = ((Vector) tLObject6).objects;
                    int size2 = arrayList8.size();
                    int i16 = 0;
                    while (i16 < size2) {
                        Object obj = arrayList8.get(i16);
                        i16++;
                        arrayList7.add((TL_bots.botPreviewMedia) obj);
                    }
                } else if (tLObject6 instanceof TL_bots.previewInfo) {
                    TL_bots.previewInfo previewinfo = (TL_bots.previewInfo) tLObject6;
                    arrayList4.clear();
                    arrayList4.addAll(previewinfo.lang_codes);
                    arrayList7.addAll(previewinfo.media);
                } else {
                    return;
                }
                ArrayList arrayList9 = new ArrayList(arrayList5);
                arrayList5.clear();
                arrayList6.clear();
                int size3 = arrayList7.size();
                int i17 = 0;
                while (i17 < size3) {
                    Object obj2 = arrayList7.get(i17);
                    i17++;
                    TL_bots.botPreviewMedia botpreviewmedia = (TL_bots.botPreviewMedia) obj2;
                    ArrayList arrayList10 = arrayList7;
                    MessageObject messageObject4 = new MessageObject(s6Var2.f6181c, new r6(s6Var2, s6Var2.d, botpreviewmedia));
                    int i18 = 0;
                    while (true) {
                        if (i18 < arrayList9.size()) {
                            if (MessagesController.equals(((MessageObject) arrayList9.get(i18)).storyItem.media, botpreviewmedia.media)) {
                                messageObject = (MessageObject) arrayList9.get(i18);
                            } else {
                                i18++;
                            }
                        } else {
                            messageObject = null;
                        }
                    }
                    TL_stories.StoryItem storyItem6 = messageObject4.storyItem;
                    TLRPC.Message message = messageObject4.messageOwner;
                    if (messageObject == null) {
                        id2 = s6Var2.I;
                        s6Var2.I = id2 + 1;
                    } else {
                        id2 = messageObject.getId();
                    }
                    message.f20293id = id2;
                    storyItem6.f20506id = id2;
                    messageObject4.parentStoriesList = s6Var2;
                    messageObject4.generateThumbs(false);
                    if (arrayList6.isEmpty()) {
                        arrayList6.add(new ArrayList());
                    }
                    ((ArrayList) arrayList6.get(0)).add(Integer.valueOf(messageObject4.getId()));
                    arrayList5.add(messageObject4);
                    arrayList7 = arrayList10;
                }
                AndroidUtilities.cancelRunOnUIThread(w6Var);
                AndroidUtilities.runOnUIThread(w6Var);
                if (runnable4 != null) {
                    AndroidUtilities.runOnUIThread(runnable4);
                    return;
                }
                return;
            case 25:
                z9 z9Var = ((q9) this.f143b).d;
                z9Var.f6238n0.D(z9Var.h, ((z6) this.f144c).d, (ArrayList) this.d);
                return;
            case 26:
                ia iaVar = (ia) this.f143b;
                TLObject tLObject7 = (TLObject) this.f144c;
                TL_stories.TL_stories_getStoriesViews tL_stories_getStoriesViews = (TL_stories.TL_stories_getStoriesViews) this.d;
                androidx.fragment.app.d dVar = iaVar.f5461f;
                int i19 = iaVar.f5459b;
                ia.f5457g = System.currentTimeMillis();
                if (tLObject7 != null) {
                    TL_stories.TL_stories_storyViews tL_stories_storyViews = (TL_stories.TL_stories_storyViews) tLObject7;
                    MessagesController.getInstance(i19).putUsers(tL_stories_storyViews.users, false);
                    if (!iaVar.d(tL_stories_getStoriesViews.f20514id, tL_stories_storyViews)) {
                        iaVar.d = 0;
                        iaVar.e = false;
                        return;
                    }
                    NotificationCenter.getInstance(i19).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                }
                iaVar.d = 0;
                if (iaVar.e) {
                    AndroidUtilities.cancelRunOnUIThread(dVar);
                    AndroidUtilities.runOnUIThread(dVar, 10000L);
                    return;
                }
                return;
            case 27:
                com.google.firebase.messaging.g gVar = (com.google.firebase.messaging.g) this.f143b;
                Intent intent = (Intent) this.f144c;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.d;
                gVar.getClass();
                try {
                    gVar.handleIntent(intent);
                    return;
                } finally {
                    taskCompletionSource.setResult(null);
                }
            case 28:
                j9.y yVar = (j9.y) this.f143b;
                j9.e0 e0Var = (j9.e0) this.f144c;
                try {
                    try {
                        e0Var.o(((j9.q) this.d).apply(q8.a(yVar)));
                        return;
                    } catch (Throwable th3) {
                        e0Var.n(th3);
                        return;
                    }
                } catch (Error e11) {
                    e = e11;
                    e0Var.n(e);
                    return;
                } catch (CancellationException unused) {
                    e0Var.cancel(false);
                    return;
                } catch (RuntimeException e12) {
                    e = e12;
                    e0Var.n(e);
                    return;
                } catch (ExecutionException e13) {
                    e = e13;
                    Throwable cause = e.getCause();
                    if (cause != null) {
                        e = cause;
                    }
                    e0Var.n(e);
                    return;
                }
            default:
                j9.e0 e0Var2 = (j9.e0) this.f143b;
                hi.t tVar2 = (hi.t) this.f144c;
                s1 s1Var = (s1) this.d;
                try {
                    if (!(e0Var2.f14351a instanceof j9.a)) {
                        tVar2.run();
                        e0Var2.m(s1Var);
                        return;
                    }
                    return;
                } catch (Throwable th4) {
                    e0Var2.n(th4);
                    return;
                }
        }
    }

    public l0(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f142a = i10;
        this.f143b = obj2;
        this.f144c = obj3;
        this.d = obj4;
    }
}
