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
import org.telegram.messenger.bi;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.az;
import org.telegram.ui.Components.be0;
import org.telegram.ui.Components.gl;
import org.telegram.ui.Components.lo;
import org.telegram.ui.Components.sl;
import org.telegram.ui.Components.td0;
import org.telegram.ui.Components.vd0;
import org.telegram.ui.Components.xl;
import org.telegram.ui.Components.yi;
import org.telegram.ui.Components.yl0;
import org.telegram.ui.Components.zy;
import org.telegram.ui.fg1;
import org.telegram.ui.ny;
import org.telegram.ui.oo;
import org.telegram.ui.ty;
import org.telegram.ui.uo0;
import org.telegram.ui.zn;
public final class r5 implements MessagesStorage.StringCallback, fc, androidx.car.app.utils.b, MediaDataController.KeywordResultCallback, org.telegram.ui.ActionBar.a2, SuccessContinuation, uo0, sl, m4.k0, i9.p, td0, org.telegram.ui.ActionBar.r0, ny, org.telegram.ui.Components.f5 {
    public final int f1655a;
    public final Object f1656b;
    public final Object f1657c;
    public final Object d;

    public r5(Object obj, Object obj2, Object obj3, int i10) {
        this.f1655a = i10;
        this.f1656b = obj;
        this.f1657c = obj2;
        this.d = obj3;
    }

    @Override
    public boolean C() {
        return false;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        switch (this.f1655a) {
            case 26:
                xl xlVar = (xl) this.f1656b;
                xlVar.f32985x0.b((TLRPC.TL_messageMediaGeo) this.f1657c, xlVar.f32987y0, z10, i10, ((Long) this.d).longValue());
                xlVar.f30211b.dismiss(true);
                return;
            default:
                lo loVar = (lo) this.f1656b;
                loVar.f28452j0.e((TLRPC.TL_messageMediaToDo) this.f1657c, null, null, null, z10, i10, ((Long) this.d).longValue());
                loVar.f30211b.dismiss(true);
                return;
        }
    }

    @Override
    public boolean K(ty tyVar) {
        return false;
    }

    @Override
    public void a(int i10) {
        switch (this.f1655a) {
            case 8:
                ei.f3 f3Var = (ei.f3) this.f1656b;
                be0 be0Var = (be0) this.f1657c;
                String str = (String) this.d;
                if (i10 != 3) {
                    be0Var.dismiss();
                }
                f3Var.d.f9183x.F(str, org.telegram.ui.Cells.c1.x(i10).toLowerCase(Locale.ROOT), false);
                return;
            default:
                be0 be0Var2 = (be0) this.f1656b;
                ei.p4 p4Var = (ei.p4) this.f1657c;
                String str2 = (String) this.d;
                if (i10 != 3) {
                    be0Var2.dismiss();
                }
                p4Var.getWebViewContainer().F(str2, org.telegram.ui.Cells.c1.x(i10).toLowerCase(Locale.ROOT), false);
                return;
        }
    }

    @Override
    public i9.w apply(Object obj) {
        int i10 = this.f1655a;
        Object obj2 = this.d;
        Object obj3 = this.f1657c;
        Object obj4 = this.f1656b;
        switch (i10) {
            case 14:
                m4.b0 b0Var = (m4.b0) obj4;
                Handler handler = b0Var.f15993l;
                ki.i0 i0Var = new ki.i0(b0Var, (m4.r) obj3, new gg.t(b0Var, (m4.q0) obj2, (m4.s) obj, 26));
                m4.l1 l1Var = new m4.l1(0);
                String str = e2.d0.f8532a;
                ?? obj5 = new Object();
                e2.d0.T(handler, new a3.k0(obj5, i0Var, l1Var, 23));
                return obj5;
            default:
                m4.b0 b0Var2 = (m4.b0) obj4;
                m4.r rVar = (m4.r) obj3;
                List list = (List) obj;
                Handler handler2 = b0Var2.f15993l;
                ki.i0 i0Var2 = new ki.i0(b0Var2, rVar, new i5(b0Var2, (m4.z0) obj2, rVar, list, 25));
                m4.l1 l1Var2 = new m4.l1(0);
                String str2 = e2.d0.f8532a;
                ?? obj6 = new Object();
                e2.d0.T(handler2, new a3.k0(obj6, i0Var2, l1Var2, 23));
                return obj6;
        }
    }

    @Override
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j3) {
        switch (this.f1655a) {
            case 10:
                ii.r rVar = (ii.r) this.f1656b;
                ii.a aVar = (ii.a) this.f1657c;
                yi yiVar = (yi) this.d;
                ii.x3 x3Var = rVar.f12650r;
                if (messageMedia != null && messageMedia.geo != null) {
                    ii.i2 i2Var = x3Var.H3;
                    if (i2Var != null) {
                        i2Var.d();
                    }
                    TL_iv.pageBlockMap pageblockmap = (TL_iv.pageBlockMap) aVar.f12234b;
                    pageblockmap.geo = messageMedia.geo;
                    pageblockmap.zoom = 15;
                    if (pageblockmap.f20265w <= 0 || pageblockmap.h <= 0) {
                        pageblockmap.f20265w = 600;
                        pageblockmap.h = 400;
                    }
                    ii.i2 i2Var2 = x3Var.H3;
                    if (i2Var2 != null) {
                        i2Var2.h();
                    }
                    rVar.Y(true);
                    yiVar.dismiss(true);
                    x3Var.post(new ii.f(rVar, aVar, 0));
                    return;
                }
                return;
            default:
                ii.e2 e2Var = (ii.e2) this.f1656b;
                ii.a aVar2 = (ii.a) this.f1657c;
                yi yiVar2 = (yi) this.d;
                if (messageMedia != null && messageMedia.geo != null) {
                    ii.i2 i2Var3 = e2Var.P.H3;
                    if (i2Var3 != null) {
                        i2Var3.d();
                    }
                    TL_iv.pageBlockMap pageblockmap2 = (TL_iv.pageBlockMap) aVar2.f12234b;
                    pageblockmap2.geo = messageMedia.geo;
                    pageblockmap2.zoom = 15;
                    if (pageblockmap2.f20265w <= 0 || pageblockmap2.h <= 0) {
                        pageblockmap2.f20265w = 600;
                        pageblockmap2.h = 400;
                    }
                    ii.i2 i2Var4 = e2Var.P.H3;
                    if (i2Var4 != null) {
                        i2Var4.h();
                    }
                    yiVar2.dismiss(true);
                    e2Var.P.post(new ii.n1(e2Var, aVar2, 9));
                    return;
                }
                return;
        }
    }

    @Override
    public void call() {
        w.b bVar;
        switch (this.f1655a) {
            case 2:
                IOnDoneCallback iOnDoneCallback = (IOnDoneCallback) this.f1656b;
                String str = (String) this.d;
                Object obj = this.f1657c;
                if (obj == null) {
                    bVar = null;
                } else {
                    try {
                        bVar = new w.b(obj);
                    } catch (w.f e7) {
                        androidx.car.app.utils.g.f(iOnDoneCallback, str, e7);
                        return;
                    }
                }
                iOnDoneCallback.onSuccess(bVar);
                return;
            default:
                IOnDoneCallback iOnDoneCallback2 = (IOnDoneCallback) this.f1656b;
                Exception exc = (Exception) this.f1657c;
                String str2 = (String) this.d;
                try {
                    iOnDoneCallback2.onFailure(new w.b(new FailureResponse(exc)));
                    return;
                } catch (w.f e10) {
                    Log.e("CarApp.Dispatch", "Serialization failure in ".concat(str2), e10);
                    return;
                }
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f1655a) {
            case 5:
                ((ci.fa) this.f1656b).h1((ci.da) this.f1657c, (Runnable) this.d, true);
                return;
            case 7:
                Activity activity = (Activity) this.f1656b;
                boolean[] zArr = (boolean[]) this.f1657c;
                org.telegram.ui.web.q qVar = (org.telegram.ui.web.q) this.d;
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    activity.startActivity(intent);
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
                zArr[0] = true;
                Boolean bool = Boolean.FALSE;
                qVar.run(bool, bool);
                return;
            case 9:
                gg.j1 j1Var = (gg.j1) this.f1656b;
                TLRPC.User user = (TLRPC.User) this.d;
                j1Var.getClass();
                ((boolean[]) this.f1657c)[0] = true;
                if (user != null) {
                    SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(j1Var.f10673f).edit();
                    edit.putBoolean("inlinegeo_" + user.f20189id, true).commit();
                    j1Var.G();
                    return;
                }
                return;
            case 12:
                ii.g4 g4Var = (ii.g4) this.d;
                String trim = ((EditTextBoldCursor) this.f1656b).getText().toString().trim();
                String trim2 = ((EditTextBoldCursor) this.f1657c).getText().toString().trim();
                if (!TextUtils.isEmpty(trim) && !TextUtils.isEmpty(trim2)) {
                    int i11 = g4Var.f12441a;
                    ii.u3 u3Var = g4Var.f12442b;
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
                ((boolean[]) this.f1656b)[0] = true;
                ((Utilities.Callback) this.f1657c).run(Boolean.FALSE);
                ((org.telegram.ui.ActionBar.b2[]) this.d)[0].dismiss();
                return;
            case 20:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f1656b;
                MessageObject messageObject = (MessageObject) this.f1657c;
                TL_keyboard.KeyboardButtonProto keyboardButtonProto = (TL_keyboard.KeyboardButtonProto) this.d;
                Activity activity2 = chatActivityEnterView.O2;
                if (activity2.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
                    activity2.requestPermissions(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, 2);
                    chatActivityEnterView.f23910i3 = messageObject;
                    chatActivityEnterView.j3 = keyboardButtonProto;
                    return;
                }
                SendMessagesHelper.getInstance(chatActivityEnterView.Q).sendCurrentLocation(messageObject, keyboardButtonProto);
                return;
            case 23:
                yi yiVar = (yi) this.f1656b;
                TLRPC.TL_attachMenuBot tL_attachMenuBot = (TLRPC.TL_attachMenuBot) this.f1657c;
                TLRPC.User user2 = (TLRPC.User) this.d;
                int i12 = yiVar.M1;
                if (tL_attachMenuBot != null) {
                    TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
                    tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(i12).getInputUser(user2);
                    tL_messages_toggleBotInAttachMenu.enabled = false;
                    ConnectionsManager.getInstance(i12).sendRequest(tL_messages_toggleBotInAttachMenu, new oo(6, yiVar, tL_attachMenuBot), 66);
                    return;
                }
                MediaDataController.getInstance(i12).removeInline(user2.f20189id);
                return;
            case 25:
                gl glVar = (gl) this.f1656b;
                hg.b1 b1Var = (hg.b1) this.f1657c;
                org.telegram.ui.Cells.a2 a2Var = (org.telegram.ui.Cells.a2) this.d;
                TextView textView = glVar.R;
                if (b1Var.getText().toString().getBytes(StandardCharsets.UTF_8).length > 960) {
                    int i13 = -glVar.f26777s0;
                    glVar.f26777s0 = i13;
                    AndroidUtilities.shakeViewSpring(b1Var, i13);
                    return;
                }
                String trim3 = b1Var.getText().toString().trim();
                if (TextUtils.isEmpty(trim3)) {
                    trim3 = null;
                }
                glVar.f26772p0 = trim3;
                glVar.f26773q0 = !a2Var.b();
                if (TextUtils.isEmpty(glVar.f26772p0)) {
                    textView.setVisibility(8);
                } else {
                    textView.setText(glVar.f26772p0);
                    textView.setVisibility(0);
                }
                glVar.i0();
                b2Var.dismiss();
                glVar.Y();
                return;
            default:
                lo loVar = (lo) this.f1656b;
                View view = (View) this.f1657c;
                loVar.getClass();
                view.setTag(null);
                loVar.a0(view, (org.telegram.ui.Cells.d6) this.d, false);
                return;
        }
    }

    @Override
    public void g(m4.r rVar) {
        Bundle bundle = (Bundle) this.f1657c;
        ResultReceiver resultReceiver = (ResultReceiver) this.d;
        m4.b0 b0Var = ((m4.l0) this.f1656b).f16160g;
        if (bundle == null) {
            Bundle bundle2 = Bundle.EMPTY;
        }
        i9.u n10 = b0Var.n(rVar);
        if (resultReceiver != null) {
            n10.a(new ki.i0(5, n10, resultReceiver), i9.q.f12075a);
        }
    }

    @Override
    public void h(Canvas canvas, RectF rectF, float f7) {
        org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) this.f1656b;
        yl0 yl0Var = (yl0) this.f1657c;
        int[] iArr = (int[]) this.d;
        t7Var.c(canvas, rectF, f7);
        t7Var.f(canvas, rectF, f7);
        if (t7Var.h) {
            t7Var.b(canvas, rectF, f7);
        } else {
            t7Var.e(canvas, rectF, f7);
        }
        if (yl0Var != null && yl0Var.f33330a0 && yl0Var.getVisibility() == 0) {
            canvas.saveLayerAlpha(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), (int) (f7 * 255.0f), 31);
            canvas.translate(iArr[0], iArr[1]);
            yl0Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public void m(int i10) {
        Runnable runnable;
        org.telegram.ui.Components.f5 f5Var = (org.telegram.ui.Components.f5) this.f1656b;
        boolean[] zArr = (boolean[]) this.f1657c;
        org.telegram.ui.ActionBar.a3 a3Var = (org.telegram.ui.ActionBar.a3) this.d;
        if (i10 == 1) {
            f5Var.J(2147483646, 0, zArr[0]);
            runnable = a3Var.f20384a.dismissRunnable;
            runnable.run();
        }
    }

    @Override
    public void r(vd0 vd0Var, int i10) {
        switch (this.f1655a) {
            case 17:
                org.telegram.ui.Components.g5.f(null, null, 0L, 0L, 0, (vd0) this.f1656b, (org.telegram.ui.Components.i4) this.f1657c, (org.telegram.ui.Components.j4) this.d);
                return;
            default:
                org.telegram.ui.Components.g5.f(null, null, 0L, 0L, 0, (vd0) this.f1656b, (org.telegram.ui.Components.z3) this.f1657c, (org.telegram.ui.Components.b4) this.d);
                return;
        }
    }

    @Override
    public void run(String str) {
        w5 w5Var = (w5) this.f1656b;
        f6 f6Var = w5Var.f1860l;
        f6Var.getStoriesController().r(f6Var.B1, str, new d5(w5Var, (TL_stories.StoryItem) this.f1657c, (org.telegram.ui.ActionBar.e6) this.d, 2));
    }

    @Override
    public Task then(Object obj) {
        String d;
        FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f1656b;
        String str = (String) this.f1657c;
        com.google.firebase.messaging.t tVar = (com.google.firebase.messaging.t) this.d;
        String str2 = (String) obj;
        com.google.firebase.messaging.u c10 = FirebaseMessaging.c(firebaseMessaging.f7890b);
        k9.h hVar = firebaseMessaging.f7889a;
        hVar.a();
        if ("[DEFAULT]".equals(hVar.f14748b)) {
            d = "";
        } else {
            d = hVar.d();
        }
        String a2 = firebaseMessaging.f7895i.a();
        synchronized (c10) {
            String a10 = com.google.firebase.messaging.t.a(System.currentTimeMillis(), str2, a2);
            if (a10 != null) {
                SharedPreferences.Editor edit = c10.f7977a.edit();
                edit.putString(d + "|T|" + str + "|*", a10);
                edit.commit();
            }
        }
        if (tVar == null || !str2.equals(tVar.f7974a)) {
            k9.h hVar2 = firebaseMessaging.f7889a;
            hVar2.a();
            if ("[DEFAULT]".equals(hVar2.f14748b)) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    StringBuilder sb2 = new StringBuilder("Invoking onNewToken for app: ");
                    hVar2.a();
                    sb2.append(hVar2.f14748b);
                    Log.d("FirebaseMessaging", sb2.toString());
                }
                Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
                intent.putExtra("token", str2);
                new com.google.firebase.messaging.j(firebaseMessaging.f7890b).b(intent);
            }
        }
        return Tasks.forResult(str2);
    }

    @Override
    public boolean w(ty tyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, fg1 fg1Var) {
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f1656b;
        TL_keyboard.TL_inlineButtonTypeSwitchInline tL_inlineButtonTypeSwitchInline = (TL_keyboard.TL_inlineButtonTypeSwitchInline) this.d;
        zn znVar = chatActivityEnterView.P2;
        TLRPC.Message message = ((MessageObject) this.f1657c).messageOwner;
        long j3 = message.from_id.user_id;
        long j10 = message.via_bot_id;
        if (j10 != 0) {
            j3 = j10;
        }
        TLRPC.User user = chatActivityEnterView.R.getMessagesController().getUser(Long.valueOf(j3));
        if (user == null) {
            tyVar.finishFragment();
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
                if (chatActivityEnterView.R.getMessagesController().checkCanOpenChat(bundle, tyVar)) {
                    if (znVar.presentFragment(new zn(bundle), true)) {
                        if (!AndroidUtilities.isTablet()) {
                            znVar.removeSelfFromStack();
                        }
                    } else {
                        tyVar.finishFragment();
                        return true;
                    }
                }
                return true;
            }
            tyVar.finishFragment();
            return true;
        }
        tyVar.finishFragment();
        return true;
    }

    public r5(m4.l0 l0Var, m4.h1 h1Var, Bundle bundle, ResultReceiver resultReceiver) {
        this.f1655a = 13;
        this.f1656b = l0Var;
        this.f1657c = bundle;
        this.d = resultReceiver;
    }

    @Override
    public void run(ArrayList arrayList, String str) {
        int i10;
        ArrayList<TLRPC.Document> arrayList2;
        ArrayList<TLRPC.Document> arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5 = arrayList;
        switch (this.f1655a) {
            case 4:
                ci.c2 c2Var = (ci.c2) this.f1656b;
                MediaDataController mediaDataController = (MediaDataController) this.d;
                ArrayList arrayList6 = c2Var.h;
                SparseIntArray sparseIntArray = c2Var.f4832y;
                ArrayList arrayList7 = c2Var.f4827n;
                ci.d2 d2Var = c2Var.N;
                ArrayList arrayList8 = c2Var.v;
                HashSet hashSet = c2Var.L;
                ArrayList arrayList9 = c2Var.f4829s;
                if (TextUtils.equals((String) this.f1657c, c2Var.H)) {
                    ArrayList<Emoji.EmojiSpanRange> parseEmojis = Emoji.parseEmojis(c2Var.H);
                    for (int i11 = 0; i11 < parseEmojis.size(); i11++) {
                        try {
                            MediaDataController.KeywordResult keywordResult = new MediaDataController.KeywordResult();
                            keywordResult.emoji = parseEmojis.get(i11).code.toString();
                            arrayList5.add(keywordResult);
                        } catch (Exception unused) {
                        }
                    }
                    c2Var.f4831x = 0;
                    arrayList9.clear();
                    arrayList8.clear();
                    sparseIntArray.clear();
                    arrayList7.clear();
                    int i12 = 1;
                    c2Var.f4831x++;
                    arrayList9.add(null);
                    arrayList8.add(0L);
                    if (d2Var.f6415a == 0) {
                        hashSet.clear();
                        for (int i13 = 0; i13 < arrayList5.size(); i13++) {
                            MediaDataController.KeywordResult keywordResult2 = (MediaDataController.KeywordResult) arrayList5.get(i13);
                            String str2 = keywordResult2.emoji;
                            if (str2 != null && !str2.startsWith("animated_") && (arrayList4 = (ArrayList) c2Var.d.get(keywordResult2.emoji)) != null) {
                                hashSet.addAll(arrayList4);
                            }
                        }
                        arrayList8.addAll(hashSet);
                        for (int i14 = 0; i14 < hashSet.size(); i14++) {
                            arrayList9.add(null);
                        }
                        c2Var.f4831x = hashSet.size() + c2Var.f4831x;
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
                                        c2Var.f4831x++;
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
                                            c2Var.f4831x++;
                                        }
                                    }
                                }
                            }
                            i18++;
                            arrayList5 = arrayList;
                        }
                    }
                    String translitSafe = AndroidUtilities.translitSafe((c2Var.H + "").toLowerCase());
                    for (int i21 = 0; i21 < arrayList6.size(); i21++) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList6.get(i21);
                        if (tL_messages_stickerSet != null && tL_messages_stickerSet.set != null) {
                            String translitSafe2 = AndroidUtilities.translitSafe((tL_messages_stickerSet.set.title + "").toLowerCase());
                            if (translitSafe2.startsWith(translitSafe) || bi.w(" ", translitSafe, translitSafe2)) {
                                int size = arrayList7.size();
                                arrayList7.add(tL_messages_stickerSet);
                                sparseIntArray.put(c2Var.f4831x, size);
                                arrayList9.add(null);
                                c2Var.f4831x++;
                                arrayList9.addAll(tL_messages_stickerSet.documents);
                                c2Var.f4831x = tL_messages_stickerSet.documents.size() + c2Var.f4831x;
                            }
                        }
                    }
                    int i22 = i10;
                    boolean z10 = (arrayList8.size() > i22 || arrayList9.size() > i22) ? 0 : i22;
                    c2Var.f4830w = z10;
                    if (z10 != 0) {
                        c2Var.f4831x += i22;
                    }
                    if (z10 == 0) {
                        c2Var.K += i22;
                    }
                    c2Var.I = c2Var.H;
                    c2Var.l();
                    ci.o1.x1(d2Var.f4895b, 0, 0);
                    d2Var.f4898f.c(false);
                    d2Var.f4897e.n(false);
                    return;
                }
                return;
            default:
                Runnable runnable = (Runnable) this.d;
                az azVar = ((zy) this.f1656b).f33726a;
                if (((String) this.f1657c).equals(azVar.v)) {
                    azVar.f24668w = str;
                    azVar.f24665n.addAll(arrayList5);
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
