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
import org.telegram.messenger.at;
import org.telegram.messenger.b8;
import org.telegram.messenger.dd;
import org.telegram.messenger.e20;
import org.telegram.messenger.i0;
import org.telegram.messenger.i20;
import org.telegram.messenger.jc;
import org.telegram.messenger.k20;
import org.telegram.messenger.r20;
import org.telegram.messenger.video.VideoAds;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.voip.VoipAudioManager;
import org.telegram.messenger.voip.p0;
import org.telegram.messenger.wp;
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
import org.telegram.ui.Components.jn0;
import org.telegram.ui.Components.so0;
import org.telegram.ui.Components.uk0;
import org.telegram.ui.Components.vg0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.g01;
import org.telegram.ui.n;
public final class k implements Runnable {
    public final int f13370a;
    public final Object f13371b;
    public final Object f13372c;

    public k(int i10, Object obj, Object obj2) {
        this.f13370a = i10;
        this.f13371b = obj;
        this.f13372c = obj2;
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
        switch (this.f13370a) {
            case 0:
                l lVar = (l) this.f13371b;
                lVar.f13374b.add((String) this.f13372c);
                lVar.invalidate();
                return;
            case 1:
                n2.d dVar = (n2.d) this.f13371b;
                x xVar = (x) this.f13372c;
                n2.e eVar = dVar.d;
                if (eVar.E != 0 && !dVar.f13445c) {
                    Looper looper = eVar.I;
                    looper.getClass();
                    dVar.f13444b = eVar.b(looper, dVar.f13443a, xVar, false);
                    eVar.f13455y.add(dVar);
                    return;
                }
                return;
            case 2:
                m0 m0Var = ((q) this.f13371b).f14043c;
                Uri uri = ((o2.j) this.f13372c).f14006y;
                p2.c cVar = (p2.c) ((o2.k) m0Var.f10701a).f14008b.d.get(uri);
                if (cVar != null) {
                    p2.c.b(cVar, uri, true);
                    return;
                }
                return;
            case 3:
                of.c cVar2 = (of.c) this.f13371b;
                TLObject tLObject = (TLObject) this.f13372c;
                if (tLObject != null) {
                    if (tLObject instanceof TL_account.TL_savedRingtonesNotModified) {
                        cVar2.f(true);
                    } else if (tLObject instanceof TL_account.TL_savedRingtones) {
                        TL_account.TL_savedRingtones tL_savedRingtones = (TL_account.TL_savedRingtones) tLObject;
                        ArrayList<TLRPC.Document> arrayList2 = tL_savedRingtones.ringtones;
                        ArrayList arrayList3 = cVar2.e;
                        if (!cVar2.f14162f) {
                            cVar2.f(false);
                            cVar2.f14162f = true;
                        }
                        HashMap hashMap = new HashMap();
                        int size = arrayList3.size();
                        int i12 = 0;
                        while (i12 < size) {
                            Object obj = arrayList3.get(i12);
                            i12++;
                            of.b bVar = (of.b) obj;
                            if (bVar.f14155b != null && (document = bVar.f14154a) != null) {
                                hashMap.put(Long.valueOf(document.f19800id), bVar.f14155b);
                            }
                        }
                        arrayList3.clear();
                        SharedPreferences d = cVar2.d();
                        d.edit().clear().apply();
                        SharedPreferences.Editor edit = d.edit();
                        edit.putInt("count", arrayList2.size());
                        for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                            TLRPC.Document document3 = arrayList2.get(i13);
                            String str = (String) hashMap.get(Long.valueOf(document3.f19800id));
                            SerializedData serializedData = new SerializedData(document3.getObjectSize());
                            document3.serializeToStream(serializedData);
                            edit.putString("tone_document" + i13, Utilities.f(serializedData.toByteArray()));
                            if (str != null) {
                                edit.putString("tone_local_path" + i13, str);
                            }
                            ?? obj2 = new Object();
                            obj2.f14154a = document3;
                            obj2.f14155b = str;
                            int i14 = cVar2.d;
                            cVar2.d = i14 + 1;
                            obj2.f14156c = i14;
                            arrayList3.add(obj2);
                        }
                        edit.apply();
                        at.f(cVar2.f14161c).k(307, new Object[0]);
                        SharedPreferences.Editor edit2 = cVar2.d().edit();
                        long j10 = tL_savedRingtones.hash;
                        of.c.f14157g = j10;
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
                of.c cVar3 = (of.c) this.f13371b;
                ArrayList arrayList4 = (ArrayList) this.f13372c;
                while (i11 < arrayList4.size()) {
                    of.b bVar2 = (of.b) arrayList4.get(i11);
                    if (bVar2 != null && ((TextUtils.isEmpty(bVar2.f14155b) || !new File(bVar2.f14155b).exists()) && (document2 = bVar2.f14154a) != null)) {
                        b8.G(cVar3.f14161c);
                        File I = b8.I(document2);
                        if (I == null || !I.exists()) {
                            i0.g3(new k(5, cVar3, document2));
                        }
                    }
                    i11++;
                }
                return;
            case 5:
                TLRPC.Document document4 = (TLRPC.Document) this.f13372c;
                b8.G(((of.c) this.f13371b).f14161c).X(document4, document4, 0, 0);
                return;
            case 6:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f13372c;
                int i15 = ((of.d) this.f13371b).f14163a;
                if (tL_error.text.equals("RINGTONE_DURATION_TOO_LONG")) {
                    at.e().k(292, 4, dd.a0("TooLongError", null, 2131744066, new Object[0]), dd.a0("ErrorRingtoneDurationTooLong", null, 2131751105, Integer.valueOf(wp.r1(i15).l4)));
                    return;
                } else if (tL_error.text.equals("RINGTONE_SIZE_TOO_BIG")) {
                    at.e().k(292, 4, dd.a0("TooLargeError", null, 2131744067, new Object[0]), dd.a0("ErrorRingtoneSizeTooBig", null, 2131751103, Integer.valueOf(wp.r1(i15).f19186m4 / 1024)));
                    return;
                } else {
                    at.e().k(292, 4, dd.a0("InvalidFormatError", null, 2131749191, new Object[0]), dd.L0(2131751104, null));
                    return;
                }
            case 7:
                ((ag.l) this.f13371b).a((TLRPC.Chat) this.f13372c);
                return;
            case 8:
                oh.q qVar = (oh.q) this.f13371b;
                i5 i5Var = (i5) this.f13372c;
                int i16 = qVar.f14300k;
                k2 k2Var = qVar.f14297g;
                TLRPC.TL_chatInviteImporter importer = i5Var.getImporter();
                qVar.f14307r = importer;
                LongSparseArray longSparseArray = qVar.d;
                TLRPC.User user = (TLRPC.User) longSparseArray.get(importer.user_id);
                if (user != null) {
                    k2Var.getMessagesController().U3(user, false, false);
                    Point point = i0.f16172q;
                    if (point.x > point.y) {
                        objArr = 1;
                    } else {
                        objArr = null;
                    }
                    if (user.photo != null && objArr == null) {
                        if (qVar.f14308s == null) {
                            p pVar = new p(qVar, k2Var.getParentActivity(), (uk0) i5Var.getParent(), k2Var.getResourceProvider(), qVar.f14293a);
                            qVar.f14308s = pVar;
                            TLRPC.TL_chatInviteImporter tL_chatInviteImporter = qVar.f14307r;
                            g9 avatarImageView = i5Var.getAvatarImageView();
                            TextView textView = pVar.e;
                            vg0 vg0Var = pVar.h;
                            pVar.f14288r = tL_chatInviteImporter;
                            pVar.f14290w = avatarImageView;
                            TLRPC.User Z1 = wp.r1(i16).Z1(Long.valueOf(tL_chatInviteImporter.user_id));
                            jc m10 = jc.m(i16, 0, Z1);
                            jc m11 = jc.m(i16, 1, Z1);
                            if (wp.r1(i16).a2(tL_chatInviteImporter.user_id) == null) {
                                wp.r1(i16).e3(Z1, false, 0);
                            }
                            vg0Var.setParentAvatarImage(avatarImageView);
                            vg0Var.M(tL_chatInviteImporter.user_id, true);
                            vg0Var.H(null, m10, m11, true);
                            pVar.d.setText(i20.p((TLRPC.User) longSparseArray.get(tL_chatInviteImporter.user_id)));
                            textView.setText(tL_chatInviteImporter.about);
                            if (!TextUtils.isEmpty(tL_chatInviteImporter.about)) {
                                i10 = 0;
                            }
                            textView.setVisibility(i10);
                            pVar.D.requestLayout();
                            qVar.f14308s.setOnDismissListener(new ag.x(qVar, 6));
                            qVar.f14308s.show();
                            return;
                        }
                        return;
                    }
                    qVar.f14294b = true;
                    k2Var.dismissCurrentDialog();
                    Bundle bundle = new Bundle();
                    ProfileActivity profileActivity = new ProfileActivity(bundle, null);
                    bundle.putLong("user_id", user.f19943id);
                    bundle.putBoolean("removeFragmentOnChatOpen", false);
                    k2Var.presentFragment(profileActivity);
                    return;
                }
                return;
            case 9:
                ((VideoAds) this.f13371b).lambda$showPremium$19((i1) this.f13372c);
                return;
            case 10:
                ((VideoAds) this.f13371b).lambda$load$0((TLObject) this.f13372c);
                return;
            case 11:
                ((VideoAds) this.f13371b).lambda$show$16((r20) this.f13372c);
                return;
            case 12:
                g01.d1((Context) this.f13371b, null, false, (so0) this.f13372c, null);
                return;
            case 13:
                ((ConferenceCall) this.f13371b).lambda$processUpdates$4((TLRPC.Updates) this.f13372c);
                return;
            case 14:
                VideoCapturerDevice.lambda$checkScreenCapturerSize$1((VideoCapturerDevice) this.f13371b, (Point) this.f13372c);
                return;
            case 15:
                ((VideoCapturerDevice) this.f13371b).lambda$init$4((String) this.f13372c);
                return;
            case 16:
                ((VoIPService) this.f13371b).lambda$startGroupCall$21((TL_update.TL_updateGroupCall) this.f13372c);
                return;
            case 17:
                ((VoIPService) this.f13371b).lambda$createGroupInstance$71((String) this.f13372c);
                return;
            case 18:
                ((VoIPService) this.f13371b).lambda$startConferenceGroupCall$56((p0) this.f13372c);
                return;
            case 19:
                ((VoIPService) this.f13371b).lambda$startScreenCapture$58((TLRPC.Updates) this.f13372c);
                return;
            case 20:
                ((AudioManager) this.f13371b).setCommunicationDevice((AudioDeviceInfo) this.f13372c);
                return;
            case 21:
                ((VoipAudioManager) this.f13371b).lambda$isBluetoothAndSpeakerOnAsync$4((k20) this.f13372c);
                return;
            case 22:
                org.telegram.ui.ActionBar.l lVar2 = (org.telegram.ui.ActionBar.l) this.f13371b;
                boolean canScrollVertically = ((jn0) this.f13372c).canScrollVertically(-1);
                boolean z10 = !canScrollVertically;
                if (lVar2.C1 != z10) {
                    ValueAnimator valueAnimator = lVar2.E1;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    float f10 = lVar2.D1;
                    lVar2.C1 = z10;
                    if (!canScrollVertically) {
                        f7 = 1.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
                    lVar2.E1 = ofFloat;
                    ofFloat.addUpdateListener(new org.telegram.ui.ActionBar.a(lVar2, 4));
                    lVar2.E1.addListener(new org.telegram.ui.ActionBar.c(lVar2, z10, 1));
                    lVar2.E1.setDuration(320L);
                    lVar2.E1.setInterpolator(gr.h);
                    lVar2.E1.start();
                    return;
                }
                return;
            case 23:
                org.telegram.ui.ActionBar.l lVar3 = (org.telegram.ui.ActionBar.l) this.f13371b;
                boolean canScrollVertically2 = ((RecyclerView) this.f13372c).canScrollVertically(-1);
                boolean z11 = !canScrollVertically2;
                if (lVar3.C1 != z11) {
                    ValueAnimator valueAnimator2 = lVar3.E1;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    float f11 = lVar3.D1;
                    lVar3.C1 = z11;
                    if (!canScrollVertically2) {
                        f7 = 1.0f;
                    }
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f11, f7);
                    lVar3.E1 = ofFloat2;
                    ofFloat2.addUpdateListener(new org.telegram.ui.ActionBar.a(lVar3, 3));
                    lVar3.E1.addListener(new org.telegram.ui.ActionBar.c(lVar3, z11, 0));
                    lVar3.E1.setDuration(320L);
                    lVar3.E1.setInterpolator(gr.h);
                    lVar3.E1.start();
                    return;
                }
                return;
            case 24:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.f13371b;
                Drawable drawable = ActionBarLayout.f20067v1;
                actionBarLayout.d0((k2) this.f13372c, false);
                actionBarLayout.setVisibility(8);
                View view = actionBarLayout.H0;
                if (view != null) {
                    view.setVisibility(8);
                    return;
                }
                return;
            case 25:
                k2 k2Var2 = (k2) this.f13371b;
                k2 k2Var3 = (k2) this.f13372c;
                Drawable drawable2 = ActionBarLayout.f20067v1;
                if (k2Var2 != null) {
                    k2Var2.onTransitionAnimationEnd(false, false);
                }
                k2Var3.onTransitionAnimationEnd(true, false);
                k2Var3.onBecomeFullyVisible();
                return;
            case 26:
                o6 o6Var = (o6) this.f13371b;
                ArrayList arrayList5 = (ArrayList) this.f13372c;
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
                        if (!arrayList.contains(r6Var.f20742o)) {
                            arrayList.add(r6Var.f20742o);
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
                    ConnectionsManager.getInstance(o6Var.f20631a).sendRequest(getmultiwallpapers, new k0(10, o6Var, arrayList5));
                    return;
                }
                return;
            case 27:
                o6 o6Var2 = (o6) this.f13371b;
                n6 n6Var = (n6) this.f13372c;
                TLRPC.TL_wallPaper tL_wallPaper = n6Var.f20616a;
                b8.G(e20.f15506s0);
                File K = b8.K(tL_wallPaper.document, null, true, true);
                ArrayList arrayList6 = n6Var.f20617b;
                int size4 = arrayList6.size();
                ArrayList arrayList7 = null;
                for (int i18 = 0; i18 < size4; i18++) {
                    r6 r6Var2 = (r6) arrayList6.get(i18);
                    if (r6Var2.f20742o.equals(tL_wallPaper.slug)) {
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
                s6 s6Var = (s6) this.f13371b;
                s6Var.d((File) this.f13372c, s6Var.f20813h0);
                i0.g3(new fg.d(s6Var, 1));
                return;
            default:
                ((n) this.f13371b).c0((TLRPC.TL_messages_archivedStickers) this.f13372c);
                return;
        }
    }
}
