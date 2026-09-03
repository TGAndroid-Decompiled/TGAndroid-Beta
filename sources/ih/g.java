package ih;

import android.content.Context;
import android.view.TextureView;
public final class g extends TextureView {
    public final j f7561a;

    public g(j jVar, Context context) {
        super(context);
        this.f7561a = jVar;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        j jVar = this.f7561a;
        setMeasuredDimension(jVar.f7579g, jVar.h);
    }
}
