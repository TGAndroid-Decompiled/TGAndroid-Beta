package a3;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Trace;
import android.view.ViewGroup;
import androidx.fragment.app.u0;
import bi.b3;
import bi.be;
import bi.c3;
import bi.f3;
import bi.h2;
import bi.j4;
import bi.k1;
import bi.m8;
import bi.nb;
import bi.o1;
import bi.o2;
import bi.o4;
import bi.ob;
import bi.oc;
import bi.q0;
import bi.q2;
import bi.sc;
import bi.u2;
import bi.w1;
import bi.x2;
import bi.y6;
import bi.z0;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.vr0;
import org.telegram.ui.Components.yi;
import org.telegram.ui.Stories.recorder.FfmpegAudioWaveformLoader;
import qg.a1;
import v7.k8;
import v7.l8;
import w7.a8;
import yg.p0;
import zh.s4;
public final class d implements Runnable {
    public final int f74a;
    public final Object f75b;

    public d(androidx.fragment.app.l lVar, u0 u0Var) {
        this.f74a = 8;
        this.f75b = lVar;
    }

    @Override
    public final void run() {
        String str;
        switch (this.f74a) {
            case 0:
                ((f) this.f75b).f99g.C();
                return;
            case 1:
                ((w) this.f75b).f196k--;
                return;
            case 2:
                ((yi) this.f75b).hide();
                return;
            case 3:
                ai.a0 a0Var = (ai.a0) this.f75b;
                vr0 vr0Var = a0Var.W;
                s4 s4Var = a0Var.f411a;
                if (s4Var == null) {
                    str = "";
                } else {
                    str = s4Var.E;
                }
                vr0Var.a(str);
                return;
            case 4:
                ((androidx.activity.m) this.f75b).invalidateOptionsMenu();
                return;
            case 5:
                androidx.activity.l lVar = (androidx.activity.l) this.f75b;
                Runnable runnable = lVar.f576b;
                if (runnable != null) {
                    runnable.run();
                    lVar.f576b = null;
                    return;
                }
                return;
            case 6:
                androidx.activity.n.a((androidx.activity.n) this.f75b);
                return;
            case 7:
                androidx.emoji2.text.q qVar = (androidx.emoji2.text.q) this.f75b;
                synchronized (qVar.d) {
                    try {
                        if (qVar.h != null) {
                            try {
                                o0.i d = qVar.d();
                                int i10 = d.e;
                                if (i10 == 2) {
                                    synchronized (qVar.d) {
                                    }
                                }
                                if (i10 == 0) {
                                    int i11 = n0.g.f13682a;
                                    Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                    t7.u uVar = qVar.f1047c;
                                    Context context = qVar.f1045a;
                                    uVar.getClass();
                                    o0.i[] iVarArr = {d};
                                    k8 k8Var = i0.f.f10080a;
                                    a8.a("TypefaceCompat.createFromFontInfo");
                                    Typeface b10 = i0.f.f10080a.b(context, iVarArr, 0);
                                    Trace.endSection();
                                    MappedByteBuffer e = l8.e(qVar.f1045a, d.f14101a);
                                    if (e != null && b10 != null) {
                                        Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                        com.google.firebase.messaging.s sVar = new com.google.firebase.messaging.s(b10, v7.x.a(e));
                                        Trace.endSection();
                                        Trace.endSection();
                                        synchronized (qVar.d) {
                                            v7.w wVar = qVar.h;
                                            if (wVar != null) {
                                                wVar.b(sVar);
                                            }
                                        }
                                        qVar.b();
                                        return;
                                    }
                                    throw new RuntimeException("Unable to open file.");
                                }
                                throw new RuntimeException("fetchFonts result is not OK. (" + i10 + ")");
                            } catch (Throwable th2) {
                                synchronized (qVar.d) {
                                    try {
                                        v7.w wVar2 = qVar.h;
                                        if (wVar2 != null) {
                                            wVar2.a(th2);
                                        }
                                        qVar.b();
                                        return;
                                    } finally {
                                    }
                                }
                            }
                        }
                        return;
                    } finally {
                    }
                }
            case 8:
                androidx.fragment.app.l this$0 = (androidx.fragment.app.l) this.f75b;
                kotlin.jvm.internal.i.e(this$0, "this$0");
                kotlin.jvm.internal.i.e(null, "$operation");
                this$0.a(null);
                return;
            case 9:
                Iterator it = ((androidx.fragment.app.j0) this.f75b).f1127n.iterator();
                if (!it.hasNext()) {
                    return;
                }
                it.next().getClass();
                throw new ClassCastException();
            case 10:
                androidx.lifecycle.e0 e0Var = (androidx.lifecycle.e0) this.f75b;
                androidx.lifecycle.v vVar = e0Var.f1261f;
                if (e0Var.f1259b == 0) {
                    e0Var.f1260c = true;
                    vVar.e(androidx.lifecycle.m.ON_PAUSE);
                }
                if (e0Var.f1258a == 0 && e0Var.f1260c) {
                    vVar.e(androidx.lifecycle.m.ON_STOP);
                    e0Var.d = true;
                    return;
                }
                return;
            case 11:
                ((bi.j) this.f75b).f2902c.W = false;
                return;
            case 12:
                ((bi.n) this.f75b).invalidateSelf();
                return;
            case 13:
                ((bi.i0) this.f75b).f2829g = -1L;
                return;
            case 14:
                q0 q0Var = (q0) this.f75b;
                pg.i iVar = q0Var.f3430b.H;
                if (iVar != null) {
                    iVar.b();
                }
                q0Var.f3430b.k();
                return;
            case 15:
                ((z0) this.f75b).a(false);
                return;
            case 16:
                pc.e();
                a1 a1Var = new a1((p2) new o1((y6) this.f75b), 14, false);
                a1Var.setOnDismissListener(new k1(0));
                a1Var.show();
                return;
            case 17:
                ((h2) this.f75b).G();
                return;
            case 18:
                bi.p2 p2Var = (bi.p2) this.f75b;
                ArrayList arrayList = p2Var.v;
                ArrayList arrayList2 = p2Var.f3361s;
                q2 q2Var = p2Var.N;
                f3 f3Var = q2Var.f3447s;
                MediaDataController mediaDataController = MediaDataController.getInstance(f3.T(f3Var));
                String str2 = p2Var.H;
                if ("premium".equalsIgnoreCase(str2)) {
                    ArrayList<TLRPC.Document> recentStickers = mediaDataController.getRecentStickers(7);
                    p2Var.f3363x = 0;
                    arrayList2.clear();
                    arrayList.clear();
                    p2Var.f3364y.clear();
                    p2Var.f3359n.clear();
                    p2Var.f3363x++;
                    arrayList2.add(null);
                    arrayList.add(0L);
                    arrayList2.addAll(recentStickers);
                    p2Var.f3363x = recentStickers.size() + p2Var.f3363x;
                    p2Var.I = p2Var.H;
                    p2Var.l();
                    w1.v1(q2Var.f3442b, 0, 0);
                    q2Var.f3444f.c(false);
                    q2Var.e.n(false);
                    return;
                } else if (q2Var.f3035a == 1 && Emoji.fullyConsistsOfEmojis(p2Var.H)) {
                    TLRPC.TL_messages_getStickers tL_messages_getStickers = new TLRPC.TL_messages_getStickers();
                    tL_messages_getStickers.emoticon = p2Var.H;
                    tL_messages_getStickers.hash = 0L;
                    ConnectionsManager.getInstance(f3.V(f3Var)).sendRequest(tL_messages_getStickers, new o2(0, p2Var, str2));
                    return;
                } else {
                    String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
                    String[] strArr = p2Var.J;
                    if (strArr == null || !Arrays.equals(currentKeyboardLanguage, strArr)) {
                        MediaDataController.getInstance(f3.W(f3Var)).fetchNewEmojiKeywords(currentKeyboardLanguage);
                    }
                    p2Var.J = currentKeyboardLanguage;
                    mediaDataController.getEmojiSuggestions(currentKeyboardLanguage, p2Var.H, false, new androidx.car.app.utils.a((Object) p2Var, str2, (Object) mediaDataController, 2), null, false, false, false, true, 50, false);
                    return;
                }
            case 19:
                x2 x2Var = (x2) ((u2) this.f75b).f3711b;
                if (!x2Var.h) {
                    x2Var.f3872n.setVisibility(8);
                    return;
                }
                return;
            case 20:
                c3 c3Var = (c3) ((b3) this.f75b).f2355b;
                ArrayList arrayList3 = c3Var.f2407o;
                if (!arrayList3.isEmpty()) {
                    c3Var.f2404l.d(0.0f, true);
                    int i12 = c3Var.f2403k + 1;
                    c3Var.f2403k = i12;
                    if (i12 > arrayList3.size() - 1) {
                        c3Var.f2403k = 0;
                    }
                    yg.g0 g0Var = c3Var.f2402j;
                    g0Var.e((p0) arrayList3.get(c3Var.f2403k));
                    c3Var.f2402j = c3Var.f2401i;
                    c3Var.f2401i = g0Var;
                    c3Var.f2408p.invalidate();
                    return;
                }
                return;
            case 21:
                FfmpegAudioWaveformLoader.b((FfmpegAudioWaveformLoader) this.f75b);
                return;
            case 22:
                ((j4) this.f75b).b(null);
                return;
            case 23:
                ((o4) this.f75b).E();
                return;
            case 24:
                oc ocVar = (oc) this.f75b;
                if (ocVar.I) {
                    ocVar.I = false;
                    ocVar.invalidate();
                    return;
                }
                return;
            case 25:
                m8 m8Var = ((bi.l8) this.f75b).f3046p;
                m8Var.Q = System.currentTimeMillis();
                m8Var.R = 0L;
                m8Var.f3126r0 = true;
                ((sc) m8Var.f3104a).f3660a.J0.a(0L, true);
                m8Var.invalidate();
                return;
            case 26:
                bi.t tVar = (bi.t) this.f75b;
                if (tVar.getParent() instanceof ViewGroup) {
                    ((ViewGroup) tVar.getParent()).removeView(tVar);
                    return;
                }
                return;
            case 27:
                bi.d dVar = (bi.d) this.f75b;
                if (dVar != null) {
                    dVar.setLoading(false);
                    return;
                }
                return;
            case 28:
                ((ob) ((nb) this.f75b).f3251n).fullScroll(130);
                return;
            default:
                be beVar = (be) this.f75b;
                beVar.f2385x0.onTouchEvent(AndroidUtilities.emptyMotionEvent());
                beVar.f2384w0.B(AndroidUtilities.emptyMotionEvent());
                return;
        }
    }

    public d(Object obj, int i10) {
        this.f74a = i10;
        this.f75b = obj;
    }
}
