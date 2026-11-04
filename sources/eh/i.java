package eh;

import android.graphics.RecordingCanvas;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.util.SparseArray;
import android.view.View;
import org.telegram.messenger.az;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.de0;
import org.telegram.ui.eb1;
import org.telegram.ui.ee0;
public final class i {
    public final RenderNode f10046a;
    public final ba.i f10047b;
    public final a f10048c = new Object();
    public long d = 0;
    public int f10049e;
    public int f10050f;

    public i(RenderNode renderNode, ba.i iVar) {
        this.f10046a = renderNode;
        this.f10047b = iVar;
    }

    public final void a() {
        long j10;
        boolean z10;
        si.f B;
        si.f B2;
        int width = this.f10046a.getWidth();
        int height = this.f10046a.getHeight();
        a aVar = this.f10048c;
        aVar.f9979b = 0L;
        aVar.f9978a = false;
        ba.i iVar = this.f10047b;
        boolean z11 = iVar.f3186b;
        ee0 ee0Var = (ee0) iVar.f3187c;
        int themedColor = ee0Var.getThemedColor(k6.f27878d6);
        RectF rectF = ee0Var.V;
        aVar.a(themedColor);
        aVar.b(az.f());
        SparseArray sparseArray = ee0Var.f45620a;
        int size = sparseArray.size();
        for (int i3 = 0; i3 < size; i3++) {
            d2 d2Var = ((eb1) sparseArray.valueAt(i3)).f44954a;
            View view = d2Var.fragmentView;
            if (view != null && kh.k.c(view, ee0Var.f45621b, rectF) && rectF.right > 0.0f && rectF.left < ee0Var.fragmentView.getMeasuredWidth() && (d2Var instanceof de0)) {
                de0 de0Var = (de0) d2Var;
                if (z11) {
                    B2 = de0Var.k();
                } else {
                    B2 = de0Var.B();
                }
                if (B2 != null) {
                    aVar.c(rectF.left);
                    aVar.c(rectF.top);
                    aVar.a(d2Var.getClassGuid());
                }
            }
        }
        if (aVar.f9978a) {
            j10 = -1;
        } else {
            j10 = aVar.f9979b;
        }
        if (this.f10046a.hasDisplayList() && width == this.f10049e && height == this.f10050f && j10 == this.d && j10 != -1) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f10049e = width;
        this.f10050f = height;
        this.d = j10;
        if (z10) {
            RecordingCanvas beginRecording = this.f10046a.beginRecording();
            View view2 = ee0Var.fragmentView;
            SparseArray sparseArray2 = ee0Var.f45620a;
            RectF rectF2 = ee0Var.V;
            int measuredWidth = view2.getMeasuredWidth();
            int measuredHeight = ee0Var.fragmentView.getMeasuredHeight();
            beginRecording.drawColor(ee0Var.getThemedColor(k6.f27878d6));
            int size2 = sparseArray2.size();
            for (int i10 = 0; i10 < size2; i10++) {
                d2 d2Var2 = ((eb1) sparseArray2.valueAt(i10)).f44954a;
                View view3 = d2Var2.fragmentView;
                if (view3 != null && kh.k.c(view3, ee0Var.f45621b, rectF2) && rectF2.right > 0.0f && rectF2.left < ee0Var.fragmentView.getMeasuredWidth() && (d2Var2 instanceof de0)) {
                    de0 de0Var2 = (de0) d2Var2;
                    if (z11) {
                        B = de0Var2.k();
                    } else {
                        B = de0Var2.B();
                    }
                    si.f fVar = B;
                    if (fVar != null) {
                        beginRecording.save();
                        beginRecording.translate(rectF2.left, rectF2.top);
                        fVar.l(beginRecording, 0.0f, 0.0f, measuredWidth, measuredHeight);
                        beginRecording.restore();
                    }
                }
            }
            this.f10046a.endRecording();
        }
    }
}
