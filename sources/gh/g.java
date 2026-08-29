package gh;

import android.content.Context;
import android.view.TextureView;
public final class g extends TextureView {
    public final j f7377a;

    public g(j jVar, Context context) {
        super(context);
        this.f7377a = jVar;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        j jVar = this.f7377a;
        setMeasuredDimension(jVar.f7397g, jVar.h);
    }
}
