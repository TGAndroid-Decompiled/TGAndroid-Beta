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
import org.telegram.messenger.rk;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.k90;
import org.telegram.ui.Components.o90;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.yc;
public final class ba implements Runnable {
    public final int f595a;
    public final Object f596b;
    public final Object f597c;

    public ba(int i10, Object obj, Object obj2) {
        this.f595a = i10;
        this.f596b = obj;
        this.f597c = obj2;
    }

    @Override
    public final void run() {
        a5 a5Var;
        e6 e6Var;
        float f7;
        float f10 = 1.0f;
        float f11 = 0.0f;
        int i10 = 0;
        switch (this.f595a) {
            case 0:
                ca caVar = (ca) this.f596b;
                View view = (View) this.f597c;
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
                va vaVar = (va) this.f596b;
                o90 o90Var = (o90) this.f597c;
                o90 o90Var2 = vaVar.f1616a;
                if (o90Var == o90Var2 && o90Var2 != null) {
                    CharacterStyle characterStyle = o90Var2.f27022i;
                    if (characterStyle instanceof URLSpan) {
                        wa waVar = vaVar.v;
                        k90 k90Var = vaVar.f1618c;
                        Objects.requireNonNull(k90Var);
                        waVar.J.H((URLSpan) characterStyle, waVar, new a3.d(k90Var, 18));
                        vaVar.f1616a = null;
                        return;
                    }
                    return;
                }
                return;
            case 2:
                mb mbVar = (mb) this.f596b;
                ci.f4 f4Var = (ci.f4) this.f597c;
                mbVar.d.removeView(f4Var);
                if (f4Var == mbVar.f1263c) {
                    mbVar.f1262b = null;
                    mbVar.invalidate();
                    mbVar.b(false);
                    return;
                }
                return;
            case 3:
                ic icVar = (ic) this.f597c;
                jc jcVar = ((ac) this.f596b).d;
                f6 currentPeerView = jcVar.f1093n0.getCurrentPeerView();
                if (currentPeerView != null && (a5Var = currentPeerView.f800c1) != null && (e6Var = jcVar.G0) != null && ((ic) e6Var.f763c) == icVar) {
                    a5Var.invalidate();
                    return;
                }
                return;
            case 4:
                ViewGroup container = (ViewGroup) this.f596b;
                kotlin.jvm.internal.i.e(container, "$container");
                container.endViewTransition(null);
                throw null;
            case 5:
                ((v0.i) this.f596b).onError(this.f597c);
                return;
            case 6:
                ((v0.i) this.f596b).onResult((v0.p) this.f597c);
                return;
            case 7:
                bi.z zVar = (bi.z) this.f596b;
                String str = (String) this.f597c;
                ArrayList arrayList = zVar.f3609f;
                while (true) {
                    if (i10 < arrayList.size()) {
                        if (!TextUtils.equals(((t8) arrayList.get(i10)).E, str)) {
                            i10++;
                        }
                    } else {
                        i10 = -1;
                    }
                }
                if (i10 >= 0) {
                    zVar.f3611r.d(str.hashCode(), i10 + 1);
                    return;
                }
                return;
            case 8:
                ((c1.e) this.f596b).e().onError(((kotlin.jvm.internal.p) this.f597c).f13894a);
                return;
            case 9:
                ((c1.e) this.f596b).e().onError((w0.h) this.f597c);
                return;
            case 10:
                ((c1.e) this.f596b).e().onResult((v0.p) this.f597c);
                return;
            case 11:
                c2.d.f3664a = (AudioManager) ((Context) this.f596b).getSystemService("audio");
                ((e2.g) this.f597c).e();
                return;
            case 12:
                ca.c cVar = (ca.c) this.f596b;
                CountDownLatch countDownLatch = (CountDownLatch) this.f597c;
                try {
                    l5.t.a().d.e(cVar.h.f14126a.b(i5.d.f10999c), 1);
                } catch (SQLException unused2) {
                }
                countDownLatch.countDown();
                return;
            case 13:
                ci.d dVar = (ci.d) this.f596b;
                org.telegram.ui.Cells.g gVar = (org.telegram.ui.Cells.g) this.f597c;
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
                ((Utilities.Callback) this.f596b).run((ArrayList) this.f597c);
                return;
            case 15:
                ci.w1 w1Var = (ci.w1) this.f596b;
                TLObject tLObject = (TLObject) this.f597c;
                ci.z1 z1Var = w1Var.f5685s;
                if (tLObject instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
                    ci.t2 t2Var = z1Var.f5859r;
                    MessagesController.getInstance(ci.t2.D(t2Var)).putUsers(tL_contacts_resolvedPeer.users, false);
                    MessagesController.getInstance(ci.t2.E(t2Var)).putChats(tL_contacts_resolvedPeer.chats, false);
                    MessagesStorage.getInstance(ci.t2.G(t2Var)).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                }
                w1Var.f5683n = true;
                w1Var.G();
                return;
            case 16:
                ((ci.y2) this.f596b).e(0.0f, 240L, (Runnable) this.f597c);
                return;
            case 17:
                ci.r6 r6Var = (ci.r6) this.f596b;
                View view2 = (View) this.f597c;
                r6Var.getClass();
                if (view2 instanceof qg.j) {
                    qg.j jVar = (qg.j) view2;
                    jVar.m();
                    r6Var.D0(jVar, true);
                    return;
                }
                return;
            case 18:
                TLRPC.MessageMedia messageMedia = (TLRPC.MessageMedia) this.f596b;
                TL_stories.TL_mediaAreaGeoPoint tL_mediaAreaGeoPoint = (TL_stories.TL_mediaAreaGeoPoint) this.f597c;
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
                ((Utilities.Callback) this.f596b).run((Bitmap) this.f597c);
                return;
            case 20:
                ci.d7.a((ci.d7) this.f596b, (ci.o8) this.f597c);
                return;
            case 21:
                ci.o8 o8Var = (ci.o8) this.f597c;
                ci.d7 d7Var = (ci.d7) ((aa.a) this.f596b).d;
                Bitmap bitmap = d7Var.f4503a;
                if (bitmap != null) {
                    bitmap.recycle();
                    if (o8Var.M0 == d7Var.f4503a) {
                        o8Var.M0 = null;
                    }
                    d7Var.f4503a = null;
                    d7Var.invalidate();
                    return;
                }
                return;
            case 22:
                ci.h7 h7Var = (ci.h7) this.f596b;
                AtomicReference atomicReference = h7Var.f4748a;
                ?? obj = new Object();
                obj.f7063a = 256;
                atomicReference.set(new r8.n(new com.google.android.gms.internal.vision.u2((Context) this.f597c, (com.google.android.gms.internal.vision.x1) obj)));
                h7Var.a(h7Var.f4751f);
                return;
            case 23:
                ((ci.h7) this.f596b).f4750c.run((ci.f7) this.f597c);
                return;
            case 24:
                ci.p pVar = (ci.p) this.f596b;
                qg.c2 c2Var = (qg.c2) this.f597c;
                ci.p7 p7Var = pVar.f5348a;
                if (c2Var.getWidth() <= 0) {
                    p7Var.animate().scaleX(0.0f).scaleY(1.0f).withEndAction(new androidx.fragment.app.a0(pVar, 20)).start();
                    return;
                }
                float width = c2Var.getWidth() / p7Var.getWidth();
                ValueAnimator valueAnimator = pVar.f5355w;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                pVar.f5355w = ValueAnimator.ofFloat(0.0f, 1.0f);
                pVar.f5355w.addUpdateListener(new ci.o7(pVar, p7Var.getScaleX(), width, ((c2Var.getWidth() / 2.0f) + c2Var.getX()) - ((p7Var.getWidth() / 2.0f) + p7Var.getX()), ((c2Var.getHeight() / 2.0f) + c2Var.getY()) - ((p7Var.getHeight() / 2.0f) + p7Var.getY()), 0));
                pVar.f5355w.addListener(new z(4, pVar, c2Var));
                pVar.f5355w.setDuration(320L);
                pVar.f5355w.setInterpolator(qr.h);
                pVar.v = c2Var;
                pVar.f5355w.start();
                return;
            case 25:
                ci.g8 g8Var = (ci.g8) this.f596b;
                g8Var.L0 = false;
                g8Var.f4699b0.addAll((ArrayList) this.f597c);
                g8Var.f4713q0.N(true);
                return;
            case 26:
                ci.g8.S((ci.g8) this.f596b, (TLObject) this.f597c);
                return;
            case 27:
                ci.o8 o8Var2 = (ci.o8) this.f596b;
                TLObject tLObject2 = (TLObject) this.f597c;
                o8Var2.f5153e1 = 0;
                if (tLObject2 instanceof Vector) {
                    o8Var2.V0 = new ArrayList();
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
                            tL_inputDocument.f18355id = document.f18349id;
                            tL_inputDocument.access_hash = document.access_hash;
                            tL_inputDocument.file_reference = document.file_reference;
                            o8Var2.V0.add(tL_inputDocument);
                        }
                    }
                    return;
                }
                return;
            case 28:
                ci.x8.R((ci.x8) this.f596b, (TLObject) this.f597c);
                return;
            default:
                ci.x8 x8Var = (ci.x8) this.f596b;
                TextView textView = (TextView) this.f597c;
                ClipboardManager clipboardManager = (ClipboardManager) x8Var.getContext().getSystemService("clipboard");
                org.telegram.ui.Cells.i3 i3Var = x8Var.Y.f20542b;
                if ((TextUtils.isEmpty(i3Var.getText()) || TextUtils.equals(i3Var.getText(), "https://") || TextUtils.isEmpty(i3Var.getText().toString())) && clipboardManager != null && clipboardManager.hasPrimaryClip()) {
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
                rk.s(scaleX.scaleY(f10), qr.h, 300L);
                return;
        }
    }
}
