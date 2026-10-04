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
import org.telegram.messenger.bi;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.n90;
import org.telegram.ui.Components.r90;
import org.telegram.ui.Components.tr;
import org.telegram.ui.Components.zc;
public final class ba implements Runnable {
    public final int f665a;
    public final Object f666b;
    public final Object f667c;

    public ba(int i10, Object obj, Object obj2) {
        this.f665a = i10;
        this.f666b = obj;
        this.f667c = obj2;
    }

    @Override
    public final void run() {
        a5 a5Var;
        d6 d6Var;
        float f7;
        float f10 = 1.0f;
        float f11 = 0.0f;
        int i10 = 0;
        switch (this.f665a) {
            case 0:
                ca caVar = (ca) this.f666b;
                View view = (View) this.f667c;
                caVar.getClass();
                try {
                    view.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                zc zcVar = caVar.H;
                if (zcVar != null) {
                    zcVar.c(false);
                }
                ViewParent parent = view.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).requestDisallowInterceptTouchEvent(false);
                }
                caVar.N = false;
                caVar.e();
                return;
            case 1:
                va vaVar = (va) this.f666b;
                r90 r90Var = (r90) this.f667c;
                r90 r90Var2 = vaVar.f1764a;
                if (r90Var == r90Var2 && r90Var2 != null) {
                    CharacterStyle characterStyle = r90Var2.f30312i;
                    if (characterStyle instanceof URLSpan) {
                        wa waVar = vaVar.v;
                        n90 n90Var = vaVar.f1766c;
                        Objects.requireNonNull(n90Var);
                        waVar.J.H((URLSpan) characterStyle, waVar, new a3.d(n90Var, 18));
                        vaVar.f1764a = null;
                        return;
                    }
                    return;
                }
                return;
            case 2:
                mb mbVar = (mb) this.f666b;
                ci.e4 e4Var = (ci.e4) this.f667c;
                mbVar.d.removeView(e4Var);
                if (e4Var == mbVar.f1378c) {
                    mbVar.f1377b = null;
                    mbVar.invalidate();
                    mbVar.b(false);
                    return;
                }
                return;
            case 3:
                ic icVar = (ic) this.f667c;
                jc jcVar = ((ac) this.f666b).d;
                e6 currentPeerView = jcVar.f1174n0.getCurrentPeerView();
                if (currentPeerView != null && (a5Var = currentPeerView.f844c1) != null && (d6Var = jcVar.G0) != null && ((ic) d6Var.f774c) == icVar) {
                    a5Var.invalidate();
                    return;
                }
                return;
            case 4:
                ViewGroup container = (ViewGroup) this.f666b;
                kotlin.jvm.internal.i.e(container, "$container");
                container.endViewTransition(null);
                throw null;
            case 5:
                ((v0.i) this.f666b).onError(this.f667c);
                return;
            case 6:
                ((v0.i) this.f666b).onResult((v0.p) this.f667c);
                return;
            case 7:
                bi.z zVar = (bi.z) this.f666b;
                String str = (String) this.f667c;
                ArrayList arrayList = zVar.f3895f;
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
                    zVar.f3897r.d(str.hashCode(), i10 + 1);
                    return;
                }
                return;
            case 8:
                ((c1.e) this.f666b).e().onError(((kotlin.jvm.internal.p) this.f667c).f15116a);
                return;
            case 9:
                ((c1.e) this.f666b).e().onError((w0.h) this.f667c);
                return;
            case 10:
                ((c1.e) this.f666b).e().onResult((v0.p) this.f667c);
                return;
            case 11:
                c2.d.f3954a = (AudioManager) ((Context) this.f666b).getSystemService("audio");
                ((e2.g) this.f667c).e();
                return;
            case 12:
                ca.c cVar = (ca.c) this.f666b;
                CountDownLatch countDownLatch = (CountDownLatch) this.f667c;
                try {
                    l5.t.a().d.e(cVar.h.f15367a.b(i5.d.f11966c), 1);
                } catch (SQLException unused2) {
                }
                countDownLatch.countDown();
                return;
            case 13:
                ci.d dVar = (ci.d) this.f666b;
                org.telegram.ui.Cells.g gVar = (org.telegram.ui.Cells.g) this.f667c;
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
                ((Utilities.Callback) this.f666b).run((ArrayList) this.f667c);
                return;
            case 15:
                ci.w1 w1Var = (ci.w1) this.f666b;
                TLObject tLObject = (TLObject) this.f667c;
                ci.z1 z1Var = w1Var.f6206s;
                if (tLObject instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
                    ci.s2 s2Var = z1Var.f6366r;
                    MessagesController.getInstance(ci.s2.C(s2Var)).putUsers(tL_contacts_resolvedPeer.users, false);
                    MessagesController.getInstance(ci.s2.D(s2Var)).putChats(tL_contacts_resolvedPeer.chats, false);
                    MessagesStorage.getInstance(ci.s2.F(s2Var)).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                }
                w1Var.f6204n = true;
                w1Var.G();
                return;
            case 16:
                ((ci.x2) this.f666b).e(0.0f, 240L, (Runnable) this.f667c);
                return;
            case 17:
                ci.q6 q6Var = (ci.q6) this.f666b;
                View view2 = (View) this.f667c;
                q6Var.getClass();
                if (view2 instanceof qg.j) {
                    qg.j jVar = (qg.j) view2;
                    jVar.m();
                    q6Var.D0(jVar, true);
                    return;
                }
                return;
            case 18:
                TLRPC.MessageMedia messageMedia = (TLRPC.MessageMedia) this.f666b;
                TL_stories.TL_mediaAreaGeoPoint tL_mediaAreaGeoPoint = (TL_stories.TL_mediaAreaGeoPoint) this.f667c;
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
                ((Utilities.Callback) this.f666b).run((Bitmap) this.f667c);
                return;
            case 20:
                ci.b7.a((ci.b7) this.f666b, (ci.k8) this.f667c);
                return;
            case 21:
                ci.k8 k8Var = (ci.k8) this.f667c;
                ci.b7 b7Var = (ci.b7) ((aa.a) this.f666b).d;
                Bitmap bitmap = b7Var.f4738a;
                if (bitmap != null) {
                    bitmap.recycle();
                    if (k8Var.M0 == b7Var.f4738a) {
                        k8Var.M0 = null;
                    }
                    b7Var.f4738a = null;
                    b7Var.invalidate();
                    return;
                }
                return;
            case 22:
                ci.f7 f7Var = (ci.f7) this.f666b;
                AtomicReference atomicReference = f7Var.f5076a;
                ?? obj = new Object();
                obj.f7616a = 256;
                atomicReference.set(new r8.n(new com.google.android.gms.internal.vision.u2((Context) this.f667c, (com.google.android.gms.internal.vision.x1) obj)));
                f7Var.a(f7Var.f5080f);
                return;
            case 23:
                ((ci.f7) this.f666b).f5078c.run((ci.d7) this.f667c);
                return;
            case 24:
                ci.p pVar = (ci.p) this.f666b;
                qg.b2 b2Var = (qg.b2) this.f667c;
                ci.n7 n7Var = pVar.f5656a;
                if (b2Var.getWidth() <= 0) {
                    n7Var.animate().scaleX(0.0f).scaleY(1.0f).withEndAction(new androidx.fragment.app.a0(pVar, 20)).start();
                    return;
                }
                float width = b2Var.getWidth() / n7Var.getWidth();
                ValueAnimator valueAnimator = pVar.f5664w;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                pVar.f5664w = ValueAnimator.ofFloat(0.0f, 1.0f);
                pVar.f5664w.addUpdateListener(new ci.m7(pVar, n7Var.getScaleX(), width, ((b2Var.getWidth() / 2.0f) + b2Var.getX()) - ((n7Var.getWidth() / 2.0f) + n7Var.getX()), ((b2Var.getHeight() / 2.0f) + b2Var.getY()) - ((n7Var.getHeight() / 2.0f) + n7Var.getY()), 0));
                pVar.f5664w.addListener(new z(4, pVar, b2Var));
                pVar.f5664w.setDuration(320L);
                pVar.f5664w.setInterpolator(tr.h);
                pVar.v = b2Var;
                pVar.f5664w.start();
                return;
            case 25:
                ci.c8.R((ci.c8) this.f666b, (TLObject) this.f667c);
                return;
            case 26:
                ci.c8 c8Var = (ci.c8) this.f666b;
                c8Var.J0 = false;
                c8Var.f4812b0.addAll((ArrayList) this.f667c);
                c8Var.f4824o0.N(true);
                return;
            case 27:
                ci.k8 k8Var2 = (ci.k8) this.f666b;
                TLObject tLObject2 = (TLObject) this.f667c;
                k8Var2.f5323e1 = 0;
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
                            tL_inputDocument.f20054id = document.f20048id;
                            tL_inputDocument.access_hash = document.access_hash;
                            tL_inputDocument.file_reference = document.file_reference;
                            k8Var2.V0.add(tL_inputDocument);
                        }
                    }
                    return;
                }
                return;
            case 28:
                ci.t8.P((ci.t8) this.f666b, (TLObject) this.f667c);
                return;
            default:
                ci.t8 t8Var = (ci.t8) this.f666b;
                TextView textView = (TextView) this.f667c;
                ClipboardManager clipboardManager = (ClipboardManager) t8Var.getContext().getSystemService("clipboard");
                org.telegram.ui.Cells.h3 h3Var = t8Var.Y.f22311b;
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
                bi.r(scaleX.scaleY(f10), tr.h, 300L);
                return;
        }
    }
}
