package mf;

import android.graphics.Matrix;
import android.graphics.RectF;
import org.telegram.tgnet.SerializedData;

public final class c {

    public final RectF f18040a;

    public final Matrix f18041b;

    public c(RectF rectF, Matrix matrix) {
        this.f18040a = rectF;
        this.f18041b = matrix;
    }

    public static c a(SerializedData serializedData) {
        float f10 = serializedData.readFloat(true);
        float f11 = serializedData.readFloat(true);
        float f12 = serializedData.readFloat(true);
        float f13 = serializedData.readFloat(true);
        float[] fArr = {serializedData.readFloat(true), serializedData.readFloat(true), serializedData.readFloat(true), serializedData.readFloat(true), serializedData.readFloat(true), serializedData.readFloat(true), serializedData.readFloat(true), serializedData.readFloat(true), serializedData.readFloat(true)};
        RectF rectF = new RectF(f10, f11, f12 + f10, f13 + f11);
        Matrix matrix = new Matrix();
        matrix.setValues(fArr);
        return new c(rectF, matrix);
    }
}
