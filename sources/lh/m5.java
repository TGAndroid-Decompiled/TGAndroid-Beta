package lh;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.nr0;
import org.telegram.ui.Components.xk0;
import org.telegram.ui.ko0;
import org.webrtc.GlGenericDrawer;
public final class m5 implements Utilities.Callback5, ko0, jl0, Utilities.Callback2Return, il0, org.telegram.ui.ActionBar.c2, nh.b7, nh.c9, ih.o, r0.o, Vector.TLDeserializer, GlGenericDrawer.TextureCallback, org.telegram.ui.Components.voip.j1, n2.a, xk0, cg.h2 {
    public final int f12782a;
    public final Object f12783b;

    public m5(Object obj, int i10) {
        this.f12782a = i10;
        this.f12783b = obj;
    }

    @Override
    public r0.m1 M0(View view, r0.m1 m1Var) {
        int a2;
        nh.i9 i9Var = (nh.i9) this.f12783b;
        int i10 = 0;
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) i9Var.v.getLayoutParams();
        if (!i9Var.f15434c) {
            i10 = m1Var.d();
        }
        marginLayoutParams.topMargin = i10;
        if (i9Var.f15434c) {
            a2 = m1Var.f43154a.f(2).d;
        } else {
            a2 = m1Var.a();
        }
        marginLayoutParams.bottomMargin = a2;
        marginLayoutParams.leftMargin = defaultWindowInsets.f7196a;
        marginLayoutParams.rightMargin = defaultWindowInsets.f7198c;
        nh.w8 w8Var = i9Var.f15468s;
        if (w8Var != null) {
            w8Var.requestLayout();
        }
        nh.x8 x8Var = i9Var.v;
        if (x8Var != null) {
            x8Var.requestLayout();
        }
        return r0.m1.f43153b;
    }

    @Override
    public boolean Z0(View view) {
        return false;
    }

    @Override
    public void a(int i10) {
        switch (this.f12782a) {
            case 1:
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.f12783b;
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
                dh.v vVar = (dh.v) this.f12783b;
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
                kh.h5 h5Var = (kh.h5) this.f12783b;
                if (i10 == 1) {
                    h5Var.run(Boolean.TRUE, null);
                    return;
                } else if (i10 != 3) {
                    h5Var.run(Boolean.FALSE, null);
                    return;
                } else {
                    return;
                }
        }
    }

    @Override
    public void b(boolean z4) {
        nh.c5 c5Var = (nh.c5) this.f12783b;
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
        nh.g2 g2Var = (nh.g2) this.f12783b;
        e1 e1Var = g2Var.f15953c;
        ArrayList arrayList = g2Var.f15958r;
        nh.u0 u0Var = ((nh.s0) view).f15843f;
        int i14 = g2Var.K;
        int currentTime = ConnectionsManager.getInstance(i14).getCurrentTime();
        HashSet hashSet = new HashSet();
        int i15 = 0;
        int i16 = 0;
        while (true) {
            j10 = 0;
            if (i16 >= u0Var.f15930f.size()) {
                break;
            }
            nh.t0 t0Var = (nh.t0) u0Var.f15930f.get(i16);
            long j12 = t0Var.f15880g;
            if (j12 > 0 && currentTime - t0Var.d <= nh.t.b(i14, (int) j12, 0)) {
                hashSet.add(Integer.valueOf(t0Var.f15876a));
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
            if (!t0Var2.f15877b && t0Var2.e && t0Var2.f15880g < j10) {
                j11 = j10;
            } else {
                if (hashSet.contains(Integer.valueOf(t0Var2.f15876a))) {
                    j11 = j10;
                    if (g2Var.f15960w != u0Var.f15928b || (i13 = g2Var.f15961x) == 0 || t0Var2.f15876a < i13) {
                        i11 = t0Var2.f15876a;
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
                    if (t0Var3.f15877b || !t0Var3.e || t0Var3.f15880g >= j11) {
                        if (hashSet.contains(Integer.valueOf(t0Var3.f15876a))) {
                            i12 = t0Var3.f15876a;
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
        g2Var.f15960w = u0Var.f15928b;
        g2Var.f15961x = i12;
        g2Var.f15962y = true;
        f2.t0 itemAnimator = e1Var.getItemAnimator();
        e1Var.setItemAnimator(null);
        g2Var.d.i1(i18, e1Var.getHeight() / 2, true);
        g2Var.e.m(i18);
        e1Var.setItemAnimator(itemAnimator);
    }

    @Override
    public boolean d(int r33, final android.view.View r34) {
        throw new UnsupportedOperationException("Method not decompiled: lh.m5.d(int, android.view.View):boolean");
    }

    @Override
    public TLObject deserialize(InputSerializedData inputSerializedData, int i10, boolean z4) {
        TLRPC.PhotoSize lambda$readParams$0;
        TLRPC.PhotoSize lambda$readParams$02;
        switch (this.f12782a) {
            case 18:
                lambda$readParams$0 = ((TLRPC.TL_stickerSet) this.f12783b).lambda$readParams$0(inputSerializedData, i10, z4);
                return lambda$readParams$0;
            default:
                lambda$readParams$02 = ((TLRPC.TL_stickerSet_layer143) this.f12783b).lambda$readParams$0(inputSerializedData, i10, z4);
                return lambda$readParams$02;
        }
    }

    @Override
    public void e() {
        ((ph.d1) this.f12783b).invalidate();
    }

    @Override
    public void f(float f10, Canvas canvas, RectF rectF, boolean z4) {
        Path path = (Path) this.f12783b;
        if (z4) {
            return;
        }
        path.rewind();
        float pow = (float) Math.pow(f10, 2.0d);
        path.addCircle((rectF.right + AndroidUtilities.dp(7.0f)) - (AndroidUtilities.dp(14.0f) * pow), (rectF.bottom + AndroidUtilities.dp(7.0f)) - (AndroidUtilities.dp(14.0f) * pow), AndroidUtilities.dp(11.0f), Path.Direction.CW);
        canvas.clipPath(path, Region.Op.DIFFERENCE);
    }

    @Override
    public void g() {
        float f10;
        ph.h9 h9Var = (ph.h9) this.f12783b;
        TextView textView = h9Var.l1;
        boolean a2 = h9Var.A0.a();
        ImageView imageView = h9Var.f41385k1;
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
    public void i(WebView webView, b4.e0 e0Var, Uri uri, boolean z4, o2.f fVar) {
        String uri2;
        org.telegram.ui.web.y0 y0Var = (org.telegram.ui.web.y0) this.f12783b;
        org.telegram.ui.web.c1 c1Var = y0Var.N;
        if (webView == y0Var && c1Var != null) {
            if (webView == c1Var.f39381a && e0Var.f1378b == 0) {
                if (uri == null) {
                    uri2 = null;
                } else {
                    uri2 = uri.toString();
                }
                String l10 = org.telegram.ui.web.c1.l(uri2);
                if (c1Var.f39401q0 && (TextUtils.isEmpty(c1Var.C0) || !TextUtils.equals(c1Var.C0, l10) || !TextUtils.equals(c1Var.C0, c1Var.getOriginHost()))) {
                    c1Var.h("onBotWebMessage ignored: untrusted origin");
                    return;
                }
                nh.j7 g10 = c1Var.g();
                try {
                    e0Var.e(0);
                    String str = (String) e0Var.f1379c;
                    if (str != null && str.length() <= 1048576) {
                        JSONObject jSONObject = new JSONObject(str);
                        String string = jSONObject.getString("eventType");
                        if (!string.isEmpty() && string.length() <= 128) {
                            AndroidUtilities.runOnUIThread(new org.telegram.ui.web.b0(c1Var, webView, g10, string, jSONObject.optString("eventData", null), 2));
                            return;
                        }
                        c1Var.h("onBotWebMessage ignored: invalid event type");
                        return;
                    }
                    c1Var.h("onBotWebMessage ignored: invalid payload length");
                    return;
                } catch (JSONException e) {
                    FileLog.e(e);
                    return;
                }
            }
            c1Var.h("onBotWebMessage ignored: invalid source or payload");
        }
    }

    @Override
    public void l(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f12782a) {
            case 8:
                ((Runnable) this.f12783b).run();
                return;
            case 23:
                ((org.telegram.ui.web.b0) this.f12783b).run();
                return;
            case 24:
                ph.da daVar = ((ph.t9) ((ph.p) this.f12783b)).P1;
                ph.s9 s9Var = daVar.U0;
                if (s9Var != null) {
                    s9Var.s(null, null, true);
                }
                ph.h9 h9Var = daVar.f41569s1;
                if (h9Var != null) {
                    h9Var.q0();
                }
                ph.t9 t9Var = daVar.Z0;
                if (t9Var != null) {
                    t9Var.setHasRoundVideo(false);
                }
                ph.t6 t6Var = daVar.H1;
                if (t6Var != null) {
                    File file = t6Var.f42429o0;
                    if (file != null) {
                        try {
                            file.delete();
                        } catch (Exception unused) {
                        }
                        daVar.H1.f42429o0 = null;
                    }
                    if (daVar.H1.f42431p0 != null) {
                        try {
                            new File(daVar.H1.f42431p0).delete();
                        } catch (Exception unused2) {
                        }
                        daVar.H1.f42431p0 = null;
                        return;
                    }
                    return;
                }
                return;
            default:
                ((ph.r4) this.f12783b).f42285a.f41389m2.r();
                return;
        }
    }

    @Override
    public void o(ih.k kVar, float f10, float f11) {
        nh.y7 y7Var = (nh.y7) this.f12783b;
        nh.z7 z7Var = y7Var.v;
        if (!z7Var.f16111x) {
            kVar.f7598q = new nh.x7(y7Var, 2);
            float sqrt = (float) Math.sqrt(Math.pow(z7Var.getHeight(), 2.0d) + Math.pow(z7Var.getWidth(), 2.0d));
            ArrayList arrayList = y7Var.f16070i;
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
    public void mo27run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.f12782a) {
            case 0:
                t7.b((t7) this.f12783b, (ArrayList) obj, (Integer) obj2, (Long) obj3, (ArrayList) obj4, (ArrayList) obj5);
                return;
            case 4:
                ga gaVar = (ga) this.f12783b;
                i51 i51Var = (i51) obj;
                View view = (View) obj2;
                ((Integer) obj3).intValue();
                ((Float) obj4).floatValue();
                ((Float) obj5).floatValue();
                gaVar.getClass();
                if (i51Var.G instanceof TL_stars.StarsTransaction) {
                    ja.h1(gaVar.getContext(), false, 0L, gaVar.f12498c, (TL_stars.StarsTransaction) i51Var.G, gaVar.f12497b);
                    return;
                }
                return;
            default:
                ph.v8 v8Var = (ph.v8) this.f12783b;
                i51 i51Var2 = (i51) obj;
                View view2 = (View) obj2;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                int i10 = i51Var2.d;
                ph.t6 t6Var = (ph.t6) i51Var2.G;
                v8Var.c(false, true);
                ph.da daVar = v8Var.L;
                if (t6Var == daVar.H1 || daVar.U1) {
                    return;
                }
                daVar.f41512a1.setSelected(i10);
                daVar.U1 = true;
                ph.i8 i8Var = new ph.i8(daVar, i10, 0);
                ph.h9 h9Var = daVar.f41569s1;
                ph.t6 t6Var2 = daVar.H1;
                if (h9Var != null && t6Var2 != null) {
                    if (!h9Var.u0()) {
                        i8Var.run();
                        return;
                    }
                    t6Var2.f();
                    boolean u02 = h9Var.u0();
                    boolean z4 = h9Var.L0.getPainting().E;
                    Utilities.searchQueue.postRunnable(new ph.k8(daVar, h9Var, t6Var2.f42418i0, t6Var2.f42420j0, t6Var2, z4, u02, i8Var, 0));
                    return;
                }
                i8Var.run();
                return;
        }
    }

    @Override
    public Object run(Object obj, Object obj2) {
        switch (this.f12782a) {
            case 6:
                Long l10 = (Long) obj;
                return nh.v0.a((nh.v0) this.f12783b, (Long) obj2);
            default:
                nr0 nr0Var = (nr0) this.f12783b;
                Integer num = (Integer) obj2;
                if (((Integer) obj).intValue() == -1) {
                    new oh.u(nr0Var.f16595a, LocaleController.getString(R.string.ProfileBotPreviewLanguageChoose), new cg.h0(nr0Var, 28)).show();
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
        }
    }

    @Override
    public void run(Bitmap bitmap, int i10) {
        org.telegram.ui.Components.voip.t tVar = (org.telegram.ui.Components.voip.t) this.f12783b;
        if (bitmap == null || bitmap.getPixel(0, 0) == 0) {
            return;
        }
        Utilities.stackBlurBitmap(bitmap, Math.max(7, Math.max(bitmap.getWidth(), bitmap.getHeight()) / 180));
        AndroidUtilities.runOnUIThread(new k41(8, tVar, bitmap));
    }

    @Override
    public void n0(View view, float f10, float f11) {
    }
}
