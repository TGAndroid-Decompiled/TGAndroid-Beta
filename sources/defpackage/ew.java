package defpackage;

import android.graphics.Bitmap;
import android.os.Build;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.o;
public final class ew extends i98 {
    public final int[] a = new int[2];
    public final List b;
    public final o c;

    public ew(o oVar, List list) {
        this.c = oVar;
        this.b = list;
    }

    @Override
    public final void C() {
        this.c.k();
    }

    @Override
    public final p98 M(k27 k27Var, TLRPC.FileLocation fileLocation, int i, boolean z, boolean z2) {
        if (i >= 0) {
            List list = this.b;
            if (i < list.size()) {
                o oVar = this.c;
                int[] iArr = this.a;
                ImageReceiver d0 = d0(oVar.v0[0].b, (TL_iv.PageBlock) list.get(i), iArr);
                if (d0 != null) {
                    p98 p98Var = new p98();
                    p98Var.b = iArr[0];
                    p98Var.c = iArr[1];
                    p98Var.d = oVar.v0[0].b;
                    p98Var.a = d0;
                    p98Var.e = d0.p();
                    p98Var.h = d0.z();
                    p98Var.j = oVar.K0;
                    return p98Var;
                }
                return null;
            }
            return null;
        }
        return null;
    }

    @Override
    public final void Y(int r13) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ew.Y(int):void");
    }

    public final ImageReceiver d0(ViewGroup viewGroup, TL_iv.PageBlock pageBlock, int[] iArr) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            ImageReceiver e0 = e0(viewGroup.getChildAt(i), pageBlock, iArr);
            if (e0 != null) {
                return e0;
            }
        }
        return null;
    }

    public final ImageReceiver e0(View view, TL_iv.PageBlock pageBlock, int[] iArr) {
        y29 y29Var;
        ImageReceiver e0;
        ImageReceiver e02;
        VideoPlayerHolderBase videoPlayerHolderBase;
        if (view instanceof cv) {
            cv cvVar = (cv) view;
            if (cvVar.O == pageBlock) {
                view.getLocationInWindow(iArr);
                return cvVar.e;
            }
            return null;
        } else if (view instanceof xv) {
            xv xvVar = (xv) view;
            ImageReceiver imageReceiver = xvVar.e;
            TextureView textureView = xvVar.n;
            if (xvVar.M == pageBlock) {
                view.getLocationInWindow(iArr);
                o oVar = this.c;
                if (xvVar == oVar.y && (videoPlayerHolderBase = oVar.x) != null && videoPlayerHolderBase.firstFrameRendered && textureView.getSurfaceTexture() != null) {
                    if (Build.VERSION.SDK_INT >= 24) {
                        Surface surface = new Surface(textureView.getSurfaceTexture());
                        Bitmap createBitmap = Bitmap.createBitmap(textureView.getMeasuredWidth(), textureView.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                        gl.x0(surface, createBitmap);
                        surface.release();
                        imageReceiver.f0(createBitmap);
                    } else {
                        imageReceiver.f0(textureView.getBitmap());
                    }
                    textureView.setAlpha(0.0f);
                }
                return imageReceiver;
            }
            return null;
        } else if (view instanceof mu) {
            ImageReceiver d0 = d0(((mu) view).a, pageBlock, iArr);
            if (d0 != null) {
                return d0;
            }
            return null;
        } else if (view instanceof pv) {
            ImageReceiver d02 = d0(((pv) view).b, pageBlock, iArr);
            if (d02 != null) {
                return d02;
            }
            return null;
        } else if (view instanceof xu) {
            y29 y29Var2 = ((xu) view).d;
            if (y29Var2 != null && (e02 = e0(y29Var2.a, pageBlock, iArr)) != null) {
                return e02;
            }
            return null;
        } else if ((view instanceof av) && (y29Var = ((av) view).d) != null && (e0 = e0(y29Var.a, pageBlock, iArr)) != null) {
            return e0;
        } else {
            return null;
        }
    }
}
