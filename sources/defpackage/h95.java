package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Locale;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class h95 extends FrameLayout {
    public final RectF E;
    public int F;
    public int G;
    public float H;
    public long I;
    public final float[] J;
    public boolean K;
    public final j95 L;
    public final e29 a;
    public final TextView b;
    public final TLRPC.GroupCallParticipant c;
    public final b29 d;
    public boolean e;
    public float f;
    public float h;
    public int n;
    public double r;
    public final Paint s;
    public final Paint w;
    public final Path x;
    public final float[] y;

    public h95(j95 j95Var, Context context, TLRPC.GroupCallParticipant groupCallParticipant) {
        super(context);
        Integer num;
        int i;
        int i2;
        int L;
        int i3;
        int i4;
        this.L = j95Var;
        this.s = new Paint(1);
        Paint paint = new Paint(1);
        this.w = paint;
        this.x = new Path();
        this.y = new float[8];
        this.E = new RectF();
        this.J = new float[3];
        setWillNotDraw(false);
        this.c = groupCallParticipant;
        this.r = xc2.H(groupCallParticipant) / 20000.0f;
        this.H = 1.0f;
        setPadding(hl.L(12.0f), 0, hl.L(12.0f), 0);
        b29 b29Var = new b29(2131624199, hl.L(24.0f), hl.L(24.0f), true, null);
        this.d = b29Var;
        ?? imageView = new ImageView(context);
        this.a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setAnimation(b29Var);
        if (this.r == 0.0d) {
            num = 1;
        } else {
            num = null;
        }
        imageView.setTag(num);
        if (ob6.a0) {
            i = 5;
        } else {
            i = 3;
        }
        addView((View) imageView, tre.d(-2, 40.0f, i | 16, 0.0f, 0.0f, 0.0f, 0.0f));
        if (this.r == 0.0d) {
            i2 = 17;
        } else {
            i2 = 34;
        }
        b29Var.K(i2);
        b29Var.I(b29Var.f - 1, false, true);
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setGravity(3);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        yob.X(textView, aob.Yg, null);
        textView.setTextSize(1, 16.0f);
        double H = xc2.H(groupCallParticipant) / 100.0d;
        Locale locale = Locale.US;
        double max = H > 0.0d ? Math.max(H, 1.0d) : 0.0d;
        textView.setText(((int) max) + "%");
        if (ob6.a0) {
            L = 0;
        } else {
            L = hl.L(43.0f);
        }
        if (ob6.a0) {
            i3 = hl.L(43.0f);
        } else {
            i3 = 0;
        }
        textView.setPadding(L, 0, i3, 0);
        addView(textView, tre.e(-2, -2, (ob6.a0 ? 5 : 3) | 16));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(hl.L(1.5f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setColor(-1);
        int H2 = (int) (xc2.H(groupCallParticipant) / 100.0d);
        int i5 = 0;
        while (true) {
            float[] fArr = this.J;
            if (i5 < fArr.length) {
                if (i5 == 0) {
                    i4 = 0;
                } else if (i5 == 1) {
                    i4 = 50;
                } else {
                    i4 = 150;
                }
                if (H2 > i4) {
                    fArr[i5] = 1.0f;
                } else {
                    fArr[i5] = 0.0f;
                }
                i5++;
            } else {
                return;
            }
        }
    }

    public final void a(double d, boolean z) {
        double d2;
        int i;
        TLObject M0;
        int i2;
        if (VoIPService.getSharedInstance() != null) {
            this.r = d;
            TLRPC.GroupCallParticipant groupCallParticipant = this.c;
            groupCallParticipant.volume = (int) (d * 20000.0d);
            int i3 = 0;
            groupCallParticipant.volume_by_admin = false;
            groupCallParticipant.flags |= 128;
            double H = xc2.H(groupCallParticipant) / 100.0d;
            Locale locale = Locale.US;
            if (H > 0.0d) {
                d2 = Math.max(H, 1.0d);
            } else {
                d2 = 0.0d;
            }
            this.b.setText(((int) d2) + "%");
            VoIPService.getSharedInstance().setParticipantVolume(groupCallParticipant, groupCallParticipant.volume);
            Integer num = null;
            if (z) {
                long B1 = r47.B1(groupCallParticipant.peer);
                int i4 = (B1 > 0L ? 1 : (B1 == 0L ? 0 : -1));
                j95 j95Var = this.L;
                k5 k5Var = j95Var.n1;
                if (i4 > 0) {
                    M0 = uc7.s1(k5Var.a).X1(Long.valueOf(B1));
                } else {
                    M0 = uc7.s1(k5Var.a).M0(Long.valueOf(-B1));
                }
                TLObject tLObject = M0;
                if (groupCallParticipant.volume == 0) {
                    o85 o85Var = j95Var.U4;
                    if (o85Var != null) {
                        o85Var.dismiss();
                        j95Var.U4 = null;
                    }
                    j95Var.U0(true);
                    if (j95Var.H0()) {
                        i2 = 0;
                    } else {
                        i2 = 5;
                    }
                    j95Var.s1(groupCallParticipant, B1, i2);
                } else {
                    VoIPService.getSharedInstance().editCallMember(tLObject, null, null, Integer.valueOf(groupCallParticipant.volume), null, null);
                }
            }
            if (this.r == 0.0d) {
                num = 1;
            }
            e29 e29Var = this.a;
            if ((e29Var.getTag() == null && num != null) || (e29Var.getTag() != null && num == null)) {
                if (this.r == 0.0d) {
                    i = 17;
                } else {
                    i = 34;
                }
                b29 b29Var = this.d;
                b29Var.K(i);
                if (this.r != 0.0d) {
                    i3 = 17;
                }
                b29Var.H(i3);
                b29Var.start();
                e29Var.setTag(num);
            }
        }
    }

    public final boolean b(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f = motionEvent.getX();
            this.h = motionEvent.getY();
            return true;
        }
        if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            if (motionEvent.getAction() == 2) {
                if (!this.e) {
                    ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
                    if (Math.abs(motionEvent.getY() - this.h) <= viewConfiguration.getScaledTouchSlop() && Math.abs(motionEvent.getX() - this.f) > viewConfiguration.getScaledTouchSlop()) {
                        this.e = true;
                        getParent().requestDisallowInterceptTouchEvent(true);
                        if (motionEvent.getY() >= 0.0f && motionEvent.getY() <= getMeasuredHeight()) {
                            int x = (int) motionEvent.getX();
                            this.n = x;
                            if (x < 0) {
                                this.n = 0;
                            } else if (x > getMeasuredWidth()) {
                                this.n = getMeasuredWidth();
                            }
                            this.K = true;
                            invalidate();
                            return true;
                        }
                    }
                } else if (this.K) {
                    int x2 = (int) motionEvent.getX();
                    this.n = x2;
                    if (x2 < 0) {
                        this.n = 0;
                    } else if (x2 > getMeasuredWidth()) {
                        this.n = getMeasuredWidth();
                    }
                    a(this.n / getMeasuredWidth(), false);
                    invalidate();
                    return true;
                }
            }
        } else {
            this.e = false;
            if (motionEvent.getAction() == 1) {
                if (Math.abs(motionEvent.getY() - this.h) < ViewConfiguration.get(getContext()).getScaledTouchSlop()) {
                    int x3 = (int) motionEvent.getX();
                    this.n = x3;
                    if (x3 < 0) {
                        this.n = 0;
                    } else if (x3 > getMeasuredWidth()) {
                        this.n = getMeasuredWidth();
                    }
                    this.K = true;
                }
            }
            if (this.K) {
                if (motionEvent.getAction() == 1) {
                    a(this.n / getMeasuredWidth(), true);
                }
                this.K = false;
                invalidate();
                return true;
            }
        }
        return false;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i;
        float f;
        float L;
        int i2;
        float f2;
        int i3;
        h95 h95Var = this;
        int i4 = h95Var.F;
        double d = h95Var.r;
        if (d < 0.25d) {
            i = -3385513;
            h95Var.F = -3385513;
        } else if (d > 0.25d && d < 0.5d) {
            i = -3562181;
            h95Var.F = -3562181;
        } else if (d >= 0.5d && d <= 0.75d) {
            i = -11027349;
            h95Var.F = -11027349;
        } else {
            i = -11688225;
            h95Var.F = -11688225;
        }
        float f3 = 0.0f;
        float f4 = 1.0f;
        if (i4 == 0) {
            h95Var.H = 1.0f;
        } else {
            i = hl.R0(h95Var.H, 1.0f, h95Var.G, i4);
            if (i4 != h95Var.F) {
                h95Var.H = 0.0f;
                h95Var.G = i;
            }
        }
        Paint paint = h95Var.s;
        paint.setColor(i);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = elapsedRealtime - h95Var.I;
        if (j > 17) {
            j = 17;
        }
        h95Var.I = elapsedRealtime;
        float f5 = h95Var.H;
        if (f5 < 1.0f) {
            float f6 = (((float) j) / 200.0f) + f5;
            h95Var.H = f6;
            if (f6 > 1.0f) {
                h95Var.H = 1.0f;
            } else {
                h95Var.invalidate();
            }
        }
        Path path = h95Var.x;
        path.reset();
        float f7 = 6.0f;
        float L2 = hl.L(6.0f);
        float[] fArr = h95Var.y;
        fArr[7] = L2;
        fArr[6] = L2;
        int i5 = 1;
        fArr[1] = L2;
        int i6 = 0;
        fArr[0] = L2;
        if (h95Var.n < hl.L(12.0f)) {
            f = Math.max(0.0f, (h95Var.n - hl.L(6.0f)) / hl.L(6.0f));
        } else {
            f = 1.0f;
        }
        float L3 = hl.L(6.0f) * f;
        fArr[5] = L3;
        fArr[4] = L3;
        fArr[3] = L3;
        fArr[2] = L3;
        RectF rectF = h95Var.E;
        rectF.set(0.0f, 0.0f, h95Var.n, h95Var.getMeasuredHeight());
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        path.close();
        Canvas canvas2 = canvas;
        canvas2.drawPath(path, paint);
        int H = (int) (xc2.H(h95Var.c) / 100.0d);
        e29 e29Var = h95Var.a;
        int L4 = hl.L(5.0f) + (e29Var.getMeasuredWidth() / 2) + e29Var.getLeft();
        int measuredHeight = (e29Var.getMeasuredHeight() / 2) + e29Var.getTop();
        int i7 = 0;
        while (true) {
            float[] fArr2 = h95Var.J;
            if (i7 < fArr2.length) {
                if (i7 == 0) {
                    L = hl.L(f7);
                    f2 = f3;
                    i3 = i6;
                } else {
                    if (i7 == i5) {
                        L = hl.L(10.0f);
                        i2 = 50;
                    } else {
                        L = hl.L(14.0f);
                        i2 = 150;
                    }
                    f2 = f3;
                    i3 = i2;
                }
                float f8 = f4;
                float f9 = fArr2[i7];
                float L5 = (f8 - f9) * hl.L(2.0f);
                Paint paint2 = h95Var.w;
                paint2.setAlpha((int) (255.0f * f9));
                float f10 = L4;
                float f11 = measuredHeight;
                rectF.set((f10 - L) + L5, (f11 - L) + L5, (f10 + L) - L5, (f11 + L) - L5);
                canvas2.drawArc(rectF, -50.0f, 100.0f, false, paint2);
                if (H > i3) {
                    float f12 = fArr2[i7];
                    if (f12 < f8) {
                        float f13 = (((float) j) / 180.0f) + f12;
                        fArr2[i7] = f13;
                        if (f13 > f8) {
                            fArr2[i7] = f8;
                        }
                        invalidate();
                    }
                } else {
                    float f14 = fArr2[i7];
                    if (f14 > f2) {
                        float f15 = f14 - (((float) j) / 180.0f);
                        fArr2[i7] = f15;
                        if (f15 < f2) {
                            fArr2[i7] = f2;
                        }
                        invalidate();
                    }
                }
                i7++;
                h95Var = this;
                canvas2 = canvas;
                f3 = f2;
                f4 = f8;
                f7 = 6.0f;
                i5 = 1;
                i6 = 0;
            } else {
                return;
            }
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return b(motionEvent);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(hl.L(48.0f), 1073741824));
        this.n = (int) (View.MeasureSpec.getSize(i) * this.r);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return b(motionEvent);
    }
}
