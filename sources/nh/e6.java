package nh;

import android.view.TextureView;
import android.view.ViewGroup;
import android.view.ViewParent;
public final class e6 {
    public TextureView f17593a;
    public ag.i0 f17594b;
    public bg.t1 f17595c;
    public boolean d;
    public int f17596e;
    public int f17597f;
    public boolean f17598g;

    public final void a(TextureView textureView) {
        TextureView textureView2 = this.f17593a;
        if (textureView2 != textureView) {
            if (textureView2 != null) {
                ViewParent parent = textureView2.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(this.f17593a);
                }
                this.f17593a = null;
            }
            this.d = false;
            this.f17593a = textureView;
            ag.i0 i0Var = this.f17594b;
            if (i0Var != null) {
                i0Var.run(textureView);
            }
        }
    }
}
