package ah;

import android.content.Context;
import android.graphics.RadialGradient;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.media.session.MediaSession;
import android.os.Build;
import android.os.Bundle;
import android.text.style.LineHeightSpan;
import android.view.View;
import android.view.WindowInsets;
import g.z;
public abstract class b {
    public static void a(z zVar, View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            zVar.a(view.getUniqueDrawingId());
        } else {
            zVar.f8456b = true;
        }
    }

    public static RadialGradient b(float f7, float f10, float f11, long[] jArr, float[] fArr) {
        return new RadialGradient(f7, f10, f11, jArr, fArr, Shader.TileMode.CLAMP);
    }

    public static RenderNode c() {
        return new RenderNode("WebViewSwipeContainer");
    }

    public static RenderNode d(String str) {
        return new RenderNode(str);
    }

    public static MediaSession e(Context context, String str) {
        return new MediaSession(context, str, null);
    }

    public static MediaSession f(Context context, String str, Bundle bundle) {
        return new MediaSession(context, str, bundle);
    }

    public static LineHeightSpan.Standard g(int i10) {
        return new LineHeightSpan.Standard(i10);
    }

    public static WindowInsets.Builder h() {
        return new WindowInsets.Builder();
    }

    public static WindowInsets.Builder i(WindowInsets windowInsets) {
        return new WindowInsets.Builder(windowInsets);
    }

    public static void j() {
    }

    public static RenderNode k() {
        return new RenderNode(null);
    }

    public static void l() {
    }
}
