package gh;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stars;
public final class s4 extends q4 {
    public final Paint f8869c;
    public final Matrix d;
    public final RadialGradient f8870e;
    public final int f8871f;
    public final int f8872g;
    public final int h;

    public s4(TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop) {
        this.f8748a = stargiftattributebackdrop.name;
        this.f8749b = stargiftattributebackdrop.getRarityPermille();
        Paint paint = new Paint(1);
        this.f8869c = paint;
        this.d = new Matrix();
        RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, AndroidUtilities.dp(200.0f), new int[]{stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.f8870e = radialGradient;
        paint.setShader(radialGradient);
        this.f8872g = stargiftattributebackdrop.text_color | (-16777216);
        int i9 = stargiftattributebackdrop.pattern_color;
        this.h = i9 | (-16777216);
        this.f8871f = i0.a.d(0.25f, stargiftattributebackdrop.edge_color | (-16777216), i9 | (-16777216));
    }
}
