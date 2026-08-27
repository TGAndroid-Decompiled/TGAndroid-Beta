package jh;

import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import java.util.ArrayList;

public final class d4 {

    public d1 f13191a;

    public h9 f13192b;

    public SurfaceView f13193c;
    public c5.c d;

    public TextureView f13194e;

    public boolean f13195f;

    public ArrayList f13196g;

    public final void a() {
        ArrayList arrayList = this.f13196g;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((View) arrayList.get(i10)).invalidate();
        }
    }
}
