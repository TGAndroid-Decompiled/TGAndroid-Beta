package defpackage;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.widget.ImageView;
public final class yoc extends src {
    public final byte E = 1;
    public final Object F;

    public yoc(itc itcVar, Context context, olc olcVar) {
        super(context, olcVar, 0);
        this.F = itcVar;
    }

    @Override
    public final void a() {
        byte b = this.E;
        Object obj = this.F;
        switch (b) {
            case 0:
                zoc zocVar = (zoc) obj;
                zocVar.o = true;
                setPaused(true);
                setVisibility(8);
                zocVar.a.invalidate();
                return;
            default:
                setPaused(true);
                setVisibility(8);
                ((itc) obj).a.setVisibility(0);
                return;
        }
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        switch (this.E) {
            case 1:
                ImageView imageView = ((itc) this.F).a;
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

    public yoc(zoc zocVar, Context context, voc vocVar) {
        super(context, vocVar, 2);
        this.F = zocVar;
    }
}
