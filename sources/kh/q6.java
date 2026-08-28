package kh;

import android.view.TextureView;
import android.view.ViewGroup;
import android.view.ViewParent;
public final class q6 {
    public TextureView f15879a;
    public i9 f15880b;
    public yf.w0 f15881c;
    public boolean d;
    public int f15882e;
    public int f15883f;
    public boolean f15884g;

    public final void a(TextureView textureView) {
        TextureView textureView2 = this.f15879a;
        if (textureView2 != textureView) {
            if (textureView2 != null) {
                ViewParent parent = textureView2.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(this.f15879a);
                }
                this.f15879a = null;
            }
            this.d = false;
            this.f15879a = textureView;
            i9 i9Var = this.f15880b;
            if (i9Var != null) {
                i9Var.run(textureView);
            }
        }
    }
}
