package ng;

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
import org.telegram.ui.ActionBar.h6;
public final class a extends Drawable {
    public static SvgHelper.SvgDrawable f16891j;
    public static final int[] f16892k = {7322096, 16766590, 13338331, 9367192, 16749490, 16478047};
    public static final SparseArray f16893l;
    public final SvgHelper.SvgDrawable f16894a;
    public LinearGradient f16895b;
    public int f16897e;
    public final Paint f16898f;
    public final Paint f16899g;
    public int[] h;
    public final Matrix f16896c = new Matrix();
    public final ArrayList d = new ArrayList();
    public int f16900i = -1;

    static {
        SparseArray sparseArray = new SparseArray();
        f16893l = sparseArray;
        sparseArray.put(7322096, new int[]{-16687423, -11814913});
        sparseArray.put(16766590, new int[]{-1419264, -9380});
        sparseArray.put(13338331, new int[]{-6014789, -1737985});
        sparseArray.put(9367192, new int[]{-15617007, -6823116});
        sparseArray.put(16749490, new int[]{-1826470, -34407});
        sparseArray.put(16478047, new int[]{-3795707, -36532});
    }

    public a(int i10) {
        if (f16891j == null) {
            f16891j = SvgHelper.getDrawable(R.raw.topic_bubble, -1);
        }
        SvgHelper.SvgDrawable clone = f16891j.clone();
        this.f16894a = clone;
        clone.copyCommandFromPosition(0);
        Paint paint = new Paint(1);
        this.f16899g = paint;
        Paint paint2 = new Paint(1);
        this.f16898f = paint2;
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
        int i11 = this.f16900i;
        if (i11 == i10 && i11 == -1) {
            return;
        }
        this.f16900i = i10;
        int[] iArr2 = f16892k;
        int a2 = a(iArr2[0], i10);
        this.f16897e = 0;
        for (int i12 = 0; i12 < 6; i12++) {
            int a10 = a(iArr2[i12], i10);
            if (a10 < a2) {
                this.f16897e = i12;
                a2 = a10;
            }
        }
        int[] iArr3 = (int[]) f16893l.get(iArr2[this.f16897e]);
        if (h6.I.q()) {
            iArr = new int[]{i0.a.d(0.2f, iArr3[0], -1), i0.a.d(0.2f, iArr3[1], -1)};
        } else {
            iArr = iArr3;
        }
        this.h = iArr;
        Paint paint = new Paint(1);
        LinearGradient linearGradient = new LinearGradient(0.0f, 100.0f, 0.0f, 0.0f, iArr, (float[]) null, Shader.TileMode.CLAMP);
        this.f16895b = linearGradient;
        linearGradient.setLocalMatrix(this.f16896c);
        paint.setShader(this.f16895b);
        this.f16894a.setPaint(paint, 0);
        this.f16899g.setColor(i0.a.d(0.1f, iArr[1], -1));
        this.f16898f.setColor(i0.a.d(0.1f, iArr[0], -16777216));
    }

    @Override
    public final void draw(Canvas canvas) {
        Matrix matrix = this.f16896c;
        matrix.reset();
        matrix.setScale(1.0f, getBounds().height() / 100.0f);
        this.f16895b.setLocalMatrix(matrix);
        Rect bounds = getBounds();
        SvgHelper.SvgDrawable svgDrawable = this.f16894a;
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
        this.f16894a.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
