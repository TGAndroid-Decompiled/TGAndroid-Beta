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
import w7.n6;
public class y {
    public static final int[] d = {16843067, 16843068};
    public final int f13196a = 2;
    public View f13197b;
    public Object f13198c;

    public y() {
    }

    public KeyListener a(KeyListener keyListener) {
        if (!(keyListener instanceof NumberKeyListener)) {
            ((n7.a1) ((l2.h) this.f13198c).f12721b).getClass();
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
        switch (this.f13196a) {
            case 0:
                AbsSeekBar absSeekBar = (AbsSeekBar) this.f13197b;
                e3 P = e3.P(absSeekBar.getContext(), attributeSet, d, i10);
                Drawable F = P.F(0);
                if (F != null) {
                    if (F instanceof AnimationDrawable) {
                        AnimationDrawable animationDrawable = (AnimationDrawable) F;
                        int numberOfFrames = animationDrawable.getNumberOfFrames();
                        AnimationDrawable animationDrawable2 = new AnimationDrawable();
                        animationDrawable2.setOneShot(animationDrawable.isOneShot());
                        for (int i11 = 0; i11 < numberOfFrames; i11++) {
                            Drawable e = e(animationDrawable.getFrame(i11), true);
                            e.setLevel(10000);
                            animationDrawable2.addFrame(e, animationDrawable.getDuration(i11));
                        }
                        animationDrawable2.setLevel(10000);
                        F = animationDrawable2;
                    }
                    absSeekBar.setIndeterminateDrawable(F);
                }
                Drawable F2 = P.F(1);
                if (F2 != null) {
                    absSeekBar.setProgressDrawable(e(F2, false));
                }
                P.Q();
                return;
            default:
                TypedArray obtainStyledAttributes = ((EditText) this.f13197b).getContext().obtainStyledAttributes(attributeSet, f.a.f7650i, i10, 0);
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
        l2.h hVar = (l2.h) this.f13198c;
        if (inputConnection == null) {
            hVar.getClass();
            inputConnection = null;
        } else {
            n7.a1 a1Var = (n7.a1) hVar.f12721b;
            a1Var.getClass();
            if (!(inputConnection instanceof q1.b)) {
                inputConnection = new q1.b((EditText) a1Var.f13938b, inputConnection, editorInfo);
            }
        }
        return (q1.b) inputConnection;
    }

    public void d(boolean z10) {
        q1.i iVar = (q1.i) ((n7.a1) ((l2.h) this.f13198c).f12721b).f13939c;
        if (iVar.f40472c != z10) {
            if (iVar.f40471b != null) {
                androidx.emoji2.text.l a2 = androidx.emoji2.text.l.a();
                q1.h hVar = iVar.f40471b;
                a2.getClass();
                n6.a(hVar, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = a2.f1030a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    a2.f1031b.remove(hVar);
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            }
            iVar.f40472c = z10;
            if (z10) {
                q1.i.a(iVar.f40470a, androidx.emoji2.text.l.a().b());
            }
        }
    }

    public Drawable e(Drawable drawable, boolean z10) {
        boolean z11;
        if (drawable instanceof j0.c) {
            j0.d dVar = (j0.d) ((j0.c) drawable);
            Drawable drawable2 = dVar.f11438f;
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
                    e0.b.J(layerDrawable, layerDrawable2, i11);
                }
            }
            return layerDrawable2;
        } else if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (((Bitmap) this.f13198c) == null) {
                this.f13198c = bitmap;
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
        this.f13197b = absSeekBar;
    }

    public y(EditText editText) {
        this.f13197b = editText;
        this.f13198c = new l2.h(editText);
    }
}
