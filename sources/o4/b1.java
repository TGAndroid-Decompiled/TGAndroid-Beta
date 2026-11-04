package o4;

import ai.m3;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import b8.mf;
import b8.pf;
import ci.ec;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import org.telegram.messenger.bd;
import org.telegram.messenger.h10;
import org.telegram.messenger.hc;
import org.telegram.messenger.hp;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.ActionBar.t2;
import org.telegram.ui.ActionBar.y5;
import org.telegram.ui.Components.an;
import org.telegram.ui.Components.c2;
import org.telegram.ui.Components.cb0;
import org.telegram.ui.Components.n3;
import org.telegram.ui.Components.t4;
import org.telegram.ui.Components.x3;
import org.telegram.ui.Components.y3;
import org.telegram.ui.jo;
public final class b1 implements Runnable {
    public final int f20589a;
    public final Object f20590b;
    public final Object f20591c;
    public final Object d;
    public final Object f20592e;

    public b1(Object obj, Object obj2, Object obj3, Object obj4, int i3) {
        this.f20589a = i3;
        this.f20590b = obj;
        this.f20591c = obj2;
        this.d = obj3;
        this.f20592e = obj4;
    }

    private final void a() {
        int x02;
        int x03;
        int x04;
        int x05;
        ViewGroup viewGroup;
        an anVar = (an) this.f20590b;
        Context context = (Context) this.f20591c;
        e6 e6Var = (e6) this.f20592e;
        long j10 = anVar.W;
        final jo joVar = new jo(20, anVar, (View) this.d);
        hc hcVar = new hc(29);
        int i3 = k6.f27988j5;
        if (e6Var != null) {
            x02 = e6Var.f(i3);
        } else {
            x02 = k6.x0(null, i3, false);
        }
        int i10 = x02;
        int i11 = k6.f27954h5;
        if (e6Var != null) {
            x03 = e6Var.f(i11);
        } else {
            x03 = k6.x0(null, i11, false);
        }
        int i12 = k6.xj;
        if (e6Var != null) {
            e6Var.f(i12);
        } else {
            k6.x0(null, i12, false);
        }
        int i13 = k6.Bj;
        if (e6Var != null) {
            e6Var.f(i13);
        } else {
            k6.x0(null, i13, false);
        }
        int i14 = k6.E8;
        if (e6Var != null) {
            e6Var.f(i14);
        } else {
            k6.x0(null, i14, false);
        }
        int i15 = k6.G8;
        if (e6Var != null) {
            e6Var.f(i15);
        } else {
            k6.x0(null, i15, false);
        }
        int i16 = k6.f27972i6;
        if (e6Var != null) {
            e6Var.f(i16);
        } else {
            k6.x0(null, i16, false);
        }
        int i17 = k6.Gi;
        if (e6Var != null) {
            x04 = e6Var.f(i17);
        } else {
            x04 = k6.x0(null, i17, false);
        }
        int i18 = k6.Ci;
        if (e6Var != null) {
            x05 = e6Var.f(i18);
        } else {
            x05 = k6.x0(null, i18, false);
        }
        int i19 = k6.Ei;
        if (e6Var != null) {
            e6Var.f(i19);
        } else {
            k6.x0(null, i19, false);
        }
        Pattern pattern = t4.f38241a;
        if (context == null) {
            return;
        }
        final int g22 = (int) hp.s1(h10.f22829t0).f23167x7.E.g2(TimeUnit.SECONDS);
        final hi.d dVar = new hi.d(context, e6Var);
        ((t2) dVar.f14429b).f28621w0 = false;
        int i20 = x04;
        final cb0 cb0Var = new cb0(context, e6Var);
        cb0Var.setTextColor(i10);
        cb0Var.setTextOffset(org.telegram.messenger.g0.L(10.0f));
        cb0Var.setItemCount(5);
        int i21 = x05;
        final ?? cb0Var2 = new cb0(context, e6Var);
        cb0Var2.setWrapSelectorWheel(true);
        cb0Var2.setAllItemsCount(24);
        cb0Var2.setItemCount(5);
        cb0Var2.setTextColor(i10);
        cb0Var2.setTextOffset(-org.telegram.messenger.g0.L(10.0f));
        final ?? cb0Var3 = new cb0(context, e6Var);
        cb0Var3.setWrapSelectorWheel(true);
        cb0Var3.setAllItemsCount(60);
        cb0Var3.setItemCount(5);
        cb0Var3.setTextColor(i10);
        cb0Var3.setTextOffset(-org.telegram.messenger.g0.L(34.0f));
        ViewGroup frameLayout = new FrameLayout(context);
        int i22 = x03;
        n3 n3Var = new n3(context, cb0Var, cb0Var2, cb0Var3, 3);
        n3Var.setOrientation(1);
        frameLayout.addView(n3Var, mf.c(-1.0f, -1));
        frameLayout.addView(new FrameLayout(context), mf.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 120.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        n3Var.addView(frameLayout2, mf.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(bd.M0(2131744837, null));
        textView.setTextColor(i10);
        k2.p1.t(textView, 1, 20.0f);
        frameLayout2.addView(textView, mf.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new fi.a(10));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        n3Var.addView(linearLayout, mf.q(-1, -2, 1.0f, 0, 0, 23, 0, 23));
        final TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 12.0f);
        r6.V(textView2, k6.f28120q5, e6Var);
        textView2.setGravity(17);
        final Calendar calendar = Calendar.getInstance();
        ec ecVar = new ec(context, 16);
        ecVar.setText(bd.M0(2131744838, null));
        pf.b(ecVar, 0.02f, 1.2f);
        linearLayout.addView(cb0Var, mf.l(0.5f, 0, 270));
        cb0Var.setMinValue(0);
        cb0Var.setMaxValue(365);
        cb0Var.setWrapSelectorWheel(false);
        cb0Var.setFormatter(new org.telegram.ui.Components.c(20));
        m3 m3Var = new m3(g22, cb0Var, (x3) cb0Var2, (y3) cb0Var3, textView2);
        cb0Var.setOnValueChangedListener(m3Var);
        cb0Var2.setMinValue(0);
        cb0Var2.setMaxValue(23);
        linearLayout.addView((View) cb0Var2, mf.l(0.2f, 0, 270));
        cb0Var2.setFormatter(new org.telegram.ui.Components.c(21));
        cb0Var2.setOnValueChangedListener(m3Var);
        cb0Var3.setMinValue(0);
        cb0Var3.setMaxValue(59);
        cb0Var3.setValue(0);
        cb0Var3.setFormatter(new org.telegram.ui.Components.c(22));
        linearLayout.addView((View) cb0Var3, mf.l(0.3f, 0, 270));
        cb0Var3.setOnValueChangedListener(m3Var);
        if (j10 > 0 && j10 != 2147483646) {
            long j11 = 1000 * j10;
            viewGroup = frameLayout;
            calendar.setTimeInMillis(System.currentTimeMillis());
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            calendar.set(11, 0);
            int timeInMillis = (int) ((j11 - calendar.getTimeInMillis()) / 86400000);
            calendar.setTimeInMillis(j11);
            if (timeInMillis >= 0) {
                cb0Var3.setValue(calendar.get(12));
                cb0Var2.setValue(calendar.get(11));
                cb0Var.setValue(timeInMillis);
            }
        } else {
            viewGroup = frameLayout;
        }
        final boolean[] zArr = {true};
        t4.g(null, null, 0L, g22, 3, cb0Var, cb0Var2, cb0Var3);
        t4.e(textView2, cb0Var, cb0Var2, cb0Var3);
        ecVar.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
        ecVar.setGravity(17);
        ecVar.setTextColor(i20);
        ecVar.setTextSize(1, 14.0f);
        ecVar.setTypeface(org.telegram.messenger.g0.o());
        ecVar.setBackground(y5.e(i21, 24.0f));
        n3Var.addView(ecVar, mf.t(-1, 48, 83, 14, 15, 14, 16));
        ecVar.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                zArr[0] = false;
                cb0 cb0Var4 = cb0Var;
                x3 x3Var = cb0Var2;
                y3 y3Var = cb0Var3;
                boolean g7 = t4.g(null, null, 0L, g22, 3, cb0Var4, x3Var, y3Var);
                t4.e(textView2, cb0Var4, x3Var, y3Var);
                long currentTimeMillis = System.currentTimeMillis();
                Calendar calendar2 = calendar;
                calendar2.setTimeInMillis(currentTimeMillis);
                calendar2.add(6, cb0Var4.getValue());
                calendar2.set(11, x3Var.getValue());
                calendar2.set(12, y3Var.getValue());
                if (g7) {
                    calendar2.set(13, 0);
                    calendar2.set(14, 0);
                }
                joVar.L((int) (calendar2.getTimeInMillis() / 1000), 0, true);
                ((org.telegram.ui.ActionBar.t2) dVar.f14429b).f28625y0.run();
            }
        });
        n3Var.addView(textView2, mf.t(-1, -2, 83, 14, 0, 14, 16));
        t2 t2Var = (t2) dVar.f14429b;
        t2Var.O = viewGroup;
        t2Var.show();
        t2Var.setOnDismissListener(new c2(0, hcVar, zArr));
        t2Var.v0(i22);
        t2Var.O(i22);
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: o4.b1.run():void");
    }
}
