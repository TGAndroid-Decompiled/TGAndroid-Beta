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
import b8.kg;
import b8.oc;
public class u extends ImageButton {
    public final g2.d f18733a;
    public final kg f18734b;
    public boolean f18735c;

    public u(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet, i3);
        a3.a(context);
        this.f18735c = false;
        z2.a(this, getContext());
        g2.d dVar = new g2.d(this);
        this.f18733a = dVar;
        dVar.x(attributeSet, i3);
        kg kgVar = new kg(this);
        this.f18734b = kgVar;
        kgVar.t(attributeSet, i3);
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        g2.d dVar = this.f18733a;
        if (dVar != null) {
            dVar.b();
        }
        kg kgVar = this.f18734b;
        if (kgVar != null) {
            kgVar.d();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        g2.d dVar = this.f18733a;
        if (dVar != null) {
            return dVar.v();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        g2.d dVar = this.f18733a;
        if (dVar != null) {
            return dVar.w();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        b3 b3Var;
        kg kgVar = this.f18734b;
        if (kgVar == null || (b3Var = (b3) kgVar.d) == null) {
            return null;
        }
        return (ColorStateList) b3Var.f18547c;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        b3 b3Var;
        kg kgVar = this.f18734b;
        if (kgVar == null || (b3Var = (b3) kgVar.d) == null) {
            return null;
        }
        return (PorterDuff.Mode) b3Var.d;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        if (!(((ImageView) this.f18734b.f2723c).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering()) {
            return true;
        }
        return false;
    }

    @Override
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        g2.d dVar = this.f18733a;
        if (dVar != null) {
            dVar.y();
        }
    }

    @Override
    public void setBackgroundResource(int i3) {
        super.setBackgroundResource(i3);
        g2.d dVar = this.f18733a;
        if (dVar != null) {
            dVar.z(i3);
        }
    }

    @Override
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        kg kgVar = this.f18734b;
        if (kgVar != null) {
            kgVar.d();
        }
    }

    @Override
    public void setImageDrawable(Drawable drawable) {
        kg kgVar = this.f18734b;
        if (kgVar != null && drawable != null && !this.f18735c) {
            kgVar.f2722b = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (kgVar != null) {
            kgVar.d();
            if (!this.f18735c) {
                ImageView imageView = (ImageView) kgVar.f2723c;
                if (imageView.getDrawable() != null) {
                    imageView.getDrawable().setLevel(kgVar.f2722b);
                }
            }
        }
    }

    @Override
    public void setImageLevel(int i3) {
        super.setImageLevel(i3);
        this.f18735c = true;
    }

    @Override
    public void setImageResource(int i3) {
        kg kgVar = this.f18734b;
        ImageView imageView = (ImageView) kgVar.f2723c;
        if (i3 != 0) {
            Drawable b10 = oc.b(imageView.getContext(), i3);
            if (b10 != null) {
                l1.a(b10);
            }
            imageView.setImageDrawable(b10);
        } else {
            imageView.setImageDrawable(null);
        }
        kgVar.d();
    }

    @Override
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        kg kgVar = this.f18734b;
        if (kgVar != null) {
            kgVar.d();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        g2.d dVar = this.f18733a;
        if (dVar != null) {
            dVar.D(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        g2.d dVar = this.f18733a;
        if (dVar != null) {
            dVar.E(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        kg kgVar = this.f18734b;
        if (kgVar != null) {
            if (((b3) kgVar.d) == null) {
                kgVar.d = new Object();
            }
            b3 b3Var = (b3) kgVar.d;
            b3Var.f18547c = colorStateList;
            b3Var.f18546b = true;
            kgVar.d();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        kg kgVar = this.f18734b;
        if (kgVar != null) {
            if (((b3) kgVar.d) == null) {
                kgVar.d = new Object();
            }
            b3 b3Var = (b3) kgVar.d;
            b3Var.d = mode;
            b3Var.f18545a = true;
            kgVar.d();
        }
    }
}
