package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.webrtc.RendererCommon;
public class aic extends FrameLayout {
    public float E;
    public boolean F;
    public long G;
    public final ArrayList H;
    public int I;
    public int J;
    public float K;
    public float L;
    public float M;
    public float N;
    public float O;
    public float P;
    public float Q;
    public float R;
    public float S;
    public float T;
    public float U;
    public float V;
    public float W;
    public final boolean a;
    public float a0;
    public float b;
    public byte b0;
    public boolean c;
    public ValueAnimator c0;
    public final zhc d;
    public boolean d0;
    public final TextureView e;
    public float e0;
    public final ImageView f;
    public boolean f0;
    public boolean g0;
    public final View h;
    public View n;
    public final FrameLayout r;
    public final ImageView s;
    public final TextView w;
    public Bitmap x;
    public final Bitmap y;

    public aic(Context context, boolean z, boolean z2, boolean z3, boolean z4) {
        super(context);
        this.E = 1.0f;
        this.H = new ArrayList();
        this.Q = 1.0f;
        this.R = 1.0f;
        this.S = 1.0f;
        this.a = z2;
        ImageView imageView = new ImageView(context);
        this.f = imageView;
        zhc zhcVar = new zhc(this, context);
        this.d = zhcVar;
        zhcVar.setFpsReduction(30.0f);
        zhcVar.setOpaque(false);
        zhcVar.setEnableHardwareScaler(true);
        zhcVar.setIsCamera(!z2);
        if (!z) {
            if (z2) {
                View view = new View(context);
                this.h = view;
                view.setBackgroundColor(-14999773);
                addView(view, nme.c(-1.0f, -1));
                if (z4) {
                    TextureView textureView = new TextureView(context);
                    this.e = textureView;
                    addView(textureView, nme.e(-1, -2, 17));
                }
                zhcVar.setScalingType(RendererCommon.ScalingType.SCALE_ASPECT_FIT);
                addView(zhcVar, nme.e(-1, -2, 17));
            } else {
                if (z4) {
                    TextureView textureView2 = new TextureView(context);
                    this.e = textureView2;
                    addView(textureView2, nme.e(-1, -2, 17));
                }
                addView(zhcVar, nme.e(-1, -2, 17));
            }
        } else {
            if (z4) {
                TextureView textureView3 = new TextureView(context);
                this.e = textureView3;
                addView(textureView3, nme.e(-1, -2, 17));
            }
            addView(zhcVar);
        }
        addView(imageView);
        TextureView textureView4 = this.e;
        if (textureView4 != null) {
            textureView4.setOpaque(false);
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.r = frameLayout;
        frameLayout.setBackground(new ye7(-14602694, -13935795, -14395293, -14203560, true, false));
        addView(frameLayout, nme.c(-1.0f, -1));
        frameLayout.setVisibility(8);
        ImageView imageView2 = new ImageView(getContext());
        this.s = imageView2;
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        imageView2.setImageResource(2131232684);
        frameLayout.addView(imageView2, nme.d(82, 82.0f, 17, 0.0f, 0.0f, 0.0f, 60.0f));
        TextView textView = new TextView(getContext());
        this.w = textView;
        textView.setText(k96.M0(2131742980, null));
        textView.setGravity(17);
        textView.setLineSpacing(gl.L(2.0f), 1.0f);
        textView.setTextColor(-1);
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(gl.o());
        frameLayout.addView(textView, nme.d(-1, -2.0f, 17, 21.0f, 28.0f, 21.0f, 0.0f));
        if (z3) {
            setOutlineProvider(new cl0(this, (byte) 8));
            setClipToOutline(true);
        }
        if (z && this.y == null) {
            try {
                Bitmap decodeFile = BitmapFactory.decodeFile(new File(a.h(), "voip_icthumb.jpg").getAbsolutePath());
                this.y = decodeFile;
                if (decodeFile == null) {
                    decodeFile = BitmapFactory.decodeFile(new File(a.h(), "icthumb.jpg").getAbsolutePath());
                    this.y = decodeFile;
                }
                imageView.setImageBitmap(decodeFile);
                imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            } catch (Throwable unused) {
            }
        }
        if (!z2) {
            this.d.setScreenRotation(((WindowManager) getContext().getSystemService("window")).getDefaultDisplay().getRotation());
        }
    }

    public void a() {
        if (!this.F && getMeasuredHeight() != 0 && getMeasuredWidth() != 0) {
            this.I = getMeasuredHeight();
            this.J = getMeasuredWidth();
            if (this.g0 && getParent() != null) {
                View view = (View) getParent();
                this.K = view.getY();
                this.L = view.getX();
            } else {
                this.K = getY();
                this.L = getX();
            }
            this.Q = this.U;
            this.R = this.V;
            this.S = this.W;
            zhc zhcVar = this.d;
            this.T = zhcVar.getMeasuredWidth();
            zhcVar.getMeasuredHeight();
            this.F = true;
            requestLayout();
        }
    }

    public void b() {
        invalidate();
        zhc zhcVar = this.d;
        if (zhcVar.getAlpha() != 1.0f) {
            zhcVar.animate().setDuration(300L).alpha(1.0f);
        }
        TextureView textureView = this.e;
        if (textureView != null && textureView.getAlpha() != 1.0f) {
            textureView.animate().setDuration(300L).alpha(1.0f);
        }
    }

    public final void c() {
        Bitmap bitmap = this.d.getBitmap(150, 150);
        if (bitmap != null && bitmap.getPixel(0, 0) != 0) {
            Utilities.blurBitmap(bitmap, 3);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(new File(a.h(), "voip_icthumb.jpg"));
                bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                fileOutputStream.close();
            } catch (Throwable unused) {
            }
        }
    }

    public final void d(boolean z, float f) {
        float f2;
        if (!this.c) {
            return;
        }
        float scaleX = ((View) getParent()).getScaleX();
        this.w.setAlpha(1.0f - f);
        if (!z) {
            f2 = de9.x(0.4f, scaleX, f, 1.0f / scaleX);
        } else {
            f2 = 1.0f - (0.4f * f);
        }
        ImageView imageView = this.s;
        imageView.setScaleX(f2);
        imageView.setScaleY(f2);
        imageView.setTranslationY(gl.L(60.0f) * f);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        boolean z = gl.m0;
        zhc zhcVar = this.d;
        if (z) {
            TextureView textureView = this.e;
            if (textureView != null) {
                canvas.save();
                canvas.translate(textureView.getX(), textureView.getY());
                Bitmap bitmap = textureView.getBitmap();
                if (bitmap != null) {
                    canvas.scale(textureView.getWidth() / bitmap.getWidth(), textureView.getHeight() / bitmap.getHeight());
                    canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                }
                canvas.restore();
            }
            if (zhcVar != null) {
                canvas.save();
                canvas.translate(zhcVar.getX(), zhcVar.getY());
                Bitmap bitmap2 = zhcVar.getBitmap();
                if (bitmap2 != null) {
                    canvas.scale(zhcVar.getWidth() / bitmap2.getWidth(), zhcVar.getHeight() / bitmap2.getHeight());
                    canvas.drawBitmap(bitmap2, 0.0f, 0.0f, (Paint) null);
                }
                canvas.restore();
            }
        }
        ImageView imageView = this.f;
        if (imageView.getVisibility() == 0 && zhcVar.isFirstFrameRendered()) {
            float f = this.E - 0.10666667f;
            this.E = f;
            if (f <= 0.0f) {
                this.E = 0.0f;
                imageView.setVisibility(8);
                return;
            }
            invalidate();
            imageView.setAlpha(this.E);
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j) {
        if (gl.m0 && (view == this.d || view == this.e)) {
            return false;
        }
        return super.drawChild(canvas, view, j);
    }

    public void e() {
        TextureView textureView = this.e;
        if (textureView != null) {
            ViewGroup.LayoutParams layoutParams = textureView.getLayoutParams();
            zhc zhcVar = this.d;
            layoutParams.width = zhcVar.getMeasuredWidth();
            textureView.getLayoutParams().height = zhcVar.getMeasuredHeight();
        }
    }

    public View getPlaceholderView() {
        if (this.n == null) {
            View view = new View(getContext());
            this.n = view;
            addView(view, nme.g());
        }
        return this.n;
    }

    @Override
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float top;
        float left;
        super.onLayout(z, i, i2, i3, i4);
        TextureView textureView = this.e;
        if (textureView != null) {
            this.V = Math.max(getMeasuredHeight() / textureView.getMeasuredHeight(), getMeasuredWidth() / textureView.getMeasuredWidth());
        }
        boolean z2 = this.a;
        zhc zhcVar = this.d;
        if (!z2) {
            zhcVar.updateRotation();
        }
        if (this.b0 == 3) {
            if (textureView != null) {
                textureView.setScaleX(this.V);
                textureView.setScaleY(this.V);
                return;
            }
            return;
        }
        if (zhcVar.getMeasuredHeight() != 0 && zhcVar.getMeasuredWidth() != 0 && getMeasuredHeight() != 0 && getMeasuredWidth() != 0) {
            byte b = this.b0;
            if (b == 0) {
                this.U = Math.max(getMeasuredHeight() / zhcVar.getMeasuredHeight(), getMeasuredWidth() / zhcVar.getMeasuredWidth());
            } else if (b == 2) {
                if (Math.abs((getMeasuredHeight() / getMeasuredWidth()) - 1.0f) < 0.02f) {
                    this.U = Math.max(getMeasuredHeight() / zhcVar.getMeasuredHeight(), getMeasuredWidth() / zhcVar.getMeasuredWidth());
                } else if (getMeasuredWidth() > getMeasuredHeight() && zhcVar.getMeasuredHeight() > zhcVar.getMeasuredWidth()) {
                    this.U = Math.max(getMeasuredHeight() / zhcVar.getMeasuredHeight(), (getMeasuredWidth() / 2.0f) / zhcVar.getMeasuredWidth());
                } else {
                    this.U = Math.min(getMeasuredHeight() / zhcVar.getMeasuredHeight(), getMeasuredWidth() / zhcVar.getMeasuredWidth());
                }
            } else if (b == 1) {
                this.U = Math.min(getMeasuredHeight() / zhcVar.getMeasuredHeight(), getMeasuredWidth() / zhcVar.getMeasuredWidth());
                if (this.d0 && !this.g0 && this.c0 == null && !this.F) {
                    this.P = (getMeasuredWidth() - zhcVar.getMeasuredWidth()) / 2.0f;
                    this.O = (getMeasuredHeight() - zhcVar.getMeasuredHeight()) / 2.0f;
                    invalidateOutline();
                }
            }
        } else {
            this.U = 1.0f;
            if (this.c0 == null && !this.F) {
                this.P = 0.0f;
                this.O = 0.0f;
            }
        }
        if (this.x != null) {
            this.W = Math.max(getMeasuredWidth() / this.x.getWidth(), getMeasuredHeight() / this.x.getHeight());
        }
        if (this.F) {
            this.Q /= zhcVar.getMeasuredWidth() / this.T;
            this.R /= zhcVar.getMeasuredWidth() / this.T;
            this.F = false;
            if (this.g0 && getParent() != null) {
                View view = (View) getParent();
                top = this.K - view.getTop();
                left = this.L - view.getLeft();
            } else {
                top = this.K - getTop();
                left = this.L - getLeft();
            }
            this.M = 0.0f;
            this.N = 0.0f;
            if (this.I != getMeasuredHeight()) {
                float measuredHeight = (getMeasuredHeight() - this.I) / 2.0f;
                this.M = measuredHeight;
                top -= measuredHeight;
            }
            final float f = top;
            if (this.J != getMeasuredWidth()) {
                float measuredWidth = (getMeasuredWidth() - this.J) / 2.0f;
                this.N = measuredWidth;
                left -= measuredWidth;
            }
            final float f2 = left;
            setTranslationY(f);
            setTranslationX(f2);
            ValueAnimator valueAnimator = this.c0;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.c0.cancel();
            }
            zhcVar.setScaleX(this.Q);
            zhcVar.setScaleY(this.Q);
            if (textureView != null) {
                textureView.setScaleX(this.R);
                textureView.setScaleY(this.R);
            }
            this.O = this.M;
            this.P = this.N;
            invalidateOutline();
            invalidate();
            final float f3 = this.Q;
            final float f4 = this.R;
            final float f5 = this.S;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            this.c0 = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                    float f6 = 1.0f - floatValue;
                    aic aicVar = aic.this;
                    aicVar.e0 = f6;
                    aicVar.O = aicVar.M * floatValue;
                    aicVar.P = aicVar.N * floatValue;
                    aicVar.invalidateOutline();
                    aicVar.invalidate();
                    float f7 = (aicVar.U * f6) + (f3 * floatValue);
                    zhc zhcVar2 = aicVar.d;
                    zhcVar2.setScaleX(f7);
                    zhcVar2.setScaleY(f7);
                    float f8 = (aicVar.V * f6) + (f4 * floatValue);
                    TextureView textureView2 = aicVar.e;
                    if (textureView2 != null) {
                        textureView2.setScaleX(f8);
                        textureView2.setScaleY(f8);
                    }
                    aicVar.setTranslationX(f2 * floatValue);
                    aicVar.setTranslationY(f * floatValue);
                    aicVar.a0 = (aicVar.W * f6) + (f5 * floatValue);
                }
            });
            long j = this.G;
            int i5 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
            ValueAnimator valueAnimator2 = this.c0;
            if (i5 != 0) {
                valueAnimator2.setDuration(j);
            } else {
                valueAnimator2.setDuration(350L);
            }
            this.c0.setInterpolator(s33.f);
            this.c0.addListener(new iab(this, (byte) 20));
            this.c0.start();
            ArrayList arrayList = this.H;
            if (!arrayList.isEmpty()) {
                for (int i6 = 0; i6 < arrayList.size(); i6++) {
                    ((Animator) arrayList.get(i6)).start();
                }
            }
            arrayList.clear();
            this.G = 0L;
        } else if (this.c0 == null) {
            zhcVar.setScaleX(this.U);
            zhcVar.setScaleY(this.U);
            if (textureView != null) {
                textureView.setScaleX(this.V);
                textureView.setScaleY(this.V);
            }
            this.a0 = this.W;
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        boolean z = this.a;
        zhc zhcVar = this.d;
        if (!z) {
            this.f0 = true;
            zhcVar.setScreenRotation(((WindowManager) getContext().getSystemService("window")).getDefaultDisplay().getRotation());
            this.f0 = false;
        }
        super.onMeasure(i, i2);
        e();
        super.onMeasure(i, i2);
        zhcVar.updateRotation();
    }

    @Override
    public void requestLayout() {
        if (this.f0) {
            return;
        }
        super.requestLayout();
    }

    public void setAnimateNextDuration(long j) {
        this.G = j;
    }

    public void setAnimateWithParent(boolean z) {
        this.g0 = z;
    }

    public void setIsScreencast(boolean z) {
        int i;
        this.c = z;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        this.r.setVisibility(i);
        boolean z2 = this.c;
        TextureView textureView = this.e;
        zhc zhcVar = this.d;
        if (z2) {
            zhcVar.setVisibility(8);
            if (textureView != null) {
                textureView.setVisibility(8);
            }
            this.f.setVisibility(8);
            return;
        }
        zhcVar.setVisibility(0);
        if (textureView != null) {
            textureView.setVisibility(0);
        }
    }

    public void setRoundCorners(float f) {
        if (this.b != f) {
            this.b = f;
            invalidateOutline();
        }
    }

    public void setStub(aic aicVar) {
        if (this.c) {
            return;
        }
        Bitmap bitmap = aicVar.d.getBitmap();
        ImageView imageView = this.f;
        if (bitmap != null && bitmap.getPixel(0, 0) != 0) {
            imageView.setImageBitmap(bitmap);
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        } else {
            imageView.setImageDrawable(aicVar.f.getDrawable());
        }
        this.E = 1.0f;
        imageView.setVisibility(0);
        imageView.setAlpha(1.0f);
    }

    public void setThumb(Bitmap bitmap) {
        this.x = bitmap;
    }

    public aic(Context context, boolean z, boolean z2) {
        this(context, z, z2, true, false);
    }
}
