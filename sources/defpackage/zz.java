package defpackage;

import android.app.Notification;
import android.content.ComponentName;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RecordingCanvas;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.media.AudioDescriptor;
import android.media.MediaDrm;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.media.session.MediaSession;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.view.RoundedCorner;
import android.view.View;
import android.view.WindowInsets;
import j$.util.Comparator$CC;
import j$.util.Comparator$EL;
import java.io.ByteArrayInputStream;
import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.Executor;
import org.telegram.utils.twidget.y;
public abstract class zz {
    public static float a = -1.0f;
    public static RenderEffect b;

    public static ColorFilter A(int i) {
        BlendMode blendMode;
        vk1.l();
        blendMode = BlendMode.SRC_IN;
        return new BlendModeColorFilter(i, blendMode);
    }

    public static void a(y yVar, eoa eoaVar, yzc yzcVar, int i, am2 am2Var, RectF rectF, float[] fArr, s0d s0dVar, float f) {
        RectF rectF2;
        RenderEffect i2 = i(am2Var, f, Shader.TileMode.CLAMP);
        Matrix matrix = new Matrix();
        if (i2 != null && ((Matrix) eoaVar.f).invert(matrix) && !rectF.isEmpty()) {
            if (yVar.p(eoaVar, new RectF(rectF), y.j(am2Var, new RectF(rectF)))) {
                int floor = (int) Math.floor(rectF2.left * f);
                int floor2 = (int) Math.floor(rectF2.top * f);
                int ceil = (int) Math.ceil(rectF2.right * f);
                int ceil2 = (int) Math.ceil(rectF2.bottom * f);
                if (yVar.o((ceil2 - floor2) * (ceil - floor))) {
                    yVar.w++;
                    RenderNode renderNode = new RenderNode("widget-backdrop");
                    renderNode.setPosition(floor, floor2, ceil, ceil2);
                    RecordingCanvas beginRecording = renderNode.beginRecording();
                    beginRecording.translate(-floor, -floor2);
                    beginRecording.scale(f, f);
                    beginRecording.concat(matrix);
                    yVar.e(beginRecording, yzcVar, i, s0dVar, f, false);
                    renderNode.endRecording();
                    renderNode.setRenderEffect(i2);
                    Canvas canvas = (Canvas) eoaVar.d;
                    canvas.save();
                    Path path = yVar.f;
                    path.rewind();
                    if (fArr == null) {
                        path.addRect(rectF, Path.Direction.CW);
                    } else {
                        path.addRoundRect(rectF, fArr, Path.Direction.CW);
                    }
                    canvas.clipPath(path);
                    canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                    float f2 = 1.0f / f;
                    canvas.scale(f2, f2);
                    canvas.drawRenderNode(renderNode);
                    canvas.restore();
                }
            }
        }
    }

    public static Canvas b(y yVar, r0d r0dVar, RectF rectF, am2 am2Var, float f) {
        Shader.TileMode tileMode;
        tileMode = Shader.TileMode.DECAL;
        RenderEffect i = i(am2Var, f, tileMode);
        if (i != null) {
            int floor = ((int) Math.floor(rectF.left * f)) - 1;
            int floor2 = ((int) Math.floor(rectF.top * f)) - 1;
            int ceil = ((int) Math.ceil(rectF.right * f)) + 1;
            int ceil2 = ((int) Math.ceil(rectF.bottom * f)) + 1;
            if (!yVar.o((ceil2 - floor2) * (ceil - floor))) {
                return null;
            }
            RenderNode renderNode = new RenderNode("widget-filter");
            r0dVar.d = floor;
            r0dVar.e = floor2;
            renderNode.setPosition(floor, floor2, ceil, ceil2);
            renderNode.setRenderEffect(i);
            r0dVar.c = renderNode;
            RecordingCanvas beginRecording = renderNode.beginRecording();
            beginRecording.translate(-r0dVar.d, -r0dVar.e);
            beginRecording.scale(f, f);
            return beginRecording;
        }
        return null;
    }

    public static Canvas c(int i, int i2, Object obj) {
        RenderNode g = rm0.g(obj);
        g.setPosition(0, 0, i, i2);
        return g.beginRecording();
    }

    public static void d(Canvas canvas, Path path) {
        if (Build.VERSION.SDK_INT >= 26) {
            canvas.clipOutPath(path);
        } else {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
        }
    }

    public static RenderEffect e() {
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(1.125f);
        return RenderEffect.createColorFilterEffect(new ColorMatrixColorFilter(colorMatrix));
    }

    public static Bitmap f(int i, int i2, byte[] bArr) {
        BitmapFactory.Options options;
        int i3 = 0;
        if (i2 != -1) {
            options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, i, options);
            options.inJustDecodeBounds = false;
            options.inSampleSize = 1;
            for (int max = Math.max(options.outWidth, options.outHeight); max > i2; max /= 2) {
                options.inSampleSize <<= 1;
            }
        } else {
            options = null;
        }
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, i, options);
        if (options != null) {
            options.inSampleSize = 1;
        }
        if (decodeByteArray != null) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            try {
                y54 y54Var = new y54(byteArrayInputStream);
                byteArrayInputStream.close();
                switch (y54Var.c()) {
                    case 3:
                    case 4:
                        i3 = 180;
                        break;
                    case 5:
                    case 8:
                        i3 = 270;
                        break;
                    case 6:
                    case 7:
                        i3 = 90;
                        break;
                }
                if (i3 != 0) {
                    Matrix matrix = new Matrix();
                    matrix.postRotate(i3);
                    return Bitmap.createBitmap(decodeByteArray, 0, 0, decodeByteArray.getWidth(), decodeByteArray.getHeight(), matrix, false);
                }
                return decodeByteArray;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        throw hy7.a("Could not decode image data", new IllegalStateException());
    }

    public static void g(Context context, yv2 yv2Var) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            telephonyManager.getClass();
            il7 il7Var = new il7(yv2Var);
            telephonyManager.registerTelephonyCallback((Executor) yv2Var.b, il7Var);
            telephonyManager.unregisterTelephonyCallback(il7Var);
        } catch (RuntimeException unused) {
            yv2Var.i(5);
        }
    }

    public static void h(Canvas canvas, Object obj) {
        canvas.drawRenderNode(rm0.g(obj));
    }

    public static RenderEffect i(am2 am2Var, float f, Shader.TileMode tileMode) {
        float f2;
        float f3;
        BlendMode blendMode;
        Shader.TileMode tileMode2;
        RenderEffect renderEffect = null;
        int i = 0;
        while (true) {
            int[] iArr = (int[]) am2Var.b;
            if (i < iArr.length) {
                float f4 = ((float[]) am2Var.f)[i];
                int i2 = iArr[i];
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 == 9) {
                            if (renderEffect == null) {
                                renderEffect = RenderEffect.createOffsetEffect(0.0f, 0.0f);
                            }
                            RenderEffect createOffsetEffect = RenderEffect.createOffsetEffect(((float[]) am2Var.d)[i] * f, ((float[]) am2Var.e)[i] * f, RenderEffect.createColorFilterEffect(new PorterDuffColorFilter(((int[]) am2Var.c)[i], PorterDuff.Mode.SRC_IN), renderEffect));
                            float f5 = (f4 / 2.0f) * f;
                            if (f5 > 0.5f) {
                                f3 = (f5 - 0.5f) / 0.57735f;
                            } else {
                                f3 = 0.0f;
                            }
                            if (f3 > 0.0f) {
                                tileMode2 = Shader.TileMode.DECAL;
                                createOffsetEffect = RenderEffect.createBlurEffect(f3, f3, createOffsetEffect, tileMode2);
                            }
                            blendMode = BlendMode.SRC_OVER;
                            renderEffect = RenderEffect.createBlendModeEffect(createOffsetEffect, renderEffect, blendMode);
                        }
                    } else if (renderEffect == null) {
                        ColorMatrix colorMatrix = new ColorMatrix();
                        colorMatrix.setScale(f4, f4, f4, 1.0f);
                        renderEffect = RenderEffect.createColorFilterEffect(new ColorMatrixColorFilter(colorMatrix));
                    } else {
                        ColorMatrix colorMatrix2 = new ColorMatrix();
                        colorMatrix2.setScale(f4, f4, f4, 1.0f);
                        renderEffect = RenderEffect.createColorFilterEffect(new ColorMatrixColorFilter(colorMatrix2), renderEffect);
                    }
                } else {
                    float f6 = f4 * f;
                    if (f6 > 0.5f) {
                        f2 = (f6 - 0.5f) / 0.57735f;
                    } else {
                        f2 = 0.0f;
                    }
                    if (f2 > 0.0f) {
                        if (renderEffect == null) {
                            renderEffect = RenderEffect.createBlurEffect(f2, f2, tileMode);
                        } else {
                            renderEffect = RenderEffect.createBlurEffect(f2, f2, renderEffect, tileMode);
                        }
                    }
                }
                i++;
            } else {
                return renderEffect;
            }
        }
    }

    public static void j(r0d r0dVar, float f) {
        RenderNode g = rm0.g(r0dVar.c);
        g.endRecording();
        r0dVar.a.save();
        float f2 = 1.0f / f;
        r0dVar.a.scale(f2, f2);
        r0dVar.a.drawRenderNode(g);
        r0dVar.a.restore();
    }

    public static void k(Object obj) {
        rm0.g(obj).endRecording();
    }

    public static po5 l(List list) {
        if (Build.VERSION.SDK_INT >= 31 && list != null) {
            TreeSet treeSet = new TreeSet(Comparator$EL.reversed(Comparator$CC.comparing(new yz((byte) 0))));
            for (Object obj : list) {
                AudioDescriptor a2 = xz.a(obj);
                if (a2.getStandard() == 1) {
                    byte[] descriptor = a2.getDescriptor();
                    if (descriptor.length != 3) {
                        efd.f("AudioDescriptorUtil", "Invalid SAD length: " + descriptor.length);
                    } else {
                        byte b2 = descriptor[0];
                        int i = (b2 & 7) + 1;
                        if (((b2 >> 3) & 15) == 1) {
                            treeSet.add(Integer.valueOf(gcc.t(i)));
                        }
                    }
                }
            }
            return po5.q(treeSet);
        }
        no5 no5Var = po5.b;
        return j99.e;
    }

    public static RenderEffect m() {
        RenderEffect renderEffect = b;
        if (renderEffect == null) {
            ColorMatrix colorMatrix = new ColorMatrix();
            colorMatrix.setSaturation(3.0f);
            RenderEffect createColorFilterEffect = RenderEffect.createColorFilterEffect(new ColorMatrixColorFilter(colorMatrix));
            b = createColorFilterEffect;
            return createColorFilterEffect;
        }
        return renderEffect;
    }

    public static boolean n(Object obj) {
        if (obj != null && rm0.g(obj).hasDisplayList()) {
            return true;
        }
        return false;
    }

    public static boolean o() {
        if (Build.VERSION.SDK_INT >= 31) {
            return true;
        }
        return false;
    }

    public static Bitmap p(Bitmap bitmap) {
        if (Build.VERSION.SDK_INT >= 31) {
            return bitmap.asShared();
        }
        return bitmap;
    }

    public static boolean q(MediaDrm mediaDrm, String str, int i) {
        return mediaDrm.requiresSecureDecoder(str, i);
    }

    public static float r(View view) {
        float f;
        int identifier;
        WindowInsets windowInsets;
        float f2;
        if (Build.VERSION.SDK_INT >= 31) {
            if (view != null) {
                windowInsets = view.getRootWindowInsets();
            } else {
                windowInsets = null;
            }
            if (windowInsets == null) {
                f2 = -1.0f;
            } else {
                RoundedCorner roundedCorner = windowInsets.getRoundedCorner(0);
                if (roundedCorner != null) {
                    f2 = roundedCorner.getRadius();
                } else {
                    f2 = 0.0f;
                }
            }
            if (f2 >= 0.0f) {
                return f2;
            }
        }
        float f3 = a;
        if (f3 < 0.0f) {
            try {
                Resources system = Resources.getSystem();
                int identifier2 = system.getIdentifier("rounded_corner_radius_top", "dimen", "android");
                if (identifier2 != 0) {
                    f = system.getDimensionPixelSize(identifier2);
                } else {
                    f = 0.0f;
                }
                if (f <= 0.0f && (identifier = system.getIdentifier("rounded_corner_radius", "dimen", "android")) != 0) {
                    f = system.getDimensionPixelSize(identifier);
                }
            } catch (Exception unused) {
                f = 0.0f;
            }
            float max = Math.max(0.0f, f);
            a = max;
            return max;
        }
        return f3;
    }

    public static void s(Object obj, float f) {
        rm0.g(obj).setAlpha(f);
    }

    public static void t(Notification.Action.Builder builder) {
        builder.setAuthenticationRequired(false);
    }

    public static void u(int i, Paint paint) {
        BlendMode blendMode;
        switch (i) {
            case 1:
                blendMode = BlendMode.PLUS;
                break;
            case 2:
                blendMode = BlendMode.SCREEN;
                break;
            case 3:
                blendMode = BlendMode.COLOR_DODGE;
                break;
            case 4:
                blendMode = BlendMode.OVERLAY;
                break;
            case 5:
                blendMode = BlendMode.SOFT_LIGHT;
                break;
            case 6:
                blendMode = BlendMode.COLOR_BURN;
                break;
            default:
                blendMode = null;
                break;
        }
        paint.setBlendMode(blendMode);
    }

    public static void v(Object obj, float f) {
        RenderEffect renderEffect;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        RenderNode renderNode = (RenderNode) obj;
        if (f > 0.0f) {
            renderEffect = RenderEffect.createBlurEffect(f, f, tileMode);
        } else {
            renderEffect = null;
        }
        renderNode.setRenderEffect(renderEffect);
    }

    public static void w(Object obj, float f, float[] fArr) {
        rm0.g(obj).setRenderEffect(RenderEffect.createColorFilterEffect(new ColorMatrixColorFilter(fArr), RenderEffect.createBlurEffect(f, f, Shader.TileMode.CLAMP)));
    }

    public static void x(MediaDrm mediaDrm, byte[] bArr, ig8 ig8Var) {
        LogSessionId logSessionId;
        LogSessionId a2 = ig8Var.a();
        logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
        if (!a2.equals(logSessionId)) {
            MediaDrm.PlaybackComponent playbackComponent = mediaDrm.getPlaybackComponent(bArr);
            playbackComponent.getClass();
            playbackComponent.setLogSessionId(a2);
        }
    }

    public static void y(fp fpVar, ig8 ig8Var) {
        LogSessionId logSessionId;
        LogSessionId a2 = ig8Var.a();
        logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
        if (!a2.equals(logSessionId)) {
            ((MediaFormat) fpVar.b).setString("log-session-id", a2.getStringId());
        }
    }

    public static void z(qx6 qx6Var, ComponentName componentName) {
        try {
            MediaSession mediaSession = ((gx6) qx6Var.b).a;
            mediaSession.getClass();
            mediaSession.setMediaButtonBroadcastReceiver(componentName);
        } catch (IllegalArgumentException e) {
            if (Build.MANUFACTURER.equals("motorola")) {
                efd.d("MediaSessionLegacyStub", "caught IllegalArgumentException on a motorola device when attempting to set the media button broadcast receiver. See https://github.com/androidx/media/issues/1730 for details.", e);
                return;
            }
            throw e;
        }
    }
}
