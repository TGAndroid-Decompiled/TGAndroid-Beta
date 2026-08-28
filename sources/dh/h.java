package dh;

import android.content.Context;
import android.view.TextureView;
public final class h extends TextureView {
    public final k f4587a;

    public h(k kVar, Context context) {
        super(context);
        this.f4587a = kVar;
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        k kVar = this.f4587a;
        setMeasuredDimension(kVar.f4607g, kVar.h);
    }
}
