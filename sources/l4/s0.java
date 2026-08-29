package l4;

import ag.m2;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.exoplayer2.extractor.FlacStreamMetadata;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import lh.a7;
import lh.b5;
import lh.c9;
import lh.f2;
import lh.i9;
import lh.w8;
import lh.x7;
import lh.x8;
import lh.y7;
import lh.z7;
import nh.aa;
import nh.ca;
import nh.f9;
import nh.gb;
import nh.i5;
import nh.j6;
import nh.j9;
import nh.ja;
import nh.n1;
import nh.o6;
import nh.o7;
import nh.va;
import nh.wa;
import nh.y9;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Cells.h5;
import org.telegram.ui.Cells.m8;
import org.telegram.ui.Cells.q8;
import org.telegram.ui.Components.al0;
import org.telegram.ui.Components.bl0;
import org.telegram.ui.Components.c5;
import org.telegram.ui.Components.fr0;
import org.telegram.ui.Components.nk0;
import org.telegram.ui.Components.w41;
import org.telegram.ui.web.t1;
import org.telegram.ui.yu0;
import org.webrtc.GlGenericDrawer;
import ph.x3;
public final class s0 implements bl0, Utilities.Callback2Return, al0, b2, a7, c9, gh.o, r0.o, nk0, Utilities.Callback5, m2, CameraController.VideoTakeCallback, Vector.TLDeserializer, GlGenericDrawer.TextureCallback, org.telegram.ui.Components.voip.k1, o3.c {
    public final int f14422a;
    public final Object f14423b;

    public s0(Object obj, int i10) {
        this.f14422a = i10;
        this.f14423b = obj;
    }

    @Override
    public r0.m1 I0(View view, r0.m1 m1Var) {
        int a2;
        i9 i9Var = (i9) this.f14423b;
        int i10 = 0;
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) i9Var.v.getLayoutParams();
        if (!i9Var.f15748c) {
            i10 = m1Var.d();
        }
        marginLayoutParams.topMargin = i10;
        if (i9Var.f15748c) {
            a2 = m1Var.f46843a.f(2).d;
        } else {
            a2 = m1Var.a();
        }
        marginLayoutParams.bottomMargin = a2;
        marginLayoutParams.leftMargin = defaultWindowInsets.f8186a;
        marginLayoutParams.rightMargin = defaultWindowInsets.f8188c;
        w8 w8Var = i9Var.f15783s;
        if (w8Var != null) {
            w8Var.requestLayout();
        }
        x8 x8Var = i9Var.v;
        if (x8Var != null) {
            x8Var.requestLayout();
        }
        return r0.m1.f46842b;
    }

    @Override
    public void a() {
        ((n1) this.f14423b).invalidate();
    }

    @Override
    public void b(float f9, float f10, int i10, View view) {
        long j10;
        long j11;
        int i11;
        int i12;
        int i13;
        f2 f2Var = (f2) this.f14423b;
        jh.e1 e1Var = f2Var.f16279c;
        ArrayList arrayList = f2Var.f16284r;
        lh.t0 t0Var = ((lh.r0) view).f16148f;
        int i14 = f2Var.J;
        int currentTime = ConnectionsManager.getInstance(i14).getCurrentTime();
        HashSet hashSet = new HashSet();
        int i15 = 0;
        int i16 = 0;
        while (true) {
            j10 = 0;
            if (i16 >= t0Var.f16254f.size()) {
                break;
            }
            lh.s0 s0Var = (lh.s0) t0Var.f16254f.get(i16);
            long j12 = s0Var.f16199g;
            if (j12 > 0 && currentTime - s0Var.d <= lh.s.b(i14, (int) j12, 0)) {
                hashSet.add(Integer.valueOf(s0Var.f16194a));
            }
            i16++;
        }
        lh.d1 d1Var = f2Var.L;
        if (d1Var != null) {
            j10 = d1Var.j();
        }
        int i17 = 0;
        int i18 = 0;
        while (i17 < arrayList.size()) {
            lh.s0 s0Var2 = (lh.s0) arrayList.get(i17);
            if (!s0Var2.f16195b && s0Var2.f16197e && s0Var2.f16199g < j10) {
                j11 = j10;
            } else {
                if (hashSet.contains(Integer.valueOf(s0Var2.f16194a))) {
                    j11 = j10;
                    if (f2Var.f16286w != t0Var.f16251b || (i13 = f2Var.f16287x) == 0 || s0Var2.f16194a < i13) {
                        i11 = s0Var2.f16194a;
                        break;
                    }
                } else {
                    j11 = j10;
                }
                i18++;
            }
            i17++;
            j10 = j11;
        }
        j11 = j10;
        i11 = -1;
        if (i11 < 0) {
            int i19 = 0;
            while (true) {
                if (i15 < arrayList.size()) {
                    lh.s0 s0Var3 = (lh.s0) arrayList.get(i15);
                    if (s0Var3.f16195b || !s0Var3.f16197e || s0Var3.f16199g >= j11) {
                        if (hashSet.contains(Integer.valueOf(s0Var3.f16194a))) {
                            i12 = s0Var3.f16194a;
                            i18 = i19;
                            break;
                        }
                        i19++;
                    }
                    i15++;
                } else {
                    i18 = i19;
                    i12 = -1;
                    break;
                }
            }
        } else {
            i12 = i11;
        }
        if (i12 < 0) {
            return;
        }
        f2Var.f16286w = t0Var.f16251b;
        f2Var.f16287x = i12;
        f2Var.f16288y = true;
        f2.u0 itemAnimator = e1Var.getItemAnimator();
        e1Var.setItemAnimator(null);
        f2Var.d.i1(i18, e1Var.getHeight() / 2, true);
        f2Var.f16281e.m(i18);
        e1Var.setItemAnimator(itemAnimator);
    }

    @Override
    public boolean b1(View view) {
        return false;
    }

    @Override
    public boolean c(int r33, final android.view.View r34) {
        throw new UnsupportedOperationException("Method not decompiled: l4.s0.c(int, android.view.View):boolean");
    }

    @Override
    public void d(boolean z10) {
        b5 b5Var = (b5) this.f14423b;
        if (b5Var != null) {
            b5Var.c();
        }
    }

    @Override
    public TLObject deserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
        TLRPC.PhotoSize lambda$readParams$0;
        TLRPC.PhotoSize lambda$readParams$02;
        switch (this.f14422a) {
            case 19:
                lambda$readParams$0 = ((TLRPC.TL_stickerSet) this.f14423b).lambda$readParams$0(inputSerializedData, i10, z10);
                return lambda$readParams$0;
            default:
                lambda$readParams$02 = ((TLRPC.TL_stickerSet_layer143) this.f14423b).lambda$readParams$0(inputSerializedData, i10, z10);
                return lambda$readParams$02;
        }
    }

    @Override
    public void e() {
        float f9;
        ja jaVar = (ja) this.f14423b;
        TextView textView = jaVar.f18642k1;
        boolean a2 = jaVar.f18670z0.a();
        ImageView imageView = jaVar.f18640j1;
        imageView.animate().cancel();
        ViewPropertyAnimator animate = imageView.animate();
        float f10 = 0.6f;
        if (a2) {
            f9 = 1.0f;
        } else {
            f9 = 0.6f;
        }
        animate.alpha(f9).translationY(0.0f).setDuration(150L).start();
        imageView.setClickable(a2);
        textView.animate().cancel();
        ViewPropertyAnimator animate2 = textView.animate();
        if (a2) {
            f10 = 1.0f;
        }
        animate2.alpha(f10).translationY(0.0f).setDuration(150L).start();
        textView.setClickable(a2);
    }

    @Override
    public void f(float f9, Canvas canvas, RectF rectF, boolean z10) {
        Path path = (Path) this.f14423b;
        if (z10) {
            return;
        }
        path.rewind();
        float pow = (float) Math.pow(f9, 2.0d);
        path.addCircle((rectF.right + AndroidUtilities.dp(7.0f)) - (AndroidUtilities.dp(14.0f) * pow), (rectF.bottom + AndroidUtilities.dp(7.0f)) - (AndroidUtilities.dp(14.0f) * pow), AndroidUtilities.dp(11.0f), Path.Direction.CW);
        canvas.clipPath(path, Region.Op.DIFFERENCE);
    }

    @Override
    public void g(c2 c2Var, int i10) {
        switch (this.f14422a) {
            case 4:
                ((Runnable) this.f14423b).run();
                return;
            case 12:
                gb gbVar = ((wa) ((nh.r) this.f14423b)).O1;
                va vaVar = gbVar.T0;
                if (vaVar != null) {
                    vaVar.s(null, null, true);
                }
                ja jaVar = gbVar.f17792r1;
                if (jaVar != null) {
                    jaVar.q0();
                }
                wa waVar = gbVar.Y0;
                if (waVar != null) {
                    waVar.setHasRoundVideo(false);
                }
                o7 o7Var = gbVar.G1;
                if (o7Var != null) {
                    File file = o7Var.f18285o0;
                    if (file != null) {
                        try {
                            file.delete();
                        } catch (Exception unused) {
                        }
                        gbVar.G1.f18285o0 = null;
                    }
                    if (gbVar.G1.f18287p0 != null) {
                        try {
                            new File(gbVar.G1.f18287p0).delete();
                        } catch (Exception unused2) {
                        }
                        gbVar.G1.f18287p0 = null;
                        return;
                    }
                    return;
                }
                return;
            case 17:
                ((i5) this.f14423b).f17884a.f18644l2.r();
                return;
            case 23:
                ((org.telegram.ui.web.a0) this.f14423b).run();
                return;
            case 24:
                ((ph.d) this.f14423b).run();
                return;
            default:
                ph.j jVar = (ph.j) this.f14423b;
                TL_bots.updateStarRefProgram updatestarrefprogram = new TL_bots.updateStarRefProgram();
                updatestarrefprogram.bot = jVar.getMessagesController().getInputUser(jVar.L);
                updatestarrefprogram.commission_permille = 0;
                c2 c2Var2 = new c2(jVar.getParentActivity(), 3, null);
                c2Var2.q(150L);
                jVar.getConnectionsManager().sendRequest(updatestarrefprogram, new ph.b(jVar, c2Var2, 0));
                return;
        }
    }

    @Override
    public long l(long j10) {
        return ((FlacStreamMetadata) this.f14423b).getSampleNumber(j10);
    }

    @Override
    public void m(gh.k kVar, float f9, float f10) {
        y7 y7Var = (y7) this.f14423b;
        z7 z7Var = y7Var.v;
        if (!z7Var.f16476x) {
            kVar.f7417q = new x7(y7Var, 2);
            float sqrt = (float) Math.sqrt(Math.pow(z7Var.getHeight(), 2.0d) + Math.pow(z7Var.getWidth(), 2.0d));
            ArrayList arrayList = y7Var.f16428i;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((gh.k) obj).j(f9, f10, sqrt, false);
            }
        }
    }

    @Override
    public void onFinishVideoRecording(String str, long j10) {
        ca caVar = (ca) this.f14423b;
        gb gbVar = caVar.f17486a;
        o6 o6Var = gbVar.K0;
        int i10 = gbVar.f17743c;
        if (o6Var != null) {
            o6Var.g(true);
        }
        if (gbVar.q0()) {
            gbVar.f17794s.d();
        }
        if (gbVar.C1 != null && gbVar.f17812x0 != null) {
            gbVar.M1 = false;
            gbVar.N1 = false;
            j6 j6Var = gbVar.f17816y0;
            if (j6Var != null) {
                j6Var.c(false);
            }
            if (j10 <= 800) {
                gbVar.h(false, true);
                gbVar.d0(false);
                gbVar.F0.b(false, true);
                o6 o6Var2 = gbVar.K0;
                if (o6Var2 != null) {
                    o6Var2.g(true);
                }
                try {
                    gbVar.C1.delete();
                    gbVar.C1 = null;
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                if (str != null) {
                    try {
                        new File(str).delete();
                        return;
                    } catch (Exception e11) {
                        FileLog.e(e11);
                        return;
                    }
                }
                return;
            }
            gbVar.i0(false, true);
            o7 o10 = o7.o(gbVar.C1, str, j10);
            o10.J0 = gbVar.f17791r0;
            o10.K0 = gbVar.f17795s0;
            o10.B();
            gbVar.h(false, true);
            gbVar.d0(false);
            gbVar.F0.b(false, true);
            o6 o6Var3 = gbVar.K0;
            if (o6Var3 != null) {
                o6Var3.g(true);
            }
            if (gbVar.f17808w0.j()) {
                gbVar.C1 = null;
                o10.P = 1.0f;
                if (gbVar.f17808w0.l(o10)) {
                    o7 a2 = o7.a(gbVar.f17808w0.getLayout(), gbVar.f17808w0.getContent());
                    gbVar.G1 = a2;
                    f9.a(i10, a2);
                    gbVar.H1 = false;
                    int videoWidth = gbVar.f17812x0.getVideoWidth();
                    int videoHeight = gbVar.f17812x0.getVideoHeight();
                    if (videoWidth > 0 && videoHeight > 0) {
                        o7 o7Var = gbVar.G1;
                        o7Var.f18278k0 = videoWidth;
                        o7Var.f18280l0 = videoHeight;
                        o7Var.A();
                    }
                }
                gbVar.m0(true);
                return;
            }
            gbVar.G1 = o10;
            f9.a(i10, o10);
            gbVar.H1 = false;
            int videoWidth2 = gbVar.f17812x0.getVideoWidth();
            int videoHeight2 = gbVar.f17812x0.getVideoHeight();
            if (videoWidth2 > 0 && videoHeight2 > 0) {
                o7 o7Var2 = gbVar.G1;
                o7Var2.f18278k0 = videoWidth2;
                o7Var2.f18280l0 = videoHeight2;
                o7Var2.A();
            }
            gbVar.L(new aa(caVar, 3), 0L);
        }
    }

    @Override
    public void mo19run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i10;
        switch (this.f14422a) {
            case 15:
                y9 y9Var = (y9) this.f14423b;
                w41 w41Var = (w41) obj;
                View view = (View) obj2;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                int i11 = w41Var.d;
                o7 o7Var = (o7) w41Var.G;
                y9Var.c(false, true);
                gb gbVar = y9Var.K;
                if (o7Var == gbVar.G1 || gbVar.T1) {
                    return;
                }
                gbVar.Z0.setSelected(i11);
                gbVar.T1 = true;
                bg.f fVar = new bg.f(gbVar, i11, 14);
                ja jaVar = gbVar.f17792r1;
                o7 o7Var2 = gbVar.G1;
                if (jaVar != null && o7Var2 != null) {
                    if (!jaVar.u0()) {
                        fVar.run();
                        return;
                    }
                    o7Var2.f();
                    Utilities.searchQueue.postRunnable(new j9(gbVar, jaVar, o7Var2.f18274i0, o7Var2.f18276j0, o7Var2, jaVar.K0.getPainting().E, jaVar.u0(), fVar, 0));
                    return;
                }
                fVar.run();
                return;
            case 26:
                View view2 = (View) obj2;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                ((x3) this.f14423b).V((w41) obj);
                return;
            case 28:
                sf.x0 x0Var = (sf.x0) this.f14423b;
                w41 w41Var2 = (w41) obj;
                View view3 = (View) obj2;
                ((Integer) obj3).getClass();
                float floatValue = ((Float) obj4).floatValue();
                ((Float) obj5).getClass();
                int i12 = w41Var2.d;
                if (i12 == -1) {
                    boolean z10 = !x0Var.f48003e;
                    x0Var.f48003e = z10;
                    ((q8) view3).setChecked(z10);
                    x0Var.f48000a.U2.N(true);
                    x0Var.Y(true);
                    return;
                } else if (i12 == -2) {
                    ?? o2Var = new o2(null);
                    o2Var.f47968n = x0Var.f48006r;
                    o2Var.f47965c = new yu0(19, x0Var, view3);
                    x0Var.presentFragment((o2) o2Var);
                    return;
                } else if (w41Var2.f50845a != 5 || i12 < 0 || i12 >= x0Var.h.length) {
                    return;
                } else {
                    if (!LocaleController.isRTL ? floatValue >= view3.getMeasuredWidth() - AndroidUtilities.dp(76.0f) : floatValue <= AndroidUtilities.dp(76.0f)) {
                        if (x0Var.h[w41Var2.d].isEmpty()) {
                            ((h5) view3).setChecked(true);
                            x0Var.h[w41Var2.d].add(new sf.w0(0, 1439));
                            x0Var.X(w41Var2.d);
                        } else {
                            x0Var.h[w41Var2.d].clear();
                            ((h5) view3).setChecked(false);
                        }
                        ((h5) view3).setValue(sf.x0.a0(x0Var.h[w41Var2.d]));
                        x0Var.Y(true);
                        return;
                    }
                    int i13 = (w41Var2.d + 6) % 7;
                    int i14 = 0;
                    for (int i15 = 0; i15 < x0Var.h[i13].size(); i15++) {
                        if (((sf.w0) x0Var.h[i13].get(i15)).f47998b > i14) {
                            i14 = ((sf.w0) x0Var.h[i13].get(i15)).f47998b;
                        }
                    }
                    int max = Math.max(0, i14 - 1439);
                    int i16 = (w41Var2.d + 1) % 7;
                    int i17 = 1440;
                    for (int i18 = 0; i18 < x0Var.h[i16].size(); i18++) {
                        if (((sf.w0) x0Var.h[i16].get(i18)).f47997a < i17) {
                            i17 = ((sf.w0) x0Var.h[i16].get(i18)).f47997a;
                        }
                    }
                    int i19 = i17 + 1439;
                    CharSequence charSequence = w41Var2.f34300l;
                    ArrayList arrayList = x0Var.h[w41Var2.d];
                    int i20 = 0;
                    for (int i21 = 0; i21 < 7; i21++) {
                        ArrayList arrayList2 = x0Var.h[i21];
                        if (arrayList2 != null) {
                            i20 = Math.max(1, arrayList2.size()) + i20;
                        }
                    }
                    sf.z0 z0Var = new sf.z0(charSequence, arrayList, max, i19, 28 - i20);
                    z0Var.f48016f = new t1(x0Var, 19);
                    z0Var.h = new org.telegram.ui.web.y(29, x0Var, w41Var2);
                    x0Var.presentFragment(z0Var);
                    return;
                }
            default:
                final sf.z0 z0Var2 = (sf.z0) this.f14423b;
                w41 w41Var3 = (w41) obj;
                final View view4 = (View) obj2;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                int i22 = z0Var2.f48014c;
                int i23 = z0Var2.d;
                ArrayList arrayList3 = z0Var2.f48013b;
                int i24 = w41Var3.d;
                if (i24 == -1) {
                    z0Var2.f48018r = !z0Var2.f48018r;
                    arrayList3.clear();
                    if (z0Var2.f48018r) {
                        arrayList3.add(new sf.w0(0, 1439));
                    }
                    q8 q8Var = (q8) view4;
                    boolean z11 = z0Var2.f48018r;
                    w41Var3.f34294e = z11;
                    q8Var.setChecked(z11);
                    boolean z12 = z0Var2.f48018r;
                    q8Var.b(g6.w0(null, z12 ? g6.f23099f6 : g6.f23080e6, false), z12);
                    z0Var2.f48017n.U2.N(true);
                    t1 t1Var = z0Var2.f48016f;
                    if (t1Var != null) {
                        t1Var.run();
                        return;
                    }
                    return;
                } else if (i24 == -2) {
                    if (!arrayList3.isEmpty() && !z0Var2.U()) {
                        int i25 = ((sf.w0) j7.l1.i(1, arrayList3)).f47998b;
                        int clamp = Utilities.clamp(i25 + 30, i23 - 1, i22);
                        arrayList3.add(new sf.w0(clamp, Utilities.clamp((i25 + 1560) / 2, i23, clamp + 1)));
                    } else {
                        if (z0Var2.U()) {
                            arrayList3.clear();
                        }
                        int clamp2 = Utilities.clamp(480, i23 - 1, i22);
                        arrayList3.add(new sf.w0(clamp2, Utilities.clamp(1200, i23, clamp2 + 1)));
                    }
                    t1 t1Var2 = z0Var2.f48016f;
                    if (t1Var2 != null) {
                        t1Var2.run();
                    }
                    z0Var2.f48017n.U2.N(true);
                    return;
                } else if (w41Var3.f50845a != 3 || (i10 = i24 / 3) < 0 || i10 >= arrayList3.size()) {
                    return;
                } else {
                    int i26 = i10 - 1;
                    sf.w0 w0Var = i26 >= 0 ? (sf.w0) arrayList3.get(i26) : null;
                    final sf.w0 w0Var2 = (sf.w0) arrayList3.get(i10);
                    int i27 = i10 + 1;
                    sf.w0 w0Var3 = i27 < arrayList3.size() ? (sf.w0) arrayList3.get(i27) : null;
                    int i28 = w41Var3.d % 3;
                    if (i28 == 0) {
                        Activity parentActivity = z0Var2.getParentActivity();
                        String string = LocaleController.getString(R.string.BusinessHoursDayOpenHourPicker);
                        int i29 = w0Var2.f47997a;
                        if (w0Var != null) {
                            i22 = w0Var.f47998b + 1;
                        }
                        c5.X(parentActivity, string, i29, i22, w0Var2.f47998b - 1, new Utilities.Callback() {
                            @Override
                            public final void run(Object obj6) {
                                Integer num = (Integer) obj6;
                                switch (r4) {
                                    case 0:
                                        z0 z0Var3 = z0Var2;
                                        boolean V = z0Var3.V();
                                        int intValue = num.intValue();
                                        w0Var2.f47997a = intValue;
                                        ((m8) view4).u(w0.a(intValue), true);
                                        if (V != z0Var3.V()) {
                                            z0Var3.f48017n.U2.N(true);
                                        }
                                        org.telegram.ui.web.t1 t1Var3 = z0Var3.f48016f;
                                        if (t1Var3 != null) {
                                            t1Var3.run();
                                            return;
                                        }
                                        return;
                                    default:
                                        z0 z0Var4 = z0Var2;
                                        boolean V2 = z0Var4.V();
                                        int intValue2 = num.intValue();
                                        w0Var2.f47998b = intValue2;
                                        ((m8) view4).u(w0.a(intValue2), true);
                                        if (V2 != z0Var4.V()) {
                                            z0Var4.f48017n.U2.N(true);
                                        }
                                        org.telegram.ui.web.t1 t1Var4 = z0Var4.f48016f;
                                        if (t1Var4 != null) {
                                            t1Var4.run();
                                            return;
                                        }
                                        return;
                                }
                            }
                        });
                        return;
                    } else if (i28 == 1) {
                        Activity parentActivity2 = z0Var2.getParentActivity();
                        String string2 = LocaleController.getString(R.string.BusinessHoursDayCloseHourPicker);
                        int i30 = w0Var2.f47998b;
                        int i31 = w0Var2.f47997a + 1;
                        if (w0Var3 != null) {
                            i23 = w0Var3.f47997a - 1;
                        }
                        c5.X(parentActivity2, string2, i30, i31, i23, new Utilities.Callback() {
                            @Override
                            public final void run(Object obj6) {
                                Integer num = (Integer) obj6;
                                switch (r4) {
                                    case 0:
                                        z0 z0Var3 = z0Var2;
                                        boolean V = z0Var3.V();
                                        int intValue = num.intValue();
                                        w0Var2.f47997a = intValue;
                                        ((m8) view4).u(w0.a(intValue), true);
                                        if (V != z0Var3.V()) {
                                            z0Var3.f48017n.U2.N(true);
                                        }
                                        org.telegram.ui.web.t1 t1Var3 = z0Var3.f48016f;
                                        if (t1Var3 != null) {
                                            t1Var3.run();
                                            return;
                                        }
                                        return;
                                    default:
                                        z0 z0Var4 = z0Var2;
                                        boolean V2 = z0Var4.V();
                                        int intValue2 = num.intValue();
                                        w0Var2.f47998b = intValue2;
                                        ((m8) view4).u(w0.a(intValue2), true);
                                        if (V2 != z0Var4.V()) {
                                            z0Var4.f48017n.U2.N(true);
                                        }
                                        org.telegram.ui.web.t1 t1Var4 = z0Var4.f48016f;
                                        if (t1Var4 != null) {
                                            t1Var4.run();
                                            return;
                                        }
                                        return;
                                }
                            }
                        });
                        return;
                    } else if (i28 == 2) {
                        arrayList3.remove(i10);
                        if (arrayList3.isEmpty()) {
                            arrayList3.add(new sf.w0(0, 1439));
                        }
                        z0Var2.f48017n.U2.N(true);
                        t1 t1Var3 = z0Var2.f48016f;
                        if (t1Var3 != null) {
                            t1Var3.run();
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
        }
    }

    @Override
    public void o0(View view, float f9, float f10) {
    }

    @Override
    public Object run(Object obj, Object obj2) {
        switch (this.f14422a) {
            case 2:
                Long l10 = (Long) obj;
                return lh.u0.a((lh.u0) this.f14423b, (Long) obj2);
            default:
                fr0 fr0Var = (fr0) this.f14423b;
                Integer num = (Integer) obj2;
                if (((Integer) obj).intValue() == -1) {
                    new mh.u(fr0Var.f17056a, LocaleController.getString(R.string.ProfileBotPreviewLanguageChoose), new ag.i0(fr0Var, 28)).show();
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
        }
    }

    @Override
    public void run(Bitmap bitmap, int i10) {
        org.telegram.ui.Components.voip.u uVar = (org.telegram.ui.Components.voip.u) this.f14423b;
        if (bitmap == null || bitmap.getPixel(0, 0) == 0) {
            return;
        }
        Utilities.stackBlurBitmap(bitmap, Math.max(7, Math.max(bitmap.getWidth(), bitmap.getHeight()) / 180));
        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.voip.o(0, uVar, bitmap));
    }
}
