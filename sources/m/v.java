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
import v7.s7;
public class v extends ImageView {
    public final e2.c f15587a;
    public final a5.a f15588b;
    public boolean f15589c;

    public v(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        c3.a(context);
        this.f15589c = false;
        b3.a(this, getContext());
        e2.c cVar = new e2.c(this);
        this.f15587a = cVar;
        cVar.f(attributeSet, i10);
        a5.a aVar = new a5.a(this);
        this.f15588b = aVar;
        aVar.t(attributeSet, i10);
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        e2.c cVar = this.f15587a;
        if (cVar != null) {
            cVar.b();
        }
        a5.a aVar = this.f15588b;
        if (aVar != null) {
            aVar.d();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        e2.c cVar = this.f15587a;
        if (cVar != null) {
            return cVar.d();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e2.c cVar = this.f15587a;
        if (cVar != null) {
            return cVar.e();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        d3 d3Var;
        a5.a aVar = this.f15588b;
        if (aVar == null || (d3Var = (d3) aVar.d) == null) {
            return null;
        }
        return (ColorStateList) d3Var.f15406c;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        d3 d3Var;
        a5.a aVar = this.f15588b;
        if (aVar == null || (d3Var = (d3) aVar.d) == null) {
            return null;
        }
        return (PorterDuff.Mode) d3Var.d;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        if (!(((ImageView) this.f15588b.f300c).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering()) {
            return true;
        }
        return false;
    }

    @Override
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e2.c cVar = this.f15587a;
        if (cVar != null) {
            cVar.g();
        }
    }

    @Override
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        e2.c cVar = this.f15587a;
        if (cVar != null) {
            cVar.h(i10);
        }
    }

    @Override
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        a5.a aVar = this.f15588b;
        if (aVar != null) {
            aVar.d();
        }
    }

    @Override
    public void setImageDrawable(Drawable drawable) {
        a5.a aVar = this.f15588b;
        if (aVar != null && drawable != null && !this.f15589c) {
            aVar.f299b = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (aVar != null) {
            aVar.d();
            if (!this.f15589c) {
                ImageView imageView = (ImageView) aVar.f300c;
                if (imageView.getDrawable() != null) {
                    imageView.getDrawable().setLevel(aVar.f299b);
                }
            }
        }
    }

    @Override
    public void setImageLevel(int i10) {
        super.setImageLevel(i10);
        this.f15589c = true;
    }

    @Override
    public void setImageResource(int i10) {
        a5.a aVar = this.f15588b;
        if (aVar != null) {
            ImageView imageView = (ImageView) aVar.f300c;
            if (i10 != 0) {
                Drawable b10 = s7.b(imageView.getContext(), i10);
                if (b10 != null) {
                    m1.a(b10);
                }
                imageView.setImageDrawable(b10);
            } else {
                imageView.setImageDrawable(null);
            }
            aVar.d();
        }
    }

    @Override
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        a5.a aVar = this.f15588b;
        if (aVar != null) {
            aVar.d();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e2.c cVar = this.f15587a;
        if (cVar != null) {
            cVar.l(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e2.c cVar = this.f15587a;
        if (cVar != null) {
            cVar.m(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        a5.a aVar = this.f15588b;
        if (aVar != null) {
            if (((d3) aVar.d) == null) {
                aVar.d = new Object();
            }
            d3 d3Var = (d3) aVar.d;
            d3Var.f15406c = colorStateList;
            d3Var.f15405b = true;
            aVar.d();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        a5.a aVar = this.f15588b;
        if (aVar != null) {
            if (((d3) aVar.d) == null) {
                aVar.d = new Object();
            }
            d3 d3Var = (d3) aVar.d;
            d3Var.d = mode;
            d3Var.f15404a = true;
            aVar.d();
        }
    }
}
