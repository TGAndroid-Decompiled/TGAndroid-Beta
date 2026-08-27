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
import g7.o7;

public class w extends ImageView {

    public final n f17495a;

    public final d5.x f17496b;

    public boolean f17497c;

    public w(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        e3.a(context);
        this.f17497c = false;
        d3.a(this, getContext());
        n nVar = new n(this);
        this.f17495a = nVar;
        nVar.d(attributeSet, i10);
        d5.x xVar = new d5.x(this);
        this.f17496b = xVar;
        xVar.h(attributeSet, i10);
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        n nVar = this.f17495a;
        if (nVar != null) {
            nVar.a();
        }
        d5.x xVar = this.f17496b;
        if (xVar != null) {
            xVar.d();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        n nVar = this.f17495a;
        if (nVar != null) {
            return nVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        n nVar = this.f17495a;
        if (nVar != null) {
            return nVar.c();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        f3 f3Var;
        d5.x xVar = this.f17496b;
        if (xVar == null || (f3Var = (f3) xVar.f4851c) == null) {
            return null;
        }
        return (ColorStateList) f3Var.f17321c;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        f3 f3Var;
        d5.x xVar = this.f17496b;
        if (xVar == null || (f3Var = (f3) xVar.f4851c) == null) {
            return null;
        }
        return (PorterDuff.Mode) f3Var.d;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return !(((ImageView) this.f17496b.f4850b).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        n nVar = this.f17495a;
        if (nVar != null) {
            nVar.e();
        }
    }

    @Override
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        n nVar = this.f17495a;
        if (nVar != null) {
            nVar.f(i10);
        }
    }

    @Override
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        d5.x xVar = this.f17496b;
        if (xVar != null) {
            xVar.d();
        }
    }

    @Override
    public void setImageDrawable(Drawable drawable) {
        d5.x xVar = this.f17496b;
        if (xVar != null && drawable != null && !this.f17497c) {
            xVar.f4849a = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (xVar != null) {
            xVar.d();
            if (this.f17497c) {
                return;
            }
            ImageView imageView = (ImageView) xVar.f4850b;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(xVar.f4849a);
            }
        }
    }

    @Override
    public void setImageLevel(int i10) {
        super.setImageLevel(i10);
        this.f17497c = true;
    }

    @Override
    public void setImageResource(int i10) {
        d5.x xVar = this.f17496b;
        if (xVar != null) {
            ImageView imageView = (ImageView) xVar.f4850b;
            if (i10 != 0) {
                Drawable drawableB = o7.b(imageView.getContext(), i10);
                if (drawableB != null) {
                    m1.a(drawableB);
                }
                imageView.setImageDrawable(drawableB);
            } else {
                imageView.setImageDrawable(null);
            }
            xVar.d();
        }
    }

    @Override
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        d5.x xVar = this.f17496b;
        if (xVar != null) {
            xVar.d();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        n nVar = this.f17495a;
        if (nVar != null) {
            nVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        n nVar = this.f17495a;
        if (nVar != null) {
            nVar.i(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        d5.x xVar = this.f17496b;
        if (xVar != null) {
            if (((f3) xVar.f4851c) == null) {
                xVar.f4851c = new f3();
            }
            f3 f3Var = (f3) xVar.f4851c;
            f3Var.f17321c = colorStateList;
            f3Var.f17320b = true;
            xVar.d();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        d5.x xVar = this.f17496b;
        if (xVar != null) {
            if (((f3) xVar.f4851c) == null) {
                xVar.f4851c = new f3();
            }
            f3 f3Var = (f3) xVar.f4851c;
            f3Var.d = mode;
            f3Var.f17319a = true;
            xVar.d();
        }
    }
}
