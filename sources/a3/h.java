package a3;

import ab.d0;
import ai.g1;
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
import di.f6;
import di.j2;
import e2.m1;
import fi.a9;
import fi.r3;
import fi.z3;
import h9.f0;
import h9.i0;
import h9.s1;
import hi.f2;
import hi.g2;
import hi.i9;
import hi.k9;
import hi.w1;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import jg.h1;
import kg.z0;
import ki.o2;
import oi.b2;
import oi.c4;
import oi.l1;
import oi.q3;
import oi.t3;
import org.telegram.messenger.a8;
import org.telegram.messenger.f4;
import org.telegram.messenger.fj;
import org.telegram.messenger.g0;
import org.telegram.messenger.h6;
import org.telegram.messenger.j6;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.messenger.n5;
import org.telegram.messenger.ni;
import org.telegram.messenger.oi;
import org.telegram.messenger.ri;
import org.telegram.messenger.rr;
import org.telegram.messenger.sr;
import org.telegram.messenger.t0;
import org.telegram.messenger.w10;
import org.telegram.messenger.zy;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.l0;
import org.telegram.ui.ActionBar.q1;
import org.telegram.ui.ActionBar.t1;
import org.telegram.ui.ActionBar.w2;
import org.telegram.ui.Cells.c0;
import org.telegram.ui.Cells.d2;
import org.telegram.ui.Cells.o7;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.a4;
import org.telegram.ui.Components.b4;
import org.telegram.ui.Components.b5;
import org.telegram.ui.Components.i4;
import org.telegram.ui.Components.j4;
import org.telegram.ui.Components.jj0;
import org.telegram.ui.Components.jl;
import org.telegram.ui.Components.kl;
import org.telegram.ui.Components.ob0;
import org.telegram.ui.Components.qb0;
import org.telegram.ui.Components.qn;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.wb0;
import org.telegram.ui.Components.xk;
import org.telegram.ui.Components.z4;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.bn;
import org.telegram.ui.bx;
import org.telegram.ui.jl0;
import org.telegram.ui.v7;
import org.telegram.ui.vw;
import org.telegram.ui.w91;
public final class h implements p, SuccessContinuation, g1, androidx.car.app.utils.b, Continuation, vw, rr, a9, OnFailureListener, oi, q1, jl0, jl, l0, ob0, z4 {
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
    public boolean F() {
        switch (this.f87a) {
            case 6:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void I(int i7, int i10, boolean z10) {
        switch (this.f87a) {
            case 28:
                kl klVar = (kl) this.f89c;
                klVar.f36786o0.d((TLRPC.TL_messageMediaGeo) this.f88b, klVar.f36787p0, z10, i7, ((Long) this.d).longValue());
                klVar.f37135b.a(true);
                return;
            default:
                qn qnVar = (qn) this.f89c;
                qnVar.f38929k0.c((TLRPC.TL_messageMediaToDo) this.f88b, null, null, null, z10, i7, ((Long) this.d).longValue());
                qnVar.f37135b.a(true);
                return;
        }
    }

    @Override
    public boolean O(bx bxVar) {
        switch (this.f87a) {
            case 6:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void a(String str) {
        r3 r3Var = (r3) this.f89c;
        z3 z3Var = r3Var.f12494x;
        z3Var.getStoriesController().r(z3Var.l1, str, new bi.j(r3Var, (TL_stories.StoryItem) this.f88b, (i6) this.d, 8));
    }

    @Override
    public void b(long j3, long j10) {
        ai.q qVar = (ai.q) this.f89c;
        long[] jArr = (long[]) this.d;
        long[] jArr2 = (long[]) DictationAsr.h.get((String) this.f88b);
        if (jArr2 != null) {
            jArr2[0] = j3;
            if (j10 > 0) {
                jArr2[1] = j10;
            }
        }
        if (j10 > 0) {
            if (qVar != null) {
                qVar.f1462k = Math.min(1.0f, ((float) j3) / ((float) j10));
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (elapsedRealtime - jArr[0] > 100) {
                jArr[0] = elapsedRealtime;
                DictationAsr.q();
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
        f2 f2Var = (f2) this.f89c;
        ri riVar = (ri) this.d;
        ArrayList arrayList6 = f2Var.h;
        SparseIntArray sparseIntArray = f2Var.E;
        ArrayList arrayList7 = f2Var.f14423n;
        g2 g2Var = f2Var.O;
        ArrayList arrayList8 = f2Var.f14426w;
        HashSet hashSet = f2Var.M;
        ArrayList arrayList9 = f2Var.f14425s;
        if (!TextUtils.equals((String) this.f88b, f2Var.I)) {
            return;
        }
        ArrayList j3 = j6.j(f2Var.I, null);
        int i12 = 0;
        for (int i13 = 0; i13 < j3.size(); i13++) {
            try {
                ?? obj = new Object();
                obj.f26023a = ((h6) j3.get(i13)).f24489c.toString();
                arrayList5.add(obj);
            } catch (Exception unused) {
            }
        }
        f2Var.f14428y = 0;
        arrayList9.clear();
        arrayList8.clear();
        sparseIntArray.clear();
        arrayList7.clear();
        int i14 = 1;
        f2Var.f14428y++;
        arrayList9.add(null);
        arrayList8.add(0L);
        if (g2Var.f14262a == 0) {
            hashSet.clear();
            for (int i15 = 0; i15 < arrayList5.size(); i15++) {
                ni niVar = (ni) arrayList5.get(i15);
                String str2 = niVar.f26023a;
                if (str2 != null && !str2.startsWith("animated_") && (arrayList4 = (ArrayList) f2Var.d.get(niVar.f26023a)) != null) {
                    hashSet.addAll(arrayList4);
                }
            }
            arrayList8.addAll(hashSet);
            for (int i16 = 0; i16 < hashSet.size(); i16++) {
                arrayList9.add(null);
            }
            f2Var.f14428y = hashSet.size() + f2Var.f14428y;
            i7 = 1;
            i10 = 0;
        } else {
            HashMap hashMap = riVar.f26709e0;
            int i17 = 0;
            while (i17 < arrayList5.size()) {
                ni niVar2 = (ni) arrayList5.get(i17);
                int i18 = i12;
                String str3 = niVar2.f26023a;
                if (str3 == null || str3.startsWith("animated_") || (arrayList3 = (ArrayList) hashMap.get(niVar2.f26023a)) == null || arrayList3.isEmpty()) {
                    i11 = i14;
                } else {
                    i11 = i14;
                    for (int i19 = i18; i19 < arrayList3.size(); i19++) {
                        TLRPC.Document document = (TLRPC.Document) arrayList3.get(i19);
                        if (document != null && !arrayList9.contains(document)) {
                            arrayList9.add(document);
                            f2Var.f14428y++;
                        }
                    }
                }
                i17++;
                i12 = i18;
                i14 = i11;
            }
            i7 = i14;
            i10 = i12;
            ArrayList arrayList10 = riVar.f26740t0[i10];
            int i20 = i10;
            while (i20 < arrayList5.size()) {
                ni niVar3 = (ni) arrayList5.get(i20);
                String str4 = niVar3.f26023a;
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
                            String V = fj.V(arrayList2.get(i22), null, null);
                            if (V != null && V.contains(niVar3.f26023a)) {
                                arrayList9.add(arrayList2.get(i22));
                                f2Var.f14428y++;
                            }
                        }
                    }
                }
                i20++;
                arrayList5 = arrayList;
            }
        }
        String M3 = g0.M3((f2Var.I + "").toLowerCase());
        for (int i23 = i10; i23 < arrayList6.size(); i23++) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList6.get(i23);
            if (tL_messages_stickerSet != null && tL_messages_stickerSet.set != null) {
                String M32 = g0.M3((tL_messages_stickerSet.set.title + "").toLowerCase());
                if (M32.startsWith(M3) || M32.contains(" ".concat(M3))) {
                    int size = arrayList7.size();
                    arrayList7.add(tL_messages_stickerSet);
                    sparseIntArray.put(f2Var.f14428y, size);
                    arrayList9.add(null);
                    f2Var.f14428y++;
                    arrayList9.addAll(tL_messages_stickerSet.documents);
                    f2Var.f14428y = tL_messages_stickerSet.documents.size() + f2Var.f14428y;
                }
            }
        }
        int i24 = i7;
        if (arrayList8.size() <= i24 && arrayList9.size() <= i24) {
            z10 = i24;
        } else {
            z10 = i10;
        }
        f2Var.f14427x = z10;
        if (z10 != 0) {
            f2Var.f14428y += i24;
        }
        if (z10 == 0) {
            f2Var.L += i24;
        }
        f2Var.J = f2Var.I;
        f2Var.f();
        boolean z11 = i10;
        w1.z1(g2Var.f14520b, z11 ? 1 : 0, z11 ? 1 : 0);
        g2Var.f14523f.c(z11);
        g2Var.f14522e.n(z11);
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
    public void d(TLRPC.MessageMedia messageMedia, int i7, boolean z10, int i10, long j3) {
        switch (this.f87a) {
            case 15:
                oi.p pVar = (oi.p) this.f89c;
                oi.a aVar = (oi.a) this.f88b;
                ti tiVar = (ti) this.d;
                t3 t3Var = pVar.f22367r;
                if (messageMedia != null && messageMedia.geo != null) {
                    oi.g2 g2Var = t3Var.R3;
                    if (g2Var != null) {
                        g2Var.d();
                    }
                    TL_iv.pageBlockMap pageblockmap = (TL_iv.pageBlockMap) aVar.f22001b;
                    pageblockmap.geo = messageMedia.geo;
                    pageblockmap.zoom = 15;
                    if (pageblockmap.f28717w <= 0 || pageblockmap.h <= 0) {
                        pageblockmap.f28717w = 600;
                        pageblockmap.h = 400;
                    }
                    oi.g2 g2Var2 = t3Var.R3;
                    if (g2Var2 != null) {
                        g2Var2.h();
                    }
                    pVar.a0(true);
                    tiVar.a(true);
                    t3Var.post(new oi.f(pVar, aVar, 0));
                    return;
                }
                return;
            default:
                b2 b2Var = (b2) this.f89c;
                oi.a aVar2 = (oi.a) this.f88b;
                ti tiVar2 = (ti) this.d;
                if (messageMedia != null && messageMedia.geo != null) {
                    oi.g2 g2Var3 = b2Var.Q.R3;
                    if (g2Var3 != null) {
                        g2Var3.d();
                    }
                    TL_iv.pageBlockMap pageblockmap2 = (TL_iv.pageBlockMap) aVar2.f22001b;
                    pageblockmap2.geo = messageMedia.geo;
                    pageblockmap2.zoom = 15;
                    if (pageblockmap2.f28717w <= 0 || pageblockmap2.h <= 0) {
                        pageblockmap2.f28717w = 600;
                        pageblockmap2.h = 400;
                    }
                    oi.g2 g2Var4 = b2Var.Q.R3;
                    if (g2Var4 != null) {
                        g2Var4.h();
                    }
                    tiVar2.a(true);
                    b2Var.Q.post(new l1(b2Var, aVar2, 9));
                    return;
                }
                return;
        }
    }

    @Override
    public void e(int i7) {
        switch (this.f87a) {
            case 14:
                o2 o2Var = (o2) this.f89c;
                wb0 wb0Var = (wb0) this.d;
                String str = (String) this.f88b;
                if (i7 != 3) {
                    wb0Var.dismiss();
                }
                o2Var.d.E.G(str, c0.D(i7).toLowerCase(Locale.ROOT), false);
                return;
            default:
                wb0 wb0Var2 = (wb0) this.f89c;
                ki.t3 t3Var = (ki.t3) this.d;
                String str2 = (String) this.f88b;
                if (i7 != 3) {
                    wb0Var2.dismiss();
                }
                t3Var.getWebViewContainer().G(str2, c0.D(i7).toLowerCase(Locale.ROOT), false);
                return;
        }
    }

    @Override
    public s1 f(int i7, m1 m1Var, int[] iArr) {
        n nVar = (n) this.f89c;
        String str = (String) this.f88b;
        String str2 = (String) this.d;
        f0 p10 = i0.p();
        for (int i10 = 0; i10 < m1Var.f10517a; i10++) {
            p10.c(new o(i7, m1Var, i10, nVar, iArr[i10], str, str2));
        }
        return p10.f();
    }

    @Override
    public void h(int i7) {
        z4 z4Var = (z4) this.f89c;
        boolean[] zArr = (boolean[]) this.f88b;
        h6.o oVar = (h6.o) this.d;
        if (i7 == 1) {
            z4Var.I(2147483646, 0, zArr[0]);
            ((w2) oVar.f13936b).f30268y0.run();
        }
    }

    @Override
    public void i(t1 t1Var, int i7) {
        switch (this.f87a) {
            case 11:
                ((k9) this.f89c).O0((i9) this.f88b, (Runnable) this.d, true);
                return;
            case 12:
                h1 h1Var = (h1) this.f89c;
                TLRPC.User user = (TLRPC.User) this.d;
                h1Var.getClass();
                ((boolean[]) this.f88b)[0] = true;
                if (user != null) {
                    SharedPreferences.Editor edit = mp.u1(h1Var.f17603f).f25753g7.edit();
                    edit.putBoolean("inlinegeo_" + user.f28641id, true).commit();
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
                    intent.setData(Uri.parse("package:" + t0.f27013b.getPackageName()));
                    activity.startActivity(intent);
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
                zArr[0] = true;
                Boolean bool = Boolean.FALSE;
                oVar.a(bool, bool);
                return;
            case 17:
                c4 c4Var = (c4) this.d;
                String trim = ((EditTextBoldCursor) this.f89c).getText().toString().trim();
                String trim2 = ((EditTextBoldCursor) this.f88b).getText().toString().trim();
                if (!TextUtils.isEmpty(trim) && !TextUtils.isEmpty(trim2)) {
                    int i10 = c4Var.f22112a;
                    q3 q3Var = c4Var.f22113b;
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
            case 18:
                ((boolean[]) this.f89c)[0] = true;
                ((w10) this.f88b).a(Boolean.FALSE);
                ((t1[]) this.d)[0].dismiss();
                return;
            case 22:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f89c;
                fj fjVar = (fj) this.f88b;
                TL_keyboard.KeyboardButtonProto keyboardButtonProto = (TL_keyboard.KeyboardButtonProto) this.d;
                Activity activity2 = chatActivityEnterView.E3;
                if (activity2.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
                    activity2.requestPermissions(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, 2);
                    chatActivityEnterView.Y3 = fjVar;
                    chatActivityEnterView.Z3 = keyboardButtonProto;
                    return;
                }
                zy.C(chatActivityEnterView.R).o0(fjVar, keyboardButtonProto);
                return;
            case 25:
                ti tiVar = (ti) this.f89c;
                TLRPC.TL_attachMenuBot tL_attachMenuBot = (TLRPC.TL_attachMenuBot) this.f88b;
                TLRPC.User user2 = (TLRPC.User) this.d;
                int i11 = tiVar.H3;
                if (tL_attachMenuBot != null) {
                    TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
                    tL_messages_toggleBotInAttachMenu.bot = mp.u1(i11).s1(user2);
                    tL_messages_toggleBotInAttachMenu.enabled = false;
                    ConnectionsManager.getInstance(i11).sendRequest(tL_messages_toggleBotInAttachMenu, new v7(13, tiVar, tL_attachMenuBot), 66);
                    return;
                }
                ri.d0(i11).Q1(user2.f28641id);
                return;
            default:
                xk xkVar = (xk) this.f89c;
                z0 z0Var = (z0) this.f88b;
                d2 d2Var = (d2) this.d;
                TextView textView = xkVar.V;
                String str = null;
                if (z0Var.getText().toString().getBytes(StandardCharsets.UTF_8).length > 960) {
                    int i12 = -xkVar.f42084w0;
                    xkVar.f42084w0 = i12;
                    g0.E3(i12, z0Var, null);
                    return;
                }
                String trim3 = z0Var.getText().toString().trim();
                if (!TextUtils.isEmpty(trim3)) {
                    str = trim3;
                }
                xkVar.f42080t0 = str;
                xkVar.f42081u0 = !d2Var.b();
                if (TextUtils.isEmpty(xkVar.f42080t0)) {
                    textView.setVisibility(8);
                } else {
                    textView.setText(xkVar.f42080t0);
                    textView.setVisibility(0);
                }
                xkVar.k0();
                t1Var.dismiss();
                xkVar.a0();
                return;
        }
    }

    @Override
    public void m(Canvas canvas, RectF rectF, float f10) {
        o7 o7Var = (o7) this.f89c;
        jj0 jj0Var = (jj0) this.f88b;
        int[] iArr = (int[]) this.d;
        o7Var.c(canvas, rectF, f10);
        o7Var.f(canvas, rectF, f10);
        if (o7Var.h) {
            o7Var.b(canvas, rectF, f10);
        } else {
            o7Var.e(canvas, rectF, f10);
        }
        if (jj0Var != null && jj0Var.f36426b0 && jj0Var.getVisibility() == 0) {
            canvas.saveLayerAlpha(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), (int) (f10 * 255.0f), 31);
            canvas.translate(iArr[0], iArr[1]);
            jj0Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public void o(qb0 qb0Var, int i7) {
        switch (this.f87a) {
            case 20:
                b5.g(null, null, 0L, 0L, 0, (qb0) this.f89c, (i4) this.f88b, (j4) this.d);
                return;
            default:
                b5.g(null, null, 0L, 0L, 0, (qb0) this.f89c, (a4) this.f88b, (b4) this.d);
                return;
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
            } else if (b1.d.f2818b.contains(Integer.valueOf(statusCode))) {
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
    public boolean z(bx bxVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i7, int i10, w91 w91Var) {
        long j3;
        TLRPC.User c22;
        switch (this.f87a) {
            case 6:
                f6 f6Var = (f6) this.f89c;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.f88b;
                bx bxVar2 = (bx) this.d;
                if (arrayList.isEmpty()) {
                    return false;
                }
                long j10 = ((sr) arrayList.get(0)).f26946a;
                Long l10 = (Long) f4.f(f6Var.f30223a).f23947r.get(tL_starGiftUnique.slug);
                if (l10 != null) {
                    j3 = l10.longValue();
                } else {
                    j3 = 0;
                }
                if (j3 != 0 && j3 != j10) {
                    b5.k0(f6Var.getContext(), f6Var.J0, f6Var.f30223a, tL_starGiftUnique, j3, new j2(f6Var, j10, tL_starGiftUnique, bxVar2, 1));
                } else {
                    f4.f(f6Var.f30223a).s(j10, new ig.b(null, tL_starGiftUnique.slug), null, true);
                    bxVar2.presentFragment(bn.ua(j10), true);
                }
                return true;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f89c;
                TL_keyboard.TL_inlineButtonTypeSwitchInline tL_inlineButtonTypeSwitchInline = (TL_keyboard.TL_inlineButtonTypeSwitchInline) this.d;
                bn bnVar = chatActivityEnterView.F3;
                TLRPC.Message message = ((fj) this.f88b).f24073k;
                long j11 = message.from_id.user_id;
                long j12 = message.via_bot_id;
                if (j12 != 0) {
                    j11 = j12;
                }
                if (mp.u1(chatActivityEnterView.S.f23343a).c2(Long.valueOf(j11)) == null) {
                    bxVar.finishFragment();
                } else {
                    long j13 = ((sr) arrayList.get(0)).f26946a;
                    ri.d0(chatActivityEnterView.R).V1(j13, 0, "@" + n10.o(c22) + " " + tL_inlineButtonTypeSwitchInline.query, null, null, null, null, 0L, true, false, null);
                    if (j13 != chatActivityEnterView.G3) {
                        if (!n5.C(j13)) {
                            Bundle bundle = new Bundle();
                            if (n5.E(j13)) {
                                bundle.putLong("user_id", j13);
                            } else {
                                bundle.putLong("chat_id", -j13);
                            }
                            if (mp.u1(chatActivityEnterView.S.f23343a).E(bundle, bxVar, null, null)) {
                                if (bnVar.presentFragment(new bn(bundle), true)) {
                                    if (!g0.Q1()) {
                                        bnVar.removeSelfFromStack();
                                    }
                                } else {
                                    bxVar.finishFragment();
                                }
                            }
                        } else {
                            bxVar.finishFragment();
                        }
                    } else {
                        bxVar.finishFragment();
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

    public h(String str, ai.q qVar, long[] jArr) {
        this.f87a = 2;
        this.f88b = str;
        this.f89c = qVar;
        this.d = jArr;
    }

    @Override
    public Task then(Object obj) {
        String d;
        FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f89c;
        String str = (String) this.f88b;
        d0 d0Var = (d0) this.d;
        String str2 = (String) obj;
        ob.c c10 = FirebaseMessaging.c(firebaseMessaging.f7554b);
        o9.g gVar = firebaseMessaging.f7553a;
        gVar.a();
        if ("[DEFAULT]".equals(gVar.f21855b)) {
            d = "";
        } else {
            d = gVar.d();
        }
        String a10 = firebaseMessaging.f7559i.a();
        synchronized (c10) {
            String a11 = d0.a(System.currentTimeMillis(), str2, a10);
            if (a11 != null) {
                SharedPreferences.Editor edit = ((SharedPreferences) c10.f21874b).edit();
                edit.putString(d + "|T|" + str + "|*", a11);
                edit.commit();
            }
        }
        if (firebaseMessaging.d.z() || d0Var == null || !str2.equals(d0Var.f914a)) {
            o9.g gVar2 = firebaseMessaging.f7553a;
            gVar2.a();
            String str3 = gVar2.f21855b;
            if ("[DEFAULT]".equals(str3)) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    StringBuilder sb2 = new StringBuilder("Invoking onNewToken for app: ");
                    gVar2.a();
                    sb2.append(str3);
                    Log.d("FirebaseMessaging", sb2.toString());
                }
                boolean z10 = firebaseMessaging.d.z();
                Intent intent = new Intent();
                intent.putExtra("token", str2);
                if (z10) {
                    intent.setAction("com.google.firebase.messaging.FCM_REGISTERED");
                } else {
                    intent.setAction("com.google.firebase.messaging.NEW_TOKEN");
                }
                new ab.k(firebaseMessaging.f7554b).b(intent);
            }
        }
        return Tasks.forResult(str2);
    }
}
