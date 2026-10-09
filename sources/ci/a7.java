package ci;

import android.view.TextureView;
import android.view.ViewGroup;
import android.view.ViewParent;
public final class a7 {
    public TextureView f4722a;
    public ii.q1 f4723b;
    public hi.a f4724c;
    public boolean d;
    public int f4725e;
    public int f4726f;
    public boolean f4727g;

    public final void a(TextureView textureView) {
        TextureView textureView2 = this.f4722a;
        if (textureView2 != textureView) {
            if (textureView2 != null) {
                ViewParent parent = textureView2.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(this.f4722a);
                }
                this.f4722a = null;
            }
            this.d = false;
            this.f4722a = textureView;
            ii.q1 q1Var = this.f4723b;
            if (q1Var != null) {
                q1Var.run(textureView);
            }
        }
    }
}
