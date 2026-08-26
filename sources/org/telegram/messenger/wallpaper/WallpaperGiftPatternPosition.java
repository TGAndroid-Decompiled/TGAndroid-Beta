package org.telegram.messenger.wallpaper;

import android.graphics.Matrix;
import android.graphics.RectF;
import org.telegram.tgnet.SerializedData;

public final class WallpaperGiftPatternPosition {
    public final Matrix matrix;
    public final RectF rect;

    public WallpaperGiftPatternPosition(RectF rectF, Matrix matrix) {
        this.rect = rectF;
        this.matrix = matrix;
    }

    public static WallpaperGiftPatternPosition deserialize(SerializedData serializedData) {
        float f = serializedData.readFloat(true);
        float f2 = serializedData.readFloat(true);
        float f3 = serializedData.readFloat(true);
        float f4 = serializedData.readFloat(true);
        float[] fArr = {serializedData.readFloat(true), serializedData.readFloat(true), serializedData.readFloat(true), serializedData.readFloat(true), serializedData.readFloat(true), serializedData.readFloat(true), serializedData.readFloat(true), serializedData.readFloat(true), serializedData.readFloat(true)};
        RectF rectF = new RectF(f, f2, f3 + f, f4 + f2);
        Matrix matrix = new Matrix();
        matrix.setValues(fArr);
        return new WallpaperGiftPatternPosition(rectF, matrix);
    }
}
