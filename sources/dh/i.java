package dh;

import android.graphics.RecordingCanvas;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.util.SparseArray;
import android.view.View;
import org.telegram.messenger.bz;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ke0;
import org.telegram.ui.le0;
import org.telegram.ui.mb1;
public final class i {
    public final RenderNode f8431a;
    public final ca.i f8432b;
    public final a f8433c = new Object();
    public long d = 0;
    public int f8434e;
    public int f8435f;

    public i(RenderNode renderNode, ca.i iVar) {
        this.f8431a = renderNode;
        this.f8432b = iVar;
    }

    public final void a() {
        long j3;
        boolean z10;
        ui.f B;
        RecordingCanvas recordingCanvas;
        ui.f B2;
        int width = this.f8431a.getWidth();
        int height = this.f8431a.getHeight();
        a aVar = this.f8433c;
        aVar.f8364b = 0L;
        int i7 = 0;
        aVar.f8363a = false;
        ca.i iVar = this.f8432b;
        boolean z11 = iVar.f5117b;
        le0 le0Var = (le0) iVar.f5118c;
        int themedColor = le0Var.getThemedColor(n6.f29451d6);
        RectF rectF = le0Var.V;
        aVar.a(themedColor);
        aVar.b(bz.f());
        SparseArray sparseArray = le0Var.f50632a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            g2 g2Var = ((mb1) sparseArray.valueAt(i10)).f50028a;
            View view = g2Var.fragmentView;
            if (view != null && jh.k.c(view, le0Var.f50633b, rectF) && rectF.right > 0.0f && rectF.left < le0Var.fragmentView.getMeasuredWidth() && (g2Var instanceof ke0)) {
                ke0 ke0Var = (ke0) g2Var;
                if (z11) {
                    B2 = ke0Var.k();
                } else {
                    B2 = ke0Var.B();
                }
                if (B2 != null) {
                    aVar.c(rectF.left);
                    aVar.c(rectF.top);
                    aVar.a(g2Var.getClassGuid());
                }
            }
        }
        if (aVar.f8363a) {
            j3 = -1;
        } else {
            j3 = aVar.f8364b;
        }
        if (this.f8431a.hasDisplayList() && width == this.f8434e && height == this.f8435f && j3 == this.d && j3 != -1) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f8434e = width;
        this.f8435f = height;
        this.d = j3;
        if (z10) {
            RecordingCanvas beginRecording = this.f8431a.beginRecording();
            View view2 = le0Var.fragmentView;
            SparseArray sparseArray2 = le0Var.f50632a;
            RectF rectF2 = le0Var.V;
            int measuredWidth = view2.getMeasuredWidth();
            int measuredHeight = le0Var.fragmentView.getMeasuredHeight();
            beginRecording.drawColor(le0Var.getThemedColor(n6.f29451d6));
            int size2 = sparseArray2.size();
            while (i7 < size2) {
                g2 g2Var2 = ((mb1) sparseArray2.valueAt(i7)).f50028a;
                View view3 = g2Var2.fragmentView;
                if (view3 != null && jh.k.c(view3, le0Var.f50633b, rectF2) && rectF2.right > 0.0f && rectF2.left < le0Var.fragmentView.getMeasuredWidth() && (g2Var2 instanceof ke0)) {
                    ke0 ke0Var2 = (ke0) g2Var2;
                    if (z11) {
                        B = ke0Var2.k();
                    } else {
                        B = ke0Var2.B();
                    }
                    ui.f fVar = B;
                    if (fVar != null) {
                        beginRecording.save();
                        beginRecording.translate(rectF2.left, rectF2.top);
                        recordingCanvas = beginRecording;
                        fVar.z(0.0f, 0.0f, measuredWidth, measuredHeight, recordingCanvas);
                        recordingCanvas.restore();
                        i7++;
                        beginRecording = recordingCanvas;
                    }
                }
                recordingCanvas = beginRecording;
                i7++;
                beginRecording = recordingCanvas;
            }
            this.f8431a.endRecording();
        }
    }
}
