package oi;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.na;
import c8.sa;
import di.xb;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.messenger.mp;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.ne;
import org.telegram.ui.Components.qb0;
import org.telegram.ui.Components.qn;
import org.telegram.ui.cr;
public final class h implements Runnable {
    public final int f22221a;
    public final Object f22222b;
    public final Object f22223c;
    public final Object d;
    public final Object f22224e;

    public h(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.f22221a = i7;
        this.f22222b = obj;
        this.f22223c = obj2;
        this.d = obj3;
        this.f22224e = obj4;
    }

    private final void a() {
        int x02;
        int x03;
        int x04;
        int x05;
        ne neVar;
        ViewGroup viewGroup;
        org.telegram.ui.Components.v3 v3Var;
        qn qnVar = (qn) this.f22222b;
        Context context = (Context) this.f22223c;
        i6 i6Var = (i6) this.f22224e;
        long j3 = qnVar.W;
        final org.telegram.ui.Components.g2 g2Var = new org.telegram.ui.Components.g2(13, qnVar, (View) this.d);
        ne neVar2 = new ne(3);
        int i7 = n6.f29559j5;
        if (i6Var != null) {
            x02 = i6Var.g(i7);
        } else {
            x02 = n6.x0(null, i7, false);
        }
        int i10 = x02;
        int i11 = n6.f29524h5;
        if (i6Var != null) {
            x03 = i6Var.g(i11);
        } else {
            x03 = n6.x0(null, i11, false);
        }
        int i12 = n6.Aj;
        if (i6Var != null) {
            i6Var.g(i12);
        } else {
            n6.x0(null, i12, false);
        }
        int i13 = n6.Ej;
        if (i6Var != null) {
            i6Var.g(i13);
        } else {
            n6.x0(null, i13, false);
        }
        int i14 = n6.E8;
        if (i6Var != null) {
            i6Var.g(i14);
        } else {
            n6.x0(null, i14, false);
        }
        int i15 = n6.G8;
        if (i6Var != null) {
            i6Var.g(i15);
        } else {
            n6.x0(null, i15, false);
        }
        int i16 = n6.f29543i6;
        if (i6Var != null) {
            i6Var.g(i16);
        } else {
            n6.x0(null, i16, false);
        }
        int i17 = n6.Ji;
        if (i6Var != null) {
            x04 = i6Var.g(i17);
        } else {
            x04 = n6.x0(null, i17, false);
        }
        int i18 = n6.Fi;
        if (i6Var != null) {
            x05 = i6Var.g(i18);
        } else {
            x05 = n6.x0(null, i18, false);
        }
        int i19 = n6.Hi;
        if (i6Var != null) {
            i6Var.g(i19);
        } else {
            n6.x0(null, i19, false);
        }
        Pattern pattern = org.telegram.ui.Components.b5.f33627a;
        if (context == null) {
            return;
        }
        final int l02 = (int) mp.u1(i10.f24637t0).A7.J.l0(TimeUnit.SECONDS);
        final h6.o oVar = new h6.o(context, i6Var);
        ((org.telegram.ui.ActionBar.w2) oVar.f13936b).f30264w0 = false;
        int i20 = x04;
        final qb0 qb0Var = new qb0(context, i6Var);
        qb0Var.setTextColor(i10);
        qb0Var.setTextOffset(org.telegram.messenger.g0.L(10.0f));
        qb0Var.setItemCount(5);
        int i21 = x05;
        final ?? qb0Var2 = new qb0(context, i6Var);
        qb0Var2.setWrapSelectorWheel(true);
        qb0Var2.setAllItemsCount(24);
        qb0Var2.setItemCount(5);
        qb0Var2.setTextColor(i10);
        qb0Var2.setTextOffset(-org.telegram.messenger.g0.L(10.0f));
        final ?? qb0Var3 = new qb0(context, i6Var);
        qb0Var3.setWrapSelectorWheel(true);
        qb0Var3.setAllItemsCount(60);
        qb0Var3.setItemCount(5);
        qb0Var3.setTextColor(i10);
        qb0Var3.setTextOffset(-org.telegram.messenger.g0.L(34.0f));
        ViewGroup frameLayout = new FrameLayout(context);
        int i22 = x03;
        org.telegram.ui.Components.v3 v3Var2 = new org.telegram.ui.Components.v3(context, qb0Var, qb0Var2, qb0Var3, 3);
        v3Var2.setOrientation(1);
        frameLayout.addView(v3Var2, na.c(-1.0f, -1));
        frameLayout.addView(new FrameLayout(context), na.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 120.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        v3Var2.addView(frameLayout2, na.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(gd.N0(2131744586, null));
        textView.setTextColor(i10);
        i5.c.x(textView, 1, 20.0f);
        frameLayout2.addView(textView, na.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new gi.a(10));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        v3Var2.addView(linearLayout, na.q(-1, -2, 1.0f, 0, 0, 23, 0, 23));
        final TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 12.0f);
        u6.U(textView2, n6.f29690q5, i6Var);
        textView2.setGravity(17);
        final Calendar calendar = Calendar.getInstance();
        xb xbVar = new xb(context, 16);
        xbVar.setText(gd.N0(2131744587, null));
        sa.b(xbVar, 0.02f, 1.2f);
        linearLayout.addView(qb0Var, na.l(0.5f, 0, 270));
        qb0Var.setMinValue(0);
        qb0Var.setMaxValue(365);
        qb0Var.setWrapSelectorWheel(false);
        qb0Var.setFormatter(new cr(28));
        bi.o5 o5Var = new bi.o5(l02, qb0Var, (org.telegram.ui.Components.f4) qb0Var2, (org.telegram.ui.Components.g4) qb0Var3, textView2);
        qb0Var.setOnValueChangedListener(o5Var);
        qb0Var2.setMinValue(0);
        qb0Var2.setMaxValue(23);
        linearLayout.addView((View) qb0Var2, na.l(0.2f, 0, 270));
        qb0Var2.setFormatter(new cr(29));
        qb0Var2.setOnValueChangedListener(o5Var);
        qb0Var3.setMinValue(0);
        qb0Var3.setMaxValue(59);
        qb0Var3.setValue(0);
        qb0Var3.setFormatter(new org.telegram.ui.Components.k2(0));
        linearLayout.addView((View) qb0Var3, na.l(0.3f, 0, 270));
        qb0Var3.setOnValueChangedListener(o5Var);
        if (j3 > 0 && j3 != 2147483646) {
            long j10 = 1000 * j3;
            neVar = neVar2;
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
                qb0Var3.setValue(calendar.get(12));
                qb0Var2.setValue(calendar.get(11));
                qb0Var.setValue(timeInMillis);
            }
        } else {
            neVar = neVar2;
            viewGroup = frameLayout;
            v3Var = v3Var2;
        }
        final boolean[] zArr = {true};
        org.telegram.ui.Components.b5.g(null, null, 0L, l02, 3, qb0Var, qb0Var2, qb0Var3);
        org.telegram.ui.Components.b5.e(textView2, qb0Var, qb0Var2, qb0Var3);
        xbVar.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
        xbVar.setGravity(17);
        xbVar.setTextColor(i20);
        xbVar.setTextSize(1, 14.0f);
        xbVar.setTypeface(org.telegram.messenger.g0.o());
        xbVar.setBackground(org.telegram.ui.ActionBar.b6.e(i21, 24.0f));
        org.telegram.ui.Components.v3 v3Var3 = v3Var;
        v3Var3.addView(xbVar, na.t(-1, 48, 83, 14, 15, 14, 16));
        xbVar.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                zArr[0] = false;
                qb0 qb0Var4 = qb0Var;
                f4 f4Var = qb0Var2;
                g4 g4Var = qb0Var3;
                boolean g10 = b5.g(null, null, 0L, l02, 3, qb0Var4, f4Var, g4Var);
                b5.e(textView2, qb0Var4, f4Var, g4Var);
                long currentTimeMillis = System.currentTimeMillis();
                Calendar calendar2 = calendar;
                calendar2.setTimeInMillis(currentTimeMillis);
                calendar2.add(6, qb0Var4.getValue());
                calendar2.set(11, f4Var.getValue());
                calendar2.set(12, g4Var.getValue());
                if (g10) {
                    calendar2.set(13, 0);
                    calendar2.set(14, 0);
                }
                g2Var.I((int) (calendar2.getTimeInMillis() / 1000), 0, true);
                ((org.telegram.ui.ActionBar.w2) oVar.f13936b).f30268y0.run();
            }
        });
        v3Var3.addView(textView2, na.t(-1, -2, 83, 14, 0, 14, 16));
        org.telegram.ui.ActionBar.w2 w2Var = (org.telegram.ui.ActionBar.w2) oVar.f13936b;
        w2Var.O = viewGroup;
        w2Var.show();
        w2Var.setOnDismissListener(new org.telegram.ui.Components.m2(0, neVar, zArr));
        w2Var.v0(i22);
        w2Var.P(i22);
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: oi.h.run():void");
    }
}
