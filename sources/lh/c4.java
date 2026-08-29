package lh;

import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import java.util.ArrayList;
public final class c4 {
    public d1 f15426a;
    public h9 f15427b;
    public SurfaceView f15428c;
    public e5.c d;
    public TextureView f15429e;
    public boolean f15430f;
    public ArrayList f15431g;

    public final void a() {
        ArrayList arrayList = this.f15431g;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((View) arrayList.get(i10)).invalidate();
        }
    }
}
