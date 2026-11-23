package hi;

import android.view.TextureView;
import android.view.ViewGroup;
import android.view.ViewParent;
public final class v5 {
    public TextureView f15526a;
    public t6 f15527b;
    public org.telegram.ui.web.b f15528c;
    public boolean d;
    public int f15529e;
    public int f15530f;
    public boolean f15531g;

    public final void a(TextureView textureView) {
        TextureView textureView2 = this.f15526a;
        if (textureView2 != textureView) {
            if (textureView2 != null) {
                ViewParent parent = textureView2.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(this.f15526a);
                }
                this.f15526a = null;
            }
            this.d = false;
            this.f15526a = textureView;
            t6 t6Var = this.f15527b;
            if (t6Var != null) {
                t6Var.a(textureView);
            }
        }
    }
}
