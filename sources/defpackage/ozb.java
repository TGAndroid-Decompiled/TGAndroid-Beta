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
public final class ozb extends FrameLayout {
    public final ImageView a;
    public final xw0 b;
    public final pkb c;
    public final TextView d;
    public final mzb e;
    public final View f;
    public final View h;
    public final rzb n;

    public ozb(rzb rzbVar, Context context) {
        super(context);
        int i;
        int i2;
        this.n = rzbVar;
        View view = new View(context);
        this.f = view;
        int i3 = bkb.g5;
        wjb wjbVar = rzbVar.J0;
        String str = rzbVar.t1;
        zkb.h(i3, wjbVar, view);
        addView(view, nme.d(-1, 44.0f, 55, 0.0f, 12.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131231243);
        int i4 = bkb.i5;
        wjb wjbVar2 = rzbVar.J0;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        zkb.s(imageView, i4, wjbVar2, mode);
        int i5 = bkb.h6;
        ff0 f0 = bkb.f0(bkb.v0(i5, rzbVar.J0), 1, -1);
        vkb M = zkb.M(i5);
        wjb wjbVar3 = rzbVar.J0;
        imageView.setBackground(f0);
        zkb.j(imageView, f0, null, M, wjbVar3);
        imageView.setAlpha(0.0f);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final ozb b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view2) {
                int measuredHeight;
                boolean z;
                String str2;
                byte b = r2;
                ozb ozbVar = this.b;
                switch (b) {
                    case 0:
                        ozbVar.n.dismiss();
                        return;
                    default:
                        mzb mzbVar = ozbVar.e;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(ozbVar.getContext(), null);
                        Drawable mutate = ozbVar.getContext().getDrawable(2131232569).mutate();
                        int i6 = bkb.F8;
                        rzb rzbVar2 = ozbVar.n;
                        zkb.x(ozbVar, mutate, i6, rzbVar2.J0, PorterDuff.Mode.MULTIPLY);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(mutate);
                        Runnable[] runnableArr = new Runnable[1];
                        List list = b1c.N;
                        ArrayList arrayList = new ArrayList(k96.D0().N.values());
                        int i7 = 0;
                        while (i7 < arrayList.size()) {
                            i96 i96Var = (i96) arrayList.get(i7);
                            if (i96Var == null || (((str2 = i96Var.c) != null && str2.endsWith("_raw")) || !"remote".equals(i96Var.d))) {
                                arrayList.remove(i7);
                                i7--;
                            }
                            i7++;
                        }
                        Collections.sort(arrayList, new fx5(k96.D0().B, (byte) 1));
                        boolean z2 = true;
                        for (int i8 = 0; i8 < arrayList.size(); i8++) {
                            i96 i96Var2 = (i96) arrayList.get(i8);
                            if (!i96Var2.f.equals(rzbVar2.t1) && "remote".equals(i96Var2.d)) {
                                TextUtils.equals(rzbVar2.u1, i96Var2.f);
                                Context context2 = ozbVar.getContext();
                                if (i8 == arrayList.size() - 1) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                a8 a8Var = new a8(2, rzbVar2.J0, context2, z2, z);
                                a8Var.setText(rzb.E0(rzb.J0(i96Var2.f, null, null)));
                                a8Var.setChecked(TextUtils.equals(rzbVar2.u1, i96Var2.f));
                                a8Var.setOnClickListener(new hu4(ozbVar, runnableArr, i96Var2, (byte) 24));
                                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(a8Var);
                                z2 = false;
                            }
                        }
                        m8 m8Var = new m8(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                        runnableArr[0] = new wn1(m8Var, (byte) 1);
                        m8Var.e = true;
                        m8Var.c = (short) 220;
                        m8Var.setOutsideTouchable(true);
                        m8Var.setClippingEnabled(true);
                        m8Var.setAnimationStyle(2131755192);
                        m8Var.setFocusable(true);
                        int[] iArr = new int[2];
                        mzbVar.getLocationInWindow(iArr);
                        Point point = gl.q;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(point.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(point.y, Integer.MIN_VALUE));
                        int measuredHeight2 = actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
                        int i9 = iArr[1];
                        if (i9 > (point.y * 0.9f) - measuredHeight2) {
                            measuredHeight = gl.L(8.0f) + (i9 - measuredHeight2);
                        } else {
                            measuredHeight = (mzbVar.getMeasuredHeight() + i9) - gl.L(8.0f);
                        }
                        m8Var.showAtLocation(rzbVar2.b, 51, iArr[0] - gl.L(8.0f), measuredHeight);
                        return;
                }
            }
        });
        addView(imageView, nme.d(54, 54.0f, 48, 1.0f, 1.0f, 1.0f, 1.0f));
        xw0 xw0Var = new xw0((byte) 7, context, this);
        this.b = xw0Var;
        zkb.X(xw0Var, i4, rzbVar.J0);
        xw0Var.setTextSize(1, 20.0f);
        xw0Var.setTypeface(gl.o());
        xw0Var.setText(k96.M0(2131753763, null));
        xw0Var.setPivotX(0.0f);
        xw0Var.setPivotY(0.0f);
        addView(xw0Var, nme.d(-1, -2.0f, 55, 22.0f, 20.0f, 22.0f, 0.0f));
        pkb pkbVar = new pkb((byte) 21, context, this);
        this.c = pkbVar;
        if (k96.a0) {
            pkbVar.setGravity(5);
        }
        pkbVar.setPivotX(0.0f);
        pkbVar.setPivotY(0.0f);
        if (!TextUtils.isEmpty(str) && !"und".equals(str)) {
            TextView textView = new TextView(context);
            this.d = textView;
            textView.setLines(1);
            zkb.X(textView, bkb.Fj, rzbVar.J0);
            textView.setTextSize(1, 14.0f);
            textView.setText(rzb.E0(rzb.J0(str, null, null)));
            textView.setPadding(0, gl.L(2.0f), 0, gl.L(2.0f));
        }
        ImageView k = tb4.k(context, 2131232687);
        int i6 = bkb.Fj;
        zkb.s(k, i6, rzbVar.J0, mode);
        if (k96.a0) {
            k.setScaleX(-1.0f);
        }
        mzb mzbVar = new mzb(this, context);
        this.e = mzbVar;
        if (k96.a0) {
            mzbVar.setGravity(5);
        }
        mzbVar.b(0.25f, 350L, s33.h);
        zkb.U(mzbVar, i6, rzbVar.J0);
        mzbVar.setTextSize(gl.L(14.0f));
        mzbVar.setText(rzb.E0(rzb.J0(rzbVar.u1, null, null)));
        mzbVar.setPadding(gl.L(4.0f), gl.L(2.0f), gl.L(4.0f), gl.L(2.0f));
        mzbVar.setOnClickListener(new View.OnClickListener(this) {
            public final ozb b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view2) {
                int measuredHeight;
                boolean z;
                String str2;
                byte b = r2;
                ozb ozbVar = this.b;
                switch (b) {
                    case 0:
                        ozbVar.n.dismiss();
                        return;
                    default:
                        mzb mzbVar2 = ozbVar.e;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(ozbVar.getContext(), null);
                        Drawable mutate = ozbVar.getContext().getDrawable(2131232569).mutate();
                        int i62 = bkb.F8;
                        rzb rzbVar2 = ozbVar.n;
                        zkb.x(ozbVar, mutate, i62, rzbVar2.J0, PorterDuff.Mode.MULTIPLY);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(mutate);
                        Runnable[] runnableArr = new Runnable[1];
                        List list = b1c.N;
                        ArrayList arrayList = new ArrayList(k96.D0().N.values());
                        int i7 = 0;
                        while (i7 < arrayList.size()) {
                            i96 i96Var = (i96) arrayList.get(i7);
                            if (i96Var == null || (((str2 = i96Var.c) != null && str2.endsWith("_raw")) || !"remote".equals(i96Var.d))) {
                                arrayList.remove(i7);
                                i7--;
                            }
                            i7++;
                        }
                        Collections.sort(arrayList, new fx5(k96.D0().B, (byte) 1));
                        boolean z2 = true;
                        for (int i8 = 0; i8 < arrayList.size(); i8++) {
                            i96 i96Var2 = (i96) arrayList.get(i8);
                            if (!i96Var2.f.equals(rzbVar2.t1) && "remote".equals(i96Var2.d)) {
                                TextUtils.equals(rzbVar2.u1, i96Var2.f);
                                Context context2 = ozbVar.getContext();
                                if (i8 == arrayList.size() - 1) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                a8 a8Var = new a8(2, rzbVar2.J0, context2, z2, z);
                                a8Var.setText(rzb.E0(rzb.J0(i96Var2.f, null, null)));
                                a8Var.setChecked(TextUtils.equals(rzbVar2.u1, i96Var2.f));
                                a8Var.setOnClickListener(new hu4(ozbVar, runnableArr, i96Var2, (byte) 24));
                                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(a8Var);
                                z2 = false;
                            }
                        }
                        m8 m8Var = new m8(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                        runnableArr[0] = new wn1(m8Var, (byte) 1);
                        m8Var.e = true;
                        m8Var.c = (short) 220;
                        m8Var.setOutsideTouchable(true);
                        m8Var.setClippingEnabled(true);
                        m8Var.setAnimationStyle(2131755192);
                        m8Var.setFocusable(true);
                        int[] iArr = new int[2];
                        mzbVar2.getLocationInWindow(iArr);
                        Point point = gl.q;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(point.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(point.y, Integer.MIN_VALUE));
                        int measuredHeight2 = actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
                        int i9 = iArr[1];
                        if (i9 > (point.y * 0.9f) - measuredHeight2) {
                            measuredHeight = gl.L(8.0f) + (i9 - measuredHeight2);
                        } else {
                            measuredHeight = (mzbVar2.getMeasuredHeight() + i9) - gl.L(8.0f);
                        }
                        m8Var.showAtLocation(rzbVar2.b, 51, iArr[0] - gl.L(8.0f), measuredHeight);
                        return;
                }
            }
        });
        boolean z = k96.a0;
        TextView textView2 = this.d;
        if (z) {
            if (textView2 != null) {
                i2 = 3;
            } else {
                i2 = 0;
            }
            pkbVar.addView(mzbVar, nme.t(-2, -2, 16, 0, 0, i2, 0));
            if (this.d != null) {
                pkbVar.addView(k, nme.t(-2, -2, 16, 0, 1, 0, 0));
                pkbVar.addView(this.d, nme.t(-2, -2, 16, 4, 0, 0, 0));
            }
        } else {
            if (textView2 != null) {
                pkbVar.addView(textView2, nme.t(-2, -2, 16, 0, 0, 4, 0));
                pkbVar.addView(k, nme.t(-2, -2, 16, 0, 1, 0, 0));
            }
            if (this.d != null) {
                i = 3;
            } else {
                i = 0;
            }
            pkbVar.addView(mzbVar, nme.t(-2, -2, 16, i, 0, 0, 0));
        }
        addView(pkbVar, nme.d(-1, -2.0f, 55, 22.0f, 43.0f, 22.0f, 0.0f));
        View view2 = new View(context);
        this.h = view2;
        zkb.h(bkb.U5, rzbVar.J0, view2);
        view2.setAlpha(0.0f);
        addView(view2, nme.d(-1, gl.e1() / gl.N(1.0f), 55, 0.0f, 56.0f, 0.0f, 0.0f));
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(gl.L(78.0f), 1073741824));
    }

    @Override
    public final void setTranslationY(float f) {
        super.setTranslationY(f);
        float a = moe.a((f - gl.m) / gl.L(64.0f), 0.0f, 1.0f);
        if (!this.n.I0()) {
            a = 1.0f;
        }
        float interpolation = s33.g.getInterpolation(a);
        float R1 = gl.R1(0.85f, 1.0f, interpolation);
        xw0 xw0Var = this.b;
        xw0Var.setScaleX(R1);
        xw0Var.setScaleY(gl.R1(0.85f, 1.0f, interpolation));
        xw0Var.setTranslationY(gl.R1(gl.N(-12.0f), 0.0f, interpolation));
        boolean z = k96.a0;
        pkb pkbVar = this.c;
        if (!z) {
            xw0Var.setTranslationX(gl.R1(gl.N(50.0f), 0.0f, interpolation));
            pkbVar.setTranslationX(gl.R1(gl.N(50.0f), 0.0f, interpolation));
        }
        pkbVar.setTranslationY(gl.R1(gl.N(-22.0f), 0.0f, interpolation));
        float R12 = gl.R1(0.0f, gl.N(-25.0f), interpolation);
        ImageView imageView = this.a;
        imageView.setTranslationX(R12);
        float f2 = 1.0f - interpolation;
        imageView.setAlpha(f2);
        float R13 = gl.R1(0.0f, gl.N(22.0f), interpolation);
        View view = this.h;
        view.setTranslationY(R13);
        view.setAlpha(f2);
    }
}
