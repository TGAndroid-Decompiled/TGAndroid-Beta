package org.telegram.messenger.voip;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import f2.o1;
import hh.t5;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import lh.h9;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.CacheByChatsController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.y1;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.a6;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.b4;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.h00;
import org.telegram.ui.Components.kn0;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.y4;
import org.telegram.ui.Components.yh0;
import org.telegram.ui.Components.zo;
import org.telegram.ui.ad;
import org.telegram.ui.f9;
import org.telegram.ui.id;
import org.telegram.ui.k9;
import org.telegram.ui.m4;
import org.telegram.ui.n4;
import org.telegram.ui.n5;
import org.telegram.ui.na;
import org.telegram.ui.q4;
import org.telegram.ui.q91;
import org.telegram.ui.qb;
import org.telegram.ui.s9;
import org.telegram.ui.t9;
import org.telegram.ui.ta1;
import org.telegram.ui.tc;
import org.telegram.ui.uc;
import org.telegram.ui.v5;
import org.telegram.ui.vc;
import org.telegram.ui.w8;
import org.telegram.ui.x5;
import org.telegram.ui.xc;
import org.telegram.ui.y70;
import org.telegram.ui.yb;
import org.telegram.ui.z3;
import org.telegram.ui.z5;
import org.telegram.ui.z6;

public final class l0 implements Runnable {

    public final int f21936a;

    public final Object f21937b;

    public final Object f21938c;

    public l0(int i10, Object obj, Object obj2) {
        this.f21936a = i10;
        this.f21937b = obj;
        this.f21938c = obj2;
    }

    @Override
    public final void run() {
        int i10;
        int i11;
        mc mcVarA0;
        int i12;
        int i13;
        boolean z10;
        int i14 = this.f21936a;
        int i15 = 24;
        ArrayList arrayList = null;
        Bitmap bitmap = null;
        int i16 = -1;
        int i17 = 0;
        int i18 = 1;
        Object obj = this.f21938c;
        Object obj2 = this.f21937b;
        switch (i14) {
            case 0:
                ((VoIPService) obj2).lambda$startScreenCapture$58((TLRPC.Updates) obj);
                break;
            case 1:
                ((VoipAudioManager) obj2).lambda$isBluetoothAndSpeakerOnAsync$2((Utilities.Callback2) obj);
                break;
            case 2:
                org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) obj2;
                boolean zCanScrollVertically = ((kn0) obj).canScrollVertically(-1);
                boolean z11 = !zCanScrollVertically;
                if (kVar.f23583m1 != z11) {
                    ValueAnimator valueAnimator = kVar.f23588o1;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    float f10 = kVar.f23586n1;
                    kVar.f23583m1 = z11;
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f10, zCanScrollVertically ? 0.0f : 1.0f);
                    kVar.f23588o1 = valueAnimatorOfFloat;
                    valueAnimatorOfFloat.addUpdateListener(new org.telegram.ui.ActionBar.a(kVar, 4));
                    kVar.f23588o1.addListener(new org.telegram.ui.ActionBar.c(kVar, z11, i18));
                    kVar.f23588o1.setDuration(320L);
                    kVar.f23588o1.setInterpolator(er.h);
                    kVar.f23588o1.start();
                    break;
                }
                break;
            case 3:
                int i19 = 0;
                org.telegram.ui.ActionBar.k kVar2 = (org.telegram.ui.ActionBar.k) obj2;
                boolean zCanScrollVertically2 = ((RecyclerView) obj).canScrollVertically(-1);
                boolean z12 = !zCanScrollVertically2;
                if (kVar2.f23583m1 != z12) {
                    ValueAnimator valueAnimator2 = kVar2.f23588o1;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    float f11 = kVar2.f23586n1;
                    kVar2.f23583m1 = z12;
                    ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(f11, zCanScrollVertically2 ? 0.0f : 1.0f);
                    kVar2.f23588o1 = valueAnimatorOfFloat2;
                    valueAnimatorOfFloat2.addUpdateListener(new org.telegram.ui.ActionBar.a(kVar2, 3));
                    kVar2.f23588o1.addListener(new org.telegram.ui.ActionBar.c(kVar2, z12, i19));
                    kVar2.f23588o1.setDuration(320L);
                    kVar2.f23588o1.setInterpolator(er.h);
                    kVar2.f23588o1.start();
                    break;
                }
                break;
            case 4:
                ActionBarLayout actionBarLayout = (ActionBarLayout) obj2;
                Drawable drawable = ActionBarLayout.l1;
                actionBarLayout.b0((n2) obj, false);
                actionBarLayout.setVisibility(8);
                View view = actionBarLayout.f22687x0;
                if (view != null) {
                    view.setVisibility(8);
                }
                break;
            case 5:
                n2 n2Var = (n2) obj2;
                n2 n2Var2 = (n2) obj;
                Drawable drawable2 = ActionBarLayout.l1;
                if (n2Var != null) {
                    n2Var.onTransitionAnimationEnd(false, false);
                }
                n2Var2.onTransitionAnimationEnd(true, false);
                n2Var2.onBecomeFullyVisible();
                break;
            case 6:
                b6 b6Var = (b6) obj2;
                ArrayList arrayList2 = (ArrayList) obj;
                int size = arrayList2.size();
                int i20 = 0;
                while (i20 < size) {
                    e6 e6Var = (e6) arrayList2.get(i20);
                    File fileD = e6Var.d();
                    if (fileD == null || fileD.length() <= 0) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        if (!arrayList.contains(e6Var.f22895o)) {
                            arrayList.add(e6Var.f22895o);
                        }
                    } else {
                        arrayList2.remove(i20);
                        i20--;
                        size--;
                    }
                    i20++;
                }
                if (arrayList != null) {
                    TL_account.getMultiWallPapers getmultiwallpapers = new TL_account.getMultiWallPapers();
                    int size2 = arrayList.size();
                    for (int i21 = 0; i21 < size2; i21++) {
                        TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
                        tL_inputWallPaperSlug.slug = (String) arrayList.get(i21);
                        getmultiwallpapers.wallpapers.add(tL_inputWallPaperSlug);
                    }
                    ConnectionsManager.getInstance(b6Var.f22787a).sendRequest(getmultiwallpapers, new cg.g0(i15, b6Var, arrayList2));
                    break;
                }
                break;
            case 7:
                boolean z13 = false;
                b6 b6Var2 = (b6) obj2;
                a6 a6Var = (a6) obj;
                TLRPC.TL_wallPaper tL_wallPaper = a6Var.f22734a;
                File pathToAttach = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(tL_wallPaper.document, true);
                ArrayList arrayList3 = a6Var.f22735b;
                int size3 = arrayList3.size();
                ArrayList arrayList4 = null;
                for (int i22 = 0; i22 < size3; i22++) {
                    e6 e6Var2 = (e6) arrayList3.get(i22);
                    if (e6Var2.f22895o.equals(tL_wallPaper.slug)) {
                        Bitmap bitmapB = b6.b(bitmap, "application/x-tgwallpattern".equals(tL_wallPaper.document.mime_type), pathToAttach, e6Var2);
                        if (arrayList4 == null) {
                            arrayList4 = new ArrayList();
                            arrayList4.add(e6Var2);
                        }
                        bitmap = bitmapB;
                    }
                }
                if (bitmap != null) {
                    bitmap.recycle();
                }
                AndroidUtilities.runOnUIThread(new t5(b6Var2, arrayList4, z13, 8));
                break;
            case 8:
                f6 f6Var = (f6) obj2;
                f6Var.d((File) obj, f6Var.f22947d0);
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.p(f6Var, 19));
                break;
            case 9:
                ((org.telegram.ui.q) obj2).X((TLRPC.TL_messages_archivedStickers) obj);
                break;
            case 10:
                m4 m4Var = (m4) obj2;
                we.d dVar = (we.d) obj;
                z3 z3Var = m4Var.G;
                if (z3Var != null) {
                    z3Var.dismiss(true);
                }
                if (m4Var.I0 == dVar) {
                    m4Var.I0 = null;
                }
                break;
            case 11:
                ((m4) obj2).N0.lock();
                ((AnimatorSet) obj).start();
                break;
            case 12:
                ArrayList arrayList5 = (ArrayList) obj;
                q4 q4Var = ((n4) obj2).f40658a;
                if (!arrayList5.isEmpty()) {
                    for (int i23 = 0; i23 < arrayList5.size(); i23++) {
                        q4Var.getMessagesController().setDialogHistoryTTL(((Long) arrayList5.get(i23)).longValue(), q4Var.U() * 60);
                    }
                    if (q4Var.U() > 0) {
                        mc.a0(q4Var).Q(R.raw.fire_on, 36, AndroidUtilities.replaceTags(LocaleController.formatString("AutodeleteTimerEnabledForChats", R.string.AutodeleteTimerEnabledForChats, LocaleController.formatTTLString(q4Var.U() * 60), LocaleController.formatPluralString("Chats", arrayList5.size(), Integer.valueOf(arrayList5.size()))))).j();
                    } else {
                        mc.a0(q4Var).Q(R.raw.fire_off, 36, LocaleController.formatString("AutodeleteTimerDisabledForChats", R.string.AutodeleteTimerDisabledForChats, LocaleController.formatPluralString("Chats", arrayList5.size(), Integer.valueOf(arrayList5.size())))).j();
                    }
                }
                break;
            case 13:
                int i24 = 0;
                v5 v5Var = (v5) obj2;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                v5Var.N = tL_premium_boostsStatus;
                if (tL_premium_boostsStatus != null) {
                    v5Var.getMessagesController().getBoostsController().userCanBoostChannel(v5Var.L, v5Var.N, new n5(v5Var, i24));
                }
                v5Var.f43356b0.animate().cancel();
                v5Var.f43356b0.animate().alpha(0.0f).setDuration(100L).setStartDelay(0L).setListener(new h9(v5Var, 9));
                v5Var.F0(true);
                v5Var.G0(true);
                v5Var.E0(null);
                break;
            case 14:
                org.telegram.ui.a6 a6Var2 = (org.telegram.ui.a6) obj2;
                CacheByChatsController.KeepMediaException keepMediaException = (CacheByChatsController.KeepMediaException) obj;
                ArrayList arrayList6 = a6Var2.f36381c;
                int i25 = 0;
                while (true) {
                    if (i25 >= arrayList6.size()) {
                        i10 = 0;
                    } else if (((z5) arrayList6.get(i25)).f45029c == null || ((z5) arrayList6.get(i25)).f45029c.dialogId != keepMediaException.dialogId) {
                        i25++;
                    } else {
                        i10 = i25;
                    }
                }
                o1 o1VarK = a6Var2.f36380b.K(i10);
                if (o1VarK != null) {
                    View view2 = o1VarK.f5789a;
                    y70 y70Var = new y70(a6Var2.getParentActivity(), a6Var2);
                    y70Var.g(true);
                    y70Var.setParentWindow(y4.Q(a6Var2, y70Var, view2, view2.getMeasuredWidth() / 2.0f, view2.getMeasuredHeight() / 2.0f));
                    y70Var.setCallback(new x5(a6Var2, keepMediaException, i18));
                }
                break;
            case 15:
                z6.Y((z6) obj2, (b2) obj);
                break;
            case 16:
                yh0 yh0Var = new yh0((Context) obj2, LocaleController.getString(R.string.InviteByQRCode), ((String[]) obj)[0], LocaleController.getString(R.string.QRCodeLinkGroupCall), false);
                yh0Var.m(R.raw.qr_code_logo);
                yh0Var.show();
                break;
            case 17:
                ((w8) obj2).f43642b.j0(((TLRPC.Message) i0.a.i(1, ((f9) obj).f38009c)).f22401id, 100);
                break;
            case 18:
                t9 t9Var = (t9) obj2;
                String str = (String) obj;
                s9 s9Var = t9Var.H;
                if (s9Var != null) {
                    s9Var.C(str);
                }
                if (t9Var.R != 3) {
                    t9Var.finishFragment();
                }
                break;
            case 19:
                t9 t9Var2 = (t9) obj2;
                MrzRecognizer.Result result = (MrzRecognizer.Result) obj;
                t9Var2.f42823f.setText(result.rawMRZ);
                t9Var2.f42823f.animate().setDuration(200L).alpha(1.0f).setInterpolator(er.f28122f).start();
                s9 s9Var2 = t9Var2.H;
                if (s9Var2 != null) {
                    s9Var2.T0(result);
                }
                AndroidUtilities.runOnUIThread(new k9(t9Var2, 3), 1200L);
                break;
            case 20:
                t9 t9Var3 = (t9) obj2;
                j9.a aVar = (j9.a) obj;
                RectF rectF = (RectF) aVar.f12864c;
                PointF[] pointFArr = (PointF[]) aVar.d;
                RectF rectF2 = t9Var3.E;
                PointF[] pointFArr2 = t9Var3.A;
                RectF rectF3 = t9Var3.F;
                PointF[] pointFArr3 = t9Var3.B;
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                long j10 = t9Var3.G;
                if (j10 == 0) {
                    t9Var3.G = jElapsedRealtime - 75;
                    rectF3.set(rectF);
                    rectF2.set(rectF);
                    if (pointFArr == null) {
                        t9.d0(rectF, pointFArr2);
                        t9.d0(rectF, pointFArr3);
                    } else {
                        for (int i26 = 0; i26 < 4; i26++) {
                            PointF pointF = pointFArr2[i26];
                            PointF pointF2 = pointFArr[i26];
                            pointF.set(pointF2.x, pointF2.y);
                            PointF pointF3 = pointFArr3[i26];
                            PointF pointF4 = pointFArr[i26];
                            pointF3.set(pointF4.x, pointF4.y);
                        }
                    }
                } else {
                    if (rectF2 != null) {
                        long j11 = jElapsedRealtime - j10;
                        if (j11 < 75) {
                            float fMin = Math.min(1.0f, Math.max(0.0f, j11 / 75.0f));
                            AndroidUtilities.lerp(rectF2, rectF3, fMin, rectF2);
                            for (int i27 = 0; i27 < 4; i27++) {
                                PointF pointF5 = pointFArr2[i27];
                                pointF5.set(AndroidUtilities.lerp(pointF5.x, pointFArr3[i27].x, fMin), AndroidUtilities.lerp(pointFArr2[i27].y, pointFArr3[i27].y, fMin));
                            }
                        } else {
                            rectF2.set(rectF3);
                            for (i11 = 0; i11 < 4; i11++) {
                                PointF pointF6 = pointFArr2[i11];
                                PointF pointF7 = pointFArr3[i11];
                                pointF6.set(pointF7.x, pointF7.y);
                            }
                        }
                    } else {
                        rectF2.set(rectF3);
                        while (i11 < 4) {
                            PointF pointF8 = pointFArr2[i11];
                            PointF pointF9 = pointFArr3[i11];
                            pointF8.set(pointF9.x, pointF9.y);
                        }
                    }
                    rectF3.set(rectF);
                    if (pointFArr == null) {
                        t9.d0(rectF3, pointFArr3);
                    } else {
                        while (i17 < 4) {
                            PointF pointF10 = pointFArr3[i17];
                            PointF pointF11 = pointFArr[i17];
                            pointF10.set(pointF11.x, pointF11.y);
                            i17++;
                        }
                    }
                    t9Var3.G = jElapsedRealtime;
                }
                t9Var3.fragmentView.invalidate();
                break;
            case 21:
                na.W((na) obj2, (String) obj);
                break;
            case 22:
                qb qbVar = (qb) obj2;
                mc.a0(qbVar).Q(R.raw.ic_ban, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.RestrictedParticipantSending, UserObject.getFirstName((TLRPC.User) obj)))).k(false);
                qbVar.W0();
                break;
            case 23:
                qb qbVar2 = (qb) obj2;
                TLObject tLObject = (TLObject) obj;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    mcVarA0 = mc.a0(qbVar2);
                    i12 = R.raw.msg_antispam;
                    i13 = R.string.ChannelAntiSpamFalsePositiveReported;
                } else if (tLObject instanceof TLRPC.TL_boolFalse) {
                    mcVarA0 = mc.a0(qbVar2);
                    i12 = R.raw.error;
                    i13 = R.string.UnknownError;
                } else {
                    mcVarA0 = mc.a0(qbVar2);
                    i12 = R.raw.error;
                    i13 = R.string.UnknownError;
                }
                y1.q(i13, mcVarA0, i12, 36);
                break;
            case 24:
                yb ybVar = (yb) obj2;
                ybVar.d = (TL_stories.TL_premium_boostsStatus) obj;
                ybVar.E.animate().cancel();
                ybVar.E.animate().alpha(0.0f).setDuration(100L).setStartDelay(0L).setListener(new h9(ybVar, i15));
                ybVar.d(true);
                ybVar.c(null);
                break;
            case 25:
                xc xcVar = (xc) obj2;
                xcVar.getClass();
                xcVar.presentFragment(q91.d0((TLRPC.Chat) obj, true));
                break;
            case 26:
                List list = (List) obj;
                vc vcVar = ((uc) obj2).f43184b;
                int i28 = vcVar.f43415a;
                ta1 ta1Var = vcVar.d;
                ArrayList arrayList7 = vcVar.f43417c;
                if (list != null && !list.isEmpty()) {
                    vcVar.f43420n = true;
                    arrayList7.clear();
                    arrayList7.add(0, new zo((b4) list.get(0)));
                    if (vcVar.v != null && vcVar.f43419f) {
                        arrayList7.add(0, new zo(b4.a(i28)));
                    }
                    c6 c6Var = vcVar.f43416b;
                    int iA = c6Var != null ? c6Var.a() : g6.I.q();
                    for (int i29 = 1; i29 < list.size(); i29++) {
                        b4 b4Var = (b4) list.get(i29);
                        zo zoVar = new zo(b4Var);
                        b4Var.n(i28);
                        zoVar.f35318c = iA;
                        arrayList7.add(zoVar);
                    }
                    for (int i30 = 0; i30 < arrayList7.size(); i30++) {
                        zo zoVar2 = (zo) arrayList7.get(i30);
                        boolean z14 = TextUtils.equals(vcVar.f43422s, zoVar2.a()) || (TextUtils.isEmpty(vcVar.f43422s) && zoVar2.f35316a.f22780a);
                        zoVar2.d = z14;
                        if (z14) {
                            i16 = i30;
                        }
                    }
                    tc tcVar = vcVar.h;
                    if (tcVar != null) {
                        tcVar.l();
                    }
                    ta1Var.animate().alpha(1.0f).setDuration(150L).start();
                    h00 h00Var = vcVar.f43418e;
                    if (vcVar.f43420n) {
                        AndroidUtilities.updateViewVisibilityAnimated(h00Var, false, 1.0f, true, true);
                    } else {
                        AndroidUtilities.updateViewVisibilityAnimated(h00Var, true, 1.0f, true, true);
                    }
                    if (i16 >= 0 && (ta1Var.getLayoutManager() instanceof f2.k0)) {
                        ((f2.k0) ta1Var.getLayoutManager()).h1(i16, (AndroidUtilities.displaySize.x - AndroidUtilities.dp(83.0f)) / 2);
                        break;
                    }
                }
                break;
            case 27:
                id idVar = (id) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                if (tL_error != null) {
                    idVar.getClass();
                    z10 = tL_error.text.equals("CHANNELS_ADMIN_PUBLIC_TOO_MUCH") ? false : true;
                }
                idVar.f39039f0 = z10;
                break;
            case 28:
                id.W((id) obj2, (String) obj);
                break;
            default:
                id idVar2 = (id) obj2;
                TLObject tLObject2 = (TLObject) obj;
                ArrayList arrayList8 = idVar2.f39032b0;
                idVar2.Z = false;
                if (tLObject2 != null && idVar2.getParentActivity() != null) {
                    for (int i31 = 0; i31 < arrayList8.size(); i31++) {
                        idVar2.G.removeView((View) arrayList8.get(i31));
                    }
                    arrayList8.clear();
                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject2;
                    int i32 = 0;
                    while (i32 < tL_messages_chats.chats.size()) {
                        org.telegram.ui.Cells.n nVar = new org.telegram.ui.Cells.n(idVar2.getParentActivity(), new ad(idVar2, i17), false, 0);
                        nVar.a(tL_messages_chats.chats.get(i32), i32 == tL_messages_chats.chats.size() - 1);
                        arrayList8.add(nVar);
                        idVar2.H.addView(nVar, h7.z5.n(-1, 72));
                        i32++;
                    }
                    idVar2.h0();
                    break;
                }
                break;
        }
    }
}
