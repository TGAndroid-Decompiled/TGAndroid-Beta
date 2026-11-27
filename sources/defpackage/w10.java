package defpackage;

import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.PhotoViewer;
public final class w10 extends rn {
    public final byte b;
    public final Object c;

    public w10(fvc fvcVar) {
        super("progress", (byte) 0);
        this.b = (byte) 5;
        this.c = fvcVar;
    }

    @Override
    public final void c(Object obj, float f) {
        float f2;
        byte b = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                a aVar = (a) obj;
                j20 j20Var = (j20) obj2;
                j20Var.K2 = f;
                ema titleTextView = aVar.getTitleTextView();
                ImageView backButton = aVar.getBackButton();
                float f3 = 1.0f - f;
                titleTextView.setTranslationX(hl.L(-52.0f) * f3);
                backButton.setTranslationX(hl.L(-52.0f) * f3);
                s7 s7Var = j20Var.e2;
                if (s7Var != null && s7Var.getSearchContainer() != null) {
                    s7Var.getSearchContainer().setClipChildren(false);
                    s7Var.getSearchContainer().setClipToPadding(false);
                    FrameLayout searchContainer = s7Var.getSearchContainer();
                    float f4 = 66.0f;
                    if (hl.O1()) {
                        f2 = 74.0f;
                    } else {
                        f2 = 66.0f;
                    }
                    searchContainer.setPadding(0, 0, hl.L(f2), 0);
                    FrameLayout searchContainer2 = s7Var.getSearchContainer();
                    if (hl.O1()) {
                        f4 = 74.0f;
                    }
                    searchContainer2.setTranslationX((hl.L(-52.0f) * f3) + hl.L(f4));
                    if (s7Var.getSearchClearButton() != null) {
                        s7Var.getSearchClearButton().setTranslationX(hl.L(52.0f) * f3);
                    }
                }
                backButton.setScaleX(hl.R1(0.6f, 1.0f, f));
                backButton.setScaleY(hl.R1(0.6f, 1.0f, f));
                backButton.setAlpha(hl.R1(0.0f, 1.0f, f));
                j20Var.b.invalidate();
                return;
            case 1:
                zu1.Bd = f;
                zu1 zu1Var = (zu1) obj2;
                ColorMatrix colorMatrix = zu1Var.j7;
                colorMatrix.setSaturation(f);
                zu1Var.i7.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                return;
            case 2:
                vw2 vw2Var = (vw2) obj;
                vw2 vw2Var2 = (vw2) obj2;
                vw2Var2.i0 = f;
                vw2Var2.invalidate();
                return;
            case 3:
                fg4 fg4Var = (fg4) obj2;
                fg4Var.y0 = f;
                int i = fg4Var.W;
                vnb vnbVar = fg4Var.a;
                fg4Var.V.setColor(vm2.f(f, aob.v0(i, vnbVar), aob.v0(fg4Var.e0, vnbVar)));
                gu guVar = fg4Var.G;
                guVar.i1();
                guVar.invalidate();
                ((fg4) obj).invalidate();
                return;
            case 4:
                ((View) obj).setAlpha(f);
                k88 k88Var = ((PhotoViewer) obj2).D1;
                if (k88Var != null) {
                    k88Var.setVideoThumbFlashAlpha(f);
                    return;
                }
                return;
            case 5:
                fvc fvcVar = (fvc) obj;
                fvc fvcVar2 = (fvc) obj2;
                fvcVar2.y = f;
                fvcVar2.invalidate();
                return;
            default:
                r3d r3dVar = (r3d) obj;
                r3d r3dVar2 = (r3d) obj2;
                r3dVar2.F = f;
                q3d q3dVar = r3dVar2.M;
                if (q3dVar != null) {
                    q3dVar.b(f);
                }
                r3dVar2.invalidate();
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
                return Float.valueOf(((j20) obj2).K2);
            case 1:
                return Float.valueOf(zu1.Bd);
            case 2:
                vw2 vw2Var = (vw2) obj;
                return Float.valueOf(((vw2) obj2).i0);
            case 3:
                fg4 fg4Var = (fg4) obj;
                return Float.valueOf(((fg4) obj2).y0);
            case 4:
                return Float.valueOf(((View) obj).getAlpha());
            case 5:
                fvc fvcVar = (fvc) obj;
                return Float.valueOf(((fvc) obj2).y);
            default:
                r3d r3dVar = (r3d) obj;
                return Float.valueOf(((r3d) obj2).F);
        }
    }

    public w10(FrameLayout frameLayout, byte b) {
        super("animationValue", (byte) 0);
        this.b = b;
        this.c = frameLayout;
    }

    public w10(r3d r3dVar) {
        super("clipProgress", (byte) 0);
        this.b = (byte) 6;
        this.c = r3dVar;
    }

    public w10(PhotoViewer photoViewer) {
        super("flashViewAlpha", (byte) 0);
        this.b = (byte) 4;
        this.c = photoViewer;
    }

    public w10(zu1 zu1Var) {
        super("", (byte) 0);
        this.b = (byte) 1;
        this.c = zu1Var;
    }

    public w10(j20 j20Var) {
        super("actionBarSlide", (byte) 0);
        this.b = (byte) 0;
        this.c = j20Var;
    }
}
