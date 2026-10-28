package di;

import a8.wb;
import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.ViewGroup;
import fi.ia;
import fi.ma;
import fi.qa;
import fi.rb;
import fi.sb;
import fi.ta;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.vs0;
import org.telegram.ui.Stories.recorder.FfmpegAudioWaveformLoader;
public final class s8 implements Runnable {
    public final int f9174a;
    public final Object f9175b;

    public s8(Object obj, int i10) {
        this.f9174a = i10;
        this.f9175b = obj;
    }

    @Override
    public final void run() {
        int i10;
        String d;
        TelephonyManager telephonyManager;
        String str;
        switch (this.f9174a) {
            case 0:
                ((t8) this.f9175b).requestLayout();
                return;
            case 1:
                c9 c9Var = (c9) this.f9175b;
                fi.v3 v3Var = c9Var.f8464c;
                if (v3Var != null) {
                    v3Var.e(true);
                    c9Var.f8464c = null;
                }
                c9Var.b(false);
                return;
            case 2:
                a9 a9Var = (a9) this.f9175b;
                if (a9Var.v) {
                    a9Var.E = true;
                    a9Var.F = System.currentTimeMillis();
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    a9Var.e = new LinearGradient(0.0f, 0.0f, 40.0f, 0.0f, new int[]{16777215, 771751935, 771751935, 16777215}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, tileMode);
                    a9Var.f8398f = new LinearGradient(0.0f, 0.0f, 40.0f, 0.0f, new int[]{16777215, 553648127, 553648127, 16777215}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, tileMode);
                    a9Var.invalidate();
                    return;
                }
                return;
            case 3:
                y9 y9Var = ((h9) this.f9175b).f8655b;
                try {
                    m9 m9Var = y9Var.f9455s;
                    if (m9Var != null) {
                        if (y9Var.f9418b) {
                            AndroidUtilities.removeFromParent(m9Var);
                        } else {
                            y9Var.f9443n.removeView(m9Var);
                        }
                        y9Var.f9455s = null;
                        y9Var.r();
                        return;
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 4:
                ((m9) this.f9175b).f8806x0.L(true);
                return;
            case 5:
                ((ha) this.f9175b).c();
                return;
            case 6:
                e2.v vVar = (e2.v) this.f9175b;
                y2.e eVar = (y2.e) vVar.f9722a.get();
                if (eVar != null) {
                    int b10 = vVar.f9724c.b();
                    y2.f fVar = eVar.f51995a;
                    synchronized (fVar) {
                        synchronized (fVar) {
                            int i11 = fVar.f52012n;
                            if (i11 == 0 || fVar.e) {
                                if (i11 != b10 || fVar.f52013o == null) {
                                    fVar.f52012n = b10;
                                    if (b10 != 1 && b10 != 0 && b10 != 8) {
                                        if (fVar.f52013o == null) {
                                            Context context = fVar.f52002a;
                                            String str2 = e2.n0.f9691a;
                                            if (context != null && (telephonyManager = (TelephonyManager) context.getSystemService("phone")) != null) {
                                                String networkCountryIso = telephonyManager.getNetworkCountryIso();
                                                if (!TextUtils.isEmpty(networkCountryIso)) {
                                                    d = wb.d(networkCountryIso);
                                                    fVar.f52013o = d;
                                                }
                                            }
                                            d = wb.d(Locale.getDefault().getCountry());
                                            fVar.f52013o = d;
                                        }
                                        fVar.f52010l = fVar.b(b10);
                                        fVar.d.getClass();
                                        long elapsedRealtime = SystemClock.elapsedRealtime();
                                        if (fVar.f52006g > 0) {
                                            i10 = (int) (elapsedRealtime - fVar.h);
                                        } else {
                                            i10 = 0;
                                        }
                                        fVar.d(i10, fVar.f52007i, fVar.f52010l);
                                        fVar.h = elapsedRealtime;
                                        fVar.f52007i = 0L;
                                        fVar.f52009k = 0L;
                                        fVar.f52008j = 0L;
                                        y2.r rVar = fVar.f52005f;
                                        rVar.f52034a.clear();
                                        rVar.f52036c = -1;
                                        rVar.d = 0;
                                        rVar.e = 0;
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                    }
                }
                return;
            case 7:
                ((ti) this.f9175b).hide();
                return;
            case 8:
                ei.r rVar2 = (ei.r) this.f9175b;
                vs0 vs0Var = rVar2.W;
                s6 s6Var = rVar2.f10000a;
                if (s6Var == null) {
                    str = "";
                } else {
                    str = s6Var.E;
                }
                vs0Var.a(str);
                return;
            case 9:
                ((fi.h) this.f9175b).f10937c.W = false;
                return;
            case 10:
                ((fi.l) this.f9175b).invalidateSelf();
                return;
            case 11:
                ((fi.d0) this.f9175b).f10705g = -1L;
                return;
            case 12:
                fi.m0 m0Var = (fi.m0) this.f9175b;
                sg.i iVar = m0Var.f11226b.H;
                if (iVar != null) {
                    iVar.b();
                }
                m0Var.f11226b.k();
                return;
            case 13:
                ((fi.v0) this.f9175b).a(false);
                return;
            case 14:
                qc.e();
                tg.y0 y0Var = new tg.y0((org.telegram.ui.ActionBar.r2) new bi.v4((fi.n5) this.f9175b), 14, false);
                y0Var.setOnDismissListener(new fi.e1(0));
                y0Var.show();
                return;
            case 15:
                ((fi.s1) this.f9175b).G();
                return;
            case 16:
                fi.y1 y1Var = (fi.y1) this.f9175b;
                ArrayList arrayList = y1Var.v;
                ArrayList arrayList2 = y1Var.f11987s;
                fi.z1 z1Var = y1Var.N;
                fi.l2 l2Var = z1Var.f12054s;
                MediaDataController mediaDataController = MediaDataController.getInstance(fi.l2.V(l2Var));
                String str3 = y1Var.H;
                if ("premium".equalsIgnoreCase(str3)) {
                    ArrayList<TLRPC.Document> recentStickers = mediaDataController.getRecentStickers(7);
                    y1Var.f11989x = 0;
                    arrayList2.clear();
                    arrayList.clear();
                    y1Var.f11990y.clear();
                    y1Var.f11985n.clear();
                    y1Var.f11989x++;
                    arrayList2.add(null);
                    arrayList.add(0L);
                    arrayList2.addAll(recentStickers);
                    y1Var.f11989x = recentStickers.size() + y1Var.f11989x;
                    y1Var.I = y1Var.H;
                    y1Var.l();
                    fi.n1.C1(z1Var.f12049b, 0, 0);
                    z1Var.f12051f.c(false);
                    z1Var.e.n(false);
                    return;
                } else if (z1Var.f11779a == 1 && Emoji.fullyConsistsOfEmojis(y1Var.H)) {
                    TLRPC.TL_messages_getStickers tL_messages_getStickers = new TLRPC.TL_messages_getStickers();
                    tL_messages_getStickers.emoticon = y1Var.H;
                    tL_messages_getStickers.hash = 0L;
                    ConnectionsManager.getInstance(fi.l2.X(l2Var)).sendRequest(tL_messages_getStickers, new bi.j(13, y1Var, str3));
                    return;
                } else {
                    String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
                    String[] strArr = y1Var.J;
                    if (strArr == null || !Arrays.equals(currentKeyboardLanguage, strArr)) {
                        MediaDataController.getInstance(fi.l2.Y(l2Var)).fetchNewEmojiKeywords(currentKeyboardLanguage);
                    }
                    y1Var.J = currentKeyboardLanguage;
                    mediaDataController.getEmojiSuggestions(currentKeyboardLanguage, y1Var.H, false, new androidx.car.app.utils.a((Object) y1Var, str3, (Object) mediaDataController, 6), null, false, false, false, true, 50, false);
                    return;
                }
            case 17:
                fi.f2 f2Var = (fi.f2) ((bi.u) this.f9175b).f5502b;
                if (!f2Var.f10854n) {
                    f2Var.f10855r.setVisibility(8);
                    return;
                }
                return;
            case 18:
                fi.i2 i2Var = (fi.i2) ((f6.r) this.f9175b).f10237b;
                ArrayList arrayList3 = i2Var.f10990o;
                if (!arrayList3.isEmpty()) {
                    i2Var.f10987l.d(0.0f, true);
                    int i12 = i2Var.f10986k + 1;
                    i2Var.f10986k = i12;
                    if (i12 > arrayList3.size() - 1) {
                        i2Var.f10986k = 0;
                    }
                    bh.n0 n0Var = i2Var.f10985j;
                    n0Var.e((bh.x0) arrayList3.get(i2Var.f10986k));
                    i2Var.f10985j = i2Var.f10984i;
                    i2Var.f10984i = n0Var;
                    i2Var.f10991p.invalidate();
                    return;
                }
                return;
            case 19:
                FfmpegAudioWaveformLoader.b((FfmpegAudioWaveformLoader) this.f9175b);
                return;
            case 20:
                ((fi.k3) this.f9175b).b(null);
                return;
            case 21:
                ((fi.n3) this.f9175b).E();
                return;
            case 22:
                ia iaVar = (ia) this.f9175b;
                if (iaVar.I) {
                    iaVar.I = false;
                    iaVar.invalidate();
                    return;
                }
                return;
            case 23:
                fi.w6 w6Var = ((fi.v6) this.f9175b).f11821p;
                w6Var.Q = System.currentTimeMillis();
                w6Var.R = 0L;
                w6Var.f11874r0 = true;
                ((ma) w6Var.f11852a).f11269a.J0.a(0L, true);
                w6Var.invalidate();
                return;
            case 24:
                fi.p pVar = (fi.p) this.f9175b;
                if (pVar.getParent() instanceof ViewGroup) {
                    ((ViewGroup) pVar.getParent()).removeView(pVar);
                    return;
                }
                return;
            case 25:
                fi.d dVar = (fi.d) this.f9175b;
                if (dVar != null) {
                    dVar.setLoading(false);
                    return;
                }
                return;
            case 26:
                ((fi.k9) ((fi.j9) this.f9175b).f11068n).fullScroll(130);
                return;
            case 27:
                rb rbVar = (rb) this.f9175b;
                rbVar.m0.onTouchEvent(AndroidUtilities.emptyMotionEvent());
                rbVar.f11560l0.g0(AndroidUtilities.emptyMotionEvent());
                return;
            case 28:
                sb sbVar = ((qa) this.f9175b).f11503k0;
                sbVar.u(true);
                sbVar.A0.setCameraThumb(sbVar.z());
                return;
            default:
                ((ta) this.f9175b).f11724p2.f11652p1.setVisibility(8);
                return;
        }
    }
}
