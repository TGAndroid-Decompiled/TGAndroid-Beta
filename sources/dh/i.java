package dh;

import android.graphics.RecordingCanvas;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.util.SparseArray;
import android.view.View;
import org.telegram.messenger.iz;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ie0;
import org.telegram.ui.je0;
import org.telegram.ui.lb1;
public final class i {
    public final RenderNode f8768a;
    public final ca.i f8769b;
    public final a f8770c = new Object();
    public long d = 0;
    public int f8771e;
    public int f8772f;

    public i(RenderNode renderNode, ca.i iVar) {
        this.f8768a = renderNode;
        this.f8769b = iVar;
    }

    public final void a() {
        long j3;
        boolean z9;
        ri.f B;
        ri.f B2;
        int width = this.f8768a.getWidth();
        int height = this.f8768a.getHeight();
        a aVar = this.f8770c;
        aVar.f8701b = 0L;
        aVar.f8700a = false;
        ca.i iVar = this.f8769b;
        boolean z10 = iVar.f6015b;
        je0 je0Var = (je0) iVar.f6016c;
        int themedColor = je0Var.getThemedColor(k6.f27848d6);
        RectF rectF = je0Var.U;
        aVar.a(themedColor);
        aVar.b(iz.f());
        SparseArray sparseArray = je0Var.f47987a;
        int size = sparseArray.size();
        for (int i7 = 0; i7 < size; i7++) {
            f2 f2Var = ((lb1) sparseArray.valueAt(i7)).f47478a;
            View view = f2Var.fragmentView;
            if (view != null && jh.k.c(view, je0Var.f47988b, rectF) && rectF.right > 0.0f && rectF.left < je0Var.fragmentView.getMeasuredWidth() && (f2Var instanceof ie0)) {
                ie0 ie0Var = (ie0) f2Var;
                if (z10) {
                    B2 = ie0Var.k();
                } else {
                    B2 = ie0Var.B();
                }
                if (B2 != null) {
                    aVar.c(rectF.left);
                    aVar.c(rectF.top);
                    aVar.a(f2Var.getClassGuid());
                }
            }
        }
        if (aVar.f8700a) {
            j3 = -1;
        } else {
            j3 = aVar.f8701b;
        }
        if (this.f8768a.hasDisplayList() && width == this.f8771e && height == this.f8772f && j3 == this.d && j3 != -1) {
            z9 = false;
        } else {
            z9 = true;
        }
        this.f8771e = width;
        this.f8772f = height;
        this.d = j3;
        if (z9) {
            RecordingCanvas beginRecording = this.f8768a.beginRecording();
            View view2 = je0Var.fragmentView;
            SparseArray sparseArray2 = je0Var.f47987a;
            RectF rectF2 = je0Var.U;
            int measuredWidth = view2.getMeasuredWidth();
            int measuredHeight = je0Var.fragmentView.getMeasuredHeight();
            beginRecording.drawColor(je0Var.getThemedColor(k6.f27848d6));
            int size2 = sparseArray2.size();
            for (int i10 = 0; i10 < size2; i10++) {
                f2 f2Var2 = ((lb1) sparseArray2.valueAt(i10)).f47478a;
                View view3 = f2Var2.fragmentView;
                if (view3 != null && jh.k.c(view3, je0Var.f47988b, rectF2) && rectF2.right > 0.0f && rectF2.left < je0Var.fragmentView.getMeasuredWidth() && (f2Var2 instanceof ie0)) {
                    ie0 ie0Var2 = (ie0) f2Var2;
                    if (z10) {
                        B = ie0Var2.k();
                    } else {
                        B = ie0Var2.B();
                    }
                    ri.f fVar = B;
                    if (fVar != null) {
                        beginRecording.save();
                        beginRecording.translate(rectF2.left, rectF2.top);
                        fVar.e(beginRecording, 0.0f, 0.0f, measuredWidth, measuredHeight);
                        beginRecording.restore();
                    }
                }
            }
            this.f8768a.endRecording();
        }
    }
}
