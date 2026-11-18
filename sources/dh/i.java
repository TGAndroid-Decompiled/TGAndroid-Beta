package dh;

import android.graphics.RecordingCanvas;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.util.SparseArray;
import android.view.View;
import org.telegram.messenger.bz;
import org.telegram.ui.ActionBar.h2;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ke0;
import org.telegram.ui.le0;
import org.telegram.ui.ob1;
public final class i {
    public final RenderNode f8440a;
    public final ca.i f8441b;
    public final a f8442c = new Object();
    public long d = 0;
    public int f8443e;
    public int f8444f;

    public i(RenderNode renderNode, ca.i iVar) {
        this.f8440a = renderNode;
        this.f8441b = iVar;
    }

    public final void a() {
        long j3;
        boolean z10;
        ui.f B;
        RecordingCanvas recordingCanvas;
        ui.f B2;
        int width = this.f8440a.getWidth();
        int height = this.f8440a.getHeight();
        a aVar = this.f8442c;
        aVar.f8373b = 0L;
        int i7 = 0;
        aVar.f8372a = false;
        ca.i iVar = this.f8441b;
        boolean z11 = iVar.f5125b;
        le0 le0Var = (le0) iVar.f5126c;
        int themedColor = le0Var.getThemedColor(n6.f29396d6);
        RectF rectF = le0Var.V;
        aVar.a(themedColor);
        aVar.b(bz.f());
        SparseArray sparseArray = le0Var.f51193a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            h2 h2Var = ((ob1) sparseArray.valueAt(i10)).f50559a;
            View view = h2Var.fragmentView;
            if (view != null && jh.k.c(view, le0Var.f51194b, rectF) && rectF.right > 0.0f && rectF.left < le0Var.fragmentView.getMeasuredWidth() && (h2Var instanceof ke0)) {
                ke0 ke0Var = (ke0) h2Var;
                if (z11) {
                    B2 = ke0Var.k();
                } else {
                    B2 = ke0Var.B();
                }
                if (B2 != null) {
                    aVar.c(rectF.left);
                    aVar.c(rectF.top);
                    aVar.a(h2Var.getClassGuid());
                }
            }
        }
        if (aVar.f8372a) {
            j3 = -1;
        } else {
            j3 = aVar.f8373b;
        }
        if (this.f8440a.hasDisplayList() && width == this.f8443e && height == this.f8444f && j3 == this.d && j3 != -1) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f8443e = width;
        this.f8444f = height;
        this.d = j3;
        if (z10) {
            RecordingCanvas beginRecording = this.f8440a.beginRecording();
            View view2 = le0Var.fragmentView;
            SparseArray sparseArray2 = le0Var.f51193a;
            RectF rectF2 = le0Var.V;
            int measuredWidth = view2.getMeasuredWidth();
            int measuredHeight = le0Var.fragmentView.getMeasuredHeight();
            beginRecording.drawColor(le0Var.getThemedColor(n6.f29396d6));
            int size2 = sparseArray2.size();
            while (i7 < size2) {
                h2 h2Var2 = ((ob1) sparseArray2.valueAt(i7)).f50559a;
                View view3 = h2Var2.fragmentView;
                if (view3 != null && jh.k.c(view3, le0Var.f51194b, rectF2) && rectF2.right > 0.0f && rectF2.left < le0Var.fragmentView.getMeasuredWidth() && (h2Var2 instanceof ke0)) {
                    ke0 ke0Var2 = (ke0) h2Var2;
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
            this.f8440a.endRecording();
        }
    }
}
