package di;

import android.animation.ValueAnimator;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.PowerManager;
import android.text.TextUtils;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.sk;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.Components.es;
public final class y6 implements Runnable {
    public final int f8131a;
    public final Object f8132b;
    public final Object f8133c;

    public y6(int i10, Object obj, Object obj2) {
        this.f8131a = i10;
        this.f8132b = obj;
        this.f8133c = obj2;
    }

    @Override
    public final void run() {
        float f7;
        PowerManager.WakeLock wakeLock;
        TL_bots.BotInfo botInfo;
        TL_bots.botAppSettings botappsettings;
        float f10 = 0.0f;
        float f11 = 1.0f;
        int i10 = 4;
        boolean z10 = true;
        switch (this.f8131a) {
            case 0:
                ((Utilities.Callback) this.f8132b).run((Bitmap) this.f8133c);
                return;
            case 1:
                a7.a((a7) this.f8132b, (k8) this.f8133c);
                return;
            case 2:
                k8 k8Var = (k8) this.f8133c;
                a7 a7Var = (a7) ((androidx.biometric.e) this.f8132b).d;
                Bitmap bitmap = a7Var.f6596a;
                if (bitmap != null) {
                    bitmap.recycle();
                    if (k8Var.M0 == a7Var.f6596a) {
                        k8Var.M0 = null;
                    }
                    a7Var.f6596a = null;
                    a7Var.invalidate();
                    return;
                }
                return;
            case 3:
                e7 e7Var = (e7) this.f8132b;
                AtomicReference atomicReference = e7Var.f6896a;
                ?? obj = new Object();
                obj.f5935a = 256;
                atomicReference.set(new r8.n(new com.google.android.gms.internal.vision.t2((Context) this.f8133c, (com.google.android.gms.internal.vision.x1) obj)));
                e7Var.a(e7Var.f6899f);
                return;
            case 4:
                ((e7) this.f8132b).f6898c.run((c7) this.f8133c);
                return;
            case 5:
                p pVar = (p) this.f8132b;
                rg.d2 d2Var = (rg.d2) this.f8133c;
                m7 m7Var = pVar.f7462a;
                if (d2Var.getWidth() <= 0) {
                    m7Var.animate().scaleX(0.0f).scaleY(1.0f).withEndAction(new bi.la(pVar, 29)).start();
                    return;
                }
                float width = d2Var.getWidth() / m7Var.getWidth();
                ValueAnimator valueAnimator = pVar.f7469w;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                pVar.f7469w = ValueAnimator.ofFloat(0.0f, 1.0f);
                pVar.f7469w.addUpdateListener(new l7(pVar, m7Var.getScaleX(), width, ((d2Var.getWidth() / 2.0f) + d2Var.getX()) - ((m7Var.getWidth() / 2.0f) + m7Var.getX()), ((d2Var.getHeight() / 2.0f) + d2Var.getY()) - ((m7Var.getHeight() / 2.0f) + m7Var.getY()), 0));
                pVar.f7469w.addListener(new bi.t(4, pVar, d2Var));
                pVar.f7469w.setDuration(320L);
                pVar.f7469w.setInterpolator(es.h);
                pVar.v = d2Var;
                pVar.f7469w.start();
                return;
            case 6:
                c8 c8Var = (c8) this.f8132b;
                c8Var.L0 = false;
                c8Var.f6715b0.addAll((ArrayList) this.f8133c);
                c8Var.f6729q0.N(true);
                return;
            case 7:
                c8.S((c8) this.f8132b, (TLObject) this.f8133c);
                return;
            case 8:
                k8 k8Var2 = (k8) this.f8132b;
                TLObject tLObject = (TLObject) this.f8133c;
                k8Var2.f7187e1 = 0;
                if (tLObject instanceof Vector) {
                    k8Var2.V0 = new ArrayList();
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
                            tL_inputDocument.f18928id = document.f18922id;
                            tL_inputDocument.access_hash = document.access_hash;
                            tL_inputDocument.file_reference = document.file_reference;
                            k8Var2.V0.add(tL_inputDocument);
                        }
                    }
                    return;
                }
                return;
            case 9:
                t8.S((t8) this.f8132b, (TLObject) this.f8133c);
                return;
            case 10:
                t8 t8Var = (t8) this.f8132b;
                TextView textView = (TextView) this.f8133c;
                ClipboardManager clipboardManager = (ClipboardManager) t8Var.getContext().getSystemService("clipboard");
                org.telegram.ui.Cells.h3 h3Var = t8Var.Y.f21083b;
                if ((!TextUtils.isEmpty(h3Var.getText()) && !TextUtils.equals(h3Var.getText(), "https://") && !TextUtils.isEmpty(h3Var.getText().toString())) || clipboardManager == null || !clipboardManager.hasPrimaryClip()) {
                    z10 = false;
                }
                ViewPropertyAnimator animate = textView.animate();
                if (z10) {
                    f10 = 1.0f;
                }
                ViewPropertyAnimator alpha = animate.alpha(f10);
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.7f;
                }
                ViewPropertyAnimator scaleX = alpha.scaleX(f7);
                if (!z10) {
                    f11 = 0.7f;
                }
                sk.t(scaleX.scaleY(f11), es.h, 300L);
                return;
            case 11:
                ea eaVar = (ea) this.f8132b;
                HashMap<Long, Integer> smallGroupsParticipantsCount = ((MessagesStorage) this.f8133c).getSmallGroupsParticipantsCount();
                if (smallGroupsParticipantsCount != null && !smallGroupsParticipantsCount.isEmpty()) {
                    AndroidUtilities.runOnUIThread(new y6(12, eaVar, smallGroupsParticipantsCount));
                    return;
                }
                return;
            case 12:
                ea eaVar2 = (ea) this.f8132b;
                HashMap hashMap = (HashMap) this.f8133c;
                if (eaVar2.P == null) {
                    eaVar2.P = new HashMap();
                }
                eaVar2.P.putAll(hashMap);
                return;
            case 13:
                d dVar = (d) this.f8132b;
                Runnable runnable = (Runnable) this.f8133c;
                if (dVar != null) {
                    dVar.setLoading(false);
                }
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 14:
                sc scVar = (sc) this.f8132b;
                Bitmap bitmap2 = (Bitmap) this.f8133c;
                if (scVar.f7807k && !scVar.f7805i) {
                    scVar.d.add(new rc(scVar, bitmap2));
                    scVar.f7807k = false;
                    scVar.f7810n.invalidate();
                    return;
                }
                return;
            case 15:
                int[] iArr = (int[]) this.f8132b;
                ConnectionsManager connectionsManager = (ConnectionsManager) this.f8133c;
                int i12 = iArr[0];
                if (i12 != 0) {
                    connectionsManager.cancelRequest(i12, true);
                    iArr[0] = 0;
                    return;
                }
                return;
            case 16:
                ((v0.i) this.f8132b).onError((w0.d) this.f8133c);
                return;
            case 17:
                ((v0.i) this.f8132b).onResult((v0.f) this.f8133c);
                return;
            case 18:
                v0.c cVar = (v0.c) this.f8133c;
                v0.i iVar = ((e1.d) this.f8132b).f8306f;
                if (iVar != null) {
                    iVar.onResult(cVar);
                    return;
                } else {
                    kotlin.jvm.internal.i.h("callback");
                    throw null;
                }
            case 19:
                e2.c cVar2 = (e2.c) this.f8132b;
                Object apply = ((i2.v) this.f8133c).apply(cVar2.f8328f);
                cVar2.f8328f = apply;
                e2.b bVar = new e2.b(cVar2, apply, 1);
                e2.i0 i0Var = (e2.i0) cVar2.f8327c;
                if (i0Var.f8360a.getLooper().getThread().isAlive()) {
                    i0Var.d(bVar);
                    return;
                }
                return;
            case 20:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                ((Context) this.f8133c).registerReceiver(new androidx.mediarouter.app.f((e2.w) this.f8132b, 2), intentFilter);
                return;
            case 21:
                Context context = (Context) this.f8133c;
                e2.w wVar = (e2.w) ((androidx.mediarouter.app.f) this.f8132b).f1876b;
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                if (connectivityManager != null) {
                    try {
                        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                            int type = activeNetworkInfo.getType();
                            if (type != 0) {
                                if (type != 1) {
                                    if (type != 4 && type != 5) {
                                        if (type != 6) {
                                            if (type != 9) {
                                                i10 = 8;
                                            } else {
                                                i10 = 7;
                                            }
                                        }
                                        i10 = 5;
                                    }
                                }
                                i10 = 2;
                            }
                            switch (activeNetworkInfo.getSubtype()) {
                                case 1:
                                case 2:
                                    i10 = 3;
                                    break;
                                case 3:
                                case 4:
                                case 5:
                                case 6:
                                case 7:
                                case 8:
                                case 9:
                                case 10:
                                case 11:
                                case 12:
                                case 14:
                                case 15:
                                case 17:
                                    break;
                                case 13:
                                    i10 = 5;
                                    break;
                                case 16:
                                case 19:
                                default:
                                    i10 = 6;
                                    break;
                                case 18:
                                    i10 = 2;
                                    break;
                                case 20:
                                    if (Build.VERSION.SDK_INT >= 29) {
                                        i10 = 9;
                                        break;
                                    }
                                    break;
                            }
                        } else {
                            i10 = 1;
                        }
                    } catch (SecurityException unused) {
                    }
                    if (Build.VERSION.SDK_INT < 31 && i10 == 5) {
                        e2.u.a(context, wVar);
                        return;
                    } else {
                        wVar.c(i10);
                        return;
                    }
                }
                i10 = 0;
                if (Build.VERSION.SDK_INT < 31) {
                }
                wVar.c(i10);
                return;
            case 22:
                j9.y yVar = (j9.y) this.f8133c;
                if (((j9.e0) this.f8132b).f12939a instanceof j9.a) {
                    yVar.cancel(false);
                    return;
                }
                return;
            case 23:
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f8133c;
                qf.b bVar2 = (qf.b) ((ac.a) this.f8132b).f483c;
                bVar2.getClass();
                if (atomicBoolean.get()) {
                    new Thread(new y6(24, bVar2, atomicBoolean), "ExoPlayer:WakeLockManager").start();
                    return;
                }
                return;
            case 24:
                qf.b bVar3 = (qf.b) this.f8132b;
                AtomicBoolean atomicBoolean2 = (AtomicBoolean) this.f8133c;
                synchronized (bVar3) {
                    if (atomicBoolean2.get() && (wakeLock = (PowerManager.WakeLock) bVar3.f43098c) != null) {
                        wakeLock.release();
                    }
                }
                return;
            case 25:
                fi.l lVar = (fi.l) this.f8132b;
                TLRPC.UserFull userFull = (TLRPC.UserFull) this.f8133c;
                if (userFull != null) {
                    lVar.W = false;
                    TL_payments.starRefProgram starrefprogram = userFull.starref_program;
                    lVar.Y = starrefprogram;
                    if (starrefprogram == null) {
                        lVar.W = true;
                        lVar.Y = lVar.G0();
                        lVar.X = null;
                    } else {
                        TL_payments.starRefProgram starrefprogram2 = new TL_payments.starRefProgram();
                        lVar.X = starrefprogram2;
                        TL_payments.starRefProgram starrefprogram3 = lVar.Y;
                        starrefprogram2.commission_permille = starrefprogram3.commission_permille;
                        starrefprogram2.duration_months = starrefprogram3.duration_months;
                    }
                }
                lVar.I0(true);
                return;
            case 26:
                fi.k3 k3Var = (fi.k3) this.f8132b;
                TLRPC.UserFull userFull2 = (TLRPC.UserFull) this.f8133c;
                k3Var.getClass();
                if (userFull2 != null && (botInfo = userFull2.bot_info) != null && (botappsettings = botInfo.app_settings) != null) {
                    k3Var.g(botappsettings, true);
                    return;
                }
                return;
            case 27:
                fi.k3 k3Var2 = (fi.k3) this.f8132b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f8133c;
                if (!k3Var2.f9359c0) {
                    if (tL_error != null) {
                        k3Var2.k(false);
                        return;
                    } else {
                        AndroidUtilities.runOnUIThread(k3Var2.f9379t0, 60000L);
                        return;
                    }
                }
                return;
            case 28:
                fi.k3 k3Var3 = (fi.k3) this.f8132b;
                org.telegram.ui.Components.sc Q = new org.telegram.ui.Components.zc(k3Var3.f9373p0, k3Var3.E).Q(R.raw.contact_check, 36, AndroidUtilities.replaceTags((String) this.f8133c));
                Q.f28805j = 5000;
                Q.k(true);
                return;
            default:
                fi.f4 f4Var = (fi.f4) this.f8132b;
                f4Var.getMessagesController().openApp((TLRPC.User) this.f8133c, f4Var.getClassGuid());
                return;
        }
    }
}
