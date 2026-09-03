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
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.kl0;
import org.telegram.ui.Components.nr0;
import org.telegram.ui.Components.q51;
import org.telegram.ui.Components.yk0;
import org.telegram.ui.ko0;
import org.webrtc.GlGenericDrawer;
public final class m5 implements Utilities.Callback5, ko0, kl0, Utilities.Callback2Return, jl0, org.telegram.ui.ActionBar.c2, oh.b7, oh.c9, jh.o, r0.o, Vector.TLDeserializer, GlGenericDrawer.TextureCallback, org.telegram.ui.Components.voip.k1, yk0, dg.g2, CameraController.VideoTakeCallback {
    public final int f14451a;
    public final Object f14452b;

    public m5(Object obj, int i10) {
        this.f14451a = i10;
        this.f14452b = obj;
    }

    @Override
    public r0.m1 M0(View view, r0.m1 m1Var) {
        int a2;
        oh.i9 i9Var = (oh.i9) this.f14452b;
        int i10 = 0;
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) i9Var.v.getLayoutParams();
        if (!i9Var.f17260c) {
            i10 = m1Var.d();
        }
        marginLayoutParams.topMargin = i10;
        if (i9Var.f17260c) {
            a2 = m1Var.f46483a.f(2).d;
        } else {
            a2 = m1Var.a();
        }
        marginLayoutParams.bottomMargin = a2;
        marginLayoutParams.leftMargin = defaultWindowInsets.f7757a;
        marginLayoutParams.rightMargin = defaultWindowInsets.f7759c;
        oh.w8 w8Var = i9Var.f17295s;
        if (w8Var != null) {
            w8Var.requestLayout();
        }
        oh.x8 x8Var = i9Var.v;
        if (x8Var != null) {
            x8Var.requestLayout();
        }
        return r0.m1.f46482b;
    }

    @Override
    public boolean Y0(View view) {
        return false;
    }

    @Override
    public void a(int i10) {
        switch (this.f14451a) {
            case 1:
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.f14452b;
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
                eh.w wVar = (eh.w) this.f14452b;
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
                lh.i5 i5Var = (lh.i5) this.f14452b;
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
        oh.d5 d5Var = (oh.d5) this.f14452b;
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
        oh.h2 h2Var = (oh.h2) this.f14452b;
        d1 d1Var = h2Var.f17833c;
        ArrayList arrayList = h2Var.f17839r;
        oh.u0 u0Var = ((oh.s0) view).f17714f;
        int i14 = h2Var.K;
        int currentTime = ConnectionsManager.getInstance(i14).getCurrentTime();
        HashSet hashSet = new HashSet();
        int i15 = 0;
        int i16 = 0;
        while (true) {
            j10 = 0;
            if (i16 >= u0Var.f17804f.size()) {
                break;
            }
            oh.t0 t0Var = (oh.t0) u0Var.f17804f.get(i16);
            long j12 = t0Var.f17762g;
            if (j12 > 0 && currentTime - t0Var.d <= oh.s.b(i14, (int) j12, 0)) {
                hashSet.add(Integer.valueOf(t0Var.f17757a));
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
            if (!t0Var2.f17758b && t0Var2.f17760e && t0Var2.f17762g < j10) {
                j11 = j10;
            } else {
                if (hashSet.contains(Integer.valueOf(t0Var2.f17757a))) {
                    j11 = j10;
                    if (h2Var.f17841w != u0Var.f17801b || (i13 = h2Var.f17842x) == 0 || t0Var2.f17757a < i13) {
                        i11 = t0Var2.f17757a;
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
                    if (t0Var3.f17758b || !t0Var3.f17760e || t0Var3.f17762g >= j11) {
                        if (hashSet.contains(Integer.valueOf(t0Var3.f17757a))) {
                            i12 = t0Var3.f17757a;
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
        h2Var.f17841w = u0Var.f17801b;
        h2Var.f17842x = i12;
        h2Var.f17843y = true;
        f2.u0 itemAnimator = d1Var.getItemAnimator();
        d1Var.setItemAnimator(null);
        h2Var.d.i1(i18, d1Var.getHeight() / 2, true);
        h2Var.f17836e.m(i18);
        d1Var.setItemAnimator(itemAnimator);
    }

    @Override
    public void d() {
        ((qh.d1) this.f14452b).invalidate();
    }

    @Override
    public TLObject deserialize(InputSerializedData inputSerializedData, int i10, boolean z4) {
        TLRPC.PhotoSize lambda$readParams$0;
        TLRPC.PhotoSize lambda$readParams$02;
        switch (this.f14451a) {
            case 16:
                lambda$readParams$0 = ((TLRPC.TL_stickerSet) this.f14452b).lambda$readParams$0(inputSerializedData, i10, z4);
                return lambda$readParams$0;
            default:
                lambda$readParams$02 = ((TLRPC.TL_stickerSet_layer143) this.f14452b).lambda$readParams$0(inputSerializedData, i10, z4);
                return lambda$readParams$02;
        }
    }

    @Override
    public void e() {
        float f10;
        qh.e9 e9Var = (qh.e9) this.f14452b;
        TextView textView = e9Var.l1;
        boolean a2 = e9Var.A0.a();
        ImageView imageView = e9Var.f44941k1;
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
        Path path = (Path) this.f14452b;
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
        switch (this.f14451a) {
            case 9:
                ((Runnable) this.f14452b).run();
                return;
            case 20:
                ((org.telegram.ui.web.z) this.f14452b).run();
                return;
            case 23:
                qh.ba baVar = ((qh.q9) ((qh.p) this.f14452b)).P1;
                qh.p9 p9Var = baVar.U0;
                if (p9Var != null) {
                    p9Var.s(null, null, true);
                }
                qh.e9 e9Var = baVar.f45100s1;
                if (e9Var != null) {
                    e9Var.q0();
                }
                qh.q9 q9Var = baVar.Z0;
                if (q9Var != null) {
                    q9Var.setHasRoundVideo(false);
                }
                qh.r6 r6Var = baVar.H1;
                if (r6Var != null) {
                    File file = r6Var.f46023o0;
                    if (file != null) {
                        try {
                            file.delete();
                        } catch (Exception unused) {
                        }
                        baVar.H1.f46023o0 = null;
                    }
                    if (baVar.H1.f46025p0 != null) {
                        try {
                            new File(baVar.H1.f46025p0).delete();
                        } catch (Exception unused2) {
                        }
                        baVar.H1.f46025p0 = null;
                        return;
                    }
                    return;
                }
                return;
            default:
                ((qh.q4) this.f14452b).f45924a.f44945m2.r();
                return;
        }
    }

    @Override
    public void o(jh.k kVar, float f10, float f11) {
        oh.y7 y7Var = (oh.y7) this.f14452b;
        oh.z7 z7Var = y7Var.v;
        if (!z7Var.f18008x) {
            kVar.f10147q = new oh.x7(y7Var, 2);
            float sqrt = (float) Math.sqrt(Math.pow(z7Var.getHeight(), 2.0d) + Math.pow(z7Var.getWidth(), 2.0d));
            ArrayList arrayList = y7Var.f17972i;
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
        qh.x8 x8Var = (qh.x8) this.f14452b;
        qh.ba baVar = x8Var.f46318a;
        qh.q5 q5Var = baVar.L0;
        int i10 = baVar.f45047c;
        if (q5Var != null) {
            q5Var.g(true);
        }
        if (baVar.q0()) {
            baVar.f45098s.d();
        }
        if (baVar.D1 != null && baVar.f45120y0 != null) {
            baVar.N1 = false;
            baVar.O1 = false;
            qh.m5 m5Var = baVar.f45123z0;
            if (m5Var != null) {
                m5Var.c(false);
            }
            if (j10 <= 800) {
                baVar.h(false, true);
                baVar.d0(false);
                baVar.G0.b(false, true);
                qh.q5 q5Var2 = baVar.L0;
                if (q5Var2 != null) {
                    q5Var2.g(true);
                }
                try {
                    baVar.D1.delete();
                    baVar.D1 = null;
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
            baVar.i0(false, true);
            qh.r6 o10 = qh.r6.o(baVar.D1, str, j10);
            o10.J0 = baVar.f45099s0;
            o10.K0 = baVar.f45102t0;
            o10.B();
            baVar.h(false, true);
            baVar.d0(false);
            baVar.G0.b(false, true);
            qh.q5 q5Var3 = baVar.L0;
            if (q5Var3 != null) {
                q5Var3.g(true);
            }
            if (baVar.f45116x0.j()) {
                baVar.D1 = null;
                o10.P = 1.0f;
                if (baVar.f45116x0.l(o10)) {
                    qh.r6 a2 = qh.r6.a(baVar.f45116x0.getLayout(), baVar.f45116x0.getContent());
                    baVar.H1 = a2;
                    qh.e8.a(i10, a2);
                    baVar.I1 = false;
                    int videoWidth = baVar.f45120y0.getVideoWidth();
                    int videoHeight = baVar.f45120y0.getVideoHeight();
                    if (videoWidth > 0 && videoHeight > 0) {
                        qh.r6 r6Var = baVar.H1;
                        r6Var.f46016k0 = videoWidth;
                        r6Var.f46018l0 = videoHeight;
                        r6Var.A();
                    }
                }
                baVar.m0(true);
                return;
            }
            baVar.H1 = o10;
            qh.e8.a(i10, o10);
            baVar.I1 = false;
            int videoWidth2 = baVar.f45120y0.getVideoWidth();
            int videoHeight2 = baVar.f45120y0.getVideoHeight();
            if (videoWidth2 > 0 && videoHeight2 > 0) {
                qh.r6 r6Var2 = baVar.H1;
                r6Var2.f46016k0 = videoWidth2;
                r6Var2.f46018l0 = videoHeight2;
                r6Var2.A();
            }
            baVar.L(new qh.v8(x8Var, 3), 0L);
        }
    }

    @Override
    public void mo27run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.f14451a) {
            case 0:
                t7.b((t7) this.f14452b, (ArrayList) obj, (Integer) obj2, (Long) obj3, (ArrayList) obj4, (ArrayList) obj5);
                return;
            case 4:
                ga gaVar = (ga) this.f14452b;
                h51 h51Var = (h51) obj;
                View view = (View) obj2;
                ((Integer) obj3).intValue();
                ((Float) obj4).floatValue();
                ((Float) obj5).floatValue();
                gaVar.getClass();
                if (h51Var.G instanceof TL_stars.StarsTransaction) {
                    ja.h1(gaVar.getContext(), false, 0L, gaVar.f14133c, (TL_stars.StarsTransaction) h51Var.G, gaVar.f14132b);
                    return;
                }
                return;
            default:
                qh.t8 t8Var = (qh.t8) this.f14452b;
                h51 h51Var2 = (h51) obj;
                View view2 = (View) obj2;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                int i10 = h51Var2.d;
                qh.r6 r6Var = (qh.r6) h51Var2.G;
                t8Var.c(false, true);
                qh.ba baVar = t8Var.L;
                if (r6Var == baVar.H1 || baVar.U1) {
                    return;
                }
                baVar.f45042a1.setSelected(i10);
                baVar.U1 = true;
                qh.d8 d8Var = new qh.d8(baVar, i10, 1);
                qh.e9 e9Var = baVar.f45100s1;
                qh.r6 r6Var2 = baVar.H1;
                if (e9Var != null && r6Var2 != null) {
                    if (!e9Var.u0()) {
                        d8Var.run();
                        return;
                    }
                    r6Var2.f();
                    boolean u02 = e9Var.u0();
                    boolean z4 = e9Var.L0.getPainting().E;
                    Utilities.searchQueue.postRunnable(new qh.i8(baVar, e9Var, r6Var2.f46012i0, r6Var2.f46014j0, r6Var2, z4, u02, d8Var, 0));
                    return;
                }
                d8Var.run();
                return;
        }
    }

    @Override
    public Object run(Object obj, Object obj2) {
        switch (this.f14451a) {
            case 7:
                Long l10 = (Long) obj;
                return oh.v0.a((oh.v0) this.f14452b, (Long) obj2);
            default:
                nr0 nr0Var = (nr0) this.f14452b;
                Integer num = (Integer) obj2;
                if (((Integer) obj).intValue() == -1) {
                    new ph.o(nr0Var.f44437a, LocaleController.getString(R.string.ProfileBotPreviewLanguageChoose), new org.telegram.ui.web.d1(nr0Var, 2)).show();
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
        }
    }

    @Override
    public void run(Bitmap bitmap, int i10) {
        org.telegram.ui.Components.voip.u uVar = (org.telegram.ui.Components.voip.u) this.f14452b;
        if (bitmap == null || bitmap.getPixel(0, 0) == 0) {
            return;
        }
        Utilities.stackBlurBitmap(bitmap, Math.max(7, Math.max(bitmap.getWidth(), bitmap.getHeight()) / 180));
        AndroidUtilities.runOnUIThread(new q51(7, uVar, bitmap));
    }

    @Override
    public void r0(View view, float f10, float f11) {
    }
}
