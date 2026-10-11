package hg;

import android.graphics.Bitmap;
import org.telegram.messenger.Utilities;
public final class o1 implements org.telegram.ui.ActionBar.z1, gh.b, d9.e, e2.m, e2.n {
    public final int f11341a;

    public o1(int i10) {
        this.f11341a = i10;
    }

    @Override
    public Object a(Bitmap bitmap) {
        switch (this.f11341a) {
            case 1:
                if (bitmap != null && !bitmap.isRecycled()) {
                    Bitmap stackBlurBitmapWithScaleFactor = Utilities.stackBlurBitmapWithScaleFactor(bitmap, Math.max(bitmap.getWidth() / 90.0f, bitmap.getHeight() / 120.0f));
                    stackBlurBitmapWithScaleFactor.setHasAlpha(false);
                    return stackBlurBitmapWithScaleFactor;
                }
                return null;
            case 2:
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
    public Object apply(Object obj) {
        return new j2.f((e2.x) obj);
    }

    @Override
    public void e(Object obj, b2.q qVar) {
        j2.b bVar = (j2.b) obj;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        a2Var.dismiss();
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f11341a) {
            case 9:
                ((b2.z0) obj).onPlayerError(new i2.n(2, new RuntimeException("Player release timed out."), 1003));
                return;
            case 10:
                ((b2.z0) obj).onRenderedFirstFrame();
                return;
            case 11:
            case 25:
            default:
                ((j2.b) obj).getClass();
                return;
            case 12:
                ((j2.b) obj).getClass();
                return;
            case 13:
                ((j2.b) obj).getClass();
                return;
            case 14:
                ((j2.b) obj).getClass();
                return;
            case 15:
                ((j2.b) obj).getClass();
                return;
            case 16:
                ((j2.b) obj).getClass();
                return;
            case 17:
                ((j2.b) obj).getClass();
                return;
            case 18:
                ((j2.b) obj).getClass();
                return;
            case 19:
                ((j2.b) obj).getClass();
                return;
            case 20:
                ((j2.b) obj).getClass();
                return;
            case 21:
                ((j2.b) obj).getClass();
                return;
            case 22:
                ((j2.b) obj).getClass();
                return;
            case 23:
                ((j2.b) obj).getClass();
                return;
            case 24:
                ((j2.b) obj).getClass();
                return;
            case 26:
                ((j2.b) obj).getClass();
                return;
            case 27:
                ((j2.b) obj).getClass();
                return;
            case 28:
                ((j2.b) obj).getClass();
                return;
        }
    }

    public o1(j2.a aVar, int i10, int i11) {
        this.f11341a = i11;
    }

    public o1(j2.a aVar, int i10, int i11, boolean z10) {
        this.f11341a = 24;
    }

    public o1(j2.a aVar, Object obj, int i10) {
        this.f11341a = i10;
    }

    public o1(j2.a aVar, String str, long j3, long j10) {
        this.f11341a = 18;
    }

    public o1(j2.a aVar, boolean z10) {
        this.f11341a = 17;
    }

    public o1(j2.a aVar, boolean z10, int i10, int i11) {
        this.f11341a = i11;
    }
}
