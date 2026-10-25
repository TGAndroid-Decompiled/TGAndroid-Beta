package ch;

import android.graphics.RecordingCanvas;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.util.SparseArray;
import android.view.View;
import jh.k;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.mg0;
import org.telegram.ui.og0;
import org.telegram.ui.pg0;
import org.telegram.ui.sg1;
public final class h {
    public final RenderNode f6347a;
    public final mg0 f6348b;
    public final a f6349c = new Object();
    public long d = 0;
    public int e;
    public int f6350f;

    public h(RenderNode renderNode, mg0 mg0Var) {
        this.f6347a = renderNode;
        this.f6348b = mg0Var;
    }

    public final void a() {
        long j10;
        boolean z10;
        hh.d y3;
        int width = this.f6347a.getWidth();
        int height = this.f6347a.getHeight();
        a aVar = this.f6349c;
        aVar.f6297b = 0L;
        aVar.f6296a = false;
        pg0 pg0Var = this.f6348b.f41553a;
        int themedColor = pg0Var.getThemedColor(y6.f23354d6);
        RectF rectF = pg0Var.S;
        aVar.a(themedColor);
        aVar.b(SharedConfig.chatBlurEnabled());
        SparseArray sparseArray = pg0Var.f44130a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            r2 r2Var = ((sg1) sparseArray.valueAt(i10)).f43502a;
            View view = r2Var.fragmentView;
            if (view != null && k.c(view, pg0Var.f44131b, rectF) && rectF.right > 0.0f && rectF.left < pg0Var.fragmentView.getMeasuredWidth() && (r2Var instanceof og0) && ((og0) r2Var).y() != null) {
                aVar.c(rectF.left);
                aVar.c(rectF.top);
                aVar.a(r2Var.getClassGuid());
            }
        }
        if (aVar.f6296a) {
            j10 = -1;
        } else {
            j10 = aVar.f6297b;
        }
        if (this.f6347a.hasDisplayList() && width == this.e && height == this.f6350f && j10 == this.d && j10 != -1) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.e = width;
        this.f6350f = height;
        this.d = j10;
        if (z10) {
            RecordingCanvas beginRecording = this.f6347a.beginRecording();
            View view2 = pg0Var.fragmentView;
            SparseArray sparseArray2 = pg0Var.f44130a;
            RectF rectF2 = pg0Var.S;
            int measuredWidth = view2.getMeasuredWidth();
            int measuredHeight = pg0Var.fragmentView.getMeasuredHeight();
            beginRecording.drawColor(pg0Var.getThemedColor(y6.f23354d6));
            int size2 = sparseArray2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                r2 r2Var2 = ((sg1) sparseArray2.valueAt(i11)).f43502a;
                View view3 = r2Var2.fragmentView;
                if (view3 != null && k.c(view3, pg0Var.f44131b, rectF2) && rectF2.right > 0.0f && rectF2.left < pg0Var.fragmentView.getMeasuredWidth() && (r2Var2 instanceof og0) && (y3 = ((og0) r2Var2).y()) != null) {
                    beginRecording.save();
                    beginRecording.translate(rectF2.left, rectF2.top);
                    y3.w(beginRecording, 0.0f, 0.0f, measuredWidth, measuredHeight);
                    beginRecording.restore();
                }
            }
            this.f6347a.endRecording();
        }
    }
}
