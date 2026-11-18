package org.telegram.messenger.camera;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.j5;
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
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.x2;
import org.telegram.ui.Components.b5;
import org.telegram.ui.Components.f4;
import org.telegram.ui.Components.g2;
import org.telegram.ui.Components.g4;
import org.telegram.ui.Components.k2;
import org.telegram.ui.Components.ly;
import org.telegram.ui.Components.m2;
import org.telegram.ui.Components.me;
import org.telegram.ui.Components.rn;
import org.telegram.ui.Components.sb0;
import org.telegram.ui.Components.v3;
import org.telegram.ui.cr;
public final class i implements Runnable {
    public final int f23303a;
    public final Object f23304b;
    public final Object f23305c;
    public final Object d;
    public final Object f23306e;

    public i(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.f23303a = i7;
        this.f23305c = obj;
        this.f23304b = obj2;
        this.d = obj3;
        this.f23306e = obj4;
    }

    private final void a() {
        int x02;
        int x03;
        int x04;
        int x05;
        me meVar;
        ViewGroup viewGroup;
        v3 v3Var;
        rn rnVar = (rn) this.f23305c;
        Context context = (Context) this.f23304b;
        i6 i6Var = (i6) this.f23306e;
        long j3 = rnVar.W;
        final g2 g2Var = new g2(13, rnVar, (View) this.d);
        me meVar2 = new me(3);
        int i7 = n6.f29504j5;
        if (i6Var != null) {
            x02 = i6Var.i(i7);
        } else {
            x02 = n6.x0(null, i7, false);
        }
        int i10 = x02;
        int i11 = n6.f29469h5;
        if (i6Var != null) {
            x03 = i6Var.i(i11);
        } else {
            x03 = n6.x0(null, i11, false);
        }
        int i12 = n6.Aj;
        if (i6Var != null) {
            i6Var.i(i12);
        } else {
            n6.x0(null, i12, false);
        }
        int i13 = n6.Ej;
        if (i6Var != null) {
            i6Var.i(i13);
        } else {
            n6.x0(null, i13, false);
        }
        int i14 = n6.E8;
        if (i6Var != null) {
            i6Var.i(i14);
        } else {
            n6.x0(null, i14, false);
        }
        int i15 = n6.G8;
        if (i6Var != null) {
            i6Var.i(i15);
        } else {
            n6.x0(null, i15, false);
        }
        int i16 = n6.f29488i6;
        if (i6Var != null) {
            i6Var.i(i16);
        } else {
            n6.x0(null, i16, false);
        }
        int i17 = n6.Ji;
        if (i6Var != null) {
            x04 = i6Var.i(i17);
        } else {
            x04 = n6.x0(null, i17, false);
        }
        int i18 = n6.Fi;
        if (i6Var != null) {
            x05 = i6Var.i(i18);
        } else {
            x05 = n6.x0(null, i18, false);
        }
        int i19 = n6.Hi;
        if (i6Var != null) {
            i6Var.i(i19);
        } else {
            n6.x0(null, i19, false);
        }
        Pattern pattern = b5.f33529a;
        if (context == null) {
            return;
        }
        final int n22 = (int) mp.u1(j10.f24773t0).A7.J.n2(TimeUnit.SECONDS);
        final w4 w4Var = new w4(context, i6Var);
        ((x2) w4Var.f15645b).f30230w0 = false;
        int i20 = x04;
        final sb0 sb0Var = new sb0(context, i6Var);
        sb0Var.setTextColor(i10);
        sb0Var.setTextOffset(g0.L(10.0f));
        sb0Var.setItemCount(5);
        int i21 = x05;
        final ?? sb0Var2 = new sb0(context, i6Var);
        sb0Var2.setWrapSelectorWheel(true);
        sb0Var2.setAllItemsCount(24);
        sb0Var2.setItemCount(5);
        sb0Var2.setTextColor(i10);
        sb0Var2.setTextOffset(-g0.L(10.0f));
        final ?? sb0Var3 = new sb0(context, i6Var);
        sb0Var3.setWrapSelectorWheel(true);
        sb0Var3.setAllItemsCount(60);
        sb0Var3.setItemCount(5);
        sb0Var3.setTextColor(i10);
        sb0Var3.setTextOffset(-g0.L(34.0f));
        ViewGroup frameLayout = new FrameLayout(context);
        int i22 = x03;
        v3 v3Var2 = new v3(context, sb0Var, sb0Var2, sb0Var3, 3);
        v3Var2.setOrientation(1);
        frameLayout.addView(v3Var2, ma.c(-1.0f, -1));
        frameLayout.addView(new FrameLayout(context), ma.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 120.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        v3Var2.addView(frameLayout2, ma.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(gd.M0(2131744592, null));
        textView.setTextColor(i10);
        i5.c.x(textView, 1, 20.0f);
        frameLayout2.addView(textView, ma.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new gi.a(10));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        v3Var2.addView(linearLayout, ma.q(-1, -2, 1.0f, 0, 0, 23, 0, 23));
        final TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 12.0f);
        u6.U(textView2, n6.f29635q5, i6Var);
        textView2.setGravity(17);
        final Calendar calendar = Calendar.getInstance();
        xb xbVar = new xb(context, 16);
        xbVar.setText(gd.M0(2131744593, null));
        ra.b(xbVar, 0.02f, 1.2f);
        linearLayout.addView(sb0Var, ma.l(0.5f, 0, 270));
        sb0Var.setMinValue(0);
        sb0Var.setMaxValue(365);
        sb0Var.setWrapSelectorWheel(false);
        sb0Var.setFormatter(new cr(28));
        j5 j5Var = new j5(n22, sb0Var, (f4) sb0Var2, (g4) sb0Var3, textView2);
        sb0Var.setOnValueChangedListener(j5Var);
        sb0Var2.setMinValue(0);
        sb0Var2.setMaxValue(23);
        linearLayout.addView((View) sb0Var2, ma.l(0.2f, 0, 270));
        sb0Var2.setFormatter(new cr(29));
        sb0Var2.setOnValueChangedListener(j5Var);
        sb0Var3.setMinValue(0);
        sb0Var3.setMaxValue(59);
        sb0Var3.setValue(0);
        sb0Var3.setFormatter(new k2(0));
        linearLayout.addView((View) sb0Var3, ma.l(0.3f, 0, 270));
        sb0Var3.setOnValueChangedListener(j5Var);
        if (j3 > 0 && j3 != 2147483646) {
            long j10 = 1000 * j3;
            meVar = meVar2;
            viewGroup = frameLayout;
            calendar.setTimeInMillis(System.currentTimeMillis());
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            calendar.set(11, 0);
            v3Var = v3Var2;
            int timeInMillis = (int) ((j10 - calendar.getTimeInMillis()) / 86400000);
            calendar.setTimeInMillis(j10);
            if (timeInMillis >= 0) {
                sb0Var3.setValue(calendar.get(12));
                sb0Var2.setValue(calendar.get(11));
                sb0Var.setValue(timeInMillis);
            }
        } else {
            meVar = meVar2;
            viewGroup = frameLayout;
            v3Var = v3Var2;
        }
        final boolean[] zArr = {true};
        b5.g(null, null, 0L, n22, 3, sb0Var, sb0Var2, sb0Var3);
        b5.e(textView2, sb0Var, sb0Var2, sb0Var3);
        xbVar.setPadding(g0.L(34.0f), 0, g0.L(34.0f), 0);
        xbVar.setGravity(17);
        xbVar.setTextColor(i20);
        xbVar.setTextSize(1, 14.0f);
        xbVar.setTypeface(g0.o());
        xbVar.setBackground(b6.e(i21, 24.0f));
        v3 v3Var3 = v3Var;
        v3Var3.addView(xbVar, ma.t(-1, 48, 83, 14, 15, 14, 16));
        xbVar.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                zArr[0] = false;
                sb0 sb0Var4 = sb0Var;
                f4 f4Var = sb0Var2;
                g4 g4Var = sb0Var3;
                boolean g10 = b5.g(null, null, 0L, n22, 3, sb0Var4, f4Var, g4Var);
                b5.e(textView2, sb0Var4, f4Var, g4Var);
                long currentTimeMillis = System.currentTimeMillis();
                Calendar calendar2 = calendar;
                calendar2.setTimeInMillis(currentTimeMillis);
                calendar2.add(6, sb0Var4.getValue());
                calendar2.set(11, f4Var.getValue());
                calendar2.set(12, g4Var.getValue());
                if (g10) {
                    calendar2.set(13, 0);
                    calendar2.set(14, 0);
                }
                g2Var.O((int) (calendar2.getTimeInMillis() / 1000), 0, true);
                ((org.telegram.ui.ActionBar.x2) w4Var.f15645b).f30234y0.run();
            }
        });
        v3Var3.addView(textView2, ma.t(-1, -2, 83, 14, 0, 14, 16));
        x2 x2Var = (x2) w4Var.f15645b;
        x2Var.O = viewGroup;
        x2Var.show();
        x2Var.setOnDismissListener(new m2(0, meVar, zArr));
        x2Var.v0(i22);
        x2Var.P(i22);
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.camera.i.run():void");
    }

    public i(Runnable runnable, CameraSession cameraSession, CountDownLatch countDownLatch, Runnable runnable2) {
        this.f23303a = 1;
        this.f23304b = runnable;
        this.f23305c = cameraSession;
        this.f23306e = countDownLatch;
        this.d = runnable2;
    }

    public i(CameraSession cameraSession, Runnable runnable, SurfaceTexture surfaceTexture, Runnable runnable2) {
        this.f23303a = 0;
        this.f23305c = cameraSession;
        this.f23304b = runnable;
        this.f23306e = surfaceTexture;
        this.d = runnable2;
    }

    public i(ly lyVar, TLRPC.TL_messages_getStickers tL_messages_getStickers, TLObject tLObject, Runnable runnable) {
        this.f23303a = 27;
        this.f23305c = lyVar;
        this.d = tL_messages_getStickers;
        this.f23306e = tLObject;
        this.f23304b = runnable;
    }
}
