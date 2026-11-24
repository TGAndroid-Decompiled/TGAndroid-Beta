package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.PowerManager;
import android.os.SystemClock;
import android.text.SpannableString;
import android.util.Log;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.voip.VoipAudioManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Wallet.c;
public final class qhc implements Runnable {
    public final byte a;
    public final Object b;
    public final Object c;

    public qhc(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override
    public final void run() {
        PowerManager.WakeLock wakeLock;
        switch (this.a) {
            case 0:
                iic iicVar = (iic) this.b;
                iicVar.V.a(new rhc(iicVar, (VoIPService) this.c, (byte) 1), true);
                return;
            case 1:
                iic iicVar2 = (iic) this.b;
                ValueAnimator valueAnimator = (ValueAnimator) this.c;
                yic.T = false;
                yic.b();
                ViewPropertyAnimator duration = iicVar2.L.animate().setDuration(150L);
                d53 d53Var = d53.f;
                duration.setInterpolator(d53Var).start();
                iicVar2.I.animate().alpha(1.0f).setDuration(150L).setInterpolator(d53Var).start();
                iicVar2.J.animate().alpha(1.0f).setDuration(150L).setInterpolator(d53Var).start();
                iicVar2.O.animate().alpha(1.0f).setDuration(150L).setInterpolator(d53Var).start();
                iicVar2.Y.animate().alpha(1.0f).setDuration(150L).setInterpolator(d53Var).start();
                iicVar2.j0.animate().alpha(1.0f).setDuration(150L).setInterpolator(d53Var).start();
                iicVar2.h0.animate().alpha(1.0f).setDuration(350L).setInterpolator(d53Var).start();
                iicVar2.i0.animate().alpha(1.0f).setDuration(350L).setInterpolator(d53Var).start();
                iicVar2.M0.animate().alpha(1.0f).setDuration(350L).setInterpolator(d53Var).start();
                valueAnimator.addListener(new yhc(iicVar2, (byte) 2));
                valueAnimator.setDuration(350L);
                valueAnimator.setInterpolator(d53Var);
                valueAnimator.start();
                return;
            case 2:
                ((VoIPService) this.c).lambda$startScreenCapture$61((TLRPC.Updates) this.b);
                return;
            case 3:
                ((VoIPService) this.c).lambda$startGroupCall$24((TL_update.TL_updateGroupCall) this.b);
                return;
            case 4:
                ((VoIPService) this.c).lambda$startConferenceGroupCall$59((ot1) this.b);
                return;
            case 5:
                glc glcVar = (glc) this.b;
                ykc ykcVar = (ykc) this.c;
                if (glcVar.c == 0 && glcVar.K == ykcVar && ykcVar.R) {
                    ykcVar.R = false;
                    ykcVar.f0 = -1;
                    ykcVar.invalidate();
                    return;
                }
                return;
            case 6:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.c;
                if (((glc) this.b).X == editTextBoldCursor) {
                    gm.E3(editTextBoldCursor);
                    return;
                }
                return;
            case 7:
                glc glcVar2 = (glc) this.b;
                String str = (String) this.c;
                glcVar2.i0 = false;
                if (glcVar2.c == 0) {
                    ykc ykcVar2 = glcVar2.K;
                    if (ykcVar2 != null) {
                        ykcVar2.setBusy(false);
                        return;
                    }
                    return;
                } else if (str != null && !str.trim().isEmpty()) {
                    glcVar2.e0 = str.trim();
                    glcVar2.f0 = glcVar2.b().size();
                    ykc ykcVar3 = glcVar2.K;
                    if (ykcVar3 != null) {
                        ykcVar3.setRevertShown(true);
                        glcVar2.K.setRebuildNext(true);
                    }
                    glcVar2.p();
                    ykc ykcVar4 = glcVar2.K;
                    if (ykcVar4 != null) {
                        ykcVar4.setRebuildNext(false);
                        glcVar2.K.setBusy(false);
                        return;
                    }
                    return;
                } else {
                    Log.d("VoiceLive", "field: style failed");
                    ykc ykcVar5 = glcVar2.K;
                    if (ykcVar5 != null) {
                        ykcVar5.setBusy(false);
                        return;
                    }
                    return;
                }
            case 8:
                ((AudioManager) this.b).setCommunicationDevice((AudioDeviceInfo) this.c);
                return;
            case 9:
                ((VoipAudioManager) this.b).lambda$isBluetoothAndSpeakerOnAsync$4((jac) this.c);
                return;
            case 10:
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.c;
                rhb rhbVar = (rhb) ((dmc) this.b).c;
                if (atomicBoolean.get()) {
                    new Thread(new qhc(rhbVar, atomicBoolean, (byte) 11), "ExoPlayer:WakeLockManager").start();
                    return;
                }
                return;
            case 11:
                rhb rhbVar2 = (rhb) this.b;
                AtomicBoolean atomicBoolean2 = (AtomicBoolean) this.c;
                synchronized (rhbVar2) {
                    if (atomicBoolean2.get() && (wakeLock = (PowerManager.WakeLock) rhbVar2.c) != null) {
                        wakeLock.release();
                    }
                }
                return;
            case 12:
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) this.c;
                ((jac) this.b).a(wallettransaction.comment, Boolean.valueOf(wallettransaction.comment_encrypted));
                return;
            case 13:
                TextView[] textViewArr = (TextView[]) this.b;
                SpannableString[] spannableStringArr = (SpannableString[]) this.c;
                if (textViewArr[0] != null) {
                    if (spannableStringArr[0] == null) {
                        SpannableString spannableString = new SpannableString(jb6.M0(2131748536, null));
                        spannableStringArr[0] = spannableString;
                        spannableString.setSpan(new ta6(gm.L(150.0f), textViewArr[0]), 0, spannableStringArr[0].length(), 33);
                    }
                    textViewArr[0].setText(spannableStringArr[0]);
                    return;
                }
                return;
            case 14:
                ((zf5) this.b).a(((TL_wallet.walletTransaction[]) this.c)[0]);
                return;
            case 15:
                el7[] el7VarArr = (el7[]) this.b;
                el7VarArr[0].setOnDismissListener(new qj8((TLRPC.User) this.c, (byte) 16));
                el7VarArr[0].dismiss();
                return;
            case 16:
                ((ey0) this.b).a((Canvas) this.c);
                return;
            case 17:
                ((poc) this.b).e((Canvas) this.c);
                return;
            case 18:
                ((poc) this.b).f((Canvas) this.c);
                return;
            case 19:
                ((ViewGroup) this.c).removeView(((apc) this.b).h);
                return;
            case 20:
                dpc dpcVar = (dpc) this.b;
                fpc fpcVar = (fpc) this.c;
                dpcVar.getClass();
                try {
                    EGLDisplay eGLDisplay = dpcVar.i;
                    if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
                        EGLSurface eGLSurface = dpcVar.k;
                        EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, dpcVar.j);
                        EGLSurface eGLSurface2 = fpcVar.h;
                        if (eGLSurface2 != EGL14.EGL_NO_SURFACE) {
                            EGL14.eglDestroySurface(dpcVar.i, eGLSurface2);
                        }
                        fpcVar.h = EGL14.EGL_NO_SURFACE;
                        if (dpcVar.f.length == 0) {
                            dpcVar.b();
                        }
                    }
                    return;
                } finally {
                    fpcVar.b.release();
                }
            case 21:
                ((qac) this.b).a((TL_wallet.walletTransaction) this.c);
                return;
            case 22:
                mqc mqcVar = (mqc) this.b;
                TLRPC.UserFull userFull = (TLRPC.UserFull) this.c;
                if (!mqcVar.b1 && userFull != null) {
                    mqcVar.D1 = SystemClock.elapsedRealtime();
                    TL_wallet.card cardVar = userFull.wallet_card;
                    if (cardVar == null) {
                        cardVar = new TL_wallet.card();
                    }
                    mqcVar.d(cardVar);
                    return;
                }
                return;
            case 23:
                pqc pqcVar = (pqc) this.b;
                d dVar = (d) this.c;
                if (dVar instanceof goc) {
                    pqcVar.getClass();
                    if (c41.a(dVar)) {
                        c41.b0(dVar).I(2131623990, jb6.M0(2131742771, null), jb6.M0(2131742770, null)).j();
                    }
                }
                pqcVar.finishFragment();
                return;
            case 24:
                vqc vqcVar = (vqc) this.b;
                vqcVar.getClass();
                ((g35) this.c).C();
                vqcVar.a.g3.O(true);
                return;
            case 25:
                vqc vqcVar2 = (vqc) this.b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, vqcVar2.getResourceProvider(), vqcVar2.getParentActivity());
                alertDialog$Builder.a.S = jb6.M0(2131742814, null);
                alertDialog$Builder.a.U = jb6.M0(2131742816, null);
                alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                alertDialog$Builder.j(jb6.M0(2131742819, null), new uxb(vqcVar2, (c) this.c, (byte) 11));
                alertDialog$Builder.c(-1);
                alertDialog$Builder.o();
                return;
            case 26:
                ((he[]) this.b)[0].dismiss();
                ((Runnable) this.c).run();
                return;
            case 27:
                ((ViewGroup) this.c).removeView(((esc) this.b).h);
                return;
            case 28:
                ktc ktcVar = (ktc) this.b;
                int[] iArr = (int[]) this.c;
                int i = iArr[0] - 1;
                iArr[0] = i;
                if (i == 0) {
                    ktcVar.a.E0(true);
                    return;
                }
                return;
            default:
                qtc qtcVar = (qtc) this.b;
                String str2 = (String) this.c;
                qtcVar.d.clear();
                qtcVar.e.clear();
                qtcVar.f = true;
                qtcVar.F(str2, "", true);
                qtcVar.h = str2;
                qtcVar.f();
                qtcVar.E = null;
                return;
        }
    }

    public qhc(VoIPService voIPService, Object obj, byte b) {
        this.a = b;
        this.c = voIPService;
        this.b = obj;
    }
}
