package e0;

import android.app.Activity;
import android.app.AppOpsManager;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.graphics.drawable.LayerDrawable;
import android.hardware.fingerprint.FingerprintManager;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import android.text.TextPaint;
import android.widget.CompoundButton;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.core.graphics.drawable.IconCompat;
import bi.h8;
import java.io.InputStream;
import java.math.RoundingMode;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import m.z0;
import org.telegram.messenger.FileLog;
public abstract class b {
    public static void A(TextView textView, PorterDuff.Mode mode) {
        textView.setCompoundDrawableTintMode(mode);
    }

    public static void B(z0 z0Var, int i10) {
        z0Var.setHyphenationFrequency(i10);
    }

    public static void C(Notification.Builder builder, Icon icon) {
        builder.setLargeIcon(icon);
    }

    public static boolean D(int i10, Drawable drawable) {
        return drawable.setLayoutDirection(i10);
    }

    public static void E(MediaDescription.Builder builder, Uri uri) {
        builder.setMediaUri(uri);
    }

    public static void F(PopupWindow popupWindow, boolean z10) {
        popupWindow.setOverlapAnchor(z10);
    }

    public static void G(AudioTrack audioTrack, a6.i iVar) {
        AudioDeviceInfo audioDeviceInfo;
        if (iVar == null) {
            audioDeviceInfo = null;
        } else {
            audioDeviceInfo = (AudioDeviceInfo) iVar.f301b;
        }
        audioTrack.setPreferredDevice(audioDeviceInfo);
    }

    public static void H(PopupWindow popupWindow, int i10) {
        popupWindow.setWindowLayoutType(i10);
    }

    public static Icon I(IconCompat iconCompat, Context context) {
        Icon createWithBitmap;
        switch (iconCompat.f860a) {
            case -1:
                return (Icon) iconCompat.f861b;
            case 0:
            default:
                throw new IllegalArgumentException("Unknown type");
            case 1:
                createWithBitmap = Icon.createWithBitmap((Bitmap) iconCompat.f861b);
                break;
            case 2:
                createWithBitmap = Icon.createWithResource(iconCompat.h(), iconCompat.e);
                break;
            case 3:
                createWithBitmap = Icon.createWithData((byte[]) iconCompat.f861b, iconCompat.e, iconCompat.f863f);
                break;
            case 4:
                createWithBitmap = Icon.createWithContentUri((String) iconCompat.f861b);
                break;
            case 5:
                if (Build.VERSION.SDK_INT >= 26) {
                    createWithBitmap = c2.d.c((Bitmap) iconCompat.f861b);
                    break;
                } else {
                    createWithBitmap = Icon.createWithBitmap(IconCompat.b((Bitmap) iconCompat.f861b, false));
                    break;
                }
            case 6:
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 30) {
                    createWithBitmap = g0.f.d(iconCompat.j());
                    break;
                } else if (context != null) {
                    InputStream k10 = iconCompat.k(context);
                    if (k10 != null) {
                        if (i10 >= 26) {
                            createWithBitmap = c2.d.c(BitmapFactory.decodeStream(k10));
                            break;
                        } else {
                            createWithBitmap = Icon.createWithBitmap(IconCompat.b(BitmapFactory.decodeStream(k10), false));
                            break;
                        }
                    } else {
                        throw new IllegalStateException("Cannot load adaptive icon from uri: " + iconCompat.j());
                    }
                } else {
                    throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + iconCompat.j());
                }
        }
        ColorStateList colorStateList = iconCompat.f864g;
        if (colorStateList != null) {
            createWithBitmap.setTintList(colorStateList);
        }
        PorterDuff.Mode mode = iconCompat.h;
        if (mode != IconCompat.f859k) {
            createWithBitmap.setTintMode(mode);
        }
        return createWithBitmap;
    }

    public static void J(LayerDrawable layerDrawable, LayerDrawable layerDrawable2, int i10) {
        layerDrawable2.setLayerGravity(i10, layerDrawable.getLayerGravity(i10));
        layerDrawable2.setLayerWidth(i10, layerDrawable.getLayerWidth(i10));
        layerDrawable2.setLayerHeight(i10, layerDrawable.getLayerHeight(i10));
        layerDrawable2.setLayerInsetLeft(i10, layerDrawable.getLayerInsetLeft(i10));
        layerDrawable2.setLayerInsetRight(i10, layerDrawable.getLayerInsetRight(i10));
        layerDrawable2.setLayerInsetTop(i10, layerDrawable.getLayerInsetTop(i10));
        layerDrawable2.setLayerInsetBottom(i10, layerDrawable.getLayerInsetBottom(i10));
        layerDrawable2.setLayerInsetStart(i10, layerDrawable.getLayerInsetStart(i10));
        layerDrawable2.setLayerInsetEnd(i10, layerDrawable.getLayerInsetEnd(i10));
    }

    public static void K(Context context, AudioDeviceCallback audioDeviceCallback) {
        c2.d.e(context).unregisterAudioDeviceCallback(audioDeviceCallback);
    }

    public static aa.a L(Object obj) {
        FingerprintManager.CryptoObject cryptoObject = (FingerprintManager.CryptoObject) obj;
        if (cryptoObject != null) {
            if (cryptoObject.getCipher() != null) {
                return new aa.a(cryptoObject.getCipher());
            }
            if (cryptoObject.getSignature() != null) {
                return new aa.a(cryptoObject.getSignature());
            }
            if (cryptoObject.getMac() != null) {
                return new aa.a(cryptoObject.getMac());
            }
            return null;
        }
        return null;
    }

    public static FingerprintManager.CryptoObject M(aa.a aVar) {
        if (aVar == null) {
            return null;
        }
        Mac mac = (Mac) aVar.d;
        Signature signature = (Signature) aVar.f355b;
        Cipher cipher = (Cipher) aVar.f356c;
        if (cipher != null) {
            return new FingerprintManager.CryptoObject(cipher);
        }
        if (signature != null) {
            return new FingerprintManager.CryptoObject(signature);
        }
        if (mac == null) {
            return null;
        }
        return new FingerprintManager.CryptoObject(mac);
    }

    public static void a(Object obj, Object obj2, CancellationSignal cancellationSignal, k0.a aVar) {
        ((FingerprintManager) obj).authenticate((FingerprintManager.CryptoObject) obj2, cancellationSignal, 0, aVar, null);
    }

    public static Notification.Action.Builder b(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
        return new Notification.Action.Builder(icon, charSequence, pendingIntent);
    }

    public static long c(AudioTrack audioTrack, k2.w wVar) {
        boolean z10;
        if (wVar.f12231c == 0) {
            return e2.d0.W(wVar.e, audioTrack.getBufferSizeInFrames());
        }
        long bufferSizeInFrames = audioTrack.getBufferSizeInFrames();
        int i10 = c3.b.i(wVar.f12233g);
        if (i10 != -2147483647) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.g(z10);
        return e2.d0.Y(bufferSizeInFrames, 1000000L, i10, RoundingMode.DOWN);
    }

    public static int d(z0 z0Var) {
        return z0Var.getBreakStrategy();
    }

    public static Drawable e(CompoundButton compoundButton) {
        return compoundButton.getButtonDrawable();
    }

    public static FingerprintManager.CryptoObject f(Object obj) {
        return ((FingerprintManager.AuthenticationResult) obj).getCryptoObject();
    }

    public static FingerprintManager g(Context context) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 == 23) {
            return (FingerprintManager) context.getSystemService(FingerprintManager.class);
        }
        if (i10 > 23 && context.getPackageManager().hasSystemFeature("android.hardware.fingerprint")) {
            return (FingerprintManager) context.getSystemService(FingerprintManager.class);
        }
        return null;
    }

    public static int h(z0 z0Var) {
        return z0Var.getHyphenationFrequency();
    }

    public static int i(Drawable drawable) {
        return drawable.getLayoutDirection();
    }

    public static Uri j(MediaDescription mediaDescription) {
        return mediaDescription.getMediaUri();
    }

    public static Object k(Context context) {
        return context.getSystemService(AppOpsManager.class);
    }

    public static boolean l(Context context) {
        try {
            FingerprintManager c10 = u2.c.c(context.getSystemService("fingerprint"));
            if (c10 == null) {
                return false;
            }
            return c10.hasEnrolledFingerprints();
        } catch (Exception e) {
            FileLog.e(e);
            return false;
        }
    }

    public static boolean m(Object obj) {
        return ((FingerprintManager) obj).hasEnrolledFingerprints();
    }

    public static boolean n(TextPaint textPaint, String str) {
        return textPaint.hasGlyph(str);
    }

    public static boolean o(AudioManager audioManager, a6.i iVar) {
        AudioDeviceInfo[] audioDeviceInfoArr;
        if (iVar == null) {
            audioManager.getClass();
            audioDeviceInfoArr = audioManager.getDevices(2);
        } else {
            audioDeviceInfoArr = new AudioDeviceInfo[]{(AudioDeviceInfo) iVar.f301b};
        }
        ?? wVar = new com.google.android.gms.common.api.internal.w(4);
        Integer[] numArr = {8, 7};
        e9.q.d(2, numArr);
        wVar.g(2);
        System.arraycopy(numArr, 0, wVar.f4960c, wVar.f4958a, 2);
        wVar.f4958a += 2;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            Integer[] numArr2 = {26, 27};
            e9.q.d(2, numArr2);
            wVar.g(2);
            System.arraycopy(numArr2, 0, wVar.f4960c, wVar.f4958a, 2);
            wVar.f4958a += 2;
        }
        if (i10 >= 33) {
            wVar.b(30);
        }
        e9.m0 i11 = wVar.i();
        for (AudioDeviceInfo audioDeviceInfo : audioDeviceInfoArr) {
            if (i11.contains(Integer.valueOf(audioDeviceInfo.getType()))) {
                return true;
            }
        }
        return false;
    }

    public static boolean p(Context context) {
        try {
            FingerprintManager c10 = u2.c.c(context.getSystemService("fingerprint"));
            if (c10 == null) {
                return false;
            }
            return c10.isHardwareDetected();
        } catch (Exception e) {
            FileLog.e(e);
            return false;
        }
    }

    public static boolean q(Object obj) {
        return ((FingerprintManager) obj).isHardwareDetected();
    }

    public static boolean r(Throwable th2) {
        return j2.h.f(th2);
    }

    public static int s(AppOpsManager appOpsManager, String str, String str2) {
        return appOpsManager.noteProxyOpNoThrow(str, str2);
    }

    public static String t(String str) {
        return AppOpsManager.permissionToOp(str);
    }

    public static void u(Context context, k2.c cVar, Handler handler) {
        c2.d.e(context).registerAudioDeviceCallback(cVar, handler);
    }

    public static void v(Activity activity, String[] strArr, int i10) {
        activity.requestPermissions(strArr, i10);
    }

    public static void w(k2.p pVar, Object obj) {
        a6.i iVar;
        AudioDeviceInfo c10 = j2.h.c(obj);
        k2.e0 e0Var = (k2.e0) pVar;
        if (c10 == null) {
            iVar = null;
        } else {
            e0Var.getClass();
            iVar = new a6.i(c10, 27);
        }
        e0Var.f12097c0 = iVar;
        h8 h8Var = e0Var.f12126z;
        if (h8Var != null) {
            h8Var.c(c10);
        }
        AudioTrack audioTrack = e0Var.f12124x;
        if (audioTrack != null) {
            G(audioTrack, e0Var.f12097c0);
        }
    }

    public static void x(k2.p pVar, Object obj) {
        a6.i iVar;
        AudioDeviceInfo c10 = j2.h.c(obj);
        k2.e0 e0Var = (k2.e0) pVar;
        if (c10 == null) {
            iVar = null;
        } else {
            e0Var.getClass();
            iVar = new a6.i(c10, 27);
        }
        e0Var.f12097c0 = iVar;
        h8 h8Var = e0Var.f12126z;
        if (h8Var != null) {
            h8Var.c(c10);
        }
        AudioTrack audioTrack = e0Var.f12124x;
        if (audioTrack != null) {
            G(audioTrack, e0Var.f12097c0);
        }
    }

    public static void y(z0 z0Var, int i10) {
        z0Var.setBreakStrategy(i10);
    }

    public static void z(TextView textView, ColorStateList colorStateList) {
        textView.setCompoundDrawableTintList(colorStateList);
    }
}
