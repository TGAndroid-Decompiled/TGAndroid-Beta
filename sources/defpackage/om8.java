package defpackage;

import android.graphics.Bitmap;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.io.File;
import java.io.FileOutputStream;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.LaunchActivity;
import org.webrtc.RendererCommon;
public abstract class om8 extends FrameLayout implements VoIPService.StateListener {
    public final boolean E;
    public boolean a;
    public final ggc b;
    public final t8 c;
    public final LinearLayout d;
    public final s09 e;
    public final TextView[] f;
    public final akc h;
    public byte n;
    public byte r;
    public boolean s;
    public boolean w;
    public float x;
    public int y;

    public om8(LaunchActivity launchActivity, boolean z) {
        super(launchActivity);
        int i;
        this.n = (byte) 1;
        this.r = (byte) 1;
        this.E = z;
        if (z) {
            i = 3;
        } else {
            i = 2;
        }
        this.f = new TextView[i];
        ggc ggcVar = new ggc(launchActivity);
        this.b = ggcVar;
        gm.w3(ggcVar, 2130706432);
        ggcVar.setAdapter(new db5(this, (byte) 3));
        ggcVar.setPageMargin(0);
        ggcVar.setOffscreenPageLimit(1);
        addView(ggcVar, qoe.c(-1.0f, -1));
        ggcVar.b(new mm8(this));
        akc akcVar = new akc(launchActivity, false, false);
        this.h = akcVar;
        RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FILL;
        zjc zjcVar = akcVar.d;
        zjcVar.setScalingType(scalingType);
        akcVar.b0 = (byte) 1;
        akcVar.d0 = true;
        zjcVar.setAlpha(0.0f);
        zjcVar.setRotateTextureWithScreen(true);
        zjcVar.setUseCameraRotation(true);
        addView(akcVar, qoe.c(-1.0f, -1));
        a aVar = new a(launchActivity, null);
        aVar.setBackButtonDrawable(new ee0(false));
        aVar.setBackgroundColor(0);
        anb.l(aVar, 1, cmb.Xg, null);
        aVar.setOccupyStatusBar(true);
        aVar.setActionBarMenuOnItemClick(new im8(this, (byte) 1));
        addView(aVar);
        t8 t8Var = new t8(this, getContext());
        this.c = t8Var;
        t8Var.setMinWidth(gm.L(64.0f));
        t8Var.setTag(-1);
        t8Var.setTextSize(1, 14.0f);
        int i2 = cmb.dh;
        anb.X(t8Var, i2, null);
        t8Var.setGravity(17);
        t8Var.setTypeface(gm.o());
        t8Var.setText(jb6.M0(2131742924, null));
        int L = gm.L(6.0f);
        int p = on2.p(cmb.w0(null, i2, false), 76);
        t8Var.setForeground(cmb.i0(L, L, L, L, 0, p, p));
        t8Var.setPadding(0, gm.L(12.0f), 0, gm.L(12.0f));
        t8Var.setOnClickListener(new wk8(this, (byte) 3));
        addView(t8Var, qoe.d(-1, 48.0f, 80, 0.0f, 0.0f, 0.0f, 64.0f));
        LinearLayout linearLayout = new LinearLayout(launchActivity);
        this.d = linearLayout;
        addView(linearLayout, qoe.e(-2, 64, 80));
        int i3 = 0;
        while (true) {
            TextView[] textViewArr = this.f;
            if (i3 >= textViewArr.length) {
                break;
            }
            textViewArr[i3] = new TextView(launchActivity);
            this.f[i3].setTextSize(1, 12.0f);
            this.f[i3].setTextColor(-1);
            this.f[i3].setTypeface(gm.o());
            this.f[i3].setPadding(gm.L(10.0f), 0, gm.L(10.0f), 0);
            this.f[i3].setGravity(16);
            this.f[i3].setSingleLine(true);
            this.d.addView(this.f[i3], qoe.o(-2, -1));
            if (i3 == 0) {
                if (this.E) {
                    this.f[i3].setText(jb6.M0(2131742943, null));
                }
                this.f[i3].setText(jb6.M0(2131743089, null));
            } else {
                if (i3 != 1 || !this.E) {
                    this.f[i3].setText(jb6.M0(2131743177, null));
                }
                this.f[i3].setText(jb6.M0(2131743089, null));
            }
            this.f[i3].setOnClickListener(new v0(this, i3, (byte) 16));
            i3++;
        }
        setAlpha(0.0f);
        setTranslationX(gm.L(32.0f));
        animate().alpha(1.0f).translationX(0.0f).setDuration(150L).start();
        setWillNotDraw(false);
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            this.h.d.setMirror(sharedInstance.isFrontFaceCamera());
            this.h.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new Object());
            sharedInstance.setLocalSink(this.h.d, false);
        }
        this.b.setCurrentItem(this.E ? 1 : 0);
        ?? imageView = new ImageView(launchActivity);
        this.e = imageView;
        imageView.setPadding(gm.L(9.0f), gm.L(9.0f), gm.L(9.0f), gm.L(9.0f));
        imageView.setBackground(cmb.K(gm.L(48.0f), on2.p(-16777216, 76)));
        p09 p09Var = new p09(2131624327, gm.L(24.0f), gm.L(24.0f), true, null);
        imageView.setAnimation(p09Var);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.w = true;
        p09Var.H(69);
        imageView.setOnClickListener(new n06(this, p09Var, (byte) 23));
        addView((View) imageView, qoe.d(48, 48.0f, 83, 24.0f, 0.0f, 0.0f, 136.0f));
    }

    public final void a(boolean z, boolean z2) {
        if (this.a) {
            return;
        }
        this.a = true;
        c();
        g95 g95Var = ((y75) this).F;
        boolean z3 = g95Var.t2.w;
        g95Var.t2 = null;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (z2) {
            if (sharedInstance != null) {
                sharedInstance.setupCaptureDevice(z, z3);
            }
            if (z && sharedInstance != null) {
                sharedInstance.setVideoState(false, 0);
            }
            g95Var.L1(true, false);
            g95Var.T2.B();
            g95Var.D0(true);
            g95Var.o1.requestLayout();
        } else if (sharedInstance != null) {
            sharedInstance.setVideoState(false, 0);
        }
        animate().alpha(0.0f).translationX(gm.L(32.0f)).setDuration(150L).setListener(new s38(this, (byte) 21));
        invalidate();
    }

    public final void b() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (this.n != this.r && sharedInstance != null) {
            boolean isFrontFaceCamera = sharedInstance.isFrontFaceCamera();
            byte b = this.n;
            if ((b == 1 && !isFrontFaceCamera) || (b == 2 && isFrontFaceCamera)) {
                c();
                this.s = false;
                VoIPService.getSharedInstance().switchCamera();
                this.h.setAlpha(0.0f);
            }
            this.r = this.n;
        }
    }

    public final void c() {
        akc akcVar = this.h;
        if (this.s) {
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
                        createScaledBitmap.compress(Bitmap.CompressFormat.JPEG, 87, new FileOutputStream(new File(h, "cthumb" + ((int) this.r) + ".jpg")));
                        View findViewWithTag = this.b.findViewWithTag(Integer.valueOf(this.r - (!this.E ? 1 : 0)));
                        if (findViewWithTag instanceof ImageView) {
                            ((ImageView) findViewWithTag).setImageBitmap(createScaledBitmap);
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    public final void d() {
        TextView textView;
        int i = this.y;
        TextView[] textViewArr = this.f;
        TextView textView2 = textViewArr[i];
        if (i < textViewArr.length - 1) {
            textView = textViewArr[i + 1];
        } else {
            textView = null;
        }
        getMeasuredWidth();
        float measuredWidth = (textView2.getMeasuredWidth() / 2) + textView2.getLeft();
        float measuredWidth2 = (getMeasuredWidth() / 2) - measuredWidth;
        if (textView != null) {
            measuredWidth2 -= (((textView.getMeasuredWidth() / 2) + textView.getLeft()) - measuredWidth) * this.x;
        }
        for (int i2 = 0; i2 < textViewArr.length; i2++) {
            int i3 = this.y;
            float f = 0.9f;
            float f2 = 0.7f;
            if (i2 >= i3 && i2 <= i3 + 1) {
                float f3 = this.x;
                float f4 = 0.3f * f3;
                if (i2 == i3) {
                    f2 = 1.0f - f4;
                    f = 1.0f - (f3 * 0.1f);
                } else {
                    f2 = 0.7f + f4;
                    f = 0.9f + (f3 * 0.1f);
                }
            }
            textViewArr[i2].setAlpha(f2);
            textViewArr[i2].setScaleX(f);
            textViewArr[i2].setScaleY(f);
        }
        this.d.setTranslationX(measuredWidth2);
        this.c.invalidate();
        boolean z = this.E;
        akc akcVar = this.h;
        if (z && this.y == 0 && this.x <= 0.0f) {
            akcVar.setVisibility(4);
            return;
        }
        akcVar.setVisibility(0);
        int i4 = this.y + (!z ? 1 : 0);
        byte b = this.n;
        float f5 = this.x;
        if (i4 == b) {
            akcVar.setTranslationX((-f5) * getMeasuredWidth());
        } else {
            akcVar.setTranslationX((1.0f - f5) * getMeasuredWidth());
        }
    }

    public int getBackgroundColor() {
        return on2.p(cmb.w0(null, cmb.Wg, false), (int) (getAlpha() * 1.0f * 255.0f));
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        if (getParent() != null) {
            ((View) getParent()).invalidate();
        }
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
        if (!this.s) {
            this.s = true;
            this.h.animate().alpha(1.0f).setDuration(250L);
        }
    }

    @Override
    public final void onCameraSwitch(boolean z) {
        if (VoIPService.getSharedInstance() != null) {
            this.h.d.setMirror(VoIPService.getSharedInstance().isFrontFaceCamera());
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
        d();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        boolean z;
        if (View.MeasureSpec.getSize(i) > View.MeasureSpec.getSize(i2)) {
            z = true;
        } else {
            z = false;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.c.getLayoutParams();
        if (z) {
            int L = gm.L(80.0f);
            marginLayoutParams.leftMargin = L;
            marginLayoutParams.rightMargin = L;
        } else {
            int L2 = gm.L(16.0f);
            marginLayoutParams.leftMargin = L2;
            marginLayoutParams.rightMargin = L2;
        }
        s09 s09Var = this.e;
        if (s09Var != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) s09Var.getLayoutParams();
            if (z) {
                int L3 = gm.L(88.0f);
                marginLayoutParams2.leftMargin = L3;
                marginLayoutParams2.rightMargin = L3;
            } else {
                int L4 = gm.L(24.0f);
                marginLayoutParams2.leftMargin = L4;
                marginLayoutParams2.rightMargin = L4;
            }
        }
        super.onMeasure(i, i2);
        measureChildWithMargins(this.d, 0, 0, View.MeasureSpec.makeMeasureSpec(gm.L(64.0f), 1073741824), 0);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public void setBottomPadding(int i) {
        ((FrameLayout.LayoutParams) this.c.getLayoutParams()).bottomMargin = gm.L(64.0f) + i;
        ((FrameLayout.LayoutParams) this.d.getLayoutParams()).bottomMargin = i;
        ((FrameLayout.LayoutParams) this.e.getLayoutParams()).bottomMargin = gm.L(136.0f) + i;
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
