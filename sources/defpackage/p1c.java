package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class p1c extends FrameLayout {
    public final ImageView a;
    public final ey0 b;
    public final qmb c;
    public final TextView d;
    public final n1c e;
    public final View f;
    public final View h;
    public final s1c n;

    public p1c(s1c s1cVar, Context context) {
        super(context);
        int i;
        int i2;
        this.n = s1cVar;
        View view = new View(context);
        this.f = view;
        int i3 = cmb.g5;
        ylb ylbVar = s1cVar.J0;
        String str = s1cVar.t1;
        anb.h(i3, ylbVar, view);
        addView(view, qoe.d(-1, 44.0f, 55, 0.0f, 12.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131231244);
        int i4 = cmb.i5;
        ylb ylbVar2 = s1cVar.J0;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        anb.s(imageView, i4, ylbVar2, mode);
        int i5 = cmb.h6;
        fg0 f0 = cmb.f0(cmb.v0(i5, s1cVar.J0), 1, -1);
        wmb M = anb.M(i5);
        ylb ylbVar3 = s1cVar.J0;
        imageView.setBackground(f0);
        anb.j(imageView, f0, null, M, ylbVar3);
        imageView.setAlpha(0.0f);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final p1c b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view2) {
                int measuredHeight;
                boolean z;
                String str2;
                byte b = r2;
                p1c p1cVar = this.b;
                switch (b) {
                    case 0:
                        p1cVar.n.dismiss();
                        return;
                    default:
                        n1c n1cVar = p1cVar.e;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(p1cVar.getContext(), null);
                        Drawable mutate = p1cVar.getContext().getDrawable(2131232581).mutate();
                        int i6 = cmb.F8;
                        s1c s1cVar2 = p1cVar.n;
                        anb.x(p1cVar, mutate, i6, s1cVar2.J0, PorterDuff.Mode.MULTIPLY);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(mutate);
                        Runnable[] runnableArr = new Runnable[1];
                        List list = b3c.N;
                        ArrayList arrayList = new ArrayList(jb6.D0().N.values());
                        int i7 = 0;
                        while (i7 < arrayList.size()) {
                            hb6 hb6Var = (hb6) arrayList.get(i7);
                            if (hb6Var == null || (((str2 = hb6Var.c) != null && str2.endsWith("_raw")) || !"remote".equals(hb6Var.d))) {
                                arrayList.remove(i7);
                                i7--;
                            }
                            i7++;
                        }
                        Collections.sort(arrayList, new fz5(jb6.D0().B, (byte) 1));
                        boolean z2 = true;
                        for (int i8 = 0; i8 < arrayList.size(); i8++) {
                            hb6 hb6Var2 = (hb6) arrayList.get(i8);
                            if (!hb6Var2.f.equals(s1cVar2.t1) && "remote".equals(hb6Var2.d)) {
                                TextUtils.equals(s1cVar2.u1, hb6Var2.f);
                                Context context2 = p1cVar.getContext();
                                if (i8 == arrayList.size() - 1) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                a8 a8Var = new a8(2, s1cVar2.J0, context2, z2, z);
                                a8Var.setText(s1c.E0(s1c.J0(hb6Var2.f, null, null)));
                                a8Var.setChecked(TextUtils.equals(s1cVar2.u1, hb6Var2.f));
                                a8Var.setOnClickListener(new jw4(p1cVar, runnableArr, hb6Var2, (byte) 23));
                                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(a8Var);
                                z2 = false;
                            }
                        }
                        m8 m8Var = new m8(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                        runnableArr[0] = new hp1(m8Var, (byte) 1);
                        m8Var.e = true;
                        m8Var.c = (short) 220;
                        m8Var.setOutsideTouchable(true);
                        m8Var.setClippingEnabled(true);
                        m8Var.setAnimationStyle(2131755192);
                        m8Var.setFocusable(true);
                        int[] iArr = new int[2];
                        n1cVar.getLocationInWindow(iArr);
                        Point point = gm.q;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(point.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(point.y, Integer.MIN_VALUE));
                        int measuredHeight2 = actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
                        int i9 = iArr[1];
                        if (i9 > (point.y * 0.9f) - measuredHeight2) {
                            measuredHeight = gm.L(8.0f) + (i9 - measuredHeight2);
                        } else {
                            measuredHeight = (n1cVar.getMeasuredHeight() + i9) - gm.L(8.0f);
                        }
                        m8Var.showAtLocation(s1cVar2.b, 51, iArr[0] - gm.L(8.0f), measuredHeight);
                        return;
                }
            }
        });
        addView(imageView, qoe.d(54, 54.0f, 48, 1.0f, 1.0f, 1.0f, 1.0f));
        ey0 ey0Var = new ey0((byte) 7, context, this);
        this.b = ey0Var;
        anb.X(ey0Var, i4, s1cVar.J0);
        ey0Var.setTextSize(1, 20.0f);
        ey0Var.setTypeface(gm.o());
        ey0Var.setText(jb6.M0(2131753731, null));
        ey0Var.setPivotX(0.0f);
        ey0Var.setPivotY(0.0f);
        addView(ey0Var, qoe.d(-1, -2.0f, 55, 22.0f, 20.0f, 22.0f, 0.0f));
        qmb qmbVar = new qmb((byte) 21, context, this);
        this.c = qmbVar;
        if (jb6.a0) {
            qmbVar.setGravity(5);
        }
        qmbVar.setPivotX(0.0f);
        qmbVar.setPivotY(0.0f);
        if (!TextUtils.isEmpty(str) && !"und".equals(str)) {
            TextView textView = new TextView(context);
            this.d = textView;
            textView.setLines(1);
            anb.X(textView, cmb.Fj, s1cVar.J0);
            textView.setTextSize(1, 14.0f);
            textView.setText(s1c.E0(s1c.J0(str, null, null)));
            textView.setPadding(0, gm.L(2.0f), 0, gm.L(2.0f));
        }
        ImageView k = td4.k(context, 2131232699);
        int i6 = cmb.Fj;
        anb.s(k, i6, s1cVar.J0, mode);
        if (jb6.a0) {
            k.setScaleX(-1.0f);
        }
        n1c n1cVar = new n1c(this, context);
        this.e = n1cVar;
        if (jb6.a0) {
            n1cVar.setGravity(5);
        }
        n1cVar.b(0.25f, 350L, d53.h);
        anb.U(n1cVar, i6, s1cVar.J0);
        n1cVar.setTextSize(gm.L(14.0f));
        n1cVar.setText(s1c.E0(s1c.J0(s1cVar.u1, null, null)));
        n1cVar.setPadding(gm.L(4.0f), gm.L(2.0f), gm.L(4.0f), gm.L(2.0f));
        n1cVar.setOnClickListener(new View.OnClickListener(this) {
            public final p1c b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view2) {
                int measuredHeight;
                boolean z;
                String str2;
                byte b = r2;
                p1c p1cVar = this.b;
                switch (b) {
                    case 0:
                        p1cVar.n.dismiss();
                        return;
                    default:
                        n1c n1cVar2 = p1cVar.e;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(p1cVar.getContext(), null);
                        Drawable mutate = p1cVar.getContext().getDrawable(2131232581).mutate();
                        int i62 = cmb.F8;
                        s1c s1cVar2 = p1cVar.n;
                        anb.x(p1cVar, mutate, i62, s1cVar2.J0, PorterDuff.Mode.MULTIPLY);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(mutate);
                        Runnable[] runnableArr = new Runnable[1];
                        List list = b3c.N;
                        ArrayList arrayList = new ArrayList(jb6.D0().N.values());
                        int i7 = 0;
                        while (i7 < arrayList.size()) {
                            hb6 hb6Var = (hb6) arrayList.get(i7);
                            if (hb6Var == null || (((str2 = hb6Var.c) != null && str2.endsWith("_raw")) || !"remote".equals(hb6Var.d))) {
                                arrayList.remove(i7);
                                i7--;
                            }
                            i7++;
                        }
                        Collections.sort(arrayList, new fz5(jb6.D0().B, (byte) 1));
                        boolean z2 = true;
                        for (int i8 = 0; i8 < arrayList.size(); i8++) {
                            hb6 hb6Var2 = (hb6) arrayList.get(i8);
                            if (!hb6Var2.f.equals(s1cVar2.t1) && "remote".equals(hb6Var2.d)) {
                                TextUtils.equals(s1cVar2.u1, hb6Var2.f);
                                Context context2 = p1cVar.getContext();
                                if (i8 == arrayList.size() - 1) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                a8 a8Var = new a8(2, s1cVar2.J0, context2, z2, z);
                                a8Var.setText(s1c.E0(s1c.J0(hb6Var2.f, null, null)));
                                a8Var.setChecked(TextUtils.equals(s1cVar2.u1, hb6Var2.f));
                                a8Var.setOnClickListener(new jw4(p1cVar, runnableArr, hb6Var2, (byte) 23));
                                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(a8Var);
                                z2 = false;
                            }
                        }
                        m8 m8Var = new m8(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                        runnableArr[0] = new hp1(m8Var, (byte) 1);
                        m8Var.e = true;
                        m8Var.c = (short) 220;
                        m8Var.setOutsideTouchable(true);
                        m8Var.setClippingEnabled(true);
                        m8Var.setAnimationStyle(2131755192);
                        m8Var.setFocusable(true);
                        int[] iArr = new int[2];
                        n1cVar2.getLocationInWindow(iArr);
                        Point point = gm.q;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(point.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(point.y, Integer.MIN_VALUE));
                        int measuredHeight2 = actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
                        int i9 = iArr[1];
                        if (i9 > (point.y * 0.9f) - measuredHeight2) {
                            measuredHeight = gm.L(8.0f) + (i9 - measuredHeight2);
                        } else {
                            measuredHeight = (n1cVar2.getMeasuredHeight() + i9) - gm.L(8.0f);
                        }
                        m8Var.showAtLocation(s1cVar2.b, 51, iArr[0] - gm.L(8.0f), measuredHeight);
                        return;
                }
            }
        });
        boolean z = jb6.a0;
        TextView textView2 = this.d;
        if (z) {
            if (textView2 != null) {
                i2 = 3;
            } else {
                i2 = 0;
            }
            qmbVar.addView(n1cVar, qoe.t(-2, -2, 16, 0, 0, i2, 0));
            if (this.d != null) {
                qmbVar.addView(k, qoe.t(-2, -2, 16, 0, 1, 0, 0));
                qmbVar.addView(this.d, qoe.t(-2, -2, 16, 4, 0, 0, 0));
            }
        } else {
            if (textView2 != null) {
                qmbVar.addView(textView2, qoe.t(-2, -2, 16, 0, 0, 4, 0));
                qmbVar.addView(k, qoe.t(-2, -2, 16, 0, 1, 0, 0));
            }
            if (this.d != null) {
                i = 3;
            } else {
                i = 0;
            }
            qmbVar.addView(n1cVar, qoe.t(-2, -2, 16, i, 0, 0, 0));
        }
        addView(qmbVar, qoe.d(-1, -2.0f, 55, 22.0f, 43.0f, 22.0f, 0.0f));
        View view2 = new View(context);
        this.h = view2;
        anb.h(cmb.U5, s1cVar.J0, view2);
        view2.setAlpha(0.0f);
        addView(view2, qoe.d(-1, gm.e1() / gm.N(1.0f), 55, 0.0f, 56.0f, 0.0f, 0.0f));
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(gm.L(78.0f), 1073741824));
    }

    @Override
    public final void setTranslationY(float f) {
        super.setTranslationY(f);
        float a = pqe.a((f - gm.m) / gm.L(64.0f), 0.0f, 1.0f);
        if (!this.n.I0()) {
            a = 1.0f;
        }
        float interpolation = d53.g.getInterpolation(a);
        float R1 = gm.R1(0.85f, 1.0f, interpolation);
        ey0 ey0Var = this.b;
        ey0Var.setScaleX(R1);
        ey0Var.setScaleY(gm.R1(0.85f, 1.0f, interpolation));
        ey0Var.setTranslationY(gm.R1(gm.N(-12.0f), 0.0f, interpolation));
        boolean z = jb6.a0;
        qmb qmbVar = this.c;
        if (!z) {
            ey0Var.setTranslationX(gm.R1(gm.N(50.0f), 0.0f, interpolation));
            qmbVar.setTranslationX(gm.R1(gm.N(50.0f), 0.0f, interpolation));
        }
        qmbVar.setTranslationY(gm.R1(gm.N(-22.0f), 0.0f, interpolation));
        float R12 = gm.R1(0.0f, gm.N(-25.0f), interpolation);
        ImageView imageView = this.a;
        imageView.setTranslationX(R12);
        float f2 = 1.0f - interpolation;
        imageView.setAlpha(f2);
        float R13 = gm.R1(0.0f, gm.N(22.0f), interpolation);
        View view = this.h;
        view.setTranslationY(R13);
        view.setAlpha(f2);
    }
}
