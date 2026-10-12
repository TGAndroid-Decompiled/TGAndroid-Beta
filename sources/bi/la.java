package bi;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.util.Log;
import android.view.ViewGroup;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ms0;
import org.telegram.ui.Components.sc;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Stories.recorder.FfmpegAudioWaveformLoader;
public final class la implements Runnable {
    public final int f3285a;
    public final Object f3286b;

    public la(com.google.firebase.messaging.k kVar, Intent intent) {
        this.f3285a = 11;
        this.f3286b = intent;
    }

    @Override
    public final void run() {
        String str;
        switch (this.f3285a) {
            case 0:
                ((na) this.f3286b).requestLayout();
                return;
            case 1:
                wa waVar = (wa) this.f3286b;
                di.d4 d4Var = waVar.f3928c;
                if (d4Var != null) {
                    d4Var.e(true);
                    waVar.f3928c = null;
                }
                waVar.b(false);
                return;
            case 2:
                ua uaVar = (ua) this.f3286b;
                if (uaVar.v) {
                    uaVar.E = true;
                    uaVar.F = System.currentTimeMillis();
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    uaVar.e = new LinearGradient(0.0f, 0.0f, 40.0f, 0.0f, new int[]{16777215, 771751935, 771751935, 16777215}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, tileMode);
                    uaVar.f3801f = new LinearGradient(0.0f, 0.0f, 40.0f, 0.0f, new int[]{16777215, 553648127, 553648127, 16777215}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, tileMode);
                    uaVar.invalidate();
                    return;
                }
                return;
            case 3:
                sb sbVar = ((bb) this.f3286b).f2880b;
                try {
                    gb gbVar = sbVar.f3700s;
                    if (gbVar != null) {
                        if (sbVar.f3663b) {
                            AndroidUtilities.removeFromParent(gbVar);
                        } else {
                            sbVar.f3688n.removeView(gbVar);
                        }
                        sbVar.f3700s = null;
                        return;
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 4:
                ((gb) this.f3286b).I0.K(true);
                return;
            case 5:
                ((bc) this.f3286b).c();
                return;
            case 6:
                ((c1.e) this.f3286b).e().onError(new w0.h("Failed to launch the selector UI. Hint: ensure the `context` parameter is an Activity-based context.", 2));
                return;
            case 7:
                c2.b bVar = (c2.b) this.f3286b;
                ((Context) bVar.f4119b).unregisterReceiver((c2.a) bVar.f4120c);
                return;
            case 8:
                c2.a aVar = (c2.a) this.f3286b;
                if (aVar.f4117c.f4118a) {
                    aVar.f4115a.f10925a.C1(3, false);
                    return;
                }
                return;
            case 9:
                ((vi) this.f3286b).hide();
                return;
            case 10:
                ci.t tVar = (ci.t) this.f3286b;
                ms0 ms0Var = tVar.W;
                f8 f8Var = tVar.f4780a;
                if (f8Var == null) {
                    str = "";
                } else {
                    str = f8Var.E;
                }
                ms0Var.a(str);
                return;
            case 11:
                com.google.firebase.messaging.k.a((Intent) this.f3286b);
                return;
            case 12:
                com.google.android.gms.internal.cast.z5 z5Var = (com.google.android.gms.internal.cast.z5) this.f3286b;
                synchronized (((ArrayDeque) z5Var.d)) {
                    SharedPreferences.Editor edit = ((SharedPreferences) z5Var.f5426b).edit();
                    String str2 = (String) z5Var.f5425a;
                    StringBuilder sb2 = new StringBuilder();
                    Iterator it = ((ArrayDeque) z5Var.d).iterator();
                    while (it.hasNext()) {
                        sb2.append((String) it.next());
                        sb2.append((String) z5Var.f5427c);
                    }
                    edit.putString(str2, sb2.toString()).commit();
                }
                return;
            case 13:
                com.google.firebase.messaging.d0 d0Var = (com.google.firebase.messaging.d0) this.f3286b;
                Log.w("FirebaseMessaging", "Service took too long to process intent: " + d0Var.f6171a.getAction() + " finishing.");
                d0Var.f6172b.trySetResult(null);
                return;
            case 14:
                ((di.h) this.f3286b).f6981c.W = false;
                return;
            case 15:
                ((di.l) this.f3286b).invalidateSelf();
                return;
            case 16:
                ((di.d0) this.f3286b).f6769g = -1L;
                return;
            case 17:
                di.l0 l0Var = (di.l0) this.f3286b;
                rg.i iVar = l0Var.f7332b.H;
                if (iVar != null) {
                    iVar.b();
                }
                l0Var.f7332b.k();
                return;
            case 18:
                ((di.u0) this.f3286b).a(false);
                return;
            case 19:
                sc.e();
                sg.y0 y0Var = new sg.y0((org.telegram.ui.ActionBar.m2) new o3((di.x5) this.f3286b), 14, false);
                y0Var.setOnDismissListener(new di.e1(0));
                y0Var.show();
                return;
            case 20:
                ((di.v1) this.f3286b).G();
                return;
            case 21:
                di.c2 c2Var = (di.c2) this.f3286b;
                ArrayList arrayList = c2Var.v;
                ArrayList arrayList2 = c2Var.f6697s;
                di.d2 d2Var = c2Var.N;
                di.r2 r2Var = d2Var.f6785s;
                MediaDataController mediaDataController = MediaDataController.getInstance(di.r2.U(r2Var));
                String str3 = c2Var.H;
                if ("premium".equalsIgnoreCase(str3)) {
                    ArrayList<TLRPC.Document> recentStickers = mediaDataController.getRecentStickers(7);
                    c2Var.f6699x = 0;
                    arrayList2.clear();
                    arrayList.clear();
                    c2Var.f6700y.clear();
                    c2Var.f6695n.clear();
                    c2Var.f6699x++;
                    arrayList2.add(null);
                    arrayList.add(0L);
                    arrayList2.addAll(recentStickers);
                    c2Var.f6699x = recentStickers.size() + c2Var.f6699x;
                    c2Var.I = c2Var.H;
                    c2Var.l();
                    di.o1.x1(d2Var.f6780b, 0, 0);
                    d2Var.f6782f.c(false);
                    d2Var.e.n(false);
                    return;
                } else if (d2Var.f8175a == 1 && Emoji.fullyConsistsOfEmojis(c2Var.H)) {
                    TLRPC.TL_messages_getStickers tL_messages_getStickers = new TLRPC.TL_messages_getStickers();
                    tL_messages_getStickers.emoticon = c2Var.H;
                    tL_messages_getStickers.hash = 0L;
                    ConnectionsManager.getInstance(di.r2.W(r2Var)).sendRequest(tL_messages_getStickers, new m1(5, c2Var, str3));
                    return;
                } else {
                    String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
                    String[] strArr = c2Var.J;
                    if (strArr == null || !Arrays.equals(currentKeyboardLanguage, strArr)) {
                        MediaDataController.getInstance(di.r2.X(r2Var)).fetchNewEmojiKeywords(currentKeyboardLanguage);
                    }
                    c2Var.J = currentKeyboardLanguage;
                    mediaDataController.getEmojiSuggestions(currentKeyboardLanguage, c2Var.H, false, new androidx.car.app.utils.a(5, c2Var, mediaDataController, str3), null, false, false, false, true, 50, false);
                    return;
                }
            case 22:
                di.k2 k2Var = (di.k2) ((di.h2) this.f3286b).f6990b;
                if (!k2Var.h) {
                    k2Var.f7159n.setVisibility(8);
                    return;
                }
                return;
            case 23:
                di.o2 o2Var = (di.o2) ((di.n2) this.f3286b).f7450b;
                ArrayList arrayList3 = o2Var.f7506o;
                if (!arrayList3.isEmpty()) {
                    o2Var.f7503l.d(0.0f, true);
                    int i10 = o2Var.f7502k + 1;
                    o2Var.f7502k = i10;
                    if (i10 > arrayList3.size() - 1) {
                        o2Var.f7502k = 0;
                    }
                    ah.y0 y0Var2 = o2Var.f7501j;
                    y0Var2.e((ah.i1) arrayList3.get(o2Var.f7502k));
                    o2Var.f7501j = o2Var.f7500i;
                    o2Var.f7500i = y0Var2;
                    o2Var.f7507p.invalidate();
                    return;
                }
                return;
            case 24:
                FfmpegAudioWaveformLoader.b((FfmpegAudioWaveformLoader) this.f3286b);
                return;
            case 25:
                ((di.q3) this.f3286b).b(null);
                return;
            case 26:
                ((di.u3) this.f3286b).E();
                return;
            case 27:
                di.bb bbVar = (di.bb) this.f3286b;
                if (bbVar.I) {
                    bbVar.I = false;
                    bbVar.invalidate();
                    return;
                }
                return;
            case 28:
                di.i7 i7Var = ((di.h7) this.f3286b).f7005p;
                i7Var.Q = System.currentTimeMillis();
                i7Var.R = 0L;
                i7Var.f7067r0 = true;
                ((di.fb) i7Var.f7045a).f6954a.J0.a(0L, true);
                i7Var.invalidate();
                return;
            default:
                di.p pVar = (di.p) this.f3286b;
                if (pVar.getParent() instanceof ViewGroup) {
                    ((ViewGroup) pVar.getParent()).removeView(pVar);
                    return;
                }
                return;
        }
    }

    public la(Object obj, int i10) {
        this.f3285a = i10;
        this.f3286b = obj;
    }
}
