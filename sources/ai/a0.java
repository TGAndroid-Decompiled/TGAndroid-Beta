package ai;

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
public abstract class a0 {
    public static float f1120a = -1.0f;

    public static Canvas a(int i7, int i10, Object obj) {
        RenderNode e10 = ni.a.e(obj);
        e10.setPosition(0, 0, i7, i10);
        return e10.beginRecording();
    }

    public static void b(Canvas canvas, Path path) {
        if (Build.VERSION.SDK_INT >= 26) {
            canvas.clipOutPath(path);
        } else {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
        }
    }

    public static void c(Canvas canvas, Object obj) {
        canvas.drawRenderNode(ni.a.e(obj));
    }

    public static void d(Object obj) {
        ni.a.e(obj).endRecording();
    }

    public static boolean e(Object obj) {
        if (obj != null && ni.a.e(obj).hasDisplayList()) {
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
        if (f1120a < 0.0f) {
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
            f1120a = Math.max(0.0f, f10);
        }
        return f1120a;
    }

    public static void h(Object obj, float f10) {
        ni.a.e(obj).setAlpha(f10);
    }

    public static void i(int i7, Paint paint) {
        BlendMode blendMode;
        switch (i7) {
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
        ni.a.e(obj).setRenderEffect(RenderEffect.createColorFilterEffect(new ColorMatrixColorFilter(fArr), RenderEffect.createBlurEffect(f10, f10, Shader.TileMode.CLAMP)));
    }

    public static ColorFilter l(int i7) {
        BlendMode blendMode;
        blendMode = BlendMode.SRC_IN;
        return new BlendModeColorFilter(i7, blendMode);
    }
}
