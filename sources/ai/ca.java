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
import org.telegram.ui.Components.ba0;
import org.telegram.ui.Components.bd;
import org.telegram.ui.Components.fa0;
import org.telegram.ui.Components.hs;
public final class ca implements Runnable {
    public final int f788a;
    public final Object f789b;
    public final Object f790c;

    public ca(int i10, Object obj, Object obj2) {
        this.f788a = i10;
        this.f789b = obj;
        this.f790c = obj2;
    }

    @Override
    public final void run() {
        b5 b5Var;
        e6 e6Var;
        float f7;
        float f10 = 1.0f;
        float f11 = 0.0f;
        int i10 = 0;
        switch (this.f788a) {
            case 0:
                da daVar = (da) this.f789b;
                View view = (View) this.f790c;
                daVar.getClass();
                try {
                    view.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                bd bdVar = daVar.H;
                if (bdVar != null) {
                    bdVar.c(false);
                }
                ViewParent parent = view.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).requestDisallowInterceptTouchEvent(false);
                }
                daVar.N = false;
                daVar.e();
                return;
            case 1:
                wa waVar = (wa) this.f789b;
                fa0 fa0Var = (fa0) this.f790c;
                fa0 fa0Var2 = waVar.f1868a;
                if (fa0Var == fa0Var2 && fa0Var2 != null) {
                    CharacterStyle characterStyle = fa0Var2.f26330i;
                    if (characterStyle instanceof URLSpan) {
                        xa xaVar = waVar.v;
                        ba0 ba0Var = waVar.f1870c;
                        Objects.requireNonNull(ba0Var);
                        xaVar.J.H((URLSpan) characterStyle, xaVar, new a3.d(ba0Var, 18));
                        waVar.f1868a = null;
                        return;
                    }
                    return;
                }
                return;
            case 2:
                nb nbVar = (nb) this.f789b;
                ci.d4 d4Var = (ci.d4) this.f790c;
                nbVar.d.removeView(d4Var);
                if (d4Var == nbVar.f1493c) {
                    nbVar.f1492b = null;
                    nbVar.invalidate();
                    nbVar.b(false);
                    return;
                }
                return;
            case 3:
                jc jcVar = (jc) this.f790c;
                kc kcVar = ((bc) this.f789b).d;
                f6 currentPeerView = kcVar.f1283n0.getCurrentPeerView();
                if (currentPeerView != null && (b5Var = currentPeerView.f955c1) != null && (e6Var = kcVar.G0) != null && ((jc) e6Var.f884c) == jcVar) {
                    b5Var.invalidate();
                    return;
                }
                return;
            case 4:
                ViewGroup container = (ViewGroup) this.f789b;
                kotlin.jvm.internal.i.e(container, "$container");
                container.endViewTransition(null);
                throw null;
            case 5:
                ((v0.i) this.f789b).onError(this.f790c);
                return;
            case 6:
                ((v0.i) this.f789b).onResult((v0.o) this.f790c);
                return;
            case 7:
                bi.z zVar = (bi.z) this.f789b;
                String str = (String) this.f790c;
                ArrayList arrayList = zVar.f3944f;
                while (true) {
                    if (i10 < arrayList.size()) {
                        if (!TextUtils.equals(((v8) arrayList.get(i10)).E, str)) {
                            i10++;
                        }
                    } else {
                        i10 = -1;
                    }
                }
                if (i10 >= 0) {
                    zVar.f3946r.d(str.hashCode(), i10 + 1);
                    return;
                }
                return;
            case 8:
                ((c1.e) this.f789b).e().onError(((kotlin.jvm.internal.p) this.f790c).f15180a);
                return;
            case 9:
                ((c1.e) this.f789b).e().onError((w0.h) this.f790c);
                return;
            case 10:
                ((c1.e) this.f789b).e().onResult((v0.o) this.f790c);
                return;
            case 11:
                c2.d.f4003a = (AudioManager) ((Context) this.f789b).getSystemService("audio");
                ((e2.g) this.f790c).e();
                return;
            case 12:
                ca.c cVar = (ca.c) this.f789b;
                CountDownLatch countDownLatch = (CountDownLatch) this.f790c;
                try {
                    l5.s.a().d.e(cVar.h.f15430a.b(i5.d.f12016c), 1);
                } catch (SQLException unused2) {
                }
                countDownLatch.countDown();
                return;
            case 13:
                ci.d dVar = (ci.d) this.f789b;
                org.telegram.ui.Cells.g gVar = (org.telegram.ui.Cells.g) this.f790c;
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
                ((Utilities.Callback) this.f789b).run((ArrayList) this.f790c);
                return;
            case 15:
                ci.v1 v1Var = (ci.v1) this.f789b;
                TLObject tLObject = (TLObject) this.f790c;
                ci.y1 y1Var = v1Var.f6126s;
                if (tLObject instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
                    ci.r2 r2Var = y1Var.f6346r;
                    MessagesController.getInstance(ci.r2.F(r2Var)).putUsers(tL_contacts_resolvedPeer.users, false);
                    MessagesController.getInstance(ci.r2.G(r2Var)).putChats(tL_contacts_resolvedPeer.chats, false);
                    MessagesStorage.getInstance(ci.r2.I(r2Var)).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                }
                v1Var.f6124n = true;
                v1Var.G();
                return;
            case 16:
                ((ci.w2) this.f789b).e(0.0f, 240L, (Runnable) this.f790c);
                return;
            case 17:
                ci.q6 q6Var = (ci.q6) this.f789b;
                View view2 = (View) this.f790c;
                q6Var.getClass();
                if (view2 instanceof qg.j) {
                    qg.j jVar = (qg.j) view2;
                    jVar.m();
                    q6Var.C0(jVar, true);
                    return;
                }
                return;
            case 18:
                TLRPC.MessageMedia messageMedia = (TLRPC.MessageMedia) this.f789b;
                TL_stories.TL_mediaAreaGeoPoint tL_mediaAreaGeoPoint = (TL_stories.TL_mediaAreaGeoPoint) this.f790c;
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
                ((Utilities.Callback) this.f789b).run((Bitmap) this.f790c);
                return;
            case 20:
                ci.b7.a((ci.b7) this.f789b, (ci.l8) this.f790c);
                return;
            case 21:
                ci.l8 l8Var = (ci.l8) this.f790c;
                ci.b7 b7Var = (ci.b7) ((aa.a) this.f789b).d;
                Bitmap bitmap = b7Var.f4756a;
                if (bitmap != null) {
                    bitmap.recycle();
                    if (l8Var.M0 == b7Var.f4756a) {
                        l8Var.M0 = null;
                    }
                    b7Var.f4756a = null;
                    b7Var.invalidate();
                    return;
                }
                return;
            case 22:
                ci.f7 f7Var = (ci.f7) this.f789b;
                AtomicReference atomicReference = f7Var.f5070a;
                ?? obj = new Object();
                obj.f7665a = 256;
                atomicReference.set(new r8.n(new com.google.android.gms.internal.vision.u2((Context) this.f790c, (com.google.android.gms.internal.vision.x1) obj)));
                f7Var.a(f7Var.f5074f);
                return;
            case 23:
                ((ci.f7) this.f789b).f5072c.run((ci.d7) this.f790c);
                return;
            case 24:
                ci.p pVar = (ci.p) this.f789b;
                qg.c2 c2Var = (qg.c2) this.f790c;
                ci.n7 n7Var = pVar.f5680a;
                if (c2Var.getWidth() <= 0) {
                    n7Var.animate().scaleX(0.0f).scaleY(1.0f).withEndAction(new androidx.fragment.app.a0(pVar, 20)).start();
                    return;
                }
                float width = c2Var.getWidth() / n7Var.getWidth();
                ValueAnimator valueAnimator = pVar.f5688w;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                pVar.f5688w = ValueAnimator.ofFloat(0.0f, 1.0f);
                pVar.f5688w.addUpdateListener(new ci.m7(pVar, n7Var.getScaleX(), width, ((c2Var.getWidth() / 2.0f) + c2Var.getX()) - ((n7Var.getWidth() / 2.0f) + n7Var.getX()), ((c2Var.getHeight() / 2.0f) + c2Var.getY()) - ((n7Var.getHeight() / 2.0f) + n7Var.getY()), 0));
                pVar.f5688w.addListener(new z(4, pVar, c2Var));
                pVar.f5688w.setDuration(320L);
                pVar.f5688w.setInterpolator(hs.h);
                pVar.v = c2Var;
                pVar.f5688w.start();
                return;
            case 25:
                ci.d8 d8Var = (ci.d8) this.f789b;
                d8Var.L0 = false;
                d8Var.f4947b0.addAll((ArrayList) this.f790c);
                d8Var.f4961q0.N(true);
                return;
            case 26:
                ci.d8.S((ci.d8) this.f789b, (TLObject) this.f790c);
                return;
            case 27:
                ci.l8 l8Var2 = (ci.l8) this.f789b;
                TLObject tLObject2 = (TLObject) this.f790c;
                l8Var2.f5407e1 = 0;
                if (tLObject2 instanceof Vector) {
                    l8Var2.V0 = new ArrayList();
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
                            tL_inputDocument.f20050id = document.f20044id;
                            tL_inputDocument.access_hash = document.access_hash;
                            tL_inputDocument.file_reference = document.file_reference;
                            l8Var2.V0.add(tL_inputDocument);
                        }
                    }
                    return;
                }
                return;
            case 28:
                ci.u8.S((ci.u8) this.f789b, (TLObject) this.f790c);
                return;
            default:
                ci.u8 u8Var = (ci.u8) this.f789b;
                TextView textView = (TextView) this.f790c;
                ClipboardManager clipboardManager = (ClipboardManager) u8Var.getContext().getSystemService("clipboard");
                org.telegram.ui.Cells.h3 h3Var = u8Var.Y.f22297b;
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
                bi.t(scaleX.scaleY(f10), hs.h, 300L);
                return;
        }
    }
}
