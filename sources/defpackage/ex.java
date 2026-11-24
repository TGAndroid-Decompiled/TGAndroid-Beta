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
public final class ex extends jb8 {
    public final int[] a = new int[2];
    public final List b;
    public final o c;

    public ex(o oVar, List list) {
        this.c = oVar;
        this.b = list;
    }

    @Override
    public final void D() {
        this.c.k();
    }

    @Override
    public final qb8 N(k47 k47Var, TLRPC.FileLocation fileLocation, int i, boolean z, boolean z2) {
        if (i >= 0) {
            List list = this.b;
            if (i < list.size()) {
                o oVar = this.c;
                int[] iArr = this.a;
                ImageReceiver e0 = e0(oVar.v0[0].b, (TL_iv.PageBlock) list.get(i), iArr);
                if (e0 != null) {
                    qb8 qb8Var = new qb8();
                    qb8Var.b = iArr[0];
                    qb8Var.c = iArr[1];
                    qb8Var.d = oVar.v0[0].b;
                    qb8Var.a = e0;
                    qb8Var.e = e0.p();
                    qb8Var.h = e0.z();
                    qb8Var.j = oVar.K0;
                    return qb8Var;
                }
                return null;
            }
            return null;
        }
        return null;
    }

    @Override
    public final void Z(int r13) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ex.Z(int):void");
    }

    public final ImageReceiver e0(ViewGroup viewGroup, TL_iv.PageBlock pageBlock, int[] iArr) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            ImageReceiver f0 = f0(viewGroup.getChildAt(i), pageBlock, iArr);
            if (f0 != null) {
                return f0;
            }
        }
        return null;
    }

    public final ImageReceiver f0(View view, TL_iv.PageBlock pageBlock, int[] iArr) {
        b59 b59Var;
        ImageReceiver f0;
        ImageReceiver f02;
        VideoPlayerHolderBase videoPlayerHolderBase;
        if (view instanceof cw) {
            cw cwVar = (cw) view;
            if (cwVar.O == pageBlock) {
                view.getLocationInWindow(iArr);
                return cwVar.e;
            }
            return null;
        } else if (view instanceof xw) {
            xw xwVar = (xw) view;
            ImageReceiver imageReceiver = xwVar.e;
            TextureView textureView = xwVar.n;
            if (xwVar.M == pageBlock) {
                view.getLocationInWindow(iArr);
                o oVar = this.c;
                if (xwVar == oVar.y && (videoPlayerHolderBase = oVar.x) != null && videoPlayerHolderBase.firstFrameRendered && textureView.getSurfaceTexture() != null) {
                    if (Build.VERSION.SDK_INT >= 24) {
                        Surface surface = new Surface(textureView.getSurfaceTexture());
                        Bitmap createBitmap = Bitmap.createBitmap(textureView.getMeasuredWidth(), textureView.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                        gm.x0(surface, createBitmap);
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
        } else if (view instanceof mv) {
            ImageReceiver e0 = e0(((mv) view).a, pageBlock, iArr);
            if (e0 != null) {
                return e0;
            }
            return null;
        } else if (view instanceof pw) {
            ImageReceiver e02 = e0(((pw) view).b, pageBlock, iArr);
            if (e02 != null) {
                return e02;
            }
            return null;
        } else if (view instanceof xv) {
            b59 b59Var2 = ((xv) view).d;
            if (b59Var2 != null && (f02 = f0(b59Var2.a, pageBlock, iArr)) != null) {
                return f02;
            }
            return null;
        } else if ((view instanceof aw) && (b59Var = ((aw) view).d) != null && (f0 = f0(b59Var.a, pageBlock, iArr)) != null) {
            return f0;
        } else {
            return null;
        }
    }
}
