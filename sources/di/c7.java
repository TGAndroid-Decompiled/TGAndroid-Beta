package di;

import android.view.TextureView;
import android.view.ViewGroup;
import android.view.ViewParent;
public final class c7 {
    public TextureView f6989a;
    public org.telegram.ui.web.b1 f6990b;
    public ii.a f6991c;
    public boolean d;
    public int f6992e;
    public int f6993f;
    public boolean f6994g;

    public final void a(TextureView textureView) {
        TextureView textureView2 = this.f6989a;
        if (textureView2 != textureView) {
            if (textureView2 != null) {
                ViewParent parent = textureView2.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(this.f6989a);
                }
                this.f6989a = null;
            }
            this.d = false;
            this.f6989a = textureView;
            org.telegram.ui.web.b1 b1Var = this.f6990b;
            if (b1Var != null) {
                b1Var.run(textureView);
            }
        }
    }
}
