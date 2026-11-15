package a3;

import ab.d0;
import ai.h1;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseIntArray;
import android.widget.TextView;
import androidx.car.app.FailureResponse;
import androidx.car.app.IOnDoneCallback;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import di.c6;
import di.f2;
import e2.m1;
import fi.b4;
import fi.d9;
import fi.t3;
import h9.f0;
import h9.i0;
import h9.s1;
import hi.o1;
import hi.o8;
import hi.q8;
import hi.x1;
import hi.y1;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kg.x0;
import ki.s2;
import ki.y3;
import oi.d2;
import oi.j1;
import oi.n3;
import oi.q3;
import oi.z1;
import oi.z3;
import org.telegram.messenger.a8;
import org.telegram.messenger.d4;
import org.telegram.messenger.ez;
import org.telegram.messenger.g0;
import org.telegram.messenger.gj;
import org.telegram.messenger.h6;
import org.telegram.messenger.j6;
import org.telegram.messenger.m5;
import org.telegram.messenger.np;
import org.telegram.messenger.oi;
import org.telegram.messenger.ou;
import org.telegram.messenger.pi;
import org.telegram.messenger.q10;
import org.telegram.messenger.si;
import org.telegram.messenger.t0;
import org.telegram.messenger.tr;
import org.telegram.messenger.ur;
import org.telegram.messenger.z10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.l0;
import org.telegram.ui.ActionBar.q1;
import org.telegram.ui.ActionBar.t1;
import org.telegram.ui.ActionBar.u2;
import org.telegram.ui.Cells.c2;
import org.telegram.ui.Cells.n7;
import org.telegram.ui.Cells.y0;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.a4;
import org.telegram.ui.Components.cl;
import org.telegram.ui.Components.dl;
import org.telegram.ui.Components.gb0;
import org.telegram.ui.Components.ib0;
import org.telegram.ui.Components.jn;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.nb0;
import org.telegram.ui.Components.qk;
import org.telegram.ui.Components.r4;
import org.telegram.ui.Components.s3;
import org.telegram.ui.Components.t4;
import org.telegram.ui.Components.zi0;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.an;
import org.telegram.ui.il0;
import org.telegram.ui.sw;
import org.telegram.ui.u91;
import org.telegram.ui.v7;
import org.telegram.ui.yw;
public final class h implements p, SuccessContinuation, h1, androidx.car.app.utils.c, Continuation, sw, tr, d9, OnFailureListener, pi, q1, il0, cl, l0, gb0, r4 {
    public final int f87a;
    public final Object f88b;
    public final Object f89c;
    public final Object d;

    public h(g1.a aVar, CancellationSignal cancellationSignal, Executor executor, v0.g gVar) {
        this.f87a = 9;
        this.f89c = cancellationSignal;
        this.f88b = executor;
        this.d = gVar;
    }

    @Override
    public boolean H() {
        switch (this.f87a) {
            case 6:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void L(int i7, int i10, boolean z10) {
        switch (this.f87a) {
            case 28:
                dl dlVar = (dl) this.f89c;
                dlVar.f33988o0.d((TLRPC.TL_messageMediaGeo) this.f88b, dlVar.f33989p0, z10, i7, ((Long) this.d).longValue());
                dlVar.f33607b.a(true);
                return;
            default:
                jn jnVar = (jn) this.f89c;
                jnVar.f36092k0.c((TLRPC.TL_messageMediaToDo) this.f88b, null, null, null, z10, i7, ((Long) this.d).longValue());
                jnVar.f33607b.a(true);
                return;
        }
    }

    @Override
    public boolean P(yw ywVar) {
        switch (this.f87a) {
            case 6:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void a(String str) {
        t3 t3Var = (t3) this.f89c;
        b4 b4Var = t3Var.f12360x;
        b4Var.getStoriesController().r(b4Var.l1, str, new bi.j(t3Var, (TL_stories.StoryItem) this.f88b, (e6) this.d, 5));
    }

    @Override
    public void b(long j3, long j10) {
        ai.s sVar = (ai.s) this.f89c;
        long[] jArr = (long[]) this.d;
        long[] jArr2 = (long[]) DictationAsr.h.get((String) this.f88b);
        if (jArr2 != null) {
            jArr2[0] = j3;
            if (j10 > 0) {
                jArr2[1] = j10;
            }
        }
        if (j10 > 0) {
            if (sVar != null) {
                sVar.f1536i = Math.min(1.0f, ((float) j3) / ((float) j10));
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (elapsedRealtime - jArr[0] > 100) {
                jArr[0] = elapsedRealtime;
                DictationAsr.o();
            }
        }
    }

    @Override
    public void c(String str, ArrayList arrayList) {
        int i7;
        int i10;
        ArrayList<TLRPC.Document> arrayList2;
        int i11;
        ArrayList arrayList3;
        boolean z10;
        ArrayList arrayList4;
        ArrayList arrayList5 = arrayList;
        x1 x1Var = (x1) this.f89c;
        si siVar = (si) this.d;
        ArrayList arrayList6 = x1Var.h;
        SparseIntArray sparseIntArray = x1Var.E;
        ArrayList arrayList7 = x1Var.f15318n;
        y1 y1Var = x1Var.O;
        ArrayList arrayList8 = x1Var.f15321w;
        HashSet hashSet = x1Var.M;
        ArrayList arrayList9 = x1Var.f15320s;
        if (!TextUtils.equals((String) this.f88b, x1Var.I)) {
            return;
        }
        ArrayList j3 = j6.j(x1Var.I, null);
        int i12 = 0;
        for (int i13 = 0; i13 < j3.size(); i13++) {
            try {
                ?? obj = new Object();
                obj.f25764a = ((h6) j3.get(i13)).f24059c.toString();
                arrayList5.add(obj);
            } catch (Exception unused) {
            }
        }
        x1Var.f15323y = 0;
        arrayList9.clear();
        arrayList8.clear();
        sparseIntArray.clear();
        arrayList7.clear();
        int i14 = 1;
        x1Var.f15323y++;
        arrayList9.add(null);
        arrayList8.add(0L);
        if (y1Var.f15179a == 0) {
            hashSet.clear();
            for (int i15 = 0; i15 < arrayList5.size(); i15++) {
                oi oiVar = (oi) arrayList5.get(i15);
                String str2 = oiVar.f25764a;
                if (str2 != null && !str2.startsWith("animated_") && (arrayList4 = (ArrayList) x1Var.d.get(oiVar.f25764a)) != null) {
                    hashSet.addAll(arrayList4);
                }
            }
            arrayList8.addAll(hashSet);
            for (int i16 = 0; i16 < hashSet.size(); i16++) {
                arrayList9.add(null);
            }
            x1Var.f15323y = hashSet.size() + x1Var.f15323y;
            i7 = 1;
            i10 = 0;
        } else {
            HashMap hashMap = siVar.f26470e0;
            int i17 = 0;
            while (i17 < arrayList5.size()) {
                oi oiVar2 = (oi) arrayList5.get(i17);
                int i18 = i12;
                String str3 = oiVar2.f25764a;
                if (str3 == null || str3.startsWith("animated_") || (arrayList3 = (ArrayList) hashMap.get(oiVar2.f25764a)) == null || arrayList3.isEmpty()) {
                    i11 = i14;
                } else {
                    i11 = i14;
                    for (int i19 = i18; i19 < arrayList3.size(); i19++) {
                        TLRPC.Document document = (TLRPC.Document) arrayList3.get(i19);
                        if (document != null && !arrayList9.contains(document)) {
                            arrayList9.add(document);
                            x1Var.f15323y++;
                        }
                    }
                }
                i17++;
                i12 = i18;
                i14 = i11;
            }
            i7 = i14;
            i10 = i12;
            ArrayList arrayList10 = siVar.f26501t0[i10];
            int i20 = i10;
            while (i20 < arrayList5.size()) {
                oi oiVar3 = (oi) arrayList5.get(i20);
                String str4 = oiVar3.f25764a;
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
                            String V = gj.V(arrayList2.get(i22), null, null);
                            if (V != null && V.contains(oiVar3.f25764a)) {
                                arrayList9.add(arrayList2.get(i22));
                                x1Var.f15323y++;
                            }
                        }
                    }
                }
                i20++;
                arrayList5 = arrayList;
            }
        }
        String N3 = g0.N3((x1Var.I + "").toLowerCase());
        for (int i23 = i10; i23 < arrayList6.size(); i23++) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList6.get(i23);
            if (tL_messages_stickerSet != null && tL_messages_stickerSet.set != null) {
                String N32 = g0.N3((tL_messages_stickerSet.set.title + "").toLowerCase());
                if (N32.startsWith(N3) || N32.contains(" ".concat(N3))) {
                    int size = arrayList7.size();
                    arrayList7.add(tL_messages_stickerSet);
                    sparseIntArray.put(x1Var.f15323y, size);
                    arrayList9.add(null);
                    x1Var.f15323y++;
                    arrayList9.addAll(tL_messages_stickerSet.documents);
                    x1Var.f15323y = tL_messages_stickerSet.documents.size() + x1Var.f15323y;
                }
            }
        }
        int i24 = i7;
        if (arrayList8.size() <= i24 && arrayList9.size() <= i24) {
            z10 = i24;
        } else {
            z10 = i10;
        }
        x1Var.f15322x = z10;
        if (z10 != 0) {
            x1Var.f15323y += i24;
        }
        if (z10 == 0) {
            x1Var.L += i24;
        }
        x1Var.J = x1Var.I;
        x1Var.f();
        boolean z11 = i10;
        o1.z1(y1Var.f15408b, z11 ? 1 : 0, z11 ? 1 : 0);
        y1Var.f15411f.c(z11);
        y1Var.f15410e.n(z11);
    }

    @Override
    public void call() {
        w.b bVar;
        switch (this.f87a) {
            case 3:
                IOnDoneCallback iOnDoneCallback = (IOnDoneCallback) this.f89c;
                String str = (String) this.f88b;
                Object obj = this.d;
                if (obj == null) {
                    bVar = null;
                } else {
                    try {
                        bVar = new w.b(obj);
                    } catch (w.f e10) {
                        androidx.car.app.utils.h.f(iOnDoneCallback, str, e10);
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
    public void d(TLRPC.MessageMedia messageMedia, int i7, boolean z10, int i10, long j3) {
        switch (this.f87a) {
            case 15:
                oi.o oVar = (oi.o) this.f89c;
                oi.a aVar = (oi.a) this.f88b;
                ki kiVar = (ki) this.d;
                q3 q3Var = oVar.f21848r;
                if (messageMedia != null && messageMedia.geo != null) {
                    d2 d2Var = q3Var.R3;
                    if (d2Var != null) {
                        d2Var.d();
                    }
                    TL_iv.pageBlockMap pageblockmap = (TL_iv.pageBlockMap) aVar.f21544b;
                    pageblockmap.geo = messageMedia.geo;
                    pageblockmap.zoom = 15;
                    if (pageblockmap.f28276w <= 0 || pageblockmap.h <= 0) {
                        pageblockmap.f28276w = 600;
                        pageblockmap.h = 400;
                    }
                    d2 d2Var2 = q3Var.R3;
                    if (d2Var2 != null) {
                        d2Var2.h();
                    }
                    oVar.a0(true);
                    kiVar.a(true);
                    q3Var.post(new oi.f(oVar, aVar, 0));
                    return;
                }
                return;
            default:
                z1 z1Var = (z1) this.f89c;
                oi.a aVar2 = (oi.a) this.f88b;
                ki kiVar2 = (ki) this.d;
                if (messageMedia != null && messageMedia.geo != null) {
                    d2 d2Var3 = z1Var.Q.R3;
                    if (d2Var3 != null) {
                        d2Var3.d();
                    }
                    TL_iv.pageBlockMap pageblockmap2 = (TL_iv.pageBlockMap) aVar2.f21544b;
                    pageblockmap2.geo = messageMedia.geo;
                    pageblockmap2.zoom = 15;
                    if (pageblockmap2.f28276w <= 0 || pageblockmap2.h <= 0) {
                        pageblockmap2.f28276w = 600;
                        pageblockmap2.h = 400;
                    }
                    d2 d2Var4 = z1Var.Q.R3;
                    if (d2Var4 != null) {
                        d2Var4.h();
                    }
                    kiVar2.a(true);
                    z1Var.Q.post(new j1(z1Var, aVar2, 9));
                    return;
                }
                return;
        }
    }

    @Override
    public void e(int i7) {
        switch (this.f87a) {
            case 14:
                s2 s2Var = (s2) this.f89c;
                nb0 nb0Var = (nb0) this.d;
                String str = (String) this.f88b;
                if (i7 != 3) {
                    nb0Var.dismiss();
                }
                s2Var.d.E.G(str, y0.B(i7).toLowerCase(Locale.ROOT), false);
                return;
            default:
                nb0 nb0Var2 = (nb0) this.f89c;
                y3 y3Var = (y3) this.d;
                String str2 = (String) this.f88b;
                if (i7 != 3) {
                    nb0Var2.dismiss();
                }
                y3Var.getWebViewContainer().G(str2, y0.B(i7).toLowerCase(Locale.ROOT), false);
                return;
        }
    }

    @Override
    public s1 f(int i7, m1 m1Var, int[] iArr) {
        n nVar = (n) this.f89c;
        String str = (String) this.f88b;
        String str2 = (String) this.d;
        f0 p10 = i0.p();
        for (int i10 = 0; i10 < m1Var.f10209a; i10++) {
            p10.c(new o(i7, m1Var, i10, nVar, iArr[i10], str, str2));
        }
        return p10.f();
    }

    @Override
    public void g(int i7) {
        r4 r4Var = (r4) this.f89c;
        boolean[] zArr = (boolean[]) this.f88b;
        ou ouVar = (ou) this.d;
        if (i7 == 1) {
            r4Var.L(2147483646, 0, zArr[0]);
            ((u2) ouVar.f25804b).f29724y0.run();
        }
    }

    @Override
    public void h(t1 t1Var, int i7) {
        switch (this.f87a) {
            case 11:
                ((q8) this.f89c).N0((o8) this.f88b, (Runnable) this.d, true);
                return;
            case 12:
                jg.h1 h1Var = (jg.h1) this.f89c;
                TLRPC.User user = (TLRPC.User) this.d;
                h1Var.getClass();
                ((boolean[]) this.f88b)[0] = true;
                if (user != null) {
                    SharedPreferences.Editor edit = np.s1(h1Var.f17124f).f25270e7.edit();
                    edit.putBoolean("inlinegeo_" + user.f28200id, true).commit();
                    h1Var.G();
                    return;
                }
                return;
            case 13:
                Activity activity = (Activity) this.f89c;
                boolean[] zArr = (boolean[]) this.f88b;
                org.telegram.ui.web.o oVar = (org.telegram.ui.web.o) this.d;
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + t0.f26600b.getPackageName()));
                    activity.startActivity(intent);
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
                zArr[0] = true;
                Boolean bool = Boolean.FALSE;
                oVar.a(bool, bool);
                return;
            case 17:
                z3 z3Var = (z3) this.d;
                String trim = ((EditTextBoldCursor) this.f89c).getText().toString().trim();
                String trim2 = ((EditTextBoldCursor) this.f88b).getText().toString().trim();
                if (!TextUtils.isEmpty(trim) && !TextUtils.isEmpty(trim2)) {
                    int i10 = z3Var.f22193a;
                    n3 n3Var = z3Var.f22194b;
                    switch (i10) {
                        case 1:
                            TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = new TL_keyboard.TL_inlineButtonTypeUrl();
                            tL_inlineButtonTypeUrl.url = trim2;
                            n3Var.a(trim, tL_inlineButtonTypeUrl);
                            return;
                        default:
                            TL_keyboard.TL_inlineButtonTypeCopy tL_inlineButtonTypeCopy = new TL_keyboard.TL_inlineButtonTypeCopy();
                            tL_inlineButtonTypeCopy.copy_text = trim2;
                            n3Var.a(trim, tL_inlineButtonTypeCopy);
                            return;
                    }
                }
                return;
            case 18:
                ((boolean[]) this.f89c)[0] = true;
                ((z10) this.f88b).a(Boolean.FALSE);
                ((t1[]) this.d)[0].dismiss();
                return;
            case 22:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f89c;
                gj gjVar = (gj) this.f88b;
                TL_keyboard.KeyboardButtonProto keyboardButtonProto = (TL_keyboard.KeyboardButtonProto) this.d;
                Activity activity2 = chatActivityEnterView.f32311w3;
                if (activity2.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
                    activity2.requestPermissions(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, 2);
                    chatActivityEnterView.Q3 = gjVar;
                    chatActivityEnterView.R3 = keyboardButtonProto;
                    return;
                }
                ez.C(chatActivityEnterView.R).o0(gjVar, keyboardButtonProto);
                return;
            case 25:
                ki kiVar = (ki) this.f89c;
                TLRPC.TL_attachMenuBot tL_attachMenuBot = (TLRPC.TL_attachMenuBot) this.f88b;
                TLRPC.User user2 = (TLRPC.User) this.d;
                int i11 = kiVar.H3;
                if (tL_attachMenuBot != null) {
                    TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
                    tL_messages_toggleBotInAttachMenu.bot = np.s1(i11).q1(user2);
                    tL_messages_toggleBotInAttachMenu.enabled = false;
                    ConnectionsManager.getInstance(i11).sendRequest(tL_messages_toggleBotInAttachMenu, new v7(13, kiVar, tL_attachMenuBot), 66);
                    return;
                }
                si.b0(i11).L1(user2.f28200id);
                return;
            default:
                qk qkVar = (qk) this.f89c;
                x0 x0Var = (x0) this.f88b;
                c2 c2Var = (c2) this.d;
                TextView textView = qkVar.V;
                String str = null;
                if (x0Var.getText().toString().getBytes(StandardCharsets.UTF_8).length > 960) {
                    int i12 = -qkVar.f38691w0;
                    qkVar.f38691w0 = i12;
                    g0.F3(i12, x0Var, null);
                    return;
                }
                String trim3 = x0Var.getText().toString().trim();
                if (!TextUtils.isEmpty(trim3)) {
                    str = trim3;
                }
                qkVar.f38687t0 = str;
                qkVar.f38688u0 = !c2Var.b();
                if (TextUtils.isEmpty(qkVar.f38687t0)) {
                    textView.setVisibility(8);
                } else {
                    textView.setText(qkVar.f38687t0);
                    textView.setVisibility(0);
                }
                qkVar.k0();
                t1Var.dismiss();
                qkVar.a0();
                return;
        }
    }

    @Override
    public void m(ib0 ib0Var, int i7) {
        switch (this.f87a) {
            case 20:
                t4.g(null, null, 0L, 0L, 0, (ib0) this.f89c, (a4) this.f88b, (org.telegram.ui.Components.b4) this.d);
                return;
            default:
                t4.g(null, null, 0L, 0L, 0, (ib0) this.f89c, (s3) this.f88b, (org.telegram.ui.Components.t3) this.d);
                return;
        }
    }

    @Override
    public void o(Canvas canvas, RectF rectF, float f10) {
        n7 n7Var = (n7) this.f89c;
        zi0 zi0Var = (zi0) this.f88b;
        int[] iArr = (int[]) this.d;
        n7Var.c(canvas, rectF, f10);
        n7Var.f(canvas, rectF, f10);
        if (n7Var.h) {
            n7Var.b(canvas, rectF, f10);
        } else {
            n7Var.e(canvas, rectF, f10);
        }
        if (zi0Var != null && zi0Var.f42371b0 && zi0Var.getVisibility() == 0) {
            canvas.saveLayerAlpha(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), (int) (f10 * 255.0f), 31);
            canvas.translate(iArr[0], iArr[1]);
            zi0Var.draw(canvas);
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
            } else if (b1.d.f2852b.contains(Integer.valueOf(statusCode))) {
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
    public boolean y(yw ywVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i7, int i10, u91 u91Var) {
        long j3;
        TLRPC.User a22;
        switch (this.f87a) {
            case 6:
                c6 c6Var = (c6) this.f89c;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.f88b;
                yw ywVar2 = (yw) this.d;
                if (arrayList.isEmpty()) {
                    return false;
                }
                long j10 = ((ur) arrayList.get(0)).f26860a;
                Long l10 = (Long) d4.f(c6Var.f29679a).f23030r.get(tL_starGiftUnique.slug);
                if (l10 != null) {
                    j3 = l10.longValue();
                } else {
                    j3 = 0;
                }
                if (j3 != 0 && j3 != j10) {
                    t4.k0(c6Var.getContext(), c6Var.J0, c6Var.f29679a, tL_starGiftUnique, j3, new f2(c6Var, j10, tL_starGiftUnique, ywVar2, 1));
                } else {
                    d4.f(c6Var.f29679a).s(j10, new ig.b(null, tL_starGiftUnique.slug), null, true);
                    ywVar2.presentFragment(an.ua(j10), true);
                }
                return true;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f89c;
                TL_keyboard.TL_inlineButtonTypeSwitchInline tL_inlineButtonTypeSwitchInline = (TL_keyboard.TL_inlineButtonTypeSwitchInline) this.d;
                an anVar = chatActivityEnterView.f32319x3;
                TLRPC.Message message = ((gj) this.f88b).f23817k;
                long j11 = message.from_id.user_id;
                long j12 = message.via_bot_id;
                if (j12 != 0) {
                    j11 = j12;
                }
                if (np.s1(chatActivityEnterView.S.f22778a).a2(Long.valueOf(j11)) == null) {
                    ywVar.finishFragment();
                } else {
                    long j13 = ((ur) arrayList.get(0)).f26860a;
                    si.b0(chatActivityEnterView.R).Q1(j13, 0, "@" + q10.n(a22) + " " + tL_inlineButtonTypeSwitchInline.query, null, null, null, null, 0L, true, false, null);
                    if (j13 != chatActivityEnterView.f32327y3) {
                        if (!m5.C(j13)) {
                            Bundle bundle = new Bundle();
                            if (m5.E(j13)) {
                                bundle.putLong("user_id", j13);
                            } else {
                                bundle.putLong("chat_id", -j13);
                            }
                            if (np.s1(chatActivityEnterView.S.f22778a).E(bundle, ywVar, null, null)) {
                                if (anVar.presentFragment(new an(bundle), true)) {
                                    if (!g0.Q1()) {
                                        anVar.removeSelfFromStack();
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

    public h(String str, ai.s sVar, long[] jArr) {
        this.f87a = 2;
        this.f88b = str;
        this.f89c = sVar;
        this.d = jArr;
    }

    @Override
    public Task then(Object obj) {
        String d;
        FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f89c;
        String str = (String) this.f88b;
        d0 d0Var = (d0) this.d;
        String str2 = (String) obj;
        ob.c c10 = FirebaseMessaging.c(firebaseMessaging.f7277b);
        o9.g gVar = firebaseMessaging.f7276a;
        gVar.a();
        if ("[DEFAULT]".equals(gVar.f21398b)) {
            d = "";
        } else {
            d = gVar.d();
        }
        String a10 = firebaseMessaging.f7282i.a();
        synchronized (c10) {
            String a11 = d0.a(System.currentTimeMillis(), str2, a10);
            if (a11 != null) {
                SharedPreferences.Editor edit = ((SharedPreferences) c10.f21417b).edit();
                edit.putString(d + "|T|" + str + "|*", a11);
                edit.commit();
            }
        }
        if (firebaseMessaging.d.t() || d0Var == null || !str2.equals(d0Var.f915a)) {
            o9.g gVar2 = firebaseMessaging.f7276a;
            gVar2.a();
            String str3 = gVar2.f21398b;
            if ("[DEFAULT]".equals(str3)) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    StringBuilder sb2 = new StringBuilder("Invoking onNewToken for app: ");
                    gVar2.a();
                    sb2.append(str3);
                    Log.d("FirebaseMessaging", sb2.toString());
                }
                boolean t6 = firebaseMessaging.d.t();
                Intent intent = new Intent();
                intent.putExtra("token", str2);
                if (t6) {
                    intent.setAction("com.google.firebase.messaging.FCM_REGISTERED");
                } else {
                    intent.setAction("com.google.firebase.messaging.NEW_TOKEN");
                }
                new ab.k(firebaseMessaging.f7277b).b(intent);
            }
        }
        return Tasks.forResult(str2);
    }
}
