package ci;

import android.view.TextureView;
import android.view.ViewGroup;
import android.view.ViewParent;
public final class a7 {
    public TextureView f4721a;
    public ii.q1 f4722b;
    public hi.a f4723c;
    public boolean d;
    public int f4724e;
    public int f4725f;
    public boolean f4726g;

    public final void a(TextureView textureView) {
        TextureView textureView2 = this.f4721a;
        if (textureView2 != textureView) {
            if (textureView2 != null) {
                ViewParent parent = textureView2.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(this.f4721a);
                }
                this.f4721a = null;
            }
            this.d = false;
            this.f4721a = textureView;
            ii.q1 q1Var = this.f4722b;
            if (q1Var != null) {
                q1Var.run(textureView);
            }
        }
    }
}
