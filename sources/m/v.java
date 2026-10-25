package m;

import a8.kc;
import a8.ng;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
public class v extends ImageView {
    public final e2.c f17870a;
    public final ng f17871b;
    public boolean f17872c;

    public v(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        c3.a(context);
        this.f17872c = false;
        b3.a(this, getContext());
        e2.c cVar = new e2.c(this);
        this.f17870a = cVar;
        cVar.f(attributeSet, i10);
        ng ngVar = new ng(this);
        this.f17871b = ngVar;
        ngVar.t(attributeSet, i10);
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        e2.c cVar = this.f17870a;
        if (cVar != null) {
            cVar.b();
        }
        ng ngVar = this.f17871b;
        if (ngVar != null) {
            ngVar.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        e2.c cVar = this.f17870a;
        if (cVar != null) {
            return cVar.d();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e2.c cVar = this.f17870a;
        if (cVar != null) {
            return cVar.e();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        d3 d3Var;
        ng ngVar = this.f17871b;
        if (ngVar == null || (d3Var = (d3) ngVar.d) == null) {
            return null;
        }
        return (ColorStateList) d3Var.f17707c;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        d3 d3Var;
        ng ngVar = this.f17871b;
        if (ngVar == null || (d3Var = (d3) ngVar.d) == null) {
            return null;
        }
        return (PorterDuff.Mode) d3Var.d;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        if (!(((ImageView) this.f17871b.f640c).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering()) {
            return true;
        }
        return false;
    }

    @Override
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e2.c cVar = this.f17870a;
        if (cVar != null) {
            cVar.g();
        }
    }

    @Override
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        e2.c cVar = this.f17870a;
        if (cVar != null) {
            cVar.h(i10);
        }
    }

    @Override
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        ng ngVar = this.f17871b;
        if (ngVar != null) {
            ngVar.b();
        }
    }

    @Override
    public void setImageDrawable(Drawable drawable) {
        ng ngVar = this.f17871b;
        if (ngVar != null && drawable != null && !this.f17872c) {
            ngVar.f639b = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (ngVar != null) {
            ngVar.b();
            if (!this.f17872c) {
                ImageView imageView = (ImageView) ngVar.f640c;
                if (imageView.getDrawable() != null) {
                    imageView.getDrawable().setLevel(ngVar.f639b);
                }
            }
        }
    }

    @Override
    public void setImageLevel(int i10) {
        super.setImageLevel(i10);
        this.f17872c = true;
    }

    @Override
    public void setImageResource(int i10) {
        ng ngVar = this.f17871b;
        if (ngVar != null) {
            ImageView imageView = (ImageView) ngVar.f640c;
            if (i10 != 0) {
                Drawable b10 = kc.b(imageView.getContext(), i10);
                if (b10 != null) {
                    l1.a(b10);
                }
                imageView.setImageDrawable(b10);
            } else {
                imageView.setImageDrawable(null);
            }
            ngVar.b();
        }
    }

    @Override
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        ng ngVar = this.f17871b;
        if (ngVar != null) {
            ngVar.b();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e2.c cVar = this.f17870a;
        if (cVar != null) {
            cVar.l(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e2.c cVar = this.f17870a;
        if (cVar != null) {
            cVar.m(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        ng ngVar = this.f17871b;
        if (ngVar != null) {
            if (((d3) ngVar.d) == null) {
                ngVar.d = new Object();
            }
            d3 d3Var = (d3) ngVar.d;
            d3Var.f17707c = colorStateList;
            d3Var.f17706b = true;
            ngVar.b();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        ng ngVar = this.f17871b;
        if (ngVar != null) {
            if (((d3) ngVar.d) == null) {
                ngVar.d = new Object();
            }
            d3 d3Var = (d3) ngVar.d;
            d3Var.d = mode;
            d3Var.f17705a = true;
            ngVar.b();
        }
    }
}
