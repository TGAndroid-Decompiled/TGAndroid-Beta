package ah;

import android.graphics.RecordingCanvas;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.util.SparseArray;
import android.view.View;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.ah0;
import org.telegram.ui.bh0;
import org.telegram.ui.ph1;
import org.telegram.ui.yg0;
public final class k {
    public final RenderNode f477a;
    public final yg0 f478b;
    public final a f479c = new Object();
    public long d = 0;
    public int e;
    public int f480f;

    public k(RenderNode renderNode, yg0 yg0Var) {
        this.f477a = renderNode;
        this.f478b = yg0Var;
    }

    public final void a() {
        long j3;
        boolean z10;
        fh.d x10;
        int width = this.f477a.getWidth();
        int height = this.f477a.getHeight();
        a aVar = this.f479c;
        aVar.f418b = 0L;
        aVar.f417a = false;
        bh0 bh0Var = this.f478b.f40212a;
        int themedColor = bh0Var.getThemedColor(i6.f19057d6);
        RectF rectF = bh0Var.T;
        aVar.a(themedColor);
        aVar.b(SharedConfig.chatBlurEnabled());
        SparseArray sparseArray = bh0Var.f37132a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            o2 o2Var = ((ph1) sparseArray.valueAt(i10)).f36485a;
            View view = o2Var.fragmentView;
            if (view != null && hh.k.c(view, bh0Var.f37133b, rectF) && rectF.right > 0.0f && rectF.left < bh0Var.fragmentView.getMeasuredWidth() && (o2Var instanceof ah0) && ((ah0) o2Var).x() != null) {
                aVar.c(rectF.left);
                aVar.c(rectF.top);
                aVar.a(o2Var.getClassGuid());
            }
        }
        if (aVar.f417a) {
            j3 = -1;
        } else {
            j3 = aVar.f418b;
        }
        if (this.f477a.hasDisplayList() && width == this.e && height == this.f480f && j3 == this.d && j3 != -1) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.e = width;
        this.f480f = height;
        this.d = j3;
        if (z10) {
            RecordingCanvas beginRecording = this.f477a.beginRecording();
            View view2 = bh0Var.fragmentView;
            SparseArray sparseArray2 = bh0Var.f37132a;
            RectF rectF2 = bh0Var.T;
            int measuredWidth = view2.getMeasuredWidth();
            int measuredHeight = bh0Var.fragmentView.getMeasuredHeight();
            beginRecording.drawColor(bh0Var.getThemedColor(i6.f19057d6));
            int size2 = sparseArray2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                o2 o2Var2 = ((ph1) sparseArray2.valueAt(i11)).f36485a;
                View view3 = o2Var2.fragmentView;
                if (view3 != null && hh.k.c(view3, bh0Var.f37133b, rectF2) && rectF2.right > 0.0f && rectF2.left < bh0Var.fragmentView.getMeasuredWidth() && (o2Var2 instanceof ah0) && (x10 = ((ah0) o2Var2).x()) != null) {
                    beginRecording.save();
                    beginRecording.translate(rectF2.left, rectF2.top);
                    x10.y(beginRecording, 0.0f, 0.0f, measuredWidth, measuredHeight);
                    beginRecording.restore();
                }
            }
            this.f477a.endRecording();
        }
    }
}
