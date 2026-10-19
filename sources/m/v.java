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
import v7.q7;
public class v extends ImageButton {
    public final e2.c f16349a;
    public final a5.a f16350b;
    public boolean f16351c;

    public v(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        d3.a(context);
        this.f16351c = false;
        c3.a(this, getContext());
        e2.c cVar = new e2.c(this);
        this.f16349a = cVar;
        cVar.f(attributeSet, i10);
        a5.a aVar = new a5.a(this);
        this.f16350b = aVar;
        aVar.u(attributeSet, i10);
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        e2.c cVar = this.f16349a;
        if (cVar != null) {
            cVar.b();
        }
        a5.a aVar = this.f16350b;
        if (aVar != null) {
            aVar.c();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        e2.c cVar = this.f16349a;
        if (cVar != null) {
            return cVar.d();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e2.c cVar = this.f16349a;
        if (cVar != null) {
            return cVar.e();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        e3 e3Var;
        a5.a aVar = this.f16350b;
        if (aVar == null || (e3Var = (e3) aVar.d) == null) {
            return null;
        }
        return (ColorStateList) e3Var.f16196c;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        e3 e3Var;
        a5.a aVar = this.f16350b;
        if (aVar == null || (e3Var = (e3) aVar.d) == null) {
            return null;
        }
        return (PorterDuff.Mode) e3Var.d;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        if (!(((ImageView) this.f16350b.f282c).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering()) {
            return true;
        }
        return false;
    }

    @Override
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e2.c cVar = this.f16349a;
        if (cVar != null) {
            cVar.g();
        }
    }

    @Override
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        e2.c cVar = this.f16349a;
        if (cVar != null) {
            cVar.h(i10);
        }
    }

    @Override
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        a5.a aVar = this.f16350b;
        if (aVar != null) {
            aVar.c();
        }
    }

    @Override
    public void setImageDrawable(Drawable drawable) {
        a5.a aVar = this.f16350b;
        if (aVar != null && drawable != null && !this.f16351c) {
            aVar.f281b = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (aVar != null) {
            aVar.c();
            if (!this.f16351c) {
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
        this.f16351c = true;
    }

    @Override
    public void setImageResource(int i10) {
        a5.a aVar = this.f16350b;
        ImageView imageView = (ImageView) aVar.f282c;
        if (i10 != 0) {
            Drawable b10 = q7.b(imageView.getContext(), i10);
            if (b10 != null) {
                m1.a(b10);
            }
            imageView.setImageDrawable(b10);
        } else {
            imageView.setImageDrawable(null);
        }
        aVar.c();
    }

    @Override
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        a5.a aVar = this.f16350b;
        if (aVar != null) {
            aVar.c();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e2.c cVar = this.f16349a;
        if (cVar != null) {
            cVar.l(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e2.c cVar = this.f16349a;
        if (cVar != null) {
            cVar.m(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        a5.a aVar = this.f16350b;
        if (aVar != null) {
            if (((e3) aVar.d) == null) {
                aVar.d = new Object();
            }
            e3 e3Var = (e3) aVar.d;
            e3Var.f16196c = colorStateList;
            e3Var.f16195b = true;
            aVar.c();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        a5.a aVar = this.f16350b;
        if (aVar != null) {
            if (((e3) aVar.d) == null) {
                aVar.d = new Object();
            }
            e3 e3Var = (e3) aVar.d;
            e3Var.d = mode;
            e3Var.f16194a = true;
            aVar.c();
        }
    }
}
