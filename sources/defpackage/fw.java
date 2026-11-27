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
public final class fw extends yc8 {
    public final int[] a = new int[2];
    public final List b;
    public final o c;

    public fw(o oVar, List list) {
        this.c = oVar;
        this.b = list;
    }

    @Override
    public final void C() {
        this.c.k();
    }

    @Override
    public final fd8 M(r47 r47Var, TLRPC.FileLocation fileLocation, int i, boolean z, boolean z2) {
        if (i >= 0) {
            List list = this.b;
            if (i < list.size()) {
                o oVar = this.c;
                int[] iArr = this.a;
                ImageReceiver e0 = e0(oVar.v0[0].b, (TL_iv.PageBlock) list.get(i), iArr);
                if (e0 != null) {
                    fd8 fd8Var = new fd8();
                    fd8Var.b = iArr[0];
                    fd8Var.c = iArr[1];
                    fd8Var.d = oVar.v0[0].b;
                    fd8Var.a = e0;
                    fd8Var.e = e0.p();
                    fd8Var.h = e0.z();
                    fd8Var.j = oVar.K0;
                    return fd8Var;
                }
                return null;
            }
            return null;
        }
        return null;
    }

    @Override
    public final void Z(int r13) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fw.Z(int):void");
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
        n69 n69Var;
        ImageReceiver f0;
        ImageReceiver f02;
        VideoPlayerHolderBase videoPlayerHolderBase;
        if (view instanceof dv) {
            dv dvVar = (dv) view;
            if (dvVar.O == pageBlock) {
                view.getLocationInWindow(iArr);
                return dvVar.e;
            }
            return null;
        } else if (view instanceof yv) {
            yv yvVar = (yv) view;
            ImageReceiver imageReceiver = yvVar.e;
            TextureView textureView = yvVar.n;
            if (yvVar.M == pageBlock) {
                view.getLocationInWindow(iArr);
                o oVar = this.c;
                if (yvVar == oVar.y && (videoPlayerHolderBase = oVar.x) != null && videoPlayerHolderBase.firstFrameRendered && textureView.getSurfaceTexture() != null) {
                    if (Build.VERSION.SDK_INT >= 24) {
                        Surface surface = new Surface(textureView.getSurfaceTexture());
                        Bitmap createBitmap = Bitmap.createBitmap(textureView.getMeasuredWidth(), textureView.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                        hl.x0(surface, createBitmap);
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
        } else if (view instanceof nu) {
            ImageReceiver e0 = e0(((nu) view).a, pageBlock, iArr);
            if (e0 != null) {
                return e0;
            }
            return null;
        } else if (view instanceof qv) {
            ImageReceiver e02 = e0(((qv) view).b, pageBlock, iArr);
            if (e02 != null) {
                return e02;
            }
            return null;
        } else if (view instanceof yu) {
            n69 n69Var2 = ((yu) view).d;
            if (n69Var2 != null && (f02 = f0(n69Var2.a, pageBlock, iArr)) != null) {
                return f02;
            }
            return null;
        } else if ((view instanceof bv) && (n69Var = ((bv) view).d) != null && (f0 = f0(n69Var.a, pageBlock, iArr)) != null) {
            return f0;
        } else {
            return null;
        }
    }
}
