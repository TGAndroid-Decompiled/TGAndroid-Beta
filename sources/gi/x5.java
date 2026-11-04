package gi;

import android.view.TextureView;
import android.view.ViewGroup;
import android.view.ViewParent;
public final class x5 {
    public TextureView f13838a;
    public j8 f13839b;
    public org.telegram.ui.web.b f13840c;
    public boolean d;
    public int f13841e;
    public int f13842f;
    public boolean f13843g;

    public final void a(TextureView textureView) {
        TextureView textureView2 = this.f13838a;
        if (textureView2 != textureView) {
            if (textureView2 != null) {
                ViewParent parent = textureView2.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(this.f13838a);
                }
                this.f13838a = null;
            }
            this.d = false;
            this.f13838a = textureView;
            j8 j8Var = this.f13839b;
            if (j8Var != null) {
                j8Var.a(textureView);
            }
        }
    }
}
