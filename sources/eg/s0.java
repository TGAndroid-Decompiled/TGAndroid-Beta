package eg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.Layout;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.g3;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.i90;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.y80;
import org.telegram.ui.u70;
import vh.v5;
public final class s0 extends TextView {
    public final int f5492a;
    public Object f5493b;
    public final Object f5494c;

    public s0(org.telegram.ui.Components.voip.u0 u0Var, Context context) {
        super(context);
        this.f5492a = 8;
        this.f5494c = u0Var;
        this.f5493b = new Paint[u0Var.f29968f.length];
        int i10 = 0;
        while (true) {
            Paint[] paintArr = (Paint[]) this.f5493b;
            if (i10 >= paintArr.length) {
                return;
            }
            paintArr[i10] = new Paint(1);
            i10++;
        }
    }

    public void a() {
        i90 i90Var = (i90) this.f5494c;
        y80 y80Var = (y80) this.f5493b;
        if (y80Var != null && i90Var != null) {
            y80Var.rewind();
            if (getLayout() != null && getLayout().getText() != null) {
                y80Var.e(getLayout(), 0, getPaddingLeft(), getPaddingTop());
                getLayout().getSelectionPath(0, getLayout().getText().length(), y80Var);
            }
            i90Var.k();
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f5492a) {
            case 0:
                Paint paint = (Paint) this.f5493b;
                paint.setColor(j6.l1(0.8f, j6.v0(j6.f20298z6, ((g3) ((u0) this.f5494c).e).resourcesProvider)));
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(1.0f);
                float height = getHeight() / 2.0f;
                Layout layout = getLayout();
                int i10 = 0;
                for (int i11 = 0; i11 < layout.getLineCount(); i11++) {
                    i10 = Math.max(i10, (int) layout.getLineWidth(i11));
                }
                float f10 = i10 / 2.0f;
                canvas.drawLine(0.0f, height, ((getWidth() / 2.0f) - f10) - AndroidUtilities.dp(8.0f), height, paint);
                canvas.drawLine((getWidth() / 2.0f) + f10 + AndroidUtilities.dp(8.0f), height, getWidth(), height, paint);
                super.dispatchDraw(canvas);
                return;
            case 1:
            default:
                super.dispatchDraw(canvas);
                return;
            case 2:
                Paint paint2 = (Paint) this.f5493b;
                int dp = AndroidUtilities.dp(1.0f) + (getHeight() / 2);
                int max = Math.max(1, AndroidUtilities.dp(0.66f));
                Layout layout2 = getLayout();
                if (layout2 != null) {
                    paint2.setColor(j6.l1(0.45f, j6.v0(j6.f20281y6, ((oh.r) this.f5494c).T.f16617c)));
                    float f11 = dp;
                    float f12 = max / 2.0f;
                    float f13 = f11 - f12;
                    float f14 = f11 + f12;
                    canvas.drawRect(0.0f, f13, (getWidth() - (layout2.getLineWidth(0) + AndroidUtilities.dp(16.0f))) / 2.0f, f14, paint2);
                    canvas.drawRect(((layout2.getLineWidth(0) + getWidth()) + AndroidUtilities.dp(16.0f)) / 2.0f, f13, getWidth(), f14, paint2);
                }
                super.dispatchDraw(canvas);
                return;
            case 3:
                Paint paint3 = (Paint) this.f5493b;
                int dp2 = AndroidUtilities.dp(1.0f) + (getHeight() / 2);
                int max2 = Math.max(1, AndroidUtilities.dp(0.66f));
                Layout layout3 = getLayout();
                if (layout3 != null) {
                    paint3.setColor(j6.l1(0.45f, j6.v0(j6.f20281y6, (f6) this.f5494c)));
                    float f15 = dp2;
                    float f16 = max2 / 2.0f;
                    float f17 = f15 - f16;
                    float f18 = f15 + f16;
                    canvas.drawRect(0.0f, f17, (getWidth() - (layout3.getLineWidth(0) + AndroidUtilities.dp(16.0f))) / 2.0f, f18, paint3);
                    canvas.drawRect(((layout3.getLineWidth(0) + getWidth()) + AndroidUtilities.dp(16.0f)) / 2.0f, f17, getWidth(), f18, paint3);
                }
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f5492a) {
            case 4:
                ((org.telegram.ui.i) this.f5494c).f34980b.draw(canvas);
                super.draw(canvas);
                return;
            case 9:
                ((u70) this.f5494c).h.draw(canvas);
                super.draw(canvas);
                return;
            default:
                super.draw(canvas);
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f5492a) {
            case 7:
                super.onDetachedFromWindow();
                ((i90) this.f5494c).f25633b = -1L;
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f5492a) {
            case 1:
                Paint paint = (Paint) this.f5493b;
                paint.setColor(((gh.f) this.f5494c).getThemedColor(j6.Oh));
                canvas.drawRoundRect(0.0f, (getHeight() / 2.0f) - AndroidUtilities.dp(14.0f), getWidth(), (getHeight() / 2.0f) + AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), paint);
                super.onDraw(canvas);
                return;
            case 2:
            case 3:
            case 7:
            default:
                super.onDraw(canvas);
                return;
            case 4:
                super.onDraw(canvas);
                if (((org.telegram.ui.i) this.f5494c).f34986w) {
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    ((org.telegram.ui.Components.voip.h) this.f5493b).a(getMeasuredHeight() / 2.0f, canvas, rectF, null);
                    invalidate();
                    return;
                }
                return;
            case 5:
                Paint paint2 = (Paint) this.f5493b;
                paint2.setColor(((li) this.f5494c).getThemedColor(j6.Oh));
                canvas.drawRoundRect(0.0f, (getHeight() / 2.0f) - AndroidUtilities.dp(14.0f), getWidth(), (getHeight() / 2.0f) + AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), paint2);
                super.onDraw(canvas);
                return;
            case 6:
                if (((p2) this.f5493b) != null) {
                    canvas.save();
                    canvas.clipPath((Path) this.f5494c);
                    ((p2) this.f5493b).d(canvas);
                    canvas.restore();
                    invalidate();
                }
                super.onDraw(canvas);
                return;
            case 8:
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                Paint[] paintArr = (Paint[]) this.f5493b;
                org.telegram.ui.Components.voip.u0 u0Var = (org.telegram.ui.Components.voip.u0) this.f5494c;
                paintArr[u0Var.f29973x].setAlpha(255);
                canvas.drawRoundRect(rectF2, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paintArr[u0Var.f29973x]);
                float f10 = u0Var.f29972w;
                if (f10 > 0.0f) {
                    int i10 = u0Var.f29973x;
                    if (i10 + 1 < paintArr.length) {
                        paintArr[i10 + 1].setAlpha((int) (f10 * 255.0f));
                        canvas.drawRoundRect(rectF2, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paintArr[u0Var.f29973x + 1]);
                    }
                }
                super.onDraw(canvas);
                return;
            case 9:
                super.onDraw(canvas);
                RectF rectF3 = AndroidUtilities.rectTmp;
                rectF3.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                ((org.telegram.ui.Components.voip.h) this.f5493b).a(getMeasuredHeight() / 2.0f, canvas, rectF3, null);
                invalidate();
                return;
            case 10:
                Paint paint3 = (Paint) this.f5493b;
                paint3.setColor(((sh.n) this.f5494c).getThemedColor(j6.Oh));
                canvas.drawRoundRect(0.0f, (getHeight() / 2.0f) - AndroidUtilities.dp(14.0f), getWidth(), (getHeight() / 2.0f) + AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), paint3);
                super.onDraw(canvas);
                return;
            case 11:
                Paint paint4 = (Paint) this.f5493b;
                vh.a aVar = ((v5) this.f5494c).f46245x;
                if (aVar != null && aVar.f45776c > 0 && aVar.d == 0 && !aVar.e) {
                    paint4.setColor(getCurrentTextColor());
                    float baseline = getBaseline() - (getTextSize() * 0.35f);
                    canvas.drawCircle(getWidth() / 2.0f, baseline, AndroidUtilities.dpf2(4.3f) / 2.0f, paint4);
                    return;
                }
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        switch (this.f5492a) {
            case 6:
                super.onLayout(z4, i10, i11, i12, i13);
                p2 p2Var = new p2(10);
                this.f5493b = p2Var;
                p2Var.N = 100;
                p2Var.J = false;
                p2Var.M = true;
                p2Var.G = false;
                p2Var.K = true;
                p2Var.H = true;
                p2Var.f5441r = 1;
                p2Var.f5445w = 0.98f;
                p2Var.v = 0.98f;
                p2Var.f5444u = 0.98f;
                p2Var.f5431g = false;
                p2Var.f5438o = 0.0f;
                p2Var.f5446x = 750L;
                p2Var.f5447y = 750;
                p2Var.c();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                ((p2) this.f5493b).f5427a.set(rectF);
                ((p2) this.f5493b).f5428b.set(rectF);
                ((p2) this.f5493b).f();
                Path path = (Path) this.f5494c;
                path.reset();
                path.addRoundRect(rectF, getHeight() / 2.0f, getHeight() / 2.0f, Path.Direction.CW);
                return;
            default:
                super.onLayout(z4, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f5492a) {
            case 7:
                super.onMeasure(i10, i11);
                a();
                return;
            case 8:
            default:
                super.onMeasure(i10, i11);
                return;
            case 9:
                if (View.MeasureSpec.getSize(i10) > AndroidUtilities.dp(260.0f)) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(320.0f), 1073741824), i11);
                    return;
                } else {
                    super.onMeasure(i10, i11);
                    return;
                }
        }
    }

    @Override
    public void onSizeChanged(int r18, int r19, int r20, int r21) {
        throw new UnsupportedOperationException("Method not decompiled: eg.s0.onSizeChanged(int, int, int, int):void");
    }

    @Override
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        switch (this.f5492a) {
            case 7:
                super.setText(charSequence, bufferType);
                a();
                return;
            default:
                super.setText(charSequence, bufferType);
                return;
        }
    }

    @Override
    public void setTextColor(int i10) {
        switch (this.f5492a) {
            case 7:
                super.setTextColor(j6.l1(0.2f, i10));
                ((i90) this.f5494c).f(j6.l1(0.03f, i10), j6.l1(0.175f, i10), j6.l1(0.2f, i10), j6.l1(0.45f, i10));
                return;
            default:
                super.setTextColor(i10);
                return;
        }
    }

    public s0(v5 v5Var, Context context) {
        super(context);
        this.f5492a = 11;
        this.f5494c = v5Var;
        this.f5493b = new Paint(1);
    }

    public s0(Context context, int i10) {
        super(context);
        this.f5492a = i10;
        switch (i10) {
            case 7:
                super(context);
                y80 y80Var = new y80(0);
                this.f5493b = y80Var;
                i90 i90Var = new i90();
                this.f5494c = i90Var;
                i90Var.f25651x = y80Var;
                i90Var.f25649u = 0.65f;
                i90Var.j(4.0f);
                setBackground(i90Var);
                return;
            default:
                this.f5494c = new Path();
                return;
        }
    }

    public s0(gh.f fVar, Context context) {
        super(context);
        this.f5492a = 1;
        this.f5494c = fVar;
        this.f5493b = new Paint(1);
    }

    public s0(sh.n nVar, Context context) {
        super(context);
        this.f5492a = 10;
        this.f5494c = nVar;
        this.f5493b = new Paint(1);
    }

    public s0(u70 u70Var, Context context) {
        super(context);
        this.f5492a = 9;
        this.f5494c = u70Var;
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.f5493b = hVar;
        hVar.f29660k = false;
        hVar.f29662m = 2.0f;
    }

    public s0(org.telegram.ui.i iVar, Context context) {
        super(context);
        this.f5492a = 4;
        this.f5494c = iVar;
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.f5493b = hVar;
        hVar.f29660k = false;
        hVar.f29662m = 2.0f;
    }

    public s0(oh.r rVar, Context context) {
        super(context);
        this.f5492a = 2;
        this.f5494c = rVar;
        this.f5493b = new Paint(1);
    }

    public s0(Context context, f6 f6Var) {
        super(context);
        this.f5492a = 3;
        this.f5494c = f6Var;
        this.f5493b = new Paint(1);
    }

    public s0(u0 u0Var, Context context) {
        super(context);
        this.f5492a = 0;
        this.f5494c = u0Var;
        this.f5493b = new Paint(1);
    }

    public s0(li liVar, Context context) {
        super(context);
        this.f5492a = 5;
        this.f5494c = liVar;
        this.f5493b = new Paint(1);
    }
}
