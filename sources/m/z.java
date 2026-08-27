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
import h7.m6;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.telegram.ui.i6;

public class z {
    public static final int[] d = {16843067, 16843068};

    public final int f17530a = 2;

    public View f17531b;

    public Object f17532c;

    public z() {
    }

    public KeyListener a(KeyListener keyListener) {
        if (keyListener instanceof NumberKeyListener) {
            return keyListener;
        }
        ((i6) ((m5.o) this.f17532c).f17823b).getClass();
        if (keyListener instanceof q1.e) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new q1.e(keyListener);
    }

    public void b(AttributeSet attributeSet, int i10) {
        switch (this.f17530a) {
            case 0:
                AbsSeekBar absSeekBar = (AbsSeekBar) this.f17531b;
                j9.a aVarG = j9.a.G(absSeekBar.getContext(), attributeSet, d, i10);
                Drawable drawableZ = aVarG.z(0);
                if (drawableZ != null) {
                    if (drawableZ instanceof AnimationDrawable) {
                        AnimationDrawable animationDrawable = (AnimationDrawable) drawableZ;
                        int numberOfFrames = animationDrawable.getNumberOfFrames();
                        AnimationDrawable animationDrawable2 = new AnimationDrawable();
                        animationDrawable2.setOneShot(animationDrawable.isOneShot());
                        for (int i11 = 0; i11 < numberOfFrames; i11++) {
                            Drawable drawableE = e(animationDrawable.getFrame(i11), true);
                            drawableE.setLevel(10000);
                            animationDrawable2.addFrame(drawableE, animationDrawable.getDuration(i11));
                        }
                        animationDrawable2.setLevel(10000);
                        drawableZ = animationDrawable2;
                    }
                    absSeekBar.setIndeterminateDrawable(drawableZ);
                }
                Drawable drawableZ2 = aVarG.z(1);
                if (drawableZ2 != null) {
                    absSeekBar.setProgressDrawable(e(drawableZ2, false));
                }
                aVarG.I();
                return;
            default:
                TypedArray typedArrayObtainStyledAttributes = ((EditText) this.f17531b).getContext().obtainStyledAttributes(attributeSet, f.a.f5580i, i10, 0);
                try {
                    boolean z10 = true;
                    if (typedArrayObtainStyledAttributes.hasValue(14)) {
                        z10 = typedArrayObtainStyledAttributes.getBoolean(14, true);
                        break;
                    }
                    typedArrayObtainStyledAttributes.recycle();
                    d(z10);
                    return;
                } catch (Throwable th) {
                    typedArrayObtainStyledAttributes.recycle();
                    throw th;
                }
        }
    }

    public q1.b c(InputConnection inputConnection, EditorInfo editorInfo) {
        m5.o oVar = (m5.o) this.f17532c;
        if (inputConnection == null) {
            oVar.getClass();
            inputConnection = null;
        } else {
            i6 i6Var = (i6) oVar.f17823b;
            i6Var.getClass();
            if (!(inputConnection instanceof q1.b)) {
                inputConnection = new q1.b((EditText) i6Var.f38984b, inputConnection, editorInfo);
            }
        }
        return (q1.b) inputConnection;
    }

    public void d(boolean z10) {
        q1.i iVar = (q1.i) ((i6) ((m5.o) this.f17532c).f17823b).f38985c;
        if (iVar.f46077c != z10) {
            if (iVar.f46076b != null) {
                androidx.emoji2.text.l lVarA = androidx.emoji2.text.l.a();
                q1.h hVar = iVar.f46076b;
                lVarA.getClass();
                m6.a(hVar, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = lVarA.f1359a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    lVarA.f1360b.remove(hVar);
                    reentrantReadWriteLock.writeLock().unlock();
                } catch (Throwable th) {
                    reentrantReadWriteLock.writeLock().unlock();
                    throw th;
                }
            }
            iVar.f46077c = z10;
            if (z10) {
                q1.i.a(iVar.f46075a, androidx.emoji2.text.l.a().b());
            }
        }
    }

    public Drawable e(Drawable drawable, boolean z10) {
        if (drawable instanceof j0.c) {
            j0.d dVar = (j0.d) ((j0.c) drawable);
            Drawable drawable2 = dVar.f12287f;
            if (drawable2 != null) {
                dVar.h(e(drawable2, z10));
                return drawable;
            }
        } else {
            if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                Drawable[] drawableArr = new Drawable[numberOfLayers];
                for (int i10 = 0; i10 < numberOfLayers; i10++) {
                    int id2 = layerDrawable.getId(i10);
                    drawableArr[i10] = e(layerDrawable.getDrawable(i10), id2 == 16908301 || id2 == 16908303);
                }
                LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
                for (int i11 = 0; i11 < numberOfLayers; i11++) {
                    layerDrawable2.setId(i11, layerDrawable.getId(i11));
                    if (Build.VERSION.SDK_INT >= 23) {
                        e0.b.A(layerDrawable, layerDrawable2, i11);
                    }
                }
                return layerDrawable2;
            }
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                Bitmap bitmap = bitmapDrawable.getBitmap();
                if (((Bitmap) this.f17532c) == null) {
                    this.f17532c = bitmap;
                }
                ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
                shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
                shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
                return z10 ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
            }
        }
        return drawable;
    }

    public z(AbsSeekBar absSeekBar) {
        this.f17531b = absSeekBar;
    }

    public z(EditText editText) {
        this.f17531b = editText;
        this.f17532c = new m5.o(editText);
    }
}
