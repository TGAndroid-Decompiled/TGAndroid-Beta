package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.Layout;
public final class ryc extends Layout {
    public final qyc a;

    public ryc(qyc qycVar) {
        super(qycVar.a, syc.b, Math.max(1, qycVar.d), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f);
        this.a = qycVar;
    }

    @Override
    public final int getBottomPadding() {
        return 0;
    }

    @Override
    public final int getEllipsisCount(int i) {
        return 0;
    }

    @Override
    public final int getEllipsisStart(int i) {
        return 0;
    }

    @Override
    public final boolean getLineContainsTab(int i) {
        return false;
    }

    @Override
    public final int getLineCount() {
        return this.a.g.length;
    }

    @Override
    public final int getLineDescent(int i) {
        return 0;
    }

    @Override
    public final Layout.Directions getLineDirections(int i) {
        return null;
    }

    @Override
    public final int getLineForOffset(int i) {
        int i2 = 0;
        while (true) {
            qyc qycVar = this.a;
            float[][] fArr = qycVar.g;
            if (i2 < fArr.length) {
                int i3 = i2 + 1;
                if (i < qycVar.e[i3]) {
                    return i2;
                }
                i2 = i3;
            } else {
                return fArr.length - 1;
            }
        }
    }

    @Override
    public final float getLineLeft(int i) {
        float[][] fArr = this.a.g;
        return fArr[Math.max(0, Math.min(i, fArr.length - 1))][0];
    }

    @Override
    public final float getLineMax(int i) {
        return getLineRight(i);
    }

    @Override
    public final float getLineRight(int i) {
        float[][] fArr = this.a.g;
        float[] fArr2 = fArr[Math.max(0, Math.min(i, fArr.length - 1))];
        return fArr2[fArr2.length - 1];
    }

    @Override
    public final int getLineStart(int i) {
        qyc qycVar = this.a;
        return qycVar.e[Math.max(0, Math.min(i, qycVar.g.length))];
    }

    @Override
    public final int getLineTop(int i) {
        qyc qycVar = this.a;
        return qycVar.f[Math.max(0, Math.min(i, qycVar.g.length))];
    }

    @Override
    public final float getLineWidth(int i) {
        return getLineRight(i) - getLineLeft(i);
    }

    @Override
    public final int getOffsetForHorizontal(int i, float f) {
        float[][] fArr;
        qyc qycVar = this.a;
        int max = Math.max(0, Math.min(i, qycVar.g.length - 1));
        float[] fArr2 = qycVar.g[max];
        int[] iArr = qycVar.e;
        int i2 = iArr[max + 1] - iArr[max];
        int i3 = 0;
        for (int i4 = 0; i4 <= i2 && i4 < fArr2.length; i4++) {
            if (i4 < i2) {
                int i5 = i4 + 1;
                if (f >= (fArr2[i4] + fArr2[i5]) / 2.0f) {
                    i3 = i5;
                }
            }
        }
        if (i3 == i2 && i2 > 0 && max < fArr.length - 1 && Character.isWhitespace(qycVar.a.charAt((iArr[max] + i2) - 1))) {
            i3--;
        }
        return iArr[max] + i3;
    }

    @Override
    public final int getParagraphDirection(int i) {
        return 1;
    }

    @Override
    public final float getPrimaryHorizontal(int i) {
        int lineForOffset = getLineForOffset(i);
        qyc qycVar = this.a;
        float[] fArr = qycVar.g[lineForOffset];
        return fArr[Math.max(0, Math.min(i - qycVar.e[lineForOffset], fArr.length - 1))];
    }

    @Override
    public final float getSecondaryHorizontal(int i) {
        return getPrimaryHorizontal(i);
    }

    @Override
    public final void getSelectionPath(int i, int i2, Path path) {
        float lineLeft;
        float lineRight;
        Path path2;
        path.reset();
        if (i != i2) {
            if (i2 < i) {
                i2 = i;
                i = i2;
            }
            int lineForOffset = getLineForOffset(i);
            int lineForOffset2 = getLineForOffset(i2);
            int i3 = lineForOffset;
            while (i3 <= lineForOffset2) {
                if (i3 == lineForOffset) {
                    lineLeft = getPrimaryHorizontal(i);
                } else {
                    lineLeft = getLineLeft(i3);
                }
                float f = lineLeft;
                if (i3 == lineForOffset2) {
                    lineRight = getPrimaryHorizontal(i2);
                } else {
                    lineRight = getLineRight(i3);
                }
                float f2 = lineRight;
                if (f2 > f) {
                    path2 = path;
                    path2.addRect(f, getLineTop(i3), f2, getLineTop(i3 + 1), Path.Direction.CW);
                } else {
                    path2 = path;
                }
                i3++;
                path = path2;
            }
        }
    }

    @Override
    public final int getTopPadding() {
        return 0;
    }

    @Override
    public final boolean isRtlCharAt(int i) {
        return false;
    }

    @Override
    public final void draw(Canvas canvas, Path path, Paint paint, int i) {
    }

    @Override
    public final void draw(Canvas canvas) {
    }
}
