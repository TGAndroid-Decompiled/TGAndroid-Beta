package ih;

import android.animation.ValueAnimator;
import android.content.ClipboardManager;
import android.content.Context;
import android.database.SQLException;
import android.graphics.Bitmap;
import android.location.Address;
import android.location.Geocoder;
import android.media.AudioTrack;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.text.style.URLSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ll;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.pc;
public final class j7 implements Runnable {
    public final int f11639a;
    public final Object f11640b;
    public final Object f11641c;

    public j7(int i9, Object obj, Object obj2) {
        this.f11639a = i9;
        this.f11640b = obj;
        this.f11641c = obj2;
    }

    @Override
    public final void run() {
        l3 l3Var;
        h4 h4Var;
        m3.t oVar;
        float f10;
        float f11 = 1.0f;
        float f12 = 0.0f;
        boolean z10 = false;
        r4 = 0;
        r4 = 0;
        char c10 = 0;
        int i9 = 0;
        z10 = false;
        int i10 = 1;
        switch (this.f11639a) {
            case 0:
                Runnable runnable = (Runnable) this.f11641c;
                if (!((m7) this.f11640b).d) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                m7 m7Var = (m7) this.f11640b;
                ((Runnable[]) this.f11641c)[0] = null;
                m7Var.f11774c.run();
                k7 k7Var = m7Var.f11775e;
                if (k7Var != null) {
                    k7Var.onDetachedFromWindow();
                    return;
                }
                return;
            case 2:
                l7 l7Var = (l7) this.f11640b;
                View view = (View) this.f11641c;
                l7Var.getClass();
                try {
                    view.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                pc pcVar = l7Var.H;
                if (pcVar != null) {
                    pcVar.c(false);
                }
                ViewParent parent = view.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).requestDisallowInterceptTouchEvent(false);
                }
                l7Var.N = false;
                l7Var.e();
                return;
            case 3:
                c8 c8Var = (c8) this.f11640b;
                m80 m80Var = (m80) this.f11641c;
                m80 m80Var2 = c8Var.f11293a;
                if (m80Var == m80Var2 && m80Var2 != null) {
                    CharacterStyle characterStyle = m80Var2.f30768i;
                    if (characterStyle instanceof URLSpan) {
                        d8 d8Var = c8Var.v;
                        i80 i80Var = c8Var.f11295c;
                        Objects.requireNonNull(i80Var);
                        d8Var.F.H((URLSpan) characterStyle, d8Var, new g(i80Var, 16));
                        c8Var.f11293a = null;
                        return;
                    }
                    return;
                }
                return;
            case 4:
                q8 q8Var = (q8) this.f11640b;
                kh.x3 x3Var = (kh.x3) this.f11641c;
                q8Var.d.removeView(x3Var);
                if (x3Var == q8Var.f12006c) {
                    q8Var.f12005b = null;
                    q8Var.invalidate();
                    q8Var.b(false);
                    return;
                }
                return;
            case 5:
                l9 l9Var = (l9) this.f11641c;
                m9 m9Var = ((d9) this.f11640b).d;
                i4 currentPeerView = m9Var.f11806j0.getCurrentPeerView();
                if (currentPeerView != null && (l3Var = currentPeerView.Y0) != null && (h4Var = m9Var.C0) != null && h4Var.f11501b == l9Var) {
                    l3Var.invalidate();
                    return;
                }
                return;
            case 6:
                j3.n nVar = ((j3.m) this.f11640b).f13292b;
                int i11 = d5.f0.f4349a;
                i3.f fVar = ((h3.h0) nVar).f9440a.f9557r;
                i3.a k10 = fVar.k();
                fVar.l(k10, 1012, new i3.d(k10, (String) this.f11641c, 5));
                return;
            case 7:
                AudioTrack audioTrack = (AudioTrack) this.f11640b;
                d5.c cVar = (d5.c) this.f11641c;
                try {
                    audioTrack.flush();
                    audioTrack.release();
                    cVar.c();
                    synchronized (j3.i0.f13253d0) {
                        try {
                            int i12 = j3.i0.f13255f0 - 1;
                            j3.i0.f13255f0 = i12;
                            if (i12 == 0) {
                                j3.i0.f13254e0.shutdown();
                                j3.i0.f13254e0 = null;
                            }
                        } finally {
                        }
                    }
                    return;
                } catch (Throwable th) {
                    cVar.c();
                    synchronized (j3.i0.f13253d0) {
                        try {
                            int i13 = j3.i0.f13255f0 - 1;
                            j3.i0.f13255f0 = i13;
                            if (i13 == 0) {
                                j3.i0.f13254e0.shutdown();
                                j3.i0.f13254e0 = null;
                            }
                            throw th;
                        } finally {
                        }
                    }
                }
            case 8:
                j4.s0 s0Var = (j4.s0) this.f11640b;
                m3.t tVar = (m3.t) this.f11641c;
                if (s0Var.D == null) {
                    oVar = tVar;
                } else {
                    oVar = new m3.o(-9223372036854775807L);
                }
                s0Var.K = oVar;
                s0Var.L = tVar.i();
                if (!s0Var.R && tVar.i() == -9223372036854775807L) {
                    z10 = true;
                }
                s0Var.M = z10;
                if (z10) {
                    i10 = 7;
                }
                s0Var.N = i10;
                s0Var.h.t(s0Var.L, tVar.e(), s0Var.M);
                if (!s0Var.H) {
                    s0Var.r();
                    return;
                }
                return;
            case 9:
                jh.u uVar = (jh.u) this.f11640b;
                String str = (String) this.f11641c;
                ArrayList arrayList = uVar.f14382f;
                while (true) {
                    if (i9 < arrayList.size()) {
                        if (!TextUtils.equals(((f6) arrayList.get(i9)).E, str)) {
                            i9++;
                        }
                    } else {
                        i9 = -1;
                    }
                }
                if (i9 >= 0) {
                    uVar.f14384r.d(str.hashCode(), i9 + 1);
                    return;
                }
                return;
            case 10:
                k9.c cVar2 = (k9.c) this.f11640b;
                CountDownLatch countDownLatch = (CountDownLatch) this.f11641c;
                try {
                    w2.q.a().d.e(cVar2.h.f48469a.b(t2.d.f47603c), 1);
                } catch (SQLException unused2) {
                }
                countDownLatch.countDown();
                return;
            case 11:
                kh.d dVar = (kh.d) this.f11640b;
                org.telegram.ui.Cells.g gVar = (org.telegram.ui.Cells.g) this.f11641c;
                int i14 = dVar.B - 1;
                dVar.B = i14;
                dVar.c(i14, true);
                if (dVar.B > 0) {
                    AndroidUtilities.runOnUIThread(dVar.C, 1000L);
                    return;
                }
                dVar.setClickable(true);
                gVar.run();
                return;
            case 12:
                ((Utilities.Callback) this.f11640b).run((ArrayList) this.f11641c);
                return;
            case 13:
                kh.u1 u1Var = (kh.u1) this.f11640b;
                TLObject tLObject = (TLObject) this.f11641c;
                kh.w1 w1Var = u1Var.f16135s;
                if (tLObject instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
                    kh.n2 n2Var = w1Var.f16233r;
                    MessagesController.getInstance(kh.n2.D(n2Var)).putUsers(tL_contacts_resolvedPeer.users, false);
                    MessagesController.getInstance(kh.n2.E(n2Var)).putChats(tL_contacts_resolvedPeer.chats, false);
                    MessagesStorage.getInstance(kh.n2.G(n2Var)).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                }
                u1Var.f16133n = true;
                u1Var.G();
                return;
            case 14:
                ((kh.s2) this.f11640b).e(0.0f, 240L, (Runnable) this.f11641c);
                return;
            case 15:
                kh.g6 g6Var = (kh.g6) this.f11640b;
                View view2 = (View) this.f11641c;
                g6Var.getClass();
                if (view2 instanceof yf.j) {
                    yf.j jVar = (yf.j) view2;
                    jVar.m();
                    g6Var.D0(jVar, true);
                    return;
                }
                return;
            case 16:
                TLRPC.MessageMedia messageMedia = (TLRPC.MessageMedia) this.f11640b;
                TL_stories.TL_mediaAreaGeoPoint tL_mediaAreaGeoPoint = (TL_stories.TL_mediaAreaGeoPoint) this.f11641c;
                try {
                    List<Address> fromLocationName = new Geocoder(ApplicationLoader.applicationContext, LocaleController.getInstance().getCurrentLocale()).getFromLocationName(messageMedia.title, 1);
                    if (fromLocationName.size() > 0) {
                        tL_mediaAreaGeoPoint.geo.lat = fromLocationName.get(0).getLatitude();
                        tL_mediaAreaGeoPoint.geo._long = fromLocationName.get(0).getLongitude();
                        return;
                    }
                    return;
                } catch (Exception unused3) {
                    return;
                }
            case 17:
                ((Utilities.Callback) this.f11640b).run((Bitmap) this.f11641c);
                return;
            case 18:
                kh.r6.a((kh.r6) this.f11640b, (kh.a8) this.f11641c);
                return;
            case 19:
                kh.a8 a8Var = (kh.a8) this.f11641c;
                kh.r6 r6Var = (kh.r6) ((j4.c) this.f11640b).d;
                Bitmap bitmap = r6Var.f15929a;
                if (bitmap != null) {
                    bitmap.recycle();
                    if (a8Var.M0 == r6Var.f15929a) {
                        a8Var.M0 = null;
                    }
                    r6Var.f15929a = null;
                    r6Var.invalidate();
                    return;
                }
                return;
            case 20:
                kh.v6 v6Var = (kh.v6) this.f11640b;
                AtomicReference atomicReference = v6Var.f16197a;
                ?? obj = new Object();
                obj.f3875a = 256;
                atomicReference.set(new b8.n(new com.google.android.gms.internal.vision.t2((Context) this.f11641c, (com.google.android.gms.internal.vision.x1) obj)));
                v6Var.a(v6Var.f16201f);
                return;
            case 21:
                ((kh.v6) this.f11640b).f16199c.run((kh.t6) this.f11641c);
                return;
            case 22:
                kh.q qVar = (kh.q) this.f11640b;
                yf.b2 b2Var = (yf.b2) this.f11641c;
                kh.d7 d7Var = qVar.f15153a;
                if (b2Var.getWidth() <= 0) {
                    d7Var.animate().scaleX(0.0f).scaleY(1.0f).withEndAction(new kh.f1(qVar, 10)).start();
                    return;
                }
                float width = b2Var.getWidth() / d7Var.getWidth();
                ValueAnimator valueAnimator = qVar.f15161w;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                qVar.f15161w = ValueAnimator.ofFloat(0.0f, 1.0f);
                qVar.f15161w.addUpdateListener(new kh.c7(qVar, d7Var.getScaleX(), width, ((b2Var.getWidth() / 2.0f) + b2Var.getX()) - ((d7Var.getWidth() / 2.0f) + d7Var.getX()), ((b2Var.getHeight() / 2.0f) + b2Var.getY()) - ((d7Var.getHeight() / 2.0f) + d7Var.getY()), 0));
                qVar.f15161w.addListener(new fg.j(6, qVar, b2Var));
                qVar.f15161w.setDuration(320L);
                qVar.f15161w.setInterpolator(gr.h);
                qVar.v = b2Var;
                qVar.f15161w.start();
                return;
            case 23:
                kh.s7 s7Var = (kh.s7) this.f11640b;
                s7Var.H0 = false;
                s7Var.X.addAll((ArrayList) this.f11641c);
                s7Var.m0.N(true);
                return;
            case 24:
                kh.s7.Q((kh.s7) this.f11640b, (TLObject) this.f11641c);
                return;
            case 25:
                kh.a8 a8Var2 = (kh.a8) this.f11640b;
                TLObject tLObject2 = (TLObject) this.f11641c;
                a8Var2.f14914e1 = 0;
                if (tLObject2 instanceof Vector) {
                    a8Var2.V0 = new ArrayList();
                    Vector vector = (Vector) tLObject2;
                    for (int i15 = 0; i15 < vector.objects.size(); i15++) {
                        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) vector.objects.get(i15);
                        TLRPC.Document document = stickerSetCovered.cover;
                        if (document == null && !stickerSetCovered.covers.isEmpty()) {
                            document = stickerSetCovered.covers.get(0);
                        }
                        if (document == null && (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered)) {
                            TLRPC.TL_stickerSetFullCovered tL_stickerSetFullCovered = (TLRPC.TL_stickerSetFullCovered) stickerSetCovered;
                            if (!tL_stickerSetFullCovered.documents.isEmpty()) {
                                document = tL_stickerSetFullCovered.documents.get(0);
                            }
                        }
                        if (document != null) {
                            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                            tL_inputDocument.f22392id = document.f22386id;
                            tL_inputDocument.access_hash = document.access_hash;
                            tL_inputDocument.file_reference = document.file_reference;
                            a8Var2.V0.add(tL_inputDocument);
                        }
                    }
                    return;
                }
                return;
            case 26:
                kh.k8.Q((kh.k8) this.f11640b, (TLObject) this.f11641c);
                return;
            case 27:
                kh.k8 k8Var = (kh.k8) this.f11640b;
                TextView textView = (TextView) this.f11641c;
                ClipboardManager clipboardManager = (ClipboardManager) k8Var.getContext().getSystemService("clipboard");
                org.telegram.ui.Cells.h3 h3Var = k8Var.U.f24544b;
                if ((TextUtils.isEmpty(h3Var.getText()) || TextUtils.equals(h3Var.getText(), "https://") || TextUtils.isEmpty(h3Var.getText().toString())) && clipboardManager != null && clipboardManager.hasPrimaryClip()) {
                    c10 = 1;
                }
                ViewPropertyAnimator animate = textView.animate();
                if (c10 != 0) {
                    f12 = 1.0f;
                }
                ViewPropertyAnimator alpha = animate.alpha(f12);
                if (c10 != 0) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.7f;
                }
                ViewPropertyAnimator scaleX = alpha.scaleX(f10);
                if (c10 == 0) {
                    f11 = 0.7f;
                }
                ll.r(scaleX.scaleY(f11), gr.h, 300L);
                return;
            case 28:
                kh.t9 t9Var = (kh.t9) this.f11640b;
                HashMap<Long, Integer> smallGroupsParticipantsCount = ((MessagesStorage) this.f11641c).getSmallGroupsParticipantsCount();
                if (smallGroupsParticipantsCount != null && !smallGroupsParticipantsCount.isEmpty()) {
                    AndroidUtilities.runOnUIThread(new j7(29, t9Var, smallGroupsParticipantsCount));
                    return;
                }
                return;
            default:
                kh.t9 t9Var2 = (kh.t9) this.f11640b;
                HashMap hashMap = (HashMap) this.f11641c;
                if (t9Var2.L == null) {
                    t9Var2.L = new HashMap();
                }
                t9Var2.L.putAll(hashMap);
                return;
        }
    }

    public j7(Runnable[] runnableArr, m7 m7Var) {
        this.f11639a = 1;
        this.f11641c = runnableArr;
        this.f11640b = m7Var;
    }
}
