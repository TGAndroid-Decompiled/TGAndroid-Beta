package lh;

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
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
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
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.kl0;
import org.telegram.ui.Components.nr0;
import org.telegram.ui.Components.yk0;
import org.telegram.ui.io0;
import org.webrtc.GlGenericDrawer;
public final class m5 implements Utilities.Callback5, io0, kl0, Utilities.Callback2Return, jl0, org.telegram.ui.ActionBar.c2, nh.b7, nh.c9, ih.o, r0.o, Vector.TLDeserializer, GlGenericDrawer.TextureCallback, org.telegram.ui.Components.voip.j1, yk0, cg.h2, CameraController.VideoTakeCallback {
    public final int f12798a;
    public final Object f12799b;

    public m5(Object obj, int i10) {
        this.f12798a = i10;
        this.f12799b = obj;
    }

    @Override
    public r0.m1 N0(View view, r0.m1 m1Var) {
        int a2;
        nh.i9 i9Var = (nh.i9) this.f12799b;
        int i10 = 0;
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) i9Var.v.getLayoutParams();
        if (!i9Var.f15454c) {
            i10 = m1Var.d();
        }
        marginLayoutParams.topMargin = i10;
        if (i9Var.f15454c) {
            a2 = m1Var.f43130a.f(2).d;
        } else {
            a2 = m1Var.a();
        }
        marginLayoutParams.bottomMargin = a2;
        marginLayoutParams.leftMargin = defaultWindowInsets.f7213a;
        marginLayoutParams.rightMargin = defaultWindowInsets.f7215c;
        nh.w8 w8Var = i9Var.f15488s;
        if (w8Var != null) {
            w8Var.requestLayout();
        }
        nh.x8 x8Var = i9Var.v;
        if (x8Var != null) {
            x8Var.requestLayout();
        }
        return r0.m1.f43129b;
    }

    @Override
    public void a(int i10) {
        switch (this.f12798a) {
            case 1:
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.f12799b;
                if (i10 == 1) {
                    callback2.run(Boolean.TRUE, null);
                    return;
                } else if (i10 != 3) {
                    callback2.run(Boolean.FALSE, null);
                    return;
                } else {
                    return;
                }
            case 2:
                dh.v vVar = (dh.v) this.f12799b;
                if (i10 == 1) {
                    vVar.run(Boolean.TRUE, null);
                    return;
                } else if (i10 != 3) {
                    vVar.run(Boolean.FALSE, null);
                    return;
                } else {
                    return;
                }
            default:
                kh.i5 i5Var = (kh.i5) this.f12799b;
                if (i10 == 1) {
                    i5Var.run(Boolean.TRUE, null);
                    return;
                } else if (i10 != 3) {
                    i5Var.run(Boolean.FALSE, null);
                    return;
                } else {
                    return;
                }
        }
    }

    @Override
    public void b(boolean z4) {
        nh.c5 c5Var = (nh.c5) this.f12799b;
        if (c5Var != null) {
            c5Var.c();
        }
    }

    @Override
    public void c(float f10, float f11, int i10, View view) {
        long j10;
        long j11;
        int i11;
        int i12;
        int i13;
        nh.g2 g2Var = (nh.g2) this.f12799b;
        e1 e1Var = g2Var.f15973c;
        ArrayList arrayList = g2Var.f15978r;
        nh.u0 u0Var = ((nh.s0) view).f15863f;
        int i14 = g2Var.K;
        int currentTime = ConnectionsManager.getInstance(i14).getCurrentTime();
        HashSet hashSet = new HashSet();
        int i15 = 0;
        int i16 = 0;
        while (true) {
            j10 = 0;
            if (i16 >= u0Var.f15950f.size()) {
                break;
            }
            nh.t0 t0Var = (nh.t0) u0Var.f15950f.get(i16);
            long j12 = t0Var.f15900g;
            if (j12 > 0 && currentTime - t0Var.d <= nh.t.b(i14, (int) j12, 0)) {
                hashSet.add(Integer.valueOf(t0Var.f15896a));
            }
            i16++;
        }
        nh.e1 e1Var2 = g2Var.M;
        if (e1Var2 != null) {
            j10 = e1Var2.j();
        }
        int i17 = 0;
        int i18 = 0;
        while (i17 < arrayList.size()) {
            nh.t0 t0Var2 = (nh.t0) arrayList.get(i17);
            if (!t0Var2.f15897b && t0Var2.e && t0Var2.f15900g < j10) {
                j11 = j10;
            } else {
                if (hashSet.contains(Integer.valueOf(t0Var2.f15896a))) {
                    j11 = j10;
                    if (g2Var.f15980w != u0Var.f15948b || (i13 = g2Var.f15981x) == 0 || t0Var2.f15896a < i13) {
                        i11 = t0Var2.f15896a;
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
                    nh.t0 t0Var3 = (nh.t0) arrayList.get(i15);
                    if (t0Var3.f15897b || !t0Var3.e || t0Var3.f15900g >= j11) {
                        if (hashSet.contains(Integer.valueOf(t0Var3.f15896a))) {
                            i12 = t0Var3.f15896a;
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
        g2Var.f15980w = u0Var.f15948b;
        g2Var.f15981x = i12;
        g2Var.f15982y = true;
        f2.t0 itemAnimator = e1Var.getItemAnimator();
        e1Var.setItemAnimator(null);
        g2Var.d.i1(i18, e1Var.getHeight() / 2, true);
        g2Var.e.m(i18);
        e1Var.setItemAnimator(itemAnimator);
    }

    @Override
    public void d() {
        ((ph.d1) this.f12799b).invalidate();
    }

    @Override
    public TLObject deserialize(InputSerializedData inputSerializedData, int i10, boolean z4) {
        TLRPC.PhotoSize lambda$readParams$0;
        TLRPC.PhotoSize lambda$readParams$02;
        switch (this.f12798a) {
            case 17:
                lambda$readParams$0 = ((TLRPC.TL_stickerSet) this.f12799b).lambda$readParams$0(inputSerializedData, i10, z4);
                return lambda$readParams$0;
            default:
                lambda$readParams$02 = ((TLRPC.TL_stickerSet_layer143) this.f12799b).lambda$readParams$0(inputSerializedData, i10, z4);
                return lambda$readParams$02;
        }
    }

    @Override
    public void e() {
        float f10;
        ph.h9 h9Var = (ph.h9) this.f12799b;
        TextView textView = h9Var.l1;
        boolean a2 = h9Var.A0.a();
        ImageView imageView = h9Var.f41345k1;
        imageView.animate().cancel();
        ViewPropertyAnimator animate = imageView.animate();
        float f11 = 0.6f;
        if (a2) {
            f10 = 1.0f;
        } else {
            f10 = 0.6f;
        }
        animate.alpha(f10).translationY(0.0f).setDuration(150L).start();
        imageView.setClickable(a2);
        textView.animate().cancel();
        ViewPropertyAnimator animate2 = textView.animate();
        if (a2) {
            f11 = 1.0f;
        }
        animate2.alpha(f11).translationY(0.0f).setDuration(150L).start();
        textView.setClickable(a2);
    }

    @Override
    public boolean e1(View view) {
        return false;
    }

    @Override
    public boolean f(int r33, final android.view.View r34) {
        throw new UnsupportedOperationException("Method not decompiled: lh.m5.f(int, android.view.View):boolean");
    }

    @Override
    public void g(float f10, Canvas canvas, RectF rectF, boolean z4) {
        Path path = (Path) this.f12799b;
        if (z4) {
            return;
        }
        path.rewind();
        float pow = (float) Math.pow(f10, 2.0d);
        path.addCircle((rectF.right + AndroidUtilities.dp(7.0f)) - (AndroidUtilities.dp(14.0f) * pow), (rectF.bottom + AndroidUtilities.dp(7.0f)) - (AndroidUtilities.dp(14.0f) * pow), AndroidUtilities.dp(11.0f), Path.Direction.CW);
        canvas.clipPath(path, Region.Op.DIFFERENCE);
    }

    @Override
    public void i(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f12798a) {
            case 8:
                ((Runnable) this.f12799b).run();
                return;
            case 21:
                ((org.telegram.ui.web.z) this.f12799b).run();
                return;
            case 22:
                ph.da daVar = ((ph.t9) ((ph.p) this.f12799b)).P1;
                ph.s9 s9Var = daVar.U0;
                if (s9Var != null) {
                    s9Var.s(null, null, true);
                }
                ph.h9 h9Var = daVar.f41531s1;
                if (h9Var != null) {
                    h9Var.q0();
                }
                ph.t9 t9Var = daVar.Z0;
                if (t9Var != null) {
                    t9Var.setHasRoundVideo(false);
                }
                ph.u6 u6Var = daVar.H1;
                if (u6Var != null) {
                    File file = u6Var.f42428o0;
                    if (file != null) {
                        try {
                            file.delete();
                        } catch (Exception unused) {
                        }
                        daVar.H1.f42428o0 = null;
                    }
                    if (daVar.H1.f42430p0 != null) {
                        try {
                            new File(daVar.H1.f42430p0).delete();
                        } catch (Exception unused2) {
                        }
                        daVar.H1.f42430p0 = null;
                        return;
                    }
                    return;
                }
                return;
            case 27:
                ((ph.r4) this.f12799b).f42249a.f41349m2.r();
                return;
            default:
                ((rh.d) this.f12799b).run();
                return;
        }
    }

    @Override
    public void o(ih.k kVar, float f10, float f11) {
        nh.y7 y7Var = (nh.y7) this.f12799b;
        nh.z7 z7Var = y7Var.v;
        if (!z7Var.f16131x) {
            kVar.f7616q = new nh.x7(y7Var, 2);
            float sqrt = (float) Math.sqrt(Math.pow(z7Var.getHeight(), 2.0d) + Math.pow(z7Var.getWidth(), 2.0d));
            ArrayList arrayList = y7Var.f16090i;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((ih.k) obj).j(f10, f11, sqrt, false);
            }
        }
    }

    @Override
    public void onFinishVideoRecording(String str, long j10) {
        ph.a9 a9Var = (ph.a9) this.f12799b;
        ph.da daVar = a9Var.f41281a;
        ph.t5 t5Var = daVar.L0;
        int i10 = daVar.f41479c;
        if (t5Var != null) {
            t5Var.g(true);
        }
        if (daVar.q0()) {
            daVar.f41529s.d();
        }
        if (daVar.D1 != null && daVar.f41551y0 != null) {
            daVar.N1 = false;
            daVar.O1 = false;
            ph.p5 p5Var = daVar.f41554z0;
            if (p5Var != null) {
                p5Var.c(false);
            }
            if (j10 <= 800) {
                daVar.h(false, true);
                daVar.d0(false);
                daVar.G0.b(false, true);
                ph.t5 t5Var2 = daVar.L0;
                if (t5Var2 != null) {
                    t5Var2.g(true);
                }
                try {
                    daVar.D1.delete();
                    daVar.D1 = null;
                } catch (Exception e) {
                    FileLog.e(e);
                }
                if (str != null) {
                    try {
                        new File(str).delete();
                        return;
                    } catch (Exception e6) {
                        FileLog.e(e6);
                        return;
                    }
                }
                return;
            }
            daVar.i0(false, true);
            ph.u6 o10 = ph.u6.o(daVar.D1, str, j10);
            o10.J0 = daVar.f41530s0;
            o10.K0 = daVar.f41533t0;
            o10.B();
            daVar.h(false, true);
            daVar.d0(false);
            daVar.G0.b(false, true);
            ph.t5 t5Var3 = daVar.L0;
            if (t5Var3 != null) {
                t5Var3.g(true);
            }
            if (daVar.f41547x0.j()) {
                daVar.D1 = null;
                o10.P = 1.0f;
                if (daVar.f41547x0.l(o10)) {
                    ph.u6 a2 = ph.u6.a(daVar.f41547x0.getLayout(), daVar.f41547x0.getContent());
                    daVar.H1 = a2;
                    ph.g8.a(i10, a2);
                    daVar.I1 = false;
                    int videoWidth = daVar.f41551y0.getVideoWidth();
                    int videoHeight = daVar.f41551y0.getVideoHeight();
                    if (videoWidth > 0 && videoHeight > 0) {
                        ph.u6 u6Var = daVar.H1;
                        u6Var.f42421k0 = videoWidth;
                        u6Var.f42423l0 = videoHeight;
                        u6Var.A();
                    }
                }
                daVar.m0(true);
                return;
            }
            daVar.H1 = o10;
            ph.g8.a(i10, o10);
            daVar.I1 = false;
            int videoWidth2 = daVar.f41551y0.getVideoWidth();
            int videoHeight2 = daVar.f41551y0.getVideoHeight();
            if (videoWidth2 > 0 && videoHeight2 > 0) {
                ph.u6 u6Var2 = daVar.H1;
                u6Var2.f42421k0 = videoWidth2;
                u6Var2.f42423l0 = videoHeight2;
                u6Var2.A();
            }
            daVar.L(new ph.y8(a9Var, 3), 0L);
        }
    }

    @Override
    public void mo28run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.f12798a) {
            case 0:
                t7.b((t7) this.f12799b, (ArrayList) obj, (Integer) obj2, (Long) obj3, (ArrayList) obj4, (ArrayList) obj5);
                return;
            case 4:
                ga gaVar = (ga) this.f12799b;
                i51 i51Var = (i51) obj;
                View view = (View) obj2;
                ((Integer) obj3).intValue();
                ((Float) obj4).floatValue();
                ((Float) obj5).floatValue();
                gaVar.getClass();
                if (i51Var.G instanceof TL_stars.StarsTransaction) {
                    ja.h1(gaVar.getContext(), false, 0L, gaVar.f12514c, (TL_stars.StarsTransaction) i51Var.G, gaVar.f12513b);
                    return;
                }
                return;
            default:
                ph.w8 w8Var = (ph.w8) this.f12799b;
                i51 i51Var2 = (i51) obj;
                View view2 = (View) obj2;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                int i10 = i51Var2.d;
                ph.u6 u6Var = (ph.u6) i51Var2.G;
                w8Var.c(false, true);
                ph.da daVar = w8Var.L;
                if (u6Var == daVar.H1 || daVar.U1) {
                    return;
                }
                daVar.f41474a1.setSelected(i10);
                daVar.U1 = true;
                ph.j8 j8Var = new ph.j8(daVar, i10, 0);
                ph.h9 h9Var = daVar.f41531s1;
                ph.u6 u6Var2 = daVar.H1;
                if (h9Var != null && u6Var2 != null) {
                    if (!h9Var.u0()) {
                        j8Var.run();
                        return;
                    }
                    u6Var2.f();
                    boolean u02 = h9Var.u0();
                    boolean z4 = h9Var.L0.getPainting().E;
                    Utilities.searchQueue.postRunnable(new ph.l8(daVar, h9Var, u6Var2.f42417i0, u6Var2.f42419j0, u6Var2, z4, u02, j8Var, 0));
                    return;
                }
                j8Var.run();
                return;
        }
    }

    @Override
    public Object run(Object obj, Object obj2) {
        switch (this.f12798a) {
            case 6:
                Long l10 = (Long) obj;
                return nh.v0.a((nh.v0) this.f12799b, (Long) obj2);
            default:
                nr0 nr0Var = (nr0) this.f12799b;
                Integer num = (Integer) obj2;
                if (((Integer) obj).intValue() == -1) {
                    new oh.u(nr0Var.f16615a, LocaleController.getString(R.string.ProfileBotPreviewLanguageChoose), new cg.h0(nr0Var, 28)).show();
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
        }
    }

    @Override
    public void run(Bitmap bitmap, int i10) {
        org.telegram.ui.Components.voip.t tVar = (org.telegram.ui.Components.voip.t) this.f12799b;
        if (bitmap == null || bitmap.getPixel(0, 0) == 0) {
            return;
        }
        Utilities.stackBlurBitmap(bitmap, Math.max(7, Math.max(bitmap.getWidth(), bitmap.getHeight()) / 180));
        AndroidUtilities.runOnUIThread(new k41(9, tVar, bitmap));
    }

    @Override
    public void o0(View view, float f10, float f11) {
    }
}
