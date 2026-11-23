package dh;

import android.graphics.RecordingCanvas;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.util.SparseArray;
import android.view.View;
import org.telegram.messenger.cz;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ke0;
import org.telegram.ui.le0;
import org.telegram.ui.ob1;
public final class i {
    public final RenderNode f8432a;
    public final ca.i f8433b;
    public final a f8434c = new Object();
    public long d = 0;
    public int f8435e;
    public int f8436f;

    public i(RenderNode renderNode, ca.i iVar) {
        this.f8432a = renderNode;
        this.f8433b = iVar;
    }

    public final void a() {
        long j3;
        boolean z10;
        ui.f B;
        RecordingCanvas recordingCanvas;
        ui.f B2;
        int width = this.f8432a.getWidth();
        int height = this.f8432a.getHeight();
        a aVar = this.f8434c;
        aVar.f8365b = 0L;
        int i7 = 0;
        aVar.f8364a = false;
        ca.i iVar = this.f8433b;
        boolean z11 = iVar.f5117b;
        le0 le0Var = (le0) iVar.f5118c;
        int themedColor = le0Var.getThemedColor(m6.f29347d6);
        RectF rectF = le0Var.V;
        aVar.a(themedColor);
        aVar.b(cz.f());
        SparseArray sparseArray = le0Var.f51132a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            g2 g2Var = ((ob1) sparseArray.valueAt(i10)).f50523a;
            View view = g2Var.fragmentView;
            if (view != null && jh.k.c(view, le0Var.f51133b, rectF) && rectF.right > 0.0f && rectF.left < le0Var.fragmentView.getMeasuredWidth() && (g2Var instanceof ke0)) {
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
        if (aVar.f8364a) {
            j3 = -1;
        } else {
            j3 = aVar.f8365b;
        }
        if (this.f8432a.hasDisplayList() && width == this.f8435e && height == this.f8436f && j3 == this.d && j3 != -1) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f8435e = width;
        this.f8436f = height;
        this.d = j3;
        if (z10) {
            RecordingCanvas beginRecording = this.f8432a.beginRecording();
            View view2 = le0Var.fragmentView;
            SparseArray sparseArray2 = le0Var.f51132a;
            RectF rectF2 = le0Var.V;
            int measuredWidth = view2.getMeasuredWidth();
            int measuredHeight = le0Var.fragmentView.getMeasuredHeight();
            beginRecording.drawColor(le0Var.getThemedColor(m6.f29347d6));
            int size2 = sparseArray2.size();
            while (i7 < size2) {
                g2 g2Var2 = ((ob1) sparseArray2.valueAt(i7)).f50523a;
                View view3 = g2Var2.fragmentView;
                if (view3 != null && jh.k.c(view3, le0Var.f51133b, rectF2) && rectF2.right > 0.0f && rectF2.left < le0Var.fragmentView.getMeasuredWidth() && (g2Var2 instanceof ke0)) {
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
            this.f8432a.endRecording();
        }
    }
}
