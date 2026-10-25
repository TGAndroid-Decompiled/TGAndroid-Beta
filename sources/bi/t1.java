package bi;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.vh;
import org.telegram.ui.Components.d41;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.p90;
import org.telegram.ui.Components.r90;
import org.telegram.ui.r60;
public final class t1 extends FrameLayout implements oe.d {
    public final int f5436a;
    public Object f5437b;
    public Object f5438c;
    public Object d;

    public t1(Context context) {
        super(context);
        this.f5436a = 0;
    }

    @Override
    public void E(int i10, float f7, float f10, oe.e eVar) {
        invalidate();
    }

    public void a(TextView textView, boolean z10) {
        float f7;
        oe.e eVar = (oe.e) this.f5438c;
        CharSequence text = textView.getText();
        if (text != null) {
            f7 = textView.getPaint().measureText(text, 0, text.length());
        } else {
            f7 = 0.0f;
        }
        float dp = f7 + AndroidUtilities.dp(32.0f);
        if (z10 && eVar.f19334f > 0.0f) {
            eVar.a(dp);
            return;
        }
        eVar.c(dp);
        invalidate();
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        int i10;
        boolean z10;
        float f7;
        int i11;
        float f10;
        switch (this.f5436a) {
            case 3:
                RectF rectF = (RectF) this.f5437b;
                super.dispatchDraw(canvas);
                Paint paint = (Paint) this.f5438c;
                paint.setColor(-1);
                float width = getWidth() - (AndroidUtilities.dpf2(5.0f) * 2.0f);
                fi.j6 j6Var = (fi.j6) this.d;
                float dpf2 = (width - AndroidUtilities.dpf2((j6Var.f11058b - 1) * 2)) / j6Var.f11058b;
                float dpf22 = AndroidUtilities.dpf2(5.0f);
                for (int i12 = 0; i12 < j6Var.f11058b; i12++) {
                    rectF.set(dpf22, AndroidUtilities.dpf2(8.0f), dpf22 + dpf2, AndroidUtilities.dpf2(10.0f));
                    if (i12 < j6Var.f11058b - 1) {
                        i10 = 255;
                    } else {
                        i10 = 133;
                    }
                    paint.setAlpha(i10);
                    canvas.drawRoundRect(rectF, AndroidUtilities.dpf2(1.0f), AndroidUtilities.dpf2(1.0f), paint);
                    dpf22 += AndroidUtilities.dpf2(2.0f) + dpf2;
                }
                return;
            case 8:
                Paint paint2 = (Paint) this.f5438c;
                org.telegram.ui.ActionBar.y6.m(paint2);
                paint2.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.G8, ((org.telegram.ui.Components.g9) this.d).getResourceProvider()));
                paint2.setAlpha((int) (getAlpha() * 255.0f));
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                Path path = (Path) this.f5437b;
                path.rewind();
                path.addRoundRect(rectF2, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), Path.Direction.CW);
                canvas.drawPath(path, paint2);
                super.dispatchDraw(canvas);
                return;
            case 10:
                d41 d41Var = (d41) this.d;
                float i13 = d41Var.f27384f.i();
                int i14 = (i13 > 0.0f ? 1 : (i13 == 0.0f ? 0 : -1));
                if (i14 > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                float lerp = AndroidUtilities.lerp(0.5f, 1.0f, i13) * d41Var.L;
                float dp = AndroidUtilities.dp(10.0f);
                float dp2 = AndroidUtilities.dp(8.33f);
                float width2 = (getWidth() / 2.0f) + AndroidUtilities.dp(12.0f);
                float dp3 = AndroidUtilities.dp(12.0f);
                float max = Math.max(dp2 + dp2, d41Var.f27384f.c() + AndroidUtilities.dp(10.0f));
                if (z10) {
                    i11 = i14;
                    f10 = dp3;
                    f7 = width2;
                    canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
                } else {
                    f7 = width2;
                    i11 = i14;
                    f10 = dp3;
                }
                super.dispatchDraw(canvas);
                if (z10) {
                    RectF rectF3 = AndroidUtilities.rectTmp;
                    float f11 = max / 2.0f;
                    rectF3.set((f7 - f11) - AndroidUtilities.dp(1.33f), f10 - dp, f11 + f7 + AndroidUtilities.dp(1.33f), f10 + dp);
                    AndroidUtilities.scaleRect(rectF3, i13);
                    float f12 = dp * i13;
                    canvas.drawRoundRect(rectF3, f12, f12, (Paint) this.f5437b);
                    canvas.restore();
                }
                if (i11 > 0) {
                    canvas.save();
                    canvas.scale(lerp, lerp, f7, f10);
                    RectF rectF4 = AndroidUtilities.rectTmp;
                    float f13 = max / 2.0f;
                    rectF4.set(f7 - f13, f10 - dp2, f7 + f13, f10 + dp2);
                    org.telegram.ui.Components.l6 l6Var = (org.telegram.ui.Components.l6) this.f5438c;
                    l6Var.setColor(org.telegram.ui.ActionBar.y6.o1(i13, l6Var.f30085b.a(org.telegram.ui.ActionBar.y6.w0(d41Var.F, l6Var.f30084a), false)));
                    canvas.drawRoundRect(rectF4, dp2, dp2, l6Var);
                    d41Var.f27384f.p(rectF4);
                    org.telegram.ui.Components.r6 r6Var = d41Var.f27384f;
                    r6Var.B = (int) (i13 * 255.0f);
                    r6Var.draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            case 11:
                Paint paint3 = (Paint) this.f5438c;
                r60 r60Var = (r60) this.d;
                paint3.setColor(r60Var.getThemedColor(org.telegram.ui.ActionBar.y6.f23354d6));
                canvas.save();
                canvas.translate(0.0f, -getTop());
                RectF rectF5 = (RectF) this.f5437b;
                rectF5.set(0.0f, 0.0f, getWidth(), getHeight());
                rectF5.offset(0.0f, getTop());
                r60.b0(r60Var, canvas, rectF5, paint3);
                canvas.restore();
                super.dispatchDraw(canvas);
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f5436a) {
            case 6:
                if (motionEvent.getAction() == 0 && !((RectF) this.d).contains(motionEvent.getX(), motionEvent.getY())) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f5436a) {
            case 12:
                canvas.save();
                canvas.clipPath((Path) this.f5437b);
                super.draw(canvas);
                canvas.restore();
                return;
            default:
                super.draw(canvas);
                return;
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        switch (this.f5436a) {
            case 1:
                Paint paint = (Paint) this.f5437b;
                if (((yc) this.d).e > 1) {
                    paint.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23354d6, (org.telegram.ui.ActionBar.u6) this.f5438c));
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(view.getX(), view.getY(), view.getX() + view.getWidth(), view.getY() + view.getHeight());
                    rectF.inset(-AndroidUtilities.dp(1.66f), -AndroidUtilities.dp(1.66f));
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), paint);
                }
                return super.drawChild(canvas, view, j10);
            case 4:
                ag.h0 h0Var = (ag.h0) this.f5437b;
                ag.h0 h0Var2 = (ag.h0) this.f5438c;
                boolean drawChild = super.drawChild(canvas, view, j10);
                ii.o oVar = (ii.o) this.d;
                if (view == oVar.e) {
                    int i10 = org.telegram.ui.ActionBar.y6.f23297a7;
                    h0Var.b(oVar.getThemedColor(i10));
                    h0Var.setBounds(0, 0, getWidth(), AndroidUtilities.statusBarHeight);
                    h0Var.draw(canvas);
                    float navigationBarThirdButtonsFactor = AndroidUtilities.getNavigationBarThirdButtonsFactor(AndroidUtilities.navigationBarHeight);
                    if (navigationBarThirdButtonsFactor > 0.0f) {
                        h0Var2.setAlpha((int) (navigationBarThirdButtonsFactor * 255.0f));
                        h0Var2.b(oVar.getThemedColor(i10));
                        h0Var2.setBounds(0, getHeight() - AndroidUtilities.navigationBarHeight, getWidth(), getHeight());
                        h0Var2.draw(canvas);
                    }
                }
                return drawChild;
            case 13:
                sg.t2 t2Var = ((sg.v2) this.d).f48536f;
                if (view == t2Var) {
                    canvas.save();
                    canvas.translate(((org.telegram.ui.Components.h6) this.f5437b).d(view.getX(), false), ((org.telegram.ui.Components.h6) this.f5438c).d(view.getY(), false));
                    t2Var.a(canvas);
                    canvas.restore();
                    return true;
                }
                return super.drawChild(canvas, view, j10);
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f5436a) {
            case 6:
                float min = Math.min(((oe.e) this.f5438c).f19334f, getWidth() - AndroidUtilities.dp(24.0f));
                float width = getWidth() / 2.0f;
                float height = getHeight() / 2.0f;
                RectF rectF = (RectF) this.d;
                float f7 = min / 2.0f;
                rectF.set(width - f7, height - (AndroidUtilities.dp(38.0f) / 2.0f), width + f7, (AndroidUtilities.dp(38.0f) / 2.0f) + height);
                int dp = AndroidUtilities.dp(6.0f);
                eh.d dVar = (eh.d) this.f5437b;
                dVar.setBounds(((int) rectF.left) - dp, ((int) rectF.top) - dp, ((int) rectF.right) + dp, ((int) rectF.bottom) + dp);
                dVar.draw(canvas);
                return;
            case 7:
                super.onDraw(canvas);
                Paint paint = (Paint) this.f5438c;
                paint.setColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23579p7, false));
                canvas.save();
                TextPaint textPaint = (TextPaint) this.d;
                canvas.translate((getMeasuredWidth() - textPaint.measureText("500")) - AndroidUtilities.dp(8.0f), AndroidUtilities.dpf2(7.0f));
                RectF rectF2 = (RectF) this.f5437b;
                rectF2.set(0.0f, 0.0f, textPaint.measureText("500"), textPaint.getTextSize());
                rectF2.inset(-AndroidUtilities.dp(6.0f), -AndroidUtilities.dp(3.0f));
                float textSize = (textPaint.getTextSize() / 2.0f) + AndroidUtilities.dp(3.0f);
                canvas.drawRoundRect(rectF2, textSize, textSize, paint);
                canvas.drawText("500", 0.0f, textPaint.getTextSize() - AndroidUtilities.dpf2(2.0f), textPaint);
                canvas.restore();
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f5436a) {
            case 12:
                super.onMeasure(i10, i11);
                Path path = (Path) this.f5437b;
                path.rewind();
                RectF rectF = (RectF) this.f5438c;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                path.addRoundRect(rectF, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), Path.Direction.CW);
                sg.t2 t2Var = ((sg.v2) this.d).f48536f;
                if (t2Var != null) {
                    t2Var.setMaxWidth(getMeasuredWidth() - AndroidUtilities.dp(32.0f));
                    return;
                }
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.f5436a) {
            case 10:
                if (((d41) this.d).f27384f != drawable && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public t1(Context context, org.telegram.ui.ActionBar.u6 u6Var, boolean z10) {
        super(context);
        this.f5436a = 5;
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
        this.f5438c = y9Var;
        y9Var.setRoundRadius(AndroidUtilities.dp(23.0f));
        addView(y9Var, gb1.h(46, 46.0f, 19, 21.0f, 6.0f, 0.0f, 6.0f));
        if (z10) {
            addView(new ji.a(context, u6Var), gb1.f(22.66f, 22.66f, 83, 48.66f, 0.0f, 0.0f, 3.6599998f));
        }
        TextView textView = new TextView(context);
        this.f5437b = textView;
        vh.j(16.0f, 1, textView);
        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23462j5, u6Var);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        addView(textView, gb1.h(-1, -2.0f, 51, 80.0f, 7.0f, 0.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.f7.V(textView2, org.telegram.ui.ActionBar.y6.f23765z6, u6Var);
        textView2.setSingleLine(true);
        textView2.setEllipsize(truncateAt);
        addView(textView2, gb1.h(-1, -2.0f, 51, 80.0f, 30.33f, 0.0f, 0.0f));
    }

    public t1(fi.j6 j6Var, Context context) {
        super(context);
        this.f5436a = 3;
        this.d = j6Var;
        this.f5437b = new RectF();
        this.f5438c = new Paint(1);
    }

    public t1(Context context, Paint paint, TextPaint textPaint) {
        super(context);
        this.f5436a = 7;
        this.f5438c = paint;
        this.d = textPaint;
        this.f5437b = new RectF();
    }

    public t1(sg.v2 v2Var, Context context, int i10) {
        super(context);
        this.f5436a = i10;
        switch (i10) {
            case 13:
                this.d = v2Var;
                super(context);
                ds dsVar = ds.h;
                this.f5437b = new org.telegram.ui.Components.h6(this, 0L, 350L, dsVar);
                this.f5438c = new org.telegram.ui.Components.h6(this, 0L, 350L, dsVar);
                return;
            default:
                this.d = v2Var;
                this.f5437b = new Path();
                this.f5438c = new RectF();
                return;
        }
    }

    public t1(ii.o oVar, Context context) {
        super(context);
        this.f5436a = 4;
        this.d = oVar;
        this.f5437b = new ag.h0(2);
        this.f5438c = new ag.h0(8);
    }

    public t1(di.f6 f6Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.u6 u6Var;
        org.telegram.ui.ActionBar.u6 u6Var2;
        this.f5436a = 2;
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        org.telegram.ui.ActionBar.f7.t(imageView, org.telegram.ui.ActionBar.y6.Oh, null, PorterDuff.Mode.MULTIPLY);
        addView(imageView, gb1.h(28, 28.0f, 0, 25.0f, 12.0f, 16.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f5437b = textView;
        textView.setTypeface(AndroidUtilities.bold());
        int i10 = org.telegram.ui.ActionBar.y6.G6;
        u6Var = ((org.telegram.ui.ActionBar.k3) f6Var).resourcesProvider;
        org.telegram.ui.ActionBar.f7.V(textView, i10, u6Var);
        textView.setTextSize(1, 14.0f);
        addView(textView, gb1.h(-1, -2.0f, 0, 68.0f, 8.0f, 16.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.f5438c = textView2;
        int i11 = org.telegram.ui.ActionBar.y6.f23746y6;
        u6Var2 = ((org.telegram.ui.ActionBar.k3) f6Var).resourcesProvider;
        org.telegram.ui.ActionBar.f7.V(textView2, i11, u6Var2);
        textView2.setTextSize(1, 14.0f);
        addView(textView2, gb1.h(-1, -2.0f, 0, 68.0f, 28.0f, 16.0f, 8.0f));
    }

    public t1(org.telegram.ui.Components.g9 g9Var, Activity activity) {
        super(activity);
        this.f5436a = 8;
        this.d = g9Var;
        this.f5437b = new Path();
        this.f5438c = new Paint(1);
    }

    public t1(org.telegram.ui.n8 n8Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.u6 u6Var;
        this.f5436a = 6;
        this.f5438c = new oe.e(0, this, ds.h, 350L, 0.0f);
        this.d = new RectF();
        setWillNotDraw(false);
        eh.d c10 = n8Var.getBaseSimpleGlass().f19421c.c(this, null, false);
        u6Var = ((org.telegram.ui.ActionBar.r2) n8Var).resourceProvider;
        c10.v(gh.c.m(u6Var));
        c10.w(AndroidUtilities.dp(6.0f));
        c10.x(AndroidUtilities.dp(19.0f));
        this.f5437b = c10;
    }

    public t1(r90 r90Var, Context context) {
        super(context);
        this.f5436a = 9;
        this.d = r90Var;
        p90 p90Var = new p90(this, context);
        this.f5438c = p90Var;
        LinearLayout d = vh.d(context, 0);
        addView(d, gb1.i(-2, -1, 1));
        TextView textView = new TextView(context);
        this.f5437b = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        d.addView(p90Var, gb1.r(-2, -1));
        d.addView(textView, gb1.u(-2, -2, 16));
        setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        p90Var.a(false);
    }

    public t1(r60 r60Var, Context context) {
        super(context);
        this.f5436a = 11;
        this.d = r60Var;
        this.f5437b = new RectF();
        this.f5438c = new Paint(1);
    }

    public t1(d41 d41Var, Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.f5436a = 10;
        this.d = d41Var;
        Paint paint = new Paint(1);
        this.f5437b = paint;
        this.f5438c = new org.telegram.ui.Components.l6(this, u6Var);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        d41Var.f27384f.setCallback(this);
    }

    public t1(yc ycVar, Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.f5436a = 1;
        this.d = ycVar;
        this.f5438c = u6Var;
        this.f5437b = new Paint(1);
    }

    @Override
    public void z(float f7, int i10) {
    }
}
