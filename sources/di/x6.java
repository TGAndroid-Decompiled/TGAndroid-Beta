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
import org.telegram.messenger.yh;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.Components.es;
public final class x6 implements Runnable {
    public final int f8088a;
    public final Object f8089b;
    public final Object f8090c;

    public x6(int i10, Object obj, Object obj2) {
        this.f8088a = i10;
        this.f8089b = obj;
        this.f8090c = obj2;
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
        switch (this.f8088a) {
            case 0:
                ((Utilities.Callback) this.f8089b).run((Bitmap) this.f8090c);
                return;
            case 1:
                a7.a((a7) this.f8089b, (k8) this.f8090c);
                return;
            case 2:
                k8 k8Var = (k8) this.f8090c;
                a7 a7Var = (a7) ((androidx.biometric.e) this.f8089b).d;
                Bitmap bitmap = a7Var.f6593a;
                if (bitmap != null) {
                    bitmap.recycle();
                    if (k8Var.M0 == a7Var.f6593a) {
                        k8Var.M0 = null;
                    }
                    a7Var.f6593a = null;
                    a7Var.invalidate();
                    return;
                }
                return;
            case 3:
                e7 e7Var = (e7) this.f8089b;
                AtomicReference atomicReference = e7Var.f6893a;
                ?? obj = new Object();
                obj.f5932a = 256;
                atomicReference.set(new r8.n(new com.google.android.gms.internal.vision.t2((Context) this.f8090c, (com.google.android.gms.internal.vision.x1) obj)));
                e7Var.a(e7Var.f6896f);
                return;
            case 4:
                ((e7) this.f8089b).f6895c.run((c7) this.f8090c);
                return;
            case 5:
                p pVar = (p) this.f8089b;
                rg.d2 d2Var = (rg.d2) this.f8090c;
                m7 m7Var = pVar.f7459a;
                if (d2Var.getWidth() <= 0) {
                    m7Var.animate().scaleX(0.0f).scaleY(1.0f).withEndAction(new bi.la(pVar, 29)).start();
                    return;
                }
                float width = d2Var.getWidth() / m7Var.getWidth();
                ValueAnimator valueAnimator = pVar.f7466w;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                pVar.f7466w = ValueAnimator.ofFloat(0.0f, 1.0f);
                pVar.f7466w.addUpdateListener(new l7(pVar, m7Var.getScaleX(), width, ((d2Var.getWidth() / 2.0f) + d2Var.getX()) - ((m7Var.getWidth() / 2.0f) + m7Var.getX()), ((d2Var.getHeight() / 2.0f) + d2Var.getY()) - ((m7Var.getHeight() / 2.0f) + m7Var.getY()), 0));
                pVar.f7466w.addListener(new bi.t(4, pVar, d2Var));
                pVar.f7466w.setDuration(320L);
                pVar.f7466w.setInterpolator(es.h);
                pVar.v = d2Var;
                pVar.f7466w.start();
                return;
            case 6:
                c8 c8Var = (c8) this.f8089b;
                c8Var.L0 = false;
                c8Var.f6712b0.addAll((ArrayList) this.f8090c);
                c8Var.f6726q0.N(true);
                return;
            case 7:
                c8.S((c8) this.f8089b, (TLObject) this.f8090c);
                return;
            case 8:
                k8 k8Var2 = (k8) this.f8089b;
                TLObject tLObject = (TLObject) this.f8090c;
                k8Var2.f7184e1 = 0;
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
                            tL_inputDocument.f19228id = document.f19222id;
                            tL_inputDocument.access_hash = document.access_hash;
                            tL_inputDocument.file_reference = document.file_reference;
                            k8Var2.V0.add(tL_inputDocument);
                        }
                    }
                    return;
                }
                return;
            case 9:
                t8.S((t8) this.f8089b, (TLObject) this.f8090c);
                return;
            case 10:
                t8 t8Var = (t8) this.f8089b;
                TextView textView = (TextView) this.f8090c;
                ClipboardManager clipboardManager = (ClipboardManager) t8Var.getContext().getSystemService("clipboard");
                org.telegram.ui.Cells.h3 h3Var = t8Var.Y.f21368b;
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
                yh.s(scaleX.scaleY(f11), es.h, 300L);
                return;
            case 11:
                ea eaVar = (ea) this.f8089b;
                HashMap<Long, Integer> smallGroupsParticipantsCount = ((MessagesStorage) this.f8090c).getSmallGroupsParticipantsCount();
                if (smallGroupsParticipantsCount != null && !smallGroupsParticipantsCount.isEmpty()) {
                    AndroidUtilities.runOnUIThread(new x6(12, eaVar, smallGroupsParticipantsCount));
                    return;
                }
                return;
            case 12:
                ea eaVar2 = (ea) this.f8089b;
                HashMap hashMap = (HashMap) this.f8090c;
                if (eaVar2.P == null) {
                    eaVar2.P = new HashMap();
                }
                eaVar2.P.putAll(hashMap);
                return;
            case 13:
                d dVar = (d) this.f8089b;
                Runnable runnable = (Runnable) this.f8090c;
                if (dVar != null) {
                    dVar.setLoading(false);
                }
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 14:
                sc scVar = (sc) this.f8089b;
                Bitmap bitmap2 = (Bitmap) this.f8090c;
                if (scVar.f7804k && !scVar.f7802i) {
                    scVar.d.add(new rc(scVar, bitmap2));
                    scVar.f7804k = false;
                    scVar.f7807n.invalidate();
                    return;
                }
                return;
            case 15:
                int[] iArr = (int[]) this.f8089b;
                ConnectionsManager connectionsManager = (ConnectionsManager) this.f8090c;
                int i12 = iArr[0];
                if (i12 != 0) {
                    connectionsManager.cancelRequest(i12, true);
                    iArr[0] = 0;
                    return;
                }
                return;
            case 16:
                ((v0.i) this.f8089b).onError((w0.d) this.f8090c);
                return;
            case 17:
                ((v0.i) this.f8089b).onResult((v0.f) this.f8090c);
                return;
            case 18:
                v0.c cVar = (v0.c) this.f8090c;
                v0.i iVar = ((e1.d) this.f8089b).f8303f;
                if (iVar != null) {
                    iVar.onResult(cVar);
                    return;
                } else {
                    kotlin.jvm.internal.i.h("callback");
                    throw null;
                }
            case 19:
                e2.c cVar2 = (e2.c) this.f8089b;
                Object apply = ((i2.v) this.f8090c).apply(cVar2.f8325f);
                cVar2.f8325f = apply;
                e2.b bVar = new e2.b(cVar2, apply, 1);
                e2.i0 i0Var = (e2.i0) cVar2.f8324c;
                if (i0Var.f8357a.getLooper().getThread().isAlive()) {
                    i0Var.d(bVar);
                    return;
                }
                return;
            case 20:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                ((Context) this.f8090c).registerReceiver(new androidx.mediarouter.app.f((e2.w) this.f8089b, 2), intentFilter);
                return;
            case 21:
                Context context = (Context) this.f8090c;
                e2.w wVar = (e2.w) ((androidx.mediarouter.app.f) this.f8089b).f1872b;
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
                j9.y yVar = (j9.y) this.f8090c;
                if (((j9.e0) this.f8089b).f12935a instanceof j9.a) {
                    yVar.cancel(false);
                    return;
                }
                return;
            case 23:
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f8090c;
                qf.b bVar2 = (qf.b) ((ac.a) this.f8089b).f479c;
                bVar2.getClass();
                if (atomicBoolean.get()) {
                    new Thread(new x6(24, bVar2, atomicBoolean), "ExoPlayer:WakeLockManager").start();
                    return;
                }
                return;
            case 24:
                qf.b bVar3 = (qf.b) this.f8089b;
                AtomicBoolean atomicBoolean2 = (AtomicBoolean) this.f8090c;
                synchronized (bVar3) {
                    if (atomicBoolean2.get() && (wakeLock = (PowerManager.WakeLock) bVar3.f43356c) != null) {
                        wakeLock.release();
                    }
                }
                return;
            case 25:
                fi.l lVar = (fi.l) this.f8089b;
                TLRPC.UserFull userFull = (TLRPC.UserFull) this.f8090c;
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
                fi.k3 k3Var = (fi.k3) this.f8089b;
                TLRPC.UserFull userFull2 = (TLRPC.UserFull) this.f8090c;
                k3Var.getClass();
                if (userFull2 != null && (botInfo = userFull2.bot_info) != null && (botappsettings = botInfo.app_settings) != null) {
                    k3Var.g(botappsettings, true);
                    return;
                }
                return;
            case 27:
                fi.k3 k3Var2 = (fi.k3) this.f8089b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f8090c;
                if (!k3Var2.f9356c0) {
                    if (tL_error != null) {
                        k3Var2.k(false);
                        return;
                    } else {
                        AndroidUtilities.runOnUIThread(k3Var2.f9376t0, 60000L);
                        return;
                    }
                }
                return;
            case 28:
                fi.k3 k3Var3 = (fi.k3) this.f8089b;
                org.telegram.ui.Components.sc Q = new org.telegram.ui.Components.zc(k3Var3.f9370p0, k3Var3.E).Q(R.raw.contact_check, 36, AndroidUtilities.replaceTags((String) this.f8090c));
                Q.f29102j = 5000;
                Q.k(true);
                return;
            default:
                fi.f4 f4Var = (fi.f4) this.f8089b;
                f4Var.getMessagesController().openApp((TLRPC.User) this.f8090c, f4Var.getClassGuid());
                return;
        }
    }
}
