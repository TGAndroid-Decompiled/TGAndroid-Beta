package ci;

import android.view.TextureView;
import android.view.ViewGroup;
import android.view.ViewParent;
public final class c7 {
    public TextureView f4427a;
    public org.telegram.ui.web.b1 f4428b;
    public hi.a f4429c;
    public boolean d;
    public int e;
    public int f4430f;
    public boolean f4431g;

    public final void a(TextureView textureView) {
        TextureView textureView2 = this.f4427a;
        if (textureView2 != textureView) {
            if (textureView2 != null) {
                ViewParent parent = textureView2.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(this.f4427a);
                }
                this.f4427a = null;
            }
            this.d = false;
            this.f4427a = textureView;
            org.telegram.ui.web.b1 b1Var = this.f4428b;
            if (b1Var != null) {
                b1Var.run(textureView);
            }
        }
    }
}
