package ih;

import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import java.util.ArrayList;
public final class h4 {
    public f1 f11500a;
    public l9 f11501b;
    public SurfaceView f11502c;
    public c5.c d;
    public TextureView f11503e;
    public boolean f11504f;
    public ArrayList f11505g;

    public final void a() {
        ArrayList arrayList = this.f11505g;
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            ((View) arrayList.get(i9)).invalidate();
        }
    }
}
