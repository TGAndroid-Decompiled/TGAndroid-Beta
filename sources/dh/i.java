package dh;

import android.graphics.RecordingCanvas;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.util.SparseArray;
import android.view.View;
import org.telegram.messenger.gz;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ie0;
import org.telegram.ui.je0;
import org.telegram.ui.kb1;
public final class i {
    public final RenderNode f8155a;
    public final ca.i f8156b;
    public final a f8157c = new Object();
    public long d = 0;
    public int f8158e;
    public int f8159f;

    public i(RenderNode renderNode, ca.i iVar) {
        this.f8155a = renderNode;
        this.f8156b = iVar;
    }

    public final void a() {
        long j3;
        boolean z10;
        ui.f B;
        RecordingCanvas recordingCanvas;
        ui.f B2;
        int width = this.f8155a.getWidth();
        int height = this.f8155a.getHeight();
        a aVar = this.f8157c;
        aVar.f8088b = 0L;
        int i7 = 0;
        aVar.f8087a = false;
        ca.i iVar = this.f8156b;
        boolean z11 = iVar.f4840b;
        je0 je0Var = (je0) iVar.f4841c;
        int themedColor = je0Var.getThemedColor(j6.f28849d6);
        RectF rectF = je0Var.V;
        aVar.a(themedColor);
        aVar.b(gz.f());
        SparseArray sparseArray = je0Var.f49203a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            e2 e2Var = ((kb1) sparseArray.valueAt(i10)).f48666a;
            View view = e2Var.fragmentView;
            if (view != null && jh.k.c(view, je0Var.f49204b, rectF) && rectF.right > 0.0f && rectF.left < je0Var.fragmentView.getMeasuredWidth() && (e2Var instanceof ie0)) {
                ie0 ie0Var = (ie0) e2Var;
                if (z11) {
                    B2 = ie0Var.k();
                } else {
                    B2 = ie0Var.B();
                }
                if (B2 != null) {
                    aVar.c(rectF.left);
                    aVar.c(rectF.top);
                    aVar.a(e2Var.getClassGuid());
                }
            }
        }
        if (aVar.f8087a) {
            j3 = -1;
        } else {
            j3 = aVar.f8088b;
        }
        if (this.f8155a.hasDisplayList() && width == this.f8158e && height == this.f8159f && j3 == this.d && j3 != -1) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f8158e = width;
        this.f8159f = height;
        this.d = j3;
        if (z10) {
            RecordingCanvas beginRecording = this.f8155a.beginRecording();
            View view2 = je0Var.fragmentView;
            SparseArray sparseArray2 = je0Var.f49203a;
            RectF rectF2 = je0Var.V;
            int measuredWidth = view2.getMeasuredWidth();
            int measuredHeight = je0Var.fragmentView.getMeasuredHeight();
            beginRecording.drawColor(je0Var.getThemedColor(j6.f28849d6));
            int size2 = sparseArray2.size();
            while (i7 < size2) {
                e2 e2Var2 = ((kb1) sparseArray2.valueAt(i7)).f48666a;
                View view3 = e2Var2.fragmentView;
                if (view3 != null && jh.k.c(view3, je0Var.f49204b, rectF2) && rectF2.right > 0.0f && rectF2.left < je0Var.fragmentView.getMeasuredWidth() && (e2Var2 instanceof ie0)) {
                    ie0 ie0Var2 = (ie0) e2Var2;
                    if (z11) {
                        B = ie0Var2.k();
                    } else {
                        B = ie0Var2.B();
                    }
                    ui.f fVar = B;
                    if (fVar != null) {
                        beginRecording.save();
                        beginRecording.translate(rectF2.left, rectF2.top);
                        recordingCanvas = beginRecording;
                        fVar.b0(0.0f, 0.0f, measuredWidth, measuredHeight, recordingCanvas);
                        recordingCanvas.restore();
                        i7++;
                        beginRecording = recordingCanvas;
                    }
                }
                recordingCanvas = beginRecording;
                i7++;
                beginRecording = recordingCanvas;
            }
            this.f8155a.endRecording();
        }
    }
}
