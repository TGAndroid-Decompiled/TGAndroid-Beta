package ih;

import android.graphics.Bitmap;
import e2.o;
import org.telegram.messenger.Utilities;
public final class l implements hh.b, o {
    public final int f13189a;

    @Override
    public Object a(Bitmap bitmap) {
        switch (this.f13189a) {
            case 0:
                if (bitmap != null && !bitmap.isRecycled()) {
                    Bitmap stackBlurBitmapWithScaleFactor = Utilities.stackBlurBitmapWithScaleFactor(bitmap, Math.max(bitmap.getWidth() / 90.0f, bitmap.getHeight() / 120.0f));
                    stackBlurBitmapWithScaleFactor.setHasAlpha(false);
                    return stackBlurBitmapWithScaleFactor;
                }
                return null;
            case 1:
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
    public void invoke(Object obj) {
        j2.b bVar = (j2.b) obj;
        switch (this.f13189a) {
            case 3:
                bVar.getClass();
                return;
            case 4:
                bVar.getClass();
                return;
            case 5:
                bVar.getClass();
                return;
            case 6:
                bVar.getClass();
                return;
            case 7:
                bVar.getClass();
                return;
            case 8:
                bVar.getClass();
                return;
            case 9:
                bVar.getClass();
                return;
            case 10:
                bVar.getClass();
                return;
            case 11:
                bVar.getClass();
                return;
            case 12:
                bVar.getClass();
                return;
            case 13:
                bVar.getClass();
                return;
            case 14:
                bVar.getClass();
                return;
            case 15:
                bVar.getClass();
                return;
            case 16:
                bVar.getClass();
                return;
            case 17:
                bVar.getClass();
                return;
            case 18:
                bVar.getClass();
                return;
            case 19:
                bVar.getClass();
                return;
            case 20:
                bVar.getClass();
                return;
            case 21:
                bVar.getClass();
                return;
            case 22:
                bVar.getClass();
                return;
            case 23:
                bVar.getClass();
                return;
            case 24:
                bVar.getClass();
                return;
            case 25:
                bVar.getClass();
                return;
            case 26:
                bVar.getClass();
                return;
            case 27:
                bVar.getClass();
                return;
            case 28:
                bVar.getClass();
                return;
            default:
                bVar.getClass();
                return;
        }
    }

    public l(j2.a aVar) {
        this.f13189a = 24;
    }

    public l(j2.a aVar, int i10, int i11, char c10) {
        this.f13189a = i11;
    }

    public l(j2.a aVar, String str, long j10, long j11, int i10) {
        this.f13189a = i10;
    }
}
