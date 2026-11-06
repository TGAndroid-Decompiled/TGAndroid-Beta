package bi;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import org.telegram.tgnet.tl.TL_stars;
public final class p6 extends n6 {
    public final Paint f4514c;
    public final Matrix d;
    public final RadialGradient f4515e;
    public final int f4516f;
    public final int f4517g;
    public final int h;

    public p6(TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop) {
        this.f4408a = stargiftattributebackdrop.name;
        this.f4409b = stargiftattributebackdrop.getRarityPermille();
        Paint paint = new Paint(1);
        this.f4514c = paint;
        this.d = new Matrix();
        RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(200.0f), new int[]{stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.f4515e = radialGradient;
        paint.setShader(radialGradient);
        this.f4517g = stargiftattributebackdrop.text_color | (-16777216);
        int i7 = stargiftattributebackdrop.pattern_color;
        this.h = i7 | (-16777216);
        this.f4516f = i0.a.f(0.25f, stargiftattributebackdrop.edge_color | (-16777216), i7 | (-16777216));
    }
}
