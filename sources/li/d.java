package li;

import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.i6;
public final class d {
    public int f14369b;
    public bh.a f14370c;
    public FrameLayout d;
    public final ArrayList f14368a = new ArrayList();
    public final RenderNode e = ah.f.m();

    public final void a() {
        ArrayList arrayList;
        int i10 = 0;
        while (true) {
            int i11 = this.f14369b;
            arrayList = this.f14368a;
            if (i10 >= i11) {
                break;
            }
            c cVar = (c) arrayList.get(i10);
            bh.a aVar = this.f14370c;
            Rect rect = cVar.f14363b;
            cVar.f14365f = rect.width() / cVar.h;
            int height = rect.height() / cVar.h;
            cVar.f14366g = height;
            cVar.d.setPosition(0, 0, cVar.f14365f, height);
            RecordingCanvas beginRecording = cVar.d.beginRecording();
            beginRecording.save();
            float f7 = 1.0f / cVar.h;
            beginRecording.scale(f7, f7, 0.0f, 0.0f);
            RectF rectF = cVar.f14364c;
            beginRecording.translate(-rectF.left, -rectF.top);
            aVar.f(beginRecording, rectF);
            beginRecording.restore();
            cVar.d.endRecording();
            cVar.e.setPosition(0, 0, cVar.f14365f, cVar.f14366g);
            cVar.e.beginRecording().drawRenderNode(cVar.d);
            cVar.e.endRecording();
            i10++;
        }
        this.e.setPosition(0, 0, this.d.getWidth(), this.d.getHeight());
        RecordingCanvas beginRecording2 = this.e.beginRecording();
        for (int i12 = 0; i12 < this.f14369b; i12++) {
            c cVar2 = (c) arrayList.get(i12);
            beginRecording2.save();
            RectF rectF2 = cVar2.f14362a;
            RectF rectF3 = cVar2.f14364c;
            beginRecording2.clipRect(rectF2);
            beginRecording2.translate(rectF3.left, rectF3.top);
            float f10 = cVar2.h;
            beginRecording2.scale(f10, f10);
            beginRecording2.drawRenderNode(cVar2.d);
            beginRecording2.restore();
            beginRecording2.drawRect(cVar2.f14362a, i6.Ml);
            beginRecording2.drawRect(rectF3, i6.Ll);
        }
        this.e.endRecording();
    }
}
