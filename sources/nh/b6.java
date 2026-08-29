package nh;

import android.animation.ValueAnimator;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.text.TextUtils;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.video.VideoAds;
import org.telegram.messenger.voip.AudioRecordJNI;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.voip.VoipAudioManager;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.un0;
import org.telegram.ui.d31;
public final class b6 implements Runnable {
    public final int f17416a;
    public final Object f17417b;
    public final Object f17418c;

    public b6(int i10, Object obj, Object obj2) {
        this.f17416a = i10;
        this.f17417b = obj;
        this.f17418c = obj2;
    }

    @Override
    public final void run() {
        float f9;
        int i10 = this.f17416a;
        float f10 = 0.0f;
        float f11 = 1.0f;
        boolean z10 = false;
        Object obj = this.f17418c;
        Object obj2 = this.f17417b;
        switch (i10) {
            case 0:
                ((Utilities.Callback) obj2).run((Bitmap) obj);
                return;
            case 1:
                f6.a((f6) obj2, (o7) obj);
                return;
            case 2:
                o7 o7Var = (o7) obj;
                f6 f6Var = (f6) ((l3.g0) obj2).d;
                Bitmap bitmap = f6Var.f17644a;
                if (bitmap != null) {
                    bitmap.recycle();
                    if (o7Var.M0 == f6Var.f17644a) {
                        o7Var.M0 = null;
                    }
                    f6Var.f17644a = null;
                    f6Var.invalidate();
                    return;
                }
                return;
            case 3:
                j6 j6Var = (j6) obj2;
                AtomicReference atomicReference = j6Var.f17958a;
                ?? obj3 = new Object();
                obj3.f4889a = 256;
                atomicReference.set(new d8.n(new com.google.android.gms.internal.vision.t2((Context) obj, (com.google.android.gms.internal.vision.x1) obj3)));
                j6Var.a(j6Var.f17962f);
                return;
            case 4:
                ((j6) obj2).f17960c.run((h6) obj);
                return;
            case 5:
                p pVar = (p) obj2;
                bg.f3 f3Var = (bg.f3) obj;
                s6 s6Var = pVar.f18672a;
                if (f3Var.getWidth() <= 0) {
                    s6Var.animate().scaleX(0.0f).scaleY(1.0f).withEndAction(new m6(pVar, 1)).start();
                    return;
                }
                float width = f3Var.getWidth() / s6Var.getWidth();
                ValueAnimator valueAnimator = pVar.f18680w;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                pVar.f18680w = ValueAnimator.ofFloat(0.0f, 1.0f);
                pVar.f18680w.addUpdateListener(new r6(pVar, s6Var.getScaleX(), width, ((f3Var.getWidth() / 2.0f) + f3Var.getX()) - ((s6Var.getWidth() / 2.0f) + s6Var.getX()), ((f3Var.getHeight() / 2.0f) + f3Var.getY()) - ((s6Var.getHeight() / 2.0f) + s6Var.getY()), 0));
                pVar.f18680w.addListener(new bg.c3(9, pVar, f3Var));
                pVar.f18680w.setDuration(320L);
                pVar.f18680w.setInterpolator(jr.h);
                pVar.v = f3Var;
                pVar.f18680w.start();
                return;
            case 6:
                g7 g7Var = (g7) obj2;
                g7Var.H0 = false;
                g7Var.X.addAll((ArrayList) obj);
                g7Var.m0.N(true);
                return;
            case 7:
                g7.R((g7) obj2, (TLObject) obj);
                return;
            case 8:
                o7 o7Var2 = (o7) obj2;
                TLObject tLObject = (TLObject) obj;
                o7Var2.f18267e1 = 0;
                if (tLObject instanceof Vector) {
                    o7Var2.V0 = new ArrayList();
                    Vector vector = (Vector) tLObject;
                    for (int i11 = 0; i11 < vector.objects.size(); i11++) {
                        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) vector.objects.get(i11);
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
                            tL_inputDocument.f22404id = document.f22398id;
                            tL_inputDocument.access_hash = document.access_hash;
                            tL_inputDocument.file_reference = document.file_reference;
                            o7Var2.V0.add(tL_inputDocument);
                        }
                    }
                    return;
                }
                return;
            case 9:
                y7.R((y7) obj2, (TLObject) obj);
                return;
            case 10:
                y7 y7Var = (y7) obj2;
                TextView textView = (TextView) obj;
                ClipboardManager clipboardManager = (ClipboardManager) y7Var.getContext().getSystemService("clipboard");
                org.telegram.ui.Cells.e3 e3Var = y7Var.U.f24387b;
                if ((TextUtils.isEmpty(e3Var.getText()) || TextUtils.equals(e3Var.getText(), "https://") || TextUtils.isEmpty(e3Var.getText().toString())) && clipboardManager != null && clipboardManager.hasPrimaryClip()) {
                    z10 = true;
                }
                ViewPropertyAnimator animate = textView.animate();
                if (z10) {
                    f10 = 1.0f;
                }
                ViewPropertyAnimator alpha = animate.alpha(f10);
                if (z10) {
                    f9 = 1.0f;
                } else {
                    f9 = 0.7f;
                }
                ViewPropertyAnimator scaleX = alpha.scaleX(f9);
                if (!z10) {
                    f11 = 0.7f;
                }
                org.telegram.ui.b.q(scaleX.scaleY(f11), jr.h, 300L);
                return;
            case 11:
                e9 e9Var = (e9) obj2;
                HashMap<Long, Integer> smallGroupsParticipantsCount = ((MessagesStorage) obj).getSmallGroupsParticipantsCount();
                if (smallGroupsParticipantsCount != null && !smallGroupsParticipantsCount.isEmpty()) {
                    AndroidUtilities.runOnUIThread(new b6(12, e9Var, smallGroupsParticipantsCount));
                    return;
                }
                return;
            case 12:
                e9 e9Var2 = (e9) obj2;
                HashMap hashMap = (HashMap) obj;
                if (e9Var2.L == null) {
                    e9Var2.L = new HashMap();
                }
                e9Var2.L.putAll(hashMap);
                return;
            case 13:
                d dVar = (d) obj2;
                Runnable runnable = (Runnable) obj;
                if (dVar != null) {
                    dVar.setLoading(false);
                }
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 14:
                ob obVar = (ob) obj2;
                Bitmap bitmap2 = (Bitmap) obj;
                if (obVar.f18323k && !obVar.f18321i) {
                    obVar.d.add(new nb(obVar, bitmap2));
                    obVar.f18323k = false;
                    obVar.f18326n.invalidate();
                    return;
                }
                return;
            case 15:
                int[] iArr = (int[]) obj2;
                ConnectionsManager connectionsManager = (ConnectionsManager) obj;
                int i12 = iArr[0];
                if (i12 != 0) {
                    connectionsManager.cancelRequest(i12, true);
                    iArr[0] = 0;
                    return;
                }
                return;
            case 16:
                ((VideoAds) obj2).lambda$showPremium$19((cg.p1) obj);
                return;
            case 17:
                ((VideoAds) obj2).lambda$load$0((TLObject) obj);
                return;
            case 18:
                ((VideoAds) obj).lambda$show$16((Utilities.Callback) obj2);
                return;
            case 19:
                d31.T((Context) obj2, null, false, (lh.h0) obj, null);
                return;
            case 20:
                ((AudioRecordJNI) obj2).lambda$startThread$0((ByteBuffer) obj);
                return;
            case 21:
                ((ConferenceCall) obj2).lambda$processUpdates$4((TLRPC.Updates) obj);
                return;
            case 22:
                VideoCapturerDevice.lambda$checkScreenCapturerSize$1((VideoCapturerDevice) obj2, (Point) obj);
                return;
            case 23:
                ((VideoCapturerDevice) obj2).lambda$init$4((String) obj);
                return;
            case 24:
                ((VoIPService) obj2).lambda$startGroupCall$21((TL_update.TL_updateGroupCall) obj);
                return;
            case 25:
                ((VoIPService) obj2).lambda$createGroupInstance$71((String) obj);
                return;
            case 26:
                ((VoIPService) obj2).lambda$startConferenceGroupCall$56((org.telegram.messenger.voip.k0) obj);
                return;
            case 27:
                ((VoIPService) obj2).lambda$startScreenCapture$58((TLRPC.Updates) obj);
                return;
            case 28:
                ((VoipAudioManager) obj2).lambda$isBluetoothAndSpeakerOnAsync$2((Utilities.Callback2) obj);
                return;
            default:
                org.telegram.ui.ActionBar.l lVar = (org.telegram.ui.ActionBar.l) obj2;
                boolean canScrollVertically = ((un0) obj).canScrollVertically(-1);
                boolean z11 = !canScrollVertically;
                if (lVar.f23617m1 != z11) {
                    ValueAnimator valueAnimator2 = lVar.f23622o1;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    float f12 = lVar.f23620n1;
                    lVar.f23617m1 = z11;
                    if (!canScrollVertically) {
                        f10 = 1.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f12, f10);
                    lVar.f23622o1 = ofFloat;
                    ofFloat.addUpdateListener(new org.telegram.ui.ActionBar.a(lVar, 4));
                    lVar.f23622o1.addListener(new org.telegram.ui.ActionBar.d(lVar, z11, 1));
                    lVar.f23622o1.setDuration(320L);
                    lVar.f23622o1.setInterpolator(jr.h);
                    lVar.f23622o1.start();
                    return;
                }
                return;
        }
    }

    public b6(VideoAds videoAds, Utilities.Callback callback) {
        this.f17416a = 18;
        this.f17418c = videoAds;
        this.f17417b = callback;
    }
}
