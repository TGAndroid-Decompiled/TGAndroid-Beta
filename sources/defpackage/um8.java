package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.io.File;
import java.io.FileOutputStream;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.ActionBar.a;
import org.webrtc.RendererCommon;
public abstract class um8 extends FrameLayout implements VoIPService.StateListener {
    public float E;
    public float F;
    public float G;
    public float H;
    public float I;
    public final float J;
    public final float K;
    public final Path L;
    public final Camera M;
    public final Matrix N;
    public final Matrix O;
    public final boolean P;
    public final eq Q;
    public final eq R;
    public final ah7 S;
    public final ah7 T;
    public final GestureDetector U;
    public ValueAnimator V;
    public boolean a;
    public final ne6 b;
    public final sm8 c;
    public final qmb d;
    public final fkc[] e;
    public final akc f;
    public int h;
    public boolean n;
    public final a r;
    public float s;
    public int w;
    public int x;
    public int y;

    public um8(Context context, float f, float f2) {
        super(context);
        String M0;
        this.h = 1;
        this.y = -1;
        this.E = 0.0f;
        this.F = 0.0f;
        this.G = 0.0f;
        this.L = new Path();
        this.M = new Camera();
        this.N = new Matrix();
        this.O = new Matrix();
        this.Q = new eq(80, 80);
        this.R = new eq(80, 80);
        this.S = new ah7(-10497967, -16730994, -5649306, -10833593, false, true);
        this.T = new ah7(-16735258, -14061833, -15151390, -12602625, false, true);
        this.J = f;
        this.K = f2;
        this.e = new fkc[3];
        cic cicVar = (cic) this;
        this.U = new GestureDetector(context, new rm8(cicVar));
        ne6 ne6Var = new ne6((byte) 13, context, cicVar);
        this.b = ne6Var;
        ne6Var.setClickable(true);
        addView(ne6Var, qoe.c(-1.0f, -1));
        akc akcVar = new akc(context, false, false);
        this.f = akcVar;
        RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FILL;
        zjc zjcVar = akcVar.d;
        zjcVar.setScalingType(scalingType);
        akcVar.b0 = (byte) 1;
        akcVar.d0 = true;
        zjcVar.setAlpha(0.0f);
        zjcVar.setRotateTextureWithScreen(true);
        zjcVar.setUseCameraRotation(true);
        addView(akcVar, qoe.c(-1.0f, -1));
        a aVar = new a(context, null);
        this.r = aVar;
        aVar.setBackButtonDrawable(new ee0(false));
        aVar.setBackgroundColor(0);
        anb.l(aVar, 1, cmb.Xg, null);
        aVar.setOccupyStatusBar(true);
        aVar.setActionBarMenuOnItemClick(new im8(cicVar, (byte) 2));
        addView(aVar);
        sm8 sm8Var = new sm8(cicVar, getContext());
        this.c = sm8Var;
        sm8Var.setMaxLines(1);
        sm8Var.setEllipsize(null);
        sm8Var.setMinWidth(gm.L(64.0f));
        sm8Var.setTag(-1);
        sm8Var.setTextSize(1, 14.0f);
        int i = cmb.dh;
        anb.X(sm8Var, i, null);
        sm8Var.setGravity(17);
        sm8Var.setTypeface(gm.o());
        sm8Var.getPaint().setTextAlign(Paint.Align.CENTER);
        sm8Var.setContentDescription(jb6.M0(2131742924, null));
        int L = gm.L(8.0f);
        int p = on2.p(cmb.w0(null, i, false), 76);
        sm8Var.setForeground(cmb.i0(L, L, L, L, 0, p, p));
        sm8Var.setPadding(0, gm.L(12.0f), 0, gm.L(12.0f));
        sm8Var.setOnClickListener(new wk8(cicVar, (byte) 4));
        addView(sm8Var, qoe.d(52, 52.0f, 81, 0.0f, 0.0f, 0.0f, 80.0f));
        qmb qmbVar = new qmb((byte) 11, context, cicVar);
        this.d = qmbVar;
        qmbVar.setClipChildren(false);
        addView(qmbVar, qoe.e(-1, 64, 80));
        for (int i2 = 0; i2 < this.e.length; i2++) {
            if (i2 == 0) {
                M0 = jb6.M0(2131742943, null);
            } else if (i2 == 1) {
                M0 = jb6.M0(2131743089, null);
            } else {
                M0 = jb6.M0(2131743177, null);
            }
            this.e[i2] = new fkc(context, M0);
            this.e[i2].setContentDescription(M0);
            this.e[i2].setPadding(gm.L(16.0f), 0, gm.L(10.0f), 0);
            this.d.addView(this.e[i2], qoe.o(-2, -1));
            this.e[i2].setOnClickListener(new v0(cicVar, i2, (byte) 17));
        }
        setWillNotDraw(false);
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            this.f.d.setMirror(sharedInstance.isFrontFaceCamera());
            this.f.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new Object());
            sharedInstance.setLocalSink(this.f.d, false);
        }
        ne6 ne6Var2 = this.b;
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setBackground(new ah7(-14602694, -13935795, -14395293, -14203560, true, false));
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131232696);
        frameLayout.addView(imageView, qoe.d(82, 82.0f, 17, 0.0f, 0.0f, 0.0f, 60.0f));
        TextView textView = new TextView(getContext());
        textView.setText(jb6.M0(2131742907, null));
        textView.setGravity(17);
        textView.setLineSpacing(gm.L(2.0f), 1.0f);
        textView.setTextColor(-1);
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(gm.o());
        frameLayout.addView(textView, qoe.d(-1, -2.0f, 17, 21.0f, 28.0f, 21.0f, 0.0f));
        frameLayout.setTag("screencast_stub");
        frameLayout.setVisibility(8);
        ne6Var2.addView(frameLayout);
        ImageView imageView2 = new ImageView(getContext());
        imageView2.setTag("image_stab");
        imageView2.setImageResource(2131231496);
        imageView2.setScaleType(ImageView.ScaleType.FIT_XY);
        ne6Var2.addView(imageView2);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new dz1(cicVar, f, f2, (byte) 5));
        ofFloat.addListener(new s38(cicVar, (byte) 22));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat2.addUpdateListener(new fx7(cicVar, (byte) 14));
        d53 d53Var = d53.f;
        ofFloat.setInterpolator(d53Var);
        ofFloat.setDuration(320L);
        ofFloat.start();
        ofFloat2.setInterpolator(d53Var);
        ofFloat2.setDuration(320L);
        ofFloat2.setStartDelay(32L);
        ofFloat2.start();
        this.d.setAlpha(0.0f);
        this.d.setScaleY(0.8f);
        this.d.setScaleX(0.8f);
        this.d.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setStartDelay(120L).setDuration(250L).start();
        this.c.setTranslationY(gm.L(53.0f));
        this.c.setTranslationX((f - (gm.q.x / 2.0f)) + gm.L(8.0f) + gm.L(26.0f));
        this.c.animate().translationY(0.0f).translationX(0.0f).setDuration(320L).start();
        this.P = true;
        c(1, false);
    }

    public final void a(boolean z, boolean z2) {
        if (!this.a && this.E == 1.0f) {
            cic cicVar = (cic) this;
            cicVar.W.w.T = false;
            cicVar.W.w.invalidate();
            this.a = true;
            b();
            iic iicVar = cicVar.W;
            iicVar.o0 = null;
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            iicVar.u0.setLockOnScreen(false);
            if (z2) {
                iicVar.n0 = true;
                if (sharedInstance != null && !z) {
                    sharedInstance.requestVideoCall(false);
                    sharedInstance.setVideoState(false, 2);
                    sharedInstance.switchToSpeaker();
                }
                if (sharedInstance != null) {
                    iicVar.m(iicVar.f, sharedInstance, true);
                }
            } else if (sharedInstance != null) {
                sharedInstance.setVideoState(false, 0);
            }
            iicVar.q0 = iicVar.p0;
            iicVar.y();
            if (cicVar.W.m0 && z2) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new pm8(this, (byte) 0));
                ofFloat.setInterpolator(d53.f);
                ofFloat.setStartDelay(60L);
                ofFloat.setDuration(350L);
                ofFloat.addListener(new qm8(this, (byte) 2));
                ofFloat.start();
                this.c.animate().setStartDelay(60L).alpha(0.0f).setDuration(100L).start();
                this.r.animate().setStartDelay(60L).alpha(0.0f).setDuration(100L).start();
                this.d.animate().setStartDelay(60L).alpha(0.0f).setDuration(100L).start();
            } else if (z2) {
                animate().setStartDelay(60L).alpha(0.0f).setDuration(350L).setInterpolator(d53.f).setListener(new qm8(this, (byte) 0));
            } else {
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
                ofFloat2.addUpdateListener(new pm8(this, (byte) 1));
                ofFloat2.addListener(new qm8(this, (byte) 1));
                ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
                ofFloat3.addUpdateListener(new pm8(this, (byte) 2));
                d53 d53Var = d53.f;
                ofFloat2.setInterpolator(d53Var);
                ofFloat2.setDuration(320L);
                ofFloat2.start();
                ofFloat3.setInterpolator(d53Var);
                ofFloat3.setDuration(320L);
                ofFloat3.start();
                this.d.setAlpha(1.0f);
                this.d.setScaleY(1.0f);
                this.d.setScaleX(1.0f);
                this.d.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setDuration(250L).start();
                this.c.animate().translationY(gm.L(53.0f)).translationX((this.J - (gm.q.x / 2.0f)) + gm.L(8.0f) + gm.L(26.0f)).setDuration(192L).start();
                animate().alpha(0.0f).setDuration(80L).setStartDelay(240L).start();
            }
            invalidate();
        }
    }

    public final void b() {
        akc akcVar = this.f;
        if (this.n) {
            try {
                Bitmap bitmap = akcVar.d.getBitmap();
                if (bitmap != null) {
                    Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), akcVar.d.getMatrix(), true);
                    bitmap.recycle();
                    Bitmap createScaledBitmap = Bitmap.createScaledBitmap(createBitmap, 80, (int) (createBitmap.getHeight() / (createBitmap.getWidth() / 80.0f)), true);
                    if (createScaledBitmap != null) {
                        if (createScaledBitmap != createBitmap) {
                            createBitmap.recycle();
                        }
                        Utilities.blurBitmap(createScaledBitmap, 7);
                        File h = org.telegram.messenger.a.h();
                        FileOutputStream fileOutputStream = new FileOutputStream(new File(h, "cthumb" + this.h + ".jpg"));
                        createScaledBitmap.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream);
                        fileOutputStream.close();
                        View findViewWithTag = this.b.findViewWithTag("image_stab");
                        if (findViewWithTag instanceof ImageView) {
                            ((ImageView) findViewWithTag).setImageBitmap(createScaledBitmap);
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    public final void c(int i, boolean z) {
        int i2;
        ValueAnimator ofFloat;
        if (this.w != i && (i2 = this.x) != i) {
            akc akcVar = this.f;
            if (z) {
                if (i2 == 0) {
                    if (this.h != i) {
                        this.h = i;
                        this.n = false;
                        d(true, true);
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().switchCamera();
                        }
                    } else {
                        d(false, false);
                        akcVar.animate().alpha(1.0f).setDuration(250L).start();
                    }
                } else if (i == 0) {
                    this.b.findViewWithTag("screencast_stub").setVisibility(0);
                    b();
                    d(false, false);
                    akcVar.animate().alpha(0.0f).setDuration(250L).start();
                } else {
                    b();
                    this.h = i;
                    this.n = false;
                    d(true, false);
                    akcVar.animate().alpha(0.0f).setDuration(250L).start();
                    if (VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().switchCamera();
                    }
                }
                int i3 = this.x;
                if (i > i3) {
                    this.y = i3;
                    this.x = i3 + 1;
                    ofFloat = ValueAnimator.ofFloat(0.1f, 1.0f);
                    this.V = ofFloat;
                } else {
                    this.y = i3;
                    this.x = i3 - 1;
                    this.w = i;
                    ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                    this.V = ofFloat;
                }
                ofFloat.addUpdateListener(new pm8(this, (byte) 3));
                this.V.addListener(new co(this, i, (byte) 7));
                this.V.setInterpolator(d53.f);
                this.V.setDuration(350L);
                this.V.start();
                return;
            }
            this.x = i;
            this.w = i;
            this.s = 0.0f;
            e();
            akcVar.setVisibility(0);
            this.n = false;
            this.h = 1;
            d(true, false);
        }
    }

    public final void d(boolean z, boolean z2) {
        Bitmap bitmap;
        ImageView imageView = (ImageView) this.b.findViewWithTag("image_stab");
        if (!z) {
            imageView.setVisibility(8);
            return;
        }
        try {
            File h = org.telegram.messenger.a.h();
            bitmap = BitmapFactory.decodeFile(new File(h, "cthumb" + this.h + ".jpg").getAbsolutePath());
        } catch (Throwable unused) {
            bitmap = null;
        }
        if (bitmap != null && bitmap.getPixel(0, 0) != 0) {
            imageView.setImageBitmap(bitmap);
        } else {
            imageView.setImageResource(2131231496);
        }
        if (z2) {
            imageView.setVisibility(0);
            imageView.setAlpha(0.0f);
            imageView.animate().alpha(1.0f).setDuration(250L).start();
            return;
        }
        imageView.setAlpha(1.0f);
        imageView.setVisibility(0);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i = (this.E > 1.0f ? 1 : (this.E == 1.0f ? 0 : -1));
        Path path = this.L;
        if (i < 0) {
            Point point = gm.q;
            int i2 = point.x;
            int i3 = point.y + gm.m + gm.n;
            float L = gm.L(28.0f) - (gm.L(28.0f) * this.E);
            path.reset();
            float f = this.J;
            float f2 = this.K;
            Path.Direction direction = Path.Direction.CW;
            path.addCircle(f + gm.L(33.5f), f2 + gm.L(26.6f), gm.L(26.0f), direction);
            int L2 = gm.L(52.0f);
            int L3 = gm.L(52.0f);
            int U1 = gm.U1(this.E, L2, i2);
            int U12 = gm.U1(this.E, L3, i3);
            float L4 = this.H - ((1.0f - this.E) * gm.L(20.0f));
            float L5 = this.I - ((1.0f - this.E) * gm.L(51.0f));
            path.addRoundRect(L4, L5, U1 + L4, L5 + U12, L, L, direction);
            canvas.clipPath(path);
        }
        if (this.G > 0.0f) {
            int[] floatingViewLocation = getFloatingViewLocation();
            float f3 = this.G;
            int i4 = (int) (floatingViewLocation[0] * f3);
            int i5 = (int) (floatingViewLocation[1] * f3);
            int i6 = floatingViewLocation[2];
            int i7 = gm.q.x;
            float A = td4.A(1.0f, f3, i7 - i6, i6) / i7;
            path.reset();
            path.addRoundRect(0.0f, 0.0f, getWidth() * A, getHeight() * A, gm.L(6.0f), gm.L(6.0f), Path.Direction.CW);
            canvas.translate(i4, i5);
            canvas.clipPath(path);
            canvas.scale(A, A);
        }
        super.dispatchDraw(canvas);
    }

    public final void e() {
        fkc fkcVar;
        int i = this.w;
        fkc[] fkcVarArr = this.e;
        fkc fkcVar2 = fkcVarArr[i];
        if (i < fkcVarArr.length - 1) {
            fkcVar = fkcVarArr[i + 1];
        } else {
            fkcVar = null;
        }
        float measuredWidth = (fkcVar2.getMeasuredWidth() / 2) + fkcVar2.getLeft();
        float measuredWidth2 = (getMeasuredWidth() / 2) - measuredWidth;
        if (fkcVar != null) {
            measuredWidth2 -= (((fkcVar.getMeasuredWidth() / 2) + fkcVar.getLeft()) - measuredWidth) * this.s;
        }
        int i2 = 0;
        while (true) {
            float f = 0.7f;
            if (i2 >= fkcVarArr.length) {
                break;
            }
            int i3 = this.w;
            float f2 = 0.9f;
            if (i2 >= i3 && i2 <= i3 + 1) {
                float f3 = this.s;
                float f4 = 0.3f * f3;
                if (i2 == i3) {
                    f = 1.0f - f4;
                    f2 = 1.0f - (f3 * 0.1f);
                } else {
                    f = 0.7f + f4;
                    f2 = 0.9f + (f3 * 0.1f);
                }
            }
            fkcVarArr[i2].setAlpha(f);
            fkcVarArr[i2].setScaleX(f2);
            fkcVarArr[i2].setScaleY(f2);
            fkcVarArr[i2].setTranslationX(measuredWidth2);
            i2++;
        }
        this.c.invalidate();
        if (this.x == 0) {
            fkcVarArr[2].setAlpha(this.s * 0.7f);
        }
        if (this.x == 2) {
            float f5 = this.s;
            if (f5 > 0.0f) {
                fkcVarArr[0].setAlpha((1.0f - f5) * 0.7f);
            } else {
                fkcVarArr[0].setAlpha(0.0f);
            }
        }
        if (this.x == 1) {
            if (this.y == 0) {
                fkcVarArr[2].setAlpha(this.s * 0.7f);
            }
            if (this.y == 2) {
                fkcVarArr[0].setAlpha((1.0f - this.s) * 0.7f);
            }
        }
    }

    public int[] getFloatingViewLocation() {
        return null;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            sharedInstance.registerStateListener(this);
        }
    }

    @Override
    public final void onCameraFirstFrameAvailable() {
        if (!this.n) {
            this.n = true;
            if (this.x != 0) {
                this.f.animate().alpha(1.0f).setDuration(250L).start();
            }
        }
    }

    @Override
    public final void onCameraSwitch(boolean z) {
        if (VoIPService.getSharedInstance() != null) {
            this.f.d.setMirror(VoIPService.getSharedInstance().isFrontFaceCamera());
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            sharedInstance.unregisterStateListener(this);
        }
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        e();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        measureChildWithMargins(this.d, 0, 0, View.MeasureSpec.makeMeasureSpec(gm.L(64.0f), 1073741824), 0);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public void setBottomPadding(int i) {
        ((FrameLayout.LayoutParams) this.c.getLayoutParams()).bottomMargin = gm.L(80.0f) + i;
        ((FrameLayout.LayoutParams) this.d.getLayoutParams()).bottomMargin = i;
    }

    @Override
    public final void onAudioSettingsChanged() {
    }

    @Override
    public final void onScreenOnChange(boolean z) {
    }

    @Override
    public final void onSignalBarsCountChanged(int i) {
    }

    @Override
    public final void onStateChanged(int i) {
    }

    @Override
    public final void onVideoAvailableChange(boolean z) {
    }

    @Override
    public final void onMediaStateUpdated(int i, int i2) {
    }
}
