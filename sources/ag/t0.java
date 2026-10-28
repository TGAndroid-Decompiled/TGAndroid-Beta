package ag;

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
import f9.s1;
import j$.util.Comparator$CC;
import j$.util.Comparator$EL;
import java.io.ByteArrayInputStream;
import java.util.List;
import java.util.TreeSet;
public abstract class t0 {
    public static RenderEffect f1380a;

    public static RenderEffect a() {
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(1.125f);
        return RenderEffect.createColorFilterEffect(new ColorMatrixColorFilter(colorMatrix));
    }

    public static Bitmap b(int i10, int i11, byte[] bArr) {
        BitmapFactory.Options options;
        int i12 = 0;
        if (i11 != -1) {
            options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, i10, options);
            options.inJustDecodeBounds = false;
            options.inSampleSize = 1;
            for (int max = Math.max(options.outWidth, options.outHeight); max > i11; max /= 2) {
                options.inSampleSize *= 2;
            }
        } else {
            options = null;
        }
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, i10, options);
        if (options != null) {
            options.inSampleSize = 1;
        }
        if (decodeByteArray != null) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            try {
                r1.g gVar = new r1.g(byteArrayInputStream);
                byteArrayInputStream.close();
                switch (gVar.c()) {
                    case 3:
                    case 4:
                        i12 = 180;
                        break;
                    case 5:
                    case 8:
                        i12 = 270;
                        break;
                    case 6:
                    case 7:
                        i12 = 90;
                        break;
                }
                if (i12 != 0) {
                    Matrix matrix = new Matrix();
                    matrix.postRotate(i12);
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
        throw b2.x0.a(new IllegalStateException(), "Could not decode image data");
    }

    public static f9.i0 c(List list) {
        if (Build.VERSION.SDK_INT >= 31 && list != null) {
            TreeSet treeSet = new TreeSet(Comparator$EL.reversed(Comparator$CC.comparing(new k2.g(0))));
            for (Object obj : list) {
                AudioDescriptor e = jh.l.e(obj);
                if (e.getStandard() == 1) {
                    byte[] descriptor = e.getDescriptor();
                    if (descriptor.length != 3) {
                        e2.a.l("AudioDescriptorUtil", "Invalid SAD length: " + descriptor.length);
                    } else {
                        byte b10 = descriptor[0];
                        int i10 = (b10 & 7) + 1;
                        if (((b10 >> 3) & 15) == 1) {
                            treeSet.add(Integer.valueOf(e2.n0.t(i10)));
                        }
                    }
                }
            }
            return f9.i0.u(treeSet);
        }
        f9.g0 g0Var = f9.i0.f10286b;
        return s1.e;
    }

    public static RenderEffect d() {
        if (f1380a == null) {
            ColorMatrix colorMatrix = new ColorMatrix();
            colorMatrix.setSaturation(3.0f);
            f1380a = RenderEffect.createColorFilterEffect(new ColorMatrixColorFilter(colorMatrix));
        }
        return f1380a;
    }

    public static Bitmap e(Bitmap bitmap) {
        if (Build.VERSION.SDK_INT >= 31) {
            return bitmap.asShared();
        }
        return bitmap;
    }

    public static boolean f(MediaDrm mediaDrm, String str, int i10) {
        return mediaDrm.requiresSecureDecoder(str, i10);
    }

    public static void g(Notification.Action.Builder builder) {
        builder.setAuthenticationRequired(false);
    }

    public static void h(MediaDrm mediaDrm, byte[] bArr, j2.j jVar) {
        LogSessionId logSessionId;
        LogSessionId a2 = jVar.a();
        logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
        if (!a2.equals(logSessionId)) {
            MediaDrm.PlaybackComponent playbackComponent = mediaDrm.getPlaybackComponent(bArr);
            playbackComponent.getClass();
            playbackComponent.setLogSessionId(a2);
        }
    }

    public static void i(aa.m0 m0Var, j2.j jVar) {
        LogSessionId logSessionId;
        LogSessionId a2 = jVar.a();
        logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
        if (!a2.equals(logSessionId)) {
            ((MediaFormat) m0Var.f1151b).setString("log-session-id", a2.getStringId());
        }
    }

    public static void j(n4.s sVar, ComponentName componentName) {
        try {
            MediaSession mediaSession = ((n4.n) sVar.f18695b).f18678a;
            mediaSession.getClass();
            mediaSession.setMediaButtonBroadcastReceiver(componentName);
        } catch (IllegalArgumentException e) {
            if (Build.MANUFACTURER.equals("motorola")) {
                e2.a.d("MediaSessionLegacyStub", "caught IllegalArgumentException on a motorola device when attempting to set the media button broadcast receiver. See https://github.com/androidx/media/issues/1730 for details.", e);
                return;
            }
            throw e;
        }
    }
}
