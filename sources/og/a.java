package og;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.ui.ActionBar.j6;
public final class a extends Drawable {
    public static SvgHelper.SvgDrawable f17011j;
    public static final int[] f17012k = {7322096, 16766590, 13338331, 9367192, 16749490, 16478047};
    public static final SparseArray f17013l;
    public final SvgHelper.SvgDrawable f17014a;
    public LinearGradient f17015b;
    public int f17017e;
    public final Paint f17018f;
    public final Paint f17019g;
    public int[] h;
    public final Matrix f17016c = new Matrix();
    public final ArrayList d = new ArrayList();
    public int f17020i = -1;

    static {
        SparseArray sparseArray = new SparseArray();
        f17013l = sparseArray;
        sparseArray.put(7322096, new int[]{-16687423, -11814913});
        sparseArray.put(16766590, new int[]{-1419264, -9380});
        sparseArray.put(13338331, new int[]{-6014789, -1737985});
        sparseArray.put(9367192, new int[]{-15617007, -6823116});
        sparseArray.put(16749490, new int[]{-1826470, -34407});
        sparseArray.put(16478047, new int[]{-3795707, -36532});
    }

    public a(int i10) {
        if (f17011j == null) {
            f17011j = SvgHelper.getDrawable(R.raw.topic_bubble, -1);
        }
        SvgHelper.SvgDrawable clone = f17011j.clone();
        this.f17014a = clone;
        clone.copyCommandFromPosition(0);
        Paint paint = new Paint(1);
        this.f17019g = paint;
        Paint paint2 = new Paint(1);
        this.f17018f = paint2;
        paint2.setStrokeWidth(AndroidUtilities.dp(1.0f));
        paint2.setStyle(Paint.Style.STROKE);
        clone.setPaint(paint, 1);
        clone.setPaint(paint2, 2);
        b(i10);
    }

    public static int a(int i10, int i11) {
        int abs = Math.abs(Color.red(i10) - Color.red(i11));
        return Math.abs(Color.blue(i10) - Color.blue(i11)) + Math.abs(Color.green(i10) - Color.green(i11)) + abs;
    }

    public final void b(int i10) {
        int[] iArr;
        int i11 = this.f17020i;
        if (i11 == i10 && i11 == -1) {
            return;
        }
        this.f17020i = i10;
        int[] iArr2 = f17012k;
        int a2 = a(iArr2[0], i10);
        this.f17017e = 0;
        for (int i12 = 0; i12 < 6; i12++) {
            int a10 = a(iArr2[i12], i10);
            if (a10 < a2) {
                this.f17017e = i12;
                a2 = a10;
            }
        }
        int[] iArr3 = (int[]) f17013l.get(iArr2[this.f17017e]);
        if (j6.I.q()) {
            iArr = new int[]{i0.a.d(0.2f, iArr3[0], -1), i0.a.d(0.2f, iArr3[1], -1)};
        } else {
            iArr = iArr3;
        }
        this.h = iArr;
        Paint paint = new Paint(1);
        LinearGradient linearGradient = new LinearGradient(0.0f, 100.0f, 0.0f, 0.0f, iArr, (float[]) null, Shader.TileMode.CLAMP);
        this.f17015b = linearGradient;
        linearGradient.setLocalMatrix(this.f17016c);
        paint.setShader(this.f17015b);
        this.f17014a.setPaint(paint, 0);
        this.f17019g.setColor(i0.a.d(0.1f, iArr[1], -1));
        this.f17018f.setColor(i0.a.d(0.1f, iArr[0], -16777216));
    }

    @Override
    public final void draw(Canvas canvas) {
        Matrix matrix = this.f17016c;
        matrix.reset();
        matrix.setScale(1.0f, getBounds().height() / 100.0f);
        this.f17015b.setLocalMatrix(matrix);
        Rect bounds = getBounds();
        SvgHelper.SvgDrawable svgDrawable = this.f17014a;
        svgDrawable.setBounds(bounds);
        svgDrawable.draw(canvas);
    }

    @Override
    public final int getIntrinsicHeight() {
        return AndroidUtilities.dp(24.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return AndroidUtilities.dp(24.0f);
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public final void invalidateSelf() {
        super.invalidateSelf();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i10 < arrayList.size()) {
                ((View) arrayList.get(i10)).invalidate();
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void setAlpha(int i10) {
        this.f17014a.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
