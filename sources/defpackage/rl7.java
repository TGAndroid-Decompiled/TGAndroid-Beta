package defpackage;

import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.DrawFilter;
import android.graphics.Matrix;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Picture;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.RenderNode;
import android.graphics.fonts.Font;
import android.graphics.text.MeasuredText;
import android.os.Build;
public final class rl7 extends Canvas {
    public Canvas a;

    @Override
    public final boolean clipOutPath(Path path) {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.a.clipOutPath(path);
        }
        return false;
    }

    @Override
    public final boolean clipOutRect(float f, float f2, float f3, float f4) {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.a.clipOutRect(f, f2, f3, f4);
        }
        return false;
    }

    @Override
    public final boolean clipPath(Path path) {
        return this.a.clipPath(path);
    }

    @Override
    public final boolean clipRect(float f, float f2, float f3, float f4) {
        return false;
    }

    @Override
    public final void concat(Matrix matrix) {
        this.a.concat(matrix);
    }

    @Override
    public final void disableZ() {
        if (Build.VERSION.SDK_INT >= 29) {
            this.a.disableZ();
        }
    }

    @Override
    public final void drawARGB(int i, int i2, int i3, int i4) {
        this.a.drawARGB(i, i2, i3, i4);
    }

    @Override
    public final void drawArc(RectF rectF, float f, float f2, boolean z, Paint paint) {
        this.a.drawArc(rectF, f, f2, z, paint);
    }

    @Override
    public final void drawBitmap(Bitmap bitmap, Matrix matrix, Paint paint) {
        this.a.drawBitmap(bitmap, matrix, paint);
    }

    @Override
    public final void drawBitmapMesh(Bitmap bitmap, int i, int i2, float[] fArr, int i3, int[] iArr, int i4, Paint paint) {
        this.a.drawBitmapMesh(bitmap, i, i2, fArr, i3, iArr, i4, paint);
    }

    @Override
    public final void drawCircle(float f, float f2, float f3, Paint paint) {
        this.a.drawCircle(f, f2, f3, paint);
    }

    @Override
    public final void drawColor(long j, BlendMode blendMode) {
        if (Build.VERSION.SDK_INT >= 29) {
            this.a.drawColor(j, blendMode);
        }
    }

    @Override
    public final void drawDoubleRoundRect(RectF rectF, float[] fArr, RectF rectF2, float[] fArr2, Paint paint) {
        if (Build.VERSION.SDK_INT >= 29) {
            this.a.drawDoubleRoundRect(rectF, fArr, rectF2, fArr2, paint);
        }
    }

    @Override
    public final void drawGlyphs(int[] iArr, int i, float[] fArr, int i2, int i3, Font font, Paint paint) {
        this.a.drawGlyphs(iArr, i, fArr, i2, i3, font, paint);
    }

    @Override
    public final void drawLine(float f, float f2, float f3, float f4, Paint paint) {
        this.a.drawLine(f, f2, f3, f4, paint);
    }

    @Override
    public final void drawLines(float[] fArr, int i, int i2, Paint paint) {
        this.a.drawLines(fArr, i, i2, paint);
    }

    @Override
    public final void drawOval(RectF rectF, Paint paint) {
        this.a.drawOval(rectF, paint);
    }

    @Override
    public final void drawPaint(Paint paint) {
        this.a.drawPaint(paint);
    }

    @Override
    public final void drawPatch(NinePatch ninePatch, RectF rectF, Paint paint) {
        if (Build.VERSION.SDK_INT >= 31) {
            this.a.drawPatch(ninePatch, rectF, paint);
        }
    }

    @Override
    public final void drawPath(Path path, Paint paint) {
        this.a.drawPath(path, paint);
    }

    @Override
    public final void drawPicture(Picture picture, RectF rectF) {
        this.a.drawPicture(picture, rectF);
    }

    @Override
    public final void drawPoint(float f, float f2, Paint paint) {
        this.a.drawPoint(f, f2, paint);
    }

    @Override
    public final void drawPoints(float[] fArr, int i, int i2, Paint paint) {
        this.a.drawPoints(fArr, i, i2, paint);
    }

    @Override
    public final void drawPosText(String str, float[] fArr, Paint paint) {
        this.a.drawPosText(str, fArr, paint);
    }

    @Override
    public final void drawRGB(int i, int i2, int i3) {
        this.a.drawRGB(i, i2, i3);
    }

    @Override
    public final void drawRect(Rect rect, Paint paint) {
        this.a.drawRect(rect, paint);
    }

    @Override
    public final void drawRenderNode(RenderNode renderNode) {
        if (Build.VERSION.SDK_INT >= 29) {
            this.a.drawRenderNode(renderNode);
        }
    }

    @Override
    public final void drawRoundRect(RectF rectF, float f, float f2, Paint paint) {
        this.a.drawRoundRect(rectF, f, f2, paint);
    }

    @Override
    public final void drawText(String str, float f, float f2, Paint paint) {
        this.a.drawText(str, f, f2, paint);
    }

    @Override
    public final void drawTextOnPath(char[] cArr, int i, int i2, Path path, float f, float f2, Paint paint) {
        this.a.drawTextOnPath(cArr, i, i2, path, f, f2, paint);
    }

    @Override
    public final void drawTextRun(char[] cArr, int i, int i2, int i3, int i4, float f, float f2, boolean z, Paint paint) {
        this.a.drawTextRun(cArr, i, i2, i3, i4, f, f2, z, paint);
    }

    @Override
    public final void drawVertices(Canvas.VertexMode vertexMode, int i, float[] fArr, int i2, float[] fArr2, int i3, int[] iArr, int i4, short[] sArr, int i5, int i6, Paint paint) {
        this.a.drawVertices(vertexMode, i, fArr, i2, fArr2, i3, iArr, i4, sArr, i5, i6, paint);
    }

    @Override
    public final void enableZ() {
        if (Build.VERSION.SDK_INT >= 29) {
            this.a.enableZ();
        }
    }

    @Override
    public final boolean getClipBounds(Rect rect) {
        return this.a.getClipBounds(rect);
    }

    @Override
    public final int getDensity() {
        return this.a.getDensity();
    }

    @Override
    public final DrawFilter getDrawFilter() {
        return this.a.getDrawFilter();
    }

    @Override
    public final int getHeight() {
        return this.a.getHeight();
    }

    @Override
    public final void getMatrix(Matrix matrix) {
        this.a.getMatrix(matrix);
    }

    @Override
    public final int getMaximumBitmapHeight() {
        return this.a.getMaximumBitmapHeight();
    }

    @Override
    public final int getMaximumBitmapWidth() {
        return this.a.getMaximumBitmapWidth();
    }

    @Override
    public final int getSaveCount() {
        return this.a.getSaveCount();
    }

    @Override
    public final int getWidth() {
        return this.a.getWidth();
    }

    @Override
    public final boolean isOpaque() {
        return this.a.isOpaque();
    }

    @Override
    public final boolean quickReject(float f, float f2, float f3, float f4) {
        if (Build.VERSION.SDK_INT >= 30) {
            return this.a.quickReject(f, f2, f3, f4);
        }
        return false;
    }

    @Override
    public final void restore() {
        this.a.restore();
    }

    @Override
    public final void restoreToCount(int i) {
        this.a.restoreToCount(i);
    }

    @Override
    public final void rotate(float f) {
        this.a.rotate(f);
    }

    @Override
    public final int save() {
        return this.a.save();
    }

    @Override
    public final int saveLayer(float f, float f2, float f3, float f4, Paint paint) {
        return this.a.saveLayer(f, f2, f3, f4, paint);
    }

    @Override
    public final int saveLayerAlpha(RectF rectF, int i, int i2) {
        return this.a.saveLayerAlpha(rectF, i, i2);
    }

    @Override
    public final void scale(float f, float f2) {
        this.a.scale(f, f2);
    }

    @Override
    public final void setBitmap(Bitmap bitmap) {
        this.a.setBitmap(bitmap);
    }

    @Override
    public final void setDensity(int i) {
        this.a.setDensity(i);
    }

    @Override
    public final void setDrawFilter(DrawFilter drawFilter) {
        this.a.setDrawFilter(drawFilter);
    }

    @Override
    public final void setMatrix(Matrix matrix) {
        this.a.setMatrix(matrix);
    }

    @Override
    public final void skew(float f, float f2) {
        this.a.skew(f, f2);
    }

    @Override
    public final void translate(float f, float f2) {
        this.a.translate(f, f2);
    }

    @Override
    public final boolean clipRect(RectF rectF) {
        return false;
    }

    @Override
    public final boolean clipRect(Rect rect) {
        return false;
    }

    @Override
    public final boolean clipRect(int i, int i2, int i3, int i4) {
        return false;
    }

    @Override
    public final boolean clipRect(Rect rect, Region.Op op) {
        return false;
    }

    @Override
    public final boolean clipRect(RectF rectF, Region.Op op) {
        return false;
    }

    @Override
    public final void drawArc(float f, float f2, float f3, float f4, float f5, float f6, boolean z, Paint paint) {
        this.a.drawArc(f, f2, f3, f4, f5, f6, z, paint);
    }

    @Override
    public final void drawBitmap(Bitmap bitmap, Rect rect, Rect rect2, Paint paint) {
        this.a.drawBitmap(bitmap, rect, rect2, paint);
    }

    @Override
    public final void drawLines(float[] fArr, Paint paint) {
        this.a.drawLines(fArr, paint);
    }

    @Override
    public final void drawOval(float f, float f2, float f3, float f4, Paint paint) {
        this.a.drawOval(f, f2, f3, f4, paint);
    }

    @Override
    public final void drawPicture(Picture picture) {
        this.a.drawPicture(picture);
    }

    @Override
    public final void drawPoints(float[] fArr, Paint paint) {
        this.a.drawPoints(fArr, paint);
    }

    @Override
    public final void drawPosText(char[] cArr, int i, int i2, float[] fArr, Paint paint) {
        this.a.drawPosText(cArr, i, i2, fArr, paint);
    }

    @Override
    public final void drawRect(RectF rectF, Paint paint) {
        this.a.drawRect(rectF, paint);
    }

    @Override
    public final void drawRoundRect(float f, float f2, float f3, float f4, float f5, float f6, Paint paint) {
        this.a.drawRoundRect(f, f2, f3, f4, f5, f6, paint);
    }

    @Override
    public final void drawText(String str, int i, int i2, float f, float f2, Paint paint) {
        this.a.drawText(str, i, i2, f, f2, paint);
    }

    @Override
    public final void drawTextOnPath(String str, Path path, float f, float f2, Paint paint) {
        this.a.drawTextOnPath(str, path, f, f2, paint);
    }

    @Override
    public final void drawTextRun(MeasuredText measuredText, int i, int i2, int i3, int i4, float f, float f2, boolean z, Paint paint) {
        this.a.drawTextRun(measuredText, i, i2, i3, i4, f, f2, z, paint);
    }

    @Override
    public final boolean clipPath(Path path, Region.Op op) {
        return this.a.clipPath(path, op);
    }

    @Override
    public final boolean clipRect(float f, float f2, float f3, float f4, Region.Op op) {
        return false;
    }

    @Override
    public final void drawBitmap(int[] iArr, int i, int i2, float f, float f2, int i3, int i4, boolean z, Paint paint) {
        this.a.drawBitmap(iArr, i, i2, f, f2, i3, i4, z, paint);
    }

    @Override
    public final void drawPicture(Picture picture, Rect rect) {
        this.a.drawPicture(picture, rect);
    }

    @Override
    public final void drawRect(float f, float f2, float f3, float f4, Paint paint) {
        this.a.drawRect(f, f2, f3, f4, paint);
    }

    @Override
    public final void drawText(char[] cArr, int i, int i2, float f, float f2, Paint paint) {
        this.a.drawText(cArr, i, i2, f, f2, paint);
    }

    @Override
    public final void drawTextRun(CharSequence charSequence, int i, int i2, int i3, int i4, float f, float f2, boolean z, Paint paint) {
        this.a.drawTextRun(charSequence, i, i2, i3, i4, f, f2, z, paint);
    }

    @Override
    public final int saveLayer(RectF rectF, Paint paint) {
        return this.a.saveLayer(rectF, paint);
    }

    @Override
    public final int saveLayerAlpha(float f, float f2, float f3, float f4, int i) {
        return this.a.saveLayerAlpha(f, f2, f3, f4, i);
    }

    @Override
    public final void drawBitmap(int[] iArr, int i, int i2, int i3, int i4, int i5, int i6, boolean z, Paint paint) {
        this.a.drawBitmap(iArr, i, i2, i3, i4, i5, i6, z, paint);
    }

    @Override
    public final void drawText(CharSequence charSequence, int i, int i2, float f, float f2, Paint paint) {
        this.a.drawText(charSequence, i, i2, f, f2, paint);
    }

    @Override
    public final int saveLayer(float f, float f2, float f3, float f4, Paint paint, int i) {
        return this.a.saveLayer(f, f2, f3, f4, paint, i);
    }

    @Override
    public final int saveLayerAlpha(RectF rectF, int i) {
        return this.a.saveLayerAlpha(rectF, i);
    }

    @Override
    public final void drawBitmap(Bitmap bitmap, Rect rect, RectF rectF, Paint paint) {
        this.a.drawBitmap(bitmap, rect, rectF, paint);
    }

    @Override
    public final int saveLayer(RectF rectF, Paint paint, int i) {
        return this.a.saveLayer(rectF, paint, i);
    }

    @Override
    public final int saveLayerAlpha(float f, float f2, float f3, float f4, int i, int i2) {
        return this.a.saveLayerAlpha(f, f2, f3, f4, i, i2);
    }

    @Override
    public final void drawBitmap(Bitmap bitmap, float f, float f2, Paint paint) {
        this.a.drawBitmap(bitmap, f, f2, paint);
    }

    @Override
    public final void drawColor(int i, BlendMode blendMode) {
        if (Build.VERSION.SDK_INT >= 29) {
            this.a.drawColor(i, blendMode);
        }
    }

    @Override
    public final void drawDoubleRoundRect(RectF rectF, float f, float f2, RectF rectF2, float f3, float f4, Paint paint) {
        if (Build.VERSION.SDK_INT >= 29) {
            this.a.drawDoubleRoundRect(rectF, f, f2, rectF2, f3, f4, paint);
        }
    }

    @Override
    public final void drawPatch(NinePatch ninePatch, Rect rect, Paint paint) {
        if (Build.VERSION.SDK_INT >= 31) {
            this.a.drawPatch(ninePatch, rect, paint);
        }
    }

    @Override
    public final void drawColor(int i) {
        this.a.drawColor(i);
    }

    @Override
    public final boolean clipOutRect(int i, int i2, int i3, int i4) {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.a.clipOutRect(i, i2, i3, i4);
        }
        return false;
    }

    @Override
    public final void drawColor(int i, PorterDuff.Mode mode) {
        this.a.drawColor(i, mode);
    }

    @Override
    public final boolean quickReject(RectF rectF) {
        if (Build.VERSION.SDK_INT >= 30) {
            return this.a.quickReject(rectF);
        }
        return false;
    }

    @Override
    public final void drawColor(long j) {
        if (Build.VERSION.SDK_INT >= 29) {
            this.a.drawColor(j);
        }
    }

    @Override
    public final boolean clipOutRect(RectF rectF) {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.a.clipOutRect(rectF);
        }
        return false;
    }

    @Override
    public final boolean quickReject(Path path) {
        if (Build.VERSION.SDK_INT >= 30) {
            return this.a.quickReject(path);
        }
        return false;
    }

    @Override
    public final boolean clipOutRect(Rect rect) {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.a.clipOutRect(rect);
        }
        return false;
    }

    @Override
    public final boolean quickReject(RectF rectF, Canvas.EdgeType edgeType) {
        return this.a.quickReject(rectF, edgeType);
    }

    @Override
    public final boolean quickReject(Path path, Canvas.EdgeType edgeType) {
        return this.a.quickReject(path, edgeType);
    }

    @Override
    public final boolean quickReject(float f, float f2, float f3, float f4, Canvas.EdgeType edgeType) {
        return this.a.quickReject(f, f2, f3, f4, edgeType);
    }
}
