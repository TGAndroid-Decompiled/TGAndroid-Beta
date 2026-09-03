package mh;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stars;
public final class o4 extends m4 {
    public final Paint f14522c;
    public final Matrix d;
    public final RadialGradient f14523e;
    public final int f14524f;
    public final int f14525g;
    public final int h;

    public o4(TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop) {
        this.f14449a = stargiftattributebackdrop.name;
        this.f14450b = stargiftattributebackdrop.getRarityPermille();
        Paint paint = new Paint(1);
        this.f14522c = paint;
        this.d = new Matrix();
        RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, AndroidUtilities.dp(200.0f), new int[]{stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.f14523e = radialGradient;
        paint.setShader(radialGradient);
        this.f14525g = stargiftattributebackdrop.text_color | (-16777216);
        int i10 = stargiftattributebackdrop.pattern_color;
        this.h = i10 | (-16777216);
        this.f14524f = i0.a.d(0.25f, stargiftattributebackdrop.edge_color | (-16777216), i10 | (-16777216));
    }
}
