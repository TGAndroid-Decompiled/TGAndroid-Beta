package hi;

import android.view.TextureView;
import android.view.ViewGroup;
import android.view.ViewParent;
public final class v5 {
    public TextureView f15574a;
    public t6 f15575b;
    public org.telegram.ui.web.b f15576c;
    public boolean d;
    public int f15577e;
    public int f15578f;
    public boolean f15579g;

    public final void a(TextureView textureView) {
        TextureView textureView2 = this.f15574a;
        if (textureView2 != textureView) {
            if (textureView2 != null) {
                ViewParent parent = textureView2.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(this.f15574a);
                }
                this.f15574a = null;
            }
            this.d = false;
            this.f15574a = textureView;
            t6 t6Var = this.f15575b;
            if (t6Var != null) {
                t6Var.a(textureView);
            }
        }
    }
}
