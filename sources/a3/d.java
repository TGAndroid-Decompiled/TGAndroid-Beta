package a3;

import ai.a5;
import ai.aa;
import ai.ac;
import ai.b2;
import ai.c2;
import ai.d2;
import ai.db;
import ai.e6;
import ai.e7;
import ai.ic;
import ai.jc;
import ai.k7;
import ai.kb;
import ai.l9;
import ai.m2;
import ai.ma;
import ai.mb;
import ai.p9;
import ai.sb;
import ai.sc;
import ai.u4;
import ai.x5;
import ai.x7;
import ai.xb;
import ai.z7;
import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.os.Trace;
import androidx.fragment.app.v0;
import ci.b1;
import ci.e4;
import ci.m9;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.k90;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.hx;
import org.telegram.ui.qy;
import v7.i8;
import v7.j8;
import w7.a8;
public final class d implements Runnable {
    public final int f76a;
    public final Object f77b;

    public d(androidx.fragment.app.l lVar, v0 v0Var) {
        this.f76a = 29;
        this.f77b = lVar;
    }

    @Override
    public final void run() {
        boolean z10 = false;
        switch (this.f76a) {
            case 0:
                ((f) this.f77b).f101g.D();
                return;
            case 1:
                ((w) this.f77b).f198k--;
                return;
            case 2:
                qy qyVar = ((hx) this.f77b).O0;
                if (qyVar.L && qyVar.X3().G()) {
                    qyVar.E0.h();
                    return;
                } else {
                    qyVar.x4(true, true);
                    return;
                }
            case 3:
                ((b2) this.f77b).f579a.t(false);
                return;
            case 4:
                d2 d2Var = ((c2) this.f77b).f636a;
                NotificationCenter.getInstance(d2Var.e).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(d2Var.g()));
                return;
            case 5:
                m2 m2Var = (m2) this.f77b;
                m2Var.H = false;
                m2Var.p(false);
                m2Var.T = false;
                return;
            case 6:
                ((u4) this.f77b).f1576a.Q0();
                return;
            case 7:
                e6 e6Var = ((a5) this.f77b).f519x;
                x5 x5Var = e6Var.Q1;
                if (x5Var != null) {
                    if (!e6Var.T1 && !e6Var.U1 && !e6Var.V1) {
                        jc jcVar = ((ac) x5Var).d;
                        if (!jcVar.f1087n0.getCurrentPeerView().d1(true) && !jcVar.f1087n0.E(true)) {
                            jcVar.q(true);
                            return;
                        }
                        return;
                    } else if (e6Var.O1.e) {
                        ((ic) e6Var.M2.f713c).loopBack();
                        return;
                    } else {
                        e6Var.W0 = 0L;
                        return;
                    }
                }
                return;
            case 8:
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f77b;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack() != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
                    return;
                }
                return;
            case 9:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) this.f77b;
                int i10 = ProfileStoriesView.f31804s0;
                profileStoriesView.getClass();
                AndroidUtilities.vibrateCursor(profileStoriesView);
                return;
            case 10:
                k7.a(((e7) this.f77b).d);
                return;
            case 11:
                x7 x7Var = (x7) this.f77b;
                if (x7Var.isShowing()) {
                    x7Var.q(true);
                    return;
                }
                return;
            case 12:
                ((m9) this.f77b).run();
                return;
            case 13:
                b1 b1Var = (b1) this.f77b;
                b1Var.c(b1Var.f4368b);
                b1Var.f4369c = false;
                return;
            case 14:
                p9 p9Var = (p9) this.f77b;
                p9Var.c();
                p9Var.a(true);
                return;
            case 15:
                ((z7) this.f77b).run(null);
                return;
            case 16:
                ((aa) this.f77b).onDetachedFromWindow();
                return;
            case 17:
                ma maVar = (ma) this.f77b;
                ArrayList arrayList = maVar.f1270c;
                if (arrayList != null) {
                    maVar.f1268a.f848z1 = arrayList;
                }
                e6 e6Var2 = maVar.f1268a;
                long j3 = maVar.f1269b;
                if (e6Var2.B1 != j3 || e6Var2.f848z1 != null) {
                    e6Var2.B1 = j3;
                    e6Var2.j1();
                    e6Var2.i1();
                    e6Var2.f1(true);
                    TL_stories.PeerStories peerStories = e6Var2.J0.Q0;
                    if (peerStories != null) {
                        e6Var2.S1.S(peerStories, true);
                        return;
                    }
                    l9 l9Var = e6Var2.S1;
                    TL_stories.PeerStories y3 = l9Var.y(j3);
                    if (y3 == null) {
                        y3 = l9Var.z(j3);
                        z10 = true;
                    }
                    l9Var.S(y3, z10);
                    return;
                }
                return;
            case 18:
                ((k90) this.f77b).d(true);
                return;
            case 19:
                ((db) this.f77b).requestLayout();
                return;
            case 20:
                mb mbVar = (mb) this.f77b;
                e4 e4Var = mbVar.f1273c;
                if (e4Var != null) {
                    e4Var.e(true);
                    mbVar.f1273c = null;
                }
                mbVar.b(false);
                return;
            case 21:
                kb kbVar = (kb) this.f77b;
                if (kbVar.v) {
                    kbVar.E = true;
                    kbVar.F = System.currentTimeMillis();
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    kbVar.e = new LinearGradient(0.0f, 0.0f, 40.0f, 0.0f, new int[]{16777215, 771751935, 771751935, 16777215}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, tileMode);
                    kbVar.f1157f = new LinearGradient(0.0f, 0.0f, 40.0f, 0.0f, new int[]{16777215, 553648127, 553648127, 16777215}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, tileMode);
                    kbVar.invalidate();
                    return;
                }
                return;
            case 22:
                jc jcVar2 = ((sb) this.f77b).f1533b;
                try {
                    xb xbVar = jcVar2.f1098s;
                    if (xbVar != null) {
                        if (jcVar2.f1061b) {
                            AndroidUtilities.removeFromParent(xbVar);
                        } else {
                            jcVar2.f1086n.removeView(xbVar);
                        }
                        jcVar2.f1098s = null;
                        return;
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 23:
                ((xb) this.f77b).I0.K(true);
                return;
            case 24:
                ((sc) this.f77b).c();
                return;
            case 25:
                ((androidx.activity.l) this.f77b).invalidateOptionsMenu();
                return;
            case 26:
                androidx.activity.k kVar = (androidx.activity.k) this.f77b;
                Runnable runnable = kVar.f1885b;
                if (runnable != null) {
                    runnable.run();
                    kVar.f1885b = null;
                    return;
                }
                return;
            case 27:
                androidx.activity.m.a((androidx.activity.m) this.f77b);
                return;
            case 28:
                androidx.emoji2.text.p pVar = (androidx.emoji2.text.p) this.f77b;
                synchronized (pVar.d) {
                    try {
                        if (pVar.h != null) {
                            try {
                                o0.i d = pVar.d();
                                int i11 = d.e;
                                if (i11 == 2) {
                                    synchronized (pVar.d) {
                                    }
                                }
                                if (i11 == 0) {
                                    int i12 = n0.g.f15079a;
                                    Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                    t7.u uVar = pVar.f2346c;
                                    Context context = pVar.f2344a;
                                    uVar.getClass();
                                    o0.i[] iVarArr = {d};
                                    i8 i8Var = i0.e.f10582a;
                                    a8.a("TypefaceCompat.createFromFontInfo");
                                    try {
                                        Typeface b10 = i0.e.f10582a.b(context, iVarArr, 0);
                                        Trace.endSection();
                                        MappedByteBuffer e = j8.e(pVar.f2344a, d.f15500a);
                                        if (e != null && b10 != null) {
                                            try {
                                                Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                                com.google.firebase.messaging.t tVar = new com.google.firebase.messaging.t(b10, v7.z.a(e));
                                                Trace.endSection();
                                                synchronized (pVar.d) {
                                                    v7.y yVar = pVar.h;
                                                    if (yVar != null) {
                                                        yVar.b(tVar);
                                                    }
                                                }
                                                pVar.b();
                                                return;
                                            } catch (Throwable th2) {
                                                int i13 = n0.g.f15079a;
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
                                        v7.y yVar2 = pVar.h;
                                        if (yVar2 != null) {
                                            yVar2.a(th3);
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
                androidx.fragment.app.l this$0 = (androidx.fragment.app.l) this.f77b;
                kotlin.jvm.internal.i.e(this$0, "this$0");
                kotlin.jvm.internal.i.e(null, "$operation");
                this$0.a(null);
                return;
        }
    }

    public d(Object obj, int i10) {
        this.f76a = i10;
        this.f77b = obj;
    }
}
