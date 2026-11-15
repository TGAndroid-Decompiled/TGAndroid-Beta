package hi;

import android.view.TextureView;
import android.view.ViewGroup;
import android.view.ViewParent;
public final class w5 {
    public TextureView f15290a;
    public g7 f15291b;
    public org.telegram.ui.web.b f15292c;
    public boolean d;
    public int f15293e;
    public int f15294f;
    public boolean f15295g;

    public final void a(TextureView textureView) {
        TextureView textureView2 = this.f15290a;
        if (textureView2 != textureView) {
            if (textureView2 != null) {
                ViewParent parent = textureView2.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(this.f15290a);
                }
                this.f15290a = null;
            }
            this.d = false;
            this.f15290a = textureView;
            g7 g7Var = this.f15291b;
            if (g7Var != null) {
                g7Var.a(textureView);
            }
        }
    }
}
