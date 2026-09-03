package nh;

import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import java.util.ArrayList;
public final class c4 {
    public e1 f15121a;
    public h9 f15122b;
    public SurfaceView f15123c;
    public org.telegram.ui.q4 d;
    public TextureView e;
    public boolean f15124f;
    public ArrayList f15125g;

    public final void a() {
        ArrayList arrayList = this.f15125g;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((View) arrayList.get(i10)).invalidate();
        }
    }
}
