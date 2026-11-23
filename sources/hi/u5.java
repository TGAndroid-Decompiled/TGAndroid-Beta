package hi;

import android.view.TextureView;
import android.view.ViewGroup;
import android.view.ViewParent;
public final class u5 {
    public TextureView f15541a;
    public s6 f15542b;
    public org.telegram.ui.web.b f15543c;
    public boolean d;
    public int f15544e;
    public int f15545f;
    public boolean f15546g;

    public final void a(TextureView textureView) {
        TextureView textureView2 = this.f15541a;
        if (textureView2 != textureView) {
            if (textureView2 != null) {
                ViewParent parent = textureView2.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(this.f15541a);
                }
                this.f15541a = null;
            }
            this.d = false;
            this.f15541a = textureView;
            s6 s6Var = this.f15542b;
            if (s6Var != null) {
                s6Var.a(textureView);
            }
        }
    }
}
