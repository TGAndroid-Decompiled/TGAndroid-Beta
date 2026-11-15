package m;

import a8.xa;
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
    public final h2.c f19855a;
    public final xa f19856b;
    public boolean f19857c;

    public v(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        a3.a(context);
        this.f19857c = false;
        z2.a(this, getContext());
        h2.c cVar = new h2.c(this);
        this.f19855a = cVar;
        cVar.x(attributeSet, i7);
        xa xaVar = new xa(this);
        this.f19856b = xaVar;
        xaVar.r(attributeSet, i7);
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        h2.c cVar = this.f19855a;
        if (cVar != null) {
            cVar.b();
        }
        xa xaVar = this.f19856b;
        if (xaVar != null) {
            xaVar.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        h2.c cVar = this.f19855a;
        if (cVar != null) {
            return cVar.v();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        h2.c cVar = this.f19855a;
        if (cVar != null) {
            return cVar.w();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        b3 b3Var;
        xa xaVar = this.f19856b;
        if (xaVar == null || (b3Var = (b3) xaVar.d) == null) {
            return null;
        }
        return (ColorStateList) b3Var.f19659c;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        b3 b3Var;
        xa xaVar = this.f19856b;
        if (xaVar == null || (b3Var = (b3) xaVar.d) == null) {
            return null;
        }
        return (PorterDuff.Mode) b3Var.d;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        if (!(((ImageView) this.f19856b.f714c).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering()) {
            return true;
        }
        return false;
    }

    @Override
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        h2.c cVar = this.f19855a;
        if (cVar != null) {
            cVar.y();
        }
    }

    @Override
    public void setBackgroundResource(int i7) {
        super.setBackgroundResource(i7);
        h2.c cVar = this.f19855a;
        if (cVar != null) {
            cVar.z(i7);
        }
    }

    @Override
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        xa xaVar = this.f19856b;
        if (xaVar != null) {
            xaVar.b();
        }
    }

    @Override
    public void setImageDrawable(Drawable drawable) {
        xa xaVar = this.f19856b;
        if (xaVar != null && drawable != null && !this.f19857c) {
            xaVar.f713b = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (xaVar != null) {
            xaVar.b();
            if (!this.f19857c) {
                ImageView imageView = (ImageView) xaVar.f714c;
                if (imageView.getDrawable() != null) {
                    imageView.getDrawable().setLevel(xaVar.f713b);
                }
            }
        }
    }

    @Override
    public void setImageLevel(int i7) {
        super.setImageLevel(i7);
        this.f19857c = true;
    }

    @Override
    public void setImageResource(int i7) {
        xa xaVar = this.f19856b;
        if (xaVar != null) {
            ImageView imageView = (ImageView) xaVar.f714c;
            if (i7 != 0) {
                Drawable b10 = b5.a.b(imageView.getContext(), i7);
                if (b10 != null) {
                    l1.a(b10);
                }
                imageView.setImageDrawable(b10);
            } else {
                imageView.setImageDrawable(null);
            }
            xaVar.b();
        }
    }

    @Override
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        xa xaVar = this.f19856b;
        if (xaVar != null) {
            xaVar.b();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        h2.c cVar = this.f19855a;
        if (cVar != null) {
            cVar.D(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        h2.c cVar = this.f19855a;
        if (cVar != null) {
            cVar.E(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        xa xaVar = this.f19856b;
        if (xaVar != null) {
            if (((b3) xaVar.d) == null) {
                xaVar.d = new Object();
            }
            b3 b3Var = (b3) xaVar.d;
            b3Var.f19659c = colorStateList;
            b3Var.f19658b = true;
            xaVar.b();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        xa xaVar = this.f19856b;
        if (xaVar != null) {
            if (((b3) xaVar.d) == null) {
                xaVar.d = new Object();
            }
            b3 b3Var = (b3) xaVar.d;
            b3Var.d = mode;
            b3Var.f19657a = true;
            xaVar.b();
        }
    }
}
