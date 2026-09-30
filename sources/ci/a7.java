package ci;

import android.view.TextureView;
import android.view.ViewGroup;
import android.view.ViewParent;
public final class a7 {
    public TextureView f4352a;
    public ii.q1 f4353b;
    public hi.a f4354c;
    public boolean d;
    public int e;
    public int f4355f;
    public boolean f4356g;

    public final void a(TextureView textureView) {
        TextureView textureView2 = this.f4352a;
        if (textureView2 != textureView) {
            if (textureView2 != null) {
                ViewParent parent = textureView2.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(this.f4352a);
                }
                this.f4352a = null;
            }
            this.d = false;
            this.f4352a = textureView;
            ii.q1 q1Var = this.f4353b;
            if (q1Var != null) {
                q1Var.run(textureView);
            }
        }
    }
}
