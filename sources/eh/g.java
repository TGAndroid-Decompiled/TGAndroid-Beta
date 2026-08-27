package eh;

import android.content.Context;
import android.view.TextureView;

public final class g extends TextureView {

    public final j f5485a;

    public g(j jVar, Context context) {
        super(context);
        this.f5485a = jVar;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        j jVar = this.f5485a;
        setMeasuredDimension(jVar.f5505g, jVar.h);
    }
}
