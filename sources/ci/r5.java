package ci;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import org.telegram.tgnet.tl.TL_stars;
public final class r5 extends p5 {
    public final Paint f5892c;
    public final Matrix d;
    public final RadialGradient f5893e;
    public final int f5894f;
    public final int f5895g;
    public final int h;

    public r5(TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop) {
        this.f5748a = stargiftattributebackdrop.name;
        this.f5749b = stargiftattributebackdrop.getRarityPermille();
        Paint paint = new Paint(1);
        this.f5892c = paint;
        this.d = new Matrix();
        RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(200.0f), new int[]{stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.f5893e = radialGradient;
        paint.setShader(radialGradient);
        this.f5895g = stargiftattributebackdrop.text_color | (-16777216);
        int i3 = stargiftattributebackdrop.pattern_color;
        this.h = i3 | (-16777216);
        this.f5894f = i0.a.f(0.25f, stargiftattributebackdrop.edge_color | (-16777216), i3 | (-16777216));
    }
}
