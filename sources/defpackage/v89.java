package defpackage;

import android.graphics.RecordingCanvas;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.util.SparseArray;
import android.view.View;
import org.telegram.ui.ActionBar.d;
public final class v89 {
    public final RenderNode a;
    public final m41 b;
    public final ucb c = new Object();
    public long d = 0;
    public int e;
    public int f;

    public v89(RenderNode renderNode, m41 m41Var) {
        this.a = renderNode;
        this.b = m41Var;
    }

    public final void a() {
        long j;
        boolean z;
        RecordingCanvas recordingCanvas;
        nz4 z2;
        nz4 z3;
        int width = this.a.getWidth();
        int height = this.a.getHeight();
        ucb ucbVar = this.c;
        ucbVar.a = 0L;
        int i = 0;
        ucbVar.b = false;
        m41 m41Var = this.b;
        boolean z4 = m41Var.b;
        bj6 bj6Var = (bj6) m41Var.c;
        int themedColor = bj6Var.getThemedColor(cmb.c6);
        RectF rectF = bj6Var.U;
        ucbVar.a(themedColor);
        ucbVar.b(gda.f());
        SparseArray sparseArray = bj6Var.a;
        int size = sparseArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            d dVar = ((hgc) sparseArray.valueAt(i2)).a;
            View view = dVar.fragmentView;
            if (view != null && zgc.c(view, bj6Var.b, rectF) && rectF.right > 0.0f && rectF.left < bj6Var.fragmentView.getMeasuredWidth()) {
                aj6 aj6Var = (aj6) dVar;
                if (z4) {
                    z3 = aj6Var.j();
                } else {
                    z3 = aj6Var.z();
                }
                if (z3 != null) {
                    ucbVar.c(rectF.left);
                    ucbVar.c(rectF.top);
                    ucbVar.a(dVar.getClassGuid());
                }
            }
        }
        if (ucbVar.b) {
            j = -1;
        } else {
            j = ucbVar.a;
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
            View view2 = bj6Var.fragmentView;
            SparseArray sparseArray2 = bj6Var.a;
            RectF rectF2 = bj6Var.U;
            int measuredWidth = view2.getMeasuredWidth();
            int measuredHeight = bj6Var.fragmentView.getMeasuredHeight();
            beginRecording.drawColor(bj6Var.getThemedColor(cmb.c6));
            int size2 = sparseArray2.size();
            while (i < size2) {
                d dVar2 = ((hgc) sparseArray2.valueAt(i)).a;
                View view3 = dVar2.fragmentView;
                if (view3 != null && zgc.c(view3, bj6Var.b, rectF2) && rectF2.right > 0.0f && rectF2.left < bj6Var.fragmentView.getMeasuredWidth()) {
                    aj6 aj6Var2 = (aj6) dVar2;
                    if (z4) {
                        z2 = aj6Var2.j();
                    } else {
                        z2 = aj6Var2.z();
                    }
                    nz4 nz4Var = z2;
                    if (nz4Var != null) {
                        beginRecording.save();
                        beginRecording.translate(rectF2.left, rectF2.top);
                        recordingCanvas = beginRecording;
                        nz4Var.e(0.0f, 0.0f, measuredWidth, measuredHeight, recordingCanvas);
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
