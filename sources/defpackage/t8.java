package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.UsersSelectActivity;
public final class t8 extends ViewGroup {
    public final byte a;
    public final e b;

    public t8(e eVar, Context context, byte b) {
        super(context);
        this.a = b;
        this.b = eVar;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        wk5 wk5Var;
        switch (this.a) {
            case 2:
                boolean drawChild = super.drawChild(canvas, view, j);
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.b;
                if (view == usersSelectActivity.d || view == usersSelectActivity.f) {
                    wk5Var = ((e) usersSelectActivity).parentLayout;
                    ((ActionBarLayout) wk5Var).o(canvas, usersSelectActivity.a.getMeasuredHeight());
                }
                return drawChild;
            default:
                return super.drawChild(canvas, view, j);
        }
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        a aVar;
        float f;
        float f2;
        a aVar2;
        a aVar3;
        a aVar4;
        a aVar5;
        int measuredWidth;
        byte b = this.a;
        e eVar = this.b;
        switch (b) {
            case 0:
                v8 v8Var = (v8) eVar;
                aVar = ((e) v8Var).actionBar;
                if (aVar != null) {
                    aVar2 = ((e) v8Var).actionBar;
                    aVar3 = ((e) v8Var).actionBar;
                    aVar2.layout(0, 0, i3, aVar3.getMeasuredHeight());
                }
                int i5 = i3 - i;
                int i6 = i4 - i2;
                byte b2 = v8Var.w;
                if (b2 != 0) {
                    if (b2 != 3) {
                        if (b2 != 5) {
                            if (b2 == 6) {
                                e29 e29Var = v8Var.a;
                                if (i3 > i4) {
                                    int measuredHeight = (i6 - e29Var.getMeasuredHeight()) / 2;
                                    float f3 = i5;
                                    int measuredWidth2 = ((int) ((0.5f * f3) - v8Var.a.getMeasuredWidth())) / 2;
                                    e29 e29Var2 = v8Var.a;
                                    e29Var2.layout(measuredWidth2, measuredHeight, e29Var2.getMeasuredWidth() + measuredWidth2, v8Var.a.getMeasuredHeight() + measuredHeight);
                                    float f4 = 0.4f * f3;
                                    int i7 = (int) f4;
                                    float f5 = i6;
                                    int i8 = (int) (0.14f * f5);
                                    TextView textView = v8Var.e;
                                    textView.layout(i7, i8, textView.getMeasuredWidth() + i7, v8Var.e.getMeasuredHeight() + i8);
                                    int i9 = (int) (0.31f * f5);
                                    TextView textView2 = v8Var.f;
                                    textView2.layout(i7, i9, textView2.getMeasuredWidth() + i7, v8Var.f.getMeasuredHeight() + i9);
                                    int z2 = (int) bp1.z(f3 * 0.6f, v8Var.c.getMeasuredWidth(), 2.0f, f4);
                                    int i10 = (int) (f5 * 0.78f);
                                    u8 u8Var = v8Var.c;
                                    u8Var.layout(z2, i10, u8Var.getMeasuredWidth() + z2, v8Var.c.getMeasuredHeight() + i10);
                                    return;
                                }
                                int i11 = (int) (i6 * 0.3f);
                                int measuredWidth3 = (i5 - e29Var.getMeasuredWidth()) / 2;
                                e29 e29Var3 = v8Var.a;
                                e29Var3.layout(measuredWidth3, i11, e29Var3.getMeasuredWidth() + measuredWidth3, v8Var.a.getMeasuredHeight() + i11);
                                int w = uh9.w(24.0f, v8Var.a.getMeasuredHeight(), i11);
                                TextView textView3 = v8Var.e;
                                textView3.layout(0, w, textView3.getMeasuredWidth(), v8Var.e.getMeasuredHeight() + w);
                                int textSize = (int) (v8Var.e.getTextSize() + hl.L(16.0f) + w);
                                TextView textView4 = v8Var.f;
                                textView4.layout(0, textSize, textView4.getMeasuredWidth(), v8Var.f.getMeasuredHeight() + textSize);
                                int measuredWidth4 = (i5 - v8Var.c.getMeasuredWidth()) / 2;
                                int measuredHeight2 = (i6 - v8Var.c.getMeasuredHeight()) - hl.L(48.0f);
                                u8 u8Var2 = v8Var.c;
                                u8Var2.layout(measuredWidth4, measuredHeight2, u8Var2.getMeasuredWidth() + measuredWidth4, v8Var.c.getMeasuredHeight() + measuredHeight2);
                                return;
                            }
                            return;
                        } else if (i3 > i4) {
                            int measuredHeight3 = (i6 - v8Var.a.getMeasuredHeight()) / 2;
                            e29 e29Var4 = v8Var.a;
                            e29Var4.layout(0, measuredHeight3, e29Var4.getMeasuredWidth(), v8Var.a.getMeasuredHeight() + measuredHeight3);
                            float f6 = i5;
                            float f7 = 0.4f * f6;
                            int i12 = (int) f7;
                            float f8 = i6;
                            int i13 = (int) (0.08f * f8);
                            TextView textView5 = v8Var.e;
                            textView5.layout(i12, i13, textView5.getMeasuredWidth() + i12, v8Var.e.getMeasuredHeight() + i13);
                            float f9 = f6 * 0.6f;
                            int z3 = (int) bp1.z(f9, v8Var.h.getMeasuredWidth(), 2.0f, f7);
                            int i14 = (int) (0.25f * f8);
                            LinearLayout linearLayout = v8Var.h;
                            linearLayout.layout(z3, i14, linearLayout.getMeasuredWidth() + z3, v8Var.h.getMeasuredHeight() + i14);
                            int z4 = (int) bp1.z(f9, v8Var.c.getMeasuredWidth(), 2.0f, f7);
                            int i15 = (int) (f8 * 0.78f);
                            u8 u8Var3 = v8Var.c;
                            u8Var3.layout(z4, i15, u8Var3.getMeasuredWidth() + z4, v8Var.c.getMeasuredHeight() + i15);
                            return;
                        } else {
                            int i16 = hl.q.y;
                            e29 e29Var5 = v8Var.a;
                            if (i16 < 1800) {
                                f = i6;
                                int i17 = (int) (0.06f * f);
                                e29Var5.layout(0, i17, e29Var5.getMeasuredWidth(), v8Var.a.getMeasuredHeight() + i17);
                                int i18 = (int) (0.463f * f);
                                TextView textView6 = v8Var.e;
                                textView6.layout(0, i18, textView6.getMeasuredWidth(), v8Var.e.getMeasuredHeight() + i18);
                                f2 = 0.543f;
                            } else {
                                f = i6;
                                int i19 = (int) (0.148f * f);
                                e29Var5.layout(0, i19, e29Var5.getMeasuredWidth(), v8Var.a.getMeasuredHeight() + i19);
                                int i20 = (int) (0.551f * f);
                                TextView textView7 = v8Var.e;
                                textView7.layout(0, i20, textView7.getMeasuredWidth(), v8Var.e.getMeasuredHeight() + i20);
                                f2 = 0.631f;
                            }
                            int i21 = (int) (f * f2);
                            int measuredWidth5 = (getMeasuredWidth() - v8Var.h.getMeasuredWidth()) / 2;
                            LinearLayout linearLayout2 = v8Var.h;
                            linearLayout2.layout(measuredWidth5, i21, linearLayout2.getMeasuredWidth() + measuredWidth5, v8Var.h.getMeasuredHeight() + i21);
                            int measuredWidth6 = (i5 - v8Var.c.getMeasuredWidth()) / 2;
                            int i22 = (int) (i6 * 0.853f);
                            u8 u8Var4 = v8Var.c;
                            u8Var4.layout(measuredWidth6, i22, u8Var4.getMeasuredWidth() + measuredWidth6, v8Var.c.getMeasuredHeight() + i22);
                            return;
                        }
                    }
                    e29 e29Var6 = v8Var.a;
                    if (i3 > i4) {
                        float f10 = i6;
                        int measuredHeight4 = ((int) ((0.95f * f10) - e29Var6.getMeasuredHeight())) / 2;
                        int width = (int) ((getWidth() * 0.35f) - v8Var.a.getMeasuredWidth());
                        e29 e29Var7 = v8Var.a;
                        e29Var7.layout(width, measuredHeight4, e29Var7.getMeasuredWidth() + width, v8Var.a.getMeasuredHeight() + measuredHeight4);
                        float f11 = i5;
                        float f12 = 0.4f * f11;
                        int i23 = (int) f12;
                        int i24 = (int) (0.12f * f10);
                        TextView textView8 = v8Var.e;
                        textView8.layout(i23, i24, textView8.getMeasuredWidth() + i23, v8Var.e.getMeasuredHeight() + i24);
                        int i25 = (int) (0.24f * f10);
                        TextView textView9 = v8Var.f;
                        textView9.layout(i23, i25, textView9.getMeasuredWidth() + i23, v8Var.f.getMeasuredHeight() + i25);
                        float f13 = f11 * 0.6f;
                        int z5 = (int) bp1.z(f13, v8Var.c.getMeasuredWidth(), 2.0f, f12);
                        int i26 = (int) (f10 * 0.8f);
                        u8 u8Var5 = v8Var.c;
                        u8Var5.layout(z5, i26, u8Var5.getMeasuredWidth() + z5, v8Var.c.getMeasuredHeight() + i26);
                        int z6 = (int) bp1.z(f13, v8Var.d.getMeasuredWidth(), 2.0f, f12);
                        int B = ik8.B(16.0f, v8Var.d.getMeasuredHeight(), i26);
                        TextView textView10 = v8Var.d;
                        textView10.layout(z6, B, textView10.getMeasuredWidth() + z6, v8Var.d.getMeasuredHeight() + B);
                        return;
                    }
                    int i27 = (int) (i6 * 0.3f);
                    int measuredWidth7 = (i5 - e29Var6.getMeasuredWidth()) / 2;
                    e29 e29Var8 = v8Var.a;
                    e29Var8.layout(measuredWidth7, i27, e29Var8.getMeasuredWidth() + measuredWidth7, v8Var.a.getMeasuredHeight() + i27);
                    int w2 = uh9.w(24.0f, v8Var.a.getMeasuredHeight(), i27);
                    TextView textView11 = v8Var.e;
                    textView11.layout(0, w2, textView11.getMeasuredWidth(), v8Var.e.getMeasuredHeight() + w2);
                    int textSize2 = (int) (v8Var.e.getTextSize() + hl.L(16.0f) + w2);
                    TextView textView12 = v8Var.f;
                    textView12.layout(0, textSize2, textView12.getMeasuredWidth(), v8Var.f.getMeasuredHeight() + textSize2);
                    int measuredWidth8 = (i5 - v8Var.c.getMeasuredWidth()) / 2;
                    int measuredHeight5 = (i6 - v8Var.c.getMeasuredHeight()) - hl.L(48.0f);
                    u8 u8Var6 = v8Var.c;
                    u8Var6.layout(measuredWidth8, measuredHeight5, u8Var6.getMeasuredWidth() + measuredWidth8, v8Var.c.getMeasuredHeight() + measuredHeight5);
                    int measuredWidth9 = (i5 - v8Var.d.getMeasuredWidth()) / 2;
                    int B2 = ik8.B(32.0f, v8Var.d.getMeasuredHeight(), measuredHeight5);
                    TextView textView13 = v8Var.d;
                    textView13.layout(measuredWidth9, B2, textView13.getMeasuredWidth() + measuredWidth9, v8Var.d.getMeasuredHeight() + B2);
                    return;
                }
                e29 e29Var9 = v8Var.a;
                if (i3 > i4) {
                    int measuredHeight6 = (i6 - e29Var9.getMeasuredHeight()) / 2;
                    e29 e29Var10 = v8Var.a;
                    e29Var10.layout(0, measuredHeight6, e29Var10.getMeasuredWidth(), v8Var.a.getMeasuredHeight() + measuredHeight6);
                    float f14 = i5;
                    float f15 = 0.4f * f14;
                    int i28 = (int) f15;
                    float f16 = i6;
                    int i29 = (int) (0.22f * f16);
                    TextView textView14 = v8Var.e;
                    textView14.layout(i28, i29, textView14.getMeasuredWidth() + i28, v8Var.e.getMeasuredHeight() + i29);
                    int i30 = (int) (0.39f * f16);
                    TextView textView15 = v8Var.f;
                    textView15.layout(i28, i30, textView15.getMeasuredWidth() + i28, v8Var.f.getMeasuredHeight() + i30);
                    int z7 = (int) bp1.z(f14 * 0.6f, v8Var.c.getMeasuredWidth(), 2.0f, f15);
                    int i31 = (int) (f16 * 0.69f);
                    u8 u8Var7 = v8Var.c;
                    u8Var7.layout(z7, i31, u8Var7.getMeasuredWidth() + z7, v8Var.c.getMeasuredHeight() + i31);
                    return;
                }
                float f17 = i6;
                int i32 = (int) (0.188f * f17);
                e29Var9.layout(0, i32, e29Var9.getMeasuredWidth(), v8Var.a.getMeasuredHeight() + i32);
                int i33 = (int) (0.651f * f17);
                TextView textView16 = v8Var.e;
                textView16.layout(0, i33, textView16.getMeasuredWidth(), v8Var.e.getMeasuredHeight() + i33);
                int i34 = (int) (0.731f * f17);
                TextView textView17 = v8Var.f;
                textView17.layout(0, i34, textView17.getMeasuredWidth(), v8Var.f.getMeasuredHeight() + i34);
                int measuredWidth10 = (i5 - v8Var.c.getMeasuredWidth()) / 2;
                int i35 = (int) (f17 * 0.853f);
                u8 u8Var8 = v8Var.c;
                u8Var8.layout(measuredWidth10, i35, u8Var8.getMeasuredWidth() + measuredWidth10, v8Var.c.getMeasuredHeight() + i35);
                return;
            case 1:
                o7c o7cVar = (o7c) eVar;
                aVar4 = ((e) o7cVar).actionBar;
                aVar5 = ((e) o7cVar).actionBar;
                aVar4.layout(0, 0, i3, aVar5.getMeasuredHeight());
                int i36 = i3 - i;
                int i37 = i4 - i2;
                e29 e29Var11 = o7cVar.a;
                if (i3 > i4) {
                    int measuredHeight7 = (i37 - e29Var11.getMeasuredHeight()) / 2;
                    e29 e29Var12 = o7cVar.a;
                    e29Var12.layout(0, measuredHeight7, e29Var12.getMeasuredWidth(), o7cVar.a.getMeasuredHeight() + measuredHeight7);
                    float f18 = i36;
                    float f19 = 0.4f * f18;
                    int i38 = (int) f19;
                    float f20 = i37;
                    int i39 = (int) (0.22f * f20);
                    TextView textView18 = o7cVar.c;
                    textView18.layout(i38, i39, textView18.getMeasuredWidth() + i38, o7cVar.c.getMeasuredHeight() + i39);
                    int i40 = (int) (0.39f * f20);
                    tpa tpaVar = o7cVar.d;
                    tpaVar.layout(i38, i40, tpaVar.getMeasuredWidth() + i38, o7cVar.d.getMeasuredHeight() + i40);
                    int z8 = (int) bp1.z(f18 * 0.6f, o7cVar.b.getMeasuredWidth(), 2.0f, f19);
                    int i41 = (int) (f20 * 0.64f);
                    TextView textView19 = o7cVar.b;
                    textView19.layout(z8, i41, textView19.getMeasuredWidth() + z8, o7cVar.b.getMeasuredHeight() + i41);
                    return;
                }
                int i42 = (int) (i37 * 0.3f);
                int measuredWidth11 = (i36 - e29Var11.getMeasuredWidth()) / 2;
                e29 e29Var13 = o7cVar.a;
                e29Var13.layout(measuredWidth11, i42, e29Var13.getMeasuredWidth() + measuredWidth11, o7cVar.a.getMeasuredHeight() + i42);
                int w3 = uh9.w(16.0f, o7cVar.a.getMeasuredHeight(), i42);
                TextView textView20 = o7cVar.c;
                textView20.layout(0, w3, textView20.getMeasuredWidth(), o7cVar.c.getMeasuredHeight() + w3);
                int w4 = uh9.w(12.0f, o7cVar.c.getMeasuredHeight(), w3);
                tpa tpaVar2 = o7cVar.d;
                tpaVar2.layout(0, w4, tpaVar2.getMeasuredWidth(), o7cVar.d.getMeasuredHeight() + w4);
                int measuredWidth12 = (i36 - o7cVar.b.getMeasuredWidth()) / 2;
                int measuredHeight8 = (i37 - o7cVar.b.getMeasuredHeight()) - hl.L(48.0f);
                TextView textView21 = o7cVar.b;
                textView21.layout(measuredWidth12, measuredHeight8, textView21.getMeasuredWidth() + measuredWidth12, o7cVar.b.getMeasuredHeight() + measuredHeight8);
                return;
            default:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) eVar;
                yc ycVar = usersSelectActivity.a;
                ycVar.layout(0, 0, ycVar.getMeasuredWidth(), usersSelectActivity.a.getMeasuredHeight());
                usersSelectActivity.d.layout(0, usersSelectActivity.a.getMeasuredHeight(), usersSelectActivity.d.getMeasuredWidth(), usersSelectActivity.d.getMeasuredHeight() + usersSelectActivity.a.getMeasuredHeight());
                usersSelectActivity.f.layout(0, usersSelectActivity.a.getMeasuredHeight(), usersSelectActivity.f.getMeasuredWidth(), usersSelectActivity.f.getMeasuredHeight() + usersSelectActivity.a.getMeasuredHeight());
                usersSelectActivity.e.layout(0, usersSelectActivity.a.getMeasuredHeight(), usersSelectActivity.f.getMeasuredWidth(), usersSelectActivity.e.getMeasuredHeight() + usersSelectActivity.a.getMeasuredHeight());
                zp4 zp4Var = usersSelectActivity.r;
                if (zp4Var != null) {
                    boolean z9 = ob6.a0;
                    FrameLayout.LayoutParams layoutParams = usersSelectActivity.s;
                    if (z9) {
                        measuredWidth = layoutParams.leftMargin;
                    } else {
                        measuredWidth = ((i3 - i) - layoutParams.rightMargin) - zp4Var.getMeasuredWidth();
                    }
                    int measuredHeight9 = ((i4 - i2) - usersSelectActivity.s.bottomMargin) - usersSelectActivity.r.getMeasuredHeight();
                    zp4 zp4Var2 = usersSelectActivity.r;
                    zp4Var2.layout(measuredWidth, measuredHeight9, zp4Var2.getMeasuredWidth() + measuredWidth, usersSelectActivity.r.getMeasuredHeight() + measuredHeight9);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        a aVar;
        a aVar2;
        a aVar3;
        int i3;
        int L;
        byte b = this.a;
        e eVar = this.b;
        switch (b) {
            case 0:
                int size = View.MeasureSpec.getSize(i);
                int size2 = View.MeasureSpec.getSize(i2);
                v8 v8Var = (v8) eVar;
                byte b2 = v8Var.w;
                aVar = ((e) v8Var).actionBar;
                if (aVar != null) {
                    aVar2 = ((e) v8Var).actionBar;
                    aVar2.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), i2);
                }
                if (b2 != 0) {
                    if (b2 != 3) {
                        if (b2 != 5) {
                            if (b2 == 6) {
                                e29 e29Var = v8Var.a;
                                if (b2 == 6) {
                                    e29Var.measure(View.MeasureSpec.makeMeasureSpec(hl.L(140.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(hl.L(140.0f), 1073741824));
                                } else {
                                    e29Var.measure(View.MeasureSpec.makeMeasureSpec(hl.L(100.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(hl.L(100.0f), 1073741824));
                                }
                                TextView textView = v8Var.e;
                                if (size > size2) {
                                    int i4 = (int) (size * 0.6f);
                                    textView.measure(View.MeasureSpec.makeMeasureSpec(i4, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                                    v8Var.f.measure(View.MeasureSpec.makeMeasureSpec(i4, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                                    v8Var.c.measure(View.MeasureSpec.makeMeasureSpec(i4, 1073741824), View.MeasureSpec.makeMeasureSpec(hl.L(48.0f), 1073741824));
                                } else {
                                    textView.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                                    v8Var.f.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                                    u8 u8Var = v8Var.c;
                                    if (b2 == 6) {
                                        u8Var.measure(ik8.f(48.0f, size, 1073741824), View.MeasureSpec.makeMeasureSpec(hl.L(48.0f), 1073741824));
                                    } else {
                                        u8Var.measure(ik8.f(72.0f, size, 1073741824), View.MeasureSpec.makeMeasureSpec(hl.L(48.0f), 1073741824));
                                    }
                                }
                            }
                        } else {
                            e29 e29Var2 = v8Var.a;
                            if (size > size2) {
                                float f = size;
                                e29Var2.measure(View.MeasureSpec.makeMeasureSpec((int) (0.45f * f), 1073741824), View.MeasureSpec.makeMeasureSpec((int) (size2 * 0.68f), 1073741824));
                                int i5 = (int) (f * 0.6f);
                                v8Var.e.measure(View.MeasureSpec.makeMeasureSpec(i5, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                                v8Var.h.measure(View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, 0));
                                v8Var.c.measure(View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(hl.L(48.0f), 1073741824));
                            } else {
                                e29Var2.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec((int) (size2 * 0.399f), 1073741824));
                                v8Var.e.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                                v8Var.h.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, 0));
                                v8Var.c.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(hl.L(48.0f), 1073741824));
                            }
                        }
                    } else {
                        v8Var.a.measure(View.MeasureSpec.makeMeasureSpec(hl.L(150.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(hl.L(150.0f), 1073741824));
                        if (size > size2) {
                            float f2 = size;
                            v8Var.d.measure(View.MeasureSpec.makeMeasureSpec((int) (0.45f * f2), 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            int i6 = (int) (f2 * 0.6f);
                            v8Var.e.measure(View.MeasureSpec.makeMeasureSpec(i6, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            v8Var.f.measure(View.MeasureSpec.makeMeasureSpec(i6, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            v8Var.c.measure(View.MeasureSpec.makeMeasureSpec(i6, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(hl.L(48.0f), 1073741824));
                        } else {
                            v8Var.e.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            v8Var.f.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            v8Var.d.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            v8Var.c.measure(ik8.f(48.0f, size, 1073741824), View.MeasureSpec.makeMeasureSpec(hl.L(48.0f), 1073741824));
                        }
                    }
                } else {
                    e29 e29Var3 = v8Var.a;
                    if (size > size2) {
                        float f3 = size;
                        e29Var3.measure(View.MeasureSpec.makeMeasureSpec((int) (0.45f * f3), 1073741824), View.MeasureSpec.makeMeasureSpec((int) (size2 * 0.68f), 1073741824));
                        int i7 = (int) (f3 * 0.6f);
                        v8Var.e.measure(View.MeasureSpec.makeMeasureSpec(i7, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                        v8Var.f.measure(View.MeasureSpec.makeMeasureSpec(i7, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                        v8Var.c.measure(View.MeasureSpec.makeMeasureSpec(i7, 1073741824), View.MeasureSpec.makeMeasureSpec(hl.L(48.0f), 1073741824));
                    } else {
                        e29Var3.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec((int) (size2 * 0.399f), 1073741824));
                        v8Var.e.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                        v8Var.f.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                        v8Var.c.measure(ik8.f(72.0f, size, 1073741824), View.MeasureSpec.makeMeasureSpec(hl.L(48.0f), 1073741824));
                    }
                }
                setMeasuredDimension(size, size2);
                return;
            case 1:
                int size3 = View.MeasureSpec.getSize(i);
                int size4 = View.MeasureSpec.getSize(i2);
                o7c o7cVar = (o7c) eVar;
                aVar3 = ((e) o7cVar).actionBar;
                aVar3.measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), i2);
                if (size3 > size4) {
                    float f4 = size3;
                    o7cVar.a.measure(View.MeasureSpec.makeMeasureSpec((int) (0.45f * f4), 1073741824), View.MeasureSpec.makeMeasureSpec((int) (size4 * 0.68f), 1073741824));
                    int i8 = (int) (f4 * 0.6f);
                    o7cVar.c.measure(View.MeasureSpec.makeMeasureSpec(i8, 1073741824), View.MeasureSpec.makeMeasureSpec(size4, 0));
                    o7cVar.d.measure(View.MeasureSpec.makeMeasureSpec(i8, 1073741824), View.MeasureSpec.makeMeasureSpec(size4, 0));
                    o7cVar.e.measure(View.MeasureSpec.makeMeasureSpec(i8, 1073741824), View.MeasureSpec.makeMeasureSpec(size4, 0));
                    o7cVar.b.measure(View.MeasureSpec.makeMeasureSpec(i8, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(hl.L(42.0f), 1073741824));
                } else {
                    if (o7cVar.P == 7) {
                        i3 = 160;
                    } else {
                        i3 = 140;
                    }
                    float f5 = i3;
                    o7cVar.a.measure(View.MeasureSpec.makeMeasureSpec(hl.L(f5), 1073741824), View.MeasureSpec.makeMeasureSpec(hl.L(f5), 1073741824));
                    o7cVar.c.measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), View.MeasureSpec.makeMeasureSpec(size4, 0));
                    o7cVar.d.measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), View.MeasureSpec.makeMeasureSpec(size4, 0));
                    o7cVar.e.measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), View.MeasureSpec.makeMeasureSpec(size4, 0));
                    o7cVar.b.measure(ik8.f(48.0f, size3, 1073741824), View.MeasureSpec.makeMeasureSpec(hl.L(50.0f), 1073741824));
                }
                setMeasuredDimension(size3, size4);
                return;
            default:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) eVar;
                int size5 = View.MeasureSpec.getSize(i);
                int size6 = View.MeasureSpec.getSize(i2);
                setMeasuredDimension(size5, size6);
                if (!hl.O1() && size6 <= size5) {
                    L = hl.L(56.0f);
                } else {
                    L = hl.L(144.0f);
                }
                usersSelectActivity.a.measure(View.MeasureSpec.makeMeasureSpec(size5, 1073741824), View.MeasureSpec.makeMeasureSpec(L, Integer.MIN_VALUE));
                usersSelectActivity.d.measure(View.MeasureSpec.makeMeasureSpec(size5, 1073741824), View.MeasureSpec.makeMeasureSpec(size6 - usersSelectActivity.a.getMeasuredHeight(), 1073741824));
                usersSelectActivity.f.measure(View.MeasureSpec.makeMeasureSpec(size5, 1073741824), View.MeasureSpec.makeMeasureSpec(size6 - usersSelectActivity.a.getMeasuredHeight(), 1073741824));
                usersSelectActivity.e.measure(View.MeasureSpec.makeMeasureSpec(size5, 1073741824), View.MeasureSpec.makeMeasureSpec(size6 - usersSelectActivity.a.getMeasuredHeight(), 1073741824));
                zp4 zp4Var = usersSelectActivity.r;
                if (zp4Var != null) {
                    int i9 = usersSelectActivity.s.width;
                    zp4Var.measure(View.MeasureSpec.makeMeasureSpec(i9, 1073741824), View.MeasureSpec.makeMeasureSpec(i9, 1073741824));
                    return;
                }
                return;
        }
    }
}
