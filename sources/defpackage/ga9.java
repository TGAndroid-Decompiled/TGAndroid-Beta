package defpackage;

import android.graphics.RecordingCanvas;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.util.SparseArray;
import android.view.View;
import org.telegram.ui.ActionBar.e;
public final class ga9 {
    public final RenderNode a;
    public final n31 b;
    public final qeb c = new Object();
    public long d = 0;
    public int e;
    public int f;

    public ga9(RenderNode renderNode, n31 n31Var) {
        this.a = renderNode;
        this.b = n31Var;
    }

    public final void a() {
        long j;
        boolean z;
        RecordingCanvas recordingCanvas;
        rz4 A;
        rz4 A2;
        int width = this.a.getWidth();
        int height = this.a.getHeight();
        qeb qebVar = this.c;
        qebVar.a = 0L;
        int i = 0;
        qebVar.b = false;
        n31 n31Var = this.b;
        boolean z2 = n31Var.b;
        fj6 fj6Var = (fj6) n31Var.c;
        int themedColor = fj6Var.getThemedColor(aob.d6);
        RectF rectF = fj6Var.X;
        qebVar.a(themedColor);
        qebVar.b(xea.f());
        SparseArray sparseArray = fj6Var.a;
        int size = sparseArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            e eVar = ((gic) sparseArray.valueAt(i2)).a;
            View view = eVar.fragmentView;
            if (view != null && yic.c(view, fj6Var.b, rectF) && rectF.right > 0.0f && rectF.left < fj6Var.fragmentView.getMeasuredWidth()) {
                ej6 ej6Var = (ej6) eVar;
                if (z2) {
                    A2 = ej6Var.j();
                } else {
                    A2 = ej6Var.A();
                }
                if (A2 != null) {
                    qebVar.c(rectF.left);
                    qebVar.c(rectF.top);
                    qebVar.a(eVar.getClassGuid());
                }
            }
        }
        if (qebVar.b) {
            j = -1;
        } else {
            j = qebVar.a;
        }
        if (this.a.hasDisplayList() && width == this.e && height == this.f && j == this.d && j != -1) {
            z = false;
        } else {
            z = true;
        }
        this.e = width;
        this.f = height;
        this.d = j;
        if (z) {
            RecordingCanvas beginRecording = this.a.beginRecording();
            View view2 = fj6Var.fragmentView;
            SparseArray sparseArray2 = fj6Var.a;
            RectF rectF2 = fj6Var.X;
            int measuredWidth = view2.getMeasuredWidth();
            int measuredHeight = fj6Var.fragmentView.getMeasuredHeight();
            beginRecording.drawColor(fj6Var.getThemedColor(aob.d6));
            int size2 = sparseArray2.size();
            while (i < size2) {
                e eVar2 = ((gic) sparseArray2.valueAt(i)).a;
                View view3 = eVar2.fragmentView;
                if (view3 != null && yic.c(view3, fj6Var.b, rectF2) && rectF2.right > 0.0f && rectF2.left < fj6Var.fragmentView.getMeasuredWidth()) {
                    ej6 ej6Var2 = (ej6) eVar2;
                    if (z2) {
                        A = ej6Var2.j();
                    } else {
                        A = ej6Var2.A();
                    }
                    rz4 rz4Var = A;
                    if (rz4Var != null) {
                        beginRecording.save();
                        beginRecording.translate(rectF2.left, rectF2.top);
                        recordingCanvas = beginRecording;
                        rz4Var.e(0.0f, 0.0f, measuredWidth, measuredHeight, recordingCanvas);
                        recordingCanvas.restore();
                        i++;
                        beginRecording = recordingCanvas;
                    }
                }
                recordingCanvas = beginRecording;
                i++;
                beginRecording = recordingCanvas;
            }
            this.a.endRecording();
        }
    }
}
