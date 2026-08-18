package org.telegram.messenger.voip;

import android.content.Intent;
import android.graphics.Point;
import android.media.projection.MediaProjection;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Display;
import android.view.WindowManager;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.webrtc.Camera1Enumerator;
import org.webrtc.Camera2Enumerator;
import org.webrtc.CameraEnumerator;
import org.webrtc.CameraVideoCapturer;
import org.webrtc.CapturerObserver;
import org.webrtc.EglBase;
import org.webrtc.Logging;
import org.webrtc.ScreenCapturerAndroid;
import org.webrtc.SurfaceTextureHelper;
import org.webrtc.VideoCapturer;
import org.webrtc.voiceengine.WebRtcAudioRecord;

public class VideoCapturerDevice {
    private static final int CAPTURE_FPS = 30;
    public static EglBase eglBase;
    public static Intent mediaProjectionPermissionResultData;
    private int currentHeight;
    private int currentWidth;
    private Handler handler;
    private CapturerObserver nativeCapturerObserver;
    private long nativePtr;
    private HandlerThread thread;
    private VideoCapturer videoCapturer;
    private SurfaceTextureHelper videoCapturerSurfaceTextureHelper;
    private static final int CAPTURE_WIDTH = 1280;
    private static final int CAPTURE_HEIGHT = 720;
    private static VideoCapturerDevice[] instance = new VideoCapturerDevice[2];

    private static native CapturerObserver nativeGetJavaVideoCapturerObserver(long j);

    private void onAspectRatioRequested(float f) {
    }

    public VideoCapturerDevice(final boolean z) {
        Logging.enableLogToDebugOutput(Logging.Severity.LS_VERBOSE);
        Logging.d("VideoCapturerDevice", "device model = " + Build.MANUFACTURER + Build.MODEL);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$new$0(z);
            }
        });
    }

    public void lambda$new$0(boolean z) {
        if (eglBase == null) {
            eglBase = EglBase.CC.create(null, EglBase.CONFIG_PLAIN);
        }
        instance[z ? 1 : 0] = this;
        HandlerThread handlerThread = new HandlerThread("CallThread");
        this.thread = handlerThread;
        handlerThread.start();
        this.handler = new Handler(this.thread.getLooper());
    }

    public static void checkScreenCapturerSize() {
        if (instance[1] == null) {
            return;
        }
        final Point screenCaptureSize = getScreenCaptureSize();
        final VideoCapturerDevice videoCapturerDevice = instance[1];
        int i = videoCapturerDevice.currentWidth;
        int i2 = screenCaptureSize.x;
        if (i == i2 && videoCapturerDevice.currentHeight == screenCaptureSize.y) {
            return;
        }
        videoCapturerDevice.currentWidth = i2;
        videoCapturerDevice.currentHeight = screenCaptureSize.y;
        videoCapturerDevice.handler.post(new Runnable() {
            @Override
            public final void run() {
                VideoCapturerDevice.lambda$checkScreenCapturerSize$1(this.f$0, screenCaptureSize);
            }
        });
    }

    public static void lambda$checkScreenCapturerSize$1(VideoCapturerDevice videoCapturerDevice, Point point) {
        VideoCapturer videoCapturer = videoCapturerDevice.videoCapturer;
        if (videoCapturer != null) {
            videoCapturer.changeCaptureFormat(point.x, point.y, 30);
        }
    }

    private static Point getScreenCaptureSize() {
        return getScreenCaptureSize(16);
    }

    private static Point getScreenCaptureSize(int i) {
        int i2;
        int i3;
        Display defaultDisplay = ((WindowManager) ApplicationLoader.applicationContext.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        int i4 = point.x;
        int i5 = point.y;
        float f = i4 > i5 ? i5 / i4 : i4 / i5;
        int i6 = 1;
        while (true) {
            if (i6 > 100) {
                i6 = -1;
                i2 = -1;
                break;
            }
            float f2 = i6 * f;
            i2 = (int) f2;
            if (f2 == i2) {
                if (point.x > point.y) {
                    break;
                }
                i2 = i6;
                i6 = i2;
                break;
            }
            i6++;
        }
        if (i6 != -1 && f != 1.0f) {
            while (true) {
                int i7 = point.x;
                if (i7 <= 1000 && (i3 = point.y) <= 1000 && i7 % i == 0 && i3 % i == 0) {
                    break;
                }
                int i8 = i7 - i6;
                point.x = i8;
                int i9 = point.y - i2;
                point.y = i9;
                if (i8 < 800 && i9 < 800) {
                    i6 = -1;
                    break;
                }
            }
        }
        if (i6 == -1 || f == 1.0f) {
            float fMax = Math.max(point.x / 970.0f, point.y / 970.0f);
            float f3 = i;
            point.x = ((int) Math.ceil((point.x / fMax) / f3)) * i;
            point.y = ((int) Math.ceil((point.y / fMax) / f3)) * i;
        }
        return point;
    }

    private void init(final long j, final String str) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$init$5(j, str);
            }
        });
    }

    public void lambda$init$5(final long j, String str) {
        if (eglBase == null) {
            return;
        }
        this.nativePtr = j;
        if ("screen".equals(str)) {
            if (this.videoCapturer == null) {
                this.videoCapturer = new ScreenCapturerAndroid(mediaProjectionPermissionResultData, new AnonymousClass1());
                final Point screenCaptureSize = getScreenCaptureSize();
                this.currentWidth = screenCaptureSize.x;
                this.currentHeight = screenCaptureSize.y;
                this.videoCapturerSurfaceTextureHelper = SurfaceTextureHelper.create("ScreenCapturerThread", eglBase.getEglBaseContext());
                this.handler.post(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$init$2(j, screenCaptureSize);
                    }
                });
                return;
            }
            return;
        }
        CameraEnumerator camera2Enumerator = Camera2Enumerator.isSupported(ApplicationLoader.applicationContext) ? new Camera2Enumerator(ApplicationLoader.applicationContext) : new Camera1Enumerator();
        String[] deviceNames = camera2Enumerator.getDeviceNames();
        int i = 0;
        while (true) {
            if (i >= deviceNames.length) {
                i = -1;
                break;
            } else if (camera2Enumerator.isFrontFacing(deviceNames[i]) == "front".equals(str)) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        final String str2 = deviceNames[i];
        if (this.videoCapturer == null) {
            this.videoCapturer = camera2Enumerator.createCapturer(str2, new AnonymousClass2());
            this.videoCapturerSurfaceTextureHelper = SurfaceTextureHelper.create("VideoCapturerThread", eglBase.getEglBaseContext());
            this.handler.post(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$init$3(j);
                }
            });
        } else {
            FileLog.d("VideoCapturerDevice init(" + j + "): videoCapturer.switchCamera CAMERA");
            this.handler.post(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$init$4(str2);
                }
            });
        }
    }

    class AnonymousClass1 extends MediaProjection.Callback {
        AnonymousClass1() {
        }

        @Override
        public void onStop() {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    VideoCapturerDevice.AnonymousClass1.lambda$onStop$0();
                }
            });
        }

        public static void lambda$onStop$0() {
            if (VoIPService.getSharedInstance() != null) {
                VoIPService.getSharedInstance().stopScreenCapture();
            }
        }
    }

    public void lambda$init$2(long j, Point point) {
        if (this.videoCapturerSurfaceTextureHelper != null) {
            long j2 = this.nativePtr;
            if (j2 == 0) {
                return;
            }
            this.nativeCapturerObserver = nativeGetJavaVideoCapturerObserver(j2);
            this.videoCapturer.initialize(this.videoCapturerSurfaceTextureHelper, ApplicationLoader.applicationContext, this.nativeCapturerObserver);
            FileLog.d("VideoCapturerDevice init(" + j + "): videoCapturer.startCapture SCREEN");
            this.videoCapturer.startCapture(point.x, point.y, 30);
            WebRtcAudioRecord webRtcAudioRecord = WebRtcAudioRecord.Instance;
            if (webRtcAudioRecord != null) {
                webRtcAudioRecord.initDeviceAudioRecord(((ScreenCapturerAndroid) this.videoCapturer).getMediaProjection());
            }
        }
    }

    class AnonymousClass2 implements CameraVideoCapturer.CameraEventsHandler {
        @Override
        public void onCameraClosed() {
        }

        @Override
        public void onCameraDisconnected() {
        }

        @Override
        public void onCameraError(String str) {
        }

        @Override
        public void onCameraFreezed(String str) {
        }

        @Override
        public void onCameraOpening(String str) {
        }

        AnonymousClass2() {
        }

        @Override
        public void onFirstFrameAvailable() {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    VideoCapturerDevice.AnonymousClass2.lambda$onFirstFrameAvailable$0();
                }
            });
        }

        public static void lambda$onFirstFrameAvailable$0() {
            if (VoIPService.getSharedInstance() != null) {
                VoIPService.getSharedInstance().onCameraFirstFrameAvailable();
            }
        }
    }

    public void lambda$init$3(long j) {
        if (this.videoCapturerSurfaceTextureHelper == null) {
            return;
        }
        this.nativeCapturerObserver = nativeGetJavaVideoCapturerObserver(this.nativePtr);
        this.videoCapturer.initialize(this.videoCapturerSurfaceTextureHelper, ApplicationLoader.applicationContext, this.nativeCapturerObserver);
        FileLog.d("VideoCapturerDevice init(" + j + "): videoCapturer.startCapture CAMERA");
        this.videoCapturer.startCapture(CAPTURE_WIDTH, CAPTURE_HEIGHT, 30);
    }

    class AnonymousClass3 implements CameraVideoCapturer.CameraSwitchHandler {
        @Override
        public void onCameraSwitchError(String str) {
        }

        AnonymousClass3() {
        }

        @Override
        public void onCameraSwitchDone(final boolean z) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    VideoCapturerDevice.AnonymousClass3.lambda$onCameraSwitchDone$0(z);
                }
            });
        }

        public static void lambda$onCameraSwitchDone$0(boolean z) {
            if (VoIPService.getSharedInstance() != null) {
                VoIPService.getSharedInstance().setSwitchingCamera(false, z);
            }
        }
    }

    public void lambda$init$4(String str) {
        ((CameraVideoCapturer) this.videoCapturer).switchCamera(new AnonymousClass3(), str);
    }

    public static MediaProjection getMediaProjection() {
        VideoCapturerDevice videoCapturerDevice = instance[1];
        if (videoCapturerDevice == null) {
            return null;
        }
        return ((ScreenCapturerAndroid) videoCapturerDevice.videoCapturer).getMediaProjection();
    }

    private void onStateChanged(final long j, final int i) {
        FileLog.d("VideoCapturerDevice onStateChanged(" + j + ", " + i + ")");
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$onStateChanged$7(j, i);
            }
        });
    }

    public void lambda$onStateChanged$7(final long j, final int i) {
        if (this.nativePtr != j) {
            return;
        }
        this.handler.post(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$onStateChanged$6(i, j);
            }
        });
    }

    public void lambda$onStateChanged$6(int i, long j) {
        if (this.videoCapturer == null) {
            return;
        }
        if (i == 2) {
            FileLog.d("VideoCapturerDevice onStateChanged(" + j + ", " + i + "): videoCapturer.startCapture");
            this.videoCapturer.startCapture(CAPTURE_WIDTH, CAPTURE_HEIGHT, 30);
            return;
        }
        try {
            FileLog.d("VideoCapturerDevice onStateChanged(" + j + ", " + i + "): videoCapturer.stopCapture");
            this.videoCapturer.stopCapture();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private void onDestroy() {
        FileLog.d("VideoCapturerDevice onDestroy ptr=" + this.nativePtr);
        this.nativePtr = 0L;
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$onDestroy$9();
            }
        });
    }

    public void lambda$onDestroy$9() {
        int i = 0;
        while (true) {
            VideoCapturerDevice[] videoCapturerDeviceArr = instance;
            if (i >= videoCapturerDeviceArr.length) {
                break;
            }
            if (videoCapturerDeviceArr[i] == this) {
                videoCapturerDeviceArr[i] = null;
                break;
            }
            i++;
        }
        this.handler.post(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$onDestroy$8();
            }
        });
        try {
            this.thread.quitSafely();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void lambda$onDestroy$8() {
        WebRtcAudioRecord webRtcAudioRecord;
        if ((this.videoCapturer instanceof ScreenCapturerAndroid) && (webRtcAudioRecord = WebRtcAudioRecord.Instance) != null) {
            webRtcAudioRecord.stopDeviceAudioRecord();
        }
        if (this.videoCapturer != null) {
            FileLog.d("VideoCapturerDevice onDestroy: videoCapturer.stopCapture");
            try {
                this.videoCapturer.stopCapture();
                this.videoCapturer.dispose();
                this.videoCapturer = null;
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        SurfaceTextureHelper surfaceTextureHelper = this.videoCapturerSurfaceTextureHelper;
        if (surfaceTextureHelper != null) {
            surfaceTextureHelper.dispose();
            this.videoCapturerSurfaceTextureHelper = null;
        }
    }

    private EglBase.Context getSharedEGLContext() {
        if (eglBase == null) {
            eglBase = EglBase.CC.create(null, EglBase.CONFIG_PLAIN);
        }
        EglBase eglBase2 = eglBase;
        if (eglBase2 != null) {
            return eglBase2.getEglBaseContext();
        }
        return null;
    }

    public static EglBase getEglBase() {
        if (eglBase == null) {
            eglBase = EglBase.CC.create(null, EglBase.CONFIG_PLAIN);
        }
        return eglBase;
    }
}
