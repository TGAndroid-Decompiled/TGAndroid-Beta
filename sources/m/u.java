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
import j7.r7;
public class u extends ImageButton {
    public final m f13650a;
    public final x5.k f13651b;
    public boolean f13652c;

    public u(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        e3.a(context);
        this.f13652c = false;
        d3.a(this, getContext());
        m mVar = new m(this);
        this.f13650a = mVar;
        mVar.d(attributeSet, i10);
        x5.k kVar = new x5.k(this);
        this.f13651b = kVar;
        kVar.c(attributeSet, i10);
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        m mVar = this.f13650a;
        if (mVar != null) {
            mVar.a();
        }
        x5.k kVar = this.f13651b;
        if (kVar != null) {
            kVar.a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        m mVar = this.f13650a;
        if (mVar != null) {
            return mVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        m mVar = this.f13650a;
        if (mVar != null) {
            return mVar.c();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        f3 f3Var;
        x5.k kVar = this.f13651b;
        if (kVar == null || (f3Var = (f3) kVar.f46825c) == null) {
            return null;
        }
        return (ColorStateList) f3Var.f13505c;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        f3 f3Var;
        x5.k kVar = this.f13651b;
        if (kVar == null || (f3Var = (f3) kVar.f46825c) == null) {
            return null;
        }
        return (PorterDuff.Mode) f3Var.d;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        if (!(((ImageView) this.f13651b.f46824b).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering()) {
            return true;
        }
        return false;
    }

    @Override
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        m mVar = this.f13650a;
        if (mVar != null) {
            mVar.e();
        }
    }

    @Override
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        m mVar = this.f13650a;
        if (mVar != null) {
            mVar.f(i10);
        }
    }

    @Override
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        x5.k kVar = this.f13651b;
        if (kVar != null) {
            kVar.a();
        }
    }

    @Override
    public void setImageDrawable(Drawable drawable) {
        x5.k kVar = this.f13651b;
        if (kVar != null && drawable != null && !this.f13652c) {
            kVar.f46823a = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (kVar != null) {
            kVar.a();
            if (!this.f13652c) {
                ImageView imageView = (ImageView) kVar.f46824b;
                if (imageView.getDrawable() != null) {
                    imageView.getDrawable().setLevel(kVar.f46823a);
                }
            }
        }
    }

    @Override
    public void setImageLevel(int i10) {
        super.setImageLevel(i10);
        this.f13652c = true;
    }

    @Override
    public void setImageResource(int i10) {
        x5.k kVar = this.f13651b;
        ImageView imageView = (ImageView) kVar.f46824b;
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

    @Override
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        x5.k kVar = this.f13651b;
        if (kVar != null) {
            kVar.a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        m mVar = this.f13650a;
        if (mVar != null) {
            mVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        m mVar = this.f13650a;
        if (mVar != null) {
            mVar.i(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        x5.k kVar = this.f13651b;
        if (kVar != null) {
            if (((f3) kVar.f46825c) == null) {
                kVar.f46825c = new Object();
            }
            f3 f3Var = (f3) kVar.f46825c;
            f3Var.f13505c = colorStateList;
            f3Var.f13504b = true;
            kVar.a();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        x5.k kVar = this.f13651b;
        if (kVar != null) {
            if (((f3) kVar.f46825c) == null) {
                kVar.f46825c = new Object();
            }
            f3 f3Var = (f3) kVar.f46825c;
            f3Var.d = mode;
            f3Var.f13503a = true;
            kVar.a();
        }
    }
}
