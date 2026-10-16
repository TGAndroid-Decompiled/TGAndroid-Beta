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
import java.util.concurrent.locks.ReentrantReadWriteLock;
import ji.h5;
import w7.m6;
public class a0 {
    public static final int[] d = {16843067, 16843068};
    public final int f14787a = 2;
    public View f14788b;
    public Object f14789c;

    public a0() {
    }

    public KeyListener a(KeyListener keyListener) {
        if (!(keyListener instanceof NumberKeyListener)) {
            ((m2.t) ((h5) this.f14789c).f13315b).getClass();
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

    public void b(AttributeSet attributeSet, int i10) {
        boolean z10 = true;
        switch (this.f14787a) {
            case 0:
                AbsSeekBar absSeekBar = (AbsSeekBar) this.f14788b;
                h3 P = h3.P(absSeekBar.getContext(), attributeSet, d, i10);
                Drawable G = P.G(0);
                if (G != null) {
                    if (G instanceof AnimationDrawable) {
                        AnimationDrawable animationDrawable = (AnimationDrawable) G;
                        int numberOfFrames = animationDrawable.getNumberOfFrames();
                        AnimationDrawable animationDrawable2 = new AnimationDrawable();
                        animationDrawable2.setOneShot(animationDrawable.isOneShot());
                        for (int i11 = 0; i11 < numberOfFrames; i11++) {
                            Drawable e = e(animationDrawable.getFrame(i11), true);
                            e.setLevel(10000);
                            animationDrawable2.addFrame(e, animationDrawable.getDuration(i11));
                        }
                        animationDrawable2.setLevel(10000);
                        G = animationDrawable2;
                    }
                    absSeekBar.setIndeterminateDrawable(G);
                }
                Drawable G2 = P.G(1);
                if (G2 != null) {
                    absSeekBar.setProgressDrawable(e(G2, false));
                }
                P.Q();
                return;
            default:
                TypedArray obtainStyledAttributes = ((EditText) this.f14788b).getContext().obtainStyledAttributes(attributeSet, f.a.f8810i, i10, 0);
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

    public q1.b c(InputConnection inputConnection, EditorInfo editorInfo) {
        h5 h5Var = (h5) this.f14789c;
        if (inputConnection == null) {
            h5Var.getClass();
            inputConnection = null;
        } else {
            m2.t tVar = (m2.t) h5Var.f13315b;
            tVar.getClass();
            if (!(inputConnection instanceof q1.b)) {
                inputConnection = new q1.b((EditText) tVar.f15110b, inputConnection, editorInfo);
            }
        }
        return (q1.b) inputConnection;
    }

    public void d(boolean z10) {
        q1.i iVar = (q1.i) ((m2.t) ((h5) this.f14789c).f13315b).f15111c;
        if (iVar.f42997c != z10) {
            if (iVar.f42996b != null) {
                androidx.emoji2.text.l a2 = androidx.emoji2.text.l.a();
                q1.h hVar = iVar.f42996b;
                a2.getClass();
                m6.a(hVar, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = a2.f1495a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    a2.f1496b.remove(hVar);
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            }
            iVar.f42997c = z10;
            if (z10) {
                q1.i.a(iVar.f42995a, androidx.emoji2.text.l.a().b());
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
            for (int i10 = 0; i10 < numberOfLayers; i10++) {
                int id2 = layerDrawable.getId(i10);
                Drawable drawable2 = layerDrawable.getDrawable(i10);
                if (id2 != 16908301 && id2 != 16908303) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                drawableArr[i10] = e(drawable2, z11);
            }
            LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
            for (int i11 = 0; i11 < numberOfLayers; i11++) {
                layerDrawable2.setId(i11, layerDrawable.getId(i11));
                layerDrawable2.setLayerGravity(i11, layerDrawable.getLayerGravity(i11));
                layerDrawable2.setLayerWidth(i11, layerDrawable.getLayerWidth(i11));
                layerDrawable2.setLayerHeight(i11, layerDrawable.getLayerHeight(i11));
                layerDrawable2.setLayerInsetLeft(i11, layerDrawable.getLayerInsetLeft(i11));
                layerDrawable2.setLayerInsetRight(i11, layerDrawable.getLayerInsetRight(i11));
                layerDrawable2.setLayerInsetTop(i11, layerDrawable.getLayerInsetTop(i11));
                layerDrawable2.setLayerInsetBottom(i11, layerDrawable.getLayerInsetBottom(i11));
                layerDrawable2.setLayerInsetStart(i11, layerDrawable.getLayerInsetStart(i11));
                layerDrawable2.setLayerInsetEnd(i11, layerDrawable.getLayerInsetEnd(i11));
            }
            return layerDrawable2;
        } else if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (((Bitmap) this.f14789c) == null) {
                this.f14789c = bitmap;
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

    public a0(AbsSeekBar absSeekBar) {
        this.f14788b = absSeekBar;
    }

    public a0(EditText editText) {
        this.f14788b = editText;
        this.f14789c = new h5(editText);
    }
}
