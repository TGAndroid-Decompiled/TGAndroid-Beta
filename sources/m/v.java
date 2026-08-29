package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import android.widget.ImageView;
import h7.s7;
public class v extends ImageButton {
    public final n f16707a;
    public final f5.u f16708b;
    public boolean f16709c;

    public v(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        e3.a(context);
        this.f16709c = false;
        d3.a(this, getContext());
        n nVar = new n(this);
        this.f16707a = nVar;
        nVar.d(attributeSet, i10);
        f5.u uVar = new f5.u(this);
        this.f16708b = uVar;
        uVar.h(attributeSet, i10);
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        n nVar = this.f16707a;
        if (nVar != null) {
            nVar.a();
        }
        f5.u uVar = this.f16708b;
        if (uVar != null) {
            uVar.d();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        n nVar = this.f16707a;
        if (nVar != null) {
            return nVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        n nVar = this.f16707a;
        if (nVar != null) {
            return nVar.c();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        f3 f3Var;
        f5.u uVar = this.f16708b;
        if (uVar == null || (f3Var = (f3) uVar.f6633c) == null) {
            return null;
        }
        return (ColorStateList) f3Var.f16545c;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        f3 f3Var;
        f5.u uVar = this.f16708b;
        if (uVar == null || (f3Var = (f3) uVar.f6633c) == null) {
            return null;
        }
        return (PorterDuff.Mode) f3Var.d;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        if (!(((ImageView) this.f16708b.f6632b).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering()) {
            return true;
        }
        return false;
    }

    @Override
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        n nVar = this.f16707a;
        if (nVar != null) {
            nVar.e();
        }
    }

    @Override
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        n nVar = this.f16707a;
        if (nVar != null) {
            nVar.f(i10);
        }
    }

    @Override
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        f5.u uVar = this.f16708b;
        if (uVar != null) {
            uVar.d();
        }
    }

    @Override
    public void setImageDrawable(Drawable drawable) {
        f5.u uVar = this.f16708b;
        if (uVar != null && drawable != null && !this.f16709c) {
            uVar.f6631a = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (uVar != null) {
            uVar.d();
            if (!this.f16709c) {
                ImageView imageView = (ImageView) uVar.f6632b;
                if (imageView.getDrawable() != null) {
                    imageView.getDrawable().setLevel(uVar.f6631a);
                }
            }
        }
    }

    @Override
    public void setImageLevel(int i10) {
        super.setImageLevel(i10);
        this.f16709c = true;
    }

    @Override
    public void setImageResource(int i10) {
        f5.u uVar = this.f16708b;
        ImageView imageView = (ImageView) uVar.f6632b;
        if (i10 != 0) {
            Drawable b10 = s7.b(imageView.getContext(), i10);
            if (b10 != null) {
                m1.a(b10);
            }
            imageView.setImageDrawable(b10);
        } else {
            imageView.setImageDrawable(null);
        }
        uVar.d();
    }

    @Override
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        f5.u uVar = this.f16708b;
        if (uVar != null) {
            uVar.d();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        n nVar = this.f16707a;
        if (nVar != null) {
            nVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        n nVar = this.f16707a;
        if (nVar != null) {
            nVar.i(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        f5.u uVar = this.f16708b;
        if (uVar != null) {
            if (((f3) uVar.f6633c) == null) {
                uVar.f6633c = new Object();
            }
            f3 f3Var = (f3) uVar.f6633c;
            f3Var.f16545c = colorStateList;
            f3Var.f16544b = true;
            uVar.d();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        f5.u uVar = this.f16708b;
        if (uVar != null) {
            if (((f3) uVar.f6633c) == null) {
                uVar.f6633c = new Object();
            }
            f3 f3Var = (f3) uVar.f6633c;
            f3Var.d = mode;
            f3Var.f16543a = true;
            uVar.d();
        }
    }
}
