package jh;

import android.content.Context;
import android.view.TextureView;
public final class g extends TextureView {
    public final j f10107a;

    public g(j jVar, Context context) {
        super(context);
        this.f10107a = jVar;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        j jVar = this.f10107a;
        setMeasuredDimension(jVar.f10127g, jVar.h);
    }
}
