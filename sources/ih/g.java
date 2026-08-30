package ih;

import android.content.Context;
import android.view.TextureView;
public final class g extends TextureView {
    public final j f7579a;

    public g(j jVar, Context context) {
        super(context);
        this.f7579a = jVar;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        j jVar = this.f7579a;
        setMeasuredDimension(jVar.f7597g, jVar.h);
    }
}
