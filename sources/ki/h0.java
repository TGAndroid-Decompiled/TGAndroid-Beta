package ki;

import ai.v1;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.os.ResultReceiver;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import ci.y0;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import m4.a1;
import m4.e1;
import m4.k1;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.video.VideoAds;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.voip.VoipAudioManager;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.d60;
import org.telegram.ui.Components.no0;
import org.telegram.ui.Components.sr;
import org.telegram.ui.b41;
import org.telegram.ui.jl;
import rg.x0;
public final class h0 implements Runnable {
    public final int f13697a;
    public final Object f13698b;
    public final Object f13699c;

    public h0(int i10, Object obj, Object obj2) {
        this.f13697a = i10;
        this.f13698b = obj;
        this.f13699c = obj2;
    }

    @Override
    public final void run() {
        k1 k1Var;
        int i10 = this.f13697a;
        float f7 = 0.0f;
        int i11 = 2;
        ArrayList arrayList = null;
        Bitmap bitmap = null;
        Object obj = this.f13699c;
        Object obj2 = this.f13698b;
        switch (i10) {
            case 0:
                s0 s0Var = (s0) ((k2.u) obj2).f13371a;
                s0Var.M++;
                s0Var.v = true;
                s0Var.f13852l.b("camera switch started: target=" + ((l0) obj));
                d60 d60Var = (d60) s0Var.f13846c.f13554b;
                jl jlVar = d60Var.E;
                FrameLayout frameLayout = d60Var.f23574x;
                d60Var.s(false);
                Bitmap bitmap2 = d60Var.m0;
                if (bitmap2 != null) {
                    jlVar.setImageBitmap(bitmap2);
                    d60Var.f23559l0 = true;
                    jlVar.animate().cancel();
                    jlVar.setAlpha(1.0f);
                }
                frameLayout.animate().cancel();
                frameLayout.setCameraDistance(frameLayout.getMeasuredHeight() * 8.0f);
                frameLayout.animate().rotationY(90.0f).setDuration(120L).start();
                s0Var.n();
                return;
            case 1:
                ((s0) ((k2.u) obj2).f13371a).g((Exception) obj);
                return;
            case 2:
                ((i9.c0) obj).m(Boolean.valueOf(((m4.a0) obj2).o()));
                return;
            case 3:
                ((m4.a0) obj2).getClass();
                ((Runnable) obj).run();
                return;
            case 4:
                ((m4.a0) obj2).u(null, (e1) obj);
                return;
            case 5:
                ResultReceiver resultReceiver = (ResultReceiver) obj;
                try {
                    k1Var = (k1) ((i9.u) obj2).f11049a;
                    e2.d.e(k1Var, "SessionResult must not be null");
                } catch (InterruptedException e) {
                    e = e;
                    e2.a.o("MediaSessionLegacyStub", "Custom command failed", e);
                    k1Var = new k1(-1);
                } catch (CancellationException e7) {
                    e2.a.o("MediaSessionLegacyStub", "Custom command cancelled", e7);
                    k1Var = new k1(1);
                } catch (ExecutionException e10) {
                    e = e10;
                    e2.a.o("MediaSessionLegacyStub", "Custom command failed", e);
                    k1Var = new k1(-1);
                }
                resultReceiver.send(k1Var.f14895a, k1Var.f14896b);
                return;
            case 6:
                pi.f fVar = ((a1) obj2).f14741b;
                m4.r t10 = fVar.t(((m4.i) obj).asBinder());
                if (t10 != null) {
                    fVar.M(t10);
                    return;
                }
                return;
            case 7:
                ((a1) obj2).f14741b.n((m4.r) obj);
                return;
            case 8:
                me.b bVar = (me.b) obj2;
                View view = (View) obj;
                me.a aVar = bVar.f15050a;
                if ((bVar.f15052c & 2) != 0) {
                    if (aVar.onLongPressRequestedAt(view, bVar.d, bVar.e)) {
                        bVar.f15052c &= -3;
                        bVar.f15051b = null;
                        float f10 = bVar.d;
                        float f11 = bVar.e;
                        bVar.f15053f = f10;
                        bVar.f15054g = f11;
                        if (aVar.ignoreHapticFeedbackSettings(f10, f11)) {
                            boolean forceEnableVibration = aVar.forceEnableVibration();
                            if (view != null) {
                                if (!forceEnableVibration) {
                                    i11 = 0;
                                }
                                view.performHapticFeedback(0, i11);
                            }
                        } else {
                            view.performHapticFeedback(0);
                        }
                        bVar.f15052c = (bVar.f15052c | 4) & (-11);
                        bVar.f15051b = null;
                        return;
                    }
                    bVar.f15052c |= 8;
                    return;
                }
                return;
            case 9:
                n2.d dVar = (n2.d) obj2;
                b2.s sVar = (b2.s) obj;
                n2.e eVar = dVar.d;
                if (eVar.E != 0 && !dVar.f15151c) {
                    Looper looper = eVar.I;
                    looper.getClass();
                    dVar.f15150b = eVar.a(looper, dVar.f15149a, sVar, false);
                    eVar.f15160x.add(dVar);
                    return;
                }
                return;
            case 10:
                ((p2.b) ((o2.k) ((o2.q) obj2).f15654c.f15522b).f15619b.d.get(((o2.j) obj).f15616x)).c(true);
                return;
            case 11:
                ((VideoAds) obj2).lambda$showPremium$19((x0) obj);
                return;
            case 12:
                ((VideoAds) obj2).lambda$load$0((TLObject) obj);
                return;
            case 13:
                ((VideoAds) obj2).lambda$show$16((Utilities.Callback) obj);
                return;
            case 14:
                b41.T((Context) obj2, null, false, (ai.a1) obj, null);
                return;
            case 15:
                ((ConferenceCall) obj2).lambda$processUpdates$4((TLRPC.Updates) obj);
                return;
            case 16:
                VideoCapturerDevice.lambda$checkScreenCapturerSize$1((VideoCapturerDevice) obj2, (Point) obj);
                return;
            case 17:
                ((VideoCapturerDevice) obj2).lambda$init$4((String) obj);
                return;
            case 18:
                ((VoIPService) obj2).lambda$startGroupCall$21((TL_update.TL_updateGroupCall) obj);
                return;
            case 19:
                ((VoIPService) obj2).lambda$createGroupInstance$71((String) obj);
                return;
            case 20:
                ((VoIPService) obj2).lambda$startConferenceGroupCall$56((org.telegram.messenger.voip.l0) obj);
                return;
            case 21:
                ((VoIPService) obj2).lambda$startScreenCapture$58((TLRPC.Updates) obj);
                return;
            case 22:
                ((VoipAudioManager) obj2).lambda$isBluetoothAndSpeakerOnAsync$2((Utilities.Callback2) obj);
                return;
            case 23:
                org.telegram.ui.ActionBar.l lVar = (org.telegram.ui.ActionBar.l) obj2;
                boolean canScrollVertically = ((no0) obj).canScrollVertically(-1);
                boolean z10 = !canScrollVertically;
                if (lVar.f19589v1 != z10) {
                    ValueAnimator valueAnimator = lVar.f19595x1;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    float f12 = lVar.f19592w1;
                    lVar.f19589v1 = z10;
                    if (!canScrollVertically) {
                        f7 = 1.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f12, f7);
                    lVar.f19595x1 = ofFloat;
                    ofFloat.addUpdateListener(new org.telegram.ui.ActionBar.a(lVar, 0));
                    lVar.f19595x1.addListener(new org.telegram.ui.ActionBar.c(lVar, z10, 1));
                    lVar.f19595x1.setDuration(320L);
                    lVar.f19595x1.setInterpolator(sr.h);
                    lVar.f19595x1.start();
                    return;
                }
                return;
            case 24:
                org.telegram.ui.ActionBar.l lVar2 = (org.telegram.ui.ActionBar.l) obj2;
                boolean canScrollVertically2 = ((RecyclerView) obj).canScrollVertically(-1);
                boolean z11 = !canScrollVertically2;
                if (lVar2.f19589v1 != z11) {
                    ValueAnimator valueAnimator2 = lVar2.f19595x1;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    float f13 = lVar2.f19592w1;
                    lVar2.f19589v1 = z11;
                    if (!canScrollVertically2) {
                        f7 = 1.0f;
                    }
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f13, f7);
                    lVar2.f19595x1 = ofFloat2;
                    ofFloat2.addUpdateListener(new org.telegram.ui.ActionBar.a(lVar2, 4));
                    lVar2.f19595x1.addListener(new org.telegram.ui.ActionBar.c(lVar2, z11, 0));
                    lVar2.f19595x1.setDuration(320L);
                    lVar2.f19595x1.setInterpolator(sr.h);
                    lVar2.f19595x1.start();
                    return;
                }
                return;
            case 25:
                ActionBarLayout actionBarLayout = (ActionBarLayout) obj2;
                Drawable drawable = ActionBarLayout.f18593p1;
                actionBarLayout.b0((o2) obj, false);
                actionBarLayout.setVisibility(8);
                View view2 = actionBarLayout.B0;
                if (view2 != null) {
                    view2.setVisibility(8);
                    return;
                }
                return;
            case 26:
                o2 o2Var = (o2) obj2;
                o2 o2Var2 = (o2) obj;
                Drawable drawable2 = ActionBarLayout.f18593p1;
                if (o2Var != null) {
                    o2Var.onTransitionAnimationEnd(false, false);
                }
                o2Var2.onTransitionAnimationEnd(true, false);
                o2Var2.onBecomeFullyVisible();
                return;
            case 27:
                d6 d6Var = (d6) obj2;
                ArrayList arrayList2 = (ArrayList) obj;
                int size = arrayList2.size();
                int i12 = 0;
                while (i12 < size) {
                    g6 g6Var = (g6) arrayList2.get(i12);
                    File d = g6Var.d();
                    if (d != null && d.length() > 0) {
                        arrayList2.remove(i12);
                        i12--;
                        size--;
                    } else {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        if (!arrayList.contains(g6Var.f18917o)) {
                            arrayList.add(g6Var.f18917o);
                        }
                    }
                    i12++;
                }
                if (arrayList != null) {
                    TL_account.getMultiWallPapers getmultiwallpapers = new TL_account.getMultiWallPapers();
                    int size2 = arrayList.size();
                    for (int i13 = 0; i13 < size2; i13++) {
                        TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
                        tL_inputWallPaperSlug.slug = (String) arrayList.get(i13);
                        getmultiwallpapers.wallpapers.add(tL_inputWallPaperSlug);
                    }
                    ConnectionsManager.getInstance(d6Var.f18806a).sendRequest(getmultiwallpapers, new v1(20, d6Var, arrayList2));
                    return;
                }
                return;
            case 28:
                d6 d6Var2 = (d6) obj2;
                c6 c6Var = (c6) obj;
                TLRPC.TL_wallPaper tL_wallPaper = c6Var.f18778a;
                File pathToAttach = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(tL_wallPaper.document, true);
                ArrayList arrayList3 = c6Var.f18779b;
                int size3 = arrayList3.size();
                ArrayList arrayList4 = null;
                for (int i14 = 0; i14 < size3; i14++) {
                    g6 g6Var2 = (g6) arrayList3.get(i14);
                    if (g6Var2.f18917o.equals(tL_wallPaper.slug)) {
                        Bitmap b10 = d6.b(bitmap, "application/x-tgwallpattern".equals(tL_wallPaper.document.mime_type), pathToAttach, g6Var2);
                        if (arrayList4 == null) {
                            arrayList4 = new ArrayList();
                            arrayList4.add(g6Var2);
                        }
                        bitmap = b10;
                    }
                }
                if (bitmap != null) {
                    bitmap.recycle();
                }
                AndroidUtilities.runOnUIThread(new y0((Object) d6Var2, (Object) arrayList4, false, 11));
                return;
            default:
                h6 h6Var = (h6) obj2;
                h6Var.d((File) obj, h6Var.f18962h0);
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.r(h6Var, 19));
                return;
        }
    }

    public h0(m4.a0 a0Var, m4.r rVar, Runnable runnable) {
        this.f13697a = 3;
        this.f13698b = a0Var;
        this.f13699c = runnable;
    }
}
