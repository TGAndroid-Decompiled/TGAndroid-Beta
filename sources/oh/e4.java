package oh;

import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import java.util.ArrayList;
public final class e4 {
    public e1 f17021a;
    public h9 f17022b;
    public SurfaceView f17023c;
    public org.telegram.ui.o4 d;
    public TextureView f17024e;
    public boolean f17025f;
    public ArrayList f17026g;

    public final void a() {
        ArrayList arrayList = this.f17026g;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((View) arrayList.get(i10)).invalidate();
        }
    }
}
