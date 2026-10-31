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
import v7.r7;
public class v extends ImageView {
    public final e2.c f12562a;
    public final a5.a f12563b;
    public boolean f12564c;

    public v(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        b3.a(context);
        this.f12564c = false;
        a3.a(this, getContext());
        e2.c cVar = new e2.c(this);
        this.f12562a = cVar;
        cVar.k(attributeSet, i10);
        a5.a aVar = new a5.a(this);
        this.f12563b = aVar;
        aVar.t(attributeSet, i10);
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        e2.c cVar = this.f12562a;
        if (cVar != null) {
            cVar.b();
        }
        a5.a aVar = this.f12563b;
        if (aVar != null) {
            aVar.c();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        e2.c cVar = this.f12562a;
        if (cVar != null) {
            return cVar.i();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e2.c cVar = this.f12562a;
        if (cVar != null) {
            return cVar.j();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        c3 c3Var;
        a5.a aVar = this.f12563b;
        if (aVar == null || (c3Var = (c3) aVar.d) == null) {
            return null;
        }
        return (ColorStateList) c3Var.f12383c;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        c3 c3Var;
        a5.a aVar = this.f12563b;
        if (aVar == null || (c3Var = (c3) aVar.d) == null) {
            return null;
        }
        return (PorterDuff.Mode) c3Var.d;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        if (!(((ImageView) this.f12563b.f282c).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering()) {
            return true;
        }
        return false;
    }

    @Override
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e2.c cVar = this.f12562a;
        if (cVar != null) {
            cVar.l();
        }
    }

    @Override
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        e2.c cVar = this.f12562a;
        if (cVar != null) {
            cVar.m(i10);
        }
    }

    @Override
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        a5.a aVar = this.f12563b;
        if (aVar != null) {
            aVar.c();
        }
    }

    @Override
    public void setImageDrawable(Drawable drawable) {
        a5.a aVar = this.f12563b;
        if (aVar != null && drawable != null && !this.f12564c) {
            aVar.f281b = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (aVar != null) {
            aVar.c();
            if (!this.f12564c) {
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
        this.f12564c = true;
    }

    @Override
    public void setImageResource(int i10) {
        a5.a aVar = this.f12563b;
        if (aVar != null) {
            ImageView imageView = (ImageView) aVar.f282c;
            if (i10 != 0) {
                Drawable b10 = r7.b(imageView.getContext(), i10);
                if (b10 != null) {
                    l1.a(b10);
                }
                imageView.setImageDrawable(b10);
            } else {
                imageView.setImageDrawable(null);
            }
            aVar.c();
        }
    }

    @Override
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        a5.a aVar = this.f12563b;
        if (aVar != null) {
            aVar.c();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e2.c cVar = this.f12562a;
        if (cVar != null) {
            cVar.q(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e2.c cVar = this.f12562a;
        if (cVar != null) {
            cVar.r(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        a5.a aVar = this.f12563b;
        if (aVar != null) {
            if (((c3) aVar.d) == null) {
                aVar.d = new Object();
            }
            c3 c3Var = (c3) aVar.d;
            c3Var.f12383c = colorStateList;
            c3Var.f12382b = true;
            aVar.c();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        a5.a aVar = this.f12563b;
        if (aVar != null) {
            if (((c3) aVar.d) == null) {
                aVar.d = new Object();
            }
            c3 c3Var = (c3) aVar.d;
            c3Var.d = mode;
            c3Var.f12381a = true;
            aVar.c();
        }
    }
}
