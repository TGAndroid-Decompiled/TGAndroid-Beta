package ki;

import ai.v1;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Looper;
import android.os.ResultReceiver;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import ii.n4;
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
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.e60;
import org.telegram.ui.Components.ro0;
import org.telegram.ui.Components.tr;
import org.telegram.ui.b41;
import org.telegram.ui.il;
import rg.y0;
public final class h0 implements Runnable {
    public final int f14889a;
    public final Object f14890b;
    public final Object f14891c;

    public h0(int i10, Object obj, Object obj2) {
        this.f14889a = i10;
        this.f14890b = obj;
        this.f14891c = obj2;
    }

    @Override
    public final void run() {
        k1 k1Var;
        int i10 = this.f14889a;
        float f7 = 0.0f;
        int i11 = 2;
        ArrayList arrayList = null;
        Bitmap bitmap = null;
        Object obj = this.f14891c;
        Object obj2 = this.f14890b;
        switch (i10) {
            case 0:
                s0 s0Var = (s0) ((n4) obj2).f12543b;
                s0Var.N++;
                s0Var.f15062w = true;
                s0Var.f15053m.b("camera switch started: target=" + ((l0) obj));
                e60 e60Var = (e60) s0Var.d.f15267b;
                il ilVar = e60Var.E;
                FrameLayout frameLayout = e60Var.f25968x;
                e60Var.s(false);
                Bitmap bitmap2 = e60Var.m0;
                if (bitmap2 != null) {
                    ilVar.setImageBitmap(bitmap2);
                    e60Var.f25953l0 = true;
                    ilVar.animate().cancel();
                    ilVar.setAlpha(1.0f);
                }
                frameLayout.animate().cancel();
                frameLayout.setCameraDistance(frameLayout.getMeasuredHeight() * 8.0f);
                frameLayout.animate().rotationY(90.0f).setDuration(120L).start();
                s0Var.o();
                return;
            case 1:
                ((s0) ((n4) obj2).f12543b).h((Exception) obj);
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
                    k1Var = (k1) ((i9.u) obj2).f12031a;
                    e2.d.e(k1Var, "SessionResult must not be null");
                } catch (InterruptedException e7) {
                    e = e7;
                    e2.a.o("MediaSessionLegacyStub", "Custom command failed", e);
                    k1Var = new k1(-1);
                } catch (CancellationException e10) {
                    e2.a.o("MediaSessionLegacyStub", "Custom command cancelled", e10);
                    k1Var = new k1(1);
                } catch (ExecutionException e11) {
                    e = e11;
                    e2.a.o("MediaSessionLegacyStub", "Custom command failed", e);
                    k1Var = new k1(-1);
                }
                resultReceiver.send(k1Var.f16226a, k1Var.f16227b);
                return;
            case 6:
                qi.f fVar = ((a1) obj2).f16060b;
                m4.r t10 = fVar.t(((m4.i) obj).asBinder());
                if (t10 != null) {
                    fVar.M(t10);
                    return;
                }
                return;
            case 7:
                ((a1) obj2).f16060b.n((m4.r) obj);
                return;
            case 8:
                me.b bVar = (me.b) obj2;
                View view = (View) obj;
                me.a aVar = bVar.f16390a;
                if ((bVar.f16392c & 2) != 0) {
                    if (aVar.onLongPressRequestedAt(view, bVar.d, bVar.f16393e)) {
                        bVar.f16392c &= -3;
                        bVar.f16391b = null;
                        float f10 = bVar.d;
                        float f11 = bVar.f16393e;
                        bVar.f16394f = f10;
                        bVar.f16395g = f11;
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
                        bVar.f16392c = (bVar.f16392c | 4) & (-11);
                        bVar.f16391b = null;
                        return;
                    }
                    bVar.f16392c |= 8;
                    return;
                }
                return;
            case 9:
                n2.e eVar = (n2.e) obj2;
                b2.s sVar = (b2.s) obj;
                n2.f fVar2 = eVar.d;
                if (fVar2.E != 0 && !eVar.f16526c) {
                    Looper looper = fVar2.I;
                    looper.getClass();
                    eVar.f16525b = fVar2.a(looper, eVar.f16524a, sVar, false);
                    fVar2.f16536x.add(eVar);
                    return;
                }
                return;
            case 10:
                ((p2.b) ((o2.k) ((o2.q) obj2).f17072c.f15267b).f17035b.d.get(((o2.j) obj).f17032x)).c(true);
                return;
            case 11:
                ((VideoAds) obj2).lambda$showPremium$19((y0) obj);
                return;
            case 12:
                ((VideoAds) obj2).lambda$load$0((TLObject) obj);
                return;
            case 13:
                ((VideoAds) obj2).lambda$show$16((Utilities.Callback) obj);
                return;
            case 14:
                b41.R((Context) obj2, null, false, (ai.a1) obj, null);
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
                ((VoIPService) obj2).lambda$startConferenceGroupCall$56((org.telegram.messenger.voip.m0) obj);
                return;
            case 21:
                ((VoIPService) obj2).lambda$startScreenCapture$58((TLRPC.Updates) obj);
                return;
            case 22:
                ((AudioManager) obj2).setCommunicationDevice((AudioDeviceInfo) obj);
                return;
            case 23:
                ((VoipAudioManager) obj2).lambda$isBluetoothAndSpeakerOnAsync$4((Utilities.Callback2) obj);
                return;
            case 24:
                org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) obj2;
                boolean canScrollVertically = ((ro0) obj).canScrollVertically(-1);
                boolean z10 = !canScrollVertically;
                if (kVar.f21292t1 != z10) {
                    ValueAnimator valueAnimator = kVar.f21296v1;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    float f12 = kVar.f21294u1;
                    kVar.f21292t1 = z10;
                    if (!canScrollVertically) {
                        f7 = 1.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f12, f7);
                    kVar.f21296v1 = ofFloat;
                    ofFloat.addUpdateListener(new org.telegram.ui.ActionBar.a(kVar, 0));
                    kVar.f21296v1.addListener(new org.telegram.ui.ActionBar.c(kVar, z10, 1));
                    kVar.f21296v1.setDuration(320L);
                    kVar.f21296v1.setInterpolator(tr.h);
                    kVar.f21296v1.start();
                    return;
                }
                return;
            case 25:
                org.telegram.ui.ActionBar.k kVar2 = (org.telegram.ui.ActionBar.k) obj2;
                boolean canScrollVertically2 = ((RecyclerView) obj).canScrollVertically(-1);
                boolean z11 = !canScrollVertically2;
                if (kVar2.f21292t1 != z11) {
                    ValueAnimator valueAnimator2 = kVar2.f21296v1;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    float f13 = kVar2.f21294u1;
                    kVar2.f21292t1 = z11;
                    if (!canScrollVertically2) {
                        f7 = 1.0f;
                    }
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f13, f7);
                    kVar2.f21296v1 = ofFloat2;
                    ofFloat2.addUpdateListener(new org.telegram.ui.ActionBar.a(kVar2, 4));
                    kVar2.f21296v1.addListener(new org.telegram.ui.ActionBar.c(kVar2, z11, 0));
                    kVar2.f21296v1.setDuration(320L);
                    kVar2.f21296v1.setInterpolator(tr.h);
                    kVar2.f21296v1.start();
                    return;
                }
                return;
            case 26:
                ActionBarLayout actionBarLayout = (ActionBarLayout) obj2;
                Drawable drawable = ActionBarLayout.f20304p1;
                actionBarLayout.b0((n2) obj, false);
                actionBarLayout.setVisibility(8);
                View view2 = actionBarLayout.B0;
                if (view2 != null) {
                    view2.setVisibility(8);
                    return;
                }
                return;
            case 27:
                n2 n2Var = (n2) obj2;
                n2 n2Var2 = (n2) obj;
                Drawable drawable2 = ActionBarLayout.f20304p1;
                if (n2Var != null) {
                    n2Var.onTransitionAnimationEnd(false, false);
                }
                n2Var2.onTransitionAnimationEnd(true, false);
                n2Var2.onBecomeFullyVisible();
                return;
            case 28:
                c6 c6Var = (c6) obj2;
                ArrayList arrayList2 = (ArrayList) obj;
                int size = arrayList2.size();
                int i12 = 0;
                while (i12 < size) {
                    f6 f6Var = (f6) arrayList2.get(i12);
                    File d = f6Var.d();
                    if (d != null && d.length() > 0) {
                        arrayList2.remove(i12);
                        i12--;
                        size--;
                    } else {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        if (!arrayList.contains(f6Var.f20623o)) {
                            arrayList.add(f6Var.f20623o);
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
                    ConnectionsManager.getInstance(c6Var.f20507a).sendRequest(getmultiwallpapers, new v1(20, c6Var, arrayList2));
                    return;
                }
                return;
            default:
                c6 c6Var2 = (c6) obj2;
                b6 b6Var = (b6) obj;
                TLRPC.TL_wallPaper tL_wallPaper = b6Var.f20474a;
                File pathToAttach = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(tL_wallPaper.document, true);
                ArrayList arrayList3 = b6Var.f20475b;
                int size3 = arrayList3.size();
                ArrayList arrayList4 = null;
                for (int i14 = 0; i14 < size3; i14++) {
                    f6 f6Var2 = (f6) arrayList3.get(i14);
                    if (f6Var2.f20623o.equals(tL_wallPaper.slug)) {
                        Bitmap b10 = c6.b(bitmap, "application/x-tgwallpattern".equals(tL_wallPaper.document.mime_type), pathToAttach, f6Var2);
                        if (arrayList4 == null) {
                            arrayList4 = new ArrayList();
                            arrayList4.add(f6Var2);
                        }
                        bitmap = b10;
                    }
                }
                if (bitmap != null) {
                    bitmap.recycle();
                }
                AndroidUtilities.runOnUIThread(new ci.y0((Object) c6Var2, (Object) arrayList4, false, 11));
                return;
        }
    }

    public h0(m4.a0 a0Var, m4.r rVar, Runnable runnable) {
        this.f14889a = 3;
        this.f14890b = a0Var;
        this.f14891c = runnable;
    }
}
