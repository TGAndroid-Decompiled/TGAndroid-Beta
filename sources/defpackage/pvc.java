package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.ImageReceiver;
public final class pvc extends FrameLayout {
    public static final int J = 0;
    public AnimatorSet E;
    public int F;
    public int G;
    public final cpc H;
    public final tvc I;
    public final ImageReceiver a;
    public boolean b;
    public final TextPaint c;
    public StaticLayout d;
    public StaticLayout e;
    public final Paint f;
    public final Paint h;
    public final Paint n;
    public int r;
    public int s;
    public int w;
    public int x;
    public boolean y;

    public pvc(tvc tvcVar, Activity activity) {
        super(activity);
        this.I = tvcVar;
        this.y = true;
        this.H = new cpc(this, (byte) 12);
        setWillNotDraw(false);
        TextPaint textPaint = new TextPaint(1);
        this.c = textPaint;
        textPaint.setColor(-1);
        textPaint.setTextSize(gm.L(12.0f));
        Paint paint = new Paint(1);
        this.f = paint;
        paint.setColor(-15095832);
        Paint paint2 = new Paint();
        this.h = paint2;
        paint2.setColor(-6975081);
        Paint paint3 = new Paint(1);
        this.n = paint3;
        paint3.setColor(-1);
        this.a = new ImageReceiver(this);
    }

    public final void a() {
        cpc cpcVar = this.H;
        gm.r(cpcVar);
        if (this.y && this.I.a.c0()) {
            gm.d3(cpcVar, 3000L);
        }
    }

    public final void b(int i) {
        if (this.s != i && i >= 0 && !this.I.I) {
            this.s = i;
            StaticLayout staticLayout = new StaticLayout(gm.g0(this.s, false, false), this.c, gm.L(1000.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.d = staticLayout;
            if (staticLayout.getLineCount() > 0) {
                this.r = (int) Math.ceil(this.d.getLineWidth(0));
            }
            invalidate();
        }
    }

    public final void c(int i) {
        if (!this.b && i >= 0 && !this.I.I) {
            this.w = i;
            this.e = new StaticLayout(gm.g0(this.w, false, false), this.c, gm.L(1000.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            invalidate();
        }
    }

    public final void d(boolean z, boolean z2) {
        if (this.y == z) {
            return;
        }
        this.y = z;
        AnimatorSet animatorSet = this.E;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        boolean z3 = this.y;
        Property property = View.ALPHA;
        if (z3) {
            if (z2) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.E = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this, property, 1.0f));
                this.E.setDuration(150L);
                this.E.addListener(new ovc(this, (byte) 0));
                this.E.start();
            } else {
                setAlpha(1.0f);
            }
        } else if (z2) {
            AnimatorSet animatorSet3 = new AnimatorSet();
            this.E = animatorSet3;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(this, property, 0.0f));
            this.E.setDuration(150L);
            this.E.addListener(new ovc(this, (byte) 1));
            this.E.start();
        } else {
            setAlpha(0.0f);
        }
        a();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int L;
        int L2;
        Canvas canvas2;
        int i;
        int i2;
        int i3;
        tvc tvcVar = this.I;
        if (tvcVar.Q) {
            if (tvcVar.N && tvcVar.O != 0.0f) {
                long currentTimeMillis = System.currentTimeMillis();
                tvcVar.M = currentTimeMillis;
                float f = tvcVar.O - (((float) (currentTimeMillis - tvcVar.M)) / 150.0f);
                tvcVar.O = f;
                if (f < 0.0f) {
                    tvcVar.O = 0.0f;
                }
                invalidate();
            }
            float f2 = tvcVar.O;
            ImageReceiver imageReceiver = this.a;
            imageReceiver.setAlpha(f2);
            imageReceiver.h(canvas, null);
        }
        if (tvcVar.a.d != null && !tvcVar.I) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            if (!tvcVar.V) {
                int i4 = 10;
                if (this.d != null) {
                    canvas.save();
                    float L3 = (measuredWidth - gm.L(58.0f)) - this.r;
                    if (tvcVar.U) {
                        i3 = 6;
                    } else {
                        i3 = 10;
                    }
                    canvas.translate(L3, measuredHeight - gm.L(i3 + 29));
                    this.d.draw(canvas);
                    canvas.restore();
                }
                if (this.e != null) {
                    canvas.save();
                    float L4 = gm.L(18.0f);
                    if (tvcVar.U) {
                        i4 = 6;
                    }
                    canvas.translate(L4, measuredHeight - gm.L(i4 + 29));
                    this.e.draw(canvas);
                    canvas.restore();
                }
            }
            if (this.s != 0) {
                float f3 = 7.0f;
                int i5 = 0;
                if (tvcVar.V) {
                    L = measuredHeight - gm.L(3.0f);
                    L2 = gm.L(7.0f);
                } else if (tvcVar.U) {
                    L = measuredHeight - gm.L(29.0f);
                    i5 = gm.L(36.0f) + this.r;
                    measuredWidth = (measuredWidth - gm.L(76.0f)) - this.r;
                    L2 = gm.L(28.0f);
                } else {
                    L = measuredHeight - gm.L(13.0f);
                    L2 = gm.L(12.0f);
                }
                int i6 = measuredHeight - L2;
                boolean z = tvcVar.U;
                Paint paint = this.h;
                if (z) {
                    canvas.drawRect(i5, L, measuredWidth, gm.L(3.0f) + L, paint);
                    canvas2 = canvas;
                } else {
                    canvas2 = canvas;
                }
                if (this.b) {
                    i = this.G;
                } else {
                    i = ((int) ((this.w / this.s) * (measuredWidth - i5))) + i5;
                }
                int i7 = this.x;
                if (i7 != 0 && (i2 = this.s) != 0) {
                    float f4 = i5;
                    float f5 = L;
                    float A = b10.A(i7, i2, measuredWidth - i5, f4);
                    float L5 = gm.L(3.0f) + L;
                    if (tvcVar.U) {
                        paint = this.n;
                    }
                    canvas2.drawRect(f4, f5, A, L5, paint);
                }
                float f6 = i;
                Paint paint2 = this.f;
                canvas2.drawRect(i5, L, f6, gm.L(3.0f) + L, paint2);
                if (!tvcVar.V) {
                    float f7 = i6;
                    if (!this.b) {
                        f3 = 5.0f;
                    }
                    canvas2.drawCircle(f6, f7, gm.L(f3), paint2);
                }
            }
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            if (!this.y) {
                d(true, true);
                return true;
            }
            onTouchEvent(motionEvent);
            return this.b;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int measuredWidth;
        int measuredHeight;
        int i;
        int i2;
        tvc tvcVar = this.I;
        ndc ndcVar = tvcVar.a;
        if (tvcVar.U) {
            i = gm.L(36.0f) + this.r;
            measuredWidth = (getMeasuredWidth() - gm.L(76.0f)) - this.r;
            measuredHeight = getMeasuredHeight() - gm.L(28.0f);
        } else {
            measuredWidth = getMeasuredWidth();
            measuredHeight = getMeasuredHeight() - gm.L(12.0f);
            i = 0;
        }
        int i3 = this.s;
        if (i3 != 0) {
            i2 = (int) ((this.w / i3) * (measuredWidth - i));
        } else {
            i2 = 0;
        }
        int i4 = i2 + i;
        int action = motionEvent.getAction();
        cpc cpcVar = this.H;
        if (action == 0) {
            if (this.y && !tvcVar.V && !tvcVar.I) {
                if (this.s != 0) {
                    int x = (int) motionEvent.getX();
                    int y = (int) motionEvent.getY();
                    if (x >= i4 - gm.L(10.0f) && x <= gm.L(10.0f) + i4 && y >= measuredHeight - gm.L(10.0f) && y <= gm.L(10.0f) + measuredHeight) {
                        this.b = true;
                        this.F = x;
                        this.G = i4;
                        getParent().requestDisallowInterceptTouchEvent(true);
                        invalidate();
                    }
                }
            } else {
                d(true, true);
            }
            gm.r(cpcVar);
        } else if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            if (motionEvent.getAction() == 2 && this.b) {
                int x2 = (int) motionEvent.getX();
                int i5 = this.G - (this.F - x2);
                this.G = i5;
                this.F = x2;
                if (i5 < i) {
                    this.G = i;
                    i5 = i;
                } else if (i5 > measuredWidth) {
                    this.G = measuredWidth;
                    i5 = measuredWidth;
                }
                c((int) (((i5 - i) / (measuredWidth - i)) * this.s * 1000));
                invalidate();
            }
        } else {
            if (tvcVar.x && ndcVar.c0()) {
                gm.d3(cpcVar, 3000L);
            }
            if (this.b) {
                this.b = false;
                if (tvcVar.x) {
                    int i6 = (int) (((this.G - i) / (measuredWidth - i)) * this.s);
                    this.w = i6;
                    ndcVar.p0(i6 * 1000, false);
                }
            }
        }
        super.onTouchEvent(motionEvent);
        return true;
    }

    @Override
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        a();
    }
}
