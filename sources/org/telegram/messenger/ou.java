package org.telegram.messenger;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Parcel;
import android.text.style.CharacterStyle;
import android.view.GestureDetector;
import android.widget.TextView;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.EOFException;
import java.io.File;
import java.io.FileOutputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.TreeMap;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.ce0;
import org.telegram.ui.Components.fd0;
import org.telegram.ui.Components.gd0;
import org.telegram.ui.Components.j40;
import org.telegram.ui.Components.ke0;
import org.telegram.ui.Components.l51;
import org.telegram.ui.Components.oi0;
import org.telegram.ui.Components.pm0;
import org.telegram.ui.Components.r40;
import org.telegram.ui.Components.s51;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.wa0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.dr0;
import org.telegram.ui.mm0;
import org.telegram.ui.po0;
public final class ou implements kc, l51, org.telegram.ui.Cells.l1, te.d, ce0, s51, og.n, mm0, o2.i, pm0, com.google.android.gms.common.api.internal.q, tg.l1, u2.m {
    public final int f25803a;
    public Object f25804b;

    public ou(Object obj, int i7) {
        this.f25803a = i7;
        this.f25804b = obj;
    }

    public static float[] G0(ArrayList arrayList) {
        float f10;
        int i7;
        int i10;
        float f11;
        double d;
        double d2;
        double[] dArr;
        ArrayList arrayList2;
        float f12;
        float f13;
        int i11;
        float f14;
        int size = arrayList.size();
        int i12 = 0;
        int i13 = 0;
        while (true) {
            f10 = 255.0f;
            if (i13 >= size) {
                break;
            }
            PointF pointF = (PointF) arrayList.get(i13);
            pointF.x *= 255.0f;
            pointF.y *= 255.0f;
            i13++;
        }
        int size2 = arrayList.size();
        int i14 = 1;
        double d10 = 1.0d;
        if (size2 <= 0 || size2 == 1) {
            i7 = 0;
            i10 = 1;
            f11 = 255.0f;
            d = 1.0d;
            d2 = 6.0d;
            dArr = null;
        } else {
            char c10 = 2;
            double[][] dArr2 = (double[][]) Array.newInstance(Double.TYPE, size2, 3);
            double[] dArr3 = new double[size2];
            double[] dArr4 = dArr2[0];
            dArr4[1] = 1.0d;
            double d11 = 0.0d;
            dArr4[0] = 0.0d;
            dArr4[2] = 0.0d;
            int i15 = 1;
            while (true) {
                i11 = size2 - 1;
                if (i15 >= i11) {
                    break;
                }
                PointF pointF2 = (PointF) arrayList.get(i15 - 1);
                PointF pointF3 = (PointF) arrayList.get(i15);
                int i16 = i15 + 1;
                double d12 = d10;
                PointF pointF4 = (PointF) arrayList.get(i16);
                double[] dArr5 = dArr2[i15];
                char c11 = c10;
                float f15 = pointF3.x;
                double d13 = d11;
                int i17 = i12;
                int i18 = i14;
                double d14 = f15 - pointF2.x;
                dArr5[i17] = d14 / 6.0d;
                float f16 = pointF4.x;
                float f17 = f10;
                dArr5[i18] = (f16 - f14) / 3.0d;
                double d15 = f16 - f15;
                dArr5[c11] = d15 / 6.0d;
                float f18 = pointF4.y;
                float f19 = pointF3.y;
                dArr3[i15] = ((f18 - f19) / d15) - ((f19 - pointF2.y) / d14);
                i15 = i16;
                c10 = c11;
                d10 = d12;
                d11 = d13;
                i12 = i17;
                i14 = i18;
                f10 = f17;
            }
            i7 = i12;
            i10 = i14;
            f11 = f10;
            d = d10;
            char c12 = c10;
            double d16 = d11;
            d2 = 6.0d;
            dArr3[i7] = d16;
            dArr3[i11] = d16;
            double[] dArr6 = dArr2[i11];
            dArr6[i10] = d;
            dArr6[i7] = d16;
            dArr6[c12] = d16;
            for (int i19 = i10; i19 < size2; i19++) {
                double[] dArr7 = dArr2[i19];
                double d17 = dArr7[i7];
                int i20 = i19 - 1;
                double[] dArr8 = dArr2[i20];
                double d18 = d17 / dArr8[i10];
                dArr7[i10] = dArr7[i10] - (dArr8[c12] * d18);
                dArr7[i7] = d16;
                dArr3[i19] = dArr3[i19] - (d18 * dArr3[i20]);
            }
            for (int i21 = size2 - 2; i21 >= 0; i21--) {
                double[] dArr9 = dArr2[i21];
                double d19 = dArr9[c12];
                int i22 = i21 + 1;
                double[] dArr10 = dArr2[i22];
                double d20 = d19 / dArr10[i10];
                dArr9[i10] = dArr9[i10] - (dArr10[i7] * d20);
                dArr9[c12] = d16;
                dArr3[i21] = dArr3[i21] - (d20 * dArr3[i22]);
            }
            dArr = new double[size2];
            for (int i23 = i7; i23 < size2; i23++) {
                dArr[i23] = dArr3[i23] / dArr2[i23][i10];
            }
        }
        int length = dArr.length;
        if (length < i10) {
            arrayList2 = null;
            f12 = 0.0f;
        } else {
            arrayList2 = new ArrayList(length + 1);
            int i24 = i7;
            while (i24 < length - 1) {
                PointF pointF5 = (PointF) arrayList.get(i24);
                int i25 = i24 + 1;
                PointF pointF6 = (PointF) arrayList.get(i25);
                int i26 = (int) pointF5.x;
                while (true) {
                    float f20 = pointF6.x;
                    if (i26 < ((int) f20)) {
                        float f21 = i26;
                        PointF pointF7 = pointF5;
                        double d21 = f20 - pointF5.x;
                        double d22 = (f21 - f13) / d21;
                        double d23 = d - d22;
                        int i27 = length;
                        double[] dArr11 = dArr;
                        float f22 = (float) (((((((d22 * d22) * d22) - d22) * dArr11[i25]) + ((((d23 * d23) * d23) - d23) * dArr11[i24])) * ((d21 * d21) / d2)) + (pointF6.y * d22) + (pointF7.y * d23));
                        if (f22 > f11) {
                            f22 = f11;
                        } else if (f22 < 0.0f) {
                            f22 = 0.0f;
                        }
                        arrayList2.add(new PointF(f21, f22));
                        i26++;
                        dArr = dArr11;
                        pointF5 = pointF7;
                        length = i27;
                    }
                }
                i24 = i25;
            }
            f12 = 0.0f;
            arrayList2.add((PointF) i5.c.h(1, arrayList));
        }
        int i28 = i7;
        float f23 = ((PointF) arrayList2.get(i28)).x;
        if (f23 > f12) {
            for (int i29 = (int) f23; i29 >= 0; i29--) {
                arrayList2.add(i28, new PointF(i29, f12));
            }
        }
        float f24 = ((PointF) i5.c.h(1, arrayList2)).x;
        if (f24 < f11) {
            for (int i30 = ((int) f24) + 1; i30 <= 255; i30++) {
                arrayList2.add(new PointF(i30, f11));
            }
        }
        float[] fArr = new float[arrayList2.size()];
        int size3 = arrayList2.size();
        while (i28 < size3) {
            PointF pointF8 = (PointF) arrayList2.get(i28);
            float sqrt = (float) Math.sqrt(Math.pow(pointF8.x - pointF8.y, 2.0d));
            if (pointF8.x > pointF8.y) {
                sqrt = -sqrt;
            }
            fArr[i28] = sqrt;
            i28++;
        }
        return fArr;
    }

    public static void e1(String str, TreeMap treeMap) {
        String[] split = str.split(":", 2);
        if (split.length < 2) {
            return;
        }
        String trim = split[0].trim();
        String trim2 = split[1].trim();
        List list = (List) treeMap.get(trim);
        if (list == null) {
            list = new ArrayList();
            treeMap.put(trim, list);
        }
        list.add(trim2);
    }

    @Override
    public void A(ImageReceiver imageReceiver) {
        ((pu) this.f25804b).t0(true);
    }

    @Override
    public long D(long j3, long j10) {
        return -9223372036854775807L;
    }

    @Override
    public void D0() {
        fd0 fd0Var = ((gd0) this.f25804b).f34906a;
        if (fd0Var != null) {
            PhotoViewer photoViewer = ((po0) fd0Var).f50330a;
            if (photoViewer.d2 == 1) {
                photoViewer.H2 = true;
                photoViewer.o3();
            }
        }
    }

    @Override
    public p2.j E(long j3) {
        return (p2.j) this.f25804b;
    }

    public void E0() {
        sg.s0 s0Var = ((sg.u0) this.f25804b).d;
        if (s0Var != null) {
            sg.r0 r0Var = s0Var.f56770s;
            if (r0Var != null) {
                s0Var.cancelRunnable(r0Var);
                s0Var.f56770s = null;
            }
            sg.r0 r0Var2 = new sg.r0(s0Var, 1);
            s0Var.f56770s = r0Var2;
            s0Var.postRunnable(r0Var2, 1L);
        }
    }

    @Override
    public void F() {
        fd0 fd0Var = ((gd0) this.f25804b).f34906a;
        if (fd0Var != null) {
            ((po0) fd0Var).f50330a.f42763f0.invalidate();
        }
    }

    @Override
    public boolean H1(org.telegram.ui.Cells.q1 q1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public boolean J1() {
        return false;
    }

    @Override
    public long L(long j3, long j10) {
        return 0L;
    }

    @Override
    public boolean L0(long j3) {
        return false;
    }

    @Override
    public void M(boolean z10) {
        ((gd0) this.f25804b).f34908c.setAspectLock(z10);
    }

    @Override
    public boolean Q(org.telegram.ui.Cells.q1 q1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override
    public void Q1(org.telegram.ui.Cells.q1 q1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        vf.c.t(q1Var.getContext(), str);
    }

    @Override
    public boolean R() {
        return false;
    }

    public void R0(s4.p pVar, s4.m mVar, Collection collection) {
        s4.e eVar = (s4.e) this.f25804b;
        if (pVar == eVar.f56374y && mVar != null) {
            s4.u uVar = eVar.f56373x.f56468a;
            String d = mVar.d();
            s4.v vVar = new s4.v(uVar, d, eVar.b(uVar, d), false);
            vVar.i(mVar);
            if (eVar.d != vVar) {
                eVar.h(eVar, vVar, eVar.f56374y, 3, eVar.f56373x, collection);
                eVar.f56373x = null;
                eVar.f56374y = null;
            }
        } else if (pVar == eVar.f56356e) {
            if (mVar != null) {
                eVar.n(eVar.d, mVar);
            }
            eVar.d.n(collection);
        }
    }

    @Override
    public CharacterStyle R1(org.telegram.ui.Cells.q1 q1Var) {
        return null;
    }

    @Override
    public boolean S(org.telegram.ui.Cells.q1 q1Var) {
        return false;
    }

    @Override
    public void S1(gj gjVar, String str, String str2, String str3, String str4, int i7, int i10) {
        org.telegram.ui.Cells.z9 z9Var = (org.telegram.ui.Cells.z9) this.f25804b;
        org.telegram.ui.Cells.f fVar = z9Var.E;
        if (z9Var.a()) {
            z9Var.f32141y = 2;
            g0.r(fVar);
            g0.i3(fVar, 5000L);
        }
    }

    @Override
    public boolean T() {
        return false;
    }

    @Override
    public boolean T1(org.telegram.ui.Cells.q1 q1Var, gj gjVar) {
        return false;
    }

    @Override
    public boolean V0(org.telegram.ui.Cells.q1 q1Var, boolean z10) {
        return false;
    }

    @Override
    public void W(boolean z10) {
        ((ji.p) this.f25804b).setEditPillHidden(z10);
    }

    @Override
    public int X() {
        return 0;
    }

    @Override
    public jh.a Z() {
        return null;
    }

    @Override
    public boolean Z1(org.telegram.ui.Cells.q1 q1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public boolean a0(org.telegram.ui.Cells.q1 q1Var) {
        return false;
    }

    @Override
    public void accept(Object obj, Object obj2) {
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        s6.b bVar = (s6.b) ((s6.a) obj).n();
        Parcel j12 = bVar.j1();
        n7.a.b(j12, (q6.r) this.f25804b);
        try {
            bVar.f306b.transact(1, j12, null, 1);
            j12.recycle();
            taskCompletionSource.setResult(null);
        } catch (Throwable th2) {
            j12.recycle();
            throw th2;
        }
    }

    @Override
    public long b(long j3) {
        return 0L;
    }

    @Override
    public void b0() {
        ((org.telegram.ui.Components.y8) this.f25804b).f41932a.invalidate();
    }

    @Override
    public boolean c() {
        return ((org.telegram.ui.Cells.z9) this.f25804b).a();
    }

    @Override
    public boolean c0(org.telegram.ui.Cells.q1 q1Var, TLRPC.User user) {
        return false;
    }

    @Override
    public dr0 c2() {
        return null;
    }

    @Override
    public void d(int i7, int i10, int i11, long j3) {
        ((MediaCodec) this.f25804b).queueInputBuffer(i7, 0, i10, j3, i11);
    }

    @Override
    public void d0(RectF rectF) {
        ((ji.p) this.f25804b).l(rectF);
    }

    @Override
    public void e(int i7, k2.d dVar, long j3, int i10) {
        ((MediaCodec) this.f25804b).queueSecureInputBuffer(i7, 0, dVar.f17728i, j3, i10);
    }

    @Override
    public void f(ArrayList arrayList) {
        a8.r7 r7Var = (a8.r7) this.f25804b;
        try {
            if (!arrayList.isEmpty()) {
                dz dzVar = (dz) arrayList.get(0);
                if (dzVar.f23189c != null) {
                    File z10 = w7.z(4);
                    r7Var.f620f = new File(z10, Utilities.f22414b.nextInt() + ".jpg");
                    Point c12 = g0.c1();
                    Bitmap K = fc.K(dzVar.f23189c, null, (float) c12.x, (float) c12.y, true);
                    K.compress(Bitmap.CompressFormat.JPEG, 87, new FileOutputStream((File) r7Var.f620f));
                    ((b71) r7Var.f619e).b((File) r7Var.f620f, K, true);
                }
            }
        } catch (Throwable th2) {
            a8.g(th2, true);
        }
    }

    @Override
    public boolean f0() {
        return false;
    }

    @Override
    public boolean f1(gj gjVar) {
        return org.telegram.ui.Cells.y0.a(gjVar);
    }

    @Override
    public boolean f2(long j3) {
        return false;
    }

    @Override
    public boolean g() {
        return true;
    }

    @Override
    public boolean g0() {
        return true;
    }

    public byte g1() {
        int read = ((ab.d) this.f25804b).read();
        if (read >= 0) {
            return (byte) read;
        }
        throw new EOFException();
    }

    @Override
    public void g2(org.telegram.ui.Cells.q1 q1Var, int i7, float f10, float f11, boolean z10) {
        org.telegram.ui.Cells.z9 z9Var = (org.telegram.ui.Cells.z9) this.f25804b;
        org.telegram.ui.Cells.f fVar = z9Var.E;
        if (z9Var.a()) {
            z9Var.f32141y = 0;
            q1Var.invalidate();
            g0.r(fVar);
            g0.i3(fVar, 5000L);
        }
    }

    @Override
    public float get() {
        tg.o0 o0Var = (tg.o0) this.f25804b;
        int i7 = o0Var.f57474a;
        sg.h currentBrush = o0Var.f57477e.getCurrentBrush();
        if (currentBrush == null) {
            return sg.k0.e(i7).f56693i;
        }
        return sg.k0.e(i7).f("-1", currentBrush.d());
    }

    @Override
    public CharSequence getContentDescription() {
        pg.h hVar = (pg.h) this.f25804b;
        float f10 = hVar.f55035b;
        return String.valueOf(Math.round((hVar.f55034a.getProgress() * (hVar.f55036c - f10)) + f10));
    }

    @Override
    public String h(org.telegram.ui.Cells.q1 q1Var) {
        return null;
    }

    public int h1() {
        return ((g1() & 255) << 24) | ((g1() & 255) << 16) | ((g1() & 255) << 8) | (g1() & 255);
    }

    @Override
    public boolean h2(org.telegram.ui.Cells.q1 q1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public int i0(org.telegram.ui.Cells.q1 q1Var) {
        return 0;
    }

    @Override
    public void invalidate() {
        ((org.telegram.ui.Cells.q1) ((org.telegram.ui.Cells.j1) this.f25804b).f30478b).invalidate();
    }

    public int j1() {
        return ((g1() & Byte.MAX_VALUE) << 21) | ((g1() & Byte.MAX_VALUE) << 14) | ((g1() & Byte.MAX_VALUE) << 7) | (g1() & Byte.MAX_VALUE);
    }

    @Override
    public long k0() {
        return 0L;
    }

    @Override
    public void l(boolean z10, float f10) {
        pg.h hVar = (pg.h) this.f25804b;
        float f11 = hVar.f55035b;
        float z11 = com.google.android.gms.internal.vision.e2.z(hVar.f55036c, f11, f10, f11);
        hVar.d = z11;
        if (z10) {
            org.telegram.ui.Components.j6 j6Var = hVar.f55037e;
            j6Var.getClass();
            j6Var.c(null, z11);
        }
        hVar.invalidate();
    }

    @Override
    public boolean l0() {
        return c();
    }

    public void l1() {
        ((org.telegram.ui.ActionBar.u2) this.f25804b).f29710p0 = false;
    }

    @Override
    public void m0(boolean z10) {
        gd0 gd0Var = (gd0) this.f25804b;
        gd0Var.getClass();
        fd0 fd0Var = gd0Var.f34906a;
        if (fd0Var != null) {
            ((po0) fd0Var).n(z10);
        }
    }

    public void m1(org.telegram.ui.ge geVar) {
        ((org.telegram.ui.ActionBar.u2) this.f25804b).I0 = geVar;
    }

    public void n1(long j3) {
        long j10 = 0;
        while (j10 < j3) {
            long skip = ((ab.d) this.f25804b).skip(j3 - j10);
            if (skip > 0) {
                j10 += skip;
            } else {
                throw new EOFException();
            }
        }
    }

    @Override
    public boolean o0(org.telegram.ui.Components.p5 p5Var) {
        return false;
    }

    public void o1(com.google.android.gms.internal.clearcut.y0 y0Var, TreeMap treeMap) {
        String str;
        List list = (List) treeMap.get("Sec-WebSocket-Protocol");
        if (list != null && (str = (String) list.get(0)) != null && str.length() != 0) {
            synchronized (((rc.u) this.f25804b).f55970c) {
            }
            throw new rc.n(19, "The protocol contained in the Sec-WebSocket-Protocol header is not supported: ".concat(str), y0Var);
        }
    }

    @Override
    public void onError(u51 u51Var, Exception exc) {
        switch (this.f25803a) {
            case 8:
                a8.g(exc, true);
                return;
            default:
                return;
        }
    }

    @Override
    public void onRenderedFirstFrame() {
        int i7 = this.f25803a;
    }

    @Override
    public void onSeekFinished(m2.a aVar) {
        int i7 = this.f25803a;
    }

    @Override
    public void onSeekStarted(m2.a aVar) {
        int i7 = this.f25803a;
    }

    @Override
    public void onStateChanged(boolean z10, int i7) {
        r40 r40Var;
        g20 g20Var;
        switch (this.f25803a) {
            case 8:
                j40 j40Var = (j40) this.f25804b;
                u51 u51Var = j40Var.I0.T;
                if (u51Var != null && u51Var.d0() && i7 == 4 && (g20Var = (r40Var = j40Var.I0).S) != null) {
                    u51 u51Var2 = r40Var.T;
                    long j3 = g20Var.f23632a;
                    if (j3 <= 0) {
                        j3 = 0;
                    }
                    u51Var2.p0(j3);
                    return;
                }
                return;
            default:
                oi0 oi0Var = (oi0) this.f25804b;
                if (z10 && oi0Var.f37984n.S() >= 0) {
                    oi0Var.f37998x = true;
                }
                ke0 ke0Var = oi0Var.f37974f;
                wa0 wa0Var = oi0Var.f38000y;
                ke0Var.a(z10, true);
                g0.r(wa0Var);
                if (z10) {
                    g0.i3(wa0Var, 16L);
                    return;
                }
                return;
        }
    }

    @Override
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        switch (this.f25803a) {
            case 8:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        int i7 = this.f25803a;
    }

    @Override
    public void onVideoSizeChanged(int i7, int i10, int i11, float f10) {
        int i12 = this.f25803a;
    }

    @Override
    public int p0() {
        return 0;
    }

    @Override
    public void p1(org.telegram.ui.Cells.q1 q1Var, int i7) {
        org.telegram.ui.Cells.z9 z9Var = (org.telegram.ui.Cells.z9) this.f25804b;
        org.telegram.ui.Cells.f fVar = z9Var.E;
        if (z9Var.a()) {
            z9Var.f32141y = 2;
            q1Var.invalidate();
            g0.r(fVar);
            g0.i3(fVar, 5000L);
        }
    }

    @Override
    public boolean p2(org.telegram.ui.Cells.q1 q1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public boolean q() {
        return false;
    }

    public Object q1() {
        if (q7.a.f55408b == null) {
            q7.a.f55408b = new Exception();
        }
        synchronized (q7.a.f55407a) {
        }
        throw new IllegalStateException("Must call PhenotypeContext.setContext() first");
    }

    @Override
    public void r0(float f10) {
        tg.o0 o0Var = (tg.o0) this.f25804b;
        sg.k0.e(o0Var.f57474a).k("-1", f10);
        o0Var.f57477e.setBrushSize(f10);
    }

    @Override
    public boolean s(float f10) {
        return false;
    }

    @Override
    public void s0() {
        try {
            Intent intent = new Intent("android.intent.action.PICK");
            intent.setType("image/*");
            ((Activity) ((a8.r7) this.f25804b).f618c).startActivityForResult(intent, 11);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override
    public void setParameters(Bundle bundle) {
        ((MediaCodec) this.f25804b).setParameters(bundle);
    }

    @Override
    public long t0(long j3) {
        return 1L;
    }

    public String toString() {
        switch (this.f25803a) {
            case 22:
                return "ProviderMetadata{ componentName=" + ((ComponentName) this.f25804b).flattenToShortString() + " }";
            default:
                return super.toString();
        }
    }

    @Override
    public long v0(long j3, long j10) {
        return 1L;
    }

    @Override
    public boolean v2(int i7) {
        return false;
    }

    @Override
    public String x(long j3) {
        return null;
    }

    @Override
    public ji.p x0() {
        return (ji.p) this.f25804b;
    }

    @Override
    public boolean x1() {
        return false;
    }

    @Override
    public long y(long j3, long j10) {
        return 0L;
    }

    @Override
    public boolean y0(gj gjVar) {
        return true;
    }

    @Override
    public boolean z1(org.telegram.ui.Cells.q1 q1Var, int i7) {
        if (i7 == ((org.telegram.ui.Cells.z9) this.f25804b).f32141y) {
            return true;
        }
        return false;
    }

    @Override
    public org.telegram.ui.Cells.i9 z2() {
        return null;
    }

    public ou(int i7) {
        this.f25803a = i7;
        switch (i7) {
            case 19:
                this.f25804b = new org.telegram.utils.twidget.v(1.0f, 5, 1, false);
                return;
            default:
                return;
        }
    }

    @Override
    public void onRenderedFirstFrame(m2.a aVar) {
        int i7 = this.f25803a;
    }

    public ou(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this.f25803a = 18;
        this.f25804b = new GestureDetector(context, onGestureListener, null);
    }

    public ou(TextView textView) {
        this.f25803a = 25;
        this.f25804b = new t1.g(textView);
    }

    public ou(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        this.f25803a = 1;
        org.telegram.ui.ActionBar.u2 u2Var = new org.telegram.ui.ActionBar.u2(1, context, e6Var, false);
        this.f25804b = u2Var;
        u2Var.O();
    }

    private final void K0() {
    }

    private final void P0() {
    }

    @Override
    public void A0() {
    }

    @Override
    public void C() {
    }

    @Override
    public void U1() {
    }

    @Override
    public void Y() {
    }

    @Override
    public void a() {
    }

    @Override
    public void flush() {
    }

    @Override
    public void i1() {
    }

    @Override
    public void k() {
    }

    @Override
    public void p() {
    }

    @Override
    public void s2() {
    }

    @Override
    public void shutdown() {
    }

    @Override
    public void start() {
    }

    @Override
    public void t() {
    }

    @Override
    public void v() {
    }

    @Override
    public void x2() {
    }

    private final void M0(m2.a aVar) {
    }

    private final void Q0(m2.a aVar) {
    }

    private final void S0(m2.a aVar) {
    }

    private final void U0(m2.a aVar) {
    }

    private final void Y0(m2.a aVar) {
    }

    private final void Z0(m2.a aVar) {
    }

    private final void a1(SurfaceTexture surfaceTexture) {
    }

    private final void b1(SurfaceTexture surfaceTexture) {
    }

    @Override
    public void B(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public void C1(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public void F0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public void H(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public void I0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public void J(dj djVar) {
    }

    @Override
    public void L1(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public void N(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public void N0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public void O1(gj gjVar) {
    }

    @Override
    public void P(gj gjVar) {
    }

    @Override
    public void V(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public void W0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public void X0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public void e0(int i7) {
    }

    @Override
    public void j0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public void j2(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public void n(boolean z10) {
    }

    @Override
    public void n0(String str) {
    }

    @Override
    public void o(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public void q2(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public void r(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public void u(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public void w(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public void z(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public void z0(org.telegram.ui.Cells.q1 q1Var) {
    }

    private final void J0(u51 u51Var, Exception exc) {
    }

    @Override
    public void F1(org.telegram.ui.Cells.q1 q1Var, boolean z10) {
    }

    @Override
    public void G(org.telegram.ui.Cells.q1 q1Var, o2 o2Var) {
    }

    @Override
    public void I1(org.telegram.ui.Cells.q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void K1(org.telegram.ui.Cells.q1 q1Var, int i7) {
    }

    @Override
    public void O(int i7, Drawable drawable) {
    }

    @Override
    public void O0(org.telegram.ui.Cells.q1 q1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public void X1(org.telegram.ui.Cells.q1 q1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public void a2(org.telegram.ui.Cells.q1 q1Var, l10 l10Var) {
    }

    @Override
    public void e2(String str, String str2) {
    }

    @Override
    public long i(long j3, long j10) {
        return j10;
    }

    @Override
    public void k1(org.telegram.ui.Cells.q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void l2(org.telegram.ui.Cells.q1 q1Var, long j3) {
    }

    @Override
    public void B0(org.telegram.ui.Cells.q1 q1Var, TLObject tLObject, boolean z10) {
    }

    @Override
    public void B1(org.telegram.ui.Cells.q1 q1Var, boolean z10, boolean z11) {
    }

    @Override
    public void C0(org.telegram.ui.Cells.q1 q1Var, float f10, float f11) {
    }

    @Override
    public void H0(org.telegram.ui.Cells.q1 q1Var, boolean z10, boolean z11) {
    }

    @Override
    public void K(org.telegram.ui.Cells.q1 q1Var, TLRPC.Document document, RectF rectF) {
    }

    @Override
    public void T0(org.telegram.ui.Cells.q1 q1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override
    public void h0(org.telegram.ui.Cells.q1 q1Var, float f10, float f11) {
    }

    @Override
    public void q0(org.telegram.ui.Cells.q1 q1Var, float f10, float f11) {
    }

    @Override
    public void t1(org.telegram.ui.Cells.q1 q1Var, float f10, float f11) {
    }

    @Override
    public void y2(org.telegram.ui.Cells.q1 q1Var, int i7, int i10) {
    }

    private final void c1(int i7, int i10, float f10, int i11) {
    }

    private final void d1(int i7, int i10, float f10, int i11) {
    }

    @Override
    public void I(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
    }

    @Override
    public void Y1(org.telegram.ui.Cells.q1 q1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public void m(org.telegram.ui.Cells.q1 q1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i7) {
    }

    @Override
    public void u0(org.telegram.ui.Cells.q1 q1Var, TLRPC.User user, float f10, float f11) {
    }

    @Override
    public void w0(org.telegram.ui.Cells.q1 q1Var, float f10, float f11, boolean z10) {
    }

    @Override
    public void j(org.telegram.ui.Cells.q1 q1Var, ArrayList arrayList, int i7, int i10, int i11) {
    }

    @Override
    public void t2(org.telegram.ui.Cells.q1 q1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
    }

    @Override
    public void U(org.telegram.ui.Cells.q1 q1Var, TLRPC.Chat chat, int i7, float f10, float f11, boolean z10) {
    }
}
