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
public class jq extends ImageButton {
    public final kp a;
    public final kq b;
    public boolean c;

    public jq(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        yqb.a(context);
        this.c = false;
        dpb.a(getContext(), this);
        kp kpVar = new kp(this);
        this.a = kpVar;
        kpVar.g(attributeSet, i);
        kq kqVar = new kq(this);
        this.b = kqVar;
        kqVar.t(attributeSet, i);
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        kp kpVar = this.a;
        if (kpVar != null) {
            kpVar.b();
        }
        kq kqVar = this.b;
        if (kqVar != null) {
            kqVar.d();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        kp kpVar = this.a;
        if (kpVar != null) {
            return kpVar.e();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        kp kpVar = this.a;
        if (kpVar != null) {
            return kpVar.f();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        s34 s34Var;
        kq kqVar = this.b;
        if (kqVar == null || (s34Var = (s34) kqVar.d) == null) {
            return null;
        }
        return (ColorStateList) s34Var.c;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        s34 s34Var;
        kq kqVar = this.b;
        if (kqVar == null || (s34Var = (s34) kqVar.d) == null) {
            return null;
        }
        return (PorterDuff.Mode) s34Var.d;
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
        kp kpVar = this.a;
        if (kpVar != null) {
            kpVar.h();
        }
    }

    @Override
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        kp kpVar = this.a;
        if (kpVar != null) {
            kpVar.i(i);
        }
    }

    @Override
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        kq kqVar = this.b;
        if (kqVar != null) {
            kqVar.d();
        }
    }

    @Override
    public void setImageDrawable(Drawable drawable) {
        kq kqVar = this.b;
        if (kqVar != null && drawable != null && !this.c) {
            kqVar.b = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (kqVar != null) {
            kqVar.d();
            if (!this.c) {
                ImageView imageView = (ImageView) kqVar.c;
                if (imageView.getDrawable() != null) {
                    imageView.getDrawable().setLevel(kqVar.b);
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
        kq kqVar = this.b;
        ImageView imageView = (ImageView) kqVar.c;
        if (i != 0) {
            Drawable a = kod.a(imageView.getContext(), i);
            if (a != null) {
                vr3.a(a);
            }
            imageView.setImageDrawable(a);
        } else {
            imageView.setImageDrawable(null);
        }
        kqVar.d();
    }

    @Override
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        kq kqVar = this.b;
        if (kqVar != null) {
            kqVar.d();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        kp kpVar = this.a;
        if (kpVar != null) {
            kpVar.m(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        kp kpVar = this.a;
        if (kpVar != null) {
            kpVar.n(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        kq kqVar = this.b;
        if (kqVar != null) {
            s34 s34Var = (s34) kqVar.d;
            s34 s34Var2 = s34Var;
            if (s34Var == null) {
                Object obj = new Object();
                kqVar.d = obj;
                s34Var2 = obj;
            }
            s34Var2.c = colorStateList;
            s34Var2.b = true;
            kqVar.d();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        kq kqVar = this.b;
        if (kqVar != null) {
            s34 s34Var = (s34) kqVar.d;
            s34 s34Var2 = s34Var;
            if (s34Var == null) {
                Object obj = new Object();
                kqVar.d = obj;
                s34Var2 = obj;
            }
            s34Var2.d = mode;
            s34Var2.a = true;
            kqVar.d();
        }
    }
}
