package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
public class mp extends ImageView {
    public final lo a;
    public final lp b;
    public boolean c;

    public mp(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        xsb.a(context);
        this.c = false;
        brb.a(getContext(), this);
        lo loVar = new lo(this);
        this.a = loVar;
        loVar.g(attributeSet, i);
        lp lpVar = new lp(this);
        this.b = lpVar;
        lpVar.t(attributeSet, i);
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        lo loVar = this.a;
        if (loVar != null) {
            loVar.b();
        }
        lp lpVar = this.b;
        if (lpVar != null) {
            lpVar.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        lo loVar = this.a;
        if (loVar != null) {
            return loVar.e();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        lo loVar = this.a;
        if (loVar != null) {
            return loVar.f();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        c34 c34Var;
        lp lpVar = this.b;
        if (lpVar == null || (c34Var = (c34) lpVar.d) == null) {
            return null;
        }
        return (ColorStateList) c34Var.c;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        c34 c34Var;
        lp lpVar = this.b;
        if (lpVar == null || (c34Var = (c34) lpVar.d) == null) {
            return null;
        }
        return (PorterDuff.Mode) c34Var.d;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        if (!(((ImageView) this.b.c).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering()) {
            return true;
        }
        return false;
    }

    @Override
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        lo loVar = this.a;
        if (loVar != null) {
            loVar.h();
        }
    }

    @Override
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        lo loVar = this.a;
        if (loVar != null) {
            loVar.i(i);
        }
    }

    @Override
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        lp lpVar = this.b;
        if (lpVar != null) {
            lpVar.b();
        }
    }

    @Override
    public void setImageDrawable(Drawable drawable) {
        lp lpVar = this.b;
        if (lpVar != null && drawable != null && !this.c) {
            lpVar.b = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (lpVar != null) {
            lpVar.b();
            if (!this.c) {
                ImageView imageView = (ImageView) lpVar.c;
                if (imageView.getDrawable() != null) {
                    imageView.getDrawable().setLevel(lpVar.b);
                }
            }
        }
    }

    @Override
    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.c = true;
    }

    @Override
    public void setImageResource(int i) {
        lp lpVar = this.b;
        if (lpVar != null) {
            ImageView imageView = (ImageView) lpVar.c;
            if (i != 0) {
                Drawable a = yqd.a(imageView.getContext(), i);
                if (a != null) {
                    cr3.a(a);
                }
                imageView.setImageDrawable(a);
            } else {
                imageView.setImageDrawable(null);
            }
            lpVar.b();
        }
    }

    @Override
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        lp lpVar = this.b;
        if (lpVar != null) {
            lpVar.b();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        lo loVar = this.a;
        if (loVar != null) {
            loVar.m(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        lo loVar = this.a;
        if (loVar != null) {
            loVar.n(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        lp lpVar = this.b;
        if (lpVar != null) {
            c34 c34Var = (c34) lpVar.d;
            c34 c34Var2 = c34Var;
            if (c34Var == null) {
                Object obj = new Object();
                lpVar.d = obj;
                c34Var2 = obj;
            }
            c34Var2.c = colorStateList;
            c34Var2.b = true;
            lpVar.b();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        lp lpVar = this.b;
        if (lpVar != null) {
            c34 c34Var = (c34) lpVar.d;
            c34 c34Var2 = c34Var;
            if (c34Var == null) {
                Object obj = new Object();
                lpVar.d = obj;
                c34Var2 = obj;
            }
            c34Var2.d = mode;
            c34Var2.a = true;
            lpVar.b();
        }
    }
}
