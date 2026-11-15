package oi;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import di.m6;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.i20;
import org.telegram.messenger.m10;
import org.telegram.messenger.s10;
import org.telegram.messenger.video.VideoAds;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.messenger.voip.GroupCallMessagesController;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.voip.VoipAudioManager;
import org.telegram.messenger.w7;
import org.telegram.messenger.z10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.qy0;
public final class u4 implements Runnable {
    public final int f22032a;
    public final Object f22033b;
    public final Object f22034c;

    public u4(int i7, Object obj, Object obj2) {
        this.f22032a = i7;
        this.f22033b = obj;
        this.f22034c = obj2;
    }

    @Override
    public final void run() {
        TLRPC.Document document;
        TLRPC.PhotoSize w10;
        TLRPC.Photo photo;
        int i7 = this.f22032a;
        float f10 = 1.0f;
        ArrayList arrayList = null;
        Bitmap bitmap = null;
        Object obj = this.f22034c;
        Object obj2 = this.f22033b;
        switch (i7) {
            case 0:
                w4 w4Var = (w4) obj2;
                TLObject tLObject = (TLObject) obj;
                boolean z10 = w4Var.f22097e;
                boolean z11 = w4Var.d;
                v4 v4Var = w4Var.f22101s;
                if (!w4Var.f22103x) {
                    w4Var.E = 0;
                    if (!w4Var.f22096c && !z11 && !z10) {
                        if ((tLObject instanceof TLRPC.TL_messageMediaPhoto) && (photo = ((TLRPC.TL_messageMediaPhoto) tLObject).photo) != null) {
                            w4Var.f22104y = true;
                            w4Var.e();
                            v4Var.c(photo);
                            return;
                        }
                    } else if ((tLObject instanceof TLRPC.TL_messageMediaDocument) && (document = ((TLRPC.TL_messageMediaDocument) tLObject).document) != null) {
                        if (z10) {
                            int i10 = w4Var.f22094a;
                            if (document.f28057id != 0 && document.access_hash != 0) {
                                w4Var.f22104y = true;
                                w4Var.e();
                                if (!TextUtils.isEmpty(w4Var.G) && gj.W2(document) && (w10 = w7.w(document.thumbs, 320, false, null, false)) != null) {
                                    w7.G(i10).e0(w4Var.G, w10);
                                    File file = new File(w4Var.G);
                                    w7.G(i10);
                                    org.telegram.messenger.g0.F(file, w7.J(w10, null, true, true));
                                }
                                v4Var.e(document);
                                return;
                            }
                            w4Var.f22104y = true;
                            w4Var.e();
                            v4Var.a();
                            return;
                        } else if (z11) {
                            w4Var.f22104y = true;
                            w4Var.e();
                            v4Var.f(document);
                            return;
                        } else {
                            w4Var.f22104y = true;
                            w4Var.e();
                            v4Var.d(document);
                            return;
                        }
                    }
                    w4Var.f22104y = true;
                    w4Var.e();
                    v4Var.a();
                    return;
                }
                return;
            case 1:
                w4 w4Var2 = (w4) obj2;
                String str = (String) obj;
                if (!w4Var2.f22103x && !w4Var2.f22104y) {
                    w4Var2.a(str);
                    return;
                }
                return;
            case 2:
                n5 m10 = ((k5) obj2).f21778w.m((TL_iv.pageTableCell) obj);
                if (m10 != null) {
                    e1 e1Var = m10.f21845a;
                    e1Var.O();
                    e1Var.setSelection(e1Var.length());
                    return;
                }
                return;
            case 3:
                ((VideoAds) obj2).lambda$showPremium$19((ug.x0) obj);
                return;
            case 4:
                ((VideoAds) obj2).lambda$load$0((TLObject) obj);
                return;
            case 5:
                ((VideoAds) obj2).lambda$show$16((z10) obj);
                return;
            case 6:
                qy0.d1((Context) obj2, null, false, (fi.i0) obj, null);
                return;
            case 7:
                ((ConferenceCall) obj2).lambda$processUpdates$4((TLRPC.Updates) obj);
                return;
            case 8:
                ((GroupCallMessagesController) obj2).lambda$sendCallMessage$5((String) obj);
                return;
            case 9:
                VideoCapturerDevice.lambda$checkScreenCapturerSize$1((VideoCapturerDevice) obj2, (Point) obj);
                return;
            case 10:
                ((VideoCapturerDevice) obj2).lambda$init$4((String) obj);
                return;
            case 11:
                ((VoIPService) obj2).lambda$startGroupCall$21((TL_update.TL_updateGroupCall) obj);
                return;
            case 12:
                ((VoIPService) obj2).lambda$createGroupInstance$71((String) obj);
                return;
            case 13:
                ((VoIPService) obj2).lambda$startConferenceGroupCall$56((org.telegram.messenger.voip.l0) obj);
                return;
            case 14:
                ((VoIPService) obj2).lambda$startScreenCapture$58((TLRPC.Updates) obj);
                return;
            case 15:
                ((AudioManager) obj2).setCommunicationDevice((AudioDeviceInfo) obj);
                return;
            case 16:
                ((VoipAudioManager) obj2).lambda$isBluetoothAndSpeakerOnAsync$4((s10) obj);
                return;
            case 17:
                org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) obj2;
                boolean canScrollVertically = ((lm0) obj).canScrollVertically(-1);
                boolean z12 = !canScrollVertically;
                if (kVar.D1 != z12) {
                    ValueAnimator valueAnimator = kVar.F1;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    float f11 = kVar.E1;
                    kVar.D1 = z12;
                    if (canScrollVertically) {
                        f10 = 0.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
                    kVar.F1 = ofFloat;
                    ofFloat.addUpdateListener(new org.telegram.ui.ActionBar.a(kVar, 4));
                    kVar.F1.addListener(new org.telegram.ui.ActionBar.c(kVar, z12, 1));
                    kVar.F1.setDuration(320L);
                    kVar.F1.setInterpolator(er.h);
                    kVar.F1.start();
                    return;
                }
                return;
            case 18:
                org.telegram.ui.ActionBar.k kVar2 = (org.telegram.ui.ActionBar.k) obj2;
                boolean canScrollVertically2 = ((RecyclerView) obj).canScrollVertically(-1);
                boolean z13 = !canScrollVertically2;
                if (kVar2.D1 != z13) {
                    ValueAnimator valueAnimator2 = kVar2.F1;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    float f12 = kVar2.E1;
                    kVar2.D1 = z13;
                    if (canScrollVertically2) {
                        f10 = 0.0f;
                    }
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f12, f10);
                    kVar2.F1 = ofFloat2;
                    ofFloat2.addUpdateListener(new org.telegram.ui.ActionBar.a(kVar2, 3));
                    kVar2.F1.addListener(new org.telegram.ui.ActionBar.c(kVar2, z13, 0));
                    kVar2.F1.setDuration(320L);
                    kVar2.F1.setInterpolator(er.h);
                    kVar2.F1.start();
                    return;
                }
                return;
            case 19:
                ActionBarLayout actionBarLayout = (ActionBarLayout) obj2;
                Drawable drawable = ActionBarLayout.f28322w1;
                actionBarLayout.e0((org.telegram.ui.ActionBar.e2) obj, false);
                actionBarLayout.setVisibility(8);
                View view = actionBarLayout.I0;
                if (view != null) {
                    view.setVisibility(8);
                    return;
                }
                return;
            case 20:
                org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) obj2;
                org.telegram.ui.ActionBar.e2 e2Var2 = (org.telegram.ui.ActionBar.e2) obj;
                Drawable drawable2 = ActionBarLayout.f28322w1;
                if (e2Var != null) {
                    e2Var.onTransitionAnimationEnd(false, false);
                }
                e2Var2.onTransitionAnimationEnd(true, false);
                e2Var2.onBecomeFullyVisible();
                return;
            case 21:
                d6 d6Var = (d6) obj2;
                ArrayList arrayList2 = (ArrayList) obj;
                int size = arrayList2.size();
                int i11 = 0;
                while (i11 < size) {
                    g6 g6Var = (g6) arrayList2.get(i11);
                    File e10 = g6Var.e();
                    if (e10 != null && e10.length() > 0) {
                        arrayList2.remove(i11);
                        i11--;
                        size--;
                    } else {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        if (!arrayList.contains(g6Var.f28614o)) {
                            arrayList.add(g6Var.f28614o);
                        }
                    }
                    i11++;
                }
                if (arrayList != null) {
                    TL_account.getMultiWallPapers getmultiwallpapers = new TL_account.getMultiWallPapers();
                    int size2 = arrayList.size();
                    for (int i12 = 0; i12 < size2; i12++) {
                        TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
                        tL_inputWallPaperSlug.slug = (String) arrayList.get(i12);
                        getmultiwallpapers.wallpapers.add(tL_inputWallPaperSlug);
                    }
                    ConnectionsManager.getInstance(d6Var.f28508a).sendRequest(getmultiwallpapers, new bi.v2(28, d6Var, arrayList2));
                    return;
                }
                return;
            case 22:
                d6 d6Var2 = (d6) obj2;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) obj;
                TLRPC.TL_wallPaper tL_wallPaper = c6Var.f28497a;
                w7.G(m10.f24940t0);
                File J = w7.J(tL_wallPaper.document, null, true, true);
                ArrayList arrayList3 = c6Var.f28498b;
                int size3 = arrayList3.size();
                ArrayList arrayList4 = null;
                for (int i13 = 0; i13 < size3; i13++) {
                    g6 g6Var2 = (g6) arrayList3.get(i13);
                    if (g6Var2.f28614o.equals(tL_wallPaper.slug)) {
                        Bitmap b10 = d6.b(bitmap, "application/x-tgwallpattern".equals(tL_wallPaper.document.mime_type), J, g6Var2);
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
                org.telegram.messenger.g0.h3(new m6((Object) d6Var2, (Object) arrayList4, false, 13));
                return;
            case 23:
                i6 i6Var = (i6) obj2;
                i6Var.d((File) obj, i6Var.f28711i0);
                org.telegram.messenger.g0.h3(new h6(i6Var, 0));
                return;
            case 24:
                ((org.telegram.ui.o) obj2).c0((TLRPC.TL_messages_archivedStickers) obj);
                return;
            case 25:
                org.telegram.ui.g4 g4Var = (org.telegram.ui.g4) obj2;
                vf.b bVar = (vf.b) obj;
                org.telegram.ui.t3 t3Var = g4Var.L;
                if (t3Var != null) {
                    t3Var.a(true);
                }
                if (g4Var.O0 == bVar) {
                    g4Var.O0 = null;
                    return;
                }
                return;
            case 26:
                ((org.telegram.ui.g4) obj2).T0.d();
                ((AnimatorSet) obj).start();
                return;
            case 27:
                org.telegram.ui.e2.a((org.telegram.ui.e2) obj2, (SpannableString) obj);
                return;
            case 28:
                ArrayList arrayList5 = (ArrayList) obj;
                org.telegram.ui.p4 p4Var = (org.telegram.ui.p4) ((org.telegram.ui.m4) obj2).f49100b;
                if (!arrayList5.isEmpty()) {
                    for (int i14 = 0; i14 < arrayList5.size(); i14++) {
                        p4Var.getMessagesController().J4(p4Var.Z() * 60, ((Long) arrayList5.get(i14)).longValue());
                    }
                    if (p4Var.Z() > 0) {
                        i20.t(hd.a0("AutodeleteTimerEnabledForChats", null, 2131753778, hd.c0(p4Var.Z() * 60), hd.G(arrayList5.size(), "Chats", Integer.valueOf(arrayList5.size()))), cc.a0(p4Var), 2131624021, 36);
                        return;
                    } else {
                        cc.a0(p4Var).Q(2131624020, 36, hd.a0("AutodeleteTimerDisabledForChats", null, 2131753779, hd.G(arrayList5.size(), "Chats", Integer.valueOf(arrayList5.size())))).j();
                        return;
                    }
                }
                return;
            default:
                org.telegram.ui.t5 t5Var = (org.telegram.ui.t5) obj2;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                t5Var.U = tL_premium_boostsStatus;
                if (tL_premium_boostsStatus != null) {
                    t5Var.getMessagesController().G0().b(t5Var.S, t5Var.U, new org.telegram.ui.l5(t5Var, 0));
                }
                t5Var.f51367i0.animate().cancel();
                t5Var.f51367i0.animate().alpha(0.0f).setDuration(100L).setStartDelay(0L).setListener(new ki.s3(t5Var, 18));
                t5Var.I0(true);
                t5Var.J0(true);
                t5Var.H0(null);
                return;
        }
    }
}
