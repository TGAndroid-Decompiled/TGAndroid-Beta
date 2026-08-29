package org.telegram.messenger.voip;

import android.content.Intent;
import android.graphics.Point;
import android.media.projection.MediaProjection;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Display;
import android.view.WindowManager;
import eg.z1;
import j7.l1;
import nh.b6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.ui.th;
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

    public class AnonymousClass1 extends MediaProjection.Callback {
        public AnonymousClass1() {
            VideoCapturerDevice.this = r1;
        }

        public static void lambda$onStop$0() {
            if (VoIPService.getSharedInstance() != null) {
                VoIPService.getSharedInstance().stopScreenCapture();
            }
        }

        @Override
        public void onStop() {
            AndroidUtilities.runOnUIThread(new i(0));
        }
    }

    public VideoCapturerDevice(boolean z10) {
        Logging.enableLogToDebugOutput(Logging.Severity.LS_VERBOSE);
        Logging.d("VideoCapturerDevice", "device model = " + Build.MANUFACTURER + Build.MODEL);
        AndroidUtilities.runOnUIThread(new hh.f(18, this, z10));
    }

    public static void checkScreenCapturerSize() {
        if (instance[1] != null) {
            Point screenCaptureSize = getScreenCaptureSize();
            VideoCapturerDevice videoCapturerDevice = instance[1];
            int i10 = videoCapturerDevice.currentWidth;
            int i11 = screenCaptureSize.x;
            if (i10 == i11 && videoCapturerDevice.currentHeight == screenCaptureSize.y) {
                return;
            }
            videoCapturerDevice.currentWidth = i11;
            videoCapturerDevice.currentHeight = screenCaptureSize.y;
            videoCapturerDevice.handler.post(new b6(22, videoCapturerDevice, screenCaptureSize));
        }
    }

    public static EglBase getEglBase() {
        if (eglBase == null) {
            eglBase = org.webrtc.e.d(null, EglBase.CONFIG_PLAIN);
        }
        return eglBase;
    }

    public static MediaProjection getMediaProjection() {
        VideoCapturerDevice videoCapturerDevice = instance[1];
        if (videoCapturerDevice == null) {
            return null;
        }
        return ((ScreenCapturerAndroid) videoCapturerDevice.videoCapturer).getMediaProjection();
    }

    private static Point getScreenCaptureSize() {
        return getScreenCaptureSize(16);
    }

    private EglBase.Context getSharedEGLContext() {
        if (eglBase == null) {
            eglBase = org.webrtc.e.d(null, EglBase.CONFIG_PLAIN);
        }
        EglBase eglBase2 = eglBase;
        if (eglBase2 == null) {
            return null;
        }
        return eglBase2.getEglBaseContext();
    }

    private void init(long j10, String str) {
        AndroidUtilities.runOnUIThread(new g5.v(this, j10, str, 14));
    }

    public static void lambda$checkScreenCapturerSize$1(VideoCapturerDevice videoCapturerDevice, Point point) {
        VideoCapturer videoCapturer = videoCapturerDevice.videoCapturer;
        if (videoCapturer != null) {
            videoCapturer.changeCaptureFormat(point.x, point.y, 30);
        }
    }

    public void lambda$init$2(long j10, Point point) {
        if (this.videoCapturerSurfaceTextureHelper != null) {
            long j11 = this.nativePtr;
            if (j11 != 0) {
                this.nativeCapturerObserver = nativeGetJavaVideoCapturerObserver(j11);
                this.videoCapturer.initialize(this.videoCapturerSurfaceTextureHelper, ApplicationLoader.applicationContext, this.nativeCapturerObserver);
                FileLog.d("VideoCapturerDevice init(" + j10 + "): videoCapturer.startCapture SCREEN");
                this.videoCapturer.startCapture(point.x, point.y, 30);
                WebRtcAudioRecord webRtcAudioRecord = WebRtcAudioRecord.Instance;
                if (webRtcAudioRecord != null) {
                    webRtcAudioRecord.initDeviceAudioRecord(((ScreenCapturerAndroid) this.videoCapturer).getMediaProjection());
                }
            }
        }
    }

    public void lambda$init$3(long j10) {
        if (this.videoCapturerSurfaceTextureHelper == null) {
            return;
        }
        this.nativeCapturerObserver = nativeGetJavaVideoCapturerObserver(this.nativePtr);
        this.videoCapturer.initialize(this.videoCapturerSurfaceTextureHelper, ApplicationLoader.applicationContext, this.nativeCapturerObserver);
        FileLog.d("VideoCapturerDevice init(" + j10 + "): videoCapturer.startCapture CAMERA");
        this.videoCapturer.startCapture(CAPTURE_WIDTH, CAPTURE_HEIGHT, 30);
    }

    public void lambda$init$4(String str) {
        ((CameraVideoCapturer) this.videoCapturer).switchCamera(new AnonymousClass3(), str);
    }

    public void lambda$init$5(long j10, String str) {
        CameraEnumerator camera1Enumerator;
        if (eglBase != null) {
            this.nativePtr = j10;
            if ("screen".equals(str)) {
                if (this.videoCapturer == null) {
                    this.videoCapturer = new ScreenCapturerAndroid(mediaProjectionPermissionResultData, new AnonymousClass1());
                    Point screenCaptureSize = getScreenCaptureSize();
                    this.currentWidth = screenCaptureSize.x;
                    this.currentHeight = screenCaptureSize.y;
                    this.videoCapturerSurfaceTextureHelper = SurfaceTextureHelper.create("ScreenCapturerThread", eglBase.getEglBaseContext());
                    this.handler.post(new g5.v(this, j10, screenCaptureSize, 15));
                }
            } else {
                if (Camera2Enumerator.isSupported(ApplicationLoader.applicationContext)) {
                    camera1Enumerator = new Camera2Enumerator(ApplicationLoader.applicationContext);
                } else {
                    camera1Enumerator = new Camera1Enumerator();
                }
                String[] deviceNames = camera1Enumerator.getDeviceNames();
                int i10 = 0;
                while (true) {
                    if (i10 < deviceNames.length) {
                        if (camera1Enumerator.isFrontFacing(deviceNames[i10]) == "front".equals(str)) {
                            break;
                        }
                        i10++;
                    } else {
                        i10 = -1;
                        break;
                    }
                }
                if (i10 == -1) {
                    return;
                }
                String str2 = deviceNames[i10];
                if (this.videoCapturer == null) {
                    this.videoCapturer = camera1Enumerator.createCapturer(str2, new AnonymousClass2());
                    this.videoCapturerSurfaceTextureHelper = SurfaceTextureHelper.create("VideoCapturerThread", eglBase.getEglBaseContext());
                    this.handler.post(new z1(this, j10, 16));
                    return;
                }
                FileLog.d("VideoCapturerDevice init(" + j10 + "): videoCapturer.switchCamera CAMERA");
                this.handler.post(new b6(23, this, str2));
            }
        }
    }

    public void lambda$new$0(boolean z10) {
        if (eglBase == null) {
            eglBase = org.webrtc.e.d(null, EglBase.CONFIG_PLAIN);
        }
        instance[z10 ? 1 : 0] = this;
        HandlerThread handlerThread = new HandlerThread("CallThread");
        this.thread = handlerThread;
        handlerThread.start();
        this.handler = new Handler(this.thread.getLooper());
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
            } catch (InterruptedException e10) {
                throw new RuntimeException(e10);
            }
        }
        SurfaceTextureHelper surfaceTextureHelper = this.videoCapturerSurfaceTextureHelper;
        if (surfaceTextureHelper != null) {
            surfaceTextureHelper.dispose();
            this.videoCapturerSurfaceTextureHelper = null;
        }
    }

    public void lambda$onDestroy$9() {
        int i10 = 0;
        while (true) {
            VideoCapturerDevice[] videoCapturerDeviceArr = instance;
            if (i10 >= videoCapturerDeviceArr.length) {
                break;
            } else if (videoCapturerDeviceArr[i10] == this) {
                videoCapturerDeviceArr[i10] = null;
                break;
            } else {
                i10++;
            }
        }
        this.handler.post(new h(this, 0));
        try {
            this.thread.quitSafely();
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public void lambda$onStateChanged$6(int i10, long j10) {
        if (this.videoCapturer == null) {
            return;
        }
        if (i10 == 2) {
            StringBuilder sb2 = new StringBuilder("VideoCapturerDevice onStateChanged(");
            sb2.append(j10);
            sb2.append(", ");
            sb2.append(i10);
            th.v("): videoCapturer.startCapture", sb2);
            this.videoCapturer.startCapture(CAPTURE_WIDTH, CAPTURE_HEIGHT, 30);
            return;
        }
        try {
            FileLog.d("VideoCapturerDevice onStateChanged(" + j10 + ", " + i10 + "): videoCapturer.stopCapture");
            this.videoCapturer.stopCapture();
        } catch (InterruptedException e10) {
            throw new RuntimeException(e10);
        }
    }

    public void lambda$onStateChanged$7(long j10, int i10) {
        if (this.nativePtr != j10) {
            return;
        }
        this.handler.post(new g(this, i10, j10));
    }

    private static native CapturerObserver nativeGetJavaVideoCapturerObserver(long j10);

    private void onDestroy() {
        l1.x(new StringBuilder("VideoCapturerDevice onDestroy ptr="), this.nativePtr);
        this.nativePtr = 0L;
        AndroidUtilities.runOnUIThread(new h(this, 1));
    }

    private void onStateChanged(long j10, int i10) {
        FileLog.d("VideoCapturerDevice onStateChanged(" + j10 + ", " + i10 + ")");
        AndroidUtilities.runOnUIThread(new g(this, j10, i10));
    }

    private static Point getScreenCaptureSize(int i10) {
        int i11;
        int i12;
        Display defaultDisplay = ((WindowManager) ApplicationLoader.applicationContext.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        int i13 = point.x;
        int i14 = point.y;
        float f9 = i13 > i14 ? i14 / i13 : i13 / i14;
        int i15 = 1;
        while (true) {
            if (i15 > 100) {
                i15 = -1;
                i11 = -1;
                break;
            }
            float f10 = i15 * f9;
            i11 = (int) f10;
            if (f10 != i11) {
                i15++;
            } else if (point.x <= point.y) {
                i11 = i15;
                i15 = i11;
            }
        }
        if (i15 != -1 && f9 != 1.0f) {
            while (true) {
                int i16 = point.x;
                if (i16 <= 1000 && (i12 = point.y) <= 1000 && i16 % i10 == 0 && i12 % i10 == 0) {
                    break;
                }
                int i17 = i16 - i15;
                point.x = i17;
                int i18 = point.y - i11;
                point.y = i18;
                if (i17 < 800 && i18 < 800) {
                    i15 = -1;
                    break;
                }
            }
        }
        if (i15 == -1 || f9 == 1.0f) {
            float max = Math.max(point.x / 970.0f, point.y / 970.0f);
            float f11 = i10;
            point.x = ((int) Math.ceil((point.x / max) / f11)) * i10;
            point.y = ((int) Math.ceil((point.y / max) / f11)) * i10;
            return point;
        }
        return point;
    }

    public class AnonymousClass2 implements CameraVideoCapturer.CameraEventsHandler {
        public AnonymousClass2() {
            VideoCapturerDevice.this = r1;
        }

        public static void lambda$onFirstFrameAvailable$0() {
            if (VoIPService.getSharedInstance() != null) {
                VoIPService.getSharedInstance().onCameraFirstFrameAvailable();
            }
        }

        @Override
        public void onFirstFrameAvailable() {
            AndroidUtilities.runOnUIThread(new i(1));
        }

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
    }

    public class AnonymousClass3 implements CameraVideoCapturer.CameraSwitchHandler {
        public AnonymousClass3() {
            VideoCapturerDevice.this = r1;
        }

        public static void lambda$onCameraSwitchDone$0(boolean z10) {
            if (VoIPService.getSharedInstance() != null) {
                VoIPService.getSharedInstance().setSwitchingCamera(false, z10);
            }
        }

        @Override
        public void onCameraSwitchDone(final boolean z10) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    VideoCapturerDevice.AnonymousClass3.lambda$onCameraSwitchDone$0(z10);
                }
            });
        }

        @Override
        public void onCameraSwitchError(String str) {
        }
    }

    private void onAspectRatioRequested(float f9) {
    }
}
