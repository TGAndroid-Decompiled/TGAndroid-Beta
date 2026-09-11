package i0;

import android.graphics.Bitmap;
import b2.q;
import b2.z0;
import e2.m;
import e2.n;
import e2.x;
import i2.o;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.b2;
public final class b implements d9.e, m, a2, hh.b, n {
    public final int f11423a;

    public b(int i10) {
        this.f11423a = i10;
    }

    @Override
    public Object a(Bitmap bitmap) {
        switch (this.f11423a) {
            case 9:
                if (bitmap != null && !bitmap.isRecycled()) {
                    Bitmap stackBlurBitmapWithScaleFactor = Utilities.stackBlurBitmapWithScaleFactor(bitmap, Math.max(bitmap.getWidth() / 90.0f, bitmap.getHeight() / 120.0f));
                    stackBlurBitmapWithScaleFactor.setHasAlpha(false);
                    return stackBlurBitmapWithScaleFactor;
                }
                return null;
            case 10:
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
        return new j2.f((x) obj);
    }

    @Override
    public void c(Object obj, q qVar) {
        j2.b bVar = (j2.b) obj;
    }

    @Override
    public void g(b2 b2Var, int i10) {
        switch (this.f11423a) {
            case 7:
                b2Var.dismiss();
                return;
            default:
                b2Var.dismiss();
                return;
        }
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f11423a) {
            case 5:
                ((z0) obj).onPlayerError(new o(2, new RuntimeException("Player release timed out."), 1003));
                return;
            case 6:
                ((z0) obj).onRenderedFirstFrame();
                return;
            case 7:
            case 8:
            case 9:
            case 10:
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

    public b(j2.a aVar, int i10, int i11) {
        this.f11423a = i11;
    }

    public b(j2.a aVar, int i10, int i11, boolean z10) {
        this.f11423a = 24;
    }

    public b(j2.a aVar, Object obj, int i10) {
        this.f11423a = i10;
    }

    public b(j2.a aVar, String str, long j3, long j10) {
        this.f11423a = 18;
    }

    public b(j2.a aVar, boolean z10) {
        this.f11423a = 17;
    }

    public b(j2.a aVar, boolean z10, int i10, int i11) {
        this.f11423a = i11;
    }
}
