package defpackage;

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
public abstract class vk1 {
    public static void a(qeb qebVar, View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            qebVar.a(view.getUniqueDrawingId());
        } else {
            qebVar.b = true;
        }
    }

    public static RadialGradient b(float f, float f2, float f3, long[] jArr, float[] fArr) {
        return new RadialGradient(f, f2, f3, jArr, fArr, Shader.TileMode.CLAMP);
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

    public static LineHeightSpan.Standard g(int i) {
        return new LineHeightSpan.Standard(i);
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

    public static RenderNode m() {
        return new RenderNode("debug");
    }

    public static void n() {
    }

    public static RenderNode o() {
        return new RenderNode("glass-fade-overlay-only");
    }

    public static void p() {
    }

    public static RenderNode q() {
        return new RenderNode("glass-fade-content");
    }

    public static void r() {
    }
}
