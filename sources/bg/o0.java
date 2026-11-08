package bg;

import a8.b8;
import android.app.Notification;
import android.content.ComponentName;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.RenderEffect;
import android.media.AudioDescriptor;
import android.media.MediaDrm;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.media.session.MediaSession;
import android.os.Build;
import h9.t1;
import j$.util.Comparator$CC;
import j$.util.Comparator$EL;
import java.io.ByteArrayInputStream;
import java.util.List;
import java.util.TreeSet;
public abstract class o0 {
    public static RenderEffect f3359a;

    public static RenderEffect a() {
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(1.125f);
        return RenderEffect.createColorFilterEffect(new ColorMatrixColorFilter(colorMatrix));
    }

    public static Bitmap b(int i7, int i10, byte[] bArr) {
        BitmapFactory.Options options;
        int i11 = 0;
        if (i10 != -1) {
            options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, i7, options);
            options.inJustDecodeBounds = false;
            options.inSampleSize = 1;
            for (int max = Math.max(options.outWidth, options.outHeight); max > i10; max /= 2) {
                options.inSampleSize *= 2;
            }
        } else {
            options = null;
        }
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, i7, options);
        if (options != null) {
            options.inSampleSize = 1;
        }
        if (decodeByteArray != null) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            try {
                u1.g gVar = new u1.g(byteArrayInputStream);
                byteArrayInputStream.close();
                switch (gVar.c()) {
                    case 3:
                    case 4:
                        i11 = 180;
                        break;
                    case 5:
                    case 8:
                        i11 = 270;
                        break;
                    case 6:
                    case 7:
                        i11 = 90;
                        break;
                }
                if (i11 != 0) {
                    Matrix matrix = new Matrix();
                    matrix.postRotate(i11);
                    return Bitmap.createBitmap(decodeByteArray, 0, 0, decodeByteArray.getWidth(), decodeByteArray.getHeight(), matrix, false);
                }
                return decodeByteArray;
            } catch (Throwable th2) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        throw e2.t0.a(new IllegalStateException(), "Could not decode image data");
    }

    public static h9.i0 c(List list) {
        if (Build.VERSION.SDK_INT >= 31 && list != null) {
            TreeSet treeSet = new TreeSet(Comparator$EL.reversed(Comparator$CC.comparing(new aa.l(2))));
            for (Object obj : list) {
                AudioDescriptor a10 = m2.d.a(obj);
                if (a10.getStandard() == 1) {
                    byte[] descriptor = a10.getDescriptor();
                    if (descriptor.length != 3) {
                        h2.a.l("AudioDescriptorUtil", "Invalid SAD length: " + descriptor.length);
                    } else {
                        byte b10 = descriptor[0];
                        int i7 = (b10 & 7) + 1;
                        if (((b10 >> 3) & 15) == 1) {
                            treeSet.add(Integer.valueOf(h2.m0.t(i7)));
                        }
                    }
                }
            }
            return h9.i0.q(treeSet);
        }
        h9.g0 g0Var = h9.i0.f14329b;
        return t1.f14397e;
    }

    public static RenderEffect d() {
        if (f3359a == null) {
            ColorMatrix colorMatrix = new ColorMatrix();
            colorMatrix.setSaturation(3.0f);
            f3359a = RenderEffect.createColorFilterEffect(new ColorMatrixColorFilter(colorMatrix));
        }
        return f3359a;
    }

    public static Bitmap e(Bitmap bitmap) {
        if (Build.VERSION.SDK_INT >= 31) {
            return bitmap.asShared();
        }
        return bitmap;
    }

    public static boolean f(MediaDrm mediaDrm, String str, int i7) {
        return mediaDrm.requiresSecureDecoder(str, i7);
    }

    public static void g(Notification.Action.Builder builder) {
        builder.setAuthenticationRequired(false);
    }

    public static void h(MediaDrm mediaDrm, byte[] bArr, m2.j jVar) {
        LogSessionId logSessionId;
        LogSessionId a10 = jVar.a();
        logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
        if (!a10.equals(logSessionId)) {
            MediaDrm.PlaybackComponent playbackComponent = mediaDrm.getPlaybackComponent(bArr);
            playbackComponent.getClass();
            playbackComponent.setLogSessionId(a10);
        }
    }

    public static void i(b8 b8Var, m2.j jVar) {
        LogSessionId logSessionId;
        LogSessionId a10 = jVar.a();
        logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
        if (!a10.equals(logSessionId)) {
            ((MediaFormat) b8Var.f336b).setString("log-session-id", a10.getStringId());
        }
    }

    public static void j(q4.q qVar, ComponentName componentName) {
        try {
            MediaSession mediaSession = ((q4.l) qVar.f53803b).f53785a;
            mediaSession.getClass();
            mediaSession.setMediaButtonBroadcastReceiver(componentName);
        } catch (IllegalArgumentException e10) {
            if (Build.MANUFACTURER.equals("motorola")) {
                h2.a.d("MediaSessionLegacyStub", "caught IllegalArgumentException on a motorola device when attempting to set the media button broadcast receiver. See https://github.com/androidx/media/issues/1730 for details.", e10);
                return;
            }
            throw e10;
        }
    }
}
