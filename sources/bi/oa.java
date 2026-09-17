package bi;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.util.Log;
import android.view.ViewGroup;
import di.oc;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.lr0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Stories.recorder.FfmpegAudioWaveformLoader;
public final class oa implements Runnable {
    public final int f3489a;
    public final Object f3490b;

    public oa(com.google.firebase.messaging.k kVar, Intent intent) {
        this.f3489a = 8;
        this.f3490b = intent;
    }

    @Override
    public final void run() {
        String str;
        switch (this.f3489a) {
            case 0:
                ta taVar = (ta) this.f3490b;
                di.f4 f4Var = taVar.f3755c;
                if (f4Var != null) {
                    f4Var.e(true);
                    taVar.f3755c = null;
                }
                taVar.b(false);
                return;
            case 1:
                ra raVar = (ra) this.f3490b;
                if (raVar.v) {
                    raVar.E = true;
                    raVar.F = System.currentTimeMillis();
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    raVar.f3668e = new LinearGradient(0.0f, 0.0f, 40.0f, 0.0f, new int[]{16777215, 771751935, 771751935, 16777215}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, tileMode);
                    raVar.f3669f = new LinearGradient(0.0f, 0.0f, 40.0f, 0.0f, new int[]{16777215, 553648127, 553648127, 16777215}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, tileMode);
                    raVar.invalidate();
                    return;
                }
                return;
            case 2:
                pb pbVar = ((ya) this.f3490b).f4025b;
                try {
                    db dbVar = pbVar.f3572s;
                    if (dbVar != null) {
                        if (pbVar.f3534b) {
                            AndroidUtilities.removeFromParent(dbVar);
                        } else {
                            pbVar.f3560n.removeView(dbVar);
                        }
                        pbVar.f3572s = null;
                        return;
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 3:
                ((db) this.f3490b).I0.K(true);
                return;
            case 4:
                ((yb) this.f3490b).c();
                return;
            case 5:
                ((c1.e) this.f3490b).e().onError(new w0.h("Failed to launch the selector UI. Hint: ensure the `context` parameter is an Activity-based context.", 2));
                return;
            case 6:
                ((vi) this.f3490b).hide();
                return;
            case 7:
                ci.t tVar = (ci.t) this.f3490b;
                lr0 lr0Var = tVar.W;
                b8 b8Var = tVar.f4831a;
                if (b8Var == null) {
                    str = "";
                } else {
                    str = b8Var.E;
                }
                lr0Var.a(str);
                return;
            case 8:
                com.google.firebase.messaging.k.a((Intent) this.f3490b);
                return;
            case 9:
                cf.c cVar = (cf.c) this.f3490b;
                synchronized (((ArrayDeque) cVar.d)) {
                    SharedPreferences.Editor edit = ((SharedPreferences) cVar.f4796a).edit();
                    String str2 = (String) cVar.f4797b;
                    StringBuilder sb2 = new StringBuilder();
                    Iterator it = ((ArrayDeque) cVar.d).iterator();
                    while (it.hasNext()) {
                        sb2.append((String) it.next());
                        sb2.append((String) cVar.f4798c);
                    }
                    edit.putString(str2, sb2.toString()).commit();
                }
                return;
            case 10:
                com.google.firebase.messaging.d0 d0Var = (com.google.firebase.messaging.d0) this.f3490b;
                Log.w("FirebaseMessaging", "Service took too long to process intent: " + d0Var.f6349a.getAction() + " finishing.");
                d0Var.f6350b.trySetResult(null);
                return;
            case 11:
                ((di.h) this.f3490b).f7310c.W = false;
                return;
            case 12:
                ((di.l) this.f3490b).invalidateSelf();
                return;
            case 13:
                ((di.d0) this.f3490b).f7030g = -1L;
                return;
            case 14:
                di.m0 m0Var = (di.m0) this.f3490b;
                rg.j jVar = m0Var.f7621b.H;
                if (jVar != null) {
                    jVar.b();
                }
                m0Var.f7621b.k();
                return;
            case 15:
                ((di.v0) this.f3490b).a(false);
                return;
            case 16:
                qc.e();
                sg.a1 a1Var = new sg.a1((org.telegram.ui.ActionBar.n2) new l3((di.z5) this.f3490b), 14, false);
                a1Var.setOnDismissListener(new di.f1(0));
                a1Var.show();
                return;
            case 17:
                ((di.w1) this.f3490b).G();
                return;
            case 18:
                di.d2 d2Var = (di.d2) this.f3490b;
                ArrayList arrayList = d2Var.v;
                ArrayList arrayList2 = d2Var.f7056s;
                di.e2 e2Var = d2Var.N;
                di.t2 t2Var = e2Var.f7160s;
                MediaDataController mediaDataController = MediaDataController.getInstance(di.t2.T(t2Var));
                String str3 = d2Var.H;
                if ("premium".equalsIgnoreCase(str3)) {
                    ArrayList<TLRPC.Document> recentStickers = mediaDataController.getRecentStickers(7);
                    d2Var.f7058x = 0;
                    arrayList2.clear();
                    arrayList.clear();
                    d2Var.f7059y.clear();
                    d2Var.f7054n.clear();
                    d2Var.f7058x++;
                    arrayList2.add(null);
                    arrayList.add(0L);
                    arrayList2.addAll(recentStickers);
                    d2Var.f7058x = recentStickers.size() + d2Var.f7058x;
                    d2Var.I = d2Var.H;
                    d2Var.l();
                    di.p1.v1(e2Var.f7154b, 0, 0);
                    e2Var.f7157f.c(false);
                    e2Var.f7156e.n(false);
                    return;
                } else if (e2Var.f6898a == 1 && Emoji.fullyConsistsOfEmojis(d2Var.H)) {
                    TLRPC.TL_messages_getStickers tL_messages_getStickers = new TLRPC.TL_messages_getStickers();
                    tL_messages_getStickers.emoticon = d2Var.H;
                    tL_messages_getStickers.hash = 0L;
                    ConnectionsManager.getInstance(di.t2.V(t2Var)).sendRequest(tL_messages_getStickers, new m1(5, d2Var, str3));
                    return;
                } else {
                    String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
                    String[] strArr = d2Var.J;
                    if (strArr == null || !Arrays.equals(currentKeyboardLanguage, strArr)) {
                        MediaDataController.getInstance(di.t2.W(t2Var)).fetchNewEmojiKeywords(currentKeyboardLanguage);
                    }
                    d2Var.J = currentKeyboardLanguage;
                    mediaDataController.getEmojiSuggestions(currentKeyboardLanguage, d2Var.H, false, new androidx.car.app.utils.a((Object) d2Var, str3, (Object) mediaDataController, 5), null, false, false, false, true, 50, false);
                    return;
                }
            case 19:
                di.l2 l2Var = (di.l2) ((di.i2) this.f3490b).f7365b;
                if (!l2Var.h) {
                    l2Var.f7515n.setVisibility(8);
                    return;
                }
                return;
            case 20:
                di.q2 q2Var = (di.q2) ((di.p2) this.f3490b).f7822b;
                ArrayList arrayList3 = q2Var.f7946o;
                if (!arrayList3.isEmpty()) {
                    q2Var.f7943l.d(0.0f, true);
                    int i10 = q2Var.f7942k + 1;
                    q2Var.f7942k = i10;
                    if (i10 > arrayList3.size() - 1) {
                        q2Var.f7942k = 0;
                    }
                    ah.z0 z0Var = q2Var.f7941j;
                    z0Var.e((ah.j1) arrayList3.get(q2Var.f7942k));
                    q2Var.f7941j = q2Var.f7940i;
                    q2Var.f7940i = z0Var;
                    q2Var.f7947p.invalidate();
                    return;
                }
                return;
            case 21:
                FfmpegAudioWaveformLoader.b((FfmpegAudioWaveformLoader) this.f3490b);
                return;
            case 22:
                ((di.s3) this.f3490b).b(null);
                return;
            case 23:
                ((di.w3) this.f3490b).E();
                return;
            case 24:
                di.fb fbVar = (di.fb) this.f3490b;
                if (fbVar.I) {
                    fbVar.I = false;
                    fbVar.invalidate();
                    return;
                }
                return;
            case 25:
                di.l7 l7Var = ((di.k7) this.f3490b).f7475p;
                l7Var.Q = System.currentTimeMillis();
                l7Var.R = 0L;
                l7Var.f7557r0 = true;
                ((di.jb) l7Var.f7534a).f7443a.J0.a(0L, true);
                l7Var.invalidate();
                return;
            case 26:
                di.p pVar = (di.p) this.f3490b;
                if (pVar.getParent() instanceof ViewGroup) {
                    ((ViewGroup) pVar.getParent()).removeView(pVar);
                    return;
                }
                return;
            case 27:
                di.d dVar = (di.d) this.f3490b;
                if (dVar != null) {
                    dVar.setLoading(false);
                    return;
                }
                return;
            case 28:
                ((di.fa) ((di.ea) this.f3490b).f7179n).fullScroll(130);
                return;
            default:
                oc ocVar = (oc) this.f3490b;
                ocVar.f7805x0.onTouchEvent(AndroidUtilities.emptyMotionEvent());
                ocVar.f7804w0.h(AndroidUtilities.emptyMotionEvent());
                return;
        }
    }

    public oa(Object obj, int i10) {
        this.f3489a = i10;
        this.f3490b = obj;
    }
}
