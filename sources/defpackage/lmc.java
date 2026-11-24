package defpackage;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.widget.ImageView;
public final class lmc extends gpc {
    public final byte E = 0;
    public final Object F;

    public lmc(xqc xqcVar, Context context, cpc cpcVar) {
        super(context, cpcVar, 0);
        this.F = xqcVar;
    }

    @Override
    public final void a() {
        byte b = this.E;
        Object obj = this.F;
        switch (b) {
            case 0:
                mmc mmcVar = (mmc) obj;
                mmcVar.o = true;
                setPaused(true);
                setVisibility(8);
                mmcVar.a.invalidate();
                return;
            default:
                setPaused(true);
                setVisibility(8);
                ((xqc) obj).a.setVisibility(0);
                return;
        }
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        switch (this.E) {
            case 1:
                ImageView imageView = ((xqc) this.F).a;
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

    public lmc(mmc mmcVar, Context context, imc imcVar) {
        super(context, imcVar, 2);
        this.F = mmcVar;
    }
}
