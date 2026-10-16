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
import v7.q7;
public class x extends ImageView {
    public final e2.c f15009a;
    public final a5.a f15010b;
    public boolean f15011c;

    public x(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        e3.a(context);
        this.f15011c = false;
        d3.a(this, getContext());
        e2.c cVar = new e2.c(this);
        this.f15009a = cVar;
        cVar.f(attributeSet, i10);
        a5.a aVar = new a5.a(this);
        this.f15010b = aVar;
        aVar.u(attributeSet, i10);
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        e2.c cVar = this.f15009a;
        if (cVar != null) {
            cVar.b();
        }
        a5.a aVar = this.f15010b;
        if (aVar != null) {
            aVar.d();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        e2.c cVar = this.f15009a;
        if (cVar != null) {
            return cVar.d();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e2.c cVar = this.f15009a;
        if (cVar != null) {
            return cVar.e();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        f3 f3Var;
        a5.a aVar = this.f15010b;
        if (aVar == null || (f3Var = (f3) aVar.d) == null) {
            return null;
        }
        return (ColorStateList) f3Var.f14845c;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        f3 f3Var;
        a5.a aVar = this.f15010b;
        if (aVar == null || (f3Var = (f3) aVar.d) == null) {
            return null;
        }
        return (PorterDuff.Mode) f3Var.d;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        if (!(((ImageView) this.f15010b.f282c).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering()) {
            return true;
        }
        return false;
    }

    @Override
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e2.c cVar = this.f15009a;
        if (cVar != null) {
            cVar.g();
        }
    }

    @Override
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        e2.c cVar = this.f15009a;
        if (cVar != null) {
            cVar.h(i10);
        }
    }

    @Override
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        a5.a aVar = this.f15010b;
        if (aVar != null) {
            aVar.d();
        }
    }

    @Override
    public void setImageDrawable(Drawable drawable) {
        a5.a aVar = this.f15010b;
        if (aVar != null && drawable != null && !this.f15011c) {
            aVar.f281b = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (aVar != null) {
            aVar.d();
            if (!this.f15011c) {
                ImageView imageView = (ImageView) aVar.f282c;
                if (imageView.getDrawable() != null) {
                    imageView.getDrawable().setLevel(aVar.f281b);
                }
            }
        }
    }

    @Override
    public void setImageLevel(int i10) {
        super.setImageLevel(i10);
        this.f15011c = true;
    }

    @Override
    public void setImageResource(int i10) {
        a5.a aVar = this.f15010b;
        if (aVar != null) {
            ImageView imageView = (ImageView) aVar.f282c;
            if (i10 != 0) {
                Drawable b10 = q7.b(imageView.getContext(), i10);
                if (b10 != null) {
                    n1.a(b10);
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
        a5.a aVar = this.f15010b;
        if (aVar != null) {
            aVar.d();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e2.c cVar = this.f15009a;
        if (cVar != null) {
            cVar.l(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e2.c cVar = this.f15009a;
        if (cVar != null) {
            cVar.m(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        a5.a aVar = this.f15010b;
        if (aVar != null) {
            if (((f3) aVar.d) == null) {
                aVar.d = new Object();
            }
            f3 f3Var = (f3) aVar.d;
            f3Var.f14845c = colorStateList;
            f3Var.f14844b = true;
            aVar.d();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        a5.a aVar = this.f15010b;
        if (aVar != null) {
            if (((f3) aVar.d) == null) {
                aVar.d = new Object();
            }
            f3 f3Var = (f3) aVar.d;
            f3Var.d = mode;
            f3Var.f14843a = true;
            aVar.d();
        }
    }
}
