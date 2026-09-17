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
    public final int f3516a;
    public final Object f3517b;

    public oa(com.google.firebase.messaging.k kVar, Intent intent) {
        this.f3516a = 8;
        this.f3517b = intent;
    }

    @Override
    public final void run() {
        String str;
        switch (this.f3516a) {
            case 0:
                ta taVar = (ta) this.f3517b;
                di.f4 f4Var = taVar.f3782c;
                if (f4Var != null) {
                    f4Var.e(true);
                    taVar.f3782c = null;
                }
                taVar.b(false);
                return;
            case 1:
                ra raVar = (ra) this.f3517b;
                if (raVar.v) {
                    raVar.E = true;
                    raVar.F = System.currentTimeMillis();
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    raVar.f3695e = new LinearGradient(0.0f, 0.0f, 40.0f, 0.0f, new int[]{16777215, 771751935, 771751935, 16777215}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, tileMode);
                    raVar.f3696f = new LinearGradient(0.0f, 0.0f, 40.0f, 0.0f, new int[]{16777215, 553648127, 553648127, 16777215}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, tileMode);
                    raVar.invalidate();
                    return;
                }
                return;
            case 2:
                pb pbVar = ((ya) this.f3517b).f4052b;
                try {
                    db dbVar = pbVar.f3599s;
                    if (dbVar != null) {
                        if (pbVar.f3561b) {
                            AndroidUtilities.removeFromParent(dbVar);
                        } else {
                            pbVar.f3587n.removeView(dbVar);
                        }
                        pbVar.f3599s = null;
                        return;
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 3:
                ((db) this.f3517b).I0.K(true);
                return;
            case 4:
                ((yb) this.f3517b).c();
                return;
            case 5:
                ((c1.e) this.f3517b).e().onError(new w0.h("Failed to launch the selector UI. Hint: ensure the `context` parameter is an Activity-based context.", 2));
                return;
            case 6:
                ((vi) this.f3517b).hide();
                return;
            case 7:
                ci.t tVar = (ci.t) this.f3517b;
                lr0 lr0Var = tVar.W;
                b8 b8Var = tVar.f4858a;
                if (b8Var == null) {
                    str = "";
                } else {
                    str = b8Var.E;
                }
                lr0Var.a(str);
                return;
            case 8:
                com.google.firebase.messaging.k.a((Intent) this.f3517b);
                return;
            case 9:
                cf.c cVar = (cf.c) this.f3517b;
                synchronized (((ArrayDeque) cVar.d)) {
                    SharedPreferences.Editor edit = ((SharedPreferences) cVar.f4823a).edit();
                    String str2 = (String) cVar.f4824b;
                    StringBuilder sb2 = new StringBuilder();
                    Iterator it = ((ArrayDeque) cVar.d).iterator();
                    while (it.hasNext()) {
                        sb2.append((String) it.next());
                        sb2.append((String) cVar.f4825c);
                    }
                    edit.putString(str2, sb2.toString()).commit();
                }
                return;
            case 10:
                com.google.firebase.messaging.d0 d0Var = (com.google.firebase.messaging.d0) this.f3517b;
                Log.w("FirebaseMessaging", "Service took too long to process intent: " + d0Var.f6376a.getAction() + " finishing.");
                d0Var.f6377b.trySetResult(null);
                return;
            case 11:
                ((di.h) this.f3517b).f7338c.W = false;
                return;
            case 12:
                ((di.l) this.f3517b).invalidateSelf();
                return;
            case 13:
                ((di.d0) this.f3517b).f7058g = -1L;
                return;
            case 14:
                di.m0 m0Var = (di.m0) this.f3517b;
                rg.j jVar = m0Var.f7649b.H;
                if (jVar != null) {
                    jVar.b();
                }
                m0Var.f7649b.k();
                return;
            case 15:
                ((di.v0) this.f3517b).a(false);
                return;
            case 16:
                qc.e();
                sg.a1 a1Var = new sg.a1((org.telegram.ui.ActionBar.n2) new l3((di.z5) this.f3517b), 14, false);
                a1Var.setOnDismissListener(new di.f1(0));
                a1Var.show();
                return;
            case 17:
                ((di.w1) this.f3517b).G();
                return;
            case 18:
                di.d2 d2Var = (di.d2) this.f3517b;
                ArrayList arrayList = d2Var.v;
                ArrayList arrayList2 = d2Var.f7084s;
                di.e2 e2Var = d2Var.N;
                di.t2 t2Var = e2Var.f7188s;
                MediaDataController mediaDataController = MediaDataController.getInstance(di.t2.T(t2Var));
                String str3 = d2Var.H;
                if ("premium".equalsIgnoreCase(str3)) {
                    ArrayList<TLRPC.Document> recentStickers = mediaDataController.getRecentStickers(7);
                    d2Var.f7086x = 0;
                    arrayList2.clear();
                    arrayList.clear();
                    d2Var.f7087y.clear();
                    d2Var.f7082n.clear();
                    d2Var.f7086x++;
                    arrayList2.add(null);
                    arrayList.add(0L);
                    arrayList2.addAll(recentStickers);
                    d2Var.f7086x = recentStickers.size() + d2Var.f7086x;
                    d2Var.I = d2Var.H;
                    d2Var.l();
                    di.p1.v1(e2Var.f7182b, 0, 0);
                    e2Var.f7185f.c(false);
                    e2Var.f7184e.n(false);
                    return;
                } else if (e2Var.f6926a == 1 && Emoji.fullyConsistsOfEmojis(d2Var.H)) {
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
                di.l2 l2Var = (di.l2) ((di.i2) this.f3517b).f7393b;
                if (!l2Var.h) {
                    l2Var.f7543n.setVisibility(8);
                    return;
                }
                return;
            case 20:
                di.q2 q2Var = (di.q2) ((di.p2) this.f3517b).f7850b;
                ArrayList arrayList3 = q2Var.f7974o;
                if (!arrayList3.isEmpty()) {
                    q2Var.f7971l.d(0.0f, true);
                    int i10 = q2Var.f7970k + 1;
                    q2Var.f7970k = i10;
                    if (i10 > arrayList3.size() - 1) {
                        q2Var.f7970k = 0;
                    }
                    ah.z0 z0Var = q2Var.f7969j;
                    z0Var.e((ah.j1) arrayList3.get(q2Var.f7970k));
                    q2Var.f7969j = q2Var.f7968i;
                    q2Var.f7968i = z0Var;
                    q2Var.f7975p.invalidate();
                    return;
                }
                return;
            case 21:
                FfmpegAudioWaveformLoader.b((FfmpegAudioWaveformLoader) this.f3517b);
                return;
            case 22:
                ((di.s3) this.f3517b).b(null);
                return;
            case 23:
                ((di.w3) this.f3517b).E();
                return;
            case 24:
                di.fb fbVar = (di.fb) this.f3517b;
                if (fbVar.I) {
                    fbVar.I = false;
                    fbVar.invalidate();
                    return;
                }
                return;
            case 25:
                di.l7 l7Var = ((di.k7) this.f3517b).f7503p;
                l7Var.Q = System.currentTimeMillis();
                l7Var.R = 0L;
                l7Var.f7585r0 = true;
                ((di.jb) l7Var.f7562a).f7471a.J0.a(0L, true);
                l7Var.invalidate();
                return;
            case 26:
                di.p pVar = (di.p) this.f3517b;
                if (pVar.getParent() instanceof ViewGroup) {
                    ((ViewGroup) pVar.getParent()).removeView(pVar);
                    return;
                }
                return;
            case 27:
                di.d dVar = (di.d) this.f3517b;
                if (dVar != null) {
                    dVar.setLoading(false);
                    return;
                }
                return;
            case 28:
                ((di.fa) ((di.ea) this.f3517b).f7207n).fullScroll(130);
                return;
            default:
                oc ocVar = (oc) this.f3517b;
                ocVar.f7833x0.onTouchEvent(AndroidUtilities.emptyMotionEvent());
                ocVar.f7832w0.h(AndroidUtilities.emptyMotionEvent());
                return;
        }
    }

    public oa(Object obj, int i10) {
        this.f3516a = i10;
        this.f3517b = obj;
    }
}
