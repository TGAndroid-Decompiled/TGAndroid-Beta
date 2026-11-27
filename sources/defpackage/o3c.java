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
public final class o3c extends FrameLayout {
    public final ImageView a;
    public final fx0 b;
    public final oob c;
    public final TextView d;
    public final m3c e;
    public final View f;
    public final View h;
    public final r3c n;

    public o3c(r3c r3cVar, Context context) {
        super(context);
        int i;
        int i2;
        this.n = r3cVar;
        View view = new View(context);
        this.f = view;
        int i3 = aob.h5;
        vnb vnbVar = r3cVar.J0;
        String str = r3cVar.t1;
        yob.h(i3, vnbVar, view);
        addView(view, tre.d(-1, 44.0f, 55, 0.0f, 12.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131231243);
        int i4 = aob.j5;
        vnb vnbVar2 = r3cVar.J0;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        yob.s(imageView, i4, vnbVar2, mode);
        int i5 = aob.i6;
        hf0 f0 = aob.f0(aob.v0(i5, r3cVar.J0), 1, -1);
        uob M = yob.M(i5);
        vnb vnbVar3 = r3cVar.J0;
        imageView.setBackground(f0);
        yob.j(imageView, f0, null, M, vnbVar3);
        imageView.setAlpha(0.0f);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final o3c b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view2) {
                int measuredHeight;
                boolean z;
                String str2;
                byte b = r2;
                o3c o3cVar = this.b;
                switch (b) {
                    case 0:
                        o3cVar.n.dismiss();
                        return;
                    default:
                        m3c m3cVar = o3cVar.e;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(o3cVar.getContext(), null);
                        Drawable mutate = o3cVar.getContext().getDrawable(2131232580).mutate();
                        int i6 = aob.G8;
                        r3c r3cVar2 = o3cVar.n;
                        yob.x(o3cVar, mutate, i6, r3cVar2.J0, PorterDuff.Mode.MULTIPLY);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(mutate);
                        Runnable[] runnableArr = new Runnable[1];
                        List list = a5c.N;
                        ArrayList arrayList = new ArrayList(ob6.D0().N.values());
                        int i7 = 0;
                        while (i7 < arrayList.size()) {
                            mb6 mb6Var = (mb6) arrayList.get(i7);
                            if (mb6Var == null || (((str2 = mb6Var.c) != null && str2.endsWith("_raw")) || !"remote".equals(mb6Var.d))) {
                                arrayList.remove(i7);
                                i7--;
                            }
                            i7++;
                        }
                        Collections.sort(arrayList, new kz5(ob6.D0().B, (byte) 1));
                        boolean z2 = true;
                        for (int i8 = 0; i8 < arrayList.size(); i8++) {
                            mb6 mb6Var2 = (mb6) arrayList.get(i8);
                            if (!mb6Var2.f.equals(r3cVar2.t1) && "remote".equals(mb6Var2.d)) {
                                TextUtils.equals(r3cVar2.u1, mb6Var2.f);
                                Context context2 = o3cVar.getContext();
                                if (i8 == arrayList.size() - 1) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                b8 b8Var = new b8(2, r3cVar2.J0, context2, z2, z);
                                b8Var.setText(r3c.F0(r3c.K0(mb6Var2.f, null, null)));
                                b8Var.setChecked(TextUtils.equals(r3cVar2.u1, mb6Var2.f));
                                b8Var.setOnClickListener(new lw4(o3cVar, runnableArr, mb6Var2, (byte) 24));
                                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(b8Var);
                                z2 = false;
                            }
                        }
                        n8 n8Var = new n8(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                        runnableArr[0] = new jo1(n8Var, (byte) 1);
                        n8Var.e = true;
                        n8Var.c = (short) 220;
                        n8Var.setOutsideTouchable(true);
                        n8Var.setClippingEnabled(true);
                        n8Var.setAnimationStyle(2131755192);
                        n8Var.setFocusable(true);
                        int[] iArr = new int[2];
                        m3cVar.getLocationInWindow(iArr);
                        Point point = hl.q;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(point.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(point.y, Integer.MIN_VALUE));
                        int measuredHeight2 = actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
                        int i9 = iArr[1];
                        if (i9 > (point.y * 0.9f) - measuredHeight2) {
                            measuredHeight = hl.L(8.0f) + (i9 - measuredHeight2);
                        } else {
                            measuredHeight = (m3cVar.getMeasuredHeight() + i9) - hl.L(8.0f);
                        }
                        n8Var.showAtLocation(r3cVar2.b, 51, iArr[0] - hl.L(8.0f), measuredHeight);
                        return;
                }
            }
        });
        addView(imageView, tre.d(54, 54.0f, 48, 1.0f, 1.0f, 1.0f, 1.0f));
        fx0 fx0Var = new fx0((byte) 7, context, this);
        this.b = fx0Var;
        yob.X(fx0Var, i4, r3cVar.J0);
        fx0Var.setTextSize(1, 20.0f);
        fx0Var.setTypeface(hl.o());
        fx0Var.setText(ob6.M0(2131753759, null));
        fx0Var.setPivotX(0.0f);
        fx0Var.setPivotY(0.0f);
        addView(fx0Var, tre.d(-1, -2.0f, 55, 22.0f, 20.0f, 22.0f, 0.0f));
        oob oobVar = new oob((byte) 21, context, this);
        this.c = oobVar;
        if (ob6.a0) {
            oobVar.setGravity(5);
        }
        oobVar.setPivotX(0.0f);
        oobVar.setPivotY(0.0f);
        if (!TextUtils.isEmpty(str) && !"und".equals(str)) {
            TextView textView = new TextView(context);
            this.d = textView;
            textView.setLines(1);
            yob.X(textView, aob.Gj, r3cVar.J0);
            textView.setTextSize(1, 14.0f);
            textView.setText(r3c.F0(r3c.K0(str, null, null)));
            textView.setPadding(0, hl.L(2.0f), 0, hl.L(2.0f));
        }
        ImageView k = qd4.k(context, 2131232698);
        int i6 = aob.Gj;
        yob.s(k, i6, r3cVar.J0, mode);
        if (ob6.a0) {
            k.setScaleX(-1.0f);
        }
        m3c m3cVar = new m3c(this, context);
        this.e = m3cVar;
        if (ob6.a0) {
            m3cVar.setGravity(5);
        }
        m3cVar.b(0.25f, 350L, k43.h);
        yob.U(m3cVar, i6, r3cVar.J0);
        m3cVar.setTextSize(hl.L(14.0f));
        m3cVar.setText(r3c.F0(r3c.K0(r3cVar.u1, null, null)));
        m3cVar.setPadding(hl.L(4.0f), hl.L(2.0f), hl.L(4.0f), hl.L(2.0f));
        m3cVar.setOnClickListener(new View.OnClickListener(this) {
            public final o3c b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view2) {
                int measuredHeight;
                boolean z;
                String str2;
                byte b = r2;
                o3c o3cVar = this.b;
                switch (b) {
                    case 0:
                        o3cVar.n.dismiss();
                        return;
                    default:
                        m3c m3cVar2 = o3cVar.e;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(o3cVar.getContext(), null);
                        Drawable mutate = o3cVar.getContext().getDrawable(2131232580).mutate();
                        int i62 = aob.G8;
                        r3c r3cVar2 = o3cVar.n;
                        yob.x(o3cVar, mutate, i62, r3cVar2.J0, PorterDuff.Mode.MULTIPLY);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(mutate);
                        Runnable[] runnableArr = new Runnable[1];
                        List list = a5c.N;
                        ArrayList arrayList = new ArrayList(ob6.D0().N.values());
                        int i7 = 0;
                        while (i7 < arrayList.size()) {
                            mb6 mb6Var = (mb6) arrayList.get(i7);
                            if (mb6Var == null || (((str2 = mb6Var.c) != null && str2.endsWith("_raw")) || !"remote".equals(mb6Var.d))) {
                                arrayList.remove(i7);
                                i7--;
                            }
                            i7++;
                        }
                        Collections.sort(arrayList, new kz5(ob6.D0().B, (byte) 1));
                        boolean z2 = true;
                        for (int i8 = 0; i8 < arrayList.size(); i8++) {
                            mb6 mb6Var2 = (mb6) arrayList.get(i8);
                            if (!mb6Var2.f.equals(r3cVar2.t1) && "remote".equals(mb6Var2.d)) {
                                TextUtils.equals(r3cVar2.u1, mb6Var2.f);
                                Context context2 = o3cVar.getContext();
                                if (i8 == arrayList.size() - 1) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                b8 b8Var = new b8(2, r3cVar2.J0, context2, z2, z);
                                b8Var.setText(r3c.F0(r3c.K0(mb6Var2.f, null, null)));
                                b8Var.setChecked(TextUtils.equals(r3cVar2.u1, mb6Var2.f));
                                b8Var.setOnClickListener(new lw4(o3cVar, runnableArr, mb6Var2, (byte) 24));
                                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(b8Var);
                                z2 = false;
                            }
                        }
                        n8 n8Var = new n8(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                        runnableArr[0] = new jo1(n8Var, (byte) 1);
                        n8Var.e = true;
                        n8Var.c = (short) 220;
                        n8Var.setOutsideTouchable(true);
                        n8Var.setClippingEnabled(true);
                        n8Var.setAnimationStyle(2131755192);
                        n8Var.setFocusable(true);
                        int[] iArr = new int[2];
                        m3cVar2.getLocationInWindow(iArr);
                        Point point = hl.q;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(point.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(point.y, Integer.MIN_VALUE));
                        int measuredHeight2 = actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
                        int i9 = iArr[1];
                        if (i9 > (point.y * 0.9f) - measuredHeight2) {
                            measuredHeight = hl.L(8.0f) + (i9 - measuredHeight2);
                        } else {
                            measuredHeight = (m3cVar2.getMeasuredHeight() + i9) - hl.L(8.0f);
                        }
                        n8Var.showAtLocation(r3cVar2.b, 51, iArr[0] - hl.L(8.0f), measuredHeight);
                        return;
                }
            }
        });
        boolean z = ob6.a0;
        TextView textView2 = this.d;
        if (z) {
            if (textView2 != null) {
                i2 = 3;
            } else {
                i2 = 0;
            }
            oobVar.addView(m3cVar, tre.t(-2, -2, 16, 0, 0, i2, 0));
            if (this.d != null) {
                oobVar.addView(k, tre.t(-2, -2, 16, 0, 1, 0, 0));
                oobVar.addView(this.d, tre.t(-2, -2, 16, 4, 0, 0, 0));
            }
        } else {
            if (textView2 != null) {
                oobVar.addView(textView2, tre.t(-2, -2, 16, 0, 0, 4, 0));
                oobVar.addView(k, tre.t(-2, -2, 16, 0, 1, 0, 0));
            }
            if (this.d != null) {
                i = 3;
            } else {
                i = 0;
            }
            oobVar.addView(m3cVar, tre.t(-2, -2, 16, i, 0, 0, 0));
        }
        addView(oobVar, tre.d(-1, -2.0f, 55, 22.0f, 43.0f, 22.0f, 0.0f));
        View view2 = new View(context);
        this.h = view2;
        yob.h(aob.V5, r3cVar.J0, view2);
        view2.setAlpha(0.0f);
        addView(view2, tre.d(-1, hl.e1() / hl.N(1.0f), 55, 0.0f, 56.0f, 0.0f, 0.0f));
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(hl.L(78.0f), 1073741824));
    }

    @Override
    public final void setTranslationY(float f) {
        super.setTranslationY(f);
        float a = ete.a((f - hl.m) / hl.L(64.0f), 0.0f, 1.0f);
        if (!this.n.J0()) {
            a = 1.0f;
        }
        float interpolation = k43.g.getInterpolation(a);
        float R1 = hl.R1(0.85f, 1.0f, interpolation);
        fx0 fx0Var = this.b;
        fx0Var.setScaleX(R1);
        fx0Var.setScaleY(hl.R1(0.85f, 1.0f, interpolation));
        fx0Var.setTranslationY(hl.R1(hl.N(-12.0f), 0.0f, interpolation));
        boolean z = ob6.a0;
        oob oobVar = this.c;
        if (!z) {
            fx0Var.setTranslationX(hl.R1(hl.N(50.0f), 0.0f, interpolation));
            oobVar.setTranslationX(hl.R1(hl.N(50.0f), 0.0f, interpolation));
        }
        oobVar.setTranslationY(hl.R1(hl.N(-22.0f), 0.0f, interpolation));
        float R12 = hl.R1(0.0f, hl.N(-25.0f), interpolation);
        ImageView imageView = this.a;
        imageView.setTranslationX(R12);
        float f2 = 1.0f - interpolation;
        imageView.setAlpha(f2);
        float R13 = hl.R1(0.0f, hl.N(22.0f), interpolation);
        View view = this.h;
        view.setTranslationY(R13);
        view.setAlpha(f2);
    }
}
