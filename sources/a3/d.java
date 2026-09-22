package a3;

import ai.a5;
import ai.aa;
import ai.ac;
import ai.b2;
import ai.c2;
import ai.d2;
import ai.db;
import ai.e7;
import ai.f6;
import ai.h8;
import ai.ic;
import ai.j7;
import ai.jc;
import ai.kb;
import ai.l9;
import ai.m2;
import ai.ma;
import ai.mb;
import ai.sb;
import ai.sc;
import ai.u4;
import ai.w7;
import ai.xb;
import ai.y5;
import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.os.Trace;
import androidx.fragment.app.v0;
import ci.b1;
import ci.f4;
import ci.p9;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.k90;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.lx;
import org.telegram.ui.uy;
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
                ((f) this.f77b).f101g.J();
                return;
            case 1:
                ((w) this.f77b).f198k--;
                return;
            case 2:
                uy uyVar = ((lx) this.f77b).O0;
                if (uyVar.L && uyVar.X3().G()) {
                    uyVar.E0.h();
                    return;
                } else {
                    uyVar.x4(true, true);
                    return;
                }
            case 3:
                ((b2) this.f77b).f572a.t(false);
                return;
            case 4:
                d2 d2Var = ((c2) this.f77b).f618a;
                NotificationCenter.getInstance(d2Var.e).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(d2Var.g()));
                return;
            case 5:
                m2 m2Var = (m2) this.f77b;
                m2Var.H = false;
                m2Var.p(false);
                m2Var.T = false;
                return;
            case 6:
                ((u4) this.f77b).f1570a.Q0();
                return;
            case 7:
                f6 f6Var = ((a5) this.f77b).f519x;
                y5 y5Var = f6Var.Q1;
                if (y5Var != null) {
                    if (!f6Var.T1 && !f6Var.U1 && !f6Var.V1) {
                        jc jcVar = ((ac) y5Var).d;
                        if (!jcVar.f1093n0.getCurrentPeerView().d1(true) && !jcVar.f1093n0.E(true)) {
                            jcVar.q(true);
                            return;
                        }
                        return;
                    } else if (f6Var.O1.e) {
                        ((ic) f6Var.M2.f763c).loopBack();
                        return;
                    } else {
                        f6Var.W0 = 0L;
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
                int i10 = ProfileStoriesView.f31823s0;
                profileStoriesView.getClass();
                AndroidUtilities.vibrateCursor(profileStoriesView);
                return;
            case 10:
                j7.a(((e7) this.f77b).d);
                return;
            case 11:
                w7 w7Var = (w7) this.f77b;
                if (w7Var.isShowing()) {
                    w7Var.q(true);
                    return;
                }
                return;
            case 12:
                ((p9) this.f77b).run();
                return;
            case 13:
                b1 b1Var = (b1) this.f77b;
                b1Var.c(b1Var.f4381b);
                b1Var.f4382c = false;
                return;
            case 14:
                ai.p9 p9Var = (ai.p9) this.f77b;
                p9Var.c();
                p9Var.a(true);
                return;
            case 15:
                ((h8) this.f77b).accept(null);
                return;
            case 16:
                ((aa) this.f77b).onDetachedFromWindow();
                return;
            case 17:
                ma maVar = (ma) this.f77b;
                ArrayList arrayList = maVar.f1260c;
                if (arrayList != null) {
                    maVar.f1258a.f872z1 = arrayList;
                }
                f6 f6Var2 = maVar.f1258a;
                long j3 = maVar.f1259b;
                if (f6Var2.B1 != j3 || f6Var2.f872z1 != null) {
                    f6Var2.B1 = j3;
                    f6Var2.j1();
                    f6Var2.i1();
                    f6Var2.f1(true);
                    TL_stories.PeerStories peerStories = f6Var2.J0.Q0;
                    if (peerStories != null) {
                        f6Var2.S1.S(peerStories, true);
                        return;
                    }
                    l9 l9Var = f6Var2.S1;
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
                f4 f4Var = mbVar.f1263c;
                if (f4Var != null) {
                    f4Var.e(true);
                    mbVar.f1263c = null;
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
                    kbVar.f1154f = new LinearGradient(0.0f, 0.0f, 40.0f, 0.0f, new int[]{16777215, 553648127, 553648127, 16777215}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, tileMode);
                    kbVar.invalidate();
                    return;
                }
                return;
            case 22:
                jc jcVar2 = ((sb) this.f77b).f1531b;
                try {
                    xb xbVar = jcVar2.f1104s;
                    if (xbVar != null) {
                        if (jcVar2.f1067b) {
                            AndroidUtilities.removeFromParent(xbVar);
                        } else {
                            jcVar2.f1092n.removeView(xbVar);
                        }
                        jcVar2.f1104s = null;
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
                Runnable runnable = kVar.f1892b;
                if (runnable != null) {
                    runnable.run();
                    kVar.f1892b = null;
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
                        if (pVar.f2355n != null) {
                            try {
                                o0.i d = pVar.d();
                                int i11 = d.e;
                                if (i11 == 2) {
                                    synchronized (pVar.d) {
                                    }
                                }
                                if (i11 == 0) {
                                    int i12 = n0.g.f15090a;
                                    Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                    t7.u uVar = pVar.f2353c;
                                    Context context = pVar.f2351a;
                                    uVar.getClass();
                                    o0.i[] iVarArr = {d};
                                    i8 i8Var = i0.e.f10598a;
                                    a8.a("TypefaceCompat.createFromFontInfo");
                                    try {
                                        Typeface b10 = i0.e.f10598a.b(context, iVarArr, 0);
                                        Trace.endSection();
                                        MappedByteBuffer e = j8.e(pVar.f2351a, d.f15504a);
                                        if (e != null && b10 != null) {
                                            try {
                                                Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                                com.google.firebase.messaging.t tVar = new com.google.firebase.messaging.t(b10, v7.x.a(e));
                                                Trace.endSection();
                                                synchronized (pVar.d) {
                                                    v7.w wVar = pVar.f2355n;
                                                    if (wVar != null) {
                                                        wVar.b(tVar);
                                                    }
                                                }
                                                pVar.a();
                                                return;
                                            } catch (Throwable th2) {
                                                int i13 = n0.g.f15090a;
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
                                        v7.w wVar2 = pVar.f2355n;
                                        if (wVar2 != null) {
                                            wVar2.a(th3);
                                        }
                                        pVar.a();
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
