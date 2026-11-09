package dh;

import android.graphics.RecordingCanvas;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.util.SparseArray;
import android.view.View;
import org.telegram.messenger.iz;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.ke0;
import org.telegram.ui.le0;
import org.telegram.ui.ob1;
public final class i {
    public final RenderNode f8766a;
    public final ca.i f8767b;
    public final a f8768c = new Object();
    public long d = 0;
    public int f8769e;
    public int f8770f;

    public i(RenderNode renderNode, ca.i iVar) {
        this.f8766a = renderNode;
        this.f8767b = iVar;
    }

    public final void a() {
        long j3;
        boolean z9;
        ri.f B;
        ri.f B2;
        int width = this.f8766a.getWidth();
        int height = this.f8766a.getHeight();
        a aVar = this.f8768c;
        aVar.f8699b = 0L;
        aVar.f8698a = false;
        ca.i iVar = this.f8767b;
        boolean z10 = iVar.f6013b;
        le0 le0Var = (le0) iVar.f6014c;
        int themedColor = le0Var.getThemedColor(l6.f27865d6);
        RectF rectF = le0Var.U;
        aVar.a(themedColor);
        aVar.b(iz.f());
        SparseArray sparseArray = le0Var.f49012a;
        int size = sparseArray.size();
        for (int i7 = 0; i7 < size; i7++) {
            f2 f2Var = ((ob1) sparseArray.valueAt(i7)).f48422a;
            View view = f2Var.fragmentView;
            if (view != null && jh.k.c(view, le0Var.f49013b, rectF) && rectF.right > 0.0f && rectF.left < le0Var.fragmentView.getMeasuredWidth() && (f2Var instanceof ke0)) {
                ke0 ke0Var = (ke0) f2Var;
                if (z10) {
                    B2 = ke0Var.k();
                } else {
                    B2 = ke0Var.B();
                }
                if (B2 != null) {
                    aVar.c(rectF.left);
                    aVar.c(rectF.top);
                    aVar.a(f2Var.getClassGuid());
                }
            }
        }
        if (aVar.f8698a) {
            j3 = -1;
        } else {
            j3 = aVar.f8699b;
        }
        if (this.f8766a.hasDisplayList() && width == this.f8769e && height == this.f8770f && j3 == this.d && j3 != -1) {
            z9 = false;
        } else {
            z9 = true;
        }
        this.f8769e = width;
        this.f8770f = height;
        this.d = j3;
        if (z9) {
            RecordingCanvas beginRecording = this.f8766a.beginRecording();
            View view2 = le0Var.fragmentView;
            SparseArray sparseArray2 = le0Var.f49012a;
            RectF rectF2 = le0Var.U;
            int measuredWidth = view2.getMeasuredWidth();
            int measuredHeight = le0Var.fragmentView.getMeasuredHeight();
            beginRecording.drawColor(le0Var.getThemedColor(l6.f27865d6));
            int size2 = sparseArray2.size();
            for (int i10 = 0; i10 < size2; i10++) {
                f2 f2Var2 = ((ob1) sparseArray2.valueAt(i10)).f48422a;
                View view3 = f2Var2.fragmentView;
                if (view3 != null && jh.k.c(view3, le0Var.f49013b, rectF2) && rectF2.right > 0.0f && rectF2.left < le0Var.fragmentView.getMeasuredWidth() && (f2Var2 instanceof ke0)) {
                    ke0 ke0Var2 = (ke0) f2Var2;
                    if (z10) {
                        B = ke0Var2.k();
                    } else {
                        B = ke0Var2.B();
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
            this.f8766a.endRecording();
        }
    }
}
