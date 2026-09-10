package a1;

import a3.l0;
import ai.g0;
import android.animation.ValueAnimator;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.location.Address;
import android.location.Geocoder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import b2.x1;
import bi.aa;
import bi.e8;
import bi.f3;
import bi.g8;
import bi.h2;
import bi.i8;
import bi.i9;
import bi.je;
import bi.k2;
import bi.ke;
import bi.m3;
import bi.p8;
import bi.q8;
import bi.r7;
import bi.r9;
import bi.rb;
import bi.t;
import bi.u3;
import com.google.android.gms.internal.vision.u2;
import e2.d0;
import i2.a0;
import i2.b0;
import i2.e0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.p;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.em;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Cells.g3;
import org.telegram.ui.Components.wr;
import pg.b2;
import pg.j;
import r8.n;
import v0.i;
import v0.o;
import zh.s4;
public final class e implements Runnable {
    public final int f39a;
    public final Object f40b;
    public final Object f41c;

    public e(int i10, Object obj, Object obj2) {
        this.f39a = i10;
        this.f40b = obj;
        this.f41c = obj2;
    }

    @Override
    public final void run() {
        float f7;
        float f10 = 1.0f;
        float f11 = 0.0f;
        boolean z10 = true;
        int i10 = 0;
        switch (this.f39a) {
            case 0:
                CredentialProviderPlayServicesImpl.runFallbackClearCredFlow$lambda$27$lambda$26$lambda$25$lambda$24((i) this.f40b, (Exception) this.f41c);
                return;
            case 1:
                CredentialProviderPlayServicesImpl.onClearCredential$lambda$14$lambda$13$lambda$12((i) this.f40b, (p) this.f41c);
                return;
            case 2:
                x1 x1Var = (x1) this.f41c;
                String str = d0.f7188a;
                e0 e0Var = ((b0) ((l0) ((of.b) this.f40b).f14295c)).f10108a;
                e0Var.f10141h0 = x1Var;
                e0Var.f10150m.e(25, new a0(x1Var));
                return;
            case 3:
                String str2 = d0.f7188a;
                j2.e eVar = ((b0) ((l0) ((of.b) this.f40b).f14295c)).f10108a.f10157s;
                j2.a p5 = eVar.p();
                eVar.q(p5, 1030, new i0.b(p5, (Exception) this.f41c, 7));
                return;
            case 4:
                String str3 = d0.f7188a;
                j2.e eVar2 = ((b0) ((l0) ((of.b) this.f40b).f14295c)).f10108a.f10157s;
                j2.a p10 = eVar2.p();
                eVar2.q(p10, 1019, new i0.b(p10, (String) this.f41c, 14));
                return;
            case 5:
                g0 g0Var = (g0) this.f40b;
                String str4 = (String) this.f41c;
                ArrayList arrayList = g0Var.f445f;
                while (true) {
                    if (i10 < arrayList.size()) {
                        if (!TextUtils.equals(((s4) arrayList.get(i10)).E, str4)) {
                            i10++;
                        }
                    } else {
                        i10 = -1;
                    }
                }
                if (i10 >= 0) {
                    g0Var.f447r.d(str4.hashCode(), i10 + 1);
                    return;
                }
                return;
            case 6:
                ViewGroup container = (ViewGroup) this.f40b;
                kotlin.jvm.internal.i.e(container, "$container");
                container.endViewTransition(null);
                throw null;
            case 7:
                ((i) this.f40b).onError(this.f41c);
                return;
            case 8:
                ((i) this.f40b).onResult((o) this.f41c);
                return;
            case 9:
                bi.d dVar = (bi.d) this.f40b;
                org.telegram.ui.Cells.g gVar = (org.telegram.ui.Cells.g) this.f41c;
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
            case 10:
                ((Utilities.Callback) this.f40b).run((ArrayList) this.f41c);
                return;
            case 11:
                h2 h2Var = (h2) this.f40b;
                TLObject tLObject = (TLObject) this.f41c;
                k2 k2Var = h2Var.f2783s;
                if (tLObject instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
                    f3 f3Var = k2Var.f2984r;
                    MessagesController.getInstance(f3.D(f3Var)).putUsers(tL_contacts_resolvedPeer.users, false);
                    MessagesController.getInstance(f3.E(f3Var)).putChats(tL_contacts_resolvedPeer.chats, false);
                    MessagesStorage.getInstance(f3.H(f3Var)).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                }
                h2Var.f2781n = true;
                h2Var.G();
                return;
            case 12:
                ((m3) this.f40b).e(0.0f, 240L, (Runnable) this.f41c);
                return;
            case 13:
                r7 r7Var = (r7) this.f40b;
                View view = (View) this.f41c;
                r7Var.getClass();
                if (view instanceof j) {
                    j jVar = (j) view;
                    jVar.m();
                    r7Var.D0(jVar, true);
                    return;
                }
                return;
            case 14:
                TLRPC.MessageMedia messageMedia = (TLRPC.MessageMedia) this.f40b;
                TL_stories.TL_mediaAreaGeoPoint tL_mediaAreaGeoPoint = (TL_stories.TL_mediaAreaGeoPoint) this.f41c;
                try {
                    List<Address> fromLocationName = new Geocoder(ApplicationLoader.applicationContext, LocaleController.getInstance().getCurrentLocale()).getFromLocationName(messageMedia.title, 1);
                    if (fromLocationName.size() > 0) {
                        tL_mediaAreaGeoPoint.geo.lat = fromLocationName.get(0).getLatitude();
                        tL_mediaAreaGeoPoint.geo._long = fromLocationName.get(0).getLongitude();
                        return;
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 15:
                ((Utilities.Callback) this.f40b).run((Bitmap) this.f41c);
                return;
            case 16:
                e8.a((e8) this.f40b, (r9) this.f41c);
                return;
            case 17:
                r9 r9Var = (r9) this.f41c;
                e8 e8Var = (e8) ((aa.a) this.f40b).d;
                Bitmap bitmap = e8Var.f2631a;
                if (bitmap != null) {
                    bitmap.recycle();
                    if (r9Var.M0 == e8Var.f2631a) {
                        r9Var.M0 = null;
                    }
                    e8Var.f2631a = null;
                    e8Var.invalidate();
                    return;
                }
                return;
            case 18:
                i8 i8Var = (i8) this.f40b;
                AtomicReference atomicReference = i8Var.f2857a;
                ?? obj = new Object();
                obj.f5838a = 256;
                atomicReference.set(new n(new u2((Context) this.f41c, (com.google.android.gms.internal.vision.x1) obj)));
                i8Var.a(i8Var.f2860f);
                return;
            case 19:
                ((i8) this.f40b).f2859c.run((g8) this.f41c);
                return;
            case 20:
                t tVar = (t) this.f40b;
                b2 b2Var = (b2) this.f41c;
                q8 q8Var = tVar.f3549a;
                if (b2Var.getWidth() <= 0) {
                    q8Var.animate().scaleX(0.0f).scaleY(1.0f).withEndAction(new a3.d(tVar, 26)).start();
                    return;
                }
                float width = b2Var.getWidth() / q8Var.getWidth();
                ValueAnimator valueAnimator = tVar.f3556w;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                tVar.f3556w = ValueAnimator.ofFloat(0.0f, 1.0f);
                tVar.f3556w.addUpdateListener(new p8(tVar, q8Var.getScaleX(), width, ((b2Var.getWidth() / 2.0f) + b2Var.getX()) - ((q8Var.getWidth() / 2.0f) + q8Var.getX()), ((b2Var.getHeight() / 2.0f) + b2Var.getY()) - ((q8Var.getHeight() / 2.0f) + q8Var.getY()), 0));
                tVar.f3556w.addListener(new u3(2, tVar, b2Var));
                tVar.f3556w.setDuration(320L);
                tVar.f3556w.setInterpolator(wr.h);
                tVar.v = b2Var;
                tVar.f3556w.start();
                return;
            case 21:
                i9 i9Var = (i9) this.f40b;
                i9Var.L0 = false;
                i9Var.f2863b0.addAll((ArrayList) this.f41c);
                i9Var.f2877q0.N(true);
                return;
            case 22:
                i9.S((i9) this.f40b, (TLObject) this.f41c);
                return;
            case 23:
                r9 r9Var2 = (r9) this.f40b;
                TLObject tLObject2 = (TLObject) this.f41c;
                r9Var2.f3571e1 = 0;
                if (tLObject2 instanceof Vector) {
                    r9Var2.V0 = new ArrayList();
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
                            tL_inputDocument.f17207id = document.f17201id;
                            tL_inputDocument.access_hash = document.access_hash;
                            tL_inputDocument.file_reference = document.file_reference;
                            r9Var2.V0.add(tL_inputDocument);
                        }
                    }
                    return;
                }
                return;
            case 24:
                aa.R((aa) this.f40b, (TLObject) this.f41c);
                return;
            case 25:
                aa aaVar = (aa) this.f40b;
                TextView textView = (TextView) this.f41c;
                ClipboardManager clipboardManager = (ClipboardManager) aaVar.getContext().getSystemService("clipboard");
                g3 g3Var = aaVar.Y.f19293b;
                if ((!TextUtils.isEmpty(g3Var.getText()) && !TextUtils.equals(g3Var.getText(), "https://") && !TextUtils.isEmpty(g3Var.getText().toString())) || clipboardManager == null || !clipboardManager.hasPrimaryClip()) {
                    z10 = false;
                }
                ViewPropertyAnimator animate = textView.animate();
                if (z10) {
                    f11 = 1.0f;
                }
                ViewPropertyAnimator alpha = animate.alpha(f11);
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.7f;
                }
                ViewPropertyAnimator scaleX = alpha.scaleX(f7);
                if (!z10) {
                    f10 = 0.7f;
                }
                em.q(scaleX.scaleY(f10), wr.h, 300L);
                return;
            case 26:
                rb rbVar = (rb) this.f40b;
                HashMap<Long, Integer> smallGroupsParticipantsCount = ((MessagesStorage) this.f41c).getSmallGroupsParticipantsCount();
                if (smallGroupsParticipantsCount != null && !smallGroupsParticipantsCount.isEmpty()) {
                    AndroidUtilities.runOnUIThread(new e(27, rbVar, smallGroupsParticipantsCount));
                    return;
                }
                return;
            case 27:
                rb rbVar2 = (rb) this.f40b;
                HashMap hashMap = (HashMap) this.f41c;
                if (rbVar2.P == null) {
                    rbVar2.P = new HashMap();
                }
                rbVar2.P.putAll(hashMap);
                return;
            case 28:
                bi.d dVar2 = (bi.d) this.f40b;
                Runnable runnable = (Runnable) this.f41c;
                if (dVar2 != null) {
                    dVar2.setLoading(false);
                }
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                ke keVar = (ke) this.f40b;
                Bitmap bitmap2 = (Bitmap) this.f41c;
                if (keVar.f3029k && !keVar.f3027i) {
                    keVar.d.add(new je(keVar, bitmap2));
                    keVar.f3029k = false;
                    keVar.f3032n.invalidate();
                    return;
                }
                return;
        }
    }
}
