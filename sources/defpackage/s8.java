package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.UsersSelectActivity;
public final class s8 extends ViewGroup {
    public final byte a;
    public final Object b;

    public s8(byte b, Context context, Object obj) {
        super(context);
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.a) {
            case 1:
                canvas.save();
                tl4 tl4Var = (tl4) this.b;
                canvas.scale(tl4Var.x / tl4Var.i.getWidth(), tl4Var.y / tl4Var.i.getHeight());
                super.draw(canvas);
                canvas.restore();
                return;
            default:
                super.draw(canvas);
                return;
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        switch (this.a) {
            case 3:
                boolean drawChild = super.drawChild(canvas, view, j);
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.b;
                if (view == usersSelectActivity.d || view == usersSelectActivity.f) {
                    ((ActionBarLayout) UsersSelectActivity.Z(usersSelectActivity)).o(canvas, usersSelectActivity.a.getMeasuredHeight());
                }
                return drawChild;
            default:
                return super.drawChild(canvas, view, j);
        }
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float f;
        float f2;
        int measuredWidth;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                u8 u8Var = (u8) obj;
                if (u8.b0(u8Var) != null) {
                    u8.d0(u8Var).layout(0, 0, i3, u8.c0(u8Var).getMeasuredHeight());
                }
                int i5 = i3 - i;
                int i6 = i4 - i2;
                byte b2 = u8Var.w;
                if (b2 != 0) {
                    if (b2 != 3) {
                        if (b2 != 5) {
                            if (b2 == 6) {
                                s09 s09Var = u8Var.a;
                                if (i3 > i4) {
                                    int measuredHeight = (i6 - s09Var.getMeasuredHeight()) / 2;
                                    float f3 = i5;
                                    int measuredWidth2 = ((int) ((0.5f * f3) - u8Var.a.getMeasuredWidth())) / 2;
                                    s09 s09Var2 = u8Var.a;
                                    s09Var2.layout(measuredWidth2, measuredHeight, s09Var2.getMeasuredWidth() + measuredWidth2, u8Var.a.getMeasuredHeight() + measuredHeight);
                                    float f4 = 0.4f * f3;
                                    int i7 = (int) f4;
                                    float f5 = i6;
                                    int i8 = (int) (0.14f * f5);
                                    TextView textView = u8Var.e;
                                    textView.layout(i7, i8, textView.getMeasuredWidth() + i7, u8Var.e.getMeasuredHeight() + i8);
                                    int i9 = (int) (0.31f * f5);
                                    TextView textView2 = u8Var.f;
                                    textView2.layout(i7, i9, textView2.getMeasuredWidth() + i7, u8Var.f.getMeasuredHeight() + i9);
                                    int z2 = (int) aq1.z(f3 * 0.6f, u8Var.c.getMeasuredWidth(), 2.0f, f4);
                                    int i10 = (int) (f5 * 0.78f);
                                    t8 t8Var = u8Var.c;
                                    t8Var.layout(z2, i10, t8Var.getMeasuredWidth() + z2, u8Var.c.getMeasuredHeight() + i10);
                                    return;
                                }
                                int i11 = (int) (i6 * 0.3f);
                                int measuredWidth3 = (i5 - s09Var.getMeasuredWidth()) / 2;
                                s09 s09Var3 = u8Var.a;
                                s09Var3.layout(measuredWidth3, i11, s09Var3.getMeasuredWidth() + measuredWidth3, u8Var.a.getMeasuredHeight() + i11);
                                int v = hg9.v(24.0f, u8Var.a.getMeasuredHeight(), i11);
                                TextView textView3 = u8Var.e;
                                textView3.layout(0, v, textView3.getMeasuredWidth(), u8Var.e.getMeasuredHeight() + v);
                                int textSize = (int) (u8Var.e.getTextSize() + gm.L(16.0f) + v);
                                TextView textView4 = u8Var.f;
                                textView4.layout(0, textSize, textView4.getMeasuredWidth(), u8Var.f.getMeasuredHeight() + textSize);
                                int measuredWidth4 = (i5 - u8Var.c.getMeasuredWidth()) / 2;
                                int measuredHeight2 = (i6 - u8Var.c.getMeasuredHeight()) - gm.L(48.0f);
                                t8 t8Var2 = u8Var.c;
                                t8Var2.layout(measuredWidth4, measuredHeight2, t8Var2.getMeasuredWidth() + measuredWidth4, u8Var.c.getMeasuredHeight() + measuredHeight2);
                                return;
                            }
                            return;
                        } else if (i3 > i4) {
                            int measuredHeight3 = (i6 - u8Var.a.getMeasuredHeight()) / 2;
                            s09 s09Var4 = u8Var.a;
                            s09Var4.layout(0, measuredHeight3, s09Var4.getMeasuredWidth(), u8Var.a.getMeasuredHeight() + measuredHeight3);
                            float f6 = i5;
                            float f7 = 0.4f * f6;
                            int i12 = (int) f7;
                            float f8 = i6;
                            int i13 = (int) (0.08f * f8);
                            TextView textView5 = u8Var.e;
                            textView5.layout(i12, i13, textView5.getMeasuredWidth() + i12, u8Var.e.getMeasuredHeight() + i13);
                            float f9 = f6 * 0.6f;
                            int z3 = (int) aq1.z(f9, u8Var.h.getMeasuredWidth(), 2.0f, f7);
                            int i14 = (int) (0.25f * f8);
                            LinearLayout linearLayout = u8Var.h;
                            linearLayout.layout(z3, i14, linearLayout.getMeasuredWidth() + z3, u8Var.h.getMeasuredHeight() + i14);
                            int z4 = (int) aq1.z(f9, u8Var.c.getMeasuredWidth(), 2.0f, f7);
                            int i15 = (int) (f8 * 0.78f);
                            t8 t8Var3 = u8Var.c;
                            t8Var3.layout(z4, i15, t8Var3.getMeasuredWidth() + z4, u8Var.c.getMeasuredHeight() + i15);
                            return;
                        } else {
                            int i16 = gm.q.y;
                            s09 s09Var5 = u8Var.a;
                            if (i16 < 1800) {
                                f = i6;
                                int i17 = (int) (0.06f * f);
                                s09Var5.layout(0, i17, s09Var5.getMeasuredWidth(), u8Var.a.getMeasuredHeight() + i17);
                                int i18 = (int) (0.463f * f);
                                TextView textView6 = u8Var.e;
                                textView6.layout(0, i18, textView6.getMeasuredWidth(), u8Var.e.getMeasuredHeight() + i18);
                                f2 = 0.543f;
                            } else {
                                f = i6;
                                int i19 = (int) (0.148f * f);
                                s09Var5.layout(0, i19, s09Var5.getMeasuredWidth(), u8Var.a.getMeasuredHeight() + i19);
                                int i20 = (int) (0.551f * f);
                                TextView textView7 = u8Var.e;
                                textView7.layout(0, i20, textView7.getMeasuredWidth(), u8Var.e.getMeasuredHeight() + i20);
                                f2 = 0.631f;
                            }
                            int i21 = (int) (f * f2);
                            int measuredWidth5 = (getMeasuredWidth() - u8Var.h.getMeasuredWidth()) / 2;
                            LinearLayout linearLayout2 = u8Var.h;
                            linearLayout2.layout(measuredWidth5, i21, linearLayout2.getMeasuredWidth() + measuredWidth5, u8Var.h.getMeasuredHeight() + i21);
                            int measuredWidth6 = (i5 - u8Var.c.getMeasuredWidth()) / 2;
                            int i22 = (int) (i6 * 0.853f);
                            t8 t8Var4 = u8Var.c;
                            t8Var4.layout(measuredWidth6, i22, t8Var4.getMeasuredWidth() + measuredWidth6, u8Var.c.getMeasuredHeight() + i22);
                            return;
                        }
                    }
                    s09 s09Var6 = u8Var.a;
                    if (i3 > i4) {
                        float f10 = i6;
                        int measuredHeight4 = ((int) ((0.95f * f10) - s09Var6.getMeasuredHeight())) / 2;
                        int width = (int) ((getWidth() * 0.35f) - u8Var.a.getMeasuredWidth());
                        s09 s09Var7 = u8Var.a;
                        s09Var7.layout(width, measuredHeight4, s09Var7.getMeasuredWidth() + width, u8Var.a.getMeasuredHeight() + measuredHeight4);
                        float f11 = i5;
                        float f12 = 0.4f * f11;
                        int i23 = (int) f12;
                        int i24 = (int) (0.12f * f10);
                        TextView textView8 = u8Var.e;
                        textView8.layout(i23, i24, textView8.getMeasuredWidth() + i23, u8Var.e.getMeasuredHeight() + i24);
                        int i25 = (int) (0.24f * f10);
                        TextView textView9 = u8Var.f;
                        textView9.layout(i23, i25, textView9.getMeasuredWidth() + i23, u8Var.f.getMeasuredHeight() + i25);
                        float f13 = f11 * 0.6f;
                        int z5 = (int) aq1.z(f13, u8Var.c.getMeasuredWidth(), 2.0f, f12);
                        int i26 = (int) (f10 * 0.8f);
                        t8 t8Var5 = u8Var.c;
                        t8Var5.layout(z5, i26, t8Var5.getMeasuredWidth() + z5, u8Var.c.getMeasuredHeight() + i26);
                        int z6 = (int) aq1.z(f13, u8Var.d.getMeasuredWidth(), 2.0f, f12);
                        int B = wi8.B(16.0f, u8Var.d.getMeasuredHeight(), i26);
                        TextView textView10 = u8Var.d;
                        textView10.layout(z6, B, textView10.getMeasuredWidth() + z6, u8Var.d.getMeasuredHeight() + B);
                        return;
                    }
                    int i27 = (int) (i6 * 0.3f);
                    int measuredWidth7 = (i5 - s09Var6.getMeasuredWidth()) / 2;
                    s09 s09Var8 = u8Var.a;
                    s09Var8.layout(measuredWidth7, i27, s09Var8.getMeasuredWidth() + measuredWidth7, u8Var.a.getMeasuredHeight() + i27);
                    int v2 = hg9.v(24.0f, u8Var.a.getMeasuredHeight(), i27);
                    TextView textView11 = u8Var.e;
                    textView11.layout(0, v2, textView11.getMeasuredWidth(), u8Var.e.getMeasuredHeight() + v2);
                    int textSize2 = (int) (u8Var.e.getTextSize() + gm.L(16.0f) + v2);
                    TextView textView12 = u8Var.f;
                    textView12.layout(0, textSize2, textView12.getMeasuredWidth(), u8Var.f.getMeasuredHeight() + textSize2);
                    int measuredWidth8 = (i5 - u8Var.c.getMeasuredWidth()) / 2;
                    int measuredHeight5 = (i6 - u8Var.c.getMeasuredHeight()) - gm.L(48.0f);
                    t8 t8Var6 = u8Var.c;
                    t8Var6.layout(measuredWidth8, measuredHeight5, t8Var6.getMeasuredWidth() + measuredWidth8, u8Var.c.getMeasuredHeight() + measuredHeight5);
                    int measuredWidth9 = (i5 - u8Var.d.getMeasuredWidth()) / 2;
                    int B2 = wi8.B(32.0f, u8Var.d.getMeasuredHeight(), measuredHeight5);
                    TextView textView13 = u8Var.d;
                    textView13.layout(measuredWidth9, B2, textView13.getMeasuredWidth() + measuredWidth9, u8Var.d.getMeasuredHeight() + B2);
                    return;
                }
                s09 s09Var9 = u8Var.a;
                if (i3 > i4) {
                    int measuredHeight6 = (i6 - s09Var9.getMeasuredHeight()) / 2;
                    s09 s09Var10 = u8Var.a;
                    s09Var10.layout(0, measuredHeight6, s09Var10.getMeasuredWidth(), u8Var.a.getMeasuredHeight() + measuredHeight6);
                    float f14 = i5;
                    float f15 = 0.4f * f14;
                    int i28 = (int) f15;
                    float f16 = i6;
                    int i29 = (int) (0.22f * f16);
                    TextView textView14 = u8Var.e;
                    textView14.layout(i28, i29, textView14.getMeasuredWidth() + i28, u8Var.e.getMeasuredHeight() + i29);
                    int i30 = (int) (0.39f * f16);
                    TextView textView15 = u8Var.f;
                    textView15.layout(i28, i30, textView15.getMeasuredWidth() + i28, u8Var.f.getMeasuredHeight() + i30);
                    int z7 = (int) aq1.z(f14 * 0.6f, u8Var.c.getMeasuredWidth(), 2.0f, f15);
                    int i31 = (int) (f16 * 0.69f);
                    t8 t8Var7 = u8Var.c;
                    t8Var7.layout(z7, i31, t8Var7.getMeasuredWidth() + z7, u8Var.c.getMeasuredHeight() + i31);
                    return;
                }
                float f17 = i6;
                int i32 = (int) (0.188f * f17);
                s09Var9.layout(0, i32, s09Var9.getMeasuredWidth(), u8Var.a.getMeasuredHeight() + i32);
                int i33 = (int) (0.651f * f17);
                TextView textView16 = u8Var.e;
                textView16.layout(0, i33, textView16.getMeasuredWidth(), u8Var.e.getMeasuredHeight() + i33);
                int i34 = (int) (0.731f * f17);
                TextView textView17 = u8Var.f;
                textView17.layout(0, i34, textView17.getMeasuredWidth(), u8Var.f.getMeasuredHeight() + i34);
                int measuredWidth10 = (i5 - u8Var.c.getMeasuredWidth()) / 2;
                int i35 = (int) (f17 * 0.853f);
                t8 t8Var8 = u8Var.c;
                t8Var8.layout(measuredWidth10, i35, t8Var8.getMeasuredWidth() + measuredWidth10, u8Var.c.getMeasuredHeight() + i35);
                return;
            case 1:
                tl4 tl4Var = (tl4) obj;
                tl4Var.i.layout(0, 0, tl4Var.x, tl4Var.y);
                return;
            case 2:
                p5c p5cVar = (p5c) obj;
                p5c.b0(p5cVar).layout(0, 0, i3, p5c.a0(p5cVar).getMeasuredHeight());
                int i36 = i3 - i;
                int i37 = i4 - i2;
                s09 s09Var11 = p5cVar.a;
                if (i3 > i4) {
                    int measuredHeight7 = (i37 - s09Var11.getMeasuredHeight()) / 2;
                    s09 s09Var12 = p5cVar.a;
                    s09Var12.layout(0, measuredHeight7, s09Var12.getMeasuredWidth(), p5cVar.a.getMeasuredHeight() + measuredHeight7);
                    float f18 = i36;
                    float f19 = 0.4f * f18;
                    int i38 = (int) f19;
                    float f20 = i37;
                    int i39 = (int) (0.22f * f20);
                    TextView textView18 = p5cVar.c;
                    textView18.layout(i38, i39, textView18.getMeasuredWidth() + i38, p5cVar.c.getMeasuredHeight() + i39);
                    int i40 = (int) (0.39f * f20);
                    xna xnaVar = p5cVar.d;
                    xnaVar.layout(i38, i40, xnaVar.getMeasuredWidth() + i38, p5cVar.d.getMeasuredHeight() + i40);
                    int z8 = (int) aq1.z(f18 * 0.6f, p5cVar.b.getMeasuredWidth(), 2.0f, f19);
                    int i41 = (int) (f20 * 0.64f);
                    TextView textView19 = p5cVar.b;
                    textView19.layout(z8, i41, textView19.getMeasuredWidth() + z8, p5cVar.b.getMeasuredHeight() + i41);
                    return;
                }
                int i42 = (int) (i37 * 0.3f);
                int measuredWidth11 = (i36 - s09Var11.getMeasuredWidth()) / 2;
                s09 s09Var13 = p5cVar.a;
                s09Var13.layout(measuredWidth11, i42, s09Var13.getMeasuredWidth() + measuredWidth11, p5cVar.a.getMeasuredHeight() + i42);
                int v3 = hg9.v(16.0f, p5cVar.a.getMeasuredHeight(), i42);
                TextView textView20 = p5cVar.c;
                textView20.layout(0, v3, textView20.getMeasuredWidth(), p5cVar.c.getMeasuredHeight() + v3);
                int v4 = hg9.v(12.0f, p5cVar.c.getMeasuredHeight(), v3);
                xna xnaVar2 = p5cVar.d;
                xnaVar2.layout(0, v4, xnaVar2.getMeasuredWidth(), p5cVar.d.getMeasuredHeight() + v4);
                int measuredWidth12 = (i36 - p5cVar.b.getMeasuredWidth()) / 2;
                int measuredHeight8 = (i37 - p5cVar.b.getMeasuredHeight()) - gm.L(48.0f);
                TextView textView21 = p5cVar.b;
                textView21.layout(measuredWidth12, measuredHeight8, textView21.getMeasuredWidth() + measuredWidth12, p5cVar.b.getMeasuredHeight() + measuredHeight8);
                return;
            default:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) obj;
                xd xdVar = usersSelectActivity.a;
                xdVar.layout(0, 0, xdVar.getMeasuredWidth(), usersSelectActivity.a.getMeasuredHeight());
                usersSelectActivity.d.layout(0, usersSelectActivity.a.getMeasuredHeight(), usersSelectActivity.d.getMeasuredWidth(), usersSelectActivity.d.getMeasuredHeight() + usersSelectActivity.a.getMeasuredHeight());
                usersSelectActivity.f.layout(0, usersSelectActivity.a.getMeasuredHeight(), usersSelectActivity.f.getMeasuredWidth(), usersSelectActivity.f.getMeasuredHeight() + usersSelectActivity.a.getMeasuredHeight());
                usersSelectActivity.e.layout(0, usersSelectActivity.a.getMeasuredHeight(), usersSelectActivity.f.getMeasuredWidth(), usersSelectActivity.e.getMeasuredHeight() + usersSelectActivity.a.getMeasuredHeight());
                wp4 wp4Var = usersSelectActivity.r;
                if (wp4Var != null) {
                    boolean z9 = jb6.a0;
                    FrameLayout.LayoutParams layoutParams = usersSelectActivity.s;
                    if (z9) {
                        measuredWidth = layoutParams.leftMargin;
                    } else {
                        measuredWidth = ((i3 - i) - layoutParams.rightMargin) - wp4Var.getMeasuredWidth();
                    }
                    int measuredHeight9 = ((i4 - i2) - usersSelectActivity.s.bottomMargin) - usersSelectActivity.r.getMeasuredHeight();
                    wp4 wp4Var2 = usersSelectActivity.r;
                    wp4Var2.layout(measuredWidth, measuredHeight9, wp4Var2.getMeasuredWidth() + measuredWidth, usersSelectActivity.r.getMeasuredHeight() + measuredHeight9);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int i3;
        int L;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                int size = View.MeasureSpec.getSize(i);
                int size2 = View.MeasureSpec.getSize(i2);
                u8 u8Var = (u8) obj;
                byte b2 = u8Var.w;
                if (u8.Z(u8Var) != null) {
                    u8.a0(u8Var).measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), i2);
                }
                if (b2 != 0) {
                    if (b2 != 3) {
                        if (b2 != 5) {
                            if (b2 == 6) {
                                s09 s09Var = u8Var.a;
                                if (b2 == 6) {
                                    s09Var.measure(View.MeasureSpec.makeMeasureSpec(gm.L(140.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(gm.L(140.0f), 1073741824));
                                } else {
                                    s09Var.measure(View.MeasureSpec.makeMeasureSpec(gm.L(100.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(gm.L(100.0f), 1073741824));
                                }
                                TextView textView = u8Var.e;
                                if (size > size2) {
                                    int i4 = (int) (size * 0.6f);
                                    textView.measure(View.MeasureSpec.makeMeasureSpec(i4, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                                    u8Var.f.measure(View.MeasureSpec.makeMeasureSpec(i4, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                                    u8Var.c.measure(View.MeasureSpec.makeMeasureSpec(i4, 1073741824), View.MeasureSpec.makeMeasureSpec(gm.L(48.0f), 1073741824));
                                } else {
                                    textView.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                                    u8Var.f.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                                    t8 t8Var = u8Var.c;
                                    if (b2 == 6) {
                                        t8Var.measure(wi8.f(48.0f, size, 1073741824), View.MeasureSpec.makeMeasureSpec(gm.L(48.0f), 1073741824));
                                    } else {
                                        t8Var.measure(wi8.f(72.0f, size, 1073741824), View.MeasureSpec.makeMeasureSpec(gm.L(48.0f), 1073741824));
                                    }
                                }
                            }
                        } else {
                            s09 s09Var2 = u8Var.a;
                            if (size > size2) {
                                float f = size;
                                s09Var2.measure(View.MeasureSpec.makeMeasureSpec((int) (0.45f * f), 1073741824), View.MeasureSpec.makeMeasureSpec((int) (size2 * 0.68f), 1073741824));
                                int i5 = (int) (f * 0.6f);
                                u8Var.e.measure(View.MeasureSpec.makeMeasureSpec(i5, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                                u8Var.h.measure(View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, 0));
                                u8Var.c.measure(View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(gm.L(48.0f), 1073741824));
                            } else {
                                s09Var2.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec((int) (size2 * 0.399f), 1073741824));
                                u8Var.e.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                                u8Var.h.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, 0));
                                u8Var.c.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(gm.L(48.0f), 1073741824));
                            }
                        }
                    } else {
                        u8Var.a.measure(View.MeasureSpec.makeMeasureSpec(gm.L(150.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(gm.L(150.0f), 1073741824));
                        if (size > size2) {
                            float f2 = size;
                            u8Var.d.measure(View.MeasureSpec.makeMeasureSpec((int) (0.45f * f2), 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            int i6 = (int) (f2 * 0.6f);
                            u8Var.e.measure(View.MeasureSpec.makeMeasureSpec(i6, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            u8Var.f.measure(View.MeasureSpec.makeMeasureSpec(i6, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            u8Var.c.measure(View.MeasureSpec.makeMeasureSpec(i6, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(gm.L(48.0f), 1073741824));
                        } else {
                            u8Var.e.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            u8Var.f.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            u8Var.d.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            u8Var.c.measure(wi8.f(48.0f, size, 1073741824), View.MeasureSpec.makeMeasureSpec(gm.L(48.0f), 1073741824));
                        }
                    }
                } else {
                    s09 s09Var3 = u8Var.a;
                    if (size > size2) {
                        float f3 = size;
                        s09Var3.measure(View.MeasureSpec.makeMeasureSpec((int) (0.45f * f3), 1073741824), View.MeasureSpec.makeMeasureSpec((int) (size2 * 0.68f), 1073741824));
                        int i7 = (int) (f3 * 0.6f);
                        u8Var.e.measure(View.MeasureSpec.makeMeasureSpec(i7, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                        u8Var.f.measure(View.MeasureSpec.makeMeasureSpec(i7, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                        u8Var.c.measure(View.MeasureSpec.makeMeasureSpec(i7, 1073741824), View.MeasureSpec.makeMeasureSpec(gm.L(48.0f), 1073741824));
                    } else {
                        s09Var3.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec((int) (size2 * 0.399f), 1073741824));
                        u8Var.e.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                        u8Var.f.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                        u8Var.c.measure(wi8.f(72.0f, size, 1073741824), View.MeasureSpec.makeMeasureSpec(gm.L(48.0f), 1073741824));
                    }
                }
                setMeasuredDimension(size, size2);
                return;
            case 1:
                setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
                tl4 tl4Var = (tl4) obj;
                tl4Var.i.measure(View.MeasureSpec.makeMeasureSpec(tl4Var.x, 1073741824), View.MeasureSpec.makeMeasureSpec(tl4Var.y, 1073741824));
                return;
            case 2:
                int size3 = View.MeasureSpec.getSize(i);
                int size4 = View.MeasureSpec.getSize(i2);
                p5c p5cVar = (p5c) obj;
                p5c.k0(p5cVar).measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), i2);
                if (size3 > size4) {
                    float f4 = size3;
                    p5cVar.a.measure(View.MeasureSpec.makeMeasureSpec((int) (0.45f * f4), 1073741824), View.MeasureSpec.makeMeasureSpec((int) (size4 * 0.68f), 1073741824));
                    int i8 = (int) (f4 * 0.6f);
                    p5cVar.c.measure(View.MeasureSpec.makeMeasureSpec(i8, 1073741824), View.MeasureSpec.makeMeasureSpec(size4, 0));
                    p5cVar.d.measure(View.MeasureSpec.makeMeasureSpec(i8, 1073741824), View.MeasureSpec.makeMeasureSpec(size4, 0));
                    p5cVar.e.measure(View.MeasureSpec.makeMeasureSpec(i8, 1073741824), View.MeasureSpec.makeMeasureSpec(size4, 0));
                    p5cVar.b.measure(View.MeasureSpec.makeMeasureSpec(i8, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(gm.L(42.0f), 1073741824));
                } else {
                    if (p5cVar.P == 7) {
                        i3 = 160;
                    } else {
                        i3 = 140;
                    }
                    float f5 = i3;
                    p5cVar.a.measure(View.MeasureSpec.makeMeasureSpec(gm.L(f5), 1073741824), View.MeasureSpec.makeMeasureSpec(gm.L(f5), 1073741824));
                    p5cVar.c.measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), View.MeasureSpec.makeMeasureSpec(size4, 0));
                    p5cVar.d.measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), View.MeasureSpec.makeMeasureSpec(size4, 0));
                    p5cVar.e.measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), View.MeasureSpec.makeMeasureSpec(size4, 0));
                    p5cVar.b.measure(wi8.f(48.0f, size3, 1073741824), View.MeasureSpec.makeMeasureSpec(gm.L(50.0f), 1073741824));
                }
                setMeasuredDimension(size3, size4);
                return;
            default:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) obj;
                int size5 = View.MeasureSpec.getSize(i);
                int size6 = View.MeasureSpec.getSize(i2);
                setMeasuredDimension(size5, size6);
                if (!gm.O1() && size6 <= size5) {
                    L = gm.L(56.0f);
                } else {
                    L = gm.L(144.0f);
                }
                usersSelectActivity.a.measure(View.MeasureSpec.makeMeasureSpec(size5, 1073741824), View.MeasureSpec.makeMeasureSpec(L, Integer.MIN_VALUE));
                usersSelectActivity.d.measure(View.MeasureSpec.makeMeasureSpec(size5, 1073741824), View.MeasureSpec.makeMeasureSpec(size6 - usersSelectActivity.a.getMeasuredHeight(), 1073741824));
                usersSelectActivity.f.measure(View.MeasureSpec.makeMeasureSpec(size5, 1073741824), View.MeasureSpec.makeMeasureSpec(size6 - usersSelectActivity.a.getMeasuredHeight(), 1073741824));
                usersSelectActivity.e.measure(View.MeasureSpec.makeMeasureSpec(size5, 1073741824), View.MeasureSpec.makeMeasureSpec(size6 - usersSelectActivity.a.getMeasuredHeight(), 1073741824));
                wp4 wp4Var = usersSelectActivity.r;
                if (wp4Var != null) {
                    int i9 = usersSelectActivity.s.width;
                    wp4Var.measure(View.MeasureSpec.makeMeasureSpec(i9, 1073741824), View.MeasureSpec.makeMeasureSpec(i9, 1073741824));
                    return;
                }
                return;
        }
    }
}
