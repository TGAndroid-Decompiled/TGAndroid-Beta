package hg;

import android.graphics.Bitmap;
import org.telegram.messenger.Utilities;
public final class r implements org.telegram.ui.ActionBar.z1, gh.b, d9.e, e2.m, e2.n {
    public final int f10381a;

    public r(int i10) {
        this.f10381a = i10;
    }

    @Override
    public Object a(Bitmap bitmap) {
        switch (this.f10381a) {
            case 2:
                if (bitmap != null && !bitmap.isRecycled()) {
                    Bitmap stackBlurBitmapWithScaleFactor = Utilities.stackBlurBitmapWithScaleFactor(bitmap, Math.max(bitmap.getWidth() / 90.0f, bitmap.getHeight() / 120.0f));
                    stackBlurBitmapWithScaleFactor.setHasAlpha(false);
                    return stackBlurBitmapWithScaleFactor;
                }
                return null;
            case 3:
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
        switch (this.f10381a) {
            case 0:
                a2Var.dismiss();
                return;
            default:
                a2Var.dismiss();
                return;
        }
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f10381a) {
            case 10:
                ((b2.z0) obj).onPlayerError(new i2.n(2, new RuntimeException("Player release timed out."), 1003));
                return;
            case 11:
                ((b2.z0) obj).onRenderedFirstFrame();
                return;
            case 12:
            case 26:
            default:
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
            case 25:
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

    public r(j2.a aVar, int i10, int i11) {
        this.f10381a = i11;
    }

    public r(j2.a aVar, int i10, int i11, boolean z10) {
        this.f10381a = 25;
    }

    public r(j2.a aVar, Object obj, int i10) {
        this.f10381a = i10;
    }

    public r(j2.a aVar, String str, long j3, long j10) {
        this.f10381a = 19;
    }

    public r(j2.a aVar, boolean z10) {
        this.f10381a = 18;
    }

    public r(j2.a aVar, boolean z10, int i10, int i11) {
        this.f10381a = i11;
    }
}
