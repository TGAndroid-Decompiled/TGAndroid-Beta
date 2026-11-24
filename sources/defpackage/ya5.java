package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.webrtc.RendererCommon;
public final class ya5 extends ViewGroup {
    public static final int W = 0;
    public final long E;
    public boolean F;
    public long G;
    public boolean H;
    public float I;
    public long J;
    public float K;
    public float L;
    public boolean M;
    public final float[] N;
    public final float[] O;
    public final float[] P;
    public float Q;
    public float R;
    public int S;
    public int T;
    public final na1 U;
    public final za5 V;
    public final String a;
    public rd2 b;
    public final akc c;
    public final la1 d;
    public final TextView e;
    public final Paint f;
    public final RectF h;
    public TLRPC.GroupCallParticipant n;
    public boolean r;
    public volatile long s;
    public volatile int w;
    public volatile int x;
    public long y;

    public ya5(za5 za5Var, Context context, String str, rd2 rd2Var) {
        super(context);
        Context context2;
        this.V = za5Var;
        Paint paint = new Paint(1);
        this.f = paint;
        this.h = new RectF();
        this.E = SystemClock.elapsedRealtime();
        this.F = false;
        this.K = 0.0f;
        this.L = 0.0f;
        this.N = new float[4];
        this.O = new float[4];
        this.P = new float[4];
        this.U = new na1(this, (byte) 1);
        this.a = str;
        this.b = rd2Var;
        setBackgroundColor(-14999773);
        setOutlineProvider(new xj((byte) 4));
        setClipToOutline(true);
        if (rd2Var != null) {
            context2 = context;
            akc akcVar = new akc(context2, false, false, false, false);
            this.c = akcVar;
            RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FIT;
            zjc zjcVar = akcVar.d;
            zjcVar.setScalingType(scalingType);
            zjcVar.setEnableHardwareScaler(true);
            akcVar.b0 = (byte) 1;
            zjcVar.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new xa5(this));
            View view = akcVar.h;
            if (view != null) {
                view.setVisibility(8);
            }
            addView(akcVar);
        } else {
            context2 = context;
            this.c = null;
        }
        la1 la1Var = new la1(context2);
        this.d = la1Var;
        addView(la1Var);
        TextView textView = new TextView(context2);
        this.e = textView;
        textView.setTextColor(-1);
        textView.setTextSize(1, 13.0f);
        textView.setSingleLine();
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity(1);
        textView.setShadowLayer(gm.L(2.0f), 0.0f, 0.0f, Integer.MIN_VALUE);
        addView(textView);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(gm.L(2.0f));
        paint.setColor(cmb.w0(null, cmb.gh, false));
        setWillNotDraw(false);
        c();
    }

    public final void a() {
        za5 za5Var = this.V;
        va5 va5Var = za5Var.b;
        if (va5Var != null) {
            if (va5Var.a.contains(this) || za5Var.b.c.contains(this)) {
                za5Var.b.i(false);
            }
        }
    }

    public final void b() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        TLRPC.GroupCallParticipant groupCallParticipant = this.n;
        if (groupCallParticipant != null && sharedInstance != null) {
            sharedInstance.removeExtraRemoteSink(groupCallParticipant, this.r, this.U);
        }
        this.n = null;
        akc akcVar = this.c;
        if (akcVar != null) {
            akcVar.d.release();
        }
    }

    public final void c() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        rd2 rd2Var = this.b;
        if (rd2Var != null && this.c != null && this.n == null && sharedInstance != null && sharedInstance.addExtraRemoteSink(rd2Var.a, rd2Var.b, this.U)) {
            rd2 rd2Var2 = this.b;
            this.n = rd2Var2.a;
            this.r = rd2Var2.b;
        }
    }

    public final void d(boolean z) {
        rd2 rd2Var;
        zjc zjcVar;
        int i;
        int i2;
        int i3 = this.w;
        int i4 = this.x;
        if (i3 > 0 && i4 > 0) {
            this.K = i3 / i4;
            return;
        }
        akc akcVar = this.c;
        if (akcVar != null && akcVar.d.isFirstFrameRendered() && (i = (zjcVar = this.c.d).rotatedFrameWidth) > 0 && (i2 = zjcVar.rotatedFrameHeight) > 0) {
            this.K = i / i2;
        } else if (z && this.K <= 0.0f && (rd2Var = this.b) != null) {
            float f = rd2Var.c;
            if (f > 0.0f) {
                this.K = f;
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        long min;
        float f;
        super.dispatchDraw(canvas);
        long uptimeMillis = SystemClock.uptimeMillis();
        long j = this.J;
        if (j == 0) {
            min = 16;
        } else {
            min = Math.min(48L, uptimeMillis - j);
        }
        this.J = uptimeMillis;
        if (this.H && this.F) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        float f2 = this.I;
        float min2 = (Math.min(1.0f, ((float) min) / 150.0f) * (f - f2)) + f2;
        this.I = min2;
        if (min2 > 0.01f) {
            Paint paint = this.f;
            float strokeWidth = paint.getStrokeWidth() / 2.0f;
            RectF rectF = this.h;
            rectF.set(strokeWidth, strokeWidth, getWidth() - strokeWidth, getHeight() - strokeWidth);
            paint.setAlpha((int) (this.I * 255.0f));
            canvas.drawRoundRect(rectF, gm.L(4.0f), gm.L(4.0f), paint);
        }
        if (Math.abs(f - this.I) > 0.01f) {
            invalidate();
            return;
        }
        this.I = f;
        this.J = 0L;
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int i7 = 0;
        this.d.layout(0, 0, i5, i6);
        akc akcVar = this.c;
        if (akcVar != null) {
            int measuredWidth = akcVar.getMeasuredWidth();
            int measuredHeight = akcVar.getMeasuredHeight();
            int i8 = (i5 - measuredWidth) / 2;
            int i9 = (i6 - measuredHeight) / 2;
            akcVar.layout(i8, i9, i8 + measuredWidth, i9 + measuredHeight);
            float max = Math.max(i5 / measuredWidth, i6 / measuredHeight);
            akcVar.setScaleX(max);
            akcVar.setScaleY(max);
        }
        if (i5 >= gm.L(72.0f) && i6 >= gm.L(48.0f)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            i7 = 8;
        }
        TextView textView = this.e;
        textView.setVisibility(i7);
        int L = (i6 - gm.L(6.0f)) - textView.getMeasuredHeight();
        textView.layout(gm.L(6.0f), L, textView.getMeasuredWidth() + gm.L(6.0f), textView.getMeasuredHeight() + L);
        invalidateOutline();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        setMeasuredDimension(size, size2);
        this.d.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        this.e.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, size - gm.L(12.0f)), 1073741824), 0);
        akc akcVar = this.c;
        if (akcVar != null) {
            int i3 = this.S;
            if (i3 > 0) {
                size = i3;
            }
            int i4 = this.T;
            if (i4 > 0) {
                size2 = i4;
            }
            if (akcVar.getMeasuredWidth() != size || akcVar.getMeasuredHeight() != size2 || akcVar.isLayoutRequested()) {
                akcVar.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            }
        }
    }
}
