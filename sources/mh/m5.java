package mh;

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
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.kl0;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.or0;
import org.telegram.ui.Components.zk0;
import org.telegram.ui.ko0;
import org.webrtc.GlGenericDrawer;
public final class m5 implements Utilities.Callback5, ko0, ll0, Utilities.Callback2Return, kl0, org.telegram.ui.ActionBar.c2, oh.b7, oh.c9, jh.o, r0.o, Vector.TLDeserializer, GlGenericDrawer.TextureCallback, org.telegram.ui.Components.voip.k1, zk0, dg.g2, CameraController.VideoTakeCallback {
    public final int f14449a;
    public final Object f14450b;

    public m5(Object obj, int i10) {
        this.f14449a = i10;
        this.f14450b = obj;
    }

    @Override
    public r0.m1 M0(View view, r0.m1 m1Var) {
        int a2;
        oh.i9 i9Var = (oh.i9) this.f14450b;
        int i10 = 0;
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) i9Var.v.getLayoutParams();
        if (!i9Var.f17258c) {
            i10 = m1Var.d();
        }
        marginLayoutParams.topMargin = i10;
        if (i9Var.f17258c) {
            a2 = m1Var.f46452a.f(2).d;
        } else {
            a2 = m1Var.a();
        }
        marginLayoutParams.bottomMargin = a2;
        marginLayoutParams.leftMargin = defaultWindowInsets.f7757a;
        marginLayoutParams.rightMargin = defaultWindowInsets.f7759c;
        oh.w8 w8Var = i9Var.f17293s;
        if (w8Var != null) {
            w8Var.requestLayout();
        }
        oh.x8 x8Var = i9Var.v;
        if (x8Var != null) {
            x8Var.requestLayout();
        }
        return r0.m1.f46451b;
    }

    @Override
    public boolean Y0(View view) {
        return false;
    }

    @Override
    public void a(int i10) {
        switch (this.f14449a) {
            case 1:
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.f14450b;
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
                eh.w wVar = (eh.w) this.f14450b;
                if (i10 == 1) {
                    wVar.run(Boolean.TRUE, null);
                    return;
                } else if (i10 != 3) {
                    wVar.run(Boolean.FALSE, null);
                    return;
                } else {
                    return;
                }
            default:
                lh.i5 i5Var = (lh.i5) this.f14450b;
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
        oh.d5 d5Var = (oh.d5) this.f14450b;
        if (d5Var != null) {
            d5Var.c();
        }
    }

    @Override
    public void c(float f10, float f11, int i10, View view) {
        long j10;
        long j11;
        int i11;
        int i12;
        int i13;
        oh.h2 h2Var = (oh.h2) this.f14450b;
        d1 d1Var = h2Var.f17831c;
        ArrayList arrayList = h2Var.f17837r;
        oh.u0 u0Var = ((oh.s0) view).f17712f;
        int i14 = h2Var.K;
        int currentTime = ConnectionsManager.getInstance(i14).getCurrentTime();
        HashSet hashSet = new HashSet();
        int i15 = 0;
        int i16 = 0;
        while (true) {
            j10 = 0;
            if (i16 >= u0Var.f17802f.size()) {
                break;
            }
            oh.t0 t0Var = (oh.t0) u0Var.f17802f.get(i16);
            long j12 = t0Var.f17760g;
            if (j12 > 0 && currentTime - t0Var.d <= oh.s.b(i14, (int) j12, 0)) {
                hashSet.add(Integer.valueOf(t0Var.f17755a));
            }
            i16++;
        }
        oh.e1 e1Var = h2Var.M;
        if (e1Var != null) {
            j10 = e1Var.j();
        }
        int i17 = 0;
        int i18 = 0;
        while (i17 < arrayList.size()) {
            oh.t0 t0Var2 = (oh.t0) arrayList.get(i17);
            if (!t0Var2.f17756b && t0Var2.f17758e && t0Var2.f17760g < j10) {
                j11 = j10;
            } else {
                if (hashSet.contains(Integer.valueOf(t0Var2.f17755a))) {
                    j11 = j10;
                    if (h2Var.f17839w != u0Var.f17799b || (i13 = h2Var.f17840x) == 0 || t0Var2.f17755a < i13) {
                        i11 = t0Var2.f17755a;
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
                    oh.t0 t0Var3 = (oh.t0) arrayList.get(i15);
                    if (t0Var3.f17756b || !t0Var3.f17758e || t0Var3.f17760g >= j11) {
                        if (hashSet.contains(Integer.valueOf(t0Var3.f17755a))) {
                            i12 = t0Var3.f17755a;
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
        h2Var.f17839w = u0Var.f17799b;
        h2Var.f17840x = i12;
        h2Var.f17841y = true;
        f2.u0 itemAnimator = d1Var.getItemAnimator();
        d1Var.setItemAnimator(null);
        h2Var.d.i1(i18, d1Var.getHeight() / 2, true);
        h2Var.f17834e.m(i18);
        d1Var.setItemAnimator(itemAnimator);
    }

    @Override
    public void d() {
        ((qh.d1) this.f14450b).invalidate();
    }

    @Override
    public TLObject deserialize(InputSerializedData inputSerializedData, int i10, boolean z4) {
        TLRPC.PhotoSize lambda$readParams$0;
        TLRPC.PhotoSize lambda$readParams$02;
        switch (this.f14449a) {
            case 16:
                lambda$readParams$0 = ((TLRPC.TL_stickerSet) this.f14450b).lambda$readParams$0(inputSerializedData, i10, z4);
                return lambda$readParams$0;
            default:
                lambda$readParams$02 = ((TLRPC.TL_stickerSet_layer143) this.f14450b).lambda$readParams$0(inputSerializedData, i10, z4);
                return lambda$readParams$02;
        }
    }

    @Override
    public void e() {
        float f10;
        qh.f9 f9Var = (qh.f9) this.f14450b;
        TextView textView = f9Var.l1;
        boolean a2 = f9Var.A0.a();
        ImageView imageView = f9Var.f44964k1;
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
    public boolean f(int r33, final android.view.View r34) {
        throw new UnsupportedOperationException("Method not decompiled: mh.m5.f(int, android.view.View):boolean");
    }

    @Override
    public void g(float f10, Canvas canvas, RectF rectF, boolean z4) {
        Path path = (Path) this.f14450b;
        if (z4) {
            return;
        }
        path.rewind();
        float pow = (float) Math.pow(f10, 2.0d);
        path.addCircle((rectF.right + AndroidUtilities.dp(7.0f)) - (AndroidUtilities.dp(14.0f) * pow), (rectF.bottom + AndroidUtilities.dp(7.0f)) - (AndroidUtilities.dp(14.0f) * pow), AndroidUtilities.dp(11.0f), Path.Direction.CW);
        canvas.clipPath(path, Region.Op.DIFFERENCE);
    }

    @Override
    public void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f14449a) {
            case 9:
                ((Runnable) this.f14450b).run();
                return;
            case 20:
                ((org.telegram.ui.web.z) this.f14450b).run();
                return;
            case 23:
                qh.ca caVar = ((qh.r9) ((qh.p) this.f14450b)).P1;
                qh.q9 q9Var = caVar.U0;
                if (q9Var != null) {
                    q9Var.s(null, null, true);
                }
                qh.f9 f9Var = caVar.f45134s1;
                if (f9Var != null) {
                    f9Var.q0();
                }
                qh.r9 r9Var = caVar.Z0;
                if (r9Var != null) {
                    r9Var.setHasRoundVideo(false);
                }
                qh.s6 s6Var = caVar.H1;
                if (s6Var != null) {
                    File file = s6Var.f46072o0;
                    if (file != null) {
                        try {
                            file.delete();
                        } catch (Exception unused) {
                        }
                        caVar.H1.f46072o0 = null;
                    }
                    if (caVar.H1.f46074p0 != null) {
                        try {
                            new File(caVar.H1.f46074p0).delete();
                        } catch (Exception unused2) {
                        }
                        caVar.H1.f46074p0 = null;
                        return;
                    }
                    return;
                }
                return;
            default:
                ((qh.r4) this.f14450b).f45945a.f44968m2.r();
                return;
        }
    }

    @Override
    public void o(jh.k kVar, float f10, float f11) {
        oh.y7 y7Var = (oh.y7) this.f14450b;
        oh.z7 z7Var = y7Var.v;
        if (!z7Var.f18006x) {
            kVar.f10147q = new oh.x7(y7Var, 2);
            float sqrt = (float) Math.sqrt(Math.pow(z7Var.getHeight(), 2.0d) + Math.pow(z7Var.getWidth(), 2.0d));
            ArrayList arrayList = y7Var.f17970i;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((jh.k) obj).j(f10, f11, sqrt, false);
            }
        }
    }

    @Override
    public void onFinishVideoRecording(String str, long j10) {
        qh.y8 y8Var = (qh.y8) this.f14450b;
        qh.ca caVar = y8Var.f46362a;
        qh.r5 r5Var = caVar.L0;
        int i10 = caVar.f45081c;
        if (r5Var != null) {
            r5Var.g(true);
        }
        if (caVar.q0()) {
            caVar.f45132s.d();
        }
        if (caVar.D1 != null && caVar.f45154y0 != null) {
            caVar.N1 = false;
            caVar.O1 = false;
            qh.n5 n5Var = caVar.f45157z0;
            if (n5Var != null) {
                n5Var.c(false);
            }
            if (j10 <= 800) {
                caVar.h(false, true);
                caVar.d0(false);
                caVar.G0.b(false, true);
                qh.r5 r5Var2 = caVar.L0;
                if (r5Var2 != null) {
                    r5Var2.g(true);
                }
                try {
                    caVar.D1.delete();
                    caVar.D1 = null;
                } catch (Exception e6) {
                    FileLog.e(e6);
                }
                if (str != null) {
                    try {
                        new File(str).delete();
                        return;
                    } catch (Exception e10) {
                        FileLog.e(e10);
                        return;
                    }
                }
                return;
            }
            caVar.i0(false, true);
            qh.s6 o10 = qh.s6.o(caVar.D1, str, j10);
            o10.J0 = caVar.f45133s0;
            o10.K0 = caVar.f45136t0;
            o10.B();
            caVar.h(false, true);
            caVar.d0(false);
            caVar.G0.b(false, true);
            qh.r5 r5Var3 = caVar.L0;
            if (r5Var3 != null) {
                r5Var3.g(true);
            }
            if (caVar.f45150x0.j()) {
                caVar.D1 = null;
                o10.P = 1.0f;
                if (caVar.f45150x0.l(o10)) {
                    qh.s6 a2 = qh.s6.a(caVar.f45150x0.getLayout(), caVar.f45150x0.getContent());
                    caVar.H1 = a2;
                    qh.f8.a(i10, a2);
                    caVar.I1 = false;
                    int videoWidth = caVar.f45154y0.getVideoWidth();
                    int videoHeight = caVar.f45154y0.getVideoHeight();
                    if (videoWidth > 0 && videoHeight > 0) {
                        qh.s6 s6Var = caVar.H1;
                        s6Var.f46065k0 = videoWidth;
                        s6Var.f46067l0 = videoHeight;
                        s6Var.A();
                    }
                }
                caVar.m0(true);
                return;
            }
            caVar.H1 = o10;
            qh.f8.a(i10, o10);
            caVar.I1 = false;
            int videoWidth2 = caVar.f45154y0.getVideoWidth();
            int videoHeight2 = caVar.f45154y0.getVideoHeight();
            if (videoWidth2 > 0 && videoHeight2 > 0) {
                qh.s6 s6Var2 = caVar.H1;
                s6Var2.f46065k0 = videoWidth2;
                s6Var2.f46067l0 = videoHeight2;
                s6Var2.A();
            }
            caVar.L(new qh.w8(y8Var, 3), 0L);
        }
    }

    @Override
    public void mo27run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.f14449a) {
            case 0:
                t7.b((t7) this.f14450b, (ArrayList) obj, (Integer) obj2, (Long) obj3, (ArrayList) obj4, (ArrayList) obj5);
                return;
            case 4:
                ga gaVar = (ga) this.f14450b;
                j51 j51Var = (j51) obj;
                View view = (View) obj2;
                ((Integer) obj3).intValue();
                ((Float) obj4).floatValue();
                ((Float) obj5).floatValue();
                gaVar.getClass();
                if (j51Var.G instanceof TL_stars.StarsTransaction) {
                    ja.h1(gaVar.getContext(), false, 0L, gaVar.f14131c, (TL_stars.StarsTransaction) j51Var.G, gaVar.f14130b);
                    return;
                }
                return;
            default:
                qh.u8 u8Var = (qh.u8) this.f14450b;
                j51 j51Var2 = (j51) obj;
                View view2 = (View) obj2;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                int i10 = j51Var2.d;
                qh.s6 s6Var = (qh.s6) j51Var2.G;
                u8Var.c(false, true);
                qh.ca caVar = u8Var.L;
                if (s6Var == caVar.H1 || caVar.U1) {
                    return;
                }
                caVar.f45076a1.setSelected(i10);
                caVar.U1 = true;
                qh.e8 e8Var = new qh.e8(caVar, i10, 1);
                qh.f9 f9Var = caVar.f45134s1;
                qh.s6 s6Var2 = caVar.H1;
                if (f9Var != null && s6Var2 != null) {
                    if (!f9Var.u0()) {
                        e8Var.run();
                        return;
                    }
                    s6Var2.f();
                    boolean u02 = f9Var.u0();
                    boolean z4 = f9Var.L0.getPainting().E;
                    Utilities.searchQueue.postRunnable(new qh.j8(caVar, f9Var, s6Var2.f46061i0, s6Var2.f46063j0, s6Var2, z4, u02, e8Var, 0));
                    return;
                }
                e8Var.run();
                return;
        }
    }

    @Override
    public Object run(Object obj, Object obj2) {
        switch (this.f14449a) {
            case 7:
                Long l10 = (Long) obj;
                return oh.v0.a((oh.v0) this.f14450b, (Long) obj2);
            default:
                or0 or0Var = (or0) this.f14450b;
                Integer num = (Integer) obj2;
                if (((Integer) obj).intValue() == -1) {
                    new ph.o(or0Var.f44406a, LocaleController.getString(R.string.ProfileBotPreviewLanguageChoose), new org.telegram.ui.web.d1(or0Var, 2)).show();
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
        }
    }

    @Override
    public void run(Bitmap bitmap, int i10) {
        org.telegram.ui.Components.voip.u uVar = (org.telegram.ui.Components.voip.u) this.f14450b;
        if (bitmap == null || bitmap.getPixel(0, 0) == 0) {
            return;
        }
        Utilities.stackBlurBitmap(bitmap, Math.max(7, Math.max(bitmap.getWidth(), bitmap.getHeight()) / 180));
        AndroidUtilities.runOnUIThread(new l41(8, uVar, bitmap));
    }

    @Override
    public void r0(View view, float f10, float f11) {
    }
}
