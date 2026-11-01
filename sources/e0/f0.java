package e0;

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
import b2.w0;
import e9.x1;
import j$.util.Comparator$CC;
import j$.util.Comparator$EL;
import java.io.ByteArrayInputStream;
import java.util.List;
import java.util.TreeSet;
public abstract class f0 {
    public static RenderEffect f6014a;

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
        throw w0.a(new IllegalStateException(), "Could not decode image data");
    }

    public static e9.n0 c(List list) {
        if (Build.VERSION.SDK_INT >= 31 && list != null) {
            TreeSet treeSet = new TreeSet(Comparator$EL.reversed(Comparator$CC.comparing(new k2.f(0))));
            for (Object obj : list) {
                AudioDescriptor a2 = j2.e.a(obj);
                if (a2.getStandard() == 1) {
                    byte[] descriptor = a2.getDescriptor();
                    if (descriptor.length != 3) {
                        e2.a.l("AudioDescriptorUtil", "Invalid SAD length: " + descriptor.length);
                    } else {
                        byte b10 = descriptor[0];
                        int i10 = (b10 & 7) + 1;
                        if (((b10 >> 3) & 15) == 1) {
                            treeSet.add(Integer.valueOf(e2.l0.t(i10)));
                        }
                    }
                }
            }
            return e9.n0.u(treeSet);
        }
        e9.l0 l0Var = e9.n0.f6390b;
        return x1.e;
    }

    public static RenderEffect d() {
        if (f6014a == null) {
            ColorMatrix colorMatrix = new ColorMatrix();
            colorMatrix.setSaturation(3.0f);
            f6014a = RenderEffect.createColorFilterEffect(new ColorMatrixColorFilter(colorMatrix));
        }
        return f6014a;
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

    public static void h(MediaDrm mediaDrm, byte[] bArr, j2.l lVar) {
        LogSessionId logSessionId;
        LogSessionId a2 = lVar.a();
        logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
        if (!a2.equals(logSessionId)) {
            MediaDrm.PlaybackComponent playbackComponent = mediaDrm.getPlaybackComponent(bArr);
            playbackComponent.getClass();
            playbackComponent.setLogSessionId(a2);
        }
    }

    public static void i(j2.f fVar, j2.l lVar) {
        LogSessionId logSessionId;
        LogSessionId a2 = lVar.a();
        logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
        if (!a2.equals(logSessionId)) {
            ((MediaFormat) fVar.f9349b).setString("log-session-id", a2.getStringId());
        }
    }

    public static void j(n4.q qVar, ComponentName componentName) {
        try {
            MediaSession mediaSession = ((n4.l) qVar.f13527a).f13511a;
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
