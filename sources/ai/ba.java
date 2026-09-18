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
import org.telegram.messenger.wh;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.i90;
import org.telegram.ui.Components.m90;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.yc;
public final class ba implements Runnable {
    public final int f598a;
    public final Object f599b;
    public final Object f600c;

    public ba(int i10, Object obj, Object obj2) {
        this.f598a = i10;
        this.f599b = obj;
        this.f600c = obj2;
    }

    @Override
    public final void run() {
        a5 a5Var;
        e6 e6Var;
        float f7;
        float f10 = 1.0f;
        float f11 = 0.0f;
        int i10 = 0;
        switch (this.f598a) {
            case 0:
                ca caVar = (ca) this.f599b;
                View view = (View) this.f600c;
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
                va vaVar = (va) this.f599b;
                m90 m90Var = (m90) this.f600c;
                m90 m90Var2 = vaVar.f1619a;
                if (m90Var == m90Var2 && m90Var2 != null) {
                    CharacterStyle characterStyle = m90Var2.f26369i;
                    if (characterStyle instanceof URLSpan) {
                        wa waVar = vaVar.v;
                        i90 i90Var = vaVar.f1621c;
                        Objects.requireNonNull(i90Var);
                        waVar.J.H((URLSpan) characterStyle, waVar, new a3.d(i90Var, 18));
                        vaVar.f1619a = null;
                        return;
                    }
                    return;
                }
                return;
            case 2:
                mb mbVar = (mb) this.f599b;
                ci.f4 f4Var = (ci.f4) this.f600c;
                mbVar.d.removeView(f4Var);
                if (f4Var == mbVar.f1266c) {
                    mbVar.f1265b = null;
                    mbVar.invalidate();
                    mbVar.b(false);
                    return;
                }
                return;
            case 3:
                ic icVar = (ic) this.f600c;
                jc jcVar = ((ac) this.f599b).d;
                f6 currentPeerView = jcVar.f1096n0.getCurrentPeerView();
                if (currentPeerView != null && (a5Var = currentPeerView.f803c1) != null && (e6Var = jcVar.G0) != null && ((ic) e6Var.f766c) == icVar) {
                    a5Var.invalidate();
                    return;
                }
                return;
            case 4:
                ViewGroup container = (ViewGroup) this.f599b;
                kotlin.jvm.internal.i.e(container, "$container");
                container.endViewTransition(null);
                throw null;
            case 5:
                ((v0.i) this.f599b).onError(this.f600c);
                return;
            case 6:
                ((v0.i) this.f599b).onResult((v0.o) this.f600c);
                return;
            case 7:
                bi.z zVar = (bi.z) this.f599b;
                String str = (String) this.f600c;
                ArrayList arrayList = zVar.f3610f;
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
                    zVar.f3612r.d(str.hashCode(), i10 + 1);
                    return;
                }
                return;
            case 8:
                ((c1.e) this.f599b).e().onError(((kotlin.jvm.internal.p) this.f600c).f13842a);
                return;
            case 9:
                ((c1.e) this.f599b).e().onError((w0.h) this.f600c);
                return;
            case 10:
                ((c1.e) this.f599b).e().onResult((v0.o) this.f600c);
                return;
            case 11:
                c2.d.f3665a = (AudioManager) ((Context) this.f599b).getSystemService("audio");
                ((e2.g) this.f600c).e();
                return;
            case 12:
                ca.c cVar = (ca.c) this.f599b;
                CountDownLatch countDownLatch = (CountDownLatch) this.f600c;
                try {
                    l5.s.a().d.e(cVar.h.f14072a.b(i5.d.f10998c), 1);
                } catch (SQLException unused2) {
                }
                countDownLatch.countDown();
                return;
            case 13:
                ci.d dVar = (ci.d) this.f599b;
                org.telegram.ui.Cells.g gVar = (org.telegram.ui.Cells.g) this.f600c;
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
                ((Utilities.Callback) this.f599b).run((ArrayList) this.f600c);
                return;
            case 15:
                ci.w1 w1Var = (ci.w1) this.f599b;
                TLObject tLObject = (TLObject) this.f600c;
                ci.z1 z1Var = w1Var.f5686s;
                if (tLObject instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
                    ci.t2 t2Var = z1Var.f5860r;
                    MessagesController.getInstance(ci.t2.E(t2Var)).putUsers(tL_contacts_resolvedPeer.users, false);
                    MessagesController.getInstance(ci.t2.F(t2Var)).putChats(tL_contacts_resolvedPeer.chats, false);
                    MessagesStorage.getInstance(ci.t2.H(t2Var)).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                }
                w1Var.f5684n = true;
                w1Var.G();
                return;
            case 16:
                ((ci.y2) this.f599b).e(0.0f, 240L, (Runnable) this.f600c);
                return;
            case 17:
                ci.r6 r6Var = (ci.r6) this.f599b;
                View view2 = (View) this.f600c;
                r6Var.getClass();
                if (view2 instanceof qg.j) {
                    qg.j jVar = (qg.j) view2;
                    jVar.m();
                    r6Var.D0(jVar, true);
                    return;
                }
                return;
            case 18:
                TLRPC.MessageMedia messageMedia = (TLRPC.MessageMedia) this.f599b;
                TL_stories.TL_mediaAreaGeoPoint tL_mediaAreaGeoPoint = (TL_stories.TL_mediaAreaGeoPoint) this.f600c;
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
                ((Utilities.Callback) this.f599b).run((Bitmap) this.f600c);
                return;
            case 20:
                ci.d7.a((ci.d7) this.f599b, (ci.o8) this.f600c);
                return;
            case 21:
                ci.o8 o8Var = (ci.o8) this.f600c;
                ci.d7 d7Var = (ci.d7) ((aa.a) this.f599b).d;
                Bitmap bitmap = d7Var.f4504a;
                if (bitmap != null) {
                    bitmap.recycle();
                    if (o8Var.M0 == d7Var.f4504a) {
                        o8Var.M0 = null;
                    }
                    d7Var.f4504a = null;
                    d7Var.invalidate();
                    return;
                }
                return;
            case 22:
                ci.h7 h7Var = (ci.h7) this.f599b;
                AtomicReference atomicReference = h7Var.f4749a;
                ?? obj = new Object();
                obj.f7064a = 256;
                atomicReference.set(new r8.n(new com.google.android.gms.internal.vision.u2((Context) this.f600c, (com.google.android.gms.internal.vision.x1) obj)));
                h7Var.a(h7Var.f4752f);
                return;
            case 23:
                ((ci.h7) this.f599b).f4751c.run((ci.f7) this.f600c);
                return;
            case 24:
                ci.p pVar = (ci.p) this.f599b;
                qg.b2 b2Var = (qg.b2) this.f600c;
                ci.p7 p7Var = pVar.f5349a;
                if (b2Var.getWidth() <= 0) {
                    p7Var.animate().scaleX(0.0f).scaleY(1.0f).withEndAction(new androidx.fragment.app.a0(pVar, 20)).start();
                    return;
                }
                float width = b2Var.getWidth() / p7Var.getWidth();
                ValueAnimator valueAnimator = pVar.f5356w;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                pVar.f5356w = ValueAnimator.ofFloat(0.0f, 1.0f);
                pVar.f5356w.addUpdateListener(new ci.o7(pVar, p7Var.getScaleX(), width, ((b2Var.getWidth() / 2.0f) + b2Var.getX()) - ((p7Var.getWidth() / 2.0f) + p7Var.getX()), ((b2Var.getHeight() / 2.0f) + b2Var.getY()) - ((p7Var.getHeight() / 2.0f) + p7Var.getY()), 0));
                pVar.f5356w.addListener(new z(4, pVar, b2Var));
                pVar.f5356w.setDuration(320L);
                pVar.f5356w.setInterpolator(qr.h);
                pVar.v = b2Var;
                pVar.f5356w.start();
                return;
            case 25:
                ci.g8 g8Var = (ci.g8) this.f599b;
                g8Var.L0 = false;
                g8Var.f4700b0.addAll((ArrayList) this.f600c);
                g8Var.f4714q0.N(true);
                return;
            case 26:
                ci.g8.S((ci.g8) this.f599b, (TLObject) this.f600c);
                return;
            case 27:
                ci.o8 o8Var2 = (ci.o8) this.f599b;
                TLObject tLObject2 = (TLObject) this.f600c;
                o8Var2.f5154e1 = 0;
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
                            tL_inputDocument.f18308id = document.f18302id;
                            tL_inputDocument.access_hash = document.access_hash;
                            tL_inputDocument.file_reference = document.file_reference;
                            o8Var2.V0.add(tL_inputDocument);
                        }
                    }
                    return;
                }
                return;
            case 28:
                ci.x8.R((ci.x8) this.f599b, (TLObject) this.f600c);
                return;
            default:
                ci.x8 x8Var = (ci.x8) this.f599b;
                TextView textView = (TextView) this.f600c;
                ClipboardManager clipboardManager = (ClipboardManager) x8Var.getContext().getSystemService("clipboard");
                org.telegram.ui.Cells.h3 h3Var = x8Var.Y.f20455b;
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
                wh.r(scaleX.scaleY(f10), qr.h, 300L);
                return;
        }
    }
}
