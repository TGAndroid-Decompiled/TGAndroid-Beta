package defpackage;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class b implements View.OnClickListener {
    public final byte a;
    public final b1 b;

    public b(b1 b1Var, byte b) {
        this.a = b;
        this.b = b1Var;
    }

    @Override
    public final void onClick(View view) {
        int i;
        int i2;
        LinearLayout linearLayout;
        byte b = this.a;
        b1 b1Var = this.b;
        switch (b) {
            case 0:
                b1Var.dismiss();
                return;
            case 1:
                zt3 zt3Var = b1Var.x2;
                hl.t1(zt3Var.d);
                b1Var.F2 = zt3Var.getText().toString();
                b1Var.v1();
                b1Var.u1(true);
                b1Var.m1();
                return;
            case 2:
                if (b1Var.f2 != null) {
                    TL_iv.RichMessage g1 = b1Var.g1();
                    if (g1 != null) {
                        b1Var.f2.a(g1);
                    }
                } else if (b1Var.e2 != null && b1Var.h1() != null) {
                    b1Var.e2.a(b1Var.h1());
                }
                b1Var.dismiss();
                return;
            case 3:
                b1Var.dismiss();
                return;
            case 4:
                b1Var.R2 = false;
                b1Var.T0();
                b1Var.Q2.O(true);
                b1Var.E0();
                return;
            case 5:
                final b1 b1Var2 = this.b;
                fu5 G = fu5.G(b1Var2.c, b1Var2.J0, view);
                G.d0 = hl.L(450.0f);
                G.t = false;
                G.e0 = true;
                G.s = (short) 51;
                G.u = false;
                G.v = true;
                ScrollView scrollView = new ScrollView(b1Var2.getContext());
                scrollView.setVerticalScrollBarEnabled(false);
                LinearLayout linearLayout2 = new LinearLayout(b1Var2.getContext());
                linearLayout2.setOrientation(1);
                scrollView.addView(linearLayout2);
                int min = Math.min(hl.L(468.0f), hl.L(48.0f) + (hl.q.y / 2));
                G.X = true;
                int v0 = aob.v0(aob.E8, b1Var2.J0);
                int v02 = aob.v0(aob.F8, b1Var2.J0);
                LinearLayout linearLayout3 = new LinearLayout(b1Var2.getContext());
                linearLayout3.setOrientation(1);
                FrameLayout frameLayout = new FrameLayout(b1Var2.getContext());
                ImageView imageView = new ImageView(b1Var2.getContext());
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                imageView.setImageResource(2131232359);
                int p1 = aob.p1(0.45f, v0);
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                imageView.setColorFilter(new PorterDuffColorFilter(p1, mode));
                frameLayout.addView(imageView, tre.d(18, 18.0f, 19, 16.0f, 0.0f, 0.0f, 0.0f));
                EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(b1Var2.getContext());
                editTextBoldCursor.setTextSize(1, 16.0f);
                editTextBoldCursor.setTextColor(v0);
                editTextBoldCursor.setHintText(ob6.M0(2131745564, null));
                editTextBoldCursor.setHintColor(aob.p1(0.45f, v0));
                editTextBoldCursor.setCursorColor(aob.v0(aob.Fi, b1Var2.J0));
                editTextBoldCursor.setCursorSize(hl.L(18.0f));
                editTextBoldCursor.setCursorWidth(1.5f);
                editTextBoldCursor.setBackground(null);
                editTextBoldCursor.setPadding(0, 0, 0, 0);
                editTextBoldCursor.setSingleLine(true);
                editTextBoldCursor.setMaxLines(1);
                editTextBoldCursor.setInputType(524289);
                editTextBoldCursor.setImeOptions(268435459);
                editTextBoldCursor.setGravity(19);
                editTextBoldCursor.setOnEditorActionListener(new j(editTextBoldCursor, (byte) 0));
                frameLayout.addView(editTextBoldCursor, tre.d(-1, -1.0f, 119, 42.0f, 0.0f, 40.0f, 0.0f));
                ImageView imageView2 = new ImageView(b1Var2.getContext());
                imageView2.setScaleType(ImageView.ScaleType.CENTER);
                imageView2.setImageResource(2131231272);
                imageView2.setColorFilter(new PorterDuffColorFilter(aob.p1(0.75f, v02), mode));
                imageView2.setBackground(aob.f0(aob.p1(0.12f, v0), 1, -1));
                imageView2.setContentDescription(ob6.M0(2131752064, null));
                imageView2.setVisibility(8);
                imageView2.setOnClickListener(new k(editTextBoldCursor, (byte) 0));
                frameLayout.addView(imageView2, tre.d(36, 36.0f, 21, 0.0f, 0.0f, 4.0f, 0.0f));
                linearLayout3.addView(frameLayout, tre.o(-1, 48));
                View view2 = new View(b1Var2.getContext());
                view2.setBackgroundColor(aob.p1(0.1f, v0));
                linearLayout3.addView(view2, new LinearLayout.LayoutParams(-1, Math.max(1, hl.L(0.66f))));
                linearLayout3.addView(scrollView, new LinearLayout.LayoutParams(-1, 0, 1.0f));
                TextView textView = new TextView(b1Var2.getContext());
                textView.setTextSize(1, 15.0f);
                textView.setTextColor(aob.p1(0.5f, v0));
                textView.setGravity(17);
                textView.setText(ob6.M0(2131747898, null));
                textView.setVisibility(8);
                linearLayout2.addView(textView, tre.o(-1, 96));
                G.q(linearLayout3, new LinearLayout.LayoutParams(hl.L(196.0f), min));
                G.p = new l(editTextBoldCursor, (byte) 0);
                G.n(false);
                a1 a1Var = new a1(b1Var2.getContext(), b1Var2.a, 1, true, b1Var2.J0);
                a1Var.setPadding(hl.L(6.0f), hl.L(6.0f), hl.L(6.0f), hl.L(6.0f));
                a1Var.setRoundRadius(12);
                String M0 = ob6.M0(2131754952, null);
                m mVar = new m(b1Var2, a1Var, (byte) 0);
                x0 x0Var = a1Var.c;
                int childCount = x0Var.getChildCount();
                z0 z0Var = new z0(a1Var.a, a1Var.b, a1Var.getContext());
                z0Var.c = a1Var.e;
                z0Var.updateColors();
                z0Var.a("❌", M0, null);
                z0Var.setOnClickListener(new w0(mVar, childCount, (byte) 1));
                if (x0Var.getOrientation() == 0) {
                    i = 0;
                } else {
                    i = -1;
                }
                if (x0Var.getOrientation() == 1) {
                    i2 = 0;
                } else {
                    i2 = -1;
                }
                x0Var.addView(z0Var, tre.p(i, i2, 1.0f, 119));
                ArrayList arrayList = b1Var2.r2.b;
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj = arrayList.get(i3);
                    i3++;
                    a1Var.b((TL_aicompose.AiComposeTone) obj, new m(b1Var2, a1Var, (byte) 1));
                }
                TL_aicompose.AiComposeTone aiComposeTone = b1Var2.p2;
                if (aiComposeTone != null) {
                    a1Var.d(aiComposeTone, false);
                } else {
                    a1Var.c(0, false);
                }
                G.q(a1Var, new LinearLayout.LayoutParams(hl.L(84.0f), min));
                ViewParent parent = linearLayout3.getParent();
                while (parent != null && !(parent instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout)) {
                    parent = parent.getParent();
                }
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) parent;
                ViewParent parent2 = a1Var.getParent();
                while (parent2 != null && !(parent2 instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout)) {
                    parent2 = parent2.getParent();
                }
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = (ActionBarPopupWindow$ActionBarPopupWindowLayout) parent2;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout != null && actionBarPopupWindow$ActionBarPopupWindowLayout2 != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.leftMargin = (hl.L(8.0f) - actionBarPopupWindow$ActionBarPopupWindowLayout.getPadding().right) - actionBarPopupWindow$ActionBarPopupWindowLayout2.getPadding().left;
                    actionBarPopupWindow$ActionBarPopupWindowLayout2.setLayoutParams(layoutParams);
                }
                ArrayList n = a5c.n(null);
                ArrayList m = a5c.m();
                int childCount2 = linearLayout2.getChildCount();
                if (!TextUtils.isEmpty(b1Var2.n2)) {
                    linearLayout = linearLayout2;
                    b1Var2.Z0(G, linearLayout, true, r3c.F0(r3c.K0(b1Var2.n2, null, null)), null);
                } else {
                    linearLayout = linearLayout2;
                }
                int size2 = n.size();
                int i4 = 0;
                while (i4 < size2) {
                    Object obj2 = n.get(i4);
                    i4++;
                    final t4c t4cVar = (t4c) obj2;
                    if (!TextUtils.equals(t4cVar.a, b1Var2.n2)) {
                        b1Var2.Z0(G, linearLayout, false, t4cVar.b, new Runnable() {
                            @Override
                            public final void run() {
                                byte b2 = r3;
                                t4c t4cVar2 = t4cVar;
                                b1 b1Var3 = b1Var2;
                                switch (b2) {
                                    case 0:
                                        b1Var3.b1();
                                        b1Var3.n2 = t4cVar2.a;
                                        b1Var3.m1();
                                        return;
                                    default:
                                        b1Var3.b1();
                                        b1Var3.n2 = t4cVar2.a;
                                        b1Var3.m1();
                                        return;
                                }
                            }
                        });
                    }
                }
                k8 k8Var = new k8(b1Var2.getContext(), b1Var2.J0);
                k8Var.setTag(2131296439, 1);
                linearLayout.addView(k8Var, tre.o(-1, 8));
                int childCount3 = linearLayout.getChildCount();
                int size3 = m.size();
                int i5 = 0;
                while (i5 < size3) {
                    int i6 = i5 + 1;
                    final t4c t4cVar2 = (t4c) m.get(i5);
                    boolean equals = TextUtils.equals(t4cVar2.a, b1Var2.n2);
                    String str = t4cVar2.b;
                    Runnable runnable = new Runnable() {
                        @Override
                        public final void run() {
                            byte b2 = r3;
                            t4c t4cVar22 = t4cVar2;
                            b1 b1Var3 = b1Var2;
                            switch (b2) {
                                case 0:
                                    b1Var3.b1();
                                    b1Var3.n2 = t4cVar22.a;
                                    b1Var3.m1();
                                    return;
                                default:
                                    b1Var3.b1();
                                    b1Var3.n2 = t4cVar22.a;
                                    b1Var3.m1();
                                    return;
                            }
                        }
                    };
                    LinearLayout linearLayout4 = linearLayout;
                    b1 b1Var3 = b1Var2;
                    fu5 fu5Var = G;
                    b1Var3.Z0(fu5Var, linearLayout4, equals, str, runnable);
                    linearLayout = linearLayout4;
                    G = fu5Var;
                    size3 = size3;
                    b1Var2 = b1Var3;
                    i5 = i6;
                }
                editTextBoldCursor.addTextChangedListener(new a0(imageView2, childCount2, childCount3, linearLayout, m, textView, scrollView));
                G.a0();
                return;
            case 6:
                b1Var.q2 = !b1Var.q2;
                b1Var.m1();
                if (view instanceof LinearLayout) {
                    LinearLayout linearLayout5 = (LinearLayout) view;
                    if (linearLayout5.getChildAt(0) instanceof og2) {
                        ((og2) linearLayout5.getChildAt(0)).a(b1Var.q2, true);
                        return;
                    }
                    return;
                }
                return;
            case 7:
                if (!b1Var.X2) {
                    hl.g(b1Var.h1());
                    return;
                }
                return;
            case 8:
                if (fc.b(b1Var.a, b1Var.g2) != null) {
                    fc.e(b1Var.a, b1Var.g2, null);
                } else {
                    ec c1 = b1Var.c1();
                    if (c1 == null) {
                        hl.A3(4.0f, b1Var.S2, null);
                        return;
                    }
                    fc.e(b1Var.a, b1Var.g2, c1);
                }
                b1Var.t1();
                fw1 fw1Var = b1Var.T2;
                if (fw1Var != null) {
                    fw1Var.run();
                    return;
                }
                return;
            case 9:
                b1Var.dismiss();
                return;
            default:
                b1Var.n1(0, 0, true);
                b1Var.dismiss();
                return;
        }
    }
}
