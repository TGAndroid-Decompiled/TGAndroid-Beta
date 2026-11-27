package defpackage;

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
import android.widget.TextView;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.voip.VoipAudioManager;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Wallet.c;
import org.telegram.ui.WallpapersListActivity;
public final class vlc implements Runnable {
    public final byte a;
    public final Object b;
    public final Object c;

    public vlc(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override
    public final void run() {
        PowerManager.WakeLock wakeLock;
        switch (this.a) {
            case 0:
                ((VoIPService) this.b).lambda$startGroupCall$24((TL_update.TL_updateGroupCall) this.c);
                return;
            case 1:
                ((VoIPService) this.b).lambda$startConferenceGroupCall$59((ps1) this.c);
                return;
            case 2:
                snc sncVar = (snc) this.b;
                knc kncVar = (knc) this.c;
                if (sncVar.c == 0 && sncVar.L == kncVar && kncVar.R) {
                    kncVar.R = false;
                    kncVar.f0 = -1;
                    kncVar.invalidate();
                    return;
                }
                return;
            case 3:
                m7 m7Var = (m7) this.c;
                if (((snc) this.b).Y == m7Var) {
                    hl.E3(m7Var);
                    return;
                }
                return;
            case 4:
                snc sncVar2 = (snc) this.b;
                String str = (String) this.c;
                sncVar2.k0 = false;
                if (sncVar2.c == 0) {
                    knc kncVar2 = sncVar2.L;
                    if (kncVar2 != null) {
                        kncVar2.setBusy(false);
                        return;
                    }
                    return;
                } else if (str != null && !str.trim().isEmpty()) {
                    sncVar2.g0 = str.trim();
                    sncVar2.h0 = sncVar2.b().size();
                    knc kncVar3 = sncVar2.L;
                    if (kncVar3 != null) {
                        kncVar3.setRevertShown(true);
                        sncVar2.L.setRebuildNext(true);
                    }
                    sncVar2.q();
                    knc kncVar4 = sncVar2.L;
                    if (kncVar4 != null) {
                        kncVar4.setRebuildNext(false);
                        sncVar2.L.setBusy(false);
                        return;
                    }
                    return;
                } else {
                    Log.d("VoiceLive", "field: style failed");
                    knc kncVar5 = sncVar2.L;
                    if (kncVar5 != null) {
                        kncVar5.setBusy(false);
                        return;
                    }
                    return;
                }
            case 5:
                ((AudioManager) this.b).setCommunicationDevice((AudioDeviceInfo) this.c);
                return;
            case 6:
                ((VoipAudioManager) this.b).lambda$isBluetoothAndSpeakerOnAsync$4((icc) this.c);
                return;
            case 7:
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.c;
                zhc zhcVar = (zhc) ((qoc) this.b).c;
                if (atomicBoolean.get()) {
                    new Thread(new vlc(zhcVar, atomicBoolean, (byte) 8), "ExoPlayer:WakeLockManager").start();
                    return;
                }
                return;
            case 8:
                zhc zhcVar2 = (zhc) this.b;
                AtomicBoolean atomicBoolean2 = (AtomicBoolean) this.c;
                synchronized (zhcVar2) {
                    if (atomicBoolean2.get() && (wakeLock = (PowerManager.WakeLock) zhcVar2.c) != null) {
                        wakeLock.release();
                    }
                }
                return;
            case 9:
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) this.c;
                ((icc) this.b).a(wallettransaction.comment, Boolean.valueOf(wallettransaction.comment_encrypted));
                return;
            case 10:
                TextView[] textViewArr = (TextView[]) this.b;
                SpannableString[] spannableStringArr = (SpannableString[]) this.c;
                if (textViewArr[0] != null) {
                    if (spannableStringArr[0] == null) {
                        SpannableString spannableString = new SpannableString(ob6.M0(2131748533, null));
                        spannableStringArr[0] = spannableString;
                        spannableString.setSpan(new ya6(hl.L(150.0f), textViewArr[0]), 0, spannableStringArr[0].length(), 33);
                    }
                    textViewArr[0].setText(spannableStringArr[0]);
                    return;
                }
                return;
            case 11:
                ((cg5) this.b).a(((TL_wallet.walletTransaction[]) this.c)[0]);
                return;
            case 12:
                jl7[] jl7VarArr = (jl7[]) this.b;
                jl7VarArr[0].setOnDismissListener(new dl8((TLRPC.User) this.c, (byte) 16));
                jl7VarArr[0].dismiss();
                return;
            case 13:
                ((fx0) this.b).a((Canvas) this.c);
                return;
            case 14:
                ((crc) this.b).e((Canvas) this.c);
                return;
            case 15:
                ((crc) this.b).f((Canvas) this.c);
                return;
            case 16:
                ((ViewGroup) this.c).removeView(((nrc) this.b).h);
                return;
            case 17:
                prc prcVar = (prc) this.b;
                rrc rrcVar = (rrc) this.c;
                prcVar.getClass();
                try {
                    EGLDisplay eGLDisplay = prcVar.i;
                    if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
                        EGLSurface eGLSurface = prcVar.k;
                        EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, prcVar.j);
                        EGLSurface eGLSurface2 = rrcVar.h;
                        if (eGLSurface2 != EGL14.EGL_NO_SURFACE) {
                            EGL14.eglDestroySurface(prcVar.i, eGLSurface2);
                        }
                        rrcVar.h = EGL14.EGL_NO_SURFACE;
                        if (prcVar.f.length == 0) {
                            prcVar.b();
                        }
                    }
                    return;
                } finally {
                    rrcVar.b.release();
                }
            case 18:
                ((pcc) this.b).a((TL_wallet.walletTransaction) this.c);
                return;
            case 19:
                wsc wscVar = (wsc) this.b;
                TLRPC.UserFull userFull = (TLRPC.UserFull) this.c;
                if (!wscVar.b1 && userFull != null) {
                    wscVar.D1 = SystemClock.elapsedRealtime();
                    TL_wallet.card cardVar = userFull.wallet_card;
                    if (cardVar == null) {
                        cardVar = new TL_wallet.card();
                    }
                    wscVar.d(cardVar);
                    return;
                }
                return;
            case 20:
                atc atcVar = (atc) this.b;
                e eVar = (e) this.c;
                if (eVar instanceof uqc) {
                    atcVar.getClass();
                    if (d31.a(eVar)) {
                        d31.b0(eVar).I(2131623990, ob6.M0(2131742739, null), ob6.M0(2131742738, null)).j();
                    }
                }
                atcVar.finishFragment();
                return;
            case 21:
                gtc gtcVar = (gtc) this.b;
                gtcVar.getClass();
                ((k35) this.c).C();
                gtcVar.a.g3.O(true);
                return;
            case 22:
                gtc gtcVar2 = (gtc) this.b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, gtcVar2.getResourceProvider(), gtcVar2.getParentActivity());
                alertDialog$Builder.a.S = ob6.M0(2131742782, null);
                alertDialog$Builder.a.U = ob6.M0(2131742784, null);
                alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                alertDialog$Builder.j(ob6.M0(2131742787, null), new yw9(gtcVar2, (c) this.c, (byte) 26));
                alertDialog$Builder.c(-1);
                alertDialog$Builder.o();
                return;
            case 23:
                ((id[]) this.b)[0].dismiss();
                ((Runnable) this.c).run();
                return;
            case 24:
                ((ViewGroup) this.c).removeView(((quc) this.b).h);
                return;
            case 25:
                wvc wvcVar = (wvc) this.b;
                int[] iArr = (int[]) this.c;
                int i = iArr[0] - 1;
                iArr[0] = i;
                if (i == 0) {
                    wvcVar.a.E0(true);
                    return;
                }
                return;
            case 26:
                cwc cwcVar = (cwc) this.b;
                String str2 = (String) this.c;
                cwcVar.d.clear();
                cwcVar.e.clear();
                cwcVar.f = true;
                cwcVar.F(str2, "", true);
                cwcVar.h = str2;
                cwcVar.f();
                cwcVar.E = null;
                return;
            case 27:
                cwc cwcVar2 = (cwc) this.b;
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) ((TLObject) this.c);
                WallpapersListActivity wallpapersListActivity = cwcVar2.F;
                uc7.s1(WallpapersListActivity.p0(wallpapersListActivity)).j4(tL_contacts_resolvedPeer.users, false);
                uc7.s1(WallpapersListActivity.q0(wallpapersListActivity)).c4(tL_contacts_resolvedPeer.chats, false);
                wallpapersListActivity.getMessagesStorage().j1(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                String str3 = cwcVar2.y;
                cwcVar2.y = null;
                cwcVar2.F(str3, "", false);
                return;
            case 28:
                int[] iArr2 = (int[]) this.b;
                ConnectionsManager connectionsManager = (ConnectionsManager) this.c;
                int i2 = iArr2[0];
                if (i2 != 0) {
                    connectionsManager.cancelRequest(i2, true);
                    iArr2[0] = 0;
                    return;
                }
                return;
            default:
                ((xt) this.b).g0.a((Integer) this.c);
                return;
        }
    }
}
