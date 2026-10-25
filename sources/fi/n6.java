package fi;

import android.view.TextureView;
import android.view.ViewGroup;
import android.view.ViewParent;
public final class n6 {
    public TextureView f11302a;
    public ig.o f11303b;
    public hi.e2 f11304c;
    public boolean d;
    public int e;
    public int f11305f;
    public boolean f11306g;

    public final void a(TextureView textureView) {
        TextureView textureView2 = this.f11302a;
        if (textureView2 != textureView) {
            if (textureView2 != null) {
                ViewParent parent = textureView2.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(this.f11302a);
                }
                this.f11302a = null;
            }
            this.d = false;
            this.f11302a = textureView;
            ig.o oVar = this.f11303b;
            if (oVar != null) {
                oVar.run(textureView);
            }
        }
    }
}
