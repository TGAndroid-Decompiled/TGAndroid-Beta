package bi;

import android.content.res.Resources;
import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Region;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.os.Build;
import android.view.RoundedCorner;
import android.view.View;
import android.view.WindowInsets;
public abstract class v {
    public static float f3876a = -1.0f;

    public static Canvas a(int i3, int i10, Object obj) {
        RenderNode d = o4.v0.d(obj);
        d.setPosition(0, 0, i3, i10);
        return d.beginRecording();
    }

    public static void b(Canvas canvas, Path path) {
        if (Build.VERSION.SDK_INT >= 26) {
            canvas.clipOutPath(path);
        } else {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
        }
    }

    public static void c(Canvas canvas, Object obj) {
        canvas.drawRenderNode(o4.v0.d(obj));
    }

    public static void d(Object obj) {
        o4.v0.d(obj).endRecording();
    }

    public static boolean e(Object obj) {
        if (obj != null && o4.v0.d(obj).hasDisplayList()) {
            return true;
        }
        return false;
    }

    public static boolean f() {
        if (Build.VERSION.SDK_INT >= 31) {
            return true;
        }
        return false;
    }

    public static float g(View view) {
        float f10;
        int identifier;
        WindowInsets windowInsets;
        float f11;
        if (Build.VERSION.SDK_INT >= 31) {
            if (view != null) {
                windowInsets = view.getRootWindowInsets();
            } else {
                windowInsets = null;
            }
            if (windowInsets == null) {
                f11 = -1.0f;
            } else {
                RoundedCorner roundedCorner = windowInsets.getRoundedCorner(0);
                if (roundedCorner != null) {
                    f11 = roundedCorner.getRadius();
                } else {
                    f11 = 0.0f;
                }
            }
            if (f11 >= 0.0f) {
                return f11;
            }
        }
        if (f3876a < 0.0f) {
            try {
                Resources system = Resources.getSystem();
                int identifier2 = system.getIdentifier("rounded_corner_radius_top", "dimen", "android");
                if (identifier2 != 0) {
                    f10 = system.getDimensionPixelSize(identifier2);
                } else {
                    f10 = 0.0f;
                }
                if (f10 <= 0.0f && (identifier = system.getIdentifier("rounded_corner_radius", "dimen", "android")) != 0) {
                    f10 = system.getDimensionPixelSize(identifier);
                }
            } catch (Exception unused) {
                f10 = 0.0f;
            }
            f3876a = Math.max(0.0f, f10);
        }
        return f3876a;
    }

    public static void h(Object obj, float f10) {
        o4.v0.d(obj).setAlpha(f10);
    }

    public static void i(int i3, Paint paint) {
        BlendMode blendMode;
        switch (i3) {
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

    public static void j(Object obj, float f10) {
        RenderEffect renderEffect;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        RenderNode renderNode = (RenderNode) obj;
        if (f10 > 0.0f) {
            renderEffect = RenderEffect.createBlurEffect(f10, f10, tileMode);
        } else {
            renderEffect = null;
        }
        renderNode.setRenderEffect(renderEffect);
    }

    public static void k(Object obj, float f10, float[] fArr) {
        o4.v0.d(obj).setRenderEffect(RenderEffect.createColorFilterEffect(new ColorMatrixColorFilter(fArr), RenderEffect.createBlurEffect(f10, f10, Shader.TileMode.CLAMP)));
    }

    public static ColorFilter l(int i3) {
        BlendMode blendMode;
        blendMode = BlendMode.SRC_IN;
        return new BlendModeColorFilter(i3, blendMode);
    }
}
