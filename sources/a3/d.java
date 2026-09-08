package a3;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Trace;
import androidx.fragment.app.t0;
import bi.a2;
import bi.f7;
import bi.g4;
import bi.gb;
import bi.h5;
import bi.i9;
import bi.ja;
import bi.l4;
import bi.n6;
import bi.o5;
import bi.ob;
import bi.pb;
import bi.q7;
import bi.r1;
import bi.s1;
import bi.s6;
import bi.t1;
import bi.t9;
import bi.u8;
import bi.y8;
import di.b1;
import di.o9;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.a90;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.co;
import org.telegram.ui.lx;
import org.telegram.ui.uy;
import sg.a1;
import v7.h8;
import v7.i8;
import w7.z7;
public final class d implements Runnable {
    public final int f79a;
    public final Object f80b;

    public d(androidx.fragment.app.k kVar, t0 t0Var) {
        this.f79a = 9;
        this.f80b = kVar;
    }

    @Override
    public final void run() {
        boolean z10 = false;
        switch (this.f79a) {
            case 0:
                ((f) this.f80b).f107g.K();
                return;
            case 1:
                ((w) this.f80b).f214k--;
                return;
            case 2:
                ah.g0 g0Var = (ah.g0) ((a6.m) this.f80b).f328b;
                ah.f0 f0Var = g0Var.f548b;
                if (f0Var != null) {
                    f0Var.d();
                }
                g0Var.f547a.z7(true);
                return;
            case 3:
                ((ValueAnimator) this.f80b).start();
                return;
            case 4:
                n2 n2Var = ((ah.o0) this.f80b).f663f2.f712r;
                if (n2Var instanceof co) {
                    n2Var.showDialog(new a1(n2Var, 11, false));
                    return;
                }
                n2 R = LaunchActivity.R();
                if (R != null) {
                    R.showDialog(new a1(n2Var, 11, false));
                    return;
                }
                return;
            case 5:
                ((androidx.activity.m) this.f80b).invalidateOptionsMenu();
                return;
            case 6:
                androidx.activity.l lVar = (androidx.activity.l) this.f80b;
                Runnable runnable = lVar.f879b;
                if (runnable != null) {
                    runnable.run();
                    lVar.f879b = null;
                    return;
                }
                return;
            case 7:
                androidx.activity.n.a((androidx.activity.n) this.f80b);
                return;
            case 8:
                androidx.emoji2.text.q qVar = (androidx.emoji2.text.q) this.f80b;
                synchronized (qVar.d) {
                    try {
                        if (qVar.h != null) {
                            try {
                                o0.i d = qVar.d();
                                int i10 = d.f16819e;
                                if (i10 == 2) {
                                    synchronized (qVar.d) {
                                    }
                                }
                                if (i10 == 0) {
                                    int i11 = n0.g.f16373a;
                                    Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                    na.d dVar = qVar.f1381c;
                                    Context context = qVar.f1379a;
                                    dVar.getClass();
                                    o0.i[] iVarArr = {d};
                                    h8 h8Var = i0.f.f11457a;
                                    z7.a("TypefaceCompat.createFromFontInfo");
                                    Typeface b10 = i0.f.f11457a.b(context, iVarArr, 0);
                                    Trace.endSection();
                                    MappedByteBuffer e7 = i8.e(qVar.f1379a, d.f16816a);
                                    if (e7 != null && b10 != null) {
                                        Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                        com.google.firebase.messaging.s sVar = new com.google.firebase.messaging.s(b10, v7.x.a(e7));
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
            case 9:
                androidx.fragment.app.k this$0 = (androidx.fragment.app.k) this.f80b;
                kotlin.jvm.internal.i.e(this$0, "this$0");
                kotlin.jvm.internal.i.e(null, "$operation");
                this$0.a(null);
                return;
            case 10:
                Iterator it = ((androidx.fragment.app.i0) this.f80b).f1459n.iterator();
                if (!it.hasNext()) {
                    return;
                }
                it.next().getClass();
                throw new ClassCastException();
            case 11:
                androidx.lifecycle.e0 e0Var = (androidx.lifecycle.e0) this.f80b;
                androidx.lifecycle.v vVar = e0Var.f1607f;
                if (e0Var.f1604b == 0) {
                    e0Var.f1605c = true;
                    vVar.e(androidx.lifecycle.m.ON_PAUSE);
                }
                if (e0Var.f1603a == 0 && e0Var.f1605c) {
                    vVar.e(androidx.lifecycle.m.ON_STOP);
                    e0Var.d = true;
                    return;
                }
                return;
            case 12:
                uy uyVar = ((lx) this.f80b).O0;
                if (uyVar.L && uyVar.X3().G()) {
                    uyVar.E0.h();
                    return;
                } else {
                    uyVar.x4(true, true);
                    return;
                }
            case 13:
                ((r1) this.f80b).f3646a.t(false);
                return;
            case 14:
                t1 t1Var = ((s1) this.f80b).f3708a;
                NotificationCenter.getInstance(t1Var.f3745e).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(t1Var.g()));
                return;
            case 15:
                a2 a2Var = (a2) this.f80b;
                a2Var.H = false;
                a2Var.p(false);
                a2Var.T = false;
                return;
            case 16:
                ((g4) this.f80b).f3048a.Q0();
                return;
            case 17:
                o5 o5Var = ((l4) this.f80b).f3274x;
                h5 h5Var = o5Var.Q1;
                if (h5Var != null) {
                    if (!o5Var.T1 && !o5Var.U1 && !o5Var.V1) {
                        pb pbVar = ((gb) h5Var).d;
                        if (!pbVar.f3588n0.getCurrentPeerView().d1(true) && !pbVar.f3588n0.E(true)) {
                            pbVar.q(true);
                            return;
                        }
                        return;
                    } else if (o5Var.O1.f3340e) {
                        ((ob) o5Var.M2.f3393c).loopBack();
                        return;
                    } else {
                        o5Var.W0 = 0L;
                        return;
                    }
                }
                return;
            case 18:
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f80b;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack() != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
                    return;
                }
                return;
            case 19:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) this.f80b;
                int i12 = ProfileStoriesView.f34169s0;
                profileStoriesView.getClass();
                AndroidUtilities.vibrateCursor(profileStoriesView);
                return;
            case 20:
                s6.a(((n6) this.f80b).d);
                return;
            case 21:
                f7 f7Var = (f7) this.f80b;
                if (f7Var.isShowing()) {
                    f7Var.q(true);
                    return;
                }
                return;
            case 22:
                ((o9) this.f80b).run();
                return;
            case 23:
                b1 b1Var = (b1) this.f80b;
                b1Var.c(b1Var.f6963b);
                b1Var.f6964c = false;
                return;
            case 24:
                y8 y8Var = (y8) this.f80b;
                y8Var.c();
                y8Var.a(true);
                return;
            case 25:
                ((q7) this.f80b).accept(null);
                return;
            case 26:
                ((i9) this.f80b).onDetachedFromWindow();
                return;
            case 27:
                t9 t9Var = (t9) this.f80b;
                ArrayList arrayList = t9Var.f3778c;
                if (arrayList != null) {
                    t9Var.f3776a.f3508z1 = arrayList;
                }
                o5 o5Var2 = t9Var.f3776a;
                long j3 = t9Var.f3777b;
                if (o5Var2.B1 != j3 || o5Var2.f3508z1 != null) {
                    o5Var2.B1 = j3;
                    o5Var2.j1();
                    o5Var2.i1();
                    o5Var2.f1(true);
                    TL_stories.PeerStories peerStories = o5Var2.J0.Q0;
                    if (peerStories != null) {
                        o5Var2.S1.S(peerStories, true);
                        return;
                    }
                    u8 u8Var = o5Var2.S1;
                    TL_stories.PeerStories y3 = u8Var.y(j3);
                    if (y3 == null) {
                        y3 = u8Var.z(j3);
                        z10 = true;
                    }
                    u8Var.S(y3, z10);
                    return;
                }
                return;
            case 28:
                ((a90) this.f80b).d(true);
                return;
            default:
                ((ja) this.f80b).requestLayout();
                return;
        }
    }

    public d(Object obj, int i10) {
        this.f79a = i10;
        this.f80b = obj;
    }
}
