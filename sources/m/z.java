package m;

import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Build;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AbsSeekBar;
import android.widget.EditText;
import g7.p6;
import java.util.concurrent.locks.ReentrantReadWriteLock;
public class z {
    public static final int[] d = {16843067, 16843068};
    public final int f17155a = 2;
    public View f17156b;
    public Object f17157c;

    public z() {
    }

    public KeyListener a(KeyListener keyListener) {
        if (!(keyListener instanceof NumberKeyListener)) {
            ((org.telegram.ui.Cells.e3) ((m5.c0) this.f17157c).f17378b).getClass();
            if (keyListener instanceof q1.e) {
                return keyListener;
            }
            if (keyListener == null) {
                return null;
            }
            if (keyListener instanceof NumberKeyListener) {
                return keyListener;
            }
            return new q1.e(keyListener);
        }
        return keyListener;
    }

    public void b(AttributeSet attributeSet, int i9) {
        boolean z10 = true;
        switch (this.f17155a) {
            case 0:
                AbsSeekBar absSeekBar = (AbsSeekBar) this.f17156b;
                j4.c E = j4.c.E(absSeekBar.getContext(), attributeSet, d, i9);
                Drawable x10 = E.x(0);
                if (x10 != null) {
                    if (x10 instanceof AnimationDrawable) {
                        AnimationDrawable animationDrawable = (AnimationDrawable) x10;
                        int numberOfFrames = animationDrawable.getNumberOfFrames();
                        AnimationDrawable animationDrawable2 = new AnimationDrawable();
                        animationDrawable2.setOneShot(animationDrawable.isOneShot());
                        for (int i10 = 0; i10 < numberOfFrames; i10++) {
                            Drawable e10 = e(animationDrawable.getFrame(i10), true);
                            e10.setLevel(10000);
                            animationDrawable2.addFrame(e10, animationDrawable.getDuration(i10));
                        }
                        animationDrawable2.setLevel(10000);
                        x10 = animationDrawable2;
                    }
                    absSeekBar.setIndeterminateDrawable(x10);
                }
                Drawable x11 = E.x(1);
                if (x11 != null) {
                    absSeekBar.setProgressDrawable(e(x11, false));
                }
                E.G();
                return;
            default:
                TypedArray obtainStyledAttributes = ((EditText) this.f17156b).getContext().obtainStyledAttributes(attributeSet, f.a.f5275i, i9, 0);
                try {
                    if (obtainStyledAttributes.hasValue(14)) {
                        z10 = obtainStyledAttributes.getBoolean(14, true);
                    }
                    obtainStyledAttributes.recycle();
                    d(z10);
                    return;
                } catch (Throwable th) {
                    obtainStyledAttributes.recycle();
                    throw th;
                }
        }
    }

    public q1.b c(InputConnection inputConnection, EditorInfo editorInfo) {
        m5.c0 c0Var = (m5.c0) this.f17157c;
        if (inputConnection == null) {
            c0Var.getClass();
            inputConnection = null;
        } else {
            org.telegram.ui.Cells.e3 e3Var = (org.telegram.ui.Cells.e3) c0Var.f17378b;
            e3Var.getClass();
            if (!(inputConnection instanceof q1.b)) {
                inputConnection = new q1.b((EditText) e3Var.f24286b, inputConnection, editorInfo);
            }
        }
        return (q1.b) inputConnection;
    }

    public void d(boolean z10) {
        q1.i iVar = (q1.i) ((org.telegram.ui.Cells.e3) ((m5.c0) this.f17157c).f17378b).f24287c;
        if (iVar.f45913c != z10) {
            if (iVar.f45912b != null) {
                androidx.emoji2.text.k a2 = androidx.emoji2.text.k.a();
                q1.h hVar = iVar.f45912b;
                a2.getClass();
                p6.a(hVar, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = a2.f857a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    a2.f858b.remove(hVar);
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            }
            iVar.f45913c = z10;
            if (z10) {
                q1.i.a(iVar.f45911a, androidx.emoji2.text.k.a().b());
            }
        }
    }

    public Drawable e(Drawable drawable, boolean z10) {
        boolean z11;
        if (drawable instanceof j0.c) {
            j0.d dVar = (j0.d) ((j0.c) drawable);
            Drawable drawable2 = dVar.f13190f;
            if (drawable2 != null) {
                dVar.h(e(drawable2, z10));
                return drawable;
            }
        } else if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            Drawable[] drawableArr = new Drawable[numberOfLayers];
            for (int i9 = 0; i9 < numberOfLayers; i9++) {
                int id2 = layerDrawable.getId(i9);
                Drawable drawable3 = layerDrawable.getDrawable(i9);
                if (id2 != 16908301 && id2 != 16908303) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                drawableArr[i9] = e(drawable3, z11);
            }
            LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
            for (int i10 = 0; i10 < numberOfLayers; i10++) {
                layerDrawable2.setId(i10, layerDrawable.getId(i10));
                if (Build.VERSION.SDK_INT >= 23) {
                    e0.b.A(layerDrawable, layerDrawable2, i10);
                }
            }
            return layerDrawable2;
        } else if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (((Bitmap) this.f17157c) == null) {
                this.f17157c = bitmap;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
            shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
            shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            if (z10) {
                return new ClipDrawable(shapeDrawable, 3, 1);
            }
            return shapeDrawable;
        }
        return drawable;
    }

    public z(AbsSeekBar absSeekBar) {
        this.f17156b = absSeekBar;
    }

    public z(EditText editText) {
        this.f17156b = editText;
        this.f17157c = new m5.c0(editText);
    }
}
