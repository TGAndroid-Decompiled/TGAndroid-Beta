package defpackage;

import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.PhotoViewer;
public final class v10 extends qn {
    public final byte b;
    public final Object c;

    public v10(rqc rqcVar) {
        super("progress", (byte) 0);
        this.b = (byte) 5;
        this.c = rqcVar;
    }

    @Override
    public final void c(Object obj, float f) {
        float f2;
        byte b = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                a aVar = (a) obj;
                i20 i20Var = (i20) obj2;
                i20Var.K2 = f;
                jia titleTextView = aVar.getTitleTextView();
                ImageView backButton = aVar.getBackButton();
                float f3 = 1.0f - f;
                titleTextView.setTranslationX(gl.L(-52.0f) * f3);
                backButton.setTranslationX(gl.L(-52.0f) * f3);
                r7 r7Var = i20Var.e2;
                if (r7Var != null && r7Var.getSearchContainer() != null) {
                    r7Var.getSearchContainer().setClipChildren(false);
                    r7Var.getSearchContainer().setClipToPadding(false);
                    FrameLayout searchContainer = r7Var.getSearchContainer();
                    float f4 = 66.0f;
                    if (gl.O1()) {
                        f2 = 74.0f;
                    } else {
                        f2 = 66.0f;
                    }
                    searchContainer.setPadding(0, 0, gl.L(f2), 0);
                    FrameLayout searchContainer2 = r7Var.getSearchContainer();
                    if (gl.O1()) {
                        f4 = 74.0f;
                    }
                    searchContainer2.setTranslationX((gl.L(-52.0f) * f3) + gl.L(f4));
                    if (r7Var.getSearchClearButton() != null) {
                        r7Var.getSearchClearButton().setTranslationX(gl.L(52.0f) * f3);
                    }
                }
                backButton.setScaleX(gl.R1(0.6f, 1.0f, f));
                backButton.setScaleY(gl.R1(0.6f, 1.0f, f));
                backButton.setAlpha(gl.R1(0.0f, 1.0f, f));
                i20Var.b.invalidate();
                return;
            case 1:
                mu1.nd = f;
                mu1 mu1Var = (mu1) obj2;
                ColorMatrix colorMatrix = mu1Var.j7;
                colorMatrix.setSaturation(f);
                mu1Var.i7.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                return;
            case 2:
                bw2 bw2Var = (bw2) obj;
                bw2 bw2Var2 = (bw2) obj2;
                bw2Var2.i0 = f;
                bw2Var2.invalidate();
                return;
            case 3:
                he4 he4Var = (he4) obj2;
                he4Var.x0 = f;
                int i = he4Var.V;
                wjb wjbVar = he4Var.a;
                he4Var.U.setColor(bm2.f(f, bkb.v0(i, wjbVar), bkb.v0(he4Var.d0, wjbVar)));
                fu fuVar = he4Var.G;
                fuVar.h1();
                fuVar.invalidate();
                ((he4) obj).invalidate();
                return;
            case 4:
                ((View) obj).setAlpha(f);
                v48 v48Var = ((PhotoViewer) obj2).D1;
                if (v48Var != null) {
                    v48Var.setVideoThumbFlashAlpha(f);
                    return;
                }
                return;
            case 5:
                rqc rqcVar = (rqc) obj;
                rqc rqcVar2 = (rqc) obj2;
                rqcVar2.y = f;
                rqcVar2.invalidate();
                return;
            default:
                azc azcVar = (azc) obj;
                azc azcVar2 = (azc) obj2;
                azcVar2.F = f;
                zyc zycVar = azcVar2.M;
                if (zycVar != null) {
                    zycVar.b(f);
                }
                azcVar2.invalidate();
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        byte b = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                a aVar = (a) obj;
                return Float.valueOf(((i20) obj2).K2);
            case 1:
                return Float.valueOf(mu1.nd);
            case 2:
                bw2 bw2Var = (bw2) obj;
                return Float.valueOf(((bw2) obj2).i0);
            case 3:
                he4 he4Var = (he4) obj;
                return Float.valueOf(((he4) obj2).x0);
            case 4:
                return Float.valueOf(((View) obj).getAlpha());
            case 5:
                rqc rqcVar = (rqc) obj;
                return Float.valueOf(((rqc) obj2).y);
            default:
                azc azcVar = (azc) obj;
                return Float.valueOf(((azc) obj2).F);
        }
    }

    public v10(FrameLayout frameLayout, byte b) {
        super("animationValue", (byte) 0);
        this.b = b;
        this.c = frameLayout;
    }

    public v10(azc azcVar) {
        super("clipProgress", (byte) 0);
        this.b = (byte) 6;
        this.c = azcVar;
    }

    public v10(PhotoViewer photoViewer) {
        super("flashViewAlpha", (byte) 0);
        this.b = (byte) 4;
        this.c = photoViewer;
    }

    public v10(mu1 mu1Var) {
        super("", (byte) 0);
        this.b = (byte) 1;
        this.c = mu1Var;
    }

    public v10(i20 i20Var) {
        super("actionBarSlide", (byte) 0);
        this.b = (byte) 0;
        this.c = i20Var;
    }
}
