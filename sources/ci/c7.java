package ci;

import android.view.TextureView;
import android.view.ViewGroup;
import android.view.ViewParent;
public final class c7 {
    public TextureView f4431a;
    public org.telegram.ui.web.b1 f4432b;
    public hi.a f4433c;
    public boolean d;
    public int e;
    public int f4434f;
    public boolean f4435g;

    public final void a(TextureView textureView) {
        TextureView textureView2 = this.f4431a;
        if (textureView2 != textureView) {
            if (textureView2 != null) {
                ViewParent parent = textureView2.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(this.f4431a);
                }
                this.f4431a = null;
            }
            this.d = false;
            this.f4431a = textureView;
            org.telegram.ui.web.b1 b1Var = this.f4432b;
            if (b1Var != null) {
                b1Var.run(textureView);
            }
        }
    }
}
