package ci;

import android.view.TextureView;
import android.view.ViewGroup;
import android.view.ViewParent;
public final class a7 {
    public TextureView f4699a;
    public ii.q1 f4700b;
    public hi.a f4701c;
    public boolean d;
    public int f4702e;
    public int f4703f;
    public boolean f4704g;

    public final void a(TextureView textureView) {
        TextureView textureView2 = this.f4699a;
        if (textureView2 != textureView) {
            if (textureView2 != null) {
                ViewParent parent = textureView2.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(this.f4699a);
                }
                this.f4699a = null;
            }
            this.d = false;
            this.f4699a = textureView;
            ii.q1 q1Var = this.f4700b;
            if (q1Var != null) {
                q1Var.run(textureView);
            }
        }
    }
}
