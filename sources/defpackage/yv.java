package defpackage;

import android.graphics.Bitmap;
import android.os.Build;
import android.view.Surface;
import android.view.TextureView;
import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class yv {
    public long a;
    public Bitmap b;

    public static yv a(VideoPlayerHolderBase videoPlayerHolderBase, xv xvVar) {
        ?? obj = new Object();
        obj.a = videoPlayerHolderBase.getCurrentPosition();
        if (videoPlayerHolderBase.firstFrameRendered) {
            TextureView textureView = xvVar.n;
            TextureView textureView2 = xvVar.n;
            if (textureView != null && textureView.getSurfaceTexture() != null) {
                if (Build.VERSION.SDK_INT >= 24) {
                    Surface surface = new Surface(textureView2.getSurfaceTexture());
                    Bitmap createBitmap = Bitmap.createBitmap(textureView2.getMeasuredWidth(), textureView2.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                    gl.x0(surface, createBitmap);
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
