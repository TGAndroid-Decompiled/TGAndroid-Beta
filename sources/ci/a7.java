package ci;

import android.view.TextureView;
import android.view.ViewGroup;
import android.view.ViewParent;
public final class a7 {
    public TextureView f4698a;
    public ii.q1 f4699b;
    public hi.a f4700c;
    public boolean d;
    public int f4701e;
    public int f4702f;
    public boolean f4703g;

    public final void a(TextureView textureView) {
        TextureView textureView2 = this.f4698a;
        if (textureView2 != textureView) {
            if (textureView2 != null) {
                ViewParent parent = textureView2.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(this.f4698a);
                }
                this.f4698a = null;
            }
            this.d = false;
            this.f4698a = textureView;
            ii.q1 q1Var = this.f4699b;
            if (q1Var != null) {
                q1Var.run(textureView);
            }
        }
    }
}
