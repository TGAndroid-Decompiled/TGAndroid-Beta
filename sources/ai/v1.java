package ai;

import a8.la;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import bi.l4;
import java.io.ByteArrayOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.az;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.k10;
import org.telegram.messenger.kc;
import org.telegram.messenger.ls;
import org.telegram.messenger.mr;
import org.telegram.messenger.np;
import org.telegram.messenger.v3;
import org.telegram.messenger.yy;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.a5;
import org.telegram.ui.Components.f8;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.nj0;
import org.telegram.ui.Components.pb0;
import org.telegram.ui.Components.qo;
import org.telegram.ui.Components.rj0;
import org.telegram.ui.Components.sj0;
import org.telegram.ui.Components.vi0;
import org.telegram.ui.Components.w7;
import org.telegram.ui.Components.wi0;
import org.telegram.ui.Components.x7;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.Dictation.DictationLid;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.bn;
import org.telegram.ui.ce0;
import org.telegram.ui.de0;
import org.telegram.ui.hk0;
import org.telegram.ui.na0;
import org.telegram.ui.pg0;
import org.telegram.ui.qj0;
import org.telegram.ui.sg0;
import org.telegram.ui.ti;
import org.telegram.ui.vg0;
import org.telegram.ui.z90;
public final class v1 implements e1, h2.o, mr, pb0, kc, a5, sj0, rj0, org.telegram.ui.ActionBar.q1, na0, nj0, h2.j {
    public final int f1573a;
    public final int f1574b;
    public final Object f1575c;

    public v1(int i7, Object obj, int i10) {
        this.f1573a = i10;
        this.f1574b = i7;
        this.f1575c = obj;
    }

    @Override
    public void O(int i7, int i10, boolean z10) {
        switch (this.f1573a) {
            case 9:
                org.telegram.messenger.g0.h3(new jg.q(i7, this.f1574b, (qo) this.f1575c, 12), 16L);
                return;
            default:
                org.telegram.messenger.g0.h3(new jg.q(i7, this.f1574b, (l4) this.f1575c, 13), 16L);
                return;
        }
    }

    @Override
    public void a(final float[] fArr, final long j3, final int i7) {
        boolean z10;
        android.support.v4.media.session.a0 a0Var;
        Object obj;
        long j10;
        float f10;
        boolean z11;
        int i10;
        String str;
        switch (this.f1573a) {
            case 0:
                f2 f2Var = (f2) this.f1575c;
                int i11 = this.f1574b;
                if (!f2Var.f1193j && i11 == f2Var.C) {
                    float min = Math.min(0.6f, DictationLid.i(i7));
                    f1 n10 = DictationLid.n(min, fArr);
                    if (n10 == null || ((!n10.f1174c && (!"other".equals(n10.f1172a) || n10.f1173b < min)) || (!"other".equals(n10.f1172a) && DictationAsr.V(n10.f1172a, f2Var.f1207y, false) != null))) {
                        z10 = false;
                    } else {
                        Log.d("Dictation", "tinyasr stop: tinylid " + i7 + " ms speech in " + j3 + " ms: " + n10 + " → Google?");
                        f2Var.L = true;
                        if (f2Var.i(n10.f1172a)) {
                            z zVar = f2Var.f1204u;
                            if (zVar != null) {
                                j10 = zVar.c() / 32;
                            } else {
                                j10 = 0;
                            }
                            f2Var.f1186f.postDelayed(new r1(f2Var, 5), j10 + 10000);
                            return;
                        }
                        z10 = false;
                        f2Var.L = false;
                    }
                    if (n10 != null && n10.f1174c) {
                        a0Var = DictationAsr.V(n10.f1172a, f2Var.f1207y, z10);
                        if (a0Var != null) {
                            DictationLid.l(n10.f1172a);
                            f2Var.s(n10.f1172a);
                        }
                    } else if (n10 != null) {
                        a0Var = DictationAsr.U(DictationLid.d, fArr, f2Var.f1207y, false);
                        if (a0Var != null) {
                            f2Var.s(a0Var.i());
                        }
                    } else {
                        a0Var = null;
                    }
                    StringBuilder sb2 = new StringBuilder("tinyasr stop: tinylid ");
                    sb2.append(i7);
                    sb2.append(" ms speech in ");
                    sb2.append(j3);
                    sb2.append(" ms: ");
                    sb2.append(n10);
                    sb2.append(" → ");
                    if (a0Var != null) {
                        obj = a0Var;
                    } else {
                        obj = "-";
                    }
                    sb2.append(obj);
                    Log.d("Dictation", sb2.toString());
                    if (a0Var != null) {
                        t tVar = (t) a0Var.f1724b;
                        android.support.v4.media.session.a0 a0Var2 = f2Var.f1207y;
                        if (tVar != ((t) a0Var2.f1724b) || !((String) a0Var.f1725c).equals((String) a0Var2.f1725c)) {
                            f2Var.p(a0Var);
                            return;
                        }
                    }
                    f2Var.h();
                    return;
                }
                return;
            case 1:
                int i12 = this.f1574b;
                f2 f2Var2 = ((a2) this.f1575c).f1118b;
                f2Var2.W = false;
                int i13 = f2Var2.Y;
                if (i12 == i13) {
                    f2Var2.f1180b0 = i7;
                }
                if (fArr != null) {
                    int i14 = f2Var2.f1194k;
                    if (!f2Var2.f1193j && !f2Var2.f1191i && i12 == i13 && f2Var2.f1203t != i14) {
                        String[] strArr = DictationLid.d;
                        int i15 = 0;
                        for (int i16 = 1; i16 < fArr.length; i16++) {
                            if (fArr[i16] > fArr[i15]) {
                                i15 = i16;
                            }
                        }
                        StringBuilder sb3 = new StringBuilder();
                        ArrayList arrayList = f2Var2.f1200q;
                        int size = arrayList.size();
                        float f11 = 0.0f;
                        int i17 = i15;
                        int i18 = 0;
                        float f12 = 0.0f;
                        float f13 = 0.0f;
                        String str2 = null;
                        while (i18 < size) {
                            Object obj2 = arrayList.get(i18);
                            int i19 = i18 + 1;
                            int i20 = size;
                            String str3 = (String) obj2;
                            ArrayList arrayList2 = arrayList;
                            float f14 = 0.0f;
                            for (int i21 = 0; i21 < strArr.length; i21++) {
                                if (w0.d(strArr[i21], str3)) {
                                    f14 += fArr[i21];
                                }
                            }
                            f12 += f14;
                            if (f14 > f13) {
                                str2 = str3;
                                f13 = f14;
                            }
                            sb3.append(' ');
                            sb3.append(str3);
                            sb3.append('=');
                            sb3.append(String.format(Locale.US, "%.2f", Float.valueOf(f14)));
                            i18 = i19;
                            size = i20;
                            str2 = str2;
                            arrayList = arrayList2;
                        }
                        if (f12 > 0.0f) {
                            f10 = f13 / f12;
                        } else {
                            f10 = 0.0f;
                        }
                        StringBuilder n11 = i5.c.n("session ", i14, " tinylid ", i7, " ms speech in ");
                        n11.append(j3);
                        n11.append(" ms: top ");
                        n11.append(strArr[i17]);
                        Locale locale = Locale.US;
                        n11.append(String.format(locale, " %.2f", Float.valueOf(fArr[i17])));
                        n11.append(" |");
                        n11.append((Object) sb3);
                        n11.append(" → ");
                        n11.append(str2);
                        n11.append(String.format(locale, " %.2f", Float.valueOf(f10)));
                        n11.append(" current=");
                        p5.c.t(n11, f2Var2.f1201r, "Dictation");
                        if (str2 != null && !"nospeech".equals(strArr[i17]) && !"other".equals(strArr[i17]) && f12 >= 0.3f) {
                            for (int i22 = 0; i22 < strArr.length; i22++) {
                                if (w0.d(strArr[i22], str2)) {
                                    f11 += fArr[i22];
                                }
                            }
                            if (!w0.d(str2, f2Var2.f1201r) && f10 >= 0.8f && f11 >= 0.6f) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (z11 && w0.d(str2, f2Var2.f1183d0)) {
                                i10 = f2Var2.f1178a0 + 1;
                            } else if (z11) {
                                i10 = 1;
                            } else {
                                i10 = 0;
                            }
                            f2Var2.f1178a0 = i10;
                            if (z11) {
                                str = str2;
                            } else {
                                str = null;
                            }
                            f2Var2.f1183d0 = str;
                            if (i10 >= 2) {
                                int i23 = f2Var2.f1180b0;
                                if (i23 < 5000) {
                                    f2Var2.f1202s++;
                                    if (f2Var2.J != null) {
                                        Log.d("Dictation", "live transcript: no switch to " + str2 + " (tinylid)");
                                        return;
                                    }
                                    f2Var2.w(str2, "tinylid");
                                    f2Var2.s(str2);
                                    int i24 = f2Var2.f1205w;
                                    f2Var2.f1206x = i24;
                                    f2Var2.X = i24;
                                    f2Var2.Y++;
                                    f2Var2.f1180b0 = 0;
                                    f2Var2.f1182c0 = false;
                                    f2Var2.f1178a0 = 0;
                                    f2Var2.f1183d0 = null;
                                    f2Var2.f1203t = i14;
                                    l2 l2Var = f2Var2.f1188g;
                                    if (l2Var.h(i14)) {
                                        StringBuilder m10 = i5.c.m(i14, "session ", " discarded: ");
                                        m10.append(l2.c(l2.i(l2Var.f1284b, l2Var.f1285c)));
                                        l2Var.j(m10.toString());
                                        l2Var.f1284b = "";
                                        l2Var.f1285c = "";
                                        l2Var.d = false;
                                        l2Var.f1287f = false;
                                    }
                                    f2Var2.e();
                                    f2Var2.f1186f.post(new p1(f2Var2, i14, 1));
                                    return;
                                } else if (!f2Var2.f1182c0) {
                                    f2Var2.f1182c0 = true;
                                    p5.c.t(i5.c.m(i23, "language locked: ", " ms of speech in "), f2Var2.f1201r, "Dictation");
                                    return;
                                } else {
                                    return;
                                }
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                final r2 r2Var = (r2) this.f1575c;
                final int i25 = this.f1574b;
                r2Var.f1457x.f1512b.add(new Runnable() {
                    @Override
                    public final void run() {
                        android.support.v4.media.session.a0 V;
                        String nativeSessionPush;
                        int i26;
                        r2 r2Var2 = r2.this;
                        int i27 = i25;
                        float[] fArr2 = fArr;
                        int i28 = i7;
                        long j11 = j3;
                        ByteArrayOutputStream byteArrayOutputStream = r2Var2.f1451q;
                        r2Var2.f1455u = false;
                        if (i27 == r2Var2.f1452r && r2Var2.d != null && fArr2 != null) {
                            int i29 = 0;
                            while (true) {
                                int[] iArr = DictationLid.f43082j;
                                if (i29 < iArr.length) {
                                    if (iArr[i29] > i28) {
                                        break;
                                    }
                                    i29++;
                                } else {
                                    i29 = -1;
                                    break;
                                }
                            }
                            r2Var2.f1453s = i29;
                            if (i29 < 0) {
                                r2Var2.f1450p.reset();
                                byteArrayOutputStream.reset();
                            }
                            f1 n12 = DictationLid.n(DictationLid.i(i28), fArr2);
                            android.support.v4.media.session.a0 a0Var3 = (android.support.v4.media.session.a0) r2Var2.d.d;
                            StringBuilder sb4 = new StringBuilder("live captions ");
                            int i30 = r2Var2.f1437a;
                            i5.c.z(sb4, i30, ": tinylid ", i28, " ms speech in ");
                            sb4.append(j11);
                            sb4.append(" ms: ");
                            sb4.append(n12);
                            sb4.append(" (");
                            sb4.append(a0Var3);
                            sb4.append(")");
                            Log.d("Dictation", sb4.toString());
                            if (n12 != null) {
                                String str4 = n12.f1172a;
                                if (n12.f1174c && (V = DictationAsr.V(str4, a0Var3, false)) != null) {
                                    t tVar2 = (t) V.f1724b;
                                    int max = Math.max(0, i28 - r2Var2.f1449o);
                                    r2Var2.f1449o = Math.max(r2Var2.f1449o, i28);
                                    if (tVar2 == ((t) a0Var3.f1724b) && ((String) V.f1725c).equals((String) a0Var3.f1725c)) {
                                        r2Var2.v = true;
                                        if (!str4.equals(r2Var2.f1445k)) {
                                            i26 = 0;
                                            r2Var2.f1446l = 0;
                                        } else {
                                            i26 = 0;
                                        }
                                        r2Var2.f1445k = str4;
                                        r2Var2.f1446l = Math.min(30000, r2Var2.f1446l + max);
                                        r2Var2.f1447m = null;
                                        r2Var2.f1448n = i26;
                                    } else if (!r2Var2.v || n12.f1173b >= 0.8f) {
                                        if (!str4.equals(r2Var2.f1447m)) {
                                            r2Var2.f1447m = str4;
                                            r2Var2.f1448n = 0;
                                        }
                                        int min2 = Math.min(30000, r2Var2.f1448n + max);
                                        r2Var2.f1448n = min2;
                                        if (min2 < r2Var2.f1446l / 4) {
                                            StringBuilder m11 = i5.c.m(i30, "live captions ", ": staying in ");
                                            m11.append(r2Var2.f1445k);
                                            m11.append(" (");
                                            m11.append(r2Var2.f1446l);
                                            m11.append(" ms), ");
                                            m11.append(r2Var2.f1447m);
                                            m11.append(" has ");
                                            m11.append(r2Var2.f1448n);
                                            m11.append(" ms");
                                            Log.d("Dictation", m11.toString());
                                        } else if (tVar2 != null && tVar2.f1520f != 0) {
                                            x c10 = x.c(V, r2Var2);
                                            if (c10 != null) {
                                                r2Var2.v = true;
                                                r2Var2.f1445k = str4;
                                                r2Var2.f1446l = r2Var2.f1448n;
                                                r2Var2.f1447m = null;
                                                r2Var2.f1448n = 0;
                                                StringBuilder m12 = i5.c.m(i30, "live captions ", ": replaying ");
                                                m12.append(byteArrayOutputStream.size() / 32);
                                                m12.append(" ms in ");
                                                m12.append(V);
                                                Log.d("Dictation", m12.toString());
                                                x xVar = r2Var2.d;
                                                long j12 = xVar.f1608c;
                                                if (j12 != 0) {
                                                    DictationAsr.nativeSessionFree(j12);
                                                    xVar.f1608c = 0L;
                                                    DictationAsr.Q((t) xVar.f1609e);
                                                }
                                                r2Var2.d = c10;
                                                r2Var2.h = 0;
                                                r2Var2.f1442g = 0;
                                                int i31 = r2Var2.f1456w;
                                                byte[] byteArray = byteArrayOutputStream.toByteArray();
                                                x xVar2 = r2Var2.d;
                                                int length = byteArray.length;
                                                long j13 = xVar2.f1608c;
                                                if (j13 != 0) {
                                                    nativeSessionPush = DictationAsr.nativeSessionPush(j13, byteArray, 0, length);
                                                    xVar2.b(nativeSessionPush);
                                                }
                                                if (r2Var2.f1456w == i31 && !r2Var2.f1444j.isEmpty()) {
                                                    r2Var2.f1444j = "";
                                                    org.telegram.messenger.g0.g3(new o2((Object) r2Var2, r2Var2.f1441f, (Serializable) "", false, 0));
                                                }
                                            }
                                        } else {
                                            org.telegram.messenger.g0.g3(new a3.f(V, 8));
                                        }
                                    }
                                }
                            }
                        }
                    }
                });
                return;
        }
    }

    @Override
    public void accept(Object obj) {
        p4.o oVar;
        p4.o oVar2;
        p4.v vVar = (p4.v) this.f1575c;
        int i7 = this.f1574b;
        try {
            try {
                oVar2 = (p4.o) ((m9.y) obj).get();
                la.k(oVar2, "LibraryResult must not be null");
            } catch (InterruptedException e10) {
                e = e10;
                h2.a.m("MediaSessionStub", "Library operation failed", e);
                String str = p4.o.d;
                p4.m1 m1Var = new p4.m1("no error message provided", -1, Bundle.EMPTY);
                oVar = new p4.o(m1Var.f55375a, SystemClock.elapsedRealtime(), m1Var);
                oVar2 = oVar;
                p4.u uVar = vVar.d;
                uVar.getClass();
                uVar.i(i7, oVar2);
            } catch (CancellationException e11) {
                h2.a.m("MediaSessionStub", "Library operation cancelled", e11);
                String str2 = p4.o.d;
                p4.m1 m1Var2 = new p4.m1("no error message provided", 1, Bundle.EMPTY);
                oVar = new p4.o(m1Var2.f55375a, SystemClock.elapsedRealtime(), m1Var2);
                oVar2 = oVar;
                p4.u uVar2 = vVar.d;
                uVar2.getClass();
                uVar2.i(i7, oVar2);
            } catch (ExecutionException e12) {
                e = e12;
                h2.a.m("MediaSessionStub", "Library operation failed", e);
                String str3 = p4.o.d;
                p4.m1 m1Var3 = new p4.m1("no error message provided", -1, Bundle.EMPTY);
                oVar = new p4.o(m1Var3.f55375a, SystemClock.elapsedRealtime(), m1Var3);
                oVar2 = oVar;
                p4.u uVar22 = vVar.d;
                uVar22.getClass();
                uVar22.i(i7, oVar2);
            }
            p4.u uVar222 = vVar.d;
            uVar222.getClass();
            uVar222.i(i7, oVar2);
        } catch (RemoteException e13) {
            h2.a.m("MediaSessionStub", "Failed to send result to browser " + vVar, e13);
        }
    }

    @Override
    public void b(TLRPC.MessageMedia messageMedia, int i7, boolean z10, int i10, long j3) {
        String str = LaunchActivity.C1;
        for (Map.Entry entry : ((HashMap) this.f1575c).entrySet()) {
            gj gjVar = (gj) entry.getValue();
            TLRPC.MessageMedia messageMedia2 = messageMedia;
            az.C(this.f1574b).r0(yy.d(messageMedia2, gj.B0(gjVar.f24213k), gjVar, null, null, null, true, 0));
            messageMedia = messageMedia2;
        }
    }

    @Override
    public boolean b1(View view) {
        switch (this.f1573a) {
            case 12:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean c(int i7, View view) {
        xi0 xi0Var = (xi0) this.f1575c;
        if (this.f1574b == 5) {
            xi0Var.getClass();
            return false;
        }
        wi0 wi0Var = xi0Var.f42121h0;
        if (wi0Var == null || !(view instanceof vi0)) {
            return false;
        }
        wi0Var.g(xi0Var, ((vi0) view).f40840e, true, false);
        return true;
    }

    @Override
    public void d(boolean z10) {
        bn bnVar = ((ti) this.f1575c).f52338b;
        int i7 = this.f1574b;
        if (i7 == 15 && v3.T(bnVar.f46005e)) {
            TLRPC.Chat chat = bnVar.f46005e;
            if (!chat.megagroup || v3.t0(chat)) {
                bnVar.getMessagesController().X(2, bnVar.f46103l6, z10);
                return;
            }
        }
        if (i7 != 15) {
            ls notificationCenter = bnVar.getNotificationCenter();
            int i10 = ls.f25384t;
            notificationCenter.n(bnVar, i10);
            bnVar.getNotificationCenter().k(i10, new Object[0]);
            bnVar.finishFragment();
            bnVar.getNotificationCenter().k(ls.K2, Long.valueOf(bnVar.f46103l6), bnVar.f46019f, bnVar.f46005e, Boolean.valueOf(z10));
            return;
        }
        bnVar.Ta(bnVar.f46191s4, z10);
    }

    @Override
    public void f(float f10, float f11, int i7, View view) {
        int i10 = this.f1573a;
        int i11 = this.f1574b;
        Object obj = this.f1575c;
        switch (i10) {
            case 12:
                ContactsActivity.c0((ContactsActivity) obj, i11, view, i7);
                return;
            default:
                vg0 vg0Var = (vg0) obj;
                sg0 sg0Var = vg0Var.U1;
                HashSet hashSet = vg0Var.Z1;
                if (view instanceof ah.r) {
                    TLRPC.User user = ((ah.r) view).getUser();
                    long j3 = user.f28583id;
                    if (hashSet.contains(Long.valueOf(j3))) {
                        hashSet.remove(Long.valueOf(j3));
                    } else {
                        hashSet.add(Long.valueOf(j3));
                        vg0Var.f52820e2.put(Long.valueOf(j3), user);
                    }
                    if (hashSet.size() == i11 + 1) {
                        hashSet.remove(Long.valueOf(j3));
                        String G = hd.G(vg0Var.f52827l2, "BotMultiContactsSelectorLimit", new Object[0]);
                        org.telegram.ui.ActionBar.m2 m2Var = vg0Var.f30179c;
                        new lc(m2Var, vg0Var.J0).Q(2131623982, 36, G).k(true);
                        try {
                            m2Var.performHapticFeedback(3, 2);
                            return;
                        } catch (Exception unused) {
                            return;
                        }
                    }
                    sg0Var.b(true, hashSet, new pg0(vg0Var, 2), null);
                    vg0Var.h1(true, false);
                    if (!TextUtils.isEmpty(vg0Var.f52821f2)) {
                        vg0Var.f52821f2 = null;
                        sg0Var.setText("");
                        org.telegram.messenger.g0.r(vg0Var.f52831p2);
                        vg0Var.g1(true, true);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        int i10 = this.f1573a;
        int i11 = this.f1574b;
        Object obj = this.f1575c;
        switch (i10) {
            case 13:
                ArrayList arrayList = ((LaunchActivity) obj).f43120e0;
                if (!arrayList.isEmpty()) {
                    np.u1(i11).F3("spambot", (org.telegram.ui.ActionBar.g2) i5.c.h(1, arrayList), 1, null);
                    return;
                }
                return;
            case 14:
            case 15:
            case 17:
            default:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                RectF rectF = ProfileActivity.Z6;
                TLRPC.UserFull d2 = profileActivity.getMessagesController().d2(profileActivity.f43585e1);
                if (d2 != null) {
                    d2.flags2 &= -4194305;
                    d2.note = null;
                    profileActivity.getMessagesStorage().j2(d2, true);
                }
                TLRPC.TL_updateContactNote tL_updateContactNote = new TLRPC.TL_updateContactNote();
                tL_updateContactNote.f28575id = profileActivity.getMessagesController().q1(profileActivity.f43585e1);
                tL_updateContactNote.note = new TLRPC.TL_textWithEntities();
                profileActivity.getConnectionsManager().sendRequest(tL_updateContactNote, null);
                profileActivity.N5();
                profileActivity.d.s(i11);
                return;
            case 16:
                de0 de0Var = ((ce0) obj).f46542h0;
                if (k10.f24968t0 != i11) {
                    ((LaunchActivity) de0Var.getParentActivity()).O0(i11);
                }
                de0Var.finishFragment();
                return;
            case 18:
                hk0 hk0Var = ((qj0) obj).f51295a;
                hk0Var.D1(hk0Var.Z[i11]);
                return;
            case 19:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) obj;
                privacyControlActivity.getClass();
                privacyControlActivity.presentFragment(new PrivacyControlActivity(i11, false), true);
                return;
        }
    }

    @Override
    public String i(int i7) {
        Calendar calendar = (Calendar) this.f1575c;
        int i10 = this.f1574b;
        calendar.clear();
        calendar.set(1, i10);
        calendar.set(2, 0);
        calendar.add(2, i7 - 120);
        if (calendar.get(1) == i10) {
            hd E0 = hd.E0();
            if (E0.f24466r == null) {
                synchronized (E0) {
                    try {
                        if (E0.f24466r == null) {
                            Locale locale = E0.f24472y;
                            if (locale == null) {
                                locale = Locale.getDefault();
                            }
                            E0.f24466r = hd.k(locale, E0.P0(2131742500, "formatterMonthOnly", null), "MMMM");
                        }
                    } finally {
                    }
                }
            }
            return E0.f24466r.format(calendar.getTimeInMillis());
        }
        return hd.E0().v0().format(calendar.getTimeInMillis());
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f1573a) {
            case 3:
                ((e2.a1) obj).L(((l2.g1) this.f1575c).f19400a, this.f1574b);
                return;
            case 4:
                e2.a1 a1Var = (e2.a1) obj;
                a1Var.v(this.f1574b, (e2.l0) this.f1575c);
                return;
            default:
                m2.b bVar = (m2.b) obj;
                bVar.getClass();
                bVar.C((m2.a) this.f1575c, this.f1574b);
                return;
        }
    }

    @Override
    public void m0(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        int i7;
        w7 w7Var = (w7) this.f1575c;
        if (this.f1574b == w7Var.f41676b) {
            f8 f8Var = w7Var.f41678e;
            Bitmap n10 = imageReceiver.n();
            if ((n10 != null && imageReceiver.J()) || imageReceiver.I()) {
                i7 = org.telegram.messenger.g0.L(64.0f);
            } else {
                i7 = 0;
            }
            x7 x7Var = f8Var.D1;
            ValueAnimator valueAnimator = f8Var.N2;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                f8Var.N2 = null;
            }
            if (x7Var.getCustomPaddingRight() != i7) {
                ValueAnimator ofInt = ValueAnimator.ofInt(x7Var.getCustomPaddingRight(), i7);
                f8Var.N2 = ofInt;
                if (i7 == 0) {
                    ofInt.setStartDelay(200L);
                    f8Var.N2.setDuration(100L);
                } else {
                    ofInt.setDuration(200L);
                }
                f8Var.N2.setInterpolator(new DecelerateInterpolator());
                f8Var.N2.addUpdateListener(new org.telegram.ui.Components.x(f8Var, 3));
                f8Var.N2.start();
            }
            if (f8Var.f35113c2.getTag() != null) {
                f8Var.d2.setImageBitmap(n10);
            }
        }
    }

    @Override
    public int run() {
        v4.c0 c0Var = ((z90) this.f1575c).f54505c;
        int L = org.telegram.messenger.g0.L(60.0f);
        int i7 = this.f1574b;
        c0Var.h1(i7, L);
        return i7;
    }

    @Override
    public void s0(View view, float f10, float f11) {
        int i7 = this.f1573a;
    }

    public v1(Object obj, int i7, int i10) {
        this.f1573a = i10;
        this.f1575c = obj;
        this.f1574b = i7;
    }

    public v1(m2.a aVar, int i7, e2.b1 b1Var, e2.b1 b1Var2) {
        this.f1573a = 5;
        this.f1575c = aVar;
        this.f1574b = i7;
    }

    public v1(ti tiVar, int i7, boolean z10) {
        this.f1573a = 6;
        this.f1575c = tiVar;
        this.f1574b = i7;
    }

    @Override
    public void V(ImageReceiver imageReceiver) {
    }

    @Override
    public void G0(int i7, Drawable drawable) {
    }

    private final void e(View view, float f10, float f11) {
    }

    private final void g(View view, float f10, float f11) {
    }
}
