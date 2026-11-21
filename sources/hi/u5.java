package hi;

import android.view.TextureView;
import android.view.ViewGroup;
import android.view.ViewParent;
public final class u5 {
    public TextureView f15538a;
    public s6 f15539b;
    public org.telegram.ui.web.b f15540c;
    public boolean d;
    public int f15541e;
    public int f15542f;
    public boolean f15543g;

    public final void a(TextureView textureView) {
        TextureView textureView2 = this.f15538a;
        if (textureView2 != textureView) {
            if (textureView2 != null) {
                ViewParent parent = textureView2.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(this.f15538a);
                }
                this.f15538a = null;
            }
            this.d = false;
            this.f15538a = textureView;
            s6 s6Var = this.f15539b;
            if (s6Var != null) {
                s6Var.a(textureView);
            }
        }
    }
}
