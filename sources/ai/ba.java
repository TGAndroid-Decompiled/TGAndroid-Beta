package ai;

import android.animation.ValueAnimator;
import android.content.ClipboardManager;
import android.content.Context;
import android.database.SQLException;
import android.graphics.Bitmap;
import android.location.Address;
import android.location.Geocoder;
import android.media.AudioManager;
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
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.qk;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.m90;
import org.telegram.ui.Components.q90;
import org.telegram.ui.Components.sr;
import org.telegram.ui.Components.yc;
public final class ba implements Runnable {
    public final int f616a;
    public final Object f617b;
    public final Object f618c;

    public ba(int i10, Object obj, Object obj2) {
        this.f616a = i10;
        this.f617b = obj;
        this.f618c = obj2;
    }

    @Override
    public final void run() {
        a5 a5Var;
        d6 d6Var;
        float f7;
        float f10 = 1.0f;
        float f11 = 0.0f;
        int i10 = 0;
        switch (this.f616a) {
            case 0:
                ca caVar = (ca) this.f617b;
                View view = (View) this.f618c;
                caVar.getClass();
                try {
                    view.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                yc ycVar = caVar.H;
                if (ycVar != null) {
                    ycVar.c(false);
                }
                ViewParent parent = view.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).requestDisallowInterceptTouchEvent(false);
                }
                caVar.N = false;
                caVar.e();
                return;
            case 1:
                va vaVar = (va) this.f617b;
                q90 q90Var = (q90) this.f618c;
                q90 q90Var2 = vaVar.f1622a;
                if (q90Var == q90Var2 && q90Var2 != null) {
                    CharacterStyle characterStyle = q90Var2.f27627i;
                    if (characterStyle instanceof URLSpan) {
                        wa waVar = vaVar.v;
                        m90 m90Var = vaVar.f1624c;
                        Objects.requireNonNull(m90Var);
                        waVar.J.H((URLSpan) characterStyle, waVar, new a3.d(m90Var, 18));
                        vaVar.f1622a = null;
                        return;
                    }
                    return;
                }
                return;
            case 2:
                mb mbVar = (mb) this.f617b;
                ci.e4 e4Var = (ci.e4) this.f618c;
                mbVar.d.removeView(e4Var);
                if (e4Var == mbVar.f1275c) {
                    mbVar.f1274b = null;
                    mbVar.invalidate();
                    mbVar.b(false);
                    return;
                }
                return;
            case 3:
                ic icVar = (ic) this.f618c;
                jc jcVar = ((ac) this.f617b).d;
                e6 currentPeerView = jcVar.f1089n0.getCurrentPeerView();
                if (currentPeerView != null && (a5Var = currentPeerView.f779c1) != null && (d6Var = jcVar.G0) != null && ((ic) d6Var.f716c) == icVar) {
                    a5Var.invalidate();
                    return;
                }
                return;
            case 4:
                ViewGroup container = (ViewGroup) this.f617b;
                kotlin.jvm.internal.i.e(container, "$container");
                container.endViewTransition(null);
                throw null;
            case 5:
                ((v0.i) this.f617b).onError(this.f618c);
                return;
            case 6:
                ((v0.i) this.f617b).onResult((v0.o) this.f618c);
                return;
            case 7:
                bi.z zVar = (bi.z) this.f617b;
                String str = (String) this.f618c;
                ArrayList arrayList = zVar.f3604f;
                while (true) {
                    if (i10 < arrayList.size()) {
                        if (!TextUtils.equals(((u8) arrayList.get(i10)).E, str)) {
                            i10++;
                        }
                    } else {
                        i10 = -1;
                    }
                }
                if (i10 >= 0) {
                    zVar.f3606r.d(str.hashCode(), i10 + 1);
                    return;
                }
                return;
            case 8:
                ((c1.e) this.f617b).e().onError(((kotlin.jvm.internal.p) this.f618c).f13909a);
                return;
            case 9:
                ((c1.e) this.f617b).e().onError((w0.h) this.f618c);
                return;
            case 10:
                ((c1.e) this.f617b).e().onResult((v0.o) this.f618c);
                return;
            case 11:
                c2.d.f3659a = (AudioManager) ((Context) this.f617b).getSystemService("audio");
                ((e2.g) this.f618c).e();
                return;
            case 12:
                ca.c cVar = (ca.c) this.f617b;
                CountDownLatch countDownLatch = (CountDownLatch) this.f618c;
                try {
                    l5.s.a().d.e(cVar.h.f14139a.b(i5.d.f10988c), 1);
                } catch (SQLException unused2) {
                }
                countDownLatch.countDown();
                return;
            case 13:
                ci.d dVar = (ci.d) this.f617b;
                org.telegram.ui.Cells.g gVar = (org.telegram.ui.Cells.g) this.f618c;
                int i11 = dVar.F - 1;
                dVar.F = i11;
                dVar.b(i11, true);
                if (dVar.F > 0) {
                    AndroidUtilities.runOnUIThread(dVar.G, 1000L);
                    return;
                }
                dVar.setClickable(true);
                gVar.run();
                return;
            case 14:
                ((Utilities.Callback) this.f617b).run((ArrayList) this.f618c);
                return;
            case 15:
                ci.w1 w1Var = (ci.w1) this.f617b;
                TLObject tLObject = (TLObject) this.f618c;
                ci.z1 z1Var = w1Var.f5761s;
                if (tLObject instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
                    ci.s2 s2Var = z1Var.f5907r;
                    MessagesController.getInstance(ci.s2.E(s2Var)).putUsers(tL_contacts_resolvedPeer.users, false);
                    MessagesController.getInstance(ci.s2.F(s2Var)).putChats(tL_contacts_resolvedPeer.chats, false);
                    MessagesStorage.getInstance(ci.s2.H(s2Var)).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                }
                w1Var.f5759n = true;
                w1Var.G();
                return;
            case 16:
                ((ci.x2) this.f617b).e(0.0f, 240L, (Runnable) this.f618c);
                return;
            case 17:
                ci.q6 q6Var = (ci.q6) this.f617b;
                View view2 = (View) this.f618c;
                q6Var.getClass();
                if (view2 instanceof qg.j) {
                    qg.j jVar = (qg.j) view2;
                    jVar.m();
                    q6Var.D0(jVar, true);
                    return;
                }
                return;
            case 18:
                TLRPC.MessageMedia messageMedia = (TLRPC.MessageMedia) this.f617b;
                TL_stories.TL_mediaAreaGeoPoint tL_mediaAreaGeoPoint = (TL_stories.TL_mediaAreaGeoPoint) this.f618c;
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
            case 19:
                ((Utilities.Callback) this.f617b).run((Bitmap) this.f618c);
                return;
            case 20:
                ci.b7.a((ci.b7) this.f617b, (ci.k8) this.f618c);
                return;
            case 21:
                ci.k8 k8Var = (ci.k8) this.f618c;
                ci.b7 b7Var = (ci.b7) ((aa.a) this.f617b).d;
                Bitmap bitmap = b7Var.f4381a;
                if (bitmap != null) {
                    bitmap.recycle();
                    if (k8Var.M0 == b7Var.f4381a) {
                        k8Var.M0 = null;
                    }
                    b7Var.f4381a = null;
                    b7Var.invalidate();
                    return;
                }
                return;
            case 22:
                ci.f7 f7Var = (ci.f7) this.f617b;
                AtomicReference atomicReference = f7Var.f4699a;
                ?? obj = new Object();
                obj.f7048a = 256;
                atomicReference.set(new r8.n(new com.google.android.gms.internal.vision.u2((Context) this.f618c, (com.google.android.gms.internal.vision.x1) obj)));
                f7Var.a(f7Var.f4702f);
                return;
            case 23:
                ((ci.f7) this.f617b).f4701c.run((ci.d7) this.f618c);
                return;
            case 24:
                ci.p pVar = (ci.p) this.f617b;
                qg.b2 b2Var = (qg.b2) this.f618c;
                ci.n7 n7Var = pVar.f5253a;
                if (b2Var.getWidth() <= 0) {
                    n7Var.animate().scaleX(0.0f).scaleY(1.0f).withEndAction(new androidx.fragment.app.a0(pVar, 20)).start();
                    return;
                }
                float width = b2Var.getWidth() / n7Var.getWidth();
                ValueAnimator valueAnimator = pVar.f5260w;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                pVar.f5260w = ValueAnimator.ofFloat(0.0f, 1.0f);
                pVar.f5260w.addUpdateListener(new ci.m7(pVar, n7Var.getScaleX(), width, ((b2Var.getWidth() / 2.0f) + b2Var.getX()) - ((n7Var.getWidth() / 2.0f) + n7Var.getX()), ((b2Var.getHeight() / 2.0f) + b2Var.getY()) - ((n7Var.getHeight() / 2.0f) + n7Var.getY()), 0));
                pVar.f5260w.addListener(new z(4, pVar, b2Var));
                pVar.f5260w.setDuration(320L);
                pVar.f5260w.setInterpolator(sr.h);
                pVar.v = b2Var;
                pVar.f5260w.start();
                return;
            case 25:
                ci.c8.T((ci.c8) this.f617b, (TLObject) this.f618c);
                return;
            case 26:
                ci.c8 c8Var = (ci.c8) this.f617b;
                c8Var.J0 = false;
                c8Var.f4452b0.addAll((ArrayList) this.f618c);
                c8Var.f4464o0.N(true);
                return;
            case 27:
                ci.k8 k8Var2 = (ci.k8) this.f617b;
                TLObject tLObject2 = (TLObject) this.f618c;
                k8Var2.f4932e1 = 0;
                if (tLObject2 instanceof Vector) {
                    k8Var2.V0 = new ArrayList();
                    Vector vector = (Vector) tLObject2;
                    for (int i12 = 0; i12 < vector.objects.size(); i12++) {
                        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) vector.objects.get(i12);
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
                            tL_inputDocument.f18341id = document.f18335id;
                            tL_inputDocument.access_hash = document.access_hash;
                            tL_inputDocument.file_reference = document.file_reference;
                            k8Var2.V0.add(tL_inputDocument);
                        }
                    }
                    return;
                }
                return;
            case 28:
                ci.t8.R((ci.t8) this.f617b, (TLObject) this.f618c);
                return;
            default:
                ci.t8 t8Var = (ci.t8) this.f617b;
                TextView textView = (TextView) this.f618c;
                ClipboardManager clipboardManager = (ClipboardManager) t8Var.getContext().getSystemService("clipboard");
                org.telegram.ui.Cells.h3 h3Var = t8Var.Y.f20493b;
                if ((TextUtils.isEmpty(h3Var.getText()) || TextUtils.equals(h3Var.getText(), "https://") || TextUtils.isEmpty(h3Var.getText().toString())) && clipboardManager != null && clipboardManager.hasPrimaryClip()) {
                    i10 = 1;
                }
                ViewPropertyAnimator animate = textView.animate();
                if (i10 != 0) {
                    f11 = 1.0f;
                }
                ViewPropertyAnimator alpha = animate.alpha(f11);
                if (i10 != 0) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.7f;
                }
                ViewPropertyAnimator scaleX = alpha.scaleX(f7);
                if (i10 == 0) {
                    f10 = 0.7f;
                }
                qk.s(scaleX.scaleY(f10), sr.h, 300L);
                return;
        }
    }
}
