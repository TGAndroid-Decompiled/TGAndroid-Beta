package ii;

import ai.o8;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.appcompat.widget.Toolbar;
import androidx.media3.decoder.ffmpeg.FfmpegAudioRenderer;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.tasks.TaskCompletionSource;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Cells.e9;
import org.telegram.ui.Cells.p9;
import org.telegram.ui.Cells.q9;
import org.telegram.ui.Components.g71;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.m9;
import org.telegram.ui.Components.o20;
import org.telegram.ui.Components.p20;
import org.telegram.ui.Components.rg0;
import org.telegram.ui.Components.sm0;
import org.telegram.ui.Components.u71;
import org.telegram.ui.Components.xo0;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.vt0;
import org.telegram.ui.wb1;
public final class n4 implements k0, k2.o, l.w, l.i, k1.f, xo0, le.f, u71, r0.n, me.a, qg.v1, com.google.android.gms.common.api.internal.o, s4.h1, com.google.android.gms.common.api.internal.s, androidx.lifecycle.s0, w2.d {
    public final int f12543a;
    public Object f12544b;

    public n4(Object obj, int i10) {
        this.f12543a = i10;
        this.f12544b = obj;
    }

    @Override
    public void A() {
        ((FfmpegAudioRenderer) this.f12544b).Z = true;
    }

    @Override
    public void C(k2.l lVar) {
        n4.y yVar = ((FfmpegAudioRenderer) this.f12544b).I;
        Handler handler = (Handler) yVar.f16644b;
        if (handler != null) {
            handler.post(new k2.i(yVar, lVar, 0));
        }
    }

    @Override
    public androidx.lifecycle.p0 D(Class cls, v1.b bVar) {
        androidx.lifecycle.m0 m0Var = null;
        for (v1.c cVar : (v1.c[]) this.f12544b) {
            if (cVar.f47766a.equals(cls)) {
                m0Var = new androidx.lifecycle.m0();
            }
        }
        if (m0Var != null) {
            return m0Var;
        }
        throw new IllegalArgumentException("No initializer set for given class ".concat(cls.getName()));
    }

    @Override
    public void E(float f7) {
        vt0 vt0Var = (vt0) this.f12544b;
        pg.u0.e(vt0Var.P1).k(String.valueOf(pg.m.f44534a.indexOf(vt0Var.W0.getCurrentBrush())), f7);
        pg.t1 t1Var = vt0Var.K1;
        t1Var.f44640c = f7;
        vt0Var.t0(t1Var, null);
    }

    public void F(int i10, long j3) {
        u3.d dVar = (u3.d) this.f12544b;
        if (i10 != 20529) {
            if (i10 != 20530) {
                boolean z10 = false;
                switch (i10) {
                    case 131:
                        dVar.d(i10);
                        dVar.f47524x.f47473e = (int) j3;
                        return;
                    case 136:
                        dVar.d(i10);
                        u3.c cVar = dVar.f47524x;
                        if (j3 == 1) {
                            z10 = true;
                        }
                        cVar.X = z10;
                        return;
                    case 155:
                        dVar.L = dVar.l(j3);
                        return;
                    case 159:
                        dVar.d(i10);
                        dVar.f47524x.Q = (int) j3;
                        return;
                    case 176:
                        dVar.d(i10);
                        dVar.f47524x.f47481n = (int) j3;
                        return;
                    case 179:
                        dVar.a(i10);
                        dVar.F.c(dVar.l(j3));
                        return;
                    case 186:
                        dVar.d(i10);
                        dVar.f47524x.f47482o = (int) j3;
                        return;
                    case 215:
                        dVar.d(i10);
                        dVar.f47524x.d = (int) j3;
                        return;
                    case 231:
                        dVar.E = dVar.l(j3);
                        return;
                    case 238:
                        dVar.S = (int) j3;
                        return;
                    case 241:
                        if (!dVar.H) {
                            dVar.a(i10);
                            dVar.G.c(j3);
                            dVar.H = true;
                            return;
                        }
                        return;
                    case 251:
                        dVar.T = true;
                        return;
                    case 16871:
                        dVar.d(i10);
                        dVar.f47524x.h = (int) j3;
                        return;
                    case 16980:
                        if (j3 != 3) {
                            throw b2.s0.a(null, "ContentCompAlgo " + j3 + " not supported");
                        }
                        return;
                    case 17029:
                        if (j3 < 1 || j3 > 2) {
                            throw b2.s0.a(null, "DocTypeReadVersion " + j3 + " not supported");
                        }
                        return;
                    case 17143:
                        if (j3 != 1) {
                            throw b2.s0.a(null, "EBMLReadVersion " + j3 + " not supported");
                        }
                        return;
                    case 18401:
                        if (j3 != 5) {
                            throw b2.s0.a(null, "ContentEncAlgo " + j3 + " not supported");
                        }
                        return;
                    case 18408:
                        if (j3 != 1) {
                            throw b2.s0.a(null, "AESSettingsCipherMode " + j3 + " not supported");
                        }
                        return;
                    case 21420:
                        dVar.A = j3 + dVar.f47520s;
                        return;
                    case 21432:
                        int i11 = (int) j3;
                        dVar.d(i10);
                        if (i11 != 0) {
                            if (i11 != 1) {
                                if (i11 != 3) {
                                    if (i11 == 15) {
                                        dVar.f47524x.f47491y = 3;
                                        return;
                                    }
                                    return;
                                }
                                dVar.f47524x.f47491y = 1;
                                return;
                            }
                            dVar.f47524x.f47491y = 2;
                            return;
                        }
                        dVar.f47524x.f47491y = 0;
                        return;
                    case 21680:
                        dVar.d(i10);
                        dVar.f47524x.f47484q = (int) j3;
                        return;
                    case 21682:
                        dVar.d(i10);
                        dVar.f47524x.f47486s = (int) j3;
                        return;
                    case 21690:
                        dVar.d(i10);
                        dVar.f47524x.f47485r = (int) j3;
                        return;
                    case 21930:
                        dVar.d(i10);
                        u3.c cVar2 = dVar.f47524x;
                        if (j3 == 1) {
                            z10 = true;
                        }
                        cVar2.W = z10;
                        return;
                    case 21938:
                        dVar.d(i10);
                        u3.c cVar3 = dVar.f47524x;
                        cVar3.f47492z = true;
                        cVar3.f47483p = (int) j3;
                        return;
                    case 21998:
                        dVar.d(i10);
                        dVar.f47524x.f47475g = (int) j3;
                        return;
                    case 22186:
                        dVar.d(i10);
                        dVar.f47524x.T = j3;
                        return;
                    case 22203:
                        dVar.d(i10);
                        dVar.f47524x.U = j3;
                        return;
                    case 25188:
                        dVar.d(i10);
                        dVar.f47524x.R = (int) j3;
                        return;
                    case 30114:
                        dVar.U = j3;
                        return;
                    case 30321:
                        dVar.d(i10);
                        int i12 = (int) j3;
                        if (i12 != 0) {
                            if (i12 != 1) {
                                if (i12 != 2) {
                                    if (i12 == 3) {
                                        dVar.f47524x.f47487t = 3;
                                        return;
                                    }
                                    return;
                                }
                                dVar.f47524x.f47487t = 2;
                                return;
                            }
                            dVar.f47524x.f47487t = 1;
                            return;
                        }
                        dVar.f47524x.f47487t = 0;
                        return;
                    case 2352003:
                        dVar.d(i10);
                        dVar.f47524x.f47474f = (int) j3;
                        return;
                    case 2807729:
                        dVar.f47521t = j3;
                        return;
                    default:
                        switch (i10) {
                            case 21945:
                                dVar.d(i10);
                                int i13 = (int) j3;
                                if (i13 != 1) {
                                    if (i13 == 2) {
                                        dVar.f47524x.C = 1;
                                        return;
                                    }
                                    return;
                                }
                                dVar.f47524x.C = 2;
                                return;
                            case 21946:
                                dVar.d(i10);
                                int g10 = b2.j.g((int) j3);
                                if (g10 != -1) {
                                    dVar.f47524x.B = g10;
                                    return;
                                }
                                return;
                            case 21947:
                                dVar.d(i10);
                                dVar.f47524x.f47492z = true;
                                int f7 = b2.j.f((int) j3);
                                if (f7 != -1) {
                                    dVar.f47524x.A = f7;
                                    return;
                                }
                                return;
                            case 21948:
                                dVar.d(i10);
                                dVar.f47524x.D = (int) j3;
                                return;
                            case 21949:
                                dVar.d(i10);
                                dVar.f47524x.E = (int) j3;
                                return;
                            default:
                                return;
                        }
                }
            } else if (j3 != 1) {
                throw b2.s0.a(null, "ContentEncodingScope " + j3 + " not supported");
            }
        } else if (j3 == 0) {
        } else {
            throw b2.s0.a(null, "ContentEncodingOrder " + j3 + " not supported");
        }
    }

    public boolean G(android.view.MotionEvent r22) {
        throw new UnsupportedOperationException("Method not decompiled: ii.n4.G(android.view.MotionEvent):boolean");
    }

    public void I() {
        ArrayDeque arrayDeque = (ArrayDeque) this.f12544b;
        if (arrayDeque.isEmpty()) {
            return;
        }
        int size = arrayDeque.size();
        long O = O();
        throw new IOException("data item not completed, stackSize: " + size + " scope: " + O);
    }

    @Override
    public q9 J() {
        o4 o4Var = ((q4) this.f12544b).G;
        if (o4Var != null) {
            return ((t3) o4Var).f12658a.getTextSelectionHelper();
        }
        return null;
    }

    @Override
    public void K(k2.l lVar) {
        n4.y yVar = ((FfmpegAudioRenderer) this.f12544b).I;
        Handler handler = (Handler) yVar.f16644b;
        if (handler != null) {
            handler.post(new k2.i(yVar, lVar, 1));
        }
    }

    public void L(long j3) {
        long O = O();
        if (O != j3) {
            if (O != -1) {
                if (O == -2) {
                    O = -2;
                } else {
                    return;
                }
            }
            StringBuilder u10 = a4.a.u(j3, "expected non-string scope or scope ", " but found ");
            u10.append(O);
            throw new IOException(u10.toString());
        }
    }

    @Override
    public boolean M(l.k kVar, MenuItem menuItem) {
        ((Toolbar) this.f12544b).getClass();
        return false;
    }

    @Override
    public void N(CharSequence charSequence) {
        o4 o4Var = ((q4) this.f12544b).G;
        if (o4Var != null) {
            t3 t3Var = (t3) o4Var;
            t3Var.getClass();
            if (charSequence != null && charSequence.length() > 0) {
                t3Var.f12658a.v4(charSequence.toString());
            }
        }
    }

    public long O() {
        ArrayDeque arrayDeque = (ArrayDeque) this.f12544b;
        if (arrayDeque.isEmpty()) {
            return 0L;
        }
        return ((Long) arrayDeque.peek()).longValue();
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        sm0 sm0Var = (sm0) this.f12544b;
        sm0Var.v.setPadding(defaultWindowInsets.f11526a, defaultWindowInsets.f11527b, defaultWindowInsets.f11528c, defaultWindowInsets.d);
        sm0Var.f30830s.requestLayout();
        return r0.l1.f45616b;
    }

    @Override
    public p9 R() {
        return (q4) this.f12544b;
    }

    @Override
    public a T() {
        return ((q4) this.f12544b).f12204a;
    }

    @Override
    public boolean W() {
        q4 q4Var = (q4) this.f12544b;
        o4 o4Var = q4Var.G;
        if (o4Var != null) {
            a aVar = q4Var.f12204a;
            if (((t3) o4Var).f12658a.U4()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public void Y(float f7, boolean z10) {
        wb1 wb1Var = (wb1) ((org.telegram.ui.Cells.k0) this.f12544b);
        int i10 = (int) (org.telegram.ui.ActionBar.i6.f21056q * 100.0f);
        int i11 = (int) (f7 * 100.0f);
        org.telegram.ui.ActionBar.i6.f21056q = f7;
        if (i10 != i11) {
            ThemeActivity themeActivity = wb1Var.f42059e.f35064e;
            il0 il0Var = (il0) themeActivity.f34528b.K(themeActivity.f34536f0);
            if (il0Var != null) {
                ((e9) il0Var.f46531a).setText(LocaleController.formatString("AutoNightBrightnessInfo", R.string.AutoNightBrightnessInfo, Integer.valueOf((int) (org.telegram.ui.ActionBar.i6.f21056q * 100.0f))));
            }
            org.telegram.ui.ActionBar.i6.E(true);
        }
    }

    @Override
    public void Z(int i10, int i11) {
        q4 q4Var = (q4) this.f12544b;
        o4 o4Var = q4Var.G;
        if (o4Var != null) {
            a aVar = q4Var.f12204a;
            i2 i2Var = ((t3) o4Var).f12658a.Q3;
            if (i2Var != null) {
                i2Var.f(i10, i11);
            }
        }
    }

    @Override
    public void accept(Object obj, Object obj2) {
        switch (this.f12543a) {
            case 25:
                s6.f fVar = new s6.f(1, (TaskCompletionSource) obj2);
                s6.e eVar = (s6.e) ((s6.h) obj).u();
                Parcel I0 = eVar.I0();
                k7.a.d(I0, fVar);
                k7.a.c(I0, (s6.a) this.f12544b);
                I0.writeStrongBinder(null);
                eVar.J0(I0, 2);
                return;
            default:
                v8.e eVar2 = (v8.e) this.f12544b;
                e8.b bVar = (e8.b) obj;
                bVar.getClass();
                e8.a aVar = new e8.a(1, (TaskCompletionSource) obj2);
                try {
                    e8.i iVar = (e8.i) bVar.u();
                    Bundle G = bVar.G();
                    Parcel obtain = Parcel.obtain();
                    obtain.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
                    int i10 = e8.c.f8707a;
                    obtain.writeInt(1);
                    eVar2.writeToParcel(obtain, 0);
                    obtain.writeInt(1);
                    G.writeToParcel(obtain, 0);
                    obtain.writeStrongBinder(aVar);
                    iVar.f8715a.transact(14, obtain, null, 1);
                    obtain.recycle();
                    return;
                } catch (RemoteException e7) {
                    Log.e("WalletClientImpl", "RemoteException during isReadyToPay", e7);
                    Bundle bundle = Bundle.EMPTY;
                    v7.g5.a(Status.h, Boolean.FALSE, aVar.f8706b);
                    return;
                }
        }
    }

    @Override
    public void b(i1 i1Var) {
        o4 o4Var = ((q4) this.f12544b).G;
        if (o4Var != null) {
            x3 x3Var = ((t3) o4Var).f12658a;
            x3.O1(x3Var, i1Var);
            x3Var.f12770o3.P(i1Var, true);
        }
    }

    @Override
    public void c(l.k kVar, boolean z10) {
        if (kVar instanceof l.d0) {
            ((l.d0) kVar).f15147z.k().c(false);
        }
        l.w wVar = ((m.h) this.f12544b).f15751e;
        if (wVar != null) {
            wVar.c(kVar, z10);
        }
    }

    @Override
    public void d(long j3) {
        n4.y yVar = ((FfmpegAudioRenderer) this.f12544b).I;
        Handler handler = (Handler) yVar.f16644b;
        if (handler != null) {
            handler.post(new ai.j(yVar, j3, 12));
        }
    }

    @Override
    public int e(View view) {
        return s4.o0.z(view) - ((ViewGroup.MarginLayoutParams) ((s4.p0) view.getLayoutParams())).topMargin;
    }

    @Override
    public androidx.lifecycle.p0 f(Class cls) {
        throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
    }

    @Override
    public boolean forceEnableVibration() {
        return false;
    }

    @Override
    public void g() {
        q4 q4Var = (q4) this.f12544b;
        o4 o4Var = q4Var.G;
        if (o4Var != null) {
            x3.R1(((t3) o4Var).f12658a, q4Var.f12204a);
        }
    }

    @Override
    public void g0() {
        q4 q4Var = (q4) this.f12544b;
        o4 o4Var = q4Var.G;
        if (o4Var != null) {
            a aVar = q4Var.f12204a;
            x3 x3Var = ((t3) o4Var).f12658a;
            i2 i2Var = x3Var.Q3;
            if (i2Var != null) {
                i2Var.g();
            }
            x3Var.f12770o3.onContentChanged();
        }
    }

    @Override
    public float get() {
        vt0 vt0Var = (vt0) this.f12544b;
        int i10 = vt0Var.P1;
        pg.m currentBrush = vt0Var.W0.getCurrentBrush();
        if (currentBrush == null) {
            return pg.u0.e(i10).f44653i;
        }
        return pg.u0.e(i10).f(String.valueOf(pg.m.f44534a.indexOf(currentBrush)), currentBrush.d());
    }

    @Override
    public CharSequence getContentDescription() {
        return " ";
    }

    @Override
    public ce.b getData() {
        return ((k1.a0) this.f12544b).f14289c;
    }

    @Override
    public long getLongPressDuration() {
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override
    public boolean i() {
        return false;
    }

    @Override
    public boolean ignoreHapticFeedbackSettings(float f7, float f10) {
        return false;
    }

    @Override
    public void invalidate() {
        ((rg0) this.f12544b).h.invalidate();
    }

    @Override
    public boolean j(float f7) {
        return false;
    }

    @Override
    public int l() {
        return ((s4.o0) this.f12544b).G();
    }

    @Override
    public void m() {
        ((FfmpegAudioRenderer) this.f12544b).f2868f0 = true;
    }

    @Override
    public int n() {
        s4.o0 o0Var = (s4.o0) this.f12544b;
        return o0Var.f46645n - o0Var.C();
    }

    @Override
    public boolean needCancelTouchBySlopMove() {
        return true;
    }

    @Override
    public boolean needClickAt(View view, float f7, float f10) {
        int dp = AndroidUtilities.dp(9.0f);
        g71 g71Var = (g71) this.f12544b;
        float f11 = -dp;
        g71Var.f26700g.inset(f11, f11);
        boolean contains = g71Var.f26700g.contains(f7, f10);
        float f12 = dp;
        g71Var.f26700g.inset(f12, f12);
        return contains;
    }

    @Override
    public boolean needLongPress(float f7, float f10) {
        return false;
    }

    @Override
    public void onAudioSessionIdChanged(int i10) {
        n4.y yVar = ((FfmpegAudioRenderer) this.f12544b).I;
        Handler handler = (Handler) yVar.f16644b;
        if (handler != null) {
            handler.post(new o8(yVar, i10, 11));
        }
    }

    @Override
    public void onClickAt(View view, float f7, float f10) {
        Runnable runnable = ((g71) this.f12544b).f26702j;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override
    public void onClickTouchDown(View view, float f7, float f10) {
        ((g71) this.f12544b).h.c(true);
    }

    @Override
    public void onClickTouchUp(View view, float f7, float f10) {
        ((g71) this.f12544b).h.c(false);
    }

    @Override
    public boolean onLongPressRequestedAt(View view, float f7, float f10) {
        return false;
    }

    @Override
    public void onSkipSilenceEnabledChanged(boolean z10) {
        n4.y yVar = ((FfmpegAudioRenderer) this.f12544b).I;
        Handler handler = (Handler) yVar.f16644b;
        if (handler != null) {
            handler.post(new bi.f(7, yVar, z10));
        }
    }

    @Override
    public View p(int i10) {
        return ((s4.o0) this.f12544b).q(i10);
    }

    @Override
    public int p0() {
        return 0;
    }

    @Override
    public void q(Object obj) {
        ((g8.c) obj).onLocationResult((LocationResult) this.f12544b);
    }

    @Override
    public int r(View view) {
        return s4.o0.v(view) + ((ViewGroup.MarginLayoutParams) ((s4.p0) view.getLayoutParams())).bottomMargin;
    }

    @Override
    public void s(int i10, long j3, long j10) {
        n4.y yVar = ((FfmpegAudioRenderer) this.f12544b).I;
        Handler handler = (Handler) yVar.f16644b;
        if (handler != null) {
            handler.post(new k2.j(yVar, i10, j3, j10, 0));
        }
    }

    @Override
    public Object t(rd.p pVar, kd.c cVar) {
        return ((k1.a0) this.f12544b).t(new n1.c(pVar, null, 0), cVar);
    }

    public String toString() {
        switch (this.f12543a) {
            case 22:
                re.b bVar = re.b.f46016e;
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("method-execution".substring(7));
                stringBuffer.append("(");
                stringBuffer.append(((ra.a) this.f12544b).n());
                stringBuffer.append(")");
                return stringBuffer.toString();
            default:
                return super.toString();
        }
    }

    @Override
    public void u() {
        x2.p pVar;
        FfmpegAudioRenderer ffmpegAudioRenderer = (FfmpegAudioRenderer) this.f12544b;
        synchronized (ffmpegAudioRenderer.f11594a) {
            pVar = ffmpegAudioRenderer.H;
        }
        if (pVar != null) {
            pVar.h();
        }
    }

    @Override
    public boolean v(l.k kVar) {
        m.h hVar = (m.h) this.f12544b;
        if (kVar == hVar.f15750c) {
            return false;
        }
        ((l.d0) kVar).A.getClass();
        hVar.getClass();
        l.w wVar = hVar.f15751e;
        if (wVar == null) {
            return false;
        }
        return wVar.v(kVar);
    }

    @Override
    public void v0() {
        q4 q4Var = (q4) this.f12544b;
        o4 o4Var = q4Var.G;
        if (o4Var != null) {
            a aVar = q4Var.f12204a;
            x3.Q1(((t3) o4Var).f12658a);
        }
    }

    @Override
    public void w(Exception exc) {
        e2.a.f("DecoderAudioRenderer", "Audio sink error", exc);
        n4.y yVar = ((FfmpegAudioRenderer) this.f12544b).I;
        Handler handler = (Handler) yVar.f16644b;
        if (handler != null) {
            handler.post(new k2.g(yVar, exc, 1));
        }
    }

    public void x(int i10, int i11, c3.p pVar) {
        char c10;
        char c11;
        long j3;
        int i12;
        int i13;
        int i14;
        int i15;
        byte[] bArr;
        int i16;
        u3.d dVar = (u3.d) this.f12544b;
        u3.e eVar = dVar.f47501b;
        SparseArray sparseArray = dVar.f47503c;
        e2.v vVar = dVar.f47512k;
        e2.v vVar2 = dVar.f47510i;
        int i17 = 1;
        int i18 = 0;
        if (i10 != 161 && i10 != 163) {
            if (i10 != 165) {
                if (i10 != 16877) {
                    if (i10 != 16981) {
                        if (i10 != 18402) {
                            if (i10 != 21419) {
                                if (i10 != 25506) {
                                    if (i10 == 30322) {
                                        dVar.d(i10);
                                        byte[] bArr2 = new byte[i11];
                                        dVar.f47524x.f47490x = bArr2;
                                        pVar.readFully(bArr2, 0, i11);
                                        return;
                                    }
                                    throw b2.s0.a(null, "Unexpected id: " + i10);
                                }
                                dVar.d(i10);
                                byte[] bArr3 = new byte[i11];
                                dVar.f47524x.f47479l = bArr3;
                                pVar.readFully(bArr3, 0, i11);
                                return;
                            }
                            Arrays.fill(vVar.f8590a, (byte) 0);
                            pVar.readFully(vVar.f8590a, 4 - i11, i11);
                            vVar.J(0);
                            dVar.f47526z = (int) vVar.z();
                            return;
                        }
                        byte[] bArr4 = new byte[i11];
                        pVar.readFully(bArr4, 0, i11);
                        dVar.d(i10);
                        dVar.f47524x.f47478k = new c3.g0(1, 0, 0, bArr4);
                        return;
                    }
                    dVar.d(i10);
                    byte[] bArr5 = new byte[i11];
                    dVar.f47524x.f47477j = bArr5;
                    pVar.readFully(bArr5, 0, i11);
                    return;
                }
                dVar.d(i10);
                u3.c cVar = dVar.f47524x;
                int i19 = cVar.h;
                if (i19 != 1685485123 && i19 != 1685480259) {
                    pVar.o(i11);
                    return;
                }
                byte[] bArr6 = new byte[i11];
                cVar.P = bArr6;
                pVar.readFully(bArr6, 0, i11);
                return;
            } else if (dVar.J == 2) {
                u3.c cVar2 = (u3.c) sparseArray.get(dVar.P);
                int i20 = dVar.S;
                e2.v vVar3 = dVar.f47517p;
                if (i20 == 4 && "V_VP9".equals(cVar2.f47472c)) {
                    vVar3.G(i11);
                    pVar.readFully(vVar3.f8590a, 0, i11);
                    return;
                }
                pVar.o(i11);
                return;
            } else {
                return;
            }
        }
        if (dVar.J == 0) {
            dVar.P = (int) eVar.b(pVar, false, true, 8);
            dVar.Q = eVar.f47529c;
            dVar.L = -9223372036854775807L;
            dVar.J = 1;
            vVar2.G(0);
        }
        u3.c cVar3 = (u3.c) sparseArray.get(dVar.P);
        if (cVar3 == null) {
            pVar.o(i11 - dVar.Q);
            dVar.J = 0;
            return;
        }
        cVar3.Z.getClass();
        if (dVar.J == 1) {
            dVar.j(pVar, 3);
            int i21 = (vVar2.f8590a[2] & 6) >> 1;
            byte b10 = 255;
            if (i21 == 0) {
                dVar.N = 1;
                int[] iArr = dVar.O;
                if (iArr == null) {
                    iArr = new int[1];
                } else if (iArr.length < 1) {
                    iArr = new int[Math.max(iArr.length * 2, 1)];
                }
                dVar.O = iArr;
                iArr[0] = (i11 - dVar.Q) - 3;
            } else {
                dVar.j(pVar, 4);
                int i22 = (vVar2.f8590a[3] & 255) + 1;
                dVar.N = i22;
                int[] iArr2 = dVar.O;
                if (iArr2 == null) {
                    iArr2 = new int[i22];
                } else if (iArr2.length < i22) {
                    iArr2 = new int[Math.max(iArr2.length * 2, i22)];
                }
                dVar.O = iArr2;
                if (i21 == 2) {
                    int i23 = dVar.N;
                    Arrays.fill(iArr2, 0, i23, ((i11 - dVar.Q) - 4) / i23);
                } else if (i21 == 1) {
                    int i24 = 0;
                    int i25 = 0;
                    int i26 = 4;
                    while (true) {
                        i13 = dVar.N - 1;
                        if (i24 >= i13) {
                            break;
                        }
                        dVar.O[i24] = 0;
                        while (true) {
                            i14 = i26 + 1;
                            dVar.j(pVar, i14);
                            int i27 = vVar2.f8590a[i26] & 255;
                            int[] iArr3 = dVar.O;
                            i15 = iArr3[i24] + i27;
                            iArr3[i24] = i15;
                            if (i27 != 255) {
                                break;
                            }
                            i26 = i14;
                        }
                        i25 += i15;
                        i24++;
                        i26 = i14;
                    }
                    dVar.O[i13] = ((i11 - dVar.Q) - i26) - i25;
                } else if (i21 == 3) {
                    int i28 = 0;
                    int i29 = 0;
                    int i30 = 4;
                    while (true) {
                        int i31 = dVar.N - i17;
                        if (i28 < i31) {
                            dVar.O[i28] = i18;
                            int i32 = i30 + 1;
                            dVar.j(pVar, i32);
                            if (vVar2.f8590a[i30] != 0) {
                                int i33 = 0;
                                while (true) {
                                    if (i33 < 8) {
                                        int i34 = 1 << (7 - i33);
                                        if ((vVar2.f8590a[i30] & i34) != 0) {
                                            i12 = i32 + i33;
                                            dVar.j(pVar, i12);
                                            j3 = vVar2.f8590a[i30] & b10 & (~i34);
                                            while (i32 < i12) {
                                                j3 = (j3 << 8) | (vVar2.f8590a[i32] & b10);
                                                i32++;
                                                b10 = 255;
                                            }
                                            if (i28 > 0) {
                                                j3 -= (1 << ((i33 * 7) + 6)) - 1;
                                            }
                                        } else {
                                            i33++;
                                            b10 = 255;
                                        }
                                    } else {
                                        j3 = 0;
                                        i12 = i32;
                                        break;
                                    }
                                }
                                if (j3 < -2147483648L || j3 > 2147483647L) {
                                    break;
                                }
                                int i35 = (int) j3;
                                int[] iArr4 = dVar.O;
                                if (i28 != 0) {
                                    i35 += iArr4[i28 - 1];
                                }
                                iArr4[i28] = i35;
                                i29 += i35;
                                i28++;
                                i30 = i12;
                                b10 = 255;
                                i17 = 1;
                                i18 = 0;
                            } else {
                                throw b2.s0.a(null, "No valid varint length mask found");
                            }
                        } else {
                            c10 = 1;
                            c11 = 0;
                            dVar.O[i31] = ((i11 - dVar.Q) - i30) - i29;
                            break;
                        }
                    }
                    throw b2.s0.a(null, "EBML lacing sample size out of range.");
                } else {
                    throw b2.s0.a(null, "Unexpected lacing value: " + i21);
                }
            }
            c10 = 1;
            c11 = 0;
            int i36 = vVar2.f8590a[c10] & 255;
            dVar.K = dVar.l(i36 | (bArr[c11] << 8)) + dVar.E;
            if (cVar3.f47473e != 2 && (i10 != 163 || (vVar2.f8590a[2] & 128) != 128)) {
                i16 = 0;
            } else {
                i16 = 1;
            }
            dVar.R = i16;
            dVar.J = 2;
            dVar.M = 0;
        }
        if (i10 == 163) {
            while (true) {
                int i37 = dVar.M;
                if (i37 < dVar.N) {
                    dVar.e(cVar3, ((dVar.M * cVar3.f47474f) / 1000) + dVar.K, dVar.R, dVar.n(pVar, cVar3, dVar.O[i37], false), 0);
                    dVar.M++;
                } else {
                    dVar.J = 0;
                    return;
                }
            }
        } else {
            while (true) {
                int i38 = dVar.M;
                if (i38 < dVar.N) {
                    int[] iArr5 = dVar.O;
                    iArr5[i38] = dVar.n(pVar, cVar3, iArr5[i38], true);
                    dVar.M++;
                } else {
                    return;
                }
            }
        }
    }

    @Override
    public void y(l.k kVar) {
        Toolbar toolbar = (Toolbar) this.f12544b;
        m.h hVar = toolbar.f2194a.J;
        if (hVar != null && hVar.g()) {
            return;
        }
        Iterator it = ((CopyOnWriteArrayList) toolbar.W.d).iterator();
        while (it.hasNext()) {
            ((androidx.fragment.app.c0) it.next()).f2595a.t();
        }
    }

    @Override
    public void z() {
        ((m9) this.f12544b).f28554a.invalidate();
    }

    public n4(s6.g gVar, s6.a aVar) {
        this.f12543a = 25;
        this.f12544b = aVar;
    }

    public n4(int i10) {
        this.f12543a = i10;
        switch (i10) {
            case 22:
                return;
            case 29:
                this.f12544b = new qb.b(28);
                return;
            default:
                this.f12544b = new ArrayDeque(16);
                return;
        }
    }

    public n4(x6.a aVar) {
        this.f12543a = 1;
        n6.l.h(aVar);
        this.f12544b = aVar;
    }

    public n4(v1.c[] initializers) {
        this.f12543a = 27;
        kotlin.jvm.internal.i.e(initializers, "initializers");
        this.f12544b = initializers;
    }

    public n4(ArrayList arrayList) {
        this.f12543a = 23;
        this.f12544b = DesugarCollections.unmodifiableList(arrayList);
    }

    public n4(EditText editText) {
        this.f12543a = 19;
        this.f12544b = new n7.z0(editText);
    }

    public n4(Context context, p20 p20Var) {
        this.f12543a = 13;
        this.f12544b = new o20(context, p20Var);
    }

    public n4(Context context, n4.y yVar) {
        this.f12543a = 8;
        n4.x xVar = ((n4.r) yVar.f16644b).f16626c;
        DesugarCollections.synchronizedSet(new HashSet());
        if (Build.VERSION.SDK_INT >= 29) {
            this.f12544b = new n4.j(context, xVar);
        } else {
            this.f12544b = new n4.j(context, xVar);
        }
    }

    @Override
    public void h(boolean z10) {
    }

    @Override
    public void B() {
    }

    @Override
    public void H() {
    }

    @Override
    public void a() {
    }

    @Override
    public void k() {
    }

    @Override
    public void o() {
    }

    @Override
    public void onClickTouchMove(View view, float f7, float f10) {
    }

    @Override
    public void onLongPressCancelled(View view, float f7, float f10) {
    }

    @Override
    public void onLongPressFinish(View view, float f7, float f10) {
    }

    @Override
    public void onLongPressMove(View view, MotionEvent motionEvent, float f7, float f10, float f11, float f12) {
    }
}
