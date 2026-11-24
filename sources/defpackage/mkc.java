package defpackage;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.widget.ImageView;
public final class mkc extends fnc {
    public final byte E = 0;
    public final Object F;

    public mkc(voc vocVar, Context context, kbc kbcVar) {
        super(context, kbcVar, 0);
        this.F = vocVar;
    }

    @Override
    public final void a() {
        byte b = this.E;
        Object obj = this.F;
        switch (b) {
            case 0:
                nkc nkcVar = (nkc) obj;
                nkcVar.o = true;
                setPaused(true);
                setVisibility(8);
                nkcVar.a.invalidate();
                return;
            default:
                setPaused(true);
                setVisibility(8);
                ((voc) obj).a.setVisibility(0);
                return;
        }
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        switch (this.E) {
            case 1:
                ImageView imageView = ((voc) this.F).a;
                super.onSurfaceTextureUpdated(surfaceTexture);
                if (this.n && imageView.getVisibility() == 0) {
                    imageView.setVisibility(4);
                    return;
                }
                return;
            default:
                super.onSurfaceTextureUpdated(surfaceTexture);
                return;
        }
    }

    public mkc(nkc nkcVar, Context context, jkc jkcVar) {
        super(context, jkcVar, 2);
        this.F = nkcVar;
    }
}
