package ci;

import android.view.TextureView;
import android.view.ViewGroup;
import android.view.ViewParent;
public final class c7 {
    public TextureView f4425a;
    public org.telegram.ui.web.b1 f4426b;
    public hi.a f4427c;
    public boolean d;
    public int e;
    public int f4428f;
    public boolean f4429g;

    public final void a(TextureView textureView) {
        TextureView textureView2 = this.f4425a;
        if (textureView2 != textureView) {
            if (textureView2 != null) {
                ViewParent parent = textureView2.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(this.f4425a);
                }
                this.f4425a = null;
            }
            this.d = false;
            this.f4425a = textureView;
            org.telegram.ui.web.b1 b1Var = this.f4426b;
            if (b1Var != null) {
                b1Var.run(textureView);
            }
        }
    }
}
