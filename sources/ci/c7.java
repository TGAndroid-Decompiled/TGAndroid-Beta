package ci;

import android.view.TextureView;
import android.view.ViewGroup;
import android.view.ViewParent;
public final class c7 {
    public TextureView f4429a;
    public org.telegram.ui.web.b1 f4430b;
    public hi.a f4431c;
    public boolean d;
    public int e;
    public int f4432f;
    public boolean f4433g;

    public final void a(TextureView textureView) {
        TextureView textureView2 = this.f4429a;
        if (textureView2 != textureView) {
            if (textureView2 != null) {
                ViewParent parent = textureView2.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(this.f4429a);
                }
                this.f4429a = null;
            }
            this.d = false;
            this.f4429a = textureView;
            org.telegram.ui.web.b1 b1Var = this.f4430b;
            if (b1Var != null) {
                b1Var.run(textureView);
            }
        }
    }
}
