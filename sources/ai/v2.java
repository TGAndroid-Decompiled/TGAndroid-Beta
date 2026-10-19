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
import android.widget.TextView;
import androidx.car.app.FailureResponse;
import androidx.car.app.IOnDoneCallback;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import java.nio.charset.StandardCharsets;
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
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.al;
import org.telegram.ui.Components.fo;
import org.telegram.ui.Components.md0;
import org.telegram.ui.Components.ml;
import org.telegram.ui.Components.od0;
import org.telegram.ui.Components.pl0;
import org.telegram.ui.Components.rl;
import org.telegram.ui.Components.td0;
import org.telegram.ui.Components.ti;
import org.telegram.ui.cy;
import org.telegram.ui.do0;
import org.telegram.ui.qn;
import org.telegram.ui.re1;
import org.telegram.ui.vx;
public final class v2 implements vx, androidx.car.app.utils.b, MessagesStorage.StringCallback, ci.v9, SuccessContinuation, MediaDataController.KeywordResultCallback, org.telegram.ui.ActionBar.a2, do0, ml, m4.o0, j9.q, md0, org.telegram.ui.ActionBar.q0, org.telegram.ui.Components.e5 {
    public final int f2286a;
    public final Object f2287b;
    public final Object f2288c;
    public final Object d;

    public v2(Object obj, Object obj2, Object obj3, int i10) {
        this.f2286a = i10;
        this.f2287b = obj;
        this.f2288c = obj2;
        this.d = obj3;
    }

    @Override
    public void C(int i10, int i11, boolean z10) {
        switch (this.f2286a) {
            case 27:
                rl rlVar = (rl) this.f2287b;
                rlVar.f29997x0.b((TLRPC.TL_messageMediaGeo) this.f2288c, rlVar.f29999y0, z10, i10, ((Long) this.d).longValue());
                rlVar.f28225b.dismiss(true);
                return;
            default:
                fo foVar = (fo) this.f2287b;
                foVar.f26283j0.d((TLRPC.TL_messageMediaToDo) this.f2288c, null, null, null, z10, i10, ((Long) this.d).longValue());
                foVar.f28225b.dismiss(true);
                return;
        }
    }

    @Override
    public boolean D() {
        switch (this.f2286a) {
            case 0:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean J(cy cyVar) {
        switch (this.f2286a) {
            case 0:
                return false;
            default:
                return false;
        }
    }

    @Override
    public j9.y apply(Object obj) {
        int i10 = this.f2286a;
        Object obj2 = this.d;
        Object obj3 = this.f2288c;
        Object obj4 = this.f2287b;
        switch (i10) {
            case 15:
                m4.f0 f0Var = (m4.f0) obj4;
                Handler handler = f0Var.f16528l;
                hi.t tVar = new hi.t(f0Var, (m4.v) obj3, new ig.e2(f0Var, (m4.v0) obj2, (m4.w) obj, 10));
                m4.s1 s1Var = new m4.s1(0);
                String str = e2.m0.f8254a;
                ?? obj5 = new Object();
                e2.m0.W(handler, new a3.l0(obj5, tVar, s1Var, 29));
                return obj5;
            default:
                m4.f0 f0Var2 = (m4.f0) obj4;
                m4.v vVar = (m4.v) obj3;
                List list = (List) obj;
                Handler handler2 = f0Var2.f16528l;
                hi.t tVar2 = new hi.t(f0Var2, vVar, new y0(f0Var2, (m4.f1) obj2, vVar, list, 29));
                m4.s1 s1Var2 = new m4.s1(0);
                String str2 = e2.m0.f8254a;
                ?? obj6 = new Object();
                e2.m0.W(handler2, new a3.l0(obj6, tVar2, s1Var2, 29));
                return obj6;
        }
    }

    @Override
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j10) {
        switch (this.f2286a) {
            case 11:
                ki.q qVar = (ki.q) this.f2287b;
                ki.a aVar = (ki.a) this.f2288c;
                ti tiVar = (ti) this.d;
                ki.w3 w3Var = qVar.f15450r;
                if (messageMedia != null && messageMedia.geo != null) {
                    ki.h2 h2Var = w3Var.H3;
                    if (h2Var != null) {
                        h2Var.d();
                    }
                    TL_iv.pageBlockMap pageblockmap = (TL_iv.pageBlockMap) aVar.f15097b;
                    pageblockmap.geo = messageMedia.geo;
                    pageblockmap.zoom = 15;
                    if (pageblockmap.f20495w <= 0 || pageblockmap.h <= 0) {
                        pageblockmap.f20495w = 600;
                        pageblockmap.h = 400;
                    }
                    ki.h2 h2Var2 = w3Var.H3;
                    if (h2Var2 != null) {
                        h2Var2.h();
                    }
                    qVar.Y(true);
                    tiVar.dismiss(true);
                    w3Var.post(new ki.f(qVar, aVar, 0));
                    return;
                }
                return;
            default:
                ki.d2 d2Var = (ki.d2) this.f2287b;
                ki.a aVar2 = (ki.a) this.f2288c;
                ti tiVar2 = (ti) this.d;
                if (messageMedia != null && messageMedia.geo != null) {
                    ki.h2 h2Var3 = d2Var.P.H3;
                    if (h2Var3 != null) {
                        h2Var3.d();
                    }
                    TL_iv.pageBlockMap pageblockmap2 = (TL_iv.pageBlockMap) aVar2.f15097b;
                    pageblockmap2.geo = messageMedia.geo;
                    pageblockmap2.zoom = 15;
                    if (pageblockmap2.f20495w <= 0 || pageblockmap2.h <= 0) {
                        pageblockmap2.f20495w = 600;
                        pageblockmap2.h = 400;
                    }
                    ki.h2 h2Var4 = d2Var.P.H3;
                    if (h2Var4 != null) {
                        h2Var4.h();
                    }
                    tiVar2.dismiss(true);
                    d2Var.P.post(new ki.m1(d2Var, aVar2, 9));
                    return;
                }
                return;
        }
    }

    @Override
    public void c(int i10) {
        switch (this.f2286a) {
            case 9:
                gi.y2 y2Var = (gi.y2) this.f2287b;
                td0 td0Var = (td0) this.f2288c;
                String str = (String) this.d;
                if (i10 != 3) {
                    td0Var.dismiss();
                }
                y2Var.d.f11166x.F(str, org.telegram.ui.Cells.c1.C(i10).toLowerCase(Locale.ROOT), false);
                return;
            default:
                td0 td0Var2 = (td0) this.f2287b;
                gi.f4 f4Var = (gi.f4) this.f2288c;
                String str2 = (String) this.d;
                if (i10 != 3) {
                    td0Var2.dismiss();
                }
                f4Var.getWebViewContainer().F(str2, org.telegram.ui.Cells.c1.C(i10).toLowerCase(Locale.ROOT), false);
                return;
        }
    }

    @Override
    public void call() {
        w.b bVar;
        switch (this.f2286a) {
            case 1:
                IOnDoneCallback iOnDoneCallback = (IOnDoneCallback) this.f2287b;
                String str = (String) this.d;
                Object obj = this.f2288c;
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
                IOnDoneCallback iOnDoneCallback2 = (IOnDoneCallback) this.f2287b;
                Exception exc = (Exception) this.f2288c;
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
    public void f(m4.v vVar) {
        Bundle bundle = (Bundle) this.f2288c;
        ResultReceiver resultReceiver = (ResultReceiver) this.d;
        m4.f0 f0Var = ((m4.p0) this.f2287b).f16663g;
        if (bundle == null) {
            Bundle bundle2 = Bundle.EMPTY;
        }
        j9.w n10 = f0Var.n(vVar);
        if (resultReceiver != null) {
            n10.a(new m4.z(1, n10, resultReceiver), j9.r.f14358a);
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f2286a) {
            case 7:
                ((ei.r9) this.f2287b).h1((ei.p9) this.f2288c, (Runnable) this.d, true);
                return;
            case 8:
                Activity activity = (Activity) this.f2287b;
                boolean[] zArr = (boolean[]) this.f2288c;
                org.telegram.ui.web.r rVar = (org.telegram.ui.web.r) this.d;
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    activity.startActivity(intent);
                } catch (Exception e) {
                    FileLog.e(e);
                }
                zArr[0] = true;
                Boolean bool = Boolean.FALSE;
                rVar.run(bool, bool);
                return;
            case 10:
                hg.j1 j1Var = (hg.j1) this.f2287b;
                TLRPC.User user = (TLRPC.User) this.d;
                j1Var.getClass();
                ((boolean[]) this.f2288c)[0] = true;
                if (user != null) {
                    SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(j1Var.f11927f).edit();
                    edit.putBoolean("inlinegeo_" + user.f20422id, true).commit();
                    j1Var.G();
                    return;
                }
                return;
            case 13:
                ki.e4 e4Var = (ki.e4) this.d;
                String trim = ((EditTextBoldCursor) this.f2287b).getText().toString().trim();
                String trim2 = ((EditTextBoldCursor) this.f2288c).getText().toString().trim();
                if (!TextUtils.isEmpty(trim) && !TextUtils.isEmpty(trim2)) {
                    int i11 = e4Var.f15248a;
                    ki.t3 t3Var = e4Var.f15249b;
                    switch (i11) {
                        case 1:
                            TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = new TL_keyboard.TL_inlineButtonTypeUrl();
                            tL_inlineButtonTypeUrl.url = trim2;
                            t3Var.a(trim, tL_inlineButtonTypeUrl);
                            return;
                        default:
                            TL_keyboard.TL_inlineButtonTypeCopy tL_inlineButtonTypeCopy = new TL_keyboard.TL_inlineButtonTypeCopy();
                            tL_inlineButtonTypeCopy.copy_text = trim2;
                            t3Var.a(trim, tL_inlineButtonTypeCopy);
                            return;
                    }
                }
                return;
            case 17:
                ((boolean[]) this.f2287b)[0] = true;
                ((Utilities.Callback) this.f2288c).run(Boolean.FALSE);
                ((org.telegram.ui.ActionBar.b2[]) this.d)[0].dismiss();
                return;
            case 21:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f2287b;
                MessageObject messageObject = (MessageObject) this.f2288c;
                TL_keyboard.KeyboardButtonProto keyboardButtonProto = (TL_keyboard.KeyboardButtonProto) this.d;
                Activity activity2 = chatActivityEnterView.O2;
                if (activity2.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
                    activity2.requestPermissions(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, 2);
                    chatActivityEnterView.f23962i3 = messageObject;
                    chatActivityEnterView.f23968j3 = keyboardButtonProto;
                    return;
                }
                SendMessagesHelper.getInstance(chatActivityEnterView.Q).sendCurrentLocation(messageObject, keyboardButtonProto);
                return;
            case 24:
                ti tiVar = (ti) this.f2287b;
                TLRPC.TL_attachMenuBot tL_attachMenuBot = (TLRPC.TL_attachMenuBot) this.f2288c;
                TLRPC.User user2 = (TLRPC.User) this.d;
                int i12 = tiVar.M1;
                if (tL_attachMenuBot != null) {
                    TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
                    tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(i12).getInputUser(user2);
                    tL_messages_toggleBotInAttachMenu.enabled = false;
                    ConnectionsManager.getInstance(i12).sendRequest(tL_messages_toggleBotInAttachMenu, new org.telegram.ui.vc(13, tiVar, tL_attachMenuBot), 66);
                    return;
                }
                MediaDataController.getInstance(i12).removeInline(user2.f20422id);
                return;
            case 26:
                al alVar = (al) this.f2287b;
                ig.a1 a1Var = (ig.a1) this.f2288c;
                org.telegram.ui.Cells.a2 a2Var = (org.telegram.ui.Cells.a2) this.d;
                TextView textView = alVar.R;
                if (a1Var.getText().toString().getBytes(StandardCharsets.UTF_8).length > 960) {
                    int i13 = -alVar.f24620s0;
                    alVar.f24620s0 = i13;
                    AndroidUtilities.shakeViewSpring(a1Var, i13);
                    return;
                }
                String trim3 = a1Var.getText().toString().trim();
                if (TextUtils.isEmpty(trim3)) {
                    trim3 = null;
                }
                alVar.f24615p0 = trim3;
                alVar.f24616q0 = !a2Var.b();
                if (TextUtils.isEmpty(alVar.f24615p0)) {
                    textView.setVisibility(8);
                } else {
                    textView.setText(alVar.f24615p0);
                    textView.setVisibility(0);
                }
                alVar.i0();
                b2Var.dismiss();
                alVar.Y();
                return;
            default:
                fo foVar = (fo) this.f2287b;
                View view = (View) this.f2288c;
                foVar.getClass();
                view.setTag(null);
                foVar.a0(view, (org.telegram.ui.Cells.c6) this.d, false);
                return;
        }
    }

    @Override
    public void i(Canvas canvas, RectF rectF, float f7) {
        org.telegram.ui.Cells.s7 s7Var = (org.telegram.ui.Cells.s7) this.f2287b;
        pl0 pl0Var = (pl0) this.f2288c;
        int[] iArr = (int[]) this.d;
        s7Var.c(canvas, rectF, f7);
        s7Var.f(canvas, rectF, f7);
        if (s7Var.h) {
            s7Var.b(canvas, rectF, f7);
        } else {
            s7Var.e(canvas, rectF, f7);
        }
        if (pl0Var != null && pl0Var.f29308a0 && pl0Var.getVisibility() == 0) {
            canvas.saveLayerAlpha(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), (int) (f7 * 255.0f), 31);
            canvas.translate(iArr[0], iArr[1]);
            pl0Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public void j(int i10) {
        Runnable runnable;
        org.telegram.ui.Components.e5 e5Var = (org.telegram.ui.Components.e5) this.f2287b;
        boolean[] zArr = (boolean[]) this.f2288c;
        org.telegram.ui.ActionBar.a3 a3Var = (org.telegram.ui.ActionBar.a3) this.d;
        if (i10 == 1) {
            e5Var.C(2147483646, 0, zArr[0]);
            runnable = a3Var.f20612a.dismissRunnable;
            runnable.run();
        }
    }

    @Override
    public void q(od0 od0Var, int i10) {
        switch (this.f2286a) {
            case 18:
                org.telegram.ui.Components.f5.f(null, null, 0L, 0L, 0, (od0) this.f2287b, (org.telegram.ui.Components.h4) this.f2288c, (org.telegram.ui.Components.i4) this.d);
                return;
            default:
                org.telegram.ui.Components.f5.f(null, null, 0L, 0L, 0, (od0) this.f2287b, (org.telegram.ui.Components.y3) this.f2288c, (org.telegram.ui.Components.a4) this.d);
                return;
        }
    }

    @Override
    public void run(ArrayList arrayList, String str) {
        int i10;
        ArrayList<TLRPC.Document> arrayList2;
        ArrayList<TLRPC.Document> arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5 = arrayList;
        ei.a2 a2Var = (ei.a2) this.f2287b;
        MediaDataController mediaDataController = (MediaDataController) this.d;
        ArrayList arrayList6 = a2Var.h;
        SparseIntArray sparseIntArray = a2Var.f8686y;
        ArrayList arrayList7 = a2Var.f8681n;
        ei.b2 b2Var = a2Var.N;
        ArrayList arrayList8 = a2Var.v;
        HashSet hashSet = a2Var.L;
        ArrayList arrayList9 = a2Var.f8683s;
        if (TextUtils.equals((String) this.f2288c, a2Var.H)) {
            ArrayList<Emoji.EmojiSpanRange> parseEmojis = Emoji.parseEmojis(a2Var.H);
            for (int i11 = 0; i11 < parseEmojis.size(); i11++) {
                try {
                    MediaDataController.KeywordResult keywordResult = new MediaDataController.KeywordResult();
                    keywordResult.emoji = parseEmojis.get(i11).code.toString();
                    arrayList5.add(keywordResult);
                } catch (Exception unused) {
                }
            }
            a2Var.f8685x = 0;
            arrayList9.clear();
            arrayList8.clear();
            sparseIntArray.clear();
            arrayList7.clear();
            int i12 = 1;
            a2Var.f8685x++;
            arrayList9.add(null);
            arrayList8.add(0L);
            if (b2Var.f10038a == 0) {
                hashSet.clear();
                for (int i13 = 0; i13 < arrayList5.size(); i13++) {
                    MediaDataController.KeywordResult keywordResult2 = (MediaDataController.KeywordResult) arrayList5.get(i13);
                    String str2 = keywordResult2.emoji;
                    if (str2 != null && !str2.startsWith("animated_") && (arrayList4 = (ArrayList) a2Var.d.get(keywordResult2.emoji)) != null) {
                        hashSet.addAll(arrayList4);
                    }
                }
                arrayList8.addAll(hashSet);
                for (int i14 = 0; i14 < hashSet.size(); i14++) {
                    arrayList9.add(null);
                }
                a2Var.f8685x = hashSet.size() + a2Var.f8685x;
                i10 = 1;
            } else {
                HashMap<String, ArrayList<TLRPC.Document>> allStickers = mediaDataController.getAllStickers();
                int i15 = 0;
                while (i15 < arrayList5.size()) {
                    MediaDataController.KeywordResult keywordResult3 = (MediaDataController.KeywordResult) arrayList5.get(i15);
                    int i16 = i12;
                    String str3 = keywordResult3.emoji;
                    if (str3 != null && !str3.startsWith("animated_") && (arrayList3 = allStickers.get(keywordResult3.emoji)) != null && !arrayList3.isEmpty()) {
                        for (int i17 = 0; i17 < arrayList3.size(); i17++) {
                            TLRPC.Document document = arrayList3.get(i17);
                            if (document != null && !arrayList9.contains(document)) {
                                arrayList9.add(document);
                                a2Var.f8685x++;
                            }
                        }
                    }
                    i15++;
                    i12 = i16;
                }
                i10 = i12;
                ArrayList<TLRPC.StickerSetCovered> featuredStickerSets = mediaDataController.getFeaturedStickerSets();
                int i18 = 0;
                while (i18 < arrayList5.size()) {
                    MediaDataController.KeywordResult keywordResult4 = (MediaDataController.KeywordResult) arrayList5.get(i18);
                    String str4 = keywordResult4.emoji;
                    if (str4 != null && !str4.startsWith("animated_")) {
                        for (int i19 = 0; i19 < featuredStickerSets.size(); i19++) {
                            TLRPC.StickerSetCovered stickerSetCovered = featuredStickerSets.get(i19);
                            if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                                arrayList2 = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                            } else if (!stickerSetCovered.covers.isEmpty()) {
                                arrayList2 = stickerSetCovered.covers;
                            } else if (stickerSetCovered.cover != null) {
                                ArrayList<TLRPC.Document> arrayList10 = new ArrayList<>();
                                arrayList10.add(stickerSetCovered.cover);
                                arrayList2 = arrayList10;
                            }
                            for (int i20 = 0; i20 < arrayList2.size(); i20++) {
                                String findAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(arrayList2.get(i20), null);
                                if (findAnimatedEmojiEmoticon != null && findAnimatedEmojiEmoticon.contains(keywordResult4.emoji)) {
                                    arrayList9.add(arrayList2.get(i20));
                                    a2Var.f8685x++;
                                }
                            }
                        }
                    }
                    i18++;
                    arrayList5 = arrayList;
                }
            }
            String translitSafe = AndroidUtilities.translitSafe((a2Var.H + "").toLowerCase());
            for (int i21 = 0; i21 < arrayList6.size(); i21++) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList6.get(i21);
                if (tL_messages_stickerSet != null && tL_messages_stickerSet.set != null) {
                    String translitSafe2 = AndroidUtilities.translitSafe((tL_messages_stickerSet.set.title + "").toLowerCase());
                    if (translitSafe2.startsWith(translitSafe) || org.telegram.messenger.g0.w(" ", translitSafe, translitSafe2)) {
                        int size = arrayList7.size();
                        arrayList7.add(tL_messages_stickerSet);
                        sparseIntArray.put(a2Var.f8685x, size);
                        arrayList9.add(null);
                        a2Var.f8685x++;
                        arrayList9.addAll(tL_messages_stickerSet.documents);
                        a2Var.f8685x = tL_messages_stickerSet.documents.size() + a2Var.f8685x;
                    }
                }
            }
            int i22 = i10;
            boolean z10 = (arrayList8.size() > i22 || arrayList9.size() > i22) ? 0 : i22;
            a2Var.f8684w = z10;
            if (z10 != 0) {
                a2Var.f8685x += i22;
            }
            if (z10 == 0) {
                a2Var.K += i22;
            }
            a2Var.I = a2Var.H;
            a2Var.l();
            ei.o1.x1(b2Var.f8771b, 0, 0);
            b2Var.f8773f.c(false);
            b2Var.e.n(false);
        }
    }

    @Override
    public Task then(Object obj) {
        String d;
        FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f2287b;
        String str = (String) this.f2288c;
        com.google.firebase.messaging.t tVar = (com.google.firebase.messaging.t) this.d;
        String str2 = (String) obj;
        a6.i c10 = FirebaseMessaging.c(firebaseMessaging.f7596b);
        l9.h hVar = firebaseMessaging.f7595a;
        hVar.a();
        if ("[DEFAULT]".equals(hVar.f15970b)) {
            d = "";
        } else {
            d = hVar.d();
        }
        String a2 = firebaseMessaging.f7600i.a();
        synchronized (c10) {
            String a10 = com.google.firebase.messaging.t.a(System.currentTimeMillis(), str2, a2);
            if (a10 != null) {
                SharedPreferences.Editor edit = ((SharedPreferences) c10.f307b).edit();
                edit.putString(d + "|T|" + str + "|*", a10);
                edit.commit();
            }
        }
        if (tVar == null || !str2.equals(tVar.f7666a)) {
            l9.h hVar2 = firebaseMessaging.f7595a;
            hVar2.a();
            if ("[DEFAULT]".equals(hVar2.f15970b)) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    StringBuilder sb2 = new StringBuilder("Invoking onNewToken for app: ");
                    hVar2.a();
                    sb2.append(hVar2.f15970b);
                    Log.d("FirebaseMessaging", sb2.toString());
                }
                Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
                intent.putExtra("token", str2);
                new com.google.firebase.messaging.i(firebaseMessaging.f7596b).b(intent);
            }
        }
        return Tasks.forResult(str2);
    }

    @Override
    public boolean w(cy cyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, re1 re1Var) {
        switch (this.f2286a) {
            case 0:
                return k7.O0((k7) this.f2287b, (TL_stars.TL_starGiftUnique) this.f2288c, (cy) this.d, arrayList);
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f2287b;
                TL_keyboard.TL_inlineButtonTypeSwitchInline tL_inlineButtonTypeSwitchInline = (TL_keyboard.TL_inlineButtonTypeSwitchInline) this.d;
                qn qnVar = chatActivityEnterView.P2;
                TLRPC.Message message = ((MessageObject) this.f2288c).messageOwner;
                long j10 = message.from_id.user_id;
                long j11 = message.via_bot_id;
                if (j11 != 0) {
                    j10 = j11;
                }
                TLRPC.User user = chatActivityEnterView.R.getMessagesController().getUser(Long.valueOf(j10));
                if (user == null) {
                    cyVar.finishFragment();
                } else {
                    long j12 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
                    MediaDataController mediaDataController = MediaDataController.getInstance(chatActivityEnterView.Q);
                    mediaDataController.saveDraft(j12, 0, "@" + UserObject.getPublicUsername(user) + " " + tL_inlineButtonTypeSwitchInline.query, null, null, true, 0L);
                    if (j12 != chatActivityEnterView.Q2) {
                        if (!DialogObject.isEncryptedDialog(j12)) {
                            Bundle bundle = new Bundle();
                            if (DialogObject.isUserDialog(j12)) {
                                bundle.putLong("user_id", j12);
                            } else {
                                bundle.putLong("chat_id", -j12);
                            }
                            if (chatActivityEnterView.R.getMessagesController().checkCanOpenChat(bundle, cyVar)) {
                                if (qnVar.presentFragment(new qn(bundle), true)) {
                                    if (!AndroidUtilities.isTablet()) {
                                        qnVar.removeSelfFromStack();
                                    }
                                } else {
                                    cyVar.finishFragment();
                                }
                            }
                        } else {
                            cyVar.finishFragment();
                        }
                    } else {
                        cyVar.finishFragment();
                    }
                }
                return true;
        }
    }

    public v2(m4.p0 p0Var, m4.o1 o1Var, Bundle bundle, ResultReceiver resultReceiver) {
        this.f2286a = 14;
        this.f2287b = p0Var;
        this.f2288c = bundle;
        this.d = resultReceiver;
    }

    @Override
    public void run(String str) {
        ci.h4 h4Var = (ci.h4) this.f2287b;
        ci.q4 q4Var = h4Var.f5463l;
        q4Var.getStoriesController().r(q4Var.B1, str, new v3(h4Var, (TL_stories.StoryItem) this.f2288c, (org.telegram.ui.ActionBar.d6) this.d, 3));
    }
}
