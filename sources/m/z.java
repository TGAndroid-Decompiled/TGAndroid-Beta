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
import i7.u6;
import java.util.concurrent.locks.ReentrantReadWriteLock;
public class z {
    public static final int[] d = {16843067, 16843068};
    public final int f16752a = 2;
    public View f16753b;
    public Object f16754c;

    public z() {
    }

    public KeyListener a(KeyListener keyListener) {
        if (!(keyListener instanceof NumberKeyListener)) {
            ((oc.i) ((org.telegram.ui.Components.n) this.f16754c).f30787b).getClass();
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
        switch (this.f16752a) {
            case 0:
                AbsSeekBar absSeekBar = (AbsSeekBar) this.f16753b;
                l3.g0 z11 = l3.g0.z(absSeekBar.getContext(), attributeSet, d, i10);
                Drawable r6 = z11.r(0);
                if (r6 != null) {
                    if (r6 instanceof AnimationDrawable) {
                        AnimationDrawable animationDrawable = (AnimationDrawable) r6;
                        int numberOfFrames = animationDrawable.getNumberOfFrames();
                        AnimationDrawable animationDrawable2 = new AnimationDrawable();
                        animationDrawable2.setOneShot(animationDrawable.isOneShot());
                        for (int i11 = 0; i11 < numberOfFrames; i11++) {
                            Drawable e10 = e(animationDrawable.getFrame(i11), true);
                            e10.setLevel(10000);
                            animationDrawable2.addFrame(e10, animationDrawable.getDuration(i11));
                        }
                        animationDrawable2.setLevel(10000);
                        r6 = animationDrawable2;
                    }
                    absSeekBar.setIndeterminateDrawable(r6);
                }
                Drawable r9 = z11.r(1);
                if (r9 != null) {
                    absSeekBar.setProgressDrawable(e(r9, false));
                }
                z11.B();
                return;
            default:
                TypedArray obtainStyledAttributes = ((EditText) this.f16753b).getContext().obtainStyledAttributes(attributeSet, f.a.f6237i, i10, 0);
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
        org.telegram.ui.Components.n nVar = (org.telegram.ui.Components.n) this.f16754c;
        if (inputConnection == null) {
            nVar.getClass();
            inputConnection = null;
        } else {
            oc.i iVar = (oc.i) nVar.f30787b;
            iVar.getClass();
            if (!(inputConnection instanceof q1.b)) {
                inputConnection = new q1.b((EditText) iVar.f19483b, inputConnection, editorInfo);
            }
        }
        return (q1.b) inputConnection;
    }

    public void d(boolean z10) {
        q1.i iVar = (q1.i) ((oc.i) ((org.telegram.ui.Components.n) this.f16754c).f30787b).f19484c;
        if (iVar.f46214c != z10) {
            if (iVar.f46213b != null) {
                androidx.emoji2.text.l a2 = androidx.emoji2.text.l.a();
                q1.h hVar = iVar.f46213b;
                a2.getClass();
                u6.a(hVar, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = a2.f1354a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    a2.f1355b.remove(hVar);
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            }
            iVar.f46214c = z10;
            if (z10) {
                q1.i.a(iVar.f46212a, androidx.emoji2.text.l.a().b());
            }
        }
    }

    public Drawable e(Drawable drawable, boolean z10) {
        boolean z11;
        if (drawable instanceof j0.c) {
            j0.d dVar = (j0.d) ((j0.c) drawable);
            Drawable drawable2 = dVar.f10355f;
            if (drawable2 != null) {
                dVar.h(e(drawable2, z10));
                return drawable;
            }
        } else if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            Drawable[] drawableArr = new Drawable[numberOfLayers];
            for (int i10 = 0; i10 < numberOfLayers; i10++) {
                int id2 = layerDrawable.getId(i10);
                Drawable drawable3 = layerDrawable.getDrawable(i10);
                if (id2 != 16908301 && id2 != 16908303) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                drawableArr[i10] = e(drawable3, z11);
            }
            LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
            for (int i11 = 0; i11 < numberOfLayers; i11++) {
                layerDrawable2.setId(i11, layerDrawable.getId(i11));
                if (Build.VERSION.SDK_INT >= 23) {
                    e0.b.A(layerDrawable, layerDrawable2, i11);
                }
            }
            return layerDrawable2;
        } else if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (((Bitmap) this.f16754c) == null) {
                this.f16754c = bitmap;
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
        this.f16753b = absSeekBar;
    }

    public z(EditText editText) {
        this.f16753b = editText;
        this.f16754c = new org.telegram.ui.Components.n(editText);
    }
}
