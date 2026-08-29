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
import android.os.Build;
import android.os.CancellationSignal;
import android.text.TextPaint;
import android.widget.CompoundButton;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.core.graphics.drawable.IconCompat;
import java.io.InputStream;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import m.a1;
import org.telegram.messenger.FileLog;
public abstract class b {
    public static void A(LayerDrawable layerDrawable, LayerDrawable layerDrawable2, int i10) {
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

    public static androidx.biometric.e B(Object obj) {
        FingerprintManager.CryptoObject cryptoObject = (FingerprintManager.CryptoObject) obj;
        if (cryptoObject != null) {
            if (cryptoObject.getCipher() != null) {
                return new androidx.biometric.e(cryptoObject.getCipher());
            }
            if (cryptoObject.getSignature() != null) {
                return new androidx.biometric.e(cryptoObject.getSignature());
            }
            if (cryptoObject.getMac() != null) {
                return new androidx.biometric.e(cryptoObject.getMac());
            }
            return null;
        }
        return null;
    }

    public static FingerprintManager.CryptoObject C(androidx.biometric.e eVar) {
        if (eVar == null) {
            return null;
        }
        Mac mac = (Mac) eVar.d;
        Signature signature = (Signature) eVar.f1030b;
        Cipher cipher = (Cipher) eVar.f1031c;
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

    public static int c(a1 a1Var) {
        return a1Var.getBreakStrategy();
    }

    public static Drawable d(CompoundButton compoundButton) {
        return compoundButton.getButtonDrawable();
    }

    public static FingerprintManager.CryptoObject e(Object obj) {
        return ((FingerprintManager.AuthenticationResult) obj).getCryptoObject();
    }

    public static FingerprintManager f(Context context) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 == 23) {
            return (FingerprintManager) context.getSystemService(FingerprintManager.class);
        }
        if (i10 > 23 && context.getPackageManager().hasSystemFeature("android.hardware.fingerprint")) {
            return (FingerprintManager) context.getSystemService(FingerprintManager.class);
        }
        return null;
    }

    public static int g(a1 a1Var) {
        return a1Var.getHyphenationFrequency();
    }

    public static int h(Drawable drawable) {
        return drawable.getLayoutDirection();
    }

    public static Object i(Context context) {
        return context.getSystemService(AppOpsManager.class);
    }

    public static boolean j(Context context) {
        try {
            FingerprintManager f9 = eg.c.f(context.getSystemService("fingerprint"));
            if (f9 == null) {
                return false;
            }
            return f9.hasEnrolledFingerprints();
        } catch (Exception e10) {
            FileLog.e(e10);
            return false;
        }
    }

    public static boolean k(Object obj) {
        return ((FingerprintManager) obj).hasEnrolledFingerprints();
    }

    public static boolean l(TextPaint textPaint, String str) {
        return textPaint.hasGlyph(str);
    }

    public static boolean m(Context context) {
        try {
            FingerprintManager f9 = eg.c.f(context.getSystemService("fingerprint"));
            if (f9 == null) {
                return false;
            }
            return f9.isHardwareDetected();
        } catch (Exception e10) {
            FileLog.e(e10);
            return false;
        }
    }

    public static boolean n(Object obj) {
        return ((FingerprintManager) obj).isHardwareDetected();
    }

    public static int o(AppOpsManager appOpsManager, String str, String str2) {
        return appOpsManager.noteProxyOpNoThrow(str, str2);
    }

    public static String p(String str) {
        return AppOpsManager.permissionToOp(str);
    }

    public static void q(Activity activity, String[] strArr, int i10) {
        activity.requestPermissions(strArr, i10);
    }

    public static void r(a1 a1Var, int i10) {
        a1Var.setBreakStrategy(i10);
    }

    public static void s(TextView textView, ColorStateList colorStateList) {
        textView.setCompoundDrawableTintList(colorStateList);
    }

    public static void t(TextView textView, PorterDuff.Mode mode) {
        textView.setCompoundDrawableTintMode(mode);
    }

    public static void u(a1 a1Var, int i10) {
        a1Var.setHyphenationFrequency(i10);
    }

    public static void v(Notification.Builder builder, Icon icon) {
        builder.setLargeIcon(icon);
    }

    public static boolean w(int i10, Drawable drawable) {
        return drawable.setLayoutDirection(i10);
    }

    public static void x(PopupWindow popupWindow, boolean z10) {
        popupWindow.setOverlapAnchor(z10);
    }

    public static void y(PopupWindow popupWindow, int i10) {
        popupWindow.setWindowLayoutType(i10);
    }

    public static Icon z(IconCompat iconCompat, Context context) {
        Icon createWithBitmap;
        switch (iconCompat.f1169a) {
            case -1:
                return (Icon) iconCompat.f1170b;
            case 0:
            default:
                throw new IllegalArgumentException("Unknown type");
            case 1:
                createWithBitmap = Icon.createWithBitmap((Bitmap) iconCompat.f1170b);
                break;
            case 2:
                createWithBitmap = Icon.createWithResource(iconCompat.h(), iconCompat.f1172e);
                break;
            case 3:
                createWithBitmap = Icon.createWithData((byte[]) iconCompat.f1170b, iconCompat.f1172e, iconCompat.f1173f);
                break;
            case 4:
                createWithBitmap = Icon.createWithContentUri((String) iconCompat.f1170b);
                break;
            case 5:
                if (Build.VERSION.SDK_INT >= 26) {
                    createWithBitmap = i6.a.b((Bitmap) iconCompat.f1170b);
                    break;
                } else {
                    createWithBitmap = Icon.createWithBitmap(IconCompat.b((Bitmap) iconCompat.f1170b, false));
                    break;
                }
            case 6:
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 30) {
                    createWithBitmap = g0.f.d(iconCompat.j());
                    break;
                } else if (context != null) {
                    InputStream k9 = iconCompat.k(context);
                    if (k9 != null) {
                        if (i10 >= 26) {
                            createWithBitmap = i6.a.b(BitmapFactory.decodeStream(k9));
                            break;
                        } else {
                            createWithBitmap = Icon.createWithBitmap(IconCompat.b(BitmapFactory.decodeStream(k9), false));
                            break;
                        }
                    } else {
                        throw new IllegalStateException("Cannot load adaptive icon from uri: " + iconCompat.j());
                    }
                } else {
                    throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + iconCompat.j());
                }
        }
        ColorStateList colorStateList = iconCompat.f1174g;
        if (colorStateList != null) {
            createWithBitmap.setTintList(colorStateList);
        }
        PorterDuff.Mode mode = iconCompat.h;
        if (mode != IconCompat.f1168k) {
            createWithBitmap.setTintMode(mode);
        }
        return createWithBitmap;
    }
}
