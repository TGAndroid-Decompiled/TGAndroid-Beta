package org.telegram.messenger.wallpaper;

import android.graphics.Matrix;
import android.graphics.RectF;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.SvgHelper;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.xml.sax.Attributes;

public class WallpaperGiftPatternPosition {
    public final Matrix matrix;
    public final RectF rect;

    private WallpaperGiftPatternPosition(RectF rectF, Matrix matrix) {
        this.rect = rectF;
        this.matrix = matrix;
    }

    public static WallpaperGiftPatternPosition create(Attributes attributes, float f) {
        try {
            float f2 = Float.parseFloat(attributes.getValue("x"));
            float f3 = Float.parseFloat(attributes.getValue("y"));
            RectF rectF = new RectF(f2, f3, Float.parseFloat(attributes.getValue("width")) + f2, Float.parseFloat(attributes.getValue("height")) + f3);
            Matrix transform = SvgHelper.parseTransform(attributes.getValue("transform"));
            transform.postScale(f, f);
            return new WallpaperGiftPatternPosition(rectF, transform);
        } catch (Exception e) {
            FileLog.e(e);
            return null;
        }
    }

    public void serialize(OutputSerializedData outputSerializedData) {
        outputSerializedData.writeFloat(this.rect.left);
        outputSerializedData.writeFloat(this.rect.top);
        outputSerializedData.writeFloat(this.rect.width());
        outputSerializedData.writeFloat(this.rect.height());
        float[] fArr = new float[9];
        this.matrix.getValues(fArr);
        for (int i = 0; i < 9; i++) {
            outputSerializedData.writeFloat(fArr[i]);
        }
    }

    public static WallpaperGiftPatternPosition deserialize(InputSerializedData inputSerializedData) {
        float f = inputSerializedData.readFloat(true);
        float f2 = inputSerializedData.readFloat(true);
        float f3 = inputSerializedData.readFloat(true);
        float f4 = inputSerializedData.readFloat(true);
        float[] fArr = {inputSerializedData.readFloat(true), inputSerializedData.readFloat(true), inputSerializedData.readFloat(true), inputSerializedData.readFloat(true), inputSerializedData.readFloat(true), inputSerializedData.readFloat(true), inputSerializedData.readFloat(true), inputSerializedData.readFloat(true), inputSerializedData.readFloat(true)};
        RectF rectF = new RectF(f, f2, f3 + f, f4 + f2);
        Matrix matrix = new Matrix();
        matrix.setValues(fArr);
        return new WallpaperGiftPatternPosition(rectF, matrix);
    }
}
