package ga;

import android.graphics.Bitmap;
import b2.q;
import b2.z0;
import cf.c;
import com.google.firebase.datatransport.TransportRegistrar;
import d9.e;
import e2.m;
import e2.n;
import e2.x;
import gh.b;
import i5.f;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.b2;
import q9.d;
public final class a implements d, a2, b, e, m, n {
    public final int f9528a;

    public a(int i10) {
        this.f9528a = i10;
    }

    @Override
    public Object G(c cVar) {
        f lambda$getComponents$0;
        lambda$getComponents$0 = TransportRegistrar.lambda$getComponents$0(cVar);
        return lambda$getComponents$0;
    }

    @Override
    public Object a(Bitmap bitmap) {
        switch (this.f9528a) {
            case 3:
                if (bitmap != null && !bitmap.isRecycled()) {
                    Bitmap stackBlurBitmapWithScaleFactor = Utilities.stackBlurBitmapWithScaleFactor(bitmap, Math.max(bitmap.getWidth() / 90.0f, bitmap.getHeight() / 120.0f));
                    stackBlurBitmapWithScaleFactor.setHasAlpha(false);
                    return stackBlurBitmapWithScaleFactor;
                }
                return null;
            case 4:
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
    public void e(Object obj, q qVar) {
        j2.b bVar = (j2.b) obj;
    }

    @Override
    public void f(b2 b2Var, int i10) {
        switch (this.f9528a) {
            case 1:
                b2Var.dismiss();
                return;
            default:
                b2Var.dismiss();
                return;
        }
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f9528a) {
            case 11:
                ((z0) obj).onPlayerError(new i2.n(2, new RuntimeException("Player release timed out."), 1003));
                return;
            case 12:
                ((z0) obj).onRenderedFirstFrame();
                return;
            case 13:
            case 27:
            default:
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
            case 26:
                ((j2.b) obj).getClass();
                return;
            case 28:
                ((j2.b) obj).getClass();
                return;
        }
    }

    public a(j2.a aVar, int i10, int i11) {
        this.f9528a = i11;
    }

    public a(j2.a aVar, int i10, int i11, boolean z10) {
        this.f9528a = 26;
    }

    public a(j2.a aVar, Object obj, int i10) {
        this.f9528a = i10;
    }

    public a(j2.a aVar, String str, long j3, long j10) {
        this.f9528a = 20;
    }

    public a(j2.a aVar, boolean z10) {
        this.f9528a = 19;
    }

    public a(j2.a aVar, boolean z10, int i10, int i11) {
        this.f9528a = i11;
    }
}
