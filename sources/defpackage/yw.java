package defpackage;

import android.graphics.Bitmap;
import android.os.Build;
import android.view.Surface;
import android.view.TextureView;
import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class yw {
    public long a;
    public Bitmap b;

    public static yw a(VideoPlayerHolderBase videoPlayerHolderBase, xw xwVar) {
        ?? obj = new Object();
        obj.a = videoPlayerHolderBase.getCurrentPosition();
        if (videoPlayerHolderBase.firstFrameRendered) {
            TextureView textureView = xwVar.n;
            TextureView textureView2 = xwVar.n;
            if (textureView != null && textureView.getSurfaceTexture() != null) {
                if (Build.VERSION.SDK_INT >= 24) {
                    Surface surface = new Surface(textureView2.getSurfaceTexture());
                    Bitmap createBitmap = Bitmap.createBitmap(textureView2.getMeasuredWidth(), textureView2.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                    gm.x0(surface, createBitmap);
                    surface.release();
                    obj.b = createBitmap;
                    return obj;
                }
                obj.b = textureView2.getBitmap();
            }
        }
        return obj;
    }
}
