package fi;

import android.view.TextureView;
import android.view.ViewGroup;
import android.view.ViewParent;
public final class n6 {
    public TextureView f11301a;
    public ig.o f11302b;
    public hi.e2 f11303c;
    public boolean d;
    public int e;
    public int f11304f;
    public boolean f11305g;

    public final void a(TextureView textureView) {
        TextureView textureView2 = this.f11301a;
        if (textureView2 != textureView) {
            if (textureView2 != null) {
                ViewParent parent = textureView2.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(this.f11301a);
                }
                this.f11301a = null;
            }
            this.d = false;
            this.f11301a = textureView;
            ig.o oVar = this.f11302b;
            if (oVar != null) {
                oVar.run(textureView);
            }
        }
    }
}
