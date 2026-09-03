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
import j7.r7;
public class v extends ImageView {
    public final m f13641a;
    public final x5.k f13642b;
    public boolean f13643c;

    public v(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        e3.a(context);
        this.f13643c = false;
        d3.a(this, getContext());
        m mVar = new m(this);
        this.f13641a = mVar;
        mVar.d(attributeSet, i10);
        x5.k kVar = new x5.k(this);
        this.f13642b = kVar;
        kVar.c(attributeSet, i10);
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        m mVar = this.f13641a;
        if (mVar != null) {
            mVar.a();
        }
        x5.k kVar = this.f13642b;
        if (kVar != null) {
            kVar.a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        m mVar = this.f13641a;
        if (mVar != null) {
            return mVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        m mVar = this.f13641a;
        if (mVar != null) {
            return mVar.c();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        f3 f3Var;
        x5.k kVar = this.f13642b;
        if (kVar == null || (f3Var = (f3) kVar.f46892c) == null) {
            return null;
        }
        return (ColorStateList) f3Var.f13489c;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        f3 f3Var;
        x5.k kVar = this.f13642b;
        if (kVar == null || (f3Var = (f3) kVar.f46892c) == null) {
            return null;
        }
        return (PorterDuff.Mode) f3Var.d;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        if (!(((ImageView) this.f13642b.f46891b).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering()) {
            return true;
        }
        return false;
    }

    @Override
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        m mVar = this.f13641a;
        if (mVar != null) {
            mVar.e();
        }
    }

    @Override
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        m mVar = this.f13641a;
        if (mVar != null) {
            mVar.f(i10);
        }
    }

    @Override
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        x5.k kVar = this.f13642b;
        if (kVar != null) {
            kVar.a();
        }
    }

    @Override
    public void setImageDrawable(Drawable drawable) {
        x5.k kVar = this.f13642b;
        if (kVar != null && drawable != null && !this.f13643c) {
            kVar.f46890a = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (kVar != null) {
            kVar.a();
            if (!this.f13643c) {
                ImageView imageView = (ImageView) kVar.f46891b;
                if (imageView.getDrawable() != null) {
                    imageView.getDrawable().setLevel(kVar.f46890a);
                }
            }
        }
    }

    @Override
    public void setImageLevel(int i10) {
        super.setImageLevel(i10);
        this.f13643c = true;
    }

    @Override
    public void setImageResource(int i10) {
        x5.k kVar = this.f13642b;
        if (kVar != null) {
            ImageView imageView = (ImageView) kVar.f46891b;
            if (i10 != 0) {
                Drawable b10 = r7.b(imageView.getContext(), i10);
                if (b10 != null) {
                    m1.a(b10);
                }
                imageView.setImageDrawable(b10);
            } else {
                imageView.setImageDrawable(null);
            }
            kVar.a();
        }
    }

    @Override
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        x5.k kVar = this.f13642b;
        if (kVar != null) {
            kVar.a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        m mVar = this.f13641a;
        if (mVar != null) {
            mVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        m mVar = this.f13641a;
        if (mVar != null) {
            mVar.i(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        x5.k kVar = this.f13642b;
        if (kVar != null) {
            if (((f3) kVar.f46892c) == null) {
                kVar.f46892c = new Object();
            }
            f3 f3Var = (f3) kVar.f46892c;
            f3Var.f13489c = colorStateList;
            f3Var.f13488b = true;
            kVar.a();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        x5.k kVar = this.f13642b;
        if (kVar != null) {
            if (((f3) kVar.f46892c) == null) {
                kVar.f46892c = new Object();
            }
            f3 f3Var = (f3) kVar.f46892c;
            f3Var.d = mode;
            f3Var.f13487a = true;
            kVar.a();
        }
    }
}
