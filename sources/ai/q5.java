package ai;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import androidx.car.app.FailureResponse;
import androidx.car.app.IOnDoneCallback;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.cd0;
import org.telegram.ui.Components.cl;
import org.telegram.ui.Components.dl0;
import org.telegram.ui.Components.ed0;
import org.telegram.ui.Components.ez;
import org.telegram.ui.Components.hl;
import org.telegram.ui.Components.kd0;
import org.telegram.ui.Components.ly;
import org.telegram.ui.Components.vn;
import org.telegram.ui.Components.wi;
import org.telegram.ui.ky;
import org.telegram.ui.lo;
import org.telegram.ui.no0;
import org.telegram.ui.qy;
import org.telegram.ui.wf1;
import org.telegram.ui.wn;
public final class q5 implements MessagesStorage.StringCallback, ec, androidx.car.app.utils.b, MediaDataController.KeywordResultCallback, org.telegram.ui.ActionBar.z1, SuccessContinuation, no0, cl, m4.j0, i9.p, cd0, org.telegram.ui.ActionBar.q0, ky, org.telegram.ui.Components.d5 {
    public final int f1421a;
    public final Object f1422b;
    public final Object f1423c;
    public final Object d;

    public q5(Object obj, Object obj2, Object obj3, int i10) {
        this.f1421a = i10;
        this.f1422b = obj;
        this.f1423c = obj2;
        this.d = obj3;
    }

    @Override
    public boolean A() {
        return false;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        switch (this.f1421a) {
            case 25:
                hl hlVar = (hl) this.f1422b;
                hlVar.f24798x0.b((TLRPC.TL_messageMediaGeo) this.f1423c, hlVar.f24800y0, z10, i10, ((Long) this.d).longValue());
                hlVar.f27083b.dismiss(true);
                return;
            default:
                vn vnVar = (vn) this.f1422b;
                vnVar.f29193j0.e((TLRPC.TL_messageMediaToDo) this.f1423c, null, null, null, z10, i10, ((Long) this.d).longValue());
                vnVar.f27083b.dismiss(true);
                return;
        }
    }

    @Override
    public boolean K(qy qyVar) {
        return false;
    }

    @Override
    public void a(int i10) {
        switch (this.f1421a) {
            case 8:
                ei.f3 f3Var = (ei.f3) this.f1422b;
                kd0 kd0Var = (kd0) this.f1423c;
                String str = (String) this.d;
                if (i10 != 3) {
                    kd0Var.dismiss();
                }
                f3Var.d.f8438x.G(str, org.telegram.ui.Cells.c1.w(i10).toLowerCase(Locale.ROOT), false);
                return;
            default:
                kd0 kd0Var2 = (kd0) this.f1422b;
                ei.q4 q4Var = (ei.q4) this.f1423c;
                String str2 = (String) this.d;
                if (i10 != 3) {
                    kd0Var2.dismiss();
                }
                q4Var.getWebViewContainer().G(str2, org.telegram.ui.Cells.c1.w(i10).toLowerCase(Locale.ROOT), false);
                return;
        }
    }

    @Override
    public i9.w apply(Object obj) {
        int i10 = this.f1421a;
        Object obj2 = this.d;
        Object obj3 = this.f1423c;
        Object obj4 = this.f1422b;
        switch (i10) {
            case 14:
                m4.a0 a0Var = (m4.a0) obj4;
                Handler handler = a0Var.f14684l;
                ki.n nVar = new ki.n(a0Var, (m4.r) obj3, new gg.t(a0Var, (m4.o0) obj2, (m4.s) obj, 26));
                m4.k1 k1Var = new m4.k1(0);
                String str = e2.d0.f7870a;
                ?? obj5 = new Object();
                e2.d0.U(handler, new a3.k0(obj5, nVar, k1Var, 23));
                return obj5;
            default:
                m4.a0 a0Var2 = (m4.a0) obj4;
                m4.r rVar = (m4.r) obj3;
                List list = (List) obj;
                Handler handler2 = a0Var2.f14684l;
                ki.n nVar2 = new ki.n(a0Var2, rVar, new h5(a0Var2, (m4.y0) obj2, rVar, list, 24));
                m4.k1 k1Var2 = new m4.k1(0);
                String str2 = e2.d0.f7870a;
                ?? obj6 = new Object();
                e2.d0.U(handler2, new a3.k0(obj6, nVar2, k1Var2, 23));
                return obj6;
        }
    }

    @Override
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j3) {
        switch (this.f1421a) {
            case 10:
                ii.r rVar = (ii.r) this.f1422b;
                ii.a aVar = (ii.a) this.f1423c;
                wi wiVar = (wi) this.d;
                ii.x3 x3Var = rVar.f11572r;
                if (messageMedia != null && messageMedia.geo != null) {
                    ii.i2 i2Var = x3Var.J3;
                    if (i2Var != null) {
                        i2Var.d();
                    }
                    TL_iv.pageBlockMap pageblockmap = (TL_iv.pageBlockMap) aVar.f11191b;
                    pageblockmap.geo = messageMedia.geo;
                    pageblockmap.zoom = 15;
                    if (pageblockmap.f18542w <= 0 || pageblockmap.h <= 0) {
                        pageblockmap.f18542w = 600;
                        pageblockmap.h = 400;
                    }
                    ii.i2 i2Var2 = x3Var.J3;
                    if (i2Var2 != null) {
                        i2Var2.h();
                    }
                    rVar.V(true);
                    wiVar.dismiss(true);
                    x3Var.post(new ii.f(rVar, aVar, 0));
                    return;
                }
                return;
            default:
                ii.e2 e2Var = (ii.e2) this.f1422b;
                ii.a aVar2 = (ii.a) this.f1423c;
                wi wiVar2 = (wi) this.d;
                if (messageMedia != null && messageMedia.geo != null) {
                    ii.i2 i2Var3 = e2Var.P.J3;
                    if (i2Var3 != null) {
                        i2Var3.d();
                    }
                    TL_iv.pageBlockMap pageblockmap2 = (TL_iv.pageBlockMap) aVar2.f11191b;
                    pageblockmap2.geo = messageMedia.geo;
                    pageblockmap2.zoom = 15;
                    if (pageblockmap2.f18542w <= 0 || pageblockmap2.h <= 0) {
                        pageblockmap2.f18542w = 600;
                        pageblockmap2.h = 400;
                    }
                    ii.i2 i2Var4 = e2Var.P.J3;
                    if (i2Var4 != null) {
                        i2Var4.h();
                    }
                    wiVar2.dismiss(true);
                    e2Var.P.post(new ii.n1(e2Var, aVar2, 9));
                    return;
                }
                return;
        }
    }

    @Override
    public void call() {
        w.b bVar;
        switch (this.f1421a) {
            case 2:
                IOnDoneCallback iOnDoneCallback = (IOnDoneCallback) this.f1422b;
                String str = (String) this.d;
                Object obj = this.f1423c;
                if (obj == null) {
                    bVar = null;
                } else {
                    try {
                        bVar = new w.b(obj);
                    } catch (w.f e) {
                        androidx.car.app.utils.g.f(iOnDoneCallback, str, e);
                        return;
                    }
                }
                iOnDoneCallback.onSuccess(bVar);
                return;
            default:
                IOnDoneCallback iOnDoneCallback2 = (IOnDoneCallback) this.f1422b;
                Exception exc = (Exception) this.f1423c;
                String str2 = (String) this.d;
                try {
                    iOnDoneCallback2.onFailure(new w.b(new FailureResponse(exc)));
                    return;
                } catch (w.f e7) {
                    Log.e("CarApp.Dispatch", "Serialization failure in ".concat(str2), e7);
                    return;
                }
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f1421a) {
            case 5:
                ((ci.fa) this.f1422b).g1((ci.da) this.f1423c, (Runnable) this.d, true);
                return;
            case 7:
                Activity activity = (Activity) this.f1422b;
                boolean[] zArr = (boolean[]) this.f1423c;
                org.telegram.ui.web.q qVar = (org.telegram.ui.web.q) this.d;
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    activity.startActivity(intent);
                } catch (Exception e) {
                    FileLog.e(e);
                }
                zArr[0] = true;
                Boolean bool = Boolean.FALSE;
                qVar.run(bool, bool);
                return;
            case 9:
                gg.k1 k1Var = (gg.k1) this.f1422b;
                TLRPC.User user = (TLRPC.User) this.d;
                k1Var.getClass();
                ((boolean[]) this.f1423c)[0] = true;
                if (user != null) {
                    SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(k1Var.f9802f).edit();
                    edit.putBoolean("inlinegeo_" + user.f18468id, true).commit();
                    k1Var.G();
                    return;
                }
                return;
            case 12:
                ii.f4 f4Var = (ii.f4) this.d;
                String trim = ((EditTextBoldCursor) this.f1422b).getText().toString().trim();
                String trim2 = ((EditTextBoldCursor) this.f1423c).getText().toString().trim();
                if (!TextUtils.isEmpty(trim) && !TextUtils.isEmpty(trim2)) {
                    int i11 = f4Var.f11364a;
                    ii.u3 u3Var = f4Var.f11365b;
                    switch (i11) {
                        case 1:
                            TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = new TL_keyboard.TL_inlineButtonTypeUrl();
                            tL_inlineButtonTypeUrl.url = trim2;
                            u3Var.a(trim, tL_inlineButtonTypeUrl);
                            return;
                        default:
                            TL_keyboard.TL_inlineButtonTypeCopy tL_inlineButtonTypeCopy = new TL_keyboard.TL_inlineButtonTypeCopy();
                            tL_inlineButtonTypeCopy.copy_text = trim2;
                            u3Var.a(trim, tL_inlineButtonTypeCopy);
                            return;
                    }
                }
                return;
            case 16:
                ((boolean[]) this.f1422b)[0] = true;
                ((Utilities.Callback) this.f1423c).run(Boolean.FALSE);
                ((org.telegram.ui.ActionBar.a2[]) this.d)[0].dismiss();
                return;
            case 20:
                ChatActivityEnterView.i((ChatActivityEnterView) this.f1422b, (MessageObject) this.f1423c, (TL_keyboard.KeyboardButtonProto) this.d);
                return;
            case 23:
                wi wiVar = (wi) this.f1422b;
                TLRPC.TL_attachMenuBot tL_attachMenuBot = (TLRPC.TL_attachMenuBot) this.f1423c;
                TLRPC.User user2 = (TLRPC.User) this.d;
                int i12 = wiVar.J1;
                if (tL_attachMenuBot != null) {
                    TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
                    tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(i12).getInputUser(user2);
                    tL_messages_toggleBotInAttachMenu.enabled = false;
                    ConnectionsManager.getInstance(i12).sendRequest(tL_messages_toggleBotInAttachMenu, new lo(6, wiVar, tL_attachMenuBot), 66);
                    return;
                }
                MediaDataController.getInstance(i12).removeInline(user2.f18468id);
                return;
            default:
                vn vnVar = (vn) this.f1422b;
                View view = (View) this.f1423c;
                vnVar.getClass();
                view.setTag(null);
                vnVar.X(view, (org.telegram.ui.Cells.d6) this.d, false);
                return;
        }
    }

    @Override
    public void g(m4.r rVar) {
        Bundle bundle = (Bundle) this.f1423c;
        ResultReceiver resultReceiver = (ResultReceiver) this.d;
        m4.a0 a0Var = ((m4.k0) this.f1422b).f14837g;
        if (bundle == null) {
            Bundle bundle2 = Bundle.EMPTY;
        }
        i9.u n10 = a0Var.n(rVar);
        if (resultReceiver != null) {
            n10.a(new ki.n(6, n10, resultReceiver), i9.q.f11039a);
        }
    }

    @Override
    public void i(Canvas canvas, RectF rectF, float f7) {
        org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) this.f1422b;
        dl0 dl0Var = (dl0) this.f1423c;
        int[] iArr = (int[]) this.d;
        t7Var.c(canvas, rectF, f7);
        t7Var.f(canvas, rectF, f7);
        if (t7Var.h) {
            t7Var.b(canvas, rectF, f7);
        } else {
            t7Var.e(canvas, rectF, f7);
        }
        if (dl0Var != null && dl0Var.f23632a0 && dl0Var.getVisibility() == 0) {
            canvas.saveLayerAlpha(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), (int) (f7 * 255.0f), 31);
            canvas.translate(iArr[0], iArr[1]);
            dl0Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public void m(int i10) {
        Runnable runnable;
        org.telegram.ui.Components.d5 d5Var = (org.telegram.ui.Components.d5) this.f1422b;
        boolean[] zArr = (boolean[]) this.f1423c;
        org.telegram.ui.ActionBar.z2 z2Var = (org.telegram.ui.ActionBar.z2) this.d;
        if (i10 == 1) {
            d5Var.J(2147483646, 0, zArr[0]);
            runnable = z2Var.f19935a.dismissRunnable;
            runnable.run();
        }
    }

    @Override
    public void q(ed0 ed0Var, int i10) {
        switch (this.f1421a) {
            case 17:
                org.telegram.ui.Components.e5.g(null, null, 0L, 0L, 0, (ed0) this.f1422b, (org.telegram.ui.Components.g4) this.f1423c, (org.telegram.ui.Components.h4) this.d);
                return;
            default:
                org.telegram.ui.Components.e5.g(null, null, 0L, 0L, 0, (ed0) this.f1422b, (org.telegram.ui.Components.x3) this.f1423c, (org.telegram.ui.Components.z3) this.d);
                return;
        }
    }

    @Override
    public void run(String str) {
        v5 v5Var = (v5) this.f1422b;
        e6 e6Var = v5Var.f1612l;
        e6Var.getStoriesController().r(e6Var.B1, str, new c5(v5Var, (TL_stories.StoryItem) this.f1423c, (org.telegram.ui.ActionBar.d6) this.d, 2));
    }

    @Override
    public Task then(Object obj) {
        String d;
        FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f1422b;
        String str = (String) this.f1423c;
        com.google.firebase.messaging.u uVar = (com.google.firebase.messaging.u) this.d;
        String str2 = (String) obj;
        a4.m c10 = FirebaseMessaging.c(firebaseMessaging.f7253b);
        k9.h hVar = firebaseMessaging.f7252a;
        hVar.a();
        if ("[DEFAULT]".equals(hVar.f13535b)) {
            d = "";
        } else {
            d = hVar.d();
        }
        String a2 = firebaseMessaging.f7257i.a();
        synchronized (c10) {
            String a10 = com.google.firebase.messaging.u.a(System.currentTimeMillis(), str2, a2);
            if (a10 != null) {
                SharedPreferences.Editor edit = ((SharedPreferences) c10.f275b).edit();
                edit.putString(d + "|T|" + str + "|*", a10);
                edit.commit();
            }
        }
        if (uVar == null || !str2.equals(uVar.f7330a)) {
            k9.h hVar2 = firebaseMessaging.f7252a;
            hVar2.a();
            if ("[DEFAULT]".equals(hVar2.f13535b)) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    StringBuilder sb2 = new StringBuilder("Invoking onNewToken for app: ");
                    hVar2.a();
                    sb2.append(hVar2.f13535b);
                    Log.d("FirebaseMessaging", sb2.toString());
                }
                Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
                intent.putExtra("token", str2);
                new com.google.firebase.messaging.j(firebaseMessaging.f7253b).b(intent);
            }
        }
        return Tasks.forResult(str2);
    }

    @Override
    public boolean u(qy qyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, wf1 wf1Var) {
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f1422b;
        TL_keyboard.TL_inlineButtonTypeSwitchInline tL_inlineButtonTypeSwitchInline = (TL_keyboard.TL_inlineButtonTypeSwitchInline) this.d;
        wn wnVar = chatActivityEnterView.P2;
        TLRPC.Message message = ((MessageObject) this.f1423c).messageOwner;
        long j3 = message.from_id.user_id;
        long j10 = message.via_bot_id;
        if (j10 != 0) {
            j3 = j10;
        }
        TLRPC.User user = chatActivityEnterView.R.getMessagesController().getUser(Long.valueOf(j3));
        if (user == null) {
            qyVar.finishFragment();
            return true;
        }
        long j11 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
        MediaDataController mediaDataController = MediaDataController.getInstance(chatActivityEnterView.Q);
        mediaDataController.saveDraft(j11, 0, "@" + UserObject.getPublicUsername(user) + " " + tL_inlineButtonTypeSwitchInline.query, null, null, true, 0L);
        if (j11 != chatActivityEnterView.Q2) {
            if (!DialogObject.isEncryptedDialog(j11)) {
                Bundle bundle = new Bundle();
                if (DialogObject.isUserDialog(j11)) {
                    bundle.putLong("user_id", j11);
                } else {
                    bundle.putLong("chat_id", -j11);
                }
                if (chatActivityEnterView.R.getMessagesController().checkCanOpenChat(bundle, qyVar)) {
                    if (wnVar.presentFragment(new wn(bundle), true)) {
                        if (!AndroidUtilities.isTablet()) {
                            wnVar.removeSelfFromStack();
                        }
                    } else {
                        qyVar.finishFragment();
                        return true;
                    }
                }
                return true;
            }
            qyVar.finishFragment();
            return true;
        }
        qyVar.finishFragment();
        return true;
    }

    public q5(m4.k0 k0Var, m4.g1 g1Var, Bundle bundle, ResultReceiver resultReceiver) {
        this.f1421a = 13;
        this.f1422b = k0Var;
        this.f1423c = bundle;
        this.d = resultReceiver;
    }

    @Override
    public void run(ArrayList arrayList, String str) {
        ArrayList<TLRPC.Document> arrayList2;
        ArrayList<TLRPC.Document> arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5 = arrayList;
        switch (this.f1421a) {
            case 4:
                ci.d2 d2Var = (ci.d2) this.f1422b;
                MediaDataController mediaDataController = (MediaDataController) this.d;
                ArrayList arrayList6 = d2Var.h;
                SparseIntArray sparseIntArray = d2Var.f4509y;
                ArrayList arrayList7 = d2Var.f4504n;
                ci.e2 e2Var = d2Var.N;
                ArrayList arrayList8 = d2Var.v;
                HashSet hashSet = d2Var.L;
                ArrayList arrayList9 = d2Var.f4506s;
                if (TextUtils.equals((String) this.f1423c, d2Var.H)) {
                    ArrayList<Emoji.EmojiSpanRange> parseEmojis = Emoji.parseEmojis(d2Var.H);
                    for (int i10 = 0; i10 < parseEmojis.size(); i10++) {
                        try {
                            MediaDataController.KeywordResult keywordResult = new MediaDataController.KeywordResult();
                            keywordResult.emoji = parseEmojis.get(i10).code.toString();
                            arrayList5.add(keywordResult);
                        } catch (Exception unused) {
                        }
                    }
                    d2Var.f4508x = 0;
                    arrayList9.clear();
                    arrayList8.clear();
                    sparseIntArray.clear();
                    arrayList7.clear();
                    d2Var.f4508x++;
                    arrayList9.add(null);
                    arrayList8.add(0L);
                    if (e2Var.f4338a == 0) {
                        hashSet.clear();
                        for (int i11 = 0; i11 < arrayList5.size(); i11++) {
                            MediaDataController.KeywordResult keywordResult2 = (MediaDataController.KeywordResult) arrayList5.get(i11);
                            String str2 = keywordResult2.emoji;
                            if (str2 != null && !str2.startsWith("animated_") && (arrayList4 = (ArrayList) d2Var.d.get(keywordResult2.emoji)) != null) {
                                hashSet.addAll(arrayList4);
                            }
                        }
                        arrayList8.addAll(hashSet);
                        for (int i12 = 0; i12 < hashSet.size(); i12++) {
                            arrayList9.add(null);
                        }
                        d2Var.f4508x = hashSet.size() + d2Var.f4508x;
                    } else {
                        HashMap<String, ArrayList<TLRPC.Document>> allStickers = mediaDataController.getAllStickers();
                        for (int i13 = 0; i13 < arrayList5.size(); i13++) {
                            MediaDataController.KeywordResult keywordResult3 = (MediaDataController.KeywordResult) arrayList5.get(i13);
                            String str3 = keywordResult3.emoji;
                            if (str3 != null && !str3.startsWith("animated_") && (arrayList3 = allStickers.get(keywordResult3.emoji)) != null && !arrayList3.isEmpty()) {
                                for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                                    TLRPC.Document document = arrayList3.get(i14);
                                    if (document != null && !arrayList9.contains(document)) {
                                        arrayList9.add(document);
                                        d2Var.f4508x++;
                                    }
                                }
                            }
                        }
                        ArrayList<TLRPC.StickerSetCovered> featuredStickerSets = mediaDataController.getFeaturedStickerSets();
                        int i15 = 0;
                        while (i15 < arrayList5.size()) {
                            MediaDataController.KeywordResult keywordResult4 = (MediaDataController.KeywordResult) arrayList5.get(i15);
                            String str4 = keywordResult4.emoji;
                            if (str4 != null && !str4.startsWith("animated_")) {
                                for (int i16 = 0; i16 < featuredStickerSets.size(); i16++) {
                                    TLRPC.StickerSetCovered stickerSetCovered = featuredStickerSets.get(i16);
                                    if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                                        arrayList2 = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                                    } else if (!stickerSetCovered.covers.isEmpty()) {
                                        arrayList2 = stickerSetCovered.covers;
                                    } else if (stickerSetCovered.cover != null) {
                                        ArrayList<TLRPC.Document> arrayList10 = new ArrayList<>();
                                        arrayList10.add(stickerSetCovered.cover);
                                        arrayList2 = arrayList10;
                                    }
                                    for (int i17 = 0; i17 < arrayList2.size(); i17++) {
                                        String findAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(arrayList2.get(i17), null);
                                        if (findAnimatedEmojiEmoticon != null && findAnimatedEmojiEmoticon.contains(keywordResult4.emoji)) {
                                            arrayList9.add(arrayList2.get(i17));
                                            d2Var.f4508x++;
                                        }
                                    }
                                }
                            }
                            i15++;
                            arrayList5 = arrayList;
                        }
                    }
                    String translitSafe = AndroidUtilities.translitSafe((d2Var.H + "").toLowerCase());
                    for (int i18 = 0; i18 < arrayList6.size(); i18++) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList6.get(i18);
                        if (tL_messages_stickerSet != null && tL_messages_stickerSet.set != null) {
                            String translitSafe2 = AndroidUtilities.translitSafe((tL_messages_stickerSet.set.title + "").toLowerCase());
                            if (translitSafe2.startsWith(translitSafe) || org.telegram.messenger.f0.w(" ", translitSafe, translitSafe2)) {
                                int size = arrayList7.size();
                                arrayList7.add(tL_messages_stickerSet);
                                sparseIntArray.put(d2Var.f4508x, size);
                                arrayList9.add(null);
                                d2Var.f4508x++;
                                arrayList9.addAll(tL_messages_stickerSet.documents);
                                d2Var.f4508x = tL_messages_stickerSet.documents.size() + d2Var.f4508x;
                            }
                        }
                    }
                    boolean z10 = arrayList8.size() <= 1 && arrayList9.size() <= 1;
                    d2Var.f4507w = z10;
                    if (z10) {
                        d2Var.f4508x++;
                    }
                    if (!z10) {
                        d2Var.K++;
                    }
                    d2Var.I = d2Var.H;
                    d2Var.l();
                    ci.p1.w1(e2Var.f4594b, 0, 0);
                    e2Var.f4596f.c(false);
                    e2Var.e.n(false);
                    return;
                }
                return;
            case 28:
                Runnable runnable = (Runnable) this.d;
                ly lyVar = ((org.telegram.ui.Components.ky) this.f1422b).f25897a;
                if (((String) this.f1423c).equals(lyVar.v)) {
                    lyVar.f26217w = str;
                    lyVar.f26214n.addAll(arrayList5);
                    runnable.run();
                    return;
                }
                return;
            default:
                ez ezVar = (ez) this.f1422b;
                HashMap hashMap = (HashMap) this.f1423c;
                Runnable runnable2 = (Runnable) this.d;
                HashMap hashMap2 = ezVar.f24011f;
                if (ezVar.f24015w.M != ezVar.f24009b) {
                    return;
                }
                int size2 = arrayList5.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    String str5 = ((MediaDataController.KeywordResult) arrayList5.get(i19)).emoji;
                    ArrayList arrayList11 = (ArrayList) hashMap.get(str5);
                    if (arrayList11 != null && !arrayList11.isEmpty() && !hashMap2.containsKey(arrayList11)) {
                        hashMap2.put(arrayList11, str5);
                        ezVar.h.add(arrayList11);
                    }
                }
                runnable2.run();
                return;
        }
    }
}
