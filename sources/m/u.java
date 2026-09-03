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
import j7.s7;
public class u extends ImageButton {
    public final m f13348a;
    public final x5.k f13349b;
    public boolean f13350c;

    public u(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        d3.a(context);
        this.f13350c = false;
        c3.a(this, getContext());
        m mVar = new m(this);
        this.f13348a = mVar;
        mVar.d(attributeSet, i10);
        x5.k kVar = new x5.k(this);
        this.f13349b = kVar;
        kVar.c(attributeSet, i10);
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        m mVar = this.f13348a;
        if (mVar != null) {
            mVar.a();
        }
        x5.k kVar = this.f13349b;
        if (kVar != null) {
            kVar.a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        m mVar = this.f13348a;
        if (mVar != null) {
            return mVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        m mVar = this.f13348a;
        if (mVar != null) {
            return mVar.c();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        e3 e3Var;
        x5.k kVar = this.f13349b;
        if (kVar == null || (e3Var = (e3) kVar.f50467c) == null) {
            return null;
        }
        return (ColorStateList) e3Var.f13186c;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        e3 e3Var;
        x5.k kVar = this.f13349b;
        if (kVar == null || (e3Var = (e3) kVar.f50467c) == null) {
            return null;
        }
        return (PorterDuff.Mode) e3Var.d;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        if (!(((ImageView) this.f13349b.f50466b).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering()) {
            return true;
        }
        return false;
    }

    @Override
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        m mVar = this.f13348a;
        if (mVar != null) {
            mVar.e();
        }
    }

    @Override
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        m mVar = this.f13348a;
        if (mVar != null) {
            mVar.f(i10);
        }
    }

    @Override
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        x5.k kVar = this.f13349b;
        if (kVar != null) {
            kVar.a();
        }
    }

    @Override
    public void setImageDrawable(Drawable drawable) {
        x5.k kVar = this.f13349b;
        if (kVar != null && drawable != null && !this.f13350c) {
            kVar.f50465a = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (kVar != null) {
            kVar.a();
            if (!this.f13350c) {
                ImageView imageView = (ImageView) kVar.f50466b;
                if (imageView.getDrawable() != null) {
                    imageView.getDrawable().setLevel(kVar.f50465a);
                }
            }
        }
    }

    @Override
    public void setImageLevel(int i10) {
        super.setImageLevel(i10);
        this.f13350c = true;
    }

    @Override
    public void setImageResource(int i10) {
        x5.k kVar = this.f13349b;
        ImageView imageView = (ImageView) kVar.f50466b;
        if (i10 != 0) {
            Drawable b10 = s7.b(imageView.getContext(), i10);
            if (b10 != null) {
                l1.a(b10);
            }
            imageView.setImageDrawable(b10);
        } else {
            imageView.setImageDrawable(null);
        }
        kVar.a();
    }

    @Override
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        x5.k kVar = this.f13349b;
        if (kVar != null) {
            kVar.a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        m mVar = this.f13348a;
        if (mVar != null) {
            mVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        m mVar = this.f13348a;
        if (mVar != null) {
            mVar.i(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        x5.k kVar = this.f13349b;
        if (kVar != null) {
            if (((e3) kVar.f50467c) == null) {
                kVar.f50467c = new Object();
            }
            e3 e3Var = (e3) kVar.f50467c;
            e3Var.f13186c = colorStateList;
            e3Var.f13185b = true;
            kVar.a();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        x5.k kVar = this.f13349b;
        if (kVar != null) {
            if (((e3) kVar.f50467c) == null) {
                kVar.f50467c = new Object();
            }
            e3 e3Var = (e3) kVar.f50467c;
            e3Var.d = mode;
            e3Var.f13184a = true;
            kVar.a();
        }
    }
}
