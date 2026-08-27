package lh;

import android.view.TextureView;
import android.view.ViewGroup;
import android.view.ViewParent;

public final class p6 {

    public TextureView f16526a;

    public n6 f16527b;

    public zf.w0 f16528c;
    public boolean d;

    public int f16529e;

    public int f16530f;

    public boolean f16531g;

    public final void a(TextureView textureView) {
        TextureView textureView2 = this.f16526a;
        if (textureView2 == textureView) {
            return;
        }
        if (textureView2 != null) {
            ViewParent parent = textureView2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f16526a);
            }
            this.f16526a = null;
        }
        this.d = false;
        this.f16526a = textureView;
        n6 n6Var = this.f16527b;
        if (n6Var != null) {
            n6Var.run(textureView);
        }
    }
}
