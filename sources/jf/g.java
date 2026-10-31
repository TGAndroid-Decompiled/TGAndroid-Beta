package jf;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.j6;
import c3.i0;
import nh.p;
import org.telegram.messenger.cd;
import org.telegram.messenger.m5;
import org.telegram.messenger.z20;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.p1;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.ei0;
import org.telegram.ui.Components.f10;
import org.telegram.ui.Components.jf0;
import org.telegram.ui.Components.voip.s0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.UsersSelectActivity;
import org.telegram.ui.tc1;
public final class g extends ViewGroup {
    public final int f9872a;
    public final Object f9873b;

    public g(Object obj, Context context, int i10) {
        super(context);
        this.f9872a = i10;
        this.f9873b = obj;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        boolean z10;
        switch (this.f9872a) {
            case 0:
                lf.e eVar = (lf.e) this.f9873b;
                Path path = eVar.f11826m;
                float f7 = (1.0f - eVar.f11828o) * eVar.f11823j.e;
                if (f7 > 1.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                canvas.drawColor(i0.b.o(t6.x0(null, t6.f20929d6, false), (int) Math.min(eVar.f11828o * 420.0f, 255.0f)));
                eVar.d.a(canvas, 1.0f);
                if (z10) {
                    RectF rectF = eVar.f11825l;
                    if (eVar.f11824k != f7) {
                        eVar.f11824k = f7;
                        rectF.set(eVar.f11819c);
                        path.reset();
                        path.addRoundRect(rectF, f7, f7, Path.Direction.CW);
                        path.close();
                    }
                    canvas.save();
                    canvas.clipPath(path);
                }
                super.dispatchDraw(canvas);
                eVar.e.a(canvas, 1.0f - eVar.f11828o);
                if (z10) {
                    canvas.restore();
                    return;
                }
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f9872a) {
            case 2:
                jf0 jf0Var = (jf0) this.f9873b;
                if (!jf0Var.m0) {
                    canvas.save();
                    canvas.scale(jf0Var.H / jf0Var.e.getWidth(), jf0Var.I / jf0Var.e.getHeight());
                    super.draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            case 3:
                if (!((s0) this.f9873b).f31647a0) {
                    super.draw(canvas);
                    return;
                }
                return;
            default:
                super.draw(canvas);
                return;
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        switch (this.f9872a) {
            case 5:
                boolean drawChild = super.drawChild(canvas, view, j10);
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.f9873b;
                if (view == usersSelectActivity.d || view == usersSelectActivity.f34149f) {
                    ((ActionBarLayout) UsersSelectActivity.Z(usersSelectActivity)).q(canvas, usersSelectActivity.f34146a.getMeasuredHeight());
                }
                return drawChild;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        float f7;
        float f10;
        int measuredWidth;
        switch (this.f9872a) {
            case 0:
                for (int i14 = 0; i14 < getChildCount(); i14++) {
                    View childAt = getChildAt(i14);
                    Rect rect = ((lf.e) this.f9873b).f11819c;
                    childAt.layout(rect.left, rect.top, rect.right, rect.bottom);
                }
                return;
            case 1:
                org.telegram.ui.f fVar = (org.telegram.ui.f) this.f9873b;
                if (org.telegram.ui.f.a0(fVar) != null) {
                    org.telegram.ui.f.c0(fVar).layout(0, 0, i12, org.telegram.ui.f.b0(fVar).getMeasuredHeight());
                }
                int i15 = i12 - i10;
                int i16 = i13 - i11;
                int i17 = fVar.f37141w;
                if (i17 != 0) {
                    if (i17 != 3) {
                        if (i17 != 5) {
                            if (i17 == 6) {
                                if (i12 > i13) {
                                    int measuredHeight = (i16 - fVar.f37134a.getMeasuredHeight()) / 2;
                                    float f11 = i15;
                                    int measuredWidth2 = ((int) ((0.5f * f11) - fVar.f37134a.getMeasuredWidth())) / 2;
                                    ei0 ei0Var = fVar.f37134a;
                                    ei0Var.layout(measuredWidth2, measuredHeight, ei0Var.getMeasuredWidth() + measuredWidth2, fVar.f37134a.getMeasuredHeight() + measuredHeight);
                                    float f12 = 0.4f * f11;
                                    int i18 = (int) f12;
                                    float f13 = i16;
                                    int i19 = (int) (0.14f * f13);
                                    TextView textView = fVar.e;
                                    textView.layout(i18, i19, textView.getMeasuredWidth() + i18, fVar.e.getMeasuredHeight() + i19);
                                    int i20 = (int) (0.31f * f13);
                                    TextView textView2 = fVar.f37137f;
                                    textView2.layout(i18, i20, textView2.getMeasuredWidth() + i18, fVar.f37137f.getMeasuredHeight() + i20);
                                    int B = (int) i0.B(f11 * 0.6f, fVar.f37136c.getMeasuredWidth(), 2.0f, f12);
                                    int i21 = (int) (f13 * 0.78f);
                                    j6 j6Var = fVar.f37136c;
                                    j6Var.layout(B, i21, j6Var.getMeasuredWidth() + B, fVar.f37136c.getMeasuredHeight() + i21);
                                    return;
                                }
                                int i22 = (int) (i16 * 0.3f);
                                int measuredWidth3 = (i15 - fVar.f37134a.getMeasuredWidth()) / 2;
                                ei0 ei0Var2 = fVar.f37134a;
                                ei0Var2.layout(measuredWidth3, i22, ei0Var2.getMeasuredWidth() + measuredWidth3, fVar.f37134a.getMeasuredHeight() + i22);
                                int C = m5.C(24.0f, fVar.f37134a.getMeasuredHeight(), i22);
                                TextView textView3 = fVar.e;
                                textView3.layout(0, C, textView3.getMeasuredWidth(), fVar.e.getMeasuredHeight() + C);
                                int textSize = (int) (fVar.e.getTextSize() + org.telegram.messenger.i0.L(16.0f) + C);
                                TextView textView4 = fVar.f37137f;
                                textView4.layout(0, textSize, textView4.getMeasuredWidth(), fVar.f37137f.getMeasuredHeight() + textSize);
                                int measuredWidth4 = (i15 - fVar.f37136c.getMeasuredWidth()) / 2;
                                int measuredHeight2 = (i16 - fVar.f37136c.getMeasuredHeight()) - org.telegram.messenger.i0.L(48.0f);
                                j6 j6Var2 = fVar.f37136c;
                                j6Var2.layout(measuredWidth4, measuredHeight2, j6Var2.getMeasuredWidth() + measuredWidth4, fVar.f37136c.getMeasuredHeight() + measuredHeight2);
                                return;
                            }
                            return;
                        } else if (i12 > i13) {
                            int measuredHeight3 = (i16 - fVar.f37134a.getMeasuredHeight()) / 2;
                            ei0 ei0Var3 = fVar.f37134a;
                            ei0Var3.layout(0, measuredHeight3, ei0Var3.getMeasuredWidth(), fVar.f37134a.getMeasuredHeight() + measuredHeight3);
                            float f14 = i15;
                            float f15 = 0.4f * f14;
                            int i23 = (int) f15;
                            float f16 = i16;
                            int i24 = (int) (0.08f * f16);
                            TextView textView5 = fVar.e;
                            textView5.layout(i23, i24, textView5.getMeasuredWidth() + i23, fVar.e.getMeasuredHeight() + i24);
                            float f17 = f14 * 0.6f;
                            int B2 = (int) i0.B(f17, fVar.h.getMeasuredWidth(), 2.0f, f15);
                            int i25 = (int) (0.25f * f16);
                            LinearLayout linearLayout = fVar.h;
                            linearLayout.layout(B2, i25, linearLayout.getMeasuredWidth() + B2, fVar.h.getMeasuredHeight() + i25);
                            int B3 = (int) i0.B(f17, fVar.f37136c.getMeasuredWidth(), 2.0f, f15);
                            int i26 = (int) (f16 * 0.78f);
                            j6 j6Var3 = fVar.f37136c;
                            j6Var3.layout(B3, i26, j6Var3.getMeasuredWidth() + B3, fVar.f37136c.getMeasuredHeight() + i26);
                            return;
                        } else {
                            if (org.telegram.messenger.i0.f16026q.y < 1800) {
                                f7 = i16;
                                int i27 = (int) (0.06f * f7);
                                ei0 ei0Var4 = fVar.f37134a;
                                ei0Var4.layout(0, i27, ei0Var4.getMeasuredWidth(), fVar.f37134a.getMeasuredHeight() + i27);
                                int i28 = (int) (0.463f * f7);
                                TextView textView6 = fVar.e;
                                textView6.layout(0, i28, textView6.getMeasuredWidth(), fVar.e.getMeasuredHeight() + i28);
                                f10 = 0.543f;
                            } else {
                                f7 = i16;
                                int i29 = (int) (0.148f * f7);
                                ei0 ei0Var5 = fVar.f37134a;
                                ei0Var5.layout(0, i29, ei0Var5.getMeasuredWidth(), fVar.f37134a.getMeasuredHeight() + i29);
                                int i30 = (int) (0.551f * f7);
                                TextView textView7 = fVar.e;
                                textView7.layout(0, i30, textView7.getMeasuredWidth(), fVar.e.getMeasuredHeight() + i30);
                                f10 = 0.631f;
                            }
                            int i31 = (int) (f7 * f10);
                            int measuredWidth5 = (getMeasuredWidth() - fVar.h.getMeasuredWidth()) / 2;
                            LinearLayout linearLayout2 = fVar.h;
                            linearLayout2.layout(measuredWidth5, i31, linearLayout2.getMeasuredWidth() + measuredWidth5, fVar.h.getMeasuredHeight() + i31);
                            int measuredWidth6 = (i15 - fVar.f37136c.getMeasuredWidth()) / 2;
                            int i32 = (int) (i16 * 0.853f);
                            j6 j6Var4 = fVar.f37136c;
                            j6Var4.layout(measuredWidth6, i32, j6Var4.getMeasuredWidth() + measuredWidth6, fVar.f37136c.getMeasuredHeight() + i32);
                            return;
                        }
                    } else if (i12 > i13) {
                        float f18 = i16;
                        int measuredHeight4 = ((int) ((0.95f * f18) - fVar.f37134a.getMeasuredHeight())) / 2;
                        int width = (int) ((getWidth() * 0.35f) - fVar.f37134a.getMeasuredWidth());
                        ei0 ei0Var6 = fVar.f37134a;
                        ei0Var6.layout(width, measuredHeight4, ei0Var6.getMeasuredWidth() + width, fVar.f37134a.getMeasuredHeight() + measuredHeight4);
                        float f19 = i15;
                        float f20 = 0.4f * f19;
                        int i33 = (int) f20;
                        int i34 = (int) (0.12f * f18);
                        TextView textView8 = fVar.e;
                        textView8.layout(i33, i34, textView8.getMeasuredWidth() + i33, fVar.e.getMeasuredHeight() + i34);
                        int i35 = (int) (0.24f * f18);
                        TextView textView9 = fVar.f37137f;
                        textView9.layout(i33, i35, textView9.getMeasuredWidth() + i33, fVar.f37137f.getMeasuredHeight() + i35);
                        float f21 = f19 * 0.6f;
                        int B4 = (int) i0.B(f21, fVar.f37136c.getMeasuredWidth(), 2.0f, f20);
                        int i36 = (int) (f18 * 0.8f);
                        j6 j6Var5 = fVar.f37136c;
                        j6Var5.layout(B4, i36, j6Var5.getMeasuredWidth() + B4, fVar.f37136c.getMeasuredHeight() + i36);
                        int B5 = (int) i0.B(f21, fVar.d.getMeasuredWidth(), 2.0f, f20);
                        int w9 = z20.w(16.0f, fVar.d.getMeasuredHeight(), i36);
                        TextView textView10 = fVar.d;
                        textView10.layout(B5, w9, textView10.getMeasuredWidth() + B5, fVar.d.getMeasuredHeight() + w9);
                        return;
                    } else {
                        int i37 = (int) (i16 * 0.3f);
                        int measuredWidth7 = (i15 - fVar.f37134a.getMeasuredWidth()) / 2;
                        ei0 ei0Var7 = fVar.f37134a;
                        ei0Var7.layout(measuredWidth7, i37, ei0Var7.getMeasuredWidth() + measuredWidth7, fVar.f37134a.getMeasuredHeight() + i37);
                        int C2 = m5.C(24.0f, fVar.f37134a.getMeasuredHeight(), i37);
                        TextView textView11 = fVar.e;
                        textView11.layout(0, C2, textView11.getMeasuredWidth(), fVar.e.getMeasuredHeight() + C2);
                        int textSize2 = (int) (fVar.e.getTextSize() + org.telegram.messenger.i0.L(16.0f) + C2);
                        TextView textView12 = fVar.f37137f;
                        textView12.layout(0, textSize2, textView12.getMeasuredWidth(), fVar.f37137f.getMeasuredHeight() + textSize2);
                        int measuredWidth8 = (i15 - fVar.f37136c.getMeasuredWidth()) / 2;
                        int measuredHeight5 = (i16 - fVar.f37136c.getMeasuredHeight()) - org.telegram.messenger.i0.L(48.0f);
                        j6 j6Var6 = fVar.f37136c;
                        j6Var6.layout(measuredWidth8, measuredHeight5, j6Var6.getMeasuredWidth() + measuredWidth8, fVar.f37136c.getMeasuredHeight() + measuredHeight5);
                        int measuredWidth9 = (i15 - fVar.d.getMeasuredWidth()) / 2;
                        int w10 = z20.w(32.0f, fVar.d.getMeasuredHeight(), measuredHeight5);
                        TextView textView13 = fVar.d;
                        textView13.layout(measuredWidth9, w10, textView13.getMeasuredWidth() + measuredWidth9, fVar.d.getMeasuredHeight() + w10);
                        return;
                    }
                } else if (i12 > i13) {
                    int measuredHeight6 = (i16 - fVar.f37134a.getMeasuredHeight()) / 2;
                    ei0 ei0Var8 = fVar.f37134a;
                    ei0Var8.layout(0, measuredHeight6, ei0Var8.getMeasuredWidth(), fVar.f37134a.getMeasuredHeight() + measuredHeight6);
                    float f22 = i15;
                    float f23 = 0.4f * f22;
                    int i38 = (int) f23;
                    float f24 = i16;
                    int i39 = (int) (0.22f * f24);
                    TextView textView14 = fVar.e;
                    textView14.layout(i38, i39, textView14.getMeasuredWidth() + i38, fVar.e.getMeasuredHeight() + i39);
                    int i40 = (int) (0.39f * f24);
                    TextView textView15 = fVar.f37137f;
                    textView15.layout(i38, i40, textView15.getMeasuredWidth() + i38, fVar.f37137f.getMeasuredHeight() + i40);
                    int B6 = (int) i0.B(f22 * 0.6f, fVar.f37136c.getMeasuredWidth(), 2.0f, f23);
                    int i41 = (int) (f24 * 0.69f);
                    j6 j6Var7 = fVar.f37136c;
                    j6Var7.layout(B6, i41, j6Var7.getMeasuredWidth() + B6, fVar.f37136c.getMeasuredHeight() + i41);
                    return;
                } else {
                    float f25 = i16;
                    int i42 = (int) (0.188f * f25);
                    ei0 ei0Var9 = fVar.f37134a;
                    ei0Var9.layout(0, i42, ei0Var9.getMeasuredWidth(), fVar.f37134a.getMeasuredHeight() + i42);
                    int i43 = (int) (0.651f * f25);
                    TextView textView16 = fVar.e;
                    textView16.layout(0, i43, textView16.getMeasuredWidth(), fVar.e.getMeasuredHeight() + i43);
                    int i44 = (int) (0.731f * f25);
                    TextView textView17 = fVar.f37137f;
                    textView17.layout(0, i44, textView17.getMeasuredWidth(), fVar.f37137f.getMeasuredHeight() + i44);
                    int measuredWidth10 = (i15 - fVar.f37136c.getMeasuredWidth()) / 2;
                    int i45 = (int) (f25 * 0.853f);
                    j6 j6Var8 = fVar.f37136c;
                    j6Var8.layout(measuredWidth10, i45, j6Var8.getMeasuredWidth() + measuredWidth10, fVar.f37136c.getMeasuredHeight() + i45);
                    return;
                }
            case 2:
                jf0 jf0Var = (jf0) this.f9873b;
                jf0Var.e.layout(0, 0, jf0Var.H, jf0Var.I);
                return;
            case 3:
                s0 s0Var = (s0) this.f9873b;
                if (s0Var.e.getParent() == this) {
                    s0Var.e.layout(0, 0, s0Var.M, s0Var.N);
                    return;
                }
                return;
            case 4:
                tc1 tc1Var = (tc1) this.f9873b;
                tc1.o0(tc1Var).layout(0, 0, i12, tc1.n0(tc1Var).getMeasuredHeight());
                int i46 = i12 - i10;
                int i47 = i13 - i11;
                if (i12 > i13) {
                    int measuredHeight7 = (i47 - tc1Var.f41794a.getMeasuredHeight()) / 2;
                    ei0 ei0Var10 = tc1Var.f41794a;
                    ei0Var10.layout(0, measuredHeight7, ei0Var10.getMeasuredWidth(), tc1Var.f41794a.getMeasuredHeight() + measuredHeight7);
                    float f26 = i46;
                    float f27 = 0.4f * f26;
                    int i48 = (int) f27;
                    float f28 = i47;
                    int i49 = (int) (0.22f * f28);
                    TextView textView18 = tc1Var.f41798c;
                    textView18.layout(i48, i49, textView18.getMeasuredWidth() + i48, tc1Var.f41798c.getMeasuredHeight() + i49);
                    int i50 = (int) (0.39f * f28);
                    p pVar = tc1Var.d;
                    pVar.layout(i48, i50, pVar.getMeasuredWidth() + i48, tc1Var.d.getMeasuredHeight() + i50);
                    int B7 = (int) i0.B(f26 * 0.6f, tc1Var.f41796b.getMeasuredWidth(), 2.0f, f27);
                    int i51 = (int) (f28 * 0.64f);
                    TextView textView19 = tc1Var.f41796b;
                    textView19.layout(B7, i51, textView19.getMeasuredWidth() + B7, tc1Var.f41796b.getMeasuredHeight() + i51);
                    return;
                }
                int i52 = (int) (i47 * 0.3f);
                int measuredWidth11 = (i46 - tc1Var.f41794a.getMeasuredWidth()) / 2;
                ei0 ei0Var11 = tc1Var.f41794a;
                ei0Var11.layout(measuredWidth11, i52, ei0Var11.getMeasuredWidth() + measuredWidth11, tc1Var.f41794a.getMeasuredHeight() + i52);
                int C3 = m5.C(16.0f, tc1Var.f41794a.getMeasuredHeight(), i52);
                TextView textView20 = tc1Var.f41798c;
                textView20.layout(0, C3, textView20.getMeasuredWidth(), tc1Var.f41798c.getMeasuredHeight() + C3);
                int C4 = m5.C(12.0f, tc1Var.f41798c.getMeasuredHeight(), C3);
                p pVar2 = tc1Var.d;
                pVar2.layout(0, C4, pVar2.getMeasuredWidth(), tc1Var.d.getMeasuredHeight() + C4);
                int measuredWidth12 = (i46 - tc1Var.f41796b.getMeasuredWidth()) / 2;
                int measuredHeight8 = (i47 - tc1Var.f41796b.getMeasuredHeight()) - org.telegram.messenger.i0.L(48.0f);
                TextView textView21 = tc1Var.f41796b;
                textView21.layout(measuredWidth12, measuredHeight8, textView21.getMeasuredWidth() + measuredWidth12, tc1Var.f41796b.getMeasuredHeight() + measuredHeight8);
                return;
            default:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.f9873b;
                p1 p1Var = usersSelectActivity.f34146a;
                p1Var.layout(0, 0, p1Var.getMeasuredWidth(), usersSelectActivity.f34146a.getMeasuredHeight());
                usersSelectActivity.d.layout(0, usersSelectActivity.f34146a.getMeasuredHeight(), usersSelectActivity.d.getMeasuredWidth(), usersSelectActivity.d.getMeasuredHeight() + usersSelectActivity.f34146a.getMeasuredHeight());
                usersSelectActivity.f34149f.layout(0, usersSelectActivity.f34146a.getMeasuredHeight(), usersSelectActivity.f34149f.getMeasuredWidth(), usersSelectActivity.f34149f.getMeasuredHeight() + usersSelectActivity.f34146a.getMeasuredHeight());
                usersSelectActivity.e.layout(0, usersSelectActivity.f34146a.getMeasuredHeight(), usersSelectActivity.f34149f.getMeasuredWidth(), usersSelectActivity.e.getMeasuredHeight() + usersSelectActivity.f34146a.getMeasuredHeight());
                f10 f10Var = usersSelectActivity.f34151r;
                if (f10Var != null) {
                    if (cd.X) {
                        measuredWidth = usersSelectActivity.f34152s.leftMargin;
                    } else {
                        measuredWidth = ((i12 - i10) - usersSelectActivity.f34152s.rightMargin) - f10Var.getMeasuredWidth();
                    }
                    int measuredHeight9 = ((i13 - i11) - usersSelectActivity.f34152s.bottomMargin) - usersSelectActivity.f34151r.getMeasuredHeight();
                    f10 f10Var2 = usersSelectActivity.f34151r;
                    f10Var2.layout(measuredWidth, measuredHeight9, f10Var2.getMeasuredWidth() + measuredWidth, usersSelectActivity.f34151r.getMeasuredHeight() + measuredHeight9);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int L;
        switch (this.f9872a) {
            case 0:
                int size = View.MeasureSpec.getSize(i10);
                int size2 = View.MeasureSpec.getSize(i11);
                setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
                lf.e eVar = (lf.e) this.f9873b;
                boolean z10 = ((a) getParent()).d;
                Rect rect = eVar.f11819c;
                if (z10) {
                    rect.set(0, 0, size, size2);
                } else {
                    rect.set(eVar.f11818b);
                }
                for (int i13 = 0; i13 < getChildCount(); i13++) {
                    getChildAt(i13).measure(View.MeasureSpec.makeMeasureSpec(eVar.f11819c.width(), 1073741824), View.MeasureSpec.makeMeasureSpec(eVar.f11819c.height(), 1073741824));
                }
                return;
            case 1:
                int size3 = View.MeasureSpec.getSize(i10);
                int size4 = View.MeasureSpec.getSize(i11);
                org.telegram.ui.f fVar = (org.telegram.ui.f) this.f9873b;
                int i14 = fVar.f37141w;
                if (org.telegram.ui.f.Y(fVar) != null) {
                    org.telegram.ui.f.Z(fVar).measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), i11);
                }
                if (i14 != 0) {
                    if (i14 != 3) {
                        if (i14 != 5) {
                            if (i14 == 6) {
                                if (i14 == 6) {
                                    fVar.f37134a.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(140.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(140.0f), 1073741824));
                                } else {
                                    fVar.f37134a.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(100.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(100.0f), 1073741824));
                                }
                                if (size3 > size4) {
                                    int i15 = (int) (size3 * 0.6f);
                                    fVar.e.measure(View.MeasureSpec.makeMeasureSpec(i15, 1073741824), View.MeasureSpec.makeMeasureSpec(size4, 0));
                                    fVar.f37137f.measure(View.MeasureSpec.makeMeasureSpec(i15, 1073741824), View.MeasureSpec.makeMeasureSpec(size4, 0));
                                    fVar.f37136c.measure(View.MeasureSpec.makeMeasureSpec(i15, 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(48.0f), 1073741824));
                                } else {
                                    fVar.e.measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), View.MeasureSpec.makeMeasureSpec(size4, 0));
                                    fVar.f37137f.measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), View.MeasureSpec.makeMeasureSpec(size4, 0));
                                    if (i14 == 6) {
                                        fVar.f37136c.measure(z20.c(48.0f, size3, 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(48.0f), 1073741824));
                                    } else {
                                        fVar.f37136c.measure(z20.c(72.0f, size3, 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(48.0f), 1073741824));
                                    }
                                }
                            }
                        } else if (size3 > size4) {
                            float f7 = size3;
                            fVar.f37134a.measure(View.MeasureSpec.makeMeasureSpec((int) (0.45f * f7), 1073741824), View.MeasureSpec.makeMeasureSpec((int) (size4 * 0.68f), 1073741824));
                            int i16 = (int) (f7 * 0.6f);
                            fVar.e.measure(View.MeasureSpec.makeMeasureSpec(i16, 1073741824), View.MeasureSpec.makeMeasureSpec(size4, 0));
                            fVar.h.measure(View.MeasureSpec.makeMeasureSpec(i16, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size4, 0));
                            fVar.f37136c.measure(View.MeasureSpec.makeMeasureSpec(i16, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(48.0f), 1073741824));
                        } else {
                            fVar.f37134a.measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), View.MeasureSpec.makeMeasureSpec((int) (size4 * 0.399f), 1073741824));
                            fVar.e.measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), View.MeasureSpec.makeMeasureSpec(size4, 0));
                            fVar.h.measure(View.MeasureSpec.makeMeasureSpec(size3, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size4, 0));
                            fVar.f37136c.measure(View.MeasureSpec.makeMeasureSpec(size3, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(48.0f), 1073741824));
                        }
                    } else {
                        fVar.f37134a.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(150.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(150.0f), 1073741824));
                        if (size3 > size4) {
                            float f10 = size3;
                            fVar.d.measure(View.MeasureSpec.makeMeasureSpec((int) (0.45f * f10), 1073741824), View.MeasureSpec.makeMeasureSpec(size4, 0));
                            int i17 = (int) (f10 * 0.6f);
                            fVar.e.measure(View.MeasureSpec.makeMeasureSpec(i17, 1073741824), View.MeasureSpec.makeMeasureSpec(size4, 0));
                            fVar.f37137f.measure(View.MeasureSpec.makeMeasureSpec(i17, 1073741824), View.MeasureSpec.makeMeasureSpec(size4, 0));
                            fVar.f37136c.measure(View.MeasureSpec.makeMeasureSpec(i17, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(48.0f), 1073741824));
                        } else {
                            fVar.e.measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), View.MeasureSpec.makeMeasureSpec(size4, 0));
                            fVar.f37137f.measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), View.MeasureSpec.makeMeasureSpec(size4, 0));
                            fVar.d.measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), View.MeasureSpec.makeMeasureSpec(size4, 0));
                            fVar.f37136c.measure(z20.c(48.0f, size3, 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(48.0f), 1073741824));
                        }
                    }
                } else if (size3 > size4) {
                    float f11 = size3;
                    fVar.f37134a.measure(View.MeasureSpec.makeMeasureSpec((int) (0.45f * f11), 1073741824), View.MeasureSpec.makeMeasureSpec((int) (size4 * 0.68f), 1073741824));
                    int i18 = (int) (f11 * 0.6f);
                    fVar.e.measure(View.MeasureSpec.makeMeasureSpec(i18, 1073741824), View.MeasureSpec.makeMeasureSpec(size4, 0));
                    fVar.f37137f.measure(View.MeasureSpec.makeMeasureSpec(i18, 1073741824), View.MeasureSpec.makeMeasureSpec(size4, 0));
                    fVar.f37136c.measure(View.MeasureSpec.makeMeasureSpec(i18, 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(48.0f), 1073741824));
                } else {
                    fVar.f37134a.measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), View.MeasureSpec.makeMeasureSpec((int) (size4 * 0.399f), 1073741824));
                    fVar.e.measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), View.MeasureSpec.makeMeasureSpec(size4, 0));
                    fVar.f37137f.measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), View.MeasureSpec.makeMeasureSpec(size4, 0));
                    fVar.f37136c.measure(z20.c(72.0f, size3, 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(48.0f), 1073741824));
                }
                setMeasuredDimension(size3, size4);
                return;
            case 2:
                setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
                jf0 jf0Var = (jf0) this.f9873b;
                jf0Var.e.measure(View.MeasureSpec.makeMeasureSpec(jf0Var.H, 1073741824), View.MeasureSpec.makeMeasureSpec(jf0Var.I, 1073741824));
                return;
            case 3:
                setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
                s0 s0Var = (s0) this.f9873b;
                if (s0Var.e.getParent() == this) {
                    s0Var.e.measure(View.MeasureSpec.makeMeasureSpec(s0Var.M, 1073741824), View.MeasureSpec.makeMeasureSpec(s0Var.N, 1073741824));
                    return;
                }
                return;
            case 4:
                int size5 = View.MeasureSpec.getSize(i10);
                int size6 = View.MeasureSpec.getSize(i11);
                tc1 tc1Var = (tc1) this.f9873b;
                tc1.x0(tc1Var).measure(View.MeasureSpec.makeMeasureSpec(size5, 1073741824), i11);
                if (size5 > size6) {
                    float f12 = size5;
                    tc1Var.f41794a.measure(View.MeasureSpec.makeMeasureSpec((int) (0.45f * f12), 1073741824), View.MeasureSpec.makeMeasureSpec((int) (size6 * 0.68f), 1073741824));
                    int i19 = (int) (f12 * 0.6f);
                    tc1Var.f41798c.measure(View.MeasureSpec.makeMeasureSpec(i19, 1073741824), View.MeasureSpec.makeMeasureSpec(size6, 0));
                    tc1Var.d.measure(View.MeasureSpec.makeMeasureSpec(i19, 1073741824), View.MeasureSpec.makeMeasureSpec(size6, 0));
                    tc1Var.e.measure(View.MeasureSpec.makeMeasureSpec(i19, 1073741824), View.MeasureSpec.makeMeasureSpec(size6, 0));
                    tc1Var.f41796b.measure(View.MeasureSpec.makeMeasureSpec(i19, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(42.0f), 1073741824));
                } else {
                    if (tc1Var.O == 7) {
                        i12 = 160;
                    } else {
                        i12 = 140;
                    }
                    float f13 = i12;
                    tc1Var.f41794a.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(f13), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(f13), 1073741824));
                    tc1Var.f41798c.measure(View.MeasureSpec.makeMeasureSpec(size5, 1073741824), View.MeasureSpec.makeMeasureSpec(size6, 0));
                    tc1Var.d.measure(View.MeasureSpec.makeMeasureSpec(size5, 1073741824), View.MeasureSpec.makeMeasureSpec(size6, 0));
                    tc1Var.e.measure(View.MeasureSpec.makeMeasureSpec(size5, 1073741824), View.MeasureSpec.makeMeasureSpec(size6, 0));
                    tc1Var.f41796b.measure(z20.c(48.0f, size5, 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(50.0f), 1073741824));
                }
                setMeasuredDimension(size5, size6);
                return;
            default:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.f9873b;
                int size7 = View.MeasureSpec.getSize(i10);
                int size8 = View.MeasureSpec.getSize(i11);
                setMeasuredDimension(size7, size8);
                if (!org.telegram.messenger.i0.Q1() && size8 <= size7) {
                    L = org.telegram.messenger.i0.L(56.0f);
                } else {
                    L = org.telegram.messenger.i0.L(144.0f);
                }
                usersSelectActivity.f34146a.measure(View.MeasureSpec.makeMeasureSpec(size7, 1073741824), View.MeasureSpec.makeMeasureSpec(L, Integer.MIN_VALUE));
                usersSelectActivity.d.measure(View.MeasureSpec.makeMeasureSpec(size7, 1073741824), View.MeasureSpec.makeMeasureSpec(size8 - usersSelectActivity.f34146a.getMeasuredHeight(), 1073741824));
                usersSelectActivity.f34149f.measure(View.MeasureSpec.makeMeasureSpec(size7, 1073741824), View.MeasureSpec.makeMeasureSpec(size8 - usersSelectActivity.f34146a.getMeasuredHeight(), 1073741824));
                usersSelectActivity.e.measure(View.MeasureSpec.makeMeasureSpec(size7, 1073741824), View.MeasureSpec.makeMeasureSpec(size8 - usersSelectActivity.f34146a.getMeasuredHeight(), 1073741824));
                f10 f10Var = usersSelectActivity.f34151r;
                if (f10Var != null) {
                    int i20 = usersSelectActivity.f34152s.width;
                    f10Var.measure(View.MeasureSpec.makeMeasureSpec(i20, 1073741824), View.MeasureSpec.makeMeasureSpec(i20, 1073741824));
                    return;
                }
                return;
        }
    }

    public g(LaunchActivity launchActivity, lf.e eVar) {
        super(launchActivity);
        this.f9872a = 0;
        this.f9873b = eVar;
    }
}
