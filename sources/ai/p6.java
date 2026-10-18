package ai;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stars;
public final class p6 extends n6 {
    public final Paint f2011c;
    public final Matrix d;
    public final RadialGradient e;
    public final int f2012f;
    public final int f2013g;
    public final int h;

    public p6(TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop) {
        this.f1894a = stargiftattributebackdrop.name;
        this.f1895b = stargiftattributebackdrop.getRarityPermille();
        Paint paint = new Paint(1);
        this.f2011c = paint;
        this.d = new Matrix();
        RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, AndroidUtilities.dp(200.0f), new int[]{stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.e = radialGradient;
        paint.setShader(radialGradient);
        this.f2013g = stargiftattributebackdrop.text_color | (-16777216);
        int i10 = stargiftattributebackdrop.pattern_color;
        this.h = i10 | (-16777216);
        this.f2012f = i0.a.f(0.25f, stargiftattributebackdrop.edge_color | (-16777216), i10 | (-16777216));
    }
}
