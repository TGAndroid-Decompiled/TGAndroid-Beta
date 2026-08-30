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
import java.util.concurrent.locks.ReentrantReadWriteLock;
import k7.j6;
import n7.qa;
import org.telegram.ui.Components.qk0;
public class y {
    public static final int[] d = {16843067, 16843068};
    public final int f13691a = 2;
    public View f13692b;
    public Object f13693c;

    public y() {
    }

    public KeyListener a(KeyListener keyListener) {
        if (!(keyListener instanceof NumberKeyListener)) {
            ((qa) ((qk0) this.f13693c).f28149b).getClass();
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
        boolean z4 = true;
        switch (this.f13691a) {
            case 0:
                AbsSeekBar absSeekBar = (AbsSeekBar) this.f13692b;
                l7.w0 y10 = l7.w0.y(absSeekBar.getContext(), attributeSet, d, i10);
                Drawable u10 = y10.u(0);
                if (u10 != null) {
                    if (u10 instanceof AnimationDrawable) {
                        AnimationDrawable animationDrawable = (AnimationDrawable) u10;
                        int numberOfFrames = animationDrawable.getNumberOfFrames();
                        AnimationDrawable animationDrawable2 = new AnimationDrawable();
                        animationDrawable2.setOneShot(animationDrawable.isOneShot());
                        for (int i11 = 0; i11 < numberOfFrames; i11++) {
                            Drawable e = e(animationDrawable.getFrame(i11), true);
                            e.setLevel(10000);
                            animationDrawable2.addFrame(e, animationDrawable.getDuration(i11));
                        }
                        animationDrawable2.setLevel(10000);
                        u10 = animationDrawable2;
                    }
                    absSeekBar.setIndeterminateDrawable(u10);
                }
                Drawable u11 = y10.u(1);
                if (u11 != null) {
                    absSeekBar.setProgressDrawable(e(u11, false));
                }
                y10.A();
                return;
            default:
                TypedArray obtainStyledAttributes = ((EditText) this.f13692b).getContext().obtainStyledAttributes(attributeSet, f.a.f5624i, i10, 0);
                try {
                    if (obtainStyledAttributes.hasValue(14)) {
                        z4 = obtainStyledAttributes.getBoolean(14, true);
                    }
                    obtainStyledAttributes.recycle();
                    d(z4);
                    return;
                } catch (Throwable th2) {
                    obtainStyledAttributes.recycle();
                    throw th2;
                }
        }
    }

    public q1.b c(InputConnection inputConnection, EditorInfo editorInfo) {
        qk0 qk0Var = (qk0) this.f13693c;
        if (inputConnection == null) {
            qk0Var.getClass();
            inputConnection = null;
        } else {
            qa qaVar = (qa) qk0Var.f28149b;
            qaVar.getClass();
            if (!(inputConnection instanceof q1.b)) {
                inputConnection = new q1.b((EditText) qaVar.f14702b, inputConnection, editorInfo);
            }
        }
        return (q1.b) inputConnection;
    }

    public void d(boolean z4) {
        q1.i iVar = (q1.i) ((qa) ((qk0) this.f13693c).f28149b).f14703c;
        if (iVar.f42696c != z4) {
            if (iVar.f42695b != null) {
                androidx.emoji2.text.l a2 = androidx.emoji2.text.l.a();
                q1.h hVar = iVar.f42695b;
                a2.getClass();
                j6.a(hVar, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = a2.f768a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    a2.f769b.remove(hVar);
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            }
            iVar.f42696c = z4;
            if (z4) {
                q1.i.a(iVar.f42694a, androidx.emoji2.text.l.a().b());
            }
        }
    }

    public Drawable e(Drawable drawable, boolean z4) {
        boolean z10;
        if (drawable instanceof j0.c) {
            j0.d dVar = (j0.d) ((j0.c) drawable);
            Drawable drawable2 = dVar.f8406f;
            if (drawable2 != null) {
                dVar.h(e(drawable2, z4));
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
                    z10 = false;
                } else {
                    z10 = true;
                }
                drawableArr[i10] = e(drawable3, z10);
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
            if (((Bitmap) this.f13693c) == null) {
                this.f13693c = bitmap;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
            shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
            shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            if (z4) {
                return new ClipDrawable(shapeDrawable, 3, 1);
            }
            return shapeDrawable;
        }
        return drawable;
    }

    public y(AbsSeekBar absSeekBar) {
        this.f13692b = absSeekBar;
    }

    public y(EditText editText) {
        this.f13692b = editText;
        this.f13693c = new qk0(editText);
    }
}
