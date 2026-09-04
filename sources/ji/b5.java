package ji;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.video.VideoAds;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.voip.VoipAudioManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.zn0;
import org.telegram.ui.k41;
public final class b5 implements Runnable {
    public final int f13792a;
    public final Object f13793b;
    public final Object f13794c;

    public b5(int i10, Object obj, Object obj2) {
        this.f13792a = i10;
        this.f13793b = obj;
        this.f13794c = obj2;
    }

    @Override
    public final void run() {
        TLRPC.Document document;
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        TLRPC.Photo photo;
        m4.p1 p1Var;
        int i10 = this.f13792a;
        float f7 = 0.0f;
        int i11 = 2;
        Object obj = this.f13794c;
        Object obj2 = this.f13793b;
        switch (i10) {
            case 0:
                d5 d5Var = (d5) obj2;
                TLObject tLObject = (TLObject) obj;
                boolean z10 = d5Var.f13865e;
                boolean z11 = d5Var.d;
                c5 c5Var = d5Var.f13869s;
                if (!d5Var.f13870w) {
                    d5Var.f13872y = 0;
                    if (!d5Var.f13864c && !z11 && !z10) {
                        if ((tLObject instanceof TLRPC.TL_messageMediaPhoto) && (photo = ((TLRPC.TL_messageMediaPhoto) tLObject).photo) != null) {
                            d5Var.f13871x = true;
                            d5Var.e();
                            c5Var.b(photo);
                            return;
                        }
                    } else if ((tLObject instanceof TLRPC.TL_messageMediaDocument) && (document = ((TLRPC.TL_messageMediaDocument) tLObject).document) != null) {
                        if (z10) {
                            int i12 = d5Var.f13862a;
                            if (document.f19875id != 0 && document.access_hash != 0) {
                                d5Var.f13871x = true;
                                d5Var.e();
                                if (!TextUtils.isEmpty(d5Var.F) && MessageObject.isDocumentHasThumb(document) && (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 320)) != null) {
                                    FileLoader.getInstance(i12).setLocalPathTo(closestPhotoSizeWithSize, d5Var.F);
                                    AndroidUtilities.copyFileSafe(new File(d5Var.F), FileLoader.getInstance(i12).getPathToAttach(closestPhotoSizeWithSize, true));
                                }
                                c5Var.d(document);
                                return;
                            }
                            d5Var.f13871x = true;
                            d5Var.e();
                            c5Var.onError();
                            return;
                        } else if (z11) {
                            d5Var.f13871x = true;
                            d5Var.e();
                            c5Var.e(document);
                            return;
                        } else {
                            d5Var.f13871x = true;
                            d5Var.e();
                            c5Var.c(document);
                            return;
                        }
                    }
                    d5Var.f13871x = true;
                    d5Var.e();
                    c5Var.onError();
                    return;
                }
                return;
            case 1:
                d5 d5Var2 = (d5) obj2;
                String str = (String) obj;
                if (!d5Var2.f13870w && !d5Var2.f13871x) {
                    d5Var2.a(str);
                    return;
                }
                return;
            case 2:
                v5 m10 = ((s5) obj2).v.m((TL_iv.pageTableCell) obj);
                if (m10 != null) {
                    h1 h1Var = m10.f14277a;
                    h1Var.r();
                    h1Var.setSelection(h1Var.length());
                    return;
                }
                return;
            case 3:
                String str2 = e2.d0.f8737a;
                j2.f fVar = ((i2.c0) ((k2.j) ((n4.y) obj2).f16497c)).f11471a.f11533s;
                j2.a p5 = fVar.p();
                fVar.q(p5, 1012, new j2.c(p5, (String) obj, 25));
                return;
            case 4:
                ((k2.n) obj2).O((k2.k) obj);
                return;
            case 5:
                ((i9.c0) obj).m(Boolean.valueOf(((m4.a0) obj2).o()));
                return;
            case 6:
                ((m4.a0) obj2).getClass();
                ((Runnable) obj).run();
                return;
            case 7:
                ((m4.a0) obj2).u(null, (m4.j1) obj);
                return;
            case 8:
                ResultReceiver resultReceiver = (ResultReceiver) obj;
                try {
                    p1Var = (m4.p1) ((i9.u) obj2).f11927a;
                    e2.d.e(p1Var, "SessionResult must not be null");
                } catch (InterruptedException e7) {
                    e = e7;
                    e2.a.o("MediaSessionLegacyStub", "Custom command failed", e);
                    p1Var = new m4.p1(-1);
                } catch (CancellationException e10) {
                    e2.a.o("MediaSessionLegacyStub", "Custom command cancelled", e10);
                    p1Var = new m4.p1(1);
                } catch (ExecutionException e11) {
                    e = e11;
                    e2.a.o("MediaSessionLegacyStub", "Custom command failed", e);
                    p1Var = new m4.p1(-1);
                }
                resultReceiver.send(p1Var.f16049a, p1Var.f16050b);
                return;
            case 9:
                fg.f fVar2 = ((m4.f1) obj2).f15891b;
                m4.r u10 = fVar2.u(((m4.i) obj).asBinder());
                if (u10 != null) {
                    fVar2.N(u10);
                    return;
                }
                return;
            case 10:
                ((m4.f1) obj2).f15891b.o((m4.r) obj);
                return;
            case 11:
                me.b bVar = (me.b) obj2;
                View view = (View) obj;
                me.a aVar = bVar.f16193a;
                if ((bVar.f16195c & 2) != 0) {
                    if (aVar.onLongPressRequestedAt(view, bVar.d, bVar.f16196e)) {
                        bVar.f16195c &= -3;
                        bVar.f16194b = null;
                        float f10 = bVar.d;
                        float f11 = bVar.f16196e;
                        bVar.f16197f = f10;
                        bVar.f16198g = f11;
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
                        bVar.f16195c = (bVar.f16195c | 4) & (-11);
                        bVar.f16194b = null;
                        return;
                    }
                    bVar.f16195c |= 8;
                    return;
                }
                return;
            case 12:
                n2.d dVar = (n2.d) obj2;
                b2.s sVar = (b2.s) obj;
                n2.e eVar = dVar.d;
                if (eVar.E != 0 && !dVar.f16382c) {
                    Looper looper = eVar.I;
                    looper.getClass();
                    dVar.f16381b = eVar.a(looper, dVar.f16380a, sVar, false);
                    eVar.f16392x.add(dVar);
                    return;
                }
                return;
            case 13:
                ((p2.b) ((o2.k) ((o2.q) obj2).f16913c.f16292b).f16876b.d.get(((o2.j) obj).f16873x)).c(true);
                return;
            case 14:
                ((VideoAds) obj2).lambda$showPremium$19((sg.a1) obj);
                return;
            case 15:
                ((VideoAds) obj2).lambda$load$0((TLObject) obj);
                return;
            case 16:
                ((VideoAds) obj2).lambda$show$16((Utilities.Callback) obj);
                return;
            case 17:
                k41.T((Context) obj2, null, false, (bi.s0) obj, null);
                return;
            case 18:
                ((ConferenceCall) obj2).lambda$processUpdates$4((TLRPC.Updates) obj);
                return;
            case 19:
                VideoCapturerDevice.lambda$checkScreenCapturerSize$1((VideoCapturerDevice) obj2, (Point) obj);
                return;
            case 20:
                ((VideoCapturerDevice) obj2).lambda$init$4((String) obj);
                return;
            case 21:
                ((VoIPService) obj2).lambda$startGroupCall$21((TL_update.TL_updateGroupCall) obj);
                return;
            case 22:
                ((VoIPService) obj2).lambda$createGroupInstance$71((String) obj);
                return;
            case 23:
                ((VoIPService) obj2).lambda$startConferenceGroupCall$56((org.telegram.messenger.voip.l0) obj);
                return;
            case 24:
                ((VoIPService) obj2).lambda$startScreenCapture$58((TLRPC.Updates) obj);
                return;
            case 25:
                ((VoipAudioManager) obj2).lambda$isBluetoothAndSpeakerOnAsync$2((Utilities.Callback2) obj);
                return;
            case 26:
                org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) obj2;
                boolean canScrollVertically = ((zn0) obj).canScrollVertically(-1);
                boolean z12 = !canScrollVertically;
                if (kVar.f21110q1 != z12) {
                    ValueAnimator valueAnimator = kVar.f21116s1;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    float f12 = kVar.f21113r1;
                    kVar.f21110q1 = z12;
                    if (!canScrollVertically) {
                        f7 = 1.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f12, f7);
                    kVar.f21116s1 = ofFloat;
                    ofFloat.addUpdateListener(new org.telegram.ui.ActionBar.a(kVar, 4));
                    kVar.f21116s1.addListener(new org.telegram.ui.ActionBar.c(kVar, z12, 1));
                    kVar.f21116s1.setDuration(320L);
                    kVar.f21116s1.setInterpolator(pr.h);
                    kVar.f21116s1.start();
                    return;
                }
                return;
            case 27:
                org.telegram.ui.ActionBar.k kVar2 = (org.telegram.ui.ActionBar.k) obj2;
                boolean canScrollVertically2 = ((RecyclerView) obj).canScrollVertically(-1);
                boolean z13 = !canScrollVertically2;
                if (kVar2.f21110q1 != z13) {
                    ValueAnimator valueAnimator2 = kVar2.f21116s1;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    float f13 = kVar2.f21113r1;
                    kVar2.f21110q1 = z13;
                    if (!canScrollVertically2) {
                        f7 = 1.0f;
                    }
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f13, f7);
                    kVar2.f21116s1 = ofFloat2;
                    ofFloat2.addUpdateListener(new org.telegram.ui.ActionBar.a(kVar2, 3));
                    kVar2.f21116s1.addListener(new org.telegram.ui.ActionBar.c(kVar2, z13, 0));
                    kVar2.f21116s1.setDuration(320L);
                    kVar2.f21116s1.setInterpolator(pr.h);
                    kVar2.f21116s1.start();
                    return;
                }
                return;
            case 28:
                ActionBarLayout actionBarLayout = (ActionBarLayout) obj2;
                Drawable drawable = ActionBarLayout.f20134p1;
                actionBarLayout.b0((org.telegram.ui.ActionBar.n2) obj, false);
                actionBarLayout.setVisibility(8);
                View view2 = actionBarLayout.B0;
                if (view2 != null) {
                    view2.setVisibility(8);
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj2;
                org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) obj;
                Drawable drawable2 = ActionBarLayout.f20134p1;
                if (n2Var != null) {
                    n2Var.onTransitionAnimationEnd(false, false);
                }
                n2Var2.onTransitionAnimationEnd(true, false);
                n2Var2.onBecomeFullyVisible();
                return;
        }
    }

    public b5(m4.a0 a0Var, m4.r rVar, Runnable runnable) {
        this.f13792a = 6;
        this.f13793b = a0Var;
        this.f13794c = runnable;
    }
}
