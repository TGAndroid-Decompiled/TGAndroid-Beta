package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.messenger.camera.CameraView;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.LaunchActivity;
public final class xg0 implements oy4, ee, g94, p36, oac, kac, h59, qq7, jwc, zx7, yl0, g59, eja, dja, gla, jab, v49, CameraView.CameraViewDelegate {
    public final byte a;
    public final Object b;

    public xg0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final wzc C0(View view, wzc wzcVar) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 13:
                iq5 H0 = gm.H0(wzcVar, false);
                ss0 ss0Var = ((rs0) obj).d;
                int i = H0.a;
                int i2 = H0.b;
                int i3 = H0.c;
                int i4 = H0.d;
                Rect rect = ss0Var.x;
                if (rect.left != i || rect.top != i2 || rect.right != i3 || rect.bottom != i4) {
                    rect.set(i, i2, i3, i4);
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) ss0Var.n.getLayoutParams();
                    layoutParams.bottomMargin = rect.bottom;
                    layoutParams.leftMargin = rect.left;
                    layoutParams.rightMargin = rect.right;
                    ss0Var.requestLayout();
                    ss0Var.j();
                }
                return wzc.b;
            case 17:
                fz0 fz0Var = (fz0) obj;
                fz0Var.s = wzcVar.a.f(2).d;
                fz0Var.invalidate();
                return wzc.b;
            default:
                iq5 H02 = gm.H0(wzcVar, false);
                m21 m21Var = ((n21) obj).a;
                if (m21Var != null) {
                    m21Var.setPadding(H02.a, H02.b, H02.c, H02.d);
                }
                view.requestLayout();
                return wzc.b;
        }
    }

    @Override
    public final void D(int i, float f, float f2, h94 h94Var) {
        ((Switch) this.b).invalidate();
    }

    @Override
    public final void a(by7 by7Var) {
        BubbleActivity bubbleActivity = (BubbleActivity) this.b;
        BubbleActivity bubbleActivity2 = BubbleActivity.b0;
        gda.B = false;
        Intent intent = bubbleActivity.V;
        if (intent != null) {
            bubbleActivity.z(intent, bubbleActivity.W, bubbleActivity.Y, true, bubbleActivity.X);
            bubbleActivity.V = null;
        }
        bubbleActivity.T.e0();
        nm7.e().k(nm7.o0, by7Var);
    }

    @Override
    public final void b(WebView webView, ry ryVar, Uri uri, boolean z, yu5 yu5Var) {
        String uri2;
        mw0 mw0Var = (mw0) this.b;
        qw0 qw0Var = mw0Var.R;
        if (webView == mw0Var && qw0Var != null) {
            if (webView == qw0Var.a && !ryVar.b) {
                if (uri == null) {
                    uri2 = null;
                } else {
                    uri2 = uri.toString();
                }
                String i = qw0.i(uri2);
                if (qw0Var.u0 && (TextUtils.isEmpty(qw0Var.H0) || !TextUtils.equals(qw0Var.H0, i) || !TextUtils.equals(qw0Var.H0, qw0Var.getOriginHost()))) {
                    qw0Var.e("onBotWebMessage ignored: untrusted origin");
                    return;
                }
                ow0 d = qw0Var.d();
                try {
                    ryVar.a(0);
                    String str = (String) ryVar.c;
                    if (str != null && str.length() <= 1048576) {
                        JSONObject jSONObject = new JSONObject(str);
                        String string = jSONObject.getString("eventType");
                        if (!string.isEmpty() && string.length() <= 128) {
                            gm.c3(new da7(qw0Var, webView, d, string, jSONObject.optString("eventData", null), (byte) 7));
                            return;
                        } else {
                            qw0Var.e("onBotWebMessage ignored: invalid event type");
                            return;
                        }
                    }
                    qw0Var.e("onBotWebMessage ignored: invalid payload length");
                    return;
                } catch (JSONException e) {
                    fc4.g(e, true);
                    return;
                }
            }
            qw0Var.e("onBotWebMessage ignored: invalid source or payload");
        }
    }

    @Override
    public final void c(Canvas canvas, RectF rectF, RecyclerView recyclerView) {
        r59 r59Var = (r59) recyclerView;
        tl0.a(r59Var, canvas, rectF, r59Var, (fja) this.b);
    }

    @Override
    public final void d(float f, float f2, int i, View view) {
        c71 c71Var = (c71) this.b;
        ArrayList arrayList = c71Var.c;
        if (((b71) arrayList.get(i)).a == 1) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("onlySelect", true);
            bundle.putBoolean("checkCanWrite", false);
            int i2 = c71Var.e;
            if (i2 == 1) {
                bundle.putInt("dialogsType", 6);
            } else if (i2 == 2) {
                bundle.putInt("dialogsType", 5);
            } else {
                bundle.putInt("dialogsType", 4);
            }
            bundle.putBoolean("allowGlobalSearch", false);
            nk3 nk3Var = new nk3(bundle);
            nk3Var.E2 = new g11(c71Var, nk3Var, (byte) 3);
            c71Var.presentFragment(nk3Var);
        } else if (((b71) arrayList.get(i)).a == 2) {
            t61 t61Var = ((b71) arrayList.get(i)).c;
            jx5 jx5Var = new jx5(c71Var, view.getContext());
            jx5Var.h(false);
            jx5Var.setParentWindow(ik.N(c71Var, jx5Var, view, f, f2));
            jx5Var.setCallback(new z61(c71Var, t61Var, (byte) 0));
        } else if (((b71) arrayList.get(i)).a == 4) {
            he heVar = ik.L(c71Var.getParentActivity(), jb6.M0(2131747646, null), jb6.M0(2131747647, null), jb6.M0(2131751535, null), new yt0(c71Var, (byte) 12), null).a;
            heVar.show();
            heVar.h();
        }
    }

    @Override
    public final void e() {
        ((sy4) this.b).g();
    }

    @Override
    public final float f(RecyclerView recyclerView) {
        return fja.j(recyclerView);
    }

    @Override
    public final boolean g(int i, View view) {
        kea keaVar = ((gs0) this.b).a0;
        if (!keaVar.H.F1 && (view instanceof sha)) {
            k47 messageObject = ((sha) view).getMessageObject();
            if (keaVar.c(messageObject)) {
                keaVar.g(messageObject);
                return true;
            }
            keaVar.e(messageObject);
            return true;
        }
        return false;
    }

    @Override
    public final RecyclerView h(View view) {
        return ((k71) this.b).a(view);
    }

    @Override
    public final void i(int i) {
        gda.q().edit().putInt("cache_limit", ((Integer) ((ArrayList) this.b).get(i)).intValue()).apply();
    }

    @Override
    public final Object j(Integer num, Object obj) {
        kea keaVar = (kea) this.b;
        Integer num2 = (Integer) obj;
        if (num.intValue() == -1) {
            new js0(keaVar.a, jb6.M0(2131746426, null), new mf2(keaVar, (byte) 8)).show();
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    @Override
    public final void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        byte b = this.a;
        Object obj3 = this.b;
        switch (b) {
            case 10:
                View view = (View) obj2;
                Integer num = (Integer) number;
                Float f = (Float) serializable;
                Float f2 = (Float) serializable2;
                ((vp0) obj3).a0((c6c) obj);
                return;
            default:
                zt0 zt0Var = (zt0) obj3;
                c6c c6cVar = (c6c) obj;
                View view2 = (View) obj2;
                Integer num2 = (Integer) number;
                Float f3 = (Float) serializable;
                Float f4 = (Float) serializable2;
                au0 au0Var = zt0Var.r;
                if (c6cVar.H instanceof TL_stars.StarsTransaction) {
                    nxa.l1(zt0Var.getContext(), true, au0Var.b, au0.j0(au0Var), (TL_stars.StarsTransaction) c6cVar.H, au0.k0(au0Var));
                    return;
                } else if (zt0Var.h) {
                    zt0Var.h = false;
                    zt0Var.a();
                    return;
                } else {
                    return;
                }
        }
    }

    @Override
    public final void l(Canvas canvas, RectF rectF, float f) {
        k91 k91Var = (k91) ((k6d) this.b).b;
        Paint paint = k91Var.x;
        TextPaint textPaint = k91Var.e;
        paint.setAlpha((int) (80.0f * f));
        float R1 = gm.R1(0.0f, Math.min(rectF.width(), rectF.height()) / 2.0f, f);
        canvas.drawRoundRect(rectF, R1, R1, paint);
        float i = Utilities.i((f - 0.5f) / 0.5f, 1.0f, 0.0f);
        if (i > 0.0f) {
            int alpha = textPaint.getAlpha();
            textPaint.setAlpha((int) (alpha * i));
            canvas.save();
            float min = Math.min(2.0f, Math.min(rectF.height(), rectF.width()) / gm.L(44.0f));
            canvas.scale(min, min, rectF.centerX(), rectF.centerY());
            canvas.drawText(Integer.toString(k91Var.i0 + 1), rectF.centerX(), rectF.centerY() + gm.L(5.0f), textPaint);
            canvas.restore();
            textPaint.setAlpha(alpha);
        }
    }

    @Override
    public final void n(Canvas canvas, int i) {
        ((y21) this.b).dispatchDrawImplBlur(canvas, i);
    }

    @Override
    public final void onCameraInit() {
        lb1 lb1Var = (lb1) this.b;
        HandlerThread handlerThread = lb1Var.e;
        handlerThread.start();
        lb1Var.f = new Handler(handlerThread.getLooper());
        gm.d3(lb1Var.e0, 0L);
        if (lb1Var.f0()) {
            zna znaVar = lb1Var.E;
            if (znaVar != null) {
                znaVar.d();
                lb1Var.E = null;
            }
            zna znaVar2 = new zna(new xk4(0.0f));
            lb1Var.E = znaVar2;
            znaVar2.b(new eb1(lb1Var, (byte) 0));
            lb1Var.E.a(new hx0(lb1Var, (byte) 3));
            lb1Var.E.m = new aoa(500.0f);
            lb1Var.E.m.a(0.8f);
            lb1Var.E.m.b(250.0f);
            lb1Var.E.h();
        }
    }

    @Override
    public final void q(RecyclerView recyclerView) {
        hg9.d(recyclerView);
    }

    @Override
    public final void r(he heVar, int i) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 2:
                th0 th0Var = (th0) obj;
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + a.b.getPackageName()));
                    th0Var.startActivity(intent);
                    return;
                } catch (Exception e) {
                    fc4.g(e, true);
                    return;
                }
            case 5:
                ((w0a) obj).run();
                return;
            case 6:
                TLRPC.TL_payments_giveawayInfoResults tL_payments_giveawayInfoResults = (TLRPC.TL_payments_giveawayInfoResults) obj;
                d Q = LaunchActivity.Q();
                if (Q != null) {
                    rv4.Z0(Q, tL_payments_giveawayInfoResults.gift_code_slug, null);
                    return;
                }
                return;
            case 7:
                ((ev4) obj).run();
                return;
            case 8:
                ((w0a) obj).run();
                return;
            case 16:
                ((da7) obj).run();
                return;
            case 24:
                q71 q71Var = (q71) obj;
                p71 p71Var = new p71((byte) 0, q71Var.getContext(), false);
                p71Var.J();
                p71Var.c0 = false;
                p71Var.setCancelable(false);
                Context context = q71Var.getContext();
                su suVar = new su(context, (byte) 4);
                ?? imageView = new ImageView(context);
                imageView.setAutoRepeat(true);
                imageView.f(2131624311, 150, 150, null);
                suVar.addView((View) imageView, qoe.d(150, 150.0f, 49, 0.0f, 16.0f, 0.0f, 0.0f));
                imageView.d();
                io ioVar = new io(context, false, true, true);
                suVar.b = ioVar;
                d53 d53Var = d53.g;
                ioVar.b(0.35f, 120L, d53Var);
                ioVar.setGravity(1);
                int i2 = cmb.i5;
                anb.U(ioVar, i2, null);
                ioVar.setTextSize(gm.L(24.0f));
                ioVar.setTypeface(gm.o());
                suVar.addView(ioVar, qoe.d(-1, 32.0f, 49, 0.0f, 176.0f, 0.0f, 0.0f));
                ?? view = new View(context);
                Paint paint = new Paint(1);
                view.a = paint;
                Paint paint2 = new Paint(1);
                view.b = paint2;
                view.d = new ln(350L, (View) view, d53Var);
                int i3 = cmb.M6;
                paint.setColor(cmb.w0(null, i3, false));
                paint2.setColor(cmb.p1(0.2f, cmb.w0(null, i3, false)));
                suVar.c = view;
                suVar.addView((View) view, qoe.d(240, 5.0f, 49, 0.0f, 226.0f, 0.0f, 0.0f));
                TextView textView = new TextView(context);
                textView.setGravity(1);
                td4.x(textView, i2, null, 1, 16.0f);
                textView.setText(jb6.M0(2131751983, null));
                suVar.addView(textView, qoe.d(-1, -2.0f, 49, 0.0f, 261.0f, 0.0f, 0.0f));
                TextView textView2 = new TextView(context);
                textView2.setGravity(1);
                anb.X(textView2, i2, null);
                ts2.q(14.0f, 1, 2131751982, textView2, null);
                suVar.addView(textView2, qoe.d(240, -2.0f, 49, 0.0f, 289.0f, 0.0f, 0.0f));
                suVar.e(0.0f);
                p71Var.O = suVar;
                boolean[] zArr = {false};
                float[] fArr = {0.0f};
                boolean[] zArr2 = {false};
                l97 l97Var = new l97(q71Var, suVar, fArr, zArr2, (byte) 17);
                long[] jArr = {-1};
                gm.d3(new l97(q71Var, zArr, jArr, p71Var, (byte) 18), 150L);
                y71 y71Var = q71Var.d;
                p pVar = new p(fArr, zArr2, l97Var, (byte) 5);
                o71 o71Var = new o71(zArr, suVar, jArr, p71Var, (byte) 0);
                c81 c81Var = y71Var.e0;
                if (c81Var != null) {
                    c81Var.d();
                }
                k71 k71Var = y71Var.N;
                if (k71Var != null) {
                    k71Var.e();
                    y71Var.N.f(false);
                }
                y71Var.getFileLoader().c();
                y71Var.getFileLoader().getClass();
                bc4.K.c(new g71(y71Var, pVar, o71Var, (byte) 0));
                y71Var.e0 = null;
                k71 k71Var2 = y71Var.N;
                if (k71Var2 != null) {
                    k71Var2.setCacheModel(null);
                    return;
                }
                return;
            default:
                v9b v9bVar = ((l9b) ((yc1) obj)).S1;
                k9b k9bVar = v9bVar.Y0;
                if (k9bVar != null) {
                    k9bVar.s(null, null, true);
                }
                z8b z8bVar = v9bVar.w1;
                if (z8bVar != null) {
                    z8bVar.n0();
                }
                l9b l9bVar = v9bVar.d1;
                if (l9bVar != null) {
                    l9bVar.setHasRoundVideo(false);
                }
                g6b g6bVar = v9bVar.L1;
                if (g6bVar != null) {
                    File file = g6bVar.o0;
                    if (file != null) {
                        try {
                            file.delete();
                        } catch (Exception unused) {
                        }
                        g6bVar = v9bVar.L1;
                        g6bVar.o0 = null;
                    }
                    if (g6bVar.p0 != null) {
                        try {
                            new File(v9bVar.L1.p0).delete();
                        } catch (Exception unused2) {
                        }
                        v9bVar.L1.p0 = null;
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final void s(int i) {
        boolean z;
        byte b;
        eh0 eh0Var = (eh0) this.b;
        sy4 sy4Var = eh0Var.a;
        gy4 gy4Var = eh0Var.g;
        if (Build.VERSION.SDK_INT >= 31 && gy4Var != null) {
            ArrayList arrayList = gy4Var.a;
            if (eh0Var.l || sy4.f().a) {
                if (iqd.a(i, 4) || iqd.a(i, 2)) {
                    bz4 e = sy4Var.e();
                    ViewGroup viewGroup = eh0Var.n;
                    if (viewGroup != null) {
                        e.b(viewGroup.getY(), eh0Var.m.getWidth(), eh0Var.n.getY() + eh0Var.n.getHeight());
                    }
                    gy4Var.b = e.b;
                    while (gy4Var.b > arrayList.size()) {
                        arrayList.add(new ey4(arrayList.size()));
                    }
                    for (int i2 = 0; i2 < gy4Var.b; i2++) {
                        ey4 ey4Var = (ey4) arrayList.get(i2);
                        ey4Var.a.set(e.c(i2));
                        ey4Var.b(gy4Var.m, gy4Var.n, gy4Var.o);
                        ey4Var.c(gy4Var.k);
                        int i3 = gy4Var.p;
                        int i4 = gy4Var.q;
                        int i5 = gy4Var.r;
                        int i6 = gy4Var.s;
                        ey4Var.u = i3;
                        ey4Var.v = i4;
                        ey4Var.w = i5;
                        ey4Var.x = i6;
                    }
                }
                gy4Var.c = eh0Var.o;
                gy4Var.d = eh0Var.m;
                byte b2 = 1;
                if (sy4Var.j > 0) {
                    z = true;
                } else {
                    z = false;
                }
                boolean z2 = !z;
                if (gy4Var.l != z2) {
                    gy4Var.l = z2;
                    if (!z) {
                        b = 5;
                    } else {
                        b = 1;
                    }
                    gy4Var.m = b;
                    if (!z) {
                        b2 = 10;
                    }
                    gy4Var.n = b2;
                    gy4Var.o = Math.max((int) b, (int) b2);
                    for (int i7 = 0; i7 < gy4Var.b; i7++) {
                        ((ey4) arrayList.get(i7)).b(gy4Var.m, gy4Var.n, gy4Var.o);
                    }
                    gy4Var.f();
                }
                int i8 = sy4Var.k;
                int i9 = sy4Var.l;
                gy4Var.t = i8;
                gy4Var.u = i9;
                gy4Var.f();
                gy4Var.e();
                Runnable runnable = eh0Var.j;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
    }

    @Override
    public final boolean u(View view) {
        return false;
    }

    @Override
    public final void m() {
    }

    @Override
    public final void V(float f, int i) {
    }

    @Override
    public final void p(View view, float f, float f2) {
    }
}
