package ai;

import a8.ma;
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
import bi.o4;
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
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.messenger.jc;
import org.telegram.messenger.ks;
import org.telegram.messenger.lr;
import org.telegram.messenger.mp;
import org.telegram.messenger.v3;
import org.telegram.messenger.xy;
import org.telegram.messenger.zy;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.e8;
import org.telegram.ui.Components.kc;
import org.telegram.ui.Components.mb0;
import org.telegram.ui.Components.nj0;
import org.telegram.ui.Components.no;
import org.telegram.ui.Components.rj0;
import org.telegram.ui.Components.sj0;
import org.telegram.ui.Components.v7;
import org.telegram.ui.Components.vi0;
import org.telegram.ui.Components.w7;
import org.telegram.ui.Components.wi0;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.Components.z4;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.Dictation.DictationLid;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.bn;
import org.telegram.ui.ce0;
import org.telegram.ui.de0;
import org.telegram.ui.fk0;
import org.telegram.ui.ma0;
import org.telegram.ui.ng0;
import org.telegram.ui.oj0;
import org.telegram.ui.qg0;
import org.telegram.ui.tg0;
import org.telegram.ui.ti;
import org.telegram.ui.y90;
public final class n1 implements z0, h2.o, lr, mb0, jc, z4, sj0, rj0, org.telegram.ui.ActionBar.q1, ma0, nj0, h2.j {
    public final int f1387a;
    public final int f1388b;
    public final Object f1389c;

    public n1(int i7, Object obj, int i10) {
        this.f1387a = i10;
        this.f1388b = i7;
        this.f1389c = obj;
    }

    @Override
    public void I(int i7, int i10, boolean z10) {
        switch (this.f1387a) {
            case 8:
                org.telegram.messenger.g0.h3(new jg.q(i7, this.f1388b, (no) this.f1389c, 12), 16L);
                return;
            default:
                org.telegram.messenger.g0.h3(new jg.q(i7, this.f1388b, (o4) this.f1389c, 13), 16L);
                return;
        }
    }

    @Override
    public boolean U0(View view) {
        switch (this.f1387a) {
            case 11:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void a(final float[] fArr, final long j3, final int i7) {
        android.support.v4.media.session.a0 a0Var;
        Object obj;
        switch (this.f1387a) {
            case 0:
                w1 w1Var = (w1) this.f1389c;
                int i10 = this.f1388b;
                if (!w1Var.h && i10 == w1Var.f1577p) {
                    a1 k10 = DictationLid.k(Math.min(0.6f, DictationLid.g(i7)), fArr);
                    if (k10 != null && k10.f1123c) {
                        a0Var = DictationAsr.Y(k10.f1121a, w1Var.f1573l, false);
                        if (a0Var != null) {
                            DictationLid.i(k10.f1121a);
                            w1Var.k(k10.f1121a);
                        }
                    } else if (k10 != null) {
                        a0Var = DictationAsr.X(DictationLid.d, fArr, w1Var.f1573l, false);
                        if (a0Var != null) {
                            w1Var.k(a0Var.i());
                        }
                    } else {
                        a0Var = null;
                    }
                    StringBuilder sb2 = new StringBuilder("tinyasr stop: tinylid ");
                    sb2.append(i7);
                    sb2.append(" ms speech in ");
                    sb2.append(j3);
                    sb2.append(" ms: ");
                    sb2.append(k10);
                    sb2.append(" → ");
                    if (a0Var != null) {
                        obj = a0Var;
                    } else {
                        obj = "-";
                    }
                    sb2.append(obj);
                    Log.d("Dictation", sb2.toString());
                    if (a0Var != null) {
                        q qVar = (q) a0Var.f1676b;
                        android.support.v4.media.session.a0 a0Var2 = w1Var.f1573l;
                        if (qVar != ((q) a0Var2.f1676b) || !((String) a0Var.f1677c).equals((String) a0Var2.f1677c)) {
                            w1Var.i(a0Var);
                            return;
                        }
                    }
                    w1Var.e();
                    return;
                }
                return;
            default:
                final i2 i2Var = (i2) this.f1389c;
                final int i11 = this.f1388b;
                i2Var.f1280x.f1312b.add(new Runnable() {
                    @Override
                    public final void run() {
                        float[] fArr2;
                        int i12;
                        android.support.v4.media.session.a0 Y;
                        String nativeSessionPush;
                        int i13;
                        i2 i2Var2 = i2.this;
                        ByteArrayOutputStream byteArrayOutputStream = i2Var2.f1274q;
                        i2Var2.f1278u = false;
                        if (i11 == i2Var2.f1275r && i2Var2.d != null && (fArr2 = fArr) != null) {
                            int i14 = 0;
                            while (true) {
                                int[] iArr = DictationLid.f43157j;
                                int length = iArr.length;
                                i12 = i7;
                                if (i14 < length) {
                                    if (iArr[i14] > i12) {
                                        break;
                                    }
                                    i14++;
                                } else {
                                    i14 = -1;
                                    break;
                                }
                            }
                            i2Var2.f1276s = i14;
                            if (i14 < 0) {
                                i2Var2.f1273p.reset();
                                byteArrayOutputStream.reset();
                            }
                            a1 k11 = DictationLid.k(DictationLid.g(i12), fArr2);
                            android.support.v4.media.session.a0 a0Var3 = (android.support.v4.media.session.a0) i2Var2.d.d;
                            StringBuilder sb3 = new StringBuilder("live captions ");
                            int i15 = i2Var2.f1260a;
                            i5.c.z(sb3, i15, ": tinylid ", i12, " ms speech in ");
                            sb3.append(j3);
                            sb3.append(" ms: ");
                            sb3.append(k11);
                            sb3.append(" (");
                            sb3.append(a0Var3);
                            sb3.append(")");
                            Log.d("Dictation", sb3.toString());
                            if (k11 != null) {
                                String str = k11.f1121a;
                                if (k11.f1123c && (Y = DictationAsr.Y(str, a0Var3, false)) != null) {
                                    q qVar2 = (q) Y.f1676b;
                                    int max = Math.max(0, i12 - i2Var2.f1272o);
                                    i2Var2.f1272o = Math.max(i2Var2.f1272o, i12);
                                    if (qVar2 == ((q) a0Var3.f1676b) && ((String) Y.f1677c).equals((String) a0Var3.f1677c)) {
                                        i2Var2.v = true;
                                        if (!str.equals(i2Var2.f1268k)) {
                                            i13 = 0;
                                            i2Var2.f1269l = 0;
                                        } else {
                                            i13 = 0;
                                        }
                                        i2Var2.f1268k = str;
                                        i2Var2.f1269l = Math.min(30000, i2Var2.f1269l + max);
                                        i2Var2.f1270m = null;
                                        i2Var2.f1271n = i13;
                                    } else if (!i2Var2.v || k11.f1122b >= 0.8f) {
                                        if (!str.equals(i2Var2.f1270m)) {
                                            i2Var2.f1270m = str;
                                            i2Var2.f1271n = 0;
                                        }
                                        int min = Math.min(30000, i2Var2.f1271n + max);
                                        i2Var2.f1271n = min;
                                        if (min < i2Var2.f1269l / 4) {
                                            StringBuilder m10 = i5.c.m(i15, "live captions ", ": staying in ");
                                            m10.append(i2Var2.f1268k);
                                            m10.append(" (");
                                            m10.append(i2Var2.f1269l);
                                            m10.append(" ms), ");
                                            m10.append(i2Var2.f1270m);
                                            m10.append(" has ");
                                            m10.append(i2Var2.f1271n);
                                            m10.append(" ms");
                                            Log.d("Dictation", m10.toString());
                                        } else if (!DictationAsr.C(qVar2)) {
                                            org.telegram.messenger.g0.g3(new a3.f(Y, 7));
                                        } else {
                                            u c10 = u.c(Y, i2Var2);
                                            if (c10 != null) {
                                                i2Var2.v = true;
                                                i2Var2.f1268k = str;
                                                i2Var2.f1269l = i2Var2.f1271n;
                                                i2Var2.f1270m = null;
                                                i2Var2.f1271n = 0;
                                                StringBuilder m11 = i5.c.m(i15, "live captions ", ": replaying ");
                                                m11.append(byteArrayOutputStream.size() / 32);
                                                m11.append(" ms in ");
                                                m11.append(Y);
                                                Log.d("Dictation", m11.toString());
                                                u uVar = i2Var2.d;
                                                long j10 = uVar.f1543c;
                                                if (j10 != 0) {
                                                    DictationAsr.nativeSessionFree(j10);
                                                    uVar.f1543c = 0L;
                                                    DictationAsr.T((q) uVar.f1544e);
                                                }
                                                i2Var2.d = c10;
                                                i2Var2.h = 0;
                                                i2Var2.f1265g = 0;
                                                int i16 = i2Var2.f1279w;
                                                byte[] byteArray = byteArrayOutputStream.toByteArray();
                                                u uVar2 = i2Var2.d;
                                                int length2 = byteArray.length;
                                                long j11 = uVar2.f1543c;
                                                if (j11 != 0) {
                                                    nativeSessionPush = DictationAsr.nativeSessionPush(j11, byteArray, 0, length2);
                                                    uVar2.b(nativeSessionPush);
                                                }
                                                if (i2Var2.f1279w == i16 && !i2Var2.f1267j.isEmpty()) {
                                                    i2Var2.f1267j = "";
                                                    org.telegram.messenger.g0.g3(new f2((Object) i2Var2, i2Var2.f1264f, (Serializable) "", false, 0));
                                                }
                                            }
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
        p4.v vVar = (p4.v) this.f1389c;
        int i7 = this.f1388b;
        try {
            try {
                oVar2 = (p4.o) ((m9.y) obj).get();
                ma.k(oVar2, "LibraryResult must not be null");
            } catch (InterruptedException e10) {
                e = e10;
                h2.a.m("MediaSessionStub", "Library operation failed", e);
                String str = p4.o.d;
                p4.l1 l1Var = new p4.l1("no error message provided", -1, Bundle.EMPTY);
                oVar = new p4.o(l1Var.f55457a, SystemClock.elapsedRealtime(), l1Var);
                oVar2 = oVar;
                p4.u uVar = vVar.d;
                uVar.getClass();
                uVar.i(i7, oVar2);
            } catch (CancellationException e11) {
                h2.a.m("MediaSessionStub", "Library operation cancelled", e11);
                String str2 = p4.o.d;
                p4.l1 l1Var2 = new p4.l1("no error message provided", 1, Bundle.EMPTY);
                oVar = new p4.o(l1Var2.f55457a, SystemClock.elapsedRealtime(), l1Var2);
                oVar2 = oVar;
                p4.u uVar2 = vVar.d;
                uVar2.getClass();
                uVar2.i(i7, oVar2);
            } catch (ExecutionException e12) {
                e = e12;
                h2.a.m("MediaSessionStub", "Library operation failed", e);
                String str3 = p4.o.d;
                p4.l1 l1Var3 = new p4.l1("no error message provided", -1, Bundle.EMPTY);
                oVar = new p4.o(l1Var3.f55457a, SystemClock.elapsedRealtime(), l1Var3);
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
    public boolean b(int i7, View view) {
        xi0 xi0Var = (xi0) this.f1389c;
        if (this.f1388b == 5) {
            xi0Var.getClass();
            return false;
        }
        wi0 wi0Var = xi0Var.f42027h0;
        if (wi0Var == null || !(view instanceof vi0)) {
            return false;
        }
        wi0Var.h(xi0Var, ((vi0) view).f40711e, true, false);
        return true;
    }

    @Override
    public void d(TLRPC.MessageMedia messageMedia, int i7, boolean z10, int i10, long j3) {
        String str = LaunchActivity.C1;
        for (Map.Entry entry : ((HashMap) this.f1389c).entrySet()) {
            fj fjVar = (fj) entry.getValue();
            TLRPC.MessageMedia messageMedia2 = messageMedia;
            zy.C(this.f1388b).r0(xy.d(messageMedia2, fj.B0(fjVar.f24073k), fjVar, null, null, null, true, 0));
            messageMedia = messageMedia2;
        }
    }

    @Override
    public String e(int i7) {
        Calendar calendar = (Calendar) this.f1389c;
        int i10 = this.f1388b;
        calendar.clear();
        calendar.set(1, i10);
        calendar.set(2, 0);
        calendar.add(2, i7 - 120);
        if (calendar.get(1) == i10) {
            gd E0 = gd.E0();
            if (E0.f24336r == null) {
                synchronized (E0) {
                    try {
                        if (E0.f24336r == null) {
                            Locale locale = E0.f24342y;
                            if (locale == null) {
                                locale = Locale.getDefault();
                            }
                            E0.f24336r = gd.k(locale, E0.P0(2131742495, "formatterMonthOnly", null), "MMMM");
                        }
                    } finally {
                    }
                }
            }
            return E0.f24336r.format(calendar.getTimeInMillis());
        }
        return gd.E0().v0().format(calendar.getTimeInMillis());
    }

    @Override
    public void f0(View view, float f10, float f11) {
        int i7 = this.f1387a;
    }

    @Override
    public void g(float f10, float f11, int i7, View view) {
        int i10 = this.f1387a;
        int i11 = this.f1388b;
        Object obj = this.f1389c;
        switch (i10) {
            case 11:
                ContactsActivity.c0((ContactsActivity) obj, i11, view, i7);
                return;
            default:
                tg0 tg0Var = (tg0) obj;
                qg0 qg0Var = tg0Var.U1;
                HashSet hashSet = tg0Var.Z1;
                if (view instanceof ah.r) {
                    TLRPC.User user = ((ah.r) view).getUser();
                    long j3 = user.f28641id;
                    if (hashSet.contains(Long.valueOf(j3))) {
                        hashSet.remove(Long.valueOf(j3));
                    } else {
                        hashSet.add(Long.valueOf(j3));
                        tg0Var.f52394e2.put(Long.valueOf(j3), user);
                    }
                    if (hashSet.size() == i11 + 1) {
                        hashSet.remove(Long.valueOf(j3));
                        String G = gd.G(tg0Var.f52401l2, "BotMultiContactsSelectorLimit", new Object[0]);
                        org.telegram.ui.ActionBar.m2 m2Var = tg0Var.f30229c;
                        new kc(m2Var, tg0Var.J0).Q(2131623982, 36, G).k(true);
                        try {
                            m2Var.performHapticFeedback(3, 2);
                            return;
                        } catch (Exception unused) {
                            return;
                        }
                    }
                    qg0Var.b(true, hashSet, new ng0(tg0Var, 2), null);
                    tg0Var.h1(true, false);
                    if (!TextUtils.isEmpty(tg0Var.f52395f2)) {
                        tg0Var.f52395f2 = null;
                        qg0Var.setText("");
                        org.telegram.messenger.g0.r(tg0Var.f52405p2);
                        tg0Var.g1(true, true);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public void i(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        int i10 = this.f1387a;
        int i11 = this.f1388b;
        Object obj = this.f1389c;
        switch (i10) {
            case 12:
                ArrayList arrayList = ((LaunchActivity) obj).f43195e0;
                if (!arrayList.isEmpty()) {
                    mp.u1(i11).F3("spambot", (org.telegram.ui.ActionBar.g2) i5.c.h(1, arrayList), 1, null);
                    return;
                }
                return;
            case 13:
            case 14:
            case 16:
            default:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                RectF rectF = ProfileActivity.Z6;
                TLRPC.UserFull d2 = profileActivity.getMessagesController().d2(profileActivity.f43666e1);
                if (d2 != null) {
                    d2.flags2 &= -4194305;
                    d2.note = null;
                    profileActivity.getMessagesStorage().j2(d2, true);
                }
                TLRPC.TL_updateContactNote tL_updateContactNote = new TLRPC.TL_updateContactNote();
                tL_updateContactNote.f28633id = profileActivity.getMessagesController().q1(profileActivity.f43666e1);
                tL_updateContactNote.note = new TLRPC.TL_textWithEntities();
                profileActivity.getConnectionsManager().sendRequest(tL_updateContactNote, null);
                profileActivity.N5();
                profileActivity.d.s(i11);
                return;
            case 15:
                de0 de0Var = ((ce0) obj).f46781h0;
                if (i10.f24637t0 != i11) {
                    ((LaunchActivity) de0Var.getParentActivity()).O0(i11);
                }
                de0Var.finishFragment();
                return;
            case 17:
                fk0 fk0Var = ((oj0) obj).f50706a;
                fk0Var.D1(fk0Var.Z[i11]);
                return;
            case 18:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) obj;
                privacyControlActivity.getClass();
                privacyControlActivity.presentFragment(new PrivacyControlActivity(i11, false), true);
                return;
        }
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f1387a) {
            case 2:
                ((e2.a1) obj).L(((l2.h1) this.f1389c).f19470a, this.f1388b);
                return;
            case 3:
                e2.a1 a1Var = (e2.a1) obj;
                a1Var.v(this.f1388b, (e2.l0) this.f1389c);
                return;
            default:
                m2.b bVar = (m2.b) obj;
                bVar.getClass();
                bVar.C((m2.a) this.f1389c, this.f1388b);
                return;
        }
    }

    @Override
    public void q(boolean z10) {
        bn bnVar = ((ti) this.f1389c).f52410b;
        int i7 = this.f1388b;
        if (i7 == 15 && v3.T(bnVar.f46173e)) {
            TLRPC.Chat chat = bnVar.f46173e;
            if (!chat.megagroup || v3.t0(chat)) {
                bnVar.getMessagesController().X(2, bnVar.f46271l6, z10);
                return;
            }
        }
        if (i7 != 15) {
            ks notificationCenter = bnVar.getNotificationCenter();
            int i10 = ks.f25289t;
            notificationCenter.n(bnVar, i10);
            bnVar.getNotificationCenter().k(i10, new Object[0]);
            bnVar.finishFragment();
            bnVar.getNotificationCenter().k(ks.K2, Long.valueOf(bnVar.f46271l6), bnVar.f46187f, bnVar.f46173e, Boolean.valueOf(z10));
            return;
        }
        bnVar.Ta(bnVar.f46359s4, z10);
    }

    @Override
    public int run() {
        v4.c0 c0Var = ((y90) this.f1389c).f54320c;
        int L = org.telegram.messenger.g0.L(60.0f);
        int i7 = this.f1388b;
        c0Var.h1(i7, L);
        return i7;
    }

    @Override
    public void y(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        int i7;
        v7 v7Var = (v7) this.f1389c;
        if (this.f1388b == v7Var.f40575b) {
            e8 e8Var = v7Var.f40577e;
            Bitmap n10 = imageReceiver.n();
            if ((n10 != null && imageReceiver.K()) || imageReceiver.J()) {
                i7 = org.telegram.messenger.g0.L(64.0f);
            } else {
                i7 = 0;
            }
            w7 w7Var = e8Var.D1;
            ValueAnimator valueAnimator = e8Var.N2;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                e8Var.N2 = null;
            }
            if (w7Var.getCustomPaddingRight() != i7) {
                ValueAnimator ofInt = ValueAnimator.ofInt(w7Var.getCustomPaddingRight(), i7);
                e8Var.N2 = ofInt;
                if (i7 == 0) {
                    ofInt.setStartDelay(200L);
                    e8Var.N2.setDuration(100L);
                } else {
                    ofInt.setDuration(200L);
                }
                e8Var.N2.setInterpolator(new DecelerateInterpolator());
                e8Var.N2.addUpdateListener(new org.telegram.ui.Components.w(e8Var, 3));
                e8Var.N2.start();
            }
            if (e8Var.f34594c2.getTag() != null) {
                e8Var.d2.setImageBitmap(n10);
            }
        }
    }

    public n1(Object obj, int i7, int i10) {
        this.f1387a = i10;
        this.f1389c = obj;
        this.f1388b = i7;
    }

    public n1(m2.a aVar, int i7, e2.b1 b1Var, e2.b1 b1Var2) {
        this.f1387a = 4;
        this.f1389c = aVar;
        this.f1388b = i7;
    }

    public n1(ti tiVar, int i7, boolean z10) {
        this.f1387a = 5;
        this.f1389c = tiVar;
        this.f1388b = i7;
    }

    @Override
    public void r(ImageReceiver imageReceiver) {
    }

    @Override
    public void J(int i7, Drawable drawable) {
    }

    private final void c(View view, float f10, float f11) {
    }

    private final void f(View view, float f10, float f11) {
    }
}
