package ai;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.na;
import di.n4;
import org.telegram.messenger.gd;
import org.telegram.messenger.m10;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.r4;
import org.telegram.ui.bn;
import org.telegram.ui.p61;
import org.telegram.ui.t4;
import org.telegram.ui.v71;
public final class i0 extends FrameLayout {
    public final int f1221a;
    public boolean f1222b;
    public final Object f1223c;

    public i0(int i7, Context context, Object obj) {
        super(context);
        this.f1221a = i7;
        this.f1223c = obj;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f1221a) {
            case 0:
                Paint paint = (Paint) this.f1223c;
                super.dispatchDraw(canvas);
                float height = getHeight() / 2.0f;
                if (this.f1222b) {
                    float width = getWidth() - org.telegram.messenger.g0.L(26.0f);
                    canvas.drawLine(width - org.telegram.messenger.g0.L(5.0f), height, width - org.telegram.messenger.g0.L(1.5f), height + org.telegram.messenger.g0.L(3.5f), paint);
                    canvas.drawLine(width - org.telegram.messenger.g0.L(1.5f), org.telegram.messenger.g0.L(3.5f) + height, org.telegram.messenger.g0.L(5.5f) + width, height - org.telegram.messenger.g0.L(4.0f), paint);
                    return;
                }
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j3) {
        int i7;
        switch (this.f1221a) {
            case 3:
                boolean drawChild = super.drawChild(canvas, view, j3);
                v71 v71Var = (v71) this.f1223c;
                if (view == v71Var.f52901u0 && v71.v0(v71Var) != null) {
                    r4 w02 = v71.w0(v71Var);
                    if (v71Var.f52901u0.getVisibility() == 0) {
                        i7 = (int) (v71Var.f52901u0.getTranslationY() + v71Var.f52901u0.getMeasuredHeight());
                    } else {
                        i7 = 0;
                    }
                    ((ActionBarLayout) w02).q(canvas, i7);
                }
                return drawChild;
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.f1221a) {
            case 0:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setCheckable(true);
                accessibilityNodeInfo.setChecked(this.f1222b);
                return;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                return;
        }
    }

    @Override
    public void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        switch (this.f1221a) {
            case 1:
                org.telegram.ui.ActionBar.q0 q0Var = (org.telegram.ui.ActionBar.q0) this.f1223c;
                super.onLayout(z10, i7, i10, i11, i12);
                int i13 = 0;
                if (!gd.f24314a0 && q0Var.h.getVisibility() == 0) {
                    i13 = org.telegram.messenger.g0.L(4.0f) + q0Var.h.getMeasuredWidth();
                }
                if (q0Var.f29966f.getVisibility() == 0) {
                    i13 += q0Var.f29966f.getMeasuredWidth();
                }
                ah.i iVar = q0Var.f29964e;
                iVar.layout(i13, iVar.getTop(), q0Var.f29964e.getMeasuredWidth() + i13, q0Var.f29964e.getBottom());
                return;
            default:
                super.onLayout(z10, i7, i10, i11, i12);
                return;
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        TextView textView;
        float f10;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        switch (this.f1221a) {
            case 1:
                org.telegram.ui.ActionBar.q0 q0Var = (org.telegram.ui.ActionBar.q0) this.f1223c;
                measureChildWithMargins(q0Var.f29981s, i7, 0, i10, 0);
                View view = q0Var.f29988x;
                if (view != null) {
                    measureChildWithMargins(view, i7, 0, i10, 0);
                }
                if (!gd.f24314a0) {
                    if (q0Var.h.getVisibility() == 0) {
                        measureChildWithMargins(q0Var.h, i7, View.MeasureSpec.getSize(i7) / 2, i10, 0);
                        i13 = org.telegram.messenger.g0.L(4.0f) + q0Var.h.getMeasuredWidth();
                    } else {
                        i13 = 0;
                    }
                    int size = View.MeasureSpec.getSize(i7);
                    this.f1222b = true;
                    measureChildWithMargins(q0Var.f29966f, i7, i13, i10, 0);
                    if (q0Var.f29966f.getVisibility() == 0) {
                        i14 = q0Var.f29966f.getMeasuredWidth();
                    } else {
                        i14 = 0;
                    }
                    ah.i iVar = q0Var.f29964e;
                    int i24 = i13 + i14;
                    View view2 = q0Var.f29988x;
                    if (view2 != null) {
                        i15 = view2.getMeasuredWidth();
                    } else {
                        i15 = 0;
                    }
                    measureChildWithMargins(iVar, i7, i24 + i15, i10, 0);
                    this.f1222b = false;
                    setMeasuredDimension(Math.max(q0Var.f29964e.getMeasuredWidth() + i14, size), View.MeasureSpec.getSize(i10));
                    return;
                }
                if (q0Var.h.getVisibility() == 0) {
                    measureChildWithMargins(q0Var.h, i7, View.MeasureSpec.getSize(i7) / 2, i10, 0);
                    i11 = org.telegram.messenger.g0.L(4.0f) + q0Var.h.getMeasuredWidth();
                } else {
                    i11 = 0;
                }
                int size2 = View.MeasureSpec.getSize(i7);
                this.f1222b = true;
                measureChildWithMargins(q0Var.f29966f, i7, i11, i10, 0);
                if (q0Var.f29966f.getVisibility() == 0) {
                    i12 = q0Var.f29966f.getMeasuredWidth();
                } else {
                    i12 = 0;
                }
                measureChildWithMargins(q0Var.f29964e, m10.c(12.0f, size2, 0), i11 + i12, i10, 0);
                this.f1222b = false;
                setMeasuredDimension(Math.max(q0Var.f29964e.getMeasuredWidth() + i12, size2), View.MeasureSpec.getSize(i10));
                return;
            case 2:
                int size3 = View.MeasureSpec.getSize(i7);
                bn bnVar = (bn) this.f1223c;
                if (bnVar.ba()) {
                    size3 -= org.telegram.messenger.g0.L(71.0f);
                    i16 = org.telegram.messenger.g0.L(32.0f);
                } else {
                    i16 = 0;
                }
                TextView textView2 = bnVar.f46120a2;
                if (textView2 != null && textView2.getVisibility() == 0 && (textView = bnVar.f46149c2) != null && textView.getVisibility() == 0) {
                    size3 = m10.z(31.0f, size3, 2);
                }
                this.f1222b = true;
                TextView textView3 = bnVar.f46149c2;
                if (textView3 != null && textView3.getVisibility() == 0) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) bnVar.f46149c2.getLayoutParams();
                    layoutParams.width = size3;
                    TextView textView4 = bnVar.f46120a2;
                    if (textView4 != null && textView4.getVisibility() == 0) {
                        bnVar.f46149c2.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
                        layoutParams.leftMargin = i16 + size3;
                        layoutParams.width -= org.telegram.messenger.g0.L(15.0f);
                    } else {
                        bnVar.f46149c2.setPadding(org.telegram.messenger.g0.L(48.0f), 0, org.telegram.messenger.g0.L(48.0f), 0);
                        layoutParams.leftMargin = i16;
                    }
                }
                TextView textView5 = bnVar.f46120a2;
                if (textView5 != null && textView5.getVisibility() == 0) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) bnVar.f46120a2.getLayoutParams();
                    layoutParams2.width = size3;
                    TextView textView6 = bnVar.f46149c2;
                    if (textView6 != null && textView6.getVisibility() == 0) {
                        bnVar.f46120a2.setPadding(org.telegram.messenger.g0.L(11.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
                    } else {
                        bnVar.f46120a2.setPadding(org.telegram.messenger.g0.L(48.0f), 0, org.telegram.messenger.g0.L(48.0f), 0);
                    }
                    layoutParams2.leftMargin = i16;
                }
                this.f1222b = false;
                super.onMeasure(i7, i10);
                return;
            case 3:
                int size4 = View.MeasureSpec.getSize(i7);
                int size5 = View.MeasureSpec.getSize(i10);
                setMeasuredDimension(size4, size5);
                if (((v71) this.f1223c).f52859e != null) {
                    this.f1222b = true;
                    if (!org.telegram.messenger.g0.Q1()) {
                        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) ((v71) this.f1223c).f52859e.getLayoutParams();
                        layoutParams3.topMargin = org.telegram.messenger.g0.f24220m;
                        ((v71) this.f1223c).f52859e.setLayoutParams(layoutParams3);
                    }
                    if (!org.telegram.messenger.g0.Q1() && org.telegram.messenger.t0.f27013b.getResources().getConfiguration().orientation == 2) {
                        ((v71) this.f1223c).h.setTextSize(1, 18.0f);
                    } else {
                        ((v71) this.f1223c).h.setTextSize(1, 20.0f);
                    }
                    this.f1222b = false;
                }
                measureChildWithMargins(((v71) this.f1223c).f52901u0, i7, 0, i10, 0);
                int measuredHeight = ((v71) this.f1223c).f52901u0.getMeasuredHeight();
                if (((v71) this.f1223c).f52901u0.getVisibility() == 0) {
                    size5 -= measuredHeight;
                }
                FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) ((v71) this.f1223c).f52906w0.getLayoutParams();
                layoutParams4.topMargin = measuredHeight;
                v71 v71Var = (v71) this.f1223c;
                int i25 = 58;
                if (v71Var.f52849b == 2) {
                    p61 p61Var = v71Var.f52906w0;
                    int L = org.telegram.messenger.g0.L(4.0f);
                    v71 v71Var2 = (v71) this.f1223c;
                    if (!v71Var2.M1 && v71Var2.L1 > 0) {
                        i22 = 58;
                    } else {
                        i22 = 0;
                    }
                    int L2 = org.telegram.messenger.g0.L(i22 + 72) - 12;
                    if (((v71) this.f1223c).Z0()) {
                        i23 = org.telegram.messenger.g0.f24221n;
                    } else {
                        i23 = 0;
                    }
                    p61Var.setPadding(0, L, 0, L2 + i23);
                }
                ((v71) this.f1223c).f52906w0.measure(View.MeasureSpec.makeMeasureSpec(size4, 1073741824), View.MeasureSpec.makeMeasureSpec(size5 - layoutParams4.bottomMargin, 1073741824));
                ((FrameLayout.LayoutParams) ((v71) this.f1223c).f52914z0.getLayoutParams()).topMargin = measuredHeight;
                ((v71) this.f1223c).f52914z0.measure(View.MeasureSpec.makeMeasureSpec(size4, 1073741824), View.MeasureSpec.makeMeasureSpec(size5, 1073741824));
                n4 n4Var = ((v71) this.f1223c).S1;
                if (n4Var != null) {
                    ((FrameLayout.LayoutParams) n4Var.getLayoutParams()).topMargin = measuredHeight;
                    ((v71) this.f1223c).S1.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(222.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(76.0f), 1073741824));
                }
                t4 t4Var = ((v71) this.f1223c).E0;
                if (t4Var != null) {
                    int L3 = org.telegram.messenger.g0.L(12.0f);
                    int L4 = org.telegram.messenger.g0.L(12.0f);
                    int L5 = org.telegram.messenger.g0.L(12.0f);
                    int L6 = org.telegram.messenger.g0.L(12.0f);
                    if (((v71) this.f1223c).Z0()) {
                        i20 = org.telegram.messenger.g0.f24221n;
                    } else {
                        i20 = 0;
                    }
                    t4Var.setPadding(L3, L4, L5, L6 + i20);
                    FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) ((v71) this.f1223c).E0.getLayoutParams();
                    v71 v71Var3 = (v71) this.f1223c;
                    if (v71Var3.M1 || v71Var3.L1 <= 0) {
                        i25 = 0;
                    }
                    int L7 = org.telegram.messenger.g0.L(72 + i25);
                    if (((v71) this.f1223c).Z0()) {
                        i21 = org.telegram.messenger.g0.f24221n;
                    } else {
                        i21 = 0;
                    }
                    layoutParams5.height = L7 + i21;
                    measureChildWithMargins(((v71) this.f1223c).E0, i7, 0, i10, 0);
                }
                Drawable drawable = ((v71) this.f1223c).f52893r;
                if (drawable != null) {
                    drawable.getPadding(org.telegram.messenger.g0.Q);
                }
                int i26 = 0;
                while (true) {
                    FrameLayout[] frameLayoutArr = ((v71) this.f1223c).N0;
                    if (i26 < frameLayoutArr.length) {
                        FrameLayout frameLayout = frameLayoutArr[i26];
                        if (frameLayout != null) {
                            FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
                            if (i26 == 0) {
                                if (((v71) this.f1223c).f52849b == 2) {
                                    i19 = 321;
                                } else {
                                    i19 = 273;
                                }
                                f10 = i19;
                            } else {
                                f10 = 316.0f;
                            }
                            layoutParams6.height = org.telegram.messenger.g0.L(f10);
                            if (((v71) this.f1223c).Z0()) {
                                layoutParams6.height += org.telegram.messenger.g0.f24221n;
                            }
                            if (i26 == 0) {
                                layoutParams6.height = org.telegram.messenger.g0.L(12.0f) + org.telegram.messenger.g0.Q.top + layoutParams6.height;
                            }
                            FrameLayout frameLayout2 = ((v71) this.f1223c).N0[i26];
                            if (i26 == 0) {
                                i17 = org.telegram.messenger.g0.L(12.0f) + org.telegram.messenger.g0.Q.top;
                            } else {
                                i17 = 0;
                            }
                            if (((v71) this.f1223c).Z0()) {
                                i18 = org.telegram.messenger.g0.f24221n;
                            } else {
                                i18 = 0;
                            }
                            frameLayout2.setPadding(0, i17, 0, i18);
                            measureChildWithMargins(((v71) this.f1223c).N0[i26], i7, 0, i10, 0);
                        }
                        i26++;
                    } else {
                        return;
                    }
                }
                break;
            default:
                super.onMeasure(i7, i10);
                return;
        }
    }

    @Override
    public void requestLayout() {
        switch (this.f1221a) {
            case 1:
                if (!this.f1222b) {
                    super.requestLayout();
                    return;
                }
                return;
            case 2:
                if (!this.f1222b) {
                    super.requestLayout();
                    return;
                }
                return;
            case 3:
                if (!this.f1222b) {
                    super.requestLayout();
                    return;
                }
                return;
            default:
                super.requestLayout();
                return;
        }
    }

    @Override
    public void setAlpha(float f10) {
        switch (this.f1221a) {
            case 1:
                super.setAlpha(f10);
                org.telegram.ui.ActionBar.q0 q0Var = (org.telegram.ui.ActionBar.q0) this.f1223c;
                org.telegram.ui.ActionBar.f0 f0Var = q0Var.f29981s;
                if (f0Var != null && f0Var.getTag() != null) {
                    q0Var.f29981s.setAlpha(f10);
                    q0Var.f29981s.setScaleX(f10);
                    q0Var.f29981s.setScaleY(f10);
                    return;
                }
                return;
            default:
                super.setAlpha(f10);
                return;
        }
    }

    @Override
    public void setVisibility(int i7) {
        switch (this.f1221a) {
            case 1:
                super.setVisibility(i7);
                org.telegram.ui.ActionBar.q0 q0Var = (org.telegram.ui.ActionBar.q0) this.f1223c;
                org.telegram.ui.ActionBar.f0 f0Var = q0Var.f29981s;
                if (f0Var != null) {
                    f0Var.setVisibility(i7);
                }
                View view = q0Var.f29988x;
                if (view != null) {
                    view.setVisibility(i7);
                }
                FrameLayout frameLayout = q0Var.f29957a;
                if (frameLayout != null) {
                    frameLayout.setVisibility(i7);
                    return;
                }
                return;
            default:
                super.setVisibility(i7);
                return;
        }
    }

    public i0(Context context, CharSequence charSequence, CharSequence charSequence2, int i7, boolean z10) {
        super(context);
        this.f1221a = 0;
        Paint paint = new Paint(1);
        this.f1223c = paint;
        this.f1222b = z10;
        setWillNotDraw(false);
        TextView textView = new TextView(context);
        textView.setText(charSequence);
        textView.setTextSize(1, 16.0f);
        textView.setTextColor(i7);
        textView.setSingleLine(true);
        textView.setGravity(16);
        if (charSequence2 != null) {
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            linearLayout.setGravity(16);
            linearLayout.addView(textView, na.o(-2, -2));
            TextView textView2 = new TextView(context);
            SpannableStringBuilder append = new SpannableStringBuilder(charSequence2).append((CharSequence) " >");
            append.setSpan(new j0(), append.length() - 1, append.length(), 33);
            textView2.setText(append);
            textView2.setTextSize(1, 13.0f);
            textView2.setTextColor(n6.r1(0.55f, i7));
            textView2.setSingleLine(true);
            linearLayout.addView(textView2, na.k(0.0f, 1.0f, 0.0f, 0.0f, -2, -2));
            addView(linearLayout, na.d(-2, -1.0f, 3, 18.0f, 0.0f, 44.0f, 0.0f));
        } else {
            addView(textView, na.d(-2, -1.0f, 3, 18.0f, 0.0f, 44.0f, 0.0f));
        }
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.N(1.75f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setColor(i7);
    }
}
