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
            float parseFloat = Float.parseFloat(attributes.getValue("x"));
            float parseFloat2 = Float.parseFloat(attributes.getValue("y"));
            RectF rectF = new RectF(parseFloat, parseFloat2, Float.parseFloat(attributes.getValue("width")) + parseFloat, Float.parseFloat(attributes.getValue("height")) + parseFloat2);
            Matrix parseTransform = SvgHelper.parseTransform(attributes.getValue("transform"));
            parseTransform.postScale(f, f);
            return new WallpaperGiftPatternPosition(rectF, parseTransform);
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
        float readFloat = inputSerializedData.readFloat(true);
        float readFloat2 = inputSerializedData.readFloat(true);
        float readFloat3 = inputSerializedData.readFloat(true);
        float readFloat4 = inputSerializedData.readFloat(true);
        float[] fArr = {inputSerializedData.readFloat(true), inputSerializedData.readFloat(true), inputSerializedData.readFloat(true), inputSerializedData.readFloat(true), inputSerializedData.readFloat(true), inputSerializedData.readFloat(true), inputSerializedData.readFloat(true), inputSerializedData.readFloat(true), inputSerializedData.readFloat(true)};
        RectF rectF = new RectF(readFloat, readFloat2, readFloat3 + readFloat, readFloat4 + readFloat2);
        Matrix matrix = new Matrix();
        matrix.setValues(fArr);
        return new WallpaperGiftPatternPosition(rectF, matrix);
    }
}
