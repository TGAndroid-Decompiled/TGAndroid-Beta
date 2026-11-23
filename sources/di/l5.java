package di;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import org.telegram.tgnet.tl.TL_stars;
public final class l5 extends j5 {
    public final Paint f9246c;
    public final Matrix d;
    public final RadialGradient f9247e;
    public final int f9248f;
    public final int f9249g;
    public final int h;

    public l5(TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop) {
        this.f9064a = stargiftattributebackdrop.name;
        this.f9065b = stargiftattributebackdrop.getRarityPermille();
        Paint paint = new Paint(1);
        this.f9246c = paint;
        this.d = new Matrix();
        RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(200.0f), new int[]{stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.f9247e = radialGradient;
        paint.setShader(radialGradient);
        this.f9249g = stargiftattributebackdrop.text_color | (-16777216);
        int i7 = stargiftattributebackdrop.pattern_color;
        this.h = i7 | (-16777216);
        this.f9248f = i0.a.f(0.25f, stargiftattributebackdrop.edge_color | (-16777216), i7 | (-16777216));
    }
}
