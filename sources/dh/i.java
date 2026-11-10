package dh;

import android.graphics.RecordingCanvas;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.util.SparseArray;
import android.view.View;
import org.telegram.messenger.iz;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.le0;
import org.telegram.ui.me0;
import org.telegram.ui.pb1;
public final class i {
    public final RenderNode f8771a;
    public final ca.i f8772b;
    public final a f8773c = new Object();
    public long d = 0;
    public int f8774e;
    public int f8775f;

    public i(RenderNode renderNode, ca.i iVar) {
        this.f8771a = renderNode;
        this.f8772b = iVar;
    }

    public final void a() {
        long j3;
        boolean z9;
        ri.f B;
        ri.f B2;
        int width = this.f8771a.getWidth();
        int height = this.f8771a.getHeight();
        a aVar = this.f8773c;
        aVar.f8704b = 0L;
        aVar.f8703a = false;
        ca.i iVar = this.f8772b;
        boolean z10 = iVar.f6018b;
        me0 me0Var = (me0) iVar.f6019c;
        int themedColor = me0Var.getThemedColor(m6.f27890d6);
        RectF rectF = me0Var.U;
        aVar.a(themedColor);
        aVar.b(iz.f());
        SparseArray sparseArray = me0Var.f49343a;
        int size = sparseArray.size();
        for (int i7 = 0; i7 < size; i7++) {
            f2 f2Var = ((pb1) sparseArray.valueAt(i7)).f48735a;
            View view = f2Var.fragmentView;
            if (view != null && jh.k.c(view, me0Var.f49344b, rectF) && rectF.right > 0.0f && rectF.left < me0Var.fragmentView.getMeasuredWidth() && (f2Var instanceof le0)) {
                le0 le0Var = (le0) f2Var;
                if (z10) {
                    B2 = le0Var.k();
                } else {
                    B2 = le0Var.B();
                }
                if (B2 != null) {
                    aVar.c(rectF.left);
                    aVar.c(rectF.top);
                    aVar.a(f2Var.getClassGuid());
                }
            }
        }
        if (aVar.f8703a) {
            j3 = -1;
        } else {
            j3 = aVar.f8704b;
        }
        if (this.f8771a.hasDisplayList() && width == this.f8774e && height == this.f8775f && j3 == this.d && j3 != -1) {
            z9 = false;
        } else {
            z9 = true;
        }
        this.f8774e = width;
        this.f8775f = height;
        this.d = j3;
        if (z9) {
            RecordingCanvas beginRecording = this.f8771a.beginRecording();
            View view2 = me0Var.fragmentView;
            SparseArray sparseArray2 = me0Var.f49343a;
            RectF rectF2 = me0Var.U;
            int measuredWidth = view2.getMeasuredWidth();
            int measuredHeight = me0Var.fragmentView.getMeasuredHeight();
            beginRecording.drawColor(me0Var.getThemedColor(m6.f27890d6));
            int size2 = sparseArray2.size();
            for (int i10 = 0; i10 < size2; i10++) {
                f2 f2Var2 = ((pb1) sparseArray2.valueAt(i10)).f48735a;
                View view3 = f2Var2.fragmentView;
                if (view3 != null && jh.k.c(view3, me0Var.f49344b, rectF2) && rectF2.right > 0.0f && rectF2.left < me0Var.fragmentView.getMeasuredWidth() && (f2Var2 instanceof le0)) {
                    le0 le0Var2 = (le0) f2Var2;
                    if (z10) {
                        B = le0Var2.k();
                    } else {
                        B = le0Var2.B();
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
            this.f8771a.endRecording();
        }
    }
}
