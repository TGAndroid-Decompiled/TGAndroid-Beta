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
    public static void A(LayerDrawable layerDrawable, LayerDrawable layerDrawable2, int i9) {
        layerDrawable2.setLayerGravity(i9, layerDrawable.getLayerGravity(i9));
        layerDrawable2.setLayerWidth(i9, layerDrawable.getLayerWidth(i9));
        layerDrawable2.setLayerHeight(i9, layerDrawable.getLayerHeight(i9));
        layerDrawable2.setLayerInsetLeft(i9, layerDrawable.getLayerInsetLeft(i9));
        layerDrawable2.setLayerInsetRight(i9, layerDrawable.getLayerInsetRight(i9));
        layerDrawable2.setLayerInsetTop(i9, layerDrawable.getLayerInsetTop(i9));
        layerDrawable2.setLayerInsetBottom(i9, layerDrawable.getLayerInsetBottom(i9));
        layerDrawable2.setLayerInsetStart(i9, layerDrawable.getLayerInsetStart(i9));
        layerDrawable2.setLayerInsetEnd(i9, layerDrawable.getLayerInsetEnd(i9));
    }

    public static j4.c B(Object obj) {
        FingerprintManager.CryptoObject cryptoObject = (FingerprintManager.CryptoObject) obj;
        if (cryptoObject != null) {
            if (cryptoObject.getCipher() != null) {
                return new j4.c(cryptoObject.getCipher());
            }
            if (cryptoObject.getSignature() != null) {
                return new j4.c(cryptoObject.getSignature());
            }
            if (cryptoObject.getMac() != null) {
                return new j4.c(cryptoObject.getMac());
            }
            return null;
        }
        return null;
    }

    public static FingerprintManager.CryptoObject C(j4.c cVar) {
        if (cVar == null) {
            return null;
        }
        Mac mac = (Mac) cVar.d;
        Signature signature = (Signature) cVar.f13431b;
        Cipher cipher = (Cipher) cVar.f13432c;
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
        int i9 = Build.VERSION.SDK_INT;
        if (i9 == 23) {
            return (FingerprintManager) context.getSystemService(FingerprintManager.class);
        }
        if (i9 > 23 && context.getPackageManager().hasSystemFeature("android.hardware.fingerprint")) {
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
            FingerprintManager d = a9.b.d(context.getSystemService("fingerprint"));
            if (d == null) {
                return false;
            }
            return d.hasEnrolledFingerprints();
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
            FingerprintManager d = a9.b.d(context.getSystemService("fingerprint"));
            if (d == null) {
                return false;
            }
            return d.isHardwareDetected();
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

    public static void q(Activity activity, String[] strArr, int i9) {
        activity.requestPermissions(strArr, i9);
    }

    public static void r(a1 a1Var, int i9) {
        a1Var.setBreakStrategy(i9);
    }

    public static void s(TextView textView, ColorStateList colorStateList) {
        textView.setCompoundDrawableTintList(colorStateList);
    }

    public static void t(TextView textView, PorterDuff.Mode mode) {
        textView.setCompoundDrawableTintMode(mode);
    }

    public static void u(a1 a1Var, int i9) {
        a1Var.setHyphenationFrequency(i9);
    }

    public static void v(Notification.Builder builder, Icon icon) {
        builder.setLargeIcon(icon);
    }

    public static boolean w(int i9, Drawable drawable) {
        return drawable.setLayoutDirection(i9);
    }

    public static void x(PopupWindow popupWindow, boolean z10) {
        popupWindow.setOverlapAnchor(z10);
    }

    public static void y(PopupWindow popupWindow, int i9) {
        popupWindow.setWindowLayoutType(i9);
    }

    public static Icon z(IconCompat iconCompat, Context context) {
        Icon createWithBitmap;
        switch (iconCompat.f675a) {
            case -1:
                return (Icon) iconCompat.f676b;
            case 0:
            default:
                throw new IllegalArgumentException("Unknown type");
            case 1:
                createWithBitmap = Icon.createWithBitmap((Bitmap) iconCompat.f676b);
                break;
            case 2:
                createWithBitmap = Icon.createWithResource(iconCompat.h(), iconCompat.f678e);
                break;
            case 3:
                createWithBitmap = Icon.createWithData((byte[]) iconCompat.f676b, iconCompat.f678e, iconCompat.f679f);
                break;
            case 4:
                createWithBitmap = Icon.createWithContentUri((String) iconCompat.f676b);
                break;
            case 5:
                if (Build.VERSION.SDK_INT >= 26) {
                    createWithBitmap = g6.a.b((Bitmap) iconCompat.f676b);
                    break;
                } else {
                    createWithBitmap = Icon.createWithBitmap(IconCompat.b((Bitmap) iconCompat.f676b, false));
                    break;
                }
            case 6:
                int i9 = Build.VERSION.SDK_INT;
                if (i9 >= 30) {
                    createWithBitmap = g0.f.d(iconCompat.j());
                    break;
                } else if (context != null) {
                    InputStream k10 = iconCompat.k(context);
                    if (k10 != null) {
                        if (i9 >= 26) {
                            createWithBitmap = g6.a.b(BitmapFactory.decodeStream(k10));
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
        ColorStateList colorStateList = iconCompat.f680g;
        if (colorStateList != null) {
            createWithBitmap.setTintList(colorStateList);
        }
        PorterDuff.Mode mode = iconCompat.h;
        if (mode != IconCompat.f674k) {
            createWithBitmap.setTintMode(mode);
        }
        return createWithBitmap;
    }
}
