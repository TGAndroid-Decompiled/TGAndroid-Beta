package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.view.TextureView;
import android.view.View;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.voip.OrientationHelper;
import org.telegram.messenger.voip.VoIPService;
import org.webrtc.EglBase;
import org.webrtc.Logging;
import org.webrtc.RendererCommon;
import org.webrtc.ThreadUtils;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;
public class bnb extends TextureView implements TextureView.SurfaceTextureListener, VideoSink, RendererCommon.RendererEvents {
    public boolean E;
    public int F;
    public zmb G;
    public int H;
    public VideoSink I;
    public Runnable J;
    public int K;
    public boolean L;
    public final String a;
    public final pmc b;
    public final anb c;
    public RendererCommon.RendererEvents d;
    public int e;
    public int f;
    public int h;
    public int n;
    public boolean r;
    public int s;
    public int w;
    public boolean x;
    public boolean y;

    public bnb(Context context) {
        super(context);
        ?? obj = new Object();
        RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_BALANCED;
        obj.a = pmc.a(scalingType);
        obj.b = pmc.a(scalingType);
        this.b = obj;
        String resourceName = getResourceName();
        this.a = resourceName;
        this.c = new anb(resourceName);
        setSurfaceTextureListener(this);
    }

    private String getResourceName() {
        try {
            return getResources().getResourceEntryName(getId());
        } catch (Resources.NotFoundException unused) {
            return "";
        }
    }

    public final void a() {
        anb anbVar = this.c;
        synchronized (anbVar.c) {
            d1 d1Var = anbVar.d;
            if (d1Var != null) {
                d1Var.postAtFrontOfQueue(new ojc(anbVar, (byte) 1));
            }
        }
        anbVar.a = false;
        this.c.P = false;
    }

    public final void b(EglBase.Context context, RendererCommon.RendererEvents rendererEvents) {
        c(context, rendererEvents, EglBase.CONFIG_PLAIN, new nkc());
    }

    public final void c(EglBase.Context context, RendererCommon.RendererEvents rendererEvents, int[] iArr, nkc nkcVar) {
        ThreadUtils.checkIsOnMainThread();
        this.d = rendererEvents;
        this.e = 0;
        this.f = 0;
        anb anbVar = this.c;
        anbVar.getClass();
        ThreadUtils.checkIsOnMainThread();
        anbVar.M = this;
        synchronized (anbVar.N) {
            anbVar.P = false;
            anbVar.Q = 0;
            anbVar.R = 0;
            anbVar.S = 0;
        }
        anbVar.b(context, iArr, nkcVar);
    }

    public final void d() {
        int i;
        int i2;
        if (this.L) {
            i = OrientationHelper.cameraOrientation;
        } else {
            i = 0;
        }
        boolean z = this.y;
        if (z) {
            i = 360 - i;
        }
        int i3 = -i;
        if (this.L) {
            int i4 = this.F;
            if (i4 == 1) {
                if (z) {
                    i2 = 90;
                } else {
                    i2 = -90;
                }
            } else if (i4 == 3) {
                if (z) {
                    i2 = 270;
                } else {
                    i2 = -270;
                }
            }
            i3 += i2;
        }
        this.c.i(i3);
        this.c.h(this.y);
    }

    public final void e() {
        anb anbVar = this.c;
        anbVar.c("Releasing.");
        CountDownLatch countDownLatch = new CountDownLatch(1);
        synchronized (anbVar.c) {
            d1 d1Var = anbVar.d;
            if (d1Var == null) {
                anbVar.c("Already released");
            } else {
                d1Var.postAtFrontOfQueue(new c9c(anbVar, countDownLatch, (byte) 25));
                anbVar.d.post(new c9c(anbVar, anbVar.d.getLooper(), (byte) 26));
                anbVar.d = null;
                ThreadUtils.awaitUninterruptibly(countDownLatch);
                synchronized (anbVar.y) {
                    VideoFrame videoFrame = anbVar.E;
                    if (videoFrame != null) {
                        videoFrame.release();
                        anbVar.E = null;
                    }
                }
                anbVar.c("Releasing done.");
            }
        }
        zmb zmbVar = this.G;
        if (zmbVar != null) {
            zmbVar.stop();
        }
    }

    public final void f() {
        View view;
        float f;
        float f2;
        float min;
        if (this.G != null && this.e != 0 && this.f != 0 && (view = (View) getParent()) != null) {
            int orientation = this.G.getOrientation();
            float measuredWidth = getMeasuredWidth();
            float measuredHeight = getMeasuredHeight();
            float measuredWidth2 = view.getMeasuredWidth();
            float measuredHeight2 = view.getMeasuredHeight();
            if (orientation != 90 && orientation != 270) {
                f2 = measuredWidth;
                f = measuredHeight;
            } else {
                f = measuredWidth;
                f2 = measuredHeight;
            }
            float f3 = f2 / measuredWidth;
            float f4 = f / measuredHeight;
            if (f2 < f) {
                min = Math.max(f3, f4);
            } else {
                min = Math.min(f3, f4);
            }
            float f5 = f2 * min;
            float f6 = f * min;
            if (Math.abs((f5 / f6) - (measuredWidth2 / measuredHeight2)) < 0.1f) {
                min *= Math.max(measuredWidth2 / f5, measuredHeight2 / f6);
            }
            if (orientation == 270) {
                orientation = -90;
            }
            animate().scaleX(min).scaleY(min).rotation(-orientation).setDuration(180L).start();
        }
    }

    public final void g() {
        ThreadUtils.checkIsOnMainThread();
        if (this.r && this.e != 0 && this.f != 0 && getWidth() != 0 && getHeight() != 0) {
            float width = getWidth() / getHeight();
            int i = this.e;
            int i2 = this.f;
            if (i / i2 > width) {
                i = (int) (i2 * width);
            } else {
                i2 = (int) (i2 / width);
            }
            int min = Math.min(getWidth(), i);
            int min2 = Math.min(getHeight(), i2);
            StringBuilder sb = new StringBuilder("updateSurfaceSize. Layout size: ");
            sb.append(getWidth());
            sb.append("x");
            sb.append(getHeight());
            sb.append(", frame size: ");
            sb.append(this.e);
            sb.append("x");
            bs2.w(sb, this.f, ", requested surface size: ", min, "x");
            sb.append(min2);
            sb.append(", old surface size: ");
            sb.append(this.s);
            sb.append("x");
            sb.append(this.w);
            String sb2 = sb.toString();
            Logging.d("TextureViewRenderer", this.a + ": " + sb2);
            if (min == this.s && min2 == this.w) {
                return;
            }
            this.s = min;
            this.w = min2;
            return;
        }
        this.w = 0;
        this.s = 0;
    }

    public final void h() {
        int i;
        int i2;
        int i3 = this.n;
        if (i3 != 0 && (i = this.h) != 0) {
            if (this.E) {
                if (this.L) {
                    if (this.F == 0) {
                        i = i3;
                        i3 = i;
                    }
                } else {
                    int i4 = this.K;
                    if (i4 != 0 && i4 != 180 && i4 != -180) {
                        i2 = i3;
                    } else {
                        i2 = i;
                    }
                    if (i4 != 0 && i4 != 180 && i4 != -180) {
                        i3 = i;
                    }
                    i = i2;
                }
            } else {
                int i5 = this.K - OrientationHelper.cameraOrientation;
                if (i5 != 0 && i5 != 180 && i5 != -180) {
                    i = this.n;
                } else {
                    i = this.h;
                }
                if (i5 != 0 && i5 != 180 && i5 != -180) {
                    i3 = this.h;
                } else {
                    i3 = this.n;
                }
            }
            if (this.e != i || this.f != i3) {
                synchronized (this.c.N) {
                    Runnable runnable = this.J;
                    if (runnable != null) {
                        hl.r(runnable);
                    }
                    bt btVar = new bt(this, i, i3, (byte) 16);
                    this.J = btVar;
                    if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                        btVar.run();
                    } else {
                        hl.c3(btVar);
                    }
                }
            }
        }
    }

    @Override
    public void onFirstFrameRendered() {
        RendererCommon.RendererEvents rendererEvents = this.d;
        if (rendererEvents != null) {
            rendererEvents.onFirstFrameRendered();
        }
    }

    @Override
    public final void onFrame(VideoFrame videoFrame) {
        this.c.onFrame(videoFrame);
    }

    @Override
    public final void onFrameResolutionChanged(int r9, int r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bnb.onFrameResolutionChanged(int, int, int):void");
    }

    @Override
    public final void onMeasure(int i, int i2) {
        Point b;
        ThreadUtils.checkIsOnMainThread();
        if (!this.x && this.E) {
            h();
        }
        int i3 = this.H;
        pmc pmcVar = this.b;
        boolean z = this.x;
        if (i3 > 0) {
            b = pmcVar.b(z, View.MeasureSpec.makeMeasureSpec(Math.min(i3, View.MeasureSpec.getSize(i)), View.MeasureSpec.getMode(i)), View.MeasureSpec.makeMeasureSpec(Math.min(this.H, View.MeasureSpec.getSize(i2)), View.MeasureSpec.getMode(i2)), this.e, this.f);
        } else {
            b = pmcVar.b(z, i, i2, this.e, this.f);
        }
        setMeasuredDimension(b.x, b.y);
        if (this.e != 0 && this.f != 0) {
            anb anbVar = this.c;
            float measuredWidth = getMeasuredWidth() / getMeasuredHeight();
            if (anbVar.G != measuredWidth) {
                synchronized (anbVar.F) {
                    anbVar.G = measuredWidth;
                }
            }
        }
        g();
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        ThreadUtils.checkIsOnMainThread();
        this.w = 0;
        this.s = 0;
        g();
        this.c.onSurfaceTextureAvailable(surfaceTexture, i, i2);
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        VideoSink videoSink = this.I;
        if (videoSink instanceof VoIPService.ProxyVideoSink) {
            VoIPService.ProxyVideoSink proxyVideoSink = (VoIPService.ProxyVideoSink) videoSink;
            proxyVideoSink.removeTarget(this);
            proxyVideoSink.removeBackground(this);
        }
        this.c.onSurfaceTextureDestroyed(surfaceTexture);
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        this.s = i;
        this.w = i2;
        this.c.onSurfaceTextureSizeChanged(surfaceTexture, i, i2);
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.c.getClass();
    }

    public void setBackgroundRenderer(TextureView textureView) {
        if (!i86.e(512)) {
            return;
        }
        if (textureView == null) {
            ThreadUtils.checkIsOnMainThread();
            this.c.f(null, true);
            return;
        }
        textureView.setSurfaceTextureListener(new wr5(this, (byte) 4));
    }

    public void setEnableHardwareScaler(boolean z) {
        ThreadUtils.checkIsOnMainThread();
        this.r = z;
        g();
    }

    public void setFpsReduction(float f) {
        this.c.g(f);
    }

    public void setIsCamera(boolean z) {
        this.x = z;
        if (!z) {
            zmb zmbVar = new zmb(this);
            this.G = zmbVar;
            zmbVar.start();
        }
    }

    public void setMaxTextureSize(int i) {
        this.H = i;
    }

    public void setMirror(boolean z) {
        if (this.y != z) {
            this.y = z;
            if (this.E) {
                d();
            } else {
                this.c.h(z);
            }
            g();
            requestLayout();
        }
    }

    public void setParentSink(VideoSink videoSink) {
        this.I = videoSink;
    }

    public void setRotateTextureWithScreen(boolean z) {
        if (this.E != z) {
            this.E = z;
            requestLayout();
        }
    }

    @Override
    public void setRotation(float f) {
        super.setRotation(f);
    }

    @Override
    public void setRotationX(float f) {
        super.setRotationX(f);
    }

    @Override
    public void setRotationY(float f) {
        super.setRotationY(f);
    }

    public void setScalingType(RendererCommon.ScalingType scalingType) {
        ThreadUtils.checkIsOnMainThread();
        pmc pmcVar = this.b;
        pmcVar.getClass();
        pmcVar.a = pmc.a(scalingType);
        pmcVar.b = pmc.a(scalingType);
        requestLayout();
    }

    public void setScreenRotation(int i) {
        this.F = i;
        d();
        h();
    }

    public void setUseCameraRotation(boolean z) {
        if (this.L != z) {
            this.L = z;
            d();
            h();
        }
    }
}
