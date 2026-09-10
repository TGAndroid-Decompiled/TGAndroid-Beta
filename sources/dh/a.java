package dh;

import android.content.pm.ShortcutManager;
import android.graphics.Bitmap;
import android.window.OnBackInvokedDispatcher;
import bi.u6;
import ch.d;
import com.google.firebase.datatransport.TransportRegistrar;
import di.n3;
import di.o4;
import di.t4;
import i5.f;
import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.qv0;
import org.telegram.ui.Components.rv0;
import org.telegram.ui.Components.sv0;
public final class a implements d, qv0, rv0, GenericProvider, q9.d, c2, fh.b {
    public final int f6497a;

    public a(int i10) {
        this.f6497a = i10;
    }

    public static ShortcutManager d(Object obj) {
        return (ShortcutManager) obj;
    }

    public static OnBackInvokedDispatcher h(Object obj) {
        return (OnBackInvokedDispatcher) obj;
    }

    public static Class i() {
        return ShortcutManager.class;
    }

    @Override
    public Object P1(u6 u6Var) {
        f lambda$getComponents$0;
        lambda$getComponents$0 = TransportRegistrar.lambda$getComponents$0(u6Var);
        return lambda$getComponents$0;
    }

    @Override
    public Object a(Bitmap bitmap) {
        switch (this.f6497a) {
            case 25:
                if (bitmap != null && !bitmap.isRecycled()) {
                    Bitmap stackBlurBitmapWithScaleFactor = Utilities.stackBlurBitmapWithScaleFactor(bitmap, Math.max(bitmap.getWidth() / 90.0f, bitmap.getHeight() / 120.0f));
                    stackBlurBitmapWithScaleFactor.setHasAlpha(false);
                    return stackBlurBitmapWithScaleFactor;
                }
                return null;
            case 26:
                int i10 = 0;
                if (bitmap != null && !bitmap.isRecycled()) {
                    int height = bitmap.getHeight();
                    i10 = Utilities.averageBitmapColor(bitmap, 0, (height * 9) / 10, bitmap.getWidth(), height);
                }
                return Integer.valueOf(i10);
            default:
                int i11 = 0;
                if (bitmap != null && !bitmap.isRecycled()) {
                    i11 = Utilities.averageBitmapColor(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight() / 10);
                }
                return Integer.valueOf(i11);
        }
    }

    @Override
    public void b(Object obj, float f7) {
        switch (this.f6497a) {
            case 10:
                n3 n3Var = (n3) obj;
                n3Var.f6784b = f7;
                n3Var.e.invalidate();
                n3Var.W.setAlpha(f7);
                n3Var.E();
                n3Var.C();
                return;
            case 11:
            default:
                ((t4) obj).setSwipeOffsetY(f7);
                return;
            case 12:
                ((o4) obj).setLoadProgress(f7);
                return;
        }
    }

    @Override
    public void f(d2 d2Var, int i10) {
        switch (this.f6497a) {
            case 23:
                d2Var.dismiss();
                return;
            default:
                d2Var.dismiss();
                return;
        }
    }

    @Override
    public int g(f6 f6Var, boolean z10) {
        float f7;
        float f10;
        float f11;
        float f12;
        switch (this.f6497a) {
            case 0:
                return j6.l1(0.075f, -16777216);
            case 1:
                return j6.l1(0.88f, j6.v0(j6.f17928d6, f6Var));
            case 2:
                int w02 = j6.w0(null, j6.G8, false);
                if (z10) {
                    f7 = 0.85f;
                } else {
                    f7 = 0.825f;
                }
                return j6.l1(f7, w02);
            case 3:
                if (LiteMode.isEnabled(262144)) {
                    f10 = 0.85f;
                } else {
                    f10 = 0.76f;
                }
                return c.m(f10, j6.v0(j6.f17928d6, f6Var), j6.v0(j6.Yk, f6Var));
            case 4:
                if (LiteMode.isEnabled(262144)) {
                    f11 = 0.85f;
                } else {
                    f11 = 0.76f;
                }
                return j6.l1(f11, j6.v0(j6.f17928d6, f6Var));
            case 5:
                return j6.l1(0.78f, j6.v0(j6.f17998h5, f6Var));
            case 6:
                return j6.l1(0.7f, j6.v0(j6.f17928d6, f6Var));
            case 7:
                LiteMode.isEnabled(262144);
                return 0;
            default:
                if (LiteMode.isEnabled(262144)) {
                    f12 = 0.85f;
                } else {
                    f12 = 0.76f;
                }
                return j6.l1(f12, j6.v0(j6.f17928d6, f6Var));
        }
    }

    @Override
    public float get(Object obj) {
        switch (this.f6497a) {
            case 9:
                return ((n3) obj).f6784b;
            case 10:
            default:
                return ((t4) obj).getSwipeOffsetY();
            case 11:
                return ((o4) obj).f6834c;
        }
    }

    @Override
    public Object provide(Object obj) {
        Void r12 = (Void) obj;
        sv0 sv0Var = t4.f6914b0;
        return Boolean.FALSE;
    }
}
