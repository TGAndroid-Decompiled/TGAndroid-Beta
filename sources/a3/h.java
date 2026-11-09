package a3;

import ab.c0;
import ab.d0;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.car.app.FailureResponse;
import androidx.car.app.IOnDoneCallback;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import bi.k7;
import bi.v3;
import bi.w2;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import di.a4;
import di.j4;
import di.l9;
import fi.m1;
import fi.q8;
import fi.s8;
import fi.y1;
import fi.z1;
import h9.f0;
import h9.i0;
import h9.t1;
import hi.c4;
import hi.v2;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import jg.i1;
import kg.x0;
import li.b2;
import li.f2;
import li.l1;
import li.q3;
import li.t3;
import org.telegram.messenger.a8;
import org.telegram.messenger.c20;
import org.telegram.messenger.g0;
import org.telegram.messenger.gz;
import org.telegram.messenger.i6;
import org.telegram.messenger.ij;
import org.telegram.messenger.m5;
import org.telegram.messenger.qi;
import org.telegram.messenger.qp;
import org.telegram.messenger.ri;
import org.telegram.messenger.t0;
import org.telegram.messenger.t10;
import org.telegram.messenger.ui;
import org.telegram.messenger.wr;
import org.telegram.messenger.xr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.m0;
import org.telegram.ui.ActionBar.r1;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.Cells.a6;
import org.telegram.ui.Cells.c2;
import org.telegram.ui.Cells.f1;
import org.telegram.ui.Cells.o7;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.bn;
import org.telegram.ui.Components.d4;
import org.telegram.ui.Components.di;
import org.telegram.ui.Components.gb0;
import org.telegram.ui.Components.ib0;
import org.telegram.ui.Components.ik;
import org.telegram.ui.Components.nb0;
import org.telegram.ui.Components.t4;
import org.telegram.ui.Components.u3;
import org.telegram.ui.Components.v4;
import org.telegram.ui.Components.vi0;
import org.telegram.ui.Components.vk;
import org.telegram.ui.Components.wk;
import org.telegram.ui.cn;
import org.telegram.ui.il0;
import org.telegram.ui.ld;
import org.telegram.ui.sw;
import org.telegram.ui.y91;
import org.telegram.ui.yw;
public final class h implements p, SuccessContinuation, androidx.car.app.utils.b, Continuation, sw, wr, l9, ri, r1, OnFailureListener, il0, vk, m0, gb0, t4 {
    public final int f87a;
    public final Object f88b;
    public final Object f89c;
    public final Object d;

    public h(g1.a aVar, CancellationSignal cancellationSignal, Executor executor, v0.g gVar) {
        this.f87a = 10;
        this.f89c = cancellationSignal;
        this.f88b = executor;
        this.d = gVar;
    }

    @Override
    public boolean G() {
        switch (this.f87a) {
            case 5:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void L(int i7, int i10, boolean z9) {
        switch (this.f87a) {
            case 27:
                wk wkVar = (wk) this.f89c;
                wkVar.f40078n0.d((TLRPC.TL_messageMediaGeo) this.f88b, wkVar.f40079o0, z9, i7, ((Long) this.d).longValue());
                wkVar.f39071b.a(true);
                return;
            default:
                bn bnVar = (bn) this.f89c;
                bnVar.f32303j0.b((TLRPC.TL_messageMediaToDo) this.f88b, null, null, null, z9, i7, ((Long) this.d).longValue());
                bnVar.f39071b.a(true);
                return;
        }
    }

    @Override
    public boolean N(yw ywVar) {
        switch (this.f87a) {
            case 5:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void a(String str) {
        a4 a4Var = (a4) this.f89c;
        j4 j4Var = a4Var.f8808x;
        j4Var.getStoriesController().r(j4Var.f9196k1, str, new v3(a4Var, (TL_stories.StoryItem) this.f88b, (g6) this.d, 3));
    }

    @Override
    public void b(int i7) {
        switch (this.f87a) {
            case 12:
                v2 v2Var = (v2) this.f89c;
                nb0 nb0Var = (nb0) this.d;
                String str = (String) this.f88b;
                if (i7 != 3) {
                    nb0Var.dismiss();
                }
                v2Var.d.D.G(str, f1.A(i7).toLowerCase(Locale.ROOT), false);
                return;
            default:
                nb0 nb0Var2 = (nb0) this.f89c;
                c4 c4Var = (c4) this.d;
                String str2 = (String) this.f88b;
                if (i7 != 3) {
                    nb0Var2.dismiss();
                }
                c4Var.getWebViewContainer().G(str2, f1.A(i7).toLowerCase(Locale.ROOT), false);
                return;
        }
    }

    @Override
    public void call() {
        w.b bVar;
        switch (this.f87a) {
            case 2:
                IOnDoneCallback iOnDoneCallback = (IOnDoneCallback) this.f89c;
                String str = (String) this.f88b;
                Object obj = this.d;
                if (obj == null) {
                    bVar = null;
                } else {
                    try {
                        bVar = new w.b(obj);
                    } catch (w.f e10) {
                        androidx.car.app.utils.g.f(iOnDoneCallback, str, e10);
                        return;
                    }
                }
                iOnDoneCallback.onSuccess(bVar);
                return;
            default:
                IOnDoneCallback iOnDoneCallback2 = (IOnDoneCallback) this.f89c;
                Exception exc = (Exception) this.d;
                String str2 = (String) this.f88b;
                try {
                    iOnDoneCallback2.onFailure(new w.b(new FailureResponse(exc)));
                    return;
                } catch (w.f e11) {
                    Log.e("CarApp.Dispatch", "Serialization failure in ".concat(str2), e11);
                    return;
                }
        }
    }

    @Override
    public void d(TLRPC.MessageMedia messageMedia, int i7, boolean z9, int i10, long j3) {
        switch (this.f87a) {
            case 14:
                li.p pVar = (li.p) this.f89c;
                li.a aVar = (li.a) this.f88b;
                di diVar = (di) this.d;
                t3 t3Var = pVar.f18760r;
                if (messageMedia != null && messageMedia.geo != null) {
                    f2 f2Var = t3Var.Q3;
                    if (f2Var != null) {
                        f2Var.d();
                    }
                    TL_iv.pageBlockMap pageblockmap = (TL_iv.pageBlockMap) aVar.f18392b;
                    pageblockmap.geo = messageMedia.geo;
                    pageblockmap.zoom = 15;
                    if (pageblockmap.f27181w <= 0 || pageblockmap.h <= 0) {
                        pageblockmap.f27181w = 600;
                        pageblockmap.h = 400;
                    }
                    f2 f2Var2 = t3Var.Q3;
                    if (f2Var2 != null) {
                        f2Var2.h();
                    }
                    pVar.a0(true);
                    diVar.a(true);
                    t3Var.post(new li.f(pVar, aVar, 0));
                    return;
                }
                return;
            default:
                b2 b2Var = (b2) this.f89c;
                li.a aVar2 = (li.a) this.f88b;
                di diVar2 = (di) this.d;
                if (messageMedia != null && messageMedia.geo != null) {
                    f2 f2Var3 = b2Var.P.Q3;
                    if (f2Var3 != null) {
                        f2Var3.d();
                    }
                    TL_iv.pageBlockMap pageblockmap2 = (TL_iv.pageBlockMap) aVar2.f18392b;
                    pageblockmap2.geo = messageMedia.geo;
                    pageblockmap2.zoom = 15;
                    if (pageblockmap2.f27181w <= 0 || pageblockmap2.h <= 0) {
                        pageblockmap2.f27181w = 600;
                        pageblockmap2.h = 400;
                    }
                    f2 f2Var4 = b2Var.P.Q3;
                    if (f2Var4 != null) {
                        f2Var4.h();
                    }
                    diVar2.a(true);
                    b2Var.P.post(new l1(b2Var, aVar2, 9));
                    return;
                }
                return;
        }
    }

    @Override
    public void e(String str, ArrayList arrayList) {
        int i7;
        int i10;
        ArrayList<TLRPC.Document> arrayList2;
        int i11;
        ArrayList arrayList3;
        boolean z9;
        ArrayList arrayList4;
        ArrayList arrayList5 = arrayList;
        y1 y1Var = (y1) this.f89c;
        ui uiVar = (ui) this.d;
        ArrayList arrayList6 = y1Var.h;
        SparseIntArray sparseIntArray = y1Var.D;
        ArrayList arrayList7 = y1Var.f13147n;
        z1 z1Var = y1Var.N;
        ArrayList arrayList8 = y1Var.f13150w;
        HashSet hashSet = y1Var.L;
        ArrayList arrayList9 = y1Var.f13149s;
        if (!TextUtils.equals((String) this.f88b, y1Var.H)) {
            return;
        }
        ArrayList j3 = i6.j(y1Var.H, null);
        int i12 = 0;
        for (int i13 = 0; i13 < j3.size(); i13++) {
            try {
                ?? obj = new Object();
                obj.f24701a = ((org.telegram.messenger.g6) j3.get(i13)).f22625c.toString();
                arrayList5.add(obj);
            } catch (Exception unused) {
            }
        }
        y1Var.f13152y = 0;
        arrayList9.clear();
        arrayList8.clear();
        sparseIntArray.clear();
        arrayList7.clear();
        int i14 = 1;
        y1Var.f13152y++;
        arrayList9.add(null);
        arrayList8.add(0L);
        if (z1Var.f12882a == 0) {
            hashSet.clear();
            for (int i15 = 0; i15 < arrayList5.size(); i15++) {
                qi qiVar = (qi) arrayList5.get(i15);
                String str2 = qiVar.f24701a;
                if (str2 != null && !str2.startsWith("animated_") && (arrayList4 = (ArrayList) y1Var.d.get(qiVar.f24701a)) != null) {
                    hashSet.addAll(arrayList4);
                }
            }
            arrayList8.addAll(hashSet);
            for (int i16 = 0; i16 < hashSet.size(); i16++) {
                arrayList9.add(null);
            }
            y1Var.f13152y = hashSet.size() + y1Var.f13152y;
            i7 = 1;
            i10 = 0;
        } else {
            HashMap hashMap = uiVar.f25808d0;
            int i17 = 0;
            while (i17 < arrayList5.size()) {
                qi qiVar2 = (qi) arrayList5.get(i17);
                int i18 = i12;
                String str3 = qiVar2.f24701a;
                if (str3 == null || str3.startsWith("animated_") || (arrayList3 = (ArrayList) hashMap.get(qiVar2.f24701a)) == null || arrayList3.isEmpty()) {
                    i11 = i14;
                } else {
                    i11 = i14;
                    for (int i19 = i18; i19 < arrayList3.size(); i19++) {
                        TLRPC.Document document = (TLRPC.Document) arrayList3.get(i19);
                        if (document != null && !arrayList9.contains(document)) {
                            arrayList9.add(document);
                            y1Var.f13152y++;
                        }
                    }
                }
                i17++;
                i12 = i18;
                i14 = i11;
            }
            i7 = i14;
            i10 = i12;
            ArrayList arrayList10 = uiVar.f25840s0[i10];
            int i20 = i10;
            while (i20 < arrayList5.size()) {
                qi qiVar3 = (qi) arrayList5.get(i20);
                String str4 = qiVar3.f24701a;
                if (str4 != null && !str4.startsWith("animated_")) {
                    for (int i21 = i10; i21 < arrayList10.size(); i21++) {
                        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList10.get(i21);
                        if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                            arrayList2 = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                        } else if (!stickerSetCovered.covers.isEmpty()) {
                            arrayList2 = stickerSetCovered.covers;
                        } else if (stickerSetCovered.cover != null) {
                            ArrayList<TLRPC.Document> arrayList11 = new ArrayList<>();
                            arrayList11.add(stickerSetCovered.cover);
                            arrayList2 = arrayList11;
                        }
                        for (int i22 = i10; i22 < arrayList2.size(); i22++) {
                            String V = ij.V(arrayList2.get(i22), null, null);
                            if (V != null && V.contains(qiVar3.f24701a)) {
                                arrayList9.add(arrayList2.get(i22));
                                y1Var.f13152y++;
                            }
                        }
                    }
                }
                i20++;
                arrayList5 = arrayList;
            }
        }
        String O3 = g0.O3((y1Var.H + "").toLowerCase());
        for (int i23 = i10; i23 < arrayList6.size(); i23++) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList6.get(i23);
            if (tL_messages_stickerSet != null && tL_messages_stickerSet.set != null) {
                String O32 = g0.O3((tL_messages_stickerSet.set.title + "").toLowerCase());
                if (O32.startsWith(O3) || O32.contains(" ".concat(O3))) {
                    int size = arrayList7.size();
                    arrayList7.add(tL_messages_stickerSet);
                    sparseIntArray.put(y1Var.f13152y, size);
                    arrayList9.add(null);
                    y1Var.f13152y++;
                    arrayList9.addAll(tL_messages_stickerSet.documents);
                    y1Var.f13152y = tL_messages_stickerSet.documents.size() + y1Var.f13152y;
                }
            }
        }
        int i24 = i7;
        if (arrayList8.size() <= i24 && arrayList9.size() <= i24) {
            z9 = i24;
        } else {
            z9 = i10;
        }
        y1Var.f13151x = z9;
        if (z9 != 0) {
            y1Var.f13152y += i24;
        }
        if (z9 == 0) {
            y1Var.K += i24;
        }
        y1Var.I = y1Var.H;
        y1Var.f();
        boolean z10 = i10;
        m1.z1(z1Var.f13235b, z10 ? 1 : 0, z10 ? 1 : 0);
        z1Var.f13238f.c(z10);
        z1Var.f13237e.n(z10);
    }

    @Override
    public void g(u1 u1Var, int i7) {
        switch (this.f87a) {
            case 9:
                ((s8) this.f89c).N0((q8) this.f88b, (Runnable) this.d, true);
                return;
            case 11:
                Activity activity = (Activity) this.f89c;
                boolean[] zArr = (boolean[]) this.f88b;
                org.telegram.ui.web.n nVar = (org.telegram.ui.web.n) this.d;
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + t0.f25566b.getPackageName()));
                    activity.startActivity(intent);
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
                zArr[0] = true;
                Boolean bool = Boolean.FALSE;
                nVar.a(bool, bool);
                return;
            case 13:
                i1 i1Var = (i1) this.f89c;
                TLRPC.User user = (TLRPC.User) this.d;
                i1Var.getClass();
                ((boolean[]) this.f88b)[0] = true;
                if (user != null) {
                    SharedPreferences.Editor edit = qp.s1(i1Var.f16781f).f24764d7.edit();
                    edit.putBoolean("inlinegeo_" + user.f27105id, true).commit();
                    i1Var.G();
                    return;
                }
                return;
            case 16:
                li.c4 c4Var = (li.c4) this.d;
                String trim = ((EditTextBoldCursor) this.f89c).getText().toString().trim();
                String trim2 = ((EditTextBoldCursor) this.f88b).getText().toString().trim();
                if (!TextUtils.isEmpty(trim) && !TextUtils.isEmpty(trim2)) {
                    int i10 = c4Var.f18505a;
                    q3 q3Var = c4Var.f18506b;
                    switch (i10) {
                        case 1:
                            TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = new TL_keyboard.TL_inlineButtonTypeUrl();
                            tL_inlineButtonTypeUrl.url = trim2;
                            q3Var.a(trim, tL_inlineButtonTypeUrl);
                            return;
                        default:
                            TL_keyboard.TL_inlineButtonTypeCopy tL_inlineButtonTypeCopy = new TL_keyboard.TL_inlineButtonTypeCopy();
                            tL_inlineButtonTypeCopy.copy_text = trim2;
                            q3Var.a(trim, tL_inlineButtonTypeCopy);
                            return;
                    }
                }
                return;
            case 17:
                ((boolean[]) this.f89c)[0] = true;
                ((c20) this.f88b).a(Boolean.FALSE);
                ((u1[]) this.d)[0].dismiss();
                return;
            case 22:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f89c;
                ij ijVar = (ij) this.f88b;
                TL_keyboard.KeyboardButtonProto keyboardButtonProto = (TL_keyboard.KeyboardButtonProto) this.d;
                Activity activity2 = chatActivityEnterView.O2;
                if (activity2.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
                    activity2.requestPermissions(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, 2);
                    chatActivityEnterView.f31073i3 = ijVar;
                    chatActivityEnterView.j3 = keyboardButtonProto;
                    return;
                }
                gz.C(chatActivityEnterView.Q).o0(ijVar, keyboardButtonProto);
                return;
            case 24:
                di diVar = (di) this.f89c;
                TLRPC.TL_attachMenuBot tL_attachMenuBot = (TLRPC.TL_attachMenuBot) this.f88b;
                TLRPC.User user2 = (TLRPC.User) this.d;
                int i11 = diVar.D3;
                if (tL_attachMenuBot != null) {
                    TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
                    tL_messages_toggleBotInAttachMenu.bot = qp.s1(i11).q1(user2);
                    tL_messages_toggleBotInAttachMenu.enabled = false;
                    ConnectionsManager.getInstance(i11).sendRequest(tL_messages_toggleBotInAttachMenu, new ld(11, diVar, tL_attachMenuBot), 66);
                    return;
                }
                ui.b0(i11).L1(user2.f27105id);
                return;
            case 26:
                ik ikVar = (ik) this.f89c;
                x0 x0Var = (x0) this.f88b;
                c2 c2Var = (c2) this.d;
                TextView textView = ikVar.U;
                String str = null;
                if (x0Var.getText().toString().getBytes(StandardCharsets.UTF_8).length > 960) {
                    int i12 = -ikVar.f34791v0;
                    ikVar.f34791v0 = i12;
                    g0.G3(i12, x0Var, null);
                    return;
                }
                String trim3 = x0Var.getText().toString().trim();
                if (!TextUtils.isEmpty(trim3)) {
                    str = trim3;
                }
                ikVar.f34788s0 = str;
                ikVar.f34789t0 = !c2Var.b();
                if (TextUtils.isEmpty(ikVar.f34788s0)) {
                    textView.setVisibility(8);
                } else {
                    textView.setText(ikVar.f34788s0);
                    textView.setVisibility(0);
                }
                ikVar.k0();
                u1Var.dismiss();
                ikVar.a0();
                return;
            default:
                bn bnVar = (bn) this.f89c;
                View view = (View) this.f88b;
                bnVar.getClass();
                view.setTag(null);
                bnVar.c0(view, (a6) this.d, false);
                return;
        }
    }

    @Override
    public t1 h(int i7, e2.m1 m1Var, int[] iArr) {
        n nVar = (n) this.f89c;
        String str = (String) this.f88b;
        String str2 = (String) this.d;
        f0 p10 = i0.p();
        for (int i10 = 0; i10 < m1Var.f10373a; i10++) {
            p10.c(new o(i7, m1Var, i10, nVar, iArr[i10], str, str2));
        }
        return p10.f();
    }

    @Override
    public void i(int i7) {
        t4 t4Var = (t4) this.f89c;
        boolean[] zArr = (boolean[]) this.f88b;
        h9.f1 f1Var = (h9.f1) this.d;
        if (i7 == 1) {
            t4Var.L(2147483646, 0, zArr[0]);
            ((org.telegram.ui.ActionBar.v2) f1Var.f14323b).f28660x0.run();
        }
    }

    @Override
    public void n(ib0 ib0Var, int i7) {
        switch (this.f87a) {
            case 19:
                v4.g(null, null, 0L, 0L, 0, (ib0) this.f89c, (org.telegram.ui.Components.c4) this.f88b, (d4) this.d);
                return;
            default:
                v4.g(null, null, 0L, 0L, 0, (ib0) this.f89c, (u3) this.f88b, (org.telegram.ui.Components.v3) this.d);
                return;
        }
    }

    @Override
    public void o(Canvas canvas, RectF rectF, float f10) {
        o7 o7Var = (o7) this.f89c;
        vi0 vi0Var = (vi0) this.f88b;
        int[] iArr = (int[]) this.d;
        o7Var.c(canvas, rectF, f10);
        o7Var.f(canvas, rectF, f10);
        if (o7Var.h) {
            o7Var.b(canvas, rectF, f10);
        } else {
            o7Var.e(canvas, rectF, f10);
        }
        if (vi0Var != null && vi0Var.f39080a0 && vi0Var.getVisibility() == 0) {
            canvas.saveLayerAlpha(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), (int) (f10 * 255.0f), 31);
            canvas.translate(iArr[0], iArr[1]);
            vi0Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public void onFailure(Exception e10) {
        w0.i hVar;
        CancellationSignal cancellationSignal = (CancellationSignal) this.f89c;
        Executor executor = (Executor) this.f88b;
        v0.g gVar = (v0.g) this.d;
        kotlin.jvm.internal.j.e(e10, "e");
        if (e10 instanceof com.google.android.gms.common.api.f) {
            int statusCode = ((com.google.android.gms.common.api.f) e10).getStatusCode();
            if (statusCode == 16) {
                hVar = new w0.g(e10.getMessage());
            } else if (b1.d.f2898b.contains(Integer.valueOf(statusCode))) {
                hVar = new w0.j(e10.getMessage());
            } else {
                hVar = new w0.h(2, "Get digital credential failed, failure: " + e10);
            }
        } else {
            hVar = new w0.h(2, "Get digital credential failed, failure: " + e10);
        }
        CredentialProviderPlayServicesImpl.Companion.getClass();
        if (a1.g.a(cancellationSignal)) {
            return;
        }
        executor.execute(new b1.g(gVar, hVar, 2));
    }

    @Override
    public Object then(Task task) {
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f89c;
        AtomicBoolean atomicBoolean = (AtomicBoolean) this.f88b;
        CancellationTokenSource cancellationTokenSource = (CancellationTokenSource) this.d;
        if (task.isSuccessful()) {
            taskCompletionSource.trySetResult(task.getResult());
        } else if (task.getException() != null) {
            taskCompletionSource.trySetException(task.getException());
        } else if (atomicBoolean.getAndSet(true)) {
            cancellationTokenSource.cancel();
        }
        return Tasks.forResult(null);
    }

    @Override
    public boolean y(yw ywVar, ArrayList arrayList, CharSequence charSequence, boolean z9, boolean z10, int i7, int i10, y91 y91Var) {
        long j3;
        TLRPC.User a22;
        switch (this.f87a) {
            case 5:
                k7 k7Var = (k7) this.f89c;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.f88b;
                yw ywVar2 = (yw) this.d;
                if (arrayList.isEmpty()) {
                    return false;
                }
                long j10 = ((xr) arrayList.get(0)).f26520a;
                Long l10 = (Long) org.telegram.messenger.d4.f(k7Var.f28621a).f21985r.get(tL_starGiftUnique.slug);
                if (l10 != null) {
                    j3 = l10.longValue();
                } else {
                    j3 = 0;
                }
                if (j3 != 0 && j3 != j10) {
                    v4.k0(k7Var.getContext(), k7Var.I0, k7Var.f28621a, tL_starGiftUnique, j3, new w2(k7Var, j10, tL_starGiftUnique, ywVar2, 1));
                } else {
                    org.telegram.messenger.d4.f(k7Var.f28621a).s(j10, new ig.b(null, tL_starGiftUnique.slug), null, true);
                    ywVar2.presentFragment(cn.ta(j10), true);
                }
                return true;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f89c;
                TL_keyboard.TL_inlineButtonTypeSwitchInline tL_inlineButtonTypeSwitchInline = (TL_keyboard.TL_inlineButtonTypeSwitchInline) this.d;
                cn cnVar = chatActivityEnterView.P2;
                TLRPC.Message message = ((ij) this.f88b).f23262k;
                long j11 = message.from_id.user_id;
                long j12 = message.via_bot_id;
                if (j12 != 0) {
                    j11 = j12;
                }
                if (qp.s1(chatActivityEnterView.R.f21765a).a2(Long.valueOf(j11)) == null) {
                    ywVar.finishFragment();
                } else {
                    long j13 = ((xr) arrayList.get(0)).f26520a;
                    ui.b0(chatActivityEnterView.Q).Q1(j13, 0, "@" + t10.n(a22) + " " + tL_inlineButtonTypeSwitchInline.query, null, null, null, null, 0L, true, false, null);
                    if (j13 != chatActivityEnterView.Q2) {
                        if (!m5.C(j13)) {
                            Bundle bundle = new Bundle();
                            if (m5.E(j13)) {
                                bundle.putLong("user_id", j13);
                            } else {
                                bundle.putLong("chat_id", -j13);
                            }
                            if (qp.s1(chatActivityEnterView.R.f21765a).E(bundle, ywVar, null, null)) {
                                if (cnVar.presentFragment(new cn(bundle), true)) {
                                    if (!g0.Q1()) {
                                        cnVar.removeSelfFromStack();
                                    }
                                } else {
                                    ywVar.finishFragment();
                                }
                            }
                        } else {
                            ywVar.finishFragment();
                        }
                    } else {
                        ywVar.finishFragment();
                    }
                }
                return true;
        }
    }

    public h(Object obj, Object obj2, Object obj3, int i7) {
        this.f87a = i7;
        this.f89c = obj;
        this.f88b = obj2;
        this.d = obj3;
    }

    public h(Object obj, Object obj2, String str, int i7) {
        this.f87a = i7;
        this.f89c = obj;
        this.d = obj2;
        this.f88b = str;
    }

    @Override
    public Task then(Object obj) {
        String d;
        FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f89c;
        String str = (String) this.f88b;
        c0 c0Var = (c0) this.d;
        String str2 = (String) obj;
        d0 c10 = FirebaseMessaging.c(firebaseMessaging.f7888b);
        o9.g gVar = firebaseMessaging.f7887a;
        gVar.a();
        if ("[DEFAULT]".equals(gVar.f20876b)) {
            d = "";
        } else {
            d = gVar.d();
        }
        String a10 = firebaseMessaging.f7893i.a();
        synchronized (c10) {
            String a11 = c0.a(System.currentTimeMillis(), str2, a10);
            if (a11 != null) {
                SharedPreferences.Editor edit = c10.f918a.edit();
                edit.putString(d + "|T|" + str + "|*", a11);
                edit.commit();
            }
        }
        if (firebaseMessaging.d.r() || c0Var == null || !str2.equals(c0Var.f911a)) {
            o9.g gVar2 = firebaseMessaging.f7887a;
            gVar2.a();
            String str3 = gVar2.f20876b;
            if ("[DEFAULT]".equals(str3)) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    StringBuilder sb2 = new StringBuilder("Invoking onNewToken for app: ");
                    gVar2.a();
                    sb2.append(str3);
                    Log.d("FirebaseMessaging", sb2.toString());
                }
                boolean r10 = firebaseMessaging.d.r();
                Intent intent = new Intent();
                intent.putExtra("token", str2);
                if (r10) {
                    intent.setAction("com.google.firebase.messaging.FCM_REGISTERED");
                } else {
                    intent.setAction("com.google.firebase.messaging.NEW_TOKEN");
                }
                new ab.k(firebaseMessaging.f7888b).b(intent);
            }
        }
        return Tasks.forResult(str2);
    }
}
