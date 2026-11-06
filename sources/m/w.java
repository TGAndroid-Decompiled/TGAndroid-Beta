package m;

import a8.wa;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
public class w extends ImageView {
    public final h2.c f19272a;
    public final wa f19273b;
    public boolean f19274c;

    public w(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        b3.a(context);
        this.f19274c = false;
        a3.a(this, getContext());
        h2.c cVar = new h2.c(this);
        this.f19272a = cVar;
        cVar.x(attributeSet, i7);
        wa waVar = new wa(this);
        this.f19273b = waVar;
        waVar.s(attributeSet, i7);
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        h2.c cVar = this.f19272a;
        if (cVar != null) {
            cVar.b();
        }
        wa waVar = this.f19273b;
        if (waVar != null) {
            waVar.c();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        h2.c cVar = this.f19272a;
        if (cVar != null) {
            return cVar.v();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        h2.c cVar = this.f19272a;
        if (cVar != null) {
            return cVar.w();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        c3 c3Var;
        wa waVar = this.f19273b;
        if (waVar == null || (c3Var = (c3) waVar.d) == null) {
            return null;
        }
        return (ColorStateList) c3Var.f19074c;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        c3 c3Var;
        wa waVar = this.f19273b;
        if (waVar == null || (c3Var = (c3) waVar.d) == null) {
            return null;
        }
        return (PorterDuff.Mode) c3Var.d;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        if (!(((ImageView) this.f19273b.f701c).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering()) {
            return true;
        }
        return false;
    }

    @Override
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        h2.c cVar = this.f19272a;
        if (cVar != null) {
            cVar.y();
        }
    }

    @Override
    public void setBackgroundResource(int i7) {
        super.setBackgroundResource(i7);
        h2.c cVar = this.f19272a;
        if (cVar != null) {
            cVar.z(i7);
        }
    }

    @Override
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        wa waVar = this.f19273b;
        if (waVar != null) {
            waVar.c();
        }
    }

    @Override
    public void setImageDrawable(Drawable drawable) {
        wa waVar = this.f19273b;
        if (waVar != null && drawable != null && !this.f19274c) {
            waVar.f700b = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (waVar != null) {
            waVar.c();
            if (!this.f19274c) {
                ImageView imageView = (ImageView) waVar.f701c;
                if (imageView.getDrawable() != null) {
                    imageView.getDrawable().setLevel(waVar.f700b);
                }
            }
        }
    }

    @Override
    public void setImageLevel(int i7) {
        super.setImageLevel(i7);
        this.f19274c = true;
    }

    @Override
    public void setImageResource(int i7) {
        wa waVar = this.f19273b;
        if (waVar != null) {
            ImageView imageView = (ImageView) waVar.f701c;
            if (i7 != 0) {
                Drawable b10 = b5.a.b(imageView.getContext(), i7);
                if (b10 != null) {
                    m1.a(b10);
                }
                imageView.setImageDrawable(b10);
            } else {
                imageView.setImageDrawable(null);
            }
            waVar.c();
        }
    }

    @Override
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        wa waVar = this.f19273b;
        if (waVar != null) {
            waVar.c();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        h2.c cVar = this.f19272a;
        if (cVar != null) {
            cVar.D(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        h2.c cVar = this.f19272a;
        if (cVar != null) {
            cVar.E(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        wa waVar = this.f19273b;
        if (waVar != null) {
            if (((c3) waVar.d) == null) {
                waVar.d = new Object();
            }
            c3 c3Var = (c3) waVar.d;
            c3Var.f19074c = colorStateList;
            c3Var.f19073b = true;
            waVar.c();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        wa waVar = this.f19273b;
        if (waVar != null) {
            if (((c3) waVar.d) == null) {
                waVar.d = new Object();
            }
            c3 c3Var = (c3) waVar.d;
            c3Var.d = mode;
            c3Var.f19072a = true;
            waVar.c();
        }
    }
}
