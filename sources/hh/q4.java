package hh;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stars;

public final class q4 extends o4 {

    public final Paint f9902c;
    public final Matrix d;

    public final RadialGradient f9903e;

    public final int f9904f;

    public final int f9905g;
    public final int h;

    public q4(TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop) {
        this.f9824a = stargiftattributebackdrop.name;
        this.f9825b = stargiftattributebackdrop.getRarityPermille();
        Paint paint = new Paint(1);
        this.f9902c = paint;
        this.d = new Matrix();
        RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, AndroidUtilities.dp(200.0f), new int[]{stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.f9903e = radialGradient;
        paint.setShader(radialGradient);
        this.f9905g = stargiftattributebackdrop.text_color | (-16777216);
        int i10 = stargiftattributebackdrop.pattern_color;
        this.h = i10 | (-16777216);
        this.f9904f = i0.b.d(0.25f, stargiftattributebackdrop.edge_color | (-16777216), i10 | (-16777216));
    }
}
