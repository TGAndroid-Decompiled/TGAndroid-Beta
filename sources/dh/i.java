package dh;

import android.graphics.RecordingCanvas;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.util.SparseArray;
import android.view.View;
import org.telegram.messenger.cz;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.le0;
import org.telegram.ui.me0;
import org.telegram.ui.ob1;
public final class i {
    public final RenderNode f8469a;
    public final ca.i f8470b;
    public final a f8471c = new Object();
    public long d = 0;
    public int f8472e;
    public int f8473f;

    public i(RenderNode renderNode, ca.i iVar) {
        this.f8469a = renderNode;
        this.f8470b = iVar;
    }

    public final void a() {
        long j3;
        boolean z10;
        ui.f B;
        RecordingCanvas recordingCanvas;
        ui.f B2;
        int width = this.f8469a.getWidth();
        int height = this.f8469a.getHeight();
        a aVar = this.f8471c;
        aVar.f8402b = 0L;
        int i7 = 0;
        aVar.f8401a = false;
        ca.i iVar = this.f8470b;
        boolean z11 = iVar.f5154b;
        me0 me0Var = (me0) iVar.f5155c;
        int themedColor = me0Var.getThemedColor(m6.f29381d6);
        RectF rectF = me0Var.V;
        aVar.a(themedColor);
        aVar.b(cz.f());
        SparseArray sparseArray = me0Var.f51201a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            g2 g2Var = ((ob1) sparseArray.valueAt(i10)).f50538a;
            View view = g2Var.fragmentView;
            if (view != null && jh.k.c(view, me0Var.f51202b, rectF) && rectF.right > 0.0f && rectF.left < me0Var.fragmentView.getMeasuredWidth() && (g2Var instanceof le0)) {
                le0 le0Var = (le0) g2Var;
                if (z11) {
                    B2 = le0Var.k();
                } else {
                    B2 = le0Var.B();
                }
                if (B2 != null) {
                    aVar.c(rectF.left);
                    aVar.c(rectF.top);
                    aVar.a(g2Var.getClassGuid());
                }
            }
        }
        if (aVar.f8401a) {
            j3 = -1;
        } else {
            j3 = aVar.f8402b;
        }
        if (this.f8469a.hasDisplayList() && width == this.f8472e && height == this.f8473f && j3 == this.d && j3 != -1) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f8472e = width;
        this.f8473f = height;
        this.d = j3;
        if (z10) {
            RecordingCanvas beginRecording = this.f8469a.beginRecording();
            View view2 = me0Var.fragmentView;
            SparseArray sparseArray2 = me0Var.f51201a;
            RectF rectF2 = me0Var.V;
            int measuredWidth = view2.getMeasuredWidth();
            int measuredHeight = me0Var.fragmentView.getMeasuredHeight();
            beginRecording.drawColor(me0Var.getThemedColor(m6.f29381d6));
            int size2 = sparseArray2.size();
            while (i7 < size2) {
                g2 g2Var2 = ((ob1) sparseArray2.valueAt(i7)).f50538a;
                View view3 = g2Var2.fragmentView;
                if (view3 != null && jh.k.c(view3, me0Var.f51202b, rectF2) && rectF2.right > 0.0f && rectF2.left < me0Var.fragmentView.getMeasuredWidth() && (g2Var2 instanceof le0)) {
                    le0 le0Var2 = (le0) g2Var2;
                    if (z11) {
                        B = le0Var2.k();
                    } else {
                        B = le0Var2.B();
                    }
                    ui.f fVar = B;
                    if (fVar != null) {
                        beginRecording.save();
                        beginRecording.translate(rectF2.left, rectF2.top);
                        recordingCanvas = beginRecording;
                        fVar.o(0.0f, 0.0f, measuredWidth, measuredHeight, recordingCanvas);
                        recordingCanvas.restore();
                        i7++;
                        beginRecording = recordingCanvas;
                    }
                }
                recordingCanvas = beginRecording;
                i7++;
                beginRecording = recordingCanvas;
            }
            this.f8469a.endRecording();
        }
    }
}
