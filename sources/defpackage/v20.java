package defpackage;

import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.PhotoViewer;
public final class v20 extends ro {
    public final byte b;
    public final Object c;

    public v20(tsc tscVar) {
        super("progress", (byte) 0);
        this.b = (byte) 5;
        this.c = tscVar;
    }

    @Override
    public final void c(Object obj, float f) {
        float f2;
        byte b = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                a aVar = (a) obj;
                i30 i30Var = (i30) obj2;
                i30Var.K2 = f;
                lka titleTextView = aVar.getTitleTextView();
                ImageView backButton = aVar.getBackButton();
                float f3 = 1.0f - f;
                titleTextView.setTranslationX(gm.L(-52.0f) * f3);
                backButton.setTranslationX(gm.L(-52.0f) * f3);
                r7 r7Var = i30Var.e2;
                if (r7Var != null && r7Var.getSearchContainer() != null) {
                    r7Var.getSearchContainer().setClipChildren(false);
                    r7Var.getSearchContainer().setClipToPadding(false);
                    FrameLayout searchContainer = r7Var.getSearchContainer();
                    float f4 = 66.0f;
                    if (gm.O1()) {
                        f2 = 74.0f;
                    } else {
                        f2 = 66.0f;
                    }
                    searchContainer.setPadding(0, 0, gm.L(f2), 0);
                    FrameLayout searchContainer2 = r7Var.getSearchContainer();
                    if (gm.O1()) {
                        f4 = 74.0f;
                    }
                    searchContainer2.setTranslationX((gm.L(-52.0f) * f3) + gm.L(f4));
                    if (r7Var.getSearchClearButton() != null) {
                        r7Var.getSearchClearButton().setTranslationX(gm.L(52.0f) * f3);
                    }
                }
                backButton.setScaleX(gm.R1(0.6f, 1.0f, f));
                backButton.setScaleY(gm.R1(0.6f, 1.0f, f));
                backButton.setAlpha(gm.R1(0.0f, 1.0f, f));
                i30Var.b.invalidate();
                return;
            case 1:
                yv1.yd = f;
                yv1 yv1Var = (yv1) obj2;
                ColorMatrix colorMatrix = yv1Var.j7;
                colorMatrix.setSaturation(f);
                yv1Var.i7.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                return;
            case 2:
                lx2 lx2Var = (lx2) obj;
                lx2 lx2Var2 = (lx2) obj2;
                lx2Var2.i0 = f;
                lx2Var2.invalidate();
                return;
            case 3:
                ig4 ig4Var = (ig4) obj2;
                ig4Var.x0 = f;
                int i = ig4Var.V;
                ylb ylbVar = ig4Var.a;
                ig4Var.U.setColor(on2.f(f, cmb.v0(i, ylbVar), cmb.v0(ig4Var.d0, ylbVar)));
                fv fvVar = ig4Var.G;
                fvVar.h1();
                fvVar.invalidate();
                ((ig4) obj).invalidate();
                return;
            case 4:
                ((View) obj).setAlpha(f);
                x68 x68Var = ((PhotoViewer) obj2).D1;
                if (x68Var != null) {
                    x68Var.setVideoThumbFlashAlpha(f);
                    return;
                }
                return;
            case 5:
                tsc tscVar = (tsc) obj;
                tsc tscVar2 = (tsc) obj2;
                tscVar2.y = f;
                tscVar2.invalidate();
                return;
            default:
                b1d b1dVar = (b1d) obj;
                b1d b1dVar2 = (b1d) obj2;
                b1dVar2.F = f;
                a1d a1dVar = b1dVar2.M;
                if (a1dVar != null) {
                    a1dVar.b(f);
                }
                b1dVar2.invalidate();
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
                return Float.valueOf(((i30) obj2).K2);
            case 1:
                return Float.valueOf(yv1.yd);
            case 2:
                lx2 lx2Var = (lx2) obj;
                return Float.valueOf(((lx2) obj2).i0);
            case 3:
                ig4 ig4Var = (ig4) obj;
                return Float.valueOf(((ig4) obj2).x0);
            case 4:
                return Float.valueOf(((View) obj).getAlpha());
            case 5:
                tsc tscVar = (tsc) obj;
                return Float.valueOf(((tsc) obj2).y);
            default:
                b1d b1dVar = (b1d) obj;
                return Float.valueOf(((b1d) obj2).F);
        }
    }

    public v20(FrameLayout frameLayout, byte b) {
        super("animationValue", (byte) 0);
        this.b = b;
        this.c = frameLayout;
    }

    public v20(b1d b1dVar) {
        super("clipProgress", (byte) 0);
        this.b = (byte) 6;
        this.c = b1dVar;
    }

    public v20(PhotoViewer photoViewer) {
        super("flashViewAlpha", (byte) 0);
        this.b = (byte) 4;
        this.c = photoViewer;
    }

    public v20(yv1 yv1Var) {
        super("", (byte) 0);
        this.b = (byte) 1;
        this.c = yv1Var;
    }

    public v20(i30 i30Var) {
        super("actionBarSlide", (byte) 0);
        this.b = (byte) 0;
        this.c = i30Var;
    }
}
