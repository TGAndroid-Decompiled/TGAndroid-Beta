package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import f7.t7;
public class w extends ImageView {
    public final n f17120a;
    public final d5.w f17121b;
    public boolean f17122c;

    public w(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
        e3.a(context);
        this.f17122c = false;
        d3.a(this, getContext());
        n nVar = new n(this);
        this.f17120a = nVar;
        nVar.d(attributeSet, i9);
        d5.w wVar = new d5.w(this);
        this.f17121b = wVar;
        wVar.h(attributeSet, i9);
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        n nVar = this.f17120a;
        if (nVar != null) {
            nVar.a();
        }
        d5.w wVar = this.f17121b;
        if (wVar != null) {
            wVar.d();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        n nVar = this.f17120a;
        if (nVar != null) {
            return nVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        n nVar = this.f17120a;
        if (nVar != null) {
            return nVar.c();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        f3 f3Var;
        d5.w wVar = this.f17121b;
        if (wVar == null || (f3Var = (f3) wVar.f4403c) == null) {
            return null;
        }
        return (ColorStateList) f3Var.f16946c;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        f3 f3Var;
        d5.w wVar = this.f17121b;
        if (wVar == null || (f3Var = (f3) wVar.f4403c) == null) {
            return null;
        }
        return (PorterDuff.Mode) f3Var.d;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        if (!(((ImageView) this.f17121b.f4402b).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering()) {
            return true;
        }
        return false;
    }

    @Override
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        n nVar = this.f17120a;
        if (nVar != null) {
            nVar.e();
        }
    }

    @Override
    public void setBackgroundResource(int i9) {
        super.setBackgroundResource(i9);
        n nVar = this.f17120a;
        if (nVar != null) {
            nVar.f(i9);
        }
    }

    @Override
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        d5.w wVar = this.f17121b;
        if (wVar != null) {
            wVar.d();
        }
    }

    @Override
    public void setImageDrawable(Drawable drawable) {
        d5.w wVar = this.f17121b;
        if (wVar != null && drawable != null && !this.f17122c) {
            wVar.f4401a = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (wVar != null) {
            wVar.d();
            if (!this.f17122c) {
                ImageView imageView = (ImageView) wVar.f4402b;
                if (imageView.getDrawable() != null) {
                    imageView.getDrawable().setLevel(wVar.f4401a);
                }
            }
        }
    }

    @Override
    public void setImageLevel(int i9) {
        super.setImageLevel(i9);
        this.f17122c = true;
    }

    @Override
    public void setImageResource(int i9) {
        d5.w wVar = this.f17121b;
        if (wVar != null) {
            ImageView imageView = (ImageView) wVar.f4402b;
            if (i9 != 0) {
                Drawable b10 = t7.b(imageView.getContext(), i9);
                if (b10 != null) {
                    m1.a(b10);
                }
                imageView.setImageDrawable(b10);
            } else {
                imageView.setImageDrawable(null);
            }
            wVar.d();
        }
    }

    @Override
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        d5.w wVar = this.f17121b;
        if (wVar != null) {
            wVar.d();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        n nVar = this.f17120a;
        if (nVar != null) {
            nVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        n nVar = this.f17120a;
        if (nVar != null) {
            nVar.i(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        d5.w wVar = this.f17121b;
        if (wVar != null) {
            if (((f3) wVar.f4403c) == null) {
                wVar.f4403c = new Object();
            }
            f3 f3Var = (f3) wVar.f4403c;
            f3Var.f16946c = colorStateList;
            f3Var.f16945b = true;
            wVar.d();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        d5.w wVar = this.f17121b;
        if (wVar != null) {
            if (((f3) wVar.f4403c) == null) {
                wVar.f4403c = new Object();
            }
            f3 f3Var = (f3) wVar.f4403c;
            f3Var.d = mode;
            f3Var.f16944a = true;
            wVar.d();
        }
    }
}
