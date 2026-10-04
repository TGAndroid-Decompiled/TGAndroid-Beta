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
import v7.v7;
public class v extends ImageView {
    public final e2.c f15897a;
    public final j6.l f15898b;
    public boolean f15899c;

    public v(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        b3.a(context);
        this.f15899c = false;
        a3.a(this, getContext());
        e2.c cVar = new e2.c(this);
        this.f15897a = cVar;
        cVar.f(attributeSet, i10);
        j6.l lVar = new j6.l(this);
        this.f15898b = lVar;
        lVar.f(attributeSet, i10);
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        e2.c cVar = this.f15897a;
        if (cVar != null) {
            cVar.b();
        }
        j6.l lVar = this.f15898b;
        if (lVar != null) {
            lVar.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        e2.c cVar = this.f15897a;
        if (cVar != null) {
            return cVar.d();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e2.c cVar = this.f15897a;
        if (cVar != null) {
            return cVar.e();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        c3 c3Var;
        j6.l lVar = this.f15898b;
        if (lVar == null || (c3Var = (c3) lVar.f14025c) == null) {
            return null;
        }
        return (ColorStateList) c3Var.f15705c;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        c3 c3Var;
        j6.l lVar = this.f15898b;
        if (lVar == null || (c3Var = (c3) lVar.f14025c) == null) {
            return null;
        }
        return (PorterDuff.Mode) c3Var.d;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        if (!(((ImageView) this.f15898b.f14024b).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering()) {
            return true;
        }
        return false;
    }

    @Override
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e2.c cVar = this.f15897a;
        if (cVar != null) {
            cVar.g();
        }
    }

    @Override
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        e2.c cVar = this.f15897a;
        if (cVar != null) {
            cVar.h(i10);
        }
    }

    @Override
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        j6.l lVar = this.f15898b;
        if (lVar != null) {
            lVar.b();
        }
    }

    @Override
    public void setImageDrawable(Drawable drawable) {
        j6.l lVar = this.f15898b;
        if (lVar != null && drawable != null && !this.f15899c) {
            lVar.f14023a = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (lVar != null) {
            lVar.b();
            if (!this.f15899c) {
                ImageView imageView = (ImageView) lVar.f14024b;
                if (imageView.getDrawable() != null) {
                    imageView.getDrawable().setLevel(lVar.f14023a);
                }
            }
        }
    }

    @Override
    public void setImageLevel(int i10) {
        super.setImageLevel(i10);
        this.f15899c = true;
    }

    @Override
    public void setImageResource(int i10) {
        j6.l lVar = this.f15898b;
        if (lVar != null) {
            ImageView imageView = (ImageView) lVar.f14024b;
            if (i10 != 0) {
                Drawable b10 = v7.b(imageView.getContext(), i10);
                if (b10 != null) {
                    l1.a(b10);
                }
                imageView.setImageDrawable(b10);
            } else {
                imageView.setImageDrawable(null);
            }
            lVar.b();
        }
    }

    @Override
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        j6.l lVar = this.f15898b;
        if (lVar != null) {
            lVar.b();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e2.c cVar = this.f15897a;
        if (cVar != null) {
            cVar.l(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e2.c cVar = this.f15897a;
        if (cVar != null) {
            cVar.m(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        j6.l lVar = this.f15898b;
        if (lVar != null) {
            if (((c3) lVar.f14025c) == null) {
                lVar.f14025c = new Object();
            }
            c3 c3Var = (c3) lVar.f14025c;
            c3Var.f15705c = colorStateList;
            c3Var.f15704b = true;
            lVar.b();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        j6.l lVar = this.f15898b;
        if (lVar != null) {
            if (((c3) lVar.f14025c) == null) {
                lVar.f14025c = new Object();
            }
            c3 c3Var = (c3) lVar.f14025c;
            c3Var.d = mode;
            c3Var.f15703a = true;
            lVar.b();
        }
    }
}
