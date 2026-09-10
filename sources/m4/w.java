package m4;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.os.ResultReceiver;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import bi.o2;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
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
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.bq0;
import org.telegram.ui.Components.io0;
import org.telegram.ui.Components.wr;
import org.telegram.ui.n41;
public final class w implements Runnable {
    public final int f13548a;
    public final Object f13549b;
    public final Object f13550c;

    public w(int i10, Object obj, Object obj2) {
        this.f13548a = i10;
        this.f13549b = obj;
        this.f13550c = obj2;
    }

    @Override
    public final void run() {
        r1 r1Var;
        int i10 = this.f13548a;
        float f7 = 0.0f;
        int i11 = 2;
        ArrayList arrayList = null;
        Bitmap bitmap = null;
        Object obj = this.f13550c;
        Object obj2 = this.f13549b;
        switch (i10) {
            case 0:
                ((i9.c0) obj).m(Boolean.valueOf(((b0) obj2).o()));
                return;
            case 1:
                ((b0) obj2).getClass();
                ((Runnable) obj).run();
                return;
            case 2:
                ((b0) obj2).u(null, (l1) obj);
                return;
            case 3:
                ResultReceiver resultReceiver = (ResultReceiver) obj;
                try {
                    r1Var = (r1) ((i9.u) obj2).f10540a;
                    e2.d.e(r1Var, "SessionResult must not be null");
                } catch (InterruptedException e) {
                    e = e;
                    e2.a.o("MediaSessionLegacyStub", "Custom command failed", e);
                    r1Var = new r1(-1);
                } catch (CancellationException e7) {
                    e2.a.o("MediaSessionLegacyStub", "Custom command cancelled", e7);
                    r1Var = new r1(1);
                } catch (ExecutionException e10) {
                    e = e10;
                    e2.a.o("MediaSessionLegacyStub", "Custom command failed", e);
                    r1Var = new r1(-1);
                }
                resultReceiver.send(r1Var.f13505a, r1Var.f13506b);
                return;
            case 4:
                ki.f fVar = ((h1) obj2).f13376b;
                r s10 = fVar.s(((i) obj).asBinder());
                if (s10 != null) {
                    fVar.K(s10);
                    return;
                }
                return;
            case 5:
                ((h1) obj2).f13376b.n((r) obj);
                return;
            case 6:
                me.b bVar = (me.b) obj2;
                View view = (View) obj;
                me.a aVar = bVar.f13640a;
                if ((bVar.f13642c & 2) != 0) {
                    if (aVar.onLongPressRequestedAt(view, bVar.d, bVar.e)) {
                        bVar.f13642c &= -3;
                        bVar.f13641b = null;
                        float f10 = bVar.d;
                        float f11 = bVar.e;
                        bVar.f13643f = f10;
                        bVar.f13644g = f11;
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
                        bVar.f13642c = (bVar.f13642c | 4) & (-11);
                        bVar.f13641b = null;
                        return;
                    }
                    bVar.f13642c |= 8;
                    return;
                }
                return;
            case 7:
                n2.d dVar = (n2.d) obj2;
                b2.s sVar = (b2.s) obj;
                n2.e eVar = dVar.d;
                if (eVar.E != 0 && !dVar.f13717c) {
                    Looper looper = eVar.I;
                    looper.getClass();
                    dVar.f13716b = eVar.a(looper, dVar.f13715a, sVar, false);
                    eVar.f13726x.add(dVar);
                    return;
                }
                return;
            case 8:
                ((p2.b) ((o2.k) ((o2.q) obj2).f14216c.f14084a).f14181b.d.get(((o2.j) obj).f14178x)).c(true);
                return;
            case 9:
                og.v0 v0Var = (og.v0) obj2;
                v0Var.v = true;
                RectF f12 = v0Var.f();
                Object obj3 = v0Var.f14512a.f12721b;
                v0Var.f14530w = new a5.a((ByteBuffer) v0Var.h(v0Var.f(), true, false, false).f14498c, 0, f12);
                v0Var.a(false);
                ((og.c1) obj).run();
                return;
            case 10:
                Runnable runnable = (Runnable) obj;
                og.f1 f1Var = ((og.h1) obj2).d;
                if (f1Var != null && f1Var.f14357f) {
                    og.f1.b(f1Var);
                    runnable.run();
                    return;
                }
                return;
            case 11:
                ((VideoAds) obj2).lambda$showPremium$19((qg.a1) obj);
                return;
            case 12:
                ((VideoAds) obj2).lambda$load$0((TLObject) obj);
                return;
            case 13:
                ((VideoAds) obj2).lambda$show$16((Utilities.Callback) obj);
                return;
            case 14:
                n41.T((Context) obj2, null, false, (bq0) obj, null);
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
                ((VoIPService) obj2).lambda$startConferenceGroupCall$56((org.telegram.messenger.voip.o0) obj);
                return;
            case 21:
                ((VoIPService) obj2).lambda$startScreenCapture$58((TLRPC.Updates) obj);
                return;
            case 22:
                ((VoipAudioManager) obj2).lambda$isBluetoothAndSpeakerOnAsync$2((Utilities.Callback2) obj);
                return;
            case 23:
                org.telegram.ui.ActionBar.l lVar = (org.telegram.ui.ActionBar.l) obj2;
                boolean canScrollVertically = ((io0) obj).canScrollVertically(-1);
                boolean z10 = !canScrollVertically;
                if (lVar.f18396q1 != z10) {
                    ValueAnimator valueAnimator = lVar.f18402s1;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    float f13 = lVar.f18399r1;
                    lVar.f18396q1 = z10;
                    if (!canScrollVertically) {
                        f7 = 1.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f13, f7);
                    lVar.f18402s1 = ofFloat;
                    ofFloat.addUpdateListener(new org.telegram.ui.ActionBar.a(lVar, 4));
                    lVar.f18402s1.addListener(new org.telegram.ui.ActionBar.c(lVar, z10, 1));
                    lVar.f18402s1.setDuration(320L);
                    lVar.f18402s1.setInterpolator(wr.h);
                    lVar.f18402s1.start();
                    return;
                }
                return;
            case 24:
                org.telegram.ui.ActionBar.l lVar2 = (org.telegram.ui.ActionBar.l) obj2;
                boolean canScrollVertically2 = ((RecyclerView) obj).canScrollVertically(-1);
                boolean z11 = !canScrollVertically2;
                if (lVar2.f18396q1 != z11) {
                    ValueAnimator valueAnimator2 = lVar2.f18402s1;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    float f14 = lVar2.f18399r1;
                    lVar2.f18396q1 = z11;
                    if (!canScrollVertically2) {
                        f7 = 1.0f;
                    }
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f14, f7);
                    lVar2.f18402s1 = ofFloat2;
                    ofFloat2.addUpdateListener(new org.telegram.ui.ActionBar.a(lVar2, 3));
                    lVar2.f18402s1.addListener(new org.telegram.ui.ActionBar.c(lVar2, z11, 0));
                    lVar2.f18402s1.setDuration(320L);
                    lVar2.f18402s1.setInterpolator(wr.h);
                    lVar2.f18402s1.start();
                    return;
                }
                return;
            case 25:
                ActionBarLayout actionBarLayout = (ActionBarLayout) obj2;
                Drawable drawable = ActionBarLayout.f17466p1;
                actionBarLayout.b0((p2) obj, false);
                actionBarLayout.setVisibility(8);
                View view2 = actionBarLayout.B0;
                if (view2 != null) {
                    view2.setVisibility(8);
                    return;
                }
                return;
            case 26:
                p2 p2Var = (p2) obj2;
                p2 p2Var2 = (p2) obj;
                Drawable drawable2 = ActionBarLayout.f17466p1;
                if (p2Var != null) {
                    p2Var.onTransitionAnimationEnd(false, false);
                }
                p2Var2.onTransitionAnimationEnd(true, false);
                p2Var2.onBecomeFullyVisible();
                return;
            case 27:
                e6 e6Var = (e6) obj2;
                ArrayList arrayList2 = (ArrayList) obj;
                int size = arrayList2.size();
                int i12 = 0;
                while (i12 < size) {
                    h6 h6Var = (h6) arrayList2.get(i12);
                    File d = h6Var.d();
                    if (d != null && d.length() > 0) {
                        arrayList2.remove(i12);
                        i12--;
                        size--;
                    } else {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        if (!arrayList.contains(h6Var.f17803o)) {
                            arrayList.add(h6Var.f17803o);
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
                    ConnectionsManager.getInstance(e6Var.f17693a).sendRequest(getmultiwallpapers, new o2(15, e6Var, arrayList2));
                    return;
                }
                return;
            case 28:
                e6 e6Var2 = (e6) obj2;
                d6 d6Var = (d6) obj;
                TLRPC.TL_wallPaper tL_wallPaper = d6Var.f17656a;
                File pathToAttach = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(tL_wallPaper.document, true);
                ArrayList arrayList3 = d6Var.f17657b;
                int size3 = arrayList3.size();
                ArrayList arrayList4 = null;
                for (int i14 = 0; i14 < size3; i14++) {
                    h6 h6Var2 = (h6) arrayList3.get(i14);
                    if (h6Var2.f17803o.equals(tL_wallPaper.slug)) {
                        Bitmap b10 = e6.b(bitmap, "application/x-tgwallpattern".equals(tL_wallPaper.document.mime_type), pathToAttach, h6Var2);
                        if (arrayList4 == null) {
                            arrayList4 = new ArrayList();
                            arrayList4.add(h6Var2);
                        }
                        bitmap = b10;
                    }
                }
                if (bitmap != null) {
                    bitmap.recycle();
                }
                AndroidUtilities.runOnUIThread(new bi.c1((Object) e6Var2, (Object) arrayList4, false, 10));
                return;
            default:
                i6 i6Var = (i6) obj2;
                i6Var.d((File) obj, i6Var.f17845h0);
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.q(i6Var, 19));
                return;
        }
    }

    public w(b0 b0Var, r rVar, Runnable runnable) {
        this.f13548a = 1;
        this.f13549b = b0Var;
        this.f13550c = runnable;
    }
}
