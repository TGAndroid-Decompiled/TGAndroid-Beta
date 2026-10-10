package a3;

import ai.a8;
import ai.b2;
import ai.b5;
import ai.ba;
import ai.bc;
import ai.c2;
import ai.d2;
import ai.eb;
import ai.f6;
import ai.f7;
import ai.jc;
import ai.kc;
import ai.l7;
import ai.lb;
import ai.n2;
import ai.na;
import ai.nb;
import ai.q9;
import ai.tb;
import ai.tc;
import ai.v4;
import ai.y5;
import ai.y7;
import ai.yb;
import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.os.Trace;
import androidx.fragment.app.v0;
import ci.a1;
import ci.d4;
import ci.m9;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.ca0;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.kx;
import org.telegram.ui.ty;
import v7.d8;
import v7.g8;
public final class d implements Runnable {
    public final int f81a;
    public final Object f82b;

    public d(androidx.fragment.app.l lVar, v0 v0Var) {
        this.f81a = 29;
        this.f82b = lVar;
    }

    @Override
    public final void run() {
        boolean z10 = false;
        switch (this.f81a) {
            case 0:
                ((f) this.f82b).f109g.K();
                return;
            case 1:
                ((w) this.f82b).f216k--;
                return;
            case 2:
                ty tyVar = ((kx) this.f82b).O0;
                if (tyVar.L && tyVar.U3().G()) {
                    tyVar.E0.h();
                    return;
                } else {
                    tyVar.u4(true, true);
                    return;
                }
            case 3:
                ((b2) this.f82b).f696a.t(false);
                return;
            case 4:
                d2 d2Var = ((c2) this.f82b).f752a;
                NotificationCenter.getInstance(d2Var.f809e).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(d2Var.g()));
                return;
            case 5:
                n2 n2Var = (n2) this.f82b;
                n2Var.H = false;
                n2Var.o(false);
                n2Var.T = false;
                return;
            case 6:
                ((v4) this.f82b).f1824a.Q0();
                return;
            case 7:
                f6 f6Var = ((b5) this.f82b).f710x;
                y5 y5Var = f6Var.Q1;
                if (y5Var != null) {
                    if (!f6Var.T1 && !f6Var.U1 && !f6Var.V1) {
                        kc kcVar = ((bc) y5Var).d;
                        if (!kcVar.f1283n0.getCurrentPeerView().d1(true) && !kcVar.f1283n0.E(true)) {
                            kcVar.q(true);
                            return;
                        }
                        return;
                    } else if (f6Var.O1.f825e) {
                        ((jc) f6Var.M2.f884c).loopBack();
                        return;
                    } else {
                        f6Var.W0 = 0L;
                        return;
                    }
                }
                return;
            case 8:
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f82b;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack() != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
                    return;
                }
                return;
            case 9:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) this.f82b;
                int i10 = ProfileStoriesView.f34535s0;
                profileStoriesView.getClass();
                AndroidUtilities.vibrateCursor(profileStoriesView);
                return;
            case 10:
                l7.a(((f7) this.f82b).d);
                return;
            case 11:
                y7 y7Var = (y7) this.f82b;
                if (y7Var.isShowing()) {
                    y7Var.s(true);
                    return;
                }
                return;
            case 12:
                ((m9) this.f82b).run();
                return;
            case 13:
                a1 a1Var = (a1) this.f82b;
                a1Var.c(a1Var.f4712b);
                a1Var.f4713c = false;
                return;
            case 14:
                q9 q9Var = (q9) this.f82b;
                q9Var.c();
                q9Var.a(true);
                return;
            case 15:
                ((a8) this.f82b).run(null);
                return;
            case 16:
                ((ba) this.f82b).onDetachedFromWindow();
                return;
            case 17:
                na naVar = (na) this.f82b;
                ArrayList arrayList = naVar.f1489c;
                if (arrayList != null) {
                    naVar.f1487a.f1027z1 = arrayList;
                }
                f6 f6Var2 = naVar.f1487a;
                long j3 = naVar.f1488b;
                if (f6Var2.B1 != j3 || f6Var2.f1027z1 != null) {
                    f6Var2.B1 = j3;
                    f6Var2.j1();
                    f6Var2.i1();
                    f6Var2.f1(true);
                    TL_stories.PeerStories peerStories = f6Var2.J0.Q0;
                    if (peerStories != null) {
                        f6Var2.S1.S(peerStories, true);
                        return;
                    }
                    ai.m9 m9Var = f6Var2.S1;
                    TL_stories.PeerStories y3 = m9Var.y(j3);
                    if (y3 == null) {
                        y3 = m9Var.z(j3);
                        z10 = true;
                    }
                    m9Var.S(y3, z10);
                    return;
                }
                return;
            case 18:
                ((ca0) this.f82b).d(true);
                return;
            case 19:
                ((eb) this.f82b).requestLayout();
                return;
            case 20:
                nb nbVar = (nb) this.f82b;
                d4 d4Var = nbVar.f1493c;
                if (d4Var != null) {
                    d4Var.e(true);
                    nbVar.f1493c = null;
                }
                nbVar.b(false);
                return;
            case 21:
                lb lbVar = (lb) this.f82b;
                if (lbVar.v) {
                    lbVar.E = true;
                    lbVar.F = System.currentTimeMillis();
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    lbVar.f1367e = new LinearGradient(0.0f, 0.0f, 40.0f, 0.0f, new int[]{16777215, 771751935, 771751935, 16777215}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, tileMode);
                    lbVar.f1368f = new LinearGradient(0.0f, 0.0f, 40.0f, 0.0f, new int[]{16777215, 553648127, 553648127, 16777215}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, tileMode);
                    lbVar.invalidate();
                    return;
                }
                return;
            case 22:
                kc kcVar2 = ((tb) this.f82b).f1775b;
                try {
                    yb ybVar = kcVar2.f1294s;
                    if (ybVar != null) {
                        if (kcVar2.f1256b) {
                            AndroidUtilities.removeFromParent(ybVar);
                        } else {
                            kcVar2.f1282n.removeView(ybVar);
                        }
                        kcVar2.f1294s = null;
                        return;
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 23:
                ((yb) this.f82b).I0.K(true);
                return;
            case 24:
                ((tc) this.f82b).c();
                return;
            case 25:
                ((androidx.activity.l) this.f82b).invalidateOptionsMenu();
                return;
            case 26:
                androidx.activity.k kVar = (androidx.activity.k) this.f82b;
                Runnable runnable = kVar.f2131b;
                if (runnable != null) {
                    runnable.run();
                    kVar.f2131b = null;
                    return;
                }
                return;
            case 27:
                androidx.activity.m.a((androidx.activity.m) this.f82b);
                return;
            case 28:
                androidx.emoji2.text.p pVar = (androidx.emoji2.text.p) this.f82b;
                synchronized (pVar.d) {
                    try {
                        if (pVar.h != null) {
                            try {
                                o0.h d = pVar.d();
                                int i11 = d.f16909e;
                                if (i11 == 2) {
                                    synchronized (pVar.d) {
                                    }
                                }
                                if (i11 == 0) {
                                    int i12 = n0.g.f16468a;
                                    Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                    ob.a aVar = pVar.f2623c;
                                    Context context = pVar.f2621a;
                                    aVar.getClass();
                                    o0.h[] hVarArr = {d};
                                    d8 d8Var = i0.e.f11582a;
                                    w7.a8.a("TypefaceCompat.createFromFontInfo");
                                    try {
                                        Typeface b10 = i0.e.f11582a.b(context, hVarArr, 0);
                                        Trace.endSection();
                                        MappedByteBuffer e7 = g8.e(pVar.f2621a, d.f16906a);
                                        if (e7 != null && b10 != null) {
                                            try {
                                                Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                                com.google.firebase.messaging.s sVar = new com.google.firebase.messaging.s(b10, v7.u.a(e7));
                                                Trace.endSection();
                                                synchronized (pVar.d) {
                                                    v7.t tVar = pVar.h;
                                                    if (tVar != null) {
                                                        tVar.b(sVar);
                                                    }
                                                }
                                                pVar.b();
                                                return;
                                            } catch (Throwable th2) {
                                                int i13 = n0.g.f16468a;
                                                throw th2;
                                            }
                                        }
                                        throw new RuntimeException("Unable to open file.");
                                    } finally {
                                        Trace.endSection();
                                    }
                                }
                                throw new RuntimeException("fetchFonts result is not OK. (" + i11 + ")");
                            } catch (Throwable th3) {
                                synchronized (pVar.d) {
                                    try {
                                        v7.t tVar2 = pVar.h;
                                        if (tVar2 != null) {
                                            tVar2.a(th3);
                                        }
                                        pVar.b();
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
            default:
                androidx.fragment.app.l this$0 = (androidx.fragment.app.l) this.f82b;
                kotlin.jvm.internal.i.e(this$0, "this$0");
                kotlin.jvm.internal.i.e(null, "$operation");
                this$0.a(null);
                return;
        }
    }

    public d(Object obj, int i10) {
        this.f81a = i10;
        this.f82b = obj;
    }
}
