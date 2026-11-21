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
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AbsSeekBar;
import android.widget.EditText;
import c8.tb;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.telegram.ui.Cells.c5;
public class y {
    public static final int[] d = {16843067, 16843068};
    public final int f20287a = 2;
    public View f20288b;
    public Object f20289c;

    public y() {
    }

    public KeyListener a(KeyListener keyListener) {
        if (!(keyListener instanceof NumberKeyListener)) {
            ((ji.l) ((c5) this.f20289c).f30505a).getClass();
            if (keyListener instanceof t1.e) {
                return keyListener;
            }
            if (keyListener == null) {
                return null;
            }
            if (keyListener instanceof NumberKeyListener) {
                return keyListener;
            }
            return new t1.e(keyListener);
        }
        return keyListener;
    }

    public void b(AttributeSet attributeSet, int i7) {
        boolean z10 = true;
        switch (this.f20287a) {
            case 0:
                AbsSeekBar absSeekBar = (AbsSeekBar) this.f20288b;
                h6.m D = h6.m.D(absSeekBar.getContext(), attributeSet, d, i7);
                Drawable v = D.v(0);
                if (v != null) {
                    if (v instanceof AnimationDrawable) {
                        AnimationDrawable animationDrawable = (AnimationDrawable) v;
                        int numberOfFrames = animationDrawable.getNumberOfFrames();
                        AnimationDrawable animationDrawable2 = new AnimationDrawable();
                        animationDrawable2.setOneShot(animationDrawable.isOneShot());
                        for (int i10 = 0; i10 < numberOfFrames; i10++) {
                            Drawable e10 = e(animationDrawable.getFrame(i10), true);
                            e10.setLevel(10000);
                            animationDrawable2.addFrame(e10, animationDrawable.getDuration(i10));
                        }
                        animationDrawable2.setLevel(10000);
                        v = animationDrawable2;
                    }
                    absSeekBar.setIndeterminateDrawable(v);
                }
                Drawable v10 = D.v(1);
                if (v10 != null) {
                    absSeekBar.setProgressDrawable(e(v10, false));
                }
                D.G();
                return;
            default:
                TypedArray obtainStyledAttributes = ((EditText) this.f20288b).getContext().obtainStyledAttributes(attributeSet, f.a.f11023i, i7, 0);
                try {
                    if (obtainStyledAttributes.hasValue(14)) {
                        z10 = obtainStyledAttributes.getBoolean(14, true);
                    }
                    obtainStyledAttributes.recycle();
                    d(z10);
                    return;
                } catch (Throwable th2) {
                    obtainStyledAttributes.recycle();
                    throw th2;
                }
        }
    }

    public t1.b c(InputConnection inputConnection, EditorInfo editorInfo) {
        c5 c5Var = (c5) this.f20289c;
        if (inputConnection == null) {
            c5Var.getClass();
            inputConnection = null;
        } else {
            ji.l lVar = (ji.l) c5Var.f30505a;
            lVar.getClass();
            if (!(inputConnection instanceof t1.b)) {
                inputConnection = new t1.b((EditText) lVar.f17976b, inputConnection, editorInfo);
            }
        }
        return (t1.b) inputConnection;
    }

    public void d(boolean z10) {
        t1.i iVar = (t1.i) ((ji.l) ((c5) this.f20289c).f30505a).f17977c;
        if (iVar.f57578c != z10) {
            if (iVar.f57577b != null) {
                androidx.emoji2.text.l a10 = androidx.emoji2.text.l.a();
                t1.h hVar = iVar.f57577b;
                a10.getClass();
                tb.a(hVar, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = a10.f2265a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    a10.f2266b.remove(hVar);
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            }
            iVar.f57578c = z10;
            if (z10) {
                t1.i.a(iVar.f57576a, androidx.emoji2.text.l.a().b());
            }
        }
    }

    public Drawable e(Drawable drawable, boolean z10) {
        boolean z11;
        if (drawable instanceof j0.b) {
            ((j0.c) ((j0.b) drawable)).getClass();
        } else if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            Drawable[] drawableArr = new Drawable[numberOfLayers];
            for (int i7 = 0; i7 < numberOfLayers; i7++) {
                int id2 = layerDrawable.getId(i7);
                Drawable drawable2 = layerDrawable.getDrawable(i7);
                if (id2 != 16908301 && id2 != 16908303) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                drawableArr[i7] = e(drawable2, z11);
            }
            LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
            for (int i10 = 0; i10 < numberOfLayers; i10++) {
                layerDrawable2.setId(i10, layerDrawable.getId(i10));
                layerDrawable2.setLayerGravity(i10, layerDrawable.getLayerGravity(i10));
                layerDrawable2.setLayerWidth(i10, layerDrawable.getLayerWidth(i10));
                layerDrawable2.setLayerHeight(i10, layerDrawable.getLayerHeight(i10));
                layerDrawable2.setLayerInsetLeft(i10, layerDrawable.getLayerInsetLeft(i10));
                layerDrawable2.setLayerInsetRight(i10, layerDrawable.getLayerInsetRight(i10));
                layerDrawable2.setLayerInsetTop(i10, layerDrawable.getLayerInsetTop(i10));
                layerDrawable2.setLayerInsetBottom(i10, layerDrawable.getLayerInsetBottom(i10));
                layerDrawable2.setLayerInsetStart(i10, layerDrawable.getLayerInsetStart(i10));
                layerDrawable2.setLayerInsetEnd(i10, layerDrawable.getLayerInsetEnd(i10));
            }
            return layerDrawable2;
        } else if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (((Bitmap) this.f20289c) == null) {
                this.f20289c = bitmap;
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

    public y(AbsSeekBar absSeekBar) {
        this.f20288b = absSeekBar;
    }

    public y(EditText editText) {
        this.f20288b = editText;
        this.f20289c = new c5(editText);
    }
}
