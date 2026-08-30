package nh;

import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import java.util.ArrayList;
public final class c4 {
    public e1 f15141a;
    public h9 f15142b;
    public SurfaceView f15143c;
    public org.telegram.ui.o4 d;
    public TextureView e;
    public boolean f15144f;
    public ArrayList f15145g;

    public final void a() {
        ArrayList arrayList = this.f15145g;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((View) arrayList.get(i10)).invalidate();
        }
    }
}
