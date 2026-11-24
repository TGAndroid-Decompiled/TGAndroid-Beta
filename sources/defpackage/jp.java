package defpackage;

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
public class jp extends ImageButton {
    public final ko a;
    public final kp b;
    public boolean c;

    public jp(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        xob.a(context);
        this.c = false;
        cnb.a(getContext(), this);
        ko koVar = new ko(this);
        this.a = koVar;
        koVar.g(attributeSet, i);
        kp kpVar = new kp(this);
        this.b = kpVar;
        kpVar.t(attributeSet, i);
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        ko koVar = this.a;
        if (koVar != null) {
            koVar.b();
        }
        kp kpVar = this.b;
        if (kpVar != null) {
            kpVar.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        ko koVar = this.a;
        if (koVar != null) {
            return koVar.e();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        ko koVar = this.a;
        if (koVar != null) {
            return koVar.f();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        h24 h24Var;
        kp kpVar = this.b;
        if (kpVar == null || (h24Var = (h24) kpVar.d) == null) {
            return null;
        }
        return (ColorStateList) h24Var.c;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        h24 h24Var;
        kp kpVar = this.b;
        if (kpVar == null || (h24Var = (h24) kpVar.d) == null) {
            return null;
        }
        return (PorterDuff.Mode) h24Var.d;
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
        ko koVar = this.a;
        if (koVar != null) {
            koVar.h();
        }
    }

    @Override
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        ko koVar = this.a;
        if (koVar != null) {
            koVar.i(i);
        }
    }

    @Override
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        kp kpVar = this.b;
        if (kpVar != null) {
            kpVar.b();
        }
    }

    @Override
    public void setImageDrawable(Drawable drawable) {
        kp kpVar = this.b;
        if (kpVar != null && drawable != null && !this.c) {
            kpVar.b = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (kpVar != null) {
            kpVar.b();
            if (!this.c) {
                ImageView imageView = (ImageView) kpVar.c;
                if (imageView.getDrawable() != null) {
                    imageView.getDrawable().setLevel(kpVar.b);
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
        kp kpVar = this.b;
        ImageView imageView = (ImageView) kpVar.c;
        if (i != 0) {
            Drawable a = hmd.a(imageView.getContext(), i);
            if (a != null) {
                lq3.a(a);
            }
            imageView.setImageDrawable(a);
        } else {
            imageView.setImageDrawable(null);
        }
        kpVar.b();
    }

    @Override
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        kp kpVar = this.b;
        if (kpVar != null) {
            kpVar.b();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        ko koVar = this.a;
        if (koVar != null) {
            koVar.m(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        ko koVar = this.a;
        if (koVar != null) {
            koVar.n(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        kp kpVar = this.b;
        if (kpVar != null) {
            h24 h24Var = (h24) kpVar.d;
            h24 h24Var2 = h24Var;
            if (h24Var == null) {
                Object obj = new Object();
                kpVar.d = obj;
                h24Var2 = obj;
            }
            h24Var2.c = colorStateList;
            h24Var2.b = true;
            kpVar.b();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        kp kpVar = this.b;
        if (kpVar != null) {
            h24 h24Var = (h24) kpVar.d;
            h24 h24Var2 = h24Var;
            if (h24Var == null) {
                Object obj = new Object();
                kpVar.d = obj;
                h24Var2 = obj;
            }
            h24Var2.d = mode;
            h24Var2.a = true;
            kpVar.b();
        }
    }
}
