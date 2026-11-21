package org.telegram.messenger.camera;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.m5;
import c8.ma;
import c8.ra;
import di.xb;
import hi.w4;
import java.util.Calendar;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import org.telegram.messenger.g0;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.mp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.w2;
import org.telegram.ui.Components.c5;
import org.telegram.ui.Components.g4;
import org.telegram.ui.Components.h2;
import org.telegram.ui.Components.h4;
import org.telegram.ui.Components.l2;
import org.telegram.ui.Components.me;
import org.telegram.ui.Components.n2;
import org.telegram.ui.Components.ny;
import org.telegram.ui.Components.tb0;
import org.telegram.ui.Components.tn;
import org.telegram.ui.Components.w3;
import org.telegram.ui.cr;
public final class i implements Runnable {
    public final int f23328a;
    public final Object f23329b;
    public final Object f23330c;
    public final Object d;
    public final Object f23331e;

    public i(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.f23328a = i7;
        this.f23330c = obj;
        this.f23329b = obj2;
        this.d = obj3;
        this.f23331e = obj4;
    }

    private final void a() {
        int x02;
        int x03;
        int x04;
        int x05;
        me meVar;
        ViewGroup viewGroup;
        w3 w3Var;
        tn tnVar = (tn) this.f23330c;
        Context context = (Context) this.f23329b;
        h6 h6Var = (h6) this.f23331e;
        long j3 = tnVar.W;
        final h2 h2Var = new h2(13, tnVar, (View) this.d);
        me meVar2 = new me(3);
        int i7 = m6.f29486j5;
        if (h6Var != null) {
            x02 = h6Var.i(i7);
        } else {
            x02 = m6.x0(null, i7, false);
        }
        int i10 = x02;
        int i11 = m6.f29451h5;
        if (h6Var != null) {
            x03 = h6Var.i(i11);
        } else {
            x03 = m6.x0(null, i11, false);
        }
        int i12 = m6.Aj;
        if (h6Var != null) {
            h6Var.i(i12);
        } else {
            m6.x0(null, i12, false);
        }
        int i13 = m6.Ej;
        if (h6Var != null) {
            h6Var.i(i13);
        } else {
            m6.x0(null, i13, false);
        }
        int i14 = m6.E8;
        if (h6Var != null) {
            h6Var.i(i14);
        } else {
            m6.x0(null, i14, false);
        }
        int i15 = m6.G8;
        if (h6Var != null) {
            h6Var.i(i15);
        } else {
            m6.x0(null, i15, false);
        }
        int i16 = m6.f29470i6;
        if (h6Var != null) {
            h6Var.i(i16);
        } else {
            m6.x0(null, i16, false);
        }
        int i17 = m6.Ji;
        if (h6Var != null) {
            x04 = h6Var.i(i17);
        } else {
            x04 = m6.x0(null, i17, false);
        }
        int i18 = m6.Fi;
        if (h6Var != null) {
            x05 = h6Var.i(i18);
        } else {
            x05 = m6.x0(null, i18, false);
        }
        int i19 = m6.Hi;
        if (h6Var != null) {
            h6Var.i(i19);
        } else {
            m6.x0(null, i19, false);
        }
        Pattern pattern = c5.f34019a;
        if (context == null) {
            return;
        }
        final int n22 = (int) mp.u1(j10.f24798t0).A7.J.n2(TimeUnit.SECONDS);
        final w4 w4Var = new w4(context, h6Var);
        ((w2) w4Var.f15705b).f30211w0 = false;
        int i20 = x04;
        final tb0 tb0Var = new tb0(context, h6Var);
        tb0Var.setTextColor(i10);
        tb0Var.setTextOffset(g0.L(10.0f));
        tb0Var.setItemCount(5);
        int i21 = x05;
        final ?? tb0Var2 = new tb0(context, h6Var);
        tb0Var2.setWrapSelectorWheel(true);
        tb0Var2.setAllItemsCount(24);
        tb0Var2.setItemCount(5);
        tb0Var2.setTextColor(i10);
        tb0Var2.setTextOffset(-g0.L(10.0f));
        final ?? tb0Var3 = new tb0(context, h6Var);
        tb0Var3.setWrapSelectorWheel(true);
        tb0Var3.setAllItemsCount(60);
        tb0Var3.setItemCount(5);
        tb0Var3.setTextColor(i10);
        tb0Var3.setTextOffset(-g0.L(34.0f));
        ViewGroup frameLayout = new FrameLayout(context);
        int i22 = x03;
        w3 w3Var2 = new w3(context, tb0Var, tb0Var2, tb0Var3, 3);
        w3Var2.setOrientation(1);
        frameLayout.addView(w3Var2, ma.c(-1.0f, -1));
        frameLayout.addView(new FrameLayout(context), ma.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 120.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        w3Var2.addView(frameLayout2, ma.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(gd.N0(2131744586, null));
        textView.setTextColor(i10);
        i5.c.x(textView, 1, 20.0f);
        frameLayout2.addView(textView, ma.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new gi.a(10));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        w3Var2.addView(linearLayout, ma.q(-1, -2, 1.0f, 0, 0, 23, 0, 23));
        final TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 12.0f);
        t6.U(textView2, m6.f29617q5, h6Var);
        textView2.setGravity(17);
        final Calendar calendar = Calendar.getInstance();
        xb xbVar = new xb(context, 16);
        xbVar.setText(gd.N0(2131744587, null));
        ra.b(xbVar, 0.02f, 1.2f);
        linearLayout.addView(tb0Var, ma.l(0.5f, 0, 270));
        tb0Var.setMinValue(0);
        tb0Var.setMaxValue(365);
        tb0Var.setWrapSelectorWheel(false);
        tb0Var.setFormatter(new cr(28));
        m5 m5Var = new m5(n22, tb0Var, (g4) tb0Var2, (h4) tb0Var3, textView2);
        tb0Var.setOnValueChangedListener(m5Var);
        tb0Var2.setMinValue(0);
        tb0Var2.setMaxValue(23);
        linearLayout.addView((View) tb0Var2, ma.l(0.2f, 0, 270));
        tb0Var2.setFormatter(new cr(29));
        tb0Var2.setOnValueChangedListener(m5Var);
        tb0Var3.setMinValue(0);
        tb0Var3.setMaxValue(59);
        tb0Var3.setValue(0);
        tb0Var3.setFormatter(new l2(0));
        linearLayout.addView((View) tb0Var3, ma.l(0.3f, 0, 270));
        tb0Var3.setOnValueChangedListener(m5Var);
        if (j3 > 0 && j3 != 2147483646) {
            long j10 = 1000 * j3;
            meVar = meVar2;
            viewGroup = frameLayout;
            calendar.setTimeInMillis(System.currentTimeMillis());
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            calendar.set(11, 0);
            w3Var = w3Var2;
            int timeInMillis = (int) ((j10 - calendar.getTimeInMillis()) / 86400000);
            calendar.setTimeInMillis(j10);
            if (timeInMillis >= 0) {
                tb0Var3.setValue(calendar.get(12));
                tb0Var2.setValue(calendar.get(11));
                tb0Var.setValue(timeInMillis);
            }
        } else {
            meVar = meVar2;
            viewGroup = frameLayout;
            w3Var = w3Var2;
        }
        final boolean[] zArr = {true};
        c5.g(null, null, 0L, n22, 3, tb0Var, tb0Var2, tb0Var3);
        c5.e(textView2, tb0Var, tb0Var2, tb0Var3);
        xbVar.setPadding(g0.L(34.0f), 0, g0.L(34.0f), 0);
        xbVar.setGravity(17);
        xbVar.setTextColor(i20);
        xbVar.setTextSize(1, 14.0f);
        xbVar.setTypeface(g0.o());
        xbVar.setBackground(a6.e(i21, 24.0f));
        w3 w3Var3 = w3Var;
        w3Var3.addView(xbVar, ma.t(-1, 48, 83, 14, 15, 14, 16));
        xbVar.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                zArr[0] = false;
                tb0 tb0Var4 = tb0Var;
                g4 g4Var = tb0Var2;
                h4 h4Var = tb0Var3;
                boolean g10 = c5.g(null, null, 0L, n22, 3, tb0Var4, g4Var, h4Var);
                c5.e(textView2, tb0Var4, g4Var, h4Var);
                long currentTimeMillis = System.currentTimeMillis();
                Calendar calendar2 = calendar;
                calendar2.setTimeInMillis(currentTimeMillis);
                calendar2.add(6, tb0Var4.getValue());
                calendar2.set(11, g4Var.getValue());
                calendar2.set(12, h4Var.getValue());
                if (g10) {
                    calendar2.set(13, 0);
                    calendar2.set(14, 0);
                }
                h2Var.O((int) (calendar2.getTimeInMillis() / 1000), 0, true);
                ((org.telegram.ui.ActionBar.w2) w4Var.f15705b).f30215y0.run();
            }
        });
        w3Var3.addView(textView2, ma.t(-1, -2, 83, 14, 0, 14, 16));
        w2 w2Var = (w2) w4Var.f15705b;
        w2Var.O = viewGroup;
        w2Var.show();
        w2Var.setOnDismissListener(new n2(0, meVar, zArr));
        w2Var.v0(i22);
        w2Var.P(i22);
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.camera.i.run():void");
    }

    public i(Runnable runnable, CameraSession cameraSession, CountDownLatch countDownLatch, Runnable runnable2) {
        this.f23328a = 1;
        this.f23329b = runnable;
        this.f23330c = cameraSession;
        this.f23331e = countDownLatch;
        this.d = runnable2;
    }

    public i(CameraSession cameraSession, Runnable runnable, SurfaceTexture surfaceTexture, Runnable runnable2) {
        this.f23328a = 0;
        this.f23330c = cameraSession;
        this.f23329b = runnable;
        this.f23331e = surfaceTexture;
        this.d = runnable2;
    }

    public i(ny nyVar, TLRPC.TL_messages_getStickers tL_messages_getStickers, TLObject tLObject, Runnable runnable) {
        this.f23328a = 27;
        this.f23330c = nyVar;
        this.d = tL_messages_getStickers;
        this.f23331e = tLObject;
        this.f23329b = runnable;
    }
}
