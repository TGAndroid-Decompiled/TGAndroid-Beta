package hi;

import android.view.TextureView;
import android.view.ViewGroup;
import android.view.ViewParent;
public final class v5 {
    public TextureView f15571a;
    public t6 f15572b;
    public org.telegram.ui.web.b f15573c;
    public boolean d;
    public int f15574e;
    public int f15575f;
    public boolean f15576g;

    public final void a(TextureView textureView) {
        TextureView textureView2 = this.f15571a;
        if (textureView2 != textureView) {
            if (textureView2 != null) {
                ViewParent parent = textureView2.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(this.f15571a);
                }
                this.f15571a = null;
            }
            this.d = false;
            this.f15571a = textureView;
            t6 t6Var = this.f15572b;
            if (t6Var != null) {
                t6Var.a(textureView);
            }
        }
    }
}
