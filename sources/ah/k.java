package ah;

import android.graphics.RecordingCanvas;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.util.SparseArray;
import android.view.View;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.bh0;
import org.telegram.ui.ch0;
import org.telegram.ui.rh1;
import org.telegram.ui.zg0;
public final class k {
    public final RenderNode f516a;
    public final zg0 f517b;
    public final a f518c = new Object();
    public long d = 0;
    public int f519e;
    public int f520f;

    public k(RenderNode renderNode, zg0 zg0Var) {
        this.f516a = renderNode;
        this.f517b = zg0Var;
    }

    public final void a() {
        long j3;
        boolean z10;
        fh.d x10;
        int width = this.f516a.getWidth();
        int height = this.f516a.getHeight();
        a aVar = this.f518c;
        aVar.f451b = 0L;
        aVar.f450a = false;
        ch0 ch0Var = this.f517b.f43781a;
        int themedColor = ch0Var.getThemedColor(i6.f20822d6);
        RectF rectF = ch0Var.T;
        aVar.a(themedColor);
        aVar.b(SharedConfig.chatBlurEnabled());
        SparseArray sparseArray = ch0Var.f40853a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            n2 n2Var = ((rh1) sparseArray.valueAt(i10)).f40134a;
            View view = n2Var.fragmentView;
            if (view != null && hh.k.c(view, ch0Var.f40854b, rectF) && rectF.right > 0.0f && rectF.left < ch0Var.fragmentView.getMeasuredWidth() && (n2Var instanceof bh0) && ((bh0) n2Var).x() != null) {
                aVar.c(rectF.left);
                aVar.c(rectF.top);
                aVar.a(n2Var.getClassGuid());
            }
        }
        if (aVar.f450a) {
            j3 = -1;
        } else {
            j3 = aVar.f451b;
        }
        if (this.f516a.hasDisplayList() && width == this.f519e && height == this.f520f && j3 == this.d && j3 != -1) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f519e = width;
        this.f520f = height;
        this.d = j3;
        if (z10) {
            RecordingCanvas beginRecording = this.f516a.beginRecording();
            View view2 = ch0Var.fragmentView;
            SparseArray sparseArray2 = ch0Var.f40853a;
            RectF rectF2 = ch0Var.T;
            int measuredWidth = view2.getMeasuredWidth();
            int measuredHeight = ch0Var.fragmentView.getMeasuredHeight();
            beginRecording.drawColor(ch0Var.getThemedColor(i6.f20822d6));
            int size2 = sparseArray2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                n2 n2Var2 = ((rh1) sparseArray2.valueAt(i11)).f40134a;
                View view3 = n2Var2.fragmentView;
                if (view3 != null && hh.k.c(view3, ch0Var.f40854b, rectF2) && rectF2.right > 0.0f && rectF2.left < ch0Var.fragmentView.getMeasuredWidth() && (n2Var2 instanceof bh0) && (x10 = ((bh0) n2Var2).x()) != null) {
                    beginRecording.save();
                    beginRecording.translate(rectF2.left, rectF2.top);
                    x10.v(beginRecording, 0.0f, 0.0f, measuredWidth, measuredHeight);
                    beginRecording.restore();
                }
            }
            this.f516a.endRecording();
        }
    }
}
