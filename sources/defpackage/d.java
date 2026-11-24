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
public final class d implements View.OnClickListener {
    public final byte a;
    public final a1 b;

    public d(a1 a1Var, byte b) {
        this.a = b;
        this.b = a1Var;
    }

    @Override
    public final void onClick(View view) {
        int i;
        int i2;
        LinearLayout linearLayout;
        byte b = this.a;
        a1 a1Var = this.b;
        switch (b) {
            case 0:
                a1Var.dismiss();
                return;
            case 1:
                it3 it3Var = a1Var.x2;
                gl.t1(it3Var.d);
                a1Var.F2 = it3Var.getText().toString();
                a1Var.t1();
                a1Var.s1(true);
                a1Var.k1();
                return;
            case 2:
                if (a1Var.f2 != null) {
                    TL_iv.RichMessage f1 = a1Var.f1();
                    if (f1 != null) {
                        a1Var.f2.a(f1);
                    }
                } else if (a1Var.e2 != null && a1Var.g1() != null) {
                    a1Var.e2.a(a1Var.g1());
                }
                a1Var.dismiss();
                return;
            case 3:
                a1Var.dismiss();
                return;
            case 4:
                if (ec.b(a1Var.a, a1Var.g2) != null) {
                    ec.e(a1Var.a, a1Var.g2, null);
                } else {
                    dc b1 = a1Var.b1();
                    if (b1 == null) {
                        gl.A3(4.0f, a1Var.Q2, null);
                        return;
                    }
                    ec.e(a1Var.a, a1Var.g2, b1);
                }
                a1Var.r1();
                uv1 uv1Var = a1Var.R2;
                if (uv1Var != null) {
                    uv1Var.run();
                    return;
                }
                return;
            case 5:
                a1Var.P2 = false;
                a1Var.S0();
                a1Var.O2.O(true);
                a1Var.D0();
                return;
            case 6:
                final a1 a1Var2 = this.b;
                cs5 G = cs5.G(a1Var2.c, a1Var2.J0, view);
                G.a0 = gl.L(450.0f);
                G.t = false;
                G.b0 = true;
                G.s = (short) 51;
                G.u = false;
                G.v = true;
                ScrollView scrollView = new ScrollView(a1Var2.getContext());
                scrollView.setVerticalScrollBarEnabled(false);
                LinearLayout linearLayout2 = new LinearLayout(a1Var2.getContext());
                linearLayout2.setOrientation(1);
                scrollView.addView(linearLayout2);
                int min = Math.min(gl.L(468.0f), gl.L(48.0f) + (gl.q.y / 2));
                G.U = true;
                int v0 = bkb.v0(bkb.D8, a1Var2.J0);
                int v02 = bkb.v0(bkb.E8, a1Var2.J0);
                LinearLayout linearLayout3 = new LinearLayout(a1Var2.getContext());
                linearLayout3.setOrientation(1);
                FrameLayout frameLayout = new FrameLayout(a1Var2.getContext());
                ImageView imageView = new ImageView(a1Var2.getContext());
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                imageView.setImageResource(2131232359);
                int p1 = bkb.p1(0.45f, v0);
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                imageView.setColorFilter(new PorterDuffColorFilter(p1, mode));
                frameLayout.addView(imageView, nme.d(18, 18.0f, 19, 16.0f, 0.0f, 0.0f, 0.0f));
                EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(a1Var2.getContext());
                editTextBoldCursor.setTextSize(1, 16.0f);
                editTextBoldCursor.setTextColor(v0);
                editTextBoldCursor.setHintText(k96.M0(2131745644, null));
                editTextBoldCursor.setHintColor(bkb.p1(0.45f, v0));
                editTextBoldCursor.setCursorColor(bkb.v0(bkb.Ei, a1Var2.J0));
                editTextBoldCursor.setCursorSize(gl.L(18.0f));
                editTextBoldCursor.setCursorWidth(1.5f);
                editTextBoldCursor.setBackground(null);
                editTextBoldCursor.setPadding(0, 0, 0, 0);
                editTextBoldCursor.setSingleLine(true);
                editTextBoldCursor.setMaxLines(1);
                editTextBoldCursor.setInputType(524289);
                editTextBoldCursor.setImeOptions(268435459);
                editTextBoldCursor.setGravity(19);
                editTextBoldCursor.setOnEditorActionListener(new j(editTextBoldCursor, (byte) 0));
                frameLayout.addView(editTextBoldCursor, nme.d(-1, -1.0f, 119, 42.0f, 0.0f, 40.0f, 0.0f));
                ImageView imageView2 = new ImageView(a1Var2.getContext());
                imageView2.setScaleType(ImageView.ScaleType.CENTER);
                imageView2.setImageResource(2131231272);
                imageView2.setColorFilter(new PorterDuffColorFilter(bkb.p1(0.75f, v02), mode));
                imageView2.setBackground(bkb.f0(bkb.p1(0.12f, v0), 1, -1));
                imageView2.setContentDescription(k96.M0(2131752087, null));
                imageView2.setVisibility(8);
                imageView2.setOnClickListener(new k(editTextBoldCursor, (byte) 0));
                frameLayout.addView(imageView2, nme.d(36, 36.0f, 21, 0.0f, 0.0f, 4.0f, 0.0f));
                linearLayout3.addView(frameLayout, nme.o(-1, 48));
                View view2 = new View(a1Var2.getContext());
                view2.setBackgroundColor(bkb.p1(0.1f, v0));
                linearLayout3.addView(view2, new LinearLayout.LayoutParams(-1, Math.max(1, gl.L(0.66f))));
                linearLayout3.addView(scrollView, new LinearLayout.LayoutParams(-1, 0, 1.0f));
                TextView textView = new TextView(a1Var2.getContext());
                textView.setTextSize(1, 15.0f);
                textView.setTextColor(bkb.p1(0.5f, v0));
                textView.setGravity(17);
                textView.setText(k96.M0(2131747975, null));
                textView.setVisibility(8);
                linearLayout2.addView(textView, nme.o(-1, 96));
                G.q(linearLayout3, new LinearLayout.LayoutParams(gl.L(196.0f), min));
                G.p = new l(editTextBoldCursor, (byte) 0);
                G.n(false);
                z0 z0Var = new z0(a1Var2.getContext(), a1Var2.a, 1, true, a1Var2.J0);
                z0Var.setPadding(gl.L(6.0f), gl.L(6.0f), gl.L(6.0f), gl.L(6.0f));
                z0Var.setRoundRadius(12);
                String M0 = k96.M0(2131754955, null);
                m mVar = new m(a1Var2, z0Var, (byte) 0);
                w0 w0Var = z0Var.c;
                int childCount = w0Var.getChildCount();
                y0 y0Var = new y0(z0Var.a, z0Var.b, z0Var.getContext());
                y0Var.c = z0Var.e;
                y0Var.updateColors();
                y0Var.a("❌", M0, null);
                y0Var.setOnClickListener(new v0(mVar, childCount, (byte) 1));
                if (w0Var.getOrientation() == 0) {
                    i = 0;
                } else {
                    i = -1;
                }
                if (w0Var.getOrientation() == 1) {
                    i2 = 0;
                } else {
                    i2 = -1;
                }
                w0Var.addView(y0Var, nme.p(i, i2, 1.0f, 119));
                ArrayList arrayList = a1Var2.r2.b;
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj = arrayList.get(i3);
                    i3++;
                    z0Var.b((TL_aicompose.AiComposeTone) obj, new m(a1Var2, z0Var, (byte) 1));
                }
                TL_aicompose.AiComposeTone aiComposeTone = a1Var2.p2;
                if (aiComposeTone != null) {
                    z0Var.d(aiComposeTone, false);
                } else {
                    z0Var.c(0, false);
                }
                G.q(z0Var, new LinearLayout.LayoutParams(gl.L(84.0f), min));
                ViewParent parent = linearLayout3.getParent();
                while (parent != null && !(parent instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout)) {
                    parent = parent.getParent();
                }
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) parent;
                ViewParent parent2 = z0Var.getParent();
                while (parent2 != null && !(parent2 instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout)) {
                    parent2 = parent2.getParent();
                }
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = (ActionBarPopupWindow$ActionBarPopupWindowLayout) parent2;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout != null && actionBarPopupWindow$ActionBarPopupWindowLayout2 != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.leftMargin = (gl.L(8.0f) - actionBarPopupWindow$ActionBarPopupWindowLayout.getPadding().right) - actionBarPopupWindow$ActionBarPopupWindowLayout2.getPadding().left;
                    actionBarPopupWindow$ActionBarPopupWindowLayout2.setLayoutParams(layoutParams);
                }
                ArrayList n = b1c.n(null);
                ArrayList m = b1c.m();
                int childCount2 = linearLayout2.getChildCount();
                if (!TextUtils.isEmpty(a1Var2.n2)) {
                    linearLayout = linearLayout2;
                    a1Var2.Y0(G, linearLayout, true, rzb.E0(rzb.J0(a1Var2.n2, null, null)), null);
                } else {
                    linearLayout = linearLayout2;
                }
                int size2 = n.size();
                int i4 = 0;
                while (i4 < size2) {
                    Object obj2 = n.get(i4);
                    i4++;
                    final u0c u0cVar = (u0c) obj2;
                    if (!TextUtils.equals(u0cVar.a, a1Var2.n2)) {
                        a1Var2.Y0(G, linearLayout, false, u0cVar.b, new Runnable() {
                            @Override
                            public final void run() {
                                byte b2 = r3;
                                u0c u0cVar2 = u0cVar;
                                a1 a1Var3 = a1Var2;
                                switch (b2) {
                                    case 0:
                                        a1Var3.a1();
                                        a1Var3.n2 = u0cVar2.a;
                                        a1Var3.k1();
                                        return;
                                    default:
                                        a1Var3.a1();
                                        a1Var3.n2 = u0cVar2.a;
                                        a1Var3.k1();
                                        return;
                                }
                            }
                        });
                    }
                }
                j8 j8Var = new j8(a1Var2.getContext(), a1Var2.J0);
                j8Var.setTag(2131296439, 1);
                linearLayout.addView(j8Var, nme.o(-1, 8));
                int childCount3 = linearLayout.getChildCount();
                int size3 = m.size();
                int i5 = 0;
                while (i5 < size3) {
                    int i6 = i5 + 1;
                    final u0c u0cVar2 = (u0c) m.get(i5);
                    boolean equals = TextUtils.equals(u0cVar2.a, a1Var2.n2);
                    String str = u0cVar2.b;
                    Runnable runnable = new Runnable() {
                        @Override
                        public final void run() {
                            byte b2 = r3;
                            u0c u0cVar22 = u0cVar2;
                            a1 a1Var3 = a1Var2;
                            switch (b2) {
                                case 0:
                                    a1Var3.a1();
                                    a1Var3.n2 = u0cVar22.a;
                                    a1Var3.k1();
                                    return;
                                default:
                                    a1Var3.a1();
                                    a1Var3.n2 = u0cVar22.a;
                                    a1Var3.k1();
                                    return;
                            }
                        }
                    };
                    LinearLayout linearLayout4 = linearLayout;
                    a1 a1Var3 = a1Var2;
                    cs5 cs5Var = G;
                    a1Var3.Y0(cs5Var, linearLayout4, equals, str, runnable);
                    linearLayout = linearLayout4;
                    G = cs5Var;
                    size3 = size3;
                    a1Var2 = a1Var3;
                    i5 = i6;
                }
                editTextBoldCursor.addTextChangedListener(new z(imageView2, childCount2, childCount3, linearLayout, m, textView, scrollView));
                G.a0();
                return;
            case 7:
                a1Var.q2 = !a1Var.q2;
                a1Var.k1();
                if (view instanceof LinearLayout) {
                    LinearLayout linearLayout5 = (LinearLayout) view;
                    if (linearLayout5.getChildAt(0) instanceof wf2) {
                        ((wf2) linearLayout5.getChildAt(0)).a(a1Var.q2, true);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                if (!a1Var.V2) {
                    gl.g(a1Var.g1());
                    return;
                }
                return;
            case 9:
                a1Var.dismiss();
                return;
            default:
                a1Var.l1(0, 0, true);
                a1Var.dismiss();
                return;
        }
    }
}
