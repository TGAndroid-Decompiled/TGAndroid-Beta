package ci;

import android.view.TextureView;
import android.view.ViewGroup;
import android.view.ViewParent;
public final class c7 {
    public TextureView f4430a;
    public org.telegram.ui.web.b1 f4431b;
    public hi.a f4432c;
    public boolean d;
    public int e;
    public int f4433f;
    public boolean f4434g;

    public final void a(TextureView textureView) {
        TextureView textureView2 = this.f4430a;
        if (textureView2 != textureView) {
            if (textureView2 != null) {
                ViewParent parent = textureView2.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(this.f4430a);
                }
                this.f4430a = null;
            }
            this.d = false;
            this.f4430a = textureView;
            org.telegram.ui.web.b1 b1Var = this.f4431b;
            if (b1Var != null) {
                b1Var.run(textureView);
            }
        }
    }
}
