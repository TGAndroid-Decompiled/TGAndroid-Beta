package hi;

import android.view.TextureView;
import android.view.ViewGroup;
import android.view.ViewParent;
public final class e6 {
    public TextureView f14369a;
    public c7 f14370b;
    public org.telegram.ui.web.b f14371c;
    public boolean d;
    public int f14372e;
    public int f14373f;
    public boolean f14374g;

    public final void a(TextureView textureView) {
        TextureView textureView2 = this.f14369a;
        if (textureView2 != textureView) {
            if (textureView2 != null) {
                ViewParent parent = textureView2.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(this.f14369a);
                }
                this.f14369a = null;
            }
            this.d = false;
            this.f14369a = textureView;
            c7 c7Var = this.f14370b;
            if (c7Var != null) {
                c7Var.a(textureView);
            }
        }
    }
}
