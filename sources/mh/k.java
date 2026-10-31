package mh;

import ag.j0;
import ag.k0;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import b2.x;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import k2.m0;
import kg.i1;
import o2.q;
import oh.p;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.b8;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.h20;
import org.telegram.messenger.i0;
import org.telegram.messenger.ic;
import org.telegram.messenger.j20;
import org.telegram.messenger.q20;
import org.telegram.messenger.video.VideoAds;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.voip.VoipAudioManager;
import org.telegram.messenger.voip.p0;
import org.telegram.messenger.vp;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.o6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.ActionBar.s6;
import org.telegram.ui.Cells.i5;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.in0;
import org.telegram.ui.Components.ro0;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.ug0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.g01;
import org.telegram.ui.n;
public final class k implements Runnable {
    public final int f13369a;
    public final Object f13370b;
    public final Object f13371c;

    public k(int i10, Object obj, Object obj2) {
        this.f13369a = i10;
        this.f13370b = obj;
        this.f13371c = obj2;
    }

    @Override
    public final void run() {
        TLRPC.Document document;
        TLRPC.Document document2;
        Object[] objArr;
        float f7 = 0.0f;
        int i10 = 8;
        ArrayList arrayList = null;
        Bitmap bitmap = null;
        int i11 = 0;
        switch (this.f13369a) {
            case 0:
                l lVar = (l) this.f13370b;
                lVar.f13373b.add((String) this.f13371c);
                lVar.invalidate();
                return;
            case 1:
                n2.d dVar = (n2.d) this.f13370b;
                x xVar = (x) this.f13371c;
                n2.e eVar = dVar.d;
                if (eVar.E != 0 && !dVar.f13444c) {
                    Looper looper = eVar.I;
                    looper.getClass();
                    dVar.f13443b = eVar.b(looper, dVar.f13442a, xVar, false);
                    eVar.f13454y.add(dVar);
                    return;
                }
                return;
            case 2:
                m0 m0Var = ((q) this.f13370b).f14042c;
                Uri uri = ((o2.j) this.f13371c).f14005y;
                p2.c cVar = (p2.c) ((o2.k) m0Var.f10700a).f14007b.d.get(uri);
                if (cVar != null) {
                    p2.c.b(cVar, uri, true);
                    return;
                }
                return;
            case 3:
                of.c cVar2 = (of.c) this.f13370b;
                TLObject tLObject = (TLObject) this.f13371c;
                if (tLObject != null) {
                    if (tLObject instanceof TL_account.TL_savedRingtonesNotModified) {
                        cVar2.f(true);
                    } else if (tLObject instanceof TL_account.TL_savedRingtones) {
                        TL_account.TL_savedRingtones tL_savedRingtones = (TL_account.TL_savedRingtones) tLObject;
                        ArrayList<TLRPC.Document> arrayList2 = tL_savedRingtones.ringtones;
                        ArrayList arrayList3 = cVar2.e;
                        if (!cVar2.f14161f) {
                            cVar2.f(false);
                            cVar2.f14161f = true;
                        }
                        HashMap hashMap = new HashMap();
                        int size = arrayList3.size();
                        int i12 = 0;
                        while (i12 < size) {
                            Object obj = arrayList3.get(i12);
                            i12++;
                            of.b bVar = (of.b) obj;
                            if (bVar.f14154b != null && (document = bVar.f14153a) != null) {
                                hashMap.put(Long.valueOf(document.f19799id), bVar.f14154b);
                            }
                        }
                        arrayList3.clear();
                        SharedPreferences d = cVar2.d();
                        d.edit().clear().apply();
                        SharedPreferences.Editor edit = d.edit();
                        edit.putInt("count", arrayList2.size());
                        for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                            TLRPC.Document document3 = arrayList2.get(i13);
                            String str = (String) hashMap.get(Long.valueOf(document3.f19799id));
                            SerializedData serializedData = new SerializedData(document3.getObjectSize());
                            document3.serializeToStream(serializedData);
                            edit.putString("tone_document" + i13, Utilities.f(serializedData.toByteArray()));
                            if (str != null) {
                                edit.putString("tone_local_path" + i13, str);
                            }
                            ?? obj2 = new Object();
                            obj2.f14153a = document3;
                            obj2.f14154b = str;
                            int i14 = cVar2.d;
                            cVar2.d = i14 + 1;
                            obj2.f14155c = i14;
                            arrayList3.add(obj2);
                        }
                        edit.apply();
                        zs.f(cVar2.f14160c).k(307, new Object[0]);
                        SharedPreferences.Editor edit2 = cVar2.d().edit();
                        long j10 = tL_savedRingtones.hash;
                        of.c.f14156g = j10;
                        SharedPreferences.Editor putLong = edit2.putLong("hash", j10);
                        long currentTimeMillis = System.currentTimeMillis();
                        of.c.h = currentTimeMillis;
                        putLong.putLong("lastReload", currentTimeMillis).apply();
                    }
                    cVar2.b();
                    return;
                }
                return;
            case 4:
                of.c cVar3 = (of.c) this.f13370b;
                ArrayList arrayList4 = (ArrayList) this.f13371c;
                while (i11 < arrayList4.size()) {
                    of.b bVar2 = (of.b) arrayList4.get(i11);
                    if (bVar2 != null && ((TextUtils.isEmpty(bVar2.f14154b) || !new File(bVar2.f14154b).exists()) && (document2 = bVar2.f14153a) != null)) {
                        b8.G(cVar3.f14160c);
                        File I = b8.I(document2);
                        if (I == null || !I.exists()) {
                            i0.g3(new k(5, cVar3, document2));
                        }
                    }
                    i11++;
                }
                return;
            case 5:
                TLRPC.Document document4 = (TLRPC.Document) this.f13371c;
                b8.G(((of.c) this.f13370b).f14160c).X(document4, document4, 0, 0);
                return;
            case 6:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f13371c;
                int i15 = ((of.d) this.f13370b).f14162a;
                if (tL_error.text.equals("RINGTONE_DURATION_TOO_LONG")) {
                    zs.e().k(292, 4, cd.a0("TooLongError", null, 2131744066, new Object[0]), cd.a0("ErrorRingtoneDurationTooLong", null, 2131751105, Integer.valueOf(vp.r1(i15).l4)));
                    return;
                } else if (tL_error.text.equals("RINGTONE_SIZE_TOO_BIG")) {
                    zs.e().k(292, 4, cd.a0("TooLargeError", null, 2131744067, new Object[0]), cd.a0("ErrorRingtoneSizeTooBig", null, 2131751103, Integer.valueOf(vp.r1(i15).f18843m4 / 1024)));
                    return;
                } else {
                    zs.e().k(292, 4, cd.a0("InvalidFormatError", null, 2131749191, new Object[0]), cd.L0(2131751104, null));
                    return;
                }
            case 7:
                ((ag.l) this.f13370b).a((TLRPC.Chat) this.f13371c);
                return;
            case 8:
                oh.q qVar = (oh.q) this.f13370b;
                i5 i5Var = (i5) this.f13371c;
                int i16 = qVar.f14299k;
                k2 k2Var = qVar.f14296g;
                TLRPC.TL_chatInviteImporter importer = i5Var.getImporter();
                qVar.f14306r = importer;
                LongSparseArray longSparseArray = qVar.d;
                TLRPC.User user = (TLRPC.User) longSparseArray.get(importer.user_id);
                if (user != null) {
                    k2Var.getMessagesController().U3(user, false, false);
                    Point point = i0.f16026q;
                    if (point.x > point.y) {
                        objArr = 1;
                    } else {
                        objArr = null;
                    }
                    if (user.photo != null && objArr == null) {
                        if (qVar.f14307s == null) {
                            p pVar = new p(qVar, k2Var.getParentActivity(), (tk0) i5Var.getParent(), k2Var.getResourceProvider(), qVar.f14292a);
                            qVar.f14307s = pVar;
                            TLRPC.TL_chatInviteImporter tL_chatInviteImporter = qVar.f14306r;
                            g9 avatarImageView = i5Var.getAvatarImageView();
                            TextView textView = pVar.e;
                            ug0 ug0Var = pVar.h;
                            pVar.f14287r = tL_chatInviteImporter;
                            pVar.f14289w = avatarImageView;
                            TLRPC.User Z1 = vp.r1(i16).Z1(Long.valueOf(tL_chatInviteImporter.user_id));
                            ic m10 = ic.m(i16, 0, Z1);
                            ic m11 = ic.m(i16, 1, Z1);
                            if (vp.r1(i16).a2(tL_chatInviteImporter.user_id) == null) {
                                vp.r1(i16).e3(Z1, false, 0);
                            }
                            ug0Var.setParentAvatarImage(avatarImageView);
                            ug0Var.M(tL_chatInviteImporter.user_id, true);
                            ug0Var.H(null, m10, m11, true);
                            pVar.d.setText(h20.p((TLRPC.User) longSparseArray.get(tL_chatInviteImporter.user_id)));
                            textView.setText(tL_chatInviteImporter.about);
                            if (!TextUtils.isEmpty(tL_chatInviteImporter.about)) {
                                i10 = 0;
                            }
                            textView.setVisibility(i10);
                            pVar.D.requestLayout();
                            qVar.f14307s.setOnDismissListener(new ag.x(qVar, 6));
                            qVar.f14307s.show();
                            return;
                        }
                        return;
                    }
                    qVar.f14293b = true;
                    k2Var.dismissCurrentDialog();
                    Bundle bundle = new Bundle();
                    ProfileActivity profileActivity = new ProfileActivity(bundle, null);
                    bundle.putLong("user_id", user.f19942id);
                    bundle.putBoolean("removeFragmentOnChatOpen", false);
                    k2Var.presentFragment(profileActivity);
                    return;
                }
                return;
            case 9:
                ((VideoAds) this.f13370b).lambda$showPremium$19((i1) this.f13371c);
                return;
            case 10:
                ((VideoAds) this.f13370b).lambda$load$0((TLObject) this.f13371c);
                return;
            case 11:
                ((VideoAds) this.f13370b).lambda$show$16((q20) this.f13371c);
                return;
            case 12:
                g01.d1((Context) this.f13370b, null, false, (ro0) this.f13371c, null);
                return;
            case 13:
                ((ConferenceCall) this.f13370b).lambda$processUpdates$4((TLRPC.Updates) this.f13371c);
                return;
            case 14:
                VideoCapturerDevice.lambda$checkScreenCapturerSize$1((VideoCapturerDevice) this.f13370b, (Point) this.f13371c);
                return;
            case 15:
                ((VideoCapturerDevice) this.f13370b).lambda$init$4((String) this.f13371c);
                return;
            case 16:
                ((VoIPService) this.f13370b).lambda$startGroupCall$21((TL_update.TL_updateGroupCall) this.f13371c);
                return;
            case 17:
                ((VoIPService) this.f13370b).lambda$createGroupInstance$71((String) this.f13371c);
                return;
            case 18:
                ((VoIPService) this.f13370b).lambda$startConferenceGroupCall$56((p0) this.f13371c);
                return;
            case 19:
                ((VoIPService) this.f13370b).lambda$startScreenCapture$58((TLRPC.Updates) this.f13371c);
                return;
            case 20:
                ((AudioManager) this.f13370b).setCommunicationDevice((AudioDeviceInfo) this.f13371c);
                return;
            case 21:
                ((VoipAudioManager) this.f13370b).lambda$isBluetoothAndSpeakerOnAsync$4((j20) this.f13371c);
                return;
            case 22:
                org.telegram.ui.ActionBar.l lVar2 = (org.telegram.ui.ActionBar.l) this.f13370b;
                boolean canScrollVertically = ((in0) this.f13371c).canScrollVertically(-1);
                boolean z10 = !canScrollVertically;
                if (lVar2.B1 != z10) {
                    ValueAnimator valueAnimator = lVar2.D1;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    float f10 = lVar2.C1;
                    lVar2.B1 = z10;
                    if (!canScrollVertically) {
                        f7 = 1.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
                    lVar2.D1 = ofFloat;
                    ofFloat.addUpdateListener(new org.telegram.ui.ActionBar.a(lVar2, 4));
                    lVar2.D1.addListener(new org.telegram.ui.ActionBar.c(lVar2, z10, 1));
                    lVar2.D1.setDuration(320L);
                    lVar2.D1.setInterpolator(gr.h);
                    lVar2.D1.start();
                    return;
                }
                return;
            case 23:
                org.telegram.ui.ActionBar.l lVar3 = (org.telegram.ui.ActionBar.l) this.f13370b;
                boolean canScrollVertically2 = ((RecyclerView) this.f13371c).canScrollVertically(-1);
                boolean z11 = !canScrollVertically2;
                if (lVar3.B1 != z11) {
                    ValueAnimator valueAnimator2 = lVar3.D1;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    float f11 = lVar3.C1;
                    lVar3.B1 = z11;
                    if (!canScrollVertically2) {
                        f7 = 1.0f;
                    }
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f11, f7);
                    lVar3.D1 = ofFloat2;
                    ofFloat2.addUpdateListener(new org.telegram.ui.ActionBar.a(lVar3, 3));
                    lVar3.D1.addListener(new org.telegram.ui.ActionBar.c(lVar3, z11, 0));
                    lVar3.D1.setDuration(320L);
                    lVar3.D1.setInterpolator(gr.h);
                    lVar3.D1.start();
                    return;
                }
                return;
            case 24:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.f13370b;
                Drawable drawable = ActionBarLayout.f20066v1;
                actionBarLayout.d0((k2) this.f13371c, false);
                actionBarLayout.setVisibility(8);
                View view = actionBarLayout.H0;
                if (view != null) {
                    view.setVisibility(8);
                    return;
                }
                return;
            case 25:
                k2 k2Var2 = (k2) this.f13370b;
                k2 k2Var3 = (k2) this.f13371c;
                Drawable drawable2 = ActionBarLayout.f20066v1;
                if (k2Var2 != null) {
                    k2Var2.onTransitionAnimationEnd(false, false);
                }
                k2Var3.onTransitionAnimationEnd(true, false);
                k2Var3.onBecomeFullyVisible();
                return;
            case 26:
                o6 o6Var = (o6) this.f13370b;
                ArrayList arrayList5 = (ArrayList) this.f13371c;
                int size2 = arrayList5.size();
                int i17 = 0;
                while (i17 < size2) {
                    r6 r6Var = (r6) arrayList5.get(i17);
                    File e = r6Var.e();
                    if (e != null && e.length() > 0) {
                        arrayList5.remove(i17);
                        i17--;
                        size2--;
                    } else {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        if (!arrayList.contains(r6Var.f20741o)) {
                            arrayList.add(r6Var.f20741o);
                        }
                    }
                    i17++;
                }
                if (arrayList != null) {
                    TL_account.getMultiWallPapers getmultiwallpapers = new TL_account.getMultiWallPapers();
                    int size3 = arrayList.size();
                    while (i11 < size3) {
                        TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
                        tL_inputWallPaperSlug.slug = (String) arrayList.get(i11);
                        getmultiwallpapers.wallpapers.add(tL_inputWallPaperSlug);
                        i11++;
                    }
                    ConnectionsManager.getInstance(o6Var.f20630a).sendRequest(getmultiwallpapers, new k0(10, o6Var, arrayList5));
                    return;
                }
                return;
            case 27:
                o6 o6Var2 = (o6) this.f13370b;
                n6 n6Var = (n6) this.f13371c;
                TLRPC.TL_wallPaper tL_wallPaper = n6Var.f20615a;
                b8.G(d20.f15147s0);
                File K = b8.K(tL_wallPaper.document, null, true, true);
                ArrayList arrayList6 = n6Var.f20616b;
                int size4 = arrayList6.size();
                ArrayList arrayList7 = null;
                for (int i18 = 0; i18 < size4; i18++) {
                    r6 r6Var2 = (r6) arrayList6.get(i18);
                    if (r6Var2.f20741o.equals(tL_wallPaper.slug)) {
                        Bitmap b10 = o6.b(bitmap, "application/x-tgwallpattern".equals(tL_wallPaper.document.mime_type), K, r6Var2);
                        if (arrayList7 == null) {
                            arrayList7 = new ArrayList();
                            arrayList7.add(r6Var2);
                        }
                        bitmap = b10;
                    }
                }
                if (bitmap != null) {
                    bitmap.recycle();
                }
                i0.g3(new j0((Object) o6Var2, (Object) arrayList7, false, 10));
                return;
            case 28:
                s6 s6Var = (s6) this.f13370b;
                s6Var.d((File) this.f13371c, s6Var.f20812h0);
                i0.g3(new fg.d(s6Var, 1));
                return;
            default:
                ((n) this.f13370b).b0((TLRPC.TL_messages_archivedStickers) this.f13371c);
                return;
        }
    }
}
