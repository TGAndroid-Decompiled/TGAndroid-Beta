package oh;

import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import java.util.ArrayList;
public final class e4 {
    public e1 f17019a;
    public h9 f17020b;
    public SurfaceView f17021c;
    public org.telegram.ui.o4 d;
    public TextureView f17022e;
    public boolean f17023f;
    public ArrayList f17024g;

    public final void a() {
        ArrayList arrayList = this.f17024g;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((View) arrayList.get(i10)).invalidate();
        }
    }
}
