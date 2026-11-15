package ai;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import c8.ja;
import di.k4;
import org.telegram.messenger.hd;
import org.telegram.messenger.i20;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.o4;
import org.telegram.ui.an;
import org.telegram.ui.n61;
import org.telegram.ui.t4;
import org.telegram.ui.t71;
public final class l0 extends FrameLayout {
    public final int f1315a;
    public boolean f1316b;
    public final Object f1317c;

    public l0(int i7, Context context, Object obj) {
        super(context);
        this.f1315a = i7;
        this.f1317c = obj;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f1315a) {
            case 0:
                Paint paint = (Paint) this.f1317c;
                super.dispatchDraw(canvas);
                if (this.f1316b) {
                    float height = getHeight() / 2.0f;
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
        switch (this.f1315a) {
            case 3:
                boolean drawChild = super.drawChild(canvas, view, j3);
                t71 t71Var = (t71) this.f1317c;
                if (view == t71Var.f51465u0 && t71.v0(t71Var) != null) {
                    o4 w02 = t71.w0(t71Var);
                    if (t71Var.f51465u0.getVisibility() == 0) {
                        i7 = (int) (t71Var.f51465u0.getTranslationY() + t71Var.f51465u0.getMeasuredHeight());
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
    public void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        switch (this.f1315a) {
            case 1:
                org.telegram.ui.ActionBar.q0 q0Var = (org.telegram.ui.ActionBar.q0) this.f1317c;
                super.onLayout(z10, i7, i10, i11, i12);
                int i13 = 0;
                if (!hd.f24104a0 && q0Var.h.getVisibility() == 0) {
                    i13 = org.telegram.messenger.g0.L(4.0f) + q0Var.h.getMeasuredWidth();
                }
                if (q0Var.f29504f.getVisibility() == 0) {
                    i13 += q0Var.f29504f.getMeasuredWidth();
                }
                ah.i iVar = q0Var.f29502e;
                iVar.layout(i13, iVar.getTop(), q0Var.f29502e.getMeasuredWidth() + i13, q0Var.f29502e.getBottom());
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
        switch (this.f1315a) {
            case 1:
                org.telegram.ui.ActionBar.q0 q0Var = (org.telegram.ui.ActionBar.q0) this.f1317c;
                measureChildWithMargins(q0Var.f29519s, i7, 0, i10, 0);
                View view = q0Var.f29526x;
                if (view != null) {
                    measureChildWithMargins(view, i7, 0, i10, 0);
                }
                if (!hd.f24104a0) {
                    if (q0Var.h.getVisibility() == 0) {
                        measureChildWithMargins(q0Var.h, i7, View.MeasureSpec.getSize(i7) / 2, i10, 0);
                        i13 = org.telegram.messenger.g0.L(4.0f) + q0Var.h.getMeasuredWidth();
                    } else {
                        i13 = 0;
                    }
                    int size = View.MeasureSpec.getSize(i7);
                    this.f1316b = true;
                    measureChildWithMargins(q0Var.f29504f, i7, i13, i10, 0);
                    if (q0Var.f29504f.getVisibility() == 0) {
                        i14 = q0Var.f29504f.getMeasuredWidth();
                    } else {
                        i14 = 0;
                    }
                    ah.i iVar = q0Var.f29502e;
                    int i24 = i13 + i14;
                    View view2 = q0Var.f29526x;
                    if (view2 != null) {
                        i15 = view2.getMeasuredWidth();
                    } else {
                        i15 = 0;
                    }
                    measureChildWithMargins(iVar, i7, i24 + i15, i10, 0);
                    this.f1316b = false;
                    setMeasuredDimension(Math.max(q0Var.f29502e.getMeasuredWidth() + i14, size), View.MeasureSpec.getSize(i10));
                    return;
                }
                if (q0Var.h.getVisibility() == 0) {
                    measureChildWithMargins(q0Var.h, i7, View.MeasureSpec.getSize(i7) / 2, i10, 0);
                    i11 = org.telegram.messenger.g0.L(4.0f) + q0Var.h.getMeasuredWidth();
                } else {
                    i11 = 0;
                }
                int size2 = View.MeasureSpec.getSize(i7);
                this.f1316b = true;
                measureChildWithMargins(q0Var.f29504f, i7, i11, i10, 0);
                if (q0Var.f29504f.getVisibility() == 0) {
                    i12 = q0Var.f29504f.getMeasuredWidth();
                } else {
                    i12 = 0;
                }
                measureChildWithMargins(q0Var.f29502e, i20.c(12.0f, size2, 0), i11 + i12, i10, 0);
                this.f1316b = false;
                setMeasuredDimension(Math.max(q0Var.f29502e.getMeasuredWidth() + i12, size2), View.MeasureSpec.getSize(i10));
                return;
            case 2:
                int size3 = View.MeasureSpec.getSize(i7);
                an anVar = (an) this.f1317c;
                if (anVar.ba()) {
                    size3 -= org.telegram.messenger.g0.L(71.0f);
                    i16 = org.telegram.messenger.g0.L(32.0f);
                } else {
                    i16 = 0;
                }
                TextView textView2 = anVar.f45119a2;
                if (textView2 != null && textView2.getVisibility() == 0 && (textView = anVar.f45148c2) != null && textView.getVisibility() == 0) {
                    size3 = i20.y(31.0f, size3, 2);
                }
                this.f1316b = true;
                TextView textView3 = anVar.f45148c2;
                if (textView3 != null && textView3.getVisibility() == 0) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) anVar.f45148c2.getLayoutParams();
                    layoutParams.width = size3;
                    TextView textView4 = anVar.f45119a2;
                    if (textView4 != null && textView4.getVisibility() == 0) {
                        anVar.f45148c2.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
                        layoutParams.leftMargin = i16 + size3;
                        layoutParams.width -= org.telegram.messenger.g0.L(15.0f);
                    } else {
                        anVar.f45148c2.setPadding(org.telegram.messenger.g0.L(48.0f), 0, org.telegram.messenger.g0.L(48.0f), 0);
                        layoutParams.leftMargin = i16;
                    }
                }
                TextView textView5 = anVar.f45119a2;
                if (textView5 != null && textView5.getVisibility() == 0) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) anVar.f45119a2.getLayoutParams();
                    layoutParams2.width = size3;
                    TextView textView6 = anVar.f45148c2;
                    if (textView6 != null && textView6.getVisibility() == 0) {
                        anVar.f45119a2.setPadding(org.telegram.messenger.g0.L(11.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
                    } else {
                        anVar.f45119a2.setPadding(org.telegram.messenger.g0.L(48.0f), 0, org.telegram.messenger.g0.L(48.0f), 0);
                    }
                    layoutParams2.leftMargin = i16;
                }
                this.f1316b = false;
                super.onMeasure(i7, i10);
                return;
            case 3:
                int size4 = View.MeasureSpec.getSize(i7);
                int size5 = View.MeasureSpec.getSize(i10);
                setMeasuredDimension(size4, size5);
                if (((t71) this.f1317c).f51423e != null) {
                    this.f1316b = true;
                    if (!org.telegram.messenger.g0.Q1()) {
                        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) ((t71) this.f1317c).f51423e.getLayoutParams();
                        layoutParams3.topMargin = org.telegram.messenger.g0.f23605m;
                        ((t71) this.f1317c).f51423e.setLayoutParams(layoutParams3);
                    }
                    if (!org.telegram.messenger.g0.Q1() && org.telegram.messenger.t0.f26609b.getResources().getConfiguration().orientation == 2) {
                        ((t71) this.f1317c).h.setTextSize(1, 18.0f);
                    } else {
                        ((t71) this.f1317c).h.setTextSize(1, 20.0f);
                    }
                    this.f1316b = false;
                }
                measureChildWithMargins(((t71) this.f1317c).f51465u0, i7, 0, i10, 0);
                int measuredHeight = ((t71) this.f1317c).f51465u0.getMeasuredHeight();
                if (((t71) this.f1317c).f51465u0.getVisibility() == 0) {
                    size5 -= measuredHeight;
                }
                FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) ((t71) this.f1317c).f51470w0.getLayoutParams();
                layoutParams4.topMargin = measuredHeight;
                t71 t71Var = (t71) this.f1317c;
                int i25 = 58;
                if (t71Var.f51413b == 2) {
                    n61 n61Var = t71Var.f51470w0;
                    int L = org.telegram.messenger.g0.L(4.0f);
                    t71 t71Var2 = (t71) this.f1317c;
                    if (!t71Var2.M1 && t71Var2.L1 > 0) {
                        i22 = 58;
                    } else {
                        i22 = 0;
                    }
                    int L2 = org.telegram.messenger.g0.L(i22 + 72) - 12;
                    if (((t71) this.f1317c).Z0()) {
                        i23 = org.telegram.messenger.g0.f23606n;
                    } else {
                        i23 = 0;
                    }
                    n61Var.setPadding(0, L, 0, L2 + i23);
                }
                ((t71) this.f1317c).f51470w0.measure(View.MeasureSpec.makeMeasureSpec(size4, 1073741824), View.MeasureSpec.makeMeasureSpec(size5 - layoutParams4.bottomMargin, 1073741824));
                ((FrameLayout.LayoutParams) ((t71) this.f1317c).f51478z0.getLayoutParams()).topMargin = measuredHeight;
                ((t71) this.f1317c).f51478z0.measure(View.MeasureSpec.makeMeasureSpec(size4, 1073741824), View.MeasureSpec.makeMeasureSpec(size5, 1073741824));
                k4 k4Var = ((t71) this.f1317c).S1;
                if (k4Var != null) {
                    ((FrameLayout.LayoutParams) k4Var.getLayoutParams()).topMargin = measuredHeight;
                    ((t71) this.f1317c).S1.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(222.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(76.0f), 1073741824));
                }
                t4 t4Var = ((t71) this.f1317c).E0;
                if (t4Var != null) {
                    int L3 = org.telegram.messenger.g0.L(12.0f);
                    int L4 = org.telegram.messenger.g0.L(12.0f);
                    int L5 = org.telegram.messenger.g0.L(12.0f);
                    int L6 = org.telegram.messenger.g0.L(12.0f);
                    if (((t71) this.f1317c).Z0()) {
                        i20 = org.telegram.messenger.g0.f23606n;
                    } else {
                        i20 = 0;
                    }
                    t4Var.setPadding(L3, L4, L5, L6 + i20);
                    FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) ((t71) this.f1317c).E0.getLayoutParams();
                    t71 t71Var3 = (t71) this.f1317c;
                    if (t71Var3.M1 || t71Var3.L1 <= 0) {
                        i25 = 0;
                    }
                    int L7 = org.telegram.messenger.g0.L(72 + i25);
                    if (((t71) this.f1317c).Z0()) {
                        i21 = org.telegram.messenger.g0.f23606n;
                    } else {
                        i21 = 0;
                    }
                    layoutParams5.height = L7 + i21;
                    measureChildWithMargins(((t71) this.f1317c).E0, i7, 0, i10, 0);
                }
                Drawable drawable = ((t71) this.f1317c).f51457r;
                if (drawable != null) {
                    drawable.getPadding(org.telegram.messenger.g0.Q);
                }
                int i26 = 0;
                while (true) {
                    FrameLayout[] frameLayoutArr = ((t71) this.f1317c).N0;
                    if (i26 < frameLayoutArr.length) {
                        FrameLayout frameLayout = frameLayoutArr[i26];
                        if (frameLayout != null) {
                            FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
                            if (i26 == 0) {
                                if (((t71) this.f1317c).f51413b == 2) {
                                    i19 = 321;
                                } else {
                                    i19 = 273;
                                }
                                f10 = i19;
                            } else {
                                f10 = 316.0f;
                            }
                            layoutParams6.height = org.telegram.messenger.g0.L(f10);
                            if (((t71) this.f1317c).Z0()) {
                                layoutParams6.height += org.telegram.messenger.g0.f23606n;
                            }
                            if (i26 == 0) {
                                layoutParams6.height = org.telegram.messenger.g0.L(12.0f) + org.telegram.messenger.g0.Q.top + layoutParams6.height;
                            }
                            FrameLayout frameLayout2 = ((t71) this.f1317c).N0[i26];
                            if (i26 == 0) {
                                i17 = org.telegram.messenger.g0.L(12.0f) + org.telegram.messenger.g0.Q.top;
                            } else {
                                i17 = 0;
                            }
                            if (((t71) this.f1317c).Z0()) {
                                i18 = org.telegram.messenger.g0.f23606n;
                            } else {
                                i18 = 0;
                            }
                            frameLayout2.setPadding(0, i17, 0, i18);
                            measureChildWithMargins(((t71) this.f1317c).N0[i26], i7, 0, i10, 0);
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
        switch (this.f1315a) {
            case 1:
                if (!this.f1316b) {
                    super.requestLayout();
                    return;
                }
                return;
            case 2:
                if (!this.f1316b) {
                    super.requestLayout();
                    return;
                }
                return;
            case 3:
                if (!this.f1316b) {
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
        switch (this.f1315a) {
            case 1:
                super.setAlpha(f10);
                org.telegram.ui.ActionBar.q0 q0Var = (org.telegram.ui.ActionBar.q0) this.f1317c;
                org.telegram.ui.ActionBar.f0 f0Var = q0Var.f29519s;
                if (f0Var != null && f0Var.getTag() != null) {
                    q0Var.f29519s.setAlpha(f10);
                    q0Var.f29519s.setScaleX(f10);
                    q0Var.f29519s.setScaleY(f10);
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
        switch (this.f1315a) {
            case 1:
                super.setVisibility(i7);
                org.telegram.ui.ActionBar.q0 q0Var = (org.telegram.ui.ActionBar.q0) this.f1317c;
                org.telegram.ui.ActionBar.f0 f0Var = q0Var.f29519s;
                if (f0Var != null) {
                    f0Var.setVisibility(i7);
                }
                View view = q0Var.f29526x;
                if (view != null) {
                    view.setVisibility(i7);
                }
                FrameLayout frameLayout = q0Var.f29495a;
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

    public l0(Context context, CharSequence charSequence, int i7, boolean z10) {
        super(context);
        this.f1315a = 0;
        Paint paint = new Paint(1);
        this.f1317c = paint;
        this.f1316b = z10;
        setWillNotDraw(false);
        TextView textView = new TextView(context);
        textView.setText(charSequence);
        textView.setTextSize(1, 16.0f);
        textView.setTextColor(i7);
        textView.setSingleLine(true);
        textView.setGravity(16);
        addView(textView, ja.d(-2, -1.0f, 3, 18.0f, 0.0f, 44.0f, 0.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.N(1.75f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setColor(i7);
    }
}
