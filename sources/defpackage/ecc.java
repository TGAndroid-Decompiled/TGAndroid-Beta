package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextPaint;
import android.view.View;
import j$.util.Comparator$CC;
import java.io.File;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AnimatedFileDrawableStream;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public abstract class ecc extends View implements gk7 {
    public String E;
    public int F;
    public final TextPaint G;
    public BitmapShader H;
    public final RectF I;
    public final Paint J;
    public final Paint K;
    public final RectF L;
    public final Matrix M;
    public final r68 N;
    public x88 O;
    public double P;
    public boolean Q;
    public final ImageReceiver R;
    public int S;
    public int T;
    public int U;
    public int V;
    public final Path W;
    public boolean a;
    public long a0;
    public km b;
    public long b0;
    public long c;
    public int c0;
    public Uri d;
    public int d0;
    public Runnable e;
    public ArrayList e0;
    public ccc f;
    public TLRPC.Document f0;
    public String g0;
    public float h;
    public int h0;
    public int n;
    public int r;
    public boolean s;
    public Bitmap w;
    public Bitmap x;
    public final Drawable y;

    public ecc(Context context, r68 r68Var) {
        super(context);
        this.n = -1;
        TextPaint textPaint = new TextPaint(1);
        this.G = textPaint;
        this.I = new RectF();
        this.J = new Paint(2);
        this.K = new Paint(2);
        this.L = new RectF();
        this.M = new Matrix();
        this.W = new Path();
        this.h0 = -1;
        setVisibility(4);
        this.y = context.getResources().getDrawable(2131232803);
        textPaint.setTextSize(gl.L(13.0f));
        textPaint.setColor(-1);
        this.N = r68Var;
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.R = imageReceiver;
        imageReceiver.p0(this);
        imageReceiver.h1 = new hza(this, (byte) 28);
    }

    public final void a() {
        if (this.e != null) {
            Utilities.e.a(this.e);
            this.e = null;
        }
        if (this.f != null) {
            Utilities.e.a(this.f);
            this.f = null;
        }
        km kmVar = this.b;
        if (kmVar != null) {
            AnimatedFileDrawableStream animatedFileDrawableStream = kmVar.v0;
            if (animatedFileDrawableStream != null) {
                animatedFileDrawableStream.b(true);
            }
            if (kmVar.e0 != null) {
                kmVar.e0.h();
            }
        }
        Utilities.e.c(new kbc(this, (byte) 3));
        setVisibility(4);
        this.x = null;
        this.H = null;
        invalidate();
        this.n = -1;
        this.d = null;
        this.s = false;
        this.a = false;
        if (this.a0 != 0) {
            this.a0 = 0L;
            this.g0 = null;
            this.f0 = null;
            this.e0 = null;
            b(-1);
        }
    }

    public final void b(int i) {
        int i2 = this.h0;
        if (i2 == i) {
            return;
        }
        int i3 = kk7.Y1;
        int i4 = kk7.X1;
        if (i == -1) {
            kk7.f(i2).n(this, i4);
            kk7.f(this.h0).n(this, i3);
        } else {
            kk7.f(i).b(this, i4);
            kk7.f(i).b(this, i3);
        }
        this.h0 = i;
    }

    public final void c(defpackage.k27 r13, defpackage.lbc r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ecc.c(k27, lbc):void");
    }

    public final void d(File file) {
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
            ArrayList arrayList = new ArrayList();
            long j = 0;
            int i = 0;
            int i2 = 0;
            while (true) {
                String readLine = randomAccessFile.readLine();
                if (readLine != null) {
                    if (readLine.startsWith("file=mtproto:")) {
                        j = Long.parseLong(readLine.substring(13));
                    } else if (readLine.startsWith("frame_width=")) {
                        i = Integer.parseInt(readLine.substring(12));
                    } else if (readLine.startsWith("frame_height=")) {
                        i2 = Integer.parseInt(readLine.substring(13));
                    } else {
                        String[] split = readLine.split(",");
                        if (split.length == 3) {
                            arrayList.add(new dcc(Integer.parseInt(split[1]), Integer.parseInt(split[2]), Double.parseDouble(split[0])));
                        }
                    }
                } else {
                    Collections.sort(arrayList, Comparator$CC.comparingDouble(new mm7((byte) 6)));
                    this.b0 = j;
                    this.c0 = i;
                    this.d0 = i2;
                    this.e0 = arrayList;
                    return;
                }
            }
        } catch (Exception e) {
            fa4.g(e, true);
            this.e0 = null;
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == kk7.X1) {
            if (((String) objArr[0]).equals(this.g0)) {
                ba4.G(i2);
                File I = ba4.I(this.f0);
                if (I != null && I.exists()) {
                    d(I);
                }
                this.g0 = null;
                this.f0 = null;
                b(-1);
            }
        } else if (i == kk7.Y1 && ((String) objArr[0]).equals(this.g0)) {
            this.g0 = null;
            this.f0 = null;
            b(-1);
        }
    }

    public final void e(defpackage.k27 r18, final float r19, int r20) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ecc.e(k27, float, int):void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.R.I();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.R.K();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Bitmap bitmap = this.w;
        if (bitmap != null) {
            bitmap.recycle();
            this.w = null;
        }
        boolean z = this.Q;
        TextPaint textPaint = this.G;
        Drawable drawable = this.y;
        if (z) {
            canvas.save();
            Path path = this.W;
            path.rewind();
            RectF rectF = gl.P;
            rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            path.addRoundRect(rectF, gl.L(6.0f), gl.L(6.0f), Path.Direction.CW);
            canvas.clipPath(path);
            canvas.scale(getWidth() / this.U, getHeight() / this.V);
            canvas.translate(-this.S, -this.T);
            ImageReceiver imageReceiver = this.R;
            imageReceiver.i0(0.0f, 0.0f, imageReceiver.q(), imageReceiver.o());
            imageReceiver.h(canvas, null);
            canvas.restore();
            drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            drawable.draw(canvas);
            canvas.drawText(this.E, (getMeasuredWidth() - this.F) / 2.0f, getMeasuredHeight() - gl.L(9.0f), textPaint);
        } else if (this.x != null && this.H != null) {
            Matrix matrix = this.M;
            matrix.reset();
            float measuredWidth = getMeasuredWidth() / this.x.getWidth();
            matrix.preScale(measuredWidth, measuredWidth);
            RectF rectF2 = this.L;
            rectF2.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            canvas.drawRoundRect(rectF2, gl.L(6.0f), gl.L(6.0f), this.K);
            drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            drawable.draw(canvas);
            canvas.drawText(this.E, (getMeasuredWidth() - this.F) / 2.0f, getMeasuredHeight() - gl.L(9.0f), textPaint);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setPivotY(getMeasuredHeight());
    }
}
